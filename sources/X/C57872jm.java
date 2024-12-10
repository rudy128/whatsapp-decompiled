package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2jm  reason: invalid class name and case insensitive filesystem */
public class C57872jm {
    public final long A00;
    public final AnonymousClass18K A01;
    public final C18180vt A02;
    public final String A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);

    public void A00() {
        if (this.A04.compareAndSet(false, true)) {
            String str = this.A03;
            C22681Cu r2 = new C22681Cu();
            r2.A00 = Long.valueOf(SystemClock.elapsedRealtime() - this.A00);
            r2.A02 = str;
            r2.A01 = null;
            C18180vt r1 = this.A02;
            AnonymousClass18K r0 = this.A01;
            if (r1 == null) {
                r0.CC7(r2);
            } else {
                r0.CC6(r2, r1);
            }
        } else {
            StringBuilder A11 = AnonymousClass000.A11("PerfTimer(");
            A11.append(this.A03);
            C17960vV.A0F(false, AnonymousClass000.A0y(") already stopped", A11));
        }
    }

    public C57872jm(AnonymousClass18K r3, C18180vt r4, String str) {
        this.A01 = r3;
        this.A03 = str;
        this.A02 = r4;
        this.A00 = SystemClock.elapsedRealtime();
    }
}
