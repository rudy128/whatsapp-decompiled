package com.whatsapp.payments.ui;

import X.A2C;
import X.A2X;
import X.A6X;
import X.ADC;
import X.AES;
import X.AGD;
import X.AHE;
import X.ARR;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1PM;
import X.AnonymousClass1QD;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass21K;
import X.AnonymousClass21L;
import X.AnonymousClass2L2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8Gd;
import X.AnonymousClass96U;
import X.AnonymousClass9I2;
import X.BD4;
import X.BD5;
import X.C000200d;
import X.C003401n;
import X.C108955ca;
import X.C132216mP;
import X.C137116uw;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C181539Qw;
import X.C189549jQ;
import X.C189619jX;
import X.C191129m4;
import X.C191559mn;
import X.C191979nV;
import X.C192479oS;
import X.C194579rx;
import X.C196229uf;
import X.C196449v5;
import X.C198609yc;
import X.C20112A7u;
import X.C20129A8p;
import X.C20130A8q;
import X.C20140A9b;
import X.C20279AEn;
import X.C20285AEt;
import X.C20828Aa6;
import X.C20836AaE;
import X.C20900AbG;
import X.C20903AbJ;
import X.C21427Aju;
import X.C21435Ak2;
import X.C21529Alc;
import X.C22579BDz;
import X.C22941Dw;
import X.C24681Lg;
import X.C24921Me;
import X.C25181Nf;
import X.C29431cG;
import X.C33251iW;
import X.C33651jA;
import X.C36401np;
import X.C36531o3;
import X.C63662tU;
import X.C63932tv;
import X.C72473Md;
import X.C73203Rj;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class P2mLiteOrderDetailsActivity extends AnonymousClass1FY implements BD5 {
    public C132216mP A00;
    public C33251iW A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass1PM A03;
    public C24921Me A04;
    public C36531o3 A05;
    public C25181Nf A06;
    public AnonymousClass122 A07;
    public C24681Lg A08;
    public AnonymousClass1QR A09;
    public AnonymousClass1MB A0A;
    public AnonymousClass1LU A0B;
    public AnonymousClass1QD A0C;
    public AnonymousClass1QO A0D;
    public AnonymousClass1QS A0E;
    public C33651jA A0F;
    public A2C A0G;
    public C189549jQ A0H;
    public C20828Aa6 A0I;
    public AnonymousClass96U A0J;
    public C192479oS A0K;
    public AnonymousClass1R2 A0L;
    public AnonymousClass205 A0M;
    public A6X A0N;
    public C36401np A0O;
    public A2X A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public Integer A0W;
    public WeakReference A0X;
    public List A0Y;
    public C18140vp A0Z;
    public AnonymousClass1E7 A0a;
    public boolean A0b;
    public final C189619jX A0c;

    public static final void A0c(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, AnonymousClass21L r11, String str) {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        C73203Rj A002 = AnonymousClass4a6.A00(p2mLiteOrderDetailsActivity);
        A002.A0E(2131899304);
        A002.A0D(2131899303);
        A002.A0T(false);
        A002.A0Y(new C20140A9b(p2mLiteOrderDetailsActivity2, r11, str, 0), 2131899286);
        A002.A0Z(new C20140A9b(p2mLiteOrderDetailsActivity2, r11, str, 1), 2131894985);
        String A0F2 = C18070vi.A0F(p2mLiteOrderDetailsActivity2, 2131899304);
        C20112A7u A003 = C196449v5.A00();
        A003.A07("payments_error_code", "10755");
        A003.A07("payments_error_text", A0F2);
        A0Q(A003, p2mLiteOrderDetailsActivity2, r11, (Integer) null, "error_dialog", str, 0);
        A002.A0C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0.intValue() != 1) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0d(com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r8, X.AnonymousClass21L r9, boolean r10) {
        /*
            r2 = r9
            if (r9 == 0) goto L_0x002c
            X.AEt r0 = r9.A00
            if (r0 == 0) goto L_0x001d
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x001d
            int r0 = X.C20089A6r.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x001d
            int r1 = r0.intValue()
            r0 = 1
            r6 = 4
            if (r1 == r0) goto L_0x001f
        L_0x001d:
            r6 = 11
        L_0x001f:
            X.A6X r1 = r8.A0N
            if (r1 == 0) goto L_0x002d
            r3 = 0
            r9 = 0
            r7 = 1
            r5 = r3
            r8 = r10
            r4 = r3
            r1.A06(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x002c:
            return
        L_0x002d:
            java.lang.String r0 = "orderDetailsMessageLogging"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0d(com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity, X.21L, boolean):void");
    }

    public final void A4d(String str, String str2, String str3) {
        C22579BDz bDz;
        C20129A8p a8p;
        C189549jQ r0 = this.A0H;
        if (r0 != null) {
            C20130A8q A002 = r0.A00(str);
            if (A002 == null || (a8p = A002.A00) == null) {
                bDz = null;
            } else {
                bDz = (C22579BDz) a8p.A0A("native_p2m_lite_compliance");
            }
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("account_compliance_status", str2, r1, 0);
            AnonymousClass1D6.A03("last_screen", str3, r1, 1);
            LinkedHashMap A0B2 = AnonymousClass1D7.A0B(r1);
            if (bDz != null) {
                bDz.BLG(A0B2);
                return;
            }
            return;
        }
        C18070vi.A11("phoenixManagerRegistry");
        throw null;
    }

    public boolean Bg0() {
        return false;
    }

    public /* synthetic */ void Bl6(String str) {
    }

    public /* synthetic */ void BlW() {
    }

    public void Bpc(AnonymousClass1BI r1, C191559mn r2, AnonymousClass21K r3) {
    }

    public void Bzg(AnonymousClass9I2 r14, C191979nV r15) {
        Resources resources = getResources();
        C18030ve r2 = this.A0E;
        C18070vi.A0W(r2);
        String A0m = AnonymousClass3MY.A0m(resources, C181539Qw.A00(C18020vd.A00(C18040vf.A02, r2, 4248)));
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0S(A0m);
        }
        this.A05.CGN(new C21435Ak2(this, r14, r15, 38));
        A4b().A05.A02(this, this.A02, (AES) null, r14, r15, A4b().A08, (List) null, 4, r15.A00);
    }

    public void Bzh(AnonymousClass9I2 r1, C191979nV r2) {
    }

    public /* synthetic */ void C32() {
    }

    public void C59(ARR arr) {
        String str;
        String str2;
        Integer num;
        List<ADC> list;
        AnonymousClass1BI r0;
        C18070vi.A0d(arr, 0);
        LinkedHashMap A13 = C17880vN.A13();
        String str3 = A4b().A0B;
        String str4 = A4b().A0C;
        AnonymousClass1E7 r02 = this.A0a;
        if (r02 == null || (r0 = r02.A0J) == null) {
            str = null;
        } else {
            str = r0.getRawString();
        }
        if (str3 != null && str4 != null && str != null) {
            A13.put("action", "start");
            A13.put("order_id", str3);
            A13.put("order_message_id", A4c().A01);
            double doubleValue = arr.A02.A00.doubleValue();
            int i = arr.A00;
            A13.put("order_amount", Long.valueOf((long) (doubleValue * ((double) i))));
            A13.put("order_amount_offset", Integer.valueOf(i));
            A13.put("order_currency", AnonymousClass8BU.A0n(arr));
            if (A4b().A00 != 0) {
                A13.put("order_expiration_timestamp", Long.valueOf(A4b().A00));
            }
            A13.put("order_payment_config", str4);
            A13.put("seller_jid", str);
            A13.put("request_id", C17890vO.A0Q());
            A13.put("referral", "order_details");
            Integer num2 = this.A0W;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (1 == intValue) {
                    str2 = "digital-goods";
                } else if (2 == intValue) {
                    str2 = "physical-goods";
                } else {
                    str2 = "unknown";
                }
            } else {
                str2 = "unknown";
            }
            A13.put("order_type", str2);
            if (C18020vd.A05(C18040vf.A02, this.A0E, 3012) && (num = this.A0W) != null && 2 == num.intValue() && (list = this.A0Y) != null) {
                ArrayList A132 = AnonymousClass000.A13();
                for (ADC adc : list) {
                    JSONObject A15 = C17880vN.A15();
                    A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, adc.A04);
                    A15.put("address_line1", adc.A00);
                    String str5 = adc.A01;
                    if (str5.length() != 0) {
                        A15.put("address_line2", str5);
                    }
                    String str6 = adc.A02;
                    if (str6.length() != 0) {
                        A15.put("city", str6);
                    }
                    String str7 = adc.A06;
                    if (str7.length() != 0) {
                        A15.put("state", str7);
                    }
                    A15.put("country", adc.A03);
                    A15.put("postal_code", adc.A05);
                    A132.add(A15);
                }
                A13.put("order_beneficiaries", C29431cG.A0h(", ", C18070vi.A0M(A132), new C21529Alc(4)));
            }
            C194579rx r7 = new C194579rx("p2m_lite_checkout", (String) null, A13);
            CNA(2131895077);
            AnonymousClass1QD r03 = this.A0C;
            if (r03 != null) {
                C17880vN.A1F(AnonymousClass8BU.A07(r03), "has_p2mlite_account", true);
                C18140vp r04 = this.A0Z;
                if (r04 != null) {
                    ((C191129m4) r04.get()).A00(new C20900AbG(this, 9), new C20903AbJ(this, 5), r7, "order_details", (Map) null);
                } else {
                    C18070vi.A11("paymentsPhoenixManager");
                    throw null;
                }
            } else {
                C18070vi.A11("paymentSharedPrefs");
                throw null;
            }
        }
    }

    public /* synthetic */ void C5T(AES aes, String str) {
    }

    public static final void A03(WaFragment waFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, AnonymousClass21L r6, String str, String str2, int i) {
        if (i == 10755) {
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A28();
            }
            A0c(p2mLiteOrderDetailsActivity, r6, str2);
            p2mLiteOrderDetailsActivity.A4d(str, "BLOCKED", "enter_dob");
        } else if (i != 10756) {
            if (waFragment instanceof P2mLiteConfirmLegalNameBottomSheetFragment) {
                ((ConfirmLegalNameBottomSheetFragment) waFragment).A28(true);
            } else if (waFragment instanceof P2mLiteConfirmDateOfBirthBottomSheetFragment) {
                ((ConfirmDateOfBirthBottomSheetFragment) waFragment).A27(true);
            }
            C73203Rj A0E2 = AnonymousClass8BW.A0E(p2mLiteOrderDetailsActivity);
            A0E2.A0D(2131896261);
            C73203Rj.A06(A0E2);
            AnonymousClass3MY.A1G(A0E2);
        } else {
            A0V(p2mLiteOrderDetailsActivity, paymentBottomSheet2, r6, str, str2);
        }
    }

    public static final void A0Q(C20112A7u a7u, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, AnonymousClass21L r12, Integer num, String str, String str2, int i) {
        Integer num2;
        C20285AEt aEt;
        C20279AEn aEn;
        C20285AEt aEt2;
        C20279AEn aEn2;
        AnonymousClass00H r0 = p2mLiteOrderDetailsActivity.A0S;
        if (r0 != null) {
            BD4 bd4 = (BD4) r0.get();
            String str3 = null;
            if (r12 == null || (aEt2 = r12.A00) == null || (aEn2 = aEt2.A02) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(aEn2.A01());
            }
            String A012 = C196449v5.A01(num2);
            if (!(r12 == null || (aEt = r12.A00) == null || (aEn = aEt.A02) == null)) {
                str3 = aEn.A04();
            }
            bd4.BiJ(a7u, num, str, str2, A012, str3, i, true, true, false);
            return;
        }
        C18070vi.A11("p2mLiteEventLogger");
        throw null;
    }

    public void A2y() {
        if (!this.A0b) {
            this.A0b = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A00(r1, r2, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A02 = AnonymousClass10E.A4z(r1);
            this.A05 = (C36531o3) r1.A2n.get();
            this.A06 = AnonymousClass3MZ.A0m(r1);
            this.A07 = AnonymousClass3MZ.A0n(r1);
            this.A0Q = C000200d.A00(r1.A3w);
            this.A0O = AnonymousClass3MY.A0e(r2);
            this.A0R = C000200d.A00(r1.AYe);
            this.A08 = AnonymousClass3MZ.A0o(r1);
            this.A0N = AnonymousClass8BV.A0O(r1);
            this.A0S = C000200d.A00(r2.AEK);
            this.A0K = (C192479oS) r2.AES.get();
            this.A0T = C000200d.A00(r1.A86);
            this.A0C = AnonymousClass8BU.A0Q(r1);
            this.A0F = (C33651jA) r1.A8B.get();
            this.A0U = C000200d.A00(r1.A8C);
            this.A09 = (AnonymousClass1QR) r1.A8D.get();
            this.A0G = (A2C) r2.AEZ.get();
            this.A0D = AnonymousClass3Ma.A0q(r1);
            this.A0E = AnonymousClass3MZ.A0z(r1);
            this.A0Z = r2.AEf;
            this.A0L = AnonymousClass8BU.A0V(r1);
            this.A0H = AnonymousClass8BV.A0H(r1);
            this.A00 = AnonymousClass8BT.A0A(r2);
            this.A0A = AnonymousClass3Ma.A0k(r1);
            this.A0V = C000200d.A00(r1.AB2);
            this.A01 = AnonymousClass3MZ.A0U(r1);
            this.A03 = AnonymousClass3MZ.A0f(r1);
            this.A04 = AnonymousClass3MZ.A0g(r1);
            this.A0B = AnonymousClass3MY.A0Z(r1);
        }
    }

    public final C20828Aa6 A4b() {
        C20828Aa6 aa6 = this.A0I;
        if (aa6 != null) {
            return aa6;
        }
        C18070vi.A11("orderDetailsCoordinator");
        throw null;
    }

    public final AnonymousClass205 A4c() {
        AnonymousClass205 r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageKey");
        throw null;
    }

    public String BXz() {
        AnonymousClass1E7 r1 = this.A0a;
        if (r1 != null) {
            C24921Me r0 = this.A04;
            if (r0 != null) {
                String A0I2 = r0.A0I(r1);
                if (A0I2 == null) {
                    return "";
                }
                return A0I2;
            }
            C18070vi.A11("waContactNames");
            throw null;
        }
        return "";
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.9uf, X.96U] */
    public void onCreate(Bundle bundle) {
        String str;
        AnonymousClass1E7 r0;
        super.onCreate(bundle);
        AnonymousClass205 A032 = AnonymousClass1R2.A03(getIntent());
        boolean A1W = AnonymousClass8BU.A1W(A032);
        this.A0M = A032;
        C22941Dw r02 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(A4c().A00);
        AnonymousClass11P r9 = this.A05;
        C18070vi.A0W(r9);
        C18030ve r8 = this.A0E;
        C18070vi.A0W(r8);
        C36401np r7 = this.A0O;
        if (r7 != null) {
            Resources A0D2 = C108955ca.A0D(this);
            AnonymousClass1R2 r6 = this.A0L;
            if (r6 != null) {
                C18000vb r5 = this.A00;
                C18070vi.A0W(r5);
                AnonymousClass1QS r4 = this.A0E;
                if (r4 != null) {
                    AnonymousClass1PM r3 = this.A03;
                    if (r3 != null) {
                        AnonymousClass1QO r2 = this.A0D;
                        if (r2 != null) {
                            C25181Nf r1 = this.A06;
                            if (r1 != null) {
                                C36531o3 r03 = this.A05;
                                if (r03 != null) {
                                    ? r13 = new C196229uf(A0D2, r3, r03, r9, r5, r1, r8, r2, r4, r6, r7);
                                    this.A0J = r13;
                                    C18030ve r15 = this.A0E;
                                    AnonymousClass1KB r14 = this.A05;
                                    AnonymousClass1LU r10 = this.A0B;
                                    if (r10 != null) {
                                        AnonymousClass10I r92 = this.A05;
                                        AnonymousClass1R2 r82 = this.A0L;
                                        if (r82 != null) {
                                            C18000vb r72 = this.A00;
                                            C192479oS r62 = this.A0K;
                                            if (r62 != null) {
                                                AnonymousClass1M9 r52 = this.A02;
                                                if (r52 != null) {
                                                    AnonymousClass122 r42 = this.A07;
                                                    if (r42 != null) {
                                                        AnonymousClass1QR r32 = this.A09;
                                                        if (r32 != null) {
                                                            C33651jA r22 = this.A0F;
                                                            if (r22 != null) {
                                                                A6X a6x = this.A0N;
                                                                if (a6x != null) {
                                                                    this.A0I = new C20828Aa6(r14, r52, r72, r42, r32, r15, r10, r22, r13, r62, r82, a6x, r92);
                                                                    A4b().A08 = "p2m_lite";
                                                                    AnonymousClass11P r16 = this.A05;
                                                                    C18070vi.A0W(r16);
                                                                    C18030ve r152 = this.A0E;
                                                                    C18070vi.A0W(r152);
                                                                    AnonymousClass10I r142 = this.A05;
                                                                    C18070vi.A0W(r142);
                                                                    C33251iW r132 = this.A01;
                                                                    if (r132 != null) {
                                                                        AnonymousClass1R2 r102 = this.A0L;
                                                                        if (r102 != null) {
                                                                            AnonymousClass11C r93 = this.A08;
                                                                            C18070vi.A0W(r93);
                                                                            AnonymousClass1QS r83 = this.A0E;
                                                                            if (r83 != null) {
                                                                                AnonymousClass122 r73 = this.A07;
                                                                                if (r73 != null) {
                                                                                    AnonymousClass00H r04 = this.A0Q;
                                                                                    if (r04 != null) {
                                                                                        AnonymousClass1W6 r63 = (AnonymousClass1W6) C18070vi.A0E(r04);
                                                                                        C24681Lg r53 = this.A08;
                                                                                        if (r53 != null) {
                                                                                            AnonymousClass1PM r43 = this.A03;
                                                                                            if (r43 != null) {
                                                                                                AnonymousClass1QR r33 = this.A09;
                                                                                                if (r33 != null) {
                                                                                                    AnonymousClass00H r05 = this.A0U;
                                                                                                    if (r05 != null) {
                                                                                                        AnonymousClass2L2 r23 = (AnonymousClass2L2) C18070vi.A0E(r05);
                                                                                                        AnonymousClass00H r06 = this.A0R;
                                                                                                        if (r06 != null) {
                                                                                                            UserJid userJid = A012;
                                                                                                            C18030ve r21 = r152;
                                                                                                            AnonymousClass1QR r20 = r33;
                                                                                                            C24681Lg r19 = r53;
                                                                                                            AnonymousClass122 r18 = r73;
                                                                                                            AnonymousClass11P r17 = r16;
                                                                                                            AnonymousClass11C r162 = r93;
                                                                                                            AnonymousClass1PM r153 = r43;
                                                                                                            C33251iW r143 = r132;
                                                                                                            C20828Aa6 A4b = A4b();
                                                                                                            A4b.A00(this, A012, this, (AnonymousClass8Gd) AnonymousClass8BR.A0C(new AHE(r143, r153, r162, r17, r18, r19, r20, r21, userJid, r23, r83, (C198609yc) C18070vi.A0E(r06), r102, A4c(), r63, r142, A1W, A1W), this).A00(AnonymousClass8Gd.class));
                                                                                                            if (A012 != null) {
                                                                                                                C25181Nf r07 = this.A06;
                                                                                                                if (r07 != null) {
                                                                                                                    r0 = r07.A01(A012);
                                                                                                                }
                                                                                                            } else {
                                                                                                                r0 = null;
                                                                                                            }
                                                                                                            this.A0a = r0;
                                                                                                            C72473Md.A18(this);
                                                                                                            setContentView((View) A4b().A05);
                                                                                                            return;
                                                                                                        }
                                                                                                        str = "merchantPaymentConfigActions";
                                                                                                    } else {
                                                                                                        str = "paymentTransactionObservers";
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            str = "messageObservers";
                                                                                        }
                                                                                    } else {
                                                                                        str = "fMessageDatabase";
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str = "userActions";
                                                                    }
                                                                } else {
                                                                    str = "orderDetailsMessageLogging";
                                                                }
                                                            } else {
                                                                str = "paymentTransactionActions";
                                                            }
                                                        }
                                                        str = "paymentTransactionStore";
                                                    }
                                                    str = "coreMessageStore";
                                                } else {
                                                    str = "contactManager";
                                                }
                                            } else {
                                                str = "paymentIntents";
                                            }
                                        }
                                    } else {
                                        str = "waIntents";
                                    }
                                } else {
                                    str = "contextualHelpHandler";
                                }
                            }
                            str = "conversationContactManager";
                        } else {
                            str = "paymentsGatingManager";
                        }
                    }
                    str = "verifiedNameManager";
                }
                str = "paymentsManager";
            }
            str = "paymentsUtils";
        } else {
            str = "linkifier";
        }
        C18070vi.A11(str);
        throw null;
    }

    public P2mLiteOrderDetailsActivity(int i) {
        this.A0b = false;
        AGD.A00(this, 38);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment, com.whatsapp.payments.ui.Hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment] */
    public static final void A0V(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass21L r12, String str, String str2) {
        C20285AEt aEt;
        C20279AEn aEn;
        C20285AEt aEt2;
        C20279AEn aEn2;
        Integer num = null;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        A0Q(C196449v5.A00(), p2mLiteOrderDetailsActivity2, r12, (Integer) null, "enter_dob", str2, 0);
        String str3 = null;
        if (!(r12 == null || (aEt2 = r12.A00) == null || (aEn2 = aEt2.A02) == null)) {
            num = Integer.valueOf(aEn2.A01());
        }
        String A012 = C196449v5.A01(num);
        if (!(r12 == null || (aEt = r12.A00) == null || (aEn = aEt.A02) == null)) {
            str3 = aEn.A04();
        }
        ? hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment = new Hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("extra_payment_config_id", str3);
        A0D2.putString("extra_order_type", A012);
        hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment.A1R(A0D2);
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment.A07 = new C20836AaE(hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet2, r12, str);
        if (paymentBottomSheet2 == null) {
            PaymentBottomSheet paymentBottomSheet3 = new PaymentBottomSheet();
            p2mLiteOrderDetailsActivity2.A0X = AnonymousClass3MW.A0z(paymentBottomSheet3);
            paymentBottomSheet3.A02 = hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment;
            p2mLiteOrderDetailsActivity2.CMl(paymentBottomSheet3);
            return;
        }
        paymentBottomSheet2.A2L(hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment);
    }

    public /* synthetic */ boolean Be9() {
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        A2X a2x = this.A0P;
        if (a2x != null) {
            a2x.A04(this);
        }
        this.A0P = null;
    }

    public void onResume() {
        super.onResume();
        this.A05.CGN(new C21427Aju(this, 14));
    }

    public P2mLiteOrderDetailsActivity() {
        this(0);
        this.A0c = new C189619jX(this);
    }
}
