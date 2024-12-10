package X;

/* renamed from: X.DNa  reason: case insensitive filesystem */
public final class C26952DNa implements E6G {
    public final /* synthetic */ CQK A00;
    public final /* synthetic */ E6G A01;

    public C26952DNa(CQK cqk, E6G e6g) {
        this.A00 = cqk;
        this.A01 = e6g;
    }

    public /* bridge */ /* synthetic */ void C5q(Object obj) {
        C25138CZo cZo = (C25138CZo) obj;
        C18070vi.A0d(cZo, 0);
        CQK cqk = this.A00;
        Object obj2 = cqk.A02;
        E6G e6g = this.A01;
        synchronized (obj2) {
            C25166CaH caH = cqk.A00;
            if (caH == null) {
                C18070vi.A11("snapshot");
                throw null;
            }
            C25166CaH caH2 = new C25166CaH(cZo, caH.A01);
            cqk.A00 = caH2;
            e6g.C5q(caH2);
        }
    }
}
