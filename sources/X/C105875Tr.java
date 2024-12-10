package X;

import android.widget.TextView;
import com.whatsapp.product.newsletterenforcements.ipremediation.NewsletterReporterDetailsFragment;

/* renamed from: X.5Tr  reason: invalid class name and case insensitive filesystem */
public final class C105875Tr extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterReporterDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105875Tr(NewsletterReporterDetailsFragment newsletterReporterDetailsFragment) {
        super(1);
        this.this$0 = newsletterReporterDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C89434cS r3;
        C89424cR A04 = ((AnonymousClass4UN) obj).A01.A04();
        if (!(A04 == null || (r3 = A04.A02) == null)) {
            ((TextView) this.this$0.A05.getValue()).setText(r3.A01);
            ((TextView) this.this$0.A07.getValue()).setText(r3.A03);
            ((TextView) this.this$0.A06.getValue()).setText(r3.A02);
            C90024dP.A00(AnonymousClass3MW.A0A(this.this$0.A02), this.this$0, r3, 4);
            C90024dP.A00(AnonymousClass3MW.A0A(this.this$0.A04), this.this$0, r3, 5);
            C90024dP.A00(AnonymousClass3MW.A0A(this.this$0.A03), this.this$0, r3, 6);
        }
        return C27621Wu.A00;
    }
}
