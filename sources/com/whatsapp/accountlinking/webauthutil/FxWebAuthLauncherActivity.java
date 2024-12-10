package com.whatsapp.accountlinking.webauthutil;

import X.AGB;
import X.ALS;
import X.AnonymousClass009;
import X.AnonymousClass01E;
import X.AnonymousClass040;
import X.AnonymousClass2CH;
import X.AnonymousClass6YE;
import X.AnonymousClass86X;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C178149Bz;
import X.C17880vN;
import X.C18070vi;
import X.C20000A2o;
import X.C20046A4p;
import X.C24051Ir;
import X.C25974Cph;
import X.E8A;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class FxWebAuthLauncherActivity extends AnonymousClass01E implements AnonymousClass009 {
    public C20000A2o A00;
    public C006302u A01;
    public boolean A02;
    public AnonymousClass86X A03;
    public Object A04;
    public boolean A05;
    public final Object A06;
    public volatile C006002q A07;

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activityLaunched", this.A05);
    }

    public final C006002q A2x() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new C006002q(this);
                }
            }
        }
        return this.A07;
    }

    public FxWebAuthLauncherActivity(int i) {
        this.A06 = C17880vN.A0p();
        this.A02 = false;
        AGB.A00(this, 5);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2x().generatedComponent();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        String str;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 2884) {
            E8A e8a = null;
            if (intent == null || (stringExtra = intent.getStringExtra("webview_callback")) == null || stringExtra.length() == 0) {
                uri = null;
            } else {
                uri = Uri.parse(stringExtra);
            }
            Object obj = this.A04;
            AnonymousClass86X r0 = this.A03;
            if (r0 != null) {
                e8a = r0.BM3();
            }
            C25974Cph cph = new C25974Cph(ALS.A06(obj));
            C20046A4p a4p = new C20046A4p();
            if (i2 != -1 || uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            cph.A02(C20046A4p.A00(a4p, str, 0), e8a);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2x().A00();
            this.A01 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        if (bundle != null) {
            this.A05 = bundle.getBoolean("activityLaunched");
        }
        C20000A2o a2o = this.A00;
        if (a2o != null) {
            this.A04 = a2o.A01(C178149Bz.A00("environment"), "webAuth", 0);
            C20000A2o a2o2 = this.A00;
            if (a2o2 != null) {
                AnonymousClass86X r1 = (AnonymousClass86X) a2o2.A01(C178149Bz.A00("callback"), "webAuth", 0);
                this.A03 = r1;
                if (this.A05 || this.A04 == null || r1 == null) {
                    finish();
                    return;
                }
                this.A05 = true;
                String stringExtra = getIntent().getStringExtra("initialUrl");
                String stringExtra2 = getIntent().getStringExtra("callbackUrlScheme");
                C18070vi.A0Z(AnonymousClass2CH.A01);
                AnonymousClass6YE.A00(this, stringExtra2, stringExtra, 2884, true);
                return;
            }
            C18070vi.A11("bkCache");
            throw null;
        }
        C18070vi.A11("bkCache");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A01);
        if (isFinishing()) {
            C20000A2o a2o = this.A00;
            if (a2o != null) {
                a2o.A05(C178149Bz.A00("environment"), "webAuth");
                C20000A2o a2o2 = this.A00;
                if (a2o2 != null) {
                    a2o2.A05(C178149Bz.A00("callback"), "webAuth");
                    return;
                }
            }
            C18070vi.A11("bkCache");
            throw null;
        }
    }

    public FxWebAuthLauncherActivity() {
        this(0);
    }
}
