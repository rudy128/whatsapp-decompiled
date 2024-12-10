package X;

import com.whatsapp.base.WaFragment;
import com.whatsapp.product.newsletterenforcements.disputesettlement.Hilt_DisputeSettlementBodyCopyFragment;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterEnforcementSelectActionActivity;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterSeeOptionsFragment;
import com.whatsapp.product.newsletterenforcements.ipremediation.HowToEmailTheReporterFragment;
import com.whatsapp.product.newsletterenforcements.ipremediation.NewsletterReporterDetailsFragment;

/* renamed from: X.5Tk  reason: invalid class name and case insensitive filesystem */
public final class C105805Tk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterEnforcementSelectActionActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105805Tk(NewsletterEnforcementSelectActionActivity newsletterEnforcementSelectActionActivity) {
        super(1);
        this.this$0 = newsletterEnforcementSelectActionActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        NewsletterEnforcementSelectActionActivity newsletterEnforcementSelectActionActivity = this.this$0;
        C18070vi.A0b(obj);
        C34001jj A0H = AnonymousClass3Ma.A0H(newsletterEnforcementSelectActionActivity);
        C72473Md.A19(A0H);
        if (obj instanceof C88014Xz) {
            A0H.A09(new NewsletterSeeOptionsFragment(), 2131429504);
        } else {
            if (obj instanceof C87964Xu) {
                A0H.A09(new WaFragment(), 2131429504);
                str = "DisputeSettlementBodyAboutFragment";
            } else if (obj instanceof C87984Xw) {
                A0H.A09(new WaFragment(), 2131429504);
                str = "DisputeSettlementBodySubmitFragment";
            } else if (obj instanceof C87974Xv) {
                A0H.A09(new Hilt_DisputeSettlementBodyCopyFragment(), 2131429504);
                str = "DisputeSettlementBodyCopyFragment";
            } else if (C18070vi.A18(obj, C87994Xx.A00)) {
                A0H.A09(new HowToEmailTheReporterFragment(), 2131429504);
                str = "HowToEmailTheReporterFragment";
            } else if (C18070vi.A18(obj, C88004Xy.A00)) {
                A0H.A09(new NewsletterReporterDetailsFragment(), 2131429504);
                str = "NewsletterReporterDetailsFragment";
            }
            A0H.A0H(str);
        }
        A0H.A0G = true;
        A0H.A01();
        return C27621Wu.A00;
    }
}
