package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77X  reason: invalid class name */
public final class AnonymousClass77X implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77X) {
                AnonymousClass77X r5 = (AnonymousClass77X) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A00), this.A01), this.A03), this.A04);
    }

    public AnonymousClass77X(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A03 = z4;
        this.A04 = z5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CapturedMediaAppliedEffects(isFunEffectApplied=");
        A10.append(this.A02);
        A10.append(", isBackgroundEffectApplied=");
        A10.append(this.A00);
        A10.append(", isFilterEffectApplied=");
        A10.append(this.A01);
        A10.append(", isLowLightEffectApplied=");
        A10.append(this.A03);
        A10.append(", isTouchUpEffectApplied=");
        return C17900vP.A0F(A10, this.A04);
    }

    public AnonymousClass77X() {
        this(false, false, false, false, false);
    }
}
