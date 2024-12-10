package X;

import java.util.ArrayList;

/* renamed from: X.9F0  reason: invalid class name */
public final class AnonymousClass9F0 extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final AnonymousClass6XQ A00;

    public static final void A00(C29621ca r8, AnonymousClass6XQ r9, AnonymousClass9F7 r10) {
        AnonymousClass1UI r0;
        int A0G = C72453Mb.A0G(r10, r9, 1);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C108945cZ.A1N(r8);
            Object obj = r10.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = new String[A0G];
            strArr[0] = "ta_pad";
            strArr[1] = "stage";
            if (AnonymousClass8BY.A0W(r8, A0s, "message_publish_ack", strArr, false) == null) {
                r0 = AnonymousClass1O9.A00(A0s);
            } else if (A0s.A03(r8, new C21289Aha(obj, C197399wd.A00, 28), new String[0]) == null) {
                r0 = AnonymousClass1O9.A00(A0s);
            } else {
                return;
            }
            throw r0;
        } catch (AnonymousClass1UI e) {
            throw AnonymousClass8BY.A0N("MessagePublishResponseServer: ", AnonymousClass000.A10(), e, A13);
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
    }

    public C22384B5n CM9(String str) {
        C18070vi.A0d(str, 0);
        return C20958AcC.A00;
    }

    public AnonymousClass9F0(AnonymousClass6XQ r1, AnonymousClass9F7 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(r3, this.A00, (AnonymousClass9F7) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(r3, this.A00, (AnonymousClass9F7) C108955ca.A0c(this, r3));
    }
}
