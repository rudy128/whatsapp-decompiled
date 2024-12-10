package androidx.preference;

import X.AnonymousClass000;
import X.C17880vN;
import android.os.Bundle;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public Set A00 = C17880vN.A12();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    public void A1z(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A1z(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A2E();
            CharSequence[] charSequenceArr = multiSelectListPreference.A01;
            if (charSequenceArr == null || (charSequenceArray = multiSelectListPreference.A02) == null) {
                throw AnonymousClass000.A0n("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            Set set = this.A00;
            set.clear();
            set.addAll(multiSelectListPreference.A00);
            this.A01 = false;
            this.A02 = charSequenceArr;
        } else {
            Set set2 = this.A00;
            set2.clear();
            set2.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            charSequenceArray = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
        this.A03 = charSequenceArray;
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", C17880vN.A10(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }
}
