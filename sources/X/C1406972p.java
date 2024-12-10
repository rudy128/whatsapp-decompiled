package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.72p  reason: invalid class name and case insensitive filesystem */
public final class C1406972p {
    public final C18030ve A00;
    public final AnonymousClass118 A01;

    public static final String A00(AnonymousClass6UV r3, C123106Td r4) {
        String str;
        if (r4 instanceof C120496Dx) {
            str = ((C120496Dx) r4).A00;
        } else if (r4 instanceof C120506Dy) {
            str = ((C120506Dy) r4).A00.A07;
            if (str == null) {
                str = "sticker-without-stable-id";
            }
        } else if (r4 instanceof C120516Dz) {
            str = ((C120516Dz) r4).A01;
        } else {
            throw AnonymousClass3MW.A14();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("avatar-sticker-");
        A10.append(r3);
        return C17890vO.A0Z(str, A10, '-');
    }

    public static final String A01(AnonymousClass6UV r3, C1418377d r4) {
        String str = r4.A07;
        if (str == null) {
            str = "sticker-without-stable-id";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("avatar-sticker-");
        A10.append(r3);
        return C17890vO.A0Z(str, A10, '-');
    }

    public final String A03(AnonymousClass6UV r3) {
        AnonymousClass118 r1;
        int i;
        if (r3.equals(C120436Dr.A00)) {
            r1 = this.A01;
            i = 2131890270;
        } else if (r3.equals(C120406Do.A00)) {
            r1 = this.A01;
            i = 2131890268;
        } else if (r3.equals(C120426Dq.A00)) {
            r1 = this.A01;
            i = 2131890262;
        } else if (r3.equals(C120376Dl.A00)) {
            r1 = this.A01;
            i = 2131890264;
        } else if (r3.equals(C120386Dm.A00)) {
            r1 = this.A01;
            i = 2131890266;
        } else if (r3.equals(C120416Dp.A00) || r3.equals(C120346Di.A00)) {
            r1 = this.A01;
            i = 2131890269;
        } else if (r3.equals(C120366Dk.A00)) {
            r1 = this.A01;
            i = 2131890263;
        } else if (r3.equals(C120396Dn.A00)) {
            r1 = this.A01;
            i = 2131890267;
        } else if (r3.equals(C120356Dj.A00)) {
            r1 = this.A01;
            i = 2131890261;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return C18070vi.A0G(r1, i);
    }

    public C1406972p(AnonymousClass118 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public static final C27354DcQ A02(AnonymousClass6UV r6, String str, List list) {
        C27354DcQ A012 = AnonymousClass1ZT.A01();
        if (AnonymousClass000.A1a(list)) {
            AnonymousClass612 r4 = new AnonymousClass612(r6, r6.toString());
            A012.add(new C1177360t((AnonymousClass6UU) r4, (Integer) null, str, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1418377d A0x = C108945cZ.A0x(it);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("sticker-");
                A10.append(r6);
                A10.append('-');
                C1177260s.A00(r4, A0x, AnonymousClass000.A0y(A0x.A07, A10), A012, false);
            }
        }
        return AnonymousClass1ZT.A02(A012);
    }
}
