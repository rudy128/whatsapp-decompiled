package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9yk  reason: invalid class name and case insensitive filesystem */
public final class C198689yk {
    public String A00;
    public String A01;
    public final AnonymousClass190 A02;
    public final C26911Ty A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final A8Q A07;
    public final C182909We A08;
    public final C51742Zl A09;
    public final AnonymousClass00H A0A;

    public C198689yk(AnonymousClass190 r2, C26911Ty r3, A8Q a8q, C182909We r5, C51742Zl r6, C18030ve r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r5, 1);
        C72473Md.A1M(a8q, r3, r8, 3);
        C18070vi.A0q(r9, r2, r7);
        C18070vi.A0d(r10, 9);
        this.A08 = r5;
        this.A09 = r6;
        this.A07 = a8q;
        this.A03 = r3;
        this.A05 = r8;
        this.A06 = r9;
        this.A02 = r2;
        this.A04 = r7;
        this.A0A = r10;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9NJ, java.lang.Object] */
    public static final C188519hY A00(C198689yk r12, C193739qa r13, AEW aew, String str, String str2, String str3) {
        UserJid userJid = r13.A00;
        int i = r12.A08.A00;
        int A032 = C72453Mb.A03(CatalogManager.A05(r12.A09.A00, userJid) ? 1 : 0) * 9;
        String str4 = r12.A07.A03;
        String str5 = r13.A01;
        ? obj = new Object();
        obj.A02 = str5;
        obj.A00 = str;
        obj.A01 = str2;
        return new C188519hY(obj, ((C192559ob) r12.A0A.get()).A00(aew, AnonymousClass9QG.A00()), userJid, (Boolean) null, str3, str4, A032, i, i, false);
    }
}
