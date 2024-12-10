package X;

import java.util.List;

/* renamed from: X.Cdx  reason: case insensitive filesystem */
public abstract class C25338Cdx {
    /* JADX WARNING: type inference failed for: r3v2, types: [X.BoN, X.DFL] */
    public static DFL A01(C24948CQy cQy, E9W e9w) {
        DFL dfl;
        CMY cmy = new CMY((E9O) null);
        Integer CBO = e9w.CBO();
        Integer num = AnonymousClass00R.A0C;
        if (CBO == num) {
            DFL dfl2 = null;
            while (true) {
                Integer BkN = e9w.BkN();
                Integer num2 = AnonymousClass00R.A0N;
                if (BkN == num2) {
                    break;
                }
                String CBN = e9w.CBN();
                int A00 = CCB.A00(CBN);
                boolean A1C = C108975cc.A1C(A00, 32);
                e9w.BkN();
                if (!A1C || 13347 != A00) {
                    ? dfl3 = new DFL((List) null, A00, 10);
                    if (!A1C) {
                        C25913CoX.A01("BloksModelParser", String.format(AnonymousClass001.A1H("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", CBN, AnonymousClass000.A10()), BE6.A1Z()));
                    } else if (e9w.CBO() != num) {
                        e9w.CNS();
                        dfl = null;
                    } else {
                        BE7.A11(A00, cmy.A00);
                        D8J d8j = new D8J(cQy, new D8I(cmy.A01, cmy.A00));
                        dfl3.A01 = d8j;
                        while (e9w.BkN() != num2) {
                            String CBN2 = e9w.CBN();
                            e9w.BkN();
                            CC1.A00(d8j, dfl3, e9w, CBN2);
                            e9w.CNS();
                        }
                    }
                    dfl3.A0J();
                    dfl = dfl3;
                } else {
                    dfl = C25574CiE.A00(e9w);
                }
                e9w.CNS();
                dfl2 = dfl;
            }
            if (dfl2 == null) {
                C25913CoX.A02("BloksParser", C17880vN.A0f("unknown bloks data type"));
            }
            return dfl2;
        }
        e9w.CNS();
        throw C17880vN.A0f("Token parsing error.");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.BoN, X.DFL] */
    public static DFL A00(CMY cmy, E9W e9w) {
        DFL dfl;
        Integer CBO = e9w.CBO();
        Integer num = AnonymousClass00R.A0C;
        if (CBO == num) {
            DFL dfl2 = null;
            while (true) {
                Integer BkN = e9w.BkN();
                Integer num2 = AnonymousClass00R.A0N;
                if (BkN == num2) {
                    break;
                }
                String CBN = e9w.CBN();
                int A00 = CCB.A00(CBN);
                boolean A1C = C108975cc.A1C(A00, 32);
                e9w.BkN();
                if (!A1C || 13347 != A00) {
                    ? dfl3 = new DFL((List) null, A00, 10);
                    if (!A1C) {
                        C25913CoX.A01("BloksModelParser", String.format(AnonymousClass001.A1H("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", CBN, AnonymousClass000.A10()), BE6.A1Z()));
                    } else if (e9w.CBO() != num) {
                        e9w.CNS();
                        dfl = null;
                    } else {
                        BE7.A11(A00, cmy.A00);
                        D8I d8i = new D8I(cmy.A01, cmy.A00);
                        dfl3.A01 = d8i;
                        while (e9w.BkN() != num2) {
                            String CBN2 = e9w.CBN();
                            e9w.BkN();
                            CC1.A00(d8i, dfl3, e9w, CBN2);
                            e9w.CNS();
                        }
                    }
                    dfl3.A0J();
                    dfl = dfl3;
                } else {
                    dfl = C25574CiE.A00(e9w);
                }
                e9w.CNS();
                dfl2 = dfl;
            }
            if (dfl2 == null) {
                C25913CoX.A02("BloksParser", C17880vN.A0f("unknown bloks data type"));
            }
            return dfl2;
        }
        e9w.CNS();
        throw C17880vN.A0f("Token parsing error.");
    }
}
