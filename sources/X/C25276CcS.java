package X;

import android.content.res.TypedArray;

/* renamed from: X.CcS  reason: case insensitive filesystem */
public abstract class C25276CcS {
    public final CUR A00 = new CUR();

    public void A01(float f) {
        CUR cur = this.A00;
        cur.A05 = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (cur.A05 & 16777215);
    }

    public void A02(float f) {
        if (f >= 0.0f) {
            this.A00.A00 = f;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Given invalid dropoff value: ");
        A10.append(f);
        throw AnonymousClass000.A0j(A10);
    }

    public void A03(float f) {
        CUR cur = this.A00;
        cur.A09 = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (cur.A09 & 16777215);
    }

    public void A04(float f) {
        if (f >= 0.0f) {
            this.A00.A02 = f;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Given invalid intensity value: ");
        A10.append(f);
        throw AnonymousClass000.A0j(A10);
    }

    public void A07(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            CUR cur = this.A00;
            cur.A0H = typedArray.getBoolean(3, cur.A0H);
        }
        if (typedArray.hasValue(0)) {
            CUR cur2 = this.A00;
            cur2.A0G = typedArray.getBoolean(0, cur2.A0G);
        }
        if (typedArray.hasValue(1)) {
            A01(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            A03(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            A05((long) typedArray.getInt(7, (int) this.A00.A0D));
        }
        if (typedArray.hasValue(14)) {
            CUR cur3 = this.A00;
            cur3.A0A = typedArray.getInt(14, cur3.A0A);
        }
        if (typedArray.hasValue(15)) {
            A06((long) typedArray.getInt(15, (int) this.A00.A0E));
        }
        if (typedArray.hasValue(16)) {
            CUR cur4 = this.A00;
            cur4.A0B = typedArray.getInt(16, cur4.A0B);
        }
        if (typedArray.hasValue(5)) {
            CUR cur5 = this.A00;
            int i = typedArray.getInt(5, cur5.A06);
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        cur5.A06 = 0;
                    }
                }
                cur5.A06 = i2;
            } else {
                cur5.A06 = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            CUR cur6 = this.A00;
            if (typedArray.getInt(17, cur6.A0C) != 1) {
                cur6.A0C = 0;
            } else {
                cur6.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            A02(typedArray.getFloat(6, this.A00.A00));
        }
        if (typedArray.hasValue(9)) {
            CUR cur7 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cur7.A08);
            if (dimensionPixelSize >= 0) {
                cur7.A08 = dimensionPixelSize;
            } else {
                throw AnonymousClass001.A13("Given invalid width: ", AnonymousClass000.A10(), dimensionPixelSize);
            }
        }
        if (typedArray.hasValue(8)) {
            CUR cur8 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cur8.A07);
            if (dimensionPixelSize2 >= 0) {
                cur8.A07 = dimensionPixelSize2;
            } else {
                throw AnonymousClass001.A13("Given invalid height: ", AnonymousClass000.A10(), dimensionPixelSize2);
            }
        }
        if (typedArray.hasValue(13)) {
            A04(typedArray.getFloat(13, this.A00.A02));
        }
        if (typedArray.hasValue(19)) {
            CUR cur9 = this.A00;
            float f = typedArray.getFloat(19, cur9.A04);
            if (f >= 0.0f) {
                cur9.A04 = f;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Given invalid width ratio: ");
                A10.append(f);
                throw AnonymousClass000.A0j(A10);
            }
        }
        if (typedArray.hasValue(10)) {
            CUR cur10 = this.A00;
            float f2 = typedArray.getFloat(10, cur10.A01);
            if (f2 >= 0.0f) {
                cur10.A01 = f2;
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Given invalid height ratio: ");
                A102.append(f2);
                throw AnonymousClass000.A0j(A102);
            }
        }
        if (typedArray.hasValue(18)) {
            CUR cur11 = this.A00;
            cur11.A03 = typedArray.getFloat(18, cur11.A03);
        }
    }

    public CUR A00() {
        CUR cur = this.A00;
        int i = cur.A0C;
        int[] iArr = cur.A0K;
        if (i != 1) {
            int i2 = cur.A05;
            iArr[0] = i2;
            int i3 = cur.A09;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = cur.A09;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = cur.A05;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = cur.A0J;
        if (i != 1) {
            float f = cur.A02;
            float f2 = 1.0f - f;
            float f3 = cur.A00;
            fArr[0] = Math.max((f2 - f3) / 2.0f, 0.0f);
            fArr[1] = Math.max((f2 - 0.001f) / 2.0f, 0.0f);
            float f4 = f + 1.0f;
            fArr[2] = Math.min((f4 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f4 + f3) / 2.0f, 1.0f);
            return cur;
        }
        fArr[0] = 0.0f;
        float f5 = cur.A02;
        fArr[1] = Math.min(f5, 1.0f);
        fArr[2] = Math.min(f5 + cur.A00, 1.0f);
        fArr[3] = 1.0f;
        return cur;
    }

    public void A05(long j) {
        if (j >= 0) {
            this.A00.A0D = j;
            return;
        }
        throw AnonymousClass000.A0k(C17890vO.A0a("Given a negative duration: ", AnonymousClass000.A10(), j));
    }

    public void A06(long j) {
        if (j >= 0) {
            this.A00.A0E = j;
            return;
        }
        throw AnonymousClass000.A0k(C17890vO.A0a("Given a negative repeat delay: ", AnonymousClass000.A10(), j));
    }
}
