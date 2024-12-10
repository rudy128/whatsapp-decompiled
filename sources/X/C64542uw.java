package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: X.2uw  reason: invalid class name and case insensitive filesystem */
public final class C64542uw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(9);
    public int A00 = 255;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -2;
    public int A05 = -2;
    public Boolean A06 = AnonymousClass000.A0i();
    public CharSequence A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Locale A0H;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String charSequence;
        parcel.writeInt(this.A01);
        parcel.writeSerializable(this.A0A);
        parcel.writeSerializable(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        CharSequence charSequence2 = this.A07;
        if (charSequence2 == null) {
            charSequence = null;
        } else {
            charSequence = charSequence2.toString();
        }
        parcel.writeString(charSequence);
        parcel.writeInt(this.A03);
        parcel.writeSerializable(this.A0B);
        parcel.writeSerializable(this.A0E);
        parcel.writeSerializable(this.A0G);
        parcel.writeSerializable(this.A0D);
        parcel.writeSerializable(this.A0F);
        parcel.writeSerializable(this.A08);
        parcel.writeSerializable(this.A09);
        parcel.writeSerializable(this.A06);
        parcel.writeSerializable(this.A0H);
    }
}
