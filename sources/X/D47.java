package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

public final class D47 implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(46);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Uri A04;
    public Uri A05;
    public C24259ByI A06;
    public Integer A07;
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
    public Map A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public byte[] A0S;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D47)) {
            return false;
        }
        D47 d47 = (D47) obj;
        if (this.A07 == d47.A07 && (((uri = this.A05) == (uri2 = d47.A05) || (uri != null && uri.equals(uri2))) && ((str = this.A0H) == (str2 = d47.A0H) || (str != null && str.equals(str2))))) {
            C24259ByI byI = this.A06;
            C24259ByI byI2 = d47.A06;
            if (byI != byI2) {
                return byI != null && byI.equals(byI2);
            }
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.D47] */
    public static D47 A00(Uri uri, Uri uri2, String str, Map map) {
        Integer num = AnonymousClass00R.A0C;
        C24259ByI byI = C24259ByI.GENERAL;
        ? obj = new Object();
        obj.A0R = false;
        obj.A05 = uri;
        obj.A0H = str;
        obj.A0A = null;
        obj.A0G = null;
        obj.A04 = uri2;
        obj.A0B = "WA_Player_Origin";
        obj.A0C = "WA_Player_SubOrigin";
        obj.A0D = "UNKNOWN";
        obj.A07 = num;
        obj.A02 = -1;
        obj.A03 = -1;
        obj.A01 = -1;
        obj.A0M = false;
        obj.A0Q = false;
        obj.A0F = null;
        obj.A0I = map;
        obj.A0O = false;
        obj.A0P = false;
        obj.A0J = false;
        obj.A0N = false;
        obj.A0K = false;
        obj.A0E = "AUDIO_VIDEO";
        obj.A0L = false;
        obj.A06 = byI;
        obj.A08 = null;
        obj.A00 = -1;
        obj.A09 = null;
        obj.A0S = null;
        return obj;
    }

    public boolean A01() {
        String str = this.A0G;
        if (str != null) {
            return str.startsWith("av01");
        }
        String str2 = this.A0A;
        if (str2 == null || !str2.contains("codecs=\"av01")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A07;
        int i = 0;
        int A0E2 = ((C72453Mb.A0E(num, CA5.A00(num)) * 31) + AnonymousClass8BW.A02(this.A0H)) * 31;
        Uri uri = this.A05;
        if (uri != null) {
            i = uri.hashCode();
        }
        return A0E2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(CA5.A00(this.A07));
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeString(this.A0F);
        Map map = this.A0I;
        parcel.writeInt(map.size());
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            parcel.writeString((String) BEB.A0W(parcel, A15));
        }
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeString(this.A06.name());
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A09);
        parcel.writeByteArray(this.A0S);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
    }

    public String toString() {
        String str;
        Object valueOf;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Type: ");
        Integer num = this.A07;
        if (num != null) {
            str = CA5.A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        String str2 = this.A0H;
        if (str2 != null) {
            A10.append("\n\tId: ");
            A10.append(str2);
        }
        Uri uri = this.A05;
        if (uri != null) {
            A10.append("\n\tUri: ");
            A10.append(uri);
        }
        String str3 = this.A0B;
        if (str3 != null) {
            A10.append("\n\tOrigin: ");
            A10.append(str3);
        }
        String str4 = this.A0C;
        if (str4 != null) {
            A10.append("\n\tSubOrigin: ");
            A10.append(str4);
        }
        String str5 = this.A0D;
        if (str5 != null) {
            A10.append("\n\tPrefetchOrigin: ");
            A10.append(str5);
        }
        A10.append("\n\tDashMPD: ");
        String str6 = this.A0A;
        if (str6 == null) {
            valueOf = "NULL";
        } else {
            valueOf = Integer.valueOf(str6.length());
        }
        A10.append(valueOf);
        String str7 = this.A0G;
        if (str7 != null) {
            A10.append("\n\tCodec: ");
            A10.append(str7);
        }
        Uri uri2 = this.A04;
        if (uri2 != null) {
            A10.append("\n\tSubtitle: ");
            A10.append(uri2);
        }
        A10.append("\n\tliveLatency: ");
        A10.append(this.A02);
        A10.append("\n\tliveLatencyTolerance: ");
        A10.append(this.A03);
        A10.append("\n\tisSpherical: ");
        A10.append(this.A0O);
        A10.append("\n\tisSponsored: ");
        A10.append(this.A0P);
        A10.append("\n\tisAdBreak: ");
        A10.append(this.A0J);
        A10.append("\n\tisLiveTraceEnabled: ");
        A10.append(this.A0N);
        A10.append("\n\trenderMode: ");
        A10.append(this.A0E);
        A10.append("\n\tisBroadcast: ");
        A10.append(this.A0L);
        A10.append("\n\tcontentType: ");
        A10.append(this.A06);
        A10.append("\n\tisAudioDataListenerEnabled: ");
        A10.append(this.A0K);
        A10.append("\n\tliveViewerCount: ");
        A10.append(this.A00);
        A10.append("\n\tuseConcatenatedMediaSource: ");
        return AnonymousClass3MY.A0r(A10, this.A0R);
    }
}
