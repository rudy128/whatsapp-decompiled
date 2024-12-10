package X;

import java.util.Arrays;

/* renamed from: X.AVz  reason: case insensitive filesystem */
public final class C20719AVz implements B5K {
    public final Integer A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.reportingtoken.data.MessageStanzaReportingInfo");
                C20719AVz aVz = (C20719AVz) obj;
                if (C18070vi.A18(this.A00, aVz.A00) && Arrays.equals(this.A01, aVz.A01)) {
                    byte[] bArr = this.A02;
                    byte[] bArr2 = aVz.A02;
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
        int hashCode = Arrays.hashCode(this.A01) * 31;
        byte[] bArr = this.A02;
        int i2 = 0;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        Integer num = this.A00;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i3 + i2;
    }

    public C20719AVz(Integer num, byte[] bArr, byte[] bArr2) {
        this.A01 = bArr;
        this.A02 = bArr2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageStanzaReportingInfo(reportingTag=");
        C17890vO.A1C(A10, this.A01);
        A10.append(", reportingToken=");
        C17890vO.A1C(A10, this.A02);
        A10.append(", reportingTokenVersion=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
