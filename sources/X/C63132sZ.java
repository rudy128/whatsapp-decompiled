package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sZ  reason: invalid class name and case insensitive filesystem */
public class C63132sZ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final long A0C;
    public final boolean A0D;

    public C63132sZ(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = j5;
        this.A02 = j6;
        this.A03 = j7;
        this.A06 = j8;
        this.A08 = j9;
        this.A0C = j10;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }

    public static C63132sZ A00(String str) {
        try {
            JSONObject A16 = C17880vN.A16(str);
            return new C63132sZ(A16.optInt("mediaType"), A16.optInt("transferRadio"), A16.optInt("mediaTransferOrigin"), A16.optLong("bytesSent"), A16.optLong("bytesReceived"), A16.optLong("countMessageSent"), A16.optLong("countMessageReceived"), A16.optLong("countUploaded"), A16.optLong("countDownloaded"), A16.optLong("countForward"), A16.optLong("countShared"), A16.optLong("countViewed"), A16.optLong("transferDate"), A16.optBoolean("isAutoDownload"));
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public C63132sZ(int i, int i2, int i3, long j, boolean z) {
        this.A0C = j;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }
}
