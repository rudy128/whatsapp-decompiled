package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5xp  reason: invalid class name and case insensitive filesystem */
public class C116485xp extends C116495xq {
    public final /* synthetic */ C128266fi A00;
    public final /* synthetic */ AnonymousClass6LT A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116485xp(C128266fi r1, AnonymousClass6LT r2, C24921Me r3, C18000vb r4) {
        super(r3, r4);
        this.A01 = r2;
        this.A00 = r1;
        C18070vi.A0j(r3, r4);
    }

    public int A00(AnonymousClass1E7 r6, AnonymousClass1E7 r7) {
        C128266fi r4 = this.A00;
        Class<UserJid> cls = UserJid.class;
        boolean contains = r4.A02.contains(r6.A06(cls));
        if (contains == r4.A02.contains(r7.A06(cls))) {
            return super.A00(r6, r7);
        }
        return C108975cc.A0m(contains ? 1 : 0);
    }
}
