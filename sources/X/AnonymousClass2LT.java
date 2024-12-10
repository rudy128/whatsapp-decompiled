package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2LT  reason: invalid class name */
public final class AnonymousClass2LT extends AnonymousClass17A {
    public final AnonymousClass00H A00;

    public final void A00(AnonymousClass1E1 r9, AnonymousClass1E1 r10, PhoneUserJid phoneUserJid) {
        C18070vi.A0h(r9, phoneUserJid);
        notifyAllObservers(new C97054oq(r10, r9, phoneUserJid, 1));
        ((AnonymousClass10I) this.A00.get()).CGS(new C70833Cr((Object) this, (Object) r9, (Object) phoneUserJid, (Object) r10, 26), "WaJidMapRepository/setJidMapping");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2LT(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r3, false);
        C18070vi.A0j(r2, r3);
        this.A00 = r2;
    }
}
