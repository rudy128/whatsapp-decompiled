package X;

import android.content.DialogInterface;

/* renamed from: X.4fk  reason: invalid class name and case insensitive filesystem */
public class C91474fk implements C22851Dl {
    public final int A00;

    public C91474fk(int i) {
        this.A00 = i;
    }

    public final void Bo9(Object obj) {
        DialogInterface dialogInterface;
        switch (this.A00) {
            case 7:
            case 13:
                return;
            case 8:
            case 9:
                dialogInterface = (DialogInterface) obj;
                C18070vi.A0d(dialogInterface, 0);
                break;
            default:
                dialogInterface = (DialogInterface) obj;
                break;
        }
        dialogInterface.dismiss();
    }
}
