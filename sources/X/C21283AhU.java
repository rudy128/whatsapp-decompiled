package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AhU  reason: case insensitive filesystem */
public class C21283AhU implements C22470B9c {
    public final int A00;
    public final Object A01;

    public C21283AhU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Object[] objArr, int i, int i2, Object obj) {
        objArr[i2] = new C21283AhU(obj, i);
    }

    public final Object BCF(C29621ca r32, C62672rm r33) {
        String str;
        AnonymousClass9DG r21;
        C29621ca A0m;
        String A0u;
        AnonymousClass9DE r4;
        C29621ca A0m2;
        AnonymousClass9E1 A0I;
        C178299Co A0D;
        C29621ca r15 = r32;
        C62672rm r14 = r33;
        switch (this.A00) {
            case 0:
                int A17 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "account")) {
                    return null;
                }
                String[] strArr = new String[2];
                strArr[0] = "ACTIVE";
                List A0O = C18070vi.A0O("INACTIVE", strArr, A17);
                String[] strArr2 = new String[2];
                strArr2[0] = "merchant";
                strArr2[A17] = "status";
                String A07 = r14.A07(r15, A0O, strArr2);
                String[] strArr3 = new String[2];
                strArr3[0] = "merchant";
                strArr3[A17] = "gateway_name";
                AnonymousClass9DN r9 = null;
                String str2 = (String) r14.A05(r15, String.class, C108975cc.A0X(), AnonymousClass8BV.A0g(), (Object) null, strArr3, false);
                String[] strArr4 = new String[A17];
                C29621ca A0Z = AnonymousClass8BT.A0Z(r15, "merchant", strArr4);
                if (A0Z == null) {
                    AnonymousClass8BY.A11(r15, r14, strArr4, 0);
                } else {
                    String[] strArr5 = new String[2];
                    strArr5[0] = "installment_options";
                    strArr5[A17] = "installment_option";
                    ArrayList A08 = r14.A08(A0Z, new C21280AhR(6), strArr5, 0, 2);
                    if (A08 != null) {
                        r9 = new AnonymousClass9DN(A0Z, (List) A08, 12);
                    }
                }
                String[] strArr6 = new String[A17];
                C29621ca A0Z2 = AnonymousClass8BT.A0Z(r15, "merchant", strArr6);
                if (A0Z2 == null) {
                    AnonymousClass8BY.A11(r15, r14, strArr6, 0);
                    r21 = null;
                } else {
                    r21 = null;
                    if (r14.A09(A0Z2, "merchant")) {
                        String[] strArr7 = new String[2];
                        strArr7[0] = "0";
                        List A0O2 = C18070vi.A0O("1", strArr7, A17);
                        String[] strArr8 = new String[2];
                        strArr8[0] = "settings";
                        strArr8[A17] = "buyer_initiated_payments_enabled";
                        String A072 = r14.A07(A0Z2, A0O2, strArr8);
                        if (A072 != null) {
                            List A0o = AnonymousClass8BX.A0o("0", "1", 2, A17);
                            String[] strArr9 = new String[2];
                            strArr9[0] = "settings";
                            strArr9[A17] = "hpp_enabled";
                            String A073 = r14.A07(A0Z2, A0o, strArr9);
                            String[] strArr10 = new String[A17];
                            strArr10[0] = "settings";
                            ArrayList A0u2 = AnonymousClass8BU.A0u(A0Z2, r14, new C21280AhR(9), strArr10);
                            if (!(A0u2 == null || (A0m = AnonymousClass8BR.A0m(A0u2, 0)) == null)) {
                                r21 = new AnonymousClass9DG(A0m, A0Z2, A072, A073, 12);
                            }
                        }
                    }
                }
                String[] strArr11 = new String[A17];
                strArr11[0] = "merchant";
                String str3 = strArr11[0];
                List A0R = r15.A0R(str3);
                ArrayList A0t = C108965cb.A0t(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    AnonymousClass8BX.A1M(A0t, it);
                }
                if (AnonymousClass8BR.A06(A0t) < 1) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1K(str3, A10, A0t);
                    A0u = AnonymousClass8BV.A0u(A10, '.', 1);
                } else if (AnonymousClass8BR.A06(A0t) > 1) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1J(str3, A102, A0t);
                    A0u = AnonymousClass8BV.A0u(A102, '.', 1);
                } else {
                    C29621ca A0m3 = AnonymousClass8BR.A0m(A0t, 0);
                    if (A0m3 != null) {
                        return new C178379Cw(A0m3, r15, r9, r21, A07, str2);
                    }
                    return null;
                }
                r14.A00 = A0u;
                return null;
            case 1:
                int A1U = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (!r14.A09(r15, "custom_payment_method")) {
                    return null;
                }
                String[] strArr12 = new String[A1U];
                strArr12[0] = "ttl";
                Number number = (Number) r14.A05(r15, Long.TYPE, C108975cc.A0X(), AnonymousClass8BU.A0j(), (Object) null, strArr12, false);
                if (number == null) {
                    return null;
                }
                long longValue = number.longValue();
                AnonymousClass9D9 A03 = A8Z.A03(r15, r14);
                if (A03 != null) {
                    return new AnonymousClass9DK(r15, A03, longValue);
                }
                return null;
            case 2:
                int A172 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "price")) {
                    return null;
                }
                String[] strArr13 = new String[2];
                AnonymousClass8BR.A1K(strArr13, 0, A172, "price_status");
                String str4 = (String) r14.A04(r15, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "provided", strArr13);
                if (str4 == null) {
                    return null;
                }
                String[] strArr14 = new String[A172];
                strArr14[0] = "subtotal";
                String[] strArr15 = new String[A172];
                strArr15[0] = "currency";
                String[] strArr16 = new String[A172];
                strArr16[0] = "total";
                return new C178469Df(r15, (AnonymousClass9CX) C21280AhR.A00(r15, r14, strArr14, 34), (AnonymousClass9CX) C21280AhR.A00(r15, r14, strArr16, 36), (AnonymousClass9CY) C21280AhR.A00(r15, r14, strArr15, 35), str4);
            case 3:
                boolean A173 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "price")) {
                    return null;
                }
                String[] strArr17 = new String[2];
                AnonymousClass8BR.A1K(strArr17, 0, A173 ? 1 : 0, "price_status");
                String str5 = (String) r14.A04(r15, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "not_provided", strArr17);
                if (str5 != null) {
                    return new C178459De(r15, str5);
                }
                return null;
            case 4:
                int A174 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "product")) {
                    return null;
                }
                String[] strArr18 = new String[A174];
                strArr18[0] = "max_available";
                AnonymousClass9CX r5 = (AnonymousClass9CX) C21280AhR.A00(r15, r14, strArr18, 43);
                String[] strArr19 = new String[2];
                strArr19[0] = "variant_info";
                strArr19[A174] = "properties";
                AnonymousClass9DN r10 = (AnonymousClass9DN) C21280AhR.A00(r15, r14, strArr19, 19);
                String[] strArr20 = new String[2];
                strArr20[0] = "variant_info";
                strArr20[A174] = "types";
                AnonymousClass9DN r92 = (AnonymousClass9DN) C21280AhR.A00(r15, r14, strArr20, 30);
                String[] strArr21 = new String[2];
                strArr21[0] = "variant_info";
                strArr21[A174] = "listing_details";
                AnonymousClass9DL r6 = (AnonymousClass9DL) C21280AhR.A00(r15, r14, strArr21, 39);
                String[] strArr22 = new String[2];
                strArr22[0] = "variant_info";
                strArr22[A174] = "availability";
                AnonymousClass9DN r2 = (AnonymousClass9DN) C21280AhR.A00(r15, r14, strArr22, 45);
                String[] strArr23 = new String[A174];
                strArr23[0] = "variant_info";
                ArrayList A0u3 = AnonymousClass8BU.A0u(r15, r14, new C21280AhR(46), strArr23);
                if (A0u3 == null || (A0m2 = AnonymousClass8BR.A0m(A0u3, 0)) == null) {
                    r4 = null;
                } else {
                    r4 = new AnonymousClass9DE(A0m2, r15, r10, r92, r2, r6);
                }
                C22470B9c[] b9cArr = new C22470B9c[2];
                b9cArr[0] = C21170Aff.A00;
                Object A06 = r14.A06(r15, "ItemDetails|ItemDetailsWithStatusInfo", C18070vi.A0O(C21171Afg.A00, b9cArr, A174), new String[0]);
                if (A06 != null) {
                    return new AnonymousClass9DL(r15, r5, r4, (C22473B9f) A06);
                }
                return null;
            case 5:
                int A175 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "alias")) {
                    return null;
                }
                String[] A1a = AnonymousClass8BS.A1a(A175, 0);
                Class<String> cls = String.class;
                Long A0X = C108975cc.A0X();
                Long A0c = AnonymousClass8BV.A0c();
                String str6 = (String) r14.A05(r15, cls, A0X, A0c, (Object) null, A1a, false);
                if (!r14.A09(r15, "alias")) {
                    return null;
                }
                String[] strArr24 = new String[2];
                strArr24[0] = "mobile_number";
                List A0O3 = C18070vi.A0O("numeric_id", strArr24, A175);
                String[] strArr25 = new String[A175];
                strArr25[0] = "alias_type";
                String A074 = r14.A07(r15, A0O3, strArr25);
                if (A074 == null) {
                    return null;
                }
                String[] strArr26 = new String[13];
                AnonymousClass8BY.A1T(strArr26, A175);
                List A0O4 = C18070vi.A0O("unknown", strArr26, 12);
                String[] strArr27 = new String[A175];
                strArr27[0] = "alias_status";
                String A075 = r14.A07(r15, A0O4, strArr27);
                String[] strArr28 = new String[A175];
                strArr28[0] = "alias_value";
                String str7 = (String) r14.A05(r15, cls, 8L, AnonymousClass8BV.A0b(), (Object) null, strArr28, false);
                if (str7 == null) {
                    return null;
                }
                String[] strArr29 = new String[A175];
                strArr29[0] = "alias_id";
                String str8 = (String) r14.A05(r15, cls, A0X, A0c, (Object) null, strArr29, false);
                if (str8 != null) {
                    return new AnonymousClass9DH(r15, new C178369Cv(r15, A074, A075, str7, str8, 2), str6);
                }
                return null;
            case 6:
            case 7:
                int A1U2 = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (!AnonymousClass8BR.A1R(r15, r14)) {
                    return null;
                }
                C62672rm r52 = r14;
                C29621ca r62 = r15;
                Number number2 = (Number) r52.A05(r62, Long.TYPE, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, AnonymousClass8BS.A1S(A1U2), false);
                if (number2 == null) {
                    return null;
                }
                long longValue2 = number2.longValue();
                Class<String> cls2 = String.class;
                if (r52.A05(r62, cls2, C108975cc.A0X(), AnonymousClass8BV.A0j(), (Object) null, AnonymousClass8BS.A1U(A1U2), false) == null) {
                    return null;
                }
                String[] strArr30 = new String[A1U2];
                strArr30[0] = "parameters";
                return new C178329Cr(r15, (String) r52.A05(r62, cls2, C17890vO.A0L(), AnonymousClass8BV.A0l(), (Object) null, strArr30, false), longValue2);
            case 8:
            case 10:
            case 13:
            case 15:
                C18070vi.A0n(this.A01, r15, r14);
                return A8H.A02(r15, r14);
            case 9:
            case 12:
            case 14:
            case 17:
                C18070vi.A0n(this.A01, r15, r14);
                return A8H.A04(r15, r14);
            case 11:
            case 16:
                C18070vi.A0n(this.A01, r15, r14);
                return A8H.A03(r15, r14);
            case 18:
            case 30:
            case 34:
            case 41:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A07(r15, r14);
            case 20:
                int A176 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "group")) {
                    return null;
                }
                String[] A1b = AnonymousClass8BR.A1b();
                A1b[0] = "e2ee_migration";
                A1b[A176] = "regular";
                List A0O5 = C18070vi.A0O("rtc", A1b, 2);
                String[] strArr31 = new String[A176];
                strArr31[0] = "create_ctx";
                String A076 = r14.A07(r15, A0O5, strArr31);
                String[] strArr32 = new String[A176];
                strArr32[0] = "key";
                C178239Ci r42 = null;
                String str9 = (String) r14.A05(r15, String.class, C108975cc.A0X(), 65536L, (Object) null, strArr32, false);
                if (str9 != null) {
                    r42 = new C178239Ci(r15, A076, str9, 5);
                }
                C22470B9c[] b9cArr2 = new C22470B9c[4];
                b9cArr2[0] = C21286AhX.A00;
                b9cArr2[A176] = C21197Ag6.A00;
                b9cArr2[2] = C21198Ag7.A00;
                Object A062 = r14.A06(r15, "GroupInfo|TruncatedGroupInfo|GroupForbidden|GroupNotExist", C18070vi.A0O(C21199Ag8.A00, b9cArr2, 3), new String[0]);
                if (A062 != null) {
                    return new AnonymousClass9DP(r15, r42, (C22475B9h) A062);
                }
                return null;
            case 21:
                boolean A1U3 = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (r14.A09(r15, "description")) {
                    str = (String) r14.A05(r15, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "406", AnonymousClass8BS.A1b(A1U3 ? 1 : 0, 0), false);
                    break;
                } else {
                    return null;
                }
            case 22:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A06(r15, r14);
            case 23:
                boolean A177 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "description") || !r14.A09(r15, "description")) {
                    return null;
                }
                String[] strArr33 = new String[2];
                AnonymousClass8BR.A1K(strArr33, 0, A177 ? 1 : 0, "body");
                String str10 = (String) r14.A04(r15, String.class, C108975cc.A0X(), 65536L, (Object) null, strArr33);
                if (str10 != null) {
                    return new AnonymousClass9DO(r15, new C178169Cb(r15, str10));
                }
                return null;
            case 24:
                boolean A178 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "is_existing_group") || (str = r14.A07(r15, AnonymousClass8BX.A0n(A178 ? 1 : 0), AnonymousClass8BS.A1V(A178))) == null) {
                    return null;
                }
            case 25:
                boolean A1U4 = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (!r14.A09(r15, "participant_count")) {
                    return null;
                }
                return AnonymousClass8BX.A0S(r15, r14.A04(r15, Long.TYPE, C108975cc.A0X(), 19999L, (Object) null, AnonymousClass8BS.A1V(A1U4 ? 1 : 0)));
            case 26:
                C18070vi.A0n(this.A01, r15, r14);
                if (r14.A09(r15, "hidden_group")) {
                    return new AnonymousClass9CQ(r15);
                }
                return null;
            case 27:
            case 35:
            case 42:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A0F(r15, r14);
            case 28:
            case 44:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A09(r15, r14);
            case 29:
                boolean A1U5 = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (!AnonymousClass8BR.A1R(r15, r14)) {
                    return null;
                }
                String[] A1U6 = AnonymousClass8BS.A1U(A1U5 ? 1 : 0);
                Long A0i = AnonymousClass8BU.A0i();
                Long A0j = AnonymousClass8BU.A0j();
                if (r14.A05(r15, String.class, A0i, A0j, "not-allowed", A1U6, false) == null) {
                    return null;
                }
                Number number3 = (Number) r14.A05(r15, Long.TYPE, A0i, A0j, 405L, AnonymousClass8BS.A1S(A1U5), false);
                if (number3 != null) {
                    return new C178669Dz(r15, number3.longValue());
                }
                return null;
            case 32:
            case 46:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A08(r15, r14);
            case 33:
                char A179 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                String[] strArr34 = new String[2];
                strArr34[0] = "pictures";
                strArr34[A179] = "picture";
                ArrayList A012 = C21287AhY.A01(r15, r14, strArr34, 32);
                if (A012 != null) {
                    return new AnonymousClass9DO(r15, (List) A012, 10);
                }
                return null;
            case 36:
            case 43:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A0H(r15, r14);
            case 38:
                C18070vi.A0n(this.A01, r15, r14);
                if (!r14.A09(r15, "participant") || (A0I = A97.A0I(r15, r14)) == null) {
                    return null;
                }
                return new AnonymousClass9DO(r15, A0I);
            case 39:
                int A1U7 = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (!r14.A09(r15, "add_request") || !r14.A09(r15, "add_request")) {
                    return null;
                }
                String[] strArr35 = new String[A1U7];
                strArr35[0] = "expiration";
                Class cls3 = Long.TYPE;
                Long A0L = C17890vO.A0L();
                Long A0j2 = AnonymousClass8BU.A0j();
                C29621ca r63 = r15;
                Number number4 = (Number) r14.A05(r63, cls3, A0L, A0j2, (Object) null, strArr35, false);
                if (number4 == null) {
                    return null;
                }
                long longValue3 = number4.longValue();
                String[] strArr36 = new String[A1U7];
                strArr36[0] = "group_jid";
                Long A0i2 = AnonymousClass8BU.A0i();
                AnonymousClass1EC r22 = (AnonymousClass1EC) r14.A05(r15, AnonymousClass1EC.class, A0i2, A0j2, (Object) null, strArr36, false);
                if (r22 == null) {
                    return null;
                }
                String[] strArr37 = new String[A1U7];
                strArr37[0] = "priority_idx";
                C62672rm r18 = r14;
                C29621ca r19 = r15;
                Number number5 = (Number) r18.A05(r19, cls3, A0L, AnonymousClass8BV.A0k(), (Object) null, strArr37, false);
                if (number5 == null) {
                    return null;
                }
                long longValue4 = number5.longValue();
                if (!r14.A09(r15, "add_request")) {
                    return null;
                }
                String str11 = (String) r18.A05(r19, String.class, 16L, 16, (Object) null, AnonymousClass8BS.A1S(A1U7), false);
                if (str11 == null) {
                    return null;
                }
                AnonymousClass9CY r43 = new AnonymousClass9CY(r15, str11);
                if (!r14.A09(r15, "add_request")) {
                    return null;
                }
                String[] strArr38 = new String[A1U7];
                strArr38[0] = "admin";
                UserJid userJid = (UserJid) r14.A05(r63, UserJid.class, A0i2, A0j2, (Object) null, strArr38, false);
                if (userJid != null) {
                    return new AnonymousClass9DO(r15, new C178409Cz(r22, r15, r43, new AnonymousClass9DO(userJid, r15, 8), longValue3, longValue4));
                }
                return null;
            case 45:
                C18070vi.A0n(this.A01, r15, r14);
                return A97.A0G(r15, r14);
            case 47:
                boolean A1710 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "group")) {
                    return null;
                }
                AnonymousClass1EC r44 = (AnonymousClass1EC) r14.A05(r15, AnonymousClass1EC.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, AnonymousClass8BS.A1W(A1710 ? 1 : 0, 0), false);
                if (r44 == null) {
                    return null;
                }
                C22470B9c[] b9cArr3 = new C22470B9c[2];
                b9cArr3[0] = C21228Agb.A00;
                return new AnonymousClass9DP(r44, r15, (AnonymousClass9CV) r14.A06(r15, "LeaveGroupNotAllowed|LeaveGroupServerError", C18070vi.A0O(C21229Agc.A00, b9cArr3, A1710), new String[0]));
            case 48:
                char A1711 = C18070vi.A17(this.A01, r15);
                C18070vi.A0d(r14, 2);
                if (!r14.A09(r15, "linked_groups") || (A0D = A97.A0D(r15, r14)) == null) {
                    return null;
                }
                C22470B9c[] b9cArr4 = new C22470B9c[3];
                b9cArr4[0] = C21230Agd.A00;
                b9cArr4[A1711] = C21231Age.A00;
                return new AnonymousClass9DP(r15, A0D, (C178199Ce) r14.A06(r15, "LeaveLinkedGroupsBadRequest|LeaveLinkedGroupsNotAllowed|LeaveLinkedGroupsServerError", C18070vi.A0O(C21232Agf.A00, b9cArr4, 2), new String[0]));
            default:
                boolean A1U8 = AnonymousClass8BX.A1U(this.A01, r15, r14);
                if (!AnonymousClass8BR.A1R(r15, r14)) {
                    return null;
                }
                String[] A1U9 = AnonymousClass8BS.A1U(A1U8 ? 1 : 0);
                Long A0i3 = AnonymousClass8BU.A0i();
                Long A0j3 = AnonymousClass8BU.A0j();
                String str12 = (String) r14.A05(r15, String.class, A0i3, A0j3, "rate-overlimit", A1U9, false);
                if (str12 == null) {
                    return null;
                }
                Number number6 = (Number) r14.A05(r15, Long.TYPE, A0i3, A0j3, 429L, AnonymousClass8BS.A1S(A1U8), false);
                if (number6 == null) {
                    return null;
                }
                return new AnonymousClass9E0(r15, str12, A1U8, number6.longValue());
        }
        return new AnonymousClass9CY(r15, str);
    }
}
