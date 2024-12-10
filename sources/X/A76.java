package X;

import com.whatsapp.jid.UserJid;

public final class A76 {
    public static final UserJid A03(C24851Lx r2, C18030ve r3, UserJid userJid) {
        StringBuilder A19 = AnonymousClass3MZ.A19(r2, 2);
        A19.append("CatalogCacheManageruserJid is LidUserJid: ");
        C17900vP.A0r(A19, userJid instanceof AnonymousClass1E2);
        if (C18020vd.A05(C18040vf.A02, r3, 11342)) {
            return r2.A00(userJid);
        }
        return userJid;
    }

    public static C198639yf A00(C20114A7x a7x, UserJid userJid) {
        A76 a76 = C20114A7x.A08;
        C18030ve r1 = a7x.A01;
        Object obj = a7x.A03.get();
        C18070vi.A0X(obj);
        return (C198639yf) a7x.A04.get(a76.A04((C24851Lx) obj, r1, userJid));
    }

    public static UserJid A02(C20114A7x a7x, UserJid userJid) {
        A76 a76 = C20114A7x.A08;
        C18030ve r1 = a7x.A01;
        Object obj = a7x.A03.get();
        C18070vi.A0X(obj);
        return a76.A04((C24851Lx) obj, r1, userJid);
    }

    public static UserJid A01(A76 a76, C18030ve r2, UserJid userJid, AnonymousClass00H r4) {
        Object obj = r4.get();
        C18070vi.A0X(obj);
        return a76.A04((C24851Lx) obj, r2, userJid);
    }

    public final UserJid A04(C24851Lx r2, C18030ve r3, UserJid userJid) {
        C18070vi.A0i(userJid, r2);
        UserJid A03 = A03(r2, r3, userJid);
        C17960vV.A07(A03);
        C18070vi.A0X(A03);
        return A03;
    }
}
