package com.whatsapp.product.newsletterenforcements.profilepicturedeletion;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass5KE;
import X.AnonymousClass5KF;
import X.C104495Oj;
import X.C17880vN;
import X.C17960vV;
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

public final class NewsletterProfilePictureDeletionInfoActivity extends AnonymousClass1FY {
    public C36401np A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;

    public NewsletterProfilePictureDeletionInfoActivity() {
        this(0);
        this.A05 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C104495Oj(this));
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5KE(this));
        this.A06 = AnonymousClass1DF.A01(new AnonymousClass5KF(this));
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        setResult(-1);
        Object A002 = C87314Vc.A00(intent, C89494cY.class, "appeal_data");
        C17960vV.A07(A002);
        C18070vi.A0X(A002);
        C89494cY r2 = (C89494cY) A002;
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            r0.get();
            C72473Md.A0r(this, r2, this.A05);
            C90024dP.A00(AnonymousClass3MY.A0I(AnonymousClass3MX.A0v(this.A06), 0), this, r2, 7);
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass3MX.A10(A0L);
            this.A00 = AnonymousClass3MY.A0e(r1);
            this.A02 = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131888099);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624088);
        C17880vN.A0E(this.A00, 2131431388).setText(2131892755);
        AnonymousClass3MX.A0I(this, 2131433007).setImageResource(2131233658);
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        C18100vl r1 = this.A04;
        C87524Vx.A01(A0H, (C89494cY) r1.getValue());
        C90024dP.A00(C72463Mc.A0N(AnonymousClass3MX.A0v(this.A06)), this, r1.getValue(), 7);
    }

    public NewsletterProfilePictureDeletionInfoActivity(int i) {
        this.A03 = false;
        C91024f1.A00(this, 27);
    }
}
