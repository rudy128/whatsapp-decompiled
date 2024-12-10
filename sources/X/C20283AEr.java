package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AEr  reason: case insensitive filesystem */
public final class C20283AEr implements Parcelable {
    public static final AnonymousClass3MT A0H = new C21554Am1(-90.0d, 90.0d);
    public static final AnonymousClass3MT A0I = new C21554Am1(-180.0d, 180.0d);
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public long A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final String A0C;
    public final List A0D;
    public final double A0E;
    public final double A0F;
    public transient Location A0G;

    public C20283AEr(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, double d, double d2, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C18070vi.A0d(str, 5);
        this.A0B = i;
        this.A0E = d;
        this.A0F = d2;
        this.A0A = i2;
        this.A0C = str;
        this.A0D = list;
        this.A03 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A00 = i3;
        this.A02 = num;
        this.A04 = str5;
        this.A06 = z;
        this.A01 = j;
        this.A09 = z2;
        this.A07 = str6;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20283AEr) {
                C20283AEr aEr = (C20283AEr) obj;
                if (this.A0B != aEr.A0B || Double.compare(this.A0E, aEr.A0E) != 0 || Double.compare(this.A0F, aEr.A0F) != 0 || this.A0A != aEr.A0A || !C18070vi.A18(this.A0C, aEr.A0C) || !C18070vi.A18(this.A0D, aEr.A0D) || !C18070vi.A18(this.A03, aEr.A03) || !C18070vi.A18(this.A05, aEr.A05) || !C18070vi.A18(this.A08, aEr.A08) || this.A00 != aEr.A00 || !C18070vi.A18(this.A02, aEr.A02) || !C18070vi.A18(this.A04, aEr.A04) || this.A06 != aEr.A06 || this.A01 != aEr.A01 || this.A09 != aEr.A09 || !C18070vi.A18(this.A07, aEr.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A0B);
        parcel.writeDouble(this.A0E);
        parcel.writeDouble(this.A0F);
        parcel.writeInt(this.A0A);
        parcel.writeString(this.A0C);
        Iterator A0r = C108985cd.A0r(parcel, this.A0D);
        while (A0r.hasNext()) {
            ((PlaceInfo) A0r.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        int i2 = 0;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A07);
    }

    public final Location A00() {
        double d = this.A0E;
        if (d == Double.MAX_VALUE) {
            return null;
        }
        double d2 = this.A0F;
        if (d2 == Double.MAX_VALUE) {
            return null;
        }
        Location location = this.A0G;
        if (location == null) {
            location = new Location("");
            if (A0H.BFl(Double.valueOf(d))) {
                location.setLatitude(d);
            }
            if (A0I.BFl(Double.valueOf(d2))) {
                location.setLongitude(d2);
            }
            this.A0G = location;
        }
        return location;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A01, AnonymousClass0DV.A00((((((((((((AnonymousClass000.A0N(this.A0D, C17890vO.A02(this.A0C, (AnonymousClass8BT.A00(AnonymousClass8BT.A00(this.A0B * 31, this.A0E), this.A0F) + this.A0A) * 31)) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A08)) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A04)) * 31, this.A06)), this.A09) + C108955ca.A06(this.A07);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlaceList(source=");
        A10.append(this.A0B);
        A10.append(", lat=");
        A10.append(this.A0E);
        A10.append(", lon=");
        A10.append(this.A0F);
        A10.append(", radius=");
        A10.append(this.A0A);
        A10.append(", query=");
        A10.append(this.A0C);
        A10.append(", places=");
        A10.append(this.A0D);
        A10.append(", htmlAttributions=");
        A10.append(this.A03);
        A10.append(", sessionId=");
        A10.append(this.A05);
        A10.append(", requestId=");
        A10.append(this.A08);
        A10.append(", requestIndex=");
        A10.append(this.A00);
        A10.append(", responseCode=");
        A10.append(this.A02);
        A10.append(", responseCodeDescr=");
        A10.append(this.A04);
        A10.append(", isCached=");
        A10.append(this.A06);
        A10.append(", responseTime=");
        A10.append(this.A01);
        A10.append(", hasMoreResults=");
        A10.append(this.A09);
        A10.append(", locationNextPageToken=");
        return C17900vP.A0B(this.A07, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20283AEr(android.location.Location r21, java.lang.String r22, int r23, int r24) {
        /*
            r20 = this;
            double r9 = r21.getLatitude()
            double r11 = r21.getLongitude()
            r1 = 0
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            r15 = 0
            r16 = 0
            r0 = r20
            r2 = r22
            r13 = r23
            r14 = r24
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r18 = r15
            r19 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20283AEr.<init>(android.location.Location, java.lang.String, int, int):void");
    }

    public C20283AEr() {
        this((Integer) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, AnonymousClass000.A13(), Double.MAX_VALUE, Double.MAX_VALUE, 0, 0, 0, 0, false, false);
    }
}
