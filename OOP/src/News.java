public class News implements Viewable{
    //封装，使用setter和getter方法
    private String title;
    private String content;

    //构造方法
    public News(String title,String content){
        //第一个title表示News类的成员变量，第二个title表示News方法的参数
        this.title = title;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
    //重写display方法
    @Override
    public void display(){
        System.out.println("|title|"+this.getTitle());
        System.out.println("|content|"+this.getContent());
    }
}
