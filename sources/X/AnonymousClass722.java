package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.722  reason: invalid class name */
public class AnonymousClass722 {
    public AnonymousClass7MX A00;
    public C111185ii A01;
    public AnonymousClass6MX A02;
    public AnonymousClass8AV A03;
    public List A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C19830z4 A07;
    public final C134226qF A08 = new AnonymousClass6H5(this, 4);
    public final C134226qF A09 = new AnonymousClass6H5(this, 3);
    public final C134226qF A0A = new AnonymousClass6H5(this, 5);
    public final AnonymousClass2LK A0B;
    public final AnonymousClass1SB A0C;
    public final AnonymousClass6pA A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F;
    public final HashMap A0G;
    public final HashMap A0H;
    public final HashSet A0I;

    public static void A00(AnonymousClass722 r6) {
        AnonymousClass722 r5 = r6;
        if (r6.A01 != null) {
            C17890vO.A0t(r6.A02);
            AnonymousClass6Hn r1 = new AnonymousClass6Hn(r6.A07, r6.A0C, r6.A0D, r5, true);
            r5.A02 = r1;
            C17890vO.A0u(r1, r5.A0E);
        }
    }

    public static void A01(AnonymousClass722 r6, String str, List list) {
        List list2 = list;
        r6.A04 = list;
        AnonymousClass8AV r0 = r6.A03;
        if (r0 != null) {
            String str2 = str;
            r0.CKs(str2, r6.A0H, r6.A0G, r6.A0I, list2);
        }
    }

    public void A03() {
        C17890vO.A0t(this.A02);
        AnonymousClass1SB r3 = this.A0C;
        AnonymousClass6Hn r1 = new AnonymousClass6Hn(this.A07, r3, this.A0D, this, false);
        this.A02 = r1;
        AnonymousClass3MW.A1T(r1, this.A0E, 0);
    }

    public AnonymousClass722(C19830z4 r3, AnonymousClass2LK r4, AnonymousClass1SB r5, AnonymousClass6pA r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        this.A0C = r5;
        this.A0E = r7;
        this.A0B = r4;
        this.A07 = r3;
        this.A0F = r8;
        this.A0I = C17880vN.A12();
        this.A0D = r6;
        this.A0H = C17880vN.A11();
        this.A0G = C17880vN.A11();
    }

    public ArrayList A02(List list, List list2) {
        HashSet A12 = C17880vN.A12();
        HashSet A122 = C17880vN.A12();
        ArrayList A13 = AnonymousClass000.A13();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1418377d A0x = C108945cZ.A0x(it);
                String str = A0x.A0C;
                if (!A122.contains(str)) {
                    if (!AnonymousClass1EG.A0H(str)) {
                        A122.add(str);
                    }
                    A13.add(A0x);
                    A12.add(A0x.A0F);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C1418377d A0x2 = C108945cZ.A0x(it2);
                String str2 = A0x2.A0C;
                if (!A122.contains(str2)) {
                    if (!AnonymousClass1EG.A0H(str2)) {
                        A122.add(str2);
                    }
                    C108985cd.A1E(A0x2.A0F, A0x2, A12, A13);
                }
            }
        }
        List list3 = this.A04;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Iterator it4 = C108945cZ.A0y(it3).A07.iterator();
                while (it4.hasNext()) {
                    C1418377d A0x3 = C108945cZ.A0x(it4);
                    String str3 = A0x3.A0C;
                    if (!A122.contains(str3)) {
                        if (!AnonymousClass1EG.A0H(str3)) {
                            A122.add(str3);
                        }
                        C108985cd.A1E(A0x3.A0F, A0x3, A12, A13);
                    }
                }
            }
        }
        return A13;
    }
}
