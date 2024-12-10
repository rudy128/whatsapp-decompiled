package X;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A8f  reason: case insensitive filesystem */
public abstract class C20120A8f {
    public static AnonymousClass206 A00(AnonymousClass206 r1) {
        AnonymousClass21L BOM;
        if (!(r1 instanceof AnonymousClass21Z) || (BOM = ((AnonymousClass21Z) r1).BOM()) == null) {
            return r1;
        }
        return BOM;
    }

    public static void A05(A79 a79, C19998A2m a2m, AnonymousClass206 r13) {
        C20285AEt A0g;
        C179759Ju r4;
        AER aer;
        AnonymousClass8X8 r2 = a2m.A00;
        C166358cl r0 = ((C166418cr) r2.A00).listMessage_;
        if (r0 == null) {
            r0 = C166358cl.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        if ((r13 instanceof AnonymousClass21K) && (A0g = AnonymousClass8BR.A0g(r13)) != null) {
            int i = A0g.A00;
            if (i == 1) {
                r4 = C179759Ju.SINGLE_SELECT;
            } else if (i == 2 || i == 6) {
                r4 = C179759Ju.PRODUCT_LIST;
            } else {
                r4 = C179759Ju.UNKNOWN;
            }
            C166358cl r1 = (C166358cl) C17880vN.A0G(A0O);
            int i2 = C166358cl.BUTTON_TEXT_FIELD_NUMBER;
            r1.listType_ = r4.value;
            r1.bitField0_ |= 8;
            AEE aee = A0g.A05;
            if (aee != null) {
                String str = aee.A02;
                if (!TextUtils.isEmpty(str)) {
                    C166358cl r12 = (C166358cl) C17880vN.A0G(A0O);
                    str.getClass();
                    r12.bitField0_ |= 1;
                    r12.title_ = str;
                }
            }
            if (!TextUtils.isEmpty(A0g.A0C)) {
                String str2 = A0g.A0C;
                C166358cl r14 = (C166358cl) C17880vN.A0G(A0O);
                str2.getClass();
                r14.bitField0_ |= 32;
                r14.footerText_ = str2;
            }
            String str3 = A0g.A0B;
            C166358cl r15 = (C166358cl) C17880vN.A0G(A0O);
            str3.getClass();
            r15.bitField0_ |= 2;
            r15.description_ = str3;
            String str4 = A0g.A0A;
            C166358cl r16 = (C166358cl) C17880vN.A0G(A0O);
            str4.getClass();
            r16.bitField0_ |= 4;
            r16.buttonText_ = str4;
            int i3 = A0g.A00;
            if (i3 == 1) {
                for (AE4 ae4 : A0g.A0F) {
                    C23624Bmt A0N = AnonymousClass8Z7.DEFAULT_INSTANCE.A0N();
                    String str5 = ae4.A01;
                    if (!TextUtils.isEmpty(str5)) {
                        AnonymousClass8Z7 r17 = (AnonymousClass8Z7) C17880vN.A0G(A0N);
                        r17.bitField0_ |= 1;
                        r17.title_ = str5;
                    }
                    for (AEF aef : ae4.A02) {
                        C23624Bmt A0N2 = C164868aC.DEFAULT_INSTANCE.A0N();
                        String str6 = aef.A03;
                        C164868aC r18 = (C164868aC) C17880vN.A0G(A0N2);
                        r18.bitField0_ |= 1;
                        r18.title_ = str6;
                        String str7 = aef.A02;
                        C164868aC r19 = (C164868aC) C17880vN.A0G(A0N2);
                        r19.bitField0_ |= 4;
                        r19.rowId_ = str7;
                        String str8 = aef.A00;
                        if (!TextUtils.isEmpty(str8)) {
                            C164868aC r110 = (C164868aC) C17880vN.A0G(A0N2);
                            str8.getClass();
                            r110.bitField0_ |= 2;
                            r110.description_ = str8;
                        }
                        C23577Bm6 A09 = AnonymousClass8BS.A09(A0N2, A0N);
                        AnonymousClass8Z7 r42 = (AnonymousClass8Z7) A0N.A00;
                        A09.getClass();
                        EE9 ee9 = r42.rows_;
                        if (!((C27296DbR) ee9).A00) {
                            ee9 = C23577Bm6.A09(ee9);
                            r42.rows_ = ee9;
                        }
                        ee9.add(A09);
                    }
                    C23577Bm6 A092 = AnonymousClass8BS.A09(A0N, A0O);
                    C166358cl r43 = (C166358cl) A0O.A00;
                    A092.getClass();
                    EE9 ee92 = r43.sections_;
                    if (!((C27296DbR) ee92).A00) {
                        ee92 = C23577Bm6.A09(ee92);
                        r43.sections_ = ee92;
                    }
                    ee92.add(A092);
                }
            } else if ((i3 == 2 || i3 == 6) && (aer = A0g.A07) != null) {
                C23624Bmt A0N3 = C164858aB.DEFAULT_INSTANCE.A0N();
                for (C20254ADm aDm : aer.A02) {
                    C23624Bmt A0N4 = AnonymousClass8Z6.DEFAULT_INSTANCE.A0N();
                    String str9 = aDm.A00;
                    if (!TextUtils.isEmpty(str9)) {
                        AnonymousClass8Z6 r111 = (AnonymousClass8Z6) C17880vN.A0G(A0N4);
                        str9.getClass();
                        r111.bitField0_ |= 1;
                        r111.title_ = str9;
                    }
                    for (C20243ADb aDb : aDm.A01) {
                        C23624Bmt A0N5 = C164038Xh.DEFAULT_INSTANCE.A0N();
                        String str10 = aDb.A00;
                        if (!TextUtils.isEmpty(str10)) {
                            C164038Xh r112 = (C164038Xh) C17880vN.A0G(A0N5);
                            r112.bitField0_ |= 1;
                            r112.productId_ = str10;
                            C23577Bm6 A093 = AnonymousClass8BS.A09(A0N5, A0N4);
                            AnonymousClass8Z6 r44 = (AnonymousClass8Z6) A0N4.A00;
                            A093.getClass();
                            EE9 ee93 = r44.products_;
                            if (!((C27296DbR) ee93).A00) {
                                ee93 = C23577Bm6.A09(ee93);
                                r44.products_ = ee93;
                            }
                            ee93.add(A093);
                        }
                    }
                    C23577Bm6 A094 = AnonymousClass8BS.A09(A0N4, A0N3);
                    C164858aB r45 = (C164858aB) A0N3.A00;
                    A094.getClass();
                    EE9 ee94 = r45.productSections_;
                    if (!((C27296DbR) ee94).A00) {
                        ee94 = C23577Bm6.A09(ee94);
                        r45.productSections_ = ee94;
                    }
                    ee94.add(A094);
                    String A0d = AnonymousClass8BS.A0d(A0N3, aer.A00);
                    C164858aB r113 = (C164858aB) A0N3.A00;
                    A0d.getClass();
                    r113.bitField0_ |= 2;
                    r113.businessOwnerJid_ = A0d;
                }
                C23624Bmt A0N6 = AnonymousClass8Z5.DEFAULT_INSTANCE.A0N();
                AE3 ae3 = aer.A01;
                byte[] bArr = ae3.A02;
                if (bArr != null) {
                    C23581BmB A03 = C17900vP.A03(A0N6, bArr);
                    AnonymousClass8Z5 r114 = (AnonymousClass8Z5) A0N6.A00;
                    r114.bitField0_ |= 2;
                    r114.jpegThumbnail_ = A03;
                }
                String str11 = ae3.A01;
                AnonymousClass8Z5 r115 = (AnonymousClass8Z5) C17880vN.A0G(A0N6);
                r115.bitField0_ |= 1;
                r115.productId_ = str11;
                C164858aB r116 = (C164858aB) C17880vN.A0G(A0N3);
                AnonymousClass8Z5 r02 = (AnonymousClass8Z5) A0N6.A0C();
                r02.getClass();
                r116.headerImage_ = r02;
                r116.bitField0_ |= 1;
                C164858aB r03 = (C164858aB) A0N3.A0C();
                C166358cl r117 = (C166358cl) C17880vN.A0G(A0O);
                r03.getClass();
                r117.productListInfo_ = r03;
                r117.bitField0_ |= 16;
            }
            if (C19998A2m.A00(a2m, r13)) {
                C166278cd A01 = A79.A01(A0O, a79, a2m, r13);
                C166358cl r118 = (C166358cl) A0O.A00;
                A01.getClass();
                r118.contextInfo_ = A01;
                r118.bitField0_ |= 64;
            }
            C166358cl r04 = (C166358cl) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r2, r04);
            A0J.listMessage_ = r04;
            A0J.bitField0_ |= 134217728;
        }
    }

