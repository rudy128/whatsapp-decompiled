package X;

import java.util.Map;

/* renamed from: X.AZa  reason: case insensitive filesystem */
public abstract class C20797AZa implements BDN {
    public final C18030ve A00;
    public final AnonymousClass1QJ A01;
    public final C194009r1 A02;
    public final C192739ou A03;

    public void A04(Integer num, String str) {
        this.A02.A02(num, str, 2);
    }

    public Integer A00(String str, int i) {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 1546)) {
            return null;
        }
        if (str == null) {
            str = "unknown";
        }
        C192739ou r6 = this.A03;
        int A002 = r6.A00(i, "p2p_flow_tag", str);
        String A1I = AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), A002);
        Integer valueOf = Integer.valueOf(A002);
        r6.A01(valueOf, A1I, "entry_point", str);
        C63572tK A022 = this.A01.A02();
        if (A022 != null) {
            r6.A01(valueOf, AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), A002), "country", A022.A03);
        }
        Bix("new_payment", A002);
        return valueOf;
    }

    public void A01(int i, String str) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 1546)) {
            C192739ou r3 = this.A03;
            Map map = r3.A04;
            C222119a r2 = (C222119a) map.get(str);
            if (r2 == null) {
                C222219b r1 = new C222219b(r3.A01, i);
                r2 = r3.A00.A01(r1, str);
                r1.A04 = true;
                C18070vi.A0b(r2);
                map.put(str, r2);
            }
            r2.A0D("unknown", -1);
            C63572tK A022 = this.A01.A02();
            if (A022 != null) {
                r3.A01((Integer) null, str, "country", A022.A03);
            }
        }
    }

    public void A02(int i, short s) {
        Object obj;
        C192739ou r5 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        Map map = r5.A04;
        if (valueOf == null) {
            obj = map.get("p2p_flow_tag");
        } else {
            obj = map.get(AnonymousClass001.A1E(valueOf, "p2p_flow_tag", AnonymousClass000.A10()));
        }
        C222119a r3 = (C222119a) obj;
        if (r3 != null) {
            String A1I = AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), i);
            Map map2 = r5.A03;
            String A0s = C17880vN.A0s(A1I, map2);
            if (A0s != null) {
                r3.A01(i, A0s);
                map2.remove(A1I);
            }
            r3.A04(i, s);
            map.remove(A1I);
        }
    }

    public void A03(A7B a7b, String str) {
        if (a7b == null) {
            a7b = A7B.A00();
        }
        long j = (long) a7b.A00;
        C192739ou r0 = this.A03;
        B1S b1s = new B1S((Integer) null, "error_code", j);
        Map map = r0.A04;
        Object obj = map.get(str);
        if (obj != null) {
            b1s.invoke(obj);
        }
        C222119a r02 = (C222119a) map.get(str);
        if (r02 != null) {
            r02.A0C(3);
            map.remove(str);
        }
    }

    public void Bix(String str, int i) {
        Object obj;
        C192739ou r5 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            obj = r5.A04.get("p2p_flow_tag");
        } else {
            obj = r5.A04.get(AnonymousClass001.A1E(valueOf, "p2p_flow_tag", AnonymousClass000.A10()));
        }
        C222119a r4 = (C222119a) obj;
        if (r4 != null) {
            String A1I = AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), i);
            Map map = r5.A03;
            String A0s = C17880vN.A0s(A1I, map);
            if (A0s != null) {
                if (A0s.equals(str)) {
                    C17900vP.A0f("PaymentsPerfTrackerManager.markerFlowPoint used the same qpl flow point twice: ", str, AnonymousClass000.A10());
                    return;
                }
                r4.A01(i, A0s);
            }
            r4.A02(i, str);
            map.put(A1I, str);
        }
    }

    public C20797AZa(C18030ve r1, AnonymousClass1QJ r2, C194009r1 r3, C192739ou r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A05(String str, long j, int i) {
        String A1I = AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), i);
        C192739ou r3 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        C18070vi.A0d(A1I, 0);
        B1S b1s = new B1S(valueOf, str, j);
        Object obj = r3.A04.get(A1I);
        if (obj != null) {
            b1s.invoke(obj);
        }
    }

    public void A06(String str, boolean z, int i) {
        String A1I = AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), i);
        C192739ou r3 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        C18070vi.A0d(A1I, 0);
        B1T b1t = new B1T(valueOf, str, z);
        Object obj = r3.A04.get(A1I);
        if (obj != null) {
            b1t.invoke(obj);
        }
    }
}
