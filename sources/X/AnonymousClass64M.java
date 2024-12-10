package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64M  reason: invalid class name */
public final class AnonymousClass64M extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Double A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public String A0H;

    public AnonymousClass64M() {
        super(3664, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A07);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A08);
        r3.CHf(4, this.A0E);
        r3.CHf(5, this.A0H);
        r3.CHf(18, this.A09);
        r3.CHf(6, this.A0A);
        r3.CHf(7, this.A01);
        r3.CHf(16, this.A0F);
        r3.CHf(8, this.A02);
        r3.CHf(17, this.A0B);
        r3.CHf(9, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A0C);
        r3.CHf(12, this.A0D);
        r3.CHf(13, this.A06);
        r3.CHf(14, this.A05);
        r3.CHf(15, this.A0G);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0J(AnonymousClass184.A0A(AnonymousClass184.A0I(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0K(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A07, A13), this.A00, A13), this.A08, A13), this.A0E, A13), this.A0H, A13), this.A09, A13), this.A0A, A13), this.A01, A13), this.A0F, A13), this.A02, A13), this.A0B, A13), this.A03, A13), this.A04, A13), this.A0C, A13), this.A0D, A13), this.A06, A13), this.A05, A13), this.A0G, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCameraCaptureFlow {");
        AnonymousClass186.A00(C17900vP.A08(this.A07), "cameraCaptureDirection", A10);
        AnonymousClass186.A00(this.A00, "cameraCaptureUserCancelled", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "cameraEntryPoint", A10);
        AnonymousClass186.A00(this.A0E, "cameraErrorCode", A10);
        AnonymousClass186.A00(this.A0H, "cameraErrorDomain", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "cameraEventName", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "cameraFlashMode", A10);
        AnonymousClass186.A00(this.A01, "cameraGalleryBrowserClosed", A10);
        AnonymousClass186.A00(this.A0F, "cameraGalleryBrowserMediaItemCount", A10);
        AnonymousClass186.A00(this.A02, "cameraGalleryBrowserMediaUsed", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "cameraGalleryBrowserSelectionType", A10);
        AnonymousClass186.A00(this.A03, "cameraGalleryStripMediaUsed", A10);
        AnonymousClass186.A00(this.A04, "cameraLowLight", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "cameraMediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0D), "cameraOrientation", A10);
        AnonymousClass186.A00(this.A06, "cameraVideoCaptureDuration", A10);
        AnonymousClass186.A00(this.A05, "cameraZoomUsed", A10);
        return AnonymousClass184.A0S(this.A0G, "mediaFlowSessionId", A10);
    }
}
