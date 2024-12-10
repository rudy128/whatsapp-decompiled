package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77N  reason: invalid class name */
public final class AnonymousClass77N implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public List A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77N) {
                AnonymousClass77N r5 = (AnonymousClass77N) obj;
                if (!C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A05, r5.A05) || this.A08 != r5.A08 || this.A01 != r5.A01 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A01);
        C108995ce.A0r(parcel, this.A02);
        C108995ce.A0r(parcel, this.A04);
        C108995ce.A0r(parcel, this.A03);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                ((AnonymousClass774) A0r.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A06);
    }

    public int hashCode() {
        return ((((((((((AnonymousClass0DV.A00(((C17900vP.A00(this.A07) * 31) + C17900vP.A00(this.A05)) * 31, this.A08) + this.A01) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A06);
    }

    public AnonymousClass77N(Integer num, Integer num2, Integer num3, String str, String str2, String str3, List list, int i, boolean z) {
        this.A07 = str;
        this.A05 = str2;
        this.A08 = z;
        this.A01 = i;
        this.A02 = num;
        this.A04 = num2;
        this.A03 = num3;
        this.A00 = list;
        this.A06 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusApiMetadata(sourceAttributionUrl=");
        A10.append(this.A07);
        A10.append(", packageName=");
        A10.append(this.A05);
        A10.append(", editable=");
        A10.append(this.A08);
        A10.append(", externalInteractables=");
        A10.append(this.A01);
        A10.append(", backgroundColor=");
        A10.append(this.A02);
        A10.append(", colorGradientTop=");
        A10.append(this.A04);
        A10.append(", colorGradientBottom=");
        A10.append(this.A03);
        A10.append(", statusTappableAreas=");
        A10.append(this.A00);
        A10.append(", shareType=");
        return C17900vP.A0B(this.A06, A10);
    }
}
