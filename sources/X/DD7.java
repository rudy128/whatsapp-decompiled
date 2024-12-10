package X;

public final class DD7 implements E4W {
    public final E4W A00;
    public final CNH A01;

    public DD7(E4W e4w, CNH cnh) {
        C18070vi.A0j(e4w, cnh);
        this.A00 = e4w;
        this.A01 = cnh;
    }

    public void CCn(C25268CcD ccD, ECs eCs) {
        C18070vi.A0h(ccD, eCs);
        if (!C26212Cuq.A04()) {
            C22865BSt bSt = new C22865BSt(ccD, eCs, ((DDI) eCs).A05, this);
            C25027CUe.A00(eCs, this, bSt, 6);
            CNH cnh = this.A01;
            synchronized (cnh) {
                cnh.A01.execute(bSt);
            }
            return;
        }
        C26212Cuq.A03("ThreadHandoffProducer#produceResults");
        try {
            C22865BSt bSt2 = new C22865BSt(ccD, eCs, ((DDI) eCs).A05, this);
            C25027CUe.A00(eCs, this, bSt2, 6);
            CNH cnh2 = this.A01;
            synchronized (cnh2) {
                cnh2.A01.execute(bSt2);
            }
            C26212Cuq.A01();
        } catch (Throwable th) {
            C26212Cuq.A01();
            throw th;
        }
    }
}
