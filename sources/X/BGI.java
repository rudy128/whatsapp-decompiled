package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class BGI extends ResultReceiver {
    public final /* synthetic */ CPm A00;
    public final /* synthetic */ C26204Cub A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BGI(CPm cPm, C26204Cub cub) {
        super((Handler) null);
        this.A01 = cub;
        this.A00 = cPm;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        C26204Cub cub = this.A01;
        CPm cPm = this.A00;
        long j = cPm.A01;
        Object[] A1a = AnonymousClass3MW.A1a();
        BE8.A1N(A1a, j);
        C25905CoJ.A02("id [%d]: release", A1a);
        cub.A0U.A01(j, false);
        C24858CNb cNb = cPm.A00;
        if (cNb != null) {
            cNb.A01.release();
            cNb.A00.release();
        }
    }
}
