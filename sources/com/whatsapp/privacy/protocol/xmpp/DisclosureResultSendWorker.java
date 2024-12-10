package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass10E;
import X.AnonymousClass112;
import X.AnonymousClass1OZ;
import X.AnonymousClass6XF;
import X.C000100c;
import X.C1425079s;
import X.C17890vO;
import X.C18070vi;
import X.C194159rG;
import X.C20001A2q;
import X.C33461ir;
import X.C7F;
import X.EEC;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;

public final class DisclosureResultSendWorker extends C20001A2q {
    public final AnonymousClass1OZ A00;
    public final Context A01;
    public final C33461ir A02;

    public EEC A08() {
        return C7F.A00(new C1425079s(this, 3));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.EEC, X.Bly, java.lang.Object] */
    public EEC A07() {
        Notification A002;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i < 23 || (A002 = AnonymousClass6XF.A00(this.A01)) == null) {
            return super.A07();
        }
        ? obj = new Object();
        obj.A03(new C194159rG(93, A002, AnonymousClass112.A06() ? 1 : 0));
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureResultSendWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        this.A01 = context;
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = A0H.BAA();
        this.A02 = (C33461ir) ((AnonymousClass10E) A0H).A8h.get();
    }
}
