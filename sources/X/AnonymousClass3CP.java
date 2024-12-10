package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3CP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C34531kd A01;
    public final /* synthetic */ C33251iW A02;
    public final /* synthetic */ AnonymousClass247 A03;
    public final /* synthetic */ C692236j A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        C33251iW r12 = this.A02;
        List list = this.A05;
        AnonymousClass247 r14 = this.A03;
        C34531kd r13 = this.A01;
        C692236j r15 = this.A04;
        boolean z = this.A06;
        int i = this.A00;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jid A0S = C17880vN.A0S(it);
            C32931hz r9 = r12.A08;
            int A17 = C18070vi.A17(r14, A0S);
            C18030ve r8 = r9.A00;
            C18040vf r4 = C18040vf.A02;
            if (C18020vd.A05(r4, r8, 10725) && C18020vd.A05(r4, r8, 8529) && C18020vd.A05(r4, r8, 8783) && ((C22971Dz.A0e(A0S) && C18020vd.A05(r4, r8, 11473)) || C22971Dz.A0Y(A0S) || C22971Dz.A0U(A0S))) {
                C25931Qe r42 = r9.A02;
                AnonymousClass25F[] r1 = new AnonymousClass25F[A17];
                r1[0] = r14.A04;
                r42.A0A(r1);
                ArrayList A172 = r14.A17();
                ArrayList A133 = AnonymousClass000.A13();
                Iterator it2 = A172.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (r9.A01.A01((AnonymousClass206) next)) {
                        A133.add(next);
                    }
                }
                if (A133.size() >= 4) {
                    A13.add(A0S);
                }
            }
            A132.add(A0S);
        }
        if (A13.size() >= 1) {
            if (i > 1) {
                if (!z || (AnonymousClass9RY.A00(r14) == null && !r14.A0w())) {
                    z = false;
                } else {
                    z = true;
                }
            }
            ArrayList arrayList = A13;
            C52642bF A0G = r12.A0G(r13, r14, r15, (String) null, arrayList, i, z);
            if (C18020vd.A05(C18040vf.A02, r12.A0c, 8783)) {
                A0G.A00.A09(new C145977Ni(r14, arrayList, r13, r12, 0));
            }
        }
        if (A132.size() >= 1) {
            if (C18020vd.A05(C18040vf.A02, r12.A0c, 8783)) {
                List<AnonymousClass1D6> BOf = r12.A0u.BOf(r14);
                int size = BOf.size();
                for (AnonymousClass1D6 r3 : BOf) {
                    if (((C32911hx) r12.A1M.get()).A01((AnonymousClass206) r3.first)) {
                        r12.A0G(r13, (AnonymousClass206) r3.first, (C692236j) null, (String) null, A132, size, false);
                    }
                }
            }
        }
    }

    public /* synthetic */ AnonymousClass3CP(C34531kd r1, C33251iW r2, AnonymousClass247 r3, C692236j r4, List list, int i, boolean z) {
        this.A02 = r2;
        this.A05 = list;
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A06 = z;
        this.A00 = i;
    }
}
