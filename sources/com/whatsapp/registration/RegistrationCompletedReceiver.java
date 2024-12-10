package com.whatsapp.registration;

import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.C17880vN;
import X.C18070vi;
import X.C19830z4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class RegistrationCompletedReceiver extends BroadcastReceiver {
    public AnonymousClass11S A00;
    public C19830z4 A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (AnonymousClass11S) r1.A63.get();
                    this.A01 = (C19830z4) r1.ABl.get();
                    this.A03 = true;
                }
            }
        }
        boolean A16 = C18070vi.A16(context, intent);
        Log.i("RegistrationCompletedReceiver/onReceive/smba was registered on this device");
        AnonymousClass11S r2 = this.A00;
        if (r2 == null) {
            str = "meManager";
        } else if (r2.A0O(UserJid.Companion.A04(intent.getStringExtra("jid")))) {
            Log.i("RegistrationCompletedReceiver/onReceive/smba registered this clients phone number");
            C19830z4 r0 = this.A01;
            if (r0 != null) {
                C17880vN.A1F(C19830z4.A00(r0), "registration_biz_registered_on_device", A16);
                return;
            }
            str = "waSharedPreferences";
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public RegistrationCompletedReceiver(int i) {
        this.A03 = false;
        this.A02 = C17880vN.A0p();
    }

    public RegistrationCompletedReceiver() {
        this(0);
    }
}
