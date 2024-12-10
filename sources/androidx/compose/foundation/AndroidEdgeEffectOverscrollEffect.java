package androidx.compose.foundation;

import X.AnonymousClass001;
import X.AnonymousClass05T;
import X.AnonymousClass08Y;
import X.AnonymousClass0Bb;
import X.AnonymousClass0GU;
import X.AnonymousClass0JK;
import X.AnonymousClass0JZ;
import X.AnonymousClass0O1;
import X.AnonymousClass0Oy;
import X.AnonymousClass0PB;
import X.AnonymousClass0QG;
import X.AnonymousClass0QY;
import X.AnonymousClass0t9;
import X.AnonymousClass1ZU;
import X.C02650Ev;
import X.C02880Ft;
import X.C04410Ng;
import X.C10550iW;
import X.C17090tj;
import X.C17280uP;
import X.C17770vC;
import X.C18100vl;
import X.C22339B3q;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.List;

public final class AndroidEdgeEffectOverscrollEffect implements AnonymousClass0t9 {
    public long A00;
    public AnonymousClass0QY A01;
    public AnonymousClass0JK A02;
    public int A03;
    public boolean A04;
    public final EdgeEffect A05;
    public final EdgeEffect A06;
    public final EdgeEffect A07;
    public final EdgeEffect A08;
    public final EdgeEffect A09;
    public final EdgeEffect A0A;
    public final EdgeEffect A0B;
    public final EdgeEffect A0C;
    public final C17280uP A0D;
    public final AnonymousClass0JZ A0E;
    public final C17090tj A0F;
    public final List A0G;
    public final C22821Di A0H;

