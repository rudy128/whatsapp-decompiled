package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.26C  reason: invalid class name */
public final class AnonymousClass26C extends BroadcastReceiver {
    public C19830z4 A00;
    public AnonymousClass10I A01;
    public final Object A02 = C17880vN.A0p();
    public volatile boolean A03 = false;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (C19830z4) r1.ABl.get();
                    this.A01 = (AnonymousClass10I) r1.AC1.get();
                    this.A03 = true;
                }
            }
        }
        int resultCode = getResultCode();
        Bundle resultExtras = getResultExtras(true);
        Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive");
        if (context != null && resultCode == -1) {
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (C18070vi.A18(str, "com.facebook.GET_FOA_BACKUP_TOKEN") && resultExtras != null) {
                Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive/success");
                String string = resultExtras.getString("foa_backup_token");
                if (string != null) {
                    Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive/success token present");
                    AnonymousClass10I r2 = this.A01;
                    if (r2 != null) {
                        r2.CGF(new C146887Qz(context, this, string, 15));
                    } else {
                        C18070vi.A11("waWorkers");
                        throw null;
                    }
                }
            }
        }
    }
}
