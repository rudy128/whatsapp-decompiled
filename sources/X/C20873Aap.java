package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.List;

/* renamed from: X.Aap  reason: case insensitive filesystem */
public class C20873Aap implements B9D {
    public final int A00;
    public final Object A01;

    public C20873Aap(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bzf(C20279AEn aEn, AnonymousClass21K r7) {
        switch (this.A00) {
            case 0:
                List<C20251ADj> list = aEn.A0Q;
                if (list != null) {
                    C98494rF r4 = (C98494rF) this.A01;
                    for (C20251ADj aDj : list) {
                        String str = aDj.A01;
                        if (C18070vi.A18(str, "upi_merchant_vpa")) {
                            BDZ bdz = aDj.A00;
                            bdz.getClass();
                            ((C20930Abk) bdz).A00 = (C20935Abp) r4.element;
                        } else if (C18070vi.A18(str, "upi_intent_link")) {
                            BDZ bdz2 = aDj.A00;
                            bdz2.getClass();
                            ((C20929Abj) bdz2).A00 = (C20935Abp) r4.element;
                        }
                    }
                    return;
                }
                return;
            case 1:
                IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A01;
                aEn.A09 = true;
                if (!indiaUpiCheckOrderDetailsActivity.Bg0()) {
                    indiaUpiCheckOrderDetailsActivity.A05.A0J(new C21432Ajz(indiaUpiCheckOrderDetailsActivity, r7, 15));
                    return;
                }
                return;
            case 2:
                C20935Abp abp = (C20935Abp) this.A01;
                List<C20251ADj> list2 = aEn.A0Q;
                if (list2 != null) {
                    for (C20251ADj aDj2 : list2) {
                        String str2 = aDj2.A01;
                        if (str2.equals("upi_merchant_vpa")) {
                            BDZ bdz3 = aDj2.A00;
                            bdz3.getClass();
                            ((C20930Abk) bdz3).A00 = abp;
                        } else if (str2.equals("upi_intent_link")) {
                            BDZ bdz4 = aDj2.A00;
                            bdz4.getClass();
                            ((C20929Abj) bdz4).A00 = abp;
                        }
                    }
                    return;
                }
                return;
            default:
                AW0 aw0 = (AW0) this.A01;
                aEn.A08 = aw0.A0K;
                if (aw0.A0L()) {
                    aEn.A07 = "captured";
                    if (aw0.A03() != null) {
                        aEn.A03 = aw0.A08;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
