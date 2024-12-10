package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.Bih  reason: case insensitive filesystem */
public class C23518Bih extends C27801Xq implements Drawable.Callback, C29331c2, C24271Jn {
    public static final ShapeDrawable A0w = new ShapeDrawable(new OvalShape());
    public static final int[] A0x;
    public float A00 = -1.0f;
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
    public int A0D = 255;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public ColorStateList A0I;
    public ColorStateList A0J;
    public ColorStateList A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorFilter A0P;
    public PorterDuffColorFilter A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public Drawable A0T;
    public Drawable A0U;
    public TextUtils.TruncateAt A0V;
    public C27991Yk A0W;
    public C27991Yk A0X;
    public CharSequence A0Y;
    public CharSequence A0Z;
    public WeakReference A0a = BE8.A0m();
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public int[] A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public ColorStateList A0l;
    public PorterDuff.Mode A0m = PorterDuff.Mode.SRC_IN;
    public boolean A0n;
    public boolean A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q = new Paint.FontMetrics();
    public final Paint A0r = C108945cZ.A0K(1);
    public final Path A0s = C108945cZ.A0L();
    public final PointF A0t = new PointF();
    public final RectF A0u = AnonymousClass3MW.A08();
    public final CZD A0v;

    public void A0W(ColorStateList colorStateList) {
        this.A0o = true;
        if (this.A0K != colorStateList) {
            this.A0K = colorStateList;
            if (A05()) {
                C27831Xu.A03(colorStateList, this.A0S);
            }
            BE7.A1B(this);
        }
    }

    private void A02(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C27831Xu.A0G(C27831Xu.A00(this), drawable);
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.A0T) {
                if (drawable.isStateful()) {
                    drawable.setState(this.A0h);
                }
                C27831Xu.A03(this.A0N, drawable);
                return;
            }
            Drawable drawable2 = this.A0S;
            if (drawable == drawable2 && this.A0o) {
                C27831Xu.A03(this.A0K, drawable2);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private boolean A04() {
        if (!this.A0c || this.A0R == null || !this.A0e) {
            return false;
        }
        return true;
    }

    private boolean A05() {
        if (!this.A0n || this.A0S == null) {
            return false;
        }
        return true;
    }

    public static boolean A06(C23518Bih bih) {
        if (!bih.A0d || bih.A0T == null) {
            return false;
        }
        return true;
    }

    public void A0M() {
        E2N e2n = (E2N) this.A0a.get();
        if (e2n != null) {
            Chip chip = (Chip) e2n;
            chip.A07(chip.A00);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Deprecated
    public void A0N(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            setShapeAppearanceModel(this.A01.A0K.A03(f));
        }
    }

    public void A0O(float f) {
        if (this.A02 != f) {
            float A0K2 = A0K();
            this.A02 = f;
            float A0K3 = A0K();
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0M();
            }
        }
    }

    public void A0P(float f) {
        if (this.A05 != f) {
            this.A05 = f;
            this.A0r.setStrokeWidth(f);
            if (this.A0f) {
                this.A01.A04 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void A0Q(float f) {
        if (this.A06 != f) {
            this.A06 = f;
            invalidateSelf();
            if (A06(this)) {
                A0M();
            }
        }
    }

    public void A0R(float f) {
        if (this.A07 != f) {
            this.A07 = f;
            invalidateSelf();
            if (A06(this)) {
                A0M();
            }
        }
    }

    public void A0S(float f) {
        if (this.A08 != f) {
            this.A08 = f;
            invalidateSelf();
            if (A06(this)) {
                A0M();
            }
        }
    }

    public void A0T(float f) {
        if (this.A09 != f) {
            float A0K2 = A0K();
            this.A09 = f;
            float A0K3 = A0K();
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0M();
            }
        }
    }

    public void A0U(float f) {
        if (this.A0A != f) {
            float A0K2 = A0K();
            this.A0A = f;
            float A0K3 = A0K();
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0M();
            }
        }
    }

    public void A0V(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0I != colorStateList) {
            this.A0I = colorStateList;
            if (this.A0c && (drawable = this.A0R) != null && this.A0b) {
                C27831Xu.A03(colorStateList, drawable);
            }
            BE7.A1B(this);
        }
    }

    public void A0X(ColorStateList colorStateList) {
        if (this.A0L != colorStateList) {
            this.A0L = colorStateList;
            if (this.A0f) {
                A0G(colorStateList);
            }
            BE7.A1B(this);
        }
    }

    public void A0Y(ColorStateList colorStateList) {
        if (this.A0N != colorStateList) {
            this.A0N = colorStateList;
            if (A06(this)) {
                C27831Xu.A03(colorStateList, this.A0T);
            }
            BE7.A1B(this);
        }
    }

    public void A0Z(Drawable drawable) {
        if (this.A0R != drawable) {
            float A0K2 = A0K();
            this.A0R = drawable;
            float A0K3 = A0K();
            Drawable drawable2 = this.A0R;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            A02(this.A0R);
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0M();
            }
        }
    }

