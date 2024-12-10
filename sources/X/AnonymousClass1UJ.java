package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Random;

/* renamed from: X.1UJ  reason: invalid class name */
public final class AnonymousClass1UJ {
    public final C18030ve A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;

    public AnonymousClass1UJ(C18030ve r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void A00(AnonymousClass1BI r11, C54452eA r12, String str, boolean z) {
        C58962lX r0;
        boolean z2 = false;
        AnonymousClass1BI r4 = r11;
        C18070vi.A0d(r11, 0);
        Boolean bool = null;
        if (r12 != null) {
            r0 = r12.A00;
        } else {
            r0 = null;
        }
        boolean z3 = false;
        if (r0 != null) {
            z2 = true;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        if (r12 != null && r12.A02) {
            if (r12.A01 != null) {
                z3 = true;
            }
            bool = Boolean.valueOf(z3);
        }
        int A002 = C18020vd.A00(C18040vf.A02, this.A00, 9377);
        if (A002 > 0) {
            if (A002 < 10000) {
                A002 = SearchActionVerificationClientService.NOTIFICATION_ID;
            }
            if (new Random().nextInt(A002) == 0) {
                this.A01.CGF(new AnonymousClass3CO(this, r4, valueOf, bool, str, 2, z));
            }
        }
    }
}
