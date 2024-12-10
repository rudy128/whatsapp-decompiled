package androidx.constraintlayout.helper.widget;

import X.C39121sW;
import X.C39171sd;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Layer extends C39171sd {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public ConstraintLayout A0D;
    public boolean A0E;
    public View[] A0F;
    public boolean A0G;
    public boolean A0H;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.view.View[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r0 != r4) goto L_0x000f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(androidx.constraintlayout.helper.widget.Layer r6) {
        /*
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.A0D
            if (r5 == 0) goto L_0x0025
            int r4 = r6.A00
            if (r4 == 0) goto L_0x0025
            android.view.View[] r3 = r6.A0F
            if (r3 == 0) goto L_0x000f
            int r0 = r3.length
            if (r0 == r4) goto L_0x0013
        L_0x000f:
            android.view.View[] r3 = new android.view.View[r4]
            r6.A0F = r3
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 >= r4) goto L_0x0025
            int[] r0 = r6.A05
            r1 = r0[r2]
            android.util.SparseArray r0 = r5.A05
            java.lang.Object r0 = r0.get(r1)
            r3[r2] = r0
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Layer.A01(androidx.constraintlayout.helper.widget.Layer):void");
    }

    public static void A03(Layer layer) {
        if (layer.A0D != null) {
            if (layer.A0F == null) {
                A01(layer);
            }
            layer.A09();
            double radians = Math.toRadians((double) layer.A06);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = layer.A09;
            float f2 = f * cos;
            float f3 = layer.A0A;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < layer.A00; i++) {
                View view = layer.A0F[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - layer.A00;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - layer.A01;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + layer.A0B);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + layer.A0C);
                view.setScaleY(layer.A0A);
                view.setScaleX(layer.A09);
                view.setRotation(layer.A06);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.view.View[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.view.View[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r0 != r3) goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout r4 = r8.A0D
            if (r4 == 0) goto L_0x0018
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x0019
            float r0 = r8.A00
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0019
            float r0 = r8.A01
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            float r2 = r8.A07
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L_0x002e
            float r1 = r8.A08
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x002e
            r8.A01 = r1
            r8.A00 = r2
            return
        L_0x002e:
            android.view.View[] r7 = r8.A06
            if (r7 == 0) goto L_0x0037
            int r0 = r7.length
            int r3 = r8.A00
            if (r0 == r3) goto L_0x003d
        L_0x0037:
            int r3 = r8.A00
            android.view.View[] r7 = new android.view.View[r3]
            r8.A06 = r7
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 >= r3) goto L_0x004f
            int[] r0 = r8.A05
            r1 = r0[r2]
            android.util.SparseArray r0 = r4.A05
            java.lang.Object r0 = r0.get(r1)
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x003e
        L_0x004f:
            r6 = 0
            r0 = r7[r6]
            int r5 = r0.getLeft()
            r0 = r7[r6]
            int r3 = r0.getTop()
            r0 = r7[r6]
            int r4 = r0.getRight()
            r0 = r7[r6]
            int r2 = r0.getBottom()
        L_0x0068:
            int r0 = r8.A00
            if (r6 >= r0) goto L_0x0091
            r1 = r7[r6]
            int r0 = r1.getLeft()
            int r5 = java.lang.Math.min(r5, r0)
            int r0 = r1.getTop()
            int r3 = java.lang.Math.min(r3, r0)
            int r0 = r1.getRight()
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r1.getBottom()
            int r2 = java.lang.Math.max(r2, r0)
            int r6 = r6 + 1
            goto L_0x0068
        L_0x0091:
            float r0 = (float) r4
            r8.A02 = r0
            float r0 = (float) r2
            r8.A03 = r0
            float r0 = (float) r5
            r8.A04 = r0
            float r0 = (float) r3
            r8.A05 = r0
            float r1 = r8.A07
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x00ba
            int r5 = r5 + r4
            int r0 = r5 / 2
            float r0 = (float) r0
            r8.A00 = r0
        L_0x00ab:
            float r1 = r8.A08
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x00bd
            int r3 = r3 + r2
            int r0 = r3 / 2
            float r0 = (float) r0
            r8.A01 = r0
            return
        L_0x00ba:
            r8.A00 = r1
            goto L_0x00ab
        L_0x00bd:
            r8.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Layer.A09():void");
    }

    public void setPivotX(float f) {
        this.A07 = f;
        A03(this);
    }

    public void setPivotY(float f) {
        this.A08 = f;
        A03(this);
    }

    public void setRotation(float f) {
        this.A06 = f;
        A03(this);
    }

    public void setScaleX(float f) {
        this.A09 = f;
        A03(this);
    }

    public void setScaleY(float f) {
        this.A0A = f;
        A03(this);
    }

    public void setTranslationX(float f) {
        this.A0B = f;
        A03(this);
    }

    public void setTranslationY(float f) {
        this.A0C = f;
        A03(this);
    }

    public Layer(Context context) {
        super(context);
        C39171sd.A02(this);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39121sW.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.A0H = true;
                } else if (index == 13) {
                    this.A0G = true;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0D = (ConstraintLayout) getParent();
        if (this.A0H || this.A0G) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.A00; i++) {
                View view = (View) this.A0D.A05.get(this.A05[i]);
                if (view != null) {
                    if (this.A0H) {
                        view.setVisibility(visibility);
                    }
                    if (this.A0G && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A05();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A05();
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C39171sd.A02(this);
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C39171sd.A02(this);
    }
}
