package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77c  reason: invalid class name and case insensitive filesystem */
public final class C1418277c implements Parcelable {
    public static final C1418277c A0D = new C1418277c((Boolean) null, AnonymousClass00R.A0Y, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false);
    public static final C1418277c A0E = new C1418277c((Boolean) null, AnonymousClass00R.A0C, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false);
    public static final C1418277c A0F = new C1418277c((Boolean) null, AnonymousClass00R.A0N, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false);
    public static final C1418277c A0G = new C1418277c((Boolean) null, AnonymousClass00R.A0j, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false);
    public static final Parcelable.Creator CREATOR = new Object();
    public final Boolean A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final List A0C;

    public C1418277c(Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        C18070vi.A0d(num, 1);
        this.A01 = num;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A03 = str6;
        this.A08 = str7;
        this.A07 = str8;
        this.A02 = l;
        this.A00 = bool;
        this.A0C = list;
        this.A0B = z;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1418277c) {
                C1418277c r5 = (C1418277c) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A0C, r5.A0C) || this.A0B != r5.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(A00(this.A01));
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.A0C;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                parcel.writeInt(C72453Mb.A0H(A0r));
            }
        }
        parcel.writeInt(this.A0B ? 1 : 0);
    }

    public final int A01() {
        Number number;
        List list = this.A0C;
        if (list == null || (number = (Number) C29431cG.A0c(list)) == null) {
            return 0;
        }
        return number.intValue();
    }

    public int hashCode() {
        Integer num = this.A01;
        return C17880vN.A01(((((((((((((((((((((((C72453Mb.A0E(num, A00(num)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A09)) * 31) + C17900vP.A00(this.A0A)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A07)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A0C)) * 31, this.A0B);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "TRACK";
            case 1:
                return "ARTIST";
            case 2:
                return "LOADING";
            case 3:
                return "POPULAR_SECTION_TITLE";
            case 4:
                return "EMPTY_RESULTS";
            default:
                return "RETRY";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MusicCatalogItem(type=");
        A10.append(A00(this.A01));
        A10.append(", displayTitle=");
        A10.append(this.A06);
        A10.append(", displaySubtitle=");
        A10.append(this.A05);
        A10.append(", displayImageUri=");
        A10.append(this.A04);
        A10.append(", songId=");
        A10.append(this.A09);
        A10.append(", songUri=");
        A10.append(this.A0A);
        A10.append(", artistId=");
        A10.append(this.A03);
        A10.append(", igProfileUri=");
        A10.append(this.A08);
        A10.append(", fbProfileUri=");
        A10.append(this.A07);
        A10.append(", durationInMs=");
        A10.append(this.A02);
        A10.append(", isExplicit=");
        A10.append(this.A00);
        A10.append(", highlightTimesInMs=");
        A10.append(this.A0C);
        A10.append(", isDisplayImagePlaceholder=");
        return C17900vP.A0F(A10, this.A0B);
    }
}
