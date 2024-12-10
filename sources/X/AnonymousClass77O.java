package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77O  reason: invalid class name */
public final class AnonymousClass77O implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass77Q A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final String A0A;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77O) {
                AnonymousClass77O r5 = (AnonymousClass77O) obj;
                if (!C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        AnonymousClass77Q r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        Iterator A0r = C108985cd.A0r(parcel, this.A09);
        while (A0r.hasNext()) {
            ((AnonymousClass77Q) A0r.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A07, C17890vO.A02(this.A08, C17890vO.A02(this.A06, C17890vO.A02(this.A05, C17890vO.A02(this.A02, C17890vO.A02(this.A04, C17890vO.A02(this.A01, C17880vN.A03(this.A0A))))))));
        return AnonymousClass000.A0O(this.A09, (C17890vO.A02(this.A03, A022) + AnonymousClass001.A0k(this.A00)) * 31);
    }

    public AnonymousClass77O(AnonymousClass77Q r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        C18070vi.A0w(str, str2, str3, str4, str5);
        C18070vi.A0q(str6, str7, str8);
        C18070vi.A0d(str9, 9);
        this.A0A = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A08 = str7;
        this.A07 = str8;
        this.A03 = str9;
        this.A00 = r2;
        this.A09 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarGetStickersEntity(id=");
        A10.append(this.A0A);
        A10.append(", revisionId=");
        A10.append(this.A01);
        A10.append(", stickerPackId=");
        A10.append(this.A04);
        A10.append(", stickerPackDescription=");
        A10.append(this.A02);
        A10.append(", stickerPackName=");
        A10.append(this.A05);
        A10.append(", stickerPackPublisher=");
        A10.append(this.A06);
        A10.append(", stickerPackTrayIconTemplateId=");
        A10.append(this.A08);
        A10.append(", stickerPackRecentsEmptyIconTemplateId=");
        A10.append(this.A07);
        A10.append(", stickerPackFavoritesEmptyIconTemplateId=");
        A10.append(this.A03);
        A10.append(", avatarStickerPackDynamicIcon=");
        A10.append(this.A00);
        A10.append(", stickers=");
        return AnonymousClass001.A1F(this.A09, A10);
    }
}
