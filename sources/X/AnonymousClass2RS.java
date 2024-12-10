package X;

/* renamed from: X.2RS  reason: invalid class name */
public class AnonymousClass2RS extends Exception {
    public String detailMessage;
    public final int errorCode;

    public AnonymousClass2RS(int i, String str) {
        super(str);
        this.errorCode = i;
        this.detailMessage = str;
    }
}
