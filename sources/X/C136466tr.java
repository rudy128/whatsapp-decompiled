package X;

/* renamed from: X.6tr  reason: invalid class name and case insensitive filesystem */
public final class C136466tr {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final long A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136466tr) {
                C136466tr r8 = (C136466tr) obj;
                if (this.A07 != r8.A07 || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A02, C17890vO.A02(this.A05, C17890vO.A02(this.A04, AnonymousClass001.A0K(this.A00, C17890vO.A02(this.A03, C17890vO.A02(this.A06, AnonymousClass000.A0I(this.A07) * 31)))))));
    }

    public C136466tr(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2) {
        this.A07 = j;
        this.A06 = str;
        this.A03 = str2;
        this.A00 = j2;
        this.A04 = str3;
        this.A05 = str4;
        this.A02 = str5;
        this.A01 = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamoReportDownloadInfo(creationTime=");
        A10.append(this.A07);
        A10.append(", mediaUrl=");
        A10.append(this.A06);
        A10.append(", mediaHash=");
        A10.append(this.A03);
        A10.append(", mediaSize=");
        A10.append(this.A00);
        A10.append(", mediaKey=");
        A10.append(this.A04);
        A10.append(", mediaName=");
        A10.append(this.A05);
        A10.append(", mediaEncHash=");
        A10.append(this.A02);
        A10.append(", directPath=");
        return C17900vP.A0B(this.A01, A10);
    }
}
