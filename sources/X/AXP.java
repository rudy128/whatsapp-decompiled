package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public class AXP implements C33661jB {
    public final int A00;
    public final BDG A01;
    public final BD4 A02;
    public final WeakReference A03;

    private void A00(A7B a7b, AnonymousClass91y r4) {
        int i;
        BD4 bd4 = this.A02;
        if (bd4 != null) {
            bd4.Bi4(a7b, this.A00);
        }
        r4.CEx();
        if (a7b != null) {
            BDG bdg = this.A01;
            if (bdg == null || (i = bdg.BRO(a7b.A00)) == 0) {
                i = 2131893660;
            }
            r4.BhQ(i);
        }
    }

    public String A01(Context context) {
        int i;
        if (this instanceof AnonymousClass93D) {
            i = 2131893669;
            if ("p2m".equals(((AnonymousClass93D) this).A01)) {
                i = 2131893668;
            }
        } else if (this instanceof AnonymousClass93C) {
            i = 2131889243;
            if (C20063A5m.A01(((AnonymousClass93C) this).A00.A00)) {
                i = 2131894194;
            }
        } else {
            i = 2131893667;
        }
        return context.getString(i);
    }

    public void C3L(A7B a7b) {
        AnonymousClass91y r3 = (AnonymousClass91y) this.A03.get();
        if (r3 != null) {
            AnonymousClass8BX.A1D(r3.A0M, a7b, "setDefault/onRequestError. paymentNetworkError: ", AnonymousClass000.A10());
            A00(a7b, r3);
        }
    }

    public void C3X(A7B a7b) {
        AnonymousClass91y r3 = (AnonymousClass91y) this.A03.get();
        if (r3 != null) {
            r3.A0M.A04(AnonymousClass001.A1E(a7b, "setDefault/onResponseError. paymentNetworkError: ", AnonymousClass000.A10()));
            A00(a7b, r3);
        }
    }

    public void C3Y(C186089dd r7) {
        C170278pb r0;
        if (this instanceof AnonymousClass93C) {
            AnonymousClass93C r5 = (AnonymousClass93C) this;
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = r5.A00;
            if (!indiaUpiBankAccountDetailsActivity.isFinishing()) {
                indiaUpiBankAccountDetailsActivity.A0P.A06("setDefault Success");
                indiaUpiBankAccountDetailsActivity.A0B.Bi4((A7B) null, 15);
                Iterator it = ((C176018ze) r7).A00.iterator();
                while (it.hasNext()) {
                    C20284AEs A0P = AnonymousClass8BR.A0P(it);
                    if (A0P.A0A.equals(indiaUpiBankAccountDetailsActivity.A00.A0A)) {
                        indiaUpiBankAccountDetailsActivity.A4c(A0P, false);
                    }
                }
                indiaUpiBankAccountDetailsActivity.CEx();
                AnonymousClass8pN r02 = indiaUpiBankAccountDetailsActivity.A00;
                if (r02 != null && (r0 = r02.A08) != null && ((AnonymousClass8pS) r0).A0G) {
                    indiaUpiBankAccountDetailsActivity.BhR(r5.A01(indiaUpiBankAccountDetailsActivity));
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass91y r3 = (AnonymousClass91y) this.A03.get();
        if (r3 != null) {
            r3.A0M.A06("setDefault Success");
            BD4 bd4 = this.A02;
            if (bd4 != null) {
                bd4.Bi4((A7B) null, this.A00);
            }
            r3.A0C.A02(((C176018ze) r7).A00);
            r3.CEx();
            r3.BhR(A01(r3));
        }
    }

    public AXP(BDG bdg, BD4 bd4, AnonymousClass91y r4, int i) {
        this.A02 = bd4;
        this.A00 = i;
        this.A01 = bdg;
        this.A03 = AnonymousClass3MW.A0z(r4);
    }
}
