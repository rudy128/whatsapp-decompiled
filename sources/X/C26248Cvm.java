package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: X.Cvm  reason: case insensitive filesystem */
public class C26248Cvm {
    public static final double A0O = Math.cos(Math.toRadians(45.0d));
    public static final Drawable A0P;
    public float A00 = 0.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public Drawable A09;
    public Drawable A0A;
    public Drawable A0B;
    public C27801Xq A0C;
    public C28011Ym A0D;
    public boolean A0E;
    public boolean A0F = false;
    public LayerDrawable A0G;
    public final int A0H;
    public final int A0I;
    public final TimeInterpolator A0J;
    public final Rect A0K = AnonymousClass3MW.A07();
    public final MaterialCardView A0L;
    public final C27801Xq A0M;
    public final C27801Xq A0N;

    private BFI A03(Drawable drawable) {
        int i;
        int i2;
        float f;
        float f2;
        MaterialCardView materialCardView = this.A0L;
        if (materialCardView.A00) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            if (A04(this)) {
                f = A00();
            } else {
                f = 0.0f;
            }
            i2 = (int) Math.ceil((double) (maxCardElevation + f));
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (A04(this)) {
                f2 = A00();
            } else {
                f2 = 0.0f;
            }
            i = (int) Math.ceil((double) (maxCardElevation2 + f2));
        } else {
            i = 0;
            i2 = 0;
        }
        return new BFI(drawable, this, i, i2, i, i2);
    }

    private float A00() {
        C28051Yq r1 = this.A0D.A06;
        C27801Xq r6 = this.A0M;
        float A012 = A01(r1, r6.A08());
        C28051Yq r2 = this.A0D.A07;
        C28021Yn r12 = r6.A01.A0K.A03;
        RectF rectF = r6.A0D;
        rectF.set(r6.getBounds());
        float max = Math.max(A012, A01(r2, r12.BPT(rectF)));
        C28051Yq r22 = this.A0D.A05;
        C28021Yn r13 = r6.A01.A0K.A01;
        rectF.set(r6.getBounds());
        float A013 = A01(r22, r13.BPT(rectF));
        C28051Yq r23 = this.A0D.A04;
        C28021Yn r14 = r6.A01.A0K.A00;
        rectF.set(r6.getBounds());
        return Math.max(max, Math.max(A013, A01(r23, r14.BPT(rectF))));
    }

    public static float A01(C28051Yq r3, float f) {
        if (r3 instanceof C28061Yr) {
            return (float) ((1.0d - A0O) * ((double) f));
        }
        if (r3 instanceof AnonymousClass2AE) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private LayerDrawable A02() {
        Drawable drawable = this.A0B;
        if (drawable == null) {
            C27801Xq r2 = new C27801Xq(this.A0D);
            this.A0C = r2;
            drawable = new RippleDrawable(this.A07, (Drawable) null, r2);
            this.A0B = drawable;
        }
        if (this.A0G == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, this.A0N, this.A09});
            this.A0G = layerDrawable;
            layerDrawable.setId(2, 2131432821);
        }
        return this.A0G;
    }

    public static boolean A04(C26248Cvm cvm) {
        MaterialCardView materialCardView = cvm.A0L;
        if (!materialCardView.A01 || !cvm.A0M.A0J() || !materialCardView.A00) {
            return false;
        }
        return true;
    }

    public void A05() {
        Drawable drawable = this.A0B;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.A0B.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.A0B.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void A06() {
        Drawable drawable;
        Drawable drawable2 = this.A0A;
        MaterialCardView materialCardView = this.A0L;
        if (materialCardView.isClickable()) {
            drawable = A02();
        } else {
            drawable = this.A0N;
        }
        this.A0A = drawable;
        if (drawable2 == drawable) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || !(materialCardView.getForeground() instanceof InsetDrawable)) {
            materialCardView.setForeground(A03(drawable));
        } else {
            ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
        }
    }

    public void A07() {
        float A002;
        float f;
        MaterialCardView materialCardView = this.A0L;
        if ((!materialCardView.A01 || this.A0M.A0J()) && !A04(this)) {
            A002 = 0.0f;
        } else {
            A002 = A00();
        }
        if (!materialCardView.A01 || !materialCardView.A00) {
            f = 0.0f;
        } else {
            f = (float) ((1.0d - A0O) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (A002 - f);
        Rect rect = this.A0K;
        materialCardView.A02.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.A05.CR8(materialCardView.A04);
    }

    public void A08() {
        if (!this.A0F) {
            this.A0L.setBackgroundInternal(A03(this.A0M));
        }
        this.A0L.setForeground(A03(this.A0A));
    }

    public void A09(int i, int i2) {
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        if (this.A0G != null) {
            int i6 = 0;
            MaterialCardView materialCardView = this.A0L;
            if (materialCardView.A00) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                if (A04(this)) {
                    f = A00();
                } else {
                    f = 0.0f;
                }
                i3 = BE8.A03(maxCardElevation + f, 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (A04(this)) {
                    f2 = A00();
                } else {
                    f2 = 0.0f;
                }
                i6 = BE8.A03(maxCardElevation2 + f2, 2.0f);
            } else {
                i3 = 0;
            }
            int i7 = this.A01;
            boolean A1T = AnonymousClass000.A1T(i7 & 8388613, 8388613);
            int i8 = this.A02;
            int i9 = i8;
            if (A1T) {
                i8 = ((i - i8) - this.A03) - i6;
            }
            boolean z = true;
            int i10 = i9;
            if ((i7 & 80) != 80) {
                z = false;
                i10 = ((i2 - i9) - this.A03) - i3;
            }
            if (A1T) {
                i4 = i9;
            } else {
                i4 = ((i - i9) - this.A03) - i6;
            }
            if (z) {
                i5 = ((i2 - i9) - this.A03) - i3;
            } else {
                i5 = i9;
            }
            int i11 = i8;
            if (materialCardView.getLayoutDirection() != 1) {
                i11 = i4;
                i4 = i8;
            }
            this.A0G.setLayerInset(2, i4, i5, i11, i10);
        }
    }

    public void A0A(TypedArray typedArray) {
        MaterialCardView materialCardView = this.A0L;
        ColorStateList A012 = AnonymousClass1YT.A01(materialCardView.getContext(), typedArray, 11);
        this.A08 = A012;
        if (A012 == null) {
            this.A08 = ColorStateList.valueOf(-1);
        }
        this.A04 = typedArray.getDimensionPixelSize(12, 0);
        boolean z = typedArray.getBoolean(0, false);
        this.A0E = z;
        materialCardView.setLongClickable(z);
        this.A06 = AnonymousClass1YT.A01(materialCardView.getContext(), typedArray, 6);
        A0B(AnonymousClass1YT.A03(materialCardView.getContext(), typedArray, 2));
        this.A03 = typedArray.getDimensionPixelSize(5, 0);
        this.A02 = typedArray.getDimensionPixelSize(4, 0);
        this.A01 = typedArray.getInteger(3, 8388661);
        ColorStateList A013 = AnonymousClass1YT.A01(materialCardView.getContext(), typedArray, 7);
        this.A07 = A013;
        if (A013 == null) {
            this.A07 = ColorStateList.valueOf(AnonymousClass1ZA.A03(materialCardView, 2130969112));
        }
        ColorStateList A014 = AnonymousClass1YT.A01(materialCardView.getContext(), typedArray, 1);
        C27801Xq r3 = this.A0N;
        if (A014 == null) {
            A014 = ColorStateList.valueOf(0);
        }
        r3.A0F(A014);
        Drawable drawable = this.A0B;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.A07);
        }
        C27801Xq r2 = this.A0M;
        r2.A0C(materialCardView.getCardElevation());
        r3.A0H(this.A08, (float) this.A04);
        materialCardView.setBackgroundInternal(A03(r2));
        Drawable drawable2 = r3;
        if (materialCardView.isClickable()) {
            drawable2 = A02();
        }
        this.A0A = drawable2;
        materialCardView.setForeground(A03(drawable2));
    }

    public void A0B(Drawable drawable) {
        if (drawable != null) {
            Drawable A0E2 = BE7.A0E(drawable);
            this.A09 = A0E2;
            C27831Xu.A03(this.A06, A0E2);
            boolean isChecked = this.A0L.isChecked();
            Drawable drawable2 = this.A09;
            if (drawable2 != null) {
                int i = 0;
                if (isChecked) {
                    i = 255;
                }
                drawable2.setAlpha(i);
                float f = 0.0f;
                if (isChecked) {
                    f = 1.0f;
                }
                this.A00 = f;
            }
        } else {
            this.A09 = A0P;
        }
        LayerDrawable layerDrawable = this.A0G;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(2131432821, this.A09);
        }
    }

    public void A0C(C28011Ym r3) {
        this.A0D = r3;
        C27801Xq r1 = this.A0M;
        r1.setShapeAppearanceModel(r3);
        r1.A04 = !r1.A0J();
        this.A0N.setShapeAppearanceModel(r3);
        C27801Xq r0 = this.A0C;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
    }

    public C26248Cvm(AttributeSet attributeSet, MaterialCardView materialCardView, int i) {
        this.A0L = materialCardView;
        Paint paint = C27801Xq.A0N;
        C27801Xq r1 = new C27801Xq(materialCardView.getContext(), attributeSet, i, 2132084744);
        this.A0M = r1;
        r1.A0E(materialCardView.getContext());
        r1.A0A();
        C28041Yp r4 = new C28041Yp(r1.A01.A0K);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C27781Xn.A06, i, 2132083068);
        if (obtainStyledAttributes.hasValue(3)) {
            r4.A00(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.A0N = new C27801Xq();
        A0C(new C28011Ym(r4));
        this.A0J = C29101bc.A01(AnonymousClass1YW.A03, materialCardView.getContext(), 2130970550);
        this.A0H = AnonymousClass1Z9.A00(materialCardView.getContext(), 2130970540, 300);
        this.A0I = AnonymousClass1Z9.A00(materialCardView.getContext(), 2130970539, 300);
        obtainStyledAttributes.recycle();
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        A0P = colorDrawable;
    }
}
