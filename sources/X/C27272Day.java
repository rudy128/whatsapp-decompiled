package X;

import java.security.cert.CertPathBuilderException;

/* renamed from: X.Day  reason: case insensitive filesystem */
public class C27272Day extends CertPathBuilderException {
    public Throwable cause;

    public C27272Day(Throwable th) {
        super("Error finding target certificate.");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
