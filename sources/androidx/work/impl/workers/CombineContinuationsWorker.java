package androidx.work.impl.workers;

import X.C162178Jk;
import X.C180129Lg;
import X.C18070vi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class CombineContinuationsWorker extends Worker {
    public C180129Lg A0B() {
        return new C162178Jk(this.A01.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
    }
}
