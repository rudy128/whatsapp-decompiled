package X;

import java.util.Iterator;

/* renamed from: X.3Bm  reason: invalid class name and case insensitive filesystem */
public abstract class C70543Bm implements Iterable, C18450wR {
    public final long A00 = 65536;
    public final long A01;

    public final Iterator iterator() {
        return new AnonymousClass3D8(this.A01);
    }

    public C70543Bm() {
        long j = 16777215;
        if (AnonymousClass04C.A00(65536, 16777215) < 0) {
            j = 16777215 - (AnonymousClass04C.A00(0, 0) < 0 ? 1 : 0);
        }
        this.A01 = j;
    }
}
