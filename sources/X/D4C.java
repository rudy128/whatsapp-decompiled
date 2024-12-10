package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D4C implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public boolean A05;
    public final Integer A06;
    public final Integer A07;

    public D4C(Integer num, Integer num2, float f, float f2, float f3, float f4, float f5, boolean z) {
        C18070vi.A0d(num, 7);
        C18070vi.A0d(num2, 8);
        this.A05 = z;
        this.A02 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A00 = f5;
        this.A07 = num;
        this.A06 = num2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeString(A00(this.A07));
        parcel.writeString(A00(this.A06));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof D4C)) {
            return false;
        }
        D4C d4c = (D4C) obj;
        if (this.A05 == d4c.A05 && this.A02 == d4c.A02 && this.A01 == d4c.A01 && this.A03 == d4c.A03 && this.A04 == d4c.A04 && this.A00 == d4c.A00 && this.A07 == d4c.A07 && this.A06 == d4c.A06) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A0B = AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass3MX.A03(this.A05), this.A02), this.A01), this.A03), this.A04), this.A00);
        Integer num = this.A07;
        Integer num2 = this.A06;
        return ((A0B + C72453Mb.A0E(num, A00(num))) * 31) + C72453Mb.A0E(num2, A00(num2));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NONE";
            case 1:
                return "INPUT";
            case 2:
                return "MODEL";
            default:
                return "INPUT_AND_MODEL";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("forceCenterCropScale ");
        A10.append(this.A05);
        A10.append("\nscale ");
        A10.append(this.A02);
        A10.append("\nrotation ");
        A10.append(this.A01);
        A10.append("\ntranslationX ");
        A10.append(this.A03);
        A10.append("\ntranslationY ");
        A10.append(this.A04);
        A10.append("\naspectRatio ");
        A10.append(this.A00);
        A10.append("\ntextureTransformTarget ");
        A10.append(A00(this.A07));
        A10.append("\ncontentTransformTarget ");
        A10.append(A00(this.A06));
        return C17890vO.A0c(A10, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public D4C() {
        /*
            r9 = this;
            r8 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0 = r9
            r2 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4C.<init>():void");
    }
}
