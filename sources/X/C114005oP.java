package X;

import java.util.Arrays;

/* renamed from: X.5oP  reason: invalid class name and case insensitive filesystem */
public final class C114005oP extends C122976Sq {
    public final String A00;
    public final float[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114005oP) {
                C114005oP r5 = (C114005oP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A03 = C17880vN.A03(this.A00);
        float[] fArr = this.A01;
        if (fArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(fArr);
        }
        return A03 + hashCode;
    }

    public C114005oP(String str, float[] fArr) {
        this.A00 = str;
        this.A01 = fArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AiOutputFloatArray(type=");
        A10.append(this.A00);
        A10.append(", floatArray=");
        return C17900vP.A0B(Arrays.toString(this.A01), A10);
    }
}
