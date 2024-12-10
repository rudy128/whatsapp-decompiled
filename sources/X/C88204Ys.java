package X;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Ys  reason: invalid class name and case insensitive filesystem */
public final class C88204Ys {
    public C77873rd A00;
    public AnonymousClass1BI A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1UD A03;
    public final AnonymousClass73D A04 = new AnonymousClass73D();
    public final C34501ka A05;
    public final C134146q7 A06;
    public final AnonymousClass87Y A07;
    public final AnonymousClass2K6 A08;
    public final C26521Sl A09;
    public final AnonymousClass10I A0A;

    public final void A04(AnonymousClass72S r6) {
        C32071ga A052;
        C18070vi.A0d(r6, 0);
        C26521Sl r1 = this.A09;
        r1.A0n(r6.A0C());
        r1.A0n(r6.A08());
        C77873rd r0 = this.A00;
        if (r0 != null && (A052 = r0.getBitmapCaches().A05()) != null) {
            Set keySet = A052.A02.A06().keySet();
            C18070vi.A0X(keySet);
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                C18070vi.A0b(A0v);
                if (AnonymousClass1YE.A0A(A0v, C18070vi.A0H(r6.A0X), false)) {
                    A052.A0E(A0v);
                }
            }
        }
    }

    public final List A02() {
        C77873rd r0 = this.A00;
        if (r0 == null) {
            return C18460wS.A00;
        }
        List<C89334cI> list = r0.A05.A04;
        ArrayList A0D = C29351c6.A0D(list);
        for (C89334cI r02 : list) {
            A0D.add(r02.A00);
        }
        return A0D;
    }

    public final boolean A05() {
        C77873rd r0 = this.A00;
        if (r0 == null || r0.getVisibility() == 8) {
            return true;
        }
        C77873rd r3 = this.A00;
        if (r3 == null) {
            return false;
        }
        if (C18020vd.A00(C18040vf.A01, this.A03.A00, 8685) - r3.A05.A04.size() > 0) {
            return true;
        }
        return false;
    }

    public C88204Ys(AnonymousClass1KB r2, AnonymousClass1UD r3, C34501ka r4, C134146q7 r5, AnonymousClass87Y r6, AnonymousClass2K6 r7, C26521Sl r8, AnonymousClass10I r9) {
        C18070vi.A0w(r2, r9, r3, r8, r4);
        C18070vi.A0q(r5, r6, r7);
        this.A02 = r2;
        this.A0A = r9;
        this.A03 = r3;
        this.A09 = r8;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
    }

    public static final void A00(C88204Ys r4, List list) {
        String path;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r2 = (AnonymousClass1D6) it.next();
            C89334cI r1 = (C89334cI) r2.first;
            if (r1.A01 && (path = r1.A00.getPath()) != null) {
                C64062u9.A0Q(new File(path));
            }
            r4.A04((AnonymousClass72S) r2.second);
        }
    }

    public final C41731wy A01(List list) {
        C41731wy A0o = AnonymousClass3MW.A0o();
        ArrayList A13 = AnonymousClass000.A13();
        List list2 = list;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass72S r1 = new AnonymousClass72S(((C89334cI) it.next()).A00);
                this.A04.A06(r1);
                A13.add(r1);
            } else {
                this.A0A.CGN(new C21468AkZ(list2, A13, A0o, AnonymousClass000.A13(), this, 10));
                return A0o;
            }
        }
    }

    public final void A03() {
        ArrayList A13 = AnonymousClass000.A13();
        C77873rd r0 = this.A00;
        if (r0 != null) {
            for (C89334cI r3 : r0.A05.A04) {
                AnonymousClass73D r2 = this.A04;
                Uri uri = r3.A00;
                AnonymousClass1D6.A02(r3, r2.A02(uri), A13);
                r2.A03(uri);
            }
        }
        if (C17880vN.A1X(A13)) {
            this.A0A.CGF(new C21451AkI(this, A13, 17));
            this.A08.A06();
        }
    }
}
