package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.8X8  reason: invalid class name */
public final class AnonymousClass8X8 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X8() {
        super(C166418cr.DEFAULT_INSTANCE);
    }

    public static C163878Wr A00(AnonymousClass8X8 r0) {
        C166398cp r02 = ((C166418cr) r0.A00).interactiveMessage_;
        if (r02 == null) {
            r02 = C166398cp.DEFAULT_INSTANCE;
        }
        return (C163878Wr) r02.A0O();
    }

    public static C163898Wt A01(AnonymousClass8X8 r0) {
        C166368cm r02 = ((C166418cr) r0.A00).protocolMessage_;
        if (r02 == null) {
            r02 = C166368cm.DEFAULT_INSTANCE;
        }
        return (C163898Wt) r02.A0O();
    }

    public static C163918Wv A02(AnonymousClass8X8 r0) {
        C166348ck r02 = ((C166418cr) r0.A00).templateMessage_;
        if (r02 == null) {
            r02 = C166348ck.DEFAULT_INSTANCE;
        }
        return (C163918Wv) r02.A0O();
    }

    public static C163928Ww A03(AnonymousClass8X8 r0) {
        C166248ca r02 = ((C166418cr) r0.A00).videoMessage_;
        if (r02 == null) {
            r02 = C166248ca.DEFAULT_INSTANCE;
        }
        return (C163928Ww) r02.A0O();
    }

    public C166048cG A0G() {
        C166048cG r0 = ((C166418cr) this.A00).messageContextInfo_;
        if (r0 == null) {
            return C166048cG.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public static C166418cr A04(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C166418cr r1 = (C166418cr) bmt.A00;
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        obj.getClass();
        return r1;
    }

    public static void A05(C23624Bmt bmt, AnonymousClass8X8 r1) {
        r1.A0V((C166048cG) bmt.A0C());
    }

    public static void A06(C23624Bmt bmt, AnonymousClass8X8 r1) {
        r1.A0L((C166398cp) bmt.A0C());
    }

    public static void A07(C23624Bmt bmt, AnonymousClass8X8 r1, C163878Wr r2) {
        r2.A0G((C165638bW) bmt.A0C());
        r1.A0L((C166398cp) r2.A0C());
    }

    public void A0H(AnonymousClass8SR r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166138cP r1 = (C166138cP) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.audioMessage_ = r1;
        A0M.bitField0_ |= 128;
    }

    public void A0I(C165858bs r3) {
        C166418cr A04 = A04(this, r3);
        A04.buttonsMessage_ = r3;
        A04.bitField1_ |= 1;
    }

    public void A0J(C162748Si r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166208cW r1 = (C166208cW) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.documentMessage_ = r1;
        A0M.bitField0_ |= 64;
    }

    public void A0K(C163738Wd r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166258cb r1 = (C166258cb) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.extendedTextMessage_ = r1;
        A0M.bitField0_ |= 32;
    }

    public void A0L(C166398cp r3) {
        C166418cr A04 = A04(this, r3);
        A04.interactiveMessage_ = r3;
        A04.bitField1_ |= 8;
    }

    public void A0M(AnonymousClass8TE r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C165968c8 r1 = (C165968c8) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.liveLocationMessage_ = r1;
        A0M.bitField0_ |= 65536;
    }

    public void A0N(C163898Wt r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166368cm r1 = (C166368cm) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.protocolMessage_ = r1;
        A0M.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
    }

    public void A0O(C166368cm r3) {
        C166418cr A04 = A04(this, r3);
        A04.protocolMessage_ = r3;
        A04.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
    }

    public void A0P(C163908Wu r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        AnonymousClass8ZH r1 = (AnonymousClass8ZH) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.senderKeyDistributionMessage_ = r1;
        A0M.bitField0_ |= 2;
    }

    public void A0Q(C163808Wk r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166218cX r1 = (C166218cX) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.stickerMessage_ = r1;
        A0M.bitField0_ |= 2097152;
    }

    public void A0R(C163918Wv r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166348ck r1 = (C166348ck) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.templateMessage_ = r1;
        A0M.bitField0_ |= 1048576;
    }

    public void A0S(C163928Ww r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166248ca r1 = (C166248ca) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.videoMessage_ = r1;
        A0M.bitField0_ |= 256;
    }

    public void A0T(C166248ca r3) {
        C166418cr A04 = A04(this, r3);
        A04.videoMessage_ = r3;
        A04.bitField0_ |= 256;
    }

    public void A0U(C163938Wx r4) {
        C166418cr A0M = AnonymousClass8BS.A0M(this);
        C166048cG r1 = (C166048cG) r4.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.messageContextInfo_ = r1;
        A0M.bitField0_ |= 67108864;
    }

    public void A0V(C166048cG r4) {
        C166418cr A04 = A04(this, r4);
        A04.messageContextInfo_ = r4;
        A04.bitField0_ |= 67108864;
    }
}
