package X;

import java.util.List;

/* renamed from: X.2n5  reason: invalid class name and case insensitive filesystem */
public final class C59912n5 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;

    public C59912n5(Boolean bool, String str, String str2, String str3, List list, int i, int i2, long j, long j2, long j3, long j4, boolean z) {
        C18070vi.A0d(str, 1);
        this.A09 = str;
        this.A05 = j;
        this.A03 = j2;
        this.A06 = j3;
        this.A0C = list;
        this.A07 = j4;
        this.A0B = str2;
        this.A0D = z;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = str3;
        this.A08 = bool;
        this.A04 = (j * 1000) + j4;
        this.A02 = (j2 * 1000) + j4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59912n5) {
                C59912n5 r8 = (C59912n5) obj;
                if (!(C18070vi.A18(this.A09, r8.A09) && this.A05 == r8.A05 && this.A03 == r8.A03 && this.A06 == r8.A06 && C18070vi.A18(this.A0C, r8.A0C) && this.A07 == r8.A07 && C18070vi.A18(this.A0B, r8.A0B) && this.A0D == r8.A0D && this.A00 == r8.A00 && this.A01 == r8.A01 && C18070vi.A18(this.A0A, r8.A0A) && C18070vi.A18(this.A08, r8.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass0DV.A00((AnonymousClass001.A0K(this.A07, AnonymousClass000.A0N(this.A0C, AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A03, AnonymousClass001.A0K(this.A05, C17880vN.A03(this.A09)))))) + C17900vP.A00(this.A0B)) * 31, this.A0D) + this.A00) * 31) + this.A01) * 31) + C17900vP.A00(this.A0A)) * 31) + C17880vN.A02(this.A08);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RoutingResponse(authToken=");
        A10.append(this.A09);
        A10.append(", connTtl=");
        A10.append(this.A05);
        A10.append(", authTtl=");
        A10.append(this.A03);
        A10.append(", maxBuckets=");
        A10.append(this.A06);
        A10.append(", hosts=");
        A10.append(this.A0C);
        A10.append(", sendTime=");
        A10.append(this.A07);
        A10.append(", lastId=");
        A10.append(this.A0B);
        A10.append(", isNew=");
        A10.append(this.A0D);
        A10.append(", maxAutoDownloadRetry=");
        A10.append(this.A00);
        A10.append(", maxManualRetry=");
        A10.append(this.A01);
        A10.append(", ipToken=");
        A10.append(this.A0A);
        A10.append(", setIpToken=");
        return AnonymousClass001.A1F(this.A08, A10);
    }
}
