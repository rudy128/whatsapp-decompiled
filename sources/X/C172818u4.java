package X;

/* renamed from: X.8u4  reason: invalid class name and case insensitive filesystem */
public abstract class C172818u4 extends C173518vD {
    public final Throwable cause;
    public final String message;

    public C172818u4(String str, Throwable th) {
        super(str, "CLIENT", "mex-product-error", th, 480);
        this.message = str;
        this.cause = th;
    }

    public String getMessage() {
        return this.message;
    }
}
