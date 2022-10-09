public class Book {
    private String name;
    private String content;
    public Book(String n){
        this.name = n;
        this.content = "";
    }

    public void createNewParagraph(String text){
        this.content += text + "\n";
    }

    public void createNewImage(String name){
        this.content += String.format("{img:%s}\n", name);
    }

    public void createNewTable(String table){
        this.content += String.format("[%s]\n", table);
    }

    public void print(){
        System.out.println(this.content);
    }
}
