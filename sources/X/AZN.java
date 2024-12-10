package X;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class AZN implements BBN {
    public final /* synthetic */ C189539jP A00;
    public final /* synthetic */ AnonymousClass90O A01;
    public final /* synthetic */ C20130A8q A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public AZN(C189539jP r1, AnonymousClass90O r2, C20130A8q a8q, String str, Map map, Map map2) {
        this.A02 = a8q;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A05 = map;
        this.A04 = map2;
    }

    public void Bu4(C19976A1m a1m) {
        AnonymousClass90O r5 = this.A01;
        Map map = this.A04;
        AnonymousClass90O.A00(this.A00, r5, new C19980A1q(Integer.valueOf((int) a1m.A00), "", a1m.A01), map, (Map) null);
    }

    public void Bu5(AnonymousClass9DP r12) {
        C20130A8q a8q = this.A02;
        AnonymousClass90O r0 = this.A01;
        String str = r0.A01;
        String str2 = r0.A05;
        String str3 = this.A03;
        AnonymousClass9DO r02 = (AnonymousClass9DO) ((AnonymousClass9DE) r12.A00).A05;
        if (r02 != null) {
            AnonymousClass9DH r4 = (AnonymousClass9DH) r02.A00;
            AnonymousClass9YC r03 = a8q.A0A;
            LinkedHashMap A012 = C20130A8q.A01(a8q, r4, str2);
            Stack stack = r03.A00;
            stack.add(C17880vN.A11());
            ((Map) AnonymousClass8BT.A0s(stack)).putAll(A012);
            if (str3 != null) {
                a8q.A0J.put(str2, str3);
                C184769bU r04 = (C184769bU) a8q.A0K.get(str3);
                if (r04 != null) {
                    r04.A00.A0B();
                }
            }
            C20129A8p a8p = a8q.A00;
            if (a8p != null) {
                String str4 = r4.A02;
                long size = (long) ((List) r4.A01).size();
                C187379fi r42 = a8p.A01;
                if (r42 == null) {
                    C18070vi.A11("flowManager");
                    throw null;
                }
                Stack stack2 = r42.A04;
                ((Deque) AnonymousClass8BT.A0s(stack2)).addFirst(str);
                LinkedList A14 = AnonymousClass8BR.A14();
                A14.addLast(str4);
                stack2.add(A14);
                r42.A03.add(str2);
                C20129A8p.A07(a8p, "queueEmbeddedSubflowStates");
                C176198zw r05 = a8p.A0G;
                r05.A01.A09("num_states_queued", a8p.A00, size, true);
                C20129A8p.A00(a8p);
            }
        }
        C20062A5l.A02(a8q, r12);
        this.A00.A00((String) null, this.A05);
    }
}
