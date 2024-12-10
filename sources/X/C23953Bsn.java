package X;

import java.util.Arrays;

/* renamed from: X.Bsn  reason: case insensitive filesystem */
public final class C23953Bsn extends C4U {
    public final byte[] A00;

    public C23953Bsn(byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A00 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.infra.graphql.mex.argo.ArgoScalarValue.Fixed");
                if (!Arrays.equals(this.A00, ((C23953Bsn) obj).A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Fixed(value=");
        return C17900vP.A0B(Arrays.toString(this.A00), A10);
    }
}
