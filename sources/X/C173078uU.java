package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl;

/* renamed from: X.8uU  reason: invalid class name and case insensitive filesystem */
public final class C173078uU extends AnonymousClass2SE {
    public final AnonymousClass00H A00;

    public C173078uU(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Class A00() {
        return NotificationNewsletterLeaveResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterLeave";
    }

    public void A02(C172768tz r5) {
        String A08;
        Object obj;
        C20125A8k A09 = C199129zU.A00(r5).A09(NotificationNewsletterLeaveResponseImpl.Xwa2NotifyNewsletterOnLeave.class, "xwa2_notify_newsletter_on_leave");
        C29681ch r3 = null;
        if (A09 == null || (A08 = C20125A8k.A08(A09)) == null) {
            ((A6V) C18070vi.A0E(this.A00)).A06("Received leave notification with null JID");
            return;
        }
        try {
            AnonymousClass25J r0 = C29681ch.A03;
            obj = AnonymousClass25J.A00(A08);
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        if (C30671eK.A00(obj) != null) {
            ((A6V) C18070vi.A0E(this.A00)).A06("Unable to parse JID for leave notification");
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            r3 = obj;
        }
        C29681ch r32 = r3;
        if (r32 != null) {
            A6V a6v = (A6V) this.A00.get();
            AnonymousClass4aS.A06(a6v.A01, r32);
            AnonymousClass8BR.A0M(a6v.A08).A07(C179509Ig.GUEST, r32);
            ((C20131A8r) a6v.A07.get()).A0H(r32);
            A6V.A02(r32, a6v);
        }
    }
}
