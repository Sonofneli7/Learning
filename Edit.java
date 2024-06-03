package apprenticechecklist;

public class Edit {												// created class so can implement all methods for Edit Menu

	public static void cut() {
		Frame.textArea.cut();									//takes action for user to cut text in frame
	}
	
	public static void copy() {
		Frame.textArea.copy();									//takes action for user to copy text in frame
	}
	public static void paste() {
		Frame.textArea.paste();									//takes action for user to paste text in frame
	}
	public static void selectAll() {
		Frame.textArea.selectAll();								//takes action for user to Select All text in frame
	}
}
