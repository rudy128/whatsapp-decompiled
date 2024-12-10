package X;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;

/* renamed from: X.3Re  reason: invalid class name */
public abstract class AnonymousClass3Re extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public ValueAnimator A01;
    public SeekBar.OnSeekBarChangeListener A02;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        C18070vi.A0d(seekBar, 0);
        if ((z || this.A00) && (onSeekBarChangeListener = this.A02) != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C18070vi.A0d(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A02;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C18070vi.A0d(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A02;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public abstract void setInitialProgress(int i);

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A02 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this);
    }

    public static final void A01(AnonymousClass3Re r3, int i, long j) {
        int progress = r3.getProgress();
        ValueAnimator valueAnimator = r3.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        r3.A01 = null;
        r3.A00 = true;
        ValueAnimator A09 = C72483Me.A09(progress, i);
        A09.setDuration(j);
        A09.setInterpolator(new AccelerateDecelerateInterpolator());
        A09.addUpdateListener(new C88694ad(r3, i, 0));
        A09.start();
        r3.A01 = A09;
    }

    public void setProgress(int i) {
        A01(this, i, (long) getResources().getInteger(17694721));
    }
}
