package X;

/* renamed from: X.6tO  reason: invalid class name and case insensitive filesystem */
public final class C136176tO {
    public final long A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C136176tO(Integer num, Integer num2, String str, String str2, String str3, long j) {
        C18070vi.A0d(str, 2);
        this.A02 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = j;
        this.A01 = num2;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136176tO) {
                C136176tO r8 = (C136176tO) obj;
                if (this.A02 != r8.A02 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A05, r8.A05) || this.A00 != r8.A00 || this.A01 != r8.A01 || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0E;
        Integer num = this.A02;
        int A0E2 = C72453Mb.A0E(num, C124026Wt.A00(num)) * 31;
        int A0K = AnonymousClass001.A0K(this.A00, (C17890vO.A02(this.A04, A0E2) + C17900vP.A00(this.A05)) * 31);
        Integer num2 = this.A01;
        if (num2 == null) {
            A0E = 0;
        } else {
            A0E = C72453Mb.A0E(num2, C196839vj.A01(num2));
        }
        return ((A0K + A0E) * 31) + C108955ca.A06(this.A03);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceMessage(type=");
        A10.append(C124026Wt.A00(this.A02));
        A10.append(", message=");
        A10.append(this.A04);
        A10.append(", sessionId=");
        A10.append(this.A05);
        A10.append(", timestamp=");
        A10.append(this.A00);
        A10.append(", botMetricsEntryPoint=");
        Integer num = this.A01;
        if (num != null) {
            str = C196839vj.A01(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", botMetricsDestinationId=");
        return C17900vP.A0B(this.A03, A10);
    }
}
