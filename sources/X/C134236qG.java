package X;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: X.6qG  reason: invalid class name and case insensitive filesystem */
public final class C134236qG {
    public final C137936wG A00;

    public KeyListener A00(KeyListener keyListener) {
        if (keyListener instanceof D4P) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (!(keyListener instanceof NumberKeyListener)) {
            return new D4P(keyListener);
        }
        return keyListener;
    }

    public InputConnection A01(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        C137936wG r1 = this.A00;
        if (!(inputConnection instanceof BI1)) {
            return new BI1(inputConnection, r1.A00);
        }
        return inputConnection;
    }

    public void A02(boolean z) {
        C1418977j r1 = this.A00.A01;
        if (r1.A00 != z) {
            r1.A00 = z;
            if (z) {
                C60692oS.A00();
                throw null;
            }
        }
    }

    public C134236qG(EditText editText) {
        this.A00 = new C137936wG(editText);
    }
}
