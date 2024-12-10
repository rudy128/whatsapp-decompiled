package com.whatsapp.workers.ntp;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.C000100c;
import X.C131256kn;
import X.C132726nS;
import X.C17890vO;
import X.C180129Lg;
import X.C18030ve;
import X.C18070vi;
import X.C22631Cp;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class NtpSyncWorker extends Worker {
    public static final C131256kn A05 = new Object();
    public static volatile long A06;
    public final Context A00;
    public final AnonymousClass11P A01;
    public final C22631Cp A02;
    public final C18030ve A03;
    public final C132726nS A04;

    public C180129Lg A0B() {
        return A05.A00(this.A00, this.A01, this.A02, this.A03, this.A04);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NtpSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = context;
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        C000100c A0H = C17890vO.A0H(applicationContext);
        this.A01 = A0H.CP7();
        this.A03 = A0H.BAL();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (C22631Cp) r1.A3V.get();
        this.A04 = AnonymousClass10G.AEl(r1.Ao8.A00);
    }
}
