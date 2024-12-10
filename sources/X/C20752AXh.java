package X;

import android.content.Intent;

/* renamed from: X.AXh  reason: case insensitive filesystem */
public class C20752AXh implements BDG {
    public final C18000vb A00;
    public final C18030ve A01;
    public final A7U A02;
    public final AXS A03;
    public final A27 A04;

    public String BPa(int i) {
        return null;
    }

    public int BPb(C85754Op r2, int i) {
        return -1;
    }

    public String BPc(int i) {
        return null;
    }

    public int BRO(int i) {
        return A02((C196259ui) null, i).A00;
    }

    public String BYH(int i) {
        return null;
    }

    public boolean BfE(int i) {
        return false;
    }

    public boolean BfF(int i) {
        return false;
    }

    public boolean BfG(int i) {
        return false;
    }

    public boolean BfI(int i) {
        return false;
    }

    public boolean BfQ(int i) {
        return false;
    }

    public boolean BfR(int i) {
        return false;
    }

    public boolean BfS(int i) {
        return false;
    }

    public boolean BfW(int i) {
        return false;
    }

    public boolean BfX(int i) {
        return false;
    }

    public boolean Bfo(int i) {
        return false;
    }

    public boolean Bfp(int i) {
        return false;
    }

    public boolean Bg3(int i) {
        return false;
    }

    public boolean Bgk(int i) {
        return i == 11455 || i == 11502;
    }

    public boolean Bgq(int i) {
        return false;
    }

    public int BjI() {
        return 100000;
    }

    public int BjJ() {
        return 10;
    }

    public static int A00(C196259ui r3, int i) {
        int i2;
        int i3;
        if (i <= 0 && r3 != null) {
            synchronized (r3) {
                i2 = r3.A01;
            }
            synchronized (r3) {
                i3 = r3.A02;
            }
            int i4 = r3.A00;
            if (i2 > 0) {
                return i2;
            }
            if (i3 > 0) {
                return i3;
            }
            if (i4 > 0) {
                return i4;
            }
        }
        return i;
    }

    public static boolean A01(AnonymousClass91T r4, String str, int i, boolean z) {
        Intent A0A;
        C21425Ajs ajs = new C21425Ajs((Object) r4, 27);
        if (i != 404) {
            if (i == 440) {
                StringBuilder A0g = AnonymousClass8BX.A0g(r4, "PAY: ", " op: ");
                A0g.append(str);
                C17890vO.A19(A0g, " tos not accepted; showTosAndFinish");
                A0A = AnonymousClass8BY.A08(r4, false);
                r4.A4v(A0A);
                ajs.run();
                r4.A3q(A0A, true);
                return true;
            } else if (i == 442) {
                StringBuilder A0g2 = AnonymousClass8BX.A0g(r4, "PAY: ", " op: ");
                A0g2.append(str);
                C17890vO.A19(A0g2, " tos v2 not accepted; showTosAndFinish");
                Intent A08 = AnonymousClass8BY.A08(r4, true);
                r4.A4v(A08);
                r4.startActivityForResult(A08, 1000);
                return true;
            } else if (i != 443) {
                return false;
            } else {
                StringBuilder A0g3 = AnonymousClass8BX.A0g(r4, "PAY: ", " op: ");
                A0g3.append(str);
                C17890vO.A19(A0g3, " payment unsupported for client version");
                ajs.run();
                A0A = C17880vN.A0A();
                A0A.setClassName(r4.getPackageName(), "com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity");
                A0A.addFlags(335544320);
            }
        } else if (!z) {
            return false;
        } else {
            StringBuilder A0g4 = AnonymousClass8BX.A0g(r4, "PAY: ", " op: ");
            A0g4.append(str);
            A0g4.append(" payment account error: ");
            A0g4.append(i);
            C17890vO.A19(A0g4, "; restartPaymentsAccountSetupAndFinish");
            ajs.run();
            A0A = C17880vN.A0A();
            A0A.setClassName(r4.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
        }
        r4.A4v(A0A);
        r4.A3q(A0A, true);
        return true;
    }

    public String BRN(String str, int i) {
        String A012 = this.A04.A01(i);
        if (A012 != null) {
            return A012;
        }
        return str;
    }

    public void BcM(String str) {
        if (String.valueOf(11456).equals(str) || String.valueOf(11471).equals(str)) {
            C17900vP.A0f("PAY: IndiaUpiErrorHelper/handlePaymentTransactionError handle:", str, AnonymousClass000.A10());
            this.A03.A0L();
            A7U a7u = this.A02;
            a7u.A04.A07.add("done");
            a7u.A0A();
        }
    }

    public boolean BeQ(int i) {
        return AnonymousClass000.A1T(i, 11510);
    }

    public boolean BeU(int i) {
        return AnonymousClass000.A1T(i, 10756);
    }

    public boolean Bf9(int i) {
        return AnonymousClass000.A1T(i, 11482);
    }

    public boolean BfC(int i) {
        return AnonymousClass000.A1T(i, 11459);
    }

    public boolean BfD(int i) {
        return AnonymousClass000.A1T(i, 11504);
    }

    public boolean BfH(int i) {
        return AnonymousClass000.A1T(i, 11503);
    }

    public boolean BfU(int i) {
        return AnonymousClass000.A1T(i, 11468);
    }

    public C20752AXh(C18000vb r1, C18030ve r2, A7U a7u, AXS axs, A27 a27) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = a7u;
        this.A04 = a27;
        this.A03 = axs;
    }

