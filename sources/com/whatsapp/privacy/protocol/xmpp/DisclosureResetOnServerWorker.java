package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass1DF;
import X.C1425079s;
import X.C153107oz;
import X.C18070vi;
import X.C18100vl;
import X.C20001A2q;
import X.C7F;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class DisclosureResetOnServerWorker extends C20001A2q {
    public final C18100vl A00;

    public EEC A08() {
        return C7F.A00(new C1425079s(this, 2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureResetOnServerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A00 = AnonymousClass1DF.A01(new C153107oz(context));
    }
}
