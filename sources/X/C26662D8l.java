package X;

import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.D8l  reason: case insensitive filesystem */
public abstract class C26662D8l implements C28627EBa {
    public C25797Cm9 A00;
    public ByteBuffer A01;
    public C25797Cm9 A02;
    public C25797Cm9 A03;
    public ByteBuffer A04;
    public boolean A05;
    public C25797Cm9 A06;

    public final void CDA() {
        this.A05 = true;
        if (this instanceof BOV) {
            BOV bov = (BOV) this;
            if (bov.A05) {
                int i = bov.A00;
                if (i > 0) {
                    bov.A04 += (long) (i / bov.A00.A00);
                }
                bov.A00 = 0;
            }
        } else if (this instanceof BOX) {
            BOX box = (BOX) this;
            int i2 = box.A01;
            if (i2 > 0) {
                BOX.A00(box, box.A07, i2);
            }
            if (!box.A06) {
                box.A04 += (long) (box.A02 / box.A00);
            }
        }
    }

    public final ByteBuffer A02(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = BEA.A0u(i);
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C25797Cm9 BFW(X.C25797Cm9 r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r2 = r7
            boolean r0 = r7 instanceof X.BOV
            if (r0 == 0) goto L_0x0024
            X.BOV r2 = (X.BOV) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00be
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0019
            int r0 = r2.A02
        L_0x0017:
            if (r0 == 0) goto L_0x00ba
        L_0x0019:
            r7.A03 = r8
            boolean r0 = r7.Be2()
            if (r0 != 0) goto L_0x0023
            X.Cm9 r8 = X.C25797Cm9.A04
        L_0x0023:
            return r8
        L_0x0024:
            boolean r0 = r7 instanceof X.BOT
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7 instanceof X.BOS
            if (r0 == 0) goto L_0x003d
            X.BOS r2 = (X.BOS) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00ba
            int r1 = r8.A02
            r0 = 2
            if (r1 == r0) goto L_0x0019
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        L_0x003d:
            boolean r0 = r7 instanceof X.BOX
            if (r0 == 0) goto L_0x004b
            X.BOX r2 = (X.BOX) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00c4
            boolean r0 = r2.A05
            goto L_0x0017
        L_0x004b:
            boolean r0 = r7 instanceof X.BOR
            if (r0 == 0) goto L_0x006f
            int r1 = r8.A02
            r0 = 3
            r2 = 2
            if (r1 == r0) goto L_0x0065
            if (r1 == r2) goto L_0x00ba
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0065
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0065
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        L_0x0065:
            int r1 = r8.A03
            int r0 = r8.A01
            X.Cm9 r8 = new X.Cm9
            r8.<init>(r1, r0, r2)
            goto L_0x0019
        L_0x006f:
            boolean r0 = r7 instanceof X.BOW
            if (r0 == 0) goto L_0x008e
            int r1 = r8.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x0083
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x0083
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        L_0x0083:
            int r2 = r8.A03
            int r1 = r8.A01
            r0 = 4
            X.Cm9 r8 = new X.Cm9
            r8.<init>(r2, r1, r0)
            goto L_0x0019
        L_0x008e:
            X.BOU r2 = (X.BOU) r2
            int[] r6 = r2.A01
            if (r6 == 0) goto L_0x00ba
            int r0 = r8.A02
            r5 = 2
            if (r0 != r5) goto L_0x00d0
            int r4 = r8.A01
            int r3 = r6.length
            boolean r2 = X.AnonymousClass000.A1S(r4, r3)
            r1 = 0
        L_0x00a1:
            if (r1 >= r3) goto L_0x00af
            r0 = r6[r1]
            if (r0 >= r4) goto L_0x00ca
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00af:
            if (r2 == 0) goto L_0x00ba
            int r0 = r8.A03
            X.Cm9 r8 = new X.Cm9
            r8.<init>(r0, r3, r5)
            goto L_0x0019
        L_0x00ba:
            X.Cm9 r8 = X.C25797Cm9.A04
            goto L_0x0019
        L_0x00be:
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        L_0x00c4:
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        L_0x00ca:
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        L_0x00d0:
            X.C1I r0 = new X.C1I
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26662D8l.BFW(X.Cm9):X.Cm9");
    }

    public ByteBuffer BVr() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C28627EBa.A00;
        return byteBuffer;
    }

    public boolean Be2() {
        if (this instanceof BOS) {
            return ((BOS) this).A00;
        }
        if (this instanceof BOX) {
            return ((BOX) this).A05;
        }
        return AnonymousClass3Ma.A1Z(this.A03, C25797Cm9.A04);
    }

    public boolean Bed() {
        if (!this.A05 || this.A01 != C28627EBa.A00) {
            return false;
        }
        return true;
    }

    public final void flush() {
        this.A01 = C28627EBa.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        if (this instanceof BOV) {
            BOV bov = (BOV) this;
            if (bov.A05) {
                bov.A05 = false;
                int i = bov.A02;
                int i2 = bov.A00.A00;
                bov.A06 = new byte[(i * i2)];
                bov.A01 = bov.A03 * i2;
            } else {
                bov.A01 = 0;
            }
            bov.A00 = 0;
        } else if (this instanceof BOX) {
            BOX box = (BOX) this;
            if (box.A05) {
                C25797Cm9 cm9 = box.A00;
                int i3 = cm9.A00;
                box.A00 = i3;
                long j = (long) cm9.A03;
                int A0F = ((int) BE8.A0F(150000, j)) * i3;
                if (box.A07.length != A0F) {
                    box.A07 = new byte[A0F];
                }
                int A0F2 = ((int) BE8.A0F(20000, j)) * i3;
                box.A02 = A0F2;
                if (box.A08.length != A0F2) {
                    box.A08 = new byte[A0F2];
                }
            }
            box.A03 = 0;
            box.A04 = 0;
            box.A01 = 0;
            box.A06 = false;
        } else if (this instanceof BOU) {
            BOU bou = (BOU) this;
            bou.A00 = bou.A01;
        }
    }

    public C26662D8l() {
        ByteBuffer byteBuffer = C28627EBa.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        C25797Cm9 cm9 = C25797Cm9.A04;
        this.A02 = cm9;
        this.A03 = cm9;
        this.A00 = cm9;
        this.A06 = cm9;
    }

    public final void reset() {
        flush();
        this.A04 = C28627EBa.A00;
        C25797Cm9 cm9 = C25797Cm9.A04;
        this.A02 = cm9;
        this.A03 = cm9;
        this.A00 = cm9;
        this.A06 = cm9;
        if (this instanceof BOV) {
            ((BOV) this).A06 = Util.A08;
        } else if (this instanceof BOS) {
            ((BOS) this).A00 = false;
        } else if (this instanceof BOX) {
            BOX box = (BOX) this;
            box.A05 = false;
            box.A02 = 0;
            byte[] bArr = Util.A08;
            box.A07 = bArr;
            box.A08 = bArr;
        } else if (this instanceof BOU) {
            BOU bou = (BOU) this;
            bou.A00 = null;
            bou.A01 = null;
        }
    }
}
