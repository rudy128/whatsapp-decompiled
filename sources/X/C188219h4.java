package X;

import android.widget.ImageView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9h4  reason: invalid class name and case insensitive filesystem */
public class C188219h4 {
    public AnonymousClass70W A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final ConcurrentMap A05;
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final boolean A07;

    public C188219h4(BCx bCx) {
        ConcurrentHashMap A17 = AnonymousClass8BR.A17();
        this.A05 = A17;
        A17.put(bCx, bCx);
        this.A03 = bCx.getId();
        this.A04 = bCx.Bb5();
        this.A01 = bCx.BUR();
        this.A02 = bCx.BUV();
        ImageView BSp = bCx.BSp();
        boolean z = false;
        if (!(BSp == null || BSp.getTag(2131433300) == null || !AnonymousClass000.A1Y(BSp.getTag(2131433300)))) {
            z = true;
        }
        this.A07 = z;
    }
}
