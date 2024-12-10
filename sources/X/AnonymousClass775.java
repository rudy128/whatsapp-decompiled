package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.775  reason: invalid class name */
public final class AnonymousClass775 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public Bitmap A00;
    public String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass775) {
                AnonymousClass775 r5 = (AnonymousClass775) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A01) * 31) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public AnonymousClass775(Bitmap bitmap, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineData(imageBase64=");
        A10.append(this.A01);
        A10.append(", imageId=");
        A10.append(this.A02);
        A10.append(", imageBitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
