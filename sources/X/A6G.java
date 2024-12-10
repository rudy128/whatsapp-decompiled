package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public final class A6G {
    public Integer A00;
    public boolean A01;
    public final AnonymousClass9YB A02;
    public final C194539rt A03 = ((C194539rt) AnonymousClass12Q.A01(49489));
    public final A2X A04;
    public final AnonymousClass9RC A05 = ((AnonymousClass9RC) C221618v.A01(49487));

    public final void A03(C19980A1q a1q, Integer num, String str, String str2, Map map) {
        boolean z;
        ArrayList A10;
        String str3 = str;
        C194539rt r1 = this.A03;
        Stack stack = r1.A01;
        if (stack.size() != 0) {
            String str4 = r1.A00().A01;
            if (str == null) {
                Stack stack2 = r1.A02;
                int size = stack2.size();
                if (size >= 2) {
                    A10 = C17880vN.A10(stack2);
                } else {
                    size = stack.size();
                    if (size >= 2) {
                        A10 = C17880vN.A10(stack);
                    }
                    str3 = null;
                }
                C193989qz r0 = (C193989qz) A10.get(size - 2);
                if (r0 != null) {
                    str3 = r0.A01;
                }
                str3 = null;
            }
            C193989qz A002 = A00(this, str3);
            if (A002 != null) {
                z = A002.A00;
                A002.A00 = true;
            } else {
                z = true;
            }
            A02(a1q, num, str3, str4, str2, map, z);
        }
    }

    public final void A04(Integer num) {
        String str;
        C193989qz r0;
        C194539rt r1 = this.A03;
        Stack stack = r1.A01;
        if (stack.size() == 0) {
            C20129A8p a8p = this.A02.A00;
            a8p.A0F.A0J(a8p.A0L);
            return;
        }
        String str2 = r1.A00().A01;
        int size = stack.size();
        if (size < 2 || (r0 = (C193989qz) C17880vN.A10(stack).get(size - 2)) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        A00(this, str);
        A02((C19980A1q) null, num, str, str2, (String) null, (Map) null, true);
    }

    public static final C193989qz A00(A6G a6g, String str) {
        Stack stack;
        while (true) {
            C194539rt r5 = a6g.A03;
            Stack stack2 = r5.A02;
            if (stack2.size() == 0) {
                C193989qz r1 = null;
                while (true) {
                    stack = r5.A01;
                    if (stack.size() == 0) {
                        break;
                    }
                    String str2 = ((C193989qz) AnonymousClass8BT.A0s(stack)).A01;
                    if (C18070vi.A18(str2, str)) {
                        r1 = (C193989qz) AnonymousClass8BT.A0s(stack);
                        break;
                    }
                    if (stack.size() >= 1) {
                        stack.pop();
                    }
                    r5.A00.remove(str2);
                }
                A2X a2x = a6g.A04;
                ArrayList A10 = C17880vN.A10(stack);
                ArrayList A0D = C29351c6.A0D(A10);
                Iterator it = A10.iterator();
                while (it.hasNext()) {
                    A0D.add(((C193989qz) it.next()).A01);
                }
                a2x.A02(new C21101AeV(A0D));
                a6g.A01 = false;
                return r1;
            }
            String str3 = ((C193989qz) AnonymousClass8BT.A0s(stack2)).A01;
            if (C18070vi.A18(str3, str)) {
                return (C193989qz) AnonymousClass8BT.A0s(stack2);
            }
            if (stack2.size() >= 1) {
                stack2.pop();
            }
            r5.A00.remove(str3);
        }
    }

    public static final LinkedHashMap A01(A6G a6g, String str, String str2) {
        LinkedHashMap A13;
        Map map;
        C193999r0 r0 = (C193999r0) a6g.A03.A00.remove(str);
        if (r0 == null || (map = r0.A01) == null) {
            A13 = C17880vN.A13();
        } else {
            A13 = new LinkedHashMap(map);
        }
        A13.remove("error");
        A13.remove("is_back_triggered");
        if (str2 != null) {
            Object A012 = C25489Cgk.A00(str2).A01("$", new E6J[0]);
            C18070vi.A0X(A012);
            A13.putAll((Map) A012);
        }
        return A13;
    }

    private final void A02(C19980A1q a1q, Integer num, String str, String str2, String str3, Map map, boolean z) {
        AnonymousClass90N r6;
        if (str == null) {
            C20129A8p a8p = this.A02.A00;
            a8p.A0F.A0J(a8p.A0L);
            return;
        }
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = ":";
        String str4 = (String) C29431cG.A0b(AnonymousClass1YF.A0S(str, A1Y, 0));
        if (!C18070vi.A18(str4, C29431cG.A0b(AnonymousClass1YF.A0S(str2, C17880vN.A1a(":", 0), 0)))) {
            this.A04.A02(new C21100AeU(str4));
            return;
        }
        AnonymousClass9YB r0 = this.A02;
        Map map2 = map;
        String str5 = str3;
        if (z) {
            LinkedHashMap A012 = A01(this, str, str5);
            C20129A8p a8p2 = r0.A00;
            a8p2.A06 = num;
            C20129A8p.A04(a8p2, a1q, AnonymousClass9RD.A00(str), map2, A012, true);
            return;
        }
        LinkedHashMap A013 = A01(this, str, str5);
        C20129A8p a8p3 = r0.A00;
        a8p3.A06 = num;
        String A002 = AnonymousClass9RD.A00(str);
        AnonymousClass9YC r02 = a8p3.A0H;
        C18070vi.A0d(A002, 0);
        C184829ba r62 = (C184829ba) ((Map) AnonymousClass8BT.A0s(r02.A00)).get(A002);
        String str6 = null;
        if (!(r62 instanceof AnonymousClass90N) || (r6 = (AnonymousClass90N) r62) == null) {
            throw AnonymousClass8BR.A0v(AnonymousClass001.A1H("state not found for name: ", A002, AnonymousClass000.A10()));
        }
        if (map != null) {
            str6 = r6.A02;
        }
        C20129A8p.A02(a8p3, r6, (C19980A1q) null, AnonymousClass00R.A0C, str6, A68.A00.A02(r6.A01, r6.A02, map2, A013));
    }

    public A6G(AnonymousClass9YB r2, A2V a2v, String str, boolean z) {
        C72473Md.A1I(a2v, r2);
        this.A02 = r2;
        this.A01 = z;
        this.A04 = a2v.A02(str);
    }
}
