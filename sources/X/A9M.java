package X;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

public class A9M implements DialogInterface.OnCancelListener {
    public final int A00;

    public A9M(int i) {
        this.A00 = i;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            Log.i("RegistrationUtils/createCannotConnectDialog/dialog/cant-connect/cancel");
        } else {
            dialogInterface.dismiss();
        }
    }
}
