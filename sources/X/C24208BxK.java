package X;

import java.io.IOException;

/* renamed from: X.BxK  reason: case insensitive filesystem */
public final class C24208BxK extends IOException {
    public C24208BxK(Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }

    public C24208BxK(String str) {
        super(str);
    }
}
