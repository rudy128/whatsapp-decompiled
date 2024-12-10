package com.whatsapp.registration.directmigration;

import X.AnonymousClass10E;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C19830z4;
import X.C27371Vv;
import X.C27381Vw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class MigrationRequesterBroadcastReceiver extends BroadcastReceiver {
    public C19830z4 A00;
    public C27371Vv A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A01 = (C27371Vv) r1.A3Q.get();
                    this.A00 = (C19830z4) r1.ABl.get();
                    this.A03 = true;
                }
            }
        }
        C18070vi.A0d(context, 0);
        if (intent != null) {
            Log.i("MigrationRequesterBroadcastReceiver/received-broadcast");
            if (C17890vO.A1S(intent, "com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction")) {
                long longExtra = intent.getLongExtra("extra_min_storage_needed", 0);
                long longExtra2 = intent.getLongExtra("extra_msg_db_size", 0);
                C27371Vv r4 = this.A01;
                if (r4 != null) {
                    C27381Vw r42 = r4.A00;
                    r42.A03 = Double.valueOf((double) longExtra);
                    r42.A02 = Double.valueOf((double) longExtra2);
                    C19830z4 r0 = this.A00;
                    if (r0 != null) {
                        C17880vN.A1D(C19830z4.A00(r0), "registration_sibling_app_min_storage_needed", longExtra);
                        return;
                    }
                    str = "waSharedPreferences";
                } else {
                    str = "directMigrationLogging";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
    }

    public MigrationRequesterBroadcastReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public MigrationRequesterBroadcastReceiver() {
        this(0);
    }
}
