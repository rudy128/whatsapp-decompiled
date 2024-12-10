package X;

import java.util.ArrayList;

/* renamed from: X.1sJ  reason: invalid class name and case insensitive filesystem */
public class C38991sJ implements C38981sI {
    public float A00 = 0.0f;
    public C39041sO A01;
    public C38971sH A02 = null;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;

    public static C38971sH A00(C38991sJ r9, C38971sH r10, boolean[] zArr) {
        Integer num;
        C39041sO r8 = r9.A01;
        int BQ2 = r8.BQ2();
        C38971sH r6 = null;
        float f = 0.0f;
        for (int i = 0; i < BQ2; i++) {
            float BbH = r8.BbH(i);
            if (BbH < 0.0f) {
                C38971sH BbG = r8.BbG(i);
                if ((zArr == null || !zArr[BbG.A02]) && BbG != r10 && (((num = BbG.A06) == AnonymousClass00R.A0C || num == AnonymousClass00R.A0N) && BbH < f)) {
                    f = BbH;
                    r6 = BbG;
                }
            }
        }
        return r6;
    }

    public void A03(C38991sJ r18, boolean z) {
        C38991sJ r4 = r18;
        if (this instanceof C39031sN) {
            C39031sN r3 = (C39031sN) this;
            C38971sH r7 = r4.A02;
            if (r7 != null) {
                C39041sO r6 = r4.A01;
                int BQ2 = r6.BQ2();
                for (int i = 0; i < BQ2; i++) {
                    C38971sH BbG = r6.BbG(i);
                    float BbH = r6.BbH(i);
                    C39061sQ r11 = r3.A02;
                    r11.A01 = BbG;
                    boolean z2 = true;
                    int i2 = 0;
                    if (BbG.A07) {
                        int i3 = 0;
                        do {
                            float[] fArr = BbG.A09;
                            float f = fArr[i3] + (r7.A09[i3] * BbH);
                            fArr[i3] = f;
                            if (Math.abs(f) < 1.0E-4f) {
                                fArr[i3] = 0.0f;
                            } else {
                                z2 = false;
                            }
                            i3++;
                        } while (i3 < 9);
                        if (z2) {
                            C39031sN.A02(r11.A02, BbG);
                        }
                    } else {
                        do {
                            float f2 = r7.A09[i2];
                            if (f2 != 0.0f) {
                                float f3 = f2 * BbH;
                                if (Math.abs(f3) < 1.0E-4f) {
                                    f3 = 0.0f;
                                }
                                BbG.A09[i2] = f3;
                            } else {
                                BbG.A09[i2] = 0.0f;
                            }
                            i2++;
                        } while (i2 < 9);
                        C39031sN.A01(r3, BbG);
                    }
                    r3.A00 += r4.A00 * BbH;
                }
                C39031sN.A02(r3, r7);
                return;
            }
            return;
        }
        this.A00 += r4.A00 * this.A01.CRa(r4, z);
        if (z) {
            r4.A02.A03(this);
        }
    }

    public void A04(C38971sH r5) {
        C38971sH r1 = this.A02;
        if (r1 != null) {
            this.A01.CCz(r1, -1.0f);
            this.A02 = null;
        }
        C39041sO r2 = this.A01;
        float CET = r2.CET(r5, true) * -1.0f;
        this.A02 = r5;
        if (CET != 1.0f) {
            this.A00 /= CET;
            r2.BJ3(CET);
        }
    }

    public void A05(C38971sH r5, C38971sH r6, C38971sH r7, int i) {
        if (i != 0) {
            boolean z = false;
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
            if (z) {
                this.A01.CCz(r5, 1.0f);
                this.A01.CCz(r6, -1.0f);
                this.A01.CCz(r7, -1.0f);
                return;
            }
        }
        this.A01.CCz(r5, -1.0f);
        this.A01.CCz(r6, 1.0f);
        this.A01.CCz(r7, 1.0f);
    }

    public void A06(C38971sH r5, C38971sH r6, C38971sH r7, int i) {
        if (i != 0) {
            boolean z = false;
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
            if (z) {
                this.A01.CCz(r5, 1.0f);
                this.A01.CCz(r6, -1.0f);
                this.A01.CCz(r7, 1.0f);
                return;
            }
        }
        this.A01.CCz(r5, -1.0f);
        this.A01.CCz(r6, 1.0f);
        this.A01.CCz(r7, -1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            X.1sH r2 = r10.A02
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r2 != 0) goto L_0x00b9
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
        L_0x0013:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            float r1 = r10.A00
            r6 = 0
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r8 = 1
        L_0x0040:
            X.1sO r0 = r10.A01
            int r5 = r0.BQ2()
        L_0x0046:
            if (r6 >= r5) goto L_0x00c1
            X.1sO r0 = r10.A01
            X.1sH r1 = r0.BbG(r6)
            if (r1 == 0) goto L_0x008c
            float r4 = r0.BbH(r6)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            java.lang.String r3 = r1.toString()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 != 0) goto L_0x009b
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "- "
        L_0x006e:
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            float r4 = r4 * r2
        L_0x0076:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L_0x008f
            r0.<init>()
        L_0x0081:
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8 = 1
        L_0x008c:
            int r6 = r6 + 1
            goto L_0x0046
        L_0x008f:
            r0.<init>()
            r0.append(r7)
            r0.append(r4)
            java.lang.String r7 = " "
            goto L_0x0081
        L_0x009b:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 <= 0) goto L_0x00b1
            r1.append(r7)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            goto L_0x0076
        L_0x00b1:
            r1.append(r7)
            java.lang.String r0 = " - "
            goto L_0x006e
        L_0x00b7:
            r8 = 0
            goto L_0x0040
        L_0x00b9:
            r1.append(r0)
            r1.append(r2)
            goto L_0x0013
        L_0x00c1:
            if (r8 != 0) goto L_0x00d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
        L_0x00d4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38991sJ.toString():java.lang.String");
    }

    public C38991sJ(C39001sK r3) {
        this.A01 = new C39051sP(this, r3);
    }

    public C38991sJ() {
    }
}
