package X;

/* renamed from: X.Cn2  reason: case insensitive filesystem */
public final class C25846Cn2 {
    public final C25575CiF A00;
    public final C26032Cqs A01;
    public final C25806CmJ A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25846Cn2) {
                C25846Cn2 cn2 = (C25846Cn2) obj;
                if (!C18070vi.A18(this.A02, cn2.A02) || !C18070vi.A18(this.A00, cn2.A00) || !C18070vi.A18(this.A01, cn2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object A01() {
        C25575CiF ciF = this.A00;
        return C25575CiF.A00(ciF, "String", new C27748DkU()).A03(this.A01);
    }

    public final Object A02() {
        C25575CiF ciF = this.A00;
        return C25575CiF.A00(ciF, "Int", new C27749DkV()).A04(this.A01);
    }

    public final Object A03(boolean z) {
        C26032Cqs cqs = this.A01;
        if (z) {
            Long A022 = cqs.A02();
            if (!(!(A022 instanceof AnonymousClass1IU))) {
                return A022;
            }
            if (A022 != null) {
                try {
                    if (A022.longValue() == -1) {
                        C30691eM.A01(cqs.A00.A01());
                        return C23921BsH.A00;
                    }
                } catch (Throwable th) {
                    return C108945cZ.A1J(th);
                }
            }
            if (A022 == null || A022.longValue() != -3) {
                return C23920BsG.A00;
            }
            C30691eM.A01(cqs.A00.A01());
            return C23919BsF.A00;
        }
        Object A012 = cqs.A00.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        long A05 = C17880vN.A05(A012);
        if (A05 == -1) {
            return C23921BsH.A00;
        }
        if (A05 == 0) {
            return C23920BsG.A00;
        }
        if (A05 == -3) {
            return C23919BsF.A00;
        }
        throw new C23929BsP(A05);
    }

    public final Object A04(boolean z) {
        C26032Cqs cqs = this.A01;
        if (z) {
            Long A022 = cqs.A02();
            if (!(!(A022 instanceof AnonymousClass1IU))) {
                return A022;
            }
            if (A022 != null) {
                try {
                    if (A022.longValue() == -2) {
                        C30691eM.A01(cqs.A00.A01());
                        return C23922BsI.A00;
                    }
                } catch (Throwable th) {
                    return C108945cZ.A1J(th);
                }
            }
            return C23923BsJ.A00;
        }
        Object A012 = cqs.A00.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        long A05 = C17880vN.A05(A012);
        if (A05 == -2) {
            return C23922BsI.A00;
        }
        if (A05 == 0) {
            return C23923BsJ.A00;
        }
        throw new C23930BsQ(A05);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02)));
    }

    public C25846Cn2(C25575CiF ciF, C26032Cqs cqs, C25806CmJ cmJ) {
        this.A02 = cmJ;
        this.A00 = ciF;
        this.A01 = cqs;
    }

    public static String A00(C25846Cn2 cn2) {
        Object A012 = cn2.A01();
        C30691eM.A01(A012);
        return (String) A012;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoMessageDecoder(header=");
        A10.append(this.A02);
        A10.append(", blocks=");
        A10.append(this.A00);
        A10.append(", core=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
