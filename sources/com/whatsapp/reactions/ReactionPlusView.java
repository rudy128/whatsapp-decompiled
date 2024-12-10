package com.whatsapp.reactions;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3OM;
import X.C108285bR;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19740yt;
import X.C27831Xu;
import X.C40501uo;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public final class ReactionPlusView extends View implements AnonymousClass009, C108285bR {
    public C18000vb A00;
    public C18030ve A01;
    public AnonymousClass031 A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public RadialGradient A0C;
    public Drawable A0D;
    public boolean A0E;
    public final float A0F;
    public final float A0G;
    public final int A0H;
    public final Paint A0I;
    public final boolean A0J;
    public final float[] A0K;
    public final int[] A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionPlusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A0G2 = C72453Mb.A0G(context, attributeSet, 1);
        A01();
        this.A09 = 1.0f;
        this.A06 = 0.625f;
        this.A0I = new Paint(1);
        this.A0J = C18020vd.A05(C18040vf.A02, getAbProps(), 11094);
        int A002 = C19740yt.A00(getContext(), 2131102343);
        this.A0H = A002;
        int[] iArr = new int[4];
        iArr[A0G2] = C72483Me.A08(iArr, A002);
        iArr[3] = A002 & 16777215;
        this.A0L = iArr;
        this.A0K = new float[]{0.0f, 0.55f, 0.7f, 1.0f};
        this.A0F = AnonymousClass3MW.A00(getResources(), 2131168423);
        this.A0G = AnonymousClass3MW.A00(getResources(), 2131168425);
        A00();
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        float pivotX = getPivotX();
        float pivotY = getPivotY();
        float f = this.A06;
        canvas.scale(f, f, pivotX, pivotY);
        if (this.A0J) {
            Paint paint = this.A0I;
            paint.setColor(this.A0H);
            RadialGradient radialGradient = this.A0C;
            if (radialGradient == null) {
                C18070vi.A11("radialGradient");
                throw null;
            }
            paint.setShader(radialGradient);
            canvas.drawCircle(this.A07, this.A08, this.A05, paint);
            paint.setShader((Shader) null);
            AnonymousClass3MX.A19(getContext(), paint, 2131102351);
            canvas.drawCircle(this.A07, this.A08, this.A04, paint);
        } else {
            float f2 = this.A0G;
            float f3 = this.A0F;
            float f4 = this.A03;
            canvas2.drawRoundRect(0.0f, 0.0f, f2, f3, f4, f4, this.A0I);
        }
        canvas.restore();
        canvas.save();
        float f5 = this.A09;
        canvas.scale(f5, f5, getPivotX(), getPivotY());
        Drawable drawable = this.A0D;
        if (drawable == null) {
            C18070vi.A11("plusDrawable");
            throw null;
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final void A00() {
        boolean z = this.A0J;
        Resources resources = getResources();
        int i = 2131168426;
        if (z) {
            i = 2131168441;
        }
        this.A0B = resources.getDimensionPixelSize(i);
        this.A03 = AnonymousClass3MW.A00(getResources(), 2131168424) / 2.0f;
        float A002 = AnonymousClass3MW.A00(getResources(), 2131168428);
        this.A04 = A002;
        this.A05 = A002 + AnonymousClass3MW.A00(getResources(), 2131168440);
        Drawable A003 = C40501uo.A00(AnonymousClass3Ma.A06(this), getResources(), 2131233186);
        if (A003 != null) {
            Drawable A022 = C27831Xu.A02(A003);
            C18070vi.A0X(A022);
            C27831Xu.A0C(A022, AnonymousClass3MZ.A02(getContext(), getContext(), 2130970916, 2131102352));
            this.A0D = A022;
            this.A0C = new RadialGradient(this.A07, this.A08, this.A05, this.A0L, this.A0K, Shader.TileMode.CLAMP);
            Paint paint = this.A0I;
            AnonymousClass3MX.A19(getContext(), paint, 2131102349);
            this.A0A = paint.getAlpha();
            AnonymousClass3MW.A1Q(this);
            AnonymousClass1Y5.A03(this, 2131894918);
            if (z) {
                setClipToOutline(true);
                setOutlineProvider(new AnonymousClass3OM((int) (((float) AnonymousClass3Ma.A02(this, 2131168440)) * 0.75f), (float) AnonymousClass3Ma.A02(this, 2131168424), AnonymousClass3MY.A1b(getWhatsAppLocale())));
                return;
            }
            return;
        }
        throw C17880vN.A0g();
    }

    public void A01() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = AnonymousClass10E.A8r(A0O);
            this.A00 = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final float getHeight() {
        return this.A0F;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final float getWidth() {
        return this.A0G;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || ((float) Math.pow((double) (motionEvent.getX() - this.A07), 2.0d)) + ((float) Math.pow((double) (motionEvent.getY() - this.A08), 2.0d)) >= ((float) Math.pow((double) this.A04, 2.0d))) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundAlpha(float f) {
        this.A0I.setAlpha((int) (((float) this.A0A) * f));
        invalidate();
    }

    public void setBackgroundScale(float f) {
        this.A06 = f * 0.625f;
        invalidate();
    }

    public void setForegroundAlpha(float f) {
        Drawable drawable = this.A0D;
        if (drawable == null) {
            C18070vi.A11("plusDrawable");
            throw null;
        }
        drawable.setAlpha((int) (255.0f * f));
        invalidate();
    }

    public void setForegroundScale(float f) {
        this.A09 = f;
        invalidate();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) i) / 2.0f;
        this.A07 = f;
        float f2 = ((float) i2) / 2.0f;
        this.A08 = f2;
        int i5 = this.A0B / 2;
        Drawable drawable = this.A0D;
        if (drawable == null) {
            C18070vi.A11("plusDrawable");
            throw null;
        }
        int i6 = (int) f;
        int i7 = (int) f2;
        drawable.setBounds(i6 - i5, i7 - i5, i6 + i5, i7 + i5);
        this.A0C = new RadialGradient(this.A07, this.A08, this.A05, this.A0L, this.A0K, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionPlusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int A0G2 = C72453Mb.A0G(context, attributeSet, 1);
        A01();
        this.A09 = 1.0f;
        this.A06 = 0.625f;
        this.A0I = new Paint(1);
        this.A0J = C18020vd.A05(C18040vf.A02, getAbProps(), 11094);
        int A002 = C19740yt.A00(getContext(), 2131102343);
        this.A0H = A002;
        int[] iArr = new int[4];
        iArr[A0G2] = C72483Me.A08(iArr, A002);
        iArr[3] = A002 & 16777215;
        this.A0L = iArr;
        this.A0K = new float[]{0.0f, 0.55f, 0.7f, 1.0f};
        this.A0F = AnonymousClass3MW.A00(getResources(), 2131168423);
        this.A0G = AnonymousClass3MW.A00(getResources(), 2131168425);
        A00();
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionPlusView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        this.A09 = 1.0f;
        this.A06 = 0.625f;
        this.A0I = new Paint(1);
        this.A0J = C18020vd.A05(C18040vf.A02, getAbProps(), 11094);
        int A002 = C19740yt.A00(getContext(), 2131102343);
        this.A0H = A002;
        int[] iArr = new int[4];
        iArr[2] = C72483Me.A08(iArr, A002);
        iArr[3] = A002 & 16777215;
        this.A0L = iArr;
        this.A0K = new float[]{0.0f, 0.55f, 0.7f, 1.0f};
        this.A0F = AnonymousClass3MW.A00(getResources(), 2131168423);
        this.A0G = AnonymousClass3MW.A00(getResources(), 2131168425);
        A00();
    }
}
