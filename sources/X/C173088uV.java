package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;

/* renamed from: X.8uV  reason: invalid class name and case insensitive filesystem */
public final class C173088uV extends AnonymousClass2SE {
    public final AnonymousClass00H A00;

    public C173088uV(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Class A00() {
        return NotificationNewsletterMuteChangeResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterMuteChange";
    }

    public void A02(C172768tz r6) {
        String A08;
        Enum A0D;
        C20125A8k A09 = C199129zU.A00(r6).A09(NotificationNewsletterMuteChangeResponseImpl.Xwa2NotifyNewsletterOnMuteChange.class, "xwa2_notify_newsletter_on_mute_change");
        if (A09 != null && (A08 = C20125A8k.A08(A09)) != null && (A0D = A09.A0D(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute")) != null) {
            AnonymousClass25J r0 = C29681ch.A03;
            ((A6V) this.A00.get()).A05(AnonymousClass25J.A00(A08), AnonymousClass000.A1Z(A0D, GraphQLXWA2NewsletterMuteSetting.ON));
        }
    }
}
