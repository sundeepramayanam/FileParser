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
		document.setFileId(file.getCanonicalPath());
		//document.setFileId(file.getName());
		System.out.println(document.getFileId());
        try(BufferedReader br  = new BufferedReader(new FileReader(file))){
              String strLine;
              while((strLine = br.readLine()) != null){
               //System.out.println("Line is - " + strLine);
              }
             }
        return document;
    }
	
	public void printDocumentContents(Document doc) {
		System.out.println("FileId : " + doc.getFileId());
		System.out.println("Category : " + doc.getCategory());
		System.out.println("Title : " + doc.getTitle());
		System.out.println("Author : " + doc.getAuthor());
		System.out.println("AuthorOrg : " + doc.getAuthorOrg());
		System.out.println("Place : " + doc.getPlace());
		System.out.println("NewsDate : "+ doc.getNewsDate());
		System.out.println("Content :  " + doc.getContent());
	}

	
}
