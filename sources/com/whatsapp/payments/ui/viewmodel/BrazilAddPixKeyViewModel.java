package com.whatsapp.payments.ui.viewmodel;

import X.ARM;
import X.AXJ;
import X.AXL;
import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QD;
import X.AnonymousClass1QS;
import X.AnonymousClass1YF;
import X.AnonymousClass2LR;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8FL;
import X.AnonymousClass8pM;
import X.AnonymousClass9CZ;
import X.AnonymousClass9D9;
import X.AnonymousClass9F9;
import X.AnonymousClass9QM;
import X.BD4;
import X.C171858sO;
import X.C178699Ec;
import X.C17880vN;
import X.C178819Eo;
import X.C17890vO;
import X.C18070vi;
import X.C18460wS;
import X.C190689lM;
import X.C194929sW;
import X.C195969uF;
import X.C198179xu;
import X.C20112A7u;
import X.C21292Ahd;
import X.C21293Ahe;
import X.C29431cG;
import X.C30931ek;
import X.C31061ex;
import X.C31071ey;
import X.C48052Kz;
import X.C63572tK;
import X.C72473Md;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public final class BrazilAddPixKeyViewModel extends AnonymousClass8FL {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M(new C198179xu((Object) null, (Throwable) null, -1));
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0M(new C194929sW("CPF", (String) null, (String) null, (String) null));
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A04;
    public final C48052Kz A05;
    public final C31061ex A06;
    public final AnonymousClass1QS A07;
    public final C31071ey A08;
    public final AnonymousClass1QD A09;
    public final BD4 A0A;
    public final C30931ek A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    public final void A0V(String str) {
        String str2;
        C194929sW r4 = (C194929sW) this.A01.A06();
        String str3 = null;
        if (r4 != null) {
            str2 = r4.A03;
            String str4 = r4.A01;
            if (!(str2 == null || str4 == null)) {
                this.A00.A0F(new C198179xu((Object) null, (Throwable) null, 2));
                String str5 = str;
                if ("p2p_context".equals(str) || this.A07.A02("custom_payment_method_linking").A0G("custom_payment_method_tos")) {
                    A06(this, r4.A02, str2, str4, str);
                    return;
                }
                this.A06.A0F(new AXJ(this, r4.A02, str2, str4, str5), new C178819Eo(C18070vi.A0M(new C178699Ec("br_pay_privacy_policy", 0)), 0));
                return;
            }
        } else {
            str2 = null;
        }
        A0Y(str2);
        if (r4 != null) {
            str3 = r4.A01;
        }
        A0X(str3);
    }

    public final void A0X(String str) {
        C194929sW r0;
        AnonymousClass1DT r1;
        String A0I;
        C194929sW r02;
        int i = null;
        if (str == null || (A0I = AnonymousClass1YF.A0I(str)) == null || A0I.length() == 0) {
            AnonymousClass1DT r4 = this.A01;
            C194929sW r03 = (C194929sW) r4.A06();
            if (r03 != null) {
                r0 = new C194929sW(r03.A02, r03.A03, (String) null, r03.A00);
            } else {
                r0 = null;
            }
            r4.A0F(r0);
            r1 = this.A02;
        } else {
            this.A0F.get();
            boolean z = !Pattern.compile("[=#|^]").matcher(A0I.toString()).find();
            AnonymousClass1DT r42 = this.A01;
            C194929sW r04 = (C194929sW) r42.A06();
            if (z) {
                if (r04 != null) {
                    r02 = new C194929sW(r04.A02, r04.A03, A0I, r04.A00);
                } else {
                    r02 = null;
                }
                r42.A0F(r02);
                r1 = this.A02;
            } else {
                if (r04 != null) {
                    i = new C194929sW(r04.A02, r04.A03, (String) null, r04.A00);
                }
                r42.A0F(i);
                r1 = this.A02;
                i = 2131887370;
            }
        }
        r1.A0F(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        throw new java.lang.UnsupportedOperationException(X.AnonymousClass001.A1H("unsupported pix key type validation: ", r1, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r1 = (X.BBV) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1.Bgx(r2) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r4 = r1.CGb(r2).toString();
        r0 = (X.C194929sW) r6.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r0 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        r0 = new X.C194929sW(r0.A02, r4, r0.A01, r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        r6.A0F(r0);
        r1 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(java.lang.String r8) {
        /*
            r7 = this;
            r5 = 0
            if (r8 == 0) goto L_0x006f
            java.lang.String r2 = X.AnonymousClass1YF.A0I(r8)
            if (r2 == 0) goto L_0x006f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x006f
            X.1DT r6 = r7.A01
            java.lang.Object r0 = r6.A06()
            X.9sW r0 = (X.C194929sW) r0
            if (r0 == 0) goto L_0x00c7
            java.lang.String r1 = r0.A02
            X.00H r0 = r7.A0E
            r0.get()
            int r0 = r1.hashCode()
            switch(r0) {
                case 66937: goto L_0x008c;
                case 69055: goto L_0x0061;
                case 2073509: goto L_0x0053;
                case 66081660: goto L_0x0045;
                case 76105038: goto L_0x0037;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unsupported pix key type validation: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.lang.String r0 = "PHONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.AaM r1 = new X.AaM
            r1.<init>()
            goto L_0x0099
        L_0x0045:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.AaJ r1 = new X.AaJ
            r1.<init>()
            goto L_0x0099
        L_0x0053:
            java.lang.String r0 = "CNPJ"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.93l r1 = new X.93l
            r1.<init>()
            goto L_0x0099
        L_0x0061:
            java.lang.String r0 = "EVP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.AaL r1 = new X.AaL
            r1.<init>()
            goto L_0x0099
        L_0x006f:
            X.1DT r4 = r7.A01
            java.lang.Object r0 = r4.A06()
            X.9sW r0 = (X.C194929sW) r0
            if (r0 == 0) goto L_0x008a
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.9sW r0 = new X.9sW
            r0.<init>(r3, r5, r2, r1)
        L_0x0084:
            r4.A0F(r0)
            X.1DT r1 = r7.A03
            goto L_0x00c1
        L_0x008a:
            r0 = r5
            goto L_0x0084
        L_0x008c:
            java.lang.String r0 = "CPF"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.AaN r1 = new X.AaN
            r1.<init>()
        L_0x0099:
            X.BBV r1 = (X.BBV) r1
            boolean r0 = r1.Bgx(r2)
            if (r0 == 0) goto L_0x00c7
            java.lang.CharSequence r0 = r1.CGb(r2)
            java.lang.String r4 = r0.toString()
            java.lang.Object r0 = r6.A06()
            X.9sW r0 = (X.C194929sW) r0
            if (r0 == 0) goto L_0x00c5
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.9sW r0 = new X.9sW
            r0.<init>(r3, r4, r2, r1)
        L_0x00bc:
            r6.A0F(r0)
            X.1DT r1 = r7.A03
        L_0x00c1:
            r1.A0F(r5)
            return
        L_0x00c5:
            r0 = r5
            goto L_0x00bc
        L_0x00c7:
            java.lang.Object r0 = r6.A06()
            X.9sW r0 = (X.C194929sW) r0
            if (r0 == 0) goto L_0x00db
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.9sW r0 = new X.9sW
            r0.<init>(r3, r5, r2, r1)
            r5 = r0
        L_0x00db:
            r6.A0F(r5)
            X.1DT r1 = r7.A03
            r0 = 2131887369(0x7f120509, float:1.9409343E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel.A0Y(java.lang.String):void");
    }

    public final void A0Z(String str, String str2) {
        String str3;
        String str4 = str;
        C18070vi.A0d(str, 0);
        C194929sW r0 = (C194929sW) this.A01.A06();
        String str5 = null;
        if (r0 != null) {
            str3 = r0.A03;
            String str6 = r0.A01;
            String str7 = r0.A02;
            if (!(str3 == null || str6 == null)) {
                this.A00.A0F(new C198179xu((Object) null, (Throwable) null, 2));
                String str8 = str2;
                if ("p2p_context".equals(str2) || this.A07.A02("custom_payment_method_linking").A0G("custom_payment_method_tos")) {
                    A0T(new C194929sW(str7, str3, str6, str), str2);
                    return;
                }
                this.A06.A0F(new AXL(this, str7, str3, str6, str4, str8), new C178819Eo(C18070vi.A0M(new C178699Ec("br_pay_privacy_policy", 0)), 0));
                return;
            }
        } else {
            str3 = null;
        }
        A0Y(str3);
        if (r0 != null) {
            str5 = r0.A01;
        }
        A0X(str5);
    }

    public static StringBuilder A00(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel) {
        brazilAddPixKeyViewModel.A00.A0E(new C198179xu((Object) null, (Throwable) null, 1));
        return new StringBuilder();
    }

    public static final void A03(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel) {
        brazilAddPixKeyViewModel.A07.A02("custom_payment_method_linking").A0B("custom_payment_method_tos");
        AnonymousClass1QD r3 = brazilAddPixKeyViewModel.A09;
        if (!C17880vN.A1W(r3.A03(), "pix_used")) {
            C17880vN.A1F(AnonymousClass8BU.A07(r3), "pix_used", true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.8pV, X.8pb, java.lang.Object] */
    public static final void A04(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, AnonymousClass9F9 r13, String str, String str2, String str3) {
        Collection A0A2;
        AnonymousClass9D9 r1 = r13.A00;
        String str4 = ((AnonymousClass9CZ) r1.A01).A01;
        String str5 = r1.A06;
        HashMap A11 = C17880vN.A11();
        AnonymousClass8BT.A1R("pix_key_type", str, A11);
        AnonymousClass8BT.A1R("pix_key", str2, A11);
        String str6 = str3;
        AnonymousClass8BT.A1R("pix_display_name", str6, A11);
        C63572tK r2 = C63572tK.A0E;
        ? obj = new Object();
        obj.A00 = "BR";
        obj.A01 = str4;
        obj.A02 = str5;
        obj.A03 = A11;
        AnonymousClass8pM A002 = AnonymousClass9QM.A00(r2, obj, str5, str4, str5);
        ARM arm = new ARM(brazilAddPixKeyViewModel, str, str2, str6, str4);
        AnonymousClass00H r4 = brazilAddPixKeyViewModel.A0D;
        C195969uF r5 = (C195969uF) r4.get();
        if (r5.A03()) {
            AnonymousClass2LR r3 = (AnonymousClass2LR) r5.A01.get();
            AnonymousClass1KH A0R = AnonymousClass8BR.A0R(r5.A00);
            C18070vi.A0X(A0R);
            if (!A0R.A09) {
                Log.e("Payment store cannot be initialized for device sync!");
                A0A2 = C18460wS.A00;
            } else {
                A0A2 = A0R.A0A();
            }
            ArrayList A0m = C29431cG.A0m(A0A2);
            A0m.add(A002);
            List A003 = r5.A00(A0m);
            C18070vi.A0d(A003, 0);
            C17890vO.A0s(r3, A003, 26);
        }
        brazilAddPixKeyViewModel.A07.A01().A04(arm, A002, "custom_payment_method_linking");
        ((C195969uF) r4.get()).A01();
    }

    public static final void A06(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, String str, String str2, String str3, String str4) {
        new C190689lM((AnonymousClass1OZ) C18070vi.A0E(brazilAddPixKeyViewModel.A0C), brazilAddPixKeyViewModel.A0B, new C21293Ahe(brazilAddPixKeyViewModel, str, str2, str3)).A00(str, str2, str3, str4, false);
    }

    public final void A0T(C194929sW r10, String str) {
        C190689lM r3 = new C190689lM((AnonymousClass1OZ) C18070vi.A0E(this.A0C), this.A0B, new C21292Ahd(r10, this));
        String str2 = r10.A02;
        String str3 = r10.A03;
        C18070vi.A0z(str3, "null cannot be cast to non-null type kotlin.String");
        String str4 = r10.A01;
        C18070vi.A0z(str4, "null cannot be cast to non-null type kotlin.String");
        r3.A00(str2, str3, str4, str, true);
    }

    public final void A0W(String str) {
        C194929sW r0;
        AnonymousClass1DT r4 = this.A01;
        C194929sW r02 = (C194929sW) r4.A06();
        if (r02 != null) {
            r0 = new C194929sW(str, r02.A03, r02.A01, r02.A00);
        } else {
            r0 = null;
        }
        r4.A0F(r0);
    }

    public BrazilAddPixKeyViewModel(AnonymousClass1KB r4, C48052Kz r5, AnonymousClass1QD r6, C31061ex r7, AnonymousClass1QS r8, BD4 bd4, C31071ey r10, C30931ek r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r4, r12, r8, r11, r6);
        C18070vi.A0x(r13, r7, r5, r10, bd4);
        C72473Md.A1L(r14, r15);
        this.A04 = r4;
        this.A0C = r12;
        this.A07 = r8;
        this.A0B = r11;
        this.A09 = r6;
        this.A0F = r13;
        this.A06 = r7;
        this.A05 = r5;
        this.A08 = r10;
        this.A0A = bd4;
        this.A0E = r14;
        this.A0D = r15;
    }

    public static void A05(BrazilAddPixKeyViewModel brazilAddPixKeyViewModel, String str, String str2, String str3, int i) {
        brazilAddPixKeyViewModel.A0U(Integer.valueOf(i), str, str2, str3, 2);
    }

    public final void A0U(Integer num, String str, String str2, String str3, int i) {
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("payment_method", "pix");
        if (str != null) {
            A022.A07("key_type", str);
        }
        if (str3 != null) {
            A022.A07("campaign_id", str3);
        }
        String A0H = C18070vi.A0H(A022);
        BD4 bd4 = this.A0A;
        C171858sO A0D2 = AnonymousClass8BV.A0D(bd4, i);
        A0D2.A07 = num;
        A0D2.A0b = "add_non_native_p2m_payment_method";
        A0D2.A0a = str2;
        A0D2.A0Z = A0H;
        bd4.BiH(A0D2);
    }
}
