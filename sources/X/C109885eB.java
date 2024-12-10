package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.5eB  reason: invalid class name and case insensitive filesystem */
public final class C109885eB extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Parcelable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109885eB(Parcelable parcelable, int i) {
        super(parcelable);
        C18070vi.A0d(parcelable, 1);
        this.A01 = parcelable;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109885eB) {
                C109885eB r5 = (C109885eB) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PagerSlidingTabStripSavedState(state=");
        A10.append(this.A01);
        A10.append(", currentPosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
