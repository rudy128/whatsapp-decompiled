package X;

import java.util.ArrayList;
import java.util.Iterator;

public final class A2U {
    public final ArrayList A00 = AnonymousClass000.A13();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof A2U) && C18070vi.A18(this.A00, ((A2U) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ A2U(ArrayList arrayList, AnonymousClass1Y1 r3, int i) {
    }

    public C173038uQ A00() {
        C180759Nu r1;
        C173038uQ r3 = new C173038uQ(AnonymousClass8BR.A1A());
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass9MO r12 = (AnonymousClass9MO) it.next();
            if (r12 instanceof C172968uJ) {
                r1 = new C173008uN(((C172968uJ) r12).A00);
            } else if (r12 instanceof C172978uK) {
                r1 = new C172998uM(Long.valueOf(((C172978uK) r12).A00));
            } else {
                throw AnonymousClass3MW.A14();
            }
            r3.A00(r1);
        }
        return r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoPathValue(segments=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public A2U() {
    }
}
