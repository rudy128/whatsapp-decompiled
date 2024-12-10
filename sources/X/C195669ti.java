package X;

/* renamed from: X.9ti  reason: invalid class name and case insensitive filesystem */
public final class C195669ti {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C195669ti(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, long j2) {
        C18070vi.A0d(str3, 3);
        this.A03 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A02 = j;
        this.A04 = str4;
        this.A00 = i;
        this.A06 = str5;
        this.A05 = str6;
        this.A01 = j2;
        this.A09 = str7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195669ti) {
                C195669ti r8 = (C195669ti) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A08, r8.A08) || this.A02 != r8.A02 || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A05, r8.A05) || this.A01 != r8.A01 || !C18070vi.A18(this.A09, r8.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A08, C17890vO.A02(this.A07, C17880vN.A03(this.A03)));
        return AnonymousClass001.A0K(this.A01, (((((((AnonymousClass001.A0K(this.A02, A022) + C17900vP.A00(this.A04)) * 31) + this.A00) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A05)) * 31) + C108955ca.A06(this.A09);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InactiveNotificationData(accountLid=");
        A10.append(this.A03);
        A10.append(", notificationType=");
        A10.append(this.A07);
        A10.append(", senderJid=");
        A10.append(this.A08);
        A10.append(", timestampMs=");
        A10.append(this.A02);
        A10.append(", callId=");
        A10.append(this.A04);
        A10.append(", callStatus=");
        A10.append(this.A00);
        A10.append(", groupJid=");
        A10.append(this.A06);
        A10.append(", displayName=");
        A10.append(this.A05);
        A10.append(", count=");
        A10.append(this.A01);
        A10.append(", senderPnJid=");
        return C17900vP.A0B(this.A09, A10);
    }
}
