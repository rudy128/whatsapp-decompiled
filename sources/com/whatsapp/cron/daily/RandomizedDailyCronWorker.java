package com.whatsapp.cron.daily;

import X.AnonymousClass10E;
import X.C162178Jk;
import X.C17890vO;
import X.C180129Lg;
import X.C18070vi;
import X.C66172xk;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class RandomizedDailyCronWorker extends Worker {
    public final Context A00;

    public C180129Lg A0B() {
        ((C66172xk) ((AnonymousClass10E) C17890vO.A0H(this.A00)).Ao8.A00.A48.get()).A00(true);
        return new C162178Jk();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RandomizedDailyCronWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = context;
    }
}
