package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: X.A7g  reason: case insensitive filesystem */
public abstract class C20102A7g {
    public static final Field A00;
    public static final Field A01;

    static {
        try {
            Field declaredField = C23577Bm6.class.getDeclaredField("unknownFields");
            A01 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C26042Cr6.class.getDeclaredField("count");
            A00 = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static int A00(Object obj) {
        try {
            return A00.getInt(A01.get(obj));
        } catch (IllegalAccessException e) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static ArrayList A01(C166418cr r6) {
        ArrayList A13 = AnonymousClass000.A13();
        int i = r6.bitField0_;
        if ((i & 8) != 0) {
            C17890vO.A1D(A13, 1);
        }
        if ((i & 1) != 0) {
            C17890vO.A1D(A13, 2);
        }
        if (!((i & 4) == 0 && (r6.bitField2_ & 8) == 0)) {
            C17890vO.A1D(A13, 3);
        }
        if ((i & 16) != 0) {
            C17890vO.A1D(A13, 4);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & 65536)) {
            C17890vO.A1D(A13, 5);
        }
        int i2 = r6.bitField0_;
        if ((i2 & 32) != 0) {
            C17890vO.A1D(A13, 6);
        }
        if (AnonymousClass000.A1O(i2 & 64)) {
            C17890vO.A1D(A13, 7);
        }
        if ((i2 & 128) != 0) {
            C17890vO.A1D(A13, 8);
        }
        if ((r6.bitField0_ & 256) != 0) {
            C17890vO.A1D(A13, 9);
        }
        if ((r6.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            C17890vO.A1D(A13, 10);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            C17890vO.A1D(A13, 11);
        }
        int i3 = r6.bitField0_;
        if ((i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            C17890vO.A1D(A13, 12);
        }
        if ((i3 & DefaultCrypto.BUFFER_SIZE) != 0) {
            C17890vO.A1D(A13, 13);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & 32768)) {
            C17890vO.A1D(A13, 14);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & A7Y.A0F)) {
            C17890vO.A1D(A13, 15);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & 2097152) || AnonymousClass000.A1O(r6.bitField1_ & 134217728)) {
            C17890vO.A1D(A13, 16);
        }
        int i4 = r6.bitField0_;
        if ((262144 & i4) != 0) {
            C17890vO.A1D(A13, 17);
        }
        if ((i4 & 524288) != 0) {
            C17890vO.A1D(A13, 18);
        }
        if ((r6.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            C17890vO.A1D(A13, 19);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & 134217728)) {
            C17890vO.A1D(A13, 20);
        }
        int i5 = r6.bitField0_;
        if ((536870912 & i5) != 0) {
            C17890vO.A1D(A13, 21);
        }
        if ((i5 & 4194304) != 0) {
            C17890vO.A1D(A13, 22);
        }
        if (r6.A0R()) {
            C17890vO.A1D(A13, 23);
        }
        if ((r6.bitField0_ & 8388608) != 0) {
            C17890vO.A1D(A13, 24);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & 268435456)) {
            C17890vO.A1D(A13, 25);
        }
        if ((r6.bitField0_ & 1073741824) != 0) {
            C17890vO.A1D(A13, 26);
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & Integer.MIN_VALUE)) {
            C17890vO.A1D(A13, 27);
        }
        int i6 = r6.bitField1_;
        if ((i6 & 1) != 0) {
            C17890vO.A1D(A13, 29);
        }
        if ((i6 & 2) != 0) {
            C17890vO.A1D(A13, 30);
        }
        if ((i6 & 4) != 0) {
            C17890vO.A1D(A13, 31);
        }
        if (!((i6 & 16) == 0 && (i6 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0)) {
            C17890vO.A1D(A13, 32);
        }
        if ((r6.bitField1_ & 8) != 0) {
            C17890vO.A1D(A13, 33);
        }
        int i7 = r6.bitField1_;
        if ((i7 & 32) != 0) {
            C17890vO.A1D(A13, 34);
        }
        if (!((i7 & 64) == 0 && (32768 & i7) == 0 && (524288 & i7) == 0 && (r6.bitField2_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0)) {
            C17890vO.A1D(A13, 35);
        }
        if ((i7 & 128) != 0) {
            C165248ap r0 = r6.pollUpdateMessage_;
            if (r0 == null) {
                r0 = C165248ap.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                C17890vO.A1D(A13, 36);
            }
        }
        if ((i7 & 256) != 0) {
            C17890vO.A1D(A13, 37);
        }
        if ((i7 & 262144) != 0) {
            C17890vO.A1D(A13, 39);
        }
        if ((r6.bitField1_ & 512) != 0) {
            C17890vO.A1D(A13, 7);
        }
        if (AnonymousClass000.A1O(r6.bitField1_ & DefaultCrypto.BUFFER_SIZE)) {
            C17890vO.A1D(A13, 11);
        }
        int i8 = r6.bitField1_;
        if ((i8 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            C17890vO.A1D(A13, 25);
        }
        if ((i8 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            C17890vO.A1D(A13, 38);
        }
        if ((i8 & 16384) != 0) {
            C17890vO.A1D(A13, 25);
        }
        if ((r6.bitField1_ & 65536) != 0) {
            C17890vO.A1D(A13, 40);
        }
        if (AnonymousClass000.A1O(r6.bitField1_ & 1048576)) {
            C17890vO.A1D(A13, 41);
        }
        if ((r6.bitField1_ & 2097152) != 0) {
            C17890vO.A1D(A13, 42);
        }
        if (AnonymousClass000.A1O(r6.bitField1_ & A7Y.A0F)) {
            C17890vO.A1D(A13, 43);
        }
        if (AnonymousClass000.A1O(r6.bitField1_ & 4194304)) {
            C17890vO.A1D(A13, 44);
        }
        int i9 = r6.bitField1_;
        if (!((33554432 & i9) == 0 && (1073741824 & i9) == 0)) {
            C17890vO.A1D(A13, 45);
        }
        if ((67108864 & i9) != 0) {
            C17890vO.A1D(A13, 46);
        }
        if ((i9 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            C17890vO.A1D(A13, 47);
        }
        if (AnonymousClass000.A1O(r6.bitField1_ & 268435456)) {
            C17890vO.A1D(A13, 48);
        }
        int i10 = r6.bitField1_;
        if ((Integer.MIN_VALUE & i10) != 0) {
            C17890vO.A1D(A13, 49);
        }
        if ((i10 & 536870912) != 0) {
            C17890vO.A1D(A13, 50);
        }
        int i11 = r6.bitField2_;
        if ((i11 & 1) != 0) {
            C164098Xn r02 = r6.placeholderMessage_;
            if (r02 == null) {
                r02 = C164098Xn.DEFAULT_INSTANCE;
            }
            if ((r02.bitField0_ & 1) != 0) {
                C17890vO.A1D(A13, 52);
            }
        }
        if ((i11 & 2) != 0) {
            C17890vO.A1D(A13, 53);
        }
        if ((i11 & 4) != 0) {
            C17890vO.A1D(A13, 54);
        }
        if ((i11 & 16) != 0) {
            C17890vO.A1D(A13, 55);
        }
        if (AnonymousClass000.A1O(i11 & 32)) {
            C17890vO.A1D(A13, 57);
        }
        if ((i11 & 512) != 0) {
            C17890vO.A1D(A13, 57);
        }
        if ((i11 & 64) != 0) {
            C17890vO.A1D(A13, 56);
        }
        if ((i11 & 256) != 0) {
            C17890vO.A1D(A13, 58);
        }
        return A13;
    }

    public static void A02(C62242r5 r4, AnonymousClass206 r5, AnonymousClass1W9 r6, AnonymousClass1W6 r7) {
        Integer A002 = AnonymousClass1W9.A00(r5, r6, r4.A01(r5));
        if (A002 != null) {
            throw AnonymousClass8BU.A0b(A002);
        } else if (AnonymousClass206.A08(r5)) {
            C692336k A003 = C60472o5.A00(r5);
            Integer A0f = AnonymousClass3MY.A0f();
            if (A003 != null) {
                Long A02 = C60472o5.A00(r5).A02();
                if (A02 != null) {
                    AnonymousClass206 A03 = r7.A01.A03(A02.longValue());
                    if (A03 == null || (A03 instanceof AnonymousClass23N)) {
                        throw AnonymousClass8BU.A0b(A0f);
                    }
                    A03.A0o = true;
                    Integer A004 = AnonymousClass1W9.A00(A03, r6, r4.A01(A03));
                    if (A004 != null) {
                        throw AnonymousClass8BU.A0b(A004);
                    }
                    return;
                }
                throw AnonymousClass8BU.A0b(A0f);
            }
            Log.e("E2eMessageUtils/verifyMessageSecretForComments/comment info for a comment message is null");
            throw AnonymousClass8BU.A0b(A0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if ((r3 & 16384) != 0) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass190 r8, X.C18030ve r9, X.C166418cr r10, java.util.List r11) {
        /*
            X.8cr r2 = X.C196709vV.A00(r9, r10)
            r7 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0096
            int r0 = r10.bitField0_
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r6
            boolean r5 = X.AnonymousClass000.A1O(r0)
            if (r5 != 0) goto L_0x005d
            int r1 = r2.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005d
        L_0x001a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "outer.hasEphemeralMessage="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = ", inner.hasViewOnceMessage="
            r3.append(r0)
            int r1 = r2.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r3.append(r0)
            java.lang.String r0 = ", inner.hasEphemeralMessage="
            r3.append(r0)
            int r0 = r2.bitField0_
            r0 = r0 & r6
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r3.append(r0)
            java.lang.String r0 = ", inner.hasDocumentWithCaptionMessage="
            r3.append(r0)
            int r0 = r2.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r3, r0)
            java.lang.String r0 = "isValidMessage/futureproof/type"
        L_0x0059:
            r8.A0G(r0, r1, r4)
            return r7
        L_0x005d:
            int r0 = r2.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x001a
            int r0 = r2.bitField0_
            r0 = r0 & r6
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 != 0) goto L_0x001a
            int r3 = r2.bitField0_
            r0 = r3 & 2
            r2 = 1
            if (r0 != 0) goto L_0x0078
            r2 = 0
            r0 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0096
        L_0x0078:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "hasSenderKeyDistributionMessage="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", hasFastRatchetKeySenderKeyDistributionMessage="
            r1.append(r0)
            r0 = r3 & 16384(0x4000, float:2.2959E-41)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r1, r0)
            java.lang.String r0 = "isValidMessage/futureproof/key"
            goto L_0x0059
        L_0x0096:
            int r1 = r11.size()
            int r3 = A00(r10)
            if (r1 == r4) goto L_0x00a4
            if (r1 != 0) goto L_0x00cb
            if (r3 <= 0) goto L_0x00cb
        L_0x00a4:
            r2 = 1
        L_0x00a5:
            int r0 = r10.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00b1
            if (r1 != 0) goto L_0x00b0
            if (r3 != 0) goto L_0x00b0
            r7 = 1
        L_0x00b0:
            r2 = r2 | r7
        L_0x00b1:
            if (r2 != 0) goto L_0x00ca
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageTypes="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " UnknownTag="
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.lang.String r0 = "isValidMessage/numtype"
            r8.A0G(r0, r1, r4)
        L_0x00ca:
            return r2
        L_0x00cb:
            r2 = 0
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20102A7g.A03(X.190, X.0ve, X.8cr, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0259, code lost:
        if ((r0.bitField0_ & 2) != 0) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x02eb, code lost:
        if (r0 == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0302, code lost:
        if (r2 == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x043c, code lost:
        if (X.C18020vd.A05(r1, r8, 8529) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0444, code lost:
        if (X.C18020vd.A05(r1, r8, 8783) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C34811l7 r6, X.AnonymousClass1CJ r7, X.C18030ve r8, X.AnonymousClass1BI r9, X.C166418cr r10) {
        /*
            int r2 = A00(r10)
            r5 = 1
            if (r2 <= 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageUtil/isUnknown/unknown tags="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
        L_0x0011:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0014:
            return r5
        L_0x0015:
            int r0 = r10.bitField0_
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0039
            X.8Xc r0 = r10.ephemeralMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0027
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0027:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x002d
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x002d:
            int r0 = r0.bitField0_
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x046e
            java.lang.String r0 = "MessageUtil/isUnknown/recursiveEphemeralMessage"
            goto L_0x0011
        L_0x0039:
            int r1 = r10.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x005f
            X.8cl r0 = r10.listMessage_
            if (r0 != 0) goto L_0x004a
            X.8cl r0 = X.C166358cl.DEFAULT_INSTANCE
        L_0x004a:
            X.9Ju r1 = r0.A0R()
            X.9Ju r0 = X.C179759Ju.PRODUCT_LIST
            if (r1 != r0) goto L_0x005f
            r1 = 385(0x181, float:5.4E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "MessageUtil/isUnknown/listMessage product list"
            goto L_0x0011
        L_0x005f:
            int r0 = r10.bitField1_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            if (r0 == 0) goto L_0x00f6
            X.8bs r3 = r10.buttonsMessage_
            if (r3 != 0) goto L_0x006d
            X.8bs r3 = X.C165858bs.DEFAULT_INSTANCE
        L_0x006d:
            java.lang.String r0 = "review_and_pay"
            boolean r0 = X.C198729yo.A00(r3, r0)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "review_order"
            boolean r0 = X.C198729yo.A00(r3, r0)
            if (r0 == 0) goto L_0x008a
        L_0x007d:
            r1 = 833(0x341, float:1.167E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "MessageUtil/isUnknown/JioRechargeNativeFlowMessage"
            goto L_0x0011
        L_0x008a:
            java.lang.String r0 = "payment_method"
            boolean r0 = X.C198729yo.A00(r3, r0)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "payment_status"
            boolean r0 = X.C198729yo.A00(r3, r0)
            if (r0 == 0) goto L_0x00a8
        L_0x009a:
            r1 = 1595(0x63b, float:2.235E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "MessageUtil/isUnknown/NonNativePaymentMethodOrderUpdateFlowMessage or MessageUtil/isUnknown/NonNativePaymentStatusOrderUpdateFlowMessage"
            goto L_0x0011
        L_0x00a8:
            java.lang.String r2 = "view_product"
            X.EE9 r0 = r3.buttons_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00e8
            r1 = 0
        L_0x00b3:
            X.EE9 r0 = r3.buttons_
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00e8
            X.EE9 r0 = r3.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.8an r0 = (X.C165228an) r0
            X.8Yx r0 = r0.nativeFlowInfo_
            if (r0 != 0) goto L_0x00cb
            X.8Yx r0 = X.C164458Yx.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x00e5
        L_0x00cb:
            X.8Yx r0 = X.AnonymousClass8BX.A0N(r3, r1)
            java.lang.String r0 = r0.name_
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00e5
            r1 = 7408(0x1cf0, float:1.0381E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "MessageUtil/isUnknown/ViewProductAction"
            goto L_0x0011
        L_0x00e5:
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00e8:
            r1 = 362(0x16a, float:5.07E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "MessageUtil/isUnknown/buttonsMessage"
            goto L_0x0011
        L_0x00f6:
            X.9ul r3 = r6.A01(r10)
            if (r3 == 0) goto L_0x0106
            boolean r0 = r3.A0F(r8, r10)
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowNoviHubMessage"
            goto L_0x0011
        L_0x0106:
            int r0 = r10.bitField1_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x011a
            r1 = 544(0x220, float:7.62E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "MessageUtil/isUnknown/paymentInviteMessage"
            goto L_0x0011
        L_0x011a:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0139
            X.8cp r0 = r10.interactiveMessage_
            if (r0 != 0) goto L_0x0126
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0126:
            int r1 = r0.interactiveMessageCase_
            r0 = 4
            if (r1 != r0) goto L_0x0139
            r1 = 832(0x340, float:1.166E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = "MessageUtil/isUnknown/shopsStorefrontMessage"
            goto L_0x0011
        L_0x0139:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0158
            X.8cp r0 = r10.interactiveMessage_
            if (r0 != 0) goto L_0x0145
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0145:
            int r1 = r0.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x0158
            r1 = 1133(0x46d, float:1.588E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowMessage"
            goto L_0x0011
        L_0x0158:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x019a
            X.8cp r0 = r10.interactiveMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0165
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0165:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x019a
            r0 = r1
            if (r1 != 0) goto L_0x0170
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0170:
            X.8bW r0 = r0.header_
            if (r0 != 0) goto L_0x0176
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x0176:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019a
            if (r1 != 0) goto L_0x0180
            X.8cp r1 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0180:
            X.8bW r0 = r1.header_
            if (r0 != 0) goto L_0x0186
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x0186:
            int r1 = r0.mediaCase_
            r0 = 9
            if (r1 != r0) goto L_0x019a
            r1 = 7408(0x1cf0, float:1.0381E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = "MessageUtil/isUnknown/SingleProductMessage"
            goto L_0x0011
        L_0x019a:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01e8
            X.8cp r0 = r10.interactiveMessage_
            r2 = r0
            if (r0 != 0) goto L_0x01a7
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x01a7:
            int r1 = r0.interactiveMessageCase_
            r0 = 7
            if (r1 != r0) goto L_0x01e8
            if (r2 != 0) goto L_0x01b0
            X.8cp r2 = X.C166398cp.DEFAULT_INSTANCE
        L_0x01b0:
            X.8Z2 r4 = r2.A0R()
            r2 = 0
        L_0x01b5:
            X.EE9 r0 = r4.cards_
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x01e8
            X.EE9 r0 = r4.cards_
            java.lang.Object r1 = r0.get(r2)
            X.8cp r1 = (X.C166398cp) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01e5
            X.8bW r0 = r1.header_
            if (r0 != 0) goto L_0x01d1
            X.8bW r0 = X.C165638bW.DEFAULT_INSTANCE
        L_0x01d1:
            int r1 = r0.mediaCase_
            r0 = 9
            if (r1 != r0) goto L_0x01e5
            r1 = 7177(0x1c09, float:1.0057E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x01e8
            java.lang.String r0 = "MessageUtil/isUnknown/ProducuctCarouselMessage"
            goto L_0x0011
        L_0x01e5:
            int r2 = r2 + 1
            goto L_0x01b5
        L_0x01e8:
            int r0 = r10.bitField1_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0213
            r0 = 1435(0x59b, float:2.011E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage"
            goto L_0x0011
        L_0x01fc:
            X.8ag r0 = r10.interactiveResponseMessage_
            if (r0 != 0) goto L_0x0202
            X.8ag r0 = X.C165158ag.DEFAULT_INSTANCE
        L_0x0202:
            int r1 = r0.interactiveResponseMessageCase_
            r0 = 2
            if (r1 != r0) goto L_0x0213
            r0 = 1436(0x59c, float:2.012E-42)
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage/NativeFlowResponse"
            goto L_0x0011
        L_0x0213:
            int r1 = r10.bitField1_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0225
            boolean r0 = X.AnonymousClass9RT.A00(r8)
            if (r0 != 0) goto L_0x0225
            java.lang.String r0 = "MessageUtil/isUnknown/pollCreationMessage"
            goto L_0x0011
        L_0x0225:
            int r0 = r10.bitField2_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x023d
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r1 = 12362(0x304a, float:1.7323E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x023d
            java.lang.String r0 = "MessageUtil/isUnknown/pollV5CreationMessage"
            goto L_0x0011
        L_0x023d:
            int r0 = r10.bitField1_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x025b
            X.8ap r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x0249
            X.8ap r0 = X.C165248ap.DEFAULT_INSTANCE
        L_0x0249:
            int r0 = A00(r0)
            if (r0 > 0) goto L_0x0014
            X.8ap r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x0255
            X.8ap r0 = X.C165248ap.DEFAULT_INSTANCE
        L_0x0255:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0014
        L_0x025b:
            int r0 = r10.bitField1_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x026c
            r1 = 2802(0xaf2, float:3.926E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x026c
            return r5
        L_0x026c:
            int r0 = r10.bitField1_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0304
            r0 = 2189(0x88d, float:3.067E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            if (r0 == 0) goto L_0x028e
            r0 = 4089(0xff9, float:5.73E-42)
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            if (r0 != 0) goto L_0x0292
            boolean r0 = r7.A0R(r9)
            if (r0 == 0) goto L_0x0292
        L_0x028e:
            java.lang.String r0 = "MessageUtil/isUnknown/ProtocolMessage has unknown tag"
            goto L_0x0011
        L_0x0292:
            X.8Xc r0 = r10.editedMessage_
            if (r0 != 0) goto L_0x0298
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0298:
            X.8cr r1 = r0.message_
            if (r1 != 0) goto L_0x029e
            X.8cr r1 = X.C166418cr.DEFAULT_INSTANCE
        L_0x029e:
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x028e
            X.8cm r1 = X.AnonymousClass8BS.A0I(r1)
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x028e
            X.8cr r4 = r1.editedMessage_
            if (r4 != 0) goto L_0x02b8
            X.8cr r4 = X.C166418cr.DEFAULT_INSTANCE
        L_0x02b8:
            int r1 = r4.bitField1_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x02cf
            X.8Xc r0 = r4.groupMentionedMessage_
            if (r0 != 0) goto L_0x02c9
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x02c9:
            X.8cr r4 = r0.message_
            if (r4 != 0) goto L_0x02cf
            X.8cr r4 = X.C166418cr.DEFAULT_INSTANCE
        L_0x02cf:
            int r1 = r4.bitField0_
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0304
            r0 = r1 & 32
            if (r0 != 0) goto L_0x0304
            int r1 = r4.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x02ed
            r0 = 7358(0x1cbe, float:1.0311E-41)
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            r2 = 1
            if (r0 != 0) goto L_0x02ee
        L_0x02ed:
            r2 = 0
        L_0x02ee:
            int r1 = r4.bitField0_
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0304
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0304
            r0 = r1 & 64
            if (r0 != 0) goto L_0x0304
            int r0 = r4.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0304
            if (r2 == 0) goto L_0x028e
        L_0x0304:
            X.8cr r1 = X.C196709vV.A01(r8, r10)
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x031e
            X.8cm r0 = X.AnonymousClass8BS.A0I(r1)
            int r0 = A00(r0)
            if (r0 <= 0) goto L_0x031e
            goto L_0x028e
        L_0x031e:
            boolean r0 = r10.A0R()
            if (r0 == 0) goto L_0x0330
            if (r3 == 0) goto L_0x0330
            boolean r0 = r3.A0E(r8)
            if (r0 == 0) goto L_0x0330
            java.lang.String r0 = "MessageUtil/isUnknown/templateNativeFlowMessage"
            goto L_0x0011
        L_0x0330:
            int r1 = r10.bitField1_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0341
            boolean r0 = X.C40811vJ.A0W(r8)
            if (r0 != 0) goto L_0x0341
            java.lang.String r0 = "MessageUtil/isUnknown/scheduledCallCreationMessage"
            goto L_0x0011
        L_0x0341:
            int r1 = r10.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x0356
            boolean r0 = X.C40811vJ.A0W(r8)
            if (r0 != 0) goto L_0x0356
            java.lang.String r0 = "MessageUtil/isUnknown/hasScheduledCallEditMessage"
            goto L_0x0011
        L_0x0356:
            int r1 = r10.bitField1_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x036b
            r1 = 3355(0xd1b, float:4.701E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x036b
            java.lang.String r0 = "MessageUtil/isUnknown/ptvMessage"
            goto L_0x0011
        L_0x036b:
            int r1 = r10.bitField1_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0376
            java.lang.String r0 = "MessageUtil/isUnknown/BCallMessage"
            goto L_0x0011
        L_0x0376:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0389
            r1 = 5192(0x1448, float:7.276E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0389
            java.lang.String r0 = "MessageUtil/isUnknown/historyBundle"
            goto L_0x0011
        L_0x0389:
            int r1 = r10.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x03a2
            r1 = 5563(0x15bb, float:7.795E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x03a2
            java.lang.String r0 = "MessageUtil/isUnknown/EventMessage"
            goto L_0x0011
        L_0x03a2:
            int r1 = r10.bitField1_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x03b8
            r1 = 3878(0xf26, float:5.434E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r8, r1)
            r0 = 2
            if (r1 == r0) goto L_0x03b8
            java.lang.String r0 = "MessageUtil/isUnknown/NewsletterAdminInvite"
            goto L_0x0011
        L_0x03b8:
            int r1 = r10.bitField1_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x03d1
            r1 = 5692(0x163c, float:7.976E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x03d1
            java.lang.String r0 = "MessageUtil/isUnknown/lottieMessage"
            goto L_0x0011
        L_0x03d1:
            int r0 = r10.bitField2_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x03e5
            r1 = 8792(0x2258, float:1.232E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x03e5
            java.lang.String r0 = "MessageUtil/isUnknown/eventCoverImage"
            goto L_0x0011
        L_0x03e5:
            int r0 = r10.bitField2_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0402
            X.8Xn r0 = r10.placeholderMessage_
            if (r0 != 0) goto L_0x03f1
            X.8Xn r0 = X.C164098Xn.DEFAULT_INSTANCE
        L_0x03f1:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0014
            r1 = 6673(0x1a11, float:9.351E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0402
            return r5
        L_0x0402:
            int r0 = r10.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0422
            X.8cm r0 = X.AnonymousClass8BS.A0I(r10)
            int r1 = r0.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0422
            r1 = 7382(0x1cd6, float:1.0344E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0422
            return r5
        L_0x0422:
            int r0 = r10.bitField2_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0446
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r0 = 8528(0x2150, float:1.195E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r8, r0)
            if (r0 != 0) goto L_0x043e
            r0 = 8529(0x2151, float:1.1952E-41)
            boolean r0 = X.C18020vd.A05(r1, r8, r0)
            if (r0 == 0) goto L_0x0014
        L_0x043e:
            r0 = 8783(0x224f, float:1.2308E-41)
            boolean r0 = X.C18020vd.A05(r1, r8, r0)
            if (r0 == 0) goto L_0x0014
        L_0x0446:
            int r0 = r10.bitField2_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x045a
            r1 = 9776(0x2630, float:1.3699E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x045a
            java.lang.String r0 = "MessageUtil/isUnknown/hasStickerPackMessage"
            goto L_0x0011
        L_0x045a:
            int r0 = r10.bitField2_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x047d
            r1 = 10414(0x28ae, float:1.4593E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x047d
            java.lang.String r0 = "MessageUtil/isUnknown/hasPollResultSnapshotMessage"
            goto L_0x0011
        L_0x046e:
            if (r1 != 0) goto L_0x0472
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0472:
            X.8cr r0 = r1.message_
            if (r0 != 0) goto L_0x0478
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0478:
            boolean r0 = A04(r6, r7, r8, r9, r0)
            return r0
        L_0x047d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20102A7g.A04(X.1l7, X.1CJ, X.0ve, X.1BI, X.8cr):boolean");
    }
}
