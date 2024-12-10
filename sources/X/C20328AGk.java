package X;

import android.content.DialogInterface;

/* renamed from: X.AGk  reason: case insensitive filesystem */
public class C20328AGk implements C22851Dl {
    public final int A00;

    public C20328AGk(int i) {
        this.A00 = i;
    }

    public final void Bo9(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 6:
                return;
            default:
                ((DialogInterface) obj).dismiss();
                return;
        }
    }
}
