/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplyhousefeed;

/**
 *
 * @author mishrnT440S
 */
public class FileParserFactory { //creates file parser objects based on the file extension type
    String extension;
  public FileParserFactory(String ext)
  {
	extension=ext;       //extension of the file is provided to the factory to instantiate it
  }
  
  public FileParser getFileParser()     //the return type is an interface and its subclasses are returned in below switch statements.
  {
     switch(extension)          //creates appropriate FileParser object based on the extension procided
	 {
	     case "CSV":
		    return new CSVFileParser();
		    
	     case "XLS":
                    return new XLSFileParser();
                    
	     case "TAB":
                    return new TABFileParser();
                    
	     default:
                    return null;
	 }
  }
    
}
