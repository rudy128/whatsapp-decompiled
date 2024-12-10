package X;

import android.text.Editable;
import android.view.View;
import com.whatsapp.CodeInputField;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.4db  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90144db implements View.OnFocusChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EncryptionKeyFragment A01;

    public final void onFocusChange(View view, boolean z) {
        Editable text;
        EncryptionKeyFragment encryptionKeyFragment = this.A01;
        int i = this.A00;
        if (z) {
            encryptionKeyFragment.A00 = i;
            if (i > 0) {
                CodeInputField[] codeInputFieldArr = encryptionKeyFragment.A04;
                if (codeInputFieldArr != null) {
                    CodeInputField codeInputField = codeInputFieldArr[i - 1];
                    if (codeInputField == null || (text = codeInputField.getText()) == null || text.length() < 4) {
                        CodeInputField[] codeInputFieldArr2 = encryptionKeyFragment.A04;
                        if (codeInputFieldArr2 != null) {
                            CodeInputField codeInputField2 = codeInputFieldArr2[encryptionKeyFragment.A00 - 1];
                            if (codeInputField2 != null) {
                                codeInputField2.requestFocus();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C18070vi.A11("keyGroups");
                throw null;
            }
        }
    }

    public /* synthetic */ C90144db(EncryptionKeyFragment encryptionKeyFragment, int i) {
        this.A01 = encryptionKeyFragment;
        this.A00 = i;
    }
}
