package X;

import android.os.Parcelable;

/* renamed from: X.8pK  reason: invalid class name */
public final class AnonymousClass8pK extends C20284AEs {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ CARD: ");
        A10.append(super.toString());
        return AnonymousClass000.A0y(" ]", A10);
    }
}
