package com.whatsapp.accountswitching.notifications;

import X.A1T;
import X.A6J;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BS;
import X.C000100c;
import X.C17890vO;
import X.C18070vi;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class InactiveAccountNotificationDismissWorker extends Worker {
    public final A1T A00;
    public final A6J A01;
    public final AnonymousClass11C A02;
    public final C000100c A03;
    public final AnonymousClass11P A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InactiveAccountNotificationDismissWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(AnonymousClass8BS.A02(context));
        this.A03 = A0H;
        this.A04 = A0H.CP7();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = AnonymousClass3Ma.A0a(r1);
        AnonymousClass10G r12 = r1.Ao8.A00;
        this.A00 = (A1T) r12.A2i.get();
        this.A01 = (A6J) r12.A2g.get();
    }
}
