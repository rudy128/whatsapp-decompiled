package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BE8;
import X.BM8;
import X.BMI;
import X.C17890vO;
import X.C21466AkX;
import X.C25282Ccf;
import X.C25476CgV;
import X.C25843Cmx;
import X.C26228CvK;
import X.C37931qQ;
import X.C38001qX;
import X.C38021qZ;
import X.C38191qq;
import X.C38251qy;
import X.C38261qz;
import X.C38331r7;
import X.C38491rN;
import X.C62712rq;
import X.CX8;
import X.CXO;
import X.D3U;
import X.D3V;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends C38251qy implements C38261qz {
    public int A00;
    public int A01 = 2;
    public int A02;
    public int A03 = -1;
    public int A04 = Integer.MIN_VALUE;
    public int A05;
    public int A06 = -1;
    public C38331r7 A07;
    public C38331r7 A08;
    public C25843Cmx A09 = new Object();
    public D3U A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = true;
    public C25282Ccf[] A0G;
    public BitSet A0H;
    public boolean A0I = false;
    public int[] A0J;
    public final Rect A0K = AnonymousClass3MW.A07();
    public final CXO A0L;
    public final CX8 A0M = new CX8(this);
    public final Runnable A0N = new C21466AkX((Object) this, 15);

    private int A09(C38021qZ r9) {
        if (A0J() == 0) {
            return 0;
        }
        C38331r7 r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C62712rq.A02(A1S(z2), A1R(z2), r3, this, r9, z, this.A0E);
    }

    public int A0o(C38021qZ r8) {
        if (A0J() == 0) {
            return 0;
        }
        C38331r7 r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C62712rq.A00(A1S(z2), A1R(z2), r3, this, r8, z);
    }

    public int A0q(C38021qZ r8) {
        if (A0J() == 0) {
            return 0;
        }
        C38331r7 r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C62712rq.A01(A1S(z2), A1R(z2), r3, this, r8, z);
    }

    public int A0r(C38021qZ r8) {
        if (A0J() == 0) {
            return 0;
        }
        C38331r7 r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C62712rq.A00(A1S(z2), A1R(z2), r3, this, r8, z);
    }

    public int A0t(C38021qZ r8) {
        if (A0J() == 0) {
            return 0;
        }
        C38331r7 r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return C62712rq.A01(A1S(z2), A1R(z2), r3, this, r8, z);
    }

    public void A14(int i, int i2) {
        A0C(i, i2, 1);
    }

    public void A16(int i, int i2) {
        A0C(i, i2, 2);
    }

    public void A17(int i, int i2) {
        A0C(i, i2, 4);
    }

    public void A1D(C37931qQ r2, C38021qZ r3) {
        A0F(r2, r3, true);
    }

    public void A1F(C38021qZ r2) {
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A0A = null;
        this.A0M.A00();
    }

    public void A1T(int i) {
        A1H((String) null);
        if (i != this.A06) {
            C25843Cmx cmx = this.A09;
            int[] iArr = cmx.A01;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            cmx.A00 = null;
            A0Q();
            this.A06 = i;
            this.A0H = new BitSet(i);
            C25282Ccf[] ccfArr = new C25282Ccf[i];
            this.A0G = ccfArr;
            for (int i2 = 0; i2 < i; i2++) {
                ccfArr[i2] = new C25282Ccf(this, i2);
            }
            A0Q();
        }
    }

    public void A1U(C38021qZ r5, int i) {
        int A1N;
        int i2;
        if (i > 0) {
            A1N = A1O();
            i2 = 1;
        } else {
            A1N = A1N();
            i2 = -1;
        }
        CXO cxo = this.A0L;
        cxo.A07 = true;
        A0G(r5, A1N);
        A0B(i2);
        cxo.A01 = A1N + cxo.A03;
        cxo.A00 = Math.abs(i);
    }

    private int A06(int i) {
        int A022 = this.A0G[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A023 = this.A0G[i2].A02(i);
            if (A023 > A022) {
                A022 = A023;
            }
        }
        return A022;
    }

    private int A07(int i) {
        int A032 = this.A0G[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A033 = this.A0G[i2].A03(i);
            if (A033 < A032) {
                A032 = A033;
            }
        }
        return A032;
    }

    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r14v8, types: [java.lang.Object, X.D3V] */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.lang.Object, X.D3V] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x01ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A08(X.CXO r24, X.C37931qQ r25, X.C38021qZ r26) {
        /*
            r23 = this;
            r9 = r23
            java.util.BitSet r1 = r9.A0H
            int r0 = r9.A06
            r12 = 0
            r8 = 1
            r1.set(r12, r0, r8)
            X.CXO r7 = r9.A0L
            boolean r0 = r7.A06
            r10 = r24
            int r3 = r10.A04
            if (r0 == 0) goto L_0x0035
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r8) goto L_0x001c
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            r2 = 0
        L_0x001d:
            int r0 = r9.A06
            if (r2 >= r0) goto L_0x0043
            X.Ccf[] r1 = r9.A0G
            r0 = r1[r2]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            r0 = r1[r2]
            r9.A0H(r0, r3, r6)
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0035:
            if (r3 != r8) goto L_0x003d
            int r6 = r10.A02
            int r0 = r10.A00
            int r6 = r6 + r0
            goto L_0x001c
        L_0x003d:
            int r6 = r10.A05
            int r0 = r10.A00
            int r6 = r6 - r0
            goto L_0x001c
        L_0x0043:
            boolean r1 = r9.A0E
            X.1r7 r0 = r9.A07
            r21 = r0
            if (r1 == 0) goto L_0x0350
            int r20 = r21.A02()
        L_0x004f:
            r2 = 0
        L_0x0050:
            int r1 = r10.A01
            r22 = r25
            if (r1 < 0) goto L_0x0356
            int r0 = r26.A00()
            if (r1 >= r0) goto L_0x0356
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0068
            java.util.BitSet r0 = r9.A0H
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0356
        L_0x0068:
            int r1 = r10.A01
            r0 = r22
            android.view.View r5 = r0.A02(r1)
            int r1 = r10.A01
            int r0 = r10.A03
            int r1 = r1 + r0
            r10.A01 = r1
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            X.BM8 r4 = (X.BM8) r4
            int r3 = r4.A00()
            X.Cmx r2 = r9.A09
            int[] r1 = r2.A01
            if (r1 == 0) goto L_0x02e9
            int r0 = r1.length
            if (r3 >= r0) goto L_0x02e9
            r1 = r1[r3]
            r0 = -1
            if (r1 == r0) goto L_0x02e9
            r19 = 0
            X.Ccf[] r0 = r9.A0G
            r1 = r0[r1]
        L_0x0095:
            r4.A00 = r1
            int r0 = r10.A04
            if (r0 != r8) goto L_0x02e4
            r0 = -1
            X.C38251qy.A04(r5, r9, r0, r12)
        L_0x009f:
            boolean r11 = r4.A01
            int r0 = r9.A02
            r18 = r0
            if (r11 == 0) goto L_0x02b7
            if (r0 != r8) goto L_0x029d
            int r14 = r9.A00
        L_0x00ab:
            int r13 = r9.A00
            int r12 = r9.A01
            int r11 = r9.A0O()
            int r0 = r9.A0L()
            int r11 = r11 + r0
            int r0 = r4.height
            int r0 = X.C38251qy.A01(r13, r12, r11, r0, r8)
        L_0x00be:
            r9.A0D(r5, r14, r0)
        L_0x00c1:
            int r11 = r10.A04
            boolean r0 = r4.A01
            if (r11 != r8) goto L_0x0109
            if (r0 == 0) goto L_0x0102
            r0 = r20
            int r12 = r9.A06(r0)
        L_0x00cf:
            r0 = r21
            int r11 = r0.A07(r5)
            int r11 = r11 + r12
            if (r19 == 0) goto L_0x017d
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x017d
            X.D3V r14 = new X.D3V
            r14.<init>()
            int r0 = r9.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r13 = 0
        L_0x00e8:
            int r0 = r9.A06
            if (r13 >= r0) goto L_0x00fe
            int[] r0 = r14.A03
            r15 = r0
            X.Ccf[] r0 = r9.A0G
            r0 = r0[r13]
            int r0 = r0.A02(r12)
            int r0 = r12 - r0
            r15[r13] = r0
            int r13 = r13 + 1
            goto L_0x00e8
        L_0x00fe:
            r0 = -1
            r14.A00 = r0
            goto L_0x0149
        L_0x0102:
            r0 = r20
            int r12 = r1.A02(r0)
            goto L_0x00cf
        L_0x0109:
            if (r0 == 0) goto L_0x0140
            r0 = r20
            int r11 = r9.A07(r0)
        L_0x0111:
            r0 = r21
            int r0 = r0.A07(r5)
            int r12 = r11 - r0
            if (r19 == 0) goto L_0x017d
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x017d
            X.D3V r14 = new X.D3V
            r14.<init>()
            int r0 = r9.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r13 = 0
        L_0x012b:
            int r0 = r9.A06
            if (r13 >= r0) goto L_0x0147
            int[] r0 = r14.A03
            r15 = r0
            X.Ccf[] r0 = r9.A0G
            r0 = r0[r13]
            int r0 = r0.A03(r11)
            int r0 = r0 - r11
            r15[r13] = r0
            int r13 = r13 + 1
            goto L_0x012b
        L_0x0140:
            r0 = r20
            int r11 = r1.A03(r0)
            goto L_0x0111
        L_0x0147:
            r14.A00 = r8
        L_0x0149:
            r14.A01 = r3
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x0155
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A00 = r0
        L_0x0155:
            int r17 = r0.size()
            r13 = 0
        L_0x015a:
            r0 = r17
            if (r13 >= r0) goto L_0x01ae
            X.D3V r16 = X.C25843Cmx.A00(r2, r13)
            r0 = r16
            int r0 = r0.A01
            r15 = r0
            int r0 = r14.A01
            if (r15 != r0) goto L_0x0170
            java.util.List r0 = r2.A00
            r0.remove(r13)
        L_0x0170:
            r0 = r16
            int r0 = r0.A01
            int r15 = r14.A01
            if (r0 < r15) goto L_0x01ab
            java.util.List r0 = r2.A00
            r0.add(r13, r14)
        L_0x017d:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x01d6
            int r13 = r10.A03
            r0 = -1
            if (r13 != r0) goto L_0x01d6
            if (r19 != 0) goto L_0x01d4
            int r13 = r10.A04
            X.Ccf[] r14 = r9.A0G
            r0 = 0
            r0 = r14[r0]
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 != r8) goto L_0x01b4
            int r16 = r0.A02(r14)
            r15 = 1
        L_0x0198:
            int r0 = r9.A06
            if (r15 >= r0) goto L_0x01d6
            X.Ccf[] r0 = r9.A0G
            r0 = r0[r15]
            int r13 = r0.A02(r14)
            r0 = r16
            if (r13 != r0) goto L_0x01cc
            int r15 = r15 + 1
            goto L_0x0198
        L_0x01ab:
            int r13 = r13 + 1
            goto L_0x015a
        L_0x01ae:
            java.util.List r0 = r2.A00
            r0.add(r14)
            goto L_0x017d
        L_0x01b4:
            int r16 = r0.A03(r14)
            r15 = 1
        L_0x01b9:
            int r0 = r9.A06
            if (r15 >= r0) goto L_0x01d6
            X.Ccf[] r0 = r9.A0G
            r0 = r0[r15]
            int r13 = r0.A03(r14)
            r0 = r16
            if (r13 != r0) goto L_0x01cc
            int r15 = r15 + 1
            goto L_0x01b9
        L_0x01cc:
            X.D3V r0 = r2.A01(r3)
            if (r0 == 0) goto L_0x01d4
            r0.A02 = r8
        L_0x01d4:
            r9.A0I = r8
        L_0x01d6:
            int r2 = r10.A04
            boolean r0 = r4.A01
            if (r2 != r8) goto L_0x01f2
            if (r0 == 0) goto L_0x01ec
            int r2 = r9.A06
        L_0x01e0:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0207
            X.Ccf[] r0 = r9.A0G
            r0 = r0[r2]
            r0.A0B(r5)
            goto L_0x01e0
        L_0x01ec:
            X.Ccf r0 = r4.A00
            r0.A0B(r5)
            goto L_0x0207
        L_0x01f2:
            if (r0 == 0) goto L_0x0202
            int r2 = r9.A06
        L_0x01f6:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0207
            X.Ccf[] r0 = r9.A0G
            r0 = r0[r2]
            r0.A0C(r5)
            goto L_0x01f6
        L_0x0202:
            X.Ccf r0 = r4.A00
            r0.A0C(r5)
        L_0x0207:
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x0253
            r0 = r18
            if (r0 != r8) goto L_0x0253
            boolean r0 = r4.A01
            X.1r7 r13 = r9.A08
            int r3 = r13.A02()
            if (r0 != 0) goto L_0x022b
            int r2 = r9.A06
            int r2 = r2 - r8
            int r0 = r1.A04
            int r2 = r2 - r0
            int r0 = r9.A05
            int r2 = r2 * r0
            int r3 = r3 - r2
        L_0x022b:
            int r0 = r13.A07(r5)
            int r2 = r3 - r0
        L_0x0231:
            X.C38251qy.A03(r5, r2, r12, r3, r11)
        L_0x0234:
            boolean r0 = r4.A01
            int r11 = r7.A04
            if (r0 == 0) goto L_0x0277
            r3 = 0
        L_0x023b:
            int r0 = r9.A06
            if (r3 >= r0) goto L_0x027a
            X.Ccf[] r2 = r9.A0G
            r0 = r2[r3]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0250
            r0 = r2[r3]
            r9.A0H(r0, r11, r6)
        L_0x0250:
            int r3 = r3 + 1
            goto L_0x023b
        L_0x0253:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x026a
            X.1r7 r3 = r9.A08
            int r2 = r3.A04()
        L_0x025d:
            int r3 = r3.A07(r5)
            int r3 = r3 + r2
            r0 = r18
            if (r0 == r8) goto L_0x0231
            X.C38251qy.A03(r5, r12, r2, r11, r3)
            goto L_0x0234
        L_0x026a:
            int r2 = r1.A04
            int r0 = r9.A05
            int r2 = r2 * r0
            X.1r7 r3 = r9.A08
            int r0 = r3.A04()
            int r2 = r2 + r0
            goto L_0x025d
        L_0x0277:
            r9.A0H(r1, r11, r6)
        L_0x027a:
            r0 = r22
            r9.A0E(r7, r0)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0292
            boolean r0 = r5.hasFocusable()
            if (r0 == 0) goto L_0x0292
            boolean r0 = r4.A01
            java.util.BitSet r2 = r9.A0H
            if (r0 == 0) goto L_0x0296
            r2.clear()
        L_0x0292:
            r2 = 1
            r12 = 0
            goto L_0x0050
        L_0x0296:
            int r1 = r1.A04
            r0 = 0
            r2.set(r1, r0)
            goto L_0x0292
        L_0x029d:
            int r13 = r9.A03
            int r12 = r9.A04
            int r11 = r9.A0M()
            int r0 = r9.A0N()
            int r11 = r11 + r0
            int r0 = r4.width
            int r11 = X.C38251qy.A01(r13, r12, r11, r0, r8)
            int r0 = r9.A00
            r9.A0D(r5, r11, r0)
            goto L_0x00c1
        L_0x02b7:
            if (r0 != r8) goto L_0x02c5
            int r13 = r9.A05
            int r11 = r9.A04
            int r0 = r4.width
            int r14 = X.C38251qy.A01(r13, r11, r12, r0, r12)
            goto L_0x00ab
        L_0x02c5:
            int r14 = r9.A03
            int r13 = r9.A04
            int r11 = r9.A0M()
            int r0 = r9.A0N()
            int r11 = r11 + r0
            int r0 = r4.width
            int r14 = X.C38251qy.A01(r14, r13, r11, r0, r8)
            int r13 = r9.A05
            int r11 = r9.A01
            int r0 = r4.height
            int r0 = X.C38251qy.A01(r13, r11, r12, r0, r12)
            goto L_0x00be
        L_0x02e4:
            X.C38251qy.A04(r5, r9, r12, r12)
            goto L_0x009f
        L_0x02e9:
            r19 = 1
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x02fe
            X.Ccf[] r0 = r9.A0G
            r1 = r0[r12]
        L_0x02f3:
            r2.A02(r3)
            int[] r11 = r2.A01
            int r0 = r1.A04
            r11[r3] = r0
            goto L_0x0095
        L_0x02fe:
            int r0 = r10.A04
            boolean r0 = r9.A0I(r0)
            if (r0 == 0) goto L_0x032e
            int r13 = r9.A06
            int r13 = r13 - r8
            r11 = -1
            r18 = -1
        L_0x030c:
            int r0 = r10.A04
            r1 = 0
            if (r0 != r8) goto L_0x0334
            int r17 = r21.A04()
            r16 = 2147483647(0x7fffffff, float:NaN)
        L_0x0318:
            if (r13 == r11) goto L_0x02f3
            X.Ccf[] r0 = r9.A0G
            r14 = r0[r13]
            r0 = r17
            int r15 = r14.A02(r0)
            r0 = r16
            if (r15 >= r0) goto L_0x032b
            r1 = r14
            r16 = r15
        L_0x032b:
            int r13 = r13 + r18
            goto L_0x0318
        L_0x032e:
            int r11 = r9.A06
            r13 = 0
            r18 = 1
            goto L_0x030c
        L_0x0334:
            int r17 = r21.A02()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x033a:
            if (r13 == r11) goto L_0x02f3
            X.Ccf[] r0 = r9.A0G
            r14 = r0[r13]
            r0 = r17
            int r15 = r14.A03(r0)
            r0 = r16
            if (r15 <= r0) goto L_0x034d
            r1 = r14
            r16 = r15
        L_0x034d:
            int r13 = r13 + r18
            goto L_0x033a
        L_0x0350:
            int r20 = r21.A04()
            goto L_0x004f
        L_0x0356:
            if (r2 != 0) goto L_0x035d
            r0 = r22
            r9.A0E(r7, r0)
        L_0x035d:
            int r1 = r7.A04
            r0 = -1
            if (r1 != r0) goto L_0x0378
            int r0 = r21.A04()
            int r0 = r9.A07(r0)
            int r1 = r21.A04()
        L_0x036e:
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0377
            int r0 = r10.A00
            int r12 = java.lang.Math.min(r0, r1)
        L_0x0377:
            return r12
        L_0x0378:
            int r0 = r21.A02()
            int r1 = r9.A06(r0)
            int r0 = r21.A02()
            goto L_0x036e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A08(X.CXO, X.1qQ, X.1qZ):int");
    }

    private void A0A() {
        boolean z;
        if (this.A02 == 1 || !C17890vO.A1R(this.A07.getLayoutDirection())) {
            z = this.A0D;
        } else {
            z = !this.A0D;
        }
        this.A0E = z;
    }

    private void A0B(int i) {
        CXO cxo = this.A0L;
        cxo.A04 = i;
        int i2 = 1;
        if (this.A0E != AnonymousClass000.A1T(i, -1)) {
            i2 = -1;
        }
        cxo.A03 = i2;
    }

    private void A0C(int i, int i2, int i3) {
        int A1N;
        int i4;
        int i5;
        int A1O;
        if (this.A0E) {
            A1N = A1O();
        } else {
            A1N = A1N();
        }
        if (i3 == 8) {
            i4 = i2 + 1;
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
            }
            i5 = i;
        } else {
            i4 = i + i2;
            i5 = i;
        }
        C25843Cmx cmx = this.A09;
        cmx.A04(i5);
        if (i3 == 1) {
            cmx.A05(i, i2);
        } else if (i3 == 2) {
            cmx.A06(i, i2);
        } else if (i3 == 8) {
            cmx.A06(i, 1);
            cmx.A05(i2, 1);
        }
        if (i4 > A1N) {
            if (this.A0E) {
                A1O = A1N();
            } else {
                A1O = A1O();
            }
            if (i5 <= A1O) {
                A0Q();
            }
        }
    }

    private void A0D(View view, int i, int i2) {
        int mode;
        int mode2;
        Rect rect = this.A0K;
        A0X(view, rect);
        C38491rN r2 = (C38491rN) view.getLayoutParams();
        int i3 = r2.leftMargin + rect.left;
        int i4 = r2.rightMargin + rect.right;
        if (!(i3 == 0 && i4 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) {
            i = View.MeasureSpec.makeMeasureSpec(BE8.A04(View.MeasureSpec.getSize(i) - i3, i4), mode);
        }
        int i5 = r2.topMargin + rect.top;
        int i6 = r2.bottomMargin + rect.bottom;
        if (!(i5 == 0 && i6 == 0) && ((mode2 = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode2 == 1073741824)) {
            i2 = View.MeasureSpec.makeMeasureSpec(BE8.A04(View.MeasureSpec.getSize(i2) - i5, i6), mode2);
        }
        if (A0h(view, r2, i, i2)) {
            view.measure(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == -1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0E(X.CXO r8, X.C37931qQ r9) {
        /*
            r7 = this;
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0129
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x0129
            int r2 = r8.A00
            r1 = -1
            int r0 = r8.A04
            if (r2 != 0) goto L_0x0072
            if (r0 != r1) goto L_0x0126
        L_0x0011:
            int r1 = r8.A02
        L_0x0013:
            int r4 = r7.A0J()
            r3 = 1
            int r4 = r4 - r3
        L_0x0019:
            if (r4 < 0) goto L_0x0129
            android.view.View r2 = r7.A0P(r4)
            X.1r7 r5 = r7.A07
            int r0 = r5.A09(r2)
            if (r0 < r1) goto L_0x0129
            int r0 = r5.A0B(r2)
            if (r0 < r1) goto L_0x0129
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            X.BM8 r5 = (X.BM8) r5
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x005a
            r6 = 0
            r5 = 0
        L_0x0039:
            int r0 = r7.A06
            if (r5 >= r0) goto L_0x004c
            X.Ccf[] r0 = r7.A0G
            r0 = r0[r5]
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            int r5 = r5 + 1
            goto L_0x0039
        L_0x004c:
            int r0 = r7.A06
            if (r6 >= r0) goto L_0x0069
            X.Ccf[] r0 = r7.A0G
            r0 = r0[r6]
            r0.A09()
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005a:
            X.Ccf r0 = r5.A00
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            X.Ccf r0 = r5.A00
            r0.A09()
        L_0x0069:
            r7.A0V(r2)
            r9.A07(r2)
            int r4 = r4 + -1
            goto L_0x0019
        L_0x0072:
            if (r0 != r1) goto L_0x00a0
            int r3 = r8.A05
            X.Ccf[] r1 = r7.A0G
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A03(r3)
            r1 = 1
        L_0x0080:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x0092
            X.Ccf[] r0 = r7.A0G
            r0 = r0[r1]
            int r0 = r0.A03(r3)
            if (r0 <= r2) goto L_0x008f
            r2 = r0
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0080
        L_0x0092:
            int r3 = r3 - r2
            if (r3 < 0) goto L_0x0011
            int r1 = r8.A02
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r3, r0)
            int r1 = r1 - r0
            goto L_0x0013
        L_0x00a0:
            int r3 = r8.A02
            X.Ccf[] r1 = r7.A0G
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A02(r3)
            r1 = 1
        L_0x00ac:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x00be
            X.Ccf[] r0 = r7.A0G
            r0 = r0[r1]
            int r0 = r0.A02(r3)
            if (r0 >= r2) goto L_0x00bb
            r2 = r0
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00be:
            int r0 = r8.A02
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0126
            int r1 = r8.A05
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 + r1
        L_0x00cc:
            int r1 = r7.A0J()
            if (r1 <= 0) goto L_0x0129
            r5 = 0
            android.view.View r3 = r7.A0P(r5)
            X.1r7 r2 = r7.A07
            int r1 = r2.A06(r3)
            if (r1 > r0) goto L_0x0129
            int r1 = r2.A0A(r3)
            if (r1 > r0) goto L_0x0129
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.BM8 r2 = (X.BM8) r2
            boolean r1 = r2.A01
            r4 = 1
            if (r1 == 0) goto L_0x0112
            r2 = 0
        L_0x00f1:
            int r1 = r7.A06
            if (r2 >= r1) goto L_0x0104
            X.Ccf[] r1 = r7.A0G
            r1 = r1[r2]
            java.util.ArrayList r1 = r1.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            int r2 = r2 + 1
            goto L_0x00f1
        L_0x0104:
            int r1 = r7.A06
            if (r5 >= r1) goto L_0x011f
            X.Ccf[] r1 = r7.A0G
            r1 = r1[r5]
            r1.A0A()
            int r5 = r5 + 1
            goto L_0x0104
        L_0x0112:
            X.Ccf r2 = r2.A00
            java.util.ArrayList r1 = r2.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            r2.A0A()
        L_0x011f:
            r7.A0V(r3)
            r9.A07(r3)
            goto L_0x00cc
        L_0x0126:
            int r0 = r8.A05
            goto L_0x00cc
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0E(X.CXO, X.1qQ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03b8, code lost:
        if (A1V() != false) goto L_0x03ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(X.C37931qQ r12, X.C38021qZ r13, boolean r14) {
        /*
            r11 = this;
            X.CX8 r8 = r11.A0M
            X.D3U r2 = r11.A0A
            r1 = -1
            if (r2 != 0) goto L_0x000b
            int r0 = r11.A03
            if (r0 == r1) goto L_0x0018
        L_0x000b:
            int r0 = r13.A00()
            if (r0 != 0) goto L_0x0018
            r11.A0b(r12)
            r8.A00()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r8.A04
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0025
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0025
            r9 = 0
            if (r2 == 0) goto L_0x00dd
        L_0x0025:
            r9 = 1
            r8.A00()
            X.D3U r3 = r11.A0A
            if (r3 == 0) goto L_0x00b1
            int r2 = r3.A02
            if (r2 <= 0) goto L_0x0075
            int r0 = r11.A06
            if (r2 != r0) goto L_0x0066
            r4 = 0
        L_0x0036:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x0075
            X.Ccf[] r0 = r11.A0G
            r0 = r0[r4]
            r0.A08()
            X.D3U r2 = r11.A0A
            int[] r0 = r2.A09
            r3 = r0[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x0056
            boolean r2 = r2.A05
            X.1r7 r0 = r11.A07
            if (r2 == 0) goto L_0x0061
            int r0 = r0.A02()
        L_0x0055:
            int r3 = r3 + r0
        L_0x0056:
            X.Ccf[] r0 = r11.A0G
            r0 = r0[r4]
            r0.A01 = r3
            r0.A00 = r3
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0061:
            int r0 = r0.A04()
            goto L_0x0055
        L_0x0066:
            r0 = 0
            r3.A09 = r0
            r3.A02 = r7
            r3.A01 = r7
            r3.A08 = r0
            r3.A04 = r0
            int r0 = r3.A03
            r3.A00 = r0
        L_0x0075:
            X.D3U r2 = r11.A0A
            boolean r0 = r2.A06
            r11.A0C = r0
            boolean r3 = r2.A07
            r0 = 0
            r11.A1H(r0)
            X.D3U r2 = r11.A0A
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.A07
            if (r0 == r3) goto L_0x008b
            r2.A07 = r3
        L_0x008b:
            r11.A0D = r3
            r11.A0Q()
            r11.A0A()
            X.D3U r3 = r11.A0A
            int r0 = r3.A00
            if (r0 == r1) goto L_0x00ae
            r11.A03 = r0
            boolean r0 = r3.A05
        L_0x009d:
            r8.A03 = r0
            int r0 = r3.A01
            if (r0 <= r6) goto L_0x00b8
            X.Cmx r2 = r11.A09
            int[] r0 = r3.A08
            r2.A01 = r0
            java.util.List r0 = r3.A04
            r2.A00 = r0
            goto L_0x00b8
        L_0x00ae:
            boolean r0 = r11.A0E
            goto L_0x009d
        L_0x00b1:
            r11.A0A()
            boolean r0 = r11.A0E
            r8.A03 = r0
        L_0x00b8:
            boolean r0 = r13.A08
            r3 = 0
            if (r0 != 0) goto L_0x01f6
            int r4 = r11.A03
            if (r4 == r1) goto L_0x01f6
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 < 0) goto L_0x01f2
            int r0 = r13.A00()
            if (r4 >= r0) goto L_0x01f2
            X.D3U r2 = r11.A0A
            if (r2 == 0) goto L_0x0134
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0134
            int r0 = r2.A02
            if (r0 < r6) goto L_0x0134
            r8.A00 = r5
            r8.A01 = r4
        L_0x00db:
            r8.A04 = r6
        L_0x00dd:
            X.D3U r0 = r11.A0A
            if (r0 != 0) goto L_0x0107
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0107
            boolean r2 = r8.A03
            boolean r0 = r11.A0B
            if (r2 != r0) goto L_0x00f9
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            boolean r2 = X.C17890vO.A1R(r0)
            boolean r0 = r11.A0C
            if (r2 == r0) goto L_0x0107
        L_0x00f9:
            X.Cmx r2 = r11.A09
            int[] r0 = r2.A01
            if (r0 == 0) goto L_0x0102
            java.util.Arrays.fill(r0, r1)
        L_0x0102:
            r0 = 0
            r2.A00 = r0
            r8.A02 = r6
        L_0x0107:
            int r0 = r11.A0J()
            if (r0 <= 0) goto L_0x02ad
            X.D3U r0 = r11.A0A
            if (r0 == 0) goto L_0x0115
            int r0 = r0.A02
            if (r0 >= r6) goto L_0x02ad
        L_0x0115:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0233
            r4 = 0
        L_0x011a:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x02ad
            X.Ccf[] r3 = r11.A0G
            r0 = r3[r4]
            r0.A08()
            int r2 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x0131
            r0 = r3[r4]
            r0.A01 = r2
            r0.A00 = r2
        L_0x0131:
            int r4 = r4 + 1
            goto L_0x011a
        L_0x0134:
            android.view.View r4 = r11.A0j(r4)
            if (r4 == 0) goto L_0x01a7
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x019d
            int r0 = r11.A1O()
        L_0x0142:
            r8.A01 = r0
            int r0 = r11.A04
            if (r0 == r5) goto L_0x016a
            boolean r0 = r8.A03
            X.1r7 r3 = r11.A07
            if (r0 == 0) goto L_0x015e
            int r2 = r3.A02()
            int r0 = r11.A04
            int r2 = r2 - r0
            int r0 = r3.A06(r4)
        L_0x0159:
            int r2 = r2 - r0
        L_0x015a:
            r8.A00 = r2
            goto L_0x00db
        L_0x015e:
            int r2 = r3.A04()
            int r0 = r11.A04
            int r2 = r2 + r0
            int r0 = r3.A09(r4)
            goto L_0x0159
        L_0x016a:
            X.1r7 r3 = r11.A07
            int r2 = r3.A07(r4)
            int r0 = r3.A05()
            if (r2 <= r0) goto L_0x0180
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x01a2
            int r0 = r3.A02()
            goto L_0x0216
        L_0x0180:
            int r2 = r3.A09(r4)
            int r0 = r3.A04()
            int r2 = r2 - r0
            if (r2 >= 0) goto L_0x018e
            int r0 = -r2
            goto L_0x0216
        L_0x018e:
            int r2 = r3.A02()
            int r0 = r3.A06(r4)
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x015a
            r8.A00 = r5
            goto L_0x00db
        L_0x019d:
            int r0 = r11.A1N()
            goto L_0x0142
        L_0x01a2:
            int r0 = r3.A04()
            goto L_0x0216
        L_0x01a7:
            int r2 = r11.A03
            r8.A01 = r2
            int r4 = r11.A04
            if (r4 != r5) goto L_0x01de
            int r0 = r11.A0J()
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x01ba
        L_0x01b9:
            r3 = 1
        L_0x01ba:
            r8.A03 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.1r7 r0 = r0.A07
            if (r3 == 0) goto L_0x01cc
            int r0 = r0.A02()
        L_0x01c6:
            r8.A00 = r0
            r8.A02 = r6
            goto L_0x00db
        L_0x01cc:
            int r0 = r0.A04()
            goto L_0x01c6
        L_0x01d1:
            int r0 = r11.A1N()
            boolean r2 = X.AnonymousClass000.A1U(r2, r0)
            boolean r0 = r11.A0E
            if (r2 == r0) goto L_0x01b9
            goto L_0x01ba
        L_0x01de:
            boolean r2 = r8.A03
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.1r7 r0 = r0.A07
            if (r2 == 0) goto L_0x01ec
            int r0 = r0.A02()
            int r0 = r0 - r4
            goto L_0x01c6
        L_0x01ec:
            int r0 = r0.A04()
            int r0 = r0 + r4
            goto L_0x01c6
        L_0x01f2:
            r11.A03 = r1
            r11.A04 = r5
        L_0x01f6:
            boolean r0 = r11.A0B
            int r4 = r13.A00()
            if (r0 == 0) goto L_0x021a
            int r2 = r11.A0J()
        L_0x0202:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0231
            android.view.View r0 = r11.A0P(r2)
            int r0 = X.C38251qy.A02(r0)
            if (r0 < 0) goto L_0x0202
            if (r0 >= r4) goto L_0x0202
        L_0x0212:
            r8.A01 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0216:
            r8.A00 = r0
            goto L_0x00db
        L_0x021a:
            int r3 = r11.A0J()
            r2 = 0
        L_0x021f:
            if (r2 >= r3) goto L_0x0231
            android.view.View r0 = r11.A0P(r2)
            int r0 = X.C38251qy.A02(r0)
            if (r0 < 0) goto L_0x022e
            if (r0 >= r4) goto L_0x022e
            goto L_0x0212
        L_0x022e:
            int r2 = r2 + 1
            goto L_0x021f
        L_0x0231:
            r0 = 0
            goto L_0x0212
        L_0x0233:
            if (r9 != 0) goto L_0x024e
            int[] r4 = r8.A05
            if (r4 == 0) goto L_0x024e
            r3 = 0
        L_0x023a:
            int r0 = r11.A06
            if (r3 >= r0) goto L_0x02ad
            X.Ccf[] r0 = r11.A0G
            r2 = r0[r3]
            r2.A08()
            r0 = r4[r3]
            r2.A01 = r0
            r2.A00 = r0
            int r3 = r3 + 1
            goto L_0x023a
        L_0x024e:
            r5 = 0
        L_0x024f:
            int r0 = r11.A06
            X.Ccf[] r9 = r11.A0G
            if (r5 >= r0) goto L_0x028a
            r9 = r9[r5]
            boolean r10 = r11.A0E
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0285
            int r2 = r9.A02(r3)
        L_0x0263:
            r9.A08()
            if (r2 == r3) goto L_0x027b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A05
            X.1r7 r0 = r0.A07
            if (r10 == 0) goto L_0x027e
            int r0 = r0.A02()
            if (r2 < r0) goto L_0x027b
        L_0x0274:
            if (r4 == r3) goto L_0x0277
            int r2 = r2 + r4
        L_0x0277:
            r9.A00 = r2
            r9.A01 = r2
        L_0x027b:
            int r5 = r5 + 1
            goto L_0x024f
        L_0x027e:
            int r0 = r0.A04()
            if (r2 <= r0) goto L_0x0274
            goto L_0x027b
        L_0x0285:
            int r2 = r9.A03(r3)
            goto L_0x0263
        L_0x028a:
            int r5 = r9.length
            int[] r0 = r8.A05
            if (r0 == 0) goto L_0x0292
            int r0 = r0.length
            if (r0 >= r5) goto L_0x029b
        L_0x0292:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.Ccf[] r0 = r0.A0G
            int r0 = r0.length
            int[] r0 = new int[r0]
            r8.A05 = r0
        L_0x029b:
            r4 = 0
        L_0x029c:
            if (r4 >= r5) goto L_0x02ad
            int[] r3 = r8.A05
            r2 = r9[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2.A03(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x029c
        L_0x02ad:
            r11.A0a(r12)
            X.CXO r3 = r11.A0L
            r3.A07 = r7
            r11.A0I = r7
            X.1r7 r2 = r11.A08
            int r4 = r2.A05()
            int r0 = r11.A06
            int r0 = r4 / r0
            r11.A05 = r0
            int r0 = r2.A03()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r11.A00 = r0
            int r0 = r8.A01
            r11.A0G(r13, r0)
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x031e
            r11.A0B(r1)
            r11.A08(r3, r12, r13)
            r11.A0B(r6)
        L_0x02de:
            int r1 = r8.A01
            int r0 = r3.A03
            int r1 = r1 + r0
            r3.A01 = r1
            r11.A08(r3, r12, r13)
            int r1 = r2.A03()
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0355
            int r5 = r11.A0J()
            r4 = 0
            r1 = 0
            r9 = 0
        L_0x02f7:
            if (r9 >= r5) goto L_0x0328
            android.view.View r10 = r11.A0P(r9)
            int r0 = r2.A07(r10)
            float r3 = (float) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x031b
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.BM8 r0 = (X.BM8) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0317
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            int r0 = r11.A06
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x0317:
            float r1 = java.lang.Math.max(r1, r3)
        L_0x031b:
            int r9 = r9 + 1
            goto L_0x02f7
        L_0x031e:
            r11.A0B(r6)
            r11.A08(r3, r12, r13)
            r11.A0B(r1)
            goto L_0x02de
        L_0x0328:
            int r3 = r11.A05
            int r0 = r11.A06
            float r0 = (float) r0
            int r1 = X.BE6.A04(r1, r0)
            int r9 = r2.A03()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r0) goto L_0x0341
            int r0 = r2.A05()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0341:
            int r0 = r11.A06
            int r0 = r1 / r0
            r11.A05 = r0
            int r0 = r2.A03()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r11.A00 = r0
            int r0 = r11.A05
            if (r0 != r3) goto L_0x040f
        L_0x0355:
            int r0 = r11.A0J()
            if (r0 <= 0) goto L_0x0391
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x03dc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r11.A06(r1)
            if (r0 == r1) goto L_0x037c
            X.1r7 r2 = r11.A07
            int r1 = r2.A02()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x037c
            int r0 = -r1
            int r0 = r11.A1P(r12, r13, r0)
            int r0 = -r0
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x037c
            r2.A0C(r1)
        L_0x037c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r11.A07(r0)
            if (r1 == r0) goto L_0x0391
            X.1r7 r0 = r11.A07
            int r0 = r0.A04()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0391
            r11.A1P(r12, r13, r1)
        L_0x0391:
            if (r14 == 0) goto L_0x03da
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x03da
            int r0 = r11.A01
            if (r0 == 0) goto L_0x03da
            int r0 = r11.A0J()
            if (r0 <= 0) goto L_0x03da
            boolean r0 = r11.A0I
            if (r0 != 0) goto L_0x03ab
            android.view.View r0 = r11.A1Q()
            if (r0 == 0) goto L_0x03da
        L_0x03ab:
            java.lang.Runnable r1 = r11.A0N
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x03b4
            r0.removeCallbacks(r1)
        L_0x03b4:
            boolean r0 = r11.A1V()
            if (r0 == 0) goto L_0x03da
        L_0x03ba:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x03c1
            r8.A00()
        L_0x03c1:
            boolean r0 = r8.A03
            r11.A0B = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.C17890vO.A1R(r0)
            r11.A0C = r0
            if (r6 == 0) goto L_0x0017
            r8.A00()
            r11.A0F(r12, r13, r7)
            return
        L_0x03da:
            r6 = 0
            goto L_0x03ba
        L_0x03dc:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r11.A07(r0)
            if (r2 == r0) goto L_0x03f9
            X.1r7 r1 = r11.A07
            int r0 = r1.A04()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03f9
            int r0 = r11.A1P(r12, r13, r2)
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03f9
            int r0 = -r2
            r1.A0C(r0)
        L_0x03f9:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r11.A06(r0)
            if (r1 == r0) goto L_0x0391
            X.1r7 r0 = r11.A07
            int r0 = r0.A02()
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0391
            int r0 = -r0
            r11.A1P(r12, r13, r0)
            goto L_0x0391
        L_0x040f:
            if (r4 >= r5) goto L_0x0355
            android.view.View r2 = r11.A0P(r4)
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            X.BM8 r9 = (X.BM8) r9
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x0441
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x0444
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0444
            int r1 = r11.A06
            int r1 = r1 - r6
            X.Ccf r0 = r9.A00
            int r0 = r0.A04
            int r1 = r1 - r0
            int r9 = -r1
            int r0 = r11.A05
            int r1 = r9 * r0
            int r9 = r9 * r3
        L_0x043d:
            int r1 = r1 - r9
            r2.offsetLeftAndRight(r1)
        L_0x0441:
            int r4 = r4 + 1
            goto L_0x040f
        L_0x0444:
            X.Ccf r0 = r9.A00
            int r9 = r0.A04
            int r0 = r11.A05
            int r1 = r9 * r0
            int r9 = r9 * r3
            int r0 = r11.A02
            if (r0 == r6) goto L_0x043d
            int r1 = r1 - r9
            r2.offsetTopAndBottom(r1)
            goto L_0x0441
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0F(X.1qQ, X.1qZ, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0G(X.C38021qZ r8, int r9) {
        /*
            r7 = this;
            X.CXO r4 = r7.A0L
            r3 = 0
            r4.A00 = r3
            r4.A01 = r9
            X.CcK r0 = r7.A06
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r6 = 1
            if (r0 == 0) goto L_0x0064
            int r1 = r8.A06
            r0 = -1
            if (r1 == r0) goto L_0x0064
            boolean r2 = r7.A0E
            boolean r1 = X.AnonymousClass000.A1U(r1, r9)
            X.1r7 r0 = r7.A07
            int r5 = r0.A05()
            if (r2 == r1) goto L_0x0065
            r2 = r5
            r5 = 0
        L_0x0029:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L_0x0032
            boolean r1 = r0.A0N
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            X.1r7 r1 = r7.A07
            if (r0 == 0) goto L_0x0059
            int r0 = r1.A04()
            int r0 = r0 - r2
            r4.A05 = r0
            int r0 = r1.A02()
            int r0 = r0 + r5
            r4.A02 = r0
        L_0x0045:
            r4.A08 = r3
            r4.A07 = r6
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0056
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            r4.A06 = r3
            return
        L_0x0059:
            int r0 = r1.A01()
            int r0 = r0 + r5
            r4.A02 = r0
            int r0 = -r2
            r4.A05 = r0
            goto L_0x0045
        L_0x0064:
            r5 = 0
        L_0x0065:
            r2 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0G(X.1qZ, int):void");
    }

    private void A0H(C25282Ccf ccf, int i, int i2) {
        int i3 = ccf.A02;
        if (i == -1) {
            int i4 = ccf.A01;
            if (i4 == Integer.MIN_VALUE) {
                ccf.A07();
                i4 = ccf.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = ccf.A00;
            if (i5 == Integer.MIN_VALUE) {
                ccf.A06();
                i5 = ccf.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0H.set(ccf.A04, false);
    }

    private boolean A0I(int i) {
        int i2 = this.A02;
        boolean A1T = AnonymousClass000.A1T(i, -1);
        boolean z = this.A0E;
        if (i2 == 0) {
            if (A1T != z) {
                return true;
            }
            return false;
        } else if (AnonymousClass000.A1T(A1T ? 1 : 0, z ? 1 : 0) == C17890vO.A1R(this.A07.getLayoutDirection())) {
            return true;
        } else {
            return false;
        }
    }

    public int A0k(C37931qQ r3, C38021qZ r4) {
        if (this.A02 == 1) {
            return this.A06;
        }
        return super.A0k(r3, r4);
    }

    public int A0l(C37931qQ r2, C38021qZ r3) {
        if (this.A02 == 0) {
            return this.A06;
        }
        return super.A0l(r2, r3);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.os.Parcelable, java.lang.Object, X.D3U] */
    public Parcelable A0u() {
        ? obj;
        int A1N;
        View A1S;
        int A022;
        int A032;
        int A042;
        int[] iArr;
        D3U d3u = this.A0A;
        if (d3u != null) {
            obj.A02 = d3u.A02;
            obj.A00 = d3u.A00;
            obj.A03 = d3u.A03;
            obj.A09 = d3u.A09;
            obj.A01 = d3u.A01;
            obj.A08 = d3u.A08;
            obj.A07 = d3u.A07;
            obj.A05 = d3u.A05;
            obj.A06 = d3u.A06;
            obj.A04 = d3u.A04;
        } else {
            obj = new Object();
            obj.A07 = this.A0D;
            obj.A05 = this.A0B;
            obj.A06 = this.A0C;
            C25843Cmx cmx = this.A09;
            if (cmx == null || (iArr = cmx.A01) == null) {
                obj.A01 = 0;
            } else {
                obj.A08 = iArr;
                obj.A01 = iArr.length;
                obj.A04 = cmx.A00;
            }
            if (A0J() > 0) {
                if (this.A0B) {
                    A1N = A1O();
                } else {
                    A1N = A1N();
                }
                obj.A00 = A1N;
                if (this.A0E) {
                    A1S = A1R(true);
                } else {
                    A1S = A1S(true);
                }
                if (A1S == null) {
                    A022 = -1;
                } else {
                    A022 = C38251qy.A02(A1S);
                }
                obj.A03 = A022;
                int i = this.A06;
                obj.A02 = i;
                obj.A09 = new int[i];
                for (int i2 = 0; i2 < this.A06; i2++) {
                    boolean z = this.A0B;
                    C25282Ccf ccf = this.A0G[i2];
                    if (z) {
                        A032 = ccf.A02(Integer.MIN_VALUE);
                        if (A032 != Integer.MIN_VALUE) {
                            A042 = this.A07.A02();
                        } else {
                            obj.A09[i2] = A032;
                        }
                    } else {
                        A032 = ccf.A03(Integer.MIN_VALUE);
                        if (A032 != Integer.MIN_VALUE) {
                            A042 = this.A07.A04();
                        } else {
                            obj.A09[i2] = A032;
                        }
                    }
                    A032 -= A042;
                    obj.A09[i2] = A032;
                }
            } else {
                obj.A00 = -1;
                obj.A03 = -1;
                obj.A02 = 0;
                return obj;
            }
        }
        return obj;
    }

    public C38491rN A0w() {
        int i = -1;
        int i2 = -2;
        if (this.A02 == 0) {
            i = -2;
            i2 = -1;
        }
        return new C38491rN(i, i2);
    }

    public C38491rN A0x(Context context, AttributeSet attributeSet) {
        return new C38491rN(context, attributeSet);
    }

    public C38491rN A0y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C38491rN((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C38491rN(layoutParams);
    }

    public void A0z() {
        C25843Cmx cmx = this.A09;
        int[] iArr = cmx.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        cmx.A00 = null;
        A0Q();
    }

    public void A12(int i) {
        if (i == 0) {
            A1V();
        }
    }

    public void A13(int i) {
        D3U d3u = this.A0A;
        if (!(d3u == null || d3u.A00 == i)) {
            d3u.A09 = null;
            d3u.A02 = 0;
            d3u.A00 = -1;
            d3u.A03 = -1;
        }
        this.A03 = i;
        this.A04 = Integer.MIN_VALUE;
        A0Q();
    }

    public void A15(int i, int i2) {
        A0C(i, i2, 8);
    }

    public void A19(Parcelable parcelable) {
        if (parcelable instanceof D3U) {
            this.A0A = (D3U) parcelable;
            A0Q();
        }
    }

    public void A1C(C38001qX r7, C38021qZ r8, int i, int i2) {
        int A022;
        int i3;
        if (this.A02 != 0) {
            i = i2;
        }
        if (A0J() != 0 && i != 0) {
            A1U(r8, i);
            int[] iArr = this.A0J;
            if (iArr == null || iArr.length < this.A06) {
                this.A0J = new int[this.A06];
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.A06; i6++) {
                CXO cxo = this.A0L;
                if (cxo.A03 == -1) {
                    A022 = cxo.A05;
                    i3 = this.A0G[i6].A03(A022);
                } else {
                    A022 = this.A0G[i6].A02(cxo.A02);
                    i3 = cxo.A02;
                }
                int i7 = A022 - i3;
                if (i7 >= 0) {
                    this.A0J[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.A0J, 0, i5);
            while (i4 < i5) {
                CXO cxo2 = this.A0L;
                int i8 = cxo2.A01;
                if (i8 >= 0 && i8 < r8.A00()) {
                    r7.BBe(i8, this.A0J[i4]);
                    cxo2.A01 += cxo2.A03;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void A1E(C37931qQ r3, RecyclerView recyclerView) {
        Runnable runnable = this.A0N;
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.A06; i++) {
            this.A0G[i].A08();
        }
        recyclerView.requestLayout();
    }

    public void A1H(String str) {
        if (this.A0A == null) {
            super.A1H(str);
        }
    }

    public boolean A1I() {
        return AnonymousClass000.A1P(this.A02);
    }

    public boolean A1J() {
        return C17890vO.A1R(this.A02);
    }

    public boolean A1K() {
        return AnonymousClass000.A1O(this.A01);
    }

    public boolean A1L() {
        return AnonymousClass000.A1X(this.A0A);
    }

    public View A1R(boolean z) {
        C38331r7 r7 = this.A07;
        int A042 = r7.A04();
        int A022 = r7.A02();
        View view = null;
        for (int A0J2 = A0J() - 1; A0J2 >= 0; A0J2--) {
            View A0P = A0P(A0J2);
            int A092 = r7.A09(A0P);
            int A062 = r7.A06(A0P);
            if (A062 > A042 && A092 < A022) {
                if (A062 <= A022 || !z) {
                    return A0P;
                }
                if (view == null) {
                    view = A0P;
                }
            }
        }
        return view;
    }

    public View A1S(boolean z) {
        C38331r7 r8 = this.A07;
        int A042 = r8.A04();
        int A022 = r8.A02();
        int A0J2 = A0J();
        View view = null;
        for (int i = 0; i < A0J2; i++) {
            View A0P = A0P(i);
            int A092 = r8.A09(A0P);
            if (r8.A06(A0P) > A042 && A092 < A022) {
                if (A092 >= A042 || !z) {
                    return A0P;
                }
                if (view == null) {
                    view = A0P;
                }
            }
        }
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Cmx, java.lang.Object] */
    public StaggeredGridLayoutManager(int i, int i2) {
        this.A02 = i2;
        A1T(i);
        this.A0L = new CXO();
        this.A07 = C38331r7.A00(this, this.A02);
        this.A08 = C38331r7.A00(this, 1 - this.A02);
    }

    public int A0m(C37931qQ r2, C38021qZ r3, int i) {
        return A1P(r2, r3, i);
    }

    public int A0n(C37931qQ r2, C38021qZ r3, int i) {
        return A1P(r2, r3, i);
    }

    public int A0p(C38021qZ r2) {
        return A09(r2);
    }

    public int A0s(C38021qZ r2) {
        return A09(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r12.A02 == 1) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (X.C17890vO.A1R(r12.A07.getLayoutDirection()) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        if (X.C17890vO.A1R(r12.A07.getLayoutDirection()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        if (r12.A02 == 0) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0131 A[LOOP:3: B:89:0x0131->B:98:0x0148, LOOP_START, PHI: r5 
      PHI: (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:75:0x010b, B:98:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0v(android.view.View r13, X.C37931qQ r14, X.C38021qZ r15, int r16) {
        /*
            r12 = this;
            int r0 = r12.A0J()
            r11 = 0
            if (r0 == 0) goto L_0x0150
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            if (r0 == 0) goto L_0x0150
            android.view.View r3 = r0.A0N(r13)
            if (r3 == 0) goto L_0x0150
            X.1qm r0 = r12.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0150
            r12.A0A()
            r2 = -1
            r6 = 1
            r1 = r16
            if (r1 == r6) goto L_0x009e
            r0 = 2
            if (r1 == r0) goto L_0x008d
            r0 = 17
            if (r1 == r0) goto L_0x00af
            r0 = 33
            if (r1 == r0) goto L_0x0088
            r0 = 66
            if (r1 == r0) goto L_0x0083
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L_0x0150
            int r0 = r12.A02
            if (r0 != r6) goto L_0x0150
        L_0x003b:
            r7 = 1
        L_0x003c:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.BM8 r0 = (X.BM8) r0
            boolean r8 = r0.A01
            X.Ccf r4 = r0.A00
            if (r7 != r6) goto L_0x007e
            int r9 = r12.A1O()
        L_0x004c:
            r12.A0G(r15, r9)
            r12.A0B(r7)
            X.CXO r10 = r12.A0L
            int r0 = r10.A03
            int r0 = r0 + r9
            r10.A01 = r0
            X.1r7 r0 = r12.A07
            int r0 = r0.A05()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r10.A00 = r0
            r10.A08 = r6
            r5 = 0
            r10.A07 = r5
            r12.A08(r10, r14, r15)
            boolean r0 = r12.A0E
            r12.A0B = r0
            if (r8 != 0) goto L_0x00b5
            android.view.View r0 = r4.A05(r9, r7)
            if (r0 == 0) goto L_0x00b5
            if (r0 == r3) goto L_0x00b5
            return r0
        L_0x007e:
            int r9 = r12.A1N()
            goto L_0x004c
        L_0x0083:
            int r0 = r12.A02
            if (r0 != 0) goto L_0x0150
            goto L_0x003b
        L_0x0088:
            int r0 = r12.A02
            if (r0 != r6) goto L_0x0150
            goto L_0x00b3
        L_0x008d:
            int r0 = r12.A02
            if (r0 == r6) goto L_0x003b
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x003b
            goto L_0x00b3
        L_0x009e:
            int r0 = r12.A02
            if (r0 == r6) goto L_0x00b3
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x00b3
            goto L_0x003b
        L_0x00af:
            int r0 = r12.A02
            if (r0 != 0) goto L_0x0150
        L_0x00b3:
            r7 = -1
            goto L_0x003c
        L_0x00b5:
            boolean r0 = r12.A0I(r7)
            if (r0 == 0) goto L_0x00d0
            int r1 = r12.A06
            int r1 = r1 - r6
        L_0x00be:
            if (r1 < 0) goto L_0x00e5
            X.Ccf[] r0 = r12.A0G
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r7)
            if (r0 == 0) goto L_0x00cd
            if (r0 == r3) goto L_0x00cd
            return r0
        L_0x00cd:
            int r1 = r1 + -1
            goto L_0x00be
        L_0x00d0:
            r1 = 0
        L_0x00d1:
            int r0 = r12.A06
            if (r1 >= r0) goto L_0x00e5
            X.Ccf[] r0 = r12.A0G
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r7)
            if (r0 == 0) goto L_0x00e2
            if (r0 == r3) goto L_0x00e2
            return r0
        L_0x00e2:
            int r1 = r1 + 1
            goto L_0x00d1
        L_0x00e5:
            boolean r0 = r12.A0D
            r1 = r0 ^ 1
            boolean r0 = X.AnonymousClass000.A1T(r7, r2)
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            if (r8 != 0) goto L_0x0107
            if (r2 == 0) goto L_0x0102
            int r0 = r4.A00()
        L_0x00f9:
            android.view.View r0 = r12.A0j(r0)
            if (r0 == 0) goto L_0x0107
            if (r0 == r3) goto L_0x0107
            return r0
        L_0x0102:
            int r0 = r4.A01()
            goto L_0x00f9
        L_0x0107:
            boolean r0 = r12.A0I(r7)
            if (r0 == 0) goto L_0x0131
            int r1 = r12.A06
            int r1 = r1 - r6
        L_0x0110:
            if (r1 < 0) goto L_0x0150
            int r0 = r4.A04
            if (r1 == r0) goto L_0x012e
            X.Ccf[] r0 = r12.A0G
            r0 = r0[r1]
            if (r2 == 0) goto L_0x0129
            int r0 = r0.A00()
        L_0x0120:
            android.view.View r0 = r12.A0j(r0)
            if (r0 == 0) goto L_0x012e
            if (r0 == r3) goto L_0x012e
            return r0
        L_0x0129:
            int r0 = r0.A01()
            goto L_0x0120
        L_0x012e:
            int r1 = r1 + -1
            goto L_0x0110
        L_0x0131:
            int r0 = r12.A06
            if (r5 >= r0) goto L_0x0150
            X.Ccf[] r0 = r12.A0G
            r0 = r0[r5]
            if (r2 == 0) goto L_0x014b
            int r0 = r0.A00()
        L_0x013f:
            android.view.View r0 = r12.A0j(r0)
            if (r0 == 0) goto L_0x0148
            if (r0 == r3) goto L_0x0148
            return r0
        L_0x0148:
            int r5 = r5 + 1
            goto L_0x0131
        L_0x014b:
            int r0 = r0.A01()
            goto L_0x013f
        L_0x0150:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0v(android.view.View, X.1qQ, X.1qZ, int):android.view.View");
    }

    public void A10(int i) {
        super.A10(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C25282Ccf ccf = this.A0G[i2];
            int i3 = ccf.A01;
            if (i3 != Integer.MIN_VALUE) {
                ccf.A01 = i3 + i;
            }
            int i4 = ccf.A00;
            if (i4 != Integer.MIN_VALUE) {
                ccf.A00 = i4 + i;
            }
        }
    }

    public void A11(int i) {
        super.A11(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C25282Ccf ccf = this.A0G[i2];
            int i3 = ccf.A01;
            if (i3 != Integer.MIN_VALUE) {
                ccf.A01 = i3 + i;
            }
            int i4 = ccf.A00;
            if (i4 != Integer.MIN_VALUE) {
                ccf.A00 = i4 + i;
            }
        }
    }

    public void A18(Rect rect, int i, int i2) {
        int A002;
        int A003;
        int A0M2 = A0M() + A0N();
        int A0O = A0O() + A0L();
        if (this.A02 == 1) {
            A003 = C38251qy.A00(i2, rect.height() + A0O, this.A07.getMinimumHeight());
            A002 = C38251qy.A00(i, (this.A05 * this.A06) + A0M2, this.A07.getMinimumWidth());
        } else {
            A002 = C38251qy.A00(i, rect.width() + A0M2, this.A07.getMinimumWidth());
            A003 = C38251qy.A00(i2, (this.A05 * this.A06) + A0O, this.A07.getMinimumHeight());
        }
        this.A07.setMeasuredDimension(A002, A003);
    }

    public void A1A(View view, C26228CvK cvK, C37931qQ r10, C38021qZ r11) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof BM8)) {
            super.A0Y(view, cvK);
            return;
        }
        BM8 bm8 = (BM8) layoutParams;
        int i5 = this.A02;
        C25282Ccf ccf = bm8.A00;
        if (i5 == 0) {
            if (ccf == null) {
                i3 = -1;
            } else {
                i3 = ccf.A04;
            }
            if (bm8.A01) {
                i4 = this.A06;
            } else {
                i4 = 1;
            }
            z = false;
            i = -1;
            i2 = -1;
        } else {
            if (ccf == null) {
                i = -1;
            } else {
                i = ccf.A04;
            }
            if (bm8.A01) {
                i2 = this.A06;
            } else {
                i2 = 1;
            }
            z = false;
            i3 = -1;
            i4 = -1;
        }
        cvK.A0a(C25476CgV.A00(i3, i4, i, i2, z, z));
    }

    public void A1B(AccessibilityEvent accessibilityEvent) {
        super.A1B(accessibilityEvent);
        if (A0J() > 0) {
            View A1S = A1S(false);
            View A1R = A1R(false);
            if (A1S != null && A1R != null) {
                int A022 = C38251qy.A02(A1S);
                int A023 = C38251qy.A02(A1R);
                if (A022 < A023) {
                    accessibilityEvent.setFromIndex(A022);
                    accessibilityEvent.setToIndex(A023);
                    return;
                }
                accessibilityEvent.setFromIndex(A023);
                accessibilityEvent.setToIndex(A022);
            }
        }
    }

    public void A1G(RecyclerView recyclerView, int i) {
        BMI bmi = new BMI(recyclerView.getContext());
        bmi.A00 = i;
        A0e(bmi);
    }

    public int A1N() {
        if (A0J() != 0) {
            return C38251qy.A02(A0P(0));
        }
        return 0;
    }

    public int A1O() {
        int A0J2 = A0J();
        if (A0J2 == 0) {
            return 0;
        }
        return C38251qy.A02(A0P(A0J2 - 1));
    }

    public int A1P(C37931qQ r5, C38021qZ r6, int i) {
        if (A0J() == 0 || i == 0) {
            return 0;
        }
        A1U(r6, i);
        CXO cxo = this.A0L;
        int A082 = A08(cxo, r5, r6);
        if (cxo.A00 >= A082) {
            int i2 = i;
            i = A082;
            if (i2 < 0) {
                i = -A082;
            }
        }
        this.A07.A0C(-i);
        this.A0B = this.A0E;
        cxo.A00 = 0;
        A0E(cxo, r5);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (X.C17890vO.A1R(r11.A07.getLayoutDirection()) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1Q() {
        /*
            r11 = this;
            int r6 = r11.A0J()
            r2 = 1
            int r6 = r6 - r2
            int r1 = r11.A06
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r1)
            r0 = 0
            r5.set(r0, r1, r2)
            int r0 = r11.A02
            r10 = -1
            if (r0 != r2) goto L_0x0023
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.C17890vO.A1R(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r9 = -1
        L_0x0024:
            boolean r0 = r11.A0E
            r4 = -1
            if (r0 != 0) goto L_0x002c
            int r4 = r6 + 1
            r6 = 0
        L_0x002c:
            if (r6 >= r4) goto L_0x002f
            r10 = 1
        L_0x002f:
            if (r6 == r4) goto L_0x00dc
            android.view.View r3 = r11.A0P(r6)
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            X.BM8 r7 = (X.BM8) r7
            X.Ccf r0 = r7.A00
            int r0 = r0.A04
            boolean r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0093
            X.Ccf r8 = r7.A00
            boolean r0 = r11.A0E
            r2 = 0
            if (r0 == 0) goto L_0x0076
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0057
            r8.A06()
            int r1 = r8.A00
        L_0x0057:
            X.1r7 r0 = r11.A07
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x008c
            java.util.ArrayList r0 = r8.A03
            int r2 = X.AnonymousClass000.A0Q(r0)
        L_0x0065:
            android.view.View r0 = X.BE6.A0R(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.BM8 r0 = (X.BM8) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008c
            return r3
        L_0x0076:
            int r1 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0081
            r8.A07()
            int r1 = r8.A01
        L_0x0081:
            X.1r7 r0 = r11.A07
            int r0 = r0.A04()
            if (r1 <= r0) goto L_0x008c
            java.util.ArrayList r0 = r8.A03
            goto L_0x0065
        L_0x008c:
            X.Ccf r0 = r7.A00
            int r0 = r0.A04
            r5.clear(r0)
        L_0x0093:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00d9
            int r0 = r6 + r10
            if (r0 == r4) goto L_0x00d9
            int r0 = r6 + r10
            android.view.View r2 = r11.A0P(r0)
            boolean r1 = r11.A0E
            X.1r7 r0 = r11.A07
            if (r1 == 0) goto L_0x00b2
            int r1 = r0.A06(r3)
            int r0 = r0.A06(r2)
            if (r1 >= r0) goto L_0x00bd
            return r3
        L_0x00b2:
            int r1 = r0.A09(r3)
            int r0 = r0.A09(r2)
            if (r1 <= r0) goto L_0x00bd
            return r3
        L_0x00bd:
            if (r1 != r0) goto L_0x00d9
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            X.BM8 r2 = (X.BM8) r2
            X.Ccf r0 = r7.A00
            int r1 = r0.A04
            X.Ccf r0 = r2.A00
            int r0 = r0.A04
            int r1 = r1 - r0
            boolean r1 = X.C108975cc.A19(r1)
            boolean r0 = X.C108975cc.A19(r9)
            if (r1 == r0) goto L_0x00d9
            return r3
        L_0x00d9:
            int r6 = r6 + r10
            goto L_0x002f
        L_0x00dc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1Q():android.view.View");
    }

    public boolean A1V() {
        int A1N;
        int A1O;
        int i;
        int i2;
        if (!(A0J() == 0 || this.A01 == 0 || !this.A0A)) {
            if (this.A0E) {
                A1N = A1O();
                A1O = A1N();
            } else {
                A1N = A1N();
                A1O = A1O();
            }
            if (A1N == 0 && A1Q() != null) {
                C25843Cmx cmx = this.A09;
                int[] iArr = cmx.A01;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                cmx.A00 = null;
            } else if (this.A0I) {
                int i3 = 1;
                if (this.A0E) {
                    i3 = -1;
                }
                C25843Cmx cmx2 = this.A09;
                int i4 = A1O + 1;
                List list = cmx2.A00;
                if (list != null) {
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        D3V A002 = C25843Cmx.A00(cmx2, i5);
                        int i6 = A002.A01;
                        if (i6 >= i4) {
                            break;
                        } else if (i6 < A1N || (A002.A00 != i3 && !A002.A02)) {
                            i5++;
                        } else {
                            int i7 = -i3;
                            List list2 = cmx2.A00;
                            if (list2 != null) {
                                int size2 = list2.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < size2) {
                                        D3V A003 = C25843Cmx.A00(cmx2, i8);
                                        i2 = A003.A01;
                                        if (i2 >= i6) {
                                            break;
                                        } else if (i2 < A1N || !(i7 == 0 || A003.A00 == i7 || A003.A02)) {
                                            i8++;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i = i2 + 1;
                                cmx2.A03(i);
                            }
                            i = A002.A01;
                            cmx2.A03(i);
                        }
                    }
                }
                this.A0I = false;
                cmx2.A03(i4);
            }
            this.A0C = true;
            A0Q();
            return true;
        }
        return false;
    }

    public PointF BFT(int i) {
        int i2 = -1;
        if (A0J() != 0 ? AnonymousClass000.A1U(i, A1N()) == this.A0E : this.A0E) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) i2;
        return pointF;
    }

    public boolean A1M(C38491rN r2) {
        return r2 instanceof BM8;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Cmx, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C38191qq.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        int i4 = obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        if (i3 == 0 || i3 == 1) {
            A1H((String) null);
            if (i3 != this.A02) {
                this.A02 = i3;
                C38331r7 r1 = this.A07;
                this.A07 = this.A08;
                this.A08 = r1;
                A0Q();
            }
            A1T(i4);
            A1H((String) null);
            D3U d3u = this.A0A;
            if (!(d3u == null || d3u.A07 == z)) {
                d3u.A07 = z;
            }
            this.A0D = z;
            A0Q();
            this.A0L = new CXO();
            this.A07 = C38331r7.A00(this, this.A02);
            this.A08 = C38331r7.A00(this, 1 - this.A02);
            return;
        }
        throw AnonymousClass000.A0k("invalid orientation.");
    }
}
