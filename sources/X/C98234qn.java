package X;

import android.view.View;
import com.whatsapp.CircularProgressBar;

/* renamed from: X.4qn  reason: invalid class name and case insensitive filesystem */
public class C98234qn implements C38531rR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public C98234qn(int i, int i2, int i3, boolean z) {
        this.A00 = i3;
        this.A03 = z;
        this.A01 = i;
        this.A02 = i2;
    }

    public final void Bvu(View view) {
        boolean z = this.A03;
        int i = this.A01;
        int i2 = this.A02;
        CircularProgressBar circularProgressBar = (CircularProgressBar) view;
        circularProgressBar.setIndeterminate(z);
        circularProgressBar.setProgress(i);
        circularProgressBar.A0C = i2;
    }
}
