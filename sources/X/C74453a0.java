package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.3a0  reason: invalid class name and case insensitive filesystem */
public final class C74453a0 extends AnonymousClass3Re {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final Paint A04 = AnonymousClass3MW.A06();
    public final RectF A05 = AnonymousClass3MW.A08();

    public C74453a0(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A00 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass4IA.A00, 0, 0);
        C18070vi.A0X(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getColor(1, C19740yt.A00(context, 2131099902));
        this.A01 = obtainStyledAttributes.getColor(1, C19740yt.A00(context, 2131099901));
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 30);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, 30);
        obtainStyledAttributes.recycle();
    }

    public synchronized void onDraw(Canvas canvas) {
        Object valueOf;
        Object valueOf2;
        C18070vi.A0d(canvas, 0);
        Drawable thumb = getThumb();
        C18070vi.A0X(getThumb().getBounds());
        float trackRange = (float) getTrackRange();
        float trackRange2 = ((float) getTrackRange()) / 2.0f;
        float f = ((float) this.A03) / 2.0f;
        int height = getHeight() / 2;
        float trackWidth = (float) getTrackWidth();
        float f2 = trackWidth / 2.0f;
        RectF rectF = this.A05;
        float f3 = (float) height;
        float f4 = f3 - f;
        float f5 = f3 + f;
        rectF.set((float) getPaddingLeft(), f4, trackWidth, f5);
        Paint paint = this.A04;
        paint.setColor(this.A01);
        float f6 = (float) this.A02;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (((float) getProgress()) < trackRange2) {
            float progress = f2 - ((trackWidth / trackRange) * (trackRange2 - ((float) getProgress())));
            if (((float) thumb.getBounds().left) > progress) {
                valueOf2 = Integer.valueOf(thumb.getBounds().left);
            } else {
                valueOf2 = Float.valueOf(progress);
            }
            rectF.set(AnonymousClass000.A04(valueOf2), f4, f2, f5);
            paint.setColor(this.A00);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        if (((float) getProgress()) > trackRange2) {
            float progress2 = ((trackWidth / trackRange) * (((float) getProgress()) - trackRange2)) + f2;
            if (thumb.getBounds().right < getLeft()) {
                valueOf = Integer.valueOf(thumb.getBounds().right);
            } else {
                valueOf = Float.valueOf(progress2);
            }
            rectF.set(f2, f4, AnonymousClass000.A04(valueOf), f5);
            paint.setColor(this.A00);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        thumb.draw(canvas);
    }

    public synchronized void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = 0;
        }
        int intrinsicHeight = getThumb().getIntrinsicHeight();
        if (View.MeasureSpec.getMode(i2) != 0) {
            intrinsicHeight = (int) Math.min((double) intrinsicHeight, (double) View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(i3, intrinsicHeight);
    }

    private final int getTrackRange() {
        int i = Build.VERSION.SDK_INT;
        int max = getMax();
        if (i >= 26) {
            return max - getMin();
        }
        return max;
    }

    public void setInitialProgress(int i) {
        AnonymousClass3Re.A01(this, i, 0);
    }

    private final int getTrackWidth() {
        return C72463Mc.A09(this) - getPaddingLeft();
    }

    public final void setFilledTrackColor(int i) {
        this.A00 = i;
    }

    public final void setUnFilledTrackColor(int i) {
        this.A01 = i;
    }
}
