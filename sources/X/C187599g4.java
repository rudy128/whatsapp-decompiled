package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9g4  reason: invalid class name and case insensitive filesystem */
public final class C187599g4 {
    public UserJid A00;
    public final C192789oz A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final BAK A05;

    public C187599g4(C192789oz r3, AnonymousClass118 r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r6, r7, r3, r5, r4);
        this.A04 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        AND and = new AND(this, 0);
        this.A05 = and;
        ((CatalogManager) r6.get()).A08.add(and);
    }
}
