package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcQ  reason: case insensitive filesystem */
public final class C23170BcQ extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte A00;
    public final byte A01;
    public final byte A02;
    public final byte A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C23170BcQ bcQ = (C23170BcQ) obj;
            if (this.A04 != bcQ.A04 || this.A00 != bcQ.A00 || this.A01 != bcQ.A01 || this.A02 != bcQ.A02 || this.A03 != bcQ.A03 || !this.A05.equals(bcQ.A05)) {
                return false;
            }
            String str = this.A06;
            String str2 = bcQ.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (!this.A07.equals(bcQ.A07) || !this.A08.equals(bcQ.A08) || !this.A09.equals(bcQ.A09)) {
                return false;
            }
            String str3 = this.A0A;
            String str4 = bcQ.A0A;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A0B;
            String str6 = bcQ.A0B;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.A04 + 31) * 31;
        int i2 = 0;
        int A022 = (((((((((C17890vO.A02(this.A09, C17890vO.A02(this.A08, C17890vO.A02(this.A07, (C17890vO.A02(this.A05, i) + AnonymousClass8BW.A02(this.A06)) * 31))) + AnonymousClass8BW.A02(this.A0A)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        String str = this.A0B;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A022 + i2;
    }

    public final String toString() {
        int i = this.A04;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A08;
        String str5 = this.A09;
        String str6 = this.A0A;
        byte b = this.A00;
        byte b2 = this.A01;
        byte b3 = this.A02;
        byte b4 = this.A03;
        String str7 = this.A0B;
        int A0C = BE8.A0C(str);
        int A0C2 = BE8.A0C(str2);
        int A0C3 = BE8.A0C(str3);
        int A0C4 = BE8.A0C(str4);
        int A0C5 = BE8.A0C(str5);
        StringBuilder A0q = BE7.A0q(A0C + 211 + A0C2 + A0C3 + A0C4 + A0C5 + BE8.A0C(str6), BE8.A0C(str7));
        A0q.append("AncsNotificationParcelable{, id=");
        A0q.append(i);
        A0q.append(", appId='");
        A0q.append(str);
        A0q.append("', dateTime='");
        A0q.append(str2);
        A0q.append("', notificationText='");
        A0q.append(str3);
        A0q.append("', title='");
        A0q.append(str4);
        A0q.append("', subtitle='");
        A0q.append(str5);
        A0q.append("', displayName='");
        A0q.append(str6);
        A0q.append("', eventId=");
        A0q.append(b);
        A0q.append(", eventFlags=");
        A0q.append(b2);
        A0q.append(", categoryId=");
        A0q.append(b3);
        A0q.append(", categoryCount=");
        A0q.append(b4);
        A0q.append(", packageName='");
        A0q.append(str7);
        return AnonymousClass000.A0y("'}", A0q);
    }

    public C23170BcQ(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b, byte b2, byte b3, byte b4, int i) {
        this.A04 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A00 = b;
        this.A01 = b2;
        this.A02 = b3;
        this.A03 = b4;
        this.A0B = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A04);
        String str = this.A05;
        C26293Cx2.A0A(parcel, str, 3, false);
        C26293Cx2.A0A(parcel, this.A06, 4, false);
        C26293Cx2.A0A(parcel, this.A07, 5, false);
        C26293Cx2.A0A(parcel, this.A08, 6, false);
        C26293Cx2.A0A(parcel, this.A09, 7, false);
        String str2 = this.A0A;
        if (str2 == null) {
            str2 = str;
        }
        C26293Cx2.A0A(parcel, str2, 8, false);
        byte b = this.A00;
        BE7.A0z(9, parcel);
        parcel.writeInt(b);
        byte b2 = this.A01;
        BE7.A0z(10, parcel);
        parcel.writeInt(b2);
        byte b3 = this.A02;
        BE7.A0z(11, parcel);
        parcel.writeInt(b3);
        byte b4 = this.A03;
        BE7.A0z(12, parcel);
        parcel.writeInt(b4);
        C26293Cx2.A0A(parcel, this.A0B, 13, false);
        C26293Cx2.A05(parcel, A002);
    }
}
