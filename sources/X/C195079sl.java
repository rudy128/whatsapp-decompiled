package X;

import java.util.Arrays;

/* renamed from: X.9sl  reason: invalid class name and case insensitive filesystem */
public final class C195079sl {
    public final Integer A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.reportingtoken.data.ParseE2EMessageReportingInfo");
                C195079sl r5 = (C195079sl) obj;
                if (!Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((Arrays.hashCode(this.A02) * 31) + C72463Mc.A0B(this.A00)) * 31) + Arrays.hashCode(this.A01)) * 31;
        byte[] bArr = this.A03;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode + i;
    }

    public C195079sl(Integer num, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A02 = bArr;
        this.A01 = bArr2;
        this.A03 = bArr3;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseE2EMessageReportingInfo(reportingTag=");
        C17890vO.A1C(A10, this.A02);
        A10.append(", messageContent=");
        C17890vO.A1C(A10, this.A01);
        A10.append(", reportingToken=");
        C17890vO.A1C(A10, this.A03);
        A10.append(", reportingTokenVersion=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
