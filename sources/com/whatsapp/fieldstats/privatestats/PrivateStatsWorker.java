package com.whatsapp.fieldstats.privatestats;

import X.AnonymousClass10E;
import X.C146747Ql;
import X.C162178Jk;
import X.C17890vO;
import X.C180129Lg;
import X.C18070vi;
import X.C63832tl;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class PrivateStatsWorker extends Worker {
    public final C63832tl A00;

    public C180129Lg A0B() {
        Log.i("PrivateStatsWorker/doWork--->>> in doWork");
        C63832tl r3 = this.A00;
        r3.A07.CGF(new C146747Ql(r3, 24));
        return new C162178Jk();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = (C63832tl) ((AnonymousClass10E) C17890vO.A0H(context)).Ao8.A00.A3u.get();
    }
}
