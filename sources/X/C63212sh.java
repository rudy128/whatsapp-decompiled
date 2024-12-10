package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2sh  reason: invalid class name and case insensitive filesystem */
public class C63212sh {
    public C62132qq A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass2R1 A06;
    public final List A07 = AnonymousClass000.A13();
    public final Set A08 = C17880vN.A12();

    public static C63212sh A00(AnonymousClass2R1 r2) {
        return new C63212sh(r2, (Integer) null);
    }

    public C62592re A02() {
        if (this.A00.A00()) {
            return new C62592re(this);
        }
        throw AnonymousClass000.A0k("none of the syncs protocols enabled");
    }

    public void A03(byte[] bArr) {
        List<byte[]> list = this.A07;
        for (byte[] equals : list) {
            if (Arrays.equals(equals, bArr)) {
                return;
            }
        }
        list.add(bArr);
    }

    public C63212sh(AnonymousClass2R1 r2, Integer num) {
        this.A06 = r2;
        this.A01 = num;
    }

    public static void A01(C63212sh r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.A03((byte[]) it.next());
        }
    }
}
