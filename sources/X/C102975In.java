package X;

import com.whatsapp.newsletter.insights.NewsletterInsightsActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: X.5In  reason: invalid class name and case insensitive filesystem */
public final class C102975In extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ NewsletterInsightsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102975In(NewsletterInsightsActivity newsletterInsightsActivity) {
        super(0);
        this.this$0 = newsletterInsightsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashSet linkedHashSet;
        Collection<AnonymousClass4VW> A0g = C17890vO.A0g(this.this$0.A0A);
        ArrayList A13 = AnonymousClass000.A13();
        for (AnonymousClass4VW r1 : A0g) {
            if (r1 instanceof AnonymousClass43Z) {
                linkedHashSet = ((AnonymousClass43Z) r1).A00;
            } else if (r1 instanceof AnonymousClass43a) {
                linkedHashSet = ((AnonymousClass43a) r1).A0A;
            } else {
                linkedHashSet = ((AnonymousClass43Y) r1).A00;
            }
            C29401cD.A0J(linkedHashSet, A13);
        }
        return new LinkedHashSet(A13);
    }
}
