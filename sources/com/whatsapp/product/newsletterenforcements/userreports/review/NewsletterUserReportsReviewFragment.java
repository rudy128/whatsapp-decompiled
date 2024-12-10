package com.whatsapp.product.newsletterenforcements.userreports.review;

import X.AnonymousClass00H;
import X.AnonymousClass3Ma;
import X.AnonymousClass4HM;
import X.C146757Qm;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C36401np;
import X.C88414Zp;
import X.C89964dJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportsReviewFragment extends Hilt_NewsletterUserReportsReviewFragment {
    public C18030ve A00;
    public NewsletterUserReportsViewModel A01;
    public C36401np A02;
    public AnonymousClass00H A03;
    public final C18100vl A04 = C88414Zp.A02(this, "arg-report-id");

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        this.A01 = (NewsletterUserReportsViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterUserReportsViewModel.class);
        View inflate = layoutInflater.inflate(2131626252, viewGroup, false);
        TextView A0E = C17880vN.A0E(inflate, 2131434605);
        View findViewById = inflate.findViewById(2131434607);
        C18070vi.A0b(A0E);
        C36401np r3 = this.A02;
        if (r3 != null) {
            C18030ve r2 = this.A00;
            if (r2 != null) {
                AnonymousClass4HM.A00(A0E, r2, r3, new C146757Qm((Object) this, 8), 2131892835);
                C89964dJ.A00(findViewById, this, 29);
                return inflate;
            }
            str = "abProps";
        } else {
            str = "linkifier";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        A1D().setTitle(2131892795);
    }
}
