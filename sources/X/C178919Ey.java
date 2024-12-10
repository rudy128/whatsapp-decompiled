package X;

import java.util.ArrayList;

/* renamed from: X.9Ey  reason: invalid class name and case insensitive filesystem */
public final class C178919Ey extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C125956bx A00;

    public static final void A00(C125956bx r9, C29621ca r10, AnonymousClass9F5 r11) {
        AnonymousClass1UI r0;
        int A0G = C72453Mb.A0G(r11, r9, 1);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C29621ca A03 = C20121A8g.A03(r10, r11);
            C62672rm A0s = AnonymousClass8BR.A0s();
            if (C21290Ahb.A00(A03, A8H.A00, 39).BCF(r10, A0s) != null) {
                r9.A00.resumeWith(C27621Wu.A00);
                return;
            }
            throw AnonymousClass1O9.A00(A0s);
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BY.A1I("SetBlocklistByWAClientResponseSuccess: ", AnonymousClass000.A10(), e, A13);
            C29621ca A032 = C20121A8g.A03(r10, r11);
            C62672rm A0s2 = AnonymousClass8BR.A0s();
            A8H a8h = A8H.A00;
            if (C21290Ahb.A00(A032, a8h, 38).BCF(r10, A0s2) != null) {
                C22470B9c[] b9cArr = new C22470B9c[A0G];
                C21283AhU.A00(b9cArr, 13, 0, a8h);
                Object A06 = A0s2.A06(r10, "IQErrorBadRequest|IQErrorInternalServerError", C18070vi.A0O(new C21283AhU(a8h, 14), b9cArr, 1), AnonymousClass8BS.A1b(1, 0));
                if (A06 != null) {
                    C30391dr r3 = r9.A00;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("InteropBlocklistHelper/getInteropBlocklist/error code: ");
                    r3.resumeWith(C30691eM.A00(C17880vN.A0f(C17880vN.A0u(A10, ((C22474B9g) A06).BOr()))));
                    return;
                }
                r0 = AnonymousClass1O9.A00(A0s2);
            } else {
                r0 = AnonymousClass1O9.A00(A0s2);
            }
            throw r0;
        } catch (AnonymousClass1UI e2) {
            throw AnonymousClass8BY.A0N("SetBlocklistByWAClientResponseError: ", AnonymousClass000.A10(), e2, A13);
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
    }

    public C178919Ey(C125956bx r1, AnonymousClass9F5 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F5) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F5) C108955ca.A0c(this, r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
