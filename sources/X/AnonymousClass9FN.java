package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FN  reason: invalid class name */
public final class AnonymousClass9FN extends AnonymousClass9CP {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C29621ca A03;
    public final C29621ca A04;
    public final AnonymousClass9DN A05;
    public final AnonymousClass9DG A06;
    public final AnonymousClass9DD A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public AnonymousClass9FN(C29621ca r43, AnonymousClass9F6 r44) {
        StringBuilder A10;
        Object obj;
        String A0u;
        AnonymousClass9DD A012;
        C29621ca r9 = r43;
        AnonymousClass9F6 r2 = r44;
        int A0G = C72453Mb.A0G(r9, r2, 1);
        C29621ca A002 = AnonymousClass9F6.A00(r9, r2);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = new String[3];
        strArr[0] = "ACTIVE";
        strArr[1] = "ARCHIVED";
        List A0O = C18070vi.A0O("INACTIVE", strArr, A0G);
        String[] strArr2 = new String[3];
        strArr2[0] = "account";
        strArr2[1] = "offer";
        strArr2[A0G] = "state";
        String A072 = A0s.A07(r9, A0O, strArr2);
        if (A072 != null) {
            this.A0C = A072;
            String[] strArr3 = new String[A0G];
            strArr3[0] = "0";
            List A0O2 = C18070vi.A0O("1", strArr3, 1);
            String[] A1b = C17880vN.A1b("account", "offer", 5, 1);
            A1b[A0G] = "eligibility";
            A1b[3] = "receiver";
            A1b[4] = "usync_pay_eligible_offers_includes_current_offer_id";
            this.A0A = A0s.A07(r9, A0O2, A1b);
            String[] strArr4 = new String[A0G];
            strArr4[0] = "account";
            strArr4[1] = "action";
            Class<String> cls = String.class;
            String[] strArr5 = new String[A0G];
            strArr5[0] = "account";
            Long A0Z = AnonymousClass8BW.A0Z("action", strArr5, 1);
            Long A0j = AnonymousClass8BU.A0j();
            C62672rm r23 = A0s;
            Object A052 = r23.A05(A002, cls, A0Z, A0j, (Object) null, strArr5, false);
            if (A052 != null) {
                C29621ca r24 = r9;
                if (r23.A05(r24, cls, A0Z, A0j, A052, strArr4, true) != null) {
                    String[] A1b2 = C17880vN.A1b("account", "offer", 3, 1);
                    A1b2[A0G] = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                    Class cls2 = Long.TYPE;
                    C62672rm r28 = A0s;
                    C29621ca r29 = r9;
                    Long l = A0j;
                    if (r28.A05(r29, cls2, 1L, l, (Object) null, A1b2, false) != null) {
                        String[] A1b3 = C17880vN.A1b("account", "offer", 3, 1);
                        A1b3[A0G] = "title";
                        C62672rm r34 = A0s;
                        C29621ca r35 = r9;
                        Class<String> cls3 = cls;
                        Long l2 = A0j;
                        String str = (String) r34.A05(r35, cls3, 1, l2, (Object) null, A1b3, false);
                        if (str != null) {
                            this.A0E = str;
                            String[] A1b4 = C17880vN.A1b("account", "offer", 3, 1);
                            A1b4[A0G] = "description";
                            String str2 = (String) r34.A05(r35, cls3, 1, l2, (Object) null, A1b4, false);
                            if (str2 != null) {
                                this.A09 = str2;
                                String[] A1b5 = C17880vN.A1b("account", "offer", 3, 1);
                                A1b5[A0G] = "fine_print_url";
                                String str3 = (String) r34.A05(r35, cls3, 1, l2, (Object) null, A1b5, false);
                                if (str3 != null) {
                                    this.A0B = str3;
                                    String[] A1b6 = C17880vN.A1b("account", "offer", 3, 1);
                                    A1b6[A0G] = "terms_url";
                                    String str4 = (String) r34.A05(r35, cls3, 1, l2, (Object) null, A1b6, false);
                                    if (str4 != null) {
                                        this.A0D = str4;
                                        String[] A1b7 = C17880vN.A1b("account", "offer", 3, 1);
                                        A1b7[A0G] = "redeem_limit";
                                        Number number = (Number) r28.A05(r29, cls2, 1L, l, (Object) null, A1b7, false);
                                        if (number != null) {
                                            this.A01 = number.longValue();
                                            String[] A1b8 = C17880vN.A1b("account", "offer", 3, 1);
                                            A1b8[A0G] = "start_ts";
                                            Number number2 = (Number) r28.A05(r29, cls2, 1L, l, (Object) null, A1b8, false);
                                            if (number2 != null) {
                                                this.A02 = number2.longValue();
                                                String[] A1b9 = C17880vN.A1b("account", "offer", 3, 1);
                                                A1b9[A0G] = "end_ts";
                                                Number number3 = (Number) r28.A05(r29, cls2, 1L, l, (Object) null, A1b9, false);
                                                if (number3 != null) {
                                                    this.A00 = number3.longValue();
                                                    String[] A1b10 = C17880vN.A1b("account", "offer", 3, 1);
                                                    A1b10[A0G] = "version";
                                                    if (r28.A05(r29, cls2, 1L, l, (Object) null, A1b10, false) != null) {
                                                        String[] A1b11 = C17880vN.A1b("account", "offer", 5, 1);
                                                        A1b11[A0G] = "eligibility";
                                                        A1b11[3] = "receiver";
                                                        A1b11[4] = "max_from_sender";
                                                        this.A08 = (Long) r23.A05(r24, cls2, C17890vO.A0L(), A0j, (Object) null, A1b11, false);
                                                        A5x a5x = A5x.A00;
                                                        String[] A1b12 = C17880vN.A1b("account", "offer", 3, 1);
                                                        A1b12[A0G] = "offer_amount";
                                                        C29621ca r13 = r9;
                                                        int i = 0;
                                                        while (true) {
                                                            C29621ca A0Q = AnonymousClass8BS.A0Q(r13, A1b12, i);
                                                            if (A0Q == null) {
                                                                AnonymousClass8BY.A11(r13, A0s, A1b12, i);
                                                                break;
                                                            }
                                                            i++;
                                                            r13 = A0Q;
                                                            if (i >= 3) {
                                                                C18070vi.A0d(a5x, 0);
                                                                AnonymousClass9DD A013 = A5x.A01(A0Q, A0s);
                                                                if (A013 != null) {
                                                                    this.A07 = A013;
                                                                    C29621ca r4 = A002;
                                                                    C18070vi.A0d(r4, 1);
                                                                    AnonymousClass9DG A003 = A5x.A00(r9, r4, A0s);
                                                                    if (A003 != null) {
                                                                        this.A06 = A003;
                                                                        String[] A1b13 = C17880vN.A1b("account", "offer", 5, 1);
                                                                        A1b13[A0G] = "eligibility";
                                                                        A1b13[3] = "payment";
                                                                        A1b13[4] = "min_amount";
                                                                        C29621ca r15 = r9;
                                                                        int i2 = 0;
                                                                        while (true) {
                                                                            C29621ca A0Q2 = AnonymousClass8BS.A0Q(r15, A1b13, i2);
                                                                            if (A0Q2 == null) {
                                                                                A10 = AnonymousClass000.A10();
                                                                                AnonymousClass8BY.A12(r15, A10, A1b13, i2);
                                                                                break;
                                                                            }
                                                                            i2++;
                                                                            r15 = A0Q2;
                                                                            if (i2 >= 4) {
                                                                                String str5 = A1b13[4];
                                                                                List A0R = A0Q2.A0R(str5);
                                                                                ArrayList A0t = C108965cb.A0t(A0R);
                                                                                Iterator it = A0R.iterator();
                                                                                while (it.hasNext()) {
                                                                                    C29621ca A0R2 = AnonymousClass8BW.A0R(it, 1);
                                                                                    if (A0s.A09(A0R2, "min_amount") && (A012 = A5x.A01(A0R2, A0s)) != null) {
                                                                                        A0t.add(new AnonymousClass9DN(A0R2, A012));
                                                                                    }
                                                                                }
                                                                                if (AnonymousClass8BR.A06(A0t) < 0) {
                                                                                    StringBuilder A102 = AnonymousClass000.A10();
                                                                                    AnonymousClass8BY.A1K(str5, A102, A0t);
                                                                                    A0u = AnonymousClass8BV.A0u(A102, '.', 0);
                                                                                } else if (AnonymousClass8BR.A06(A0t) > 1) {
                                                                                    A10 = AnonymousClass000.A10();
                                                                                    AnonymousClass8BY.A1J(str5, A10, A0t);
                                                                                    A10.append(1);
                                                                                    A10.append('.');
                                                                                } else {
                                                                                    obj = !A0t.isEmpty() ? A0t.get(0) : obj;
                                                                                }
                                                                            }
                                                                        }
                                                                        A0u = A10.toString();
                                                                        A0s.A00 = A0u;
                                                                        obj = null;
                                                                        this.A05 = (AnonymousClass9DN) obj;
                                                                        this.A00 = r9;
                                                                        String[] A1b14 = C17880vN.A1b("account", "offer", A0G, 1);
                                                                        C29621ca A0L = r9.A0L(A1b14[0]);
                                                                        String str6 = A1b14[1];
                                                                        List A0R3 = A0L.A0R(str6);
                                                                        ArrayList A0t2 = C108965cb.A0t(A0R3);
                                                                        Iterator it2 = A0R3.iterator();
                                                                        while (it2.hasNext()) {
                                                                            AnonymousClass8BX.A1M(A0t2, it2);
                                                                        }
                                                                        if (AnonymousClass8BR.A06(A0t2) < 1) {
                                                                            StringBuilder A103 = AnonymousClass000.A10();
                                                                            AnonymousClass8BY.A1K(str6, A103, A0t2);
                                                                            throw C198999zG.A01(A103);
                                                                        } else if (AnonymousClass8BR.A06(A0t2) <= 1) {
                                                                            this.A04 = AnonymousClass8BR.A0m(A0t2, 0);
                                                                            String[] A1b15 = C17880vN.A1b("account", "offer", 4, 1);
                                                                            A1b15[A0G] = "eligibility";
                                                                            A1b15[3] = "receiver";
                                                                            int i3 = 0;
                                                                            do {
                                                                                r9 = r9.A0L(A1b15[i3]);
                                                                                i3++;
                                                                            } while (i3 < 3);
                                                                            String str7 = A1b15[3];
                                                                            List A0R4 = r9.A0R(str7);
                                                                            ArrayList A0t3 = C108965cb.A0t(A0R4);
                                                                            Iterator it3 = A0R4.iterator();
                                                                            while (it3.hasNext()) {
                                                                                AnonymousClass8BX.A1M(A0t3, it3);
                                                                            }
                                                                            if (AnonymousClass8BR.A06(A0t3) < 1) {
                                                                                StringBuilder A104 = AnonymousClass000.A10();
                                                                                AnonymousClass8BY.A1K(str7, A104, A0t3);
                                                                                throw C198999zG.A01(A104);
                                                                            } else if (AnonymousClass8BR.A06(A0t3) <= 1) {
                                                                                this.A03 = AnonymousClass8BR.A0m(A0t3, 0);
                                                                                return;
                                                                            } else {
                                                                                StringBuilder A105 = AnonymousClass000.A10();
                                                                                AnonymousClass8BY.A1J(str7, A105, A0t3);
                                                                                throw C198999zG.A01(A105);
                                                                            }
                                                                        } else {
                                                                            StringBuilder A106 = AnonymousClass000.A10();
                                                                            AnonymousClass8BY.A1J(str6, A106, A0t2);
                                                                            throw C198999zG.A01(A106);
                                                                        }
                                                                    } else {
                                                                        throw AnonymousClass1O9.A00(A0s);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw AnonymousClass1O9.A00(A0s);
                                                    }
                                                    throw AnonymousClass1O9.A00(A0s);
                                                }
                                                throw AnonymousClass1O9.A00(A0s);
                                            }
                                            throw AnonymousClass1O9.A00(A0s);
                                        }
                                        throw AnonymousClass1O9.A00(A0s);
                                    }
                                    throw AnonymousClass1O9.A00(A0s);
                                }
                                throw AnonymousClass1O9.A00(A0s);
                            }
                            throw AnonymousClass1O9.A00(A0s);
                        }
                        throw AnonymousClass1O9.A00(A0s);
                    }
                    throw AnonymousClass1O9.A00(A0s);
                }
                throw AnonymousClass1O9.A00(A0s);
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