    public void A0a(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = this.A0S;
        if (drawable4 != null) {
            drawable2 = C27831Xu.A01(drawable4);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A0K2 = A0K();
            if (drawable != null) {
                drawable3 = BE7.A0E(drawable);
            } else {
                drawable3 = null;
            }
            this.A0S = drawable3;
            float A0K3 = A0K();
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (A05()) {
                A02(this.A0S);
            }
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0M();
            }
        }
    }

    public void A0b(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = this.A0T;
        if (drawable4 != null) {
            drawable2 = C27831Xu.A01(drawable4);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A0L2 = A0L();
            if (drawable != null) {
                drawable3 = BE7.A0E(drawable);
            } else {
                drawable3 = null;
            }
            this.A0T = drawable3;
            this.A0U = new RippleDrawable(AnonymousClass1ZD.A02(this.A0O), this.A0T, A0w);
            float A0L3 = A0L();
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (A06(this)) {
                A02(this.A0T);
            }
            invalidateSelf();
            if (A0L2 != A0L3) {
                A0M();
            }
        }
    }

    public void A0c(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            float A0K2 = A0K();
            if (!z && this.A0e) {
                this.A0e = false;
            }
            float A0K3 = A0K();
            invalidateSelf();
            if (A0K2 != A0K3) {
                A0M();
            }
        }
    }

    public void A0d(boolean z) {
        if (this.A0c != z) {
            boolean A042 = A04();
            this.A0c = z;
            boolean A043 = A04();
            if (A042 != A043) {
                Drawable drawable = this.A0R;
                if (A043) {
                    A02(drawable);
                } else if (drawable != null) {
                    drawable.setCallback((Drawable.Callback) null);
                }
                invalidateSelf();
                A0M();
            }
        }
    }

    public void A0e(boolean z) {
        if (this.A0n != z) {
            boolean A052 = A05();
            this.A0n = z;
            boolean A053 = A05();
            if (A052 != A053) {
                Drawable drawable = this.A0S;
                if (A053) {
                    A02(drawable);
                } else if (drawable != null) {
                    drawable.setCallback((Drawable.Callback) null);
                }
                invalidateSelf();
                A0M();
            }
        }
    }

    public void A0f(boolean z) {
        if (this.A0d != z) {
            boolean A062 = A06(this);
            this.A0d = z;
            boolean A063 = A06(this);
            if (A062 != A063) {
                Drawable drawable = this.A0T;
                if (A063) {
                    A02(drawable);
                } else if (drawable != null) {
                    drawable.setCallback((Drawable.Callback) null);
                }
                invalidateSelf();
                A0M();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.A0D) != 0) {
            Canvas canvas2 = canvas;
            if (i < 255) {
                float f6 = (float) bounds.left;
                float f7 = (float) bounds.top;
                float f8 = (float) bounds.right;
                float f9 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i2 = canvas2.saveLayerAlpha(f6, f7, f8, f9, i);
                } else {
                    i2 = canvas2.saveLayerAlpha(f6, f7, f8, f9, i, 31);
                }
            } else {
                i2 = 0;
            }
            if (!this.A0f) {
                Paint paint = this.A0r;
                AnonymousClass3MZ.A1D(this.A0G, paint);
                RectF rectF = this.A0u;
                rectF.set(bounds);
                if (this.A0f) {
                    f4 = A08();
                } else {
                    f4 = this.A00;
                }
                if (this.A0f) {
                    f5 = A08();
                } else {
                    f5 = this.A00;
                }
                canvas2.drawRoundRect(rectF, f4, f5, paint);
            }
            if (!this.A0f) {
                Paint paint2 = this.A0r;
                AnonymousClass3MZ.A1D(this.A0E, paint2);
                ColorFilter colorFilter = this.A0P;
                if (colorFilter == null) {
                    colorFilter = this.A0Q;
                }
                paint2.setColorFilter(colorFilter);
                RectF rectF2 = this.A0u;
                rectF2.set(bounds);
                if (this.A0f) {
                    f2 = A08();
                } else {
                    f2 = this.A00;
                }
                if (this.A0f) {
                    f3 = A08();
                } else {
                    f3 = this.A00;
                }
                canvas2.drawRoundRect(rectF2, f2, f3, paint2);
            }
            if (this.A0f) {
                super.draw(canvas2);
            }
            if (this.A05 > 0.0f && !this.A0f) {
                Paint paint3 = this.A0r;
                paint3.setColor(this.A0F);
                AnonymousClass3MW.A1P(paint3);
                if (!this.A0f) {
                    ColorFilter colorFilter2 = this.A0P;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0Q;
                    }
                    paint3.setColorFilter(colorFilter2);
                }
                RectF rectF3 = this.A0u;
                BEB.A0n(bounds, rectF3, (float) bounds.left, this.A05 / 2.0f);
                float f10 = this.A00 - (this.A05 / 2.0f);
                canvas2.drawRoundRect(rectF3, f10, f10, paint3);
            }
            Paint paint4 = this.A0r;
            AnonymousClass3MZ.A1D(0, paint4);
            RectF rectF4 = this.A0u;
            rectF4.set(bounds);
            if (!this.A0f) {
                float f11 = this.A00;
                canvas2.drawRoundRect(rectF4, f11, f11, paint4);
            } else {
                RectF rectF5 = new RectF(bounds);
                Path path = this.A0s;
                AnonymousClass1Z4 r13 = this.A0F;
                C28131Yz r0 = this.A01;
                r13.A01(path, rectF5, r0.A0K, this.A0E, r0.A01);
                RectF rectF6 = this.A0D;
                rectF6.set(getBounds());
                C28011Ym r4 = this.A01.A0K;
                if (r4.A04(rectF6)) {
                    float BPT = r4.A03.BPT(rectF6) * this.A01.A01;
                    canvas2.drawRoundRect(rectF6, BPT, BPT, paint4);
                } else {
                    canvas2.drawPath(path, paint4);
                }
            }
            if (A05()) {
                A01(bounds, rectF4);
                float f12 = rectF4.left;
                float f13 = rectF4.top;
                canvas2.translate(f12, f13);
                this.A0S.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0S.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (A04()) {
                A01(bounds, rectF4);
                float f14 = rectF4.left;
                float f15 = rectF4.top;
                canvas2.translate(f14, f15);
                this.A0R.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0R.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.A0g && this.A0Z != null) {
                PointF pointF = this.A0t;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0Z != null) {
                    float A0K2 = this.A04 + A0K() + this.A0C;
                    if (C27831Xu.A00(this) == 0) {
                        pointF.x = ((float) bounds.left) + A0K2;
                    } else {
                        pointF.x = ((float) bounds.right) - A0K2;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    TextPaint textPaint = this.A0v.A04;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF4.setEmpty();
                if (this.A0Z != null) {
                    float A0K3 = this.A04 + A0K() + this.A0C;
                    float A0L2 = this.A01 + A0L() + this.A0B;
                    int A002 = C27831Xu.A00(this);
                    float f16 = (float) bounds.left;
                    if (A002 == 0) {
                        rectF4.left = f16 + A0K3;
                        f = ((float) bounds.right) - A0L2;
                    } else {
                        rectF4.left = f16 + A0L2;
                        f = ((float) bounds.right) - A0K3;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                CZD czd = this.A0v;
                if (czd.A00 != null) {
                    TextPaint textPaint2 = czd.A04;
                    textPaint2.drawableState = getState();
                    czd.A00.A04(this.A0p, textPaint2, czd.A05);
                }
                TextPaint textPaint3 = czd.A04;
                textPaint3.setTextAlign(align);
                int round = Math.round(czd.A00(this.A0Z.toString()));
                int i3 = 0;
                boolean z = false;
                if (round > Math.round(rectF4.width())) {
                    z = true;
                    i3 = canvas2.save();
                    canvas2.clipRect(rectF4);
                }
                CharSequence charSequence = this.A0Z;
                if (z && this.A0V != null) {
                    charSequence = TextUtils.ellipsize(charSequence, textPaint3, rectF4.width(), this.A0V);
                }
                canvas2.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint3);
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (A06(this)) {
                rectF4.setEmpty();
                if (A06(this)) {
                    float f17 = this.A01 + this.A06;
                    if (C27831Xu.A00(this) == 0) {
                        float f18 = ((float) bounds.right) - f17;
                        rectF4.right = f18;
                        rectF4.left = f18 - this.A07;
                    } else {
                        float f19 = ((float) bounds.left) + f17;
                        rectF4.left = f19;
                        rectF4.right = f19 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.A07;
                    float f21 = exactCenterY - (f20 / 2.0f);
                    rectF4.top = f21;
                    rectF4.bottom = f21 + f20;
                }
                float f22 = rectF4.left;
                float f23 = rectF4.top;
                canvas2.translate(f22, f23);
                this.A0T.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0U.setBounds(this.A0T.getBounds());
                this.A0U.jumpToCurrentState();
                this.A0U.draw(canvas2);
                canvas2.translate(-f22, -f23);
            }
            if (this.A0D < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public int getAlpha() {
        return this.A0D;
    }

    public ColorFilter getColorFilter() {
        return this.A0P;
    }

    public int getIntrinsicHeight() {
        return (int) this.A03;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.A04 + A0K() + this.A0C + this.A0v.A00(this.A0Z.toString()) + this.A0B + A0L() + this.A01), this.A0H);
    }

    public void getOutline(Outline outline) {
        Outline outline2 = outline;
        if (this.A0f) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(((float) this.A0D) / 255.0f);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A0M;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A0J;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A0L;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        C26044Cr8 cr8 = this.A0v.A00;
        if (cr8 != null && (colorStateList = cr8.A01) != null && colorStateList.isStateful()) {
            return true;
        }
        if (this.A0c && this.A0R != null && this.A0b) {
            return true;
        }
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.A0R;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.A0l;
        if (colorStateList5 == null || !colorStateList5.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.A0f) {
            super.onStateChange(iArr);
        }
        return A07(this, iArr, this.A0h);
    }

    public void setAlpha(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A0P != colorFilter) {
            this.A0P = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.A0l != colorStateList) {
            this.A0l = colorStateList;
            BE7.A1B(this);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A0m != mode) {
            this.A0m = mode;
            ColorStateList colorStateList = this.A0l;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.A0Q = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 16842910;
        A0x = A1X;
    }

    public C23518Bih(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132084746);
        A0E(context);
        this.A0p = context;
        CZD czd = new CZD(this);
        this.A0v = czd;
        this.A0Z = "";
        czd.A04.density = C72463Mc.A00(context);
        int[] iArr = A0x;
        setState(iArr);
        if (!Arrays.equals(this.A0h, iArr)) {
            this.A0h = iArr;
            if (A06(this)) {
                A07(this, getState(), iArr);
            }
        }
        this.A0g = true;
        A0w.setTint(-1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C23518Bih A00(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = 2132084746(0x7f15080a, float:1.9809671E38)
            X.Bih r2 = new X.Bih
            r8 = r14
            r11 = r15
            r2.<init>(r13, r14, r15)
            android.content.Context r7 = r2.A0p
            int[] r9 = X.C27781Xn.A07
            r1 = 0
            int[] r10 = new int[r1]
            android.content.res.TypedArray r3 = X.C27791Xo.A00(r7, r8, r9, r10, r11, r12)
            r0 = 37
            boolean r0 = r3.hasValue(r0)
            r2.A0f = r0
            r0 = 24
            android.content.res.ColorStateList r4 = X.AnonymousClass1YT.A01(r7, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0M
            if (r0 == r4) goto L_0x002c
            r2.A0M = r4
            X.BE7.A1B(r2)
        L_0x002c:
            r0 = 11
            android.content.res.ColorStateList r4 = X.AnonymousClass1YT.A01(r7, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0J
            if (r0 == r4) goto L_0x003b
            r2.A0J = r4
            X.BE7.A1B(r2)
        L_0x003b:
            r0 = 19
            r4 = 0
            float r5 = r3.getDimension(r0, r4)
            float r0 = r2.A03
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            r2.A03 = r5
            r2.invalidateSelf()
            r2.A0M()
        L_0x0050:
            r0 = 12
            r5 = 12
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0061
            float r0 = r3.getDimension(r5, r4)
            r2.A0N(r0)
        L_0x0061:
            r0 = 22
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r7, r3, r0)
            r2.A0X(r0)
            r0 = 23
            float r0 = r3.getDimension(r0, r4)
            r2.A0P(r0)
            r0 = 36
            android.content.res.ColorStateList r5 = X.AnonymousClass1YT.A01(r7, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0O
            if (r0 == r5) goto L_0x0082
            r2.A0O = r5
            X.BE7.A1B(r2)
        L_0x0082:
            r0 = 5
            java.lang.CharSequence r5 = r3.getText(r0)
            if (r5 != 0) goto L_0x008b
            java.lang.String r5 = ""
        L_0x008b:
            java.lang.CharSequence r0 = r2.A0Z
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 != 0) goto L_0x00a0
            r2.A0Z = r5
            X.CZD r5 = r2.A0v
            r0 = 1
            r5.A02 = r0
            r2.invalidateSelf()
            r2.A0M()
        L_0x00a0:
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0247
            int r0 = r3.getResourceId(r1, r1)
            if (r0 == 0) goto L_0x0247
            X.Cr8 r6 = new X.Cr8
            r6.<init>(r7, r0)
        L_0x00b1:
            r5 = 1
            float r0 = r6.A00
            float r0 = r3.getDimension(r5, r0)
            r6.A00 = r0
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r5 >= r0) goto L_0x00c7
            r0 = 2
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r7, r3, r0)
            r6.A01 = r0
        L_0x00c7:
            X.CZD r0 = r2.A0v
            r0.A01(r7, r6)
            r0 = 3
            int r5 = r3.getInt(r0, r1)
            r0 = 1
            if (r5 == r0) goto L_0x0243
            r0 = 2
            if (r5 == r0) goto L_0x023f
            r0 = 3
            if (r5 != r0) goto L_0x00de
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00dc:
            r2.A0V = r0
        L_0x00de:
            r0 = 18
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0e(r0)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r14 == 0) goto L_0x0104
            java.lang.String r0 = "chipIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "chipIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x0104
            r0 = 15
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0e(r0)
        L_0x0104:
            r0 = 14
            android.graphics.drawable.Drawable r0 = X.AnonymousClass1YT.A03(r7, r3, r0)
            r2.A0a(r0)
            r0 = 17
            r6 = 17
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x011e
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r7, r3, r6)
            r2.A0W(r0)
        L_0x011e:
            r6 = 16
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r3.getDimension(r6, r0)
            r2.A0O(r0)
            r0 = 31
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0f(r0)
            if (r14 == 0) goto L_0x014d
            java.lang.String r0 = "closeIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "closeIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x014d
            r0 = 26
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0f(r0)
        L_0x014d:
            r0 = 25
            android.graphics.drawable.Drawable r0 = X.AnonymousClass1YT.A03(r7, r3, r0)
            r2.A0b(r0)
            r0 = 30
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r7, r3, r0)
            r2.A0Y(r0)
            r0 = 28
            float r0 = r3.getDimension(r0, r4)
            r2.A0R(r0)
            r0 = 6
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0c(r0)
            r0 = 10
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0d(r0)
            if (r14 == 0) goto L_0x0194
            java.lang.String r0 = "checkedIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x0194
            java.lang.String r0 = "checkedIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x0194
            r0 = 8
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0d(r0)
        L_0x0194:
            r0 = 7
            android.graphics.drawable.Drawable r0 = X.AnonymousClass1YT.A03(r7, r3, r0)
            r2.A0Z(r0)
            r0 = 9
            r1 = 9
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x01ad
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r7, r3, r1)
            r2.A0V(r0)
        L_0x01ad:
            r0 = 39
            X.1Yk r0 = X.C27991Yk.A01(r7, r3, r0)
            r2.A0X = r0
            r0 = 33
            X.1Yk r0 = X.C27991Yk.A01(r7, r3, r0)
            r2.A0W = r0
            r0 = 21
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d1
            r2.A04 = r1
            r2.invalidateSelf()
            r2.A0M()
        L_0x01d1:
            r0 = 35
            float r0 = r3.getDimension(r0, r4)
            r2.A0U(r0)
            r0 = 34
            float r0 = r3.getDimension(r0, r4)
            r2.A0T(r0)
            r0 = 41
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A0C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01f7
            r2.A0C = r1
            r2.invalidateSelf()
            r2.A0M()
        L_0x01f7:
            r0 = 40
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A0B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            r2.A0B = r1
            r2.invalidateSelf()
            r2.A0M()
        L_0x020b:
            r0 = 29
            float r0 = r3.getDimension(r0, r4)
            r2.A0S(r0)
            r0 = 27
            float r0 = r3.getDimension(r0, r4)
            r2.A0Q(r0)
            r0 = 13
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0231
            r2.A01 = r1
            r2.invalidateSelf()
            r2.A0M()
        L_0x0231:
            r1 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r3.getDimensionPixelSize(r1, r0)
            r2.A0H = r0
            r3.recycle()
            return r2
        L_0x023f:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00dc
        L_0x0243:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00dc
        L_0x0247:
            r6 = 0
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23518Bih.A00(android.content.Context, android.util.AttributeSet, int):X.Bih");
    }

    private void A01(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (A05() || A04()) {
            float f = this.A04 + this.A0A;
            if (this.A0e) {
                drawable = this.A0R;
            } else {
                drawable = this.A0S;
            }
            float f2 = this.A02;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (C27831Xu.A00(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.A0e) {
                drawable2 = this.A0R;
            } else {
                drawable2 = this.A0S;
            }
            float f5 = this.A02;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) AnonymousClass1YU.A00(this.A0p, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r8.A0b == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a0, code lost:
        if (r1 == r8.A0K()) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(X.C23518Bih r8, int[] r9, int[] r10) {
        /*
            boolean r7 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A0M
            r4 = 0
            if (r1 == 0) goto L_0x0138
            int r0 = r8.A0G
            int r0 = r1.getColorForState(r9, r0)
        L_0x000f:
            int r2 = r8.A09(r0)
            int r0 = r8.A0G
            r6 = 1
            if (r0 == r2) goto L_0x001b
            r8.A0G = r2
            r7 = 1
        L_0x001b:
            android.content.res.ColorStateList r1 = r8.A0J
            if (r1 == 0) goto L_0x0135
            int r0 = r8.A0E
            int r0 = r1.getColorForState(r9, r0)
        L_0x0025:
            int r1 = r8.A09(r0)
            int r0 = r8.A0E
            if (r0 == r1) goto L_0x0030
            r8.A0E = r1
            r7 = 1
        L_0x0030:
            int r2 = X.AnonymousClass1Z2.A05(r1, r2)
            int r0 = r8.A0i
            boolean r1 = X.AnonymousClass000.A1S(r0, r2)
            X.1Yz r0 = r8.A01
            android.content.res.ColorStateList r0 = r0.A0B
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r1 = r1 | r0
            if (r1 == 0) goto L_0x004b
            r8.A0i = r2
            X.BE7.A1C(r8, r2)
            r7 = 1
        L_0x004b:
            android.content.res.ColorStateList r1 = r8.A0L
            if (r1 == 0) goto L_0x0132
            int r0 = r8.A0F
            int r1 = r1.getColorForState(r9, r0)
        L_0x0055:
            int r0 = r8.A0F
            if (r0 == r1) goto L_0x005c
            r8.A0F = r1
            r7 = 1
        L_0x005c:
            X.CZD r0 = r8.A0v
            X.Cr8 r0 = r0.A00
            if (r0 == 0) goto L_0x012f
            android.content.res.ColorStateList r1 = r0.A01
            if (r1 == 0) goto L_0x012f
            int r0 = r8.A0j
            int r1 = r1.getColorForState(r9, r0)
        L_0x006c:
            int r0 = r8.A0j
            if (r0 == r1) goto L_0x0073
            r8.A0j = r1
            r7 = 1
        L_0x0073:
            int[] r5 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r5 == 0) goto L_0x0089
            int r2 = r5.length
            r1 = 0
        L_0x007e:
            if (r1 >= r2) goto L_0x0089
            r0 = r5[r1]
            if (r0 != r3) goto L_0x012b
            boolean r0 = r8.A0b
            r2 = 1
            if (r0 != 0) goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            boolean r0 = r8.A0e
            if (r0 == r2) goto L_0x00a2
            android.graphics.drawable.Drawable r0 = r8.A0R
            if (r0 == 0) goto L_0x00a2
            float r1 = r8.A0K()
            r8.A0e = r2
            float r0 = r8.A0K()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 1
            r5 = 1
            if (r0 != 0) goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            android.content.res.ColorStateList r1 = r8.A0l
            if (r1 == 0) goto L_0x0129
            int r0 = r8.A0k
            int r1 = r1.getColorForState(r9, r0)
        L_0x00ad:
            int r0 = r8.A0k
            if (r0 == r1) goto L_0x0127
            r8.A0k = r1
            android.content.res.ColorStateList r1 = r8.A0l
            android.graphics.PorterDuff$Mode r2 = r8.A0m
            if (r1 == 0) goto L_0x0125
            if (r2 == 0) goto L_0x0125
            int[] r0 = r8.getState()
            int r0 = r1.getColorForState(r0, r4)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r2)
        L_0x00c8:
            r8.A0Q = r1
        L_0x00ca:
            android.graphics.drawable.Drawable r0 = r8.A0S
            if (r0 == 0) goto L_0x00db
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00db
            android.graphics.drawable.Drawable r0 = r8.A0S
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00db:
            android.graphics.drawable.Drawable r0 = r8.A0R
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00ec
            android.graphics.drawable.Drawable r0 = r8.A0R
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00ec:
            android.graphics.drawable.Drawable r0 = r8.A0T
            if (r0 == 0) goto L_0x0109
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0109
            int r3 = r9.length
            int r2 = r10.length
            int r0 = r3 + r2
            int[] r1 = new int[r0]
            java.lang.System.arraycopy(r9, r4, r1, r4, r3)
            java.lang.System.arraycopy(r10, r4, r1, r3, r2)
            android.graphics.drawable.Drawable r0 = r8.A0T
            boolean r0 = r0.setState(r1)
            r6 = r6 | r0
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r8.A0U
            if (r0 == 0) goto L_0x011a
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x011a
            android.graphics.drawable.Drawable r0 = r8.A0U
            boolean r0 = r0.setState(r10)
            r6 = r6 | r0
        L_0x011a:
            if (r6 == 0) goto L_0x011f
            r8.invalidateSelf()
        L_0x011f:
            if (r5 == 0) goto L_0x0124
            r8.A0M()
        L_0x0124:
            return r6
        L_0x0125:
            r1 = 0
            goto L_0x00c8
        L_0x0127:
            r6 = r7
            goto L_0x00ca
        L_0x0129:
            r1 = 0
            goto L_0x00ad
        L_0x012b:
            int r1 = r1 + 1
            goto L_0x007e
        L_0x012f:
            r1 = 0
            goto L_0x006c
        L_0x0132:
            r1 = 0
            goto L_0x0055
        L_0x0135:
            r0 = 0
            goto L_0x0025
        L_0x0138:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23518Bih.A07(X.Bih, int[], int[]):boolean");
    }

    public float A0K() {
        Drawable drawable;
        if (!A05() && !A04()) {
            return 0.0f;
        }
        float f = this.A0A;
        if (this.A0e) {
            drawable = this.A0R;
        } else {
            drawable = this.A0S;
        }
        float f2 = this.A02;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f + f2 + this.A09;
    }

    public float A0L() {
        if (A06(this)) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    public void C8W() {
        A0M();
        invalidateSelf();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (A05()) {
            onLayoutDirectionChanged |= C27831Xu.A0G(i, this.A0S);
        }
        if (A04()) {
            onLayoutDirectionChanged |= C27831Xu.A0G(i, this.A0R);
        }
        if (A06(this)) {
            onLayoutDirectionChanged |= C27831Xu.A0G(i, this.A0T);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (A05()) {
            onLevelChange |= this.A0S.setLevel(i);
        }
        if (A04()) {
            onLevelChange |= this.A0R.setLevel(i);
        }
        if (A06(this)) {
            onLevelChange |= this.A0T.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (A05()) {
            visible |= this.A0S.setVisible(z, z2);
        }
        if (A04()) {
            visible |= this.A0R.setVisible(z, z2);
        }
        if (A06(this)) {
            visible |= this.A0T.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
