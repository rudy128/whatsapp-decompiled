package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.AEg  reason: case insensitive filesystem */
public final class C20273AEg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final Object[] A06;
    public final Integer A07;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20273AEg) {
                C20273AEg aEg = (C20273AEg) obj;
                if (!C18070vi.A18(this.A04, aEg.A04) || !C18070vi.A18(this.A03, aEg.A03) || !C18070vi.A18(this.A01, aEg.A01) || !C18070vi.A18(this.A05, aEg.A05) || !C18070vi.A18(this.A06, aEg.A06) || this.A00 != aEg.A00 || !C18070vi.A18(this.A02, aEg.A02) || !C18070vi.A18(this.A07, aEg.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A04);
        C108995ce.A0r(parcel, this.A03);
        C108995ce.A0r(parcel, this.A01);
        parcel.writeString(this.A05);
        Object[] objArr = this.A06;
        if (objArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = objArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                parcel.writeValue(objArr[i2]);
            }
        }
        parcel.writeInt(this.A00);
        C108995ce.A0r(parcel, this.A02);
        C108995ce.A0r(parcel, this.A07);
    }

    public int hashCode() {
        int hashCode;
        int A002 = ((((((C17900vP.A00(this.A04) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A05)) * 31;
        Object[] objArr = this.A06;
        if (objArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(objArr);
        }
        return ((((((A002 + hashCode) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A07);
    }

    public C20273AEg(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Object[] objArr, int i) {
        this.A04 = str;
        this.A03 = num;
        this.A01 = num2;
        this.A05 = str2;
        this.A06 = objArr;
        this.A00 = i;
        this.A02 = num3;
        this.A07 = num4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageDialogState(dialogTag=");
        A10.append(this.A04);
        A10.append(", titleStringRes=");
        A10.append(this.A03);
        A10.append(", messageStringRes=");
        A10.append(this.A01);
        A10.append(", messageString=");
        A10.append(this.A05);
        A10.append(", messageResFormatArgs=");
        A10.append(Arrays.toString(this.A06));
        A10.append(", positiveActionStringRes=");
        A10.append(this.A00);
        A10.append(", negativeActionStringRes=");
        A10.append(this.A02);
        A10.append(", negativeActionColorRes=");
        return AnonymousClass001.A1F(this.A07, A10);
    }

    public C20273AEg() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Object[]) null, 2131899286);
    }
}
