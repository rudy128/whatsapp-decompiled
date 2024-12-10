package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;

public final class AUU implements C22511BAs {
    public final AnonymousClass00H A00;
    public final C198669yi A01;

    public AUU(C198669yi r2, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public void C1A(C195629te r6, AnonymousClass8X1 r7, AnonymousClass206 r8) {
        String str;
        C18070vi.A0h(r8, r7);
        if (AnonymousClass206.A08(r8)) {
            C692336k A002 = C60472o5.A00(r8);
            if (A002 == null) {
                str = "CommentHistorySyncPostProcessor/isValidComment/comment message does not have comment info loaded";
            } else if (A002.A01() == null) {
                str = "CommentHistorySyncPostProcessor/isValidComment/comment message does not have parent key loaded";
            } else if (C198669yi.A00(r8)) {
                C692336k A003 = C60472o5.A00(r8);
                if (A003 != null) {
                    A51 A012 = A003.A01();
                    if (A012 != null) {
                        AnonymousClass205 r2 = A012.A01;
                        C18070vi.A0W(r2);
                        if (C22971Dz.A06(r2.A00) != null) {
                            C164558Zh r0 = ((C166388co) r7.A00).commentMetadata_;
                            if (r0 == null) {
                                r0 = C164558Zh.DEFAULT_INSTANCE;
                            }
                            C23624Bmt A0O = r0.A0O();
                            AnonymousClass8X7 A004 = C166408cq.A00();
                            AnonymousClass9AT.A02(A012.A00, A004, r2);
                            C164558Zh r22 = (C164558Zh) C17880vN.A0G(A0O);
                            C166408cq r1 = (C166408cq) A004.A0C();
                            int i = C164558Zh.COMMENT_PARENT_KEY_FIELD_NUMBER;
                            r1.getClass();
                            r22.commentParentKey_ = r1;
                            r22.bitField0_ |= 1;
                            C166388co A0P = AnonymousClass8BS.A0P(r7);
                            C164558Zh r02 = (C164558Zh) A0O.A0C();
                            r02.getClass();
                            A0P.commentMetadata_ = r02;
                            A0P.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                        } else {
                            throw AnonymousClass000.A0k("CommentProtobufHelper/addCommentMetadataToWmi/missing parent chat jid");
                        }
                    } else {
                        throw AnonymousClass000.A0k("CommentProtobufHelper/addCommentMetadataToWmi/missing parent message key");
                    }
                } else {
                    throw AnonymousClass000.A0k("CommentProtobufHelper/addCommentMetadataToWmi/comment message does not have commentInfo fully populated");
                }
            }
            Log.e(str);
            throw AnonymousClass000.A0k("CommentHistorySyncPostProcessor/maybeAddCommentMetadata/Invalid comment message");
        }
        if (r8.A0z(16)) {
            C692336k A005 = C60472o5.A00(r8);
            if (A005 != null) {
                C164558Zh r03 = ((C166388co) r7.A00).commentMetadata_;
                if (r03 == null) {
                    r03 = C164558Zh.DEFAULT_INSTANCE;
                }
                C23624Bmt A0O2 = r03.A0O();
                int A006 = A005.A00();
                C164558Zh r12 = (C164558Zh) C17880vN.A0G(A0O2);
                int i2 = C164558Zh.COMMENT_PARENT_KEY_FIELD_NUMBER;
                r12.bitField0_ |= 2;
                r12.replyCount_ = A006;
                C166388co A0P2 = AnonymousClass8BS.A0P(r7);
                C164558Zh r04 = (C164558Zh) A0O2.A0C();
                r04.getClass();
                A0P2.commentMetadata_ = r04;
                A0P2.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                return;
            }
            throw AnonymousClass000.A0k("CommentProtobufHelper/addCommentParentMetadataToWmi/comment parent message does not have commentInfo fully populated");
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2Ly, java.lang.Object, X.36k] */
    public void C1B(C193069pU r4, C166388co r5, AnonymousClass206 r6) {
        C18070vi.A0h(r5, r6);
        if ((r5.bitField1_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            C164558Zh r1 = r5.commentMetadata_;
            if (r1 == null) {
                r1 = C164558Zh.DEFAULT_INSTANCE;
            }
            if (AnonymousClass8BW.A1Q(r1.bitField0_)) {
                this.A00.get();
                C166408cq r0 = r1.commentParentKey_;
                if (r0 == null) {
                    r0 = C166408cq.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r0);
                A51.A01((AnonymousClass1BI) null, r6, C20106A7k.A01(r0));
                r6.A0b(16777216);
                return;
            }
            int i = r1.replyCount_;
            if (i > 0) {
                ? obj = new Object();
                obj.A00 = i;
                obj.A01 = null;
                obj.A02 = null;
                C60472o5.A01(obj, r6);
            }
        }
    }
}
