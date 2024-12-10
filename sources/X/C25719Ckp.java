package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Ckp  reason: case insensitive filesystem */
public abstract class C25719Ckp {
    public int A00;
    public ByteBuffer A01;

    public static int A00(C25719Ckp ckp, int i) {
        int i2 = i + ckp.A00;
        return i2 + ckp.A01.getInt(i2);
    }

    public int A02(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }

    public String A03(int i) {
        int i2 = i + this.A01.getInt(i);
        boolean hasArray = this.A01.hasArray();
        ByteBuffer byteBuffer = this.A01;
        if (hasArray) {
            return BE6.A0r(C24687CFl.A00, byteBuffer.array(), this.A01.arrayOffset() + i2 + 4, this.A01.getInt(i2));
        }
        ByteBuffer order = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = order.getInt(i2);
        byte[] bArr = new byte[i3];
        order.position(i2 + 4);
        order.get(bArr);
        return BE6.A0r(C24687CFl.A00, bArr, 0, i3);
    }

    public static C23575Bm4 A01(C23575Bm4 bm4, C25719Ckp ckp, int i) {
        int A02 = ckp.A02(i);
        if (A02 == 0) {
            return null;
        }
        int i2 = A02 + ckp.A00;
        int i3 = i2 + ckp.A01.getInt(i2);
        ByteBuffer byteBuffer = ckp.A01;
        bm4.A00 = i3;
        bm4.A01 = byteBuffer;
        return bm4;
    }
}
