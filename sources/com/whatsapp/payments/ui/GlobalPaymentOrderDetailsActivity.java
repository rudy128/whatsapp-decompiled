package com.whatsapp.payments.ui;

import X.A6X;
import X.AES;
import X.AGC;
import X.AHD;
import X.ARR;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1QD;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass21K;
import X.AnonymousClass2L2;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BY;
import X.AnonymousClass93z;
import X.AnonymousClass96W;
import X.AnonymousClass9I2;
import X.AnonymousClass9RL;
import X.BD5;
import X.C000200d;
import X.C003401n;
import X.C108955ca;
import X.C137116uw;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C181539Qw;
import X.C191559mn;
import X.C191979nV;
import X.C192479oS;
import X.C198609yc;
import X.C20098A7b;
import X.C20267ADz;
import X.C20279AEn;
import X.C20285AEt;
import X.C20828Aa6;
import X.C21426Ajt;
import X.C22941Dw;
import X.C24681Lg;
import X.C24921Me;
import X.C25181Nf;
import X.C33251iW;
import X.C33651jA;
import X.C36401np;
import X.C36531o3;
import X.C63662tU;
import X.C63932tv;
import X.C72473Md;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class GlobalPaymentOrderDetailsActivity extends AnonymousClass1FY implements BD5 {
    public C33251iW A00;
    public AnonymousClass1M9 A01;
    public AnonymousClass1PM A02;
    public C24921Me A03;
    public C36531o3 A04;
    public C25181Nf A05;
    public AnonymousClass122 A06;
    public C24681Lg A07;
    public AnonymousClass1QR A08;
    public AnonymousClass1LU A09;
    public AnonymousClass1QD A0A;
    public AnonymousClass1QO A0B;
    public AnonymousClass1QS A0C;
    public C33651jA A0D;
    public C20828Aa6 A0E;
    public AnonymousClass93z A0F;
    public C192479oS A0G;
    public AnonymousClass1R2 A0H;
    public AnonymousClass205 A0I;
    public A6X A0J;
    public C36401np A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public List A0P;
    public AnonymousClass1E7 A0Q;
    public AnonymousClass96W A0R;
    public boolean A0S;

    public boolean Bg0() {
        return false;
    }

    public /* synthetic */ void Bl6(String str) {
    }

    public /* synthetic */ void BlW() {
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
        this.A05.CGN(new C21426Ajt(this, 45));
        C20828Aa6 aa6 = this.A0E;
        if (aa6 != null) {
            AnonymousClass9I2 r7 = r14;
            aa6.A05.A02(this, this.A02, (AES) null, r7, r15, aa6.A08, (List) null, 2, r15.A00);
            return;
        }
        C18070vi.A11("orderDetailsCoordinator");
        throw null;
    }

    public /* synthetic */ void C32() {
    }

    public /* synthetic */ void C5T(AES aes, String str) {
    }

    public void A2y() {
        if (!this.A0S) {
            this.A0S = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A00(r1, r2, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A01 = AnonymousClass10E.A4z(r1);
            this.A04 = (C36531o3) r1.A2n.get();
            this.A05 = AnonymousClass3MZ.A0m(r1);
            this.A06 = AnonymousClass3MZ.A0n(r1);
            this.A0L = C000200d.A00(r1.A3w);
            this.A0K = AnonymousClass3MY.A0e(r2);
            this.A0M = C000200d.A00(r1.AYe);
            this.A07 = AnonymousClass3MZ.A0o(r1);
            this.A0J = AnonymousClass8BV.A0O(r1);
            this.A0G = (C192479oS) r2.AES.get();
            this.A0N = C000200d.A00(r1.A86);
            this.A0A = AnonymousClass8BU.A0Q(r1);
            this.A0D = (C33651jA) r1.A8B.get();
            this.A0O = C000200d.A00(r1.A8C);
            this.A08 = (AnonymousClass1QR) r1.A8D.get();
            this.A0B = AnonymousClass3Ma.A0q(r1);
            this.A0C = AnonymousClass3MZ.A0z(r1);
            this.A0H = AnonymousClass8BU.A0V(r1);
            this.A00 = AnonymousClass3MZ.A0U(r1);
            this.A02 = AnonymousClass3MZ.A0f(r1);
            this.A03 = AnonymousClass3MZ.A0g(r1);
            this.A09 = AnonymousClass3MY.A0Z(r1);
        }
    }

    public void Bpc(AnonymousClass1BI r16, C191559mn r17, AnonymousClass21K r18) {
        boolean z;
        C20279AEn aEn;
        AnonymousClass1BI r4 = r16;
        C191559mn r3 = r17;
        if (r17 != null) {
            int i = r3.A01;
            if (Integer.valueOf(i) != null) {
                AnonymousClass21K r7 = r18;
                if (i == 3) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    AnonymousClass93z r6 = this.A0F;
                    if (r6 == null) {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                    C20279AEn A0U = r6.A0U(r7, (String) null, (String) null, 3, seconds);
                    AnonymousClass93z r0 = this.A0F;
                    if (r0 == null) {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                    C17960vV.A07(r4);
                    r0.CHM((UserJid) r4, A0U, r7);
                    AnonymousClass93z r1 = this.A0F;
                    if (r1 == null) {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                    AnonymousClass205 r02 = this.A0I;
                    if (r02 == null) {
                        C18070vi.A11("messageKey");
                        throw null;
                    }
                    r1.CQb(A0U, r02, r7);
                    A6X a6x = this.A0J;
                    if (a6x != null) {
                        a6x.A06(r7, (Integer) null, "confirm", (List) null, 19, false, false, true);
                        finish();
                        return;
                    }
                    C18070vi.A11("orderDetailsMessageLogging");
                    throw null;
                } else if (i == 2) {
                    C20267ADz aDz = r3.A02;
                    if (aDz == null) {
                        AnonymousClass8BS.A1F("GlobalPaymentOrderDetailsActivity", "invalid external payemnt configuration payload");
                        return;
                    }
                    C17960vV.A07(r4);
                    String str = aDz.A00;
                    C17960vV.A07(str);
                    C18070vi.A0X(str);
                    TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    C20285AEt BPK = r7.BPK();
                    String str2 = null;
                    if (BPK == null || (aEn = BPK.A02) == null) {
                        z = false;
                    } else {
                        C18000vb r03 = this.A00;
                        C18070vi.A0W(r03);
                        str2 = aEn.A06(r03);
                        z = aEn.A08();
                    }
                    C17960vV.A07(r4);
                    C17960vV.A07(str);
                    C20098A7b.A00(AnonymousClass9RL.A00(r4, str, "order_details", str2, z), this);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        AnonymousClass1E7 r0;
        super.onCreate(bundle);
        AnonymousClass205 A032 = AnonymousClass1R2.A03(getIntent());
        C18070vi.A0b(A032);
        this.A0I = A032;
        C22941Dw r02 = UserJid.Companion;
        if (A032 != null) {
            UserJid A012 = C22941Dw.A01(A032.A00);
            AnonymousClass11P r18 = this.A05;
            C18070vi.A0W(r18);
            C18030ve r17 = this.A0E;
            C18070vi.A0W(r17);
            AnonymousClass10I r15 = this.A05;
            C18070vi.A0W(r15);
            C33251iW r14 = this.A00;
            if (r14 != null) {
                AnonymousClass1R2 r13 = this.A0H;
                if (r13 != null) {
                    AnonymousClass11C r12 = this.A08;
                    C18070vi.A0W(r12);
                    AnonymousClass1QS r11 = this.A0C;
                    if (r11 != null) {
                        AnonymousClass122 r10 = this.A06;
                        if (r10 != null) {
                            AnonymousClass00H r03 = this.A0L;
                            if (r03 != null) {
                                AnonymousClass1W6 r8 = (AnonymousClass1W6) C18070vi.A0E(r03);
                                C24681Lg r7 = this.A07;
                                if (r7 != null) {
                                    AnonymousClass1PM r5 = this.A02;
                                    if (r5 != null) {
                                        AnonymousClass1QR r4 = this.A08;
                                        if (r4 != null) {
                                            AnonymousClass00H r04 = this.A0O;
                                            if (r04 != null) {
                                                AnonymousClass2L2 r3 = (AnonymousClass2L2) C18070vi.A0E(r04);
                                                AnonymousClass00H r05 = this.A0M;
                                                if (r05 != null) {
                                                    C198609yc r2 = (C198609yc) C18070vi.A0E(r05);
                                                    AnonymousClass205 r1 = this.A0I;
                                                    if (r1 != null) {
                                                        C33251iW r182 = r14;
                                                        AnonymousClass1PM r19 = r5;
                                                        this.A0F = (AnonymousClass93z) AnonymousClass8BR.A0C(new AHD(r182, r19, r12, r18, r10, r7, r4, r17, r3, r11, r2, r13, r1, r8, r15), this).A00(AnonymousClass93z.class);
                                                        AnonymousClass11P r112 = this.A05;
                                                        C18070vi.A0W(r112);
                                                        C18030ve r102 = this.A0E;
                                                        C18070vi.A0W(r102);
                                                        C36401np r82 = this.A0K;
                                                        if (r82 != null) {
                                                            Resources A0D2 = C108955ca.A0D(this);
                                                            AnonymousClass1R2 r72 = this.A0H;
                                                            if (r72 != null) {
                                                                C18000vb r52 = this.A00;
                                                                C18070vi.A0W(r52);
                                                                AnonymousClass1QS r42 = this.A0C;
                                                                if (r42 != null) {
                                                                    AnonymousClass1PM r32 = this.A02;
                                                                    if (r32 != null) {
                                                                        AnonymousClass1QO r22 = this.A0B;
                                                                        if (r22 != null) {
                                                                            C25181Nf r16 = this.A05;
                                                                            if (r16 != null) {
                                                                                C36531o3 r06 = this.A04;
                                                                                if (r06 != null) {
                                                                                    AnonymousClass96W r172 = new AnonymousClass96W(A0D2, r32, r06, r112, r52, r16, r102, r22, r42, r72, r82);
                                                                                    this.A0R = r172;
                                                                                    C18030ve r152 = this.A0E;
                                                                                    AnonymousClass1KB r132 = this.A05;
                                                                                    AnonymousClass1LU r122 = this.A09;
                                                                                    if (r122 != null) {
                                                                                        AnonymousClass10I r113 = this.A05;
                                                                                        AnonymousClass1R2 r103 = this.A0H;
                                                                                        if (r103 != null) {
                                                                                            C18000vb r83 = this.A00;
                                                                                            C192479oS r73 = this.A0G;
                                                                                            if (r73 != null) {
                                                                                                AnonymousClass1M9 r53 = this.A01;
                                                                                                if (r53 != null) {
                                                                                                    AnonymousClass122 r43 = this.A06;
                                                                                                    if (r43 != null) {
                                                                                                        AnonymousClass1QR r33 = this.A08;
                                                                                                        if (r33 != null) {
                                                                                                            C33651jA r23 = this.A0D;
                                                                                                            if (r23 != null) {
                                                                                                                A6X a6x = this.A0J;
                                                                                                                if (a6x != null) {
                                                                                                                    AnonymousClass1KB r183 = r132;
                                                                                                                    AnonymousClass1M9 r192 = r53;
                                                                                                                    C20828Aa6 aa6 = new C20828Aa6(r183, r192, r83, r43, r33, r152, r122, r23, r172, r73, r103, a6x, r113);
                                                                                                                    this.A0E = aa6;
                                                                                                                    aa6.A08 = "GlobalPayment";
                                                                                                                    AnonymousClass93z r07 = this.A0F;
                                                                                                                    if (r07 == null) {
                                                                                                                        str2 = "viewModel";
                                                                                                                    } else {
                                                                                                                        aa6.A00(this, A012, this, r07);
                                                                                                                        if (A012 != null) {
                                                                                                                            C25181Nf r08 = this.A05;
                                                                                                                            if (r08 != null) {
                                                                                                                                r0 = r08.A01(A012);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            r0 = null;
                                                                                                                        }
                                                                                                                        this.A0Q = r0;
                                                                                                                        C72473Md.A18(this);
                                                                                                                        C20828Aa6 aa62 = this.A0E;
                                                                                                                        if (aa62 != null) {
                                                                                                                            setContentView((View) aa62.A05);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        str2 = "orderDetailsCoordinator";
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    str2 = "orderDetailsMessageLogging";
                                                                                                                }
                                                                                                            } else {
                                                                                                                str2 = "paymentTransactionActions";
                                                                                                            }
                                                                                                        } else {
                                                                                                            str2 = "paymentTransactionStore";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str2 = "coreMessageStore";
                                                                                                    }
                                                                                                } else {
                                                                                                    str2 = "contactManager";
                                                                                                }
                                                                                            } else {
                                                                                                str2 = "paymentIntents";
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str2 = "waIntents";
                                                                                    }
                                                                                } else {
                                                                                    str2 = "contextualHelpHandler";
                                                                                }
                                                                            }
                                                                            str2 = "conversationContactManager";
                                                                        } else {
                                                                            str2 = "paymentsGatingManager";
                                                                        }
                                                                    } else {
                                                                        str2 = "verifiedNameManager";
                                                                    }
                                                                } else {
                                                                    str2 = "paymentsManager";
                                                                }
                                                            }
                                                            str2 = "paymentsUtils";
                                                        } else {
                                                            str2 = "linkifier";
                                                        }
                                                        C18070vi.A11(str2);
                                                        throw null;
                                                    }
                                                } else {
                                                    str = "merchantPaymentConfigActions";
                                                }
                                            } else {
                                                str = "paymentTransactionObservers";
                                            }
                                        } else {
                                            str = "paymentTransactionStore";
                                        }
                                    } else {
                                        str = "verifiedNameManager";
                                    }
                                } else {
                                    str = "messageObservers";
                                }
                            } else {
                                str = "fMessageDatabase";
                            }
                        } else {
                            str = "coreMessageStore";
                        }
                    } else {
                        str = "paymentsManager";
                    }
                } else {
                    str = "paymentsUtils";
                }
            } else {
                str = "userActions";
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("messageKey");
        throw null;
    }

    public GlobalPaymentOrderDetailsActivity(int i) {
        this.A0S = false;
        AGC.A00(this, 35);
    }

    public String BXz() {
        throw AnonymousClass8BY.A0b();
    }

    public /* synthetic */ boolean Be9() {
        return false;
    }

    public void Bzh(AnonymousClass9I2 r2, C191979nV r3) {
        throw AnonymousClass8BY.A0b();
    }

    public void C59(ARR arr) {
        throw AnonymousClass8BY.A0b();
    }

    public GlobalPaymentOrderDetailsActivity() {
        this(0);
    }
}
