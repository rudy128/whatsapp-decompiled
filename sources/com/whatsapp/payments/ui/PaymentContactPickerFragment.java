package com.whatsapp.payments.ui;

import X.A1K;
import X.ALX;
import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1FR;
import X.AnonymousClass1KB;
import X.AnonymousClass1KN;
import X.AnonymousClass1M9;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1UN;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6LQ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8FO;
import X.AnonymousClass8nF;
import X.AnonymousClass8pI;
import X.BD4;
import X.C003401n;
import X.C108945cZ;
import X.C121926Ma;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C187339fe;
import X.C196079uQ;
import X.C198179xu;
import X.C198769ys;
import X.C19962A0v;
import X.C20087A6p;
import X.C20337AGt;
import X.C20846AaO;
import X.C21432Ajz;
import X.C24751Ln;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaymentContactPickerFragment extends Hilt_PaymentContactPickerFragment {
    public AnonymousClass1QR A00;
    public C24751Ln A01;
    public ALX A02;
    public AnonymousClass1QO A03;
    public BD4 A04;
    public C19962A0v A05;
    public AnonymousClass8FO A06;
    public String A07;
    public PaymentIncentiveViewModel A08;
    public Map A09 = C17880vN.A11();

    public AnonymousClass6LQ A2B() {
        if (!C18020vd.A05(C18040vf.A02, this.A03.A02, 2026)) {
            return super.A2B();
        }
        AnonymousClass1M9 r2 = this.A0f;
        AnonymousClass1QS r6 = this.A1i;
        return new AnonymousClass8nF(r2, this, this.A00, this.A03, r6);
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

    public boolean A2v() {
        return false;
    }

    public boolean A2w() {
        return false;
    }

    public boolean A2y() {
        return true;
    }

    public static void A01(PaymentContactPickerFragment paymentContactPickerFragment) {
        if (paymentContactPickerFragment.A04 != null) {
            C20087A6p.A03(C20087A6p.A00(paymentContactPickerFragment.A16, (AnonymousClass1KN) null, paymentContactPickerFragment.A05, (String) null, false), paymentContactPickerFragment.A04, paymentContactPickerFragment.A33(), paymentContactPickerFragment.A07);
        }
    }

    public C121926Ma A2A() {
        if (!C18020vd.A05(C18040vf.A02, this.A03.A02, 2026)) {
            return super.A2A();
        }
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

    public String A2C(AnonymousClass1E7 r4) {
        AnonymousClass1QO r2 = this.A03;
        if (AnonymousClass1R2.A00(this.A01, AnonymousClass3MZ.A0x(r4), r2) != 2) {
            return A1H(2131888748);
        }
        return null;
    }

    public String A2D(AnonymousClass1E7 r4) {
        if (this instanceof IndiaUpiContactPickerFragment) {
            if (C18020vd.A05(C18040vf.A02, this.A1U, 3619) || A32(r4) != 2) {
                return null;
            }
            return A1H(2131893617);
        } else if (A32(r4) == 2) {
            return A1H(2131893921);
        } else {
            return null;
        }
    }

    public boolean A2m() {
        C19962A0v a0v = this.A05;
        if (a0v == null || a0v.A00(AnonymousClass11P.A00(this.A16)) != 1) {
            return false;
        }
        return true;
    }

    public boolean A2r() {
        if (this instanceof IndiaUpiContactPickerFragment) {
            return AnonymousClass000.A1W(AnonymousClass8BU.A0U(this.A1i).BWj());
        }
        if (!C18020vd.A05(C18040vf.A02, this.A1U, 544) || this.A1i.A06().BWj() == null) {
            return false;
        }
        return true;
    }

    public void A34(UserJid userJid) {
        Intent A002 = this.A02.A00(A1n(), false, false);
        A002.putExtra("referral_screen", this.A07);
        AnonymousClass3MY.A12(A002, userJid, "extra_jid");
        A35(userJid);
        A1k(A002);
        C72463Mc.A1A(this);
    }

    public void A35(UserJid userJid) {
        int i;
        Iterator it = this.A39.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 133;
                break;
            }
            AnonymousClass1BI A0l = C72453Mb.A0l(it);
            if (A0l != null && A0l.getRawString().equals(userJid.getRawString())) {
                i = 149;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        BD4 bd4 = this.A04;
        if (bd4 != null) {
            AnonymousClass8BU.A1C(bd4, valueOf, A33(), this.A07);
        }
    }

    public void A1y(Bundle bundle) {
        super.A1y(bundle);
        C003401n supportActionBar = this.A0r.A00.getSupportActionBar();
        C18070vi.A0d(this.A1U, 0);
        supportActionBar.A0M(2131892489);
        this.A07 = AnonymousClass8BR.A0y(A27());
        this.A06 = (AnonymousClass8FO) AnonymousClass3Ma.A0I(this).A00(AnonymousClass8FO.class);
        this.A04 = AnonymousClass8BT.A0U(this.A1i);
        if (AnonymousClass8BS.A1M(this.A1U)) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = (PaymentIncentiveViewModel) AnonymousClass3Ma.A0I(this).A00(PaymentIncentiveViewModel.class);
            this.A08 = paymentIncentiveViewModel;
            C198179xu.A00(paymentIncentiveViewModel.A01, paymentIncentiveViewModel.A06.A01(), (Throwable) null, 0);
            C20337AGt.A01(A1D(), this.A08.A01, this, 46);
            return;
        }
        A01(this);
    }

    public void A2R(Intent intent, AnonymousClass1E7 r16) {
        AnonymousClass1FL A1B;
        UserJid A0x = AnonymousClass3MZ.A0x(r16);
        if (AnonymousClass1R2.A00(this.A01, A0x, this.A03) == 2) {
            if (intent == null && (A1B = A1B()) != null) {
                A1B.getIntent();
            }
            AnonymousClass1KB r6 = this.A0S;
            AnonymousClass1QS r8 = this.A1i;
            A1K a1k = new A1K(A1B(), (AnonymousClass1FR) A1D(), r6, this.A01, r8, this.A06, new C21432Ajz(this, A0x, 37), new C21432Ajz(this, A0x, 38), true, false);
            if (a1k.A02()) {
                this.A0r.CNB(0, 2131895077);
                a1k.A01(A0x, new C20846AaO(this, 1), A33());
                return;
            }
            A34(A0x);
        }
    }

    public void A2f(List list) {
        HashMap A11 = C17880vN.A11();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8pI r1 = (AnonymousClass8pI) it.next();
            A11.put(r1.A03, r1);
        }
        this.A09 = A11;
    }

    public boolean A30(AnonymousClass1E7 r10) {
        C198769ys r0;
        UserJid A0x = AnonymousClass3MZ.A0x(r10);
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A08;
        if (paymentIncentiveViewModel == null) {
            return false;
        }
        Map map = this.A09;
        C19962A0v A012 = paymentIncentiveViewModel.A06.A01();
        C196079uQ A0O = AnonymousClass8BU.A0O(paymentIncentiveViewModel.A05);
        if (A0O == null) {
            return false;
        }
        C18030ve r2 = A0O.A07;
        if (C18020vd.A05(C18040vf.A02, r2, 979) || !PaymentIncentiveViewModel.A03(A0O, A012, paymentIncentiveViewModel)) {
            return false;
        }
        AnonymousClass8pI r1 = (AnonymousClass8pI) map.get(A0x);
        if (!AnonymousClass8BS.A1M(r2) || (r0 = A012.A01) == null || A0O.A01(r1, A0x, r0) != 1) {
            return false;
        }
        return true;
    }

    public int A32(AnonymousClass1E7 r5) {
        Jid A012 = AnonymousClass1E7.A01(r5);
        if (A012 != null) {
            AnonymousClass8pI r1 = (AnonymousClass8pI) this.A09.get(A012);
            C187339fe BWj = this.A1i.A06().BWj();
            if (!(r1 == null || BWj == null)) {
                return (int) ((AnonymousClass8pI.A01(r1).A00 >> 12) & 15);
            }
        }
        return 0;
    }

    public String A33() {
        return "payment_contact_picker";
    }
}
