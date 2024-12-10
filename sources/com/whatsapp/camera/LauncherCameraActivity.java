package com.whatsapp.camera;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aJ;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C108975cc;
import X.C109005cf;
import X.C17880vN;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class LauncherCameraActivity extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(A0A);
        }
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("jid");
        String stringExtra2 = getIntent().getStringExtra("quoted_group_jid");
        int intExtra = getIntent().getIntExtra("include", -1);
        int intExtra2 = getIntent().getIntExtra("max_items", -1);
        ArrayList A03 = AnonymousClass4aJ.A03(getIntent().getStringExtra("mentions"));
        if (this.A00 != null) {
            long A06 = C108975cc.A06(getIntent(), "quoted_message_row_id");
            AnonymousClass1BI A0l = AnonymousClass3MX.A0l(stringExtra);
            Integer num = null;
            if (intExtra <= -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(intExtra);
            }
            if (intExtra2 > -1) {
                num = Integer.valueOf(intExtra2);
            }
            boolean A1a = AnonymousClass3MY.A1a(getIntent(), "chat_opened_from_url");
            String stringExtra3 = getIntent().getStringExtra("android.intent.extra.TEXT");
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(getPackageName(), "com.whatsapp.camera.CameraActivity");
            AnonymousClass3MY.A13(A0A, A0l, "jid");
            if (num != null) {
                A0A.putExtra("max_items", num);
            }
            A0A.putExtra("camera_origin", 8);
            A0A.putExtra("media_sharing_user_journey_origin", 39);
            A0A.putExtra("media_sharing_user_journey_start_target", 68);
            A0A.putExtra("enable_qr_scan", true);
            A0A.putExtra("quoted_message_row_id", A06);
            A0A.putExtra("quoted_group_jid", stringExtra2);
            A0A.putExtra("chat_opened_from_url", A1a);
            A0A.putExtra("android.intent.extra.TEXT", stringExtra3);
            A0A.putExtra("mentions", AnonymousClass4aJ.A01(A03));
            if (valueOf != null) {
                A0A.putExtra("include", valueOf);
            }
            startActivity(A0A);
            finish();
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public LauncherCameraActivity(int i) {
        this.A01 = false;
        AnonymousClass79Z.A00(this, 30);
    }

    public LauncherCameraActivity() {
        this(0);
    }
}
