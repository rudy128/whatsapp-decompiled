package X;

public class C2L extends Exception {
    public final C24340Bzb mErrorType;

    public C2L(C24340Bzb bzb, String str) {
        super(str);
        this.mErrorType = bzb;
    }

    public C2L(C24340Bzb bzb, Throwable th) {
        super(th);
        this.mErrorType = bzb;
    }
}
