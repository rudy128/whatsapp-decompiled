package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77a  reason: invalid class name and case insensitive filesystem */
public final class C1418077a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C29681ch A00;
    public final int A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public C1418077a(C29681ch r2, Boolean bool, Integer num, String str, String str2, int i) {
        C18070vi.A0d(str, 1);
        this.A05 = str;
        this.A01 = i;
        this.A04 = str2;
        this.A02 = bool;
        this.A00 = r2;
        this.A03 = num;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1418077a) {
                C1418077a r5 = (C1418077a) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || this.A01 != r5.A01 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(A00(num));
    }

    public int hashCode() {
        int i = 0;
        int A032 = (((((((C17880vN.A03(this.A05) + this.A01) * 31) + C17900vP.A00(this.A04)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A00)) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = C72453Mb.A0E(num, A00(num));
        }
        return A032 + i;
    }

    public static String A00(Integer num) {
        if (1 - num.intValue() != 0) {
            return "IMAGE";
        }
        return "VIDEO";
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamoItemInfo(pcId=");
        A10.append(this.A05);
        A10.append(", position=");
        A10.append(this.A01);
        A10.append(", pcGroupId=");
        A10.append(this.A04);
        A10.append(", isFollowing=");
        A10.append(this.A02);
        A10.append(", newsletterJid=");
        A10.append(this.A00);
        A10.append(", wamoMediaType=");
        Integer num = this.A03;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        return C17900vP.A0B(str, A10);
    }
}
