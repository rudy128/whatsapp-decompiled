package androidx.constraintlayout.widget;

import X.AnonymousClass27L;
import X.C25569Ci8;
import X.C26264Cw9;
import X.C2t;
import X.C38871s3;
import X.C38891s5;
import X.C38961sG;
import X.C39111sV;
import X.C39121sW;
import X.C39151sZ;
import X.C39171sd;
import X.CZ8;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Layer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public int A00 = -1;
    public int A01 = Integer.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public int A03 = 0;
    public int A04 = 0;
    public SparseArray A05 = new SparseArray();
    public SparseArray A06 = new SparseArray();
    public C38891s5 A07 = new C38891s5();
    public C39111sV A08 = new C39111sV(this, this);
    public C25569Ci8 A09 = null;
    public C26264Cw9 A0A = null;
    public ArrayList A0B = new ArrayList(4);
    public HashMap A0C = new HashMap();
    public boolean A0D = true;
    public int A0E = 263;
    public C2t A0F;

    public void forceLayout() {
        this.A0D = true;
        super.forceLayout();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C39151sZ(-2, -2);
    }

    public void requestLayout() {
        this.A0D = true;
        super.requestLayout();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A00(AttributeSet attributeSet, int i, int i2) {
        C38891s5 r7 = this.A07;
        r7.A0e = this;
        C39111sV r1 = this.A08;
        r7.A05 = r1;
        r7.A07.A03 = r1;
        this.A05.put(getId(), this);
        this.A0A = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39121sW.A01, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 10) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 7) {
                    this.A02 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A02);
                } else if (index == 8) {
                    this.A01 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A01);
                } else if (index == 89) {
                    this.A0E = obtainStyledAttributes.getInt(index, this.A0E);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A09 = new C25569Ci8(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A09 = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C26264Cw9 cw9 = new C26264Cw9();
                        this.A0A = cw9;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    CZ8 A022 = C26264Cw9.A02(context, Xml.asAttributeSet(xml));
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A022.A02.A0y = true;
                                    }
                                    cw9.A00.put(Integer.valueOf(A022.A00), A022);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0A = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i4 = this.A0E;
        r7.A01 = i4;
        boolean z = false;
        if ((i4 & 256) == 256) {
            z = true;
        }
        C38961sG.A0F = z;
    }

    public final C38871s3 A06(View view) {
        if (view == this) {
            return this.A07;
        }
        if (view == null) {
            return null;
        }
        return ((C39151sZ) view.getLayoutParams()).A0r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r8 = r22
            java.util.ArrayList r5 = r8.A0B
            r12 = 0
            if (r5 == 0) goto L_0x0034
            int r4 = r5.size()
            if (r4 <= 0) goto L_0x0034
            r3 = 0
        L_0x000e:
            java.lang.Object r2 = r5.get(r3)
            X.1sd r2 = (X.C39171sd) r2
            boolean r0 = r2 instanceof androidx.constraintlayout.helper.widget.Layer
            if (r0 == 0) goto L_0x002f
            androidx.constraintlayout.helper.widget.Layer r2 = (androidx.constraintlayout.helper.widget.Layer) r2
            r2.A0D = r8
            float r1 = r2.getRotation()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            float r0 = r2.A06
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r2.A06 = r1
        L_0x002f:
            int r3 = r3 + 1
            if (r3 >= r4) goto L_0x0034
            goto L_0x000e
        L_0x0034:
            r13 = r23
            super.dispatchDraw(r13)
            boolean r0 = r8.isInEditMode()
            if (r0 == 0) goto L_0x00f5
            int r7 = r8.getChildCount()
            int r0 = r8.getWidth()
            float r6 = (float) r0
            int r0 = r8.getHeight()
            float r5 = (float) r0
            r4 = 0
        L_0x004e:
            if (r4 >= r7) goto L_0x00f5
            android.view.View r2 = r8.getChildAt(r4)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00f1
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto L_0x00f1
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ","
            java.lang.String[] r3 = r1.split(r0)
            int r1 = r3.length
            r0 = 4
            if (r1 != r0) goto L_0x00f1
            r0 = r3[r12]
            int r2 = java.lang.Integer.parseInt(r0)
            r0 = 1
            r0 = r3[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 2
            r0 = r3[r0]
            int r11 = java.lang.Integer.parseInt(r0)
            r0 = 3
            r0 = r3[r0]
            int r3 = java.lang.Integer.parseInt(r0)
            float r0 = (float) r2
            r2 = 1149698048(0x44870000, float:1080.0)
            float r0 = r0 / r2
            float r0 = r0 * r6
            int r10 = (int) r0
            float r0 = (float) r1
            r1 = 1156579328(0x44f00000, float:1920.0)
            float r0 = r0 / r1
            float r0 = r0 * r5
            int r9 = (int) r0
            float r0 = (float) r11
            float r0 = r0 / r2
            float r0 = r0 * r6
            int r2 = (int) r0
            float r0 = (float) r3
            float r0 = r0 / r1
            float r0 = r0 * r5
            int r1 = (int) r0
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r3.setColor(r0)
            float r14 = (float) r10
            float r15 = (float) r9
            int r10 = r10 + r2
            float r2 = (float) r10
            r16 = r2
            r17 = r15
            r18 = r3
            r13.drawLine(r14, r15, r16, r17, r18)
            int r9 = r9 + r1
            float r1 = (float) r9
            r19 = r2
            r16 = r13
            r17 = r2
            r18 = r15
            r20 = r1
            r21 = r3
            r16.drawLine(r17, r18, r19, r20, r21)
            r18 = r1
            r19 = r14
            r16.drawLine(r17, r18, r19, r20, r21)
            r17 = r14
            r20 = r15
            r16.drawLine(r17, r18, r19, r20, r21)
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r3.setColor(r0)
            r16 = r2
            r17 = r1
            r18 = r3
            r13.drawLine(r14, r15, r16, r17, r18)
            r16 = r13
            r17 = r14
            r18 = r1
            r19 = r2
            r16.drawLine(r17, r18, r19, r20, r21)
        L_0x00f1:
            int r4 = r4 + 1
            goto L_0x004e
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int getOptimizationLevel() {
        return this.A07.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0670, code lost:
        if (r14.A01 <= 0.0f) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0684, code lost:
        if (r1 != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0704, code lost:
        if (r16 == 0) goto L_0x070e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x070c, code lost:
        if (r16 == 0) goto L_0x070e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x070e, code lost:
        r13 = java.lang.Math.max(0, r2.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0718, code lost:
        if (r16 == 0) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0720, code lost:
        if (r16 == 0) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0722, code lost:
        r14 = java.lang.Math.max(0, r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0907, code lost:
        if (r4 != 2) goto L_0x0909;
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0454 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r30, int r31) {
        /*
            r29 = this;
            r2 = r29
            X.1s5 r3 = r2.A07
            r4 = 0
            android.content.Context r0 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001c
            int r1 = r2.getLayoutDirection()
            r0 = 1
            if (r0 != r1) goto L_0x001c
            r4 = 1
        L_0x001c:
            r3.A09 = r4
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x054a
            r11 = 0
            r2.A0D = r11
            int r4 = r2.getChildCount()
            r1 = 0
        L_0x002a:
            if (r1 >= r4) goto L_0x054a
            android.view.View r0 = r2.getChildAt(r1)
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x0052
            r10 = 1
            boolean r16 = r2.isInEditMode()
            int r9 = r2.getChildCount()
            r1 = 0
        L_0x0040:
            if (r1 >= r9) goto L_0x0055
            android.view.View r0 = r2.getChildAt(r1)
            X.1s3 r0 = r2.A06(r0)
            if (r0 == 0) goto L_0x004f
            r0.A07()
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0055:
            r6 = -1
            if (r16 == 0) goto L_0x00d8
            r7 = 0
        L_0x0059:
            if (r7 >= r9) goto L_0x00d8
            android.view.View r8 = r2.getChildAt(r7)
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ NotFoundException -> 0x00d5 }
            int r0 = r8.getId()     // Catch:{ NotFoundException -> 0x00d5 }
            java.lang.String r5 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            int r0 = r8.getId()     // Catch:{ NotFoundException -> 0x00d5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r5 == 0) goto L_0x0094
            java.util.HashMap r0 = r2.A0C     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 != 0) goto L_0x0080
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00d5 }
            r0.<init>()     // Catch:{ NotFoundException -> 0x00d5 }
            r2.A0C = r0     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x0080:
            r1 = r5
            java.lang.String r0 = "/"
            int r0 = r5.indexOf(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 == r6) goto L_0x008f
            int r0 = r0 + 1
            java.lang.String r1 = r5.substring(r0)     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x008f:
            java.util.HashMap r0 = r2.A0C     // Catch:{ NotFoundException -> 0x00d5 }
            r0.put(r1, r4)     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x0094:
            r0 = 47
            int r0 = r5.indexOf(r0)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 == r6) goto L_0x00a2
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x00a2:
            int r4 = r8.getId()     // Catch:{ NotFoundException -> 0x00d5 }
            if (r4 == 0) goto L_0x00c9
            android.util.SparseArray r0 = r2.A05     // Catch:{ NotFoundException -> 0x00d5 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ NotFoundException -> 0x00d5 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ NotFoundException -> 0x00d5 }
            if (r1 != 0) goto L_0x00c6
            android.view.View r1 = r2.findViewById(r4)     // Catch:{ NotFoundException -> 0x00d5 }
            if (r1 == 0) goto L_0x00c4
            if (r1 == r2) goto L_0x00c6
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ NotFoundException -> 0x00d5 }
            if (r0 != r2) goto L_0x00c6
            r2.onViewAdded(r1)     // Catch:{ NotFoundException -> 0x00d5 }
            goto L_0x00c6
        L_0x00c4:
            r0 = 0
            goto L_0x00d3
        L_0x00c6:
            if (r1 == r2) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r0 = r3
            goto L_0x00d3
        L_0x00cb:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()     // Catch:{ NotFoundException -> 0x00d5 }
            X.1sZ r0 = (X.C39151sZ) r0     // Catch:{ NotFoundException -> 0x00d5 }
            X.1s3 r0 = r0.A0r     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x00d3:
            r0.A0f = r5     // Catch:{ NotFoundException -> 0x00d5 }
        L_0x00d5:
            int r7 = r7 + 1
            goto L_0x0059
        L_0x00d8:
            int r0 = r2.A00
            if (r0 == r6) goto L_0x00e9
            r1 = 0
        L_0x00dd:
            if (r1 >= r9) goto L_0x00e9
            android.view.View r0 = r2.getChildAt(r1)
            r0.getId()
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x00e9:
            X.Cw9 r0 = r2.A0A
            if (r0 == 0) goto L_0x00f0
            r0.A0B(r2)
        L_0x00f0:
            java.util.ArrayList r0 = r3.A00
            r0.clear()
            java.util.ArrayList r12 = r2.A0B
            int r8 = r12.size()
            if (r8 <= 0) goto L_0x0185
            r7 = 0
        L_0x00fe:
            java.lang.Object r6 = r12.get(r7)
            X.1sd r6 = (X.C39171sd) r6
            boolean r0 = r6.isInEditMode()
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = r6.A03
            r6.setIds(r0)
        L_0x010f:
            X.3K8 r0 = r6.A02
            if (r0 == 0) goto L_0x017f
            X.27N r0 = (X.AnonymousClass27N) r0
            r0.A00 = r11
            X.1s3[] r1 = r0.A01
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            r5 = 0
        L_0x011e:
            int r0 = r6.A00
            if (r5 >= r0) goto L_0x017f
            int[] r0 = r6.A05
            r1 = r0[r5]
            android.util.SparseArray r14 = r2.A05
            java.lang.Object r0 = r14.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0155
            java.util.HashMap r13 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r13.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            int r1 = X.C39171sd.A00(r6, r2, r4)
            if (r1 == 0) goto L_0x017c
            int[] r0 = r6.A05
            r0[r5] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r13.put(r0, r4)
            java.lang.Object r0 = r14.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x017c
        L_0x0155:
            X.3K8 r4 = r6.A02
            X.1s3 r13 = r2.A06(r0)
            X.27N r4 = (X.AnonymousClass27N) r4
            if (r13 == r4) goto L_0x017c
            if (r13 == 0) goto L_0x017c
            int r0 = r4.A00
            int r14 = r0 + 1
            X.1s3[] r1 = r4.A01
            int r0 = r1.length
            if (r14 <= r0) goto L_0x0174
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.1s3[] r1 = (X.C38871s3[]) r1
            r4.A01 = r1
        L_0x0174:
            int r0 = r4.A00
            r1[r0] = r13
            int r0 = r0 + 1
            r4.A00 = r0
        L_0x017c:
            int r5 = r5 + 1
            goto L_0x011e
        L_0x017f:
            int r7 = r7 + 1
            if (r7 >= r8) goto L_0x0185
            goto L_0x00fe
        L_0x0185:
            r0 = 0
        L_0x0186:
            if (r0 >= r9) goto L_0x018e
            r2.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x0186
        L_0x018e:
            android.util.SparseArray r8 = r2.A06
            r8.clear()
            r8.put(r11, r3)
            int r0 = r2.getId()
            r8.put(r0, r3)
            r4 = 0
        L_0x019e:
            if (r4 >= r9) goto L_0x01b2
            android.view.View r0 = r2.getChildAt(r4)
            X.1s3 r1 = r2.A06(r0)
            int r0 = r0.getId()
            r8.put(r0, r1)
            int r4 = r4 + 1
            goto L_0x019e
        L_0x01b2:
            r7 = 0
        L_0x01b3:
            if (r7 >= r9) goto L_0x050c
            android.view.View r1 = r2.getChildAt(r7)
            X.1s3 r6 = r2.A06(r1)
            if (r6 == 0) goto L_0x020f
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            X.1sZ r5 = (X.C39151sZ) r5
            java.util.ArrayList r0 = r3.A00
            r0.add(r6)
            X.1s3 r0 = r6.A0Z
            if (r0 == 0) goto L_0x01d8
            X.1s4 r0 = (X.C38881s4) r0
            java.util.ArrayList r0 = r0.A00
            r0.remove(r6)
            r0 = 0
            r6.A0Z = r0
        L_0x01d8:
            r6.A0Z = r3
            r5.A00()
            int r0 = r1.getVisibility()
            r6.A0N = r0
            r6.A0e = r1
            boolean r0 = r1 instanceof X.C39171sd
            if (r0 == 0) goto L_0x01f0
            X.1sd r1 = (X.C39171sd) r1
            boolean r0 = r3.A09
            r1.A07(r6, r0)
        L_0x01f0:
            boolean r0 = r5.A0x
            r4 = -1
            if (r0 == 0) goto L_0x022a
            X.27L r6 = (X.AnonymousClass27L) r6
            int r13 = r5.A0e
            int r12 = r5.A0f
            float r1 = r5.A06
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x020f
            r6.A00 = r1
            r6.A02 = r4
        L_0x020d:
            r6.A03 = r4
        L_0x020f:
            int r7 = r7 + 1
            goto L_0x01b3
        L_0x0212:
            if (r13 == r4) goto L_0x021d
            if (r13 <= r4) goto L_0x020f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A00 = r0
            r6.A02 = r13
            goto L_0x020d
        L_0x021d:
            if (r12 == r4) goto L_0x020f
            if (r12 <= r4) goto L_0x020f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A00 = r0
            r6.A02 = r4
            r6.A03 = r12
            goto L_0x020f
        L_0x022a:
            int r13 = r5.A0g
            int r1 = r5.A0h
            int r0 = r5.A0i
            r19 = r0
            int r14 = r5.A0j
            int r0 = r5.A0c
            r18 = r0
            int r0 = r5.A0d
            r17 = r0
            float r12 = r5.A07
            int r0 = r5.A0D
            if (r0 == r4) goto L_0x0354
            java.lang.Object r14 = r8.get(r0)
            X.1s3 r14 = (X.C38871s3) r14
            if (r14 == 0) goto L_0x025d
            float r13 = r5.A00
            int r12 = r5.A0E
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            X.1sC r1 = r6.A06(r0)
            X.1sC r0 = r14.A06(r0)
            r1.A05(r0, r12, r11, r10)
            r6.A00 = r13
        L_0x025d:
            if (r16 == 0) goto L_0x026d
            int r1 = r5.A0G
            if (r1 != r4) goto L_0x0267
            int r0 = r5.A0H
            if (r0 == r4) goto L_0x026d
        L_0x0267:
            int r0 = r5.A0H
            r6.A0P = r1
            r6.A0Q = r0
        L_0x026d:
            boolean r0 = r5.A0w
            r12 = -2
            if (r0 != 0) goto L_0x033f
            int r0 = r5.width
            if (r0 != r4) goto L_0x0334
            boolean r0 = r5.A0v
            if (r0 == 0) goto L_0x0330
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
        L_0x027c:
            java.lang.Integer[] r0 = r6.A0q
            r0[r11] = r1
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            X.1sC r1 = r6.A06(r0)
            int r0 = r5.leftMargin
            r1.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.1sC r1 = r6.A06(r0)
            int r0 = r5.rightMargin
            r1.A01 = r0
        L_0x0294:
            boolean r0 = r5.A10
            if (r0 != 0) goto L_0x031c
            int r0 = r5.height
            if (r0 != r4) goto L_0x0312
            boolean r0 = r5.A0u
            if (r0 == 0) goto L_0x030f
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
        L_0x02a2:
            java.lang.Integer[] r0 = r6.A0q
            r0[r10] = r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.1sC r1 = r6.A06(r0)
            int r0 = r5.topMargin
            r1.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.1sC r1 = r6.A06(r0)
            int r0 = r5.bottomMargin
            r1.A01 = r0
        L_0x02ba:
            java.lang.String r1 = r5.A0t
            r12 = 0
            if (r1 == 0) goto L_0x04ac
            int r14 = r1.length()
            if (r14 == 0) goto L_0x04ac
            r0 = 44
            int r13 = r1.indexOf(r0)
            r15 = 0
            if (r13 <= 0) goto L_0x02ec
            int r0 = r14 + -1
            if (r13 >= r0) goto L_0x02ec
            java.lang.String r4 = r1.substring(r11, r13)
            java.lang.String r0 = "W"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = "H"
            boolean r0 = r4.equalsIgnoreCase(r0)
            r15 = -1
            if (r0 == 0) goto L_0x02e8
            r15 = 1
        L_0x02e8:
            int r0 = r13 + 1
            r4 = r15
            r15 = r0
        L_0x02ec:
            r0 = 58
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L_0x0495
            int r14 = r14 - r10
            if (r0 >= r14) goto L_0x0495
            java.lang.String r13 = r1.substring(r15, r0)
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x04ae
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ae
            goto L_0x0477
        L_0x030f:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x02a2
        L_0x0312:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            java.lang.Integer[] r0 = r6.A0q
            r0[r10] = r1
            r6.A09(r11)
            goto L_0x02ba
        L_0x031c:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.Integer[] r0 = r6.A0q
            r0[r10] = r1
            int r0 = r5.height
            r6.A09(r0)
            if (r0 != r12) goto L_0x02ba
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            java.lang.Integer[] r0 = r6.A0q
            r0[r10] = r1
            goto L_0x02ba
        L_0x0330:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x027c
        L_0x0334:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            java.lang.Integer[] r0 = r6.A0q
            r0[r11] = r1
            r6.A0A(r11)
            goto L_0x0294
        L_0x033f:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.Integer[] r0 = r6.A0q
            r0[r11] = r1
            int r0 = r5.width
            r6.A0A(r0)
            if (r0 != r12) goto L_0x0294
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            java.lang.Integer[] r0 = r6.A0q
            r0[r11] = r1
            goto L_0x0294
        L_0x0354:
            if (r13 == r4) goto L_0x0465
            java.lang.Object r13 = r8.get(r13)
            X.1s3 r13 = (X.C38871s3) r13
            if (r13 == 0) goto L_0x0370
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            int r15 = r5.leftMargin
            r0 = r1
        L_0x0363:
            X.1sC r1 = r6.A06(r1)
            X.1sC r0 = r13.A06(r0)
            r13 = r18
            r1.A05(r0, r15, r13, r10)
        L_0x0370:
            r0 = r19
            if (r0 == r4) goto L_0x0454
            java.lang.Object r15 = r8.get(r0)
            X.1s3 r15 = (X.C38871s3) r15
            if (r15 == 0) goto L_0x038f
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            int r14 = r5.rightMargin
        L_0x0382:
            X.1sC r13 = r6.A06(r1)
            X.1sC r1 = r15.A06(r0)
            r0 = r17
            r13.A05(r1, r14, r0, r10)
        L_0x038f:
            int r0 = r5.A0p
            if (r0 == r4) goto L_0x043e
            java.lang.Object r15 = r8.get(r0)
            X.1s3 r15 = (X.C38871s3) r15
            if (r15 == 0) goto L_0x03ad
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            int r14 = r5.topMargin
            int r13 = r5.A0P
            r0 = r1
        L_0x03a2:
            X.1sC r1 = r6.A06(r1)
            X.1sC r0 = r15.A06(r0)
            r1.A05(r0, r14, r13, r10)
        L_0x03ad:
            int r0 = r5.A0C
            if (r0 == r4) goto L_0x042a
            java.lang.Object r15 = r8.get(r0)
            X.1s3 r15 = (X.C38871s3) r15
            if (r15 == 0) goto L_0x03cc
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            int r14 = r5.bottomMargin
            int r13 = r5.A0K
        L_0x03c1:
            X.1sC r1 = r6.A06(r1)
            X.1sC r0 = r15.A06(r0)
            r1.A05(r0, r14, r13, r10)
        L_0x03cc:
            int r13 = r5.A0A
            if (r13 == r4) goto L_0x0419
            android.util.SparseArray r0 = r2.A05
            java.lang.Object r1 = r0.get(r13)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r14 = r8.get(r13)
            X.1s3 r14 = (X.C38871s3) r14
            if (r14 == 0) goto L_0x0419
            if (r1 == 0) goto L_0x0419
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof X.C39151sZ
            if (r0 == 0) goto L_0x0419
            android.view.ViewGroup$LayoutParams r13 = r1.getLayoutParams()
            X.1sZ r13 = (X.C39151sZ) r13
            r5.A0z = r10
            r13.A0z = r10
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            X.1sC r1 = r6.A06(r0)
            X.1sC r0 = r14.A06(r0)
            r1.A05(r0, r11, r4, r10)
            r6.A0h = r10
            X.1s3 r0 = r13.A0r
            r0.A0h = r10
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.1sC r0 = r6.A06(r0)
            r0.A02()
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.1sC r0 = r6.A06(r0)
            r0.A02()
        L_0x0419:
            r13 = 0
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0420
            r6.A02 = r12
        L_0x0420:
            float r1 = r5.A08
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x025d
            r6.A06 = r1
            goto L_0x025d
        L_0x042a:
            int r0 = r5.A0B
            if (r0 == r4) goto L_0x03cc
            java.lang.Object r15 = r8.get(r0)
            X.1s3 r15 = (X.C38871s3) r15
            if (r15 == 0) goto L_0x03cc
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            int r14 = r5.bottomMargin
            int r13 = r5.A0K
            r0 = r1
            goto L_0x03c1
        L_0x043e:
            int r0 = r5.A0o
            if (r0 == r4) goto L_0x03ad
            java.lang.Object r15 = r8.get(r0)
            X.1s3 r15 = (X.C38871s3) r15
            if (r15 == 0) goto L_0x03ad
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            int r14 = r5.topMargin
            int r13 = r5.A0P
            goto L_0x03a2
        L_0x0454:
            if (r14 == r4) goto L_0x038f
            java.lang.Object r15 = r8.get(r14)
            X.1s3 r15 = (X.C38871s3) r15
            if (r15 == 0) goto L_0x038f
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            int r14 = r5.rightMargin
            r0 = r1
            goto L_0x0382
        L_0x0465:
            if (r1 == r4) goto L_0x0370
            java.lang.Object r13 = r8.get(r1)
            X.1s3 r13 = (X.C38871s3) r13
            if (r13 == 0) goto L_0x0370
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            int r15 = r5.leftMargin
            goto L_0x0363
        L_0x0477:
            float r13 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x04ae }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            if (r4 != r10) goto L_0x048f
            float r1 = r1 / r13
            float r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a3
        L_0x048f:
            float r13 = r13 / r1
            float r1 = java.lang.Math.abs(r13)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a3
        L_0x0495:
            java.lang.String r1 = r1.substring(r15)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ae
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04ae }
        L_0x04a3:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            r6.A01 = r1
            r6.A08 = r4
            goto L_0x04ae
        L_0x04ac:
            r6.A01 = r12
        L_0x04ae:
            float r0 = r5.A03
            float[] r1 = r6.A0j
            r1[r11] = r0
            float r0 = r5.A09
            r1[r10] = r0
            int r0 = r5.A0S
            r6.A0A = r0
            int r0 = r5.A0q
            r6.A0L = r0
            int r4 = r5.A0W
            int r0 = r5.A0a
            int r13 = r5.A0Y
            float r1 = r5.A05
            r6.A0D = r4
            r6.A0H = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r0) goto L_0x04d2
            r13 = 0
        L_0x04d2:
            r6.A0F = r13
            r6.A04 = r1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x04e5
            if (r4 != 0) goto L_0x04e5
            r0 = 2
            r6.A0D = r0
        L_0x04e5:
            int r4 = r5.A0V
            int r0 = r5.A0Z
            int r13 = r5.A0X
            float r1 = r5.A04
            r6.A0C = r4
            r6.A0G = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r0) goto L_0x04f7
            r13 = 0
        L_0x04f7:
            r6.A0E = r13
            r6.A03 = r1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020f
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x020f
            if (r4 != 0) goto L_0x020f
            r0 = 2
            r6.A0C = r0
            goto L_0x020f
        L_0x050c:
            X.1sD r0 = r3.A06
            java.util.ArrayList r9 = r0.A02
            r9.clear()
            java.util.ArrayList r8 = r3.A00
            int r7 = r8.size()
            r6 = 0
        L_0x051a:
            if (r6 >= r7) goto L_0x0545
            java.lang.Object r5 = r8.get(r6)
            X.1s3 r5 = (X.C38871s3) r5
            java.lang.Integer[] r0 = r5.A0q
            r0 = r0[r11]
            java.lang.Integer r10 = X.AnonymousClass00R.A0C
            if (r0 == r10) goto L_0x053f
            java.lang.Integer[] r0 = r5.A0q
            r0 = r0[r11]
            java.lang.Integer r4 = X.AnonymousClass00R.A0N
            if (r0 == r4) goto L_0x053f
            java.lang.Integer[] r0 = r5.A0q
            r1 = 1
            r0 = r0[r1]
            if (r0 == r10) goto L_0x053f
            java.lang.Integer[] r0 = r5.A0q
            r0 = r0[r1]
            if (r0 != r4) goto L_0x0542
        L_0x053f:
            r9.add(r5)
        L_0x0542:
            int r6 = r6 + 1
            goto L_0x051a
        L_0x0545:
            X.1sF r1 = r3.A07
            r0 = 1
            r1.A07 = r0
        L_0x054a:
            int r0 = r2.A0E
            r22 = r0
            r28 = r30
            int r11 = android.view.View.MeasureSpec.getMode(r28)
            int r5 = android.view.View.MeasureSpec.getSize(r28)
            r27 = r31
            int r9 = android.view.View.MeasureSpec.getMode(r27)
            int r4 = android.view.View.MeasureSpec.getSize(r27)
            int r0 = r2.getPaddingTop()
            r1 = 0
            int r10 = java.lang.Math.max(r1, r0)
            int r0 = r2.getPaddingBottom()
            int r0 = java.lang.Math.max(r1, r0)
            int r7 = r10 + r0
            int r6 = r2.getPaddingWidth()
            X.1sV r8 = r2.A08
            r8.A04 = r10
            r8.A02 = r0
            r8.A05 = r6
            r8.A03 = r7
            r0 = r28
            r8.A01 = r0
            r0 = r27
            r8.A00 = r0
            int r0 = r2.getPaddingStart()
            int r15 = java.lang.Math.max(r1, r0)
            int r0 = r2.getPaddingEnd()
            int r12 = java.lang.Math.max(r1, r0)
            if (r15 > 0) goto L_0x072a
            if (r12 > 0) goto L_0x072a
            int r0 = r2.getPaddingLeft()
            int r15 = java.lang.Math.max(r1, r0)
        L_0x05a7:
            int r5 = r5 - r6
            int r4 = r4 - r7
            r14 = r5
            r13 = r4
            int r6 = r8.A03
            int r1 = r8.A05
            java.lang.Integer r19 = X.AnonymousClass00R.A00
            r25 = r19
            r17 = r19
            int r16 = r2.getChildCount()
            r7 = 1073741824(0x40000000, float:2.0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 0
            if (r11 == r0) goto L_0x071e
            if (r11 == 0) goto L_0x0716
            if (r11 != r7) goto L_0x071b
            int r14 = r2.A02
            int r14 = r14 - r1
            int r14 = java.lang.Math.min(r14, r5)
        L_0x05cb:
            if (r9 == r0) goto L_0x070a
            if (r9 == 0) goto L_0x0702
            if (r9 != r7) goto L_0x0707
            int r0 = r2.A01
            int r0 = r0 - r6
            int r13 = java.lang.Math.min(r0, r4)
        L_0x05d8:
            int r0 = r3.A03()
            if (r14 != r0) goto L_0x05e4
            int r0 = r3.A02()
            if (r13 == r0) goto L_0x05e9
        L_0x05e4:
            X.1sF r7 = r3.A07
            r0 = 1
            r7.A08 = r0
        L_0x05e9:
            r3.A0P = r12
            r3.A0Q = r12
            int r0 = r2.A02
            int r0 = r0 - r1
            int[] r7 = r3.A0k
            r7[r12] = r0
            int r0 = r2.A01
            int r0 = r0 - r6
            r18 = 1
            r7[r18] = r0
            r3.A0J = r12
            r3.A0I = r12
            java.lang.Integer[] r0 = r3.A0q
            r24 = r0
            r0[r12] = r19
            r3.A0A(r14)
            r0[r18] = r17
            r3.A09(r13)
            int r0 = r2.A04
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0613
            r0 = 0
        L_0x0613:
            r3.A0J = r0
            int r0 = r2.A03
            int r0 = r0 - r6
            if (r0 >= 0) goto L_0x061b
            r0 = 0
        L_0x061b:
            r3.A0I = r0
            r3.A02 = r15
            r3.A03 = r10
            X.1sD r10 = r3.A06
            X.1sU r0 = r3.A05
            r26 = r0
            java.util.ArrayList r13 = r3.A00
            int r23 = r13.size()
            int r21 = r3.A03()
            int r20 = r3.A02()
            r6 = 128(0x80, float:1.794E-43)
            r0 = r22 & r6
            r1 = 0
            if (r0 != r6) goto L_0x063d
            r1 = 1
        L_0x063d:
            r6 = 0
            if (r1 != 0) goto L_0x0646
            r14 = 64
            r0 = r22 & 64
            if (r0 != r14) goto L_0x067b
        L_0x0646:
            r0 = r23
            if (r12 >= r0) goto L_0x067d
            java.lang.Object r14 = r13.get(r12)
            X.1s3 r14 = (X.C38871s3) r14
            java.lang.Integer[] r0 = r14.A0q
            r0 = r0[r6]
            java.lang.Integer r15 = X.AnonymousClass00R.A0C
            r17 = 0
            if (r0 != r15) goto L_0x065c
            r17 = 1
        L_0x065c:
            java.lang.Integer[] r0 = r14.A0q
            r0 = r0[r18]
            r16 = 0
            if (r0 != r15) goto L_0x0666
            r16 = 1
        L_0x0666:
            if (r17 == 0) goto L_0x0672
            if (r16 == 0) goto L_0x0672
            float r0 = r14.A01
            r15 = 0
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r15 = 1
            if (r0 > 0) goto L_0x0673
        L_0x0672:
            r15 = 0
        L_0x0673:
            boolean r0 = r14.A0G()
            if (r0 == 0) goto L_0x06e5
            if (r15 == 0) goto L_0x06e5
        L_0x067b:
            r18 = 0
        L_0x067d:
            r13 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x0683
            if (r9 == r13) goto L_0x0686
        L_0x0683:
            r0 = 0
            if (r1 == 0) goto L_0x0687
        L_0x0686:
            r0 = 1
        L_0x0687:
            r18 = r18 & r0
            if (r18 == 0) goto L_0x0909
            r0 = r7[r6]
            int r5 = java.lang.Math.min(r0, r5)
            r12 = 1
            r0 = r7[r12]
            int r4 = java.lang.Math.min(r0, r4)
            if (r11 != r13) goto L_0x06a5
            r0 = r21
            if (r0 == r5) goto L_0x06a5
            r3.A0A(r5)
            X.1sF r0 = r3.A07
            r0.A07 = r12
        L_0x06a5:
            if (r9 != r13) goto L_0x06b2
            r0 = r20
            if (r0 == r4) goto L_0x06b2
            r3.A09(r4)
            X.1sF r0 = r3.A07
            r0.A07 = r12
        L_0x06b2:
            if (r11 != r13) goto L_0x087d
            if (r9 != r13) goto L_0x087d
            X.1sF r7 = r3.A07
            r22 = 1
            r15 = r1 & 1
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x06c4
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0751
        L_0x06c4:
            X.1s5 r4 = r7.A00
            java.util.ArrayList r0 = r4.A00
            java.util.Iterator r5 = r0.iterator()
        L_0x06cc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0743
            java.lang.Object r1 = r5.next()
            X.1s3 r1 = (X.C38871s3) r1
            r1.A0i = r6
            X.1s8 r0 = r1.A0c
            r0.A0C()
            X.1sB r0 = r1.A0d
            r0.A0C()
            goto L_0x06cc
        L_0x06e5:
            boolean r0 = r14.A0H()
            if (r0 == 0) goto L_0x06ee
            if (r15 == 0) goto L_0x06ee
            goto L_0x067b
        L_0x06ee:
            boolean r0 = r14 instanceof X.BJP
            if (r0 != 0) goto L_0x067b
            boolean r0 = r14.A0G()
            if (r0 != 0) goto L_0x067b
            boolean r0 = r14.A0H()
            if (r0 != 0) goto L_0x067b
            int r12 = r12 + 1
            goto L_0x0646
        L_0x0702:
            java.lang.Integer r17 = X.AnonymousClass00R.A01
            if (r16 != 0) goto L_0x0707
            goto L_0x070e
        L_0x0707:
            r13 = 0
            goto L_0x05d8
        L_0x070a:
            java.lang.Integer r17 = X.AnonymousClass00R.A01
            if (r16 != 0) goto L_0x05d8
        L_0x070e:
            int r0 = r2.A03
            int r13 = java.lang.Math.max(r12, r0)
            goto L_0x05d8
        L_0x0716:
            java.lang.Integer r19 = X.AnonymousClass00R.A01
            if (r16 != 0) goto L_0x071b
            goto L_0x0722
        L_0x071b:
            r14 = 0
            goto L_0x05cb
        L_0x071e:
            java.lang.Integer r19 = X.AnonymousClass00R.A01
            if (r16 != 0) goto L_0x05cb
        L_0x0722:
            int r14 = r2.A04
            int r14 = java.lang.Math.max(r12, r14)
            goto L_0x05cb
        L_0x072a:
            android.content.Context r0 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x05a7
            int r1 = r2.getLayoutDirection()
            r0 = 1
            if (r0 != r1) goto L_0x05a7
            r15 = r12
            goto L_0x05a7
        L_0x0743:
            r4.A0i = r6
            X.1s8 r0 = r4.A0c
            r0.A0C()
            X.1sB r0 = r4.A0d
            r0.A0C()
            r7.A08 = r6
        L_0x0751:
            X.1s5 r0 = r7.A01
            X.C38951sF.A02(r0, r7)
            X.1s5 r5 = r7.A00
            r5.A0P = r6
            r5.A0Q = r6
            java.lang.Integer[] r0 = r5.A0q
            r19 = r0[r6]
            r18 = r0[r12]
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0769
            r7.A05()
        L_0x0769:
            int r17 = r5.A04()
            int r16 = r5.A05()
            X.1s8 r4 = r5.A0c
            X.1s9 r1 = r4.A04
            r0 = r17
            r1.A01(r0)
            X.1sB r1 = r5.A0d
            X.1s9 r14 = r1.A04
            r0 = r16
            r14.A01(r0)
            r7.A06()
            java.lang.Integer r14 = X.AnonymousClass00R.A01
            r0 = r19
            if (r0 == r14) goto L_0x0790
            r0 = r18
            if (r0 != r14) goto L_0x07aa
        L_0x0790:
            if (r15 == 0) goto L_0x07aa
            java.util.ArrayList r0 = r7.A05
            java.util.Iterator r15 = r0.iterator()
        L_0x0798:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x080c
            java.lang.Object r0 = r15.next()
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0798
        L_0x07aa:
            java.lang.Integer[] r14 = r5.A0q
            r15 = r14[r6]
            r0 = r25
            if (r15 == r0) goto L_0x07d6
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r15 == r0) goto L_0x07d6
            r15 = 0
        L_0x07b7:
            java.util.ArrayList r4 = r7.A05
            java.util.Iterator r7 = r4.iterator()
        L_0x07bd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x083e
            java.lang.Object r1 = r7.next()
            X.1s7 r1 = (X.AnonymousClass1s7) r1
            X.1s3 r0 = r1.A02
            if (r0 != r5) goto L_0x07d2
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x07d2
            goto L_0x07bd
        L_0x07d2:
            r1.A06()
            goto L_0x07bd
        L_0x07d6:
            int r15 = r5.A03()
            int r15 = r15 + r17
            X.1s9 r0 = r4.A03
            r0.A01(r15)
            X.1sA r0 = r4.A05
            int r15 = r15 - r17
            r0.A01(r15)
            r7.A06()
            r4 = r14[r12]
            r0 = r25
            if (r4 == r0) goto L_0x07f5
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r4 != r0) goto L_0x0807
        L_0x07f5:
            int r4 = r5.A02()
            int r4 = r4 + r16
            X.1s9 r0 = r1.A03
            r0.A01(r4)
            X.1sA r0 = r1.A05
            int r4 = r4 - r16
            r0.A01(r4)
        L_0x0807:
            r7.A06()
            r15 = 1
            goto L_0x07b7
        L_0x080c:
            r0 = r19
            if (r0 != r14) goto L_0x0824
            java.lang.Integer[] r0 = r5.A0q
            r0[r6] = r25
            int r0 = X.C38951sF.A00(r5, r7, r6)
            r5.A0A(r0)
            X.1sA r0 = r4.A05
            int r15 = r5.A03()
            r0.A01(r15)
        L_0x0824:
            r0 = r18
            if (r0 != r14) goto L_0x07aa
            java.lang.Integer[] r0 = r5.A0q
            r0[r12] = r25
            int r0 = X.C38951sF.A00(r5, r7, r12)
            r5.A09(r0)
            X.1sA r14 = r1.A05
            int r0 = r5.A02()
            r14.A01(r0)
            goto L_0x07aa
        L_0x083e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0842:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0867
            java.lang.Object r1 = r4.next()
            X.1s7 r1 = (X.AnonymousClass1s7) r1
            if (r15 != 0) goto L_0x0855
            X.1s3 r0 = r1.A02
            if (r0 != r5) goto L_0x0855
            goto L_0x0842
        L_0x0855:
            X.1s9 r0 = r1.A04
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0865
            X.1s9 r0 = r1.A03
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x086e
            boolean r0 = r1 instanceof X.AnonymousClass27P
            if (r0 != 0) goto L_0x086e
        L_0x0865:
            r22 = 0
        L_0x0867:
            r14[r6] = r19
            r14[r12] = r18
            r4 = 2
            goto L_0x08f9
        L_0x086e:
            X.1sA r0 = r1.A05
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0842
            boolean r0 = r1 instanceof X.AnonymousClass27R
            if (r0 != 0) goto L_0x0842
            boolean r0 = r1 instanceof X.AnonymousClass27P
            if (r0 != 0) goto L_0x0842
            goto L_0x0865
        L_0x087d:
            X.1sF r5 = r3.A07
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x08cb
            X.1s5 r7 = r5.A00
            java.util.ArrayList r0 = r7.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x088b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x08b0
            java.lang.Object r14 = r15.next()
            X.1s3 r14 = (X.C38871s3) r14
            r14.A0i = r6
            X.1s8 r4 = r14.A0c
            X.1sA r0 = r4.A05
            r0.A0B = r6
            r4.A09 = r6
            r4.A0C()
            X.1sB r4 = r14.A0d
            X.1sA r0 = r4.A05
            r0.A0B = r6
            r4.A09 = r6
            r4.A0C()
            goto L_0x088b
        L_0x08b0:
            r7.A0i = r6
            X.1s8 r4 = r7.A0c
            X.1sA r0 = r4.A05
            r0.A0B = r6
            r4.A09 = r6
            r4.A0C()
            X.1sB r4 = r7.A0d
            X.1sA r0 = r4.A05
            r0.A0B = r6
            r4.A09 = r6
            r4.A0C()
            r5.A05()
        L_0x08cb:
            X.1s5 r0 = r5.A01
            X.C38951sF.A02(r0, r5)
            X.1s5 r4 = r5.A00
            r4.A0P = r6
            r4.A0Q = r6
            X.1s8 r0 = r4.A0c
            X.1s9 r0 = r0.A04
            r0.A01(r6)
            X.1sB r0 = r4.A0d
            X.1s9 r0 = r0.A04
            r0.A01(r6)
            r22 = 1
            if (r11 != r13) goto L_0x094f
            boolean r0 = r3.A0K(r6, r1)
            r22 = r0 & 1
            r4 = 1
        L_0x08ef:
            if (r9 != r13) goto L_0x08f9
            boolean r0 = r3.A0K(r12, r1)
            r22 = r22 & r0
            int r4 = r4 + 1
        L_0x08f9:
            if (r22 == 0) goto L_0x0909
            r1 = 0
            if (r11 != r13) goto L_0x08ff
            r1 = 1
        L_0x08ff:
            r0 = 0
            if (r9 != r13) goto L_0x0903
            r0 = 1
        L_0x0903:
            r3.A0F(r1, r0)
            r0 = 2
            if (r4 == r0) goto L_0x0b23
        L_0x0909:
            if (r23 <= 0) goto L_0x0973
            java.util.ArrayList r0 = r3.A00
            int r12 = r0.size()
            X.1sU r11 = r3.A05
            r9 = 0
        L_0x0914:
            if (r9 >= r12) goto L_0x0951
            java.util.ArrayList r0 = r3.A00
            java.lang.Object r7 = r0.get(r9)
            X.1s3 r7 = (X.C38871s3) r7
            boolean r0 = r7 instanceof X.AnonymousClass27L
            if (r0 != 0) goto L_0x0932
            X.1s8 r0 = r7.A0c
            X.1sA r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0935
            X.1sB r0 = r7.A0d
            X.1sA r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0935
        L_0x0932:
            int r9 = r9 + 1
            goto L_0x0914
        L_0x0935:
            java.lang.Integer[] r1 = r7.A0q
            r0 = r1[r6]
            r5 = 1
            r4 = r1[r5]
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r0 != r1) goto L_0x094b
            int r0 = r7.A0D
            if (r0 == r5) goto L_0x094b
            if (r4 != r1) goto L_0x094b
            int r0 = r7.A0C
            if (r0 == r5) goto L_0x094b
            goto L_0x0932
        L_0x094b:
            X.C38931sD.A00(r7, r11, r10, r6)
            goto L_0x0932
        L_0x094f:
            r4 = 0
            goto L_0x08ef
        L_0x0951:
            X.1sV r11 = (X.C39111sV) r11
            androidx.constraintlayout.widget.ConstraintLayout r5 = r11.A06
            int r1 = r5.getChildCount()
            r4 = 0
            r0 = 0
        L_0x095b:
            if (r0 >= r1) goto L_0x0963
            r5.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x095b
        L_0x0963:
            java.util.ArrayList r1 = r5.A0B
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0973
        L_0x096b:
            r1.get(r4)
            int r4 = r4 + 1
            if (r4 >= r0) goto L_0x0973
            goto L_0x096b
        L_0x0973:
            int r11 = r3.A01
            java.util.ArrayList r9 = r10.A02
            int r7 = r9.size()
            if (r23 <= 0) goto L_0x0998
            int r4 = r3.A0J
            int r1 = r3.A0I
            r3.A0J = r6
            r3.A0I = r6
            r0 = r21
            r3.A0A(r0)
            r0 = r20
            r3.A09(r0)
            r3.A0J = r4
            r3.A0I = r1
            X.1s5 r0 = r10.A00
            r0.A0J()
        L_0x0998:
            if (r7 <= 0) goto L_0x0b16
            r0 = r24[r6]
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            r19 = 0
            if (r0 != r1) goto L_0x09a4
            r19 = 1
        L_0x09a4:
            r0 = 1
            r0 = r24[r0]
            r18 = 0
            if (r0 != r1) goto L_0x09ad
            r18 = 1
        L_0x09ad:
            int r1 = r3.A03()
            X.1s5 r6 = r10.A00
            int r0 = r6.A0J
            int r5 = java.lang.Math.max(r1, r0)
            int r1 = r3.A02()
            int r0 = r6.A0I
            int r4 = java.lang.Math.max(r1, r0)
            r1 = 0
            r17 = 0
        L_0x09c6:
            java.lang.Object r12 = r9.get(r1)
            X.1s3 r12 = (X.C38871s3) r12
            boolean r0 = r12 instanceof X.BJP
            if (r0 == 0) goto L_0x0a3f
            int r13 = r12.A03()
            int r14 = r12.A02()
            r15 = 1
            r0 = r26
            boolean r0 = X.C38931sD.A00(r12, r0, r10, r15)
            r17 = r17 | r0
            int r0 = r12.A03()
            int r15 = r12.A02()
            if (r0 == r13) goto L_0x0a11
            r12.A0A(r0)
            if (r19 == 0) goto L_0x0a0f
            int r13 = r12.A04()
            int r0 = r12.A0O
            int r13 = r13 + r0
            if (r13 <= r5) goto L_0x0a0f
            int r13 = r12.A04()
            int r0 = r12.A0O
            int r13 = r13 + r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.1sC r0 = r12.A06(r0)
            int r0 = r0.A00()
            int r13 = r13 + r0
            int r5 = java.lang.Math.max(r5, r13)
        L_0x0a0f:
            r17 = 1
        L_0x0a11:
            if (r15 == r14) goto L_0x0a39
            r12.A09(r15)
            if (r18 == 0) goto L_0x0a37
            int r13 = r12.A05()
            int r0 = r12.A09
            int r13 = r13 + r0
            if (r13 <= r4) goto L_0x0a37
            int r13 = r12.A05()
            int r0 = r12.A09
            int r13 = r13 + r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.1sC r0 = r12.A06(r0)
            int r0 = r0.A00()
            int r13 = r13 + r0
            int r4 = java.lang.Math.max(r4, r13)
        L_0x0a37:
            r17 = 1
        L_0x0a39:
            X.BJP r12 = (X.BJP) r12
            boolean r0 = r12.A0A
            r17 = r17 | r0
        L_0x0a3f:
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x09c6
            r1 = 0
        L_0x0a44:
            r12 = 0
        L_0x0a45:
            java.lang.Object r13 = r9.get(r12)
            X.1s3 r13 = (X.C38871s3) r13
            boolean r0 = r13 instanceof X.AnonymousClass3K8
            if (r0 == 0) goto L_0x0a53
            boolean r0 = r13 instanceof X.BJP
            if (r0 == 0) goto L_0x0a6d
        L_0x0a53:
            boolean r0 = r13 instanceof X.AnonymousClass27L
            if (r0 != 0) goto L_0x0a6d
            int r14 = r13.A0N
            r0 = 8
            if (r14 == r0) goto L_0x0a6d
            X.1s8 r0 = r13.A0c
            X.1sA r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0a95
            X.1sB r0 = r13.A0d
            X.1sA r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0a95
        L_0x0a6d:
            int r12 = r12 + 1
            if (r12 < r7) goto L_0x0a45
            if (r17 == 0) goto L_0x0a8f
            int r13 = r3.A0J
            int r12 = r3.A0I
            r0 = 0
            r3.A0J = r0
            r3.A0I = r0
            r0 = r21
            r3.A0A(r0)
            r0 = r20
            r3.A09(r0)
            r3.A0J = r13
            r3.A0I = r12
            r6.A0J()
            r17 = 0
        L_0x0a8f:
            int r1 = r1 + 1
            r0 = 2
            if (r1 >= r0) goto L_0x0b16
            goto L_0x0a44
        L_0x0a95:
            boolean r0 = r13 instanceof X.BJP
            if (r0 != 0) goto L_0x0a6d
            int r14 = r13.A03()
            int r16 = r13.A02()
            int r0 = r13.A07
            r22 = r0
            r15 = 1
            r0 = r26
            boolean r0 = X.C38931sD.A00(r13, r0, r10, r15)
            r17 = r17 | r0
            int r0 = r13.A03()
            int r15 = r13.A02()
            if (r0 == r14) goto L_0x0ade
            r13.A0A(r0)
            if (r19 == 0) goto L_0x0adc
            int r14 = r13.A04()
            int r0 = r13.A0O
            int r14 = r14 + r0
            if (r14 <= r5) goto L_0x0adc
            int r14 = r13.A04()
            int r0 = r13.A0O
            int r14 = r14 + r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.1sC r0 = r13.A06(r0)
            int r0 = r0.A00()
            int r14 = r14 + r0
            int r5 = java.lang.Math.max(r5, r14)
        L_0x0adc:
            r17 = 1
        L_0x0ade:
            r0 = r16
            if (r15 == r0) goto L_0x0b08
            r13.A09(r15)
            if (r18 == 0) goto L_0x0b06
            int r14 = r13.A05()
            int r0 = r13.A09
            int r14 = r14 + r0
            if (r14 <= r4) goto L_0x0b06
            int r14 = r13.A05()
            int r0 = r13.A09
            int r14 = r14 + r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.1sC r0 = r13.A06(r0)
            int r0 = r0.A00()
            int r14 = r14 + r0
            int r4 = java.lang.Math.max(r4, r14)
        L_0x0b06:
            r17 = 1
        L_0x0b08:
            boolean r0 = r13.A0h
            if (r0 == 0) goto L_0x0a6d
            int r13 = r13.A07
            r0 = r22
            if (r0 == r13) goto L_0x0a6d
            r17 = 1
            goto L_0x0a6d
        L_0x0b16:
            r3.A01 = r11
            r0 = 256(0x100, float:3.59E-43)
            r11 = r11 & r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = 0
            if (r11 != r1) goto L_0x0b21
            r0 = 1
        L_0x0b21:
            X.C38961sG.A0F = r0
        L_0x0b23:
            int r7 = r3.A03()
            int r6 = r3.A02()
            boolean r4 = r3.A0A
            boolean r5 = r3.A08
            int r1 = r8.A03
            int r0 = r8.A05
            int r7 = r7 + r0
            int r6 = r6 + r1
            r1 = 0
            r0 = r28
            int r3 = android.view.View.resolveSizeAndState(r7, r0, r1)
            r0 = r27
            int r1 = android.view.View.resolveSizeAndState(r6, r0, r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            r1 = r1 & r0
            int r0 = r2.A02
            int r3 = java.lang.Math.min(r0, r3)
            int r0 = r2.A01
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x0b58
            r3 = r3 | r0
        L_0x0b58:
            if (r5 == 0) goto L_0x0b5b
            r1 = r1 | r0
        L_0x0b5b:
            r2.setMeasuredDimension(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void setId(int i) {
        SparseArray sparseArray = this.A05;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.A01) {
            this.A01 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.A02) {
            this.A02 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.A03) {
            this.A03 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C2t c2t) {
        this.A0F = c2t;
        C25569Ci8 ci8 = this.A09;
        if (ci8 != null) {
            ci8.A02 = c2t;
        }
    }

    public void setOptimizationLevel(int i) {
        this.A0E = i;
        this.A07.A01 = i;
        boolean z = false;
        if ((i & 256) == 256) {
            z = true;
        }
        C38961sG.A0F = z;
    }

    public ConstraintLayout(Context context) {
        super(context);
        A00((AttributeSet) null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C39151sZ;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.1sZ] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0194, code lost:
        android.util.Log.e("ConstraintLayout", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r14) {
        /*
            r13 = this;
            android.content.Context r8 = r13.getContext()
            X.1sZ r7 = new X.1sZ
            r7.<init>(r8, r14)
            r6 = -1
            r7.A0Q = r6
            r7.A0R = r6
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A01 = r0
            r7.A0T = r6
            r7.A0U = r6
            r7.A0k = r6
            r7.A0l = r6
            r7.A0p = r6
            r7.A0o = r6
            r7.A0C = r6
            r7.A0B = r6
            r7.A0A = r6
            r7.A0D = r6
            r5 = 0
            r7.A0E = r5
            r4 = 0
            r7.A00 = r4
            r7.A0m = r6
            r7.A0n = r6
            r7.A0J = r6
            r7.A0I = r6
            r7.A0M = r6
            r7.A0P = r6
            r7.A0N = r6
            r7.A0K = r6
            r7.A0O = r6
            r7.A0L = r6
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.A02 = r2
            r7.A08 = r2
            r1 = 0
            r7.A0t = r1
            r3 = 1
            r7.A0F = r3
            r7.A03 = r0
            r7.A09 = r0
            r7.A0S = r5
            r7.A0q = r5
            r7.A0W = r5
            r7.A0V = r5
            r7.A0a = r5
            r7.A0Z = r5
            r7.A0Y = r5
            r7.A0X = r5
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A05 = r0
            r7.A04 = r0
            r7.A0G = r6
            r7.A0H = r6
            r7.A0b = r6
            r7.A0v = r5
            r7.A0u = r5
            r7.A0s = r1
            r7.A0w = r3
            r7.A10 = r3
            r7.A0z = r5
            r7.A0x = r5
            r7.A0y = r5
            r7.A0g = r6
            r7.A0h = r6
            r7.A0i = r6
            r7.A0j = r6
            r7.A0c = r6
            r7.A0d = r6
            r7.A07 = r2
            X.1s3 r0 = new X.1s3
            r0.<init>()
            r7.A0r = r0
            int[] r0 = X.C39121sW.A01
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r14, r0)
            int r2 = r8.getIndexCount()
            r1 = 0
        L_0x009c:
            if (r1 >= r2) goto L_0x0399
            int r9 = r8.getIndex(r1)
            android.util.SparseIntArray r0 = X.C39161sb.A00
            int r0 = r0.get(r9)
            java.lang.String r12 = "ConstraintLayout"
            r10 = 2
            r11 = -2
            switch(r0) {
                case 1: goto L_0x0337;
                case 2: goto L_0x0325;
                case 3: goto L_0x031b;
                case 4: goto L_0x0305;
                case 5: goto L_0x02fb;
                case 6: goto L_0x02f1;
                case 7: goto L_0x02e7;
                case 8: goto L_0x02d5;
                case 9: goto L_0x02c3;
                case 10: goto L_0x02b1;
                case 11: goto L_0x029f;
                case 12: goto L_0x028d;
                case 13: goto L_0x027b;
                case 14: goto L_0x0269;
                case 15: goto L_0x0257;
                case 16: goto L_0x0245;
                case 17: goto L_0x0233;
                case 18: goto L_0x0221;
                case 19: goto L_0x020f;
                case 20: goto L_0x01fd;
                case 21: goto L_0x01f3;
                case 22: goto L_0x01e9;
                case 23: goto L_0x01df;
                case 24: goto L_0x01d5;
                case 25: goto L_0x01cb;
                case 26: goto L_0x01c1;
                case 27: goto L_0x01b7;
                case 28: goto L_0x01ad;
                case 29: goto L_0x01a3;
                case 30: goto L_0x0199;
                case 31: goto L_0x018a;
                case 32: goto L_0x017f;
                case 33: goto L_0x0383;
                case 34: goto L_0x036d;
                case 35: goto L_0x016f;
                case 36: goto L_0x0357;
                case 37: goto L_0x0341;
                case 38: goto L_0x015f;
                default: goto L_0x00af;
            }
        L_0x00af:
            switch(r0) {
                case 44: goto L_0x00ee;
                case 45: goto L_0x00e5;
                case 46: goto L_0x00dc;
                case 47: goto L_0x00d5;
                case 48: goto L_0x00ce;
                case 49: goto L_0x00c5;
                case 50: goto L_0x00bc;
                case 51: goto L_0x00b5;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b5:
            java.lang.String r0 = r8.getString(r9)
            r7.A0s = r0
            goto L_0x00b2
        L_0x00bc:
            int r0 = r7.A0H
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r7.A0H = r0
            goto L_0x00b2
        L_0x00c5:
            int r0 = r7.A0G
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r7.A0G = r0
            goto L_0x00b2
        L_0x00ce:
            int r0 = r8.getInt(r9, r5)
            r7.A0q = r0
            goto L_0x00b2
        L_0x00d5:
            int r0 = r8.getInt(r9, r5)
            r7.A0S = r0
            goto L_0x00b2
        L_0x00dc:
            float r0 = r7.A09
            float r0 = r8.getFloat(r9, r0)
            r7.A09 = r0
            goto L_0x00b2
        L_0x00e5:
            float r0 = r7.A03
            float r0 = r8.getFloat(r9, r0)
            r7.A03 = r0
            goto L_0x00b2
        L_0x00ee:
            java.lang.String r9 = r8.getString(r9)
            r7.A0t = r9
            r7.A0F = r6
            if (r9 == 0) goto L_0x00b2
            int r12 = r9.length()
            r0 = 44
            int r10 = r9.indexOf(r0)
            if (r10 <= 0) goto L_0x014a
            int r0 = r12 + -1
            if (r10 >= r0) goto L_0x014a
            java.lang.String r9 = r9.substring(r5, r10)
            java.lang.String r0 = "W"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x013f
            r7.A0F = r5
        L_0x0116:
            int r10 = r10 + 1
        L_0x0118:
            java.lang.String r9 = r7.A0t
            r0 = 58
            int r11 = r9.indexOf(r0)
            if (r11 < 0) goto L_0x014c
            int r0 = r12 + -1
            if (r11 >= r0) goto L_0x014c
            java.lang.String r10 = r9.substring(r10, r11)
            java.lang.String r9 = r7.A0t
            int r0 = r11 + 1
            java.lang.String r9 = r9.substring(r0)
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x00b2
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x00b2
            goto L_0x0157
        L_0x013f:
            java.lang.String r0 = "H"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0116
            r7.A0F = r3
            goto L_0x0116
        L_0x014a:
            r10 = 0
            goto L_0x0118
        L_0x014c:
            java.lang.String r9 = r9.substring(r10)
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x00b2
            goto L_0x015a
        L_0x0157:
            java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00b2 }
        L_0x015a:
            java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00b2 }
            goto L_0x00b2
        L_0x015f:
            float r0 = r7.A04
            float r0 = r8.getFloat(r9, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r7.A04 = r0
            r7.A0V = r10
            goto L_0x00b2
        L_0x016f:
            float r0 = r7.A05
            float r0 = r8.getFloat(r9, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r7.A05 = r0
            r7.A0W = r10
            goto L_0x00b2
        L_0x017f:
            int r0 = r8.getInt(r9, r5)
            r7.A0V = r0
            if (r0 != r3) goto L_0x00b2
            java.lang.String r0 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            goto L_0x0194
        L_0x018a:
            int r0 = r8.getInt(r9, r5)
            r7.A0W = r0
            if (r0 != r3) goto L_0x00b2
            java.lang.String r0 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
        L_0x0194:
            android.util.Log.e(r12, r0)
            goto L_0x00b2
        L_0x0199:
            float r0 = r7.A08
            float r0 = r8.getFloat(r9, r0)
            r7.A08 = r0
            goto L_0x00b2
        L_0x01a3:
            float r0 = r7.A02
            float r0 = r8.getFloat(r9, r0)
            r7.A02 = r0
            goto L_0x00b2
        L_0x01ad:
            boolean r0 = r7.A0u
            boolean r0 = r8.getBoolean(r9, r0)
            r7.A0u = r0
            goto L_0x00b2
        L_0x01b7:
            boolean r0 = r7.A0v
            boolean r0 = r8.getBoolean(r9, r0)
            r7.A0v = r0
            goto L_0x00b2
        L_0x01c1:
            int r0 = r7.A0L
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0L = r0
            goto L_0x00b2
        L_0x01cb:
            int r0 = r7.A0O
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0O = r0
            goto L_0x00b2
        L_0x01d5:
            int r0 = r7.A0K
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0K = r0
            goto L_0x00b2
        L_0x01df:
            int r0 = r7.A0N
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0N = r0
            goto L_0x00b2
        L_0x01e9:
            int r0 = r7.A0P
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0P = r0
            goto L_0x00b2
        L_0x01f3:
            int r0 = r7.A0M
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0M = r0
            goto L_0x00b2
        L_0x01fd:
            int r0 = r7.A0I
            int r0 = r8.getResourceId(r9, r0)
            r7.A0I = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0I = r0
            goto L_0x00b2
        L_0x020f:
            int r0 = r7.A0J
            int r0 = r8.getResourceId(r9, r0)
            r7.A0J = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0J = r0
            goto L_0x00b2
        L_0x0221:
            int r0 = r7.A0n
            int r0 = r8.getResourceId(r9, r0)
            r7.A0n = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0n = r0
            goto L_0x00b2
        L_0x0233:
            int r0 = r7.A0m
            int r0 = r8.getResourceId(r9, r0)
            r7.A0m = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0m = r0
            goto L_0x00b2
        L_0x0245:
            int r0 = r7.A0A
            int r0 = r8.getResourceId(r9, r0)
            r7.A0A = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0A = r0
            goto L_0x00b2
        L_0x0257:
            int r0 = r7.A0B
            int r0 = r8.getResourceId(r9, r0)
            r7.A0B = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0B = r0
            goto L_0x00b2
        L_0x0269:
            int r0 = r7.A0C
            int r0 = r8.getResourceId(r9, r0)
            r7.A0C = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0C = r0
            goto L_0x00b2
        L_0x027b:
            int r0 = r7.A0o
            int r0 = r8.getResourceId(r9, r0)
            r7.A0o = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0o = r0
            goto L_0x00b2
        L_0x028d:
            int r0 = r7.A0p
            int r0 = r8.getResourceId(r9, r0)
            r7.A0p = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0p = r0
            goto L_0x00b2
        L_0x029f:
            int r0 = r7.A0l
            int r0 = r8.getResourceId(r9, r0)
            r7.A0l = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0l = r0
            goto L_0x00b2
        L_0x02b1:
            int r0 = r7.A0k
            int r0 = r8.getResourceId(r9, r0)
            r7.A0k = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0k = r0
            goto L_0x00b2
        L_0x02c3:
            int r0 = r7.A0U
            int r0 = r8.getResourceId(r9, r0)
            r7.A0U = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0U = r0
            goto L_0x00b2
        L_0x02d5:
            int r0 = r7.A0T
            int r0 = r8.getResourceId(r9, r0)
            r7.A0T = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0T = r0
            goto L_0x00b2
        L_0x02e7:
            float r0 = r7.A01
            float r0 = r8.getFloat(r9, r0)
            r7.A01 = r0
            goto L_0x00b2
        L_0x02f1:
            int r0 = r7.A0R
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r7.A0R = r0
            goto L_0x00b2
        L_0x02fb:
            int r0 = r7.A0Q
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r7.A0Q = r0
            goto L_0x00b2
        L_0x0305:
            float r0 = r7.A00
            float r10 = r8.getFloat(r9, r0)
            r9 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r9
            r7.A00 = r10
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            float r0 = r9 - r10
            float r0 = r0 % r9
            r7.A00 = r0
            goto L_0x00b2
        L_0x031b:
            int r0 = r7.A0E
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r7.A0E = r0
            goto L_0x00b2
        L_0x0325:
            int r0 = r7.A0D
            int r0 = r8.getResourceId(r9, r0)
            r7.A0D = r0
            if (r0 != r6) goto L_0x00b2
            int r0 = r8.getInt(r9, r6)
            r7.A0D = r0
            goto L_0x00b2
        L_0x0337:
            int r0 = r7.A0b
            int r0 = r8.getInt(r9, r0)
            r7.A0b = r0
            goto L_0x00b2
        L_0x0341:
            int r0 = r7.A0X     // Catch:{ Exception -> 0x034b }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x034b }
            r7.A0X = r0     // Catch:{ Exception -> 0x034b }
            goto L_0x00b2
        L_0x034b:
            int r0 = r7.A0X
            int r0 = r8.getInt(r9, r0)
            if (r0 != r11) goto L_0x00b2
            r7.A0X = r11
            goto L_0x00b2
        L_0x0357:
            int r0 = r7.A0Z     // Catch:{ Exception -> 0x0361 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0361 }
            r7.A0Z = r0     // Catch:{ Exception -> 0x0361 }
            goto L_0x00b2
        L_0x0361:
            int r0 = r7.A0Z
            int r0 = r8.getInt(r9, r0)
            if (r0 != r11) goto L_0x00b2
            r7.A0Z = r11
            goto L_0x00b2
        L_0x036d:
            int r0 = r7.A0Y     // Catch:{ Exception -> 0x0377 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0377 }
            r7.A0Y = r0     // Catch:{ Exception -> 0x0377 }
            goto L_0x00b2
        L_0x0377:
            int r0 = r7.A0Y
            int r0 = r8.getInt(r9, r0)
            if (r0 != r11) goto L_0x00b2
            r7.A0Y = r11
            goto L_0x00b2
        L_0x0383:
            int r0 = r7.A0a     // Catch:{ Exception -> 0x038d }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x038d }
            r7.A0a = r0     // Catch:{ Exception -> 0x038d }
            goto L_0x00b2
        L_0x038d:
            int r0 = r7.A0a
            int r0 = r8.getInt(r9, r0)
            if (r0 != r11) goto L_0x00b2
            r7.A0a = r11
            goto L_0x00b2
        L_0x0399:
            r8.recycle()
            r7.A00()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.generateLayoutParams(android.util.AttributeSet):android.view.ViewGroup$LayoutParams");
    }

    public int getMaxHeight() {
        return this.A01;
    }

    public int getMaxWidth() {
        return this.A02;
    }

    public int getMinHeight() {
        return this.A03;
    }

    public int getMinWidth() {
        return this.A04;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C39151sZ r2 = (C39151sZ) childAt.getLayoutParams();
            C38871s3 r4 = r2.A0r;
            if (childAt.getVisibility() != 8 || r2.A0x || r2.A0y || isInEditMode) {
                int A042 = r4.A04();
                int A052 = r4.A05();
                childAt.layout(A042, A052, r4.A03() + A042, r4.A02() + A052);
            }
        }
        ArrayList arrayList = this.A0B;
        int size = arrayList.size();
        if (size > 0) {
            do {
                C39171sd r42 = (C39171sd) arrayList.get(i5);
                if (r42 instanceof Group) {
                    C38871s3 r1 = ((C39151sZ) r42.getLayoutParams()).A0r;
                    r1.A0A(0);
                    r1.A09(0);
                } else if (r42 instanceof Layer) {
                    Layer layer = (Layer) r42;
                    Layer.A01(layer);
                    layer.A00 = Float.NaN;
                    layer.A01 = Float.NaN;
                    C38871s3 r12 = ((C39151sZ) layer.getLayoutParams()).A0r;
                    r12.A0A(0);
                    r12.A09(0);
                    layer.A09();
                    layer.layout(((int) layer.A04) - layer.getPaddingLeft(), ((int) layer.A05) - layer.getPaddingTop(), ((int) layer.A02) + layer.getPaddingRight(), ((int) layer.A03) + layer.getPaddingBottom());
                    if (!Float.isNaN(layer.A06)) {
                        Layer.A03(layer);
                    }
                }
                i5++;
            } while (i5 < size);
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C38871s3 A062 = A06(view);
        if ((view instanceof Guideline) && !(A062 instanceof AnonymousClass27L)) {
            C39151sZ r0 = (C39151sZ) view.getLayoutParams();
            AnonymousClass27L r1 = new AnonymousClass27L();
            r0.A0r = r1;
            r0.A0x = true;
            r1.A0J(r0.A0b);
        }
        if (view instanceof C39171sd) {
            C39171sd r2 = (C39171sd) view;
            r2.A04();
            ((C39151sZ) view.getLayoutParams()).A0y = true;
            ArrayList arrayList = this.A0B;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
        }
        this.A05.put(view.getId(), view);
        this.A0D = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A05.remove(view.getId());
        C38871s3 A062 = A06(view);
        this.A07.A00.remove(A062);
        A062.A0Z = null;
        this.A0B.remove(view);
        this.A0D = true;
    }

    public void setConstraintSet(C26264Cw9 cw9) {
        this.A0A = cw9;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i, 0);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.1sZ] */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.A0Q = -1;
        marginLayoutParams.A0R = -1;
        marginLayoutParams.A01 = -1.0f;
        marginLayoutParams.A0T = -1;
        marginLayoutParams.A0U = -1;
        marginLayoutParams.A0k = -1;
        marginLayoutParams.A0l = -1;
        marginLayoutParams.A0p = -1;
        marginLayoutParams.A0o = -1;
        marginLayoutParams.A0C = -1;
        marginLayoutParams.A0B = -1;
        marginLayoutParams.A0A = -1;
        marginLayoutParams.A0D = -1;
        marginLayoutParams.A0E = 0;
        marginLayoutParams.A00 = 0.0f;
        marginLayoutParams.A0m = -1;
        marginLayoutParams.A0n = -1;
        marginLayoutParams.A0J = -1;
        marginLayoutParams.A0I = -1;
        marginLayoutParams.A0M = -1;
        marginLayoutParams.A0P = -1;
        marginLayoutParams.A0N = -1;
        marginLayoutParams.A0K = -1;
        marginLayoutParams.A0O = -1;
        marginLayoutParams.A0L = -1;
        marginLayoutParams.A02 = 0.5f;
        marginLayoutParams.A08 = 0.5f;
        marginLayoutParams.A0t = null;
        marginLayoutParams.A0F = 1;
        marginLayoutParams.A03 = -1.0f;
        marginLayoutParams.A09 = -1.0f;
        marginLayoutParams.A0S = 0;
        marginLayoutParams.A0q = 0;
        marginLayoutParams.A0W = 0;
        marginLayoutParams.A0V = 0;
        marginLayoutParams.A0a = 0;
        marginLayoutParams.A0Z = 0;
        marginLayoutParams.A0Y = 0;
        marginLayoutParams.A0X = 0;
        marginLayoutParams.A05 = 1.0f;
        marginLayoutParams.A04 = 1.0f;
        marginLayoutParams.A0G = -1;
        marginLayoutParams.A0H = -1;
        marginLayoutParams.A0b = -1;
        marginLayoutParams.A0v = false;
        marginLayoutParams.A0u = false;
        marginLayoutParams.A0s = null;
        marginLayoutParams.A0w = true;
        marginLayoutParams.A10 = true;
        marginLayoutParams.A0z = false;
        marginLayoutParams.A0x = false;
        marginLayoutParams.A0y = false;
        marginLayoutParams.A0g = -1;
        marginLayoutParams.A0h = -1;
        marginLayoutParams.A0i = -1;
        marginLayoutParams.A0j = -1;
        marginLayoutParams.A0c = -1;
        marginLayoutParams.A0d = -1;
        marginLayoutParams.A07 = 0.5f;
        marginLayoutParams.A0r = new C38871s3();
        return marginLayoutParams;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i, i2);
    }
}
