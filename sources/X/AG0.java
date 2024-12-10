package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

public class AG0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreferenceCompat A00;

    public AG0(SwitchPreferenceCompat switchPreferenceCompat) {
        this.A00 = switchPreferenceCompat;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = this.A00;
        AnonymousClass8BY.A0l(switchPreferenceCompat, switchPreferenceCompat, z);
    }
}
