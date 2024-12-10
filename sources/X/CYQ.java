package X;

public class CYQ {
    public final C23771BpG A00;
    public final boolean A01;

    public C25812CmP A00(C25670Ck0 ck0, Object obj, Object obj2) {
        C25812CmP cmP = new C25812CmP(ck0, this, obj2, false);
        try {
            this.A00.A03(DSB.A01, cmP, obj, "");
        } catch (C27220DZz unused) {
        }
        return cmP;
    }

    public String toString() {
        return this.A00.toString();
    }

    public CYQ(C23771BpG bpG, boolean z) {
        if ((bpG.A01 instanceof C23770BpF) && (bpG.A01() instanceof C23773BpI)) {
            C25278Cca cca = bpG;
            C25278Cca cca2 = null;
            while (true) {
                cca = cca.A01();
                if (cca instanceof C23770BpF) {
                    break;
                }
                cca2 = cca;
            }
            cca2.A01 = null;
            bpG.A01 = cca2;
            C25584CiO ciO = new C25584CiO();
            ciO.A01 = new CYQ(bpG, true);
            ciO.A03 = AnonymousClass00R.A01;
            ((C23770BpF) cca).A00 = AnonymousClass8BR.A15(ciO, new C25584CiO[1], 0);
            bpG = new C23771BpG('$');
            bpG.A01 = cca;
            bpG.A01 = cca;
        }
        this.A00 = bpG;
        this.A01 = z;
    }
}
