package X;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: X.0KN  reason: invalid class name */
public class AnonymousClass0KN {
    public final EditText A00;
    public final C134236qG A01;

    public KeyListener A00(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return this.A01.A00(keyListener);
        }
        return keyListener;
    }

    public InputConnection A01(InputConnection inputConnection) {
        return this.A01.A01(inputConnection);
    }

    /* JADX INFO: finally extract failed */
    public void A02(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A00.getContext().obtainStyledAttributes(attributeSet, C002501d.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            A03(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void A03(boolean z) {
        this.A01.A02(z);
    }

    public AnonymousClass0KN(EditText editText) {
        this.A00 = editText;
        this.A01 = new C134236qG(editText);
    }
}