    public static boolean A06(AnonymousClass206 r2) {
        C20285AEt A0g;
        if (!(r2 instanceof AnonymousClass21K) || !(r2.A0v instanceof AnonymousClass2M2) || (A0g = AnonymousClass8BR.A0g(r2)) == null || !A0g.A04()) {
            return false;
        }
        return true;
    }

    public static boolean A07(AnonymousClass206 r4) {
        C20285AEt A0g;
        if (!(r4 instanceof AnonymousClass21K) || !(r4 instanceof AnonymousClass21L) || (A0g = AnonymousClass8BR.A0g(r4)) == null || A0g.A00 != 7 || A0g.A04 == null) {
            return false;
        }
        return true;
    }

    public static boolean A08(AnonymousClass206 r3) {
        C20285AEt A0g;
        C20277AEk aEk;
        if (!(r3 instanceof AnonymousClass21K) || (A0g = AnonymousClass8BR.A0g(r3)) == null || !A0g.A04() || (aEk = A0g.A06) == null) {
            return false;
        }
        return C108975cc.A1B(aEk.A01() ? 1 : 0);
    }

    public static boolean A09(AnonymousClass206 r2) {
        C20285AEt A0g;
        if (!(r2 instanceof AnonymousClass21K) || (A0g = AnonymousClass8BR.A0g(r2)) == null || !A0g.A03()) {
            return false;
        }
        return true;
    }

