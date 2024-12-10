package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class BI0 extends InputConnectionWrapper {
    public final InputConnection A00;

    public BI0(InputConnection inputConnection, InputConnection inputConnection2) {
        super(inputConnection2, true);
        this.A00 = inputConnection;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (i == 1 && i2 == 0) {
            return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
        }
        return super.deleteSurroundingText(i, i2);
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        if (keyEvent.getKeyCode() == 67) {
            return this.A00.sendKeyEvent(keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
