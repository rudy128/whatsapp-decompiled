package androidx.preference;

import X.AnonymousClass000;
import android.os.Bundle;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    public void A1z(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A1z(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A2E();
            if (listPreference.A01 == null || listPreference.A02 == null) {
                throw AnonymousClass000.A0n("ListPreference requires an entries array and an entryValues array.");
            }
            this.A00 = listPreference.A0R(listPreference.A00);
            this.A01 = listPreference.A01;
            charSequenceArray = listPreference.A02;
        } else {
            this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            charSequenceArray = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
        this.A02 = charSequenceArray;
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }
}
