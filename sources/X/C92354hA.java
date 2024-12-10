package X;

/* renamed from: X.4hA  reason: invalid class name and case insensitive filesystem */
public final class C92354hA implements C108735cD {
    public final C75583hl A00;
    public final Integer A01;
    public final float A02;
    public final int A03;
    public final C89304cF A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92354hA) {
                C92354hA r5 = (C92354hA) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C89304cF BSi() {
        return this.A04;
    }

    public /* bridge */ /* synthetic */ C89304cF BT7() {
        return null;
    }

    public Float BUT() {
        return Float.valueOf(this.A02);
    }

    public /* bridge */ /* synthetic */ AnonymousClass4E5 BVB() {
        return this.A00;
    }

    public boolean BYG() {
        return false;
    }

    public boolean Be7() {
        return false;
    }

    public int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "LOW_LIGHT";
        } else {
            str = "TOUCH_UP";
        }
        return ((str.hashCode() + intValue) * 31) + this.A03;
    }

    public C92354hA(int i, Integer num) {
        Integer num2;
        String str;
        float f;
        this.A01 = num;
        this.A03 = i;
        int intValue = num.intValue();
        if (intValue != 0) {
            num2 = AnonymousClass00R.A00;
        } else {
            num2 = AnonymousClass00R.A01;
        }
        if (num2.intValue() != 0) {
            str = "FastRetouchingFilter";
        } else {
            str = "LowLightFastFilter";
        }
        this.A04 = new C89304cF(str);
        this.A00 = new C75583hl(i);
        if (intValue != 0) {
            f = 1.0f;
        } else {
            f = 2.5f;
        }
        this.A02 = f;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IgluEffectMetadata(filter=");
        if (this.A01.intValue() != 0) {
            str = "LOW_LIGHT";
        } else {
            str = "TOUCH_UP";
        }
        A10.append(str);
        A10.append(", nameRes=");
        return AnonymousClass001.A1L(A10, this.A03);
    }
}
