package template;

public class BlockGame2 extends BlockTemplate {

    @Override
    public String getTitle() {
        return "BLOCK GAME";
    }

    @Override
    public String getEndTitle() {
        return "FINISH BLOCK GAME";
    }

    @Override
    public String getKarakter() {
        return "+";
    }

    @Override
    public Integer getHeight() {
        return 5;
    }

    @Override
    public Integer getWidth() {
        return 15;
    }
}
