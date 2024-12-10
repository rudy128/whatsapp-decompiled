package X;

import java.util.Arrays;

public final class BTK extends C3J {
    public final float[] A00;
    public final int[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasGradient");
                BTK btk = (BTK) obj;
                if (Arrays.equals(this.A01, btk.A01)) {
                    float[] fArr = this.A00;
                    float[] fArr2 = btk.A00;
                    if (fArr != null) {
                        if (fArr2 == null || !Arrays.equals(fArr, fArr2)) {
                            return false;
                        }
                    } else if (fArr2 != null) {
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
        float[] fArr = this.A00;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public BTK(float[] fArr, int[] iArr) {
        this.A01 = iArr;
        this.A00 = fArr;
    }
}