    public C19967A1c A02(C196259ui r6, int i) {
        String str;
        int i2;
        Object obj;
        int A002 = A00(r6, i);
        if (C18020vd.A05(C18040vf.A02, this.A01, 698)) {
            str = this.A04.A03(String.valueOf(A002));
        } else {
            str = null;
        }
        if (A002 == 443) {
            i2 = 2131894180;
        } else {
            if (!(A002 == 6 || A002 == 7)) {
                if (A002 == 405) {
                    i2 = 2131893962;
                } else if (A002 == 406) {
                    i2 = 2131893959;
                } else if (A002 == 409) {
                    i2 = 2131893960;
                } else if (A002 != 410) {
                    if (A002 != 21137 && A002 != 21138) {
                        switch (A002) {
                            case -2:
                                break;
                            case 400:
                            case 500:
                            case 4002:
                            case 11500:
                            case 2826004:
                                i2 = 2131893867;
                                break;
                            case 403:
                                i2 = 2131894030;
                                break;
                            case 426:
                                i2 = 2131893958;
                                break;
                            case 460:
                                i2 = 2131893963;
                                break;
                            case 503:
                            case 10702:
                            case 11474:
                            case 11484:
                                i2 = 2131893805;
                                break;
                            case 10780:
                            case 11497:
                            case 11537:
                            case 11540:
                                i2 = 2131893937;
                                break;
                            case 17009:
                                i2 = 2131897554;
                                break;
                            case 21157:
                            case 21164:
                                i2 = 2131893640;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = 2131893642;
                    }
                } else {
                    i2 = 2131893961;
                }
            }
            i2 = 2131892931;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: getErrorString errorCode: ");
        A10.append(A002);
        A10.append(" states last error: ");
        if (r6 != null) {
            obj = Integer.valueOf(r6.A00);
        } else {
            obj = "null";
        }
        A10.append(obj);
        C17900vP.A0j(" resId returned: ", A10, i2);
        return new C19967A1c(i2, str);
    }

    public String BPd(int i) {
        if (i != 2826003) {
            return null;
        }
        C18000vb r4 = this.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, 5);
        return r4.A0K(A1a, 2131755319, 5);
    }

    public boolean CMO(int i) {
        if (Bgk(i) || i == 11503 || i == 11504 || i == 11482 || i == 11468 || i == 10756) {
            return false;
        }
        return true;
    }
}
