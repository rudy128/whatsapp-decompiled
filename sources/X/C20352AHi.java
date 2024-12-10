package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* renamed from: X.AHi  reason: case insensitive filesystem */
public class C20352AHi implements C22398B6b, AnonymousClass86L {
    public static final String A0A = A5Z.A01("SystemFgDispatcher");
    public A7W A00;
    public BA1 A01;
    public C193279pp A02;
    public Context A03;
    public final C189179ie A04;
    public final C71973Kb A05;
    public final Object A06 = C17880vN.A0p();
    public final Map A07;
    public final Map A08;
    public final Map A09;

    public void A00() {
        this.A01 = null;
        synchronized (this.A06) {
            Iterator A0l = C17890vO.A0l(this.A08);
            while (A0l.hasNext()) {
                ((AnonymousClass1OB) A0l.next()).BEM((CancellationException) null);
            }
        }
        this.A00.A03.A03(this);
    }

    public void Bpt(C180159Lj r6, A2t a2t) {
        if (r6 instanceof AnonymousClass8KB) {
            String str = a2t.A0M;
            A5Z A002 = A5Z.A00();
            String str2 = A0A;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Constraints unmet for WorkSpec ");
            AnonymousClass8BW.A16(A002, str, str2, A10);
            A7W a7w = this.A00;
            a7w.A06.BKq(new AnonymousClass7RR(a7w.A03, new AnonymousClass9UL(AnonymousClass9OL.A00(a2t))));
        }
    }

    public void BtY(C193279pp r8, boolean z) {
        Map.Entry A16;
        AnonymousClass1OB r0;
        synchronized (this.A06) {
            if (!(((A2t) this.A09.remove(r8)) == null || (r0 = (AnonymousClass1OB) this.A08.remove(r8)) == null)) {
                r0.BEM((CancellationException) null);
            }
        }
        Map map = this.A07;
        C194159rG r6 = (C194159rG) map.remove(r8);
        if (r8.equals(this.A02)) {
            if (map.size() > 0) {
                Iterator A15 = AnonymousClass000.A15(map);
                do {
                    A16 = AnonymousClass000.A16(A15);
                } while (A15.hasNext());
                this.A02 = (C193279pp) A16.getKey();
                if (this.A01 != null) {
                    C194159rG r02 = (C194159rG) A16.getValue();
                    BA1 ba1 = this.A01;
                    int i = r02.A01;
                    ba1.CNp(i, r02.A02, r02.A00);
                    SystemForegroundService systemForegroundService = (SystemForegroundService) this.A01;
                    systemForegroundService.A01.post(new AnonymousClass7RP(systemForegroundService, i, 1));
                }
            } else {
                this.A02 = null;
            }
        }
        BA1 ba12 = this.A01;
        if (r6 != null && ba12 != null) {
            A5Z A002 = A5Z.A00();
            String str = A0A;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Removing Notification (id: ");
            int i2 = r6.A01;
            A10.append(i2);
            A10.append(", workSpecId: ");
            A10.append(r8);
            A10.append(", notificationType: ");
            A002.A03(str, C17880vN.A0t(A10, r6.A00));
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) ba12;
            systemForegroundService2.A01.post(new AnonymousClass7RP(systemForegroundService2, i2, 1));
        }
    }

    public C20352AHi(Context context) {
        this.A03 = context;
        A7W A002 = A7W.A00(context);
        this.A00 = A002;
        this.A05 = A002.A06;
        this.A02 = null;
        this.A07 = C17880vN.A13();
        this.A08 = C17880vN.A11();
        this.A09 = C17880vN.A11();
        this.A04 = new C189179ie(A002.A09);
        this.A00.A03.A02(this);
    }

    public void A01(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            A5Z.A00().A05(A0A, AnonymousClass001.A1E(intent, "Started foreground service ", AnonymousClass000.A10()));
            this.A05.BKq(new C21452AkJ(2, intent.getStringExtra("KEY_WORKSPEC_ID"), this));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                A5Z.A00().A05(A0A, AnonymousClass001.A1E(intent, "Stopping foreground work for ", AnonymousClass000.A10()));
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    A7W a7w = this.A00;
                    a7w.A06.BKq(new AnonymousClass8KR(a7w, UUID.fromString(stringExtra)));
                    return;
                }
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                A5Z.A00().A05(A0A, "Stopping foreground service");
                BA1 ba1 = this.A01;
                if (ba1 != null) {
                    ba1.stop();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        C193279pp r2 = new C193279pp(stringExtra2, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        A5Z A002 = A5Z.A00();
        String str = A0A;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Notifying with (id:");
        A10.append(intExtra);
        A10.append(", workSpecId: ");
        A10.append(stringExtra2);
        A10.append(", notificationType :");
        A10.append(intExtra2);
        AnonymousClass8BW.A16(A002, ")", str, A10);
        if (notification != null && this.A01 != null) {
            C194159rG r0 = new C194159rG(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(r2, r0);
            if (this.A02 == null) {
                this.A02 = r2;
                this.A01.CNp(intExtra, notification, intExtra2);
                return;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.A01;
            systemForegroundService.A01.post(new C21470Akb((Object) systemForegroundService, intExtra, 6, (Object) notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    i |= ((C194159rG) C17890vO.A0P(A15)).A00;
                }
                C194159rG r02 = (C194159rG) map.get(this.A02);
                if (r02 != null) {
                    this.A01.CNp(r02.A01, r02.A02, i);
                }
            }
        }
    }
}
