package X;

/* renamed from: X.Cpg  reason: case insensitive filesystem */
public abstract class C25973Cpg {
    public final int A00;

    static {
        int length = "xml ".length();
        C26056CrS.A02(BE8.A1U(length, 4));
        for (int i = 0; i < length; i++) {
            "xml ".charAt(i);
        }
    }

    public String toString() {
        return A00(this.A00);
    }

    public C25973Cpg(int i) {
        this.A00 = i;
    }

    public static String A00(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("");
        A10.append((char) ((i >> 24) & 255));
        A10.append((char) ((i >> 16) & 255));
        A10.append((char) ((i >> 8) & 255));
        return C17890vO.A0c(A10, (char) (i & 255));
    }
}
