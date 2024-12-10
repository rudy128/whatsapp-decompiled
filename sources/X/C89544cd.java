package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.whatsapp.CodeInputField;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.whatsapp.mentions.MentionableEntry;
import java.util.Locale;

/* renamed from: X.4cd  reason: invalid class name and case insensitive filesystem */
public class C89544cd implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C89544cd(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void afterTextChanged(Editable editable) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                ((AnonymousClass3V2) this.A02).A0U(editable, ((MentionableEntry) this.A01).getBotMention());
                return;
            default:
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int i = 5;
                if (C27641Ww.A0D(editable)) {
                    i = 3;
                }
                layoutParams.gravity = i;
                ((View) this.A02).setLayoutParams(layoutParams);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        Editable text;
        int i4;
        if (this.A00 == 0) {
            C18070vi.A0d(charSequence, 0);
            String obj = charSequence.toString();
            EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A02;
            C18000vb r0 = encryptionKeyFragment.A03;
            if (r0 != null) {
                Locale A0N = r0.A0N();
                C18070vi.A0X(A0N);
                String lowerCase = obj.toLowerCase(A0N);
                C18070vi.A0X(lowerCase);
                if (!obj.equals(lowerCase)) {
                    EditText editText = (EditText) this.A01;
                    editText.setText(lowerCase);
                    editText.setSelection(lowerCase.length());
                }
                if (charSequence.length() == 4 && (i4 = encryptionKeyFragment.A00 + 1) < 16) {
                    CodeInputField[] codeInputFieldArr = encryptionKeyFragment.A04;
                    if (codeInputFieldArr != null) {
                        CodeInputField codeInputField = codeInputFieldArr[i4];
                        if (codeInputField != null) {
                            codeInputField.requestFocus();
                        }
                    }
                    str = "keyGroups";
                }
                StringBuilder A10 = AnonymousClass000.A10();
                CodeInputField[] codeInputFieldArr2 = encryptionKeyFragment.A04;
                if (codeInputFieldArr2 != null) {
                    for (CodeInputField codeInputField2 : codeInputFieldArr2) {
                        if (!(codeInputField2 == null || (text = codeInputField2.getText()) == null)) {
                            A10.append(text);
                        }
                    }
                    EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
                    if (encBackupViewModel == null) {
                        str = "viewModel";
                    } else {
                        encBackupViewModel.A01.A0F(C18070vi.A0H(A10));
                        return;
                    }
                }
                str = "keyGroups";
            } else {
                str = "whatsAppLocale";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
