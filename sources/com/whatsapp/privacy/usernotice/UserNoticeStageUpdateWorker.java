package com.whatsapp.privacy.usernotice;

import X.AnonymousClass10E;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C1425079s;
import X.C17890vO;
import X.C18070vi;
import X.C20001A2q;
import X.C26106CsQ;
import X.C33451iq;
import X.C7F;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class UserNoticeStageUpdateWorker extends C20001A2q {
    public final AnonymousClass1OZ A00;
    public final C26106CsQ A01;
    public final C33451iq A02;
    public final C000100c A03;

    public EEC A08() {
        return C7F.A00(new C1425079s(this, 4));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeStageUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A03 = A0H;
        this.A00 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = (C26106CsQ) r1.ABI.get();
        this.A02 = (C33451iq) r1.ABJ.get();
    }
}
