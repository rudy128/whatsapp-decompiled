package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass00E;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C1425079s;
import X.C18070vi;
import X.C20001A2q;
import X.C33541iz;
import X.C7F;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class DisclosureGetStageByIdsWorker extends C20001A2q {
    public final AnonymousClass11P A00;
    public final AnonymousClass1OZ A01;
    public final C33541iz A02;

    public EEC A08() {
        return C7F.A00(new C1425079s(this, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureGetStageByIdsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        Class<C000100c> cls = C000100c.class;
        this.A00 = ((C000100c) AnonymousClass00E.A00(context, cls)).CP7();
        this.A01 = ((C000100c) AnonymousClass00E.A00(context, cls)).BAA();
        this.A02 = (C33541iz) ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(context, cls))).A3U.get();
    }
}
