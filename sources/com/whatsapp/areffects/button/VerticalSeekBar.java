package com.whatsapp.areffects.button;

import X.AnonymousClass112;
import X.AnonymousClass1Y1;
import X.C18070vi;
import X.C28851b7;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public final class VerticalSeekBar extends AppCompatSeekBar {
    public SeekBar.OnSeekBarChangeListener A00;
    public int A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971121);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.rotate(-90.0f);
        canvas.translate(-((float) getHeight()), 0.0f);
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        C18070vi.A0d(motionEvent, 0);
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            setProgress(getMax() - ((int) ((((float) getMax()) * motionEvent.getY()) / ((float) getHeight()))));
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.A00;
            if (onSeekBarChangeListener2 != null) {
                onSeekBarChangeListener2.onStartTrackingTouch(this);
                return true;
            }
        } else if ((action2 == 1 || action2 == 3) && (onSeekBarChangeListener = this.A00) != null) {
            onSeekBarChangeListener.onStopTrackingTouch(this);
            return true;
        }
        return true;
    }

    public void setMin(int i) {
        this.A01 = i;
        if (AnonymousClass112.A03()) {
            super.setMin(i);
        }
    }

    public void setProgress(int i) {
        int A03 = C28851b7.A03(i, this.A01, getMax());
        super.setProgress(A03);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(this, A03, true);
        }
    }

    public final int getExtraHeight() {
        return getPaddingRight() + getPaddingLeft();
    }

    public final int getExtraTopHeight() {
        return getPaddingRight();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerticalSeekBar(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, attributeSet, (i2 & 4) != 0 ? 2130971121 : i);
    }
}
