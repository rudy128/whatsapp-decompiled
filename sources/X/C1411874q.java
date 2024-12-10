package X;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: X.74q  reason: invalid class name and case insensitive filesystem */
public class C1411874q implements DialogInterface.OnClickListener {
    public final int A00;

    public C1411874q(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 3:
            case 5:
            case 14:
            case 30:
            case 36:
            case 37:
            case 38:
                C18070vi.A0d(dialogInterface, 0);
                break;
            case 6:
                dialogInterface.cancel();
                return;
            case 8:
            case 15:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            case 27:
            case 28:
            case 39:
            case 40:
            case 41:
                return;
            case 9:
                List list = C42011xT.A0I;
                break;
            case 42:
            case 43:
            case 45:
                break;
        }
        if (dialogInterface == null) {
            return;
        }
        dialogInterface.dismiss();
    }
}
