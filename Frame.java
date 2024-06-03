package apprenticechecklist;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Frame {																				//class to create Frame Object
	
	public static JFrame frame;																		// created local variable of Frame
	public static JTextArea textArea;																// creating local variable for Text Area in a frame
	
	public static void main(String[] args) {
		
		createFrame(); 																				// calling the createFrame method after creating it
		frame.setVisible(true);    																	// setting the frame so it is visible to the user
		createTextArea(); 																			// calling the createTextArea method 
		createMenu();                 																// calling the createMenu method
	}
	
	public static void createFrame() {																//Step 1: creating Frame/GUI window
		frame = new JFrame("Apprentice Checklist");													// create new Frame object and set the Title: Apprentice Checklist
		
		frame.setSize(500,400); 																	// setting the size of the frame length,width
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);										// when press X will close the frame with EXIT_ON_CLOSE method
	
		// Changing the image icon
		ImageIcon icon = new ImageIcon("/Users/nelsonmorales/Downloads/document_1541827.png");
	}
	
	public static void createTextArea() {															// Step 2: creating textArea method
		
		textArea = new JTextArea();																	// created new Text Area object
		frame.add(textArea);																		// adding text area to the frame using .add method
	
		JScrollPane scrollbar = new JScrollPane(textArea);											// Step 3: creating a new scroll bar object in textArea
		scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);				// setting the vertical scroll bar as needed not on always
		scrollbar.setBorder(BorderFactory.createEmptyBorder()); 									// creating empty border around the scroll bar
		frame.add(scrollbar);																		// adding scrollbar to the frame
	}
	
	public static void createMenu() {																// Step 4: Creating menu with a method
		JMenuBar menu = new JMenuBar();																// creating new menu on top part of frame
		frame.setJMenuBar(menu);																	// setting menu within the frame
		
		// adding each component of menu
		JMenu filemenu = new JMenu("File");															// creating new object name File
		menu.add(filemenu);																			// .add method to add file option in menubar
	
		JMenu editMenu = new JMenu("Edit");															// creating new object name File called Edit to JFrame Menus
		menu.add(editMenu);	
		
		JMenu formatMenu = new JMenu("Format");														// creating new object name File called Edit to JFrame Menus
		menu.add(formatMenu);	
		
		//adding components under the File in MenuBar, creating file menu items
		JMenuItem New = new JMenuItem("New");
		New.addActionListener(e -> FileMenu.newFile());												// locates New button in Frame and makes it so sets up New File in Frame, the action
		filemenu.add(New);
		
		JMenuItem open = new JMenuItem("Open");
		open.addActionListener(e -> FileMenu.openFile());
		filemenu.add(open);
		
		JMenuItem save = new JMenuItem("Save");
		save.addActionListener(e -> FileMenu.save());
		filemenu.add(save);
		
		JMenuItem saveAs = new JMenuItem("Save As...");
		saveAs.addActionListener(e -> FileMenu.saveAs());
		filemenu.add(saveAs);
		
		//Creating edit menu items
		
		JMenuItem cutItem = new JMenuItem("Cut");														// Cuts text from the file
		cutItem.addActionListener(e -> Edit.cut());														//receives a notification whenever any action is performed in the application
		editMenu.add(cutItem);																			// adding Cut option to Edit menu
	
		JMenuItem copyItem = new JMenuItem("Copy");														// Copies text from the file
		copyItem.addActionListener(e -> Edit.copy());
		editMenu.add(copyItem);
		
		JMenuItem pasteItem = new JMenuItem("Paste");													// Pastes text from the file
		pasteItem.addActionListener(e -> Edit.paste());
		editMenu.add(pasteItem);
	
		JMenuItem selectItem = new JMenuItem("Select All");													// Select text from the file
		selectItem.addActionListener(e -> Edit.selectAll());
		editMenu.add(selectItem);
	
		//Creating format menu items
		JMenuItem boldItem = new JMenuItem("Bold");													// Pastes text from the file
		boldItem.addActionListener(e -> FormatMenu.bold());
		formatMenu.add(boldItem);	

		JMenuItem italicItem = new JMenuItem("Italic");													// Pastes text from the file
		italicItem.addActionListener(e -> FormatMenu.italic());
		formatMenu.add(italicItem);	
		
		JMenuItem fontColorItem = new JMenuItem("Font Color");													// Pastes text from the file
		fontColorItem.addActionListener(e -> FormatMenu.fontColor());
		formatMenu.add(fontColorItem);	
			
	}
}
	

