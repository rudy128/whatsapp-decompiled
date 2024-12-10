package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.3tf  reason: invalid class name and case insensitive filesystem */
public final class C78803tf extends AnonymousClass3uK {
    public AnonymousClass1N5 A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass205 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass1GP A07;
    public final TemplateRowContentLayout A08 = ((TemplateRowContentLayout) AnonymousClass3MX.A0C(this, 2131436035));

    public C95874mw A1m(AnonymousClass206 r5) {
        int i;
        C18070vi.A0d(r5, 0);
        if (!"MARKETING".equals(AnonymousClass3uP.A0T(getFMessage()))) {
            return super.A1m(r5);
        }
        C108875cR r0 = this.A0k;
        if (r0 != null) {
            i = r0.BW6(r5);
        } else {
            i = 0;
        }
        C108675c7 rowCustomizer = getRowCustomizer();
        int i2 = C95874mw.A06;
        return new C95874mw(i, rowCustomizer.BQ7(), rowCustomizer.BQ6());
    }

    public void A2V(AnonymousClass206 r6, boolean z) {
        AnonymousClass21V r62;
        C62572rc r1;
        C18070vi.A0d(r6, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r6, getFMessage());
        super.A2V(r6, z);
        if (A1Z) {
            this.A04 = false;
        }
        if (z || A1Z) {
            A01();
        }
        if (this.A06 && C18070vi.A18(this.A03, r6.A0v)) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 8394) && (r6 instanceof AnonymousClass21V) && (r62 = (AnonymousClass21V) r6) != null && (r1 = r62.A02) != null) {
                if (r1.A0f || r1.A0V) {
                    this.A06 = false;
                    A20();
                }
            }
        }
    }

    public boolean A2o() {
        this.A06 = true;
        this.A03 = getFMessage().A0v;
        return super.A2o();
    }

    public final void setMarketingMessageThumbnailDownloadManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setReadReceiptUtils(AnonymousClass1N5 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setViewMessageEventLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final void A01() {
        this.A08.A02(this.A07, this, this.A2v);
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass21Y fMessage = getFMessage();
            C18070vi.A0X(fMessage);
            ((C63542tH) C18070vi.A0E(getMarketingMessageThumbnailDownloadManager())).A02(fMessage, false);
        }
    }

    public void A1M() {
        if (!this.A05) {
            this.A05 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
            C78703tO.A00(r4, A0O, this);
            this.A01 = C000200d.A00(r4.AXn);
            this.A00 = (AnonymousClass1N5) r4.A9K.get();
            this.A02 = C000200d.A00(A0O.A0l);
        }
    }

    public void A2t(AnonymousClass206 r17, boolean z, boolean z2) {
        AnonymousClass206 r5 = r17;
        C693536w A002 = C60502o8.A00(r5);
        if (A002 != null && A002.A0A) {
            C18030ve r1 = this.A0F;
            C18040vf r2 = C18040vf.A02;
            if (C18020vd.A05(r2, r1, 8394)) {
                boolean A052 = C18020vd.A05(r2, this.A0F, 9125);
                C32021gV r7 = this.A1S;
                ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0L;
                AnonymousClass3M2 r6 = this.A0T;
                AnonymousClass205 r8 = r5.A0v;
                if (A052) {
                    C32021gV.A05((Bitmap.Config) null, conversationRowVideo$RowVideoView, r5, r6, r7, r8, 2000, false, false, false, true, true, true);
                    return;
                } else {
                    r7.A0F(conversationRowVideo$RowVideoView, r5, r6, r8, 2000, false, false, false);
                    return;
                }
            }
        }
        super.A2t(r5, z, z2);
    }

    public final AnonymousClass00H getMarketingMessageThumbnailDownloadManager() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("marketingMessageThumbnailDownloadManager");
        throw null;
    }

    public final AnonymousClass1N5 getReadReceiptUtils() {
        AnonymousClass1N5 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("readReceiptUtils");
        throw null;
    }

    public final AnonymousClass00H getViewMessageEventLogger() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewMessageEventLogger");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78803tf(Context context, AnonymousClass1GP r3, C108875cR r4, C440321w r5) {
        super(context, r4, r5);
        C18070vi.A0j(context, r5);
        C18070vi.A0d(r3, 4);
        A1M();
        this.A07 = r3;
        A01();
    }

    public boolean A1W() {
        AnonymousClass21Y fMessage = getFMessage();
        C18070vi.A0z(fMessage, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageTemplate");
        Long l = ((C439421n) fMessage).BaE().A00;
        if (l == null || AnonymousClass11P.A01(this.A0u) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A1u() {
        A01();
        super.A1u();
    }

    public void A20() {
        super.A20();
        AnonymousClass21Y fMessage = getFMessage();
        C18070vi.A0X(fMessage);
        C98814rl.A00(this.A1X, this, fMessage, 37);
    }

    public C108675c7 getRowCustomizer() {
        if (!C20120A8f.A06(getFMessage())) {
            return this.A0B.A0F;
        }
        C108675c7 rowCustomizer = super.getRowCustomizer();
        C18070vi.A0X(rowCustomizer);
        return rowCustomizer;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) getViewMessageEventLogger().get()).A00(getFMessage(), i);
    }

    public int getCenteredLayoutId() {
        return 2131624942;
    }

    public int getIncomingLayoutId() {
        return 2131624942;
    }

    public int getOutgoingLayoutId() {
        return 2131624943;
    }
}
