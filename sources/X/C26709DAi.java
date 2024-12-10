package X;

/* renamed from: X.DAi  reason: case insensitive filesystem */
public class C26709DAi implements E4A {
    public EDC A00;
    public Runnable A01;
    public final EDL A02;

    public void Bxu() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
        EDC edc = this.A00;
        if (edc != null) {
            ((C22807BPv) edc).A08 = null;
        }
    }

    public C26709DAi(EDL edl) {
        this.A02 = edl;
        if (edl instanceof DAT) {
            this.A00 = (EDC) edl.BP7(EDC.A01);
        }
    }
}
