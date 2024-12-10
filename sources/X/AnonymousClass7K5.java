package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;

/* renamed from: X.7K5  reason: invalid class name */
public final class AnonymousClass7K5 implements C1607589u {
    public final SeekBar A00;
    public final C109415dP A01;

    public AnonymousClass7K5(View view, C128586gM r8) {
        C18070vi.A0d(r8, 2);
        r8.A02.add(this);
        AnonymousClass7K7 r4 = new AnonymousClass7K7(r8);
        SeekBar seekBar = (SeekBar) AnonymousClass1HF.A06(view, 2131430797);
        this.A00 = seekBar;
        Context context = seekBar.getContext();
        C18070vi.A0b(context);
        C109415dP r2 = new C109415dP(context);
        this.A01 = r2;
        seekBar.setThumb(new C109435dR(context));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{r2, new ColorDrawable(0)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        seekBar.setProgressDrawable(layerDrawable);
        seekBar.setOnSeekBarChangeListener(new AnonymousClass79W(this, r4));
    }

    public void Byp(int i) {
    }

    public void BdR(int i, int i2, int i3) {
        SeekBar seekBar = this.A00;
        seekBar.setMax(i - i2);
        seekBar.setProgress(i3);
    }

    public void C5r(int i) {
        this.A00.setProgress(i);
    }
}
