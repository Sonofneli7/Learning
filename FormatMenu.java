package apprenticechecklist;

import java.awt.Color;
import java.awt.Font;
import java.nio.channels.SelectableChannel;

import javax.swing.JColorChooser;

public class FormatMenu {																				// created class so can implement all methods for Format Menu	 																				

		public static void bold() {
			Font currentFont = Frame.textArea.getFont();												// going to get the current font of the font in the text area
			Font boldFont = currentFont.deriveFont(Font.BOLD);											// gets the current font and makes it bold
			Frame.textArea.setFont(boldFont);															// sets the font to bold font within the text area
		}
		
		public static void italic() {
			Font currentFont = Frame.textArea.getFont();												// going to get the current font of the font in the text area
			Font italicFont = currentFont.deriveFont(Font.ITALIC);										// gets the current font and makes it italic
			Frame.textArea.setFont(italicFont);															// sets the font to italic font within the text area
		}
		
		public static void fontColor() {
			Color selectedColor = JColorChooser.showDialog(null, "Select Font Color", Color.BLACK);		// get initial color which is black
			if (selectedColor != null) {
			Frame.textArea.setForeground(selectedColor);										
		}
	}
		
}
