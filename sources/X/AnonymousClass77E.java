package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77E  reason: invalid class name */
public final class AnonymousClass77E implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AnonymousClass775 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass77E(AnonymousClass775 r2, String str, String str2, String str3, String str4) {
        C18070vi.A0d(str, 1);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77E) {
                AnonymousClass77E r5 = (AnonymousClass77E) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        AnonymousClass775 r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((((((C17880vN.A03(this.A03) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A04)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetaAISearchSuggestion(text=");
        A10.append(this.A03);
        A10.append(", query=");
        A10.append(this.A01);
        A10.append(", sessionId=");
        A10.append(this.A02);
        A10.append(", context=");
        A10.append(this.A04);
        A10.append(", imagineData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
