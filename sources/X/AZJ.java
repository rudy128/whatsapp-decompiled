package X;

import java.util.Map;

public final class AZJ implements BBM {
    public final /* synthetic */ C20129A8p A00;
    public final /* synthetic */ C195919u9 A01;
    public final /* synthetic */ AnonymousClass90N A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public AZJ(C20129A8p a8p, C195919u9 r2, AnonymousClass90N r3, String str, String str2, Map map) {
        this.A00 = a8p;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = str2;
        this.A01 = r2;
        this.A05 = map;
    }

    public void Btu(C19980A1q a1q, Map map) {
        String A002;
        String str;
        C20129A8p a8p = this.A00;
        C192289o7 r5 = a8p.A03;
        if (r5 == null) {
            str = "fcsLoadingEventManager";
        } else {
            Integer num = AnonymousClass00R.A0Y;
            String str2 = this.A04;
            AnonymousClass90N r2 = this.A02;
            r5.A00(a1q, num, str2, r2.A00(), this.A03, map);
            C20129A8p.A07(a8p, "actionPerformed");
            C20129A8p.A08(a8p, "action_performed", "submit");
            C192819p2 r1 = a8p.A05;
            if (r1 != null) {
                C187379fi r0 = a8p.A01;
                if (r0 == null) {
                    str = "flowManager";
                } else {
                    r1.A01((String) AnonymousClass8BT.A0s(r0.A03));
                }
            }
            Map A012 = r2.A01(this.A05, map);
            C198949zB r12 = r2.A00;
            if (r12 == null || (A002 = r12.A00(a1q.A02)) == null) {
                C176198zw r02 = a8p.A0G;
                r02.A01.A04(a8p.A00, 3);
                C20129A8p.A06(a8p, a1q, A012);
                return;
            }
            C20129A8p.A05(a8p, a1q, A002, A012, 3);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void C7V(Map map) {
        C20129A8p a8p = this.A00;
        C192289o7 r4 = a8p.A03;
        Object obj = null;
        if (r4 == null) {
            C18070vi.A11("fcsLoadingEventManager");
            throw null;
        }
        Integer num = AnonymousClass00R.A0N;
        String str = this.A04;
        AnonymousClass90N r1 = this.A02;
        r4.A00((C19980A1q) null, num, str, r1.A00(), this.A03, map);
        C20129A8p.A07(a8p, "actionPerformed");
        C20129A8p.A08(a8p, "action_performed", "submit");
        C192819p2 r42 = a8p.A05;
        if (r42 != null) {
            C187379fi r0 = a8p.A01;
            if (r0 == null) {
                C18070vi.A11("flowManager");
                throw null;
            }
            r42.A01((String) AnonymousClass8BT.A0s(r0.A03));
        }
        if (this.A01 instanceof AnonymousClass909) {
            if (map != null) {
                obj = map.get("resumable_data");
            }
            if (obj instanceof Map) {
                Map A0v = AnonymousClass8BW.A0v("resumable_data", map);
                C192819p2 r02 = a8p.A05;
                if (!(r02 == null || A0v == null)) {
                    ((C195039sh) r02.A06.peek()).A03.putAll(A0v);
                }
            }
        }
        C20129A8p.A05(a8p, (C19980A1q) null, r1.A00, r1.A01(this.A05, map), 2);
    }
}
