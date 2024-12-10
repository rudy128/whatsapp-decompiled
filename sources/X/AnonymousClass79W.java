package X;

import android.widget.SeekBar;

/* renamed from: X.79W  reason: invalid class name */
public final class AnonymousClass79W implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass7K5 A00;
    public final /* synthetic */ C1607689v A01;

    public AnonymousClass79W(AnonymousClass7K5 r1, C1607689v r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.A01.C4g(this.A00, i);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.A01.C4f(this.A00);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.A01.C4e(this.A00);
    }
}
