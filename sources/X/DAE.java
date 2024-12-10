package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class DAE implements E47 {
    public float A00 = 21.0f;
    public float A01 = 2.0f;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public E7P A07;
    public E43 A08;
    public E44 A09;
    public C28410E0b A0A;
    public E45 A0B;
    public C28411E0c A0C;
    public DA3 A0D;
    public BPQ A0E;
    public BPR A0F;
    public BPU A0G;
    public C26203CuZ A0H;
    public C26203CuZ A0I;
    public C26203CuZ A0J;
    public C26203CuZ A0K;
    public boolean A0L = false;
    public boolean A0M;
    public final int A0N;
    public final Context A0O;
    public final Matrix A0P = C108945cZ.A0J();
    public final BIS A0Q;
    public final C26152CtJ A0R;
    public final C65 A0S;
    public final C22796BPj A0T;
    public final C25678Ck9 A0U;
    public final ArrayList A0V = AnonymousClass000.A13();
    public final List A0W = AnonymousClass000.A13();
    public final float[] A0X = C108945cZ.A1V();

    public final float A00() {
        return 0.0f + (((float) (this.A0Q.A0F - this.A05)) / 2.0f);
    }

    public final void A09(CXL cxl) {
        A0A(cxl, (E7P) null, 0);
    }

    public final float A01() {
        int i = this.A06;
        return ((float) i) + (((float) ((this.A0Q.A0D - i) - this.A04)) / 2.0f);
    }

    public final D44 A02() {
        float[] fArr = this.A0X;
        BIS bis = this.A0Q;
        fArr[0] = bis.A04 - A00();
        fArr[1] = bis.A05 - A01();
        bis.A0f.mapVectors(fArr);
        double d = bis.A02;
        float f = fArr[0];
        float f2 = (float) bis.A0J;
        return new D44(new C20269AEc(C26152CtJ.A02(bis.A03 - ((double) (fArr[1] / f2))), ((d - ((double) (f / f2))) * 360.0d) - 180.0d), bis.getZoom(), 0.0f, bis.A0A);
    }

    public void A03() {
        List list = this.A0W;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DA3 da3 = (DA3) list.get(i);
            if (da3 instanceof BPS) {
                ((BPS) da3).A0A();
            }
        }
    }

    public void A04() {
        if (this.A09 != null || !this.A0V.isEmpty()) {
            D44 A022 = A02();
            E44 e44 = this.A09;
            if (e44 != null) {
                e44.BnN(A022);
            }
            ArrayList arrayList = this.A0V;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((E44) it.next()).BnN(A022);
                }
            }
        }
    }

    public final void A05() {
        Iterator it = this.A0W.iterator();
        while (it.hasNext()) {
            int i = ((DA3) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0Q.invalidate();
    }

    public final void A06() {
        C26203CuZ cuZ = this.A0I;
        if (cuZ != null) {
            cuZ.A03();
        }
        C26203CuZ cuZ2 = this.A0J;
        if (cuZ2 != null) {
            cuZ2.A03();
        }
        C26203CuZ cuZ3 = this.A0K;
        if (cuZ3 != null) {
            cuZ3.A03();
        }
        C26203CuZ cuZ4 = this.A0H;
        if (cuZ4 != null) {
            cuZ4.A03();
        }
    }

    public final void A07(int i, int i2, int i3) {
        BIS bis = this.A0Q;
        double d = bis.A02;
        long j = bis.A0J << 1;
        bis.A0D(d + ((double) (((long) ((0 - this.A05) - (-i2))) / j)), bis.A03 + ((double) (((long) ((this.A06 - this.A04) - (i - i3))) / j)));
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        bis.requestLayout();
        bis.invalidate();
    }

    public final void A08(CXL cxl) {
        A0A(cxl, (E7P) null, 1500);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.CXL r21, X.E7P r22, int r23) {
        /*
            r20 = this;
            r7 = r20
            X.BIS r6 = r7.A0Q
            boolean r0 = r6.A0Y
            if (r0 != 0) goto L_0x0109
            r3 = 1
            r12 = r23
            if (r23 == 0) goto L_0x0018
            X.BPj r0 = r7.A0T
            r2 = -1
            X.Cqg r1 = r0.A09
            int r0 = r1.A03
            if (r0 != r2) goto L_0x0018
            r1.A03 = r3
        L_0x0018:
            r7.A06()
            r7.A0L = r3
            float r14 = r7.A00()
            float r13 = r7.A01()
            float r2 = r6.getZoom()
            r7.A02 = r14
            r7.A03 = r13
            r4 = r21
            float r1 = r4.A01
            r5 = 0
            r19 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01a8
            r2 = r1
        L_0x0039:
            float r1 = r7.A01
            float r0 = r7.A00
            float r9 = X.BE8.A01(r0, r2, r1)
            double r0 = r6.A02
            double r2 = r6.A03
            X.AEc r8 = r4.A06
            r16 = 0
            if (r8 != 0) goto L_0x0053
            X.AEl r8 = r4.A07
            if (r8 == 0) goto L_0x009c
            X.AEc r8 = r8.A00()
        L_0x0053:
            double r0 = r8.A01
            double r0 = X.C26152CtJ.A01(r0)
            double r2 = r8.A00
            double r2 = X.C26152CtJ.A00(r2)
            float[] r15 = r7.A0X
            float r8 = r6.A04
            float r8 = r8 - r14
            r15[r5] = r8
            float r11 = r6.A05
            float r11 = r11 - r13
            r10 = 1
            r15[r10] = r11
            r8 = r15[r5]
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 != 0) goto L_0x0076
            int r8 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r8 == 0) goto L_0x009c
        L_0x0076:
            int r8 = (int) r9
            int r10 = r10 << r8
            int r8 = r7.A0N
            int r10 = r10 * r8
            r11 = 1065353216(0x3f800000, float:1.0)
            float r8 = r9 % r11
            float r8 = r8 + r11
            android.graphics.Matrix r11 = r7.A0P
            r11.setScale(r8, r8)
            float r8 = r6.A0A
            r11.postRotate(r8)
            r11.invert(r11)
            r11.mapVectors(r15)
            r5 = r15[r5]
            float r8 = (float) r10
            float r5 = r5 / r8
            double r10 = (double) r5
            double r0 = r0 + r10
            r5 = 1
            r5 = r15[r5]
            float r5 = r5 / r8
            double r10 = (double) r5
            double r2 = r2 + r10
        L_0x009c:
            float r8 = r6.A0A
            float r10 = r4.A00
            int r4 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x00b1
            r11 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r11
            float r4 = r8 - r10
            r5 = 1127481344(0x43340000, float:180.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x019b
            float r8 = r11 + r10
        L_0x00b1:
            double r4 = X.BIS.A00(r0)
            int r0 = (int) r9
            r1 = 1
            int r1 = r1 << r0
            int r0 = r7.A0N
            int r1 = r1 * r0
            long r0 = (long) r1
            double r2 = r6.A0B(r2, r0)
            r10 = r22
            if (r23 > 0) goto L_0x010a
            float r0 = r6.getZoom()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d3
            float r1 = r7.A02
            float r0 = r7.A03
            r6.A0I(r9, r1, r0)
        L_0x00d3:
            double r0 = r6.A02
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x00df
            double r0 = r6.A03
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e2
        L_0x00df:
            r6.A0D(r4, r2)
        L_0x00e2:
            float r0 = r6.A0A
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00eb
            r6.A0E(r8, r14, r13)
        L_0x00eb:
            r6.invalidate()
            r7.A04()
        L_0x00f1:
            X.CuZ r0 = r7.A0I
            if (r0 != 0) goto L_0x0109
            X.CuZ r0 = r7.A0J
            if (r0 != 0) goto L_0x0109
            X.CuZ r0 = r7.A0K
            if (r0 != 0) goto L_0x0109
            X.CuZ r0 = r7.A0H
            if (r0 != 0) goto L_0x0109
            if (r22 == 0) goto L_0x0109
            r0 = 0
            r7.A07 = r0
            r10.Buc()
        L_0x0109:
            return
        L_0x010a:
            r7.A07 = r10
            float r1 = r6.getZoom()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0124
            X.CuZ r9 = X.C26203CuZ.A00(r1, r9)
            r7.A0K = r9
            r9.A07(r7)
            r9.A08(r7)
            long r0 = (long) r12
            r9.A06(r0)
        L_0x0124:
            double r0 = r6.A02
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0147
            double r17 = r4 - r0
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0193
            double r4 = r4 - r15
        L_0x0135:
            float r9 = (float) r0
            float r0 = (float) r4
            X.CuZ r4 = X.C26203CuZ.A00(r9, r0)
            r7.A0I = r4
            r4.A07(r7)
            r4.A08(r7)
            long r0 = (long) r12
            r4.A06(r0)
        L_0x0147:
            double r0 = r6.A03
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x015f
            float r4 = (float) r0
            float r0 = (float) r2
            X.CuZ r2 = X.C26203CuZ.A00(r4, r0)
            r7.A0J = r2
            r2.A07(r7)
            r2.A08(r7)
            long r0 = (long) r12
            r2.A06(r0)
        L_0x015f:
            float r1 = r6.A0A
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0175
            X.CuZ r2 = X.C26203CuZ.A00(r1, r8)
            r7.A0H = r2
            r2.A07(r7)
            r2.A08(r7)
            long r0 = (long) r12
            r2.A06(r0)
        L_0x0175:
            X.CuZ r0 = r7.A0I
            if (r0 == 0) goto L_0x017c
            r0.A05()
        L_0x017c:
            X.CuZ r0 = r7.A0J
            if (r0 == 0) goto L_0x0183
            r0.A05()
        L_0x0183:
            X.CuZ r0 = r7.A0K
            if (r0 == 0) goto L_0x018a
            r0.A05()
        L_0x018a:
            X.CuZ r0 = r7.A0H
            if (r0 == 0) goto L_0x00f1
            r0.A05()
            goto L_0x00f1
        L_0x0193:
            r13 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x0135
            double r4 = r4 + r15
            goto L_0x0135
        L_0x019b:
            float r4 = r10 - r8
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a5
            float r8 = r10 - r11
            goto L_0x00b1
        L_0x01a5:
            r8 = r10
            goto L_0x00b1
        L_0x01a8:
            float r1 = r4.A02
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            float r2 = r2 + r1
            float r1 = r4.A03
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01bb
            float r0 = r4.A04
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
        L_0x01bb:
            r7.A02 = r1
            float r0 = r4.A04
            r7.A03 = r0
            goto L_0x0039
        L_0x01c3:
            X.AEl r10 = r4.A07
            if (r10 == 0) goto L_0x0039
            int r3 = r6.A0F
            int r0 = r7.A05
            int r3 = r3 - r0
            int r2 = r6.A0D
            int r0 = r7.A06
            int r2 = r2 - r0
            int r0 = r7.A04
            int r2 = r2 - r0
            if (r3 != 0) goto L_0x01df
            if (r2 != 0) goto L_0x01df
            java.lang.String r0 = "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x01df:
            int r0 = r4.A05
            int r1 = r0 * 2
            int r0 = r3 + r1
            if (r0 <= r3) goto L_0x01e8
            int r3 = r3 - r1
        L_0x01e8:
            int r0 = r2 + r1
            if (r0 <= r2) goto L_0x01ed
            int r2 = r2 - r1
        L_0x01ed:
            int r9 = java.lang.Math.max(r5, r3)
            int r11 = java.lang.Math.max(r5, r2)
            X.AEc r8 = r10.A00
            double r0 = r8.A01
            double r2 = X.C26152CtJ.A01(r0)
            X.AEc r10 = r10.A01
            double r0 = r10.A01
            double r0 = X.C26152CtJ.A01(r0)
            double r17 = X.BE6.A01(r2, r0)
            double r0 = r10.A00
            double r2 = X.C26152CtJ.A00(r0)
            double r0 = r8.A00
            double r0 = X.C26152CtJ.A00(r0)
            double r15 = X.BE6.A01(r2, r0)
            double r0 = (double) r9
            double r0 = r0 / r17
            int r2 = r7.A0N
            double r2 = (double) r2
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r9 = X.BIS.A0n
            double r0 = r0 / r9
            float r8 = (float) r0
            double r0 = (double) r11
            double r0 = r0 / r15
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r9
            float r2 = (float) r0
            float r2 = java.lang.Math.min(r8, r2)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAE.A0A(X.CXL, X.E7P, int):void");
    }

    public final void A0B(DA3 da3) {
        List list = this.A0W;
        int binarySearch = Collections.binarySearch(list, da3, DA3.A0E);
        if (binarySearch <= 0) {
            list.add(-1 - binarySearch, da3);
            da3.A04();
            this.A0Q.invalidate();
        }
    }

    public final void A0C(DA3 da3) {
        this.A0W.remove(da3);
        this.A0Q.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C19740yt.A01(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(boolean r3) {
        /*
            r2 = this;
            android.content.Context r1 = r2.A0O
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = X.C19740yt.A01(r1, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = X.C19740yt.A01(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A0M = r0
            r3 = r3 & r0
            X.Ck9 r0 = r2.A0U
            r0.A01(r3)
            if (r3 == 0) goto L_0x003d
            X.BPU r0 = r2.A0G
            if (r0 != 0) goto L_0x0037
            X.BPU r0 = new X.BPU
            r0.<init>(r2)
            r2.A0G = r0
            r2.A0B(r0)
            X.BPU r0 = r2.A0G
            X.CuZ r1 = r0.A04
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0037
            r1.A05()
        L_0x0037:
            X.C65 r0 = r2.A0S
            r0.A00()
            return
        L_0x003d:
            X.BPU r1 = r2.A0G
            if (r1 == 0) goto L_0x0037
            X.CuZ r0 = r1.A04
            r0.A03()
            r1.A03()
            X.BPU r0 = r2.A0G
            r2.A0C(r0)
            r0 = 0
            r2.A0G = r0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAE.A0D(boolean):void");
    }

    public void BlR(C26203CuZ cuZ) {
        BIS bis;
        double d;
        double d2;
        C26203CuZ cuZ2 = this.A0I;
        if (cuZ == cuZ2) {
            bis = this.A0Q;
            d = (double) cuZ2.A00;
            d2 = bis.A03;
        } else {
            C26203CuZ cuZ3 = this.A0J;
            if (cuZ == cuZ3) {
                bis = this.A0Q;
                d = bis.A02;
                d2 = (double) cuZ3.A00;
            } else {
                if (cuZ == this.A0K) {
                    bis = this.A0Q;
                    if (bis.A0I(cuZ.A00, this.A02, this.A03)) {
                        bis.A0M.A04();
                    }
                } else if (cuZ == this.A0H) {
                    bis = this.A0Q;
                    bis.A0E(cuZ.A00, A00(), A01());
                } else {
                    return;
                }
                bis.invalidate();
            }
        }
        bis.A0D(d, d2);
        bis.invalidate();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.C65, java.lang.Object] */
    public DAE(C25007CTh cTh, BIS bis) {
        PorterDuffColorFilter porterDuffColorFilter;
        String str;
        this.A0Q = bis;
        Context applicationContext = bis.getContext().getApplicationContext();
        this.A0O = applicationContext;
        this.A0R = new C26152CtJ(this);
        ? obj = new Object();
        obj.A01 = true;
        obj.A00 = this;
        this.A0S = obj;
        C8A.A00(applicationContext);
        int i = C108965cb.A08(applicationContext).densityDpi >= 320 ? 512 : 256;
        this.A0N = i;
        C22796BPj bPj = new C22796BPj(this, new BPX(applicationContext, cTh, i));
        A0B(bPj);
        this.A0T = bPj;
        C25678Ck9 ck9 = new C25678Ck9(bis.getContext());
        this.A0U = ck9;
        CJ8 cj8 = new CJ8(this);
        ck9.A01 = cj8;
        if (ck9.A00 != null && ck9.A03) {
            cj8.A00.A0Q.invalidate();
        }
        if (cTh != null) {
            boolean z = cTh.A05;
            DAE dae = obj.A00;
            BPQ bpq = dae.A0E;
            if (z) {
                if (bpq == null) {
                    BPQ bpq2 = new BPQ(dae);
                    dae.A0E = bpq2;
                    dae.A0B(bpq2);
                }
            } else if (bpq != null) {
                dae.A0C(bpq);
                dae.A0E = null;
            }
            obj.A02 = cTh.A07;
            obj.A03 = cTh.A08;
            this.A00 = Math.min(Math.max(21.0f, 2.0f), 21.0f);
            this.A01 = Math.min(Math.max(2.0f, 2.0f), 21.0f);
            int i2 = cTh.A00;
            if (i2 != bPj.A00) {
                bPj.A00 = i2;
                if (!bPj.A04) {
                    bPj.A05(true);
                }
                BPX bpx = bPj.A03;
                switch (i2) {
                    case 5:
                        str = "live_maps";
                        break;
                    case 6:
                        str = "crowdsourcing_osm";
                        break;
                    case 7:
                        str = "indoor_osm";
                        break;
                    case 8:
                        if (!bpx.A03.A06) {
                            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                            break;
                        } else {
                            str = "whatsapp_dark";
                            break;
                        }
                    default:
                        if (!bpx.A03.A06) {
                            str = null;
                            break;
                        } else {
                            str = "dark";
                            break;
                        }
                }
                bpx.A01 = str;
                DAE dae2 = bPj.A07;
                dae2.A03();
                dae2.A0Q.invalidate();
            }
            boolean z2 = cTh.A06;
            Paint paint = bPj.A02;
            if (z2) {
                porterDuffColorFilter = C22796BPj.A05;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-526345, PorterDuff.Mode.SRC_ATOP);
                    C22796BPj.A05 = porterDuffColorFilter;
                }
            } else {
                porterDuffColorFilter = null;
            }
            paint.setColorFilter(porterDuffColorFilter);
        }
    }
}
