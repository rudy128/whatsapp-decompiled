package X;

/* renamed from: X.9La  reason: invalid class name and case insensitive filesystem */
public class C180079La extends Exception implements B8K {
    public final int errorCode;

    public C180079La(int i) {
        super("received error message");
        this.errorCode = i;
    }

    public int BUv() {
        return this.errorCode;
    }

    public String getMessage() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.getMessage());
        A10.append(" (error_code=");
        A10.append(this.errorCode);
        return AnonymousClass8BU.A0q(A10);
    }
}
