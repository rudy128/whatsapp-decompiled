package X;

public class C2M extends Exception {
    public final C26006CqN mAuthority;

    public C2M(C26006CqN cqN, String str, Throwable th) {
        super(str, th);
        this.mAuthority = cqN;
    }

    public C2M(C26006CqN cqN, String str) {
        super(str);
        this.mAuthority = cqN;
    }
}