    public static final float A04(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C04410Ng.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static final float A05(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C04410Ng.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final EdgeEffect A06(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C04410Ng.A02(context);
        }
        return new AnonymousClass05T(context);
    }

    public static final void A07(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof AnonymousClass05T) {
            AnonymousClass05T r2 = (AnonymousClass05T) edgeEffect;
            float f2 = r2.A00 + f;
            r2.A00 = f2;
            if (Math.abs(f2) > r2.A01) {
                r2.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static final void A08(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final void A09(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        List list = androidEdgeEffectOverscrollEffect.A0G;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished()) {
                boolean z2 = z;
                z = false;
                if (!z2) {
                }
            }
            z = true;
        }
        if (z) {
            A0A(androidEdgeEffectOverscrollEffect);
        }
    }

    public static final void A0A(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        int i = androidEdgeEffectOverscrollEffect.A03;
        C17280uP r1 = androidEdgeEffectOverscrollEffect.A0D;
        if (i == r1.BT8()) {
            r1.CJC(r1.BT8() + 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r0 != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C17770vC r8) {
        /*
            r7 = this;
            long r0 = r7.A00
            boolean r0 = X.AnonymousClass0QG.A04(r0)
            if (r0 != 0) goto L_0x00c3
            X.0t6 r0 = r8.BQs()
            X.0tV r1 = r0.BOJ()
            X.0uP r0 = r7.A0D
            int r0 = r0.BT8()
            r7.A03 = r0
            android.graphics.Canvas r4 = X.AnonymousClass0M0.A00(r1)
            android.widget.EdgeEffect r2 = r7.A08
            float r0 = A04(r2)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            r7.A0D(r4, r2, r8)
            r2.finish()
        L_0x002d:
            android.widget.EdgeEffect r1 = r7.A07
            boolean r0 = r1.isFinished()
            r6 = 0
            if (r0 != 0) goto L_0x00c4
            boolean r5 = r7.A0C(r4, r1, r8)
            float r0 = A04(r1)
            A05(r2, r0, r3)
        L_0x0041:
            android.widget.EdgeEffect r2 = r7.A0C
            float r0 = A04(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r7.A0B(r4, r2, r8)
            r2.finish()
        L_0x0051:
            android.widget.EdgeEffect r1 = r7.A0B
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x006b
            boolean r0 = r7.A0E(r4, r1, r8)
            if (r0 != 0) goto L_0x0063
            r0 = r5
            r5 = 0
            if (r0 == 0) goto L_0x0064
        L_0x0063:
            r5 = 1
        L_0x0064:
            float r0 = A04(r1)
            A05(r2, r0, r3)
        L_0x006b:
            android.widget.EdgeEffect r2 = r7.A0A
            float r0 = A04(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            r7.A0C(r4, r2, r8)
            r2.finish()
        L_0x007b:
            android.widget.EdgeEffect r1 = r7.A09
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x0095
            boolean r0 = r7.A0D(r4, r1, r8)
            if (r0 != 0) goto L_0x008d
            r0 = r5
            r5 = 0
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r5 = 1
        L_0x008e:
            float r0 = A04(r1)
            A05(r2, r0, r3)
        L_0x0095:
            android.widget.EdgeEffect r2 = r7.A06
            float r0 = A04(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a5
            r7.A0E(r4, r2, r8)
            r2.finish()
        L_0x00a5:
            android.widget.EdgeEffect r1 = r7.A05
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00be
            boolean r0 = r7.A0B(r4, r1, r8)
            if (r0 != 0) goto L_0x00b5
            if (r5 == 0) goto L_0x00b6
        L_0x00b5:
            r6 = 1
        L_0x00b6:
            float r0 = A04(r1)
            A05(r2, r0, r3)
            r5 = r6
        L_0x00be:
            if (r5 == 0) goto L_0x00c3
            A0A(r7)
        L_0x00c3:
            return
        L_0x00c4:
            r5 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A0F(X.0vC):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r11.invoke(r0, r3) == r4) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BCX(X.C30391dr r10, X.AnonymousClass1OS r11, long r12) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C07510bF
            if (r0 == 0) goto L_0x0126
            r3 = r10
            X.0bF r3 = (X.C07510bF) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0126
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r6 = r3.result
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r3.label
            r2 = 2
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0088
            if (r0 == r5) goto L_0x0084
            if (r0 != r2) goto L_0x012d
            long r0 = r3.J$0
            java.lang.Object r3 = r3.L$0
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3
            X.C30691eM.A01(r6)
        L_0x002c:
            X.CuU r6 = (X.C26199CuU) r6
            long r4 = r6.A03()
            long r4 = X.C26199CuU.A00(r0, r4)
            r0 = 0
            r3.A04 = r0
            float r2 = X.AnonymousClass001.A02(r4)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            android.widget.EdgeEffect r1 = r3.A07
            int r0 = X.C22339B3q.A01(r2)
        L_0x0047:
            A08(r1, r0)
        L_0x004a:
            float r2 = X.AnonymousClass001.A01(r4)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            android.widget.EdgeEffect r1 = r3.A0B
            int r0 = X.C22339B3q.A01(r2)
        L_0x0058:
            A08(r1, r0)
        L_0x005b:
            long r1 = X.C7C.A00()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            A0A(r3)
        L_0x0066:
            A09(r3)
        L_0x0069:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006c:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            android.widget.EdgeEffect r1 = r3.A05
            int r0 = X.C22339B3q.A01(r2)
            int r0 = -r0
            goto L_0x0058
        L_0x0078:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            android.widget.EdgeEffect r1 = r3.A09
            int r0 = X.C22339B3q.A01(r2)
            int r0 = -r0
            goto L_0x0047
        L_0x0084:
            X.C30691eM.A01(r6)
            goto L_0x0069
        L_0x0088:
            X.C30691eM.A01(r6)
            long r0 = r9.A00
            boolean r0 = X.AnonymousClass0QG.A04(r0)
            if (r0 == 0) goto L_0x00a0
            X.CuU r0 = X.C26199CuU.A01(r12)
            r3.label = r5
            java.lang.Object r0 = r11.invoke(r0, r3)
            if (r0 != r4) goto L_0x0069
        L_0x009f:
            return r4
        L_0x00a0:
            long r0 = X.C26199CuU.A01
            float r1 = X.AnonymousClass001.A02(r12)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0110
            android.widget.EdgeEffect r5 = r9.A07
            float r0 = A04(r5)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0110
            int r0 = X.C22339B3q.A01(r1)
        L_0x00b8:
            A08(r5, r0)
        L_0x00bb:
            float r5 = X.AnonymousClass001.A01(r12)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fa
            android.widget.EdgeEffect r6 = r9.A0B
            float r0 = A04(r6)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            int r0 = X.C22339B3q.A01(r5)
        L_0x00d1:
            A08(r6, r0)
        L_0x00d4:
            long r0 = X.C7D.A00(r1, r5)
            long r6 = X.C7C.A00()
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00e3
            A0A(r9)
        L_0x00e3:
            long r0 = X.C26199CuU.A00(r12, r0)
            X.CuU r5 = X.C26199CuU.A01(r0)
            r3.L$0 = r9
            r3.J$0 = r0
            r3.label = r2
            java.lang.Object r6 = r11.invoke(r5, r3)
            if (r6 == r4) goto L_0x009f
            r3 = r9
            goto L_0x002c
        L_0x00fa:
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x010e
            android.widget.EdgeEffect r6 = r9.A05
            float r0 = A04(r6)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            int r0 = X.C22339B3q.A01(r5)
            int r0 = -r0
            goto L_0x00d1
        L_0x010e:
            r5 = 0
            goto L_0x00d4
        L_0x0110:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0124
            android.widget.EdgeEffect r5 = r9.A09
            float r0 = A04(r5)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0124
            int r0 = X.C22339B3q.A01(r1)
            int r0 = -r0
            goto L_0x00b8
        L_0x0124:
            r1 = 0
            goto L_0x00bb
        L_0x0126:
            X.0bF r3 = new X.0bF
            r3.<init>(r9, r10)
            goto L_0x0012
        L_0x012d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.BCX(X.1dr, X.1OS, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        if (r0 == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0142, code lost:
        if (r1.isFinished() != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0163, code lost:
        if (r1.isFinished() != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0183, code lost:
        if (r1.isFinished() == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018d, code lost:
        if (r4 == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018f, code lost:
        if (r10 == false) goto L_0x0188;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BCY(X.C22821Di r16, int r17, long r18) {
        /*
            r15 = this;
            long r0 = r15.A00
            boolean r2 = X.AnonymousClass0QG.A04(r0)
            r6 = r18
            r8 = r16
            if (r2 == 0) goto L_0x0019
            X.0QY r0 = X.AnonymousClass000.A0e(r6)
            java.lang.Object r0 = r8.invoke(r0)
            X.0QY r0 = (X.AnonymousClass0QY) r0
            long r0 = r0.A00
            return r0
        L_0x0019:
            boolean r2 = r15.A04
            r10 = 1
            if (r2 != 0) goto L_0x0065
            float r2 = X.AnonymousClass0QG.A02(r0)
            long r2 = X.AnonymousClass0LG.A01(r2, r0)
            android.widget.EdgeEffect r0 = r15.A07
            float r0 = A04(r0)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0036
            long r0 = X.AnonymousClass0QY.A03
            r15.A01(r0, r2)
        L_0x0036:
            android.widget.EdgeEffect r0 = r15.A09
            float r0 = A04(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
            long r0 = X.AnonymousClass0QY.A03
            r15.A02(r0, r2)
        L_0x0045:
            android.widget.EdgeEffect r0 = r15.A0B
            float r0 = A04(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            long r0 = X.AnonymousClass0QY.A03
            r15.A03(r0, r2)
        L_0x0054:
            android.widget.EdgeEffect r0 = r15.A05
            float r0 = A04(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            long r0 = X.AnonymousClass0QY.A03
            r15.A00(r0, r2)
        L_0x0063:
            r15.A04 = r10
        L_0x0065:
            X.0QY r0 = r15.A01
            if (r0 == 0) goto L_0x01c6
            long r4 = r0.A00
        L_0x006b:
            float r0 = X.AnonymousClass0QY.A02(r6)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            android.widget.EdgeEffect r1 = r15.A0B
            float r0 = A04(r1)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r1 = r15.A05
            float r0 = A04(r1)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            float r3 = r15.A00(r6, r4)
        L_0x008c:
            float r0 = A04(r1)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0097
            r1.onRelease()
        L_0x0097:
            float r0 = X.AnonymousClass0QY.A01(r6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            android.widget.EdgeEffect r9 = r15.A07
            float r0 = A04(r9)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x01b7
            android.widget.EdgeEffect r9 = r15.A09
            float r0 = A04(r9)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            float r1 = r15.A02(r6, r4)
        L_0x00b7:
            float r0 = A04(r9)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            r9.onRelease()
        L_0x00c2:
            r2 = r1
        L_0x00c3:
            long r2 = X.AnonymousClass001.A0p(r2, r3)
            long r11 = X.AnonymousClass0QY.A03
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            A0A(r15)
        L_0x00d0:
            long r0 = X.AnonymousClass0QY.A04(r6, r2)
            X.0QY r9 = X.AnonymousClass000.A0e(r0)
            java.lang.Object r8 = r8.invoke(r9)
            X.0QY r8 = (X.AnonymousClass0QY) r8
            long r8 = r8.A00
            long r0 = X.AnonymousClass0QY.A04(r0, r8)
            r11 = r17
            if (r11 != r10) goto L_0x01b4
            float r11 = X.AnonymousClass0QY.A01(r0)
            r14 = -1090519040(0xffffffffbf000000, float:-0.5)
            r13 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x01a4
            r15.A01(r0, r4)
        L_0x00f7:
            r12 = 1
        L_0x00f8:
            float r11 = X.AnonymousClass0QY.A02(r0)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0194
            r15.A03(r0, r4)
        L_0x0103:
            r0 = 1
        L_0x0104:
            if (r12 != 0) goto L_0x0108
            if (r0 == 0) goto L_0x01b4
        L_0x0108:
            android.widget.EdgeEffect r1 = r15.A07
            boolean r0 = r1.isFinished()
            r5 = 0
            if (r0 != 0) goto L_0x0192
            float r0 = X.AnonymousClass0QY.A01(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0192
            float r0 = X.AnonymousClass0QY.A01(r6)
            A07(r1, r0)
            boolean r4 = r1.isFinished()
        L_0x0124:
            android.widget.EdgeEffect r1 = r15.A09
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x0145
            float r0 = X.AnonymousClass0QY.A01(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0145
            float r0 = X.AnonymousClass0QY.A01(r6)
            A07(r1, r0)
            if (r4 != 0) goto L_0x0144
            boolean r0 = r1.isFinished()
            r4 = 0
            if (r0 == 0) goto L_0x0145
        L_0x0144:
            r4 = 1
        L_0x0145:
            android.widget.EdgeEffect r1 = r15.A0B
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x0166
            float r0 = X.AnonymousClass0QY.A02(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0166
            float r0 = X.AnonymousClass0QY.A02(r6)
            A07(r1, r0)
            if (r4 != 0) goto L_0x0165
            boolean r0 = r1.isFinished()
            r4 = 0
            if (r0 == 0) goto L_0x0166
        L_0x0165:
            r4 = 1
        L_0x0166:
            android.widget.EdgeEffect r1 = r15.A05
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x018d
            float r0 = X.AnonymousClass0QY.A02(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            float r0 = X.AnonymousClass0QY.A02(r6)
            A07(r1, r0)
            if (r4 != 0) goto L_0x0185
            boolean r0 = r1.isFinished()
            if (r0 == 0) goto L_0x018f
        L_0x0185:
            A0A(r15)
        L_0x0188:
            long r0 = X.AnonymousClass0QY.A05(r2, r8)
            return r0
        L_0x018d:
            if (r4 != 0) goto L_0x0185
        L_0x018f:
            if (r10 == 0) goto L_0x0188
            goto L_0x0185
        L_0x0192:
            r4 = 0
            goto L_0x0124
        L_0x0194:
            float r11 = X.AnonymousClass0QY.A02(r0)
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 >= 0) goto L_0x01a1
            r15.A00(r0, r4)
            goto L_0x0103
        L_0x01a1:
            r0 = 0
            goto L_0x0104
        L_0x01a4:
            float r11 = X.AnonymousClass0QY.A01(r0)
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 >= 0) goto L_0x01b1
            r15.A02(r0, r4)
            goto L_0x00f7
        L_0x01b1:
            r12 = 0
            goto L_0x00f8
        L_0x01b4:
            r10 = 0
            goto L_0x0108
        L_0x01b7:
            float r1 = r15.A01(r6, r4)
            goto L_0x00b7
        L_0x01bd:
            float r3 = r15.A03(r6, r4)
            goto L_0x008c
        L_0x01c3:
            r3 = 0
            goto L_0x0097
        L_0x01c6:
            long r0 = r15.A00
            float r2 = X.AnonymousClass0QG.A02(r0)
            long r4 = X.AnonymousClass0LG.A01(r2, r0)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.BCY(X.1Di, int, long):long");
    }

    public boolean Bf3() {
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (A04((EdgeEffect) list.get(i)) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, AnonymousClass0JZ r10) {
        this.A0E = r10;
        EdgeEffect A062 = A06(context);
        this.A0B = A062;
        EdgeEffect A063 = A06(context);
        this.A05 = A063;
        EdgeEffect A064 = A06(context);
        this.A07 = A064;
        EdgeEffect A065 = A06(context);
        this.A09 = A065;
        EdgeEffect[] edgeEffectArr = new EdgeEffect[4];
        edgeEffectArr[0] = A064;
        edgeEffectArr[1] = A062;
        AnonymousClass001.A1R(A065, A063, edgeEffectArr);
        List A082 = AnonymousClass1ZU.A08(edgeEffectArr);
        this.A0G = A082;
        this.A0C = A06(context);
        this.A06 = A06(context);
        this.A08 = A06(context);
        this.A0A = A06(context);
        int size = A082.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) A082.get(i)).setColor(AnonymousClass0Oy.A00(this.A0E.A00));
        }
        this.A03 = -1;
        C18100vl r0 = AnonymousClass0GU.A01;
        this.A0D = new AnonymousClass08Y(0);
        this.A00 = AnonymousClass0QG.A02;
        C10550iW r3 = new C10550iW(this);
        this.A0H = r3;
        this.A0F = C02650Ev.A00(AnonymousClass0PB.A01(C02880Ft.A00, C27621Wu.A00, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, (C30391dr) null)), r3).CP5(new AnonymousClass0Bb(this, AnonymousClass0O1.A01()));
    }

    private final float A00(long j, long j2) {
        float A012 = AnonymousClass0QY.A01(j2);
        long j3 = this.A00;
        float A022 = A012 / AnonymousClass0QG.A02(j3);
        EdgeEffect edgeEffect = this.A05;
        float A002 = (-A05(edgeEffect, -(AnonymousClass0QY.A02(j) / AnonymousClass0QG.A00(j3)), 1.0f - A022)) * AnonymousClass0QG.A00(this.A00);
        if (A04(edgeEffect) != 0.0f) {
            return AnonymousClass0QY.A02(j);
        }
        return A002;
    }

    private final float A01(long j, long j2) {
        float A022 = AnonymousClass0QY.A02(j2);
        long j3 = this.A00;
        float A002 = A022 / AnonymousClass0QG.A00(j3);
        EdgeEffect edgeEffect = this.A07;
        float A052 = A05(edgeEffect, AnonymousClass0QY.A01(j) / AnonymousClass0QG.A02(j3), 1.0f - A002) * AnonymousClass0QG.A02(this.A00);
        if (A04(edgeEffect) != 0.0f) {
            return AnonymousClass0QY.A01(j);
        }
        return A052;
    }

    private final float A02(long j, long j2) {
        float A022 = AnonymousClass0QY.A02(j2);
        long j3 = this.A00;
        float A002 = A022 / AnonymousClass0QG.A00(j3);
        EdgeEffect edgeEffect = this.A09;
        float A023 = (-A05(edgeEffect, -(AnonymousClass0QY.A01(j) / AnonymousClass0QG.A02(j3)), A002)) * AnonymousClass0QG.A02(this.A00);
        if (A04(edgeEffect) != 0.0f) {
            return AnonymousClass0QY.A01(j);
        }
        return A023;
    }

    private final float A03(long j, long j2) {
        float A012 = AnonymousClass0QY.A01(j2);
        long j3 = this.A00;
        float A022 = A012 / AnonymousClass0QG.A02(j3);
        EdgeEffect edgeEffect = this.A0B;
        float A052 = A05(edgeEffect, AnonymousClass0QY.A02(j) / AnonymousClass0QG.A00(j3), A022) * AnonymousClass0QG.A00(this.A00);
        if (A04(edgeEffect) != 0.0f) {
            return AnonymousClass0QY.A02(j);
        }
        return A052;
    }

    private final boolean A0B(Canvas canvas, EdgeEffect edgeEffect, C17770vC r9) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        float CPQ = r9.CPQ(this.A0E.A01.BDk());
        long j = this.A00;
        canvas.translate(-AnonymousClass0QG.A02(j), (-AnonymousClass0QG.A00(j)) + CPQ);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean A0C(Canvas canvas, EdgeEffect edgeEffect, C17770vC r7) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-AnonymousClass0QG.A00(this.A00), r7.CPQ(this.A0E.A01.BDp(r7.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean A0D(Canvas canvas, EdgeEffect edgeEffect, C17770vC r8) {
        int save = canvas.save();
        int A012 = C22339B3q.A01(AnonymousClass0QG.A02(this.A00));
        float BDx = this.A0E.A01.BDx(r8.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-((float) A012)) + r8.CPQ(BDx));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean A0E(Canvas canvas, EdgeEffect edgeEffect, C17770vC r6) {
        int save = canvas.save();
        canvas.translate(0.0f, r6.CPQ(this.A0E.A01.BE0()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public C17090tj BR8() {
        return this.A0F;
    }
}
