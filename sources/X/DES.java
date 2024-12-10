package X;

public class DES implements C28502E4k {
    public final int A00;
    public final Object A01;

    public DES(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C8g() {
        switch (this.A00) {
            case 0:
                DEU deu = (DEU) this.A01;
                if (!deu.A0I) {
                    return;
                }
                if (deu.A0G == 1 || deu.A0G == 7) {
                    deu.A0G = 0;
                    deu.A0A = false;
                    deu.A00 = new C27223Da2("Failed to start operation. Operation timed out.");
                    CVA cva = deu.A01;
                    if (cva != null) {
                        cva.A00(2);
                        return;
                    }
                    return;
                } else if (deu.A0G == 2 || deu.A0G == 3 || deu.A0G == 4) {
                    deu.A0G = 0;
                    return;
                } else {
                    return;
                }
            case 1:
                C26816DEy dEy = (C26816DEy) this.A01;
                dEy.A03 = 0;
                dEy.A05 = false;
                return;
            default:
                DET det = (DET) this.A01;
                det.A09 = AnonymousClass000.A0h();
                det.A07 = new C27223Da2("Photo capture failed. Still capture timed out.");
                return;
        }
    }
}
