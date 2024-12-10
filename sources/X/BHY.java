package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Checkable;

public final class BHY extends View implements Checkable {
    public int A00;
    public RectF A01;
    public RectF A02;
    public RectF A03;
    public C25234CbV A04;
    public ColorFilter A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Matrix A0E;
    public final Path A0F = C108945cZ.A0L();
    public final RectF A0G;
    public final Drawable A0H;
    public final float A0I;
    public final float A0J;
    public final float A0K;
    public final C18140vp A0L;
    public final C18140vp A0M;
    public final C18140vp A0N;
    public final C18140vp A0O;
    public final C18140vp A0P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BHY(Context context, C25234CbV cbV) {
        super(context);
        C18070vi.A0d(cbV, 2);
        this.A04 = cbV;
        float dimension = context.getResources().getDimension(2131165882);
        this.A0K = dimension;
        float dimension2 = context.getResources().getDimension(2131165881);
        this.A0I = dimension2;
        this.A09 = context.getResources().getDimension(2131165885);
        this.A0B = (int) context.getResources().getDimension(2131165879);
        this.A0C = (int) context.getResources().getDimension(2131165880);
        this.A0D = (int) ((float) Math.rint((double) context.getResources().getDimension(2131165884)));
        this.A08 = context.getResources().getDimension(2131165878);
        this.A07 = context.getResources().getDimension(2131165877);
        float dimension3 = context.getResources().getDimension(2131165874);
        this.A06 = context.getResources().getDimension(2131165875);
        float dimension4 = context.getResources().getDimension(2131165876);
        float f = (dimension - dimension3) / 2.0f;
        this.A0J = f;
        this.A0G = new RectF(f, dimension4, f + dimension3, dimension3 + dimension4);
        Matrix A0J2 = C108945cZ.A0J();
        A0J2.preScale(-1.0f, 1.0f, dimension / 2.0f, dimension2 / 2.0f);
        this.A0E = A0J2;
        this.A0L = DWQ.A00(context, this, 6);
        this.A0N = DWQ.A00(context, this, 7);
        this.A0O = DWQ.A00(context, this, 8);
        this.A0P = C23731Hk.A00(new DWJ(context, 6));
        this.A00 = C19740yt.A00(context, this.A04.A03);
        this.A0A = AnonymousClass3Ma.A00(context, 2130971968, 2131103129);
        this.A0H = AnonymousClass03S.A01(context, 2131233087);
        this.A0M = C23731Hk.A00(new DWJ(this, 7));
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        int save = canvas.save();
        canvas.clipPath(this.A0F);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onDraw(Canvas canvas) {
        String str;
        C18070vi.A0d(canvas, 0);
        canvas.drawPaint(getBackgroundPaint());
        C25234CbV cbV = this.A04;
        Bitmap bitmap = cbV.A04;
        if (bitmap != null) {
            if (cbV.A07) {
                int A002 = C19740yt.A00(getContext(), this.A04.A02);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Paint A062 = AnonymousClass3MW.A06();
                A062.setColorFilter(new PorterDuffColorFilter(A002, PorterDuff.Mode.SRC_IN));
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
                new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, A062);
                bitmap = createBitmap;
            }
            C18070vi.A0b(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, getForegroundPaint());
        }
        Drawable drawable = this.A0H;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                int i = this.A0B;
                int i2 = this.A0C;
                mutate.setBounds(i, i2, mutate.getIntrinsicWidth() + i, mutate.getIntrinsicHeight() + i2);
                mutate.setTint(this.A0A);
                mutate.draw(canvas);
            }
            Drawable mutate2 = drawable.mutate();
            if (mutate2 != null) {
                int i3 = this.A0B;
                int i4 = this.A0D;
                mutate2.setBounds(i3, i4, mutate2.getIntrinsicWidth() + i3, mutate2.getIntrinsicHeight() + i4);
                mutate2.setTint(this.A00);
                canvas.save();
                canvas.setMatrix(this.A0E);
                mutate2.draw(canvas);
                canvas.restore();
            }
        }
        if (isChecked()) {
            float f = this.A07 / 2.0f;
            RectF rectF = this.A01;
            if (rectF == null) {
                str = "innerStrokeRectF";
            } else {
                float f2 = this.A09;
                float f3 = f2 - f;
                canvas.drawRoundRect(rectF, f3, f3, getInnerStrokePaint());
                float f4 = this.A08 / 2.0f;
                RectF rectF2 = this.A02;
                if (rectF2 == null) {
                    str = "outerStrokeRectF";
                } else {
                    float f5 = f2 - f4;
                    canvas.drawRoundRect(rectF2, f5, f5, getOuterStrokePaint());
                    RectF rectF3 = this.A0G;
                    canvas.drawOval(rectF3, getTickBackgroundPaint());
                    Drawable drawable2 = this.A04.A05;
                    float f6 = rectF3.left;
                    float f7 = this.A06;
                    drawable2.setBounds((int) (f6 - f7), (int) (rectF3.top - f7), (int) (rectF3.right + f7), (int) (rectF3.bottom + f7));
                    this.A04.A05.draw(canvas);
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void setChecked(boolean z) {
    }

    public final void setData(C25234CbV cbV) {
        PorterDuffColorFilter porterDuffColorFilter;
        C18070vi.A0d(cbV, 0);
        this.A04 = cbV;
        getBackgroundPaint().setColor(C19740yt.A00(getContext(), this.A04.A00));
        this.A00 = C19740yt.A00(getContext(), this.A04.A03);
        int i = this.A04.A01;
        if (i == 0) {
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AnonymousClass1Z2.A06(AnonymousClass3Ma.A00(getContext(), 2130968798, 2131099872), (int) ((((float) i) / 100.0f) * 255.0f)), PorterDuff.Mode.SRC_ATOP);
        }
        this.A05 = porterDuffColorFilter;
        invalidate();
    }

    public void toggle() {
    }

    private final Paint getBackgroundPaint() {
        Object A0m = C72463Mc.A0m(this.A0L);
        C18070vi.A0X(A0m);
        return (Paint) A0m;
    }

    private final Paint getForegroundPaint() {
        Object A0m = C72463Mc.A0m(this.A0M);
        C18070vi.A0X(A0m);
        return (Paint) A0m;
    }

    private final Paint getInnerStrokePaint() {
        Object A0m = C72463Mc.A0m(this.A0N);
        C18070vi.A0X(A0m);
        return (Paint) A0m;
    }

    private final Paint getOuterStrokePaint() {
        Object A0m = C72463Mc.A0m(this.A0O);
        C18070vi.A0X(A0m);
        return (Paint) A0m;
    }

    private final Paint getTickBackgroundPaint() {
        Object A0m = C72463Mc.A0m(this.A0P);
        C18070vi.A0X(A0m);
        return (Paint) A0m;
    }

    public final C25234CbV getData() {
        return this.A04;
    }

    public final int getIncomingBubbleColor() {
        return this.A0A;
    }

    public final float getLeft() {
        return this.A0J;
    }

    public final int getOutgoingBubbleColor() {
        return this.A00;
    }

    public boolean isChecked() {
        return this.A04.A06;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension((int) this.A0K, (int) this.A0I);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i;
        float f2 = (float) i2;
        this.A03 = C108965cb.A04(f, f2);
        float f3 = this.A08 / 2.0f;
        this.A02 = new RectF(f3, f3, f - f3, f2 - f3);
        float f4 = this.A07 / 2.0f;
        this.A01 = new RectF(f4, f4, f - f4, f2 - f4);
        Path path = this.A0F;
        path.reset();
        RectF rectF = this.A03;
        if (rectF == null) {
            C18070vi.A11("rectF");
            throw null;
        }
        float f5 = this.A09;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        path.close();
    }

    public final void setOutgoingBubbleColor(int i) {
        this.A00 = i;
    }
}
