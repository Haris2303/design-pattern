package adapter;

public class ScreencastCatalogAdapter implements CatalogAdapter {
    private Screencast screencast;

    public ScreencastCatalogAdapter(Screencast screencast) {
        this.screencast = screencast;
    }

    @Override
    public String getCatelogTitle() {
        return screencast.getTitle() + " by " + screencast.getAuthor();
    }
}
