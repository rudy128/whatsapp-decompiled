package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.9nn  reason: invalid class name and case insensitive filesystem */
public final class C192099nn {
    public final C193209pi A00;

    public C192099nn(C193209pi r1) {
        this.A00 = r1;
    }

    public final C162968Te A00(C19998A2m a2m, C162968Te r9, AnonymousClass22Q r10) {
        BigDecimal bigDecimal;
        C18070vi.A0i(r10, r9);
        UserJid userJid = r10.A01;
        if (userJid != null) {
            C165688bb r0 = ((C166418cr) a2m.A00.A00).productMessage_;
            if (r0 == null) {
                r0 = C165688bb.DEFAULT_INSTANCE;
            }
            C166038cF r02 = r0.product_;
            if (r02 == null) {
                r02 = C166038cF.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            C193209pi r1 = this.A00;
            C166268cc r03 = ((C166038cF) A0O.A00).productImage_;
            if (r03 == null) {
                r03 = C166268cc.DEFAULT_INSTANCE;
            }
            C163748We A002 = r1.A00(a2m, (C163748We) r03.A0O(), r10);
            if (A002 != null) {
                String A0d = AnonymousClass8BS.A0d(r9, userJid);
                C165688bb r12 = (C165688bb) r9.A00;
                A0d.getClass();
                r12.bitField0_ |= 2;
                r12.businessOwnerJid_ = A0d;
                String str = r10.A06;
                if (!(str == null || str.length() == 0)) {
                    C166038cF r13 = (C166038cF) C17880vN.A0G(A0O);
                    r13.bitField0_ |= 2;
                    r13.productId_ = str;
                }
                String str2 = r10.A04;
                if (!(str2 == null || str2.length() == 0)) {
                    C166038cF r14 = (C166038cF) C17880vN.A0G(A0O);
                    r14.bitField0_ |= 8;
                    r14.description_ = str2;
                }
                String str3 = r10.A0A;
                if (!(str3 == null || str3.length() == 0)) {
                    C166038cF r15 = (C166038cF) C17880vN.A0G(A0O);
                    r15.bitField0_ |= 4;
                    r15.title_ = str3;
                }
                String str4 = r10.A03;
                if (!(str4 == null || str4.length() == 0 || (bigDecimal = r10.A0B) == null)) {
                    C166038cF r16 = (C166038cF) C17880vN.A0G(A0O);
                    r16.bitField0_ |= 16;
                    r16.currencyCode_ = str4;
                    BigDecimal bigDecimal2 = C197309wU.A00;
                    long longValue = bigDecimal.multiply(bigDecimal2).longValue();
                    C166038cF r17 = (C166038cF) C17880vN.A0G(A0O);
                    r17.bitField0_ |= 32;
                    r17.priceAmount1000_ = longValue;
                    BigDecimal bigDecimal3 = r10.A0C;
                    if (!(bigDecimal3 == null || BigDecimal.ZERO.compareTo(bigDecimal3) == 0)) {
                        long longValue2 = bigDecimal3.multiply(bigDecimal2).longValue();
                        C166038cF r18 = (C166038cF) C17880vN.A0G(A0O);
                        r18.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                        r18.salePriceAmount1000_ = longValue2;
                    }
                }
                String str5 = r10.A08;
                if (!(str5 == null || str5.length() == 0)) {
                    C166038cF r19 = (C166038cF) C17880vN.A0G(A0O);
                    r19.bitField0_ |= 64;
                    r19.retailerId_ = str5;
                }
                String str6 = r10.A07;
                if (!(str6 == null || str6.length() == 0)) {
                    C166038cF r110 = (C166038cF) C17880vN.A0G(A0O);
                    r110.bitField0_ |= 128;
                    r110.url_ = str6;
                }
                String str7 = r10.A09;
                if (!(str7 == null || str7.length() == 0)) {
                    C166038cF r111 = (C166038cF) C17880vN.A0G(A0O);
                    r111.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    r111.signedUrl_ = str7;
                }
                int i = r10.A00;
                C166038cF r112 = (C166038cF) C17880vN.A0G(A0O);
                r112.bitField0_ |= 256;
                r112.productImageCount_ = i;
                C166038cF r113 = (C166038cF) C17880vN.A0G(A0O);
                C166268cc r04 = (C166268cc) A002.A0C();
                r04.getClass();
                r113.productImage_ = r04;
                r113.bitField0_ |= 1;
                C165688bb r114 = (C165688bb) C17880vN.A0G(r9);
                C166038cF r05 = (C166038cF) A0O.A0C();
                r05.getClass();
                r114.product_ = r05;
                r114.bitField0_ |= 1;
                return r9;
            }
        }
        return null;
    }

    public final void A01(C165688bb r10, AnonymousClass22Q r11, int i, boolean z, boolean z2) {
        boolean A1Z = C72453Mb.A1Z(r10);
        AnonymousClass22Q r5 = r11;
        try {
            C22941Dw r0 = UserJid.Companion;
            r11.A01 = C22941Dw.A03(r10.businessOwnerJid_);
        } catch (AnonymousClass11T unused) {
        }
        if (r11.A01 != null) {
            C166038cF r3 = r10.product_;
            if (r3 == null) {
                r3 = C166038cF.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(r3);
            r11.A06 = r3.productId_;
            r11.A0A = r3.title_;
            r11.A04 = r3.description_;
            String str = r3.currencyCode_;
            r11.A03 = str;
            if (!(str == null || str.length() == 0)) {
                try {
                    r11.A0B = C197309wU.A00(new A6S(str), r3.priceAmount1000_);
                    r11.A0C = C197309wU.A00(new A6S(str), r3.salePriceAmount1000_);
                } catch (IllegalArgumentException unused2) {
                    r11.A03 = null;
                }
            }
            r11.A08 = r3.retailerId_;
            r11.A07 = r3.url_;
            r11.A09 = r3.signedUrl_;
            r11.A00 = r3.productImageCount_;
            C166268cc r4 = r3.productImage_;
            if (r4 == null) {
                r4 = C166268cc.DEFAULT_INSTANCE;
            }
            this.A00.A02(r4, r5, i, z, z2);
            return;
        }
        throw AnonymousClass8BR.A0o(A1Z ? 1 : 0);
    }
}
