package com.whatsapp.conversation.conversationrow.nativeflow.reminder;

import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass1W6;
import X.C000100c;
import X.C162168Jj;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C20001A2q;
import X.C56802i3;
import X.C58272kQ;
import X.C62622rh;
import X.C98704ra;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;

public final class ScheduledReminderCleanupWorker extends C20001A2q {
    public static final long A07 = TimeUnit.DAYS.toMillis(2);
    public final C56802i3 A00;
    public final C62622rh A01;
    public final C58272kQ A02;
    public final AnonymousClass1W6 A03;
    public final AnonymousClass11P A04;
    public final C18030ve A05;
    public final AnonymousClass10I A06;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.EEC, X.Bly, java.lang.Object] */
    public EEC A08() {
        ? obj = new Object();
        if (C18020vd.A05(C18040vf.A02, this.A05, 5075)) {
            this.A06.CGF(new C98704ra(this, obj, 20));
            return obj;
        }
        this.A01.A01();
        obj.A03(new C162168Jj());
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScheduledReminderCleanupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A03 = (AnonymousClass1W6) r1.A3w.get();
        this.A01 = (C62622rh) r1.A9h.get();
        this.A02 = (C58272kQ) r1.A9i.get();
        this.A06 = A0H.CRy();
        this.A04 = A0H.CP7();
        this.A00 = (C56802i3) r1.A9W.get();
        this.A05 = A0H.BAL();
    }
}
