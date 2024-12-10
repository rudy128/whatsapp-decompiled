package com.whatsapp.payments.ui;

import X.ALX;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1UN;
import X.AnonymousClass3MY;
import X.AnonymousClass6LQ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8nE;
import X.AnonymousClass8nG;
import X.BD4;
import X.C108945cZ;
import X.C121926Ma;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C192479oS;
import X.C198369yE;
import X.C20112A7u;
import X.C26021Qn;
import X.C60392nx;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndiaPaymentMerchantContactPickerFragment extends Hilt_IndiaPaymentMerchantContactPickerFragment {
    public C26021Qn A00;
    public AnonymousClass1QR A01;
    public AnonymousClass1LU A02;
    public ALX A03;
    public AnonymousClass1QO A04;
    public C192479oS A05;
    public BD4 A06;
    public C198369yE A07;
    public String A08;

    public AnonymousClass6LQ A2B() {
        C198369yE r1 = new C198369yE(this.A1U);
        this.A07 = r1;
        if (!r1.A02) {
            return new AnonymousClass8nE(this.A0f, this, this.A00);
        }
        AnonymousClass1M9 r4 = this.A0f;
        List list = r1.A00;
        AnonymousClass1OZ A0U = C17880vN.A0U(this.A2d);
        return new AnonymousClass8nG(this.A0e, r4, this, this.A0z, A0U, list);
    }

    public boolean A2i() {
        return false;
    }

    public boolean A2j() {
        return false;
    }

    public boolean A2k() {
        return false;
    }

    public boolean A2l() {
        return false;
    }

    public boolean A2s() {
        return true;
    }

    public boolean A2v() {
        return false;
    }

    public boolean A2w() {
        return false;
    }

    public boolean A2y() {
        return true;
    }

    public C121926Ma A2A() {
        String A1F = C108945cZ.A1F(this.A49);
        ArrayList arrayList = this.A32;
        List list = this.A35;
        List list2 = this.A39;
        List list3 = this.A4F;
        Set set = this.A4H;
        HashSet hashSet = this.A4D;
        C18030ve r8 = this.A1U;
        AnonymousClass11S r1 = this.A0T;
        C18000vb r6 = this.A19;
        return new C121926Ma(r1, this.A0f, this.A0j, this.A0k, this, r6, (AnonymousClass1UN) null, r8, A1F, hashSet, arrayList, list, list2, list3, set);
    }

    public void A1y(Bundle bundle) {
        super.A1y(bundle);
        this.A0r.A00.getSupportActionBar().A0M(2131892029);
        this.A08 = AnonymousClass8BR.A0y(A27());
        this.A06 = AnonymousClass8BU.A0U(this.A1i).BRb();
    }

    public void A2R(Intent intent, AnonymousClass1E7 r9) {
        if (A1B() != null) {
            if (this.A06 != null) {
                C20112A7u A022 = C20112A7u.A02();
                A022.A07("merchant_name", r9.A0L());
                this.A06.BiM(A022, 187, "merchants_screen", this.A08, 1);
            }
            Intent A062 = AnonymousClass3MY.A06(A1B(), this.A02, r9.A0J);
            AnonymousClass1FL A1B = A1B();
            A062.putExtra("share_msg", "Hi");
            A062.putExtra("confirm", true);
            A062.putExtra("has_share", true);
            C60392nx.A00(A1B, A062);
            A1k(A062);
        }
    }
}
