package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: X.DKl  reason: case insensitive filesystem */
public final class C26951DKl implements OnFailureListener {
    public final /* synthetic */ C26126Cso A00;
    public final /* synthetic */ CYG A01;
    public final /* synthetic */ C25829Cmg A02;
    public final /* synthetic */ boolean A03;

    public C26951DKl(C26126Cso cso, CYG cyg, C25829Cmg cmg, boolean z) {
        this.A02 = cmg;
        this.A00 = cso;
        this.A01 = cyg;
        this.A03 = z;
    }

    public final void onFailure(Exception exc) {
        C25829Cmg cmg = this.A02;
        synchronized (cmg) {
            if (exc instanceof ApiException) {
                int i = ((ApiException) exc).mStatus.A00;
                if (i == 8001 || i == 8002) {
                    if (this.A03) {
                        cmg.A01.remove(this.A01);
                    }
                }
            }
            cmg.A02(this.A00, this.A01);
        }
    }
}
