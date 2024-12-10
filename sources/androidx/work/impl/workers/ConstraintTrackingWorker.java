package androidx.work.impl.workers;

import X.A2t;
import X.A5Z;
import X.AnonymousClass000;
import X.AnonymousClass86L;
import X.AnonymousClass8BX;
import X.AnonymousClass8KB;
import X.AnonymousClass9T0;
import X.C113975oM;
import X.C17880vN;
import X.C180159Lj;
import X.C18070vi;
import X.C20001A2q;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;

public final class ConstraintTrackingWorker extends C20001A2q implements AnonymousClass86L {
    public C20001A2q A00;
    public final WorkerParameters A01;
    public final C113975oM A02 = new Object();
    public final Object A03 = C17880vN.A0p();
    public volatile boolean A04;

    public void A09() {
        int i;
        C20001A2q a2q = this.A00;
        if (a2q != null && a2q.A03 == -256) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = A05();
            } else {
                i = 0;
            }
            a2q.A03 = i;
            a2q.A09();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5oM, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A01 = workerParameters;
    }

    public void Bpt(C180159Lj r6, A2t a2t) {
        boolean A16 = C18070vi.A16(a2t, r6);
        AnonymousClass8BX.A12(A5Z.A00(), a2t, "Constraints changed for ", AnonymousClass9T0.A00, AnonymousClass000.A10());
        if (r6 instanceof AnonymousClass8KB) {
            synchronized (this.A03) {
                this.A04 = A16;
            }
        }
    }
}
