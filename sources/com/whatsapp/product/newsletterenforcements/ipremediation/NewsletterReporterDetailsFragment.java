package com.whatsapp.product.newsletterenforcements.ipremediation;

import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5K0;
import X.AnonymousClass5K1;
import X.AnonymousClass5K2;
import X.AnonymousClass5K3;
import X.AnonymousClass5K4;
import X.AnonymousClass5K5;
import X.AnonymousClass5K6;
import X.C103355Jz;
import X.C104455Of;
import X.C105875Tr;
import X.C18070vi;
import X.C18100vl;
import X.C89964dJ;
import X.C91634g0;
import X.C99274sY;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterEnforcementSelectActionViewModel;

public final class NewsletterReporterDetailsFragment extends Hilt_NewsletterReporterDetailsFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11C A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C103355Jz(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5K0(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new AnonymousClass5K1(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5K2(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new AnonymousClass5K3(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5K4(this));
    public final C18100vl A08;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625744, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C89964dJ.A00(view.findViewById(2131429136), this, 24);
        C91634g0.A00(A1G(), ((NewsletterEnforcementSelectActionViewModel) this.A08.getValue()).A00, new C105875Tr(this), 13);
    }

    public static final void A00(NewsletterReporterDetailsFragment newsletterReporterDetailsFragment, String str, String str2) {
        AnonymousClass11C r0 = newsletterReporterDetailsFragment.A01;
        if (r0 != null) {
            ClipboardManager A09 = r0.A09();
            ClipData newPlainText = ClipData.newPlainText(str2, str);
            if (A09 != null) {
                A09.setPrimaryClip(newPlainText);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public NewsletterReporterDetailsFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(NewsletterEnforcementSelectActionViewModel.class);
        this.A08 = C99274sY.A00(new AnonymousClass5K5(this), new AnonymousClass5K6(this), new C104455Of(this), A15);
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892589);
    }
}
