package X;

import java.util.Arrays;

/* renamed from: X.7Ib  reason: invalid class name and case insensitive filesystem */
public class C144627Ib implements AnonymousClass8AP {
    public float A00;
    public long A01;
    public long A02;
    public long A03;
    public int[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C144627Ib r7 = (C144627Ib) obj;
            if (Float.compare(r7.A00, this.A00) != 0 || !Arrays.equals(this.A04, r7.A04) || r7.A01 != this.A01 || r7.A02 != this.A02) {
                return false;
            }
            long j = this.A03;
            return j == j;
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Float.valueOf(this.A00);
        C17890vO.A1M(objArr, this.A01);
        objArr[2] = Long.valueOf(this.A02);
        C17890vO.A1O(objArr, this.A03);
        return (Arrays.hashCode(objArr) * 31) + Arrays.hashCode(this.A04);
    }

    public /* bridge */ /* synthetic */ boolean BFJ(Object obj) {
        return Arrays.equals(this.A04, (int[]) obj);
    }

    public long BMZ() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ Object BSD() {
        return this.A04;
    }

    public float Bbo() {
        return this.A00;
    }

    public void CLT(float f) {
        this.A00 = f;
    }
}
