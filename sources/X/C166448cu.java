package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;

/* renamed from: X.8cu  reason: invalid class name and case insensitive filesystem */
public class C166448cu extends BV6 {
    public final /* synthetic */ DFL A00;
    public final /* synthetic */ C26025Cqj A01;

    public /* bridge */ /* synthetic */ Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        DFL dfl2 = this.A00;
        long A002 = AnonymousClass9PY.A00(dfl2);
        if (A002 <= 0) {
            return null;
        }
        AnonymousClass3MW.A0J(view, 2131435598).setText(dfl2.A0D(38));
        ((C183089Ww) C26272CwJ.A04(doz, dfl2)).A00 = new C161198Ce(view, doz, this, 0, A002).start();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        C183089Ww r1 = (C183089Ww) C26272CwJ.A04(doz, this.A00);
        CountDownTimer countDownTimer = r1.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            r1.A00 = null;
        }
        AnonymousClass3MW.A0J(view, 2131435598).setText("");
        AnonymousClass3MW.A0J(view, 2131436203).setText("");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166448cu(DOZ doz, DFL dfl, DFL dfl2, C26025Cqj cqj) {
        super(doz, dfl);
        this.A01 = cqj;
        this.A00 = dfl2;
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return AnonymousClass3MX.A08(context, 2131625012);
    }
}
