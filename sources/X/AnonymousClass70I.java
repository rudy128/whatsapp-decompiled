package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.70I  reason: invalid class name */
public final class AnonymousClass70I {
    public Integer A00;
    public final AnonymousClass19T A01;
    public final AtomicInteger A02 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    public AnonymousClass70I(AnonymousClass19T r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
    }

    public final void A03(int i, String str) {
        C18070vi.A0d(str, 1);
        this.A01.markerPoint(354170068, i, str);
    }

    public final void A06(C126216cN r4, String str, int i) {
        C18070vi.A0d(str, 2);
        this.A01.markerAnnotate(354170068, i, r4.A00, str);
    }

    public final int A01() {
        int andIncrement = this.A02.getAndIncrement();
        this.A01.markerStart(354170068, andIncrement);
        return andIncrement;
    }

    public final void A02(int i, Integer num) {
        short s;
        AnonymousClass19T r2 = this.A01;
        switch (num.intValue()) {
            case 0:
                s = 2;
                break;
            case 1:
                s = 3;
                break;
            default:
                s = 4;
                break;
        }
        r2.markerEnd(354170068, i, s);
    }

    public final void A04(C126216cN r4, int i, int i2) {
        this.A01.markerAnnotate(354170068, i, r4.A00, i2);
    }

    public final void A05(C126216cN r4, int i, boolean z) {
        this.A01.markerAnnotate(354170068, i, r4.A00, z);
    }

    public static AnonymousClass70I A00(AnonymousClass70I r0, AnonymousClass00H r1, String str, int i) {
        r0.A03(i, str);
        return (AnonymousClass70I) r1.get();
    }
}
