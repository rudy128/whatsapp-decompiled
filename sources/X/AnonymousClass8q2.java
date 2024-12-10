package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8q2  reason: invalid class name */
public abstract class AnonymousClass8q2 extends C170598qH {
    public final A7L A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8q2(C62382rJ r11, C19999A2n a2n, A7L a7l, AnonymousClass1BI r14, String str, String str2, int i, long j, boolean z) {
        super(r11, a2n, r14, str, str2, i, j, z);
        C18070vi.A0d(r11, 6);
        this.A00 = a7l;
    }

    public AnonymousClass8q2 A0H(AnonymousClass1BI r23) {
        AnonymousClass1BI r8;
        A7L a7l = this.A00;
        Set set = a7l.A02;
        C18070vi.A0W(set);
        ArrayList A0E = C29351c6.A0E(set);
        Iterator it = set.iterator();
        while (true) {
            r8 = r23;
            if (!it.hasNext()) {
                break;
            }
            C196029uL r7 = (C196029uL) it.next();
            C18070vi.A0b(r7);
            if (C18070vi.A18(r7.A01, getChatJid())) {
                long j = r7.A00;
                boolean z = r7.A04;
                r7 = new C196029uL(r8, r7.A02, r7.A03, j, z);
            }
            A0E.add(r7);
        }
        Set A12 = C29431cG.A12(A0E);
        Set<C196029uL> set2 = a7l.A03;
        C18070vi.A0W(set2);
        ArrayList A0E2 = C29351c6.A0E(set2);
        for (C196029uL r9 : set2) {
            C18070vi.A0b(r9);
            if (C18070vi.A18(r9.A01, getChatJid())) {
                long j2 = r9.A00;
                boolean z2 = r9.A04;
                AnonymousClass1BI r10 = r8;
                r9 = new C196029uL(r10, r9.A02, r9.A03, j2, z2);
            }
            A0E2.add(r9);
        }
        A7L a7l2 = new A7L(A12, C29431cG.A12(A0E2), a7l.A00, a7l.A01);
        if (this instanceof AnonymousClass8q0) {
            AnonymousClass8q0 r0 = (AnonymousClass8q0) this;
            String str = r0.A07;
            boolean z3 = r0.A00;
            return new AnonymousClass8q0(r0.A00, a7l2, r8, str, r0.A04, z3, r0.A0D());
        } else if (this instanceof C170508py) {
            C170508py r02 = (C170508py) this;
            String str2 = r02.A07;
            boolean z4 = r02.A00;
            return new C170508py(r02.A00, a7l2, r8, str2, r02.A04, z4, r02.A0D());
        } else if (this instanceof C170518pz) {
            C170518pz r03 = (C170518pz) this;
            String str3 = r03.A07;
            boolean z5 = r03.A01;
            boolean z6 = r03.A00;
            return new C170518pz(r03.A00, a7l2, r8, str3, r03.A04, z5, z6, r03.A0D());
        } else {
            AnonymousClass8q1 r04 = (AnonymousClass8q1) this;
            String str4 = r04.A07;
            boolean z7 = r04.A00;
            return new AnonymousClass8q1(r04.A00, a7l2, r8, str4, r04.A04, z7, r04.A0D());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj)) || !super.equals(obj)) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.data.sync.MessageRangeMutation");
        return C18070vi.A18(this.A00, ((AnonymousClass8q2) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, super.hashCode() * 31);
    }
}
