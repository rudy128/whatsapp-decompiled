package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class AHL implements B6X {
    public static AHL A00;

    public /* bridge */ /* synthetic */ CharSequence CCs(Preference preference) {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        ListPreference listPreference = (ListPreference) preference;
        int A0R = listPreference.A0R(listPreference.A00);
        if (A0R < 0 || (charSequenceArr2 = listPreference.A01) == null) {
            charSequence = null;
        } else {
            charSequence = charSequenceArr2[A0R];
        }
        if (TextUtils.isEmpty(charSequence)) {
            return listPreference.A05.getString(2131899273);
        }
        int A0R2 = listPreference.A0R(listPreference.A00);
        if (A0R2 < 0 || (charSequenceArr = listPreference.A01) == null) {
            return null;
        }
        return charSequenceArr[A0R2];
    }
}
