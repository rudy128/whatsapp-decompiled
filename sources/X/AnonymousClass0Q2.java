package X;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;

/* renamed from: X.0Q2  reason: invalid class name */
public final class AnonymousClass0Q2 {
    public long A00;
    public C01990Cf A01;
    public C17040te A02;
    public boolean A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public float A07;
    public long A08;
    public long A09;
    public AnonymousClass0NJ A0A;
    public C17040te A0B;
    public C17040te A0C;
    public C16370s9 A0D;
    public C28644ECa A0E;
    public C24246By4 A0F;
    public final Outline A0G;

    public static final boolean A03(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        long j2 = C04140Lz.A00;
        float A022 = AnonymousClass001.A02(j);
        float A012 = AnonymousClass001.A01(j);
        if (((f5 * f5) / (A022 * A022)) + ((f6 * f6) / (A012 * A012)) <= 1.0f) {
            return true;
        }
        return false;
    }

    private final void A00(AnonymousClass0NU r10) {
        float f = r10.A01;
        float f2 = r10.A03;
        long A0p = AnonymousClass001.A0p(f, f2);
        long j = AnonymousClass0QY.A03;
        this.A09 = A0p;
        float f3 = r10.A02;
        float f4 = r10.A00;
        long A0p2 = AnonymousClass001.A0p(f3 - f, f4 - f2);
        long j2 = AnonymousClass0QG.A02;
        this.A08 = A0p2;
        this.A0G.setRect(C22339B3q.A01(f), C22339B3q.A01(f2), C22339B3q.A01(f3), C22339B3q.A01(f4));
    }

    private final void A01(AnonymousClass0NJ r15) {
        long j = r15.A06;
        long j2 = C04140Lz.A00;
        float A022 = AnonymousClass001.A02(j);
        float f = r15.A01;
        float f2 = r15.A03;
        long A0p = AnonymousClass001.A0p(f, f2);
        long j3 = AnonymousClass0QY.A03;
        this.A09 = A0p;
        float f3 = r15.A02;
        float f4 = r15.A00;
        long A0p2 = AnonymousClass001.A0p(f3 - f, f4 - f2);
        long j4 = AnonymousClass0QG.A02;
        this.A08 = A0p2;
        if (C02480Ee.A00(r15)) {
            this.A0G.setRoundRect(C22339B3q.A01(f), C22339B3q.A01(f2), C22339B3q.A01(f3), C22339B3q.A01(f4), A022);
            this.A07 = A022;
            return;
        }
        C17040te r4 = this.A0B;
        if (r4 == null) {
            r4 = AnonymousClass0WS.A00();
            this.A0B = r4;
        }
        Path path = ((AnonymousClass0WS) r4).A03;
        path.reset();
        r4.BBh(r15);
        if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
            Outline outline = this.A0G;
            if (r4 instanceof AnonymousClass0WS) {
                outline.setConvexPath(path);
                this.A06 = !outline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.A04 = false;
            this.A0G.setEmpty();
            this.A06 = true;
        }
        this.A02 = r4;
    }

    public static final void A02(AnonymousClass0Q2 r5) {
        if (r5.A03) {
            r5.A09 = AnonymousClass0QY.A03;
            long j = r5.A00;
            r5.A08 = j;
            r5.A07 = 0.0f;
            r5.A02 = null;
            r5.A03 = false;
            r5.A06 = false;
            if (!r5.A05 || AnonymousClass0QG.A02(j) <= 0.0f || AnonymousClass0QG.A00(j) <= 0.0f) {
                r5.A0G.setEmpty();
                return;
            }
            r5.A04 = true;
            C01990Cf BHh = r5.A0D.BHh(r5.A0E, r5.A0F, j);
            r5.A01 = BHh;
            if (BHh instanceof C015709a) {
                r5.A00(((C015709a) BHh).A00);
            } else if (BHh instanceof C015809b) {
                r5.A01(((C015809b) BHh).A00);
            }
        }
    }

