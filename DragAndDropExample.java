import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;

public class DragAndDropExample extends JFrame {
    public DragAndDropExample() {
        setTitle("Drag and Drop Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Draggable label
        JLabel dragLabel = new JLabel("Drag me!");
        dragLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dragLabel.setTransferHandler(new TransferHandler("text"));
        dragLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Drop zone panel
        JPanel dropZone = new JPanel();
        dropZone.setBackground(Color.LIGHT_GRAY);
        dropZone.setBorder(BorderFactory.createTitledBorder("Drop Here"));
        dropZone.setPreferredSize(new Dimension(200, 100));

        // Enable drag on the label
        dragLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TransferHandler handler = dragLabel.getTransferHandler();
                handler.exportAsDrag(dragLabel, evt, TransferHandler.COPY);
            }
        });

        // Enable drop on the panel
        DropTarget dropTarget = new DropTarget(dropZone, new DropTargetAdapter() {
            public void drop(DropTargetDropEvent event) {
                try {
                    event.acceptDrop(DnDConstants.ACTION_COPY);
                    String droppedText = (String) event.getTransferable()
                            .getTransferData(DataFlavor.stringFlavor);
                    dropZone.removeAll();
                    dropZone.add(new JLabel("Dropped: " + droppedText));
                    dropZone.revalidate();
                    dropZone.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Add components to frame
        add(dragLabel, BorderLayout.NORTH);
        add(dropZone, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DragAndDropExample::new);
    }
}
