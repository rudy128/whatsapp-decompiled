package X;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: X.DId  reason: case insensitive filesystem */
public final /* synthetic */ class C26896DId implements E5D {
    public final CWD A00;
    public final C23168BcO A01;
    public final C22995BYv A02;
    public final C26901DIi A03;
    public final C197629x0 A04;

    public C26896DId(CWD cwd, C23168BcO bcO, C22995BYv bYv, C26901DIi dIi, C197629x0 r5) {
        this.A02 = bYv;
        this.A03 = dIi;
        this.A04 = r5;
        this.A01 = bcO;
        this.A00 = cwd;
    }

    public final void accept(Object obj, Object obj2) {
        C23379Bg6 bg6;
        C22995BYv bYv = this.A02;
        C26901DIi dIi = this.A03;
        C197629x0 r1 = this.A04;
        C23168BcO bcO = this.A01;
        CWD cwd = this.A00;
        C23376Bg3 bg3 = new C23376Bg3(new DKH(bYv, dIi, r1), (TaskCompletionSource) obj2);
        bcO.A01 = bYv.A08;
        C24975CSa cSa = ((C23018BZu) obj).A00;
        synchronized (cSa) {
            C23018BZu bZu = ((C26937DJs) cSa.A00).A00;
            bZu.A06();
            CYG cyg = cwd.A01;
            if (cyg != null) {
                Map map = cSa.A03;
                synchronized (map) {
                    bg6 = (C23379Bg6) map.get(cyg);
                    if (bg6 == null) {
                        bg6 = new C23379Bg6(cwd);
                    }
                    map.put(cyg, bg6);
                }
                ((ECI) bZu.A04()).CTj(new C23091Bb6((PendingIntent) null, (IBinder) null, bg6, bg3, bcO, 1));
            }
        }
    }
}
