package X;

import android.view.KeyEvent;

/* renamed from: X.0VE  reason: invalid class name */
public final class AnonymousClass0VE implements C16230rv {
    public AnonymousClass0CV Bii(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long A0u = AnonymousClass001.A0u(keyEvent);
            if (A0u == C03100Gp.A08) {
                return AnonymousClass0CV.A0Z;
            }
            if (A0u == C03100Gp.A09) {
                return AnonymousClass0CV.A0a;
            }
            if (A0u == C03100Gp.A0A) {
                return AnonymousClass0CV.A0V;
            }
            if (A0u == C03100Gp.A07) {
                return AnonymousClass0CV.A0U;
            }
        } else if (keyEvent.isAltPressed()) {
            long A0u2 = AnonymousClass001.A0u(keyEvent);
            if (A0u2 == C03100Gp.A08) {
                return AnonymousClass0CV.A0G;
            }
            if (A0u2 == C03100Gp.A09) {
                return AnonymousClass0CV.A0H;
            }
            if (A0u2 == C03100Gp.A0A) {
                return AnonymousClass0CV.A0C;
            }
            if (A0u2 == C03100Gp.A07) {
                return AnonymousClass0CV.A0B;
            }
        }
        return C02930Fy.A00.Bii(keyEvent);
    }
}
