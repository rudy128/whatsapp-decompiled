package X;

import java.nio.ByteBuffer;

/* renamed from: X.Bm5  reason: case insensitive filesystem */
public final class C23576Bm5 extends C25719Ckp {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Ckp, X.Bm4] */
    public C23575Bm4 A04(int i) {
        ? obj = new Object();
        int A02 = A02(26);
        if (A02 == 0) {
            return null;
        }
        int A00 = C25719Ckp.A00(this, A02) + 4 + (i * 4);
        int i2 = A00 + this.A01.getInt(A00);
        ByteBuffer byteBuffer = this.A01;
        obj.A00 = i2;
        obj.A01 = byteBuffer;
        return obj;
    }
}
