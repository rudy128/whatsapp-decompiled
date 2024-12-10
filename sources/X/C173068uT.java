package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

/* renamed from: X.8uT  reason: invalid class name and case insensitive filesystem */
public final class C173068uT extends AnonymousClass2SE {
    public final AnonymousClass00H A00;

    public C173068uT(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Class A00() {
        return NotificationNewsletterJoinResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterJoin";
    }

    public void A02(C172768tz r9) {
        String A08;
        Object obj;
        C20125A8k A002 = C199129zU.A00(r9);
        Class<NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin> cls = NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.class;
        C20125A8k A09 = A002.A09(cls, "xwa2_notify_newsletter_on_join");
        C29681ch r4 = null;
        if (A09 == null || (A08 = C20125A8k.A08(A09)) == null) {
            ((A6V) C18070vi.A0E(this.A00)).A06("Received join notification with null JID");
            return;
        }
        try {
            AnonymousClass25J r0 = C29681ch.A03;
            obj = AnonymousClass25J.A00(A08);
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        if (C30671eK.A00(obj) != null) {
            ((A6V) C18070vi.A0E(this.A00)).A06("Unable to parse JID for join notification");
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            r4 = obj;
        }
        C29681ch r42 = r4;
        if (r42 != null) {
            A6V a6v = (A6V) this.A00.get();
            NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin xwa2NotifyNewsletterOnJoin = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin) A002.A09(cls, "xwa2_notify_newsletter_on_join");
            C18070vi.A0X(xwa2NotifyNewsletterOnJoin);
            C46162Dk A0D = ((C20131A8r) C18070vi.A0E(a6v.A07)).A0D(new AV7(xwa2NotifyNewsletterOnJoin), r42, false);
            ((AW1) a6v.A06.get()).A04(r42);
            a6v.A03(A0D);
        }
    }
}
