package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;

/* renamed from: X.Cyb  reason: case insensitive filesystem */
public class C26375Cyb implements Handler.Callback {
    public final C25841Cmv A00;
    public final C26376Cyc A01;
    public final ConditionVariable A02 = new ConditionVariable();
    public final Handler A03;

    public static void A00(C26375Cyb cyb, Long l) {
        IllegalStateException th;
        try {
            Trace.beginSection("MediaGraphRendererSession.render");
            C26376Cyc cyc = cyb.A01;
            if (cyc.A01.getLooper() == Looper.myLooper()) {
                if (!cyc.A04.A05()) {
                    cyc.A03.A00(C0H.A0l);
                    cyc.A05.Bxr();
                } else {
                    EAL eal = cyc.A05;
                    eal.Bxt();
                    try {
                        Trace.beginSection("MediaGraphHost.mMediaGraph.render()");
                        EDG edg = cyc.A00;
                        C28111Yx.A02(edg);
                        edg.CF9(cyb.A00, l);
                        Trace.endSection();
                        Trace.beginSection("MediaGraphHost.mMediaGraph.render().listeners()");
                        eal.Bxq();
                    } catch (Exception e) {
                        eal.Bxp(e);
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                    }
                    Trace.endSection();
                }
                return;
            }
            cyc.A03.A00(C0H.A0m);
            th = AnonymousClass000.A0n("render() can be only called if you already are in the render thread");
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    public void A01(Long l, boolean z) {
        Message obtain;
        this.A01.A05.Bxs();
        Handler handler = this.A03;
        if (l != null) {
            obtain = Message.obtain(handler, 1, l);
        } else {
            obtain = Message.obtain(handler, 1);
        }
        C28111Yx.A02(obtain);
        if (z) {
            handler.removeMessages(1);
        }
        handler.sendMessage(obtain);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00(this, (Long) message.obj);
        }
        return true;
    }

    public C26375Cyb(C25841Cmv cmv, C26376Cyc cyc) {
        this.A01 = cyc;
        this.A00 = cmv;
        this.A03 = new Handler(cmv.A05.A00.getLooper(), this);
    }
}
