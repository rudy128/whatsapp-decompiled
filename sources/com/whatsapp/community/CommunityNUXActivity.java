package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass17C;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.C000200d;
import X.C110885hR;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C221618v;
import X.C28401aA;
import X.C36401np;
import X.C40371ub;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C89894dC;
import X.C90994ey;
import X.C98754rf;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CommunityNUXActivity extends AnonymousClass1FY {
    public C18000vb A00;
    public AnonymousClass1LU A01;
    public C28401aA A02;
    public AnonymousClass129 A03;
    public C36401np A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09;

    public CommunityNUXActivity() {
        this(0);
        this.A05 = C221618v.A00(AnonymousClass17C.class);
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A04 = AnonymousClass3MY.A0e(r1);
            this.A01 = AnonymousClass3MY.A0Z(A0L);
            this.A02 = (C28401aA) A0L.A7b.get();
            this.A03 = AnonymousClass3Ma.A0t(A0L);
            this.A00 = AnonymousClass10E.A6Q(A0L);
            this.A06 = C000200d.A00(A0L.A2M);
            this.A07 = C000200d.A00(A0L.A2P);
            this.A08 = AnonymousClass3MX.A10(A0L);
        }
    }

    public /* synthetic */ void A4b() {
        AnonymousClass00H r0 = this.A05;
        String A0o = C72463Mc.A0o(r0);
        ((C40371ub) this.A07.get()).A0E(AnonymousClass3MY.A0j(r0), A0o, 3, 3);
        super.onBackPressed();
    }

    public void onBackPressed() {
        AnonymousClass00H r0 = this.A05;
        String A0o = C72463Mc.A0o(r0);
        ((C40371ub) this.A07.get()).A0E(AnonymousClass3MY.A0j(r0), A0o, 8, 3);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02.A00("community", (Object) null);
        setContentView(2131624037);
        C89894dC.A00(C110885hR.A0A(this, 2131429278), this, 10);
        C89894dC.A00(C110885hR.A0A(this, 2131429276), this, 11);
        if (C18020vd.A05(C18040vf.A02, this.A0E, 2356)) {
            TextView A0I = AnonymousClass3MW.A0I(this, 2131429277);
            String A0q = C17880vN.A0q(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131888547);
            A0I.setText(this.A04.A06(A0I.getContext(), new C98754rf(this, 11), A0q, "learn-more", C72473Md.A05(A0I)));
            AnonymousClass3Ma.A1I(A0I, this.A0E);
            AnonymousClass3MZ.A1Q(A0I, this.A08);
            A0I.setVisibility(0);
        }
        C110885hR.A0A(this, 2131435063);
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131435065);
        ImageView imageView = (ImageView) C110885hR.A0A(this, 2131435064);
        String A0q2 = C17880vN.A0q(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131888548);
        A0I2.setText(this.A04.A06(A0I2.getContext(), new C98754rf(this, 12), A0q2, "learn-more", C72473Md.A05(A0I2)));
        AnonymousClass3Ma.A1I(A0I2, this.A0E);
        AnonymousClass3MZ.A1Q(A0I2, this.A08);
        AnonymousClass3NL.A01(this, imageView, this.A00, 2131231229);
        C89894dC.A00(imageView, this, 12);
    }

    public CommunityNUXActivity(int i) {
        this.A09 = false;
        C90994ey.A00(this, 48);
    }
}
