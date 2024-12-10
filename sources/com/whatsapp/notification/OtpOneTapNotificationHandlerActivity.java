package com.whatsapp.notification;

import X.AGC;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass040;
import X.AnonymousClass10I;
import X.AnonymousClass1KB;
import X.AnonymousClass7Pq;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C17880vN;
import X.C18070vi;
import X.C24051Ir;
import X.C32791hl;
import android.os.Bundle;

public final class OtpOneTapNotificationHandlerActivity extends AnonymousClass01E implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public C32791hl A01;
    public AnonymousClass10I A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public C006302u A05;
    public boolean A06;
    public final Object A07;
    public volatile C006002q A08;

    public final C006002q A2x() {
        if (this.A08 == null) {
            synchronized (this.A07) {
                if (this.A08 == null) {
                    this.A08 = new C006002q(this);
                }
            }
        }
        return this.A08;
    }

    public OtpOneTapNotificationHandlerActivity(int i) {
        this.A07 = C17880vN.A0p();
        this.A06 = false;
        AGC.A00(this, 7);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2x().generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2x().A00();
            this.A05 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        String stringExtra = getIntent().getStringExtra("extra_remote_jid");
        String stringExtra2 = getIntent().getStringExtra("extra_message_key_id");
        if (stringExtra != null && stringExtra2 != null) {
            AnonymousClass10I r2 = this.A02;
            if (r2 != null) {
                r2.CGF(new AnonymousClass7Pq(this, stringExtra, stringExtra2, 14));
                finish();
                return;
            }
            C18070vi.A11("waWorkers");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A05);
    }

    public OtpOneTapNotificationHandlerActivity() {
        this(0);
    }
}
