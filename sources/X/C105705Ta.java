package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl;

/* renamed from: X.5Ta  reason: invalid class name and case insensitive filesystem */
public final class C105705Ta extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C107565aE $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105705Ta(C107565aE r2) {
        super(1);
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1IX A0A;
        C20125A8k a8k;
        C18070vi.A0d(obj, 0);
        C20125A8k A09 = ((C20125A8k) obj).A09(NewsletterLinkPreviewCheckResponseImpl.Xwa2NewsletterMessageIntegrity.class, "xwa2_newsletter_message_integrity");
        if (A09 == null || (A0A = A09.A0A(NewsletterLinkPreviewCheckResponseImpl.Xwa2NewsletterMessageIntegrity.UrlPreviews.class, "url_previews")) == null || (a8k = (C20125A8k) C29431cG.A0b(A0A)) == null || !a8k.A0G("is_previewable")) {
            this.$callback.BhY();
        } else {
            C96904ob r4 = (C96904ob) this.$callback;
            r4.A00.A0N.A0J(new C146817Qs(12, r4.A01, r4));
        }
        return C27621Wu.A00;
    }
}
