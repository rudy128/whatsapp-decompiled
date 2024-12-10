package X;

import android.text.Editable;

/* renamed from: X.4gR  reason: invalid class name and case insensitive filesystem */
public class C91904gR implements C28522E5m {
    public final int A00;

    public C91904gR(int i) {
        this.A00 = i;
    }

    public final int BG3(Editable editable) {
        if (this.A00 != 0) {
            return C137186v3.A00(editable);
        }
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }
}
