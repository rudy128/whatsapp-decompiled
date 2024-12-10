package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K3;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass444;
import X.AnonymousClass5OY;
import X.C103245Jo;
import X.C103255Jp;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C34001jj;
import X.C36401np;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C87314Vc;
import X.C87524Vx;
import X.C89494cY;
import X.C90024dP;
import X.C91024f1;
import android.content.Intent;
import android.os.Bundle;

public final class NewsletterGeosuspensionInfoActivity extends AnonymousClass1FY {
    public AnonymousClass1K3 A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;

    public NewsletterGeosuspensionInfoActivity() {
        this(0);
        this.A06 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5OY(this));
        this.A05 = AnonymousClass1DF.A01(new C103245Jo(this));
        this.A07 = AnonymousClass1DF.A01(new C103255Jp(this));
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        setResult(-1);
        Object A002 = C87314Vc.A00(intent, AnonymousClass444.class, "arg_enforcement");
        C17960vV.A07(A002);
        C18070vi.A0X(A002);
        C89494cY r2 = (C89494cY) A002;
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            r0.get();
            C72473Md.A0r(this, r2, this.A06);
            C90024dP.A00(C72463Mc.A0N(AnonymousClass3MX.A0v(this.A07)), this, r2, 2);
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MX.A10(A0L);
            this.A00 = AnonymousClass3Ma.A0v(A0L);
            this.A01 = AnonymousClass3MY.A0e(r1);
            this.A03 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131888099);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624088);
        AnonymousClass1K3 r2 = this.A00;
        if (r2 != null) {
            C18000vb r1 = this.A00;
            C18100vl r3 = this.A05;
            String A032 = r2.A03(r1, ((AnonymousClass444) r3.getValue()).A04);
            if (A032 == null) {
                A032 = ((AnonymousClass444) r3.getValue()).A04;
            }
            C18070vi.A0b(A032);
            C17880vN.A0E(this.A00, 2131431388).setText(C72473Md.A0j(this, A032, 2131890759));
            AnonymousClass3MX.A0I(this, 2131433007).setImageResource(2131233658);
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            C89494cY r0 = (C89494cY) r3.getValue();
            C18070vi.A0X(r0);
            C87524Vx.A01(A0H, r0);
            C90024dP.A00(C72463Mc.A0N(AnonymousClass3MX.A0v(this.A07)), this, AnonymousClass3MX.A14(r3), 2);
            return;
        }
        C18070vi.A11("countryUtils");
        throw null;
    }

    public NewsletterGeosuspensionInfoActivity(int i) {
        this.A04 = false;
        C91024f1.A00(this, 23);
    }
}
