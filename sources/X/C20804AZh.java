package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.button.WDSButton;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* renamed from: X.AZh  reason: case insensitive filesystem */
public class C20804AZh implements BDE {
    public final /* synthetic */ AnonymousClass1KJ A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ AnonymousClass1KN A02;
    public final /* synthetic */ AnonymousClass1KN A03;
    public final /* synthetic */ C19962A0v A04;
    public final /* synthetic */ ConfirmPaymentFragment A05;
    public final /* synthetic */ AnonymousClass91R A06;
    public final /* synthetic */ PaymentBottomSheet A07;

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
    }

    public boolean CN3() {
        return true;
    }

    public C20804AZh(AnonymousClass1KJ r1, AnonymousClass1KN r2, AnonymousClass1KN r3, AnonymousClass1KN r4, C19962A0v a0v, ConfirmPaymentFragment confirmPaymentFragment, AnonymousClass91R r7, PaymentBottomSheet paymentBottomSheet) {
        this.A06 = r7;
        this.A07 = paymentBottomSheet;
        this.A01 = r2;
        this.A04 = a0v;
        this.A03 = r3;
        this.A05 = confirmPaymentFragment;
        this.A02 = r4;
        this.A00 = r1;
    }

    public void BCl(ViewGroup viewGroup) {
        C198769ys r6;
        AnonymousClass1KN r0;
        AnonymousClass91R r12 = this.A06;
        if (!r12.A5e(r12.A0B, r12.A0a)) {
            ViewGroup viewGroup2 = viewGroup;
            if (r12.A0U == null || (r0 = this.A03) == null) {
                AnonymousClass1KN r3 = this.A02;
                A1F a1f = r12.A0I;
                AnonymousClass1KJ r14 = this.A00;
                AnonymousClass1KN r15 = this.A01;
                if (r3 != null) {
                    a1f.A02(r12, viewGroup2, r14, r15, r3, r12.A0B);
                } else {
                    C20284AEs aEs = r12.A0B;
                    View A0A = AnonymousClass3MX.A0A(r12.getLayoutInflater(), viewGroup2, 2131624626);
                    AnonymousClass3MW.A0J(A0A, 2131427786).setText(r14.BLc(a1f.A01, r15));
                    A1F.A00(r12, A0A, aEs, a1f);
                }
                if (!TextUtils.isEmpty(r12.A0Y) && r12.A4y()) {
                    TextView textView = (TextView) r12.getLayoutInflater().inflate(2131624620, viewGroup2, false);
                    AnonymousClass4aX.A0E(textView, r12.getResources().getColor(C72463Mc.A01(r12)));
                    viewGroup2.addView(textView);
                }
                C19962A0v a0v = this.A04;
                if (a0v != null && (r6 = a0v.A01) != null) {
                    C161398Da r152 = new C161398Da(r12, r12.A00, r15, r6, r12.A01, false);
                    int i = r12.A01;
                    if (i != 0) {
                        if (i != 1) {
                            if (!(i == 2 || i == 3)) {
                                if (i != 4) {
                                    if (!(i == 5 || i == 7)) {
                                        return;
                                    }
                                } else if (r6.A01 == 0) {
                                    viewGroup2.addView(r152);
                                    r12.A0T.A05(-1, 1);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else if (r6.A00 == 0) {
                            viewGroup2.addView(r152);
                            r12.A0T.A05(1, -1);
                            return;
                        } else {
                            return;
                        }
                    }
                    viewGroup2.addView(r152);
                    return;
                }
                return;
            }
            View inflate = r12.getLayoutInflater().inflate(2131626370, viewGroup2, true);
            TextView A0J = AnonymousClass3MW.A0J(inflate, 2131435208);
            C18000vb r13 = r12.A00;
            String A0j = AnonymousClass8BS.A0j(r12.A06);
            String str = ((AnonymousClass1KK) r12.A06).A02;
            BigDecimal bigDecimal = this.A01.A00;
            A0J.setText(C20067A5r.A00(r13, A0j, str, bigDecimal, bigDecimal.scale(), false));
            TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131430644);
            AEP aep = r12.A0U;
            AnonymousClass3MY.A0y(r12, A0J2, new Object[]{aep.A01, aep.A03}, 2131897465);
            NumberFormat A0M = r12.A00.A0M();
            A0M.setMaximumFractionDigits(2);
            AnonymousClass3MW.A0J(inflate, 2131430836).setText(A0M.format(new BigDecimal(r12.A0U.A05).divide(new BigDecimal(100))));
            AnonymousClass1KJ A012 = r12.A07.A01(r12.A0U.A01);
            TextView A0J3 = AnonymousClass3MW.A0J(inflate, 2131436331);
            C18000vb r132 = r12.A00;
            String A0j2 = AnonymousClass8BS.A0j(A012);
            String str2 = ((AnonymousClass1KK) A012).A02;
            BigDecimal bigDecimal2 = r0.A00;
            A0J3.setText(C20067A5r.A00(r132, A0j2, str2, bigDecimal2, bigDecimal2.scale(), false));
            CompoundButton compoundButton = (CompoundButton) AnonymousClass1HF.A06(inflate, 2131435179);
            if (r12.A0U != null) {
                ConfirmPaymentFragment confirmPaymentFragment = this.A05;
                boolean isChecked = compoundButton.isChecked();
                WDSButton wDSButton = confirmPaymentFragment.A0M;
                if (wDSButton != null) {
                    wDSButton.setEnabled(isChecked);
                }
            }
            compoundButton.setOnCheckedChangeListener(new AG2(compoundButton, this, 0));
        }
    }

    public String BPC(C20284AEs aEs, int i) {
        AnonymousClass91R r2 = this.A06;
        int i2 = 2131894026;
        if (r2.A5e(aEs, r2.A0a)) {
            i2 = 2131897410;
        }
        return r2.getString(i2);
    }

    public String BQB(C20284AEs aEs) {
        return A56.A00(aEs, this.A06.A0P);
    }

    public int BR6(C20284AEs aEs, int i) {
        AnonymousClass91R r4 = this.A06;
        if (C20080A6g.A02(aEs, r4.A0t)) {
            return 2131893665;
        }
        if (r4.A0O.A09(aEs, r4.A0a, r4.A5c(), r4.A0x)) {
            return 2131897412;
        }
        return 0;
    }

    public String BUs() {
        AnonymousClass91R r3 = this.A06;
        String A002 = AXS.A00(r3.A0N);
        if (!TextUtils.isEmpty(A002)) {
            return C72473Md.A0j(r3, A002, 2131891338);
        }
        return null;
    }

    public boolean Bfm() {
        AnonymousClass8pI r0 = this.A06.A0B;
        if (r0 == null || !r0.A0F()) {
            return false;
        }
        return true;
    }

    public void Blj(ViewGroup viewGroup) {
        AnonymousClass91R r4 = this.A06;
        boolean A4y = r4.A4y();
        boolean z = true;
        int i = 0;
        boolean A1W = AnonymousClass000.A1W(r4.A0Y);
        if (!A4y || A1W || r4.A5e(r4.A0B, r4.A0a)) {
            z = false;
            i = 8;
        }
        viewGroup.setVisibility(i);
        if (z) {
            ((PaymentDescriptionRow) AnonymousClass1HF.A06(viewGroup, 2131433527)).A01(r4.A0T);
        }
    }

    public void Blk(ViewGroup viewGroup) {
        AnonymousClass91R r1 = this.A06;
        boolean A5e = r1.A5e(r1.A0B, r1.A0a);
        LayoutInflater layoutInflater = r1.getLayoutInflater();
        ViewGroup viewGroup2 = viewGroup;
        if (A5e) {
            ImageView A0E = AnonymousClass8BY.A0E(layoutInflater, viewGroup2, 2131627282);
            A0E.setImageResource(2131231814);
            AFT.A00(A0E, this, this.A07, 16);
            r1.A0S.BiJ((C20112A7u) null, (Integer) null, "add_credential_prompt", r1.A0g, r1.A0m, r1.A0l, 0, false, AnonymousClass8BT.A1X(r1), false);
            return;
        }
        ImageView A0E2 = AnonymousClass8BY.A0E(layoutInflater, viewGroup2, 2131627282);
        PaymentBottomSheet paymentBottomSheet = this.A07;
        int i = 2131231675;
        if (paymentBottomSheet.A1E().A0K() <= 1) {
            i = 2131231814;
        }
        A0E2.setImageResource(i);
        C20112A7u A0z = AnonymousClass91R.A0z(this.A01, this.A04, r1);
        if (A0z == null) {
            A0z = C20112A7u.A01();
        }
        if ((AnonymousClass8BT.A1X(r1) && !TextUtils.isEmpty(r1.A0l)) || r1.A0P.A0I(r1.A0F, r1.A0a, r1.A0k)) {
            r1.A0S.A08(r1.A0B, A0z);
        }
        AnonymousClass91R.A10(A0z, r1);
        AnonymousClass3Ma.A1F(A0E2, this, A0z, paymentBottomSheet, 26);
        if (r1.A0X) {
            C20112A7u.A04(A0z, r1);
        }
        C171858sO A062 = r1.A0S.A06(A0z, 0, (Integer) null, "payment_confirm_prompt", r1.A0g, r1.A0m, r1.A0l, false);
        A062.A06 = Boolean.valueOf(AnonymousClass8BT.A1X(r1));
        A062.A00 = true;
        A062.A01 = true;
        AZ6.A02(A062, r1);
    }

    public void Blm(ViewGroup viewGroup) {
        AFP afp;
        boolean z;
        AnonymousClass91R r3 = this.A06;
        if (!r3.A5e(r3.A0B, r3.A0a)) {
            boolean A5d = r3.A5d();
            boolean z2 = r3 instanceof AnonymousClass92s;
            if (z2 || !(!r3.A4y())) {
                afp = null;
            } else {
                afp = new AFP(this, 14);
            }
            A1F a1f = r3.A0I;
            AnonymousClass1E7 r7 = r3.A08;
            C37451pZ r6 = r3.A02;
            C1418477e r8 = r3.A0H;
            C1418477e r9 = r3.A0J;
            if (z2) {
                z = false;
            } else {
                z = true;
            }
            a1f.A01(r3, afp, viewGroup, r6, r7, r8, r9, A5d, z);
        }
    }

    public void Bus(ViewGroup viewGroup, C20284AEs aEs) {
        AnonymousClass91R r4 = this.A06;
        C20080A6g.A00(r4.getLayoutInflater(), viewGroup, r4.A0B, A43.A00(AXS.A02(r4), (String) null).A00, true);
    }

    public boolean CLs(C20284AEs aEs, String str, int i) {
        return this.A06.A5e(aEs, str);
    }

    public boolean CMG(C20284AEs aEs) {
        return !C20080A6g.A02(aEs, this.A06.A0t);
    }

    public /* synthetic */ int BPB(C20284AEs aEs) {
        return 0;
    }

    public int BQA() {
        return 2131894029;
    }

    public /* synthetic */ String Bae() {
        return null;
    }

    public /* synthetic */ boolean CMH() {
        return false;
    }
}
