package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6nr  reason: invalid class name and case insensitive filesystem */
public final class C132916nr {
    public C18090vk A00 = AnonymousClass7xN.A00;
    public long A01;
    public final long A02;
    public final Handler A03;
    public final AnonymousClass11P A04;
    public final Runnable A05;

    public C132916nr(AnonymousClass11P r3, TimeUnit timeUnit, long j) {
        C18070vi.A0d(r3, 1);
        this.A04 = r3;
        this.A02 = timeUnit.toMillis(j);
        this.A03 = C17890vO.A0D();
        this.A05 = new AnonymousClass7RJ(this, 3);
    }

    public final void A00() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.A01;
        long j2 = this.A02;
        if (uptimeMillis - j < j2) {
            this.A03.removeCallbacks(this.A05);
        } else if (SystemClock.uptimeMillis() - j > 3000) {
            this.A03.post(this.A05);
            this.A01 = SystemClock.uptimeMillis();
        }
        this.A03.postDelayed(this.A05, j2);
        this.A01 = SystemClock.uptimeMillis();
    }
}
