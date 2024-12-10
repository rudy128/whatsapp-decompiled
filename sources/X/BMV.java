package X;

import android.graphics.Matrix;
import android.util.Property;
import android.view.View;
import java.util.Map;

public class BMV extends AnonymousClass1LG {
    public static final Property A01 = new C22637BGx(0);
    public static final Property A02 = new C22637BGx(1);
    public static final String[] A03 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public Matrix A00 = C108945cZ.A0J();

    private void A01(C62392rK r7) {
        Matrix matrix;
        View view = r7.A00;
        if (view.getVisibility() != 8) {
            Map map = r7.A02;
            map.put("android:changeTransform:parent", view.getParent());
            map.put("android:changeTransform:transforms", new C25803CmG(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            map.put("android:changeTransform:matrix", matrix);
            Matrix A0J = C108945cZ.A0J();
            View view2 = (View) view.getParent();
            C25446Cfx.A02.A02(A0J, view2);
            A0J.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            map.put("android:changeTransform:parentMatrix", A0J);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(2131436427));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(2131433423));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.D77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.D77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: X.BHl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: X.D77} */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.animation.TypeEvaluator, X.CxW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.BMW, X.3M3] */
    /* JADX WARNING: type inference failed for: r15v5, types: [android.widget.FrameLayout, X.BIB, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02c0, code lost:
        if (r18.getZ() > r17.getZ()) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e8, code lost:
        if (r7.size() == r2) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02eb, code lost:
        r6 = r4 - 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A03(android.view.ViewGroup r23, X.C62392rK r24, X.C62392rK r25) {
        /*
            r22 = this;
            r21 = r24
            if (r24 == 0) goto L_0x0366
            r4 = r25
            if (r25 == 0) goto L_0x0366
            r0 = r21
            java.util.Map r13 = r0.A02
            java.lang.String r12 = "android:changeTransform:parent"
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x0366
            java.util.Map r3 = r4.A02
            boolean r0 = r3.containsKey(r12)
            if (r0 == 0) goto L_0x0366
            java.lang.Object r5 = r13.get(r12)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r2 = r3.get(r12)
            android.view.View r2 = (android.view.View) r2
            r11 = r22
            boolean r0 = r11.A0T(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0163
            boolean r0 = r11.A0T(r2)
            if (r0 == 0) goto L_0x0163
            X.2rK r0 = r11.A05(r5, r1)
            if (r0 == 0) goto L_0x0167
            android.view.View r0 = r0.A00
            if (r2 != r0) goto L_0x0167
        L_0x0041:
            r20 = 0
        L_0x0043:
            java.lang.String r0 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "android:changeTransform:matrix"
            r13.put(r0, r1)
        L_0x0050:
            java.lang.String r0 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            r13.put(r0, r1)
        L_0x005d:
            if (r20 == 0) goto L_0x0094
            java.lang.String r6 = "android:changeTransform:parentMatrix"
            java.lang.Object r5 = r3.get(r6)
            android.graphics.Matrix r5 = (android.graphics.Matrix) r5
            android.view.View r1 = r4.A00
            r0 = 2131433423(0x7f0b17cf, float:1.8488631E38)
            r1.setTag(r0, r5)
            android.graphics.Matrix r2 = r11.A00
            r2.reset()
            r5.invert(r2)
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r1 = r13.get(r0)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x0088
            android.graphics.Matrix r1 = X.C108945cZ.A0J()
            r13.put(r0, r1)
        L_0x0088:
            java.lang.Object r0 = r13.get(r6)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            r1.postConcat(r0)
            r1.postConcat(r2)
        L_0x0094:
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r2 = r13.get(r0)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            java.lang.Object r7 = r3.get(r0)
            android.graphics.Matrix r7 = (android.graphics.Matrix) r7
            if (r2 != 0) goto L_0x00a6
            android.graphics.Matrix r2 = X.CED.A00
        L_0x00a6:
            if (r7 != 0) goto L_0x00aa
            android.graphics.Matrix r7 = X.CED.A00
        L_0x00aa:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x00da
            r10 = 0
        L_0x00b1:
            if (r20 == 0) goto L_0x0367
            if (r10 == 0) goto L_0x0367
            android.view.View r9 = r4.A00
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            java.lang.Object r0 = r3.get(r0)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r0)
            X.C6l r20 = X.C25446Cfx.A02
            r2 = r23
            r0 = r20
            r0.A03(r3, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 != r0) goto L_0x01ba
            boolean r0 = X.D77.A04
            if (r0 != 0) goto L_0x0197
            r5 = 1
            goto L_0x016b
        L_0x00da:
            java.lang.String r0 = "android:changeTransform:transforms"
            java.lang.Object r6 = r3.get(r0)
            X.CmG r6 = (X.C25803CmG) r6
            android.view.View r5 = r4.A00
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setTranslationX(r1)
            r5.setTranslationY(r1)
            X.AnonymousClass1Xr.A03(r5, r1)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            r5.setRotationX(r1)
            r5.setRotationY(r1)
            r5.setRotation(r1)
            r0 = 9
            float[] r1 = new float[r0]
            r2.getValues(r1)
            float[] r8 = new float[r0]
            r7.getValues(r8)
            X.CS7 r2 = new X.CS7
            r2.<init>(r5, r1)
            android.util.Property r14 = A01
            float[] r0 = new float[r0]
            X.CxW r10 = new X.CxW
            r10.<init>()
            r10.A00 = r0
            r9 = 2
            float[][] r0 = new float[r9][]
            r17 = 0
            boolean r16 = X.BE7.A1X(r1, r8, r0)
            android.animation.PropertyValuesHolder r15 = android.animation.PropertyValuesHolder.ofObject(r14, r10, r0)
            r14 = r1[r9]
            r0 = 5
            r10 = r1[r0]
            r1 = r8[r9]
            r0 = r8[r0]
            android.graphics.Path r8 = X.C108945cZ.A0L()
            r8.moveTo(r14, r10)
            r8.lineTo(r1, r0)
            android.util.Property r1 = A02
            r0 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r1, r0, r8)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r9]
            r0[r17] = r15
            r0[r16] = r1
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r2, r0)
            X.BEO r0 = new X.BEO
            r19 = r11
            r17 = r2
            r18 = r6
            r14 = r0
            r15 = r7
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r10.addListener(r0)
            r10.addPauseListener(r0)
            goto L_0x00b1
        L_0x0163:
            if (r5 != r2) goto L_0x0167
            goto L_0x0041
        L_0x0167:
            r20 = 1
            goto L_0x0043
        L_0x016b:
            X.D77.A00()     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class r7 = X.D77.A01     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.String r6 = "addGhost"
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0 = 0
            r4[r0] = r1     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            r4[r5] = r0     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
            r0 = 2
            r4[r0] = r1     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r6, r4)     // Catch:{ NoSuchMethodException -> 0x018d }
            X.D77.A02 = r0     // Catch:{ NoSuchMethodException -> 0x018d }
            r0.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x018d }
            goto L_0x0195
        L_0x018d:
            r4 = move-exception
            java.lang.String r1 = "GhostViewApi21"
            java.lang.String r0 = "Failed to retrieve addGhost method"
            android.util.Log.i(r1, r0, r4)
        L_0x0195:
            X.D77.A04 = r5
        L_0x0197:
            java.lang.reflect.Method r4 = X.D77.A02
            r1 = 0
            if (r4 == 0) goto L_0x032c
            java.lang.Object[] r0 = X.AnonymousClass8BR.A1a()     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x01b0 }
            X.AnonymousClass8BX.A1K(r9, r2, r3, r0)     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x01b0 }
            java.lang.Object r0 = r4.invoke(r1, r0)     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x01b0 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x01b0 }
            X.D77 r14 = new X.D77     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x01b0 }
            r14.<init>(r0)     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x01b0 }
            goto L_0x032d
        L_0x01b0:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x01ba:
            android.view.ViewParent r0 = r9.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x035f
            r0 = 2131431116(0x7f0b0ecc, float:1.8483952E38)
            java.lang.Object r15 = r2.getTag(r0)
            X.BIB r15 = (X.BIB) r15
            r0 = 2131431115(0x7f0b0ecb, float:1.848395E38)
            java.lang.Object r14 = r9.getTag(r0)
            X.BHl r14 = (X.C22647BHl) r14
            if (r14 == 0) goto L_0x0304
            android.view.ViewParent r1 = r14.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == r15) goto L_0x0323
            int r0 = r14.A00
            r19 = r0
            r1.removeView(r14)
        L_0x01e5:
            X.BHl r14 = new X.BHl
            r14.<init>(r9)
            r14.A01 = r3
            if (r15 != 0) goto L_0x02ee
            android.content.Context r0 = r2.getContext()
            X.BIB r15 = new X.BIB
            r15.<init>(r0)
            r0 = 0
            r15.setClipChildren(r0)
            r15.A00 = r2
            r0 = 2131431116(0x7f0b0ecc, float:1.8483952E38)
            r2.setTag(r0, r15)
            android.view.ViewGroup r0 = r15.A00
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            r0.add(r15)
            r0 = 1
            r15.A01 = r0
        L_0x020f:
            int r4 = r15.getLeft()
            int r3 = r15.getTop()
            int r1 = r15.getLeft()
            int r0 = r2.getWidth()
            int r1 = r1 + r0
            int r0 = r15.getTop()
            int r0 = X.AnonymousClass3MW.A02(r2, r0)
            X.C25446Cfx.A00(r15, r4, r3, r1, r0)
            int r4 = r14.getLeft()
            int r3 = r14.getTop()
            int r1 = r14.getLeft()
            int r0 = r2.getWidth()
            int r1 = r1 + r0
            int r0 = r14.getTop()
            int r0 = X.AnonymousClass3MW.A02(r2, r0)
            X.C25446Cfx.A00(r14, r4, r3, r1, r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            android.view.View r0 = r14.A04
            X.BIB.A00(r0, r8)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            int r0 = r15.getChildCount()
            int r6 = r0 + -1
            r5 = 0
        L_0x025b:
            if (r5 > r6) goto L_0x0308
            int r0 = r5 + r6
            int r4 = r0 / 2
            android.view.View r0 = r15.getChildAt(r4)
            X.BHl r0 = (X.C22647BHl) r0
            android.view.View r0 = r0.A04
            X.BIB.A00(r0, r7)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02c2
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x02c2
            r0 = 0
            java.lang.Object r1 = r8.get(r0)
            java.lang.Object r0 = r7.get(r0)
            if (r1 != r0) goto L_0x02c2
            int r1 = r8.size()
            int r0 = r7.size()
            int r2 = java.lang.Math.min(r1, r0)
            r3 = 1
        L_0x0290:
            if (r3 >= r2) goto L_0x02e4
            android.view.View r18 = X.BE6.A0R(r8, r3)
            android.view.View r17 = X.BE6.A0R(r7, r3)
            r1 = r18
            r0 = r17
            if (r1 == r0) goto L_0x02e1
            android.view.ViewParent r3 = r18.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r16 = r3.getChildCount()
            float r1 = r18.getZ()
            float r0 = r17.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02c8
            float r1 = r18.getZ()
            float r0 = r17.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02eb
        L_0x02c2:
            int r5 = r4 + 1
        L_0x02c4:
            r7.clear()
            goto L_0x025b
        L_0x02c8:
            r2 = 0
        L_0x02c9:
            r0 = r16
            if (r2 >= r0) goto L_0x02c2
            int r0 = X.C61132pB.A00(r3, r2)
            android.view.View r0 = r3.getChildAt(r0)
            r1 = r18
            if (r0 == r1) goto L_0x02eb
            r1 = r0
            r0 = r17
            if (r1 == r0) goto L_0x02c2
            int r2 = r2 + 1
            goto L_0x02c9
        L_0x02e1:
            int r3 = r3 + 1
            goto L_0x0290
        L_0x02e4:
            int r0 = r7.size()
            if (r0 != r2) goto L_0x02eb
            goto L_0x02c2
        L_0x02eb:
            int r6 = r4 + -1
            goto L_0x02c4
        L_0x02ee:
            boolean r0 = r15.A01
            if (r0 == 0) goto L_0x031c
            android.view.ViewGroup r1 = r15.A00
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.remove(r15)
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.add(r15)
            goto L_0x020f
        L_0x0304:
            r19 = 0
            goto L_0x01e5
        L_0x0308:
            if (r5 < 0) goto L_0x0318
            int r0 = r15.getChildCount()
            if (r5 >= r0) goto L_0x0318
            r15.addView(r14, r5)
        L_0x0313:
            r0 = r19
            r14.A00 = r0
            goto L_0x0325
        L_0x0318:
            r15.addView(r14)
            goto L_0x0313
        L_0x031c:
            java.lang.String r0 = "This GhostViewHolder is detached!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0323:
            r14.A01 = r3
        L_0x0325:
            int r0 = r14.A00
            int r0 = r0 + 1
            r14.A00 = r0
            goto L_0x032d
        L_0x032c:
            r14 = r1
        L_0x032d:
            if (r14 == 0) goto L_0x0367
            java.lang.Object r1 = r13.get(r12)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = r21
            android.view.View r2 = r0.A00
            r14.CFf(r2, r1)
        L_0x033c:
            X.1bX r0 = r11.A06
            if (r0 == 0) goto L_0x0343
            X.1bX r11 = r11.A06
            goto L_0x033c
        L_0x0343:
            X.BMW r0 = new X.BMW
            r0.<init>()
            r0.A00 = r9
            r0.A01 = r14
            r11.A0N(r0)
            if (r2 == r9) goto L_0x0357
            r1 = 0
            r0 = r20
            r0.A04(r2, r1)
        L_0x0357:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            r0.A04(r9, r1)
            return r10
        L_0x035f:
            java.lang.String r0 = "Ghosted views must be parented by a ViewGroup"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0366:
            r10 = 0
        L_0x0367:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMV.A03(android.view.ViewGroup, X.2rK, X.2rK):android.animation.Animator");
    }

    public String[] A0V() {
        return A03;
    }

    public void A0Q(C62392rK r1) {
        A01(r1);
    }

    public void A0S(C62392rK r1) {
        A01(r1);
    }
}
