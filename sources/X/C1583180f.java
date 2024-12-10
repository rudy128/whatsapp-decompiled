package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.80f  reason: invalid class name and case insensitive filesystem */
public final class C1583180f extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C111205iq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1583180f(C111205iq r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C134856rG r1;
        C120036Bc r12;
        Map map;
        Iterable iterable;
        C46162Dk r13;
        Map map2 = (Map) obj;
        C18070vi.A0d(map2, 0);
        C111205iq r3 = this.this$0;
        Iterator it = r3.A09.iterator();
        loop0:
        while (true) {
            z = false;
            while (it.hasNext()) {
                AnonymousClass1BI r2 = AnonymousClass3MZ.A10(it).A00;
                if (!(r2 instanceof C29681ch)) {
                    r2 = null;
                }
                if (!z) {
                    C29691ci A0A = r3.A06.A0A(r2);
                    if (!(A0A instanceof C46162Dk) || (r13 = (C46162Dk) A0A) == null || !r13.A0P()) {
                    }
                }
                z = true;
            }
            break loop0;
        }
        C19810z2 r0 = AnonymousClass6RL.A00;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : r0) {
            AnonymousClass6RL r02 = (AnonymousClass6RL) next;
            if (z || !r02.requiresAdmin) {
                A13.add(next);
            }
        }
        AnonymousClass1DT r32 = r3.A04;
        C134856rG r03 = (C134856rG) r32.A06();
        if (r03 != null) {
            int i = r03.A00;
            int A02 = AnonymousClass3MX.A02(A13, 1);
            if (i > A02) {
                i = A02;
            }
            r1 = new C134856rG(A13, i);
        } else {
            r1 = new C134856rG(A13, 0);
        }
        if (!C18070vi.A18(r32.A06(), r1)) {
            r32.A0E(r1);
        }
        C111205iq r5 = this.this$0;
        AnonymousClass1DT r4 = r5.A00;
        C134836rE r22 = (C134836rE) r4.A06();
        if (r22 != null) {
            List<C136216tS> list = r22.A01;
            ArrayList<C136216tS> A0D = C29351c6.A0D(list);
            for (C136216tS r7 : list) {
                AnonymousClass206 r11 = r7.A01;
                Object obj2 = map2.get(r11.A0v.toString());
                List list2 = null;
                if (!(!(obj2 instanceof C120036Bc) || (r12 = (C120036Bc) obj2) == null || (map = r12.A00) == null || (iterable = (Iterable) map.get(C1409073n.A03.A04(r7.A03))) == null)) {
                    list2 = C147027Rn.A00(iterable, 22);
                }
                A0D.add(new C136216tS(r11, r7.A02, r7.A03, list2, r7.A00, r7.A05));
            }
            r4.A0E(new C134836rE(A0D, r22.A00));
            ArrayList A132 = AnonymousClass000.A13();
            long j = 0;
            for (C136216tS r9 : A0D) {
                List<C134826rD> list3 = r9.A04;
                if (list3 != null) {
                    for (C134826rD r8 : list3) {
                        j++;
                        AnonymousClass206 r6 = r9.A01;
                        String A0H = C18070vi.A0H(r6.A0v);
                        String str = r9.A03;
                        A132.add(new C135836sq(r8, r6, C17890vO.A0Z(str, AnonymousClass000.A11(A0H), '_'), str));
                    }
                }
            }
            r5.A02.A0E(new C134846rF(A132, j));
        }
        return C27621Wu.A00;
    }
}
