package X;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.AHh  reason: case insensitive filesystem */
public class C20351AHh implements C22398B6b {
    public static final String A0B = A5Z.A01("SystemAlarmDispatcher");
    public Intent A00;
    public AnonymousClass9u6 A01 = new AnonymousClass9u6();
    public B4O A02;
    public final Context A03;
    public final C20359AHp A04;
    public final C22399B6c A05;
    public final A7W A06;
    public final C20350AHg A07;
    public final C199389zv A08;
    public final C71973Kb A09;
    public final List A0A;

    public C20351AHh(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext;
        A7W A002 = A7W.A00(context);
        this.A06 = A002;
        AnonymousClass00I r3 = A002.A02;
        this.A07 = new C20350AHg(applicationContext, r3.A03, this.A01);
        this.A08 = new C199389zv(r3.A05);
        C20359AHp aHp = A002.A03;
        this.A04 = aHp;
        C71973Kb r1 = A002.A06;
        this.A09 = r1;
        this.A05 = new C20356AHm(aHp, r1);
        aHp.A02(this);
        this.A0A = AnonymousClass000.A13();
        this.A00 = null;
    }

    public void BtY(C193279pp r5, boolean z) {
        Executor executor = ((C20367AHx) this.A09).A02;
        Intent A072 = AnonymousClass8BR.A07(this.A03, SystemAlarmService.class);
        A072.setAction("ACTION_EXECUTION_COMPLETED");
        A072.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C20350AHg.A00(A072, r5);
        C21470Akb.A00(this, A072, executor, 0, 5);
    }

    public static void A00() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw AnonymousClass000.A0n("Needs to be invoked on the main thread.");
        }
    }

    public static void A01(C20351AHh aHh) {
        A00();
        PowerManager.WakeLock A002 = C197059w5.A00(aHh.A03, "ProcessCommand");
        try {
            A002.acquire();
            aHh.A06.A06.BKq(new C21466AkX(aHh, 23));
        } finally {
            A002.release();
        }
    }

    public void A02(Intent intent, int i) {
        A5Z A002 = A5Z.A00();
        String str = A0B;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Adding command ");
        A10.append(intent);
        A10.append(" (");
        A10.append(i);
        AnonymousClass8BW.A16(A002, ")", str, A10);
        A00();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            A5Z.A00().A06(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A00();
            List<Intent> list = this.A0A;
            synchronized (list) {
                for (Intent A1S : list) {
                    if (C17890vO.A1S(A1S, "ACTION_CONSTRAINTS_CHANGED")) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.A0A;
        synchronized (list2) {
            boolean A1a = AnonymousClass000.A1a(list2);
            list2.add(intent);
            if (!A1a) {
                A01(this);
            }
        }
    }
}
