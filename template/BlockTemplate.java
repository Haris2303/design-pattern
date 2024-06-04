package template;

public abstract class BlockTemplate {

    public final void start() {
        System.out.println(getTitle());

        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print(getKarakter());
            }
            System.out.print("\n\r");
        }

        System.out.println(getEndTitle());
    }

    public abstract String getTitle();

    public abstract String getEndTitle();

    public abstract String getKarakter();

    public abstract Integer getHeight();

    public abstract Integer getWidth();
}
