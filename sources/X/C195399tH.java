package X;

/* renamed from: X.9tH  reason: invalid class name and case insensitive filesystem */
public final class C195399tH {
    public String A00;
    public String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C195399tH(String str, String str2, String str3, String str4, String str5, String str6) {
        C18070vi.A0g(str4, 4, str5);
        this.A02 = str;
        this.A00 = str2;
        this.A05 = str3;
        this.A01 = str4;
        this.A04 = str5;
        this.A03 = str6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195399tH) {
                C195399tH r5 = (C195399tH) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, C17890vO.A02(this.A04, C17890vO.A02(this.A01, C17890vO.A02(this.A05, C17890vO.A02(this.A00, C17880vN.A03(this.A02))))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsReportingData(data=");
        A10.append(this.A02);
        A10.append(", flowId=");
        A10.append(this.A00);
        A10.append(", sessionId=");
        A10.append(this.A05);
        A10.append(", t=");
        AnonymousClass8BT.A1W(A10, this.A01);
        A10.append(this.A04);
        A10.append(", entrypoint=");
        return C17900vP.A0B(this.A03, A10);
    }
}
