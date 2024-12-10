package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tn  reason: invalid class name and case insensitive filesystem */
public final class C195719tn {
    public final int A00;
    public final long A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195719tn) {
                C195719tn r8 = (C195719tn) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A07, r8.A07) || this.A01 != r8.A01 || this.A00 != r8.A00 || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A05, r8.A05) || this.A09 != r8.A09 || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A06, r8.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A07, C17890vO.A02(this.A04, AnonymousClass000.A0L(this.A02)));
        return ((AnonymousClass0DV.A00(C17890vO.A02(this.A05, C17890vO.A02(this.A08, (AnonymousClass001.A0K(this.A01, A022) + this.A00) * 31)), this.A09) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A06);
    }

    public C195719tn(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, boolean z) {
        C18070vi.A0o(userJid, str, str2);
        C18070vi.A0l(str3, str4);
        this.A02 = userJid;
        this.A04 = str;
        this.A07 = str2;
        this.A01 = j;
        this.A00 = i;
        this.A08 = str3;
        this.A05 = str4;
        this.A09 = z;
        this.A03 = str5;
        this.A06 = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsContextParams(bizJid=");
        A10.append(this.A02);
        A10.append(", flowId=");
        A10.append(this.A04);
        A10.append(", messageId=");
        A10.append(this.A07);
        A10.append(", messageRowId=");
        A10.append(this.A01);
        A10.append(", carouselCardIndex=");
        A10.append(this.A00);
        A10.append(", sessionId=");
        A10.append(this.A08);
        A10.append(", flowMessageVersion=");
        A10.append(this.A05);
        A10.append(", dataChannelNavigation=");
        A10.append(this.A09);
        A10.append(", flowCtaText=");
        A10.append(this.A03);
        A10.append(", flowName=");
        return C17900vP.A0B(this.A06, A10);
    }
}
