package X;

import java.util.List;

/* renamed from: X.9tN  reason: invalid class name and case insensitive filesystem */
public final class C195459tN {
    public boolean A00;
    public final C20079A6f A01;
    public final C22423B7f A02;
    public final String A03;
    public final List A04;
    public final int A05;
    public final Double A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195459tN) {
                C195459tN r5 = (C195459tN) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || this.A05 != r5.A05 || !C18070vi.A18(this.A06, r5.A06) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass0DV.A00((((((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A04)) + C17900vP.A00(this.A03)) * 31) + this.A05) * 31) + C17880vN.A02(this.A06)) * 31, this.A00));
    }

    public C195459tN(C20079A6f a6f, C22423B7f b7f, Double d, String str, List list, int i) {
        boolean A1J = C108975cc.A1J(a6f);
        this.A04 = list;
        this.A01 = a6f;
        this.A03 = str;
        this.A05 = i;
        this.A06 = d;
        this.A00 = A1J;
        this.A02 = b7f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessRankingRequest(rankerCandidates=");
        A10.append(this.A04);
        A10.append(", searchLocation=");
        A10.append(this.A01);
        A10.append(", csvmConfig=");
        A10.append(this.A03);
        A10.append(", endpoint=");
        A10.append(this.A05);
        A10.append(", proximityWeight=");
        A10.append(this.A06);
        A10.append(", isCancelled=");
        A10.append(this.A00);
        A10.append(", rankingCallback=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
