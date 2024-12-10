package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9F8  reason: invalid class name */
public class AnonymousClass9F8 extends AnonymousClass9CP {
    public final Object A00;
    public final Object A01;

    public AnonymousClass9F8(C29621ca r25, AnonymousClass9F7 r26, int i) {
        C29621ca r14 = r25;
        AnonymousClass9F7 r4 = r26;
        if (i != 0) {
            C173438v4 r2 = C173438v4.A00;
            this.A00 = r2;
            C108945cZ.A1N(r14);
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            Class<String> cls = String.class;
            String[] strArr2 = new String[1];
            Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
            Long A0j = AnonymousClass8BU.A0j();
            Object A05 = A0s.A05((C29621ca) r4.A00, cls, A0Z, A0j, (Object) null, strArr2, false);
            if (A05 != null) {
                C62672rm r13 = A0s;
                Long l = A0Z;
                Long l2 = A0j;
                if (r13.A05(r14, cls, l, l2, A05, strArr, true) != null) {
                    if (r13.A05(r14, C173438v4.class, l, l2, r2, AnonymousClass8BS.A1Z(1, 0), false) != null) {
                        if (A0s.A05(r14, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false) != null) {
                            A96 a96 = A96.A00;
                            String[] strArr3 = new String[1];
                            C29621ca A0Z2 = AnonymousClass8BT.A0Z(r14, "messages", strArr3);
                            if (A0Z2 == null) {
                                AnonymousClass8BY.A11(r14, A0s, strArr3, 0);
                            } else {
                                C18070vi.A0d(a96, 0);
                                AnonymousClass9DL A002 = A96.A00(A0Z2, A0s);
                                if (A002 != null) {
                                    this.A01 = A002;
                                }
                            }
                            throw AnonymousClass1O9.A00(A0s);
                        }
                        throw AnonymousClass1O9.A00(A0s);
                    }
                    throw AnonymousClass1O9.A00(A0s);
                }
                throw AnonymousClass1O9.A00(A0s);
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        C173438v4 r3 = C173438v4.A00;
        this.A01 = r3;
        C108945cZ.A1N(r14);
        C62672rm A0s2 = AnonymousClass8BR.A0s();
        String[] strArr4 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls2 = String.class;
        String[] strArr5 = new String[1];
        Long A0Z3 = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr5, 0);
        Long A0j2 = AnonymousClass8BU.A0j();
        Object A052 = A0s2.A05((C29621ca) r4.A00, cls2, A0Z3, A0j2, (Object) null, strArr5, false);
        if (A052 != null) {
            C62672rm r15 = A0s2;
            Long l3 = A0Z3;
            Long l4 = A0j2;
            C29621ca r16 = r14;
            if (r15.A05(r16, cls2, l3, l4, A052, strArr4, true) != null) {
                if (r15.A05(r16, C173438v4.class, l3, l4, r3, AnonymousClass8BS.A1Z(1, 0), false) != null) {
                    if (A0s2.A05(r14, cls2, A0Z3, A0j2, "error", AnonymousClass8BS.A1a(1, 0), false) != null) {
                        A96 a962 = A96.A00;
                        String[] strArr6 = new String[1];
                        C29621ca A0Z4 = AnonymousClass8BT.A0Z(r14, "error", strArr6);
                        if (A0Z4 == null) {
                            AnonymousClass8BY.A11(r14, A0s2, strArr6, 0);
                        } else {
                            C18070vi.A0d(a962, 0);
                            AnonymousClass9D6 A012 = A96.A01(A0Z4, A0s2);
                            if (A012 != null) {
                                this.A00 = A012;
                            }
                        }
                        throw AnonymousClass1O9.A00(A0s2);
                    }
                    throw AnonymousClass1O9.A00(A0s2);
                }
                throw AnonymousClass1O9.A00(A0s2);
            }
            throw AnonymousClass1O9.A00(A0s2);
        }
        throw AnonymousClass1O9.A00(A0s2);
        this.A00 = r14;
    }
}
