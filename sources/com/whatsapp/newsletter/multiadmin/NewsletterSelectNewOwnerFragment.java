package com.whatsapp.newsletter.multiadmin;

import X.AFC;
import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FL;
import X.AnonymousClass1L4;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VS;
import X.AnonymousClass3XI;
import X.AnonymousClass4KC;
import X.AnonymousClass5QJ;
import X.AnonymousClass9IV;
import X.C106215Uz;
import X.C107545aC;
import X.C137506vZ;
import X.C18000vb;
import X.C18070vi;
import X.C24921Me;
import X.C27201Vd;
import X.C29681ch;
import X.C37451pZ;
import X.C37961qT;
import X.C38391rD;
import X.C72043Kk;
import X.C72463Mc;
import X.C76823oU;
import X.C87514Vw;
import X.C91634g0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.newsletter.NewsletterInfoActivity;

public final class NewsletterSelectNewOwnerFragment extends Hilt_NewsletterSelectNewOwnerFragment implements C107545aC {
    public RecyclerView A00;
    public AnonymousClass4KC A01;
    public C72043Kk A02;
    public AnonymousClass1M9 A03;
    public C24921Me A04;
    public C27201Vd A05;
    public C18000vb A06;
    public AnonymousClass1CJ A07;
    public AnonymousClass3XI A08;
    public AnonymousClass3VS A09;
    public C76823oU A0A;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626223, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        AnonymousClass1FL A1D = A1D();
        C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A1D;
        Toolbar toolbar = (Toolbar) view2.findViewById(2131436270);
        C137506vZ.A00(toolbar);
        toolbar.setNavigationContentDescription(2131898718);
        toolbar.setTitle(2131895612);
        toolbar.setNavigationOnClickListener(new AFC(this, 5));
        this.A00 = AnonymousClass3MX.A0Q(view2, 2131433747);
        AnonymousClass1FL A1B = A1B();
        C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity2 = (NewsletterInfoActivity) A1B;
        AnonymousClass4KC r4 = this.A01;
        if (r4 != null) {
            LayoutInflater A16 = A16();
            C18070vi.A0X(A16);
            C27201Vd r3 = this.A05;
            if (r3 != null) {
                C37451pZ A062 = r3.A06(A14(), "newsletter-new-owner-admins");
                C29681ch A4m = newsletterInfoActivity2.A4m();
                AnonymousClass10E r2 = r4.A00.A02;
                AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r2);
                C24921Me A0g = AnonymousClass3MZ.A0g(r2);
                this.A08 = new AnonymousClass3XI(A16, AnonymousClass3MZ.A0T(r2.A00), A0g, A062, A0d, AnonymousClass10E.A8r(r2), AnonymousClass3MY.A0Z(r2), A4m, newsletterInfoActivity2);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    C72463Mc.A14(recyclerView, recyclerView.getPaddingLeft(), recyclerView.getResources().getDimensionPixelSize(2131168343));
                    AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
                    recyclerView.setAdapter(this.A08);
                }
                this.A0A = (C76823oU) AnonymousClass3MW.A0N(newsletterInfoActivity).A00(C76823oU.class);
                AnonymousClass3VS r1 = (AnonymousClass3VS) AnonymousClass3MW.A0N(newsletterInfoActivity).A00(AnonymousClass3VS.class);
                this.A09 = r1;
                if (r1 != null) {
                    C91634g0.A00(A1G(), r1.A01, new C106215Uz(newsletterInfoActivity, this), 4);
                    AnonymousClass3VS r12 = this.A09;
                    if (r12 != null) {
                        r12.A0T(AnonymousClass9IV.FULL);
                        RecyclerView recyclerView2 = this.A00;
                        if (recyclerView2 != null) {
                            C87514Vw.A01(recyclerView2, this, AnonymousClass5QJ.A00, true);
                            return;
                        }
                        return;
                    }
                }
                C18070vi.A11("newsletterInfoMembersListViewModel");
                throw null;
            }
            str = "contactPhotos";
        } else {
            str = "newsletterAdminsListAdapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((C37961qT) null);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((C38391rD) null);
        }
        this.A00 = null;
        this.A08 = null;
        super.A1s();
    }

    public void BKr() {
        C87514Vw.A00(this.A00, this, (AnonymousClass1L4) null, true);
    }
}
