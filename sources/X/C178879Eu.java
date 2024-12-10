package X;

import java.util.ArrayList;

/* renamed from: X.9Eu  reason: invalid class name and case insensitive filesystem */
public final class C178879Eu extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C84594Kc A00;

    public static final void A00(C84594Kc r9, C29621ca r10, AnonymousClass9F6 r11) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r02;
        AnonymousClass1UI r03;
        C18070vi.A0e(r11, 1, r9);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C108945cZ.A1N(r10);
            Object obj = r11.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            C197329wW r3 = C197329wW.A00;
            AnonymousClass9CX r1 = (AnonymousClass9CX) A0s.A03(r10, new C21282AhT(r3, 21), new String[]{"ar_class"});
            if (r1 == null) {
                r03 = AnonymousClass1O9.A00(A0s);
            } else if (C21290Ahb.A00(obj, r3, 13).BCF(r10, A0s) != null) {
                r9.A00.resumeWith(new C75463hZ(r1.A00));
                return;
            } else {
                r03 = AnonymousClass1O9.A00(A0s);
            }
            throw r03;
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BY.A1I("GetARClassResponseSuccess: ", AnonymousClass000.A10(), e, A13);
            C108945cZ.A1N(r10);
            Object obj2 = r11.A00;
            C62672rm A0s2 = AnonymousClass8BR.A0s();
            C197329wW r32 = C197329wW.A00;
            AnonymousClass9D6 r2 = (AnonymousClass9D6) A0s2.A03(r10, new C21282AhT(r32, 20), AnonymousClass8BS.A1b(1, 0));
            if (r2 == null) {
                r02 = AnonymousClass1O9.A00(A0s2);
            } else if (C21290Ahb.A00(obj2, r32, 12).BCF(r10, A0s2) != null) {
                r9.A00.resumeWith(new C75473ha(r2.A00, r2.A02));
                return;
            } else {
                r02 = AnonymousClass1O9.A00(A0s2);
            }
            throw r02;
        } catch (AnonymousClass1UI e2) {
            AnonymousClass8BY.A1I("GetARClassResponseServerError: ", AnonymousClass000.A10(), e2, A13);
            try {
                C108945cZ.A1N(r10);
                Object obj3 = r11.A00;
                C62672rm A0s3 = AnonymousClass8BR.A0s();
                C197329wW r22 = C197329wW.A00;
                AnonymousClass9D6 r12 = (AnonymousClass9D6) A0s3.A03(r10, new C21282AhT(r22, 19), AnonymousClass8BS.A1b(1, 0));
                if (r12 == null) {
                    r0 = AnonymousClass1O9.A00(A0s3);
                } else if (C21290Ahb.A02(r10, A0s3, obj3, r22, 11) != null) {
                    r9.A00.resumeWith(new C75473ha(r12.A00, r12.A02));
                    return;
                } else {
                    r0 = AnonymousClass1O9.A00(A0s3);
                }
                throw r0;
            } catch (AnonymousClass1UI e3) {
                throw AnonymousClass8BY.A0N("GetARClassResponseClientError: ", AnonymousClass000.A10(), e3, A13);
            }
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A00.A00.resumeWith(C75483hb.A00);
    }

    public C178879Eu(C84594Kc r1, AnonymousClass9F6 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F6) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F6) C108955ca.A0c(this, r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
