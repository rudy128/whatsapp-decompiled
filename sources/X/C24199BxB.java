package X;

import java.io.IOException;

/* renamed from: X.BxB  reason: case insensitive filesystem */
public class C24199BxB extends IOException {
    public final int errorCode;

    public C24199BxB(int i, Throwable th) {
        super(th);
        this.errorCode = i;
    }
}
