package X;

import java.util.Arrays;

/* renamed from: X.A2m  reason: case insensitive filesystem */
public final class C19998A2m {
    public final AnonymousClass8X8 A00;
    public final C163938Wx A01;
    public final C29721cl A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final byte[] A0G;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19998A2m) {
                C19998A2m a2m = (C19998A2m) obj;
                if (!(C18070vi.A18(this.A00, a2m.A00) && C18070vi.A18(this.A01, a2m.A01) && this.A0B == a2m.A0B && this.A06 == a2m.A06 && this.A05 == a2m.A05 && C18070vi.A18(this.A02, a2m.A02) && C18070vi.A18(this.A0G, a2m.A0G) && this.A0D == a2m.A0D && this.A04 == a2m.A04 && this.A0C == a2m.A0C && this.A0A == a2m.A0A && this.A0E == a2m.A0E && this.A0F == a2m.A0F && this.A08 == a2m.A08 && this.A09 == a2m.A09 && C18070vi.A18(this.A03, a2m.A03) && this.A07 == a2m.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C19998A2m a2m, AnonymousClass206 r3) {
        return A79.A03(a2m.A02, r3, a2m.A0G);
    }

    public final boolean A01() {
        if (this.A06 || this.A0B) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int A002 = (AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)), this.A0B), this.A06), this.A05) + AnonymousClass001.A0k(this.A02)) * 31;
        byte[] bArr = this.A0G;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return C17880vN.A01((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((A002 + hashCode) * 31, this.A0D), this.A04), this.A0C), this.A0A), this.A0E), this.A0F), this.A08), this.A09) + C17880vN.A02(this.A03)) * 31, this.A07);
    }

    public C19998A2m(AnonymousClass8X8 r2, C163938Wx r3, C29721cl r4, Integer num, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A00 = r2;
        this.A01 = r3;
        this.A0B = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A02 = r4;
        this.A0G = bArr;
        this.A0D = z4;
        this.A04 = z5;
        this.A0C = z6;
        this.A0A = z7;
        this.A0E = z8;
        this.A0F = z9;
        this.A08 = z10;
        this.A09 = z11;
        this.A03 = num;
        this.A07 = z12;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BuildE2EMessageParams(e2eMessageBuilder=");
        A10.append(this.A00);
        A10.append(", e2eMessageContextInfoBuilder=");
        A10.append(this.A01);
        A10.append(", isQuoted=");
        A10.append(this.A0B);
        A10.append(", isHistorySync=");
        A10.append(this.A06);
        A10.append(", ignoreThumbnail=");
        A10.append(this.A05);
        A10.append(", ephemeralInfo=");
        A10.append(this.A02);
        A10.append(", ephemeralSharedSecret=");
        C17890vO.A1C(A10, this.A0G);
        A10.append(", isSpamReport=");
        A10.append(this.A0D);
        A10.append(", abortOnError=");
        A10.append(this.A04);
        A10.append(", isRegularLidGroup=");
        A10.append(this.A0C);
        A10.append(", isMessageInLidChat=");
        A10.append(this.A0A);
        A10.append(", skipCommentFlagProcessing=");
        A10.append(this.A0E);
        A10.append(", skipSecretEncMessageFlagProcessing=");
        A10.append(this.A0F);
        A10.append(", isHistorySyncFbidBotsSupported=");
        A10.append(this.A08);
        A10.append(", isHistorySyncHostedGroupSupported=");
        A10.append(this.A09);
        A10.append(", groupE2eeState=");
        A10.append(this.A03);
        A10.append(", isHistorySyncEnabledForMessageAssociation=");
        return C17900vP.A0F(A10, this.A07);
    }
}
