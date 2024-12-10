package X;

import android.content.Context;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9tU  reason: invalid class name and case insensitive filesystem */
public final class C195529tU {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final C196149uX A03;
    public final C26911Ty A04;
    public final C20004A2u A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public final C21132Af0 A00(Context context, UserJid userJid, int i, int i2) {
        this.A05.A01(774781666, "catalog_collections_view_tag", "CatalogModuleHelper");
        C21132Af0 af0 = new C21132Af0();
        C17880vN.A0V(this.A06).registerObserver(new AN3(context, af0, this, userJid, i, i2));
        ((CatalogManager) this.A07.get()).A0D(userJid, context.getResources().getDimensionPixelSize(2131168326));
        return af0;
    }

    public final C21132Af0 A01(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        C21132Af0 af0 = new C21132Af0();
        this.A04.A0D(new C20473AMk(af0, this, userJid, 0), userJid);
        return af0;
    }

    public final C21132Af0 A02(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        C21132Af0 af0 = new C21132Af0();
        this.A04.A0D(new C20473AMk(af0, this, userJid, 1), userJid);
        return af0;
    }

    public C195529tU(AnonymousClass1L9 r1, AnonymousClass1KB r2, AnonymousClass11S r3, C196149uX r4, C26911Ty r5, C20004A2u a2u, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r2, r1, a2u, r7, r8);
        C18070vi.A0q(r3, r5, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = a2u;
        this.A07 = r7;
        this.A06 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
