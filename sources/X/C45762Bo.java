package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;

/* renamed from: X.2Bo  reason: invalid class name and case insensitive filesystem */
public class C45762Bo extends C195879u4 {
    public final AnonymousClass1R8 A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final C219017v A03;
    public final Random A04;

    private void A00() {
        long A012 = AnonymousClass11P.A01(this.A01);
        C19830z4 r10 = this.A02;
        AnonymousClass00H r9 = r10.A00;
        if (!C17880vN.A0B(r9).contains("last_heartbeat_login")) {
            long A032 = A012 - C17890vO.A03(this.A04.nextInt(86400));
            C17880vN.A1D(C19830z4.A00(r10), "last_heartbeat_login", A032);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("no last heartbeat known; setting to ");
            C17890vO.A1A(A10, A87.A02(A032));
        }
        long A05 = C17890vO.A05(C17880vN.A0B(r9), "last_heartbeat_login");
        if (A05 <= A012) {
            long j = A05 + 86400000;
            if (j >= A012) {
                long elapsedRealtime = (j - A012) + SystemClock.elapsedRealtime();
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("HeartbeatWakeupAction; elapsedRealTimeHeartbeatLogin=");
                C17890vO.A1A(A102, A87.A02(elapsedRealtime));
                if (!this.A00.A00(A03("com.whatsapp.action.HEARTBEAT_WAKEUP", 134217728), 2, elapsedRealtime)) {
                    Log.w("HeartbeatWakeupAction; AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("HeartbeatWakeupAction/last heart beat login=");
        A103.append(A05);
        A103.append(" server time=");
        A103.append(A012);
        A103.append(" client time=");
        A103.append(System.currentTimeMillis());
        C17900vP.A0j(" interval=", A103, 86400);
        A01((Intent) null);
    }

    public boolean A06(Intent intent) {
        return C17890vO.A1S(intent, "com.whatsapp.action.HEARTBEAT_WAKEUP");
    }

    public C45762Bo(Context context, AnonymousClass1R8 r2, AnonymousClass11P r3, C19830z4 r4, C219017v r5, Random random) {
        super(context);
        this.A01 = r3;
        this.A04 = random;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
    }

    private void A01(Intent intent) {
        C17900vP.A0Y(intent, "HeartbeatWakeupAction; intent=", AnonymousClass000.A10());
        long A012 = AnonymousClass11P.A01(this.A01);
        this.A03.A0B(0, false, true, true, true);
        C17900vP.A0m("HeartbeatWakeupAction/setting last heart beat login time: ", AnonymousClass000.A10(), A012);
        C17880vN.A1D(C19830z4.A00(this.A02), "last_heartbeat_login", A012);
        A00();
    }

    public void A04() {
        A00();
    }

    public void A05(Intent intent) {
        A01(intent);
    }
}
