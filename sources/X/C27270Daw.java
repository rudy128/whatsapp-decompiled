package X;

import java.security.cert.CRLException;

/* renamed from: X.Daw  reason: case insensitive filesystem */
public class C27270Daw extends CRLException {
    public Throwable cause;

    public C27270Daw(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
