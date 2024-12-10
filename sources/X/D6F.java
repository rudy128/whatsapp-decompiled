package X;

import java.util.Arrays;

public final class D6F implements E79 {
    public final float[] A00;
    public final float[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof D6F)) {
                return false;
            }
            D6F d6f = (D6F) obj;
            if (!Arrays.equals(this.A00, d6f.A00) || !Arrays.equals(this.A01, d6f.A01)) {
                return false;
            }
        }
        return true;
    }

    public float BFt(float f) {
        return A00(this.A01, this.A00, f);
    }

    public float BFu(float f) {
        return A00(this.A00, this.A01, f);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01);
    }

    public D6F(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length) {
            this.A00 = fArr;
            this.A01 = fArr2;
            return;
        }
        throw AnonymousClass000.A0k("Array lengths must match and be nonzero");
    }

    public static final float A00(float[] fArr, float[] fArr2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float max;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = fArr2[binarySearch];
        } else {
            int i = (-(binarySearch + 1)) - 1;
            int length = fArr.length - 1;
            float f6 = 0.0f;
            if (i >= length) {
                float f7 = fArr[length];
                float f8 = fArr2[length];
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f * (f8 / f7);
            }
            if (i == -1) {
                f3 = fArr[0];
                f4 = fArr2[0];
                f2 = 0.0f;
            } else {
                f2 = fArr[i];
                int i2 = i + 1;
                f3 = fArr[i2];
                f6 = fArr2[i];
                f4 = fArr2[i2];
            }
            if (f2 == f3) {
                f5 = 0.0f;
            } else {
                f5 = (abs - f2) / (f3 - f2);
            }
            max = f6 + ((f4 - f6) * Math.max(0.0f, Math.min(1.0f, f5)));
        }
        return signum * max;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.A00);
        C18070vi.A0X(arrays);
        A10.append(arrays);
        A10.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.A01);
        C18070vi.A0X(arrays2);
        A10.append(arrays2);
        return C17890vO.A0b(A10);
    }
}
