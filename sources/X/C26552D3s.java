package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;

/* renamed from: X.D3s  reason: case insensitive filesystem */
public final class C26552D3s implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(35);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public CNR A07;
    public C26557D3x A08;
    public Buffer A09;
    public File A0A;
    public Object A0B;
    public Object A0C;
    public String A0D;
    public String A0E;
    public Buffer[] A0F;
    public volatile C27242DaM A0G;

    public int describeContents() {
        return 0;
    }

    public C26552D3s(C26552D3s d3s, int i) {
        C26552D3s d3s2 = d3s;
        long j = d3s2.A06;
        String str = d3s2.A0D;
        CNR cnr = d3s2.A07;
        int i2 = d3s2.A01;
        Object obj = d3s2.A0C;
        Object obj2 = d3s2.A0B;
        long j2 = d3s2.A05;
        int i3 = d3s2.A02;
        int i4 = d3s2.A03;
        int i5 = d3s2.A04;
        C26557D3x d3x = d3s2.A08;
        Buffer buffer = d3s2.A09;
        Buffer[] bufferArr = d3s2.A0F;
        File file = d3s2.A0A;
        String str2 = d3s2.A0E;
        this.A06 = j;
        this.A0D = str;
        this.A07 = cnr;
        this.A01 = i2;
        this.A0C = obj;
        this.A0B = obj2;
        this.A05 = j2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i;
        this.A04 = i5;
        this.A08 = d3x;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        this.A08.writeToParcel(parcel, i);
    }

    public C26552D3s() {
    }
}
