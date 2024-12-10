package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6xP  reason: invalid class name and case insensitive filesystem */
public final class C138626xP {
    public final AnonymousClass1KB A00;
    public final C32011gU A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public C138626xP(AnonymousClass1KB r1, C32011gU r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r7;
    }

    public static final void A00(C122646Re r6, C138626xP r7, List list, Map map, int i) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A0o = C108965cb.A0o(map, C17890vO.A07(it));
            if (A0o == null) {
                C17960vV.A0F(false, "CrosspostRequestManager/Cannot find corresponding messageRowId for given uniqueId");
            } else {
                A13.add(A0o);
            }
        }
        AnonymousClass1KB r5 = r7.A00;
        Object A0E = C18070vi.A0E(r7.A02);
        AnonymousClass00H r1 = r7.A05;
        C18070vi.A0d(r6, 1);
        AnonymousClass73E r2 = (AnonymousClass73E) r1.get();
        ContentValues A08 = C17880vN.A08();
        C17880vN.A18(A08, "state", i);
        r2.A03().A04(r6, A13, i);
        AnonymousClass73E.A01(A08, r6, r2, A13);
        AnonymousClass7RN.A00(r5, A0E, A13, 38);
    }
}
