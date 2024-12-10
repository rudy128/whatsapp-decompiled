package X;

import com.whatsapp.usercontrol.view.UserControlBaseFragment;
import com.whatsapp.usercontrol.view.controls.UCOffersAndAnnouncementsFragment;

/* renamed from: X.7Bq  reason: invalid class name and case insensitive filesystem */
public class C143007Bq implements AnonymousClass5YY {
    public final int A00;
    public final Object A01;

    public C143007Bq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BEy() {
        C35761ml r4;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r4 = ((UCOffersAndAnnouncementsFragment) obj).A02;
        } else {
            r4 = ((UserControlBaseFragment) obj).A04;
        }
        if (r4 != null) {
            C1184763p r3 = new C1184763p();
            r3.A01 = 13;
            r3.A02 = 2;
            r3.A06 = null;
            r3.A00 = true;
            r4.A04.CGF(new C21450AkH(r4, r3, 49));
            return;
        }
        C18070vi.A11("userControlsLogger");
        throw null;
    }
}
