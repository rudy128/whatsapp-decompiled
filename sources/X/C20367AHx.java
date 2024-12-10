package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.AHx  reason: case insensitive filesystem */
public class C20367AHx implements C71973Kb {
    public final Handler A00 = C17890vO.A0D();
    public final C21504AlD A01;
    public final Executor A02 = new C21502AlB(this, 0);
    public final C18600wl A03;

    public /* synthetic */ void BKq(Runnable runnable) {
        this.A01.execute(runnable);
    }

    public C20367AHx(Executor executor) {
        C21504AlD alD = new C21504AlD(executor);
        this.A01 = alD;
        this.A03 = new C23791Hq(alD);
    }
}
