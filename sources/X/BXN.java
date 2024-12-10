package X;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class BXN extends C22812BQn {
    public CompletableFuture A00;
    public final BQm A01;
    public final AtomicBoolean A02 = BE6.A16(false);
    public final AtomicInteger A03 = new AtomicInteger(0);

    public static final void A01(C24202BxE bxE, BXN bxn) {
        CompletableFuture completableFuture = bxn.A00;
        if (completableFuture != null) {
            completableFuture.complete(AnonymousClass000.A0h());
        }
        C24712CGy.A01.A05("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER]: snAppManager error opening channel", bxE);
        BQm bQm = bxn.A01;
        C22951BWx bWx = new C22951BWx("SNAM_CONNECTION_FAIL");
        EEE[] eeeArr = BQm.A0R;
        bQm.A0C(bWx, bxE, true);
    }

    public static final void A02(BXN bxn) {
        CompletableFuture completableFuture = bxn.A00;
        if (completableFuture != null) {
            completableFuture.complete(AnonymousClass000.A0i());
        }
        C24712CGy.A01.A02("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER]: Mediastream services started on device.");
        BQm bQm = bxn.A01;
        C25838Cms cms = bQm.A0J;
        if (cms != null) {
            cms.A03("sn_app_manager_started");
        }
        bQm.A04(new BXR(bQm.A08()));
    }

    public void A07() {
        this.A01.A0F(new C27540Dh7(this));
    }

    public void A08() {
        this.A01.A0F(new C27541Dh8(this));
    }

    public BXN(BQm bQm) {
        super(bQm);
        this.A01 = bQm;
    }
}
