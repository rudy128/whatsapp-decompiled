package X;

public abstract class C2H extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2H(String str) {
        super(str);
        C18210vx.A05(str, "Detail message must not be empty");
    }

    @Deprecated
    public C2H() {
    }
}
