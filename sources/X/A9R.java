package X;

import android.content.DialogInterface;

public class A9R implements DialogInterface.OnClickListener {
    public final int A00;

    public A9R(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
            case 11:
            case 13:
            case 14:
                return;
            case 1:
            case 2:
            case 8:
                if (dialogInterface == null) {
                    return;
                }
                break;
        }
        dialogInterface.dismiss();
    }
}
