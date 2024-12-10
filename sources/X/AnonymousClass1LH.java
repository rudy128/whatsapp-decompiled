package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.1LH  reason: invalid class name */
public abstract class AnonymousClass1LH extends AnonymousClass1LG {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    public static void A01(C62392rK r4) {
        View view = r4.A00;
        int visibility = view.getVisibility();
        Map map = r4.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0209, code lost:
        if (r6 == null) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r18 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r6 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012f, code lost:
        if (r2 == r0) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0147, code lost:
        if (r5 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0149, code lost:
        if (r3 == 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0169, code lost:
        if (r3 == 0) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0170, code lost:
        if (r5 == null) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x020d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A03(android.view.ViewGroup r16, X.C62392rK r17, X.C62392rK r18) {
        /*
            r15 = this;
            java.lang.String r13 = "android:visibility:parent"
            r7 = 0
            java.lang.String r0 = "android:visibility:visibility"
            r10 = r17
            if (r17 == 0) goto L_0x0217
            java.util.Map r2 = r10.A02
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto L_0x0217
            java.lang.Object r1 = r2.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r6 = r1.intValue()
            java.lang.Object r5 = r2.get(r13)
        L_0x001f:
            r8 = r18
            if (r18 == 0) goto L_0x0214
            java.util.Map r2 = r8.A02
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto L_0x0214
            java.lang.Object r1 = r2.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            java.lang.Object r7 = r2.get(r13)
        L_0x0039:
            r4 = r16
            if (r17 == 0) goto L_0x0045
            if (r18 == 0) goto L_0x0049
            if (r6 != r3) goto L_0x0165
            if (r5 != r7) goto L_0x0165
        L_0x0043:
            r9 = 0
        L_0x0044:
            return r9
        L_0x0045:
            if (r3 == 0) goto L_0x016b
            if (r18 != 0) goto L_0x0043
        L_0x0049:
            if (r6 != 0) goto L_0x0043
        L_0x004b:
            r1 = 0
        L_0x004c:
            if (r5 != 0) goto L_0x0050
            if (r7 == 0) goto L_0x0043
        L_0x0050:
            if (r1 != 0) goto L_0x0172
            int r1 = r15.A00
            r2 = r1 & 2
            r9 = 0
            r1 = 2
            if (r2 != r1) goto L_0x0044
            if (r17 == 0) goto L_0x0044
            android.view.View r12 = r10.A00
            if (r18 == 0) goto L_0x0162
            android.view.View r5 = r8.A00
        L_0x0062:
            r1 = 2131434794(0x7f0b1d2a, float:1.8491412E38)
            java.lang.Object r2 = r12.getTag(r1)
            android.view.View r2 = (android.view.View) r2
            r11 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0080
            r6 = 1
        L_0x0070:
            android.animation.ObjectAnimator r9 = r15.A0W(r2, r4, r10)
            if (r6 != 0) goto L_0x0044
            if (r9 != 0) goto L_0x021b
            android.view.ViewGroupOverlay r0 = r4.getOverlay()
            r0.remove(r2)
            return r9
        L_0x0080:
            if (r5 == 0) goto L_0x00a9
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L_0x0135
            r1 = 4
            if (r3 == r1) goto L_0x008d
            if (r12 != r5) goto L_0x00a9
        L_0x008d:
            int r1 = r5.getVisibility()
            X.C6l r0 = X.C25446Cfx.A02
            r0.A05(r5, r11)
            android.animation.ObjectAnimator r9 = r15.A0W(r5, r4, r10)
            if (r9 == 0) goto L_0x022a
            X.25s r0 = new X.25s
            r0.<init>(r5, r3)
            r9.addListener(r0)
            r9.addPauseListener(r0)
            goto L_0x0226
        L_0x00a9:
            android.view.ViewParent r1 = r12.getParent()
            if (r1 != 0) goto L_0x00e3
            r6 = 0
            r2 = r12
        L_0x00b1:
            java.util.Map r1 = r10.A02
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r0 = r1.get(r0)
            int[] r0 = (int[]) r0
            r5 = r0[r11]
            r3 = r0[r8]
            r0 = 2
            int[] r1 = new int[r0]
            r4.getLocationOnScreen(r1)
            r0 = r1[r11]
            int r5 = r5 - r0
            int r0 = r2.getLeft()
            int r5 = r5 - r0
            r2.offsetLeftAndRight(r5)
            r0 = r1[r8]
            int r3 = r3 - r0
            int r0 = r2.getTop()
            int r3 = r3 - r0
            r2.offsetTopAndBottom(r3)
            android.view.ViewGroupOverlay r0 = r4.getOverlay()
            r0.add(r2)
            goto L_0x0070
        L_0x00e3:
            android.view.ViewParent r1 = r12.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L_0x0044
            android.view.ViewParent r7 = r12.getParent()
            android.view.View r7 = (android.view.View) r7
            X.2rK r6 = r15.A06(r7, r8)
            X.2rK r5 = r15.A05(r7, r8)
            if (r6 == 0) goto L_0x015f
            java.util.Map r2 = r6.A02
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto L_0x015f
            java.lang.Object r1 = r2.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            java.lang.Object r2 = r2.get(r13)
        L_0x0111:
            if (r5 == 0) goto L_0x015c
            java.util.Map r14 = r5.A02
            boolean r1 = r14.containsKey(r0)
            if (r1 == 0) goto L_0x015c
            java.lang.Object r0 = r14.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r14.get(r13)
        L_0x0129:
            if (r6 == 0) goto L_0x0145
            if (r5 == 0) goto L_0x0149
            if (r3 != r1) goto L_0x0139
            if (r2 != r0) goto L_0x0139
        L_0x0131:
            android.widget.ImageView r5 = X.C25368CeT.A00(r12, r7, r4)
        L_0x0135:
            r6 = 0
            r2 = r5
            goto L_0x00b1
        L_0x0139:
            if (r3 == r1) goto L_0x0140
            if (r3 == 0) goto L_0x014b
            if (r1 != 0) goto L_0x0131
            goto L_0x014b
        L_0x0140:
            if (r0 == 0) goto L_0x014b
            if (r2 != 0) goto L_0x0131
            goto L_0x014b
        L_0x0145:
            if (r1 == 0) goto L_0x014b
            if (r5 != 0) goto L_0x0131
        L_0x0149:
            if (r3 != 0) goto L_0x0131
        L_0x014b:
            int r1 = r7.getId()
            android.view.ViewParent r0 = r7.getParent()
            if (r0 != 0) goto L_0x0044
            r0 = -1
            if (r1 == r0) goto L_0x0044
            r4.findViewById(r1)
            return r9
        L_0x015c:
            r1 = -1
            r0 = r9
            goto L_0x0129
        L_0x015f:
            r3 = -1
            r2 = r9
            goto L_0x0111
        L_0x0162:
            r5 = r9
            goto L_0x0062
        L_0x0165:
            if (r6 == r3) goto L_0x016e
            if (r6 == 0) goto L_0x004b
            if (r3 != 0) goto L_0x0043
        L_0x016b:
            r1 = 1
            goto L_0x004c
        L_0x016e:
            if (r7 == 0) goto L_0x004b
            if (r5 != 0) goto L_0x0043
        L_0x0172:
            int r1 = r15.A00
            r2 = 1
            r1 = r1 & 1
            r9 = 0
            if (r1 != r2) goto L_0x0044
            if (r18 == 0) goto L_0x0044
            if (r17 != 0) goto L_0x01c7
            android.view.View r1 = r8.A00
            android.view.ViewParent r2 = r1.getParent()
            android.view.View r2 = (android.view.View) r2
            r1 = 0
            X.2rK r7 = r15.A05(r2, r1)
            X.2rK r6 = r15.A06(r2, r1)
            if (r7 == 0) goto L_0x0211
            java.util.Map r2 = r7.A02
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto L_0x0211
            java.lang.Object r1 = r2.get(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r5 = r1.intValue()
            java.lang.Object r3 = r2.get(r13)
        L_0x01a7:
            if (r6 == 0) goto L_0x020e
            java.util.Map r2 = r6.A02
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto L_0x020e
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.get(r13)
        L_0x01bf:
            if (r7 == 0) goto L_0x0207
            if (r6 == 0) goto L_0x020b
            if (r5 != r1) goto L_0x01fb
            if (r3 != r0) goto L_0x01fb
        L_0x01c7:
            android.view.View r6 = r8.A00
            r7 = r15
            boolean r0 = r15 instanceof X.AnonymousClass1LI
            if (r0 == 0) goto L_0x022e
            X.1LI r7 = (X.AnonymousClass1LI) r7
            java.util.Map r1 = r8.A02
            java.lang.String r0 = "android:slide:screenPosition"
            java.lang.Object r1 = r1.get(r0)
            int[] r1 = (int[]) r1
            float r11 = r6.getTranslationX()
            float r12 = r6.getTranslationY()
            X.1LK r0 = r7.A00
            float r9 = r0.BSB(r6, r4)
            X.1LK r0 = r7.A00
            float r10 = r0.BSC(r6, r4)
            r0 = 0
            r13 = r1[r0]
            r0 = 1
            r14 = r1[r0]
            android.animation.TimeInterpolator r5 = X.AnonymousClass1LI.A02
            android.animation.ObjectAnimator r9 = X.AnonymousClass1LI.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r9
        L_0x01fb:
            if (r5 == r1) goto L_0x0202
            if (r5 == 0) goto L_0x0044
            if (r1 != 0) goto L_0x01c7
            return r9
        L_0x0202:
            if (r0 == 0) goto L_0x0044
            if (r3 != 0) goto L_0x01c7
            return r9
        L_0x0207:
            if (r1 == 0) goto L_0x0044
            if (r6 != 0) goto L_0x01c7
        L_0x020b:
            if (r5 != 0) goto L_0x01c7
            return r9
        L_0x020e:
            r1 = -1
            r0 = r9
            goto L_0x01bf
        L_0x0211:
            r5 = -1
            r3 = r9
            goto L_0x01a7
        L_0x0214:
            r3 = -1
            goto L_0x0039
        L_0x0217:
            r6 = -1
            r5 = r7
            goto L_0x001f
        L_0x021b:
            r0 = 2131434794(0x7f0b1d2a, float:1.8491412E38)
            r12.setTag(r0, r2)
            X.28u r0 = new X.28u
            r0.<init>(r2, r12, r4, r15)
        L_0x0226:
            r15.A0N(r0)
            return r9
        L_0x022a:
            r0.A05(r5, r1)
            return r9
        L_0x022e:
            X.1bZ r7 = (X.C29071bZ) r7
            r3 = 0
            r2 = 0
            if (r17 == 0) goto L_0x0244
            java.util.Map r1 = r10.A02
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0244
            float r2 = r0.floatValue()
        L_0x0244:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x024b
            r3 = r2
        L_0x024b:
            android.animation.ObjectAnimator r9 = X.C29071bZ.A02(r6, r7, r3, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LH.A03(android.view.ViewGroup, X.2rK, X.2rK):android.animation.Animator");
    }

    public ObjectAnimator A0W(View view, ViewGroup viewGroup, C62392rK r16) {
        View view2 = view;
        C62392rK r6 = r16;
        if (this instanceof AnonymousClass1LI) {
            AnonymousClass1LI r5 = (AnonymousClass1LI) this;
            int[] iArr = (int[]) r6.A02.get("android:slide:screenPosition");
            return AnonymousClass1LI.A02(AnonymousClass1LI.A01, view2, r5, r6, view.getTranslationX(), view.getTranslationY(), r5.A00.BSB(view, viewGroup), r5.A00.BSC(view, viewGroup), iArr[0], iArr[1]);
        }
        C29071bZ r3 = (C29071bZ) this;
        C24493C6l c6l = C25446Cfx.A02;
        float f = 1.0f;
        Number number = (Number) r6.A02.get("android:fade:transitionAlpha");
        if (number != null) {
            f = number.floatValue();
        }
        return C29071bZ.A02(view, r3, f, 0.0f);
    }
}
