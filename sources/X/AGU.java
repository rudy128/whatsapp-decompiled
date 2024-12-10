package X;

import com.whatsapp.voipcalling.Voip;

public final class AGU implements AnonymousClass1GV {
    public boolean A00;
    public final AnonymousClass1HQ A01;

    public AGU(AnonymousClass1HQ r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        C192929pG r3 = (C192929pG) obj;
        C18070vi.A0d(r3, 0);
        boolean A1W = AnonymousClass000.A1W(AnonymousClass9QW.A00(r3));
        if (this.A00 != A1W) {
            this.A00 = A1W;
            Voip.refreshCaptureDevice();
        }
    }
}
