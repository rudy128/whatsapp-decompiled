package X;

import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;

/* renamed from: X.5Tv  reason: invalid class name and case insensitive filesystem */
public final class C105915Tv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterUserReportsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105915Tv(NewsletterUserReportsListFragment newsletterUserReportsListFragment) {
        super(1);
        this.this$0 = newsletterUserReportsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0.A02;
        if (newsletterUserReportsViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        C17900vP.A0f("onReportDetailItemClicked reportId:", str, AnonymousClass000.A10());
        newsletterUserReportsViewModel.A02.A0E(new C97264pB(str));
        return C27621Wu.A00;
    }
}
