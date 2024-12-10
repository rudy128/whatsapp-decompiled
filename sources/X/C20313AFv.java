package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import androidx.preference.ListPreference;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;

/* renamed from: X.AFv  reason: case insensitive filesystem */
public class C20313AFv implements AdapterView.OnItemSelectedListener {
    public final int A00;
    public final Object A01;

    public C20313AFv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.A00 != 0) {
            GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = (GoogleDriveNewUserSetupActivity) this.A01;
            if (googleDriveNewUserSetupActivity.A02.getVisibility() == 0) {
                GoogleDriveNewUserSetupActivity.A0V((RadioButton) null, googleDriveNewUserSetupActivity, String.valueOf(adapterView.getItemAtPosition(i)));
            }
        } else if (i >= 0) {
            ListPreference listPreference = (ListPreference) this.A01;
            String charSequence = listPreference.A02[i].toString();
            if (!charSequence.equals(listPreference.A00)) {
                B6V b6v = listPreference.A0A;
                if (b6v != null) {
                    b6v.C1R(listPreference, charSequence);
                }
                listPreference.A0S(charSequence);
            }
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
