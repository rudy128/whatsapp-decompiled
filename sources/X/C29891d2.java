package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1d2  reason: invalid class name and case insensitive filesystem */
public final class C29891d2 extends Handler {
    public final boolean A00 = C28361a1.A00();
    public final /* synthetic */ C219017v A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29891d2(Looper looper, C219017v r3) {
        super(looper);
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        if (this.A00) {
            Log.w("MessageHandler/unsupported");
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                boolean z = message.getData().getBoolean("should_unregister", false);
                int i2 = message.getData().getInt("logoutReason", -1);
                if (z) {
                    this.A01.A17 = false;
                }
                C219017v r4 = this.A01;
                AtomicBoolean atomicBoolean = C219017v.A1B;
                if (i2 == 12) {
                    r4.A18 = true;
                }
                Log.i("MessageHandler/stop");
                if (!r4.A19) {
                    C63222si r0 = r4.A08;
                    if (r0 != null) {
                        C23651Hc r3 = (C23651Hc) r0.A0w.get();
                        r3.A05 = 4;
                        r3.A03.CGP(new C70613Bu(r3, 10));
                    }
                } else {
                    r4.A19 = false;
                    synchronized (r4.A0k) {
                        C29861cz r1 = r4.A0W;
                        if (!r1.A00) {
                            r4.A08.A02();
                        }
                        r1.A00(true);
                    }
                    if (r4.A07 != null) {
                        r4.A0N.A02(r4.A03, r4.A0R.A00);
                        r4.A0a.COY();
                        HandlerThread handlerThread = r4.A04;
                        C17960vV.A07(handlerThread);
                        handlerThread.quit();
                        try {
                            r4.A04.join(120000);
                        } catch (InterruptedException e) {
                            Log.w("MessageHandler/stop/interrupted while waiting on connectivity handler thread to exit", e);
                            Thread.currentThread().interrupt();
                        }
                        if (r4.A04.isAlive()) {
                            Log.e("MessageHandler/stop connectivity-handler-thread still alive");
                        }
                        r4.A04 = null;
                        C219017v.A1A = new CountDownLatch(1);
                        C219017v.A1B.set(false);
                        ((Handler) r4.A07).obtainMessage(3, Integer.valueOf(i2)).sendToTarget();
                        r4.A07 = null;
                        AnonymousClass1OZ r02 = (AnonymousClass1OZ) r4.A0g.get();
                        r02.A0I = null;
                        r02.A00 = null;
                    } else {
                        r4.A15.quit();
                    }
                }
                r4.A0A = true;
            } else if (i == 2) {
                Bundle data = message.getData();
                boolean z2 = data.getBoolean("reset", false);
                boolean z3 = data.getBoolean("force", false);
                boolean z4 = data.getBoolean("force_no_ongoing_backoff", false);
                boolean z5 = data.getBoolean("check_connection", false);
                boolean z6 = data.getBoolean("notify_on_failure", false);
                String string = data.getString("ip_address");
                String string2 = data.getString("cl_sess");
                boolean z7 = data.getBoolean("fgservice", false);
                int i3 = data.getInt("connect_reason", 0);
                C219017v r5 = this.A01;
                AtomicBoolean atomicBoolean2 = C219017v.A1B;
                if (!r5.A18) {
                    if (z3) {
                        r5.A02 = 0;
                    }
                    if (z2) {
                        r5.A0c.A02();
                    }
                    long j = r5.A02;
                    if (j <= 0 || SystemClock.elapsedRealtime() >= j) {
                        C219017v.A02(r5);
                        C219017v.A00(r5.A06, r5, string2, string, i3, z3, z4, z5, z6, z7);
                    }
                }
            } else if (i != 3) {
                C219017v.A02(this.A01);
            } else {
                Bundle data2 = message.getData();
                C219017v r12 = this.A01;
                C219017v.A02(r12);
                if (data2.getBoolean("long_connect", false)) {
                    C219017v.A01(r12);
                }
            }
        } else if (hasMessages(1)) {
            Log.i("MessageHandler/not starting connection as will be imminently stopped");
        } else {
            C219017v r42 = this.A01;
            AtomicBoolean atomicBoolean3 = C219017v.A1B;
            r42.A0A = false;
            boolean z8 = message.getData().getBoolean("should_register", false);
            r42.A06 = (C54412e6) message.obj;
            if (!r42.A18) {
                C219017v.A02(r42);
                if (z8) {
                    AnonymousClass11S r03 = r42.A0H;
                    r03.A0I();
                    PhoneUserJid phoneUserJid = r03.A0E;
                    Object obj = r42.A0h.get();
                    C17960vV.A07(obj);
                    C63222si r13 = (C63222si) obj;
                    if (!r42.A17) {
                        Log.i("MessageHandler/handleRegistered registered");
                        r42.A05 = phoneUserJid;
                        r42.A08 = r13;
                        r42.A0X.A00 = r13;
                        C219017v.A06(r42, true, false, false);
                        if (r42.A07 != null) {
                            r42.A08.A03();
                        }
                        r42.A17 = true;
                    } else if (r42.A0K.A02()) {
                        C219017v.A06(r42, true, false, false);
                        if (r42.A07 != null) {
                            r42.A08.A03();
                        }
                    }
                }
            }
        }
    }
}
