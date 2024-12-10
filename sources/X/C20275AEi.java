package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.AEi  reason: case insensitive filesystem */
public final class C20275AEi implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final Long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeByteArray(this.A09);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        Long l2 = this.A01;
        if (l2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l2.longValue());
    }

    public final boolean A00() {
        String str;
        String str2;
        String str3 = this.A03;
        if (str3 == null || str3.length() == 0 || ((((str = this.A06) == null || str.length() == 0) && ((str2 = this.A05) == null || str2.length() == 0)) || this.A09 == null || this.A01 == null)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = X.C108975cc.A0R(r4)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.content.DocumentMetadata"
            X.C18070vi.A0z(r4, r0)
            X.AEi r4 = (X.C20275AEi) r4
            java.lang.String r1 = r3.A08
            java.lang.String r0 = r4.A08
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A03
            java.lang.String r0 = r4.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            byte[] r1 = r3.A09
            byte[] r0 = r4.A09
            if (r1 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            return r2
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return r2
        L_0x0040:
            java.lang.Long r1 = r3.A02
            java.lang.Long r0 = r4.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A05
            java.lang.String r0 = r4.A05
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A07
            java.lang.String r0 = r4.A07
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A04
            java.lang.String r0 = r4.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r4.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003c
            java.lang.Long r1 = r3.A01
            java.lang.Long r0 = r4.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20275AEi.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int A022 = ((AnonymousClass8BW.A02(this.A08) * 31) + AnonymousClass8BW.A02(this.A03)) * 31;
        byte[] bArr = this.A09;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int A0l = (((((((((((((A022 + i) * 31) + AnonymousClass001.A0l(this.A02)) * 31) + AnonymousClass8BW.A02(this.A06)) * 31) + AnonymousClass8BW.A02(this.A05)) * 31) + AnonymousClass8BW.A02(this.A07)) * 31) + AnonymousClass8BW.A02(this.A04)) * 31) + AnonymousClass8BW.A02(this.A00)) * 31;
        Long l = this.A01;
        if (l != null) {
            i2 = l.hashCode();
        }
        return A0l + i2;
    }

    public C20275AEi(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, byte[] bArr) {
        this.A08 = str;
        this.A03 = str2;
        this.A09 = bArr;
        this.A02 = l;
        this.A06 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A00 = str7;
        this.A01 = l2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DocumentMetadata(url=");
        A10.append(this.A08);
        A10.append(", directPath=");
        A10.append(this.A03);
        A10.append(", mediaKey=");
        C17890vO.A1C(A10, this.A09);
        A10.append(", mediaKeyTimestampMs=");
        A10.append(this.A02);
        A10.append(", mediaHash=");
        A10.append(this.A06);
        A10.append(", mediaEncHash=");
        A10.append(this.A05);
        A10.append(", mimeType=");
        A10.append(this.A07);
        A10.append(", fileName=");
        A10.append(this.A04);
        A10.append(", filePath=");
        A10.append(this.A00);
        A10.append(", fileLength=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C20275AEi() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (byte[]) null);
    }
}
