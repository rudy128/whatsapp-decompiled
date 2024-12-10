package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4ca  reason: invalid class name and case insensitive filesystem */
public final class C89514ca implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89514ca) {
                C89514ca r5 = (C89514ca) obj;
                if (!(this.A00 == r5.A00 && C18070vi.A18(this.A03, r5.A03) && this.A02 == r5.A02 && C18070vi.A18(this.A04, r5.A04) && this.A05 == r5.A05 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(A01(this.A02));
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(A00(this.A01));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89514ca(java.lang.String r8, java.lang.String r9, int r10, int r11, int r12, boolean r13) {
        /*
            r7 = this;
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r2 = r1
            r0 = 0
            if (r11 == r0) goto L_0x0017
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            r0 = 1
            if (r11 == r0) goto L_0x0017
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 2
            if (r11 == r0) goto L_0x0017
            java.lang.String r0 = "invalid integrator status"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0017:
            r0 = 0
            if (r12 == r0) goto L_0x002b
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            r0 = 1
            if (r12 == r0) goto L_0x002b
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            r0 = 2
            if (r12 == r0) goto L_0x002b
            java.lang.String r0 = "invalid integrator identifier type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x002b:
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r13
            r0.<init>((java.lang.Integer) r1, (java.lang.Integer) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89514ca.<init>(java.lang.String, java.lang.String, int, int, int, boolean):void");
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A03, this.A00 * 31);
        Integer num = this.A02;
        int A002 = AnonymousClass0DV.A00(C17890vO.A02(this.A04, (A022 + C72453Mb.A0E(num, A01(num))) * 31), this.A05);
        Integer num2 = this.A01;
        return A002 + C72453Mb.A0E(num2, A00(num2));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "USERNAME";
            case 1:
                return "PHONE";
            default:
                return "EMAIL";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ONBOARDING";
            case 1:
                return "ACTIVE";
            default:
                return "REMOVED";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IntegratorInfo(id=");
        A10.append(this.A00);
        A10.append(", displayName=");
        A10.append(this.A03);
        A10.append(", status=");
        A10.append(A01(this.A02));
        A10.append(", iconDirectPath=");
        A10.append(this.A04);
        A10.append(", optedIn=");
        A10.append(this.A05);
        A10.append(", identifierType=");
        return C17900vP.A0B(A00(this.A01), A10);
    }

    public C89514ca(Integer num, Integer num2, String str, String str2, int i, boolean z) {
        C18070vi.A0f(str, 2, str2);
        this.A00 = i;
        this.A03 = str;
        this.A02 = num;
        this.A04 = str2;
        this.A05 = z;
        this.A01 = num2;
    }
}
