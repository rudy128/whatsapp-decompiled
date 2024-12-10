package X;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.Cwd  reason: case insensitive filesystem */
public final class C26282Cwd {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final C25857CnL A03;

    public static C25857CnL A02(C26282Cwd cwd) {
        A07(cwd, 0);
        return cwd.A03;
    }

    public static C25857CnL A03(C26282Cwd cwd) {
        A07(cwd, 2);
        return cwd.A03;
    }

    public void A0B(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C25857CnL cnL = this.A03;
                list.add(Boolean.valueOf(cnL.A0U()));
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A012 = A01(cnL2);
            do {
                list.add(Boolean.valueOf(cnL2.A0U()));
            } while (cnL2.A0A() < A012);
            A05(A012);
        } else {
            throw new C23659BnS();
        }
    }

    public void A0C(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C25857CnL cnL = this.A03;
                list.add(Double.valueOf(cnL.A08()));
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A0H = cnL2.A0H();
            if ((A0H & 7) == 0) {
                int A0A = cnL2.A0A() + A0H;
                do {
                    list.add(Double.valueOf(cnL2.A08()));
                } while (cnL2.A0A() < A0A);
                return;
            }
            throw BE6.A0c("Failed to parse the message.");
        } else {
            throw new C23659BnS();
        }
    }

    public void A0F(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C25857CnL cnL = this.A03;
                BE7.A1S(list, cnL.A0J());
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A0H = cnL2.A0H();
            if ((A0H & 7) == 0) {
                int A0A = cnL2.A0A() + A0H;
                do {
                    BE7.A1S(list, cnL2.A0J());
                } while (cnL2.A0A() < A0A);
                return;
            }
            throw BE6.A0c("Failed to parse the message.");
        } else {
            throw new C23659BnS();
        }
    }

    public void A0G(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 2) {
            C25857CnL cnL = this.A03;
            int A002 = A00(cnL);
            do {
                list.add(Float.valueOf(cnL.A09()));
            } while (cnL.A0A() < A002);
        } else if (i != 5) {
            throw new C23659BnS();
        } else {
            do {
                C25857CnL cnL2 = this.A03;
                list.add(Float.valueOf(cnL2.A09()));
                if (!cnL2.A0T()) {
                    A0G = cnL2.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        }
    }

    public void A0I(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C25857CnL cnL = this.A03;
                BE7.A1S(list, cnL.A0K());
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A012 = A01(cnL2);
            do {
                BE7.A1S(list, cnL2.A0K());
            } while (cnL2.A0A() < A012);
            A05(A012);
        } else {
            throw new C23659BnS();
        }
    }

    public void A0K(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                C25857CnL cnL = this.A03;
                BE7.A1S(list, cnL.A0L());
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A0H = cnL2.A0H();
            if ((A0H & 7) == 0) {
                int A0A = cnL2.A0A() + A0H;
                do {
                    BE7.A1S(list, cnL2.A0L());
                } while (cnL2.A0A() < A0A);
                return;
            }
            throw BE6.A0c("Failed to parse the message.");
        } else {
            throw new C23659BnS();
        }
    }

    public void A0M(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C25857CnL cnL = this.A03;
                BE7.A1S(list, cnL.A0M());
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A012 = A01(cnL2);
            do {
                BE7.A1S(list, cnL2.A0M());
            } while (cnL2.A0A() < A012);
            A05(A012);
        } else {
            throw new C23659BnS();
        }
    }

    public void A0O(List list) {
        int A0G;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                C25857CnL cnL = this.A03;
                BE7.A1S(list, cnL.A0N());
                if (!cnL.A0T()) {
                    A0G = cnL.A0G();
                } else {
                    return;
                }
            } while (A0G == this.A02);
            this.A01 = A0G;
        } else if (i == 2) {
            C25857CnL cnL2 = this.A03;
            int A012 = A01(cnL2);
            do {
                BE7.A1S(list, cnL2.A0N());
            } while (cnL2.A0A() < A012);
            A05(A012);
        } else {
            throw new C23659BnS();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d5, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A04(X.C26282Cwd r2, X.C26105CsP r3, X.C24362Bzx r4, java.lang.Class r5) {
        /*
            int[] r0 = X.CFm.A00
            int r0 = X.BE6.A0E(r4, r0)
            switch(r0) {
                case 1: goto L_0x0010;
                case 2: goto L_0x001d;
                case 3: goto L_0x0026;
                case 4: goto L_0x0035;
                case 5: goto L_0x003f;
                case 6: goto L_0x004a;
                case 7: goto L_0x0055;
                case 8: goto L_0x0064;
                case 9: goto L_0x006d;
                case 10: goto L_0x0076;
                case 11: goto L_0x008b;
                case 12: goto L_0x0096;
                case 13: goto L_0x00a1;
                case 14: goto L_0x00aa;
                case 15: goto L_0x00b3;
                case 16: goto L_0x00bc;
                case 17: goto L_0x00c9;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "unsupported field type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0010:
            X.CnL r0 = A02(r2)
            boolean r0 = r0.A0U()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x001d:
            X.CnL r0 = A03(r2)
            X.DSQ r1 = r0.A0O()
            return r1
        L_0x0026:
            r0 = 1
            A07(r2, r0)
            X.CnL r0 = r2.A03
            double r0 = r0.A08()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            return r1
        L_0x0035:
            X.CnL r0 = A02(r2)
            int r0 = r0.A0B()
            goto L_0x00c4
        L_0x003f:
            r0 = 5
            A07(r2, r0)
            X.CnL r0 = r2.A03
            int r0 = r0.A0C()
            goto L_0x00c4
        L_0x004a:
            r0 = 1
            A07(r2, r0)
            X.CnL r0 = r2.A03
            long r0 = r0.A0J()
            goto L_0x00d1
        L_0x0055:
            r0 = 5
            A07(r2, r0)
            X.CnL r0 = r2.A03
            float r0 = r0.A09()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            return r1
        L_0x0064:
            X.CnL r0 = A02(r2)
            int r0 = r0.A0D()
            goto L_0x00c4
        L_0x006d:
            X.CnL r0 = A02(r2)
            long r0 = r0.A0K()
            goto L_0x00d1
        L_0x0076:
            r0 = 2
            A07(r2, r0)
            X.Cjr r0 = X.C25661Cjr.A02
            X.EAO r0 = r0.A00(r5)
            X.Bm6 r1 = r0.BkG()
            A09(r2, r3, r0, r1)
            r0.Bih(r1)
            return r1
        L_0x008b:
            r0 = 5
            A07(r2, r0)
            X.CnL r0 = r2.A03
            int r0 = r0.A0E()
            goto L_0x00c4
        L_0x0096:
            r0 = 1
            A07(r2, r0)
            X.CnL r0 = r2.A03
            long r0 = r0.A0L()
            goto L_0x00d1
        L_0x00a1:
            X.CnL r0 = A02(r2)
            int r0 = r0.A0F()
            goto L_0x00c4
        L_0x00aa:
            X.CnL r0 = A02(r2)
            long r0 = r0.A0M()
            goto L_0x00d1
        L_0x00b3:
            X.CnL r0 = A03(r2)
            java.lang.String r1 = r0.A0Q()
            return r1
        L_0x00bc:
            X.CnL r0 = A02(r2)
            int r0 = r0.A0H()
        L_0x00c4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            return r1
        L_0x00c9:
            X.CnL r0 = A02(r2)
            long r0 = r0.A0N()
        L_0x00d1:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26282Cwd.A04(X.Cwd, X.CsP, X.Bzx, java.lang.Class):java.lang.Object");
    }

    private void A05(int i) {
        if (this.A03.A0A() != i) {
            throw BE7.A0M();
        }
    }

    public static void A06(int i) {
        if ((i & 3) != 0) {
            throw BE6.A0c("Failed to parse the message.");
        }
    }

    public static void A07(C26282Cwd cwd, int i) {
        if ((cwd.A02 & 7) != i) {
            throw new C23659BnS();
        }
    }

    public static void A08(C26282Cwd cwd, C26105CsP csP, EAO eao, Object obj) {
        int i = cwd.A00;
        cwd.A00 = ((cwd.A02 >>> 3) << 3) | 4;
        try {
            eao.Bjl(cwd, csP, obj);
            if (cwd.A02 != cwd.A00) {
                throw BE6.A0c("Failed to parse the message.");
            }
        } finally {
            cwd.A00 = i;
        }
    }

    public static void A09(C26282Cwd cwd, C26105CsP csP, EAO eao, Object obj) {
        C25857CnL cnL = cwd.A03;
        int A0H = cnL.A0H();
        int i = cnL.A00;
        if (i < 100) {
            int A0I = cnL.A0I(A0H);
            cnL.A00 = i + 1;
            eao.Bjl(cwd, csP, obj);
            cnL.A0R(0);
            cnL.A00--;
            cnL.A0S(A0I);
            return;
        }
        throw BE6.A0c("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0A() {
        /*
            r3 = this;
            int r2 = r3.A01
            if (r2 == 0) goto L_0x0013
            r3.A02 = r2
            r0 = 0
            r3.A01 = r0
        L_0x0009:
            int r1 = r3.A00
            int r0 = r2 >>> 3
            if (r2 != r1) goto L_0x0012
        L_0x000f:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0012:
            return r0
        L_0x0013:
            X.CnL r0 = r3.A03
            int r2 = r0.A0G()
            r3.A02 = r2
            if (r2 == 0) goto L_0x000f
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26282Cwd.A0A():int");
    }

    public void A0D(List list) {
        int i;
        int A012;
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C25857CnL cnL = this.A03;
                    A012 = A01(cnL);
                    do {
                        bm7.BBE(cnL.A0B());
                    } while (cnL.A0A() < A012);
                }
                throw new C23659BnS();
            }
            do {
                C25857CnL cnL2 = this.A03;
                bm7.BBE(cnL2.A0B());
                if (!cnL2.A0T()) {
                    i = cnL2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C25857CnL cnL3 = this.A03;
                A012 = A01(cnL3);
                do {
                    BE7.A11(cnL3.A0B(), list);
                } while (cnL3.A0A() < A012);
            }
            throw new C23659BnS();
        }
        do {
            C25857CnL cnL4 = this.A03;
            BE7.A11(cnL4.A0B(), list);
            if (!cnL4.A0T()) {
                i = cnL4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public void A0E(List list) {
        int A0G;
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C25857CnL cnL = this.A03;
                        bm7.BBE(cnL.A0C());
                        if (!cnL.A0T()) {
                            A0G = cnL.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw new C23659BnS();
            }
            C25857CnL cnL2 = this.A03;
            int A002 = A00(cnL2);
            do {
                bm7.BBE(cnL2.A0C());
            } while (cnL2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C25857CnL cnL3 = this.A03;
                    BE7.A11(cnL3.A0C(), list);
                    if (!cnL3.A0T()) {
                        A0G = cnL3.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw new C23659BnS();
        }
        C25857CnL cnL4 = this.A03;
        int A003 = A00(cnL4);
        do {
            BE7.A11(cnL4.A0C(), list);
        } while (cnL4.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public void A0H(List list) {
        int i;
        int A012;
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C25857CnL cnL = this.A03;
                    A012 = A01(cnL);
                    do {
                        bm7.BBE(cnL.A0D());
                    } while (cnL.A0A() < A012);
                }
                throw new C23659BnS();
            }
            do {
                C25857CnL cnL2 = this.A03;
                bm7.BBE(cnL2.A0D());
                if (!cnL2.A0T()) {
                    i = cnL2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C25857CnL cnL3 = this.A03;
                A012 = A01(cnL3);
                do {
                    BE7.A11(cnL3.A0D(), list);
                } while (cnL3.A0A() < A012);
            }
            throw new C23659BnS();
        }
        do {
            C25857CnL cnL4 = this.A03;
            BE7.A11(cnL4.A0D(), list);
            if (!cnL4.A0T()) {
                i = cnL4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public void A0J(List list) {
        int A0G;
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C25857CnL cnL = this.A03;
                        bm7.BBE(cnL.A0E());
                        if (!cnL.A0T()) {
                            A0G = cnL.A0G();
                        } else {
                            return;
                        }
                    } while (A0G == this.A02);
                }
                throw new C23659BnS();
            }
            C25857CnL cnL2 = this.A03;
            int A002 = A00(cnL2);
            do {
                bm7.BBE(cnL2.A0E());
            } while (cnL2.A0A() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C25857CnL cnL3 = this.A03;
                    BE7.A11(cnL3.A0E(), list);
                    if (!cnL3.A0T()) {
                        A0G = cnL3.A0G();
                    } else {
                        return;
                    }
                } while (A0G == this.A02);
            }
            throw new C23659BnS();
        }
        C25857CnL cnL4 = this.A03;
        int A003 = A00(cnL4);
        do {
            BE7.A11(cnL4.A0E(), list);
        } while (cnL4.A0A() < A003);
        return;
        this.A01 = A0G;
    }

    public void A0L(List list) {
        int i;
        int A012;
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C25857CnL cnL = this.A03;
                    A012 = A01(cnL);
                    do {
                        bm7.BBE(cnL.A0F());
                    } while (cnL.A0A() < A012);
                }
                throw new C23659BnS();
            }
            do {
                C25857CnL cnL2 = this.A03;
                bm7.BBE(cnL2.A0F());
                if (!cnL2.A0T()) {
                    i = cnL2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C25857CnL cnL3 = this.A03;
                A012 = A01(cnL3);
                do {
                    BE7.A11(cnL3.A0F(), list);
                } while (cnL3.A0A() < A012);
            }
            throw new C23659BnS();
        }
        do {
            C25857CnL cnL4 = this.A03;
            BE7.A11(cnL4.A0F(), list);
            if (!cnL4.A0T()) {
                i = cnL4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public void A0N(List list) {
        int i;
        int A012;
        if (list instanceof Bm7) {
            Bm7 bm7 = (Bm7) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C25857CnL cnL = this.A03;
                    A012 = A01(cnL);
                    do {
                        bm7.BBE(cnL.A0H());
                    } while (cnL.A0A() < A012);
                }
                throw new C23659BnS();
            }
            do {
                C25857CnL cnL2 = this.A03;
                bm7.BBE(cnL2.A0H());
                if (!cnL2.A0T()) {
                    i = cnL2.A0G();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C25857CnL cnL3 = this.A03;
                A012 = A01(cnL3);
                do {
                    BE7.A11(cnL3.A0H(), list);
                } while (cnL3.A0A() < A012);
            }
            throw new C23659BnS();
        }
        do {
            C25857CnL cnL4 = this.A03;
            BE7.A11(cnL4.A0H(), list);
            if (!cnL4.A0T()) {
                i = cnL4.A0G();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A05(A012);
    }

    public C26282Cwd(C25857CnL cnL) {
        Charset charset = CIC.A04;
        this.A03 = cnL;
        cnL.A01 = this;
    }

    public static int A00(C25857CnL cnL) {
        int A0H = cnL.A0H();
        A06(A0H);
        return cnL.A0A() + A0H;
    }

    public static int A01(C25857CnL cnL) {
        return cnL.A0A() + cnL.A0H();
    }
}
