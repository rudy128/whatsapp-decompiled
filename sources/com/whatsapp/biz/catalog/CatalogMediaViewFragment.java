package com.whatsapp.biz.catalog;

import X.A1M;
import X.A8Q;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass745;
import X.AnonymousClass7JW;
import X.C122076Mr;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C20005A2v;
import X.C20287AEv;
import X.C219217x;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

public final class CatalogMediaViewFragment extends Hilt_CatalogMediaViewFragment {
    public int A00;
    public AnonymousClass1L9 A01;
    public AnonymousClass190 A02;
    public AnonymousClass1KB A03;
    public C20287AEv A04;
    public A8Q A05;
    public C20005A2v A06;
    public AnonymousClass11C A07;
    public AnonymousClass118 A08;
    public C219217x A09;
    public C18030ve A0A;
    public UserJid A0B;
    public AnonymousClass10I A0C;
    public C122076Mr A0D;
    public AnonymousClass00H A0E;
    public String A0F;
    public HashMap A0G;
    public boolean A0H = true;

    public void A21(Bundle bundle, View view) {
        Bundle bundle2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (bundle == null) {
            C20287AEv aEv = this.A04;
            if (aEv == null) {
                C18070vi.A11("product");
                throw null;
            }
            this.A0F = A1M.A00(aEv.A0H, this.A00);
            AnonymousClass745 r2 = this.A0B;
            if (!(r2 == null || (bundle2 = this.A00) == null)) {
                this.A0F = true;
                r2.A0D(bundle2, this);
            }
        }
        this.A01.setVisibility(8);
        AnonymousClass1HF.A06(view, 2131436230).setClickable(false);
    }

    public void A1r() {
        C20005A2v a2v = this.A06;
        if (a2v != null) {
            a2v.A02();
            super.A1r();
            return;
        }
        C18070vi.A11("loadSession");
        throw null;
    }

    public void A1t() {
        super.A1t();
        C122076Mr r0 = this.A0D;
        if (r0 != null) {
            r0.A0F();
        }
        C122076Mr r02 = this.A0D;
        if (r02 != null) {
            r02.A0H();
        }
    }

    public void A1u() {
        super.A1u();
        C122076Mr r0 = this.A0D;
        if (r0 != null) {
            r0.A0G();
        }
        C122076Mr r02 = this.A0D;
        if (r02 != null) {
            r02.A0I();
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A0B = UserJid.Companion.A04(bundle2.getString("cached_jid"));
            Parcelable parcelable = bundle2.getParcelable("product");
            if (parcelable != null) {
                this.A04 = (C20287AEv) parcelable;
                this.A00 = bundle2.getInt("target_image_index", 0);
                this.A0G = C17880vN.A11();
                A2I(new AnonymousClass7JW(this));
                this.A09.A0J(this.A00, false);
                return;
            }
            throw C17890vO.A0K();
        }
    }
}
