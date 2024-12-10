package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;

public final class AHK implements B6X {
    public static AHK A00;

    public /* bridge */ /* synthetic */ CharSequence CCs(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.A00)) {
            return editTextPreference.A05.getString(2131899273);
        }
        return editTextPreference.A00;
    }
}
