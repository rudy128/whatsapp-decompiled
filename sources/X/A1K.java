package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.invites.Hilt_IndiaUpiPaymentInviteFragment;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;

public class A1K {
    public final AnonymousClass1QS A00;
    public final Runnable A01;
    public final Runnable A02;
    public final Context A03;
    public final AnonymousClass1FR A04;
    public final AnonymousClass1KB A05;
    public final C24751Ln A06;
    public final AnonymousClass8FO A07;
    public final boolean A08;
    public final boolean A09;

    public void A01(UserJid userJid, C22376B5f b5f, String str) {
        C17960vV.A0C(A02());
        AnonymousClass1QS r1 = this.A00;
        C187339fe BWj = r1.A06().BWj();
        C17960vV.A07(BWj);
        A5I A012 = r1.A01();
        C24751Ln r3 = this.A06;
        C187429fn r4 = new C187429fn(userJid, BWj, b5f, this, str);
        C17890vO.A0u(new AnonymousClass9B4(r3, A012.A01, userJid, r4), A012.A03);
    }

    public static void A00(A1K a1k, String str, ArrayList arrayList, boolean z) {
        AnonymousClass1DT r4 = a1k.A07.A00;
        AnonymousClass3MX.A1J(r4, 0);
        boolean z2 = a1k.A09;
        boolean z3 = a1k.A08;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        Hilt_IndiaUpiPaymentInviteFragment hilt_IndiaUpiPaymentInviteFragment = new Hilt_IndiaUpiPaymentInviteFragment();
        hilt_IndiaUpiPaymentInviteFragment.A1R(PaymentInviteFragment.A02(str, arrayList, z, z2, z3));
        paymentBottomSheet.A02 = hilt_IndiaUpiPaymentInviteFragment;
        a1k.A04.CMl(paymentBottomSheet);
        r4.A0A(paymentBottomSheet, new C20330AGm(paymentBottomSheet, a1k, 3));
    }

    public boolean A02() {
        C187339fe BWj = this.A00.A06().BWj();
        if (BWj == null) {
            return false;
        }
        return BWj.A02.A0D();
    }

    public A1K(Context context, AnonymousClass1FR r2, AnonymousClass1KB r3, C24751Ln r4, AnonymousClass1QS r5, AnonymousClass8FO r6, Runnable runnable, Runnable runnable2, boolean z, boolean z2) {
        this.A05 = r3;
        this.A00 = r5;
        this.A03 = context;
        this.A07 = r6;
        this.A04 = r2;
        this.A02 = runnable;
        this.A01 = runnable2;
        this.A06 = r4;
        this.A09 = z;
        this.A08 = z2;
    }
}
