package X;

import com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity;
import java.util.Collection;

/* renamed from: X.80Y  reason: invalid class name */
public final class AnonymousClass80Y extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterSelectToUpgradeMVActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80Y(NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity) {
        super(1);
        this.this$0 = newsletterSelectToUpgradeMVActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Collection collection = (Collection) obj;
        C112005km r1 = this.this$0.A0B;
        if (r1 == null) {
            C18070vi.A11("verifiedNewsletterSelectToUpdateMVAdapter");
            throw null;
        }
        C72453Mb.A1R(collection);
        r1.A00 = C17880vN.A10(collection);
        r1.notifyDataSetChanged();
        return C27621Wu.A00;
    }
}
