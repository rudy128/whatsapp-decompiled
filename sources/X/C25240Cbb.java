package X;

/* renamed from: X.Cbb  reason: case insensitive filesystem */
public final class C25240Cbb {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final Integer A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25240Cbb) {
                C25240Cbb cbb = (C25240Cbb) obj;
                if (!C18070vi.A18(this.A0G, cbb.A0G) || !C18070vi.A18(this.A0C, cbb.A0C) || !C18070vi.A18(this.A09, cbb.A09) || !C18070vi.A18(this.A0A, cbb.A0A) || !C18070vi.A18(this.A0I, cbb.A0I) || !C18070vi.A18(this.A01, cbb.A01) || !C18070vi.A18(this.A00, cbb.A00) || !C18070vi.A18(this.A0E, cbb.A0E) || !C18070vi.A18(this.A06, cbb.A06) || !C18070vi.A18(this.A07, cbb.A07) || !C18070vi.A18(this.A0H, cbb.A0H) || !C18070vi.A18(this.A0D, cbb.A0D) || !C18070vi.A18(this.A08, cbb.A08) || !C18070vi.A18(this.A0B, cbb.A0B) || !C18070vi.A18(this.A03, cbb.A03) || !C18070vi.A18(this.A02, cbb.A02) || !C18070vi.A18(this.A04, cbb.A04) || !C18070vi.A18(this.A05, cbb.A05) || !C18070vi.A18(this.A0F, cbb.A0F) || !C18070vi.A18(this.A0J, cbb.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A00, (((BE6.A06((BE6.A06(C17880vN.A03(this.A0G), C17900vP.A00(this.A0C)) + C17900vP.A00(this.A09)) * 31, C17900vP.A00(this.A0A)) + C17900vP.A00(this.A0I)) * 31) + AnonymousClass001.A0k(this.A01)) * 31);
        return ((((((((((((((((C17890vO.A02(this.A0H, (((C17890vO.A02(this.A0E, A0N) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17900vP.A00(this.A0D)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + C17900vP.A00(this.A0B)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17900vP.A00(this.A0F)) * 31) + C108955ca.A06(this.A0J);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LiveEditingQplAnnotation(requestId=");
        A10.append(this.A0G);
        A10.append(", effectId=");
        A10.append(this.A0C);
        C108975cc.A17(A10, ", effectURL=");
        A10.append(", category=");
        A10.append(this.A09);
        A10.append(", choiceId=");
        A10.append(this.A0A);
        C108975cc.A17(A10, ", benchmarkingKey=");
        A10.append(", tab=");
        A10.append(this.A0I);
        A10.append(", isNux=");
        A10.append(this.A01);
        A10.append(", isAtomizationEnabled=");
        A10.append(this.A00);
        A10.append(", profileName=");
        A10.append(this.A0E);
        A10.append(", lod=");
        A10.append(this.A06);
        A10.append(", texture=");
        A10.append(this.A07);
        A10.append(", revisionId=");
        A10.append(this.A0H);
        A10.append(", networkType=");
        A10.append(this.A0D);
        A10.append(", arClass=");
        A10.append(this.A08);
        A10.append(", deliverySpecId=");
        A10.append(this.A0B);
        A10.append(", prefetchAvatar=");
        A10.append(this.A03);
        A10.append(", prefetchAssets=");
        A10.append(this.A02);
        A10.append(", prewarmArEffect=");
        A10.append(this.A04);
        A10.append(", useAle=");
        A10.append(this.A05);
        A10.append(", referrerSurface=");
        A10.append(this.A0F);
        A10.append(", userFlowState=");
        return C17900vP.A0B(this.A0J, A10);
    }

    public C25240Cbb(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A0G = str;
        this.A0C = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0I = str5;
        this.A01 = bool;
        this.A00 = bool2;
        this.A0E = str6;
        this.A06 = num;
        this.A07 = num2;
        this.A0H = str7;
        this.A0D = str8;
        this.A08 = l;
        this.A0B = str9;
        this.A03 = bool3;
        this.A02 = bool4;
        this.A04 = bool5;
        this.A05 = bool6;
        this.A0F = str10;
        this.A0J = str11;
    }
}
