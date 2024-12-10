package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.4eu  reason: invalid class name and case insensitive filesystem */
public class C90954eu implements TextView.OnEditorActionListener {
    public boolean A00;
    public final /* synthetic */ AnonymousClass4aY A01;

    public C90954eu(AnonymousClass4aY r1) {
        this.A01 = r1;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null) {
            keyEvent.getKeyCode();
        }
        if (i == 4) {
            AnonymousClass4aY r1 = this.A01;
            r1.A2o(r1.A29, false, false);
            return true;
        } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        } else {
            if (this.A00) {
                this.A00 = false;
                return true;
            }
            AnonymousClass4aY r3 = this.A01;
            if (C17890vO.A0B(r3.A2Q.getWaSharedPreferences()).getBoolean("input_enter_send", true)) {
                r3.A2o(r3.A29, false, false);
            } else {
                int selectionStart = r3.A3Z.getSelectionStart();
                int selectionEnd = r3.A3Z.getSelectionEnd();
                if (selectionStart != r3.A3Z.length()) {
                    r3.A3Z.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), "\n", 0, 1);
                } else {
                    r3.A3Z.append("\n");
                }
            }
            this.A00 = true;
            return true;
        }
    }
}
