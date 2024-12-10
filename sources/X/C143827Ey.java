package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Ey  reason: invalid class name and case insensitive filesystem */
public final class C143827Ey implements C72113Kr {
    public final C145127Ka A00;

    public C143827Ey(C145127Ka r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void Bqf() {
        Long l;
        Long l2;
        Long l3;
        AnonymousClass21V A0b;
        C145127Ka r10 = this.A00;
        C132016m2 r0 = r10.A04;
        ArrayList A13 = AnonymousClass000.A13();
        C18100vl r02 = r0.A01;
        SharedPreferences.Editor A0A = C17890vO.A0A(r02);
        C18070vi.A0X(A0A);
        Map<String, ?> all = C17880vN.A0C(r02).getAll();
        C18070vi.A0X(all);
        Iterator A15 = AnonymousClass000.A15(all);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object value = A16.getValue();
            if (!(A0x == null || A0x.length() == 0)) {
                C136646u9 A002 = C123886Wf.A00(String.valueOf(value));
                A002.A0D = A0x;
                A13.add(A002);
                A0A.remove(A0x);
            }
        }
        A0A.apply();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C136646u9 r9 = (C136646u9) it.next();
            if (r9.A0D != null) {
                Long l4 = null;
                AnonymousClass64G r7 = new AnonymousClass64G();
                String str = r9.A0D;
                r7.A0C = str;
                r7.A02 = r9.A01;
                r7.A04 = r9.A07;
                r7.A05 = r9.A0A;
                Long l5 = null;
                if (str != null) {
                    Iterator it2 = ((AnonymousClass1ST) r10.A0A.get()).A0D((C42621yT) null, str, -1).iterator();
                    while (true) {
                        if (!it2.hasNext() || (A0b = C17880vN.A0b(it2)) == null) {
                            break;
                        }
                        long j = A0b.A00;
                        if (j != 0) {
                            l5 = Long.valueOf(j);
                            break;
                        }
                    }
                }
                r7.A06 = l5;
                Integer num = r9.A03;
                if (num != null) {
                    l = C17890vO.A0N(num);
                } else {
                    l = null;
                }
                r7.A07 = l;
                r7.A0D = r9.A0E;
                r7.A00 = r9.A00;
                r7.A03 = r9.A02;
                r7.A09 = r9.A0C;
                Integer num2 = r9.A08;
                if (num2 != null) {
                    l2 = C17890vO.A0N(num2);
                } else {
                    l2 = null;
                }
                r7.A0A = l2;
                Integer num3 = r9.A09;
                if (num3 != null) {
                    l3 = C17890vO.A0N(num3);
                } else {
                    l3 = null;
                }
                r7.A0B = l3;
                r7.A01 = r9.A05;
                Integer num4 = r9.A06;
                if (num4 != null) {
                    l4 = C17890vO.A0N(num4);
                }
                r7.A08 = l4;
                r10.A03.CC7(r7);
            }
        }
    }
}
