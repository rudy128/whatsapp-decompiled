package X;

public class CVC {
    public final /* synthetic */ DET A00;

    public CVC(DET det) {
        this.A00 = det;
    }

    public void A00(C25581CiL ciL) {
        C25203Caw caw;
        if (ciL.A04 == null && ciL.A01 == null) {
            DET det = this.A00;
            det.A09 = AnonymousClass000.A0h();
            det.A07 = new C27223Da2("Could not retrieve data from photo processor.");
            caw = det.A03;
        } else {
            DET det2 = this.A00;
            det2.A09 = AnonymousClass000.A0i();
            det2.A08 = ciL;
            if (det2.A05) {
                C25648Cje cje = det2.A02;
                if (cje.A01[((cje.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
            caw = det2.A03;
        }
        caw.A01();
    }
}
