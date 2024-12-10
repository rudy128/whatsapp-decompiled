package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.3uB  reason: invalid class name and case insensitive filesystem */
public final class C79023uB extends C78603tB {
    public AnonymousClass1N5 A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final AnonymousClass1GP A04;
    public final TemplateRowContentLayout A05 = ((TemplateRowContentLayout) AnonymousClass3MX.A0C(this, 2131436035));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79023uB(Context context, AnonymousClass1GP r3, C108875cR r4, C440521y r5) {
        super(context, r4, r5);
        C18070vi.A0e(context, 1, r5);
        C18070vi.A0d(r3, 4);
        A1M();
        ConversationRowImage$RowImageView.A02(this.A09);
        this.A04 = r3;
        A00();
    }

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
        int i2 = C95874mw.A06;
        return new C95874mw(i, this.A0B.A0E.BQ7(), this.A0B.A0E.BQ6());
    }

    public void A2V(AnonymousClass206 r3, boolean z) {
        C18070vi.A0d(r3, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r3, getFMessage());
        super.A2V(r3, z);
        if (A1Z) {
            this.A03 = false;
        }
        if (z || A1Z) {
            A00();
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (X.AnonymousClass3u3.A0N(r4) == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r4 = this;
            com.whatsapp.conversation.conversationrow.TemplateRowContentLayout r2 = r4.A05
            X.5XK r1 = r4.A2v
            X.1GP r0 = r4.A04
            r2.A02(r0, r4, r1)
            X.21d r0 = r4.getFMessage()
            X.C18070vi.A0X(r0)
            X.36w r0 = X.C60502o8.A00(r0)
            if (r0 == 0) goto L_0x0036
            boolean r1 = r0.A0A
            r0 = 1
            if (r1 != r0) goto L_0x0036
            X.0ve r2 = r4.A0F
            r1 = 8394(0x20ca, float:1.1762E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0036
            android.view.View r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r4.A09
            r0 = 42
            X.C89904dD.A00(r1, r4, r0)
        L_0x0035:
            return
        L_0x0036:
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0035
            X.00H r0 = r4.getMarketingMessageThumbnailDownloadManager()
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.2tH r2 = (X.C63542tH) r2
            X.21d r1 = r4.getFMessage()
            X.C18070vi.A0X(r1)
            r0 = 0
            boolean r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x0035
            r3 = 1
            r4.A03 = r3
            X.21d r2 = r4.getFMessage()
            android.widget.FrameLayout r0 = r4.A04
            if (r0 == 0) goto L_0x0064
            boolean r1 = X.AnonymousClass3u3.A0N(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r4.A2u(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79023uB.A00():void");
    }

    public void A2t(AnonymousClass206 r30, boolean z) {
        AnonymousClass206 r7 = r30;
        C693536w A002 = C60502o8.A00(r7);
        if (A002 != null && A002.A0A) {
            C18030ve r1 = this.A0F;
            C18040vf r3 = C18040vf.A02;
            if (C18020vd.A05(r3, r1, 8394)) {
                this.A02.setVisibility(8);
                boolean A052 = C18020vd.A05(r3, this.A0F, 9125);
                Bitmap.Config config = null;
                C32021gV r9 = this.A1S;
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
                AnonymousClass3M2 r8 = this.A0K;
                AnonymousClass205 r10 = r7.A0v;
                boolean A053 = C18020vd.A05(r3, this.A0F, 10306);
                if (A052) {
                    if (A053) {
                        config = Bitmap.Config.RGB_565;
                    }
                    C32021gV.A05(config, conversationRowImage$RowImageView, r7, r8, r9, r10, 2000, false, false, false, true, true, true);
                    return;
                }
                if (A053) {
                    config = Bitmap.Config.RGB_565;
                }
                C32021gV.A05(config, conversationRowImage$RowImageView, r7, r8, r9, r10, 2000, false, false, false, false, true, true);
                return;
            }
        }
        super.A2t(r7, z);
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

    public C108675c7 getRowCustomizer() {
        return this.A0B.A0E;
    }

    public final AnonymousClass00H getViewMessageEventLogger() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewMessageEventLogger");
        throw null;
    }

    public boolean A1W() {
        C438421d fMessage = getFMessage();
        C18070vi.A0z(fMessage, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageTemplate");
        Long l = ((C439421n) fMessage).BaE().A00;
        if (l == null || AnonymousClass11P.A01(this.A0u) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A1u() {
        A00();
        super.A1u();
    }

    public void A20() {
        super.A20();
        C438421d fMessage = getFMessage();
        C18070vi.A0X(fMessage);
        C98814rl.A00(this.A1X, this, fMessage, 16);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) getViewMessageEventLogger().get()).A00(getFMessage(), i);
    }

    public int getCenteredLayoutId() {
        return 2131624936;
    }

    public int getIncomingLayoutId() {
        return 2131624936;
    }

    public int getOutgoingLayoutId() {
        return 2131624937;
    }
}
