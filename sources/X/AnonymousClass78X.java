package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.payments.ui.widget.CardInputText;

/* renamed from: X.78X  reason: invalid class name */
public final class AnonymousClass78X implements View.OnKeyListener {
    public final EditText A00;
    public final EditText A01;

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        EditText editText;
        Editable text;
        C18070vi.A0d(keyEvent, 2);
        CardInputText cardInputText = (CardInputText) view;
        if (cardInputText != null && keyEvent.getAction() == 0 && cardInputText.isFocused()) {
            if (i == 67 && (editText = this.A01) != null && ((text = cardInputText.getText()) == null || text.length() == 0)) {
                cardInputText.clearFocus();
                editText.requestFocus();
                return true;
            }
            EditText editText2 = this.A00;
            if (!(editText2 == null || i == 67 || cardInputText.getText() == null || AnonymousClass3Ma.A03(cardInputText) != cardInputText.A04)) {
                cardInputText.clearFocus();
                editText2.requestFocus();
                return true;
            }
        }
        return false;
    }

    public AnonymousClass78X(EditText editText, EditText editText2) {
        this.A01 = editText;
        this.A00 = editText2;
    }
}
