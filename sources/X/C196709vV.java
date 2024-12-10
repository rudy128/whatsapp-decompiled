package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9vV  reason: invalid class name and case insensitive filesystem */
public abstract class C196709vV {
    public static C166418cr A00(C18030ve r3, C166418cr r4) {
        C163988Xc r0;
        if ((r4.bitField1_ & 16384) == 0 || !C18020vd.A05(C18040vf.A02, r3, 2802)) {
            int i = r4.bitField1_;
            if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                r0 = r4.viewOnceMessageV2_;
            } else {
                int i2 = r4.bitField0_;
                if ((268435456 & i2) != 0) {
                    r0 = r4.viewOnceMessage_;
                } else if (AnonymousClass000.A1O(i2 & Integer.MIN_VALUE)) {
                    r0 = r4.ephemeralMessage_;
                } else if ((i & 512) != 0) {
                    r0 = r4.documentWithCaptionMessage_;
                } else if (AnonymousClass000.A1O(r4.bitField1_ & DefaultCrypto.BUFFER_SIZE) && C18020vd.A05(C18040vf.A02, r3, 2189)) {
                    C163988Xc r02 = r4.editedMessage_;
                    if (r02 == null) {
                        r02 = C163988Xc.DEFAULT_INSTANCE;
                    }
                    C166418cr r2 = r02.message_;
                    if (r2 == null) {
                        r2 = C166418cr.DEFAULT_INSTANCE;
                    }
                    if (AnonymousClass000.A1O(r2.bitField0_ & 67108864)) {
                        return r2;
                    }
                    AnonymousClass8X8 r1 = (AnonymousClass8X8) r2.A0O();
                    C166048cG r03 = r4.messageContextInfo_;
                    if (r03 == null) {
                        r03 = C166048cG.DEFAULT_INSTANCE;
                    }
                    r1.A0V(r03);
                    return AnonymousClass8BR.A0e(r1);
                } else if (AnonymousClass000.A1O(r4.bitField1_ & 4194304)) {
                    r0 = r4.botInvokeMessage_;
                } else if (AnonymousClass000.A1O(r4.bitField1_ & 134217728) && C18020vd.A05(C18040vf.A02, r3, 5692)) {
                    r0 = r4.lottieStickerMessage_;
                } else if ((r4.bitField2_ & 8) != 0 && C18020vd.A05(C18040vf.A02, r3, 8792)) {
                    r0 = r4.eventCoverImage_;
                } else if ((r4.bitField2_ & 32) != 0 && C18020vd.A05(C18040vf.A02, r3, 9816)) {
                    r0 = r4.statusMentionMessage_;
                } else if ((r4.bitField2_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0 || !C18020vd.A05(C18040vf.A02, r3, 12362)) {
                    return null;
                } else {
                    r0 = r4.pollCreationMessageV5_;
                }
            }
        } else {
            r0 = r4.viewOnceMessageV2Extension_;
        }
        if (r0 == null) {
            r0 = C163988Xc.DEFAULT_INSTANCE;
        }
        C166418cr r22 = r0.message_;
        if (r22 == null) {
            return C166418cr.DEFAULT_INSTANCE;
        }
        return r22;
    }

    public static C166418cr A01(C18030ve r3, C166418cr r4) {
        if ((r4.bitField2_ & 256) != 0) {
            C163988Xc r0 = r4.associatedChildMessage_;
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            r4 = r0.message_;
            if (r4 == null) {
                r4 = C166418cr.DEFAULT_INSTANCE;
            }
        }
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r3, 3334) && AnonymousClass000.A1O(r4.bitField1_ & A7Y.A0F)) {
            C163988Xc r02 = r4.groupMentionedMessage_;
            if (r02 == null) {
                r02 = C163988Xc.DEFAULT_INSTANCE;
            }
            r4 = r02.message_;
            if (r4 == null) {
                r4 = C166418cr.DEFAULT_INSTANCE;
            }
        }
        if (AnonymousClass000.A1O(r4.bitField0_ & Integer.MIN_VALUE)) {
            C163988Xc r03 = r4.ephemeralMessage_;
            if (r03 == null) {
                r03 = C163988Xc.DEFAULT_INSTANCE;
            }
            r4 = r03.message_;
            if (r4 == null) {
                r4 = C166418cr.DEFAULT_INSTANCE;
            }
        }
        if ((r4.bitField1_ & 1073741824) != 0) {
            C164478Yz r04 = r4.commentMessage_;
            if (r04 == null) {
                r04 = C164478Yz.DEFAULT_INSTANCE;
            }
            r4 = r04.message_;
            if (r4 == null) {
                r4 = C166418cr.DEFAULT_INSTANCE;
            }
        }
        if ((r4.bitField2_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 && C18020vd.A05(r2, r3, 12362)) {
            C163988Xc r05 = r4.pollCreationMessageV5_;
            if (r05 == null) {
                r05 = C163988Xc.DEFAULT_INSTANCE;
            }
            r4 = r05.message_;
            if (r4 == null) {
                r4 = C166418cr.DEFAULT_INSTANCE;
            }
        }
        C166418cr A00 = A00(r3, r4);
        if (A00 != null) {
            return A00;
        }
        return r4;
    }
}
