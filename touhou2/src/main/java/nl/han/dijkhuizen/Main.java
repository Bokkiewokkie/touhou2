package nl.han.dijkhuizen;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Main extends YaegerGame {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void setupGame() {
        setGameTitle("Story of Eastern Wonderland");
        setSize(new Size(1200,700));
    }

    @Override
    public void setupScenes() {
        
    }
}