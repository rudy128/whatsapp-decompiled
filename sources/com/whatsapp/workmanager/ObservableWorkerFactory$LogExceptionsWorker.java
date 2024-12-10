package com.whatsapp.workmanager;

import X.AnonymousClass11P;
import X.AnonymousClass3LU;
import X.C18070vi;
import X.C20001A2q;
import X.EEC;
import androidx.work.WorkerParameters;

public final class ObservableWorkerFactory$LogExceptionsWorker extends C20001A2q {
    public final C20001A2q A00;
    public final AnonymousClass3LU A01;
    public final AnonymousClass11P A02;

    public EEC A07() {
        EEC A07 = this.A00.A07();
        C18070vi.A0X(A07);
        return A07;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableWorkerFactory$LogExceptionsWorker(C20001A2q a2q, AnonymousClass3LU r3, AnonymousClass11P r4, WorkerParameters workerParameters) {
        super(a2q.A00, workerParameters);
        C18070vi.A0s(a2q, r3, r4, workerParameters);
        this.A00 = a2q;
        this.A01 = r3;
        this.A02 = r4;
    }
}
