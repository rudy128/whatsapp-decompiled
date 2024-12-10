package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.Map;

/* renamed from: X.2su  reason: invalid class name and case insensitive filesystem */
public class C63342su {
    public long A00;
    public long A01;
    public long A02;
    public long A03 = Long.MAX_VALUE;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08 = Long.MAX_VALUE;
    public Map A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass190 A0D;
    public final AnonymousClass11S A0E;
    public final AnonymousClass1CJ A0F;
    public final AnonymousClass18K A0G;
    public final C30971eo A0H;
    public final C29971dB A0I;
    public final AnonymousClass195 A0J;
    public final AnonymousClass11P A0K;
    public final C18030ve A0L;
    public final AnonymousClass1OZ A0M;
    public final AnonymousClass1O1 A0N;
    public volatile long A0O;
    public volatile long A0P;

    public static String A00(String str) {
        if ("receipt".equals(str) || "notification".equals(str) || "message".equals(str) || "call".equals(str)) {
            return str;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (X.C22971Dz.A0N(r2) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass11S r7, X.AnonymousClass1CJ r8, X.AnonymousClass18K r9, X.C29621ca r10, int r11) {
        /*
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r2 = r10.A0F(r1, r0)
            boolean r3 = X.C22971Dz.A0O(r2)
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r1 = r10.A0F(r1, r0)
            if (r3 == 0) goto L_0x0017
            r0 = r1
            r1 = r2
            r2 = r0
        L_0x0017:
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r5 = r10.A0F(r3, r0)
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 != 0) goto L_0x002c
            boolean r0 = X.C22971Dz.A0N(r2)
            r6 = r2
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r6 = r1
        L_0x002d:
            X.2HD r3 = new X.2HD
            r3.<init>()
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r0 = X.C22931Dv.A00(r2)
            java.lang.Integer r0 = X.C64002u3.A07(r8, r0)
            r3.A0C = r0
            java.lang.String r0 = "type"
            r4 = 0
            java.lang.String r0 = r10.A0Q(r0, r4)
            int r0 = X.A8F.A03(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r3.A09 = r0
            if (r5 == 0) goto L_0x0059
            r2 = r5
        L_0x0059:
            java.lang.Integer r0 = X.A8F.A06(r2, r1)
            r3.A04 = r0
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r6)
            java.lang.Integer r0 = X.A8F.A05(r7, r0)
            r3.A06 = r0
            java.lang.Integer r0 = X.C64002u3.A0A(r10)
            r3.A07 = r0
            java.lang.String r0 = "offline"
            java.lang.String r1 = r10.A0Q(r0, r4)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            r2 = 0
            if (r1 == 0) goto L_0x00a5
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r1)
        L_0x0086:
            r3.A0D = r0
            java.lang.String r0 = "edit"
            java.lang.String r1 = r10.A0Q(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x009f
            X.C17960vV.A07(r1)
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r2 = X.A8F.A04(r0)
        L_0x009f:
            r3.A0B = r2
            r9.CC4(r3)
            return
        L_0x00a5:
            r0 = r4
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63342su.A01(X.11S, X.1CJ, X.18K, X.1ca, int):void");
    }

    public void A02() {
        this.A0N.A01("offline_resume", false);
        A06(false);
    }

    public void A03() {
        AnonymousClass11P r2 = this.A0K;
        this.A0O = SystemClock.uptimeMillis();
        this.A0P = AnonymousClass11P.A01(r2);
    }

    public void A04() {
        this.A0N.A01("offline_resume", false);
        A06(true);
    }

    public void A05(C29621ca r5, int i) {
        AnonymousClass2FH r2 = new AnonymousClass2FH();
        String str = r5.A00;
        r2.A00 = str;
        r2.A01 = C29621ca.A02(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A0G.CC7(r2);
        String A002 = A00(str);
        if (A002 == null) {
            C17900vP.A0X(r5, "ConnectionReader/read/can't send nack for non ackable stanza:", AnonymousClass000.A10());
            return;
        }
        C58762lD r22 = new C58762lD();
        r22.A06 = A002;
        r22.A08 = r5.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r22.A01(String.valueOf(i));
        r22.A00 = -1;
        Class<Jid> cls = Jid.class;
        Jid A0F2 = r5.A0F(cls, "from");
        if (A0F2 != null) {
            r22.A02 = A0F2;
        }
        String A022 = C29621ca.A02(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (A022 != null) {
            r22.A09 = A022;
        }
        Jid A0F3 = r5.A0F(cls, "participant");
        if (A0F3 != null) {
            r22.A01 = A0F3;
        }
        this.A0M.A0K(r22.A00());
    }

    public void A06(boolean z) {
        if (!C18020vd.A05(C18040vf.A01, this.A0L, 4353) && !this.A0C) {
            this.A0C = true;
            if (this.A04 + this.A06 + this.A05 != 0) {
                AnonymousClass2HS r4 = new AnonymousClass2HS();
                r4.A0L = Long.valueOf(this.A0P);
                r4.A0G = Long.valueOf(this.A07 - this.A0O);
                r4.A0B = Long.valueOf(this.A03 - this.A0O);
                r4.A0H = Long.valueOf(SystemClock.uptimeMillis() - this.A0O);
                int i = 2;
                if (z) {
                    i = 1;
                }
                r4.A05 = Integer.valueOf(i);
                r4.A02 = Boolean.valueOf(this.A0J.A00);
                r4.A01 = Boolean.valueOf(!this.A0B);
                r4.A08 = Long.valueOf(this.A00);
                r4.A0E = Long.valueOf(this.A04);
                r4.A0A = Long.valueOf(this.A02);
                r4.A0I = Long.valueOf(this.A06);
                r4.A09 = Long.valueOf(this.A01);
                r4.A0F = Long.valueOf(this.A05);
                if (this.A08 != Long.MAX_VALUE) {
                    r4.A0C = Long.valueOf((this.A0P - this.A08) / 86400000);
                }
                AnonymousClass1O1 r1 = this.A0N;
                r4.A0M = AnonymousClass1O1.A00(r1, r1.A00);
                this.A0G.CC7(r4);
            }
        }
    }

    public C63342su(AnonymousClass195 r3, AnonymousClass190 r4, AnonymousClass11S r5, AnonymousClass11P r6, AnonymousClass1CJ r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass1OZ r10, C30971eo r11, AnonymousClass1O1 r12, C29971dB r13, Map map, Map map2) {
        this.A0K = r6;
        this.A0L = r8;
        this.A0D = r4;
        this.A0E = r5;
        this.A0F = r7;
        this.A0G = r9;
        this.A0M = r10;
        this.A0I = r13;
        this.A0N = r12;
        this.A0J = r3;
        this.A0A = map;
        this.A09 = map2;
        this.A0H = r11;
    }
}
