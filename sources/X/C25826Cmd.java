package X;

/* renamed from: X.Cmd  reason: case insensitive filesystem */
public final class C25826Cmd {
    public final C25846Cn2 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25826Cmd) && C18070vi.A18(this.A00, ((C25826Cmd) obj).A00));
    }

    private final Object A00() {
        C25846Cn2 cn2 = this.A00;
        Object A01 = cn2.A01();
        if (!(!(A01 instanceof AnonymousClass1IU))) {
            return A01;
        }
        try {
            Object A012 = A01();
            C30691eM.A01(A012);
            DPJ dpj = (DPJ) A012;
            C25575CiF ciF = cn2.A00;
            Object A002 = C25575CiF.A00(ciF, "Boolean", new C27744DkQ()).A00(cn2.A01);
            C30691eM.A01(A002);
            return new C25190Cah(dpj, (String) A01, AnonymousClass000.A1Y(A002));
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    public final Object A01() {
        Object A01;
        C25846Cn2 cn2 = this.A00;
        C26032Cqs cqs = cn2.A01;
        C25171CaN caN = cqs.A00;
        Object A012 = caN.A01();
        if (!(!(A012 instanceof AnonymousClass1IU))) {
            return A012;
        }
        try {
            long A05 = C17880vN.A05(A012);
            if (A05 == -1) {
                return new C23989BtW(C23962Bsw.A00);
            }
            if (A05 == -2) {
                return new C23989BtW(C23958Bss.A00);
            }
            if (A05 == -3) {
                return new C23989BtW(C23963Bsx.A00);
            }
            if (A05 == -4) {
                return new C23989BtW(C23961Bsv.A00);
            }
            if (A05 == -5) {
                return new C23989BtW(C23959Bst.A00);
            }
            if (A05 == -6) {
                return new C23989BtW(new C23957Bsr(new DPL(C26032Cqs.A00(cqs))));
            }
            if (A05 == -7) {
                A01 = caN.A01();
                if (!(A01 instanceof AnonymousClass1IU)) {
                    long A052 = C17880vN.A05(A01);
                    if (A052 == -1) {
                        A01 = C23962Bsw.A00;
                    } else if (A052 == -2) {
                        A01 = C23958Bss.A00;
                    } else if (A052 == -3) {
                        A01 = C23963Bsx.A00;
                    } else if (A052 == -4) {
                        A01 = C23961Bsv.A00;
                    } else if (A052 == -5) {
                        A01 = C23959Bst.A00;
                    } else if (A052 == -6) {
                        A01 = new C23957Bsr(new DPL(C26032Cqs.A00(cqs)));
                    } else if (A052 == -11) {
                        A01 = C23960Bsu.A00;
                    } else {
                        throw new C23994Btb(A052);
                    }
                }
                C30691eM.A01(A01);
                String A002 = C25846Cn2.A00(cn2);
                Object A003 = C25575CiF.A00(cn2.A00, "Boolean", new C27744DkQ()).A00(cqs);
                C30691eM.A01(A003);
                return new C23986BtT(new DPN((DPI) A01, A002, AnonymousClass000.A1Y(A003)));
            } else if (A05 == -8) {
                Object A013 = A01();
                C30691eM.A01(A013);
                return new C23987BtU(new DPM((DPJ) A013));
            } else if (A05 == -9) {
                Object A014 = A01();
                C30691eM.A01(A014);
                return new C23985BtS(new DPK((DPJ) A014));
            } else if (A05 == -10) {
                DPS dps = new DPS((DVO) null, (AnonymousClass1Y1) null, 1);
                for (long A004 = C26032Cqs.A00(cqs); A004 > 0; A004--) {
                    Object A005 = A00();
                    C30691eM.A01(A005);
                    C25190Cah cah = (C25190Cah) A005;
                    C18070vi.A0d(cah, 0);
                    dps.A00.put(cah.A01, cah);
                }
                return new C23988BtV(dps);
            } else if (A05 == -11) {
                return new C23990BtX(DPO.A00);
            } else {
                if (A05 == -12) {
                    return new C23991BtY(DPP.A00);
                }
                if (A05 == -15) {
                    return new C23992BtZ(DPQ.A00);
                }
                if (A05 == -13) {
                    return new C23993Bta(DPR.A00);
                }
                throw new C23994Btb(A05);
            }
        } catch (Throwable th) {
            return C108945cZ.A1J(th);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + 1237;
    }

    public /* synthetic */ C25826Cmd(C25846Cn2 cn2) {
        this.A00 = cn2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoWireTypeDecoder(messageDecoder=");
        A10.append(this.A00);
        A10.append(", strict=");
        return C17900vP.A0F(A10, false);
    }
}
