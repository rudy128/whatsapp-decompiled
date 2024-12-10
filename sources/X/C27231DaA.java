package X;

/* renamed from: X.DaA  reason: case insensitive filesystem */
public class C27231DaA extends RuntimeException {
    public final String lispyStackTrace;
    public final String minsStackTrace;

    public C27231DaA(String str, String str2, Throwable th) {
        super(th.getMessage(), th);
        this.lispyStackTrace = str;
        this.minsStackTrace = str2;
    }

    public C27231DaA(String str) {
        super(str);
        this.lispyStackTrace = null;
        this.minsStackTrace = null;
    }

    public C27231DaA(Throwable th) {
        super(th);
        this.lispyStackTrace = null;
        this.minsStackTrace = null;
    }
}
