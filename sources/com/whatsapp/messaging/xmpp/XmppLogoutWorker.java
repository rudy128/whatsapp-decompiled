package com.whatsapp.messaging.xmpp;

import X.AnonymousClass10E;
import X.C000100c;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C29911d4;
import X.C29971dB;
import X.C57942jt;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class XmppLogoutWorker extends CoroutineWorker {
    public final C18030ve A00;
    public final C57942jt A01;
    public final C29971dB A02;
    public final C18600wl A03 = C29911d4.A00();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLogoutWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (C29971dB) r1.ACA.get();
        this.A00 = A0H.BAL();
        this.A01 = (C57942jt) r1.ACC.get();
    }
}
