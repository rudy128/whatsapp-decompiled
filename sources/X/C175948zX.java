package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.8zX  reason: invalid class name and case insensitive filesystem */
public class C175948zX extends C175498yo {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175948zX(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175728zB r12, C62212r1 r13, C189609jW r14, Integer num) {
        super(context, r9, r10, r11, "pay-precheck");
        this.A01 = r12;
        this.A02 = r14;
        this.A04 = r13;
        this.A03 = num;
    }

    public void A04(A7B a7b) {
        A7B a7b2 = a7b;
        if (this.A00 != 0) {
            super.A04(a7b);
            A07(a7b);
            ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, a7b2, (String) null, false);
            return;
        }
        C18070vi.A0d(a7b, 0);
        super.A04(a7b);
        AnonymousClass8BR.A0b(((C175688z7) this.A04).A08).A01(a7b, (Integer) this.A02, "upi-get-p2m-checkout-session");
        ((BBC) this.A01).Bss(a7b);
    }

    public void A05(A7B a7b) {
        A7B a7b2 = a7b;
        if (this.A00 != 0) {
            super.A05(a7b);
            A07(a7b);
            ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, a7b2, (String) null, false);
            return;
        }
        C18070vi.A0d(a7b, 0);
        super.A05(a7b);
        AnonymousClass8BR.A0b(((C175688z7) this.A04).A08).A01(a7b, (Integer) this.A02, "upi-get-p2m-checkout-session");
        ((BBC) this.A01).Bss(a7b);
    }

    public void A06(C29621ca r18) {
        C62212r1 r0;
        String str;
        AnonymousClass8pF r10;
        String str2;
        String str3;
        C62212r1 r02;
        C29621ca r3 = r18;
        if (this.A00 != 0) {
            super.A06(r3);
            try {
                C29621ca A0K = r3.A0K("account");
                if (A0K == null) {
                    Log.e("PAY: IndiaUpiPayPrecheckAction sendPrecheck: empty account node");
                    A07((A7B) null);
                    ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, A7B.A00(), (String) null, false);
                    return;
                }
                AnonymousClass8pH r8 = new AnonymousClass8pH();
                C175728zB r32 = (C175728zB) this.A01;
                AnonymousClass1KI r102 = r32.A06;
                r8.A05(r102, A0K, 8);
                C29621ca A0K2 = A0K.A0K("transaction");
                C29621ca A0K3 = A0K.A0K("upi");
                C29621ca A0K4 = A0K.A0K("account");
                A7B A012 = A7B.A01(A0K);
                C29621ca A0K5 = A0K.A0K("offer_eligibility");
                if (A0K2 == null || A0K3 == null) {
                    Bundle bundle = r8.A00;
                    if (bundle != null && bundle.getString("updatedVpaFor") != null) {
                        AnonymousClass8pF r11 = new AnonymousClass8pF();
                        if (A0K4 != null) {
                            r11.A05(r102, A0K4, 0);
                        }
                        Bundle bundle2 = r8.A00;
                        if (bundle2 != null) {
                            str = bundle2.getString("updatedVpaFor");
                        } else {
                            str = null;
                        }
                        if ("sender".equals(str)) {
                            r10 = new AnonymousClass8pF();
                            r10.A03 = AnonymousClass11S.A00(r32.A03);
                            C144717Ik A0Z = AnonymousClass8BR.A0Z();
                            Bundle bundle3 = r8.A00;
                            if (bundle3 != null) {
                                str2 = bundle3.getString("updatedSenderVpa");
                            } else {
                                str2 = null;
                            }
                            C1418477e A0L = AnonymousClass8BT.A0L(A0Z, str2);
                            r10.A01 = A0L;
                            Bundle bundle4 = r8.A00;
                            if (bundle4 != null) {
                                str3 = bundle4.getString("updatedSenderVpaId");
                            } else {
                                str3 = null;
                            }
                            r10.A02 = str3;
                            r32.A0A.A0A((C33661jB) null);
                            if (A0L.A00 == null) {
                                r10 = null;
                            } else {
                                r32.A08.A0O(A0L, r11.A02);
                            }
                            r11 = null;
                        } else if (r11.A03 != null) {
                            if (r11.A03) {
                                r11.A01 = null;
                                r11.A02 = null;
                            }
                            A5I A013 = r32.A0B.A01();
                            AnonymousClass3MW.A1T(new AnonymousClass8p2(A013, r32.A05, r11), A013.A03, 0);
                            r10 = null;
                        } else {
                            r10 = null;
                            r11 = null;
                        }
                        r32.A0D.A04((Integer) this.A03, "pay-precheck");
                        ((C189609jW) this.A02).A00(r10, r11, (A7B) null, (String) null, false);
                    } else if (A012 != null) {
                        if (A012.A00 == 2896004) {
                            C17890vO.A0v(r32.A0F, this, 42);
                        }
                        if (!(A0K5 == null || (r0 = (C62212r1) this.A04) == null)) {
                            r32.A0C.A08(A0K5, r0.A01);
                        }
                        A07(A012);
                        ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, A012, (String) null, false);
                    } else {
                        A07((A7B) null);
                        ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, A7B.A00(), (String) null, false);
                    }
                } else {
                    String A0P = A0K2.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (!(A0K5 == null || (r02 = (C62212r1) this.A04) == null)) {
                        r32.A0C.A08(A0K5, r02.A01);
                    }
                    r32.A0D.A04((Integer) this.A03, "pay-precheck");
                    ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, (A7B) null, A0P, AnonymousClass000.A1W(A0K5));
                }
            } catch (AnonymousClass1UI unused) {
                A07((A7B) null);
                ((C189609jW) this.A02).A00((AnonymousClass8pF) null, (AnonymousClass8pF) null, A7B.A00(), (String) null, false);
            }
        } else {
            C18070vi.A0d(r3, 0);
            super.A06(r3);
            try {
                AnonymousClass9FM r4 = new AnonymousClass9FM(r3, (AnonymousClass9F5) this.A03);
                AnonymousClass8BR.A0b(((C175688z7) this.A04).A08).A02((Integer) this.A02, "upi-get-p2m-checkout-session", 2);
                ((BBC) this.A01).C3k(r4);
            } catch (AnonymousClass1UI unused2) {
                Log.e("PAY: IndiaUpiGetP2mCheckoutSessionAction/getCheckoutSession: invalid response message");
                A7B A002 = A7B.A00();
                AnonymousClass8BR.A0b(((C175688z7) this.A04).A08).A01(A002, (Integer) this.A02, "upi-get-p2m-checkout-session");
                ((BBC) this.A01).Bss(A002);
            }
        }
    }

    public void A07(A7B a7b) {
        ((C175728zB) this.A01).A0D.A02.A01(a7b, (Integer) this.A03, "pay-precheck");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175948zX(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, BBC bbc, C175688z7 r13, AnonymousClass9F5 r14, Integer num) {
        super(context, r9, r10, r11, "upi-get-p2m-checkout-session");
        this.A04 = r13;
        this.A02 = num;
        this.A01 = bbc;
        this.A03 = r14;
    }
}
