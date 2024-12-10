package com.whatsapp.wds.metrics.logging.network;

import X.AnonymousClass10E;
import X.C129476hr;
import X.C1425079s;
import X.C17890vO;
import X.C18070vi;
import X.C20001A2q;
import X.C7F;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class HierarchyUploadScheduler$HierarchyUploadWorker extends C20001A2q {
    public final C129476hr A00;

    public EEC A08() {
        return C7F.A00(new C1425079s(this.A00, 5));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HierarchyUploadScheduler$HierarchyUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = (C129476hr) ((AnonymousClass10E) C17890vO.A0H(context)).Ao8.A00.A2X.get();
    }
}
