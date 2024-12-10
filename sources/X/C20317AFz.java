package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: X.AFz  reason: case insensitive filesystem */
public class C20317AFz implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference A00;

    public C20317AFz(SwitchPreference switchPreference) {
        this.A00 = switchPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreference switchPreference = this.A00;
        AnonymousClass8BY.A0l(switchPreference, switchPreference, z);
    }
}
