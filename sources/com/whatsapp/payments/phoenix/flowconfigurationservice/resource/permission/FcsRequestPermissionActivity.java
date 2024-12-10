package com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass2XZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass74O;
import X.AnonymousClass9YE;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C1423279a;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C189549jQ;
import X.C20129A8p;
import X.C20130A8q;
import X.C219217x;
import X.C22579BDz;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

public final class FcsRequestPermissionActivity extends AnonymousClass1FY {
    public AnonymousClass2XZ A00;
    public C219217x A01;
    public AnonymousClass00H A02;
    public AnonymousClass9YE A03;
    public String A04;
    public boolean A05;
    public final Map A06;

    private final void A03() {
        String str;
        C20129A8p a8p;
        C22579BDz bDz;
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            C189549jQ r1 = (C189549jQ) r0.get();
            String str2 = this.A04;
            if (str2 == null) {
                str = "fdsManagerId";
            } else {
                C20130A8q A002 = r1.A00(str2);
                if (!(A002 == null || (a8p = A002.A00) == null || (bDz = (C22579BDz) a8p.A0A("request_permission")) == null)) {
                    bDz.BLG(this.A06);
                }
                finish();
                return;
            }
        } else {
            str = "fdsManagerRegistry";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = (AnonymousClass2XZ) A0K.A3A.get();
            this.A02 = C000200d.A00(A0A.ATO);
            this.A01 = AnonymousClass3Ma.A0b(A0A);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 153 || i == 155) {
            Map map = this.A06;
            if (i2 == -1) {
                str = "GRANTED";
            } else {
                str = "NOT_GRANTED";
            }
            map.put("permission_result", str);
            A03();
        }
        super.onActivityResult(i, i2, intent);
    }

    public FcsRequestPermissionActivity(int i) {
        this.A05 = false;
        C1423279a.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        String str;
        Integer num;
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass9YE r0 = new AnonymousClass9YE(this);
            this.A03 = r0;
            if (bundle != null) {
                Activity activity = (Activity) r0.A00.get();
                if (activity != null) {
                    activity.finish();
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(AnonymousClass3MW.A15(getClass()).BZJ());
                C17890vO.A19(A10, ": Activity cannot be launch because it is no longer save to create this activity");
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
            if (stringExtra != null) {
                this.A04 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_permission");
                if (stringExtra2 == null) {
                    this.A06.put("permission_result", "null_permission");
                    A03();
                    return;
                }
                if (stringExtra2.equals("PHONE_STATE")) {
                    num = AnonymousClass00R.A00;
                } else if (stringExtra2.equals("SMS_AND_TELEPHONE")) {
                    num = AnonymousClass00R.A01;
                } else {
                    throw AnonymousClass000.A0k(stringExtra2);
                }
                if (num.intValue() != 0) {
                    C219217x r02 = this.A01;
                    if (r02 != null) {
                        AnonymousClass74O.A0D(this, r02);
                        return;
                    }
                    str = "waPermissionsHelper";
                } else {
                    AnonymousClass74O.A06(this);
                    return;
                }
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(AnonymousClass3MW.A15(getClass()).BZJ());
                throw AnonymousClass000.A0s(AnonymousClass000.A0y("/onCreate: FDS Manager ID is null", A102));
            }
        } else {
            str = "fcsActivityLifecycleManagerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public FcsRequestPermissionActivity() {
        this(0);
        this.A06 = C17880vN.A13();
    }
}
