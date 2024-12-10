package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class DI7 implements E59 {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ C25528ChQ A01;

    public DI7(BasePendingResult basePendingResult, C25528ChQ chQ) {
        this.A01 = chQ;
        this.A00 = basePendingResult;
    }

    public final void BpI(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
