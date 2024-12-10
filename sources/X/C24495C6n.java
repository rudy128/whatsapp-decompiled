package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.C6n  reason: case insensitive filesystem */
public abstract class C24495C6n {
    public int A00(View view) {
        if ((this instanceof BLA) || (this instanceof BLC)) {
            return view.getWidth();
        }
        if (!(this instanceof BLB)) {
            return 0;
        }
        BLB blb = (BLB) this;
        if (1 - blb.A00 == 0) {
            return ((SideSheetBehavior) blb.A01).A04;
        }
        return 0;
    }

    public int A01(View view) {
        if ((this instanceof BLA) || (this instanceof BLD)) {
            return view.getHeight();
        }
        if (!(this instanceof BLB)) {
            return 0;
        }
        BLB blb = (BLB) this;
        if (blb.A00 != 0) {
            return 0;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) blb.A01;
        if (bottomSheetBehavior.A0X) {
            return bottomSheetBehavior.A0E;
        }
        return bottomSheetBehavior.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r1 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r2 = r3.A01;
        r1 = r5.getWidth() + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(android.view.View r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.BLA
            if (r0 == 0) goto L_0x0005
            return r6
        L_0x0005:
            boolean r0 = r4 instanceof X.BLD
            if (r0 == 0) goto L_0x000e
            int r0 = r5.getLeft()
            return r0
        L_0x000e:
            boolean r0 = r4 instanceof X.BLC
            if (r0 == 0) goto L_0x004f
            r3 = r4
            X.BLC r3 = (X.BLC) r3
            int r0 = r5.getLayoutDirection()
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r0, r2)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.A02
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0034
            if (r1 == 0) goto L_0x0038
        L_0x0026:
            int r2 = r3.A01
            int r0 = r5.getWidth()
            int r2 = r2 - r0
            int r1 = r3.A01
        L_0x002f:
            int r0 = X.BE8.A06(r2, r6, r1)
            return r0
        L_0x0034:
            if (r0 != r2) goto L_0x0040
            if (r1 == 0) goto L_0x0026
        L_0x0038:
            int r2 = r3.A01
            int r1 = r5.getWidth()
            int r1 = r1 + r2
            goto L_0x002f
        L_0x0040:
            int r2 = r3.A01
            int r0 = r5.getWidth()
            int r2 = r2 - r0
            int r0 = r3.A01
            int r1 = r5.getWidth()
            int r1 = r1 + r0
            goto L_0x002f
        L_0x004f:
            r1 = r4
            X.BLB r1 = (X.BLB) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x006f
            java.lang.Object r2 = r1.A01
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            X.Cgh r0 = r2.A0B
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r0.A00
            int r1 = r0.A04
            int r0 = r0.A01
            int r1 = X.BE8.A04(r1, r0)
            int r0 = r2.A04
            if (r6 < r1) goto L_0x006e
            r1 = r6
            if (r6 <= r0) goto L_0x006e
            return r0
        L_0x006e:
            return r1
        L_0x006f:
            int r1 = r5.getLeft()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24495C6n.A02(android.view.View, int):int");
    }

