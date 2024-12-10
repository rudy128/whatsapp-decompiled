package X;

import com.whatsapp.favorite.FavoriteManager;

/* renamed from: X.2kA  reason: invalid class name and case insensitive filesystem */
public final class C58112kA {
    public final AnonymousClass00H A00;
    public final C18600wl A01;
    public final AnonymousClass1CJ A02;
    public final C25181Nf A03;
    public final AnonymousClass1NH A04;
    public final C18030ve A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public final C1605388w A00(String str, String str2) {
        Object obj;
        C18070vi.A0d(str, 0);
        switch (str.hashCode()) {
            case -1730152220:
                if (str.equals("CONTACTS_FILTER")) {
                    obj = new C67062zB(this.A03);
                    break;
                } else {
                    return null;
                }
            case -817912192:
                if (str.equals("FAVORITES_FILTER")) {
                    obj = new C67072zC((FavoriteManager) C18070vi.A0E(this.A06));
                    break;
                } else {
                    return null;
                }
            case 72525144:
                if (str.equals("GROUP_FILTER")) {
                    obj = new Object();
                    break;
                } else {
                    return null;
                }
            case 1184498283:
                if (str.equals("CUSTOM_LIST_FILTER")) {
                    obj = new C67122zH(this.A07, this.A04.A01(C18070vi.A0M(str2)));
                    break;
                } else {
                    return null;
                }
            case 1827283464:
                if (str.equals("UNREAD_FILTER")) {
                    obj = new C67132zI(this.A02, (C42221xp) C18070vi.A0E(this.A08), this.A05);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return (C1605388w) obj;
    }

    public C58112kA(AnonymousClass1CJ r2, C25181Nf r3, AnonymousClass1NH r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, C18600wl r10) {
        C18070vi.A0w(r5, r2, r6, r7, r8);
        C18070vi.A0q(r3, r10, r9);
        C18070vi.A0d(r4, 9);
        this.A05 = r5;
        this.A02 = r2;
        this.A00 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A03 = r3;
        this.A01 = r10;
        this.A07 = r9;
        this.A04 = r4;
    }
}
