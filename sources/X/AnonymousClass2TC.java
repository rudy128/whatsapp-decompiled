package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: X.2TC  reason: invalid class name */
public abstract class AnonymousClass2TC {
    public static byte[] A00(List list, byte[] bArr, byte[] bArr2, boolean z) {
        int i;
        C17960vV.A0G(AnonymousClass000.A1T(bArr.length, 128), "Current hash array must be of size 128");
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        for (Object next : list) {
            C17960vV.A07(next);
            ByteBuffer wrap2 = ByteBuffer.wrap(C20058A5h.A00((byte[]) next, bArr2, 128));
            wrap2.order(ByteOrder.LITTLE_ENDIAN);
            wrap.mark();
            while (wrap.hasRemaining()) {
                int position = wrap.position();
                short s = wrap.getShort() & 65535;
                short s2 = wrap2.getShort() & 65535;
                if (z) {
                    i = s + s2;
                } else {
                    i = s - s2;
                }
                int position2 = wrap.position();
                wrap.position(position);
                wrap.putShort((short) (((short) i) & 65535));
                wrap.position(position2);
            }
            wrap.reset();
        }
        return wrap.array();
    }
}
