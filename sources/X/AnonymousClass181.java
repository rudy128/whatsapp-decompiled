package X;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Statistics$Data;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.181  reason: invalid class name */
public class AnonymousClass181 {
    public AnonymousClass1EQ A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C219317y A04;
    public final AnonymousClass180 A05;

    public synchronized void A03() {
        if (this.A00 == null) {
            C17960vV.A0D(true);
            HandlerThread handlerThread = new HandlerThread("stat-save", 10);
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            AnonymousClass1EQ r1 = new AnonymousClass1EQ(looper, this, this.A01);
            this.A00 = r1;
            r1.sendEmptyMessage(0);
            AnonymousClass180 r3 = this.A05;
            r3.A00 = new AnonymousClass1ER(looper, r3.A01, r3.A02);
        }
    }

    public static void A00(AnonymousClass181 r4) {
        r4.A00.removeMessages(1);
        r4.A00.sendEmptyMessageDelayed(1, 1000);
    }

    public void A02() {
        if (this.A00 == null || this.A05.A00 == null) {
            A03();
            boolean z = false;
            if (this.A00 != null) {
                z = true;
            }
            C17960vV.A0D(z);
        }
    }

    public void A06(long j, int i) {
        AnonymousClass180 r3 = this.A05;
        if (j >= 0 && r3.A00 != null) {
            AnonymousClass180.A00(r3);
            Message obtain = Message.obtain(r3.A00, 5, i, -1);
            obtain.getData().putLong("long_value", j);
            obtain.sendToTarget();
            AnonymousClass180.A01(r3);
        }
    }

    public AnonymousClass181(AnonymousClass11E r1, AnonymousClass11P r2, AnonymousClass118 r3, C219317y r4, AnonymousClass180 r5) {
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = r1;
        this.A04 = r4;
    }

    public Statistics$Data A01() {
        Statistics$Data statistics$Data;
        A02();
        try {
            this.A00.A03.await();
        } catch (InterruptedException e) {
            Log.e("statistics/waitForStatsInit exception waiting", e);
        }
        AnonymousClass1EQ r2 = this.A00;
        synchronized (r2) {
            try {
                statistics$Data = new Statistics$Data(new JSONObject(r2.A00.A00()));
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        return statistics$Data;
    }

    public void A04(int i, long j, boolean z) {
        A02();
        Message obtain = Message.obtain(this.A00, 7);
        Bundle data = obtain.getData();
        data.putInt("messageType", i);
        data.putLong("timestamp", j);
        data.putBoolean("isPayment", z);
        obtain.sendToTarget();
        A00(this);
    }

    public void A05(long j, int i) {
        A02();
        if (j >= 0) {
            Message obtain = Message.obtain(this.A00, 5, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A00(this);
        }
    }

    public void A07(long j, int i) {
        A02();
        if (j >= 0) {
            Message obtain = Message.obtain(this.A00, 4, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A00(this);
        }
    }

    public void A08(boolean z) {
        A02();
        Message.obtain(this.A00, 8, z ? 1 : 0, 0).sendToTarget();
        A00(this);
    }
}
