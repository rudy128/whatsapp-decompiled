package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.28v  reason: invalid class name and case insensitive filesystem */
public class C454028v extends C24281Jo implements Animatable {
    public Animator.AnimatorListener A00;
    public AnonymousClass26k A01;
    public ArrayList A02;
    public final Context A03;
    public final Drawable.Callback A04;
    public final AnonymousClass26h A05;

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable$ConstantState, X.26h] */
    public C454028v(Context context) {
        this.A00 = null;
        this.A02 = null;
        this.A04 = new C64252uT(this);
        this.A03 = context;
        this.A05 = new Drawable.ConstantState();
    }

    public static boolean A07(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.animation.Animator[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.animation.PropertyValuesHolder[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.animation.Animator} */
    /* JADX WARNING: type inference failed for: r3v18, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c3, code lost:
        if (r1 == null) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c5, code lost:
        r1 = A01(r19, r9, r18, 0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02cd, code lost:
        if (r1 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        if (A07(r6.type) != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ae, code lost:
        if (r6 == null) goto L_0x0145;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator A00(android.animation.AnimatorSet r26, android.content.Context r27, android.content.res.Resources.Theme r28, android.content.res.Resources r29, android.util.AttributeSet r30, org.xmlpull.v1.XmlPullParser r31, int r32) {
        /*
            r25 = 1065353216(0x3f800000, float:1.0)
            r12 = r31
            int r24 = r12.getDepth()
            r13 = 0
            r23 = r13
        L_0x000b:
            int r1 = r12.next()
            r0 = 3
            r11 = 0
            if (r1 != r0) goto L_0x001c
            int r1 = r12.getDepth()
            r0 = r24
            if (r1 <= r0) goto L_0x0307
            goto L_0x000b
        L_0x001c:
            r0 = 1
            if (r1 == r0) goto L_0x0307
            r0 = 2
            if (r1 != r0) goto L_0x000b
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r1.equals(r0)
            r3 = r30
            if (r0 == 0) goto L_0x0051
            android.animation.ObjectAnimator r13 = new android.animation.ObjectAnimator
            r13.<init>()
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r3
            r3 = r13
            r8 = r12
            A02(r3, r4, r5, r6, r7, r8)
        L_0x0041:
            if (r26 == 0) goto L_0x000b
            if (r11 != 0) goto L_0x000b
            if (r23 != 0) goto L_0x004b
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
        L_0x004b:
            r0 = r23
            r0.add(r13)
            goto L_0x000b
        L_0x0051:
            java.lang.String r0 = "animator"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0067
            r4 = 0
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r3
            r9 = r12
            android.animation.ValueAnimator r13 = A02(r4, r5, r6, r7, r8, r9)
            goto L_0x0041
        L_0x0067:
            java.lang.String r0 = "set"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0095
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            int[] r2 = X.C50992Wo.A03
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r1 = X.C63882tq.A04(r1, r0, r3, r2)
            java.lang.String r0 = "ordering"
            int r9 = X.C63882tq.A02(r1, r0, r12, r11, r11)
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r3
            r3 = r13
            r8 = r12
            A00(r3, r4, r5, r6, r7, r8, r9)
            r1.recycle()
            goto L_0x0041
        L_0x0095:
            java.lang.String r22 = "propertyValuesHolder"
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02f0
            android.util.AttributeSet r21 = android.util.Xml.asAttributeSet(r12)
            r20 = 0
            r14 = r20
        L_0x00a7:
            int r0 = r12.getEventType()
            r3 = 0
            r4 = 3
            if (r0 == r4) goto L_0x02d0
            r10 = 1
            if (r0 == r10) goto L_0x02d0
            r3 = 2
            if (r0 == r3) goto L_0x00b9
            r12.next()
            goto L_0x00a7
        L_0x00b9:
            r0 = r22
            boolean r0 = X.C17890vO.A1V(r0, r12)
            if (r0 == 0) goto L_0x02be
            int[] r5 = X.C50992Wo.A06
            r2 = r28
            r1 = r29
            r0 = r21
            android.content.res.TypedArray r19 = X.C63882tq.A04(r2, r1, r0, r5)
            java.lang.String r0 = "propertyName"
            boolean r0 = X.C63882tq.A07(r0, r12)
            if (r0 != 0) goto L_0x01b1
            r9 = 0
        L_0x00d6:
            java.lang.String r2 = "valueType"
            r1 = 4
            r0 = r19
            int r18 = X.C63882tq.A02(r0, r2, r12, r3, r1)
            r8 = r18
            r2 = r20
        L_0x00e4:
            int r0 = r12.next()
            r7 = 3
            if (r0 == r7) goto L_0x01b9
            if (r0 == r10) goto L_0x01b9
            java.lang.String r3 = r12.getName()
            java.lang.String r0 = "keyframe"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00e4
            if (r8 != r1) goto L_0x0125
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            int[] r4 = X.C50992Wo.A04
            r3 = r28
            r0 = r29
            android.content.res.TypedArray r3 = X.C63882tq.A04(r3, r0, r5, r4)
            java.lang.String r0 = "value"
            r8 = 0
            boolean r0 = X.C63882tq.A07(r0, r12)
            if (r0 == 0) goto L_0x0122
            android.util.TypedValue r0 = r3.peekValue(r11)
            if (r0 == 0) goto L_0x0122
            int r0 = r0.type
            boolean r0 = A07(r0)
            if (r0 == 0) goto L_0x0122
            r8 = 3
        L_0x0122:
            r3.recycle()
        L_0x0125:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            int[] r4 = X.C50992Wo.A04
            r3 = r28
            r0 = r29
            android.content.res.TypedArray r4 = X.C63882tq.A04(r3, r0, r5, r4)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r0 = "fraction"
            float r3 = X.C63882tq.A00(r4, r0, r12, r3, r7)
            java.lang.String r5 = "value"
            boolean r0 = X.C63882tq.A07(r5, r12)
            if (r0 != 0) goto L_0x01a9
            r6 = 0
        L_0x0145:
            r0 = 0
        L_0x0146:
            if (r8 != r1) goto L_0x0189
            if (r0 == 0) goto L_0x01a4
            int r0 = r6.type
            boolean r0 = A07(r0)
            if (r0 == 0) goto L_0x0193
        L_0x0152:
            int r0 = X.C63882tq.A02(r4, r5, r12, r11, r11)
            android.animation.Keyframe r5 = android.animation.Keyframe.ofInt(r3, r0)
        L_0x015a:
            java.lang.String r0 = "interpolator"
            boolean r0 = X.C63882tq.A07(r0, r12)
            if (r0 == 0) goto L_0x0176
            int r3 = r4.getResourceId(r10, r11)
            if (r3 <= 0) goto L_0x0176
            r0 = r27
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r0, r3)
            java.lang.String r0 = "Failed to parse interpolator, no start tag found"
            X.C30701eN.A00(r3, r0)
            r5.setInterpolator(r3)
        L_0x0176:
            r4.recycle()
            if (r5 == 0) goto L_0x0184
            if (r2 != 0) goto L_0x0181
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
        L_0x0181:
            r2.add(r5)
        L_0x0184:
            r12.next()
            goto L_0x00e4
        L_0x0189:
            if (r0 == 0) goto L_0x019d
            if (r8 == 0) goto L_0x0193
            if (r8 == r10) goto L_0x0152
            if (r8 == r7) goto L_0x0152
            r5 = 0
            goto L_0x015a
        L_0x0193:
            r0 = 0
            float r0 = X.C63882tq.A00(r4, r5, r12, r0, r11)
            android.animation.Keyframe r5 = android.animation.Keyframe.ofFloat(r3, r0)
            goto L_0x015a
        L_0x019d:
            if (r8 == 0) goto L_0x01a4
            android.animation.Keyframe r5 = android.animation.Keyframe.ofInt(r3)
            goto L_0x015a
        L_0x01a4:
            android.animation.Keyframe r5 = android.animation.Keyframe.ofFloat(r3)
            goto L_0x015a
        L_0x01a9:
            android.util.TypedValue r6 = r4.peekValue(r11)
            r0 = 1
            if (r6 != 0) goto L_0x0146
            goto L_0x0145
        L_0x01b1:
            r0 = r19
            java.lang.String r9 = r0.getString(r4)
            goto L_0x00d6
        L_0x01b9:
            if (r2 == 0) goto L_0x02c5
            int r6 = r2.size()
            if (r6 <= 0) goto L_0x02c5
            r5 = 0
            java.lang.Object r3 = r2.get(r11)
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            int r0 = r6 + -1
            java.lang.Object r1 = r2.get(r0)
            android.animation.Keyframe r1 = (android.animation.Keyframe) r1
            float r15 = r1.getFraction()
            r4 = 0
            int r0 = (r15 > r25 ? 1 : (r15 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e2
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x027c
            r0 = r25
            r1.setFraction(r0)
        L_0x01e2:
            float r1 = r3.getFraction()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01f1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0258
            r3.setFraction(r4)
        L_0x01f1:
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r6]
            r2.toArray(r3)
        L_0x01f6:
            if (r5 >= r6) goto L_0x02a7
            r2 = r3[r5]
            float r0 = r2.getFraction()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0207
            if (r5 != 0) goto L_0x020a
            r2.setFraction(r4)
        L_0x0207:
            int r5 = r5 + 1
            goto L_0x01f6
        L_0x020a:
            int r1 = r6 + -1
            if (r5 != r1) goto L_0x0214
            r0 = r25
            r2.setFraction(r0)
            goto L_0x0207
        L_0x0214:
            int r0 = r5 + 1
            r15 = r5
        L_0x0217:
            if (r0 >= r1) goto L_0x0228
            r2 = r3[r0]
            float r2 = r2.getFraction()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0228
            int r2 = r0 + 1
            r15 = r0
            r0 = r2
            goto L_0x0217
        L_0x0228:
            int r0 = r15 + 1
            r0 = r3[r0]
            float r17 = r0.getFraction()
            int r0 = r5 + -1
            r0 = r3[r0]
            float r0 = r0.getFraction()
            float r17 = r17 - r0
            r2 = r5
            int r0 = r15 - r5
            int r0 = r0 + 2
            float r0 = (float) r0
            float r17 = r17 / r0
        L_0x0242:
            if (r2 > r15) goto L_0x0207
            r16 = r3[r2]
            int r0 = r2 + -1
            r0 = r3[r0]
            float r1 = r0.getFraction()
            float r1 = r1 + r17
            r0 = r16
            r0.setFraction(r1)
            int r2 = r2 + 1
            goto L_0x0242
        L_0x0258:
            java.lang.Class r1 = r3.getType()
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L_0x026a
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r4)
        L_0x0264:
            r2.add(r11, r0)
            int r6 = r6 + 1
            goto L_0x01f1
        L_0x026a:
            java.lang.Class r1 = r3.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L_0x0277
            android.animation.Keyframe r0 = android.animation.Keyframe.ofInt(r4)
            goto L_0x0264
        L_0x0277:
            android.animation.Keyframe r0 = android.animation.Keyframe.ofObject(r4)
            goto L_0x0264
        L_0x027c:
            int r16 = r2.size()
            java.lang.Class r0 = r1.getType()
            java.lang.Class r15 = java.lang.Float.TYPE
            if (r0 != r15) goto L_0x0295
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r25)
        L_0x028c:
            r0 = r16
            r2.add(r0, r1)
            int r6 = r6 + 1
            goto L_0x01e2
        L_0x0295:
            java.lang.Class r1 = r1.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L_0x02a2
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r25)
            goto L_0x028c
        L_0x02a2:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofObject(r25)
            goto L_0x028c
        L_0x02a7:
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r9, r3)
            if (r8 != r7) goto L_0x02c3
            X.2uG r0 = X.C64122uG.A00
            r1.setEvaluator(r0)
        L_0x02b2:
            if (r14 != 0) goto L_0x02b8
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
        L_0x02b8:
            r14.add(r1)
        L_0x02bb:
            r19.recycle()
        L_0x02be:
            r12.next()
            goto L_0x00a7
        L_0x02c3:
            if (r1 != 0) goto L_0x02b2
        L_0x02c5:
            r1 = r18
            r0 = r19
            android.animation.PropertyValuesHolder r1 = A01(r0, r9, r1, r11, r10)
            if (r1 == 0) goto L_0x02bb
            goto L_0x02b2
        L_0x02d0:
            if (r14 == 0) goto L_0x02ed
            int r2 = r14.size()
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r2]
        L_0x02d8:
            if (r3 >= r2) goto L_0x02e3
            java.lang.Object r0 = r14.get(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x02d8
        L_0x02e3:
            boolean r0 = r13 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L_0x02ed
            r0 = r13
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.setValues(r1)
        L_0x02ed:
            r11 = 1
            goto L_0x0041
        L_0x02f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown animator name: "
            r1.append(r0)
            java.lang.String r0 = r12.getName()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0307:
            if (r26 == 0) goto L_0x032c
            if (r23 == 0) goto L_0x032c
            int r0 = r23.size()
            android.animation.Animator[] r3 = new android.animation.Animator[r0]
            java.util.Iterator r2 = r23.iterator()
        L_0x0315:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0325
            java.lang.Object r1 = r2.next()
            int r0 = r11 + 1
            r3[r11] = r1
            r11 = r0
            goto L_0x0315
        L_0x0325:
            r0 = r26
            if (r32 != 0) goto L_0x032d
            r0.playTogether(r3)
        L_0x032c:
            return r13
        L_0x032d:
            r0.playSequentially(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454028v.A00(android.animation.AnimatorSet, android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser, int):android.animation.Animator");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.animation.TypeEvaluator] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011d, code lost:
        if (r16 == 0) goto L_0x011f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder A01(android.content.res.TypedArray r14, java.lang.String r15, int r16, int r17, int r18) {
        /*
            r3 = r16
            r10 = r17
            android.util.TypedValue r0 = r14.peekValue(r10)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0126
            r13 = 1
            int r11 = r0.type
        L_0x000f:
            r9 = r18
            android.util.TypedValue r0 = r14.peekValue(r9)
            if (r0 == 0) goto L_0x0122
            r12 = 1
            int r8 = r0.type
        L_0x001a:
            r0 = 4
            r1 = 3
            if (r3 != r0) goto L_0x011d
            if (r13 == 0) goto L_0x0026
            boolean r0 = A07(r11)
            if (r0 != 0) goto L_0x002e
        L_0x0026:
            if (r12 == 0) goto L_0x011b
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x011b
        L_0x002e:
            r3 = 3
        L_0x002f:
            r2 = 0
        L_0x0030:
            r0 = 0
            r7 = 2
            if (r3 != r7) goto L_0x006f
            java.lang.String r8 = r14.getString(r10)
            java.lang.String r6 = r14.getString(r9)
            X.2sM[] r3 = X.C63382sy.A03(r8)
            X.2sM[] r2 = X.C63382sy.A03(r6)
            if (r3 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0055
            X.2uE r1 = new X.2uE
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
        L_0x0051:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r0)
        L_0x0055:
            return r0
        L_0x0056:
            X.2uE r1 = new X.2uE
            r1.<init>()
            if (r2 == 0) goto L_0x006a
            boolean r0 = X.C63382sy.A02(r3, r2)
            if (r0 == 0) goto L_0x012a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r3
            r0[r5] = r2
            goto L_0x0051
        L_0x006a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            goto L_0x0051
        L_0x006f:
            if (r3 != r1) goto L_0x0118
            X.2uG r3 = X.C64122uG.A00
        L_0x0073:
            r6 = 5
            r1 = 0
            if (r2 == 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00a8
            if (r11 != r6) goto L_0x00a3
            float r2 = r14.getDimension(r10, r1)
        L_0x007f:
            if (r12 == 0) goto L_0x009e
            if (r8 != r6) goto L_0x0099
            float r0 = r14.getDimension(r9, r1)
        L_0x0087:
            float[] r1 = new float[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x008d:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r15, r1)
        L_0x0091:
            if (r0 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0055
            r0.setEvaluator(r3)
            return r0
        L_0x0099:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x0087
        L_0x009e:
            float[] r1 = new float[r5]
            r1[r4] = r2
            goto L_0x008d
        L_0x00a3:
            float r2 = r14.getFloat(r10, r1)
            goto L_0x007f
        L_0x00a8:
            if (r8 != r6) goto L_0x00b3
            float r0 = r14.getDimension(r9, r1)
        L_0x00ae:
            float[] r1 = new float[r5]
            r1[r4] = r0
            goto L_0x008d
        L_0x00b3:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x00ae
        L_0x00b8:
            if (r13 == 0) goto L_0x00fa
            if (r11 != r6) goto L_0x00ea
            float r0 = r14.getDimension(r10, r1)
            int r2 = (int) r0
        L_0x00c1:
            if (r12 == 0) goto L_0x00e5
            if (r8 != r6) goto L_0x00d5
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x00ca:
            int[] r1 = new int[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x00d0:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r15, r1)
            goto L_0x0091
        L_0x00d5:
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x00e0
            int r0 = r14.getColor(r9, r4)
            goto L_0x00ca
        L_0x00e0:
            int r0 = r14.getInt(r9, r4)
            goto L_0x00ca
        L_0x00e5:
            int[] r1 = new int[r5]
            r1[r4] = r2
            goto L_0x00d0
        L_0x00ea:
            boolean r0 = A07(r11)
            if (r0 == 0) goto L_0x00f5
            int r2 = r14.getColor(r10, r4)
            goto L_0x00c1
        L_0x00f5:
            int r2 = r14.getInt(r10, r4)
            goto L_0x00c1
        L_0x00fa:
            if (r12 == 0) goto L_0x0055
            if (r8 != r6) goto L_0x0108
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x0103:
            int[] r1 = new int[r5]
            r1[r4] = r0
            goto L_0x00d0
        L_0x0108:
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x0113
            int r0 = r14.getColor(r9, r4)
            goto L_0x0103
        L_0x0113:
            int r0 = r14.getInt(r9, r4)
            goto L_0x0103
        L_0x0118:
            r3 = r0
            goto L_0x0073
        L_0x011b:
            r3 = 0
            goto L_0x011f
        L_0x011d:
            if (r16 != 0) goto L_0x002f
        L_0x011f:
            r2 = 1
            goto L_0x0030
        L_0x0122:
            r12 = 0
            r8 = 0
            goto L_0x001a
        L_0x0126:
            r13 = 0
            r11 = 0
            goto L_0x000f
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = " Can't morph from "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r6, r1)
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454028v.A01(android.content.res.TypedArray, java.lang.String, int, int, int):android.animation.PropertyValuesHolder");
    }

    public static ValueAnimator A02(ValueAnimator valueAnimator, Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int resourceId;
        String string;
        String string2;
        String string3;
        String string4;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A042 = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A02);
        TypedArray A043 = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A05);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long A022 = (long) C63882tq.A02(A042, "duration", xmlPullParser2, 1, 300);
        long A023 = (long) C63882tq.A02(A042, "startOffset", xmlPullParser2, 2, 0);
        int A024 = C63882tq.A02(A042, "valueType", xmlPullParser2, 7, 4);
        if (C63882tq.A07("valueFrom", xmlPullParser2) && C63882tq.A07("valueTo", xmlPullParser2)) {
            if (A024 == 4) {
                TypedValue peekValue = A042.peekValue(5);
                boolean z2 = true;
                A024 = 0;
                if (peekValue != null) {
                    z = true;
                    i = peekValue.type;
                } else {
                    z = false;
                    i = 0;
                }
                TypedValue peekValue2 = A042.peekValue(6);
                if (peekValue2 != null) {
                    i2 = peekValue2.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                if ((z && A07(i)) || (z2 && A07(i2))) {
                    A024 = 3;
                }
            }
            PropertyValuesHolder A012 = A01(A042, "", A024, 5, 6);
            if (A012 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{A012});
            }
        }
        valueAnimator2.setDuration(A022);
        valueAnimator2.setStartDelay(A023);
        valueAnimator2.setRepeatCount(C63882tq.A02(A042, "repeatCount", xmlPullParser2, 3, 0));
        valueAnimator2.setRepeatMode(C63882tq.A02(A042, "repeatMode", xmlPullParser2, 4, 1));
        if (A043 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            if (!C63882tq.A07("pathData", xmlPullParser2) || (string2 = A043.getString(1)) == null) {
                if (!C63882tq.A07("propertyName", xmlPullParser2)) {
                    string = null;
                } else {
                    string = A043.getString(0);
                }
                objectAnimator.setPropertyName(string);
            } else {
                if (!C63882tq.A07("propertyXName", xmlPullParser2)) {
                    string3 = null;
                } else {
                    string3 = A043.getString(2);
                }
                if (!C63882tq.A07("propertyYName", xmlPullParser2)) {
                    string4 = null;
                } else {
                    string4 = A043.getString(3);
                }
                if (string3 == null && string4 == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(A043.getPositionDescription());
                    throw new InflateException(AnonymousClass000.A0y(" propertyXName or propertyYName is needed for PathData", A10));
                }
                Path A002 = C63382sy.A00(string2);
                float f = 1.0f * 0.5f;
                PathMeasure pathMeasure = new PathMeasure(A002, false);
                ArrayList A13 = AnonymousClass000.A13();
                float f2 = 0.0f;
                A13.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    A13.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A002, false);
                int min = Math.min(100, ((int) (f3 / f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / ((float) (min - 1));
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f2 - AnonymousClass000.A04(A13.get(i4)), fArr3, (float[]) null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f2 += f4;
                    if (i4 + 1 < A13.size() && f2 > AnonymousClass000.A04(A13.get(i4 + 1))) {
                        i4++;
                        pathMeasure2.nextContour();
                    }
                    i3++;
                }
                if (string3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (string4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(string4, fArr2);
                }
                objectAnimator.setValues(propertyValuesHolder2 == null ? new PropertyValuesHolder[]{propertyValuesHolder} : propertyValuesHolder == null ? new PropertyValuesHolder[]{propertyValuesHolder2} : new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
            }
        }
        if (C63882tq.A07("interpolator", xmlPullParser2) && (resourceId = A042.getResourceId(0, 0)) > 0) {
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, resourceId);
            C30701eN.A00(loadInterpolator, "Failed to parse interpolator, no start tag found");
            valueAnimator2.setInterpolator(loadInterpolator);
        }
        A042.recycle();
        if (A043 != null) {
            A043.recycle();
        }
        return valueAnimator2;
    }

    public static C454028v A03(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C454028v r3 = new C454028v(context);
            Drawable A002 = C40501uo.A00(context.getTheme(), context.getResources(), i);
            A002.setCallback(r3.A04);
            r3.A01 = new AnonymousClass26k(A002.getConstantState());
            r3.A00 = A002;
            return r3;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    Resources resources = context.getResources();
                    Resources.Theme theme = context.getTheme();
                    C454028v r0 = new C454028v(context);
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw C17880vN.A17("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        }
    }

    public static C454028v A04(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        C454028v r0 = new C454028v(context);
        r0.inflate(resources, xmlPullParser, attributeSet, theme);
        return r0;
    }

    public void A08(C6Y c6y) {
        if (c6y != null) {
            Drawable drawable = this.A00;
            if (drawable != null) {
                A05((AnimatedVectorDrawable) drawable, c6y);
                return;
            }
            ArrayList arrayList = this.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass000.A13();
                this.A02 = arrayList;
            }
            if (!arrayList.contains(c6y)) {
                this.A02.add(c6y);
                Animator.AnimatorListener animatorListener = this.A00;
                if (animatorListener == null) {
                    animatorListener = new BEQ(this, 1);
                    this.A00 = animatorListener;
                }
                this.A05.A00.addListener(animatorListener);
            }
        }
    }

    public void A09(C6Y c6y) {
        Animator.AnimatorListener animatorListener;
        if (c6y != null) {
            Drawable drawable = this.A00;
            if (drawable != null) {
                A06((AnimatedVectorDrawable) drawable, c6y);
            }
            ArrayList arrayList = this.A02;
            if (arrayList != null) {
                arrayList.remove(c6y);
                if (this.A02.size() == 0 && (animatorListener = this.A00) != null) {
                    this.A05.A00.removeListener(animatorListener);
                    this.A00 = null;
                }
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A06(theme, drawable);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C62682rn.A02(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnonymousClass26h r1 = this.A05;
        r1.A02.draw(canvas);
        if (r1.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A05.A02.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C62682rn.A00(drawable);
        }
        return this.A05.A02.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new AnonymousClass26k(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A05.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A05.A02.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A05.A02.getOpacity();
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [X.00O, X.00P] */
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Resources.NotFoundException notFoundException;
        Animator A002;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            C62682rn.A01(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        int eventType = xmlPullParser2.getEventType();
        int depth = xmlPullParser2.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser2.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A00);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C24291Jp A003 = C24291Jp.A00(theme2, resources2, resourceId);
                        C30701eN.A00(A003, "Failed to load drawable");
                        A003.A01 = false;
                        A003.setCallback(this.A04);
                        AnonymousClass26h r10 = this.A05;
                        C24291Jp r1 = r10.A02;
                        if (r1 != null) {
                            r1.setCallback((Drawable.Callback) null);
                        }
                        r10.A02 = A003;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources2.obtainAttributes(attributeSet2, C50992Wo.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A03;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                A002 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources3 = context.getResources();
                                Resources.Theme theme3 = context.getTheme();
                                XmlResourceParser xmlResourceParser = null;
                                try {
                                    XmlResourceParser animation = resources3.getAnimation(resourceId2);
                                    A002 = A00((AnimatorSet) null, context, theme3, resources3, Xml.asAttributeSet(animation), animation, 0);
                                    if (animation != null) {
                                        animation.close();
                                    }
                                } catch (XmlPullParserException e) {
                                    e = e;
                                    notFoundException = new Resources.NotFoundException(AnonymousClass000.A0y(Integer.toHexString(resourceId2), AnonymousClass000.A11("Can't load animation resource ID #0x")));
                                } catch (IOException e2) {
                                    e = e2;
                                    notFoundException = new Resources.NotFoundException(AnonymousClass000.A0y(Integer.toHexString(resourceId2), AnonymousClass000.A11("Can't load animation resource ID #0x")));
                                } catch (Throwable th) {
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            AnonymousClass26h r13 = this.A05;
                            A002.setTarget(r13.A02.A00.A08.A0E.get(string));
                            ArrayList arrayList = r13.A03;
                            if (arrayList == null) {
                                arrayList = AnonymousClass000.A13();
                                r13.A03 = arrayList;
                                r13.A01 = new AnonymousClass00O(0);
                            }
                            arrayList.add(A002);
                            r13.A01.put(A002, string);
                        } else {
                            obtainAttributes.recycle();
                            throw AnonymousClass000.A0n("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser2.next();
        }
        AnonymousClass26h r0 = this.A05;
        AnimatorSet animatorSet = r0.A00;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            r0.A00 = animatorSet;
        }
        animatorSet.playTogether(r0.A03);
        return;
        notFoundException.initCause(e);
        throw notFoundException;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A05.A02.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A05.A00.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A05.A02.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A05.A02;
        }
        drawable.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A05.A02;
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A05.A02.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A05.A02.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A05.A02.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A05.A02.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A0D(drawable, i);
        } else {
            this.A05.A02.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A04(colorStateList, drawable);
        } else {
            this.A05.A02.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A08(mode, drawable);
        } else {
            this.A05.A02.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A05.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnonymousClass26h r1 = this.A05;
        if (!r1.A00.isStarted()) {
            r1.A00.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A05.A00.end();
        }
    }

    public static void A05(AnimatedVectorDrawable animatedVectorDrawable, C6Y c6y) {
        C62722rr.A01(animatedVectorDrawable, c6y.A00());
    }

    public static void A06(AnimatedVectorDrawable animatedVectorDrawable, C6Y c6y) {
        C62722rr.A02(animatedVectorDrawable, c6y.A00());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable$ConstantState, X.26h] */
    public C454028v() {
        this.A00 = null;
        this.A02 = null;
        this.A04 = new C64252uT(this);
        this.A03 = null;
        this.A05 = new Drawable.ConstantState();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
