package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl;

/* renamed from: X.8ub  reason: invalid class name and case insensitive filesystem */
public final class C173148ub extends AnonymousClass2SE {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C173148ub(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public Class A00() {
        return NewsletterMetadataResponseImpl.class;
    }

    public String A01() {
        return "NewsletterMetadataNotification";
    }

    public void A02(C172768tz r4) {
        C20125A8k A09 = C199129zU.A00(r4).A09(NewsletterMetadataResponseImpl.Xwa2Newsletter.class, "xwa2_newsletter");
        if (A09 != null) {
            new C20125A8k(A09.A00).A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
    }
}
