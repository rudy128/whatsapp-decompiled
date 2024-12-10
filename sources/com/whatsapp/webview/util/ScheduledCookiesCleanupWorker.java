package com.whatsapp.webview.util;

import X.AnonymousClass10E;
import X.C133236oO;
import X.C162178Jk;
import X.C17890vO;
import X.C18070vi;
import X.C20001A2q;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class ScheduledCookiesCleanupWorker extends C20001A2q {
    public final C133236oO A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.EEC, X.Bly, java.lang.Object] */
    public EEC A08() {
        ? obj = new Object();
        this.A00.A00();
        obj.A03(new C162178Jk());
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScheduledCookiesCleanupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = (C133236oO) ((AnonymousClass10E) C17890vO.A0H(context)).Ao8.A00.A5D.get();
    }
}
