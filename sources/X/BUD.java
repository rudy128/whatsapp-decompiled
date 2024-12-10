package X;

import android.graphics.Matrix;
import java.util.List;

public final class BUD extends C3J implements C28506E4o {
    public static final BUD A07 = new BUD(C18460wS.A00, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final List A06;

    public BUD(List list, float f, float f2, float f3, float f4, float f5, float f6) {
        C18070vi.A0d(list, 7);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = list;
    }

    public void BCU(Matrix matrix) {
        C18070vi.A0d(matrix, 0);
        Matrix A0J = C108945cZ.A0J();
        float[] fArr = new float[9];
        A0J.getValues(fArr);
        fArr[0] = this.A00;
        fArr[1] = this.A02;
        fArr[2] = this.A04;
        fArr[3] = this.A01;
        fArr[4] = this.A03;
        fArr[5] = this.A05;
        A0J.setValues(fArr);
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C28506E4o) list.get(i)).BCU(A0J);
        }
        matrix.postConcat(A0J);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BUD) {
                BUD bud = (BUD) obj;
                if (!(Float.compare(this.A00, bud.A00) == 0 && Float.compare(this.A01, bud.A01) == 0 && Float.compare(this.A02, bud.A02) == 0 && Float.compare(this.A03, bud.A03) == 0 && Float.compare(this.A04, bud.A04) == 0 && Float.compare(this.A05, bud.A05) == 0 && C18070vi.A18(this.A06, bud.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A06, AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A01), this.A02), this.A03), this.A04), this.A05));
    }
}
