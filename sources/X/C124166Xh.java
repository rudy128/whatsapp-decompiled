package X;

import java.io.File;

/* renamed from: X.6Xh  reason: invalid class name and case insensitive filesystem */
public abstract class C124166Xh {
    public static final C1418377d A00(C25311Ns r31, AnonymousClass70H r32, C136656uA r33) {
        C136656uA r2 = r33;
        C18070vi.A0d(r2, 0);
        AnonymousClass70H r1 = r32;
        C18070vi.A0d(r1, 1);
        String str = r2.A0C;
        String str2 = r2.A0E;
        File A04 = r31.A04(str, str2);
        if (!A04.exists()) {
            return null;
        }
        C1418377d r8 = new C1418377d((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
        r8.A0F = str;
        C108945cZ.A1O(r8, A04);
        r8.A01 = 1;
        r8.A0I = r2.A0F;
        r8.A0A = r2.A0B;
        r8.A08 = r2.A09;
        r8.A0E = str2;
        r8.A0D = r2.A0D;
        r8.A00 = r2.A04;
        r8.A03 = r2.A06;
        r8.A02 = r2.A05;
        r8.A09 = r2.A0A;
        r8.A0P = r2.A0H;
        r8.A0C = r2.A01;
        r8.A07 = r2.A00;
        r8.A0Q = r2.A03;
        r1.A05(r8);
        return r8;
    }
}
