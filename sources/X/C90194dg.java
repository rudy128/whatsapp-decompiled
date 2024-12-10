package X;

import android.view.View;
import com.whatsapp.areffects.button.ArEffectsStrengthSlider;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.4dg  reason: invalid class name and case insensitive filesystem */
public class C90194dg implements View.OnLayoutChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C90194dg(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.A00 != 0) {
            C18070vi.A0d(view, 0);
            view.removeOnLayoutChangeListener(this);
            TextStatusComposerFragment.A0d((TextStatusComposerFragment) this.A02, this.A01);
            return;
        }
        view.removeOnLayoutChangeListener(this);
        ArEffectsStrengthSlider arEffectsStrengthSlider = (ArEffectsStrengthSlider) this.A02;
        arEffectsStrengthSlider.getStrengthValue().setY(((((float) (arEffectsStrengthSlider.getSeekBar().getMax() - this.A01)) * (((float) (arEffectsStrengthSlider.getSeekBar().getHeight() - arEffectsStrengthSlider.getSeekBar().getExtraHeight())) / ((float) arEffectsStrengthSlider.getSeekBar().getMax()))) + ((float) arEffectsStrengthSlider.getSeekBar().getPaddingRight())) - ((float) (arEffectsStrengthSlider.getStrengthValue().getMeasuredHeight() / 2)));
    }
}
