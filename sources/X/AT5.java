package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AT5 implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        AnonymousClass243 r112;
        C163788Wi r2;
        C165818bo r1;
        int i;
        C165818bo r12;
        AnonymousClass23B r113;
        List list;
        C165818bo r13;
        String str;
        Object obj;
        if (r11 instanceof AnonymousClass234) {
            AnonymousClass234 r114 = (AnonymousClass234) r11;
            String str2 = r114.A00;
            C163898Wt r6 = (C163898Wt) C166368cm.DEFAULT_INSTANCE.A0N();
            r6.A0G(C179839Kc.PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE);
            C163778Wh r5 = (C163778Wh) C164878aD.DEFAULT_INSTANCE.A0N();
            int A17 = r114.A17();
            if (A17 != -1) {
                AnonymousClass9KY A00 = AnonymousClass9KY.A00(A17);
                C164878aD r14 = (C164878aD) C17880vN.A0G(r5);
                r14.peerDataOperationRequestType_ = A00.value;
                r14.bitField0_ |= 1;
            }
            if (!TextUtils.isEmpty(str2)) {
                C164878aD r15 = (C164878aD) C17880vN.A0G(r5);
                str2.getClass();
                r15.bitField0_ |= 2;
                r15.stanzaId_ = str2;
            }
            if (this instanceof C169668mh) {
                C18070vi.A0h(r5, r114);
                AnonymousClass241 r115 = (AnonymousClass241) r114;
                r2 = (C163788Wi) C165818bo.DEFAULT_INSTANCE.A0N();
                C23624Bmt A0N = AnonymousClass8ZC.DEFAULT_INSTANCE.A0N();
                C1418477e r0 = r115.A00;
                String str3 = null;
                if (r0 != null) {
                    str = (String) r0.A00;
                } else {
                    str = null;
                }
                AnonymousClass8ZC r16 = (AnonymousClass8ZC) C17880vN.A0G(A0N);
                str.getClass();
                r16.bitField0_ |= 1;
                r16.nonce_ = str;
                C1418477e r02 = r115.A01;
                if (!(r02 == null || (obj = r02.A00) == null)) {
                    str3 = obj.toString();
                }
                AnonymousClass8ZC r17 = (AnonymousClass8ZC) C17880vN.A0G(A0N);
                str3.getClass();
                r17.bitField0_ |= 2;
                r17.waEntFbid_ = str3;
                r1 = (C165818bo) C17880vN.A0G(r2);
                AnonymousClass8ZC r03 = (AnonymousClass8ZC) A0N.A0C();
                r03.getClass();
                r1.waffleNonceFetchRequestResponse_ = r03;
                i = r1.bitField0_ | 16;
            } else {
                if (this instanceof C169658mg) {
                    Iterator A15 = AnonymousClass000.A15(((AnonymousClass239) r114).A00);
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        C163788Wi r3 = (C163788Wi) C165818bo.DEFAULT_INSTANCE.A0N();
                        r3.A0G((AnonymousClass9KN) ((Pair) A16.getValue()).first);
                        C166218cX r04 = (C166218cX) ((Pair) A16.getValue()).second;
                        if (r04 != null) {
                            r13 = (C165818bo) C17880vN.A0G(r3);
                        } else {
                            C163808Wk r22 = (C163808Wk) C166218cX.DEFAULT_INSTANCE.A0N();
                            r22.A0G(AnonymousClass8BR.A0F(Base64.decode(C17880vN.A0x(A16), 0), 0));
                            r13 = (C165818bo) C17880vN.A0G(r3);
                            r04 = (C166218cX) r22.A0C();
                            r04.getClass();
                        }
                        r13.stickerMessage_ = r04;
                        r13.bitField0_ |= 2;
                        r5.A0G(r3);
                    }
                } else if (!(this instanceof C169648mf)) {
                    if (this instanceof C169638me) {
                        C18070vi.A0h(r5, r114);
                        if (!(!(r114 instanceof AnonymousClass23B) || (r113 = (AnonymousClass23B) r114) == null || (list = r113.A00) == null)) {
                            for (Object next : list) {
                                C164878aD r23 = (C164878aD) C17880vN.A0G(r5);
                                next.getClass();
                                EE9 ee9 = r23.peerDataOperationResult_;
                                if (!((C27296DbR) ee9).A00) {
                                    ee9 = C23577Bm6.A09(ee9);
                                    r23.peerDataOperationResult_ = ee9;
                                }
                                ee9.add(next);
                            }
                        }
                    } else if (this instanceof C169628md) {
                        Iterator A152 = AnonymousClass000.A15(((AnonymousClass235) r114).A00);
                        while (A152.hasNext()) {
                            Map.Entry A162 = AnonymousClass000.A16(A152);
                            C163788Wi r4 = (C163788Wi) C165818bo.DEFAULT_INSTANCE.A0N();
                            r4.A0G((AnonymousClass9KN) ((Pair) A162.getValue()).first);
                            C165898bw r05 = (C165898bw) ((Pair) A162.getValue()).second;
                            if (r05 != null) {
                                r12 = (C165818bo) C17880vN.A0G(r4);
                            } else {
                                C23624Bmt A0N2 = C165898bw.DEFAULT_INSTANCE.A0N();
                                String A0x = C17880vN.A0x(A162);
                                C165898bw A0I = AnonymousClass8BV.A0I(A0N2, A0x);
                                A0I.bitField0_ |= 1;
                                A0I.url_ = A0x;
                                r12 = (C165818bo) C17880vN.A0G(r4);
                                r05 = (C165898bw) A0N2.A0C();
                                r05.getClass();
                            }
                            r12.linkPreviewResponse_ = r05;
                            r12.bitField0_ |= 4;
                            r5.A0G(r4);
                        }
                    } else if (this instanceof C169618mc) {
                        C18070vi.A0h(r5, r114);
                        if ((r114 instanceof AnonymousClass243) && (r112 = (AnonymousClass243) r114) != null) {
                            AnonymousClass9KU A002 = AnonymousClass9KU.A00(r112.A00);
                            C18070vi.A0X(A002);
                            r2 = (C163788Wi) C165818bo.DEFAULT_INSTANCE.A0N();
                            C23624Bmt A0N3 = AnonymousClass8ZB.DEFAULT_INSTANCE.A0N();
                            C23624Bmt A0N4 = C163978Xb.DEFAULT_INSTANCE.A0N();
                            String str4 = r112.A01;
                            C163978Xb r18 = (C163978Xb) C17880vN.A0G(A0N4);
                            str4.getClass();
                            r18.bitField0_ |= 1;
                            r18.requestId_ = str4;
                            AnonymousClass8ZB r19 = (AnonymousClass8ZB) C17880vN.A0G(A0N3);
                            C163978Xb r06 = (C163978Xb) A0N4.A0C();
                            r06.getClass();
                            r19.requestMetadata_ = r06;
                            r19.bitField0_ |= 1;
                            AnonymousClass8ZB r110 = (AnonymousClass8ZB) C17880vN.A0G(A0N3);
                            r110.responseCode_ = A002.value;
                            r110.bitField0_ |= 2;
                            r1 = (C165818bo) C17880vN.A0G(r2);
                            AnonymousClass8ZB r07 = (AnonymousClass8ZB) A0N3.A0C();
                            r07.getClass();
                            r1.fullHistorySyncOnDemandRequestResponse_ = r07;
                            i = r1.bitField0_ | 32;
                        }
                    } else {
                        C18070vi.A0h(r5, r114);
                        C163788Wi r42 = (C163788Wi) C165818bo.DEFAULT_INSTANCE.A0N();
                        C23624Bmt A0N5 = C164078Xl.DEFAULT_INSTANCE.A0N();
                        String str5 = ((AnonymousClass245) r114).A00;
                        C164078Xl r111 = (C164078Xl) C17880vN.A0G(A0N5);
                        str5.getClass();
                        r111.bitField0_ |= 1;
                        r111.nonce_ = str5;
                        C165818bo r116 = (C165818bo) C17880vN.A0G(r42);
                        C164078Xl r08 = (C164078Xl) A0N5.A0C();
                        r08.getClass();
                        r116.companionMetaNonceFetchRequestResponse_ = r08;
                        r116.bitField0_ |= 64;
                        r5.A0G(r42);
                    }
                }
                C166368cm A0H = AnonymousClass8BS.A0H(r6);
                C164878aD r09 = (C164878aD) r5.A0C();
                r09.getClass();
                A0H.peerDataOperationRequestResponseMessage_ = r09;
                A0H.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                a2m.A00.A0N(r6);
                return;
            }
            r1.bitField0_ = i;
            r5.A0G(r2);
            C166368cm A0H2 = AnonymousClass8BS.A0H(r6);
            C164878aD r092 = (C164878aD) r5.A0C();
            r092.getClass();
            A0H2.peerDataOperationRequestResponseMessage_ = r092;
            A0H2.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            a2m.A00.A0N(r6);
            return;
        }
        throw AnonymousClass000.A0k("FMessagePeerDataOperationRequestResponseSerializer can't handle message");
    }

    public static int A00(C20077A6d a6d) {
        int i;
        if (C181609Rd.A00(a6d) != C179839Kc.PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE) {
            return -1;
        }
        C164878aD r1 = C20077A6d.A00(a6d).peerDataOperationRequestResponseMessage_;
        if (r1 == null) {
            r1 = C164878aD.DEFAULT_INSTANCE;
        }
        C18070vi.A0d(r1, 0);
        if ((r1.bitField0_ & 1) != 0) {
            AnonymousClass9KY A00 = AnonymousClass9KY.A00(r1.peerDataOperationRequestType_);
            if (A00 == null) {
                A00 = AnonymousClass9KY.UPLOAD_STICKER;
            }
            i = C197169wG.A00(A00.value);
        } else {
            i = -1;
        }
        if (C108965cb.A1b(C197169wG.A00, i)) {
            return i;
        }
        return -1;
    }

    public static String A01(C20077A6d a6d) {
        C164878aD r1 = C20077A6d.A00(a6d).peerDataOperationRequestResponseMessage_;
        if (r1 == null) {
            r1 = C164878aD.DEFAULT_INSTANCE;
        }
        if ((r1.bitField0_ & 2) != 0) {
            return r1.stanzaId_;
        }
        return null;
    }
}
