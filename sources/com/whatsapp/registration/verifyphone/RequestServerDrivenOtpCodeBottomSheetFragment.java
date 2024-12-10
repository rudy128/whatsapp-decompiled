package com.whatsapp.registration.verifyphone;

import X.A8V;
import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass1CM;
import X.AnonymousClass1FL;
import X.AnonymousClass1YF;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.C108995ce;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C192319oA;
import X.C195499tR;
import X.C197939xW;
import X.C19830z4;
import X.C33841jT;
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class RequestServerDrivenOtpCodeBottomSheetFragment extends Hilt_RequestServerDrivenOtpCodeBottomSheetFragment {
    public int A00;
    public int A01;
    public AnonymousClass1FL A02;
    public RecyclerView A03;
    public C19830z4 A04;
    public C18000vb A05;
    public C33841jT A06;
    public AnonymousClass1CM A07;
    public A8V A08;
    public C192319oA A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public List A0H = AnonymousClass000.A13();
    public List A0I;
    public WDSButton A0J;
    public String A0K;
    public String A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        r5.add(new X.C195499tR(r12, r13, r14, r15, r16, r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019e, code lost:
        r0 = "serverDrivenOtpManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a1, code lost:
        r0 = "registrationStateManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a3, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a6, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r20, android.view.LayoutInflater r21, android.view.ViewGroup r22) {
        /*
            r19 = this;
            r0 = 0
            r2 = r21
            X.C18070vi.A0d(r2, r0)
            r0 = 2131626888(0x7f0e0b88, float:1.8881025E38)
            r1 = r22
            android.view.View r4 = X.AnonymousClass3MX.A0A(r2, r1, r0)
            r0 = 2131436700(0x7f0b249c, float:1.8495278E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.C108945cZ.A0U(r4, r0)
            r3 = r19
            r3.A03 = r0
            java.lang.String r0 = r3.A0K
            if (r0 == 0) goto L_0x002e
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r3.A0L
            if (r0 == 0) goto L_0x002e
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 == 0) goto L_0x0036
        L_0x002e:
            java.lang.String r0 = "RESTART_REG"
            A02(r3, r0)
            r3.A29()
        L_0x0036:
            X.1FL r6 = r3.A02
            if (r6 == 0) goto L_0x01c1
            java.util.List r7 = r3.A0I
            if (r7 == 0) goto L_0x01c1
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            int r2 = r7.size()
            r1 = 0
        L_0x0047:
            if (r1 >= r2) goto L_0x01a7
            java.lang.String r12 = X.C17880vN.A0w(r7, r1)
            r9 = 0
            X.C18070vi.A0d(r12, r9)
            int r0 = r12.hashCode()
            r11 = 1
            r8 = 0
            switch(r0) {
                case -795576526: goto L_0x005d;
                case 114009: goto L_0x00b4;
                case 97513456: goto L_0x00e3;
                case 112386354: goto L_0x011d;
                case 2120743944: goto L_0x014d;
                default: goto L_0x005a;
            }
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x005d:
            boolean r0 = X.AnonymousClass8BR.A1W(r12)
            if (r0 == 0) goto L_0x005a
            int r0 = r3.A01
            if (r0 == 0) goto L_0x005a
            X.9oA r0 = r3.A09
            if (r0 == 0) goto L_0x019e
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x005a
            X.1CM r0 = r3.A07
            if (r0 == 0) goto L_0x01a1
            int r8 = r0.A00(r9)
            r0 = 15
            if (r8 != r0) goto L_0x00b0
            r0 = 2131890339(0x7f1210a3, float:1.9415367E38)
        L_0x0080:
            java.lang.String r13 = X.AnonymousClass3MY.A0n(r3, r0)
            java.lang.String r8 = r3.A0G
            if (r8 == 0) goto L_0x00a8
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00a8
            r0 = 2131890357(0x7f1210b5, float:1.9415404E38)
            java.lang.String r14 = X.AnonymousClass3MY.A0o(r3, r8, r9, r0)
        L_0x0095:
            X.C18070vi.A0b(r14)
            r16 = 2131233432(0x7f080a98, float:1.8083001E38)
            java.lang.Long r0 = r3.A0E
            long r17 = A00(r0)
            X.Avm r15 = new X.Avm
            r15.<init>(r3)
            goto L_0x0190
        L_0x00a8:
            r0 = 2131890358(0x7f1210b6, float:1.9415406E38)
            java.lang.String r14 = r3.A1H(r0)
            goto L_0x0095
        L_0x00b0:
            r0 = 2131890359(0x7f1210b7, float:1.9415408E38)
            goto L_0x0080
        L_0x00b4:
            boolean r0 = X.AnonymousClass8BR.A1U(r12)
            if (r0 == 0) goto L_0x005a
            X.1CM r0 = r3.A07
            if (r0 == 0) goto L_0x01a1
            int r9 = r0.A00(r9)
            r8 = 4
            r0 = 2131890350(0x7f1210ae, float:1.941539E38)
            if (r9 != r8) goto L_0x00cb
            r0 = 2131890349(0x7f1210ad, float:1.9415387E38)
        L_0x00cb:
            java.lang.String r13 = X.AnonymousClass3MY.A0n(r3, r0)
            java.lang.String r14 = r3.A2K(r12)
            r16 = 2131233620(0x7f080b54, float:1.8083383E38)
            java.lang.Long r0 = r3.A0C
            long r17 = A00(r0)
            X.Avj r15 = new X.Avj
            r15.<init>(r3)
            goto L_0x0190
        L_0x00e3:
            boolean r0 = X.AnonymousClass8BR.A1V(r12)
            if (r0 == 0) goto L_0x005a
            X.9oA r0 = r3.A09
            if (r0 == 0) goto L_0x019e
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x005a
            X.1CM r0 = r3.A07
            if (r0 == 0) goto L_0x01a1
            int r8 = r0.A00(r9)
            r0 = 8
            if (r8 != r0) goto L_0x0119
            r0 = 2131890337(0x7f1210a1, float:1.9415363E38)
        L_0x0102:
            java.lang.String r13 = X.AnonymousClass3MY.A0n(r3, r0)
            java.lang.String r14 = r3.A2K(r12)
            r16 = 2131231760(0x7f080410, float:1.807961E38)
            java.lang.Long r0 = r3.A0B
            long r17 = A00(r0)
            X.Avl r15 = new X.Avl
            r15.<init>(r3)
            goto L_0x0190
        L_0x0119:
            r0 = 2131890334(0x7f12109e, float:1.9415357E38)
            goto L_0x0102
        L_0x011d:
            java.lang.String r0 = "voice"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005a
            X.1CM r0 = r3.A07
            if (r0 == 0) goto L_0x01a1
            int r9 = r0.A00(r9)
            r8 = 5
            r0 = 2131890342(0x7f1210a6, float:1.9415373E38)
            if (r9 != r8) goto L_0x0136
            r0 = 2131890351(0x7f1210af, float:1.9415391E38)
        L_0x0136:
            java.lang.String r13 = X.AnonymousClass3MY.A0n(r3, r0)
            java.lang.String r14 = r3.A2K(r12)
            r16 = 2131231742(0x7f0803fe, float:1.8079574E38)
            java.lang.Long r0 = r3.A0D
            long r17 = A00(r0)
            X.Avk r15 = new X.Avk
            r15.<init>(r3)
            goto L_0x0190
        L_0x014d:
            boolean r0 = X.AnonymousClass8BR.A1X(r12)
            if (r0 == 0) goto L_0x005a
            int r0 = r3.A00
            if (r0 != r11) goto L_0x005a
            X.9oA r0 = r3.A09
            if (r0 == 0) goto L_0x019e
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x005a
            X.1CM r0 = r3.A07
            if (r0 == 0) goto L_0x01a1
            int r8 = r0.A00(r9)
            r0 = 17
            if (r8 != r0) goto L_0x019a
            r0 = 2131890336(0x7f1210a0, float:1.941536E38)
        L_0x0170:
            java.lang.String r13 = X.AnonymousClass3MY.A0n(r3, r0)
            r10 = 2131890353(0x7f1210b1, float:1.9415395E38)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r0 = r3.A0F
            java.lang.String r14 = X.AnonymousClass3MX.A16(r3, r0, r8, r9, r10)
            X.C18070vi.A0X(r14)
            r16 = 2131232082(0x7f080552, float:1.8080263E38)
            java.lang.Long r0 = r3.A0A
            long r17 = A00(r0)
            X.Avn r15 = new X.Avn
            r15.<init>(r3)
        L_0x0190:
            X.9tR r11 = new X.9tR
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.add(r11)
            goto L_0x005a
        L_0x019a:
            r0 = 2131897176(0x7f122b58, float:1.9429234E38)
            goto L_0x0170
        L_0x019e:
            java.lang.String r0 = "serverDrivenOtpManager"
            goto L_0x01a3
        L_0x01a1:
            java.lang.String r0 = "registrationStateManager"
        L_0x01a3:
            X.C18070vi.A11(r0)
            throw r8
        L_0x01a7:
            r3.A0H = r5
            X.0vb r0 = r3.A05
            if (r0 == 0) goto L_0x01da
            X.8Hl r2 = new X.8Hl
            r2.<init>(r6, r0, r5)
            r1 = 0
            X.Adc r0 = new X.Adc
            r0.<init>(r3, r1)
            r2.A01 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.A03
            if (r0 == 0) goto L_0x01c1
            r0.setAdapter(r2)
        L_0x01c1:
            r0 = 2131429535(0x7f0b089f, float:1.8480745E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r4, r0)
            r3.A0J = r0
            A01(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0J
            if (r1 == 0) goto L_0x01d6
            r0 = 35
            X.AnonymousClass3MZ.A1L(r1, r3, r0)
        L_0x01d6:
            X.C18070vi.A0b(r4)
            return r4
        L_0x01da:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        try {
            this.A02 = A1B();
        } catch (ClassCastException e) {
            C108995ce.A1M("RequestServerDrivenOtpCodeBottomSheetFragment/onAttach/error: ", AnonymousClass000.A10(), e);
        }
    }

    public final String A2K(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        String str4;
        int i;
        String str5 = this.A0K;
        if (str5 == null || AnonymousClass1YF.A0T(str5) || (str3 = this.A0L) == null || AnonymousClass1YF.A0T(str3)) {
            sb = AnonymousClass8BW.A0o("RequestServerDrivenOtpCodeBottomSheetFragment/getDescriptionText for ", str);
            str2 = "/phone number is null/blank";
        } else {
            String A0H2 = A9B.A0H(this.A0K, this.A0L);
            int hashCode = str.hashCode();
            if (hashCode != 114009) {
                if (hashCode != 97513456) {
                    if (hashCode == 112386354) {
                        str4 = "voice";
                    }
                } else if (AnonymousClass8BR.A1V(str)) {
                    i = 2131890343;
                    String A0o = AnonymousClass3MY.A0o(this, A0H2, 0, i);
                    C18070vi.A0X(A0o);
                    return A0o;
                }
                sb = AnonymousClass8BW.A0o("RequestServerDrivenOtpCodeBottomSheetFragment/getDescriptionText for ", str);
                str2 = "/unsupported method";
            } else {
                str4 = "sms";
            }
            if (str.equals(str4)) {
                i = 2131890352;
                String A0o2 = AnonymousClass3MY.A0o(this, A0H2, 0, i);
                C18070vi.A0X(A0o2);
                return A0o2;
            }
            sb = AnonymousClass8BW.A0o("RequestServerDrivenOtpCodeBottomSheetFragment/getDescriptionText for ", str);
            str2 = "/unsupported method";
        }
        C17890vO.A1A(sb, str2);
        return "";
    }

    public static final void A01(RequestServerDrivenOtpCodeBottomSheetFragment requestServerDrivenOtpCodeBottomSheetFragment) {
        List list = requestServerDrivenOtpCodeBottomSheetFragment.A0H;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C195499tR) it.next()).A06) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        WDSButton wDSButton = requestServerDrivenOtpCodeBottomSheetFragment.A0J;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
        }
    }

    public static final long A00(Long l) {
        long currentTimeMillis = System.currentTimeMillis();
        if (l == null) {
            return 0;
        }
        long longValue = l.longValue();
        if (longValue == -1) {
            return -1;
        }
        if (longValue > currentTimeMillis) {
            return longValue - currentTimeMillis;
        }
        return 0;
    }

    public static final void A02(RequestServerDrivenOtpCodeBottomSheetFragment requestServerDrivenOtpCodeBottomSheetFragment, String str) {
        String str2;
        Bundle A0D2 = C17880vN.A0D();
        String str3 = requestServerDrivenOtpCodeBottomSheetFragment.A0K;
        if (str3 == null || AnonymousClass1YF.A0T(str3) || (str2 = requestServerDrivenOtpCodeBottomSheetFragment.A0L) == null || AnonymousClass1YF.A0T(str2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("RequestServerDrivenOtpCodeBottomSheetFragment/setResult for ");
            A10.append(str);
            C17890vO.A1A(A10, "/phone number is null/blank");
            str = "RESTART_REG";
        }
        A0D2.putString("REQUEST_SERVER_DRIVEN_OTP_CODE_METHOD", str);
        requestServerDrivenOtpCodeBottomSheetFragment.A1F().A0w("REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT", A0D2);
    }

    public void A1K() {
        super.A1K();
        this.A02 = null;
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A0C = AnonymousClass8BU.A0k(bundle2, "EXTRA_SMS_RETRY_TIME");
            this.A0B = AnonymousClass8BU.A0k(bundle2, "EXTRA_FLASH_RETRY_TIME");
            this.A0D = AnonymousClass8BU.A0k(bundle2, "EXTRA_VOICE_RETRY_TIME");
            this.A0E = AnonymousClass8BU.A0k(bundle2, "EXTRA_WA_OLD_RETRY_TIME");
            this.A0A = AnonymousClass8BU.A0k(bundle2, "EXTRA_EMAIL_OTP_RETRY_TIME");
            this.A0G = bundle2.getString("EXTRA_WA_OLD_DEVICE_NAME");
        }
        C19830z4 r0 = this.A04;
        if (r0 != null) {
            this.A0I = r0.A0u();
            C19830z4 r02 = this.A04;
            if (r02 != null) {
                this.A0K = r02.A0l();
                C19830z4 r03 = this.A04;
                if (r03 != null) {
                    this.A0L = r03.A0n();
                    C19830z4 r04 = this.A04;
                    if (r04 != null) {
                        this.A00 = C17890vO.A0B(r04).getInt("pref_email_otp_eligibility", 0);
                        C19830z4 r05 = this.A04;
                        if (r05 != null) {
                            this.A01 = C17890vO.A0B(r05).getInt("pref_wa_old_eligibility", 0);
                            C19830z4 r06 = this.A04;
                            if (r06 != null) {
                                this.A0F = r06.A0k();
                                A8V a8v = this.A08;
                                if (a8v != null) {
                                    a8v.A0A(new C197939xW(this.A0I, (String) null), "view_fallback_options", false);
                                    return;
                                }
                                str = "funnelLogger";
                                C18070vi.A11(str);
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        str = "waSharedPreferences";
        C18070vi.A11(str);
        throw null;
    }
}
