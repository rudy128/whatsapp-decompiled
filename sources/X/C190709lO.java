package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9lO  reason: invalid class name and case insensitive filesystem */
public class C190709lO {
    public final C175728zB A00;
    public final C189609jW A01;
    public final Runnable A02;

    public C190709lO(C175728zB r1, C189609jW r2, Runnable runnable) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = runnable;
    }

    public void A00(AnonymousClass1KN r25, C20284AEs aEs, AES aes, UserJid userJid, C1418477e r29, C170318pf r30, C62212r1 r31, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String str9;
        if (z3) {
            this.A02.run();
            return;
        }
        C170318pf r0 = r30;
        if (z4) {
            str9 = (String) AnonymousClass8BT.A0q(r0.A0D);
        } else {
            str9 = null;
        }
        C175728zB r15 = this.A00;
        String str10 = aEs.A0A;
        C17960vV.A07(str10);
        C189609jW r7 = this.A01;
        String str11 = r0.A0T;
        String str12 = r0.A0U;
        String str13 = r0.A0R;
        String str14 = r0.A0S;
        String str15 = r0.A0V;
        String str16 = r0.A0O;
        String str17 = r0.A0P;
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("sender-vpa", str11, A13);
        if (!TextUtils.isEmpty(str12)) {
            C17890vO.A11("sender-vpa-id", str12, A13);
        }
        if (!TextUtils.isEmpty(str13)) {
            C17960vV.A07(str13);
            C17890vO.A11("receiver-vpa", str13, A13);
        }
        if (!TextUtils.isEmpty(str14)) {
            C17890vO.A11("receiver-vpa-id", str14, A13);
        }
        if (!TextUtils.isEmpty(str9)) {
            C17890vO.A11("upi-bank-info", str9, A13);
        }
        C17890vO.A11("seq-no", str15, A13);
        if (!TextUtils.isEmpty(str16)) {
            C17890vO.A11("mcc", str16, A13);
        }
        String str18 = str2;
        if (!TextUtils.isEmpty(str18)) {
            C17890vO.A11("ref-id", str18, A13);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C17890vO.A11("ref-url", (String) null, A13);
        }
        if (!C20061A5k.A02(r29)) {
            C17890vO.A11("payee-name", AnonymousClass8BS.A0h(r29), A13);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C17890vO.A11("mode", (String) null, A13);
        }
        if (!TextUtils.isEmpty(str17)) {
            C17890vO.A11("purpose-code", str17, A13);
        }
        String str19 = str7;
        if (!TextUtils.isEmpty(str19)) {
            C17890vO.A11("note", str19, A13);
        }
        C18030ve r10 = r15.A07;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r10, 1918)) {
            String str20 = "1";
            String str21 = "0";
            if (z) {
                str21 = str20;
            }
            C17890vO.A11("merchant", str21, A13);
            if (!z2) {
                str20 = "0";
            }
            C17890vO.A11("verified-merchant", str20, A13);
        }
        String str22 = str8;
        if (!TextUtils.isEmpty(str22)) {
            C17890vO.A11("international-pay-detail", str22, A13);
        }
        String str23 = str3;
        if (!TextUtils.isEmpty(str23)) {
            C17890vO.A11("business_order_id", str23, A13);
        }
        C29621ca r8 = null;
        if (!TextUtils.isEmpty(str18)) {
            String str24 = str6;
            if (!TextUtils.isEmpty(str24)) {
                ArrayList A132 = AnonymousClass000.A13();
                C17890vO.A11("order-id", str18, A132);
                C17890vO.A11("payment-config-id", str24, A132);
                String str25 = str4;
                if (!TextUtils.isEmpty(str25) && C18020vd.A05(r2, r10, 1599)) {
                    C17890vO.A11("discount-program-name", str25, A132);
                }
                long j2 = j;
                if (j != 0) {
                    AnonymousClass8BT.A1U("expiry-ts", A132, j2);
                }
                String str26 = str5;
                if (C18020vd.A05(r2, r10, 1330) && !TextUtils.isEmpty(str26)) {
                    C17890vO.A11("order-type", str26, A132);
                }
                if ("physical-goods".equals(str26) && C18020vd.A05(r2, r10, 3012)) {
                    if (list != null) {
                        ArrayList A14 = AnonymousClass000.A14(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ADC adc = (ADC) it.next();
                            ArrayList A133 = AnonymousClass000.A13();
                            C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, adc.A04, A133);
                            C17890vO.A11("address_line1", adc.A00, A133);
                            String str27 = adc.A01;
                            if (!TextUtils.isEmpty(str27)) {
                                C17890vO.A11("address_line2", str27, A133);
                            }
                            String str28 = adc.A02;
                            if (!TextUtils.isEmpty(str28)) {
                                C17890vO.A11("city", str28, A133);
                            }
                            String str29 = adc.A06;
                            if (!TextUtils.isEmpty(str29)) {
                                C17890vO.A11("state", str29, A133);
                            }
                            C17890vO.A11("country", adc.A03, A133);
                            C17890vO.A11("postal_code", adc.A05, A133);
                            C29621ca.A05("beneficiary", A14, AnonymousClass8BT.A1b(A133, 0));
                        }
                        r8 = AnonymousClass8BR.A0l("beneficiaries", (AnonymousClass1MD[]) null, C17890vO.A1Y(A14, 0));
                    } else {
                        AES aes2 = aes;
                        if (aes != null) {
                            ArrayList A134 = AnonymousClass000.A13();
                            AEV A002 = aes2.A00();
                            if (!(aes2.A04 == null || A002 == null)) {
                                ArrayList A135 = AnonymousClass000.A13();
                                C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A002.A07.toString(), A135);
                                C17890vO.A11("phone_number", A002.A08.toString(), A135);
                                C17890vO.A11("address_line1", A002.A00.toString(), A135);
                                C17890vO.A11("city", A002.A02.toString(), A135);
                                C17890vO.A11("country", "IN", A135);
                                C17890vO.A11("postal_code", A002.A05.toString(), A135);
                                C17890vO.A11("state", A002.A09.toString(), A135);
                                ADB[] adbArr = new ADB[5];
                                adbArr[0] = A002.A04;
                                adbArr[1] = A002.A03;
                                adbArr[2] = A002.A0A;
                                adbArr[3] = A002.A01;
                                List A0O = C18070vi.A0O(A002.A06, adbArr, 4);
                                ArrayList A136 = AnonymousClass000.A13();
                                for (Object next : A0O) {
                                    AnonymousClass3MZ.A1V(next, A136, AnonymousClass1EG.A0H(next.toString()) ? 1 : 0);
                                }
                                String A0h = C29431cG.A0h(" ", A136, B2C.A00);
                                if (!TextUtils.isEmpty(A0h)) {
                                    C17890vO.A11("address_line2", A0h, A135);
                                }
                                C29621ca.A05("beneficiary", A134, AnonymousClass8BT.A1b(A135, 0));
                            }
                            r8 = AnonymousClass8BR.A0l("beneficiaries", (AnonymousClass1MD[]) null, C17890vO.A1Y(A134, 0));
                        }
                    }
                }
                r8 = new C29621ca(r8, "order", AnonymousClass8BT.A1b(A132, 0));
            }
        }
        C189609jW r19 = r7;
        r15.A0F.CGF(new C21399AjS(r15, userJid, r25, r31, r19, new C29621ca(r8, "upi", AnonymousClass8BT.A1b(A13, 0)), str10, str, 1));
    }
}
