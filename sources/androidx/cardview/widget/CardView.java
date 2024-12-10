package androidx.cardview.widget;

import X.AnonymousClass04T;
import X.AnonymousClass0Tl;
import X.AnonymousClass0Tm;
import X.AnonymousClass0t1;
import X.C02830Fo;
import X.C15610qu;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    public static final AnonymousClass0t1 A05 = new Object();
    public static final int[] A06 = {16842801};
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final C15610qu A04;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((AnonymousClass04T) ((AnonymousClass0Tl) this.A04).A00).A02;
    }

    public float getCardElevation() {
        return ((AnonymousClass0Tl) this.A04).A01.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.A02.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A02.left;
    }

    public int getContentPaddingRight() {
        return this.A02.right;
    }

    public int getContentPaddingTop() {
        return this.A02.top;
    }

    public float getMaxCardElevation() {
        return ((AnonymousClass04T) ((AnonymousClass0Tl) this.A04).A00).A00;
    }

    public float getRadius() {
        return ((AnonymousClass04T) ((AnonymousClass0Tl) this.A04).A00).A01;
    }

    public void setCardBackgroundColor(int i) {
        A05.CI1(ColorStateList.valueOf(i), this.A04);
    }

    public void setCardElevation(float f) {
        ((AnonymousClass0Tl) this.A04).A01.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        A05.CJO(this.A04, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            AnonymousClass0t1 r2 = A05;
            C15610qu r1 = this.A04;
            ((AnonymousClass0Tm) r2).CJO(r1, ((AnonymousClass04T) ((AnonymousClass0Tl) r1).A00).A00);
        }
    }

    public void setRadius(float f) {
        AnonymousClass04T r1 = (AnonymousClass04T) ((AnonymousClass0Tl) this.A04).A00;
        if (f != r1.A01) {
            r1.A01 = f;
            AnonymousClass04T.A00((Rect) null, r1);
            r1.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            AnonymousClass0t1 r2 = A05;
            C15610qu r1 = this.A04;
            ((AnonymousClass0Tm) r2).CJO(r1, ((AnonymousClass04T) ((AnonymousClass0Tl) r1).A00).A00);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.A02 = rect;
        this.A03 = new Rect();
        AnonymousClass0Tl r3 = new AnonymousClass0Tl(this);
        this.A04 = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C02830Fo.A00, i, 2132083068);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A06);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? 2131100020 : 2131100019));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A00 = obtainStyledAttributes.getBoolean(7, false);
        this.A01 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        AnonymousClass04T r1 = new AnonymousClass04T(valueOf, dimension);
        r3.A00 = r1;
        CardView cardView = r3.A01;
        cardView.setBackgroundDrawable(r1);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((AnonymousClass0Tm) A05).CJO(r3, dimension3);
    }

    public boolean getPreventCornerOverlap() {
        return this.A01;
    }

    public boolean getUseCompatPadding() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A05.CI1(colorStateList, this.A04);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968958);
    }
}
