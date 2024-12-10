package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.CpS  reason: case insensitive filesystem */
public final class C25960CpS {
    public int A00;
    public int A01 = 65536;
    public long A02;
    public byte[] A03;
    public final int A04;
    public final int A05;
    public final C26037Cqx A06;
    public final CT0 A07;
    public final AnonymousClass185 A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r3.A09 != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25960CpS(X.CT0 r4, X.AnonymousClass185 r5, java.io.RandomAccessFile r6, int r7, int r8, boolean r9) {
        /*
            r3 = this;
            r1 = 2
            r3.<init>()
            r2 = 65536(0x10000, float:9.18355E-41)
            r3.A01 = r2
            r3.A07 = r4
            r3.A05 = r7
            byte[][] r0 = X.CGG.A00
            r0 = r0[r1]
            r3.A03 = r0
            r3.A04 = r8
            r3.A08 = r5
            r3.A09 = r9
            r1 = 0
            X.Cqx r0 = new X.Cqx
            r0.<init>(r5, r6, r1, r2)
            r3.A06 = r0
            if (r8 == 0) goto L_0x0031
            r0 = 1
            if (r8 != r0) goto L_0x002a
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0027:
            r3.A00 = r1
            return
        L_0x002a:
            boolean r0 = r3.A09
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0027
        L_0x0031:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25960CpS.<init>(X.CT0, X.185, java.io.RandomAccessFile, int, int, boolean):void");
    }

    public static long A00(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long j = (long) byteBuffer.getInt();
        if (0 > j) {
            return j + 4294967296L;
        }
        return j;
    }

    public static void A01(C25960CpS cpS, int i, int i2) {
        C24999CSz cSz;
        C26037Cqx cqx = cpS.A06;
        ByteBuffer byteBuffer = cqx.A02;
        byteBuffer.clear();
        cqx.A01 = 0;
        cqx.A03.reset();
        cqx.A00 = 0;
        if (i >= 0) {
            byteBuffer.put(CGG.A00[i]);
            if (i != 0) {
                byteBuffer.putInt(i2);
            }
            byteBuffer.putInt(cpS.A01);
            byteBuffer.putInt(cpS.A00);
            CT0 ct0 = cpS.A07;
            byteBuffer.putInt(ct0.A01);
            if (i >= 2) {
                byteBuffer.putInt(ct0.A00);
                byteBuffer.put(ct0.A04 ? (byte) 1 : 0);
                cqx.A04(ct0.A03);
                byteBuffer.putInt(ct0.A02);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                C24999CSz[] cSzArr = ct0.A05;
                if (i3 < cSzArr.length) {
                    cSz = cSzArr[i3];
                } else {
                    cSz = new C24999CSz(cpS.A04);
                }
                byteBuffer.putInt(cSz.A01);
                cqx.A04(cSz.A04);
                if (i >= 2) {
                    byteBuffer.putInt(cSz.A02);
                    byteBuffer.putInt(cSz.A00);
                }
                cqx.A04(cSz.A03);
            }
            long A012 = cqx.A01();
            cpS.A02 = A012;
            cqx.A04(A012);
            return;
        }
        throw BEA.A0h("Invalid version: ", AnonymousClass000.A10(), i);
    }
}
