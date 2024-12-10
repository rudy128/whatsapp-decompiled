package X;

import android.content.DialogInterface;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.74r  reason: invalid class name and case insensitive filesystem */
public class C1411974r implements DialogInterface.OnClickListener {
    public final int A00;

    public C1411974r(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                dialogInterface.cancel();
                return;
            case 15:
            case 16:
            case 23:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
                return;
            case 24:
                List list = C42011xT.A0I;
                return;
            case 32:
                Log.i("BanAppealBaseFragment/showRemoveAccountDialog/dismiss");
                break;
            case 33:
                C31081ez.A02("WfacBanBaseFragment/showRemoveAccountDialog/dismiss");
                break;
            default:
                C18070vi.A0d(dialogInterface, 0);
                break;
        }
        dialogInterface.dismiss();
    }
}
