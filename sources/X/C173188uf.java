package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.8uf  reason: invalid class name and case insensitive filesystem */
public final class C173188uf extends AnonymousClass2SE {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public C173188uf(AnonymousClass1CJ r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public Class A00() {
        return NotificationNewsletterUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterUpdate";
    }

    public void A02(C172768tz r8) {
        C20125A8k A002 = C199129zU.A00(r8);
        Class<NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate> cls = NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.class;
        String A08 = C20125A8k.A08(A002.A09(cls, "xwa2_notify_newsletter_on_metadata_update"));
        if (A08 != null) {
            try {
                AnonymousClass25J r0 = C29681ch.A03;
                C29681ch A003 = AnonymousClass25J.A00(A08);
                AnonymousClass4aS.A06(this.A00, A003);
                NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate xwa2NotifyNewsletterOnMetadataUpdate = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate) A002.A09(cls, "xwa2_notify_newsletter_on_metadata_update");
                C18070vi.A0X(xwa2NotifyNewsletterOnMetadataUpdate);
                C46162Dk A0C = ((C20131A8r) this.A02.get()).A0C(new AV8(xwa2NotifyNewsletterOnMetadataUpdate), A003);
                if (A0C != null) {
                    ((A6V) this.A01.get()).A03(A0C);
                } else {
                    Log.w("NewsletterNotificationMetadataUpdateHandler/failed to find newsletterInfo");
                }
            } catch (Exception unused) {
                Log.e("NewsletterNotificationMetadataUpdateHandler/failed to get newsletterInfo");
            }
        }
    }
}
