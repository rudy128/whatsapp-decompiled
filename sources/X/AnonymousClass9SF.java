package X;

import java.util.ArrayList;

/* renamed from: X.9SF  reason: invalid class name */
public abstract class AnonymousClass9SF {
    public static final void A00(C29621ca r4, AnonymousClass9F7 r5, BCJ bcj) {
        ArrayList A16 = C108955ca.A16(bcj, 2);
        try {
            bcj.Bc8(new AnonymousClass9FA(r4, r5));
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BY.A1I("QueryResponseSuccess: ", AnonymousClass000.A10(), e, A16);
            try {
                bcj.Bc5(new AnonymousClass9FP(r4, r5, 3));
            } catch (AnonymousClass1UI e2) {
                AnonymousClass8BY.A1I("QueryResponseRequestError: ", AnonymousClass000.A10(), e2, A16);
                try {
                    bcj.Bc7(new AnonymousClass9FG(r4, r5));
                } catch (AnonymousClass1UI e3) {
                    throw AnonymousClass8BY.A0N("QueryResponseServerError: ", AnonymousClass000.A10(), e3, A16);
                }
            }
        }
    }
}
