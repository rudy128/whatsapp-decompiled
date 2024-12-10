package X;

import com.whatsapp.consent.ConsentAgeBanViewModel;
import java.util.TimerTask;

/* renamed from: X.7T3  reason: invalid class name */
public final class AnonymousClass7T3 extends TimerTask {
    public final /* synthetic */ ConsentAgeBanViewModel A00;

    public AnonymousClass7T3(ConsentAgeBanViewModel consentAgeBanViewModel) {
        this.A00 = consentAgeBanViewModel;
    }

    public void run() {
        ConsentAgeBanViewModel consentAgeBanViewModel = this.A00;
        C128356fr r8 = consentAgeBanViewModel.A00;
        if (System.currentTimeMillis() - C21348Aid.A03(C196999vz.A00(C179589Io.HOURS, 12)) > C17890vO.A05(((C25681Pe) r8.A00).A02(), "registration_ban_timestamp")) {
            AnonymousClass1CM r1 = r8.A01;
            switch (r1.A00(false)) {
                case 27:
                case 28:
                case 29:
                    r1.A01(0);
                    break;
            }
            ((C108495bn) consentAgeBanViewModel.A04.getValue()).CQ0(C143537Du.A00);
        }
    }
}