    public int A03(View view, int i) {
        if (this instanceof BLA) {
            return i;
        }
        if (this instanceof BLD) {
            BLD bld = (BLD) this;
            return BE8.A06(bld.A01 - view.getWidth(), i, bld.A01 + view.getWidth());
        } else if (this instanceof BLC) {
            return view.getTop();
        } else {
            BLB blb = (BLB) this;
            if (blb.A00 != 0) {
                return view.getTop();
            }
            int A0Q = ((BottomSheetBehavior) blb.A01).A0Q();
            int A01 = blb.A01(view);
            if (i < A0Q) {
                return A0Q;
            }
            if (i <= A01) {
                return i;
            }
            return A01;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0246, code lost:
        if (r16 < 0.0f) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0276, code lost:
        if (r16 <= 0.0f) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028e, code lost:
        if (java.lang.Math.abs(r15.getLeft() - r5.A01) >= X.BE6.A04(X.C108945cZ.A03(r15), 0.5f)) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0291, code lost:
        r4 = r5.A01;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ef, code lost:
        if (r2 > ((r1 - X.BE8.A04(r1, r7.A01)) / 2)) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0317, code lost:
        if (X.C108945cZ.A05(r3, X.BE8.A04(r2, r7.A01)) < X.C108945cZ.A05(r3, r2)) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if (r1 > r2.A08) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x037e, code lost:
        if (r4 < r0) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a6, code lost:
        if (X.C108945cZ.A05(r4, r0) < X.C108945cZ.A05(r4, r2.A04)) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03bd, code lost:
        if (X.C108945cZ.A05(r4, r2.A06) < X.C108945cZ.A05(r4, r2.A04)) goto L_0x0380;
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r15, float r16, float r17) {
        /*
            r14 = this;
            r4 = r17
            boolean r0 = r14 instanceof X.BLA
            if (r0 == 0) goto L_0x01a2
            r5 = r14
            X.BLA r5 = (X.BLA) r5
            X.BIe r3 = r5.A00
            android.view.View r0 = r3.A0D
            if (r0 == 0) goto L_0x00a9
            if (r0 != r15) goto L_0x00a9
            float r2 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r4)
            r1 = 1077936128(0x40400000, float:3.0)
            r13 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0194
            float r0 = r16 / r17
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            r4 = 0
        L_0x002b:
            r7 = 1
            r6 = 0
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0175
            int r0 = r15.getWidth()
            int r1 = r3.A03(r0)
            r12 = 0
        L_0x003a:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0147
            int r0 = r15.getHeight()
            int r8 = r3.A04(r0)
        L_0x0046:
            android.util.DisplayMetrics r10 = X.AnonymousClass3Ma.A09(r3)
            int r0 = r3.A09
            int r0 = X.C108945cZ.A05(r1, r0)
            float r0 = (float) r0
            float r2 = r10.density
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r11 = X.C108975cc.A1A(r0)
            int r0 = r3.A0A
            int r0 = X.C108945cZ.A05(r8, r0)
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r9 = X.C108975cc.A1A(r0)
            if (r12 != 0) goto L_0x0072
            int r2 = r15.getTop()
            int r0 = r10.heightPixels
            int r0 = r0 / 3
            if (r2 <= r0) goto L_0x0116
        L_0x0072:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x00aa
            r3.A0N = r7
            X.E2v r0 = r3.A0H
            if (r0 == 0) goto L_0x0083
            X.DQx r0 = (X.C27052DQx) r0
            X.DR0 r0 = r0.A00
            r0.BKs(r7)
        L_0x0083:
            X.BID r5 = r3.A0J
            if (r5 == 0) goto L_0x00a9
            android.content.res.Resources r4 = r3.getResources()
            X.BID r0 = r3.A0J
            android.content.Context r2 = r0.getContext()
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r0 = X.AnonymousClass3Ma.A01(r2, r4, r1, r0)
            r5.A0B(r6, r0)
            X.BID r1 = r3.A0J
            r0 = 6
            r1.setPlayerElevation(r0)
            X.BID r0 = r3.A0J
            r0.setVisibility(r6)
        L_0x00a9:
            return
        L_0x00aa:
            if (r12 == 0) goto L_0x0116
            boolean r0 = r3.A0T
            if (r0 == 0) goto L_0x0116
            if (r11 == 0) goto L_0x00b4
            if (r9 != 0) goto L_0x00cb
        L_0x00b4:
            r2 = 1169915904(0x45bb8000, float:6000.0)
            if (r11 == 0) goto L_0x00c1
            float r0 = java.lang.Math.abs(r16)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
        L_0x00c1:
            if (r9 == 0) goto L_0x0116
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0116
        L_0x00cb:
            r3.A0F = r15
            r3.A0R = r7
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0101
            float r0 = r15.getX()
            int r1 = (int) r0
        L_0x00d8:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00f1
            float r0 = r15.getY()
            int r2 = (int) r0
        L_0x00e1:
            X.Cwc r0 = r3.A0Y
            r0.A0J(r15, r1, r2)
            r1 = 11
            X.7RJ r0 = new X.7RJ
            r0.<init>(r5, r1)
            r3.postOnAnimation(r0)
            goto L_0x0083
        L_0x00f1:
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            int r0 = r15.getHeight()
            if (r2 <= 0) goto L_0x00fe
            int r2 = X.AnonymousClass3MW.A02(r3, r0)
            goto L_0x00e1
        L_0x00fe:
            int r2 = r0 * -2
            goto L_0x00e1
        L_0x0101:
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            int r1 = r15.getWidth()
            int r0 = r3.getWidth()
            int r1 = r1 + r0
            goto L_0x00d8
        L_0x010f:
            int r0 = r15.getHeight()
            int r1 = r0 * -2
            goto L_0x00d8
        L_0x0116:
            boolean r2 = r3.A0O
            X.Cwc r0 = r3.A0Y
            if (r2 != 0) goto L_0x0128
            r0.A0G(r1, r8)
            r3.A06 = r1
            r3.A07 = r8
        L_0x0123:
            r3.invalidate()
            goto L_0x0083
        L_0x0128:
            r0.A0G(r6, r6)
            X.BID r0 = r3.A0J
            if (r0 == 0) goto L_0x0142
            X.BwF r0 = (X.C24149BwF) r0
            X.70X r0 = r0.A0H
            if (r0 == 0) goto L_0x0142
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x0142
            X.BID r1 = r3.A0J
            r0 = 100
            r1.A0A(r0)
        L_0x0142:
            r3.A06 = r6
            r3.A07 = r6
            goto L_0x0123
        L_0x0147:
            int r10 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            int r8 = r15.getHeight()
            int r9 = r3.getBottomOfDraggableArea()
            int r9 = r9 - r8
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.A00
            float r2 = r2 - r0
            float r8 = (float) r8
            float r2 = r2 * r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            int r0 = (int) r2
            int r9 = r9 + r0
            int r2 = r3.getTopOfDraggableArea()
            int r0 = X.C22655BIe.A00(r3, r8)
            if (r10 <= 0) goto L_0x0170
            int r2 = r2 - r0
            int r8 = java.lang.Math.max(r9, r2)
        L_0x016d:
            r12 = 1
            goto L_0x0046
        L_0x0170:
            int r8 = X.BE6.A09(r2, r0, r9)
            goto L_0x016d
        L_0x0175:
            int r1 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            int r0 = r15.getWidth()
            if (r1 <= 0) goto L_0x018a
            int r1 = r3.getRightOfDraggableArea()
            int r1 = r1 - r0
            int r0 = X.C22655BIe.A01(r3, r0)
            int r1 = r1 + r0
        L_0x0187:
            r12 = 1
            goto L_0x003a
        L_0x018a:
            int r1 = r3.getLeftOfDraggableArea()
            int r0 = X.C22655BIe.A01(r3, r0)
            int r1 = r1 - r0
            goto L_0x0187
        L_0x0194:
            float r0 = r17 / r16
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            r16 = 0
            goto L_0x002b
        L_0x01a2:
            boolean r0 = r14 instanceof X.BLD
            if (r0 == 0) goto L_0x021d
            r5 = r14
            X.BLD r5 = (X.BLD) r5
            r0 = -1
            r5.A00 = r0
            com.whatsapp.gesture.VerticalSwipeDismissBehavior r3 = r5.A04
            int r6 = r5.A01
            float r1 = java.lang.Math.abs(r4)
            int r0 = r15.getHeight()
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01f9
            int r2 = r15.getTop()
            int r2 = r2 - r6
            float r1 = X.C108945cZ.A04(r15)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = X.BE6.A04(r1, r0)
            int r0 = java.lang.Math.abs(r2)
            if (r0 >= r1) goto L_0x01f9
            int r4 = r5.A01
            r2 = 0
        L_0x01d8:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x01e6
            if (r2 == 0) goto L_0x020a
            X.E9X r0 = r3.A04
            if (r0 == 0) goto L_0x020a
        L_0x01e2:
            r0.Brt()
            return
        L_0x01e6:
            X.Cwc r1 = r3.A03
            int r0 = r15.getLeft()
            boolean r0 = r1.A0G(r0, r4)
            if (r0 != 0) goto L_0x0216
            if (r2 == 0) goto L_0x00a9
            X.E9X r0 = r3.A04
            if (r0 == 0) goto L_0x00a9
            goto L_0x01e2
        L_0x01f9:
            int r1 = r15.getTop()
            int r4 = r5.A01
            int r0 = r15.getHeight()
            if (r1 >= r4) goto L_0x0208
            int r4 = r4 - r0
        L_0x0206:
            r2 = 1
            goto L_0x01d8
        L_0x0208:
            int r4 = r4 + r0
            goto L_0x0206
        L_0x020a:
            X.Cwc r1 = r3.A03
            int r0 = r15.getLeft()
            boolean r0 = r1.A0G(r0, r4)
            if (r0 == 0) goto L_0x00a9
        L_0x0216:
            r0 = 0
            X.7Qx r1 = new X.7Qx
            r1.<init>(r3, r15, r0, r2)
            goto L_0x026a
        L_0x021d:
            boolean r0 = r14 instanceof X.BLC
            if (r0 == 0) goto L_0x029f
            r5 = r14
            X.BLC r5 = (X.BLC) r5
            r0 = -1
            r5.A00 = r0
            int r6 = r15.getWidth()
            r1 = 1
            r3 = 0
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0279
            int r0 = r15.getLayoutDirection()
            boolean r2 = X.AnonymousClass000.A1T(r0, r1)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r5.A02
            int r1 = r0.A02
            r0 = 2
            if (r1 == r0) goto L_0x0248
            if (r1 != 0) goto L_0x0272
            if (r2 == 0) goto L_0x0274
        L_0x0244:
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0291
        L_0x0248:
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x026e
            int r0 = r15.getLeft()
            int r4 = r5.A01
            if (r0 < r4) goto L_0x026e
            int r4 = r4 + r6
        L_0x0255:
            r3 = 1
        L_0x0256:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r5.A02
            X.Cwc r1 = r2.A03
            int r0 = r15.getTop()
            boolean r0 = r1.A0G(r4, r0)
            if (r0 == 0) goto L_0x0295
            r0 = 4
            X.7RF r1 = new X.7RF
            r1.<init>(r2, r15, r0, r3)
        L_0x026a:
            r15.postOnAnimation(r1)
            return
        L_0x026e:
            int r4 = r5.A01
            int r4 = r4 - r6
            goto L_0x0255
        L_0x0272:
            if (r2 == 0) goto L_0x0244
        L_0x0274:
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0291
            goto L_0x0248
        L_0x0279:
            int r2 = r15.getLeft()
            int r0 = r5.A01
            int r2 = r2 - r0
            float r1 = X.C108945cZ.A03(r15)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = X.BE6.A04(r1, r0)
            int r0 = java.lang.Math.abs(r2)
            if (r0 < r1) goto L_0x0291
            goto L_0x0248
        L_0x0291:
            int r4 = r5.A01
            r3 = 0
            goto L_0x0256
        L_0x0295:
            if (r3 == 0) goto L_0x00a9
            X.E5i r0 = r2.A04
            if (r0 == 0) goto L_0x00a9
            r0.Brq(r15)
            return
        L_0x029f:
            r2 = r14
            X.BLB r2 = (X.BLB) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x031a
            java.lang.Object r6 = r2.A01
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            X.Cgh r3 = r6.A0B
            r5 = 3
            r2 = 0
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x02db
            int r0 = r15.getRight()
            float r1 = (float) r0
            com.google.android.material.sidesheet.SideSheetBehavior r7 = r3.A00
            float r0 = r7.A00
            float r0 = r16 * r0
            float r1 = r1 + r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f2
            float r1 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e0
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e0
        L_0x02da:
            r5 = 5
        L_0x02db:
            r0 = 1
            com.google.android.material.sidesheet.SideSheetBehavior.A01(r15, r6, r5, r0)
            return
        L_0x02e0:
            int r2 = r15.getLeft()
            int r1 = r7.A04
            int r0 = r7.A01
            int r0 = X.BE8.A04(r1, r0)
            int r1 = r1 - r0
            int r0 = r1 / 2
            if (r2 <= r0) goto L_0x02db
            goto L_0x02da
        L_0x02f2:
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0303
            float r1 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0303
            goto L_0x02da
        L_0x0303:
            int r3 = r15.getLeft()
            int r2 = r7.A04
            int r0 = r7.A01
            int r0 = X.BE8.A04(r2, r0)
            int r1 = X.C108945cZ.A05(r3, r0)
            int r0 = X.C108945cZ.A05(r3, r2)
            if (r1 >= r0) goto L_0x02da
            goto L_0x02db
        L_0x031a:
            r3 = 6
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            java.lang.Object r2 = r2.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            if (r0 >= 0) goto L_0x0338
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x0380
            int r1 = r15.getTop()
            java.lang.System.currentTimeMillis()
            int r0 = r2.A08
            if (r1 <= r0) goto L_0x0380
        L_0x0333:
            r0 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior.A07(r15, r2, r3, r0)
            return
        L_0x0338:
            boolean r0 = r2.A0X
            if (r0 == 0) goto L_0x0382
            boolean r0 = r2.A0e(r15, r4)
            if (r0 == 0) goto L_0x0382
            float r1 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0355
            int r0 = r2.A0I
            float r0 = (float) r0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x03cb
        L_0x0355:
            int r4 = r15.getTop()
            int r1 = r2.A0E
            int r0 = r2.A0Q()
            int r1 = r1 + r0
            int r0 = r1 / 2
            if (r4 > r0) goto L_0x03cb
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x0380
            int r1 = r15.getTop()
            int r0 = r2.A0Q()
            int r4 = X.C108945cZ.A05(r1, r0)
            int r1 = r15.getTop()
            int r0 = r2.A08
            int r0 = X.C108945cZ.A05(r1, r0)
        L_0x037e:
            if (r4 >= r0) goto L_0x0333
        L_0x0380:
            r3 = 3
            goto L_0x0333
        L_0x0382:
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03a9
            float r1 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x03a9
            boolean r0 = r2.A0V
            if (r0 != 0) goto L_0x03ce
            int r4 = r15.getTop()
            int r0 = r2.A08
        L_0x039c:
            int r1 = X.C108945cZ.A05(r4, r0)
            int r0 = r2.A04
            int r0 = X.C108945cZ.A05(r4, r0)
            if (r1 >= r0) goto L_0x03ce
            goto L_0x0333
        L_0x03a9:
            int r4 = r15.getTop()
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x03c0
            int r0 = r2.A06
            int r1 = X.C108945cZ.A05(r4, r0)
            int r0 = r2.A04
            int r0 = X.C108945cZ.A05(r4, r0)
            if (r1 >= r0) goto L_0x03ce
            goto L_0x0380
        L_0x03c0:
            int r0 = r2.A08
            if (r4 >= r0) goto L_0x039c
            int r0 = r2.A04
            int r0 = X.C108945cZ.A05(r4, r0)
            goto L_0x037e
        L_0x03cb:
            r3 = 5
            goto L_0x0333
        L_0x03ce:
            r3 = 4
            goto L_0x0333
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24495C6n.A04(android.view.View, float, float):void");
    }

    public void A05(View view, int i) {
        BID bid;
        if (this instanceof BLA) {
            ViewParent parent = view.getParent();
            C22655BIe bIe = ((BLA) this).A00;
            bIe.A09 = bIe.A06;
            bIe.A0A = bIe.A07;
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (bIe.A0O && (bid = bIe.A0J) != null) {
                bid.A0B(AnonymousClass3Ma.A01(bIe.A0J.getContext(), bIe.getResources(), 2130968798, 2131099872), 0);
                bIe.A0J.setPlayerElevation(0);
                bIe.A0J.setVisibility(8);
                AnonymousClass70X r0 = ((C24149BwF) bIe.A0J).A0H;
                if (r0 != null && r0.A0a()) {
                    bIe.A0J.A09();
                }
            }
        } else if (this instanceof BLD) {
            BLD bld = (BLD) this;
            if (bld.A00 == -1) {
                bld.A00 = i;
                bld.A01 = view.getTop();
            }
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                if (parent2 instanceof CoordinatorLayout) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    int childCount = viewGroup.getChildCount();
                    int i2 = 0;
                    while (i2 < childCount) {
                        if (((C37891qK) viewGroup.getChildAt(i2).getLayoutParams()).A0A != bld.A04) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if (this instanceof BLC) {
            BLC blc = (BLC) this;
            blc.A00 = i;
            blc.A01 = view.getLeft();
            ViewParent parent3 = view.getParent();
            if (parent3 != null) {
                SwipeDismissBehavior swipeDismissBehavior = blc.A02;
                swipeDismissBehavior.A05 = true;
                parent3.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.A05 = false;
            }
        }
    }

    public void A06(View view, int i, int i2) {
        View A0O;
        ViewGroup.MarginLayoutParams A0B;
        if (this instanceof BLA) {
            C22655BIe bIe = ((BLA) this).A00;
            if (!bIe.A0P) {
                bIe.A0G.A01(view);
            }
            if (bIe.A0Y.A02 == 1 && !bIe.A0R) {
                bIe.A07 = view.getTop();
                bIe.A06 = view.getLeft();
            }
        } else if (this instanceof BLD) {
            E9X e9x = ((BLD) this).A04.A04;
            if (e9x != null) {
                e9x.C5n(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / C108945cZ.A04(view)));
            }
        } else if (this instanceof BLC) {
            BLC blc = (BLC) this;
            float A03 = C108945cZ.A03(view);
            SwipeDismissBehavior swipeDismissBehavior = blc.A02;
            float f = A03 * swipeDismissBehavior.A01;
            float A032 = C108945cZ.A03(view) * swipeDismissBehavior.A00;
            float A05 = (float) C108945cZ.A05(i, blc.A01);
            if (A05 <= f) {
                view.setAlpha(1.0f);
            } else if (A05 >= A032) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(BE8.A00(0.0f, 1.0f - ((A05 - f) / (A032 - f)), 1.0f));
            }
        } else {
            BLB blb = (BLB) this;
            if (blb.A00 != 0) {
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) blb.A01;
                WeakReference weakReference = sideSheetBehavior.A0C;
                if (!(weakReference == null || (A0O = C108945cZ.A0O(weakReference)) == null || (A0B = AnonymousClass3MW.A0B(A0O)) == null)) {
                    C25486Cgh cgh = sideSheetBehavior.A0B;
                    int left = view.getLeft();
                    view.getRight();
                    int i3 = cgh.A00.A04;
                    if (left <= i3) {
                        A0B.rightMargin = i3 - left;
                    }
                    A0O.setLayoutParams(A0B);
                }
                Set set = sideSheetBehavior.A0H;
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass000.A0s("onSlide");
                    }
                    return;
                }
                return;
            }
            ((BottomSheetBehavior) blb.A01).A0U(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(android.view.View r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.BLA
            if (r0 == 0) goto L_0x0016
            r0 = r4
            X.BLA r0 = (X.BLA) r0
            X.BIe r1 = r0.A00
            android.view.View r0 = r1.A0D
            if (r0 == 0) goto L_0x0014
            if (r5 != r0) goto L_0x0014
            boolean r0 = r1.A0S
            r1 = 1
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        L_0x0016:
            boolean r0 = r4 instanceof X.BLD
            if (r0 == 0) goto L_0x002d
            r0 = r4
            X.BLD r0 = (X.BLD) r0
            com.whatsapp.gesture.VerticalSwipeDismissBehavior r1 = r0.A04
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0014
            X.E9X r0 = r1.A04
            boolean r0 = r0.BeX(r5)
        L_0x0029:
            r1 = 1
            if (r0 != 0) goto L_0x0015
            goto L_0x0014
        L_0x002d:
            boolean r0 = r4 instanceof X.BLC
            if (r0 == 0) goto L_0x0046
            r2 = r4
            X.BLC r2 = (X.BLC) r2
            int r1 = r2.A00
            r0 = -1
            if (r1 == r0) goto L_0x003b
            if (r1 != r6) goto L_0x0014
        L_0x003b:
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.A02
            boolean r0 = r0 instanceof com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            if (r0 == 0) goto L_0x0044
            boolean r0 = r5 instanceof X.BIE
            goto L_0x0029
        L_0x0044:
            r0 = 1
            goto L_0x0029
        L_0x0046:
            r1 = r4
            X.BLB r1 = (X.BLB) r1
            int r0 = r1.A00
            java.lang.Object r3 = r1.A01
            if (r0 == 0) goto L_0x0063
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            int r1 = r3.A05
            r2 = 0
            r0 = 1
            if (r1 == r0) goto L_0x0062
            java.lang.ref.WeakReference r0 = r3.A0D
        L_0x0059:
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r0.get()
            if (r0 != r5) goto L_0x0062
            r2 = 1
        L_0x0062:
            return r2
        L_0x0063:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            int r1 = r3.A0J
            r2 = 0
            r0 = 1
            if (r1 == r0) goto L_0x0062
            boolean r0 = r3.A0i
            if (r0 != 0) goto L_0x0062
            r0 = 3
            if (r1 != r0) goto L_0x0088
            int r0 = r3.A03
            if (r0 != r6) goto L_0x0088
            java.lang.ref.WeakReference r0 = r3.A0R
            if (r0 == 0) goto L_0x0088
            android.view.View r1 = X.C108945cZ.A0O(r0)
            if (r1 == 0) goto L_0x0088
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0088
            return r2
        L_0x0088:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r0 = r3.A0S
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24495C6n.A07(android.view.View, int):boolean");
    }
}
