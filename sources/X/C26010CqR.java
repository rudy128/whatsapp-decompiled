package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CqR  reason: case insensitive filesystem */
public final class C26010CqR {
    public static final AtomicInteger A08 = new AtomicInteger();
    public final long A00;
    public final C24322BzJ A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public void A01(A5W a5w, float f) {
        boolean z;
        if (f > 0.0f || (f < 0.0f && a5w.A03(TimeUnit.MILLISECONDS) <= 0 && a5w.A02(TimeUnit.MILLISECONDS) < 0)) {
            z = true;
        } else {
            z = false;
        }
        C26171Ctn.A03(z, "Not supported");
        this.A07.add(new C25774Cll(a5w, f));
    }

    public void A00(float f) {
        this.A07.add(new C25774Cll(new A5W(TimeUnit.SECONDS, -1, -1), f));
    }

    public C26010CqR(C24322BzJ bzJ, String str, long j) {
        this.A01 = bzJ;
        this.A04 = AnonymousClass000.A13();
        this.A06 = AnonymousClass000.A13();
        this.A07 = AnonymousClass000.A13();
        this.A00 = j;
        this.A02 = TextUtils.isEmpty(str) ? Integer.toString(A08.getAndIncrement()) : str;
        this.A05 = AnonymousClass000.A13();
        this.A03 = C17880vN.A11();
    }

    public C26010CqR(C24322BzJ bzJ) {
        this(bzJ, "", 0);
    }
}
