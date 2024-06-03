package apprenticechecklist;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;

public class FileMenu {

	public static JFrame frame;																	// creating local variable of frame that can be used here and in Frame
	public static String fileName;																// creating local variable so will be able to display file name in path to user
	public static String filePath;																// creating local variable so will be able to display path
	public static String directory;																// creating local variable so can get directory of file and list it
	
	
	public static void newFile() {																		//creating newFile method/behavior and option in JMenu
		Frame.textArea.setText(""); 															// when starting a new file will start with empty text w/in Frame
		Frame.frame.setTitle("New");															// creating a new frame within the Frame window with a title of New
	}
	
	public static void openFile() {																// creating an openFile/behavior to open a file on computer
		FileDialog fileDialog = new FileDialog(frame, "Open File", FileDialog.LOAD);			// creates a new dialog frame where user can open a file on computer
		fileDialog.setVisible(true); 															// set the new dialog frame so user can see it
		
		if(fileDialog.getFile() != null) {														// conditional stmt: if the getFile isn't empty
			directory = fileDialog.getDirectory();												// getting directory of file that may already exist
			fileName = fileDialog.getFile();													// getting file of that which may already exist
			filePath = directory + fileName;													// file path that will be gotten is the directory plus the file name
			Frame.frame.setTitle("fileName");													// will set a new Frame inside the Frame Window that will say fileName
		
		//try-catch block to read and write into file that already exists
			
			try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){			// creating a new reader to path the file you want to read. 
				String Line;																	// creating local variable to be able to read the lines in file
				Frame.textArea.setText("");														// if file is already there set text area to empty
				while((Line = reader.readLine()) != null) {										// while a line is not empty reads a single line from the file
					Frame.textArea.append(Line + "\n") ;										// Makes it so user can add text to the file
			}
		}
			catch(IOException e) {																// search for file and if not found will through the exception and print the message
				System.out.println("File Not Found");
			}
		}
	}
		public static void saveAs() {																// creating an openFile/behavior to open a file on computer
			FileDialog fileDialog = new FileDialog(frame, "Save", FileDialog.LOAD);			// creates a new dialog frame where user can open a file on computer
			fileDialog.setVisible(true); 															// set the new dialog frame so user can see it
			
			if(fileDialog.getFile() != null) {														// conditional stmt: if the getFile isn't empty
				directory = fileDialog.getDirectory();												// getting directory of file that may already exist
				fileName = fileDialog.getFile();													// getting file of that which may already exist
				filePath = directory + fileName;													// file path that will be gotten is the directory plus the file name
				Frame.frame.setTitle("fileName");													// will set a new Frame inside the Frame Window that will say fileName
			
			//try-catch block to read and write into file that already exists
				
				try { 
				FileWriter writer = new FileWriter(filePath);
					writer.write(Frame.textArea.getText());											//method allows user to write over file
					writer.close(); 																// close method to close writer after changes made
			}
				catch(IOException e) {																// tries to save file but if something wrong will tell user file not saved
					System.out.println("File Not Saved");
				}
			}
		}
		public static void save() {																	// creating save method
			if (fileName == null) {																	// conditional stmt: if File name is empty then choose Save As behavior
				saveAs();
			}
			else {																					// if not empty
				try { 
					FileWriter writer = new FileWriter(filePath);
						writer.write(Frame.textArea.getText());											//method allows user to write over file
						writer.close(); 																// close method to close writer after changes made
				}
					catch(IOException e) {																// tries to save file but if something wrong will tell user file not saved
						System.out.println("File Not Saved");
					}
				}
			}
		}		
