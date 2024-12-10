package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.77R  reason: invalid class name */
public final class AnonymousClass77R implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public AnonymousClass72S A00;
    public final int A01;
    public final int A02;
    public final Point A03;
    public final Rect A04;
    public final Uri A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77R) {
                AnonymousClass77R r5 = (AnonymousClass77R) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A0F, r5.A0F) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A0E, r5.A0E) || !C18070vi.A18(this.A08, r5.A08) || this.A02 != r5.A02 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || this.A0H != r5.A0H || !C18070vi.A18(this.A03, r5.A03) || this.A01 != r5.A01 || this.A0G != r5.A0G || !C18070vi.A18(this.A0D, r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String absolutePath;
        String absolutePath2;
        String absolutePath3;
        String absolutePath4;
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeValue(this.A0A);
        File file = this.A09;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        parcel.writeString(absolutePath);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0C);
        File file2 = this.A07;
        if (file2 == null) {
            absolutePath2 = null;
        } else {
            absolutePath2 = file2.getAbsolutePath();
        }
        parcel.writeString(absolutePath2);
        parcel.writeString(this.A0E);
        File file3 = this.A08;
        if (file3 == null) {
            absolutePath3 = null;
        } else {
            absolutePath3 = file3.getAbsolutePath();
        }
        parcel.writeString(absolutePath3);
        parcel.writeInt(this.A02);
        File file4 = this.A06;
        if (file4 == null) {
            absolutePath4 = null;
        } else {
            absolutePath4 = file4.getAbsolutePath();
        }
        parcel.writeString(absolutePath4);
        parcel.writeParcelable(this.A04, i);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0D);
    }

    public AnonymousClass77R(Point point, Rect rect, Uri uri, File file, File file2, File file3, File file4, Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2) {
        Uri uri2 = uri;
        this.A05 = uri2;
        Integer num2 = num;
        this.A0A = num2;
        File file5 = file;
        this.A09 = file5;
        String str6 = str;
        this.A0B = str6;
        String str7 = str2;
        this.A0F = str7;
        String str8 = str3;
        this.A0C = str8;
        File file6 = file2;
        this.A07 = file6;
        String str9 = str4;
        this.A0E = str9;
        File file7 = file3;
        this.A08 = file7;
        int i3 = i;
        this.A02 = i3;
        File file8 = file4;
        this.A06 = file8;
        Rect rect2 = rect;
        this.A04 = rect2;
        boolean z3 = z;
        this.A0H = z3;
        Point point2 = point;
        this.A03 = point2;
        int i4 = i2;
        this.A01 = i4;
        boolean z4 = z2;
        this.A0G = z4;
        String str10 = str5;
        this.A0D = str10;
        C17960vV.A07(uri2);
        C18070vi.A0X(uri2);
        AnonymousClass72S r15 = new AnonymousClass72S(uri2);
        this.A00 = r15;
        r15.A0O(num2);
        this.A00.A0N(file5);
        this.A00.A0P(str6);
        this.A00.A0S(str7);
        this.A00.A0Q(str8);
        AnonymousClass72S r8 = this.A00;
        synchronized (r8) {
            r8.A09 = file6;
        }
        this.A00.A0R(str9);
        AnonymousClass72S r7 = this.A00;
        synchronized (r7) {
            r7.A0A = file7;
        }
        AnonymousClass72S r72 = this.A00;
        synchronized (r72) {
            r72.A01 = i3;
        }
        AnonymousClass72S r5 = this.A00;
        synchronized (r5) {
            r5.A08 = file8;
        }
        AnonymousClass72S r52 = this.A00;
        synchronized (r52) {
            r52.A04 = rect2;
        }
        AnonymousClass72S r53 = this.A00;
        synchronized (r53) {
            r53.A0P = z3;
        }
        this.A00.A0L(point2);
        this.A00.A0J(i4);
        AnonymousClass72S r3 = this.A00;
        synchronized (r3) {
            r3.A0N = z4;
        }
        AnonymousClass72S r1 = this.A00;
        synchronized (r1) {
            r1.A0H = str10;
        }
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((((AnonymousClass0DV.A00((((((((((((((((((((((AnonymousClass000.A0L(this.A05) + AnonymousClass001.A0k(this.A0A)) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + C17900vP.A00(this.A0B)) * 31) + C17900vP.A00(this.A0F)) * 31) + C17900vP.A00(this.A0C)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17900vP.A00(this.A0E)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + this.A02) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A04)) * 31, this.A0H) + AnonymousClass001.A0k(this.A03)) * 31) + this.A01) * 31, this.A0G) + C108955ca.A06(this.A0D);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaPreviewItemParcel(uri=");
        A10.append(this.A05);
        A10.append(", type=");
        A10.append(this.A0A);
        A10.append(", file=");
        A10.append(this.A09);
        A10.append(", caption=");
        A10.append(this.A0B);
        A10.append(", mentionsKey=");
        A10.append(this.A0F);
        A10.append(", doodle=");
        A10.append(this.A0C);
        A10.append(", doodleFile=");
        A10.append(this.A07);
        A10.append(", editState=");
        A10.append(this.A0E);
        A10.append(", editStateFile=");
        A10.append(this.A08);
        A10.append(", rotation=");
        A10.append(this.A02);
        A10.append(", cropFile=");
        A10.append(this.A06);
        A10.append(", cropRect=");
        A10.append(this.A04);
        A10.append(", isSendAsGif=");
        A10.append(this.A0H);
        A10.append(", trim=");
        A10.append(this.A03);
        A10.append(", filterId=");
        A10.append(this.A01);
        A10.append(", isMuteVideo=");
        A10.append(this.A0G);
        A10.append(", doodleTemplate=");
        return C17900vP.A0B(this.A0D, A10);
    }
}
