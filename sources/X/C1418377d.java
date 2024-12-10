package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.77d  reason: invalid class name and case insensitive filesystem */
public final class C1418377d implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass73B A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public String[] A0R;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeStringArray(this.A0R);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0O ? 1 : 0);
        Integer num = this.A05;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public final boolean A02() {
        if (this.A0Q || "application/was".equals(this.A0E)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Sticker{");
        stringBuffer.append(", url='");
        stringBuffer.append(this.A0I);
        stringBuffer.append('\'');
        stringBuffer.append(", mimeType='");
        stringBuffer.append(this.A0E);
        stringBuffer.append('\'');
        stringBuffer.append(", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", metadata=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", saltedFileHash='");
        stringBuffer.append(this.A0G);
        stringBuffer.append('\'');
        stringBuffer.append(", fileSize=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isLottie=");
        stringBuffer.append(A02());
        stringBuffer.append('}');
        return C18070vi.A0H(stringBuffer);
    }

    public C1418377d(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String[] strArr, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0F = str;
        this.A0A = str2;
        this.A0C = str3;
        this.A0D = str4;
        this.A0E = str5;
        this.A02 = i;
        this.A03 = i2;
        this.A0H = str6;
        this.A09 = str7;
        this.A0P = z;
        this.A0N = z2;
        this.A0K = z3;
        this.A0L = z4;
        this.A0M = z5;
        this.A0R = strArr;
        this.A0J = z6;
        this.A0Q = z7;
        this.A07 = str8;
        this.A00 = i3;
        this.A0I = str9;
        this.A08 = str10;
        this.A0B = str11;
        this.A06 = str12;
        this.A0O = z8;
        this.A05 = num;
    }

    public final C1418377d A00() {
        C1418377d A0a = C108985cd.A0a();
        A0a.A0F = this.A0F;
        A0a.A0I = this.A0I;
        A0a.A08 = this.A08;
        A0a.A00 = this.A00;
        A0a.A03 = this.A03;
        A0a.A02 = this.A02;
        A0a.A04 = this.A04;
        A0a.A09 = this.A09;
        A0a.A0P = this.A0P;
        A0a.A0C = this.A0C;
        A0a.A0N = this.A0N;
        A0a.A0J = this.A0J;
        A0a.A0Q = A02();
        A0a.A07 = this.A07;
        A0a.A0A = this.A0A;
        A0a.A0D = this.A0D;
        A0a.A0E = this.A0E;
        A0a.A0K = this.A0K;
        A0a.A0L = this.A0L;
        A0a.A0M = this.A0M;
        A0a.A0R = this.A0R;
        A0a.A06 = this.A06;
        String str = this.A0B;
        if (str != null) {
            int i = this.A01;
            A0a.A0B = str;
            A0a.A01 = i;
        }
        return A0a;
    }

    public final Integer A01() {
        if (A02()) {
            return AnonymousClass00R.A01;
        }
        return AnonymousClass00R.A00;
    }

    public C1418377d() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
    }
}
