package X;

import android.util.Base64;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.HashSet;
import java.util.Iterator;

public class ASW implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r9) {
        AnonymousClass8BY.A1G(r9, "Unexpected message type ", AnonymousClass000.A10(), r9 instanceof AnonymousClass232);
        AnonymousClass232 r92 = (AnonymousClass232) r9;
        int i = r92.A00;
        C163898Wt r4 = (C163898Wt) C166368cm.DEFAULT_INSTANCE.A0N();
        r4.A0G(C179839Kc.PEER_DATA_OPERATION_REQUEST_MESSAGE);
        C23624Bmt A0N = C165678ba.DEFAULT_INSTANCE.A0N();
        if (i != -1) {
            AnonymousClass9KY A00 = AnonymousClass9KY.A00(i);
            C165678ba r1 = (C165678ba) C17880vN.A0G(A0N);
            r1.peerDataOperationRequestType_ = A00.value;
            r1.bitField0_ |= 1;
            if (i == 0) {
                Iterator it = r92.A01.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    C23624Bmt A08 = AnonymousClass8BS.A08(C164068Xk.DEFAULT_INSTANCE);
                    C164068Xk r12 = (C164068Xk) A08.A00;
                    A0v.getClass();
                    r12.bitField0_ |= 1;
                    r12.fileSha256_ = A0v;
                    C165678ba r3 = (C165678ba) C17880vN.A0G(A0N);
                    C23577Bm6 A0C = A08.A0C();
                    A0C.getClass();
                    EE9 ee9 = r3.requestStickerReupload_;
                    if (!((C27296DbR) ee9).A00) {
                        ee9 = C23577Bm6.A09(ee9);
                        r3.requestStickerReupload_ = ee9;
                    }
                    ee9.add(A0C);
                }
            } else if (i == 4) {
                Iterator it2 = r92.A01.iterator();
                while (it2.hasNext()) {
                    String A0v2 = C17880vN.A0v(it2);
                    C23624Bmt A0N2 = C164058Xj.DEFAULT_INSTANCE.A0N();
                    try {
                        C166408cq r0 = (C166408cq) C23577Bm6.A07(C166408cq.DEFAULT_INSTANCE, Base64.decode(A0v2, 2));
                        C164058Xj r13 = (C164058Xj) C17880vN.A0G(A0N2);
                        r0.getClass();
                        r13.messageKey_ = r0;
                        r13.bitField0_ |= 1;
                        C165678ba r32 = (C165678ba) C17880vN.A0G(A0N);
                        C23577Bm6 A0C2 = A0N2.A0C();
                        A0C2.getClass();
                        EE9 ee92 = r32.placeholderMessageResendRequest_;
                        if (!((C27296DbR) ee92).A00) {
                            ee92 = C23577Bm6.A09(ee92);
                            r32.placeholderMessageResendRequest_ = ee92;
                        }
                        ee92.add(A0C2);
                    } catch (AnonymousClass1PN unused) {
                        throw AnonymousClass8BW.A0S(26);
                    }
                }
            }
        }
        C166368cm A0H = AnonymousClass8BS.A0H(r4);
        C165678ba r02 = (C165678ba) A0N.A0C();
        r02.getClass();
        A0H.peerDataOperationRequestMessage_ = r02;
        A0H.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        a2m.A00.A0N(r4);
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        int i;
        DNC dnc;
        C166408cq r0;
        if (C181609Rd.A00(a6d) != C179839Kc.PEER_DATA_OPERATION_REQUEST_MESSAGE) {
            return null;
        }
        C166418cr r3 = a6d.A08;
        C165678ba r1 = AnonymousClass8BS.A0I(r3).peerDataOperationRequestMessage_;
        if (r1 == null) {
            r1 = C165678ba.DEFAULT_INSTANCE;
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
        AnonymousClass232 r5 = new AnonymousClass232(a6d.A0A, a6d.A03);
        r5.A00 = i;
        C165678ba r2 = AnonymousClass8BS.A0I(r3).peerDataOperationRequestMessage_;
        if (r2 == null) {
            r2 = C165678ba.DEFAULT_INSTANCE;
        }
        HashSet A12 = C17880vN.A12();
        if (i == 0) {
            if (r2.requestStickerReupload_.size() != 0) {
                for (C164068Xk r22 : r2.requestStickerReupload_) {
                    if ((r22.bitField0_ & 1) != 0) {
                        A12.add(r22.fileSha256_);
                    } else {
                        throw AnonymousClass8BR.A0p("missing sticker fileHash", 26);
                    }
                }
            } else {
                throw AnonymousClass8BR.A0p("missing sticker request msg", 26);
            }
        } else if (i != 2) {
            if (i == 3) {
                if ((r2.bitField0_ & 2) != 0) {
                    dnc = r2.historySyncOnDemandRequest_;
                    if (dnc == null) {
                        dnc = AnonymousClass2BP.DEFAULT_INSTANCE;
                    }
                } else {
                    throw AnonymousClass8BR.A0p("missing history sync on demand payload", 26);
                }
            } else if (i == 4) {
                if (r2.placeholderMessageResendRequest_.size() != 0) {
                    for (C164058Xj r23 : r2.placeholderMessageResendRequest_) {
                        if ((r23.bitField0_ & 1) == 0 || ((r0 = r23.messageKey_) == null && (r0 = C166408cq.DEFAULT_INSTANCE) == null)) {
                            throw AnonymousClass8BR.A0p("missing message key in placeholder resend request", 26);
                        }
                        A12.add(Base64.encodeToString(r0.A0M(), 2));
                    }
                } else {
                    throw AnonymousClass8BR.A0p("missing placeholder resend request", 26);
                }
            } else if (i != 6) {
                return r5;
            } else {
                if ((r2.bitField0_ & 4) == 0) {
                    AnonymousClass8Z9 r02 = r2.fullHistorySyncOnDemandRequest_;
                    if (r02 == null) {
                        r02 = AnonymousClass8Z9.DEFAULT_INSTANCE;
                    }
                    if ((r02.bitField0_ & 1) == 0) {
                        throw AnonymousClass8BR.A0p("missing full history sync on demand payload", 26);
                    }
                }
                dnc = r2.fullHistorySyncOnDemandRequest_;
                if (dnc == null) {
                    dnc = AnonymousClass8Z9.DEFAULT_INSTANCE;
                }
            }
            A12.add(Base64.encodeToString(dnc.A0M(), 2));
        } else if (r2.requestUrlPreview_.size() != 0) {
            for (AnonymousClass8ZA r24 : r2.requestUrlPreview_) {
                if ((r24.bitField0_ & 1) != 0) {
                    A12.add(Base64.encodeToString(r24.A0M(), 2));
                } else {
                    throw AnonymousClass8BR.A0p("missing link preview url", 26);
                }
            }
        } else {
            throw AnonymousClass8BR.A0p("missing url request msg", 26);
        }
        r5.A01 = A12;
        return r5;
    }
}
