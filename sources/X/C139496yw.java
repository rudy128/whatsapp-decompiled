package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6yw  reason: invalid class name and case insensitive filesystem */
public final class C139496yw {
    public final C36711oL A00;
    public final AnonymousClass19T A01;
    public final AtomicInteger A02 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    public final void A02(int i, String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A01.markerPoint(694884634, i, str, str2);
    }

    public final void A01(int i, Integer num) {
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
        r2.markerEnd(694884634, i, s);
    }

    public C139496yw(C36711oL r3, AnonymousClass19T r4) {
        C18070vi.A0j(r4, r3);
        this.A01 = r4;
        this.A00 = r3;
    }

    public static int A00(AnonymousClass00H r2) {
        C139496yw r1 = (C139496yw) r2.get();
        int andIncrement = r1.A02.getAndIncrement();
        r1.A01.markerStart(694884634, andIncrement);
        return andIncrement;
    }
}
