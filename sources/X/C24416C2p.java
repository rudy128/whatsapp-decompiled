package X;

/* renamed from: X.C2p  reason: case insensitive filesystem */
public final class C24416C2p extends IndexOutOfBoundsException {
    public static final long serialVersionUID = 160715609518896765L;
    public final String className;
    public final int constantPoolCount;

    public C24416C2p(String str, int i) {
        super(AnonymousClass001.A1H("Class too large: ", str, AnonymousClass000.A10()));
        this.className = str;
        this.constantPoolCount = i;
    }
}
