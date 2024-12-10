package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cX  reason: invalid class name and case insensitive filesystem */
public final class C89484cX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public C89484cX(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0d(str, 2);
        this.A08 = i;
        this.A01 = str;
        this.A00 = i2;
        this.A05 = z;
        this.A07 = i3;
        this.A06 = i4;
        this.A02 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89484cX) {
                C89484cX r5 = (C89484cX) obj;
                if (!(this.A08 == r5.A08 && C18070vi.A18(this.A01, r5.A01) && this.A00 == r5.A00 && this.A05 == r5.A05 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((AnonymousClass0DV.A00((C17890vO.A02(this.A01, this.A08 * 31) + this.A00) * 31, this.A05) + this.A07) * 31) + this.A06) * 31, this.A02), this.A04), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConfirmDialogData(title=");
        A10.append(this.A08);
        A10.append(", description=");
        A10.append(this.A01);
        A10.append(", saveContactsViewVisibility=");
        A10.append(this.A00);
        A10.append(", saveContactsCheckboxViewCheck=");
        A10.append(this.A05);
        A10.append(", positiveButton=");
        A10.append(this.A07);
        A10.append(", negativeButton=");
        A10.append(this.A06);
        A10.append(", backupContacts=");
        A10.append(this.A02);
        A10.append(", isOSPermissionGranted=");
        A10.append(this.A04);
        A10.append(", isContactDeleted=");
        return C17900vP.A0F(A10, this.A03);
    }
}
