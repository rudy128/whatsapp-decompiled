package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;

/* renamed from: X.4qk  reason: invalid class name and case insensitive filesystem */
public class C98204qk implements C38531rR {
    public final int A00;
    public final int A01;

    public C98204qk(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final void Bvu(View view) {
        int i = this.A00;
        int i2 = this.A01;
        if (i != 0) {
            ((TextView) view).setMaxWidth(i2);
        } else {
            ((CircularProgressBar) view).A0C = i2;
        }
    }
}
