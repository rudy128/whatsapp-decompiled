package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* renamed from: X.1c3  reason: invalid class name and case insensitive filesystem */
public class C29341c3 extends Drawable implements C29331c2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public WeakReference A06;
    public WeakReference A07;
    public final C55172fK A08;
    public final CZD A09;
    public final WeakReference A0A;
    public final Rect A0B = new Rect();
    public final C27801Xq A0C = new C27801Xq();

    public C29341c3(Context context, C64542uw r7) {
        Context context2;
        this.A0A = new WeakReference(context);
        C27791Xo.A04(context, "Theme.MaterialComponents", C27791Xo.A01);
        CZD czd = new CZD(this);
        this.A09 = czd;
        czd.A04.setTextAlign(Paint.Align.CENTER);
        WeakReference weakReference = this.A0A;
        Context context3 = (Context) weakReference.get();
        if (context3 != null) {
            C26044Cr8 cr8 = new C26044Cr8(context3, 2132083927);
            CZD czd2 = this.A09;
            if (!(czd2.A00 == cr8 || (context2 = (Context) weakReference.get()) == null)) {
                czd2.A01(context2, cr8);
                A04(this);
            }
        }
        this.A08 = new C55172fK(context, r7);
        A03(this);
        CZD czd3 = this.A09;
        czd3.A02 = true;
        A04(this);
        invalidateSelf();
        TextPaint textPaint = czd3.A04;
        C64542uw r1 = this.A08.A03;
        textPaint.setAlpha(r1.A00);
        invalidateSelf();
        A01(this);
        textPaint.setColor(r1.A0C.intValue());
        invalidateSelf();
        A02(this);
        A04(this);
        setVisible(r1.A06.booleanValue(), false);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static void A01(C29341c3 r3) {
        ColorStateList valueOf = ColorStateList.valueOf(r3.A08.A03.A0A.intValue());
        C27801Xq r1 = r3.A0C;
        if (r1.A01.A0B != valueOf) {
            r1.A0F(valueOf);
            r3.invalidateSelf();
        }
    }

    public static void A02(C29341c3 r2) {
        FrameLayout frameLayout;
        WeakReference weakReference = r2.A07;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) weakReference.get();
            WeakReference weakReference2 = r2.A06;
            if (weakReference2 != null) {
                frameLayout = (FrameLayout) weakReference2.get();
            } else {
                frameLayout = null;
            }
            r2.A08(view, frameLayout);
        }
    }

    public static void A03(C29341c3 r4) {
        r4.A05 = ((int) Math.pow(10.0d, ((double) r4.A08.A03.A04) - 1.0d)) - 1;
        r4.A09.A02 = true;
        A04(r4);
        r4.invalidateSelf();
    }

    public static void A04(C29341c3 r12) {
        Integer num;
        int i;
        float A002;
        Integer num2;
        float f;
        float f2;
        ViewGroup viewGroup;
        Context context = (Context) r12.A0A.get();
        WeakReference weakReference = r12.A07;
        View view = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = r12.A0B;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference2 = r12.A06;
            if (!(weakReference2 == null || (viewGroup = (ViewGroup) weakReference2.get()) == null)) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            C55172fK r10 = r12.A08;
            C64542uw r9 = r10.A03;
            if (AnonymousClass000.A1S(r9.A05, -1)) {
                num = r9.A0F;
            } else {
                num = r9.A0G;
            }
            int intValue = num.intValue() + r9.A09.intValue();
            int intValue2 = r9.A0B.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                i = rect3.bottom - intValue;
            } else {
                i = rect3.top + intValue;
            }
            r12.A01 = (float) i;
            if (r12.A05() <= 9) {
                if (!AnonymousClass000.A1S(r9.A05, -1)) {
                    A002 = r10.A00;
                } else {
                    A002 = r10.A02;
                }
                r12.A02 = A002;
                r12.A03 = A002;
            } else {
                float f3 = r10.A02;
                r12.A02 = f3;
                r12.A03 = f3;
                A002 = (r12.A09.A00(r12.A00()) / 2.0f) + r10.A01;
            }
            r12.A04 = A002;
            Resources resources = context.getResources();
            int i2 = 2131167761;
            if (AnonymousClass000.A1S(r9.A05, -1)) {
                i2 = 2131167764;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            if (AnonymousClass000.A1S(r9.A05, -1)) {
                num2 = r9.A0D;
            } else {
                num2 = r9.A0E;
            }
            int intValue3 = num2.intValue() + r9.A08.intValue();
            int intValue4 = r9.A0B.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691 ? view.getLayoutDirection() != 0 : view.getLayoutDirection() == 0) {
                f = r12.A04;
                f2 = ((((float) rect3.right) + f) - ((float) dimensionPixelSize)) - ((float) intValue3);
            } else {
                f = r12.A04;
                f2 = (((float) rect3.left) - f) + ((float) dimensionPixelSize) + ((float) intValue3);
            }
            r12.A00 = f2;
            float f4 = r12.A01;
            float f5 = r12.A03;
            rect2.set((int) (f2 - f), (int) (f4 - f5), (int) (f2 + f), (int) (f4 + f5));
            C27801Xq r4 = r12.A0C;
            r4.setShapeAppearanceModel(r4.A01.A0K.A03(r12.A02));
            if (!rect.equals(rect2)) {
                r4.setBounds(rect2);
            }
        }
    }

    public int A05() {
        C64542uw r2 = this.A08.A03;
        if (AnonymousClass000.A1S(r2.A05, -1)) {
            return r2.A05;
        }
        return 0;
    }

    public void A07() {
        C55172fK r3 = this.A08;
        C64542uw r2 = r3.A03;
        if (AnonymousClass000.A1S(r2.A05, -1)) {
            r3.A04.A05 = -1;
            r2.A05 = -1;
            this.A09.A02 = true;
            A04(this);
            invalidateSelf();
        }
    }

    public void A08(View view, FrameLayout frameLayout) {
        this.A07 = new WeakReference(view);
        this.A06 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        A04(this);
        invalidateSelf();
    }

    public void A09(boolean z) {
        C55172fK r2 = this.A08;
        C64542uw r0 = r2.A04;
        Boolean valueOf = Boolean.valueOf(z);
        r0.A06 = valueOf;
        r2.A03.A06 = valueOf;
        setVisible(valueOf.booleanValue(), false);
    }

    public int getAlpha() {
        return this.A08.A03.A00;
    }

    public int getIntrinsicHeight() {
        return this.A0B.height();
    }

    public int getIntrinsicWidth() {
        return this.A0B.width();
    }

    public void setAlpha(int i) {
        C55172fK r1 = this.A08;
        r1.A04.A00 = i;
        r1.A03.A00 = i;
        this.A09.A04.setAlpha(i);
        invalidateSelf();
    }

    private String A00() {
        if (A05() <= this.A05) {
            return NumberFormat.getInstance(this.A08.A03.A0H).format((long) A05());
        }
        Context context = (Context) this.A0A.get();
        if (context == null) {
            return "";
        }
        return String.format(this.A08.A03.A0H, context.getString(2131899202), new Object[]{Integer.valueOf(this.A05), "+"});
    }

    public CharSequence A06() {
        Context context;
        if (isVisible()) {
            C64542uw r2 = this.A08.A03;
            if (!AnonymousClass000.A1S(r2.A05, -1)) {
                return r2.A07;
            }
            if (!(r2.A03 == 0 || (context = (Context) this.A0A.get()) == null)) {
                int A052 = A05();
                int i = this.A05;
                if (A052 <= i) {
                    Resources resources = context.getResources();
                    int i2 = r2.A03;
                    int A053 = A05();
                    return resources.getQuantityString(i2, A053, new Object[]{Integer.valueOf(A053)});
                }
                return context.getString(r2.A02, new Object[]{Integer.valueOf(i)});
            }
        }
        return null;
    }

    public void C8W() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            C64542uw r1 = this.A08.A03;
            if (r1.A00 != 0 && isVisible()) {
                this.A0C.draw(canvas);
                if (AnonymousClass000.A1S(r1.A05, -1)) {
                    Rect rect = new Rect();
                    String A002 = A00();
                    TextPaint textPaint = this.A09.A04;
                    textPaint.getTextBounds(A002, 0, A002.length(), rect);
                    canvas.drawText(A002, this.A00, this.A01 + ((float) (rect.height() / 2)), textPaint);
                }
            }
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
