package X;

import java.util.Collection;

/* renamed from: X.9ty  reason: invalid class name and case insensitive filesystem */
public final class C195829ty {
    public final C49352Qd A00;
    public final C58302kT A01;
    public final C166418cr A02;
    public final AnonymousClass206 A03;
    public final String A04;
    public final Collection A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C195829ty(C49352Qd r2, C58302kT r3, C166418cr r4, AnonymousClass206 r5, String str, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 9);
        C18070vi.A0d(collection, 11);
        this.A03 = r5;
        this.A02 = r4;
        this.A09 = z;
        this.A04 = str;
        this.A07 = z2;
        this.A08 = z3;
        this.A06 = z4;
        this.A0C = z5;
        this.A00 = r2;
        this.A0B = z6;
        this.A05 = collection;
        this.A01 = r3;
        this.A0A = z7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195829ty) {
                C195829ty r5 = (C195829ty) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && C18070vi.A18(this.A02, r5.A02) && this.A09 == r5.A09 && C18070vi.A18(this.A04, r5.A04) && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A06 == r5.A06 && this.A0C == r5.A0C && this.A00 == r5.A00 && this.A0B == r5.A0B && C18070vi.A18(this.A05, r5.A05) && C18070vi.A18(this.A01, r5.A01) && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass000.A0N(this.A05, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, AnonymousClass001.A0k(this.A03) * 31), this.A09) + C17900vP.A00(this.A04)) * 31, this.A07), this.A08), this.A06), this.A0C)), this.A0B)) + C17880vN.A02(this.A01)) * 31, this.A0A);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageSerializationData(fMessage=");
        A10.append(this.A03);
        A10.append(", message=");
        A10.append(this.A02);
        A10.append(", isE2eBackFill=");
        A10.append(this.A09);
        A10.append(", botInvokeRawJid=");
        A10.append(this.A04);
        A10.append(", hasTargetDevices=");
        A10.append(this.A07);
        A10.append(", includeSenderKeysInMessage=");
        A10.append(this.A08);
        A10.append(", forceOneOneEncryption=");
        A10.append(this.A06);
        A10.append(", useLidForEncryption=");
        A10.append(this.A0C);
        A10.append(", outgoingPropStage=");
        A10.append(this.A00);
        A10.append(", multiDeviceFanOut=");
        A10.append(this.A0B);
        A10.append(", finalDevices=");
        A10.append(this.A05);
        A10.append(", e2eEncryptionRetryCounts=");
        A10.append(this.A01);
        A10.append(", isRetryReceiptLid=");
        return C17900vP.A0F(A10, this.A0A);
    }
}
