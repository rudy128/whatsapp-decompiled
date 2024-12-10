package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class AEZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C194019r2 A01;
    public final C194029r3 A02;
    public final C194039r4 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A0B);
        C194039r4 r1 = this.A03;
        parcel.writeByte(r1.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r1.A00, parcel, i);
        parcel.writeInt(this.A00);
        C194019r2 r12 = this.A01;
        parcel.writeByte(r12.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r12.A00, parcel, i);
        C194029r3 r13 = this.A02;
        parcel.writeByte(r13.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r13.A00, parcel, i);
        parcel.writeInt(this.A0C ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AEZ(X.C194019r2 r15, X.C194029r3 r16, X.C194039r4 r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            r14 = this;
            java.lang.String r5 = ""
            r11 = 0
            r0 = 3
            r6 = r19
            r8 = r20
            X.C18070vi.A0g(r6, r0, r8)
            r0 = 7
            r10 = r21
            X.C18070vi.A0d(r10, r0)
            r13 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r12 = r22
            r7 = r5
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEZ.<init>(X.9r2, X.9r3, X.9r4, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public AEZ(C194019r2 r1, C194029r3 r2, C194039r4 r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, boolean z) {
        C18070vi.A0w(str, str2, str3, str4, str5);
        C18070vi.A0l(str6, str7);
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A06 = str5;
        this.A05 = str6;
        this.A04 = str7;
        this.A0B = list;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A0C = z;
    }
}
