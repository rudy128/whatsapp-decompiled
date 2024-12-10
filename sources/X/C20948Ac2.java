package X;

import java.util.Arrays;

/* renamed from: X.Ac2  reason: case insensitive filesystem */
public final class C20948Ac2 implements AnonymousClass25D {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final byte[] A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.reportingtoken.data.MessageReportingInfo");
                C20948Ac2 ac2 = (C20948Ac2) obj;
                if (C18070vi.A18(this.A02, ac2.A02) && this.A00 == ac2.A00 && Arrays.equals(this.A03, ac2.A03) && Arrays.equals(this.A04, ac2.A04) && C18070vi.A18(this.A01, ac2.A01)) {
                    byte[] bArr = this.A05;
                    byte[] bArr2 = ac2.A05;
                    if (bArr != null) {
                        if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                            return false;
                        }
                    } else if (bArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int A0K = AnonymousClass001.A0K(this.A00, C17890vO.A02(this.A02, Arrays.hashCode(this.A03) * 31));
        int i2 = 0;
        int A0B = (A0K + C72463Mc.A0B(this.A01)) * 31;
        byte[] bArr = this.A05;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int i3 = (A0B + i) * 31;
        byte[] bArr2 = this.A04;
        if (bArr2 != null) {
            i2 = Arrays.hashCode(bArr2);
        }
        return i3 + i2;
    }

    public C20948Ac2(Integer num, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A03 = bArr;
        this.A04 = bArr2;
        this.A05 = bArr3;
        this.A01 = num;
        this.A06 = bArr4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageReportingInfo(stanzaId=");
        A10.append(this.A02);
        A10.append(", sendTimestamp=");
        A10.append(this.A00);
        A10.append(", reportingTag=");
        C17890vO.A1C(A10, this.A03);
        A10.append(", reportingToken=");
        C17890vO.A1C(A10, this.A04);
        A10.append(", reportingTokenContent=");
        C17890vO.A1C(A10, this.A05);
        A10.append(", reportingTokenVersion=");
        A10.append(this.A01);
        A10.append(", reportingTokenKey=");
        return C17900vP.A0B(Arrays.toString(this.A06), A10);
    }
}
