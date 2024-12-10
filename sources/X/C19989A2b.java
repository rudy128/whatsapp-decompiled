package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.A2b  reason: case insensitive filesystem */
public final class C19989A2b {
    public static final AtomicInteger A04 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public Integer A00;
    public String A01;
    public final int A02;
    public final AnonymousClass19T A03;

    public C19989A2b(AnonymousClass19T r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
        this.A02 = i;
    }

    public void A00() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerEnd(this.A02, num.intValue(), 3);
            return;
        }
        this.A03.markerEnd(this.A02, 3);
    }

    public void A01() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerEnd(this.A02, num.intValue(), 2);
            return;
        }
        this.A03.markerEnd(this.A02, 2);
    }

    public void A02() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerStart(this.A02, num.intValue());
            return;
        }
        this.A03.markerStart(this.A02);
    }

    public final void A03(String str) {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerPoint(this.A02, num.intValue(), str);
            return;
        }
        this.A03.markerPoint(this.A02, str);
    }
}
