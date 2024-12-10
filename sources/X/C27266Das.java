package X;

import java.security.InvalidKeyException;

/* renamed from: X.Das  reason: case insensitive filesystem */
public class C27266Das extends InvalidKeyException {
    public final Throwable cause;

    public C27266Das(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
