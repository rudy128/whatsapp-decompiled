package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cV  reason: invalid class name and case insensitive filesystem */
public final class C89464cV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final Intent A07;

    public C89464cV(Intent intent, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        C18070vi.A0d(intent, 1);
        this.A07 = intent;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = z;
        this.A00 = i3;
        this.A01 = i4;
        this.A02 = num;
        this.A03 = num2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89464cV) {
                C89464cV r5 = (C89464cV) obj;
                if (!(C18070vi.A18(this.A07, r5.A07) && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02) && C18070vi.A18(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A03;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    public int hashCode() {
        return ((((((AnonymousClass0DV.A00((((AnonymousClass000.A0L(this.A07) + this.A06) * 31) + this.A05) * 31, this.A04) + this.A00) * 31) + this.A01) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChoosableIntent(intent=");
        A10.append(this.A07);
        A10.append(", labelRes=");
        A10.append(this.A06);
        A10.append(", iconRes=");
        A10.append(this.A05);
        A10.append(", isShowInToolbar=");
        A10.append(this.A04);
        A10.append(", itemId=");
        A10.append(this.A00);
        A10.append(", showAsActionFlag=");
        A10.append(this.A01);
        A10.append(", drawableTintColor=");
        A10.append(this.A02);
        A10.append(", onClickAvatarEditEvent=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
