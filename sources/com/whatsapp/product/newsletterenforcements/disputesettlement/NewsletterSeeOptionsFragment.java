package com.whatsapp.product.newsletterenforcements.disputesettlement;

import X.AnonymousClass1DF;
import X.AnonymousClass1LU;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass442;
import X.AnonymousClass443;
import X.AnonymousClass444;
import X.AnonymousClass445;
import X.AnonymousClass446;
import X.AnonymousClass45B;
import X.AnonymousClass45C;
import X.AnonymousClass45E;
import X.AnonymousClass45F;
import X.AnonymousClass45H;
import X.AnonymousClass45I;
import X.AnonymousClass4NV;
import X.AnonymousClass4UN;
import X.AnonymousClass5OU;
import X.AnonymousClass5V3;
import X.AnonymousClass5V4;
import X.AnonymousClass5V5;
import X.AnonymousClass5V6;
import X.AnonymousClass5V9;
import X.C103195Jj;
import X.C103205Jk;
import X.C103215Jl;
import X.C105815Tl;
import X.C105825Tm;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C22821Di;
import X.C24261Jm;
import X.C26031Qo;
import X.C36401np;
import X.C36531o3;
import X.C40751vD;
import X.C89314cG;
import X.C89424cR;
import X.C89434cS;
import X.C89494cY;
import X.C89964dJ;
import X.C91634g0;
import X.C99274sY;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2EnforcementSource;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

public final class NewsletterSeeOptionsFragment extends Hilt_NewsletterSeeOptionsFragment {
    public static final Uri A09 = Uri.parse("https://www.whatsapp.com/legal/ip-policy");
    public C40751vD A00;
    public C36531o3 A01;
    public C18000vb A02;
    public C26031Qo A03;
    public C18030ve A04;
    public AnonymousClass1LU A05;
    public C36401np A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C103195Jj(this));
    public final C18100vl A08;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        float f = NestedScrollView.A0T;
        NestedScrollView nestedScrollView = new NestedScrollView(A14());
        LinearLayout linearLayout = new LinearLayout(A14());
        linearLayout.setOrientation(1);
        C91634g0.A00(A1G(), ((NewsletterEnforcementSelectActionViewModel) this.A08.getValue()).A00, new AnonymousClass5V9(linearLayout, this), 10);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nestedScrollView.addView(linearLayout);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return nestedScrollView;
    }

    public final void A26() {
        if (this.A05 == null) {
            AnonymousClass3MW.A1F();
            throw null;
        }
    }

    public NewsletterSeeOptionsFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(NewsletterEnforcementSelectActionViewModel.class);
        this.A08 = C99274sY.A00(new C103205Jk(this), new C103215Jl(this), new AnonymousClass5OU(this), A15);
    }

    public static final WDSListItem A00(C89494cY r2, NewsletterSeeOptionsFragment newsletterSeeOptionsFragment, AnonymousClass4UN r4) {
        AnonymousClass4NV r1;
        C22821Di r0;
        C89314cG r02;
        String str;
        GraphQLXWA2EnforcementSource graphQLXWA2EnforcementSource;
        if (r2.A02().ordinal() != 5) {
            return A01(newsletterSeeOptionsFragment, AnonymousClass45H.A00, new AnonymousClass5V3(newsletterSeeOptionsFragment, r4));
        }
        C89494cY r12 = r4.A01;
        if (!(r12 instanceof AnonymousClass445)) {
            return A01(newsletterSeeOptionsFragment, AnonymousClass45F.A00, new AnonymousClass5V5(newsletterSeeOptionsFragment, r4));
        }
        C89424cR A042 = r12.A04();
        if (!(A042 == null || (r02 = A042.A00) == null || (str = r02.A00) == null)) {
            if (r12 instanceof AnonymousClass443) {
                graphQLXWA2EnforcementSource = ((AnonymousClass443) r12).A01;
            } else if (r12 instanceof AnonymousClass442) {
                graphQLXWA2EnforcementSource = ((AnonymousClass442) r12).A01;
            } else if (r12 instanceof AnonymousClass446) {
                graphQLXWA2EnforcementSource = ((AnonymousClass446) r12).A02;
            } else if (r12 instanceof AnonymousClass444) {
                graphQLXWA2EnforcementSource = ((AnonymousClass444) r12).A01;
            } else {
                graphQLXWA2EnforcementSource = ((AnonymousClass445) r12).A02;
            }
            if (graphQLXWA2EnforcementSource == GraphQLXWA2EnforcementSource.COPS) {
                r1 = AnonymousClass45I.A00;
                r0 = new AnonymousClass5V4(newsletterSeeOptionsFragment, str);
                return A01(newsletterSeeOptionsFragment, r1, r0);
            }
        }
        r1 = AnonymousClass45E.A00;
        r0 = new AnonymousClass5V6(newsletterSeeOptionsFragment, r4);
        return A01(newsletterSeeOptionsFragment, r1, r0);
    }

    public static final WDSListItem A01(NewsletterSeeOptionsFragment newsletterSeeOptionsFragment, AnonymousClass4NV r3, C22821Di r4) {
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(newsletterSeeOptionsFragment.A1n()), 2131626858);
        C18070vi.A0z(A0D, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
        WDSListItem wDSListItem = (WDSListItem) A0D;
        wDSListItem.setIcon(C24261Jm.A00(wDSListItem.getContext(), r3.A00));
        wDSListItem.setText(r3.A02);
        wDSListItem.setSubText(r3.A01);
        C89964dJ.A00(wDSListItem, r4, 20);
        return wDSListItem;
    }

    public static final List A02(C89494cY r3, NewsletterSeeOptionsFragment newsletterSeeOptionsFragment) {
        C89434cS r0;
        C89424cR A042 = r3.A04();
        if (A042 == null || (r0 = A042.A02) == null) {
            return null;
        }
        String str = r0.A00;
        View[] viewArr = new View[3];
        viewArr[0] = A01(newsletterSeeOptionsFragment, AnonymousClass45B.A00, new C105815Tl(newsletterSeeOptionsFragment));
        viewArr[1] = A01(newsletterSeeOptionsFragment, AnonymousClass45I.A00, new AnonymousClass5V4(newsletterSeeOptionsFragment, str));
        return C18070vi.A0O(A01(newsletterSeeOptionsFragment, AnonymousClass45C.A00, new C105825Tm(newsletterSeeOptionsFragment)), viewArr, 2);
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892802);
    }
}
