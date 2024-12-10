package X;

import java.util.List;

/* renamed from: X.9tb  reason: invalid class name and case insensitive filesystem */
public final class C195599tb {
    public final C195519tT A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195599tb) {
                C195599tb r5 = (C195599tb) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || this.A08 != r5.A08 || this.A06 != r5.A06 || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A05, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A04, C17890vO.A02(this.A02, AnonymousClass000.A0N(this.A00, C17890vO.A02(this.A03, C17890vO.A02(this.A07, C17880vN.A03(this.A01)))))), this.A08), this.A06));
    }

    public C195599tb(C195519tT r1, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2) {
        this.A01 = str;
        this.A07 = str2;
        this.A03 = str3;
        this.A00 = r1;
        this.A02 = str4;
        this.A04 = list;
        this.A08 = z;
        this.A06 = z2;
        this.A05 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeMask(id=");
        AnonymousClass8BT.A1W(A10, this.A01);
        A10.append(this.A07);
        A10.append(", requiredSdkVersion=");
        A10.append(this.A03);
        A10.append(", packagedFile=");
        A10.append(this.A00);
        A10.append(", manifestJson=");
        A10.append(this.A02);
        A10.append(", capabilitiesMinVersionModels=");
        A10.append(this.A04);
        A10.append(", faceTrackerEnabled=");
        A10.append(this.A08);
        A10.append(", usesFlmCapability=");
        A10.append(this.A06);
        A10.append(", effectInstructions=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
