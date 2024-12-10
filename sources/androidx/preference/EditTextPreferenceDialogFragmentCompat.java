package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass3Ma;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText A00;
    public CharSequence A01;

    public void A1z(Bundle bundle) {
        CharSequence charSequence;
        super.A1z(bundle);
        if (bundle == null) {
            charSequence = ((EditTextPreference) A2E()).A00;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.A01 = charSequence;
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A01);
    }

    public void A2F(View view) {
        super.A2F(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.A00 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A00.setText(this.A01);
            EditText editText2 = this.A00;
            editText2.setSelection(AnonymousClass3Ma.A03(editText2));
            A2E();
            return;
        }
        throw AnonymousClass000.A0n("Dialog view must contain an EditText with id @android:id/edit");
    }
}
