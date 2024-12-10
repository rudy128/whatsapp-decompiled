package X;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: X.DIi  reason: case insensitive filesystem */
public final class C26901DIi implements E5D {
    public boolean A00;
    public final /* synthetic */ CWD A01;
    public final /* synthetic */ C22995BYv A02;

    public C26901DIi() {
        this.A00 = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C26901DIi(CWD cwd, C22995BYv bYv) {
        this();
        this.A02 = bYv;
        this.A01 = cwd;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C23018BZu bZu = (C23018BZu) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (this.A00) {
            C23375Bg2 bg2 = new C23375Bg2(taskCompletionSource);
            try {
                CYG cyg = this.A01.A01;
                if (cyg != null) {
                    C24975CSa cSa = bZu.A00;
                    C23018BZu bZu2 = ((C26937DJs) cSa.A00).A00;
                    bZu2.A06();
                    Map map = cSa.A03;
                    synchronized (map) {
                        C23379Bg6 bg6 = (C23379Bg6) map.remove(cyg);
                        if (bg6 != null) {
                            synchronized (bg6) {
                                CWD cwd = bg6.A00;
                                cwd.A02 = null;
                                cwd.A01 = null;
                            }
                            ((ECI) bZu2.A04()).CTj(new C23091Bb6((PendingIntent) null, (IBinder) null, bg6, bg2, (C23168BcO) null, 2));
                        }
                    }
                }
            } catch (RuntimeException e) {
                taskCompletionSource.trySetException(e);
            }
        }
    }
}
