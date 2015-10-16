package supplyhousefeed;


public class Supplier {
    private String file; //the file location along with file name and extension
	private String supplierID;
	private String ProductId;
	private long quantity;
	String extension;     //set through the constructor
	FileParserFactory fpFactory; //handles parsing the file
	
	//constructor takes just the file
	public Supplier(String  file)
	{
		this.file=file;
	}
	
	
	public void parseFile(String extension)
	{
		fpFactory=new FileParserFactory(extension);
		fpFactory.getFileParser();	
	}
	
	
	public void setSupplierID(String supplierID)
	{
	    this.supplierID=supplierID;
	}
	
	public String getSupplierID()
	{
	   return supplierID; 
	}
	
	public void setQuantity(long quantity)
	{
		this.quantity=quantity;
	}
	
	public long getQuantity()
	{
		return quantity;
	}
	
	public void setProductId(String ProductId)
	{
	    this.ProductId=ProductId;
	}
	
	public String getProductId()
	{
	   return ProductId; 
	}
    
}
