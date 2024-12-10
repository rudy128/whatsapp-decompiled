package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.HashMap;

/* renamed from: X.AZg  reason: case insensitive filesystem */
public class C20803AZg implements BDE {
    public final /* synthetic */ AnonymousClass1KJ A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ C20284AEs A02;
    public final /* synthetic */ C19962A0v A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ ConfirmPaymentFragment A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ void Blj(ViewGroup viewGroup) {
    }

    public /* synthetic */ void Blm(ViewGroup viewGroup) {
    }

    public boolean CMG(C20284AEs aEs) {
        return true;
    }

    public boolean CMH() {
        return true;
    }

    public boolean CN3() {
        return true;
    }

    public C20803AZg(AnonymousClass1KJ r1, AnonymousClass1KN r2, C20284AEs aEs, C19962A0v a0v, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment, String str) {
        this.A04 = brazilPaymentActivity;
        this.A06 = str;
        this.A01 = r2;
        this.A03 = a0v;
        this.A02 = aEs;
        this.A00 = r1;
        this.A05 = confirmPaymentFragment;
    }

    public void BCl(ViewGroup viewGroup) {
        C198769ys r7;
        C19962A0v a0v = this.A03;
        if (a0v != null && (r7 = a0v.A01) != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            int i = brazilPaymentActivity.A01;
            C161398Da r3 = new C161398Da(brazilPaymentActivity, brazilPaymentActivity.A06, this.A01, r7, i, true);
            int i2 = brazilPaymentActivity.A01;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (!(i2 == 2 || i2 == 3)) {
                        if (i2 != 4) {
                            if (!(i2 == 5 || i2 == 7)) {
                                return;
                            }
                        } else if (r7.A01 == 0) {
                            viewGroup.addView(r3);
                            brazilPaymentActivity.A0T.A05(-1, 1);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (r7.A00 == 0) {
                    viewGroup.addView(r3);
                    brazilPaymentActivity.A0T.A05(1, -1);
                    return;
                } else {
                    return;
                }
            }
            viewGroup.addView(r3);
        }
    }

    public int BR6(C20284AEs aEs, int i) {
        AnonymousClass8pY r2 = (AnonymousClass8pY) aEs.A08;
        if (r2 == null) {
            return 0;
        }
        if (BrazilPaymentActivity.A12(aEs, i)) {
            if (!"ACTIVE".equals(r2.A0I)) {
                return 2131887946;
            }
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            if (brazilPaymentActivity.A0P.A0E() || brazilPaymentActivity.A0P.A0B()) {
                return 2131887408;
            }
            return 2131887409;
        } else if (r2.A0a) {
            return 0;
        } else {
            return 2131897797;
        }
    }

    public String Bae() {
        return this.A00.BLc(this.A04.A06, this.A01);
    }

    public boolean Bfm() {
        return this.A04.A0m;
    }

    public void Blk(ViewGroup viewGroup) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        TextView A0E = C17880vN.A0E(brazilPaymentActivity.getLayoutInflater().inflate(2131624613, viewGroup, true), 2131436044);
        AnonymousClass3MY.A0y(brazilPaymentActivity.A02, A0E, new Object[]{brazilPaymentActivity.A05.A0I(brazilPaymentActivity.A06.A01(brazilPaymentActivity.A0J))}, 2131888716);
        String str = this.A06;
        if (TextUtils.isEmpty(str)) {
            if (brazilPaymentActivity instanceof BrazilOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
        }
        C20087A6p.A03(C20087A6p.A01(brazilPaymentActivity.A05, this.A01, this.A03, brazilPaymentActivity.A0m), brazilPaymentActivity.A0L, "payment_confirm_prompt", str);
    }

    public void Bus(ViewGroup viewGroup, C20284AEs aEs) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        View inflate = brazilPaymentActivity.getLayoutInflater().inflate(2131624621, viewGroup, true);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(inflate, 2131430962);
        int i = 2131887410;
        if ("p2m".equals(brazilPaymentActivity.A0t)) {
            i = 2131890283;
        }
        Context context = brazilPaymentActivity.A02;
        SpannableString spannableString = new SpannableString(C17880vN.A0q(context, context.getString(i), new Object[1], 0, 2131888711));
        C28931bI A002 = C28931bI.A00(inflate, 2131431415);
        if ("p2m".equals(brazilPaymentActivity.A0t)) {
            A002.A04(0);
            HashMap A11 = C17880vN.A11();
            A11.put("meta-terms-privacy", new C21426Ajt(this, 23));
            A11.put("wa-terms-privacy", new C21426Ajt(this, 24));
            A11.put("wa-brazil-p2m-learn-more", new C21426Ajt(this, 25));
            C36401np r3 = brazilPaymentActivity.A0c;
            Context context2 = brazilPaymentActivity.A02;
            SpannableStringBuilder A07 = r3.A07(context2, context2.getString(2131893811), A11, C72463Mc.A02(brazilPaymentActivity.A02));
            AnonymousClass3Ma.A1L(brazilPaymentActivity.A0E, (TextEmojiLabel) A002.A02());
            AnonymousClass3MX.A0M(A002).setText(A07);
        }
        AnonymousClass3Ma.A1K(A0V, brazilPaymentActivity.A08);
        AnonymousClass3Ma.A1L(brazilPaymentActivity.A0E, A0V);
        A0V.setText(spannableString);
    }

    public /* synthetic */ int BPB(C20284AEs aEs) {
        return 0;
    }

    public String BPC(C20284AEs aEs, int i) {
        int i2;
        Context context;
        if (BrazilPaymentActivity.A12(aEs, i)) {
            i2 = 2131893769;
            context = this.A04.A02;
        } else {
            C170278pb r0 = this.A02.A08;
            C17960vV.A07(r0);
            boolean A0A = r0.A0A();
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            i2 = 2131888702;
            context = brazilPaymentActivity;
            if (A0A) {
                return C108975cc.A0b(brazilPaymentActivity, this.A00.BLc(brazilPaymentActivity.A06, this.A01), AnonymousClass3MW.A1a(), 2131888700);
            }
        }
        return context.getString(i2);
    }

    public int BQA() {
        return 2131893671;
    }

    public /* synthetic */ String BQB(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ String BUs() {
        return null;
    }

    public boolean CLs(C20284AEs aEs, String str, int i) {
        return BrazilPaymentActivity.A12(aEs, i);
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        if (A8e.A08(aEs) && !this.A05.A0Z) {
            this.A04.A0R.A02(aEs, paymentMethodRow);
        }
    }
}
