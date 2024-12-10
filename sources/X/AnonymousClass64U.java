package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64U  reason: invalid class name */
public final class AnonymousClass64U extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
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
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public Long A0Y;
    public Long A0Z;
    public Long A0a;
    public String A0b;

    public AnonymousClass64U() {
        super(1038, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(24, this.A00);
        r3.CHf(25, this.A01);
        r3.CHf(51, this.A0B);
        r3.CHf(37, this.A0b);
        r3.CHf(16, this.A0C);
        r3.CHf(34, this.A0D);
        r3.CHf(35, this.A02);
        r3.CHf(36, this.A06);
        r3.CHf(41, this.A03);
        r3.CHf(22, this.A04);
        r3.CHf(39, this.A0E);
        r3.CHf(42, this.A0F);
        r3.CHf(43, this.A0G);
        r3.CHf(44, this.A0H);
        r3.CHf(33, this.A0I);
        r3.CHf(4, this.A0J);
        r3.CHf(10, this.A0K);
        r3.CHf(3, this.A0L);
        r3.CHf(11, this.A0M);
        r3.CHf(18, this.A0N);
        r3.CHf(26, this.A05);
        r3.CHf(14, this.A07);
        r3.CHf(2, this.A0O);
        r3.CHf(5, this.A0P);
        r3.CHf(12, this.A0Q);
        r3.CHf(15, this.A0R);
        r3.CHf(13, this.A0S);
        r3.CHf(1, this.A08);
        r3.CHf(31, this.A0T);
        r3.CHf(32, this.A0U);
        r3.CHf(46, this.A0V);
        r3.CHf(50, this.A0W);
        r3.CHf(23, this.A0X);
        r3.CHf(27, this.A09);
        r3.CHf(30, this.A0Y);
        r3.CHf(17, this.A0Z);
        r3.CHf(52, this.A0a);
        r3.CHf(28, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0U(24, this.A00, A13), this.A01);
        A13.put(51, this.A0B);
        A13.put(AnonymousClass184.A0I(37, this.A0b, A13), this.A0C);
        AnonymousClass184.A0X(A13, 38);
        A13.put(34, this.A0D);
        A13.put(35, this.A02);
        A13.put(36, this.A06);
        A13.put(AnonymousClass184.A0O(41, this.A03, A13), this.A04);
        A13.put(39, this.A0E);
        A13.put(42, this.A0F);
        A13.put(43, this.A0G);
        A13.put(44, this.A0H);
        A13.put(AnonymousClass184.A0K(AnonymousClass184.A0D(C108975cc.A0T(AnonymousClass184.A0C(AnonymousClass184.A06(33, this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A0L, A13), this.A0M, A13), this.A0N);
        A13.put(26, this.A05);
        A13.put(47, (Object) null);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0M(AnonymousClass184.A0L(48, (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A07);
        AnonymousClass184.A0X(A13, 21);
        A13.put(AnonymousClass184.A07(C17880vN.A0i(), this.A0O, A13), this.A0P);
        AnonymousClass184.A0X(A13, 29);
        A13.put(C108975cc.A0W(AnonymousClass184.A03(AnonymousClass184.A0F(AnonymousClass184.A0H(C108955ca.A0h(), this.A0Q, A13), this.A0R, A13), this.A0S, A13), this.A08, A13), this.A0T);
        A13.put(C108955ca.A0j(), this.A0U);
        AnonymousClass184.A0X(A13, 45);
        A13.put(46, this.A0V);
        AnonymousClass184.A0X(A13, 49);
        A13.put(AnonymousClass184.A0P(50, this.A0W, A13), this.A0X);
        A13.put(AnonymousClass184.A0J(C108975cc.A0V(27, this.A09, A13), this.A0Y, A13), this.A0Z);
        A13.put(52, this.A0a);
        A13.put(28, this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaPicker {");
        AnonymousClass186.A00(this.A00, "audienceSelectorClicked", A10);
        AnonymousClass186.A00(this.A01, "audienceSelectorUpdated", A10);
        AnonymousClass186.A00(this.A0B, "autoScaleCount", A10);
        AnonymousClass186.A00(this.A0b, "captionPositions", A10);
        AnonymousClass186.A00(this.A0C, "chatRecipients", A10);
        AnonymousClass186.A00(this.A0D, "hdToggleChange", A10);
        AnonymousClass186.A00(this.A02, "hdToggleEligible", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "hdToggleState", A10);
        AnonymousClass186.A00(this.A03, "isSentInLandscape", A10);
        AnonymousClass186.A00(this.A04, "isViewOnce", A10);
        AnonymousClass186.A00(this.A0E, "itemCaptionCount", A10);
        AnonymousClass186.A00(this.A0F, "mediaPickerArBackground", A10);
        AnonymousClass186.A00(this.A0G, "mediaPickerArFilter", A10);
        AnonymousClass186.A00(this.A0H, "mediaPickerArFunEffect", A10);
        AnonymousClass186.A00(this.A0I, "mediaPickerAvatarStickers", A10);
        AnonymousClass186.A00(this.A0J, "mediaPickerChanged", A10);
        AnonymousClass186.A00(this.A0K, "mediaPickerCroppedRotated", A10);
        AnonymousClass186.A00(this.A0L, "mediaPickerDeleted", A10);
        AnonymousClass186.A00(this.A0M, "mediaPickerDrawing", A10);
        AnonymousClass186.A00(this.A0N, "mediaPickerFilter", A10);
        AnonymousClass186.A00(this.A05, "mediaPickerHasLocationSticker", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "mediaPickerOrigin", A10);
        AnonymousClass186.A00(this.A0O, "mediaPickerSent", A10);
        AnonymousClass186.A00(this.A0P, "mediaPickerSentUnchanged", A10);
        AnonymousClass186.A00(this.A0Q, "mediaPickerStickers", A10);
        AnonymousClass186.A00(this.A0R, "mediaPickerT", A10);
        AnonymousClass186.A00(this.A0S, "mediaPickerText", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "mediaType", A10);
        AnonymousClass186.A00(this.A0T, "motionPhotoImpressionCount", A10);
        AnonymousClass186.A00(this.A0U, "motionPhotoSentCount", A10);
        AnonymousClass186.A00(this.A0V, "numberOfArPreCapture", A10);
        AnonymousClass186.A00(this.A0W, "numberOfIgluPreCapture", A10);
        AnonymousClass186.A00(this.A0X, "photoGalleryDurationT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "photoQualitySetting", A10);
        AnonymousClass186.A00(this.A0Y, "pickerSessionId", A10);
        AnonymousClass186.A00(this.A0Z, "statusRecipients", A10);
        AnonymousClass186.A00(this.A0a, "transformCount", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0A), "videoQualitySetting", A10);
    }
}
