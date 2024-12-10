package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1mk  reason: invalid class name and case insensitive filesystem */
public final class C35751mk extends AnonymousClass11D {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35751mk(AnonymousClass00H r3) {
        super(r3, C18150vq.A00(), false);
        C18070vi.A0d(r3, 1);
    }

    public final void A00(AnonymousClass1BI r3) {
        C18070vi.A0d(r3, 0);
        notifyAllObservers(new C97014om(r3, 3));
    }

    public final void A01(UserJid userJid, String str) {
        C18070vi.A0d(userJid, 0);
        notifyAllObservers(new AnonymousClass35P(1, str, userJid));
    }
}
