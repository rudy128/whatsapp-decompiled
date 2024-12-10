package X;

import java.util.ArrayList;

/* renamed from: X.247  reason: invalid class name */
public final class AnonymousClass247 extends AnonymousClass206 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final AnonymousClass25F A04 = A0N(C692536m.class);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass247(AnonymousClass205 r2, long j) {
        super(r2, 99, j);
        C18070vi.A0d(r2, 1);
    }

    public final ArrayList A17() {
        ArrayList arrayList;
        C692536m r0 = (C692536m) this.A04.A02;
        if (r0 == null || (arrayList = (ArrayList) r0.A00.first) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final ArrayList A18() {
        ArrayList arrayList;
        C692536m r0 = (C692536m) this.A04.A02;
        if (r0 == null || (arrayList = (ArrayList) r0.A00.second) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final void A19(ArrayList arrayList, ArrayList arrayList2) {
        this.A04.A02(new C692536m(new AnonymousClass1D6(arrayList, arrayList2)));
    }
}
