package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ATw  reason: case insensitive filesystem */
public final class C20664ATw implements C1606989o {
    public AnonymousClass9M6 A00;
    public final /* synthetic */ A2R A01;

    public void BE5(C138506xC r8) {
        ArrayList arrayList;
        AnonymousClass9M6 r3;
        Collection values;
        C18070vi.A0d(r8, 0);
        if (r8.A00 == 0) {
            C193649qR r0 = (C193649qR) r8.A03.A00;
            if (r0 != null) {
                r3 = new AnonymousClass8lD(r0.A00, true, r0.A01);
            } else {
                r3 = new AnonymousClass8lC((List) null, C18070vi.A0M("client parsing error"), 4);
            }
        } else {
            AnonymousClass163 r32 = r8.A04;
            Map map = r32.A00;
            List list = null;
            if (map == null || (values = map.values()) == null) {
                arrayList = null;
            } else {
                List<C1404571m> A0t = C29431cG.A0t(values);
                arrayList = C29351c6.A0E(A0t);
                for (C1404571m r02 : A0t) {
                    C17890vO.A1D(arrayList, r02.A01);
                }
                if (arrayList.contains(-20)) {
                    r3 = new AnonymousClass8lC((List) null, C18070vi.A0M("client parsing error"), 4);
                }
            }
            Map map2 = r32.A00;
            if (map2 != null) {
                ArrayList<C1404571m> A11 = C72453Mb.A11(map2);
                Iterator A15 = AnonymousClass000.A15(map2);
                while (A15.hasNext()) {
                    A11.add(C17890vO.A0P(A15));
                }
                ArrayList A0E = C29351c6.A0E(A11);
                for (C1404571m r03 : A11) {
                    A0E.add(r03.A06);
                }
                list = C29431cG.A0t(A0E);
            }
            r3 = new AnonymousClass8lC(arrayList, list, 2);
        }
        this.A00 = r3;
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        this.A00 = new AnonymousClass8lC((List) null, C18070vi.A0M(iOException.getMessage()), 1);
    }

    public void Bsw(Exception exc) {
        List A0M;
        List list;
        int i;
        C18070vi.A0d(exc, 0);
        if (exc instanceof C122816Sa) {
            A0M = C18070vi.A0M(((C122816Sa) exc).error.A06);
            list = null;
            i = 2;
        } else {
            A0M = C18070vi.A0M(exc.getMessage());
            list = null;
            i = 3;
        }
        this.A00 = new AnonymousClass8lC(list, A0M, i);
    }

    public C20664ATw(A2R a2r) {
        this.A01 = a2r;
    }
}
