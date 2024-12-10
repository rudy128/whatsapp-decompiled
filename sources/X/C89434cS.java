package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cS  reason: invalid class name and case insensitive filesystem */
public final class C89434cS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89434cS) {
                C89434cS r5 = (C89434cS) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17890vO.A02(this.A03, C17880vN.A03(this.A01))) + this.A00.hashCode();
    }

    public C89434cS(String str, String str2, String str3, String str4) {
        C18070vi.A0s(str, str2, str3, str4);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterIpViolationReportData(reportFbid=");
        A10.append(this.A01);
        A10.append(", reporterName=");
        A10.append(this.A03);
        A10.append(", reporterEmail=");
        A10.append(this.A02);
        A10.append(", appealFormUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
