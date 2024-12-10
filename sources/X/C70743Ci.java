package X;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.3Ci  reason: invalid class name and case insensitive filesystem */
public class C70743Ci implements Runnable {
    public long A00;
    public boolean A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C70743Ci(View view, C1419877s r3) {
        this.A02 = 0;
        this.A03 = view;
        this.A04 = r3;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.2MO, X.20i, X.206] */
    public void run() {
        Pair pair;
        switch (this.A02) {
            case 0:
                if (!this.A01) {
                    long j = this.A00;
                    if (j == 0) {
                        j = System.currentTimeMillis();
                        this.A00 = j;
                    }
                    if (((float) (System.currentTimeMillis() - j)) / 0.0f >= 1.0f) {
                        this.A01 = true;
                    }
                    View view = (View) this.A03;
                    view.invalidate();
                    if (!this.A01) {
                        view.post(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass72K r2 = (AnonymousClass72K) this.A04;
                boolean z = this.A01;
                long j2 = this.A00;
                try {
                    if (AnonymousClass72K.A01(r2)) {
                        FileOutputStream fileOutputStream = r2.A0L;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            return;
                        }
                        throw C17880vN.A0g();
                    }
                    return;
                } catch (Exception e) {
                    if (!z || j2 < 1000) {
                        C17900vP.A0Y(e, "PttUtils/doCloseVisualization ", AnonymousClass000.A10());
                        return;
                    } else {
                        Log.e("PttUtils/doCloseVisualization ", e);
                        return;
                    }
                }
            case 2:
                ScheduleCallBroadcastReceiver scheduleCallBroadcastReceiver = (ScheduleCallBroadcastReceiver) this.A03;
                C59822mw r6 = (C59822mw) this.A04;
                boolean z2 = this.A01;
                long j3 = this.A00;
                AnonymousClass1TC r4 = scheduleCallBroadcastReceiver.A02;
                ? r5 = new C436420i(C17880vN.A0Z(r6.A04, r4.A03), 117, AnonymousClass11P.A01(r4.A01));
                r5.A02 = "";
                r5.A01 = r6.A02;
                long j4 = r6.A03;
                r5.A00 = j4;
                r5.A02 = r6.A06;
                r5.A0d(r6.A05);
                scheduleCallBroadcastReceiver.A06.BBM(r5);
                if (!z2) {
                    C35311m1 r9 = scheduleCallBroadcastReceiver.A08;
                    Context context = r9.A04.A00;
                    Intent intent = new Intent(context, ScheduleCallBroadcastReceiver.class);
                    intent.setAction("action_schedule_call_timeout");
                    intent.putExtra("extra_message_row_id", j3);
                    r9.A03.A00(C17880vN.A06(context, intent, (int) j3), 1, j4 + 900000);
                    AnonymousClass10T A0V = C17880vN.A0V(scheduleCallBroadcastReceiver.A0A);
                    if (r6.A09) {
                        A0V.notifyAllObservers(new AnonymousClass7KY(r6, 16));
                    }
                    scheduleCallBroadcastReceiver.A03.A00(r6, false);
                    return;
                }
                return;
            default:
                AnonymousClass74M r3 = (AnonymousClass74M) this.A03;
                AnonymousClass72K r1 = (AnonymousClass72K) this.A04;
                long j5 = this.A00;
                boolean z3 = this.A01;
                Log.i("voicenote/cachevoicenoteandpreview/stop on consolidatedThread");
                AnonymousClass74M.A0G(r3, r1, j5, false);
                File A032 = r1.A03();
                File file = (File) r1.A0E.getValue();
                long length = A032.length();
                long j6 = r1.A01;
                if (j5 >= 1000 && length >= 100) {
                    if (C18020vd.A05(C18040vf.A02, r3.A0q, 11663)) {
                        pair = r3.A13.A04(r3.A0C, r3.A0E, A032, file);
                        r3.A0g.A0J(new AnonymousClass7QS(pair, r3, A032, file, j6, length, j5, z3));
                        return;
                    }
                }
                pair = null;
                r3.A0g.A0J(new AnonymousClass7QS(pair, r3, A032, file, j6, length, j5, z3));
                return;
        }
    }

    public C70743Ci(Object obj, Object obj2, int i, long j, boolean z) {
        this.A02 = i;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = z;
        this.A00 = j;
    }
}
