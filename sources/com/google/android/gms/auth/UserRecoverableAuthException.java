package com.google.android.gms.auth;

import X.C24237Bxr;
import X.C2U;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class UserRecoverableAuthException extends C2U {
    public final Intent zza;
    public final PendingIntent zzb;
    public final C24237Bxr zzc;

    public Intent A00() {
        String str;
        Intent intent = this.zza;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.zzc.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
            } else if (ordinal != 2) {
                return null;
            } else {
                str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
            }
            Log.e("Auth", str);
            return null;
        }
        Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
        return null;
    }

    public UserRecoverableAuthException(PendingIntent pendingIntent, Intent intent, C24237Bxr bxr, String str) {
        super(str);
        this.zzb = pendingIntent;
        this.zza = intent;
        this.zzc = bxr;
    }
}
