package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1FU;
import X.AnonymousClass1O2;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4RR;
import X.AnonymousClass5GM;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C28931bI;
import X.C30391dr;
import X.C37451pZ;
import X.C72453Mb;
import X.C72473Md;
import X.C90284dp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.components.TextAndDateLayout;
import java.util.concurrent.CancellationException;

public final class TextCommentLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public AnonymousClass11P A01;
    public C18030ve A02;
    public AnonymousClass1O2 A03;
    public AnonymousClass031 A04;
    public C18600wl A05;
    public C18600wl A06;
    public AnonymousClass1OX A07;
    public boolean A08;
    public final C28931bI A09;
    public final LinearLayout A0A;
    public final TextAndDateLayout A0B;
    public final CommentContactPictureView A0C;
    public final CommentDateView A0D;
    public final CommentHeaderView A0E;
    public final CommentTextView A0F;
    public final C28931bI A0G;
    public final C18100vl A0H;

    public TextCommentLayout(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass10E.A8r(A0O);
            this.A03 = (AnonymousClass1O2) A0O.A57.get();
            this.A05 = AnonymousClass3MZ.A1B(A0O);
            this.A06 = AnonymousClass3MZ.A1C(A0O);
            this.A00 = AnonymousClass10E.A17(A0O);
            this.A01 = AnonymousClass10E.A6O(A0O);
        }
        this.A0H = AnonymousClass1DF.A01(new AnonymousClass5GM(context));
        View.inflate(context, 2131624563, this);
        this.A0A = (LinearLayout) AnonymousClass3MX.A0C(this, 2131429202);
        this.A0C = (CommentContactPictureView) AnonymousClass3MX.A0C(this, 2131429210);
        View findViewById = findViewById(2131429214);
        TextAndDateLayout textAndDateLayout = (TextAndDateLayout) findViewById;
        textAndDateLayout.A03 = true;
        C18070vi.A0X(findViewById);
        this.A0B = textAndDateLayout;
        this.A0F = (CommentTextView) AnonymousClass3MX.A0C(this, 2131429213);
        this.A0E = (CommentHeaderView) AnonymousClass3MX.A0C(this, 2131429207);
        this.A0D = (CommentDateView) AnonymousClass3MX.A0C(this, 2131429203);
        this.A09 = C72453Mb.A0s(this, 2131429211);
        this.A0G = C72453Mb.A0s(this, 2131429212);
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setInFlightMessages(AnonymousClass1O2 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.conversation.comments.ui.TextCommentLayout r6, X.AnonymousClass206 r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C99984tm
            if (r0 == 0) goto L_0x003a
            r5 = r8
            X.4tm r5 = (X.C99984tm) r5
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
            com.whatsapp.conversation.comments.ui.TextCommentLayout$getFailedCommentBundle$2 r0 = new com.whatsapp.conversation.comments.ui.TextCommentLayout$getFailedCommentBundle$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x003a:
            X.4tm r5 = new X.4tm
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0040:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.comments.ui.TextCommentLayout.A00(com.whatsapp.conversation.comments.ui.TextCommentLayout, X.206, X.1dr):java.lang.Object");
    }

    private final void setupClickListener(AnonymousClass206 r3) {
        C90284dp.A00(this.A0A, this, r3, 7);
    }

    public final void A01(C37451pZ r5, AnonymousClass4RR r6, AnonymousClass206 r7) {
        this.A0C.A07(r5, r7);
        this.A0F.A0T(r6, r7, this.A0G);
        this.A0E.A02(r7);
        CommentDateView commentDateView = this.A0D;
        C72473Md.A15(commentDateView, commentDateView.getTime(), commentDateView.getWhatsAppLocale(), r7);
        TextCommentLayout$bind$1 textCommentLayout$bind$1 = new TextCommentLayout$bind$1(this, r7, (C30391dr) null);
        AnonymousClass1OX r1 = this.A07;
        if (r1 == null) {
            r1 = AnonymousClass1OW.A02(getMainDispatcher());
        }
        AnonymousClass3MX.A1Q(new TextCommentLayout$runOnCoroutineScope$1$1((C30391dr) null, textCommentLayout$bind$1), r1);
        this.A07 = r1;
        setupClickListener(r7);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A0H.getValue();
    }

    public final AnonymousClass1O2 getInFlightMessages() {
        AnonymousClass1O2 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inFlightMessages");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1K();
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A06;
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

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass1OX r1 = this.A07;
        if (r1 != null) {
            AnonymousClass1OW.A04((CancellationException) null, r1);
        }
        this.A07 = null;
    }
}
