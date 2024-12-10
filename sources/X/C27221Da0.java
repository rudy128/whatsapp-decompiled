package X;

/* renamed from: X.Da0  reason: case insensitive filesystem */
public class C27221Da0 extends RuntimeException {
    public final int mCameraError;

    public C27221Da0(int i, String str) {
        super(str);
        this.mCameraError = i;
    }

    public String getMessage() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        int i = this.mCameraError;
        if (i == 1) {
            str = "unknown";
        } else if (i == 2) {
            str = "evicted";
        } else if (i != 100) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("other(");
            A102.append(i);
            str = AnonymousClass8BU.A0q(A102);
        } else {
            str = "server_died";
        }
        BE7.A1N(A10, str);
        return AnonymousClass000.A0y(super.getMessage(), A10);
    }
}
