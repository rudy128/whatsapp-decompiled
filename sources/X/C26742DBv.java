package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.DBv  reason: case insensitive filesystem */
public final class C26742DBv implements C28604E9v {
    public final E7V A00;
    public final /* synthetic */ DOZ A01;
    public final /* synthetic */ DFL A02;
    public final /* synthetic */ E8A A03;

    public void Bw4(long j, Throwable th) {
    }

    public void Bw5(ECu eCu, long j) {
    }

    public void C0i(Drawable drawable, long j) {
    }

    public void C2u(long j) {
    }

    public C26742DBv(DOZ doz, DFL dfl, E8A e8a) {
        this.A02 = dfl;
        this.A01 = doz;
        this.A03 = e8a;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C18070vi.A0X(realtimeSinceBootClock);
        this.A00 = realtimeSinceBootClock;
    }

    public void Btt(Drawable drawable, Throwable th, long j) {
        DFL dfl = this.A02;
        DOZ doz = this.A01;
        E8A e8a = this.A03;
        long now = this.A00.now();
        C20046A4p A0J = C108985cd.A0J("ImageFailed");
        A0J.A03(Long.valueOf(now), 1);
        C26209Cul.A04(doz, dfl, A0J, e8a, 2);
    }

    public void Bua(Drawable drawable, ECu eCu, long j) {
        DFL dfl = this.A02;
        DOZ doz = this.A01;
        E8A e8a = this.A03;
        long now = this.A00.now();
        C20046A4p A0J = C108985cd.A0J("ImageFinalRendered");
        A0J.A03(Long.valueOf(now), 1);
        C26209Cul.A04(doz, dfl, A0J, e8a, 2);
    }

    public void C7E(long j, Object obj) {
        DFL dfl = this.A02;
        DOZ doz = this.A01;
        E8A e8a = this.A03;
        long now = this.A00.now();
        C20046A4p A0J = C108985cd.A0J("ImageRequested");
        A0J.A03(Long.valueOf(now), 1);
        C26209Cul.A04(doz, dfl, A0J, e8a, 2);
    }

    public C26742DBv() {
    }
}
