package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.whatsapp.fmx.Hilt_FMXGroupSafetyTipsBottomSheetFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.4qH  reason: invalid class name and case insensitive filesystem */
public class C97924qH implements C108565bu {
    public AnonymousClass1E7 A00;
    public boolean A01;
    public final AnonymousClass01E A02;
    public final C133326oZ A03;
    public final AnonymousClass1FR A04;
    public final AnonymousClass11S A05;
    public final C37551pj A06;
    public final C34511kb A07;
    public final AnonymousClass1PM A08;
    public final C19830z4 A09;
    public final AnonymousClass1MZ A0A;
    public final C18030ve A0B;
    public final AnonymousClass12L A0C;
    public final AnonymousClass18K A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final C36931oh A0G;
    public final C34591kk A0H;
    public final AnonymousClass1RK A0I;
    public final AnonymousClass1LU A0J;
    public final C24901Mc A0K;
    public final AnonymousClass10I A0L;
    public final Runnable A0M;
    public final Runnable A0N;

    public SpannableStringBuilder BFg(Context context, String str) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] A1b = C72473Md.A1b(fromHtml, 0);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = A092.getSpanStart(uRLSpan);
                    int spanEnd = A092.getSpanEnd(uRLSpan);
                    int spanFlags = A092.getSpanFlags(uRLSpan);
                    A092.removeSpan(uRLSpan);
                    A092.setSpan(new C74643c8(this.A02, this, 1), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A092;
    }

    public static String A00(C97924qH r3, int i) {
        AnonymousClass1E7 r0 = r3.A00;
        if (r0 != null) {
            Class<AnonymousClass1EC> cls = AnonymousClass1EC.class;
            if (r0.A06(cls) != null) {
                if (i == 0) {
                    return "group_spam_banner_report";
                }
                AnonymousClass1E7 r02 = r3.A00;
                if (r02 == null) {
                    Log.e("Contact is unexpected null");
                    return "left_group_spam_banner_report";
                }
                GroupJid groupJid = (GroupJid) r02.A06(cls);
                if (groupJid == null || !r3.A0A.A0J(groupJid)) {
                    return "left_group_spam_banner_report";
                }
            }
        }
        return null;
    }

    public void Bl0() {
        this.A0K.A03(C72463Mc.A0g(this.A00), 5, this.A01);
        this.A0M.run();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 6185) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmg(int r13) {
        /*
            r12 = this;
            X.1E7 r0 = r12.A00
            com.whatsapp.jid.Jid r6 = X.C72453Mb.A0m(r0)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.12L r1 = r12.A0C
            X.1E7 r0 = r12.A00
            boolean r0 = X.C42761yh.A00(r0, r1)
            if (r0 == 0) goto L_0x0028
            X.01E r5 = r12.A02
            java.lang.String r7 = "psa_banner_block"
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x001c
            java.lang.String r7 = "triggered_block"
        L_0x001c:
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x001f:
            r11 = r10
            android.content.Intent r0 = X.AnonymousClass1LU.A1E(r5, r6, r7, r8, r9, r10, r11)
            r5.startActivity(r0)
            return
        L_0x0028:
            X.1pj r3 = r12.A06
            boolean r0 = r3.A0P(r6)
            java.lang.String r2 = "1_1_spam_banner_block"
            java.lang.String r5 = "1_1_old_spam_banner_block"
            java.lang.String r7 = "biz_spam_banner_block"
            r8 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00ab
            X.1Mc r3 = r12.A0K
            boolean r1 = r12.A01
            r0 = 3
            r3.A03(r6, r0, r1)
            X.1E7 r0 = r12.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x006f
            if (r13 == r4) goto L_0x005a
            X.0ve r2 = r12.A0B
            X.C18070vi.A0d(r2, r8)
            r1 = 6185(0x1829, float:8.667E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r9 = 0
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r9 = 1
        L_0x005b:
            X.0ve r0 = r12.A0B
            X.C18070vi.A0d(r0, r8)
            boolean r0 = X.AnonymousClass3MX.A1X(r0)
            r10 = r0 ^ 1
            X.01E r5 = r12.A02
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x001f
            java.lang.String r7 = "triggered_block"
            goto L_0x001f
        L_0x006f:
            if (r13 == r4) goto L_0x0072
            r2 = r5
        L_0x0072:
            X.1oh r1 = r12.A0G
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x007a
            java.lang.String r2 = "triggered_block"
        L_0x007a:
            X.4SO r3 = r1.BGI(r6, r2)
            X.0ve r2 = r3.A06
            boolean r0 = X.AnonymousClass3MX.A1X(r2)
            if (r0 != 0) goto L_0x0088
            r3.A02 = r4
        L_0x0088:
            r3.A04 = r4
            r3.A05 = r8
            r3.A01(r4, r4)
            if (r13 != r4) goto L_0x009d
            r1 = 9871(0x268f, float:1.3832E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x009d
            r3.A03 = r4
        L_0x009d:
            X.6jc r0 = r3.A00()
            com.whatsapp.blockui.BlockConfirmationDialogFragment r1 = X.C123736Vq.A00(r0)
            X.1FR r0 = r12.A04
            r0.CMl(r1)
            return
        L_0x00ab:
            X.1E7 r0 = r12.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00bc
            r2 = r7
        L_0x00b4:
            X.01E r1 = r12.A02
            X.1E7 r0 = r12.A00
            r3.A0H(r1, r0, r2, r8)
            return
        L_0x00bc:
            if (r13 == r4) goto L_0x00b4
            r2 = r5
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97924qH.Bmg(int):void");
    }

    public void Bta(int i) {
        AnonymousClass1BI A0g = C72463Mc.A0g(this.A00);
        AnonymousClass1EC A0b = AnonymousClass3MY.A0b(A0g);
        this.A04.CNB(0, 2131895077);
        AnonymousClass10I r1 = this.A0L;
        AnonymousClass01E r6 = this.A02;
        C34591kk r8 = this.A0H;
        r1.CGD(new AnonymousClass2PS(new C91234fM(this, A0g, A0b, i), r6, this.A07, r8, Collections.singleton(A0b)), new Object[0]);
    }

    public void BzJ() {
        AnonymousClass1BI A0g = C72463Mc.A0g(this.A00);
        if (C42761yh.A01(this.A0C, A0g)) {
            C17880vN.A1F(C19830z4.A00(this.A09), "wac_consent_shown", true);
        } else {
            if (C22971Dz.A0e(A0g)) {
                AnonymousClass4ZP.A00(this.A0B, this.A0D, A0g, 1, 3);
            }
            C24901Mc r2 = this.A0K;
            r2.A03(A0g, 4, this.A01);
            r2.A08(A0g, 1);
            C98704ra.A00(this.A0L, this, A0g, 39);
        }
        this.A0N.run();
    }

    public void C4F() {
        AnonymousClass4ZP.A00.A01(this.A00, this.A0B, this.A0D, 0);
        AnonymousClass01E r1 = this.A02;
        if (!AnonymousClass4Yv.A02(r1)) {
            C20098A7b.A01(new Hilt_FMXGroupSafetyTipsBottomSheetFragment(), r1.getSupportFragmentManager());
        }
    }

    public void C60(int i) {
        String str;
        AnonymousClass1BI A0g = C72463Mc.A0g(this.A00);
        if (A0g instanceof AnonymousClass1EC) {
            str = A00(this, i);
            C17960vV.A07(str);
        } else {
            str = "1_1_spam_banner_report";
        }
        C24901Mc r2 = this.A0K;
        r2.A03(A0g, 2, this.A01);
        r2.A08(A0g, -2);
        this.A0I.A04().A09(new C98294qt(this, A0g, str));
    }

    public C97924qH(AnonymousClass01E r2, C133326oZ r3, AnonymousClass1FR r4, AnonymousClass11S r5, C37551pj r6, C36931oh r7, C34511kb r8, AnonymousClass1PM r9, C19830z4 r10, AnonymousClass1MZ r11, C34591kk r12, AnonymousClass1RK r13, C18030ve r14, AnonymousClass12L r15, AnonymousClass18K r16, AnonymousClass1LU r17, C24901Mc r18, AnonymousClass10I r19, AnonymousClass00H r20, AnonymousClass00H r21, Runnable runnable, Runnable runnable2) {
        this.A0B = r14;
        this.A05 = r5;
        this.A0J = r17;
        this.A0L = r19;
        this.A03 = r3;
        this.A0D = r16;
        this.A0K = r18;
        this.A0C = r15;
        this.A06 = r6;
        this.A0H = r12;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A0I = r13;
        this.A0E = r20;
        this.A0A = r11;
        this.A0F = r21;
        this.A0G = r7;
        this.A02 = r2;
        this.A04 = r4;
        this.A0M = runnable;
        this.A0N = runnable2;
    }
}
