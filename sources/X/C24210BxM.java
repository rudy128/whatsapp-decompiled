package X;

import java.io.IOException;

/* renamed from: X.BxM  reason: case insensitive filesystem */
public class C24210BxM extends IOException {
    public Throwable cause;

    public C24210BxM(String str) {
        super(str);
    }

    public C24210BxM(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
