package X;

public class D8X implements C28589E9d {
    public int A00 = 0;
    public byte[] A01 = new byte[8];
    public float[] A02 = new float[16];
    public int A03 = 0;

    public void A02(C28589E9d e9d) {
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            byte b = this.A01[i2];
            C28589E9d e9d2 = e9d;
            if (b == 0) {
                float[] fArr = this.A02;
                int i3 = i + 1;
                float f = fArr[i];
                i = i3 + 1;
                e9d2.Bk6(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.A02;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i = i4 + 1;
                e9d2.BhX(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.A02;
                int i5 = i + 1;
                float f3 = fArr3[i];
                int i6 = i5 + 1;
                float f4 = fArr3[i5];
                int i7 = i6 + 1;
                float f5 = fArr3[i6];
                int i8 = i7 + 1;
                float f6 = fArr3[i7];
                int i9 = i8 + 1;
                i = i9 + 1;
                e9d2.BHy(f3, f4, f5, f6, fArr3[i8], fArr3[i9]);
            } else if (b == 3) {
                float[] fArr4 = this.A02;
                int i10 = i + 1;
                float f7 = fArr4[i];
                int i11 = i10 + 1;
                float f8 = fArr4[i10];
                int i12 = i11 + 1;
                i = i12 + 1;
                e9d2.CD6(f7, f8, fArr4[i11], fArr4[i12]);
            } else if (b != 8) {
                boolean A1O = AnonymousClass000.A1O(b & 2);
                boolean A1O2 = AnonymousClass000.A1O(b & 1);
                float[] fArr5 = this.A02;
                int i13 = i + 1;
                float f9 = fArr5[i];
                int i14 = i13 + 1;
                float f10 = fArr5[i13];
                int i15 = i14 + 1;
                float f11 = fArr5[i14];
                int i16 = i15 + 1;
                i = i16 + 1;
                e9d2.BCZ(f9, f10, f11, fArr5[i15], fArr5[i16], A1O, A1O2);
            } else {
                e9d2.close();
            }
        }
    }

    public void BHy(float f, float f2, float f3, float f4, float f5, float f6) {
        A00((byte) 2);
        A01(6);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        int i6 = i5 + 1;
        fArr[i5] = f5;
        this.A03 = i6 + 1;
        fArr[i6] = f6;
    }

    public void BhX(float f, float f2) {
        A00((byte) 1);
        A01(2);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        fArr[i] = f;
        this.A03 = i2 + 1;
        fArr[i2] = f2;
    }

    public void Bk6(float f, float f2) {
        A00((byte) 0);
        A01(2);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        fArr[i] = f;
        this.A03 = i2 + 1;
        fArr[i2] = f2;
    }

    public void CD6(float f, float f2, float f3, float f4) {
        A00((byte) 3);
        A01(4);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        this.A03 = i4 + 1;
        fArr[i4] = f4;
    }

    private void A00(byte b) {
        int i = this.A00;
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (i == length) {
            byte[] bArr2 = new byte[(length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            this.A01 = bArr2;
            bArr = bArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr[i2] = b;
    }

    private void A01(int i) {
        float[] fArr = this.A02;
        int length = fArr.length;
        if (length < this.A03 + i) {
            float[] fArr2 = new float[(length * 2)];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.A02 = fArr2;
        }
    }

    public void close() {
        A00((byte) 8);
    }

    public void BCZ(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        A00((AnonymousClass8BU.A00(z ? 1 : 0) | true) | z2 ? (byte) 1 : 0);
        A01(5);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        this.A03 = i5 + 1;
        fArr[i5] = f5;
    }
}
