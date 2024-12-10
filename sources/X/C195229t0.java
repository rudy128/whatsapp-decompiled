package X;

import java.util.Arrays;
import javax.crypto.SecretKey;

/* renamed from: X.9t0  reason: invalid class name and case insensitive filesystem */
public final class C195229t0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final SecretKey A03;
    public final byte[] A04;

    public C195229t0(String str, String str2, String str3, SecretKey secretKey, byte[] bArr) {
        C18070vi.A0d(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = secretKey;
        this.A04 = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeContext");
            C195229t0 r4 = (C195229t0) obj;
            if (C18070vi.A18(this.A01, r4.A01) && C18070vi.A18(this.A02, r4.A02) && C18070vi.A18(this.A00, r4.A00) && C18070vi.A18(this.A03, r4.A03)) {
                return Arrays.equals(this.A04, r4.A04);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, C17890vO.A02(this.A00, C17890vO.A02(this.A02, C17880vN.A03(this.A01)))) + Arrays.hashCode(this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsDataExchangeContext(flowId=");
        A10.append(this.A01);
        A10.append(", flowMessageVersion=");
        A10.append(this.A02);
        A10.append(", data=");
        A10.append(this.A00);
        A10.append(", aesKey=");
        A10.append(this.A03);
        A10.append(", initialVector=");
        return C17900vP.A0B(Arrays.toString(this.A04), A10);
    }
}
