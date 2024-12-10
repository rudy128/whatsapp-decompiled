package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.2rd  reason: invalid class name and case insensitive filesystem */
public final class C62582rd {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;
    public final AnonymousClass19K A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06 = new C18110vm(new AnonymousClass3HZ(this));
    public final C18100vl A07 = new C18110vm(new C71443Ha(this));
    public final C18100vl A08 = new C18110vm(new C71453Hb(this));
    public final C18100vl A09 = new C18110vm(new C71463Hc(this));

    public static final void A00(C62582rd r2, String str, int i) {
        PriorityQueue priorityQueue;
        Number number;
        Integer valueOf = Integer.valueOf(i);
        ((Map) r2.A09.getValue()).remove(valueOf);
        ((Map) r2.A06.getValue()).remove(valueOf);
        ((Map) r2.A07.getValue()).remove(valueOf);
        if (!(str == null || (priorityQueue = (PriorityQueue) ((Map) r2.A08.getValue()).get(str)) == null || (number = (Number) priorityQueue.peek()) == null || i != number.intValue())) {
            priorityQueue.poll();
        }
        C17880vN.A1B(C17890vO.A0A(((C63332st) r2.A05.get()).A01), AnonymousClass001.A1I("badged_notice_", AnonymousClass000.A10(), i));
    }

    public final List A01() {
        Object obj;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A15 = AnonymousClass000.A15((Map) this.A08.getValue());
        while (A15.hasNext()) {
            Object peek = ((PriorityQueue) C17890vO.A0P(A15)).peek();
            if (!(peek == null || (obj = ((Map) this.A06.getValue()).get(peek)) == null)) {
                A13.add(obj);
            }
        }
        return A13;
    }

    public final void A02() {
        AnonymousClass00H r2 = this.A05;
        ((C63332st) r2.get()).A06(C17890vO.A0g(this.A09));
        ((C63332st) r2.get()).A04(C17890vO.A0g(this.A06));
        ((C63332st) r2.get()).A05(C17890vO.A0g(this.A07));
    }

    public final void A03(int i) {
        String str;
        C59762mq r0 = (C59762mq) AnonymousClass000.A0w((Map) this.A07.getValue(), i);
        if (r0 != null) {
            str = r0.A06;
        } else {
            str = null;
        }
        A00(this, str, i);
    }

    public final void A04(C62302rB r3) {
        C17880vN.A1O(r3, (Map) this.A06.getValue(), r3.A05.A00);
        A02();
    }

    public C62582rd(AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass118 r5, C18000vb r6, AnonymousClass19K r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r3, r5, r7, r6);
        C18070vi.A0d(r8, 6);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
    }
}
