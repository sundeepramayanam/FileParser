package com.main.pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DocumentUtils {

	public ArrayList walkThroughFolder(File folder) {
		ArrayList<Document> listDocuments = new ArrayList<>();
		File[] fileNames = folder.listFiles();
		for(File file:fileNames) {
			if(file.isDirectory()) {
				walkThroughFolder(file);
			}else {
				try {
                    listDocuments.add(readContent(file));
                } catch (IOException e) {
                    e.printStackTrace();
                }
			}
			
		}
		
		return listDocuments;
	}
	public Document readContent(File file) throws IOException{
		Document document = new Document();
		document.setField(file.getName());
        try(BufferedReader br  = new BufferedReader(new FileReader(file))){
              String strLine;
              while((strLine = br.readLine()) != null){
               //System.out.println("Line is - " + strLine);
              }
             }
        return document;
    }

	
}
