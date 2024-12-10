package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77S  reason: invalid class name */
public final class AnonymousClass77S implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C1418477e A01;

    public AnonymousClass77S(C1418477e r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public final Object A00(String str) {
        C18070vi.A0d(str, 0);
        Number number = (Number) C20017A3j.A00.get();
        int i = this.A00;
        if (number == null || number.intValue() != i) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid policyId =");
            A10.append(number);
            throw new C147337St(AnonymousClass000.A0y(". All calls to unwrapSensitiveValueFor() should be enclosed within PolicyZone enclosure and specified with the same policyid that this object was wrapped with", A10));
        }
        C126256cR r0 = (C126256cR) AnonymousClass000.A0w(C137666vp.A00, i);
        if (r0 != null && r0.A00.contains(str)) {
            return this.A01.A00;
        }
        throw new C147337St(AnonymousClass001.A1H("Purpose policy does not allow data to be extracted for purpose ", str, AnonymousClass000.A10()));
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.purpose.PurposeEnforcedObject<*>");
                AnonymousClass77S r5 = (AnonymousClass77S) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        return "***";
    }
}
