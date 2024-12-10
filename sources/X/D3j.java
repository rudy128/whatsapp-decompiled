package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D3j implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public int A09 = 0;
    public int A0A = 0;
    public long A0B = 0;
    public long A0C = 0;
    public long A0D = 0;
    public long A0E = 0;
    public long A0F = 0;
    public long A0G = 0;
    public long A0H = 0;
    public long A0I = 0;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D3j) {
                D3j d3j = (D3j) obj;
                if (!(this.A06 == d3j.A06 && this.A0I == d3j.A0I && this.A03 == d3j.A03 && this.A09 == d3j.A09 && this.A00 == d3j.A00 && this.A04 == d3j.A04 && this.A07 == d3j.A07 && this.A0A == d3j.A0A && this.A01 == d3j.A01 && this.A02 == d3j.A02 && this.A05 == d3j.A05 && this.A08 == d3j.A08 && this.A0D == d3j.A0D && this.A0B == d3j.A0B && this.A0E == d3j.A0E && this.A0F == d3j.A0F && this.A0H == d3j.A0H && this.A0C == d3j.A0C && this.A0G == d3j.A0G)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A06);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A08);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A0F);
        parcel.writeLong(this.A0H);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A0G);
    }

    public int hashCode() {
        int i = this.A06 * 31;
        return AnonymousClass001.A0J(this.A0G, AnonymousClass001.A0K(this.A0C, AnonymousClass001.A0K(this.A0H, AnonymousClass001.A0K(this.A0F, AnonymousClass001.A0K(this.A0E, AnonymousClass001.A0K(this.A0B, AnonymousClass001.A0K(this.A0D, (((((((((((((((((((AnonymousClass001.A0K(this.A0I, i) + this.A03) * 31) + this.A09) * 31) + this.A00) * 31) + this.A04) * 31) + this.A07) * 31) + this.A0A) * 31) + this.A01) * 31) + this.A02) * 31) + this.A05) * 31) + this.A08) * 31)))))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatMemory(numberOfMessages=");
        A10.append(this.A06);
        A10.append(", overallSize=");
        A10.append(this.A0I);
        A10.append(", numberOfGifs=");
        A10.append(this.A03);
        A10.append(", numberOfTexts=");
        A10.append(this.A09);
        A10.append(", numberOfAudios=");
        A10.append(this.A00);
        A10.append(", numberOfImages=");
        A10.append(this.A04);
        A10.append(", numberOfPushToVideos=");
        A10.append(this.A07);
        A10.append(", numberOfVideos=");
        A10.append(this.A0A);
        A10.append(", numberOfContacts=");
        A10.append(this.A01);
        A10.append(", numberOfDocuments=");
        A10.append(this.A02);
        A10.append(", numberOfLocations=");
        A10.append(this.A05);
        A10.append(", numberOfStickers=");
        A10.append(this.A08);
        A10.append(", mediaGifBytes=");
        A10.append(this.A0D);
        A10.append(", mediaAudioBytes=");
        A10.append(this.A0B);
        A10.append(", mediaImageBytes=");
        A10.append(this.A0E);
        A10.append(", mediaPushToVideoBytes=");
        A10.append(this.A0F);
        A10.append(", mediaVideoBytes=");
        A10.append(this.A0H);
        A10.append(", mediaDocumentBytes=");
        A10.append(this.A0C);
        A10.append(", mediaStickerBytes=");
        return C17900vP.A0E(A10, this.A0G);
    }
}
