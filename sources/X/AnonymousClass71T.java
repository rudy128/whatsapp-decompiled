package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.71T  reason: invalid class name */
public final class AnonymousClass71T {
    public static final C1418377d A00(AnonymousClass77Q r27) {
        AnonymousClass77Q r1 = r27;
        C18070vi.A0d(r1, 0);
        C1418377d r2 = new C1418377d((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
        r2.A03 = r1.A02;
        r2.A02 = r1.A01;
        r2.A0I = r1.A0A;
        r2.A00 = r1.A00;
        r2.A0E = r1.A06;
        r2.A09 = r1.A04;
        r2.A0F = r1.A05;
        r2.A07 = r1.A08;
        r2.A0K = r1.A0B;
        r2.A0L = r1.A0C;
        r2.A0M = r1.A0D;
        r2.A0R = r1.A0E;
        r2.A06 = r1.A03;
        r2.A0N = true;
        return r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6oW, java.lang.Object] */
    public static final AnonymousClass725 A01(C1418377d r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        ? obj = new Object();
        obj.A0E = str;
        obj.A0G = str2;
        obj.A0I = str3;
        obj.A03 = str4;
        obj.A0F = "-1";
        obj.A0L = "-1";
        obj.A0M = "-1";
        int i = 0;
        obj.A0P = false;
        obj.A0Q = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i += C108945cZ.A0x(it).A00;
        }
        obj.A01 = (long) i;
        obj.A0O = list;
        obj.A0S = true;
        obj.A0J = str5;
        obj.A0C = str6;
        obj.A0B = str7;
        obj.A02 = r4;
        return obj.A00();
    }

    public final AnonymousClass725 A02(AnonymousClass77Q r33, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C1418377d r10;
        List list2 = list;
        C18070vi.A0d(list2, 8);
        String str8 = str;
        if (r33 != null) {
            r10 = A00(r33);
            r10.A0H = str8;
            r10.A0N = true;
        } else {
            r10 = null;
        }
        ArrayList A0D = C29351c6.A0D(list2);
        Iterator it = list2.iterator();
        while (true) {
            String str9 = str2;
            String str10 = str4;
            if (it.hasNext()) {
                AnonymousClass77Q r11 = (AnonymousClass77Q) it.next();
                C1418377d A00 = A00(r11);
                A00.A0H = str8;
                AnonymousClass737[] A01 = C137426vR.A01(A00.A09);
                String str11 = A00.A07;
                boolean z = A00.A0K;
                boolean z2 = A00.A0L;
                boolean z3 = A00.A0M;
                String str12 = A00.A06;
                String str13 = str11;
                A00.A04 = new AnonymousClass73B(str8, str9, str10, (String) null, (String) null, str13, str12, r11.A09, r11.A07, A01, 0, true, false, true, false, z, z2, z3);
                A0D.add(A00);
            } else {
                return A01(r10, str8, str9, str10, str3, str5, str6, str7, A0D);
            }
        }
    }
}
