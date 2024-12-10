package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.772  reason: invalid class name */
public final class AnonymousClass772 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final AnonymousClass6R7 A01;

    public AnonymousClass772(AnonymousClass6R7 r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass772) {
                AnonymousClass772 r5 = (AnonymousClass772) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01.name());
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetaAiSearchEntry(metaAISessionSource=");
        A10.append(this.A01);
        A10.append(", referrerAction=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