    public static final boolean A04(C01990Cf r25, float f, float f2) {
        float f3 = f2;
        float f4 = f;
        C01990Cf r1 = r25;
        if (r1 instanceof C015709a) {
            AnonymousClass0NU r12 = ((C015709a) r1).A00;
            if (r12.A01 > f || f >= r12.A02 || r12.A03 > f2 || f2 >= r12.A00) {
                return false;
            }
            return true;
        } else if (r1 instanceof C015809b) {
            AnonymousClass0NJ r10 = ((C015809b) r1).A00;
            float f5 = r10.A01;
            if (f < f5) {
                return false;
            }
            float f6 = r10.A02;
            if (f >= f6) {
                return false;
            }
            float f7 = r10.A03;
            if (f2 < f7) {
                return false;
            }
            float f8 = r10.A00;
            if (f2 >= f8) {
                return false;
            }
            long j = r10.A06;
            long j2 = C04140Lz.A00;
            float A032 = AnonymousClass000.A03(j);
            long j3 = r10.A07;
            float A033 = AnonymousClass000.A03(j3);
            float f9 = f6 - f5;
            if (A032 + A033 <= f9) {
                long j4 = r10.A04;
                float A034 = AnonymousClass000.A03(j4);
                long j5 = r10.A05;
                float A035 = AnonymousClass000.A03(j5);
                if (A034 + A035 <= f9) {
                    float A012 = AnonymousClass001.A01(j);
                    float A013 = AnonymousClass001.A01(j4);
                    float f10 = f8 - f7;
                    if (A012 + A013 <= f10) {
                        float A014 = AnonymousClass001.A01(j3);
                        float A015 = AnonymousClass001.A01(j5);
                        if (A014 + A015 <= f10) {
                            float f11 = A032 + f5;
                            float f12 = A012 + f7;
                            float f13 = f6 - A033;
                            float f14 = A014 + f7;
                            float f15 = f6 - A035;
                            float f16 = f8 - A015;
                            float f17 = f8 - A013;
                            float f18 = A034 + f5;
                            if (f < f11 && f2 < f12) {
                                return A03(f4, f3, f11, f12, j);
                            }
                            if (f < f18 && f2 > f17) {
                                return A03(f4, f3, f18, f17, j4);
                            }
                            if (f > f13 && f2 < f14) {
                                return A03(f4, f3, f13, f14, j3);
                            }
                            if (f <= f15 || f2 <= f16) {
                                return true;
                            }
                            return A03(f4, f3, f15, f16, j5);
                        }
                    }
                }
            }
            AnonymousClass0WS A002 = AnonymousClass0WS.A00();
            A002.BBh(r10);
            AnonymousClass0NU r0 = new AnonymousClass0NU(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
            AnonymousClass0WS A003 = AnonymousClass0WS.A00();
            A003.A01(r0);
            AnonymousClass0WS A004 = AnonymousClass0WS.A00();
            Path.Op op = Path.Op.INTERSECT;
            Path path = A004.A03;
            Path path2 = A002.A03;
            Path path3 = A003.A03;
            path.op(path2, path3, op);
            boolean isEmpty = path.isEmpty();
            path.reset();
            path3.reset();
            return !isEmpty;
        } else {
            throw new AnonymousClass3EW();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (X.AnonymousClass001.A02(r2) == r7) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C16960tV r22) {
        /*
            r21 = this;
            r4 = r21
            A02(r4)
            X.0te r0 = r4.A02
            r5 = r22
            if (r0 == 0) goto L_0x000f
            r5.BEz(r0)
            return
        L_0x000f:
            float r7 = r4.A07
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ac
            X.0te r6 = r4.A0C
            X.0NJ r10 = r4.A0A
            if (r6 == 0) goto L_0x0060
            long r2 = r4.A09
            long r0 = r4.A08
            if (r10 == 0) goto L_0x0060
            boolean r8 = X.C02480Ee.A00(r10)
            if (r8 == 0) goto L_0x0060
            float r9 = r10.A01
            float r8 = X.AnonymousClass0QY.A01(r2)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0060
            float r9 = r10.A03
            float r8 = X.AnonymousClass0QY.A02(r2)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0060
            float r9 = r10.A02
            float r8 = X.AnonymousClass001.A03(r2, r0)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0060
            float r8 = r10.A00
            float r0 = X.AnonymousClass001.A04(r2, r0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            long r2 = r10.A06
            long r0 = X.C04140Lz.A00
            float r0 = X.AnonymousClass001.A02(r2)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
        L_0x005c:
            r5.BEz(r6)
            return
        L_0x0060:
            long r2 = r4.A09
            float r9 = X.AnonymousClass0QY.A01(r2)
            float r10 = X.AnonymousClass0QY.A02(r2)
            float r11 = X.AnonymousClass0QY.A01(r2)
            long r0 = r4.A08
            float r8 = X.AnonymousClass0QG.A02(r0)
            float r11 = r11 + r8
            float r12 = X.AnonymousClass001.A04(r2, r0)
            long r2 = X.AnonymousClass001.A0p(r7, r7)
            long r0 = X.C04140Lz.A00
            float r1 = X.AnonymousClass001.A02(r2)
            float r0 = X.AnonymousClass001.A01(r2)
            long r13 = X.AnonymousClass001.A0p(r1, r0)
            X.0NJ r8 = new X.0NJ
            r17 = r13
            r19 = r13
            r15 = r13
            r8.<init>(r9, r10, r11, r12, r13, r15, r17, r19)
            if (r6 != 0) goto L_0x00a3
            X.0WS r6 = X.AnonymousClass0WS.A00()
        L_0x009b:
            r6.BBh(r8)
            r4.A0A = r8
            r4.A0C = r6
            goto L_0x005c
        L_0x00a3:
            r0 = r6
            X.0WS r0 = (X.AnonymousClass0WS) r0
            android.graphics.Path r0 = r0.A03
            r0.reset()
            goto L_0x009b
        L_0x00ac:
            long r0 = r4.A09
            float r6 = X.AnonymousClass0QY.A01(r0)
            float r7 = X.AnonymousClass0QY.A02(r0)
            float r8 = X.AnonymousClass0QY.A01(r0)
            long r2 = r4.A08
            float r4 = X.AnonymousClass0QG.A02(r2)
            float r8 = r8 + r4
            float r9 = X.AnonymousClass001.A04(r0, r2)
            r10 = 1
            r5.BF0(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q2.A06(X.0tV):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r9 > 0.0f) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.C16370s9 r5, X.C28644ECa r6, X.C24246By4 r7, float r8, float r9, boolean r10) {
        /*
            r4 = this;
            android.graphics.Outline r0 = r4.A0G
            r0.setAlpha(r8)
            X.0s9 r0 = r4.A0D
            boolean r0 = X.C18070vi.A18(r0, r5)
            r3 = 1
            r2 = r0 ^ 1
            if (r2 == 0) goto L_0x0014
            r4.A0D = r5
            r4.A03 = r3
        L_0x0014:
            if (r10 != 0) goto L_0x001c
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            boolean r0 = r4.A05
            if (r0 == r1) goto L_0x0025
            r4.A05 = r1
            r4.A03 = r3
        L_0x0025:
            X.By4 r0 = r4.A0F
            if (r0 == r7) goto L_0x002d
            r4.A0F = r7
            r4.A03 = r3
        L_0x002d:
            X.ECa r0 = r4.A0E
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 != 0) goto L_0x0039
            r4.A0E = r6
            r4.A03 = r3
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q2.A07(X.0s9, X.ECa, X.By4, float, float, boolean):boolean");
    }

    public AnonymousClass0Q2(C28644ECa eCa) {
        this.A0E = eCa;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.A0G = outline;
        long j = AnonymousClass0QG.A02;
        this.A00 = j;
        this.A0D = AnonymousClass0GC.A00;
        this.A09 = AnonymousClass0QY.A03;
        this.A08 = j;
        this.A0F = C24246By4.Ltr;
    }

    public final Outline A05() {
        A02(this);
        if (!this.A05 || !this.A04) {
            return null;
        }
        return this.A0G;
    }
}
