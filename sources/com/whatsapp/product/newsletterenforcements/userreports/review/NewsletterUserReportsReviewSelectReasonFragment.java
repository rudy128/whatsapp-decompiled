package com.whatsapp.product.newsletterenforcements.userreports.review;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C18100vl;
import X.C72463Mc;
import X.C88414Zp;
import X.C90864el;
import X.C90894eo;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.base.WaFragment;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.Map;

public final class NewsletterUserReportsReviewSelectReasonFragment extends WaFragment {
    public NewsletterUserReportsViewModel A00;
    public final C18100vl A01 = C88414Zp.A02(this, "arg-report-id");

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        this.A00 = (NewsletterUserReportsViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterUserReportsViewModel.class);
        View inflate = layoutInflater.inflate(2131626253, viewGroup, false);
        WDSButton A0r = AnonymousClass3MW.A0r(inflate, 2131434609);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131434608);
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[4];
        AnonymousClass1D6.A03(2131892839, "CLOSE_CHANNEL", r2, 0);
        r2[1] = AnonymousClass1D6.A01(2131892838, "REMOVE_UPDATE");
        C72463Mc.A1I(2131892841, "VIOLATES_GUIDELINES", r2);
        C72463Mc.A1J(2131892840, "FORBIDDEN_UPDATES", r2);
        Iterator A15 = AnonymousClass000.A15(AnonymousClass1D7.A0B(r2));
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            int A0M = AnonymousClass000.A0M(A16.getKey());
            RadioButton radioButton = new RadioButton(new ContextThemeWrapper(A1n(), 2132083613));
            radioButton.setText(A0M);
            radioButton.setOnCheckedChangeListener(new C90864el(this, A0r, (String) A16.getValue()));
            radioGroup.addView(radioButton);
        }
        radioGroup.setOnCheckedChangeListener(new C90894eo(A0r, 6));
        return inflate;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        A1D().setTitle(2131892795);
    }
}
