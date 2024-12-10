package com.whatsapp.service;

import X.AnonymousClass10E;
import X.AnonymousClass11E;
import X.AnonymousClass1KB;
import X.C000100c;
import X.C113975oM;
import X.C143077Bx;
import X.C146527Pl;
import X.C146777Qo;
import X.C162178Jk;
import X.C17890vO;
import X.C20001A2q;
import X.C20113A7w;
import X.C219017v;
import X.C23651Hc;
import X.EEC;
import android.content.Context;
import android.os.Handler;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

public class RestoreChatConnectionWorker extends C20001A2q {
    public final Handler A00 = C17890vO.A0D();
    public final C113975oM A01 = new Object();
    public final AnonymousClass1KB A02;
    public final C23651Hc A03;
    public final AnonymousClass11E A04;
    public final C219017v A05;

    public EEC A08() {
        C23651Hc r1 = this.A03;
        if (r1.A02()) {
            Log.i("RestoreChatConnectionWorker/doWork nothing to do");
            C113975oM r12 = this.A01;
            r12.A05(new C162178Jk());
            return r12;
        }
        C143077Bx r2 = new C143077Bx(this, 1);
        r1.registerObserver(r2);
        C113975oM r5 = this.A01;
        C146527Pl r13 = new C146527Pl(this, r2, 17);
        Executor executor = this.A02.A05;
        r5.BBG(r13, executor);
        C146777Qo r3 = new C146777Qo((Object) this, 31);
        this.A00.postDelayed(r3, C20113A7w.A0L);
        r5.BBG(new C146527Pl(this, r3, 16), executor);
        this.A05.A0E((String) null, (String) null, 0, false, true, false, false, false, this.A04.A0A());
        return r5;
    }

    public void A09() {
        this.A01.cancel(true);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5oM, java.lang.Object] */
    public RestoreChatConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = AnonymousClass10E.A12(r1);
        this.A05 = (C219017v) r1.A91.get();
        this.A03 = (C23651Hc) r1.ACD.get();
        this.A04 = A0H.BFf();
    }
}
