package com.whatsapp;

import X.A8Q;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass79Z;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C114615rM;
import X.C114705rq;
import X.C114715rr;
import X.C114725rs;
import X.C143037Bt;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C30361do;
import X.C72453Mb;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public final class ShareCatalogLinkActivity extends C114615rM {
    public C19880zA A00;
    public AnonymousClass00H A01;
    public boolean A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7D, java.lang.Object] */
    public static final void A0Q(ShareCatalogLinkActivity shareCatalogLinkActivity, UserJid userJid, int i) {
        A8Q A4i = shareCatalogLinkActivity.A4i();
        ? obj = new Object();
        C109005cf.A0V(shareCatalogLinkActivity, obj);
        obj.A06 = 23;
        obj.A04 = Integer.valueOf(i);
        obj.A00 = userJid;
        A4i.A09(obj);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0Z(A0A);
            this.A00 = (A8Q) A0A.A1p.get();
            this.A02 = C000200d.A00(A0A.AAJ);
            this.A01 = AnonymousClass3MY.A0Z(A0A);
            this.A01 = AnonymousClass3MX.A11(A0A);
            this.A00 = (C19880zA) A0K.A5J.get();
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6547)) {
            AnonymousClass00H r0 = this.A01;
            if (r0 != null) {
                C18100vl r02 = C30361do.A0C;
                ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 41);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public ShareCatalogLinkActivity(int i) {
        this.A02 = false;
        AnonymousClass79Z.A00(this, 7);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A4f();
        C19880zA r1 = this.A00;
        if (r1 == null) {
            C18070vi.A11("smbEducationBannerHelper");
            throw null;
        } else if (r1.A07()) {
            r1.A03();
            AnonymousClass11P.A01(this.A05);
            throw AnonymousClass000.A0s("markRetired");
        } else {
            UserJid A04 = UserJid.Companion.A04(C72453Mb.A0u(this));
            C17960vV.A07(A04);
            C18070vi.A0X(A04);
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = "https://wa.me";
            A1b[1] = A04.user;
            String format = String.format("%s/c/%s", Arrays.copyOf(A1b, 2));
            C18070vi.A0X(format);
            setTitle(2131888015);
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(format);
            }
            View findViewById = findViewById(2131435368);
            C18070vi.A0z(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(2131888012);
            if (this.A02.A0O(A04)) {
                str = C17890vO.A0R(this, format, 1, 0, 2131888014);
            } else {
                str = format;
            }
            C18070vi.A0b(str);
            C114715rr A4e = A4e();
            A4e.A00 = str;
            A4e.A03 = new C143037Bt(this, A04, 0);
            if (C18020vd.A05(C18040vf.A02, this.A0E, 10843)) {
                setTitle(2131888016);
                A0Q(this, A04, 95);
                A4j(new C143037Bt(this, A04, 1), C108955ca.A0j(), str, 46);
            }
            C114705rq A4c = A4c();
            A4c.A00 = format;
            A4c.A03 = new C143037Bt(this, A04, 2);
            C114725rs A4d = A4d();
            A4d.A02 = str;
            A4d.A00 = getString(2131899418);
            A4d.A01 = getString(2131888013);
            A4d.A03 = new C143037Bt(this, A04, 3);
        }
    }

    public ShareCatalogLinkActivity() {
        this(0);
    }
}