    public static AnonymousClass206 A01(AnonymousClass206 r1, int i) {
        List A17;
        if (!A07(r1) || (A17 = ((AnonymousClass21L) r1).A17()) == null || i < 0 || i >= A17.size()) {
            return null;
        }
        return (AnonymousClass206) A17.get(i);
    }

    public static Integer A02(AnonymousClass206 r1) {
        if (A06(r1)) {
            return Integer.valueOf(((AnonymousClass2M2) r1.A0v).A00);
        }
        return null;
    }

    public static Long A03(AnonymousClass206 r4) {
        if (!A08(r4)) {
            return null;
        }
        C20277AEk aEk = AnonymousClass8BR.A0g(r4).A06;
        if (!aEk.A01()) {
            return null;
        }
        try {
            JSONObject A0w = AnonymousClass8BS.A0w("limited_time_offer", C17880vN.A16(aEk.A02));
            if (A0w.has("expiration_time")) {
                return Long.valueOf(A0w.getLong("expiration_time"));
            }
            return null;
        } catch (JSONException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InteractiveMessageContent/getLTOExpirationTime/invalid json=");
            C108985cd.A1M(aEk.A02, A10, e);
            return null;
        }
    }

    public static String A04(AnonymousClass206 r2) {
        String str;
        C58072k6 BaE;
        C20285AEt A0g;
        AnonymousClass206 A00 = A00(r2);
        if (!(A00 instanceof AnonymousClass21K) || (A0g = AnonymousClass8BR.A0g(A00)) == null) {
            str = null;
        } else {
            str = A0g.A0E;
        }
        if (!TextUtils.isEmpty(str) || !(A00 instanceof C439421n) || (BaE = ((C439421n) A00).BaE()) == null) {
            return str;
        }
        return BaE.A05;
    }
}
