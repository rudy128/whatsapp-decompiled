package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4FY;
import X.AnonymousClass4bB;
import X.AnonymousClass5I4;
import X.C000200d;
import X.C105665Sw;
import X.C105675Sx;
import X.C105685Sy;
import X.C105695Sz;
import X.C146597Pw;
import X.C18070vi;
import X.C18100vl;
import X.C28401aA;
import X.C35541mP;
import X.C36401np;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C83844Gw;
import X.C91014f0;
import X.C91374fa;
import X.C91644g1;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.Log;

public final class SupportAiActivity extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public C28401aA A01;
    public C36401np A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public final C18100vl A05;

    public SupportAiActivity() {
        this(0);
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5I4(this));
    }

    public static final void A0Q(Bundle bundle, SupportAiActivity supportAiActivity) {
        C18070vi.A0d(bundle, 2);
        if (bundle.getBoolean("start_chat")) {
            Parcelable parcelableExtra = supportAiActivity.getIntent().getParcelableExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext");
            SupportAiViewModel supportAiViewModel = (SupportAiViewModel) supportAiActivity.A05.getValue();
            String A0x = C72453Mb.A0x(supportAiActivity.getIntent(), "com.whatsapp.inappsupport.ui.SupportAiActivity.from");
            String stringExtra = supportAiActivity.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.suspendedEntityJid");
            AnonymousClass3MY.A1L(supportAiViewModel.A03, true);
            supportAiViewModel.A0C.CGF(new C146597Pw(supportAiViewModel, parcelableExtra, A0x, stringExtra, 5));
        } else if (bundle.getBoolean("no_internet")) {
            supportAiActivity.A03();
        } else {
            supportAiActivity.finish();
        }
    }

    private final void A03() {
        Log.i("SupportAiNuxBottomSheet/continueButton/no-connectivity");
        AnonymousClass3MY.A1H(AnonymousClass4FY.A00(new AnonymousClass4bB(this, 17), (DialogInterface.OnClickListener) null, (CharSequence) null, new Object[0], new Object[0], -1, 2131892046, 2131899286, 0, 2131896924), this, (String) null);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            ((C35541mP) C18070vi.A0E(r0)).A02(6, (String) null);
        } else {
            C18070vi.A11("supportLogger");
            throw null;
        }
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0e(r1);
            this.A01 = (C28401aA) A0L.A7b.get();
            this.A03 = C000200d.A00(A0L.AkJ);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18100vl r3 = this.A05;
        C91644g1.A00(this, ((SupportAiViewModel) r3.getValue()).A03, new C105675Sx(this), 37);
        C91644g1.A00(this, ((SupportAiViewModel) r3.getValue()).A02, new C105685Sy(this), 37);
        C91644g1.A00(this, ((SupportAiViewModel) r3.getValue()).A0B, new C105695Sz(this), 37);
        C91644g1.A00(this, ((SupportAiViewModel) r3.getValue()).A0A, new C105665Sw(this), 37);
        C28401aA r2 = this.A01;
        if (r2 == null) {
            C18070vi.A11("nuxManager");
            throw null;
        } else if (!r2.A01((Object) null, "support_ai")) {
            CMl(C83844Gw.A00(false, false));
            getSupportFragmentManager().A0t(new C91374fa(this, 25), this, "request_start_chat");
        } else if (!AnonymousClass3MW.A1Y(this)) {
            Log.i("saga_v1_test/no-connectivity");
            A03();
        } else {
            SupportAiViewModel supportAiViewModel = (SupportAiViewModel) r3.getValue();
            Parcelable parcelableExtra = getIntent().getParcelableExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext");
            String A0x = C72453Mb.A0x(getIntent(), "com.whatsapp.inappsupport.ui.SupportAiActivity.from");
            String stringExtra = getIntent().getStringExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.suspendedEntityJid");
            AnonymousClass3MY.A1L(supportAiViewModel.A03, true);
            supportAiViewModel.A0C.CGF(new C146597Pw(supportAiViewModel, parcelableExtra, A0x, stringExtra, 5));
        }
    }

    public SupportAiActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 24);
    }
}
