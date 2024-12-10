package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ASn  reason: case insensitive filesystem */
public class C20629ASn implements B83, B85, C436820m {
    public final AnonymousClass190 A00;
    public final A79 A01;

    public void BDb(C19998A2m a2m, AnonymousClass206 r9) {
        C179769Jv r0;
        if (r9 instanceof AnonymousClass22U) {
            AnonymousClass22U r92 = (AnonymousClass22U) r9;
            AnonymousClass8X8 r2 = a2m.A00;
            C166098cL r02 = ((C166418cr) r2.A00).orderMessage_;
            if (r02 == null) {
                r02 = C166098cL.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            String str = r92.A08;
            if (str != null) {
                C166098cL r1 = (C166098cL) C17880vN.A0G(A0O);
                int i = C166098cL.CATALOG_TYPE_FIELD_NUMBER;
                r1.bitField0_ |= 1;
                r1.orderId_ = str;
            }
            String str2 = r92.A05;
            if (str2 != null) {
                C166098cL r12 = (C166098cL) C17880vN.A0G(A0O);
                int i2 = C166098cL.CATALOG_TYPE_FIELD_NUMBER;
                r12.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                r12.catalogType_ = str2;
            }
            String str3 = r92.A09;
            if (str3 != null) {
                C166098cL r13 = (C166098cL) C17880vN.A0G(A0O);
                int i3 = C166098cL.CATALOG_TYPE_FIELD_NUMBER;
                r13.bitField0_ |= 64;
                r13.orderTitle_ = str3;
            }
            int i4 = r92.A00;
            C166098cL r14 = (C166098cL) C17880vN.A0G(A0O);
            int i5 = C166098cL.CATALOG_TYPE_FIELD_NUMBER;
            r14.bitField0_ |= 4;
            r14.itemCount_ = i4;
            String str4 = r92.A07;
            if (str4 != null) {
                C166098cL r15 = (C166098cL) C17880vN.A0G(A0O);
                r15.bitField0_ |= 32;
                r15.message_ = str4;
            }
            int i6 = r92.A01;
            C166098cL r16 = (C166098cL) C17880vN.A0G(A0O);
            r16.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r16.messageVersion_ = i6;
            int i7 = r92.A02;
            if (i7 != 1) {
                if (i7 == 2) {
                    r0 = C179769Jv.ACCEPTED;
                } else if (i7 != 3) {
                    this.A00.A0G("FMessageOrder/setOrderStatus: Unexpected status", AnonymousClass001.A1I("status=", AnonymousClass000.A10(), i7), true);
                } else {
                    r0 = C179769Jv.DECLINED;
                }
                C166098cL r17 = (C166098cL) C17880vN.A0G(A0O);
                r17.status_ = r0.value;
                r17.bitField0_ |= 8;
            } else {
                r0 = C179769Jv.INQUIRY;
                C166098cL r172 = (C166098cL) C17880vN.A0G(A0O);
                r172.status_ = r0.value;
                r172.bitField0_ |= 8;
            }
            int i8 = r92.A03;
            if (i8 != 1) {
                this.A00.A0G("FMessageOrder/setOrderSurface: Unexpected surface", AnonymousClass001.A1I("surface=", AnonymousClass000.A10(), i8), true);
            } else {
                AnonymousClass9JV r03 = AnonymousClass9JV.A01;
                C166098cL r18 = (C166098cL) C17880vN.A0G(A0O);
                r18.surface_ = r03.value;
                r18.bitField0_ |= 16;
            }
            UserJid userJid = r92.A04;
            if (userJid != null) {
                String A0d = AnonymousClass8BS.A0d(A0O, userJid);
                C166098cL r19 = (C166098cL) A0O.A00;
                A0d.getClass();
                r19.bitField0_ |= 128;
                r19.sellerJid_ = A0d;
            }
            String str5 = r92.A0A;
            if (str5 != null) {
                C166098cL r110 = (C166098cL) C17880vN.A0G(A0O);
                r110.bitField0_ |= 256;
                r110.token_ = str5;
            }
            if (!TextUtils.isEmpty(r92.A06) && r92.A0B != null) {
                String str6 = r92.A06;
                C166098cL r111 = (C166098cL) C17880vN.A0G(A0O);
                str6.getClass();
                r111.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r111.totalCurrencyCode_ = str6;
                long longValue = r92.A0B.multiply(C197309wU.A00).longValue();
                C166098cL r5 = (C166098cL) C17880vN.A0G(A0O);
                r5.bitField0_ |= 512;
                r5.totalAmount1000_ = longValue;
            }
            C693336u A0O2 = r92.A0O();
            if (!(A0O2 == null || A0O2.A01() == null)) {
                C23581BmB A03 = C17900vP.A03(A0O, A0O2.A01());
                C166098cL r112 = (C166098cL) A0O.A00;
                r112.bitField0_ |= 2;
                r112.thumbnail_ = A03;
            }
            if (C19998A2m.A00(a2m, r92)) {
                C166278cd A012 = A79.A01(A0O, this.A01, a2m, r92);
                C166098cL r113 = (C166098cL) A0O.A00;
                A012.getClass();
                r113.contextInfo_ = A012;
                r113.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r2);
            C166098cL r04 = (C166098cL) A0O.A0C();
            r04.getClass();
            A0M.orderMessage_ = r04;
            A0M.bitField0_ |= 536870912;
            return;
        }
        throw AnonymousClass000.A0k("FMessageOrderProtobuf/not supported message");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.22U, X.21V, X.206] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091 A[SYNTHETIC, Splitter:B:24:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r7) {
        /*
            r6 = this;
            X.8cr r2 = r7.A08
            int r1 = r2.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a5
            X.8cL r4 = r2.orderMessage_
            if (r4 != 0) goto L_0x000f
            X.8cL r4 = X.C166098cL.DEFAULT_INSTANCE
        L_0x000f:
            X.C17960vV.A07(r4)
            X.205 r5 = r7.A0A
            long r1 = r7.A03
            r0 = 44
            X.22U r3 = new X.22U
            r3.<init>(r5, r0, r1)
            X.2rc r0 = new X.2rc
            r0.<init>()
            r3.A02 = r0
            java.lang.String r0 = r4.orderId_
            r3.A08 = r0
            java.lang.String r0 = r4.orderTitle_
            r3.A09 = r0
            int r0 = r4.itemCount_
            r3.A00 = r0
            java.lang.String r0 = r4.message_
            r3.A07 = r0
            int r1 = r4.status_
            r0 = 1
            if (r1 == r0) goto L_0x0057
            r0 = 2
            if (r1 == r0) goto L_0x0054
            r0 = 3
            if (r1 != r0) goto L_0x0057
            X.9Jv r0 = X.C179769Jv.DECLINED
        L_0x0041:
            int r0 = r0.value
            r3.A02 = r0
            X.9JV r0 = X.AnonymousClass9JV.A01
            int r0 = r0.value
            r3.A03 = r0
            int r0 = r4.messageVersion_
            r3.A01 = r0
            java.lang.String r0 = r4.catalogType_
            r3.A05 = r0
            goto L_0x005a
        L_0x0054:
            X.9Jv r0 = X.C179769Jv.ACCEPTED
            goto L_0x0041
        L_0x0057:
            X.9Jv r0 = X.C179769Jv.INQUIRY
            goto L_0x0041
        L_0x005a:
            java.lang.String r0 = r4.sellerJid_     // Catch:{ 11T -> 0x0063 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BR.A0X(r0)     // Catch:{ 11T -> 0x0063 }
            r3.A04 = r0     // Catch:{ 11T -> 0x0063 }
            goto L_0x0076
        L_0x0063:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageOrder/FMessageOrder invalid seller jid <"
            r1.append(r0)
            java.lang.String r0 = r4.sellerJid_
            r1.append(r0)
            java.lang.String r0 = ">"
            X.C17890vO.A1B(r1, r0)
        L_0x0076:
            java.lang.String r0 = r4.token_
            r3.A0A = r0
            X.DSQ r0 = r4.thumbnail_
            if (r0 == 0) goto L_0x0087
            byte[] r1 = r0.A06()
            boolean r0 = r7.A0L
            r3.A1G(r1, r0)
        L_0x0087:
            java.lang.String r0 = r4.totalCurrencyCode_
            r3.A06 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = r3.A06     // Catch:{ IllegalArgumentException -> 0x00a1 }
            X.A6S r2 = new X.A6S     // Catch:{ IllegalArgumentException -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00a1 }
            long r0 = r4.totalAmount1000_     // Catch:{ IllegalArgumentException -> 0x00a1 }
            java.math.BigDecimal r0 = X.C197309wU.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x00a1 }
            r3.A0B = r0     // Catch:{ IllegalArgumentException -> 0x00a1 }
            return r3
        L_0x00a1:
            r0 = 0
            r3.A06 = r0
            return r3
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20629ASn.CBG(X.A6d):X.206");
    }

    public C20629ASn(AnonymousClass190 r1, A79 a79) {
        this.A00 = r1;
        this.A01 = a79;
    }
}
