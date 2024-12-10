package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7PZ  reason: invalid class name */
public final class AnonymousClass7PZ implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public D3j A00;
    public final String A01;
    public transient AnonymousClass1BI A02;

    /* renamed from: A00 */
    public int compareTo(AnonymousClass7PZ r7) {
        C18070vi.A0d(r7, 0);
        D3j d3j = r7.A00;
        long j = d3j.A0I;
        D3j d3j2 = this.A00;
        int signum = (int) Math.signum((float) (j - d3j2.A0I));
        if (signum == 0) {
            return (int) Math.signum((float) (d3j.A06 - d3j2.A06));
        }
        return signum;
    }

    public final synchronized AnonymousClass1BI A01() {
        AnonymousClass1BI r0;
        r0 = this.A02;
        if (r0 == null) {
            C22931Dv r02 = AnonymousClass1BI.A00;
            r0 = C22931Dv.A01(this.A01);
            this.A02 = r0;
        }
        return r0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7PZ) {
                AnonymousClass7PZ r5 = (AnonymousClass7PZ) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)) + AnonymousClass001.A0k(this.A02);
    }

    public AnonymousClass7PZ(D3j d3j, AnonymousClass1BI r2, String str) {
        C18070vi.A0j(d3j, str);
        this.A00 = d3j;
        this.A01 = str;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StorageUsageModel(chatMemory=");
        A10.append(this.A00);
        A10.append(", contactRawJid=");
        A10.append(this.A01);
        A10.append(", contactJid=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
