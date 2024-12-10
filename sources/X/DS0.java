package X;

public class DS0 implements Cloneable {
    public float A00;
    public Integer A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return r1 / r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00() {
        /*
            r3 = this;
            r2 = 1119879168(0x42c00000, float:96.0)
            java.lang.Integer r0 = r3.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x000e
            switch(r1) {
                case 3: goto L_0x0011;
                case 4: goto L_0x0015;
                case 5: goto L_0x001c;
                case 6: goto L_0x0023;
                case 7: goto L_0x0029;
                default: goto L_0x000e;
            }
        L_0x000e:
            float r0 = r3.A00
            return r0
        L_0x0011:
            float r1 = r3.A00
            float r1 = r1 * r2
            return r1
        L_0x0015:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1076006748(0x40228f5c, float:2.54)
            goto L_0x002e
        L_0x001c:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x002e
        L_0x0023:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x002e
        L_0x0029:
            float r1 = r3.A00
            float r1 = r1 * r2
            r0 = 1086324736(0x40c00000, float:6.0)
        L_0x002e:
            float r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DS0.A00():float");
    }

    public float A01(C26304CxN cxN) {
        float A002;
        if (this.A01 != AnonymousClass00R.A18) {
            return A02(cxN);
        }
        C25614Ciu ciu = cxN.A02;
        C25668Cjy cjy = ciu.A02;
        if (cjy == null && (cjy = ciu.A03) == null) {
            return this.A00;
        }
        float f = cjy.A03;
        float f2 = cjy.A00;
        if (f == f2) {
            A002 = this.A00 * f;
        } else {
            A002 = this.A00 * ((float) (BE9.A00(f, f2) / 1.414213562373095d));
        }
        return A002 / 100.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        return r2 * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return r2 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        return r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A02(X.C26304CxN r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x003e;
                case 2: goto L_0x0030;
                case 3: goto L_0x0049;
                case 4: goto L_0x0057;
                case 5: goto L_0x0027;
                case 6: goto L_0x001f;
                case 7: goto L_0x0017;
                case 8: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r0 = r3.A00
            return r0
        L_0x000c:
            X.Ciu r1 = r4.A02
            X.Cjy r0 = r1.A02
            if (r0 != 0) goto L_0x004f
            X.Cjy r0 = r1.A03
            if (r0 != 0) goto L_0x004f
            goto L_0x0009
        L_0x0017:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1086324736(0x40c00000, float:6.0)
            goto L_0x005f
        L_0x001f:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x005f
        L_0x0027:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x005f
        L_0x0030:
            float r2 = r3.A00
            X.Ciu r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            goto L_0x004d
        L_0x003e:
            float r2 = r3.A00
            X.Ciu r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            goto L_0x004d
        L_0x0049:
            float r2 = r3.A00
            r1 = 1119879168(0x42c00000, float:96.0)
        L_0x004d:
            float r2 = r2 * r1
            return r2
        L_0x004f:
            float r2 = r3.A00
            float r0 = r0.A03
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            goto L_0x005f
        L_0x0057:
            float r2 = r3.A00
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1076006748(0x40228f5c, float:2.54)
        L_0x005f:
            float r2 = r2 / r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DS0.A02(X.CxN):float");
    }

    public float A03(C26304CxN cxN) {
        if (this.A01 != AnonymousClass00R.A18) {
            return A02(cxN);
        }
        C25614Ciu ciu = cxN.A02;
        C25668Cjy cjy = ciu.A02;
        if (cjy == null && (cjy = ciu.A03) == null) {
            return this.A00;
        }
        return BE7.A01(this.A00, cjy.A00);
    }

    public float A04(C26304CxN cxN, float f) {
        if (this.A01 == AnonymousClass00R.A18) {
            return BE7.A01(this.A00, f);
        }
        return A02(cxN);
    }

    public DS0(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(String.valueOf(this.A00));
        switch (this.A01.intValue()) {
            case 1:
                str = "em";
                break;
            case 2:
                str = "ex";
                break;
            case 3:
                str = "in";
                break;
            case 4:
                str = "cm";
                break;
            case 5:
                str = "mm";
                break;
            case 6:
                str = "pt";
                break;
            case 7:
                str = "pc";
                break;
            case 8:
                str = "percent";
                break;
            default:
                str = "px";
                break;
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
