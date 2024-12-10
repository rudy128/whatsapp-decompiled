package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.77M  reason: invalid class name */
public final class AnonymousClass77M implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public ArrayList A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C1417576v A05;
    public final boolean A06;
    public final int A07;

    public AnonymousClass77M(C1417576v r2, ArrayList arrayList, int i, int i2, int i3, int i4, boolean z) {
        C18070vi.A0d(r2, 6);
        this.A03 = i;
        this.A07 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A06 = z;
        this.A05 = r2;
        this.A01 = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77M) {
                AnonymousClass77M r5 = (AnonymousClass77M) obj;
                if (!(this.A03 == r5.A03 && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A06 == r5.A06 && C18070vi.A18(this.A05, r5.A05) && C18070vi.A18(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeStringList(this.A01);
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A05, AnonymousClass0DV.A00(((((((this.A03 * 31) + this.A07) * 31) + this.A04) * 31) + this.A02) * 31, this.A06)) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoteEntityFilter(filterId=");
        A10.append(this.A03);
        A10.append(", filterViewIdRes=");
        A10.append(this.A07);
        A10.append(", filterNameStringRes=");
        A10.append(this.A04);
        A10.append(", filterDrawableRes=");
        A10.append(this.A02);
        A10.append(", isInternalOnly=");
        A10.append(this.A06);
        A10.append(", nuxListener=");
        A10.append(this.A05);
        A10.append(", searchHintList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
