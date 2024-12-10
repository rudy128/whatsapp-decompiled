package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class BND extends BLR {
    public final /* synthetic */ C25613Cit A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BND(C25613Cit cit) {
        super(cit.A02, cit.A03, new C27446DfX(cit, 0), cit.A01);
        this.A00 = cit;
    }

    public void A02(Bundle bundle, Fragment fragment) {
        C25613Cit cit = this.A00;
        if (C18070vi.A18(fragment, cit.A02)) {
            bundle.putInt("key_bloks_navigation_tracker_backstack_size", cit.A01);
            Integer num = cit.A07;
            if (num != null) {
                bundle.putInt("key_bloks_navigation_tracker_parent_backstack_size", num.intValue());
            }
        }
    }

    public void A04(Fragment fragment) {
        C25613Cit cit = this.A00;
        if (C18070vi.A18(fragment, cit.A02)) {
            C26329Cxm cxm = cit.A04;
            if (!cxm.A00) {
                cxm.A00 = true;
                Application application = cxm.A01.getApplication();
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(cxm);
                }
            }
            BLR blr = cit.A05;
            if (blr != null && !blr.A00) {
                blr.A00 = true;
                AnonymousClass1GP r1 = blr.A03;
                r1.A0q(blr, false);
                r1.A0E.add(blr);
            }
            C25613Cit.A00(cit, C24269ByS.ENTER);
        }
    }

    public void A05(Fragment fragment, AnonymousClass1GP r5) {
        super.A05(fragment, r5);
        C25613Cit cit = this.A00;
        if (C18070vi.A18(fragment, cit.A02)) {
            BND bnd = cit.A06;
            if (bnd.A00) {
                bnd.A00 = false;
                AnonymousClass1GP r0 = bnd.A03;
                r0.A0p(bnd);
                r0.A0E.remove(bnd);
            }
            C26329Cxm cxm = cit.A04;
            if (cxm.A00) {
                cxm.A00 = false;
                Application application = cxm.A01.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(cxm);
                }
            }
            BLR blr = cit.A05;
            if (blr != null && blr.A00) {
                blr.A00 = false;
                AnonymousClass1GP r02 = blr.A03;
                r02.A0p(blr);
                r02.A0E.remove(blr);
            }
        }
    }
}
