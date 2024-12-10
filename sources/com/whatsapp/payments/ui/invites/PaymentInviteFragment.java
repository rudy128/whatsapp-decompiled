package com.whatsapp.payments.ui.invites;

import X.AnonymousClass1FR;
import X.AnonymousClass3MX;
import X.AnonymousClass8FO;
import X.C171858sO;
import X.C17880vN;
import X.C191759n8;
import X.C33391ik;
import X.C94104k3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class PaymentInviteFragment extends Hilt_PaymentInviteFragment {
    public C33391ik A00;
    public C94104k3 A01;
    public AnonymousClass8FO A02;
    public String A03;
    public List A04;
    public boolean A05;
    public PaymentIncentiveViewModel A06;

    public static Bundle A02(String str, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("payment_service", 3);
        A0D.putParcelableArrayList("user_jids", arrayList);
        A0D.putBoolean("requires_sync", z);
        A0D.putString("referral_screen", str);
        A0D.putBoolean("show_incentive_blurb", z2);
        A0D.putBoolean("is_group_payment", z3);
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0072, code lost:
        if (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A03(X.AnonymousClass8BU.A0O(r6.A05), r6.A06.A01(), r6) == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            r2 = r13
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r2 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r2
            X.8sO r1 = new X.8sO
            r1.<init>()
            java.lang.String r0 = "payment_invite_prompt"
            r1.A0b = r0
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "chat"
        L_0x0012:
            r1.A0a = r0
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment.A00(r1, r2)
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r1.A08 = r0
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment.A00(r1, r2)
            X.AZ6 r0 = r2.A0C
            r0.BiH(r1)
            android.os.Bundle r4 = r13.A15()
            android.os.Bundle r3 = r13.A15()
            java.lang.String r0 = "user_jids"
            java.util.ArrayList r0 = r3.getParcelableArrayList(r0)
            X.C17960vV.A07(r0)
            r13.A04 = r0
            java.lang.String r0 = X.AnonymousClass8BR.A0y(r3)
            r13.A03 = r0
            java.lang.String r1 = "is_group_payment"
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            r13.A05 = r0
            X.1It r1 = X.AnonymousClass3Ma.A0I(r13)
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel> r0 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r0
            r13.A06 = r0
            java.lang.String r0 = "show_incentive_blurb"
            boolean r0 = r4.getBoolean(r0)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0074
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = r13.A06
            X.1ig r0 = r6.A06
            X.A0v r5 = r0.A01()
            X.1QS r0 = r6.A05
            X.9uQ r0 = X.AnonymousClass8BU.A0O(r0)
            boolean r0 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A03(r0, r5, r6)
            r12 = 1
            if (r0 != 0) goto L_0x0075
        L_0x0074:
            r12 = 0
        L_0x0075:
            X.0ve r10 = r2.A05
            X.1Vd r9 = r2.A03
            X.1M9 r6 = r2.A00
            X.1Me r8 = r2.A02
            X.1PM r7 = r2.A01
            java.lang.String r11 = r2.A03
            X.44N r5 = new X.44N
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r5
            X.1It r5 = X.AnonymousClass3Ma.A0I(r13)
            java.lang.Class<X.8FO> r0 = X.AnonymousClass8FO.class
            X.1J2 r0 = r5.A00(r0)
            X.8FO r0 = (X.AnonymousClass8FO) r0
            r13.A02 = r0
            java.lang.String r0 = "payment_service"
            r4.getInt(r0)
            X.4k3 r6 = r13.A01
            r0 = 2131433564(0x7f0b185c, float:1.8488917E38)
            r5 = 2131433563(0x7f0b185b, float:1.8488915E38)
            if (r6 == 0) goto L_0x00b0
            android.view.View r0 = r15.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x00fd
            X.AnonymousClass9Q1.A00(r0, r6)
        L_0x00b0:
            java.util.List r0 = r13.A04
            int r0 = r0.size()
            if (r0 != r3) goto L_0x00ef
            java.lang.String r0 = "requires_sync"
            boolean r0 = r4.getBoolean(r0)
            if (r0 == 0) goto L_0x00ef
            X.4k3 r4 = r13.A01
            r5 = 0
            X.9as r0 = new X.9as
            r0.<init>(r3, r5)
            r4.BD6(r0)
            java.util.List r0 = r13.A04
            java.lang.Object r4 = r0.get(r1)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.8FV r1 = r2.A0E
            android.content.Context r3 = r2.A1n()
            X.9u1 r2 = r2.A0B
            X.1QD r0 = r1.A03
            java.lang.Boolean r7 = r0.A05()
            r0 = 1
            X.AYA r6 = new X.AYA
            r6.<init>(r4, r1, r0)
            r2.A01(r3, r4, r5, r6, r7)
        L_0x00ea:
            X.4k3 r0 = r13.A01
            r0.A04 = r13
            return
        L_0x00ef:
            X.4k3 r3 = r13.A01
            r2 = 2
            java.util.List r1 = r13.A04
            X.9as r0 = new X.9as
            r0.<init>(r2, r1)
            r3.BD6(r0)
            goto L_0x00ea
        L_0x00fd:
            android.view.View r0 = r15.findViewById(r5)
            r6.CA8(r0)
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.invites.PaymentInviteFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A27(int i, boolean z) {
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
        C171858sO r2 = new C171858sO();
        r2.A0b = "payment_invite_prompt";
        String str = indiaUpiPaymentInviteFragment.A03;
        if (str == null) {
            str = "chat";
        }
        r2.A0a = str;
        IndiaUpiPaymentInviteFragment.A00(r2, indiaUpiPaymentInviteFragment);
        int i2 = 1;
        r2.A08 = 1;
        if (z) {
            i2 = 54;
        }
        r2.A07 = Integer.valueOf(i2);
        r2.A0I = C17880vN.A0n(i);
        indiaUpiPaymentInviteFragment.A0C.BiH(r2);
    }

    public void A28(boolean z) {
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
        Fragment fragment = indiaUpiPaymentInviteFragment.A0E;
        if (fragment instanceof PaymentBottomSheet) {
            String str = indiaUpiPaymentInviteFragment.A03;
            new C191759n8(indiaUpiPaymentInviteFragment.A1D(), (AnonymousClass1FR) indiaUpiPaymentInviteFragment.A1D(), indiaUpiPaymentInviteFragment.A06, indiaUpiPaymentInviteFragment.A08, str, z).A00((PaymentBottomSheet) fragment);
        }
    }

    public void A26() {
        Log.i("dismiss()");
        AnonymousClass3MX.A1J(this.A02.A00, 3);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626371);
    }
}
