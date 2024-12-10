package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4fd  reason: invalid class name and case insensitive filesystem */
public final class C91404fd implements AnonymousClass1GE, AnonymousClass1M6 {
    public final /* synthetic */ C87764Ww A00;

    public /* synthetic */ void Bmt(UserJid userJid) {
    }

    public void Bmw(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        C87764Ww r1 = this.A00;
        if (C18070vi.A18(r1.A01, userJid)) {
            C87764Ww.A00(r1);
        }
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public void BrH(AnonymousClass1F9 r3) {
        C18070vi.A0d(r3, 0);
        C87764Ww r1 = this.A00;
        r1.A01 = null;
        r1.A00 = null;
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public C91404fd(C87764Ww r1) {
        this.A00 = r1;
    }

    public void C0B(AnonymousClass1F9 r2) {
        this.A00.A03.unregisterObserver(this);
    }

    public void C3z(AnonymousClass1F9 r3) {
        C87764Ww r1 = this.A00;
        r1.A03.registerObserver(this);
        C87764Ww.A00(r1);
    }
}
