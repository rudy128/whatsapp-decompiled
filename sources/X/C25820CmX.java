package X;

import android.media.MediaFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CmX  reason: case insensitive filesystem */
public class C25820CmX {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = 0;
    public long A0A = -1;
    public long A0B = -1;
    public long A0C = 0;
    public MediaFormat A0D = null;
    public CVG A0E;
    public String A0F = null;
    public String A0G = null;
    public String A0H = null;
    public String A0I = null;
    public String A0J = null;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25820CmX cmX = (C25820CmX) obj;
            if (!(this.A0R == cmX.A0R && this.A0T == cmX.A0T && this.A0N == cmX.A0N && this.A0O == cmX.A0O && this.A0P == cmX.A0P && this.A0Q == cmX.A0Q && this.A0U == cmX.A0U && this.A0V == cmX.A0V && this.A03 == cmX.A03 && this.A05 == cmX.A05 && this.A0B == cmX.A0B && this.A08 == cmX.A08 && this.A07 == cmX.A07 && this.A06 == cmX.A06 && this.A0A == cmX.A0A && this.A0S == cmX.A0S && this.A02 == cmX.A02 && this.A00 == cmX.A00 && this.A0W == cmX.A0W && this.A0C == cmX.A0C && this.A0X == cmX.A0X && A00(this.A0I, cmX.A0I) && A00(this.A0H, cmX.A0H) && A00(this.A0G, cmX.A0G) && A00(this.A0F, cmX.A0F) && A00(this.A0J, cmX.A0J) && A00(this.A0K, cmX.A0K) && A00(this.A0M, cmX.A0M) && A00(this.A0L, cmX.A0L) && this.A09 == cmX.A09 && A00(this.A0D, cmX.A0D) && this.A01 == cmX.A01)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[40];
        AnonymousClass000.A1N(objArr, this.A0R);
        BE8.A1O(objArr, this.A0T);
        AnonymousClass8BU.A1Q(objArr, this.A0N);
        BE8.A1P(objArr, this.A0O);
        BE8.A1Q(objArr, this.A0P);
        objArr[5] = Boolean.valueOf(this.A0Q);
        objArr[6] = AnonymousClass000.A0h();
        objArr[7] = Boolean.valueOf(this.A0U);
        objArr[8] = Boolean.valueOf(this.A0V);
        Long A0a = AnonymousClass8BV.A0a();
        objArr[9] = A0a;
        objArr[10] = A0a;
        objArr[11] = A0a;
        objArr[12] = A0a;
        objArr[13] = A0a;
        objArr[14] = A0a;
        objArr[15] = Long.valueOf(this.A03);
        objArr[16] = Long.valueOf(this.A05);
        objArr[17] = Long.valueOf(this.A0B);
        objArr[18] = Long.valueOf(this.A08);
        objArr[19] = Long.valueOf(this.A07);
        objArr[20] = Long.valueOf(this.A06);
        objArr[21] = Long.valueOf(this.A0A);
        objArr[22] = Boolean.valueOf(this.A0S);
        objArr[23] = Long.valueOf(this.A02);
        objArr[24] = this.A0I;
        objArr[25] = this.A0H;
        objArr[26] = this.A0G;
        objArr[27] = this.A0F;
        objArr[28] = this.A0J;
        objArr[29] = Integer.valueOf(this.A00);
        objArr[30] = Boolean.valueOf(this.A0W);
        objArr[31] = Long.valueOf(this.A0C);
        objArr[32] = this.A0K;
        objArr[33] = this.A0M;
        objArr[34] = this.A0L;
        objArr[35] = Boolean.valueOf(this.A0X);
        objArr[36] = A0a;
        objArr[37] = Long.valueOf(this.A09);
        Object obj = this.A0D;
        if (obj == null) {
            obj = "noOutputFormat";
        }
        objArr[38] = obj;
        return AnonymousClass000.A0P(Long.valueOf(this.A01), objArr, 39);
    }

    public String toString() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("isAudioTrackPresent", this.A0R);
            A15.put("isInitComplete", this.A0T);
            A15.put("codecMuxerAudioTrackIndexIsSet", this.A0N);
            A15.put("codecMuxerVideoTrackIndexIsSet", this.A0O);
            A15.put("gotAudioDataBuffer", this.A0P);
            A15.put("gotVideoDataBuffer", this.A0Q);
            A15.put("isAudioVideoTrackReset", false);
            A15.put("startTimeUs", -1);
            A15.put("endTimeUs", -1);
            A15.put("adjustedEndTimeUs", -1);
            A15.put("syncStartTimeUs", -1);
            A15.put("firstVideoSampleTimeUs", -1);
            A15.put("lastVideoSampleTimeUs", -1);
            A15.put("firstAudioSampleTimeUs", this.A03);
            A15.put("lastAudioSampleTimeUs", this.A05);
            A15.put("numVideoSamplesMuxed", this.A0B);
            A15.put("numAudioSamplesMuxed", this.A08);
            A15.put("numAudioSamplesErrored", this.A07);
            A15.put("lastVideoSampleMuxedUs", this.A06);
            A15.put("lastAudioSampleMuxedUs", this.A04);
            A15.put("numVideoSamplesErrored", this.A0A);
            A15.put("isEncoderCompleted", this.A0S);
            A15.put("bytesInTranscodeFile", this.A02);
            A15.putOpt("muxerName", this.A0I);
            A15.putOpt("encoderName", this.A0H);
            A15.putOpt("decoderName", this.A0G);
            A15.putOpt("profileName", this.A0J);
            A15.put("targetBitRate", this.A00);
            A15.put("isNonIncrementalTimestamp", this.A0W);
            A15.put("timestampDifference", this.A0C);
            A15.putOpt("videoTranscodeInnerException", this.A0K);
            A15.putOpt("videoTranscodeInnerExceptionCause", this.A0M);
            A15.putOpt("videoTranscodeInnerExceptionCallStack", this.A0L);
            A15.put("isPassThroughTranscoderUsed", this.A0X);
            A15.put("isMediaCompositionInput", this.A0U);
            A15.put("framePtsUs", -1);
            A15.put("numOfRetriesToSucceedEncoder", this.A09);
            A15.put("audioTranscodeDurationNs", this.A01);
        } catch (JSONException unused) {
        }
        return A15.toString();
    }
}
