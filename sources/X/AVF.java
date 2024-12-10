package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.Set;

public final class AVF implements C72443Lz {
    public final AnonymousClass1QS A00;

    public AVF(AnonymousClass1QS r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BLq(C196049uN r13, C195829ty r14, A1O a1o) {
        String A01;
        String str;
        boolean A17 = C18070vi.A17(a1o, r14);
        boolean z = true;
        boolean A1O = AnonymousClass000.A1O(((a1o.A04 & 8192) > 0 ? 1 : ((a1o.A04 & 8192) == 0 ? 0 : -1)));
        AnonymousClass206 r4 = r14.A03;
        if (r4 instanceof AnonymousClass21D) {
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePaymentInvite");
            int i = ((AnonymousClass21D) r4).A00;
            AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "invite", r2, 0);
            if (i == A17) {
                str = "FBPAY";
            } else if (i == 2) {
                str = "NOVI";
            } else if (i != 3) {
                str = null;
            } else {
                str = "UPI";
            }
            C17960vV.A07(str);
            C18070vi.A0X(str);
            C17880vN.A1Q("service", str, r2, A17 ? 1 : 0);
            A1O.A00(a1o, AnonymousClass8BR.A0k("pay", r2));
            if (!A1O) {
                return;
            }
        } else {
            C166418cr r22 = r14.A02;
            if (!AnonymousClass000.A1O(r22.bitField0_ & 32768) && !AnonymousClass000.A1O(r22.bitField0_ & A7Y.A0F)) {
                z = false;
            }
            int i2 = a1o.A03;
            if (i2 == 0 && (z || !(r4 == null || r4.A05 <= 0 || (A01 = AnonymousClass25B.A01(r4)) == null || A01.length() == 0))) {
                AnonymousClass1QS r23 = this.A00;
                AnonymousClass205 r9 = a1o.A08;
                BD1 bd1 = null;
                AW0 A0J = AnonymousClass8BU.A0J(r23.A04, r9.A01, (String) null);
                if (A0J != null) {
                    C57312is A04 = r23.A04(A0J.A0G);
                    C29621ca[] r0 = null;
                    if (A04 != null) {
                        bd1 = A04.A00(A0J.A0I);
                    }
                    AnonymousClass1MD[] r3 = new AnonymousClass1MD[0];
                    if (bd1 != null) {
                        List BWR = bd1.BWR(A0J, r9);
                        if (BWR != null) {
                            r3 = (AnonymousClass1MD[]) BWR.toArray(r3);
                        }
                        List BWQ = bd1.BWQ(A0J, r9);
                        if (BWQ != null && !BWQ.isEmpty()) {
                            r0 = (C29621ca[]) BWQ.toArray(new C29621ca[0]);
                        }
                    }
                    A1O.A00(a1o, AnonymousClass8BR.A0l("pay", r3, r0));
                }
            }
            if (!A1O && (!z || i2 <= 0)) {
                return;
            }
        }
        a1o.A02(C18070vi.A0M(AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "pay")));
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.PAYMENT;
    }

    public /* synthetic */ Set CGJ() {
        return C25511Om.A00;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
