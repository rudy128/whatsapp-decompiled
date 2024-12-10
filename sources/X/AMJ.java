package X;

import android.content.DialogInterface;
import android.widget.TextView;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.concurrent.TimeUnit;

public class AMJ implements BCP, BDs {
    public final /* synthetic */ BCP A00;
    public final /* synthetic */ C167268fj A01;

    public void Blr(int i, CharSequence charSequence) {
        if (i == 7) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C167268fj r5 = this.A01;
            AnonymousClass11P r6 = r5.A02;
            long seconds = timeUnit.toSeconds(AnonymousClass11P.A01(r6)) + 30;
            r5.A04.A01(seconds);
            long j = (seconds * 1000) + 500;
            if (j > AnonymousClass11P.A01(r6)) {
                r5.A01.A2H(j);
            }
        }
        this.A00.Blr(i, charSequence);
    }

    public AMJ(BCP bcp, C167268fj r2) {
        this.A01 = r2;
        this.A00 = bcp;
    }

    public void A00() {
        C167268fj r1 = this.A01;
        r1.A01.A28();
        C73203Rj A002 = AnonymousClass4a6.A00(r1.A00);
        A002.A0E(2131893810);
        A002.A0D(2131893809);
        C20151A9n.A00(A002, this, 40, 2131899286);
        A002.A0T(false);
        A002.A0C();
    }

    public /* synthetic */ void A01() {
        AYZ ayz = this.A01.A05;
        BrazilPaymentActivity brazilPaymentActivity = ayz.A05;
        C20284AEs aEs = ayz.A03;
        AnonymousClass1KN r1 = ayz.A02;
        String str = ayz.A06;
        String str2 = ayz.A07;
        BrazilPaymentActivity.A0w(ayz.A01, r1, aEs, ayz.A04, brazilPaymentActivity, str, str2);
    }

    public void Bi3(A7B a7b, Integer num) {
        this.A01.A05.Bi3(a7b, num);
        BtH(a7b);
    }

    public Integer Bi6() {
        return this.A01.A05.Bi6();
    }

    public void BiO(A7B a7b, Integer num) {
        this.A01.A05.BiO(a7b, num);
    }

    public void BiP(Integer num) {
        this.A01.A05.BiP(num);
    }

    public void Bls() {
        this.A00.Bls();
    }

    public void Blu(int i, CharSequence charSequence) {
        this.A00.Blu(i, charSequence);
    }

    public void Blv(byte[] bArr) {
        C167268fj r2 = this.A01;
        r2.A01.A06 = true;
        r2.A00.CNA(2131893771);
    }

    public void BtH(A7B a7b) {
        C20751AXg aXg;
        int i;
        DialogInterface.OnDismissListener a9v;
        String str;
        C20159A9v a9v2;
        C20159A9v a9v3;
        ADT A002;
        C167268fj r2 = this.A01;
        r2.A00.CEx();
        FingerprintBottomSheet fingerprintBottomSheet = r2.A01;
        fingerprintBottomSheet.A06 = false;
        int i2 = a7b.A00;
        if (i2 == 1441) {
            fingerprintBottomSheet.A2H(a7b.A02 * 1000);
            return;
        }
        AYZ ayz = r2.A05;
        BrazilPaymentActivity brazilPaymentActivity = ayz.A05;
        brazilPaymentActivity.A0O.A05("error_code", (long) i2, brazilPaymentActivity.A00);
        int i3 = a7b.A00;
        if (i3 == 454) {
            C29621ca r0 = a7b.A04;
            if (!(r0 == null || (A002 = C196789ve.A00(r0)) == null)) {
                brazilPaymentActivity.A0D.A05(AnonymousClass9RN.A00(brazilPaymentActivity.A05, A002));
            }
            BrazilPaymentActivity.A0u(ayz.A00, brazilPaymentActivity);
            return;
        }
        if (i3 == 2896003 || i3 == 2896004) {
            C20087A6p.A03(C20087A6p.A00(brazilPaymentActivity.A05, (AnonymousClass1KN) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0L, "incentive_unavailable", "payment_confirm_prompt");
            aXg = brazilPaymentActivity.A0C;
            i = a7b.A00;
            a9v = new C20159A9v(ayz.A00, ayz, 0);
            str = null;
            a9v2 = null;
            a9v3 = null;
        } else {
            if (i3 == 444 || i3 == 478) {
                brazilPaymentActivity.A0J.A01.A02("FB", "PIN");
            }
            aXg = brazilPaymentActivity.A0C;
            i = a7b.A00;
            C24921Me r3 = brazilPaymentActivity.A05;
            C25181Nf r1 = brazilPaymentActivity.A06;
            UserJid userJid = brazilPaymentActivity.A0J;
            C17960vV.A07(userJid);
            str = r3.A0I(r1.A01(userJid));
            FingerprintBottomSheet fingerprintBottomSheet2 = ayz.A00;
            a9v2 = new C20159A9v(fingerprintBottomSheet2, ayz, 1);
            a9v = C20160A9w.A00(fingerprintBottomSheet2, 9);
            a9v3 = new C20159A9v(fingerprintBottomSheet2, ayz, 2);
        }
        aXg.A00(brazilPaymentActivity, a9v2, a9v, a9v3, str, i).show();
    }

    public void C3n(String str, Integer num) {
        C167268fj r3 = this.A01;
        r3.A00.CEx();
        FingerprintBottomSheet fingerprintBottomSheet = r3.A01;
        fingerprintBottomSheet.A2D(false);
        TextView textView = fingerprintBottomSheet.A01;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = fingerprintBottomSheet.A00;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        AYZ ayz = r3.A05;
        BrazilPaymentActivity brazilPaymentActivity = ayz.A05;
        brazilPaymentActivity.A0O.A04(num, "pay-precheck");
        String str2 = ayz.A06;
        AnonymousClass1KN r5 = ayz.A02;
        C20284AEs aEs = ayz.A03;
        String str3 = ayz.A07;
        int i = 1;
        if (brazilPaymentActivity.A4o(r5, brazilPaymentActivity.A01) == null) {
            i = 0;
        }
        brazilPaymentActivity.A4p(ayz.A01, r5, aEs, ayz.A04, str2, str, str3, i);
        this.A00.Blv((byte[]) null);
    }
}
