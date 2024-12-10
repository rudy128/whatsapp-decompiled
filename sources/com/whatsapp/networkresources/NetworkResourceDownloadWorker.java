package com.whatsapp.networkresources;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.B8O;
import X.C17900vP;
import X.C56532hc;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class NetworkResourceDownloadWorker extends Worker implements B8O {
    public final C56532hc A00;

    public boolean BeV() {
        return AnonymousClass000.A1S(this.A03, -256);
    }

    public NetworkResourceDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (C56532hc) ((AnonymousClass10E) C17900vP.A04(context)).A4G.get();
    }
}
