package X;

import java.io.IOException;

/* renamed from: X.Bx1  reason: case insensitive filesystem */
public class C24191Bx1 extends IOException {
    public C24191Bx1(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
