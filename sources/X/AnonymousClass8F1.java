package X;

import android.app.Application;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8F1  reason: invalid class name */
public final class AnonymousClass8F1 extends AnonymousClass8FK {
    public final int A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final C192829p3 A02;
    public final C185479ce A03;
    public final CatalogManager A04;
    public final UserJid A05;
    public final AnonymousClass10I A06;
    public final C18600wl A07;
    public final C196469v7 A08;
    public final AnonymousClass2UJ A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8F1(Application application, C192829p3 r4, C196469v7 r5, C185479ce r6, CatalogManager catalogManager, UserJid userJid, AnonymousClass2UJ r9, AnonymousClass10I r10, C18600wl r11) {
        super(application);
        C18070vi.A0d(r4, 4);
        this.A05 = userJid;
        this.A04 = catalogManager;
        this.A02 = r4;
        this.A09 = r9;
        this.A03 = r6;
        this.A06 = r10;
        this.A08 = r5;
        this.A07 = r11;
        this.A00 = application.getResources().getDimensionPixelSize(2131168326);
    }
}
