package com.whatsapp;

import X.A7D;
import X.A8Q;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass17K;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
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
import X.C143047Bu;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C20114A7x;
import X.C20287AEv;
import X.C30361do;
import X.C72453Mb;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

public final class ShareProductLinkActivity extends C114615rM {
    public AnonymousClass00H A00;
    public ShareProductViewModel A01;
    public boolean A02;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.A7D, java.lang.Object] */
    public static final A7D A0Q(ShareProductLinkActivity shareProductLinkActivity, UserJid userJid, String str, int i, int i2) {
        Boolean bool;
        ? obj = new Object();
        C109005cf.A0V(shareProductLinkActivity, obj);
        obj.A06 = Integer.valueOf(i);
        obj.A04 = Integer.valueOf(i2);
        ShareProductViewModel shareProductViewModel = shareProductLinkActivity.A01;
        if (shareProductViewModel == null) {
            C18070vi.A11("shareProductViewModel");
            throw null;
        }
        C20287AEv A0A = ((C20114A7x) shareProductViewModel.A00.get()).A0A((UserJid) null, str);
        if (A0A != null) {
            bool = Boolean.valueOf(AnonymousClass000.A1W(A0A.A05));
        } else {
            bool = null;
        }
        obj.A04(bool);
        obj.A0H = str;
        obj.A00 = userJid;
        return obj;
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0Z(A0A);
            this.A00 = (A8Q) A0A.A1p.get();
            this.A02 = C000200d.A00(A0A.AAJ);
            this.A01 = AnonymousClass3MY.A0Z(A0A);
            this.A00 = AnonymousClass3MX.A11(A0A);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6547)) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                C18100vl r02 = C30361do.A0C;
                ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 42);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public ShareProductLinkActivity(int i) {
        this.A02 = false;
        AnonymousClass79Z.A00(this, 9);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A4f();
        UserJid A04 = UserJid.Companion.A04(C72453Mb.A0u(this));
        C17960vV.A07(A04);
        C18070vi.A0X(A04);
        if (!(A04 instanceof PhoneUserJid)) {
            Log.e("share-product-link-activity/invalid-jid");
            finish();
            return;
        }
        this.A01 = (ShareProductViewModel) AnonymousClass3MW.A0N(this).A00(ShareProductViewModel.class);
        String stringExtra = getIntent().getStringExtra("product_id");
        C17960vV.A07(stringExtra);
        C18070vi.A0X(stringExtra);
        String format = String.format("%s/p/%s/%s", Arrays.copyOf(new Object[]{"https://wa.me", stringExtra, AnonymousClass17K.A04(A04)}, 3));
        C18070vi.A0X(format);
        setTitle(2131894795);
        TextView textView = this.A01;
        if (textView != null) {
            textView.setText(format);
        }
        AnonymousClass3MX.A0L(this, 2131435368).setText(2131894791);
        if (this.A02.A0O(A04)) {
            str = C17890vO.A0R(this, format, 1, 0, 2131894793);
        } else {
            str = format;
        }
        C18070vi.A0b(str);
        C114715rr A4e = A4e();
        A4e.A00 = str;
        A4e.A03 = new C143047Bu(this, A04, stringExtra, 0);
        if (C18020vd.A05(C18040vf.A02, this.A0E, 10844)) {
            setTitle(2131894796);
            A4i().A09(A0Q(this, A04, stringExtra, 23, 93));
            A4j(new C143047Bu(this, A04, stringExtra, 1), 33, str, 47);
        }
        C114705rq A4c = A4c();
        A4c.A00 = format;
        A4c.A03 = new C143047Bu(this, A04, stringExtra, 2);
        C114725rs A4d = A4d();
        A4d.A02 = str;
        A4d.A00 = getString(2131899418);
        A4d.A01 = getString(2131894792);
        A4d.A03 = new C143047Bu(this, A04, stringExtra, 3);
    }

    public ShareProductLinkActivity() {
        this(0);
    }
}
