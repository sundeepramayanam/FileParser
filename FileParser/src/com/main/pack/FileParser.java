package com.main.pack;

import java.io.File;
import java.util.ArrayList;

public class FileParser {

	public static void main(String[] args) {
		
		String folderName = "Data";
		File folder = new File(folderName);
		
		DocumentUtils documentUtils = new DocumentUtils();
		ArrayList<Document> documentsList = new ArrayList<>();
		documentsList = 	documentUtils.walkThroughFolder(folder);

	}

}
