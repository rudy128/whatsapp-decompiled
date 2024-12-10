package X;

import java.util.List;

/* renamed from: X.CqC  reason: case insensitive filesystem */
public final class C25996CqC {
    public static final List A0H;
    public final String A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;

    static {
        C0M[] c0mArr = new C0M[15];
        c0mArr[0] = C0M.A06;
        c0mArr[1] = C0M.A08;
        c0mArr[2] = C0M.A0D;
        c0mArr[3] = C0M.A0M;
        c0mArr[4] = C0M.A0P;
        c0mArr[5] = C0M.A0Q;
        c0mArr[6] = C0M.A0U;
        c0mArr[7] = C0M.A0Z;
        c0mArr[8] = C0M.A0b;
        c0mArr[9] = C0M.A0d;
        c0mArr[10] = C0M.A0q;
        c0mArr[11] = C0M.A12;
        c0mArr[12] = C0M.A14;
        c0mArr[13] = C0M.A1F;
        A0H = C18070vi.A0O(C0M.A1S, c0mArr, 14);
    }

    public C25996CqC(C18030ve r3, String str) {
        this.A00 = str;
        Integer A002 = C87484Vt.A00(r3);
        this.A01 = AnonymousClass1DF.A00(A002, new C27614DiK(this));
        this.A02 = AnonymousClass1DF.A00(A002, new C27615DiL(this));
        this.A03 = AnonymousClass1DF.A00(A002, new C27616DiM(this));
        this.A04 = AnonymousClass1DF.A00(A002, new C27617DiN(this));
        this.A05 = AnonymousClass1DF.A00(A002, new C27618DiO(this));
        this.A06 = AnonymousClass1DF.A00(A002, new C27619DiP(this));
        this.A07 = AnonymousClass1DF.A00(A002, new C27620DiQ(this));
        this.A08 = AnonymousClass1DF.A00(A002, new C27621DiR(this));
        this.A09 = AnonymousClass1DF.A00(A002, new C27622DiS(this));
        this.A0A = AnonymousClass1DF.A00(A002, new C27623DiT(this));
        this.A0B = AnonymousClass1DF.A00(A002, new C27624DiU(this));
        this.A0C = AnonymousClass1DF.A00(A002, new C27625DiV(this));
        this.A0D = AnonymousClass1DF.A00(A002, new C27626DiW(this));
        this.A0E = AnonymousClass1DF.A00(A002, new C27627DiX(this));
        this.A0F = AnonymousClass1DF.A00(A002, new C27628DiY(this));
        this.A0G = AnonymousClass1DF.A00(A002, new C27629DiZ(this));
    }

    public static void A00(StringBuilder sb, C18100vl r2) {
        sb.append(((Boolean) r2.getValue()).booleanValue());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEngineEffectServiceManifest(usesAvatarsDataProvider=");
        A00(A10, this.A02);
        A10.append(", usesBodyTrackingDataProvider=");
        A00(A10, this.A03);
        A10.append(", usesCaptureEventService=");
        A00(A10, this.A04);
        A10.append(", usesExpressionFittingDataProvider=");
        A00(A10, this.A05);
        A10.append(", usesFaceTrackingDataProvider=");
        A00(A10, this.A06);
        A10.append(", usesFaceWaveDataProvider=");
        A00(A10, this.A07);
        A10.append(", usesGalleryPickerService=");
        A00(A10, this.A08);
        A10.append(", usesHairSegmentationDataProvider=");
        A00(A10, this.A09);
        A10.append(", usesHandTrackingDataProvider=");
        A00(A10, this.A0A);
        A10.append(", usesInstructionService=");
        A00(A10, this.A0B);
        A10.append(", usesMotionDataProvider=");
        A00(A10, this.A0C);
        A10.append(", usesPersonSegmentationDataProvider=");
        A00(A10, this.A0D);
        A10.append(", usesPlatformEventsDataProvider=");
        A00(A10, this.A0E);
        A10.append(", usesRuntimeRigMappingDataProvider=");
        A00(A10, this.A0F);
        A10.append(", usesTouchGesturesDataProvider=");
        A00(A10, this.A0G);
        A10.append(", manifestJson=");
        return C17900vP.A0B(this.A00, A10);
    }
}
