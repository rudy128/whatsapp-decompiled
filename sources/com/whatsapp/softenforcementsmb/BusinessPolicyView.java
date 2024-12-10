package com.whatsapp.softenforcementsmb;

import X.AGE;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.C114925sD;
import X.C137116uw;
import X.C140056zs;
import X.C17880vN;
import X.C18070vi;
import X.C36171nS;
import X.C46922Gk;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public final class BusinessPolicyView extends WaInAppBrowsingActivity {
    public C36171nS A00;
    public long A01;
    public boolean A02;

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C114925sD.A03(A002, r2, r1, this);
            this.A00 = (C36171nS) r2.Agc.get();
        }
    }

    public void onBackPressed() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A01);
        try {
            String stringExtra = getIntent().getStringExtra("notificationJSONObject");
            if (stringExtra != null) {
                C140056zs r0 = new C140056zs(C17880vN.A16(stringExtra));
                C36171nS r4 = this.A00;
                if (r4 != null) {
                    Integer A0j = C17880vN.A0j();
                    Long valueOf = Long.valueOf(seconds);
                    C46922Gk r1 = new C46922Gk();
                    C36171nS.A01(r1, r0);
                    r1.A00 = C17880vN.A0h();
                    r1.A01 = A0j;
                    r1.A02 = A0j;
                    r1.A03 = valueOf;
                    C36171nS.A00(r1, r4);
                } else {
                    C18070vi.A11("smbSoftEnforcementLoggingUtil");
                    throw null;
                }
            }
        } catch (JSONException e) {
            Log.e("Error deserializing JSON String: notificationJSONObject", e);
        }
        super.onBackPressed();
    }

    public BusinessPolicyView(int i) {
        this.A02 = false;
        AGE.A00(this, 36);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = System.currentTimeMillis();
    }

    public BusinessPolicyView() {
        this(0);
    }
}
