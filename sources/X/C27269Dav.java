package X;

import java.security.cert.CRLException;

/* renamed from: X.Dav  reason: case insensitive filesystem */
public class C27269Dav extends CRLException {
    public Throwable cause;

    public C27269Dav(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
