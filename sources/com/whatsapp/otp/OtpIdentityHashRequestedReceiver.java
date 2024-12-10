package com.whatsapp.otp;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass1U5;
import X.C000200d;
import X.C146597Pw;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONArray;

public final class OtpIdentityHashRequestedReceiver extends BroadcastReceiver {
    public AnonymousClass1U5 A00;
    public C18030ve A01;
    public AnonymousClass10I A02;
    public AnonymousClass00H A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        String creatorPackage;
        String stringExtra;
        String str;
        Context context2 = context;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10G A10 = AnonymousClass10E.A10(context);
                    AnonymousClass10E r1 = A10.AJU;
                    this.A01 = (C18030ve) r1.A04.get();
                    this.A00 = (AnonymousClass1U5) r1.A3L.get();
                    this.A03 = C000200d.A00(A10.A3e);
                    this.A02 = (AnonymousClass10I) r1.AC1.get();
                    this.A05 = true;
                }
            }
        }
        C18070vi.A0h(context, intent);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
        if (pendingIntent != null && (creatorPackage = pendingIntent.getCreatorPackage()) != null && (stringExtra = intent.getStringExtra("request_id")) != null && intent.getStringExtra("id_hash") == null) {
            C18030ve r2 = this.A01;
            if (r2 != null) {
                JSONArray jSONArray = C18020vd.A02(C18040vf.A02, r2, 5790).getJSONArray("packages");
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    if (creatorPackage.equals(jSONArray.getString(i))) {
                        AnonymousClass10I r0 = this.A02;
                        if (r0 != null) {
                            r0.CGF(new C146597Pw(this, context2, creatorPackage, stringExtra, 9));
                            return;
                        }
                        str = "waWorker";
                    } else {
                        i++;
                    }
                }
                return;
            }
            str = "abprops";
            C18070vi.A11(str);
            throw null;
        }
    }

    public OtpIdentityHashRequestedReceiver(int i) {
        this.A05 = false;
        this.A04 = C17880vN.A0p();
    }

    public OtpIdentityHashRequestedReceiver() {
        this(0);
    }
}
