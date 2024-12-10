package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class D5S implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Chip A00;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean A02;
        Chip chip = this.A00;
        E2Q e2q = chip.A05;
        if (e2q != null) {
            C26121Csj csj = ((DLA) e2q).A00;
            if (z) {
                A02 = C26121Csj.A01(csj, chip);
            } else {
                A02 = C26121Csj.A02(csj, chip, csj.A01);
            }
            if (A02) {
                C26121Csj.A00(csj);
            }
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.A03;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    public /* synthetic */ D5S(Chip chip) {
        this.A00 = chip;
    }
}
