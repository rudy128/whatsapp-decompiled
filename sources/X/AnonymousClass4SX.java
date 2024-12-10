package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4SX  reason: invalid class name */
public final class AnonymousClass4SX {
    public final C19880zA A00;
    public final C108675c7 A01;
    public final C108675c7 A02;
    public final C108675c7 A03;
    public final C108675c7 A04;
    public final C108675c7 A05;
    public final C108675c7 A06;
    public final C108675c7 A07;
    public final C108675c7 A08;
    public final C108675c7 A09;
    public final C108675c7 A0A;
    public final C108675c7 A0B;
    public final C108675c7 A0C;
    public final C108675c7 A0D;
    public final C108675c7 A0E;
    public final C108675c7 A0F;
    public final Map A0G;
    public final Map A0H;
    public final C18100vl A0I = AnonymousClass1DF.A01(new C102465Go(this));
    public final Map A0J;
    public final Map A0K = C17880vN.A11();

    public final void A01(Context context) {
        C18070vi.A0d(context, 0);
        this.A06.CQi(context);
        this.A07.CQi(context);
        this.A08.CQi(context);
        this.A09.CQi(context);
        this.A0C.CQi(context);
        this.A01.CQi(context);
        this.A04.CQi(context);
        this.A0D.CQi(context);
        this.A05.CQi(context);
        this.A02.CQi(context);
        this.A0B.CQi(context);
        this.A03.CQi(context);
        this.A0E.CQi(context);
        this.A0F.CQi(context);
        this.A0A.CQi(context);
        Iterator A15 = AnonymousClass000.A15(this.A0K);
        while (A15.hasNext()) {
            ((C108675c7) C17890vO.A0P(A15)).CQi(context);
        }
    }

    public final C108675c7 A00(int i) {
        Map map = this.A0K;
        Integer valueOf = Integer.valueOf(i);
        C108675c7 r1 = (C108675c7) map.get(valueOf);
        if (r1 != null) {
            return r1;
        }
        C108675c7 r0 = (C108675c7) this.A0J.get(valueOf);
        if (r0 == null) {
            r0 = this.A08;
        }
        C94864lJ r12 = new C94864lJ(r0);
        map.put(valueOf, r12);
        return r12;
    }

    public AnonymousClass4SX(Context context, C19880zA r7, C18000vb r8, C18030ve r9, AnonymousClass1DC r10) {
        C18070vi.A0w(context, r9, r10, r8, r7);
        this.A00 = r7;
        this.A06 = new C94884lL(context, r8, r9);
        this.A07 = new C94884lL(context, r8, r9);
        this.A08 = new C94884lL(context, r8, r9);
        this.A0C = new C94884lL(context, r8, r9);
        this.A09 = new C94884lL(context, r8, r9);
        this.A01 = new C94884lL(context, r8, r9);
        this.A04 = new C79293v2(context, r8, r9, r10);
        this.A0D = new C94884lL(context, r8, r9);
        this.A05 = new C94884lL(context, r8, r9);
        this.A02 = new C94884lL(context, r8, r9);
        this.A0B = new C94884lL(context, r8, r9);
        this.A03 = new C94884lL(context, r8, r9);
        this.A0E = new C94884lL(context, r8, r9);
        this.A0F = new C94884lL(context, r8, r9);
        this.A0A = new C94884lL(context, r8, r9);
        HashMap A11 = C17880vN.A11();
        C17890vO.A0z(this.A06, A11, 2);
        C17890vO.A0z(this.A07, A11, 3);
        C17890vO.A0z(this.A08, A11, 1);
        C17890vO.A0z(this.A0C, A11, 5);
        C17890vO.A0z(this.A09, A11, 6);
        C17890vO.A0z(this.A0D, A11, 7);
        C17890vO.A0z(this.A05, A11, 8);
        C17890vO.A0z(this.A0B, A11, 10);
        C17890vO.A0z(this.A01, A11, 11);
        C17890vO.A0z(this.A04, A11, 12);
        C17890vO.A0z(this.A02, A11, 9);
        if (this.A00.A07()) {
            C17890vO.A0z(AnonymousClass3MX.A14(this.A0I), A11, 4);
        }
        C17890vO.A0z(this.A03, A11, 13);
        C17890vO.A0z(this.A0E, A11, 15);
        C17890vO.A0z(this.A0F, A11, 17);
        C17890vO.A0z(this.A0A, A11, 16);
        this.A0H = A11;
        Set entrySet = A11.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(entrySet));
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            linkedHashMap.put(Integer.valueOf(AnonymousClass000.A0M(A16.getValue())), A16.getKey());
        }
        this.A0J = linkedHashMap;
        this.A0G = C17880vN.A11();
    }
}
