package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.4cU  reason: invalid class name and case insensitive filesystem */
public final class C89454cU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C89284cD A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89454cU) {
                C89454cU r5 = (C89454cU) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || this.A06 != r5.A06 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        List<C89454cU> list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (C89454cU writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        C89284cD r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r0.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((((AnonymousClass0DV.A00((C17890vO.A02(this.A03, C17880vN.A03(this.A02)) + AnonymousClass001.A0k(this.A05)) * 31, this.A06) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A04)) * 31) + C17880vN.A02(this.A00);
    }

    public C89454cU(C89284cD r1, String str, String str2, String str3, String str4, List list, boolean z) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A06 = z;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportTopic(id=");
        A10.append(this.A02);
        A10.append(", title=");
        A10.append(this.A03);
        A10.append(", children=");
        A10.append(this.A05);
        A10.append(", childrenSkippable=");
        A10.append(this.A06);
        A10.append(", htmlContent=");
        A10.append(this.A01);
        A10.append(", url=");
        A10.append(this.A04);
        A10.append(", chatSupportInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
