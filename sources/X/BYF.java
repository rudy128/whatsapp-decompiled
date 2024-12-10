package X;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

public class BYF extends UserRecoverableAuthException {
    public final int zza;

    public BYF(Intent intent, String str, int i) {
        super((PendingIntent) null, intent, C24237Bxr.LEGACY, str);
        this.zza = i;
    }
}
