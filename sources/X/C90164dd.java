package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.4dd  reason: invalid class name and case insensitive filesystem */
public class C90164dd implements View.OnKeyListener {
    public final int A00;
    public final Object A01;

    public C90164dd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        Editable text;
        Editable text2;
        switch (this.A00) {
            case 0:
                EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A01;
                if (keyEvent.getAction() != 0 || i != 67 || (i2 = encryptionKeyFragment.A00) <= 0) {
                    return false;
                }
                CodeInputField[] codeInputFieldArr = encryptionKeyFragment.A04;
                if (codeInputFieldArr != null) {
                    CodeInputField codeInputField = codeInputFieldArr[i2];
                    if (codeInputField == null || (text = codeInputField.getText()) == null || text.length() != 0) {
                        return false;
                    }
                    CodeInputField[] codeInputFieldArr2 = encryptionKeyFragment.A04;
                    if (codeInputFieldArr2 != null) {
                        CodeInputField codeInputField2 = codeInputFieldArr2[encryptionKeyFragment.A00 - 1];
                        if (codeInputField2 == null || (text2 = codeInputField2.getText()) == null) {
                            return true;
                        }
                        text2.delete(text2.length() - 1, text2.length());
                        codeInputField2.requestFocus();
                        return true;
                    }
                }
                C18070vi.A11("keyGroups");
                throw null;
            case 1:
                C77923ro r2 = (C77923ro) this.A01;
                if (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0) {
                    return false;
                }
                AnonymousClass1DD r1 = (AnonymousClass1DD) r2.A04;
                if (r1.A00.A0N() || !AnonymousClass3MX.A1T(C17890vO.A0B(r1.A01), "input_enter_send")) {
                    if (!r2.A00.A0N()) {
                        return false;
                    }
                    if ((keyEvent.getFlags() & 2) == 2 && AnonymousClass1L4.A00(r2)) {
                        return false;
                    }
                }
                if (keyEvent.isCtrlPressed()) {
                    C72483Me.A0o(r2);
                    return true;
                }
                Runnable runnable = r2.A05;
                if (runnable == null) {
                    return true;
                }
                runnable.run();
                return true;
            case 2:
                AnonymousClass3uP r5 = (AnonymousClass3uP) this.A01;
                if (i != 23) {
                    return false;
                }
                boolean isLongPress = keyEvent.isLongPress();
                C108875cR r0 = r5.A0k;
                if (isLongPress) {
                    if (r0.Bgu()) {
                        return false;
                    }
                    r5.A1r();
                    return true;
                } else if (r0 == null || !r0.Bcq() || keyEvent.getAction() != 1 || keyEvent.getEventTime() - keyEvent.getDownTime() > 500) {
                    return false;
                } else {
                    r5.A2O(r5.getFMessage());
                    return true;
                }
            case 5:
                TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A01;
                if (tokenizedSearchInput.A0F == null || keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160) || keyEvent.getAction() != 1) {
                    return false;
                }
                tokenizedSearchInput.A0F.C2N(false);
                return true;
            default:
                TextView textView = (TextView) this.A01;
                C18070vi.A0d(keyEvent, 3);
                if (i != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                AnonymousClass3MW.A1S(textView);
                return true;
        }
    }
}
