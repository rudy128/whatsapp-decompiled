package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9BZ  reason: invalid class name */
public abstract class AnonymousClass9BZ extends A34 {
    public int A00;
    public C201110w A01;
    public C199410f A02;
    public final AnonymousClass12M A03;
    public final AnonymousClass1EC A04;
    public final UserJid A05;
    public final AnonymousClass11P A06;

    public abstract void A0J();

    public abstract void A0K();

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (this.A02 == null || this.A01 == null) {
            A0J();
        } else {
            A0K();
        }
    }

    public AnonymousClass9BZ(AnonymousClass11P r1, AnonymousClass12M r2, AnonymousClass1EC r3, UserJid userJid) {
        C18070vi.A0o(r1, r2, r3);
        this.A06 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = userJid;
    }
}
