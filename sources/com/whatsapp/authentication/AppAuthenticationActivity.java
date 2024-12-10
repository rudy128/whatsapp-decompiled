package com.whatsapp.authentication;

import X.AnonymousClass00H;
import X.AnonymousClass0IT;
import X.AnonymousClass0Q0;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1FW;
import X.AnonymousClass1XL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3S2;
import X.C000200d;
import X.C03320Hp;
import X.C17880vN;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19740yt;
import X.C28721an;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.util.Log;

public final class AppAuthenticationActivity extends AnonymousClass1FU implements AnonymousClass1FW {
    public int A00;
    public C03320Hp A01;
    public AnonymousClass0Q0 A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public int A05;
    public boolean A06;

    public AppAuthenticationActivity() {
        this(0);
        this.A00 = 1;
    }

    public static /* synthetic */ void A0V(AppAuthenticationActivity appAuthenticationActivity) {
        AnonymousClass0Q0 r0;
        appAuthenticationActivity.A00 = 2;
        C03320Hp r1 = appAuthenticationActivity.A01;
        if (r1 != null && (r0 = appAuthenticationActivity.A02) != null) {
            AnonymousClass0Q0.A04(r1, r0);
        }
    }

    /* access modifiers changed from: private */
    public final void A0Q() {
        if (this.A05 != 0) {
            AnonymousClass00H r0 = this.A04;
            if (r0 != null) {
                ((C28721an) r0.get()).A01();
                Intent A0A = C17880vN.A0A();
                A0A.putExtra("appWidgetId", this.A05);
                setResult(-1, A0A);
                return;
            }
            C18070vi.A11("widgetUpdaterLazy");
            throw null;
        }
        setResult(-1);
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            C72453Mb.A1K(r1, this);
            this.A03 = C000200d.A00(A0L.A0J);
            this.A04 = C000200d.A00(A0L.AC2);
        }
    }

    public final AnonymousClass00H A48() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("appAuthManagerLazy");
        throw null;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onBackPressed() {
        ActivityManager A042 = this.A08.A04();
        if (A042 == null || A042.getLockTaskModeState() != 2) {
            setResult(0);
            finishAffinity();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A09 = AnonymousClass3MY.A09(this);
        if (A09 != null) {
            this.A05 = A09.getInt("appWidgetId", 0);
        }
        if (!((AnonymousClass1XL) A48().get()).A04()) {
            Log.i("AppAuthenticationActivity/onCreate: setting not enabled");
            A0Q();
            finish();
            overridePendingTransition(0, 17432577);
            return;
        }
        setContentView(2131624016);
        AnonymousClass3MX.A0L(this, 2131427912).setText(2131886673);
        View findViewById = findViewById(2131427814);
        findViewById.setVisibility(0);
        this.A02 = new AnonymousClass0Q0(new AnonymousClass3S2(this, 1), this, C19740yt.A08(this));
        AnonymousClass0IT r1 = new AnonymousClass0IT();
        r1.A03 = getString(2131886679);
        r1.A00 = 33023;
        r1.A04 = false;
        this.A01 = r1.A00();
        AnonymousClass3MZ.A1J(findViewById, this, 3);
    }

    public void onPause() {
        super.onPause();
        if (this.A00 == 3) {
            this.A00 = 1;
            AnonymousClass0Q0 r0 = this.A02;
            if (r0 != null) {
                r0.A05();
            }
        }
    }

    public void onStart() {
        AnonymousClass0Q0 r0;
        super.onStart();
        if (!((AnonymousClass1XL) A48().get()).A03()) {
            Log.i("AppAuthenticationActivity/not-enrolled");
            C72453Mb.A14(this);
        } else if (this.A00 == 1) {
            this.A00 = 2;
            C03320Hp r1 = this.A01;
            if (r1 != null && (r0 = this.A02) != null) {
                AnonymousClass0Q0.A04(r1, r0);
            }
        }
    }

    public AppAuthenticationActivity(int i) {
        this.A06 = false;
        C90994ey.A00(this, 7);
    }
}
