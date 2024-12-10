package X;

import android.content.Context;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.1Mm  reason: invalid class name and case insensitive filesystem */
public final class C25001Mm {
    public C191829nG A00;
    public final AnonymousClass190 A01;
    public final C24941Mg A02;
    public final AnonymousClass118 A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;

    public C25001Mm(AnonymousClass190 r2, AnonymousClass118 r3, C18030ve r4, C24941Mg r5, AnonymousClass00H r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.9P1, java.lang.Object] */
    public static final synchronized C191829nG A00(C25001Mm r11) {
        C191829nG r1;
        synchronized (r11) {
            if (r11.A00 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaJobManager/start injected requirementProviders:");
                AnonymousClass00H r12 = r11.A05;
                sb.append(r12.get());
                Log.i(sb.toString());
                Context context = r11.A03.A00;
                Object obj = r12.get();
                C18070vi.A0X(obj);
                C22489B9v[] b9vArr = (C22489B9v[]) ((Collection) obj).toArray(new C22489B9v[0]);
                List asList = Arrays.asList((C22489B9v[]) Arrays.copyOf(b9vArr, b9vArr.length));
                ? obj2 = new Object();
                AnonymousClass9WO r7 = new AnonymousClass9WO(r11);
                C18030ve r13 = r11.A04;
                C18040vf r3 = C18040vf.A02;
                int A002 = C18020vd.A00(r3, r13, 419);
                int A003 = C18020vd.A00(r3, r13, 420);
                if (asList == null) {
                    asList = new LinkedList();
                }
                r11.A00 = new C191829nG(context, obj2, r7, asList, A002, A003);
                C24941Mg r2 = r11.A02;
                if (C18020vd.A05(r3, r2.A01, 9630)) {
                    r2.A06.CGv(r2.A07, 60000);
                }
            }
            r1 = r11.A00;
            C18070vi.A0z(r1, "null cannot be cast to non-null type org.whispersystems.jobqueue.JobManager");
        }
        return r1;
    }

    public final void A01(Job job) {
        C24941Mg r4 = this.A02;
        int i = A00(this).A04.get();
        if (C18020vd.A05(C18040vf.A02, r4.A01, 9149)) {
            r4.A02.A00(job, i);
        }
        C191829nG A002 = A00(this);
        if (job.parameters.wakeLock) {
            Context context = A002.A01;
            String obj = job.toString();
            long j = job.parameters.wakeLockTimeout;
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, obj);
            if (j == 0) {
                newWakeLock.acquire();
            } else {
                newWakeLock.acquire(j);
            }
            job.A02 = newWakeLock;
        }
        C21357Aim aim = new C21357Aim(job, A002, 17);
        if (!A002.A00) {
            A002.A03.execute(aim);
        }
    }
}
