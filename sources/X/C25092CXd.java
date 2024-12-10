package X;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CXd  reason: case insensitive filesystem */
public class C25092CXd {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C26543D3e A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final HashMap A0J;
    public final boolean A0K;

    public C25092CXd(C26543D3e d3e, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HashMap hashMap, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, boolean z) {
        this.A07 = j;
        this.A05 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A06 = j2;
        this.A08 = j3;
        this.A00 = i6;
        this.A09 = d3e;
        this.A0E = str;
        this.A0I = str2;
        this.A0C = str3;
        this.A0G = str4;
        this.A0F = str5;
        this.A0B = str6;
        this.A0A = str7;
        this.A0K = z;
        this.A0D = str8;
        this.A0J = hashMap;
        this.A0H = str9;
    }

    public String toString() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("colorTransfer", this.A02);
            A15.put("colorSpace", this.A01);
            A15.put("durationMs", this.A07);
            A15.put("widthPx", this.A05);
            A15.put("heightPx", this.A03);
            A15.put("rotationAngle", this.A04);
            A15.put("bitrate", this.A06);
            A15.put("fileSizeBytes", this.A08);
            A15.put("audioTrackBitRate", this.A00);
            A15.putOpt("sphericalMetadata", this.A09);
            A15.putOpt("comment", this.A0C);
            A15.putOpt("copyright", this.A0E);
            A15.putOpt("model", this.A0I);
            A15.putOpt("date", this.A0F);
            A15.putOpt("codecType", this.A0B);
            A15.putOpt("audioCodecType", this.A0A);
            A15.put("hasAudioTrack", this.A0K);
            A15.putOpt("composer", this.A0D);
            A15.putOpt("typeToMediaMetadataMap", this.A0J);
            A15.putOpt("mediaType", this.A0H);
        } catch (JSONException unused) {
        }
        return A15.toString();
    }
}
