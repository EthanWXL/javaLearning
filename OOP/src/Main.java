public class Main {
    public static void main(String[] args){
        News news = new News("ABC","DEF");
        Video video = new Video();

        newsView(video);
        newsView(news);
    }
    //newsView包含一个Viewable对象，该对象调用display方法后打印播放完成
    private static void newsView(Viewable item){
        item.display();
        System.out.println("播放完成");
    }
}
