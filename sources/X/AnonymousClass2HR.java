package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HR  reason: invalid class name */
public final class AnonymousClass2HR extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A07);
        r3.CHf(3, this.A08);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A09);
        r3.CHf(6, this.A01);
        r3.CHf(8, this.A0A);
        r3.CHf(9, this.A0B);
        r3.CHf(10, this.A0C);
        r3.CHf(11, this.A02);
        r3.CHf(12, this.A03);
        r3.CHf(13, this.A0D);
        r3.CHf(14, this.A0E);
        r3.CHf(15, this.A04);
        r3.CHf(16, this.A0F);
        r3.CHf(17, this.A0G);
        r3.CHf(18, this.A0H);
        r3.CHf(19, this.A0I);
        r3.CHf(20, this.A0J);
        r3.CHf(21, this.A0K);
        r3.CHf(22, this.A0L);
        r3.CHf(23, this.A05);
        r3.CHf(24, this.A0M);
    }

    public AnonymousClass2HR() {
        super(4646, new C18180vt(1, 20, 1000, false), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A06, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A09, A13), this.A01);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(8, this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A02, A13), this.A03, A13), this.A0D, A13), this.A0E, A13), this.A04, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A0L, A13), this.A05, A13), this.A0M);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWamediaMp4opsEvent {");
        AnonymousClass186.A00(this.A06, "wamediaMp4opsAudioStreamAverageBitrateKbps", A10);
        AnonymousClass186.A00(this.A07, "wamediaMp4opsAudioStreamNumChannels", A10);
        AnonymousClass186.A00(this.A08, "wamediaMp4opsAudioStreamSamplingRate", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "wamediaMp4opsAudioStreamSubtype", A10);
        AnonymousClass186.A00(this.A09, "wamediaMp4opsAudioStreamTrackId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "wamediaMp4opsAudioStreamType", A10);
        AnonymousClass186.A00(this.A0A, "wamediaMp4opsErrorTolerance", A10);
        AnonymousClass186.A00(this.A0B, "wamediaMp4opsFileSize", A10);
        AnonymousClass186.A00(this.A0C, "wamediaMp4opsFileSizeOut", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "wamediaMp4opsFileType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "wamediaMp4opsImpl", A10);
        AnonymousClass186.A00(this.A0D, "wamediaMp4opsReturnValue", A10);
        AnonymousClass186.A00(this.A0E, "wamediaMp4opsTimeElapsedNs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "wamediaMp4opsType", A10);
        AnonymousClass186.A00(this.A0F, "wamediaMp4opsVideoStreamAverageBitrateKpbs", A10);
        AnonymousClass186.A00(this.A0G, "wamediaMp4opsVideoStreamFramePerKseconds", A10);
        AnonymousClass186.A00(this.A0H, "wamediaMp4opsVideoStreamHeight", A10);
        AnonymousClass186.A00(this.A0I, "wamediaMp4opsVideoStreamLevelIdc", A10);
        AnonymousClass186.A00(this.A0J, "wamediaMp4opsVideoStreamProfileIdc", A10);
        AnonymousClass186.A00(this.A0K, "wamediaMp4opsVideoStreamRotation", A10);
        AnonymousClass186.A00(this.A0L, "wamediaMp4opsVideoStreamTrackId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "wamediaMp4opsVideoStreamType", A10);
        return AnonymousClass184.A0S(this.A0M, "wamediaMp4opsVideoStreamWidth", A10);
    }
}
