package com.whatsapp.migration.export.encryption;

import X.AnonymousClass10E;
import X.AnonymousClass190;
import X.C000100c;
import X.C17900vP;
import X.C196169uZ;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ExportEncryptionManager$KeyPrefetchWorker extends Worker {
    public final AnonymousClass190 A00;
    public final C196169uZ A01;

    public ExportEncryptionManager$KeyPrefetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C000100c A04 = C17900vP.A04(context);
        this.A00 = A04.BG6();
        this.A01 = (C196169uZ) ((AnonymousClass10E) A04).A3p.get();
    }
}
