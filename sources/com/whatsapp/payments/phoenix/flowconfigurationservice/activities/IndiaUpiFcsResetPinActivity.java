package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AGC;
import X.AGI;
import X.AnonymousClass000;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KH;
import X.AnonymousClass2XZ;
import X.AnonymousClass3MY;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8pN;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.AnonymousClass9YE;
import X.C137116uw;
import X.C1406772n;
import X.C17890vO;
import X.C18070vi;
import X.C189549jQ;
import X.C20284AEs;
import X.C63662tU;
import X.C63932tv;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;

public final class IndiaUpiFcsResetPinActivity extends AnonymousClass91T {
    public AnonymousClass2XZ A00;
    public C189549jQ A01;
    public String A02;
    public AnonymousClass9YE A03;
    public boolean A04;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            this.A00 = (AnonymousClass2XZ) A002.A3A.get();
            this.A01 = AnonymousClass8BV.A0H(r2);
        }
    }

    public IndiaUpiFcsResetPinActivity(int i) {
        this.A04 = false;
        AGC.A00(this, 11);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass9YE r0 = new AnonymousClass9YE(this);
            this.A03 = r0;
            if (bundle != null) {
                Activity activity = (Activity) r0.A00.get();
                if (activity != null) {
                    activity.finish();
                }
                C17890vO.A19(AnonymousClass91U.A1M(this), ": Activity cannot be launch because it is no longer safe to create this activity");
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
            if (stringExtra != null) {
                this.A02 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_credential_id");
                if (stringExtra2 != null) {
                    C20284AEs A012 = AnonymousClass1KH.A01(stringExtra2, AnonymousClass8BU.A0t(this.A0Q));
                    if (A012 != null) {
                        boolean A1a = AnonymousClass3MY.A1a(getIntent(), "extra_is_forget_pin");
                        AnonymousClass02n CDw = CDw(new AGI((Object) this, 12), new Object());
                        Intent A032 = IndiaUpiPinPrimerFullSheetActivity.A03(this, (AnonymousClass8pN) A012, this.A0b, A1a);
                        C18070vi.A0b(A032);
                        CDw.A02((C1406772n) null, A032);
                        return;
                    }
                    throw AnonymousClass000.A0s(AnonymousClass000.A0y(": Payment method does not exist with credential ID", AnonymousClass91U.A1M(this)));
                }
                throw AnonymousClass000.A0s(AnonymousClass000.A0y(": Credential ID is null", AnonymousClass91U.A1M(this)));
            }
            throw AnonymousClass000.A0s(AnonymousClass000.A0y(": FDS Manager ID is null", AnonymousClass91U.A1M(this)));
        }
        C18070vi.A11("fcsActivityLifecycleManagerFactory");
        throw null;
    }

    public IndiaUpiFcsResetPinActivity() {
        this(0);
    }
}
