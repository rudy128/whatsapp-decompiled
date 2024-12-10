package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8zn  reason: invalid class name and case insensitive filesystem */
public class C176108zn extends AZ9 {
    public final C19880zA A00;
    public final AnonymousClass1L9 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass18O A04;
    public final AnonymousClass181 A05;
    public final C40751vD A06;
    public final AnonymousClass11C A07;
    public final AnonymousClass11P A08;
    public final C19830z4 A09;
    public final C18000vb A0A;
    public final C18030ve A0B;
    public final AnonymousClass1LU A0C;
    public final AXR A0D;
    public final A5D A0E;
    public final C184659bJ A0F;
    public final C20748AXd A0G;
    public final AnonymousClass1QL A0H;
    public final C31051ew A0I;
    public final AnonymousClass1QD A0J;
    public final C20110A7s A0K;
    public final AnonymousClass1QO A0L;
    public final BD4 A0M;
    public final C20037A4g A0N;
    public final C20749AXe A0O;
    public final A5Y A0P;
    public final AnonymousClass1R2 A0Q;
    public final AnonymousClass1PP A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass1KG A0U;
    public final C191949nS A0V;
    public final C33351ig A0W;
    public final A5F A0X;

    public int BZ3() {
        return 2;
    }

    public void A01(Context context, AnonymousClass1FR r9) {
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet;
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet2;
        A5Y a5y = this.A0P;
        String A012 = A5Y.A01(a5y, "p2p_context", false);
        if (A012 == null) {
            C21133Af1.A00(A5I.A00(this.A05), r9, this, 12);
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(A012)) {
            this.A0X.A02((AnonymousClass1FY) AnonymousClass1L9.A00(context), "p2p_context", "receive_flow");
        } else {
            C20832AaA aaA = new C20832AaA(context, A012);
            if (a5y.A08("p2p_context")) {
                PaymentsWarmWelcomeBottomSheet A002 = C196799vf.A00("receive_flow");
                A002.A02 = new C20834AaC(this, 0);
                paymentsWarmWelcomeBottomSheet2 = A002;
            } else {
                if (C18020vd.A05(C18040vf.A02, this.A0B, 3013)) {
                    paymentsWarmWelcomeBottomSheet2 = C196799vf.A01("receive_flow");
                } else {
                    AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putString("referral_screen", "receive_flow");
                    addPaymentMethodBottomSheet.A1R(A0D2);
                    addPaymentMethodBottomSheet.A03 = new C186149dj(0, 2131886180, 0);
                    addPaymentMethodBottomSheet.A04 = aaA;
                    paymentsWarmWelcomeBottomSheet = addPaymentMethodBottomSheet;
                    r9.CMl(paymentsWarmWelcomeBottomSheet);
                }
            }
            paymentsWarmWelcomeBottomSheet2.A01 = aaA;
            paymentsWarmWelcomeBottomSheet = paymentsWarmWelcomeBottomSheet2;
            r9.CMl(paymentsWarmWelcomeBottomSheet);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8pG, java.lang.Object] */
    public AnonymousClass8pG BdL() {
        return new Object();
    }

    public BD4 BRb() {
        return this.A0M;
    }

    public List BWQ(AW0 aw0, AnonymousClass205 r12) {
        String str;
        String str2;
        AnonymousClass1QE r1;
        String str3;
        AnonymousClass8pT r0;
        List BWQ = super.BWQ(aw0, r12);
        if (BWQ == null) {
            BWQ = AnonymousClass000.A13();
        }
        AnonymousClass8pG r02 = aw0.A0A;
        if (r02 != null) {
            C20280AEo aEo = r02.A02;
            if (aEo != null) {
                ArrayList A13 = AnonymousClass000.A13();
                C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aEo.A01, A13);
                C17890vO.A11("message_id", aEo.A02, A13);
                String str4 = aEo.A04;
                if (!(str4 == null || str4.length() == 0)) {
                    C17890vO.A11("payment_config_id", str4, A13);
                }
                BWQ.add(AnonymousClass8BR.A0k("order", AnonymousClass8BT.A1b(A13, 0)));
            }
            C20274AEh A0C2 = aw0.A0A.A0C();
            if (A0C2 != null) {
                BWQ.add(A0C2.A01());
            }
        }
        String str5 = aw0.A0H;
        if (str5 != null) {
            C191949nS r5 = this.A0V;
            AnonymousClass1KH r3 = r5.A08;
            AnonymousClass8pK r03 = (AnonymousClass8pK) r3.A08(str5);
            if (r03 != null && r03.A01 == 5) {
                C188059go r04 = r5.A00;
                if (r04 == null) {
                    r1 = r5.A01;
                    str3 = "local elo cache is null";
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    String str6 = r04.A02;
                    r04.A02 = null;
                    A10.append(str6);
                    A10.append(r5.A0D.A00(5));
                    A10.append(r5.A0A.A07());
                    String str7 = r5.A00.A03;
                    if (str7 == null) {
                        r1 = r5.A01;
                        str3 = "credentialId is null";
                    } else {
                        C20284AEs A082 = r3.A08(str7);
                        if (A082 == null || (r0 = (AnonymousClass8pT) A082.A08) == null) {
                            str = null;
                        } else {
                            str = r0.A05;
                        }
                        A10.append(str);
                        C22565BDa bDa = r5.A00.A01;
                        C17960vV.A07(bDa);
                        A10.append(new DecimalFormat("0.00").format(((double) bDa.getValue()) / ((double) ((ARR) r5.A00.A01).A00)));
                        A10.append(AnonymousClass8BU.A0n((ARR) r5.A00.A01));
                        String str8 = r5.A00.A05;
                        C17960vV.A07(str8);
                        int hashCode = str8.hashCode();
                        if (hashCode != -1540055076) {
                            if (hashCode == -1375934236 && str8.equals("fingerprint")) {
                                str2 = "42";
                            }
                            str2 = "48";
                        } else {
                            if (str8.equals("payment_pin")) {
                                str2 = "44";
                            }
                            str2 = "48";
                        }
                        String A0y = AnonymousClass000.A0y(str2, A10);
                        C20074A6a a6a = r5.A09;
                        String A062 = a6a.A06(A0y);
                        String A072 = a6a.A07(A0y);
                        ArrayList A132 = AnonymousClass000.A13();
                        if (A062 != null) {
                            C17890vO.A11("device_signature", A062, A132);
                            if (A072 != null) {
                                C17890vO.A11("wallet_signature", A072, A132);
                                if (str6 != null) {
                                    C17890vO.A11("challenge_id", str6, A132);
                                    C17890vO.A11("cardholder_verification_method", str2, A132);
                                    r5.A00 = null;
                                    r5.A03 = false;
                                    r5.A02 = false;
                                    BWQ.add(AnonymousClass8BR.A0k("elo", AnonymousClass8BT.A1b(A132, 0)));
                                    return BWQ;
                                }
                            } else {
                                r1 = r5.A01;
                                str3 = "wallet_signature is null";
                            }
                        } else {
                            r1 = r5.A01;
                            str3 = "device_signature is null";
                        }
                    }
                }
                r1.A05(str3);
            }
        }
        return BWQ;
    }

