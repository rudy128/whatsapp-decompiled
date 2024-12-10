package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64L  reason: invalid class name */
public final class AnonymousClass64L extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;

    public AnonymousClass64L() {
        super(5172, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(16, this.A0B);
        r3.CHf(1, this.A0C);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A0D);
        r3.CHf(6, this.A0E);
        r3.CHf(7, this.A03);
        r3.CHf(8, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(10, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(12, this.A08);
        r3.CHf(13, this.A09);
        r3.CHf(14, this.A0A);
        r3.CHf(15, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A03(16, this.A0B, A13), this.A0C, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A0D, A13), this.A0E, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0F);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamLinkMetadataFetch {");
        AnonymousClass186.A00(this.A0B, "linkMetadataFetchAndParseTimeMs", A10);
        AnonymousClass186.A00(this.A0C, "linkMetadataFetchHeaderFailErrorCode", A10);
        AnonymousClass186.A00(this.A00, "linkMetadataFetchHeaderFetchFailedLimit", A10);
        AnonymousClass186.A00(this.A01, "linkMetadataFetchHeaderFetchSucceeded", A10);
        AnonymousClass186.A00(this.A02, "linkMetadataFetchHeaderPartialResponseReceived", A10);
        AnonymousClass186.A00(this.A0D, "linkMetadataFetchHeaderSizeMaxTensKb", A10);
        AnonymousClass186.A00(this.A0E, "linkMetadataFetchImageFailErrorCode", A10);
        AnonymousClass186.A00(this.A03, "linkMetadataFetchImageFetchFailedLimit", A10);
        AnonymousClass186.A00(this.A04, "linkMetadataFetchImageOpenGraphThumbnailUrlFound", A10);
        AnonymousClass186.A00(this.A05, "linkMetadataFetchImageOpenGraphUrlFound", A10);
        AnonymousClass186.A00(this.A06, "linkMetadataFetchImagePartialResponseReceived", A10);
        AnonymousClass186.A00(this.A07, "linkMetadataFetchImageRegularUrlFound", A10);
        AnonymousClass186.A00(this.A08, "linkMetadataFetchImageRelativeUrlFound", A10);
        AnonymousClass186.A00(this.A09, "linkMetadataFetchImageTwitterUrlFound", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "linkMetadataFetchImageUrlTypeFetched", A10);
        return AnonymousClass184.A0S(this.A0F, "linkMetadataFetchImageUrlsTried", A10);
    }
}
