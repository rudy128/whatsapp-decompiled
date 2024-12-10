package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H9  reason: invalid class name */
public final class AnonymousClass2H9 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(4, this.A06);
        r3.CHf(5, this.A00);
        r3.CHf(12, this.A07);
        r3.CHf(6, this.A08);
        r3.CHf(7, this.A09);
        r3.CHf(8, this.A01);
        r3.CHf(13, this.A0A);
        r3.CHf(9, this.A0B);
        r3.CHf(10, this.A0C);
        r3.CHf(11, this.A02);
    }

    public AnonymousClass2H9() {
        super(4644, new C18180vt(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0F(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0E(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A00, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A01, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWamediaImgopsEvent {");
        AnonymousClass186.A00(this.A03, "wamediaImgopsContentLength", A10);
        AnonymousClass186.A00(this.A04, "wamediaImgopsErrorTolerance", A10);
        AnonymousClass186.A00(this.A05, "wamediaImgopsFileSize", A10);
        AnonymousClass186.A00(this.A06, "wamediaImgopsFileSizeOut", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "wamediaImgopsFileType", A10);
        AnonymousClass186.A00(this.A07, "wamediaImgopsFrameDurationMs", A10);
        AnonymousClass186.A00(this.A08, "wamediaImgopsImageHeight", A10);
        AnonymousClass186.A00(this.A09, "wamediaImgopsImageWidth", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "wamediaImgopsImpl", A10);
        AnonymousClass186.A00(this.A0A, "wamediaImgopsNumFrames", A10);
        AnonymousClass186.A00(this.A0B, "wamediaImgopsReturnValue", A10);
        AnonymousClass186.A00(this.A0C, "wamediaImgopsTimeElapsedNs", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "wamediaImgopsType", A10);
    }
}
