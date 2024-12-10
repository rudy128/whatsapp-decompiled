package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2nR  reason: invalid class name and case insensitive filesystem */
public class C60132nR {
    public final long A00;
    public final Jid A01;
    public final Jid A02;
    public final UserJid A03;
    public final C29621ca A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public C58762lD A00() {
        C58762lD r4 = new C58762lD();
        r4.A02 = this.A02;
        r4.A06 = this.A06;
        r4.A08 = this.A08;
        r4.A09 = this.A09;
        r4.A05 = this.A05;
        r4.A01 = this.A01;
        r4.A03 = this.A03;
        r4.A07 = this.A07;
        r4.A00 = this.A00;
        List<AnonymousClass1MD> list = this.A0A;
        if (list != null) {
            for (AnonymousClass1MD r2 : list) {
                r4.A0A.put(r2.A02, r2);
            }
        }
        r4.A04 = this.A04;
        return r4;
    }

    public boolean A01() {
        String str = this.A06;
        if ("message".equals(str) || "notification".equals(str) || "call".equals(str) || "receipt".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x001b
            X.2nR r4 = (X.C60132nR) r4
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            if (r1 != 0) goto L_0x001c
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            com.whatsapp.jid.Jid r1 = r3.A02
            com.whatsapp.jid.Jid r0 = r4.A02
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0033
            return r2
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r1 = r3.A08
            java.lang.String r0 = r4.A08
            if (r1 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x003c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
            return r2
        L_0x0043:
            com.whatsapp.jid.Jid r1 = r3.A01
            com.whatsapp.jid.Jid r0 = r4.A01
            if (r1 != 0) goto L_0x004c
            if (r0 == 0) goto L_0x0053
            return r2
        L_0x004c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0053
            return r2
        L_0x0053:
            com.whatsapp.jid.UserJid r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r1 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x0063
            return r2
        L_0x005c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0063
            return r2
        L_0x0063:
            java.lang.String r1 = r3.A09
            java.lang.String r0 = r4.A09
            if (r1 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x0073
            return r2
        L_0x006c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0073
            return r2
        L_0x0073:
            java.lang.String r1 = r3.A07
            java.lang.String r0 = r4.A07
            if (r1 != 0) goto L_0x007c
            if (r0 == 0) goto L_0x0083
            return r2
        L_0x007c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0083
            return r2
        L_0x0083:
            java.util.List r1 = r3.A0A
            java.util.List r0 = r4.A0A
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x0093
            return r2
        L_0x008c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0093
            return r2
        L_0x0093:
            X.1ca r1 = r3.A04
            X.1ca r0 = r4.A04
            if (r1 != 0) goto L_0x009c
            if (r0 == 0) goto L_0x00a3
            return r2
        L_0x009c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a3
            return r2
        L_0x00a3:
            java.lang.String r1 = r3.A05
            java.lang.String r0 = r4.A05
            boolean r0 = X.C42171xk.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60132nR.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode;
        int A002 = (((((((((((((31 + C17900vP.A00(this.A06)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A08)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A09)) * 31) + C17900vP.A00(this.A07)) * 31;
        List list = this.A0A;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((((A002 + hashCode) * 31) + C17900vP.A00(this.A05)) * 31) + C17880vN.A02(this.A04);
    }

    public C60132nR(Jid jid, Jid jid2, UserJid userJid, C29621ca r4, String str, String str2, String str3, String str4, String str5, List list, long j) {
        this.A02 = jid;
        this.A06 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A05 = str4;
        this.A01 = jid2;
        this.A03 = userJid;
        this.A07 = str5;
        this.A00 = j;
        this.A0A = list;
        this.A04 = r4;
    }

    public String toString() {
        String A1E;
        String A1H;
        String A1H2;
        String A1H3;
        String A1H4;
        String A1E2;
        String A1E3;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[StanzaKey");
        Jid jid = this.A02;
        String str = "";
        if (jid == null) {
            A1E = str;
        } else {
            A1E = AnonymousClass001.A1E(jid, " remoteJid=", AnonymousClass000.A10());
        }
        A10.append(A1E);
        String str2 = this.A06;
        if (str2 == null) {
            A1H = str;
        } else {
            A1H = AnonymousClass001.A1H(" cls=", str2, AnonymousClass000.A10());
        }
        A10.append(A1H);
        String str3 = this.A08;
        if (str3 == null) {
            A1H2 = str;
        } else {
            A1H2 = AnonymousClass001.A1H(" id=", str3, AnonymousClass000.A10());
        }
        A10.append(A1H2);
        String str4 = this.A09;
        if (str4 == null) {
            A1H3 = str;
        } else {
            A1H3 = AnonymousClass001.A1H(" type=", str4, AnonymousClass000.A10());
        }
        A10.append(A1H3);
        String str5 = this.A05;
        if (str5 == null) {
            A1H4 = str;
        } else {
            A1H4 = AnonymousClass001.A1H(" category=", str5, AnonymousClass000.A10());
        }
        A10.append(A1H4);
        Jid jid2 = this.A01;
        if (jid2 == null) {
            A1E2 = str;
        } else {
            A1E2 = AnonymousClass001.A1E(jid2, " participant=", AnonymousClass000.A10());
        }
        A10.append(A1E2);
        UserJid userJid = this.A03;
        if (userJid == null) {
            A1E3 = str;
        } else {
            A1E3 = AnonymousClass001.A1E(userJid, " recipient=", AnonymousClass000.A10());
        }
        A10.append(A1E3);
        String str6 = this.A07;
        if (str6 != null) {
            str = AnonymousClass001.A1H(" editVersion=", str6, AnonymousClass000.A10());
        }
        A10.append(str);
        A10.append(" loggableStanzaId=");
        A10.append(this.A00);
        return AnonymousClass000.A0z(A10);
    }
}
