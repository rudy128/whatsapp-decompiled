package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.util.Log;

public class AJF implements OnFailureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AJF(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFailure(Exception exc) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            Runnable runnable = (Runnable) this.A02;
            Log.i("RegisterPhone/phone number hint failed", exc);
            RegisterPhone.A19((RegisterPhone) obj);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C57342iv r2 = (C57342iv) obj;
        Boolean bool = (Boolean) this.A02;
        Log.e("BackupTokenUtils/setBlockStoreBytes/exception storing bytes", exc);
        if (r2 != null) {
            r2.A00(bool, exc);
        }
    }
}
