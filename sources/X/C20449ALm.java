package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.WaEditText;

/* renamed from: X.ALm  reason: case insensitive filesystem */
public class C20449ALm implements C107845ai {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20449ALm(WaEditText waEditText, C192889p9 r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = waEditText;
    }

    public void BmC() {
        View view = (View) this.A02;
        C17960vV.A05(view);
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BsW(int[] iArr) {
        int i = this.A00;
        EditText editText = (EditText) this.A02;
        if (i == 0 || editText.getVisibility() == 0) {
            C43251zV.A09(editText, iArr, 0);
        }
    }
}
