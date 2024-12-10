package X;

import java.io.IOException;

/* renamed from: X.BxI  reason: case insensitive filesystem */
public class C24206BxI extends IOException {
    public C24206BxI(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public C24206BxI(String str) {
        super(str);
    }
}
