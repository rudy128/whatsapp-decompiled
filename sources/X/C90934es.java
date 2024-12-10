package X;

import android.content.res.Resources;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.areffects.button.ArEffectsStrengthSlider;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onSliderChanged$1;

/* renamed from: X.4es  reason: invalid class name and case insensitive filesystem */
public final class C90934es implements SeekBar.OnSeekBarChangeListener {
    public int A00;
    public final /* synthetic */ ArEffectsStrengthSlider A01;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C90934es(ArEffectsStrengthSlider arEffectsStrengthSlider) {
        this.A01 = arEffectsStrengthSlider;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = i;
        if (this.A00 != i) {
            this.A00 = i;
            ArEffectsStrengthSlider arEffectsStrengthSlider = this.A01;
            TextView A002 = arEffectsStrengthSlider.getStrengthValue();
            Resources resources = arEffectsStrengthSlider.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, i, 0);
            A002.setText(resources.getString(2131886722, A1a));
            arEffectsStrengthSlider.addOnLayoutChangeListener(new C90194dg(arEffectsStrengthSlider, i, 0));
            C106515Wd r0 = arEffectsStrengthSlider.A00;
            if (r0 != null) {
                C92304h5 r1 = (C92304h5) ((C92314h6) r0).A00;
                BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(r1.A00.A02);
                AnonymousClass4V6 r02 = r1.A02;
                AnonymousClass4DE r2 = r02.A01;
                C107855aj r3 = r02.A02;
                AnonymousClass3MX.A1Q(new BaseArEffectsViewModel$onSliderChanged$1(r2, r3, A0Y, (C30391dr) null, i2), A0Y.A0N);
            }
        }
    }
}
