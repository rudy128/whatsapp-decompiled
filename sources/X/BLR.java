package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class BLR extends C27461We implements AnonymousClass1J9 {
    public boolean A00;
    public String A01;
    public final int A02;
    public final AnonymousClass1GP A03;
    public final C22821Di A04;
    public final Fragment A05;

    public void A00() {
        C22821Di r1;
        C24269ByS byS;
        int A0K = this.A03.A0K() - this.A02;
        if (A0K == 1) {
            r1 = this.A04;
            byS = C24269ByS.EXIT_FORWARD;
        } else if (A0K <= -1) {
            r1 = this.A04;
            byS = C24269ByS.EXIT_BACKWARD;
        } else {
            return;
        }
        r1.invoke(byS);
    }

    public void A01(Bundle bundle, Fragment fragment) {
        if (!C18070vi.A18(fragment, this.A05) && this.A01 == null && bundle == null) {
            String A0h = BE8.A0h(fragment);
            C18070vi.A0X(A0h);
            this.A01 = A0h;
            this.A04.invoke(C24269ByS.EXIT_FORWARD);
        }
    }

    public void onBackStackChanged() {
        C22821Di r1;
        C24269ByS byS;
        int A0K = this.A03.A0K() - this.A02;
        if (A0K == 1) {
            r1 = this.A04;
            byS = C24269ByS.EXIT_FORWARD;
        } else if (A0K <= -1) {
            r1 = this.A04;
            byS = C24269ByS.EXIT_BACKWARD;
        } else if (A0K == 0) {
            r1 = this.A04;
            byS = C24269ByS.ENTER;
        } else {
            return;
        }
        r1.invoke(byS);
    }

    public BLR(Fragment fragment, AnonymousClass1GP r2, C22821Di r3, int i) {
        this.A05 = fragment;
        this.A03 = r2;
        this.A02 = i;
        this.A04 = r3;
    }

    public void A05(Fragment fragment, AnonymousClass1GP r4) {
        String A0h = BE8.A0h(fragment);
        C18070vi.A0X(A0h);
        if (A0h.equals(this.A01)) {
            this.A04.invoke(C24269ByS.ENTER);
            this.A01 = null;
        }
    }
}
