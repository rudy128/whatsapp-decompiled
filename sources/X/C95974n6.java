package X;

import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.conversation.EditMessageActivity;

/* renamed from: X.4n6  reason: invalid class name and case insensitive filesystem */
public final class C95974n6 implements C1605488x {
    public final /* synthetic */ EditMessageActivity A00;

    public C95974n6(EditMessageActivity editMessageActivity) {
        this.A00 = editMessageActivity;
    }

    public void Bvc() {
        KeyboardPopupLayout keyboardPopupLayout = this.A00.A09;
        if (keyboardPopupLayout == null) {
            C18070vi.A11("keyboardPopupLayout");
            throw null;
        } else {
            keyboardPopupLayout.setPadding(0, 0, 0, 0);
        }
    }

    public void C5V() {
        int i;
        C33321id A07;
        EditMessageActivity editMessageActivity = this.A00;
        KeyboardPopupLayout keyboardPopupLayout = editMessageActivity.A09;
        if (keyboardPopupLayout == null) {
            C18070vi.A11("keyboardPopupLayout");
            throw null;
        }
        AnonymousClass1HO A0C = AnonymousClass1HF.A0C(AnonymousClass3MZ.A0F(editMessageActivity));
        if (A0C == null || (A07 = A0C.A07(7)) == null) {
            i = 0;
        } else {
            i = A07.A03;
        }
        keyboardPopupLayout.setPadding(0, 0, 0, i);
    }
}
