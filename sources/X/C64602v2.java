package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.2v2  reason: invalid class name and case insensitive filesystem */
public final class C64602v2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D3B(1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public C64602v2(C34001jj r12) {
        String str;
        ArrayList arrayList = r12.A0C;
        int size = arrayList.size();
        int[] iArr = new int[(size * 6)];
        this.A0D = iArr;
        if (r12.A0F) {
            ArrayList A0z = C17880vN.A0z(size);
            this.A07 = A0z;
            int[] iArr2 = new int[size];
            this.A0C = iArr2;
            int[] iArr3 = new int[size];
            this.A0B = iArr3;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C34271kD r9 = (C34271kD) arrayList.get(i2);
                int i3 = i + 1;
                iArr[i] = r9.A00;
                Fragment fragment = r9.A05;
                if (fragment != null) {
                    str = fragment.A0V;
                } else {
                    str = null;
                }
                A0z.add(str);
                int i4 = i3 + 1;
                iArr[i3] = r9.A08;
                int i5 = i4 + 1;
                iArr[i4] = r9.A01;
                int i6 = i5 + 1;
                iArr[i5] = r9.A02;
                int i7 = i6 + 1;
                iArr[i6] = r9.A03;
                i = i7 + 1;
                iArr[i7] = r9.A04;
                iArr2[i2] = r9.A07.ordinal();
                iArr3[i2] = r9.A06.ordinal();
            }
            this.A03 = r12.A06;
            this.A06 = r12.A0A;
            this.A02 = r12.A07;
            this.A01 = r12.A01;
            this.A05 = r12.A09;
            this.A00 = r12.A00;
            this.A04 = r12.A08;
            this.A08 = r12.A0D;
            this.A09 = r12.A0E;
            this.A0A = r12.A0G;
            return;
        }
        throw AnonymousClass000.A0n("Not on back stack");
    }

    public C64602v2(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A05 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = AnonymousClass000.A1O(parcel.readInt());
    }
}
