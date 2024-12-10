package com.whatsapp.product.newsletterenforcements.userreports.list;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4KE;
import X.AnonymousClass5VA;
import X.C18070vi;
import X.C28931bI;
import X.C72453Mb;
import X.C91634g0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportsListFragment extends Hilt_NewsletterUserReportsListFragment {
    public RecyclerView A00;
    public AnonymousClass4KE A01;
    public NewsletterUserReportsViewModel A02;
    public C28931bI A03;
    public C28931bI A04;
    public C28931bI A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625382, viewGroup, false);
    }

    public void A1s() {
        this.A00 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        super.A1s();
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        A1D().setTitle(2131892854);
        this.A02 = (NewsletterUserReportsViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterUserReportsViewModel.class);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A05 = C72453Mb.A0s(view, 2131433113);
        this.A04 = C72453Mb.A0s(view, 2131433111);
        this.A03 = C72453Mb.A0s(view, 2131433110);
        this.A00 = AnonymousClass3MX.A0Q(view, 2131433112);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.A02;
        if (newsletterUserReportsViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        C91634g0.A00(A1G(), newsletterUserReportsViewModel.A00, new AnonymousClass5VA(view, this), 16);
    }
}
