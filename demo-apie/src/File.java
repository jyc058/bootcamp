// ! Interface
// APIE -> "A" -> 
// Class Signature
public class File implements Readable, Writable{ // Functions, skills
  // ! implements "interface"
  private String content;

  public File(String content) {
    this.content = content;
  }

  public void append(String newContent) {
    this.content += newContent;
  }

  public String getContent() {
    return this.content;
  }

  // Once you "@Override", Java checks if the parent class/ interface has this method
  // if exists, this child class override the parent/interface method
  @Override
  public void read() {
    System.out.println("I am reading the file..." + this.content);
  }

  //Method Signature: method name + input parameters
  @Override
    public void write(String content) {
      this.append(content);
    }
  
  public static void main(String[] args) {
    File file = new File("Hello World");
    file.append("!!!!");
    System.out.println(file.getContent());
}
}