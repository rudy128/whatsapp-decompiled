package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class AEO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final Date A03;
    public final Date A04;
    public final Date A05;
    public final Date A06;
    public final List A07;
    public final List A08;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEO) {
                AEO aeo = (AEO) obj;
                if (!C18070vi.A18(this.A00, aeo.A00) || !C18070vi.A18(this.A01, aeo.A01) || !C18070vi.A18(this.A02, aeo.A02) || !C18070vi.A18(this.A04, aeo.A04) || !C18070vi.A18(this.A06, aeo.A06) || !C18070vi.A18(this.A05, aeo.A05) || !C18070vi.A18(this.A08, aeo.A08) || !C18070vi.A18(this.A07, aeo.A07) || !C18070vi.A18(this.A03, aeo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A04);
        parcel.writeSerializable(this.A06);
        parcel.writeSerializable(this.A05);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                parcel.writeSerializable((Serializable) A0r.next());
            }
        }
        parcel.writeStringList(this.A07);
        parcel.writeSerializable(this.A03);
    }

    public int hashCode() {
        return ((((((((((((C17890vO.A02(this.A01, C17880vN.A03(this.A00)) + C17900vP.A00(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17880vN.A02(this.A03);
    }

    public AEO(String str, String str2, String str3, Date date, Date date2, Date date3, Date date4, List list, List list2) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = date;
        this.A06 = date2;
        this.A05 = date3;
        this.A08 = list;
        this.A07 = list2;
        this.A03 = date4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCalendarPickerInputParams(inputName=");
        A10.append(this.A00);
        A10.append(", inputType=");
        A10.append(this.A01);
        A10.append(", title=");
        A10.append(this.A02);
        A10.append(", initialDate=");
        A10.append(this.A04);
        A10.append(", minDate=");
        A10.append(this.A06);
        A10.append(", maxDate=");
        A10.append(this.A05);
        A10.append(", unavailableDates=");
        A10.append(this.A08);
        A10.append(", includeDays=");
        A10.append(this.A07);
        A10.append(", focusMonth=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
