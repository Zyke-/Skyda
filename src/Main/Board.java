package Main;

import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Board {
	
	private JButton[][] chessBoardSquares = new JButton[8][8];
	private MovePieceHandler movePieceHndlr = new MovePieceHandler();
	
	public void setButtonsOverlays(){
		
		Insets buttonMargin = new Insets(0, 0, 0, 0);
		for (int ii = 0; ii < chessBoardSquares.length; ii++) {
	        for (int jj = 0; jj < chessBoardSquares[ii].length; jj++) {
	            JButton b = new JButton();
	            b.setMargin(buttonMargin);

	            ImageIcon icon = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
	            b.setIcon(icon);
	            
	            b.addActionListener(movePieceHndlr);
	            
	            chessBoardSquares[jj][ii] = b;
	        }
	    }
	}
}
