package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y1;
import X.AnonymousClass206;
import X.AnonymousClass23O;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C18600wl;
import X.C24921Me;
import X.C30391dr;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.CancellationException;

public final class RevokedCommentTextView extends TextEmojiLabel {
    public AnonymousClass11S A00;
    public C24921Me A01;
    public C18600wl A02;
    public C18600wl A03;
    public AnonymousClass1OX A04;
    public boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokedCommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A0F(com.whatsapp.conversation.comments.ui.RevokedCommentTextView r6, X.AnonymousClass23O r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C99974tl
            if (r0 == 0) goto L_0x003a
            r5 = r8
            X.4tl r5 = (X.C99974tl) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003a
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x0040
            X.C30691eM.A01(r1)
        L_0x0020:
            X.C18070vi.A0a(r1)
            return r1
        L_0x0024:
            X.C30691eM.A01(r1)
            X.0wl r2 = r6.getIoDispatcher()
            r1 = 0
            com.whatsapp.conversation.comments.ui.RevokedCommentTextView$getAdminContactName$2 r0 = new com.whatsapp.conversation.comments.ui.RevokedCommentTextView$getAdminContactName$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x003a:
            X.4tl r5 = new X.4tl
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0040:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.comments.ui.RevokedCommentTextView.A0F(com.whatsapp.conversation.comments.ui.RevokedCommentTextView, X.23O, X.1dr):java.lang.Object");
    }

    private final void setAdminRevokeText(AnonymousClass206 r5) {
        int i;
        C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAdminRevoked");
        AnonymousClass23O r52 = (AnonymousClass23O) r5;
        UserJid userJid = r52.A00;
        if (getMeManager().A0O(userJid)) {
            i = 2131886554;
        } else if (userJid == null) {
            i = 2131886552;
        } else {
            RevokedCommentTextView$setAdminRevokeText$1 revokedCommentTextView$setAdminRevokeText$1 = new RevokedCommentTextView$setAdminRevokeText$1(this, r52, (C30391dr) null);
            AnonymousClass1OX r1 = this.A04;
            if (r1 == null) {
                r1 = AnonymousClass1OW.A02(getMainDispatcher());
            }
            AnonymousClass3MX.A1Q(new RevokedCommentTextView$runOnCoroutineScope$1$1((C30391dr) null, revokedCommentTextView$setAdminRevokeText$1), r1);
            this.A04 = r1;
            return;
        }
        setText(i);
    }

    private final void setSenderRevokeText(AnonymousClass206 r3) {
        int i = 2131895351;
        if (r3.A0v.A02) {
            i = 2131895353;
        }
        setText(i);
    }

    public void A0I() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            C72483Me.A0r(A0X, this);
            this.A02 = AnonymousClass3MZ.A1B(A0X);
            this.A03 = AnonymousClass3MZ.A1C(A0X);
            this.A00 = AnonymousClass10E.A17(A0X);
            this.A01 = AnonymousClass3MZ.A0g(A0X);
        }
    }

    public final void A0T(AnonymousClass206 r3) {
        if (r3.A0u == 64) {
            setAdminRevokeText(r3);
        } else {
            setSenderRevokeText(r3);
        }
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1K();
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1L();
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass1OX r1 = this.A04;
        if (r1 != null) {
            AnonymousClass1OW.A04((CancellationException) null, r1);
        }
        this.A04 = null;
    }

    public RevokedCommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ RevokedCommentTextView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
