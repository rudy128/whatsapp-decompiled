package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: X.A2z  reason: case insensitive filesystem */
public final class C20009A2z {
    public long A00;
    public String A01;
    public String A02;
    public Map A03 = C17880vN.A11();
    public final AnonymousClass190 A04;
    public final AnonymousClass11S A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass9W1 A0E;

    public final synchronized String A02(UserJid userJid) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            str = C17880vN.A0r(C17890vO.A0B(this.A06), AnonymousClass001.A1H("smb_business_direct_connection_enc_string_", userJid.getRawString(), AnonymousClass000.A10()));
        }
        return str;
    }

    public final synchronized void A03() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
    }

    public final synchronized void A04(BAF baf, AEW aew, UserJid userJid, String str) {
        C18070vi.A0e(userJid, 0, str);
        this.A02 = str;
        Map map = this.A03;
        List A0t = AnonymousClass8BS.A0t(userJid, map);
        if (A0t != null) {
            A0t.add(baf);
        } else {
            UserJid A0F = AnonymousClass8BV.A0F(userJid, this.A0D);
            map.put(userJid, AnonymousClass1ZU.A05(baf));
            if (A01(A0F) == null) {
                ((C190939ll) this.A0B.get()).A00(new C20502ANn(this, aew, A0F), userJid);
            } else {
                A00(this, aew, userJid, A0F);
            }
        }
    }

    public final synchronized void A05(BAF baf, AEW aew, UserJid userJid, boolean z) {
        UserJid A0F = AnonymousClass8BV.A0F(userJid, this.A0D);
        Map map = this.A03;
        List A0t = AnonymousClass8BS.A0t(userJid, map);
        if (A0t != null) {
            A0t.add(baf);
        } else {
            map.put(userJid, AnonymousClass1ZU.A05(baf));
            if (!C18020vd.A05(C18040vf.A02, ((AnonymousClass9WY) this.A09.get()).A00, 4281) || aew == null || (!aew.A0b)) {
                if (!z) {
                    String A012 = A01(A0F);
                    if (!(A012 == null || A012.length() == 0)) {
                        if (A02(A0F) == null || A08(A0F)) {
                            A00(this, aew, userJid, A0F);
                        }
                    }
                } else {
                    String rawString = A0F.getRawString();
                    C19830z4 r0 = this.A06;
                    r0.A1U(rawString);
                    r0.A1S(rawString);
                    r0.A1T(rawString);
                    C17880vN.A1B(C19830z4.A00(r0), AnonymousClass001.A1H("dc_business_domain_", rawString, AnonymousClass000.A10()));
                }
                ((C190939ll) this.A0B.get()).A00(new C20502ANn(this, aew, A0F), userJid);
            }
            A07(userJid);
        }
    }

    public final synchronized void A06(UserJid userJid) {
        Map map = this.A03;
        List<BAF> A0t = AnonymousClass8BS.A0t(userJid, map);
        if (A0t == null) {
            C17900vP.A0X(userJid, "DirectConnectionManager/onDirectConnectionInfoFailed/No listeners for jid - ", AnonymousClass000.A10());
        } else {
            for (BAF baf : A0t) {
                if (baf != null) {
                    baf.Brd(userJid);
                }
            }
            map.remove(userJid);
        }
    }

    public final synchronized void A07(UserJid userJid) {
        Map map = this.A03;
        List<BAF> A0t = AnonymousClass8BS.A0t(userJid, map);
        if (A0t == null) {
            C17900vP.A0X(userJid, "DirectConnectionManager/onDirectConnectionInfoSucceeded/No listeners for jid - ", AnonymousClass000.A10());
        } else {
            for (BAF baf : A0t) {
                if (baf != null) {
                    baf.Bre(userJid);
                }
            }
            map.remove(userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A09(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r7 = 0
            X.00H r0 = r8.A0D     // Catch:{ all -> 0x0046 }
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass8BV.A0F(r9, r0)     // Catch:{ all -> 0x0046 }
            long r3 = r8.A00     // Catch:{ all -> 0x0046 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            java.lang.String r5 = r8.A01     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0044
            X.0z4 r4 = r8.A06     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = r6.getRawString()     // Catch:{ all -> 0x0046 }
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "smb_business_direct_connection_enc_string_"
            X.AnonymousClass8BX.A0z(r2, r0, r3, r5, r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = r6.getRawString()     // Catch:{ all -> 0x0046 }
            long r2 = r8.A00     // Catch:{ all -> 0x0046 }
            android.content.SharedPreferences$Editor r4 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "smb_business_direct_connection_enc_string_expired_timestamp_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x0046 }
            X.C17880vN.A1D(r4, r0, r2)     // Catch:{ all -> 0x0046 }
            r8.A03()     // Catch:{ all -> 0x0046 }
            monitor-exit(r8)
            r0 = 1
            return r0
        L_0x0044:
            monitor-exit(r8)
            return r7
        L_0x0046:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20009A2z.A09(com.whatsapp.jid.UserJid):boolean");
    }

    public static final void A00(C20009A2z a2z, AEW aew, UserJid userJid, UserJid userJid2) {
        C20990Aci aci = new C20990Aci(userJid, AnonymousClass8BU.A0K(a2z.A0E.A00.A00));
        aci.A00 = new C186459eE(a2z, aew, userJid2, userJid);
        AnonymousClass1OZ r6 = aci.A02;
        String A0B2 = r6.A0B();
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        boolean A1W = C17890vO.A1W("biz_jid", aci.A01.getRawString(), r2);
        C29621ca A0k = AnonymousClass8BR.A0k("signed_user_info", r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
        C17880vN.A1I(C173438v4.A00, "to", r22, A1W ? 1 : 0);
        C17880vN.A1Q("xmlns", "w:biz:catalog", r22, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
        AnonymousClass8BV.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, r22);
        r6.A0I(aci, AnonymousClass8BT.A0a(A0k, r22), A0B2, 287, 32000);
    }

    public final String A01(UserJid userJid) {
        return C17880vN.A0r(C17890vO.A0B(this.A06), AnonymousClass001.A1H("smb_business_direct_connection_public_key_", userJid.getRawString(), AnonymousClass000.A10()));
    }

    public final boolean A08(UserJid userJid) {
        return AnonymousClass000.A1R((new Date().getTime() > C17890vO.A05(C17890vO.A0B(this.A06), AnonymousClass001.A1H("smb_business_direct_connection_enc_string_expired_timestamp_", userJid.getRawString(), AnonymousClass000.A10())) ? 1 : (new Date().getTime() == C17890vO.A05(C17890vO.A0B(this.A06), AnonymousClass001.A1H("smb_business_direct_connection_enc_string_expired_timestamp_", userJid.getRawString(), AnonymousClass000.A10())) ? 0 : -1)));
    }

    public C20009A2z(AnonymousClass190 r2, AnonymousClass9W1 r3, AnonymousClass11S r4, C19830z4 r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r5, r2, r7, r8, r6);
        C18070vi.A0x(r9, r4, r10, r3, r11);
        C18070vi.A0d(r12, 11);
        this.A06 = r5;
        this.A04 = r2;
        this.A0A = r7;
        this.A0C = r8;
        this.A07 = r6;
        this.A08 = r9;
        this.A05 = r4;
        this.A09 = r10;
        this.A0E = r3;
        this.A0B = r11;
        this.A0D = r12;
    }
}
