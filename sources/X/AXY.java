package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

public class AXY implements B8a {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AXY(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.9yu, X.96D] */
    public final void C3q(UserJid userJid, C1418477e r8, C1418477e r9, C1418477e r10, A7B a7b, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C198789yu A002;
        String str3;
        C161588Gc r2;
        C198789yu r1;
        C41731wy r12;
        C198789yu A003;
        String A012;
        int i = this.A00;
        Object obj = this.A01;
        boolean z5 = z3;
        if (i != 0) {
            C161588Gc r22 = (C161588Gc) obj;
            C1767695m r13 = (C1767695m) this.A02;
            String str4 = this.A03;
            r13.A01 = 0;
            r13.A02 = 8;
            AnonymousClass1DT r14 = r22.A01;
            r14.A0F(r14.A06());
            if (a7b != null || !z) {
                AnonymousClass8BX.A1C(r22.A0g, a7b, "viewContactInfo error: ", AnonymousClass000.A10());
                if (a7b == null || (A012 = r22.A0e.A01(a7b.A00)) == null) {
                    r12 = r22.A08;
                    A003 = C198789yu.A00(6);
                } else {
                    A003 = C198789yu.A00(8);
                    A003.A0E = A012;
                    r12 = r22.A08;
                }
                r12.A0F(A003);
                return;
            } else if (userJid != null) {
                AnonymousClass1QE r4 = r22.A0g;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("viewContactInfo jid: ");
                A10.append(userJid);
                r4.A06(C17900vP.A0D(" blocked: ", A10, z5));
                C37551pj r15 = r22.A0L;
                UserJid A004 = C22941Dw.A00(userJid);
                C17960vV.A07(A004);
                if (z5 != r15.A0P(A004)) {
                    r15.A0L((C57732jY) null);
                }
                C198789yu A005 = C198789yu.A00(4);
                A005.A03 = r22.A0M.A0H(userJid);
                r2 = r22;
                r1 = A005;
            } else {
                C198789yu A006 = C198789yu.A00(5);
                A006.A0I = str4;
                A006.A0H = str;
                A006.A07 = r8;
                A006.A0D = str2;
                r2 = r22;
                r1 = A006;
            }
        } else {
            AnonymousClass96K r23 = (AnonymousClass96K) obj;
            C1418477e r5 = (C1418477e) this.A02;
            String str5 = this.A03;
            AnonymousClass1QE r42 = r23.A0g;
            r42.A06("IN- HANDLE_SEND_AGAIN vpa valid check response");
            r23.A0q(false);
            if (!z || a7b != null) {
                if (!z3) {
                    if (a7b != null) {
                        r42.A06("IN- HANDLE_SEND_AGAIN error from server");
                        A002 = C198789yu.A00(8);
                        C19967A1c A022 = r23.A04.A02(r23.A05.A04, a7b.A00);
                        if (A022.A00 != 0) {
                            str3 = A022.A00(r23.A0P.A00);
                        } else {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("Unhandled error code : ");
                            r42.A05(C17880vN.A0t(A102, a7b.A00));
                            str3 = null;
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str3 = r23.A0P.A00.getString(2131893643);
                        }
                        A002.A0E = str3;
                    } else {
                        r42.A05("Unable to validate the receiver to send payment again");
                        return;
                    }
                }
                r42.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                A002 = C198789yu.A00(13);
                A002.A06 = userJid;
                A002.A0I = str5;
            } else {
                if (!z3) {
                    r42.A06("IN- HANDLE_SEND_AGAIN starting payment");
                    ? r16 = new C198789yu(105);
                    r16.A01 = r5;
                    r16.A0H = str;
                    r16.A07 = r8;
                    r16.A0D = str2;
                    r16.A00 = r23.A06.A01.A09;
                    r2 = r23;
                    r1 = r16;
                }
                r42.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                A002 = C198789yu.A00(13);
                A002.A06 = userJid;
                A002.A0I = str5;
            }
            r23.A08.A0F(A002);
            return;
        }
        r2.A08.A0F(r1);
    }
}
