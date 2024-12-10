package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3f  reason: case insensitive filesystem */
public final class C26544D3f implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C26542D3d A00;
    public final C26542D3d A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26544D3f) {
                C26544D3f d3f = (C26544D3f) obj;
                if (!C18070vi.A18(this.A00, d3f.A00) || !C18070vi.A18(this.A01, d3f.A01) || this.A02 != d3f.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)), this.A02);
    }

    public C26544D3f(C26542D3d d3d, C26542D3d d3d2, boolean z) {
        C18070vi.A0j(d3d, d3d2);
        this.A00 = d3d;
        this.A01 = d3d2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FixedSizes(photoSize=");
        A10.append(this.A00);
        A10.append(", previewSize=");
        A10.append(this.A01);
        A10.append(", autoCapture=");
        return C17900vP.A0F(A10, this.A02);
    }
}