    public Class BWV() {
        return BrazilOrderDetailsActivity.class;
    }

    public Class BWx() {
        return BrazilPaymentTransactionDetailActivity.class;
    }

    public C186719ee Bb9(AnonymousClass8pI r6, UserJid userJid, String str) {
        HashMap A11 = C17880vN.A11();
        HashMap A112 = C17880vN.A11();
        if (!C18020vd.A05(C18040vf.A02, this.A0B, 1545) || r6 == null || TextUtils.isEmpty(r6.A04)) {
            return null;
        }
        return new C186719ee(C108945cZ.A0N(AnonymousClass000.A0i(), r6.A04), userJid, A11, A112);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176108zn(X.C19880zA r10, X.AnonymousClass1L9 r11, X.AnonymousClass1KB r12, X.AnonymousClass11S r13, X.AnonymousClass18O r14, X.AnonymousClass181 r15, X.C40751vD r16, X.AnonymousClass1M9 r17, X.C24921Me r18, X.AnonymousClass11C r19, X.AnonymousClass11P r20, X.AnonymousClass118 r21, X.C19830z4 r22, X.C18000vb r23, X.C18030ve r24, X.AnonymousClass1LU r25, X.AXR r26, X.A5D r27, X.C184659bJ r28, X.C20748AXd r29, X.AnonymousClass1QL r30, X.C31051ew r31, X.AnonymousClass1KG r32, X.AnonymousClass1QD r33, X.C20110A7s r34, X.AnonymousClass1QO r35, X.AnonymousClass1QS r36, X.AZ5 r37, X.C191949nS r38, X.C33351ig r39, X.C20037A4g r40, X.C20749AXe r41, X.A5Y r42, X.A5F r43, X.AnonymousClass1R2 r44, X.AnonymousClass1PP r45, X.AnonymousClass00H r46, X.AnonymousClass00H r47) {
        /*
            r9 = this;
            java.lang.String r8 = "FBPAY"
            r1 = r9
            r7 = r44
            r4 = r19
            r2 = r17
            r5 = r21
            r3 = r18
            r6 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r20
            r9.A08 = r0
            r0 = r16
            r9.A06 = r0
            r0 = r24
            r9.A0B = r0
            r9.A02 = r12
            r9.A03 = r13
            r0 = r25
            r9.A0C = r0
            r9.A05 = r15
            r9.A04 = r14
            r9.A01 = r11
            r9.A0Q = r7
            r9.A00 = r10
            r9.A07 = r4
            r0 = r23
            r9.A0A = r0
            r0 = r45
            r9.A0R = r0
            r0 = r33
            r9.A0J = r0
            r0 = r26
            r9.A0D = r0
            r0 = r30
            r9.A0H = r0
            r0 = r22
            r9.A09 = r0
            r0 = r38
            r9.A0V = r0
            r0 = r40
            r9.A0N = r0
            r0 = r41
            r9.A0O = r0
            r0 = r35
            r9.A0L = r0
            r0 = r27
            r9.A0E = r0
            r0 = r46
            r9.A0S = r0
            r0 = r39
            r9.A0W = r0
            r0 = r29
            r9.A0G = r0
            r0 = r47
            r9.A0T = r0
            r0 = r37
            r9.A0M = r0
            r0 = r32
            r9.A0U = r0
            r0 = r28
            r9.A0F = r0
            r0 = r43
            r9.A0X = r0
            r0 = r31
            r9.A0I = r0
            r0 = r42
            r9.A0P = r0
            r0 = r34
            r9.A0K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176108zn.<init>(X.0zA, X.1L9, X.1KB, X.11S, X.18O, X.181, X.1vD, X.1M9, X.1Me, X.11C, X.11P, X.118, X.0z4, X.0vb, X.0ve, X.1LU, X.AXR, X.A5D, X.9bJ, X.AXd, X.1QL, X.1ew, X.1KG, X.1QD, X.A7s, X.1QO, X.1QS, X.AZ5, X.9nS, X.1ig, X.A4g, X.AXe, X.A5Y, X.A5F, X.1R2, X.1PP, X.00H, X.00H):void");
    }
}
