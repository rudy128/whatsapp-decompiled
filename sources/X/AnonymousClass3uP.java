package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3uP  reason: invalid class name */
public abstract class AnonymousClass3uP extends AnonymousClass3uQ {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public ProgressDialog A04;
    public View A05;
    public ViewGroup A06;
    public ViewGroup A07;
    public FrameLayout A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public LinearLayout A0E;
    public LinearLayout A0F;
    public LinearLayout A0G;
    public TextView A0H;
    public TextView A0I;
    public AnonymousClass1XU A0J;
    public C19880zA A0K;
    public C19880zA A0L;
    public C19880zA A0M;
    public C19880zA A0N;
    public C19880zA A0O;
    public C19880zA A0P;
    public AnonymousClass1L9 A0Q;
    public AnonymousClass4KR A0R;
    public AnonymousClass1KB A0S;
    public C36361nl A0T;
    public AnonymousClass11S A0U;
    public C34531kd A0V;
    public AnonymousClass18O A0W;
    public AnonymousClass181 A0X;
    public TextEmojiLabel A0Y;
    public C42141xh A0Z;
    public C33251iW A0a;
    public WaTextView A0b;
    public C63272sn A0c;
    public C195529tU A0d;
    public A8Q A0e;
    public C85424Ni A0f;
    public C35191ln A0g;
    public AnonymousClass11E A0h;
    public AnonymousClass1VW A0i;
    public AnonymousClass1M9 A0j;
    public AnonymousClass1PM A0k;
    public C24921Me A0l;
    public C25491Ok A0m;
    public AnonymousClass4VN A0n;
    public AnonymousClass3OA A0o;
    public ConversationRowParticipantHeaderMainView A0p;
    public ConversationRowParticipantHeaderQuotedView A0q;
    public AnonymousClass4Q6 A0r;
    public C137986wL A0s;
    public AnonymousClass8G7 A0t;
    public AnonymousClass11P A0u;
    public C19830z4 A0v;
    public C25181Nf A0w;
    public AnonymousClass122 A0x;
    public C53312cK A0y;
    public AnonymousClass1MZ A0z;
    public C36391no A10;
    public C57482j9 A11;
    public C24661Le A12;
    public AnonymousClass1WM A13;
    public AnonymousClass1VU A14;
    public AnonymousClass1KW A15;
    public C26131Qy A16;
    public AnonymousClass12L A17;
    public C25931Qe A18;
    public AnonymousClass126 A19;
    public AnonymousClass1MB A1A;
    public C95684md A1B;
    public C131596lM A1C;
    public C32011gU A1D;
    public C26421Sb A1E;
    public C32351h3 A1F;
    public C32091gc A1G;
    public AnonymousClass4RU A1H;
    public AnonymousClass1O2 A1I;
    public C87794Wz A1J;
    public ALX A1K;
    public C40061u6 A1L;
    public C18010vc A1M;
    public C95674mc A1N;
    public C191569mo A1O;
    public C26631Sw A1P;
    public C24901Mc A1Q;
    public C36401np A1R;
    public C32021gV A1S;
    public AnonymousClass1DC A1T;
    public C28931bI A1U;
    public C28931bI A1V;
    public C28931bI A1W;
    public AnonymousClass10I A1X;
    public C32131gh A1Y;
    public AnonymousClass00H A1Z;
    public AnonymousClass00H A1a;
    public AnonymousClass00H A1b;
    public AnonymousClass00H A1c;
    public AnonymousClass00H A1d;
    public AnonymousClass00H A1e;
    public AnonymousClass00H A1f;
    public AnonymousClass00H A1g;
    public AnonymousClass00H A1h;
    public AnonymousClass00H A1i;
    public AnonymousClass00H A1j;
    public AnonymousClass00H A1k;
    public AnonymousClass00H A1l;
    public AnonymousClass00H A1m;
    public AnonymousClass00H A1n;
    public AnonymousClass00H A1o;
    public AnonymousClass00H A1p;
    public AnonymousClass00H A1q;
    public AnonymousClass00H A1r;
    public AnonymousClass00H A1s;
    public AnonymousClass00H A1t;
    public AnonymousClass00H A1u;
    public AnonymousClass00H A1v;
    public AnonymousClass00H A1w;
    public AnonymousClass00H A1x;
    public AnonymousClass00H A1y;
    public AnonymousClass00H A1z;
    public AnonymousClass00H A20;
    public AnonymousClass00H A21;
    public AnonymousClass00H A22;
    public AnonymousClass00H A23;
    public AnonymousClass00H A24;
    public AnonymousClass00H A25;
    public AnonymousClass00H A26;
    public AnonymousClass00H A27;
    public AnonymousClass00H A28;
    public AnonymousClass00H A29;
    public AnonymousClass00H A2A;
    public AnonymousClass00H A2B;
    public AnonymousClass00H A2C;
    public AnonymousClass00H A2D;
    public AnonymousClass00H A2E;
    public AnonymousClass00H A2F;
    public AnonymousClass00H A2G;
    public AnonymousClass00H A2H;
    public AnonymousClass00H A2I;
    public AnonymousClass00H A2J;
    public AnonymousClass00H A2K;
    public AnonymousClass00H A2L;
    public AnonymousClass00H A2M;
    public AnonymousClass00H A2N;
    public AnonymousClass00H A2O;
    public AnonymousClass00H A2P;
    public AnonymousClass00H A2Q;
    public AnonymousClass00H A2R;
    public AnonymousClass00H A2S;
    public AnonymousClass00H A2T;
    public AnonymousClass00H A2U;
    public AnonymousClass00H A2V;
    public AnonymousClass00H A2W;
    public AnonymousClass00H A2X;
    public Runnable A2Y = new C98774rh(this, 38);
    public Runnable A2Z;
    public Runnable A2a;
    public boolean A2b;
    public boolean A2c = false;
    public boolean A2d = false;
    public boolean A2e = false;
    public boolean A2f;
    public boolean A2g = false;
    public boolean A2h;
    public boolean A2i = true;
    public int A2j = 0;
    public View A2k;
    public TextView A2l;
    public TextView A2m;
    public TextView A2n;
    public TextEmojiLabel A2o;
    public TextEmojiLabel A2p;
    public SpannableStringBuilder A2q;
    public WaTextView A2r;
    public C28931bI A2s;
    public final View.OnLongClickListener A2t = new C90274do(this, 12);
    public final C85934Pl A2u = new C85934Pl(this);
    public final AnonymousClass5XK A2v = new C94644kx(this);
    public final AnonymousClass00H A2w = C99054sC.A00(this, 7);
    public final Runnable A2x = new C98774rh(this, 49);
    public final View.OnKeyListener A2y = new C90164dd(this, 2);

    public static void A0V(View view, AnonymousClass1FU r4, AnonymousClass3uP r5, UserJid userJid) {
        AnonymousClass3uP r0 = r5;
        if (view != null) {
            r0 = view;
        }
        AnonymousClass1BI r2 = null;
        A09 a09 = new A09(r0, userJid, (Integer) null);
        int i = 1;
        if (view != null) {
            i = 2;
        }
        a09.A00 = i;
        if (C79103uS.A1C(r5) instanceof GroupJid) {
            r2 = C79103uS.A1C(r5);
        }
        a09.A01 = r2;
        a09.A01(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r15.A0i() == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (r2 == -1) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
        if (r15.A0i() == false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0f(X.AnonymousClass3uP r15, int r16) {
        /*
            r0 = r15
            X.5cR r5 = r15.A0k
            if (r5 == 0) goto L_0x00b0
            r15.getRowCustomizer()
            X.00H r1 = r15.A0P
            java.lang.Object r3 = r1.get()
            X.4Zj r3 = (X.C88354Zj) r3
            int r2 = r5.getContainerType()
            X.206 r1 = r15.getFMessage()
            boolean r1 = r3.A06(r1, r2)
            if (r1 == 0) goto L_0x00b0
            android.widget.LinearLayout r1 = r15.A06
            if (r1 != 0) goto L_0x0041
            X.0ve r3 = r15.A0F
            r2 = 11487(0x2cdf, float:1.6097E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            android.content.Context r2 = r15.getContext()
            if (r1 == 0) goto L_0x00aa
            X.3Q6 r1 = new X.3Q6
            r1.<init>(r2)
        L_0x0037:
            r15.A06 = r1
            r15.addView(r1)
            android.widget.LinearLayout r1 = r15.A06
            r1.bringToFront()
        L_0x0041:
            X.8BG r9 = r15.getMessageReactions()
            X.36k r10 = r15.getMessageCommentInfo()
            X.00H r1 = r15.A0P
            java.lang.Object r3 = r1.get()
            X.4Zj r3 = (X.C88354Zj) r3
            android.widget.LinearLayout r4 = r15.A06
            X.206 r7 = r15.getFMessage()
            if (r9 != 0) goto L_0x0064
            X.11S r2 = r15.A0U
            java.util.List r1 = java.util.Collections.emptyList()
            X.7CA r9 = new X.7CA
            r9.<init>(r2, r1)
        L_0x0064:
            boolean r11 = r15.A1Y()
            boolean r12 = r15.A1Z()
            boolean r13 = r15.A0i()
            boolean r1 = r15.A2d
            if (r1 != 0) goto L_0x007b
            boolean r1 = r15.A0i()
            r14 = 1
            if (r1 != 0) goto L_0x007c
        L_0x007b:
            r14 = 0
        L_0x007c:
            boolean r15 = r15.A0i()
            X.4V9 r6 = new X.4V9
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1 = 28
            r2 = r16
            if (r2 == r1) goto L_0x0090
            r1 = -1
            r11 = 0
            if (r2 != r1) goto L_0x0091
        L_0x0090:
            r11 = 1
        L_0x0091:
            r1 = 42
            X.4rh r8 = new X.4rh
            r8.<init>(r0, r1)
            r1 = 43
            X.4rh r9 = new X.4rh
            r9.<init>(r0, r1)
            r1 = 44
            X.4rh r10 = new X.4rh
            r10.<init>(r0, r1)
        L_0x00a6:
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00a9:
            return
        L_0x00aa:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r2)
            goto L_0x0037
        L_0x00b0:
            android.widget.LinearLayout r1 = r15.A06
            if (r1 == 0) goto L_0x00a9
            X.00H r1 = r15.A0P
            java.lang.Object r3 = r1.get()
            X.4Zj r3 = (X.C88354Zj) r3
            android.widget.LinearLayout r4 = r15.A06
            X.206 r7 = r15.getFMessage()
            X.11S r2 = r15.A0U
            java.util.List r1 = java.util.Collections.emptyList()
            X.7CA r9 = new X.7CA
            r9.<init>(r2, r1)
            boolean r11 = r15.A1Y()
            boolean r12 = r15.A1Z()
            boolean r13 = r15.A0i()
            boolean r1 = r15.A2d
            if (r1 != 0) goto L_0x00e4
            boolean r1 = r15.A0i()
            r14 = 1
            if (r1 != 0) goto L_0x00e5
        L_0x00e4:
            r14 = 0
        L_0x00e5:
            boolean r15 = r15.A0i()
            r10 = 0
            X.4V9 r6 = new X.4V9
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1 = 39
            X.4rh r8 = new X.4rh
            r8.<init>(r0, r1)
            r1 = 40
            X.4rh r9 = new X.4rh
            r9.<init>(r0, r1)
            r1 = 41
            X.4rh r10 = new X.4rh
            r10.<init>(r0, r1)
            r11 = 0
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A0f(X.3uP, int):void");
    }

    public int A1O() {
        return Math.max(0, super.A1O());
    }

    public boolean A1j() {
        C108885cS A022 = C88404Zo.A02(this);
        if (A022 == null) {
            return false;
        }
        boolean A012 = ((C695937u) this.A0N.get()).A01(getFMessage());
        if (this.A0j == null || !A2Z() || getMessageCount() != 1 || !((C139546z1) this.A2O.get()).A02(getFMessage())) {
            return false;
        }
        return !A022.Bg7() || A012;
    }

    public C692336k A1o(AnonymousClass206 r6) {
        if (r6 == null) {
            return null;
        }
        if (r6.A11(16777216)) {
            MessageCommentsManager messageCommentsManager = (MessageCommentsManager) this.A0g;
            messageCommentsManager.A02.execute(new AnonymousClass7RL(messageCommentsManager, r6, (AnonymousClass1OS) null, 40));
        } else if (r6.A0z(16)) {
            this.A0g.BKN(r6);
        }
        return C60472o5.A00(r6);
    }

    public void A1u() {
        A0h(this, false);
    }

    public void A1v() {
    }

    public void A1x() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r7 != null) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z() {
        /*
            r13 = this;
            r12 = 0
            r8 = 0
            r1 = 0
            r9 = 0
            r10 = 0
            boolean r0 = r13.A0V
            if (r0 != 0) goto L_0x0095
            X.206 r0 = r13.getFMessage()
            java.lang.String r0 = A0T(r0)
            java.lang.String r4 = "MARKETING"
            boolean r5 = r4.equals(r0)
            X.11S r0 = r13.A0U
            boolean r0 = r0.A0N()
            r11 = 0
            if (r0 != 0) goto L_0x009e
            X.0ve r3 = r13.A0F
            r2 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x009e
            boolean r0 = r13.A1d()
            if (r0 == 0) goto L_0x009e
            X.4md r2 = r13.A1B
            X.206 r0 = r13.getFMessage()
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3Ma.A0o(r0)
            boolean r0 = r2.A01(r0)
            if (r0 != 0) goto L_0x009e
            X.4DK r8 = X.AnonymousClass4DK.AVATAR
            r0 = 39
        L_0x0046:
            X.48m r9 = new X.48m
            r9.<init>(r13, r0)
        L_0x004b:
            android.view.View$OnLongClickListener r10 = r13.A2t
            r1 = 1
            r0 = 3
            X.C18070vi.A0d(r10, r0)
        L_0x0052:
            X.0ve r3 = r13.A0F
            r2 = 6806(0x1a96, float:9.537E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0099
            if (r1 == 0) goto L_0x0096
            X.3QI r7 = r13.getOrCreateActionButtonContainer()
        L_0x0064:
            if (r7 == 0) goto L_0x006e
        L_0x0066:
            r7.A01()
            if (r1 == 0) goto L_0x006e
            r7.setupActionButton(r8, r9, r10, r11, r12)
        L_0x006e:
            boolean r0 = r13.A1W()
            if (r0 == 0) goto L_0x0084
            X.3QI r2 = r13.getOrCreateActionButtonContainer()
            r0 = 38
            X.48m r1 = new X.48m
            r1.<init>(r13, r0)
            android.view.View$OnLongClickListener r0 = r13.A2t
            r2.setupRateButton(r1, r0)
        L_0x0084:
            X.206 r0 = r13.getFMessage()
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3Ma.A0o(r0)
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 == 0) goto L_0x0095
            r13.A1q()
        L_0x0095:
            return
        L_0x0096:
            X.3QI r7 = r13.A0A
            goto L_0x0064
        L_0x0099:
            X.3QI r7 = r13.getOrCreateActionButtonContainer()
            goto L_0x0066
        L_0x009e:
            boolean r0 = r13.A1e()
            if (r0 == 0) goto L_0x00a9
            X.4DK r8 = X.AnonymousClass4DK.FUN_STICKER
            r0 = 42
            goto L_0x0046
        L_0x00a9:
            if (r5 == 0) goto L_0x00f4
            X.00H r0 = r13.A25
            java.lang.Object r7 = r0.get()
            X.4Qc r7 = (X.C86084Qc) r7
            X.0ve r6 = r7.A02
            r0 = 5484(0x156c, float:7.685E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x00d0
            int r0 = r7.A00
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00d0
            r3 = 1
            r2 = 100
            X.1JU r0 = X.AnonymousClass1JU.A01
            int r0 = r0.A03(r3, r2)
            r7.A00 = r0
        L_0x00d0:
            r0 = 4512(0x11a0, float:6.323E-42)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x00f4
            X.206 r0 = r13.getFMessage()
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3Ma.A0o(r0)
            if (r1 == 0) goto L_0x00ee
            X.00H r0 = r13.A1f
            java.lang.Object r0 = r0.get()
            X.1mm r0 = (X.C35771mm) r0
            boolean r11 = r0.A08(r1)
        L_0x00ee:
            X.4DK r8 = X.AnonymousClass4DK.MARKETING_OPT_OUT
            r0 = 43
            goto L_0x0046
        L_0x00f4:
            boolean r0 = r13.A1X()
            if (r0 == 0) goto L_0x010c
            X.5cS r0 = X.C88404Zo.A02(r13)
            if (r0 == 0) goto L_0x016b
            boolean r0 = r0.Bgb()
            if (r0 != 0) goto L_0x016b
            X.4DK r8 = X.AnonymousClass4DK.INFO
            r0 = 40
            goto L_0x0046
        L_0x010c:
            boolean r0 = r13.A1i()
            if (r0 == 0) goto L_0x011d
            X.4DK r8 = X.AnonymousClass4DK.SEARCH
            r0 = 21
        L_0x0116:
            X.4dD r9 = new X.4dD
            r9.<init>(r13, r0)
            goto L_0x004b
        L_0x011d:
            boolean r0 = r13.A1g()
            if (r0 == 0) goto L_0x0129
            X.4DK r8 = X.AnonymousClass4DK.REPLY_WITH_PTT
            r0 = 44
            goto L_0x0046
        L_0x0129:
            boolean r0 = r13.A1h()
            if (r0 == 0) goto L_0x0135
            X.4DK r8 = X.AnonymousClass4DK.REPLY_WITH_PTV
            r0 = 45
            goto L_0x0046
        L_0x0135:
            X.00H r0 = r13.A2V
            java.lang.Object r0 = r0.get()
            X.4Nc r0 = (X.C85364Nc) r0
            X.206 r5 = r13.getFMessage()
            X.C18070vi.A0d(r5, r1)
            X.0ve r3 = r0.A00
            r2 = 10011(0x271b, float:1.4028E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = X.C20120A8f.A04(r5)
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = X.C35771mm.A00(r5)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            X.4DK r8 = X.AnonymousClass4DK.USER_CONTROLS_FEEDBACK
            r0 = 22
            goto L_0x0116
        L_0x016b:
            X.206 r0 = r13.getFMessage()
            boolean r0 = X.AnonymousClass25A.A0m(r0)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r13.A2f
            if (r0 != 0) goto L_0x0052
            boolean r1 = r13.A2b()
            r0 = 48
            X.4rh r2 = new X.4rh
            r2.<init>(r13, r0)
            if (r1 == 0) goto L_0x018e
            X.10I r1 = r13.A1X
            java.lang.String r0 = "run_async_if_gated_serial_tag"
            r1.CGS(r2, r0)
            return
        L_0x018e:
            r2.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A1z():void");
    }

    public void A20() {
    }

    public void A24(int i) {
        int i2;
        ImageView imageView = this.A0B;
        if (i == 1) {
            if (imageView == null) {
                this.A0B = C72453Mb.A0U(this);
                LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
                A0D2.gravity = 16;
                A0Z(A0D2, getDateWrapper(), this.A0B, 2131894560, C72463Mc.A07(this), 2);
            }
            C79103uS.A1E(getContext(), this.A0B, this, 2);
            imageView = this.A0B;
            i2 = 0;
        } else if (imageView != null) {
            i2 = 8;
        } else {
            return;
        }
        imageView.setVisibility(i2);
    }

    public void A25(int i, boolean z) {
        ImageView imageView;
        ScaleAnimation scaleAnimation;
        if (i == 0) {
            imageView = this.A0C;
        } else if (i != 1) {
            imageView = this.A0B;
        } else {
            imageView = this.A0A;
        }
        if (imageView != null) {
            if (z) {
                scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setInterpolator(new OvershootInterpolator());
                imageView.getViewTreeObserver().addOnPreDrawListener(new C90644eP(imageView, i, 0, this));
            } else {
                scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                imageView.setVisibility(0);
                C74603c1.A00(scaleAnimation, this, imageView, 6);
                if (!this.A0l.Bew(getFMessage()) || i != 2) {
                    scaleAnimation.setInterpolator(new AnticipateInterpolator());
                }
            }
            scaleAnimation.setDuration(500);
            imageView.startAnimation(scaleAnimation);
            if (i == 0 && z) {
                imageView.sendAccessibilityEvent(16384);
            }
        }
    }

    public void A26(int i, boolean z) {
        int i2;
        this.A0c.A02(getFMessage(), (Runnable) null, 68, z);
        ImageView imageView = this.A0A;
        if (1 == i) {
            if (imageView == null) {
                this.A0A = C72453Mb.A0U(this);
                LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
                A0D2.gravity = 16;
                A0Z(A0D2, this.A06, this.A0A, 2131891555, C72463Mc.A07(this), 1);
            }
            C79103uS.A1E(getContext(), this.A0A, this, 1);
            imageView = this.A0A;
            i2 = 0;
        } else if (imageView != null) {
            i2 = 8;
        } else {
            return;
        }
        imageView.setVisibility(i2);
    }

    public void A2A(View view, AnonymousClass22Q r14, boolean z) {
        AnonymousClass22Q r6 = r14;
        UserJid userJid = r14.A01;
        if (userJid == null) {
            this.A0S.A08(2131888017, 0);
            return;
        }
        A8Q a8q = this.A0e;
        int i = 3;
        boolean z2 = z;
        if (z) {
            i = 14;
        }
        a8q.A08(i, (String) null, (String) null);
        boolean A0O2 = this.A0U.A0O(userJid);
        C32021gV r7 = this.A1S;
        View view2 = view;
        C20057A5g.A02(getContext(), view2, this.A0d, (C20114A7x) this.A1n.get(), (C19957A0o) this.A1m.get(), r6, r7, 1, z2, A0O2, A0O2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        if (r0 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2B(android.view.ViewGroup r15, android.widget.TextView r16, X.AnonymousClass206 r17) {
        /*
            r14 = this;
            r13 = 0
            r7 = r14
            r5 = r17
            r2 = r16
            if (r16 == 0) goto L_0x001c
            r2.setVisibility(r13)
            X.0vb r1 = r14.A0D
            X.11P r0 = r14.A0u
            X.C72473Md.A15(r2, r0, r1, r5)
            r1 = 2131428419(0x7f0b0443, float:1.8478482E38)
            int r0 = r14.getBroadcastDrawableId()
            r14.A2U(r5, r1, r0)
        L_0x001c:
            if (r15 == 0) goto L_0x016c
            r15.setVisibility(r13)
            boolean r0 = r14 instanceof X.C79073uJ
            if (r0 != 0) goto L_0x016c
            int r1 = r5.A0C()
            r0 = 1
            r14.A26(r1, r0)
            int r0 = X.C63892tr.A00(r5)
            r14.A24(r0)
            boolean r1 = r5.A0q
            android.widget.ImageView r0 = r14.A0C
            if (r1 == 0) goto L_0x0167
            if (r0 != 0) goto L_0x005a
            android.widget.ImageView r0 = X.C72453Mb.A0U(r14)
            r14.A0C = r0
            android.widget.LinearLayout$LayoutParams r8 = X.AnonymousClass3Ma.A0D()
            r0 = 16
            r8.gravity = r0
            android.widget.ImageView r10 = r14.A0C
            r11 = 2131896285(0x7f1227dd, float:1.9427427E38)
            int r12 = X.C72463Mc.A07(r14)
            android.view.ViewGroup r9 = r14.getDateWrapper()
            r7.A0Z(r8, r9, r10, r11, r12, r13)
        L_0x005a:
            android.widget.ImageView r1 = r14.A0C
            android.content.Context r0 = r14.getContext()
            X.C79103uS.A1E(r0, r1, r14, r13)
            android.widget.ImageView r0 = r14.A0C
            r0.setVisibility(r13)
        L_0x0068:
            X.0ve r2 = r14.A0F
            X.C18070vi.A0d(r2, r13)
            r1 = 4873(0x1309, float:6.829E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r6 = 1
            r1 = 8388608(0x800000, double:4.144523E-317)
            if (r0 == 0) goto L_0x0143
            boolean r0 = r5.A11(r1)
            if (r0 == 0) goto L_0x0143
        L_0x0081:
            android.widget.LinearLayout r0 = r14.A0G
            if (r6 == 0) goto L_0x013d
            r3 = 0
            if (r0 != 0) goto L_0x00a3
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r14)
            r1 = 2131627532(0x7f0e0e0c, float:1.8882331E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r0, r13)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r14.A0G = r2
            android.view.ViewGroup r1 = r14.A06
            android.widget.TextView r0 = r14.A0H
            int r0 = r1.indexOfChild(r0)
            r1.addView(r2, r0)
        L_0x00a3:
            android.widget.LinearLayout r0 = r14.A0G
            if (r0 == 0) goto L_0x00aa
        L_0x00a7:
            r0.setVisibility(r3)
        L_0x00aa:
            boolean r0 = r5.A0w()
            if (r0 == 0) goto L_0x016c
            r14.getRowCustomizer()
            X.1CJ r1 = r14.A0E
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            X.1ci r2 = r1.A0A(r0)
            X.2Dk r2 = (X.C46162Dk) r2
            X.36a r1 = X.C50382Uf.A00(r5)
            X.1bI r4 = r14.A1V
            if (r4 == 0) goto L_0x00d2
            boolean r0 = X.AnonymousClass25A.A0p(r5)
            if (r0 == 0) goto L_0x0104
            r0 = 8
        L_0x00cf:
            r4.A04(r0)
        L_0x00d2:
            X.0zA r0 = r14.A0P
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x016c
            boolean r0 = X.C79103uS.A1I(r14)
            android.content.Context r2 = r14.getContext()
            r1 = 2131102439(0x7f060ae7, float:1.7817316E38)
            if (r0 == 0) goto L_0x00ea
            r1 = 2131102444(0x7f060aec, float:1.7817326E38)
        L_0x00ea:
            r0 = 2130971964(0x7f040d3c, float:1.7552681E38)
            int r1 = X.AnonymousClass1YL.A00(r2, r0, r1)
            X.0zA r0 = r14.A0P
            X.C19880zA.A02(r0)
            android.content.Context r0 = r14.getContext()
            X.C19740yt.A00(r0, r1)
            java.lang.String r0 = "maybeShowWamoSubMessageIndicator"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0104:
            if (r2 == 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d2
            X.00H r0 = r14.A2B
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = X.AnonymousClass4aS.A0A(r2, r0)
            if (r0 == 0) goto L_0x00d2
            android.widget.TextView r3 = X.AnonymousClass3MX.A0M(r4)
            X.0vb r2 = r14.A0D
            X.00H r0 = r14.A2E
            java.lang.Object r0 = r0.get()
            X.4XM r0 = (X.AnonymousClass4XM) r0
            X.C18070vi.A0j(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass4aS.A03(r2, r0, r5)
            r1.append(r0)
            java.lang.String r0 = " • "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.setText(r0)
            r0 = 0
            goto L_0x00cf
        L_0x013d:
            if (r0 == 0) goto L_0x00aa
            r3 = 8
            goto L_0x00a7
        L_0x0143:
            r3 = 268435456(0x10000000, double:1.32624737E-315)
            boolean r0 = r5.A11(r3)
            if (r0 != 0) goto L_0x0081
            X.1MB r4 = r14.A1A
            X.205 r3 = r5.A0v
            X.1BI r0 = r3.A00
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x0164
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0164
            boolean r0 = r5.A11(r1)
            if (r0 == 0) goto L_0x0164
            goto L_0x0081
        L_0x0164:
            r6 = 0
            goto L_0x0081
        L_0x0167:
            X.C72453Mb.A1B(r0)
            goto L_0x0068
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A2B(android.view.ViewGroup, android.widget.TextView, X.206):void");
    }

    public void A2E(TextView textView, Integer num, List list, long j) {
        Integer valueOf = Integer.valueOf(list.hashCode());
        textView.setTag(valueOf);
        this.A1X.CGS(new AnonymousClass3CM(this, list, textView, num, valueOf, 1, j), "conversation_row_byte_to_download");
    }

    public void A2G(TextEmojiLabel textEmojiLabel, AnonymousClass206 r11, String str, boolean z) {
        A2F(textEmojiLabel, (C82924Cr) null, r11, str, 0, z, false, false);
    }

    public void A2I(AnonymousClass1BI r1) {
    }

    public void A2J(AnonymousClass206 r2) {
        A2V(r2, true);
    }

    public void A2R(AnonymousClass206 r1) {
    }

    public boolean A2Y() {
        return true;
    }

    public boolean A2a() {
        return false;
    }

    public boolean A2b() {
        return false;
    }

    public boolean A2c() {
        return true;
    }

    public boolean A2e(AnonymousClass206 r2) {
        return false;
    }

    public Integer getForwardButtonAccessibilityResource() {
        return null;
    }

    public int getMessageCount() {
        return 1;
    }

    public void setMessageText(String str, TextEmojiLabel textEmojiLabel, AnonymousClass206 r12, C82924Cr r13) {
        C82924Cr r2 = r13;
        A2F(textEmojiLabel, r2, r12, str, 0, true, true, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3uP(android.content.Context r22, X.C108875cR r23, X.AnonymousClass206 r24) {
        /*
            r21 = this;
            r2 = r21
            r10 = r22
            r4 = r23
            r3 = r24
            r2.<init>(r10, r4, r3)
            r2.A1M()
            r1 = 0
            r2.A2c = r1
            r2.A00 = r1
            r2.A2j = r1
            r0 = 1
            r2.A2i = r0
            r2.A2e = r1
            r5 = 38
            X.4rh r0 = new X.4rh
            r0.<init>(r2, r5)
            r2.A2Y = r0
            r6 = 12
            X.4do r0 = new X.4do
            r0.<init>(r2, r6)
            r2.A2t = r0
            r0 = 2
            X.4dd r5 = new X.4dd
            r5.<init>(r2, r0)
            r2.A2y = r5
            r5 = 7
            X.0vq r5 = X.C99054sC.A00(r2, r5)
            r2.A2w = r5
            r2.A2d = r1
            r2.A2g = r1
            X.4kx r5 = new X.4kx
            r5.<init>(r2)
            r2.A2v = r5
            X.4Pl r5 = new X.4Pl
            r5.<init>(r2)
            r2.A2u = r5
            r7 = 49
            X.4rh r5 = new X.4rh
            r5.<init>(r2, r7)
            r2.A2x = r5
            r5 = 1
            if (r23 == 0) goto L_0x0063
            int r7 = r4.getContainerType()
            boolean r7 = X.AnonymousClass000.A1T(r7, r0)
            r2.A0V = r7
        L_0x0063:
            X.00H r7 = r2.A2S
            X.1xo r8 = X.AnonymousClass3MX.A0i(r7)
            X.205 r7 = r3.A0v
            X.1BI r7 = r7.A00
            boolean r7 = r8.A03(r7)
            r2.A2f = r7
            X.5c7 r9 = r2.A0l
            int r7 = r2.getUserNameInGroupLayoutOption()
            int r11 = r9.BWM(r7)
            r7 = -1
            if (r11 == r7) goto L_0x009b
            X.206 r8 = r2.getFMessage()
            boolean r7 = r2.A0V
            boolean r7 = r2.A2g(r8, r7)
            if (r7 == 0) goto L_0x009b
            r7 = 2131429608(0x7f0b08e8, float:1.8480894E38)
            android.view.ViewStub r7 = X.AnonymousClass3MW.A0F(r2, r7)
            if (r7 == 0) goto L_0x0259
            r7.setLayoutResource(r11)
            r7.inflate()
        L_0x009b:
            r2.setClipToPadding(r1)
            r2.setClipChildren(r1)
            int r12 = r9.BNl(r10)
            android.content.res.Resources r8 = r2.getResources()
            r7 = 2131168070(0x7f070b46, float:1.7950431E38)
            int r11 = r8.getDimensionPixelSize(r7)
            boolean r7 = r2.A0V
            if (r7 == 0) goto L_0x01fe
            android.content.res.Resources r8 = X.AnonymousClass000.A0Y(r2)
            r7 = 2131165325(0x7f07008d, float:1.7944864E38)
            int r7 = r8.getDimensionPixelSize(r7)
            r2.setPadding(r1, r7, r1, r7)
        L_0x00c2:
            X.3N7 r7 = new X.3N7
            r7.<init>(r2)
            r2.setBackground(r7)
            r7 = 2131433054(0x7f0b165e, float:1.8487883E38)
            android.view.View r7 = r2.findViewById(r7)
            if (r7 == 0) goto L_0x00d9
            X.1bI r7 = X.AnonymousClass3MW.A0p(r7)
            r2.A1V = r7
        L_0x00d9:
            r7 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            android.view.View r7 = r2.findViewById(r7)
            if (r7 == 0) goto L_0x00e8
            X.1bI r7 = X.AnonymousClass3MW.A0p(r7)
            r2.A1U = r7
        L_0x00e8:
            r7 = 2131429789(0x7f0b099d, float:1.848126E38)
            android.widget.TextView r7 = X.C17880vN.A0E(r2, r7)
            r2.A0H = r7
            r7 = 2131435610(0x7f0b205a, float:1.8493067E38)
            android.widget.ImageView r7 = X.AnonymousClass3MW.A0H(r2, r7)
            r2.A0D = r7
            r7 = 2131437005(0x7f0b25cd, float:1.8495896E38)
            android.view.View r7 = r2.findViewById(r7)
            if (r7 == 0) goto L_0x0109
            X.1bI r7 = X.AnonymousClass3MW.A0p(r7)
            r2.A1W = r7
        L_0x0109:
            boolean r7 = r2.A0V
            r10 = 0
            if (r7 != 0) goto L_0x01fa
            int r7 = r2.getUserNameViewId()
            android.view.View r7 = r2.findViewById(r7)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r7 = (com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView) r7
            r2.A0p = r7
        L_0x011a:
            r7 = 2131429812(0x7f0b09b4, float:1.8481307E38)
            android.view.ViewGroup r7 = X.AnonymousClass3MW.A0D(r2, r7)
            r2.A06 = r7
            int r7 = r2.getProfilePictureFullWidth()
            r2.A02 = r7
            boolean r7 = r9.CN7()
            r8 = 2131166964(0x7f0706f4, float:1.7948188E38)
            if (r7 == 0) goto L_0x0135
            r8 = 2131166959(0x7f0706ef, float:1.7948178E38)
        L_0x0135:
            boolean r20 = r9.CN6()
            boolean r7 = r9.CN8()
            if (r7 == 0) goto L_0x0172
            X.4KR r7 = r2.A0R
            boolean r19 = r2.A2c()
            int r18 = X.AnonymousClass3Ma.A02(r2, r8)
            X.1Xd r7 = r7.A00
            X.10E r7 = r7.A00
            X.118 r15 = X.AnonymousClass3MZ.A0l(r7)
            X.0ve r16 = X.AnonymousClass10E.A8r(r7)
            X.11S r11 = X.AnonymousClass10E.A17(r7)
            X.10I r17 = X.AnonymousClass10E.AL1(r7)
            X.1M9 r12 = X.AnonymousClass10E.A4z(r7)
            X.00S r8 = r7.A5H
            java.lang.Object r14 = r8.get()
            X.1Va r14 = (X.C27171Va) r14
            X.1Vc r13 = X.AnonymousClass3MZ.A0j(r7)
            X.8G7 r10 = new X.8G7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0172:
            r2.A0t = r10
            A0h(r2, r1)
            boolean r1 = r2.A2Z()
            if (r1 == 0) goto L_0x0185
            r2.setLongClickable(r5)
            android.view.View$OnLongClickListener r1 = r2.A2t
            r2.setOnLongClickListener(r1)
        L_0x0185:
            boolean r1 = r2.A2Z()
            if (r1 == 0) goto L_0x0195
            X.5cR r1 = r2.A0k
            if (r1 == 0) goto L_0x01d9
            boolean r1 = r1.Bcq()
            if (r1 == 0) goto L_0x01d9
        L_0x0195:
            X.0ve r7 = r2.A0F
            r5 = 9405(0x24bd, float:1.3179E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r7, r5)
            if (r1 == 0) goto L_0x01a9
            X.4du r7 = new X.4du
            r7.<init>((java.lang.Object) r4, (int) r6)
        L_0x01a6:
            r2.setOnTouchListener(r7)
        L_0x01a9:
            X.4rb r1 = new X.4rb
            r1.<init>(r2, r4, r3, r0)
            r2.post(r1)
            if (r23 == 0) goto L_0x01d1
            X.8G7 r0 = r2.A0t
            if (r0 == 0) goto L_0x01d1
            X.1Dg r3 = r0.A02
            X.1F9 r1 = r4.getLifecycleOwner()
            r0 = 35
            X.C91624fz.A01(r1, r3, r2, r0)
            X.8G7 r3 = r2.A0t
            r3.getClass()
            r1 = 47
            X.4rh r0 = new X.4rh
            r0.<init>(r3, r1)
            r2.post(r0)
        L_0x01d1:
            X.1u6 r0 = new X.1u6
            r0.<init>()
            r2.A1L = r0
            return
        L_0x01d9:
            X.0ve r7 = r2.A0F
            r1 = 10022(0x2726, float:1.4044E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r8, r7, r1)
            if (r1 != 0) goto L_0x01ef
            X.0ve r7 = r2.A0F
            r1 = 11511(0x2cf7, float:1.613E-41)
            boolean r1 = X.C18020vd.A05(r8, r7, r1)
            if (r1 == 0) goto L_0x0195
        L_0x01ef:
            r1 = 6
            X.0vq r1 = X.C99054sC.A00(r2, r1)
            X.4dt r7 = new X.4dt
            r7.<init>(r1, r2, r4, r5)
            goto L_0x01a6
        L_0x01fa:
            r2.A0p = r10
            goto L_0x011a
        L_0x01fe:
            int r8 = r3.A0D()
            r7 = 6
            if (r8 != r7) goto L_0x022d
            int r8 = r3.A0u
            r7 = 8
            if (r8 == r7) goto L_0x022d
            X.5bZ r7 = r2.A09
            android.graphics.Rect r10 = r7.BNj(r0)
            int r7 = r10.top
            int r11 = r11 + r7
            android.content.res.Resources r7 = r2.getResources()
            r8 = 2131166393(0x7f0704b9, float:1.794703E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r11 = r11 - r7
            int r7 = r10.bottom
            int r12 = r12 + r7
            int r7 = X.AnonymousClass3Ma.A02(r2, r8)
            int r12 = r12 - r7
            r2.setPadding(r1, r11, r1, r12)
            goto L_0x00c2
        L_0x022d:
            X.5bZ r8 = r2.A09
            int r7 = r2.A0h
            android.graphics.Rect r10 = r8.BNj(r7)
            X.0vb r8 = r2.A0D
            int r7 = r10.top
            int r11 = r11 + r7
            int r7 = r10.bottom
            int r12 = r12 + r7
            r17 = r1
            r13 = r2
            r14 = r8
            r15 = r1
            r16 = r11
            r18 = r12
            X.C27641Ww.A07(r13, r14, r15, r16, r17, r18)
            android.content.res.Resources r8 = r2.getResources()
            r7 = 2131166269(0x7f07043d, float:1.7946779E38)
            int r7 = X.AnonymousClass3MW.A01(r8, r7)
            r2.setMinimumHeight(r7)
            goto L_0x00c2
        L_0x0259:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r7 = "ConversationRow/setUpUserNameInGroupView/You need to add conversation_row_participant_header_view_stub in your new msg xml file. Msg type = "
            r8.append(r7)
            X.206 r7 = r2.getFMessage()
            int r7 = r7.A0u
            java.lang.String r7 = X.C17880vN.A0t(r8, r7)
            X.C17960vV.A0F(r1, r7)
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.<init>(android.content.Context, X.5cR, X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0T(X.AnonymousClass206 r3) {
        /*
            boolean r0 = r3 instanceof X.C439421n
            r2 = 0
            if (r0 == 0) goto L_0x001f
            r0 = r3
            X.21n r0 = (X.C439421n) r0
            X.2k6 r0 = r0.BaE()
            java.lang.String r1 = r0.A04
            if (r1 != 0) goto L_0x0021
        L_0x0010:
            boolean r0 = r3 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x0021
            X.21K r3 = (X.AnonymousClass21K) r3
            X.AEt r0 = r3.BPK()
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = r0.A0D
        L_0x001e:
            return r2
        L_0x001f:
            r1 = r2
            goto L_0x0010
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A0T(X.206):java.lang.String");
    }

    public static void A0W(View view, AnonymousClass3uP r2) {
        view.setOnLongClickListener(r2.A2t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (X.AnonymousClass00R.A0Y != r8.A00) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0c(X.C42141xh r17, com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r18, X.AnonymousClass1E7 r19, int r20, boolean r21) {
        /*
            r16 = this;
            r4 = r16
            X.206 r0 = r4.getFMessage()
            boolean r2 = X.C87494Vu.A01(r0)
            X.00H r0 = r4.A25
            java.lang.Object r1 = r0.get()
            X.4Qc r1 = (X.C86084Qc) r1
            X.206 r0 = r4.getFMessage()
            boolean r0 = r1.A00(r0)
            r6 = r19
            r9 = r20
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "P Message"
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.1yg r8 = new X.1yg
            r8.<init>(r1, r0)
        L_0x0029:
            r13 = 0
            boolean r15 = r6.A0P()
            r10 = r17
            r11 = r8
            r12 = r6
            r14 = r9
            r10.A04(r11, r12, r13, r14, r15)
            if (r21 == 0) goto L_0x0071
            if (r2 != 0) goto L_0x0071
            r0 = 7
            if (r0 != r9) goto L_0x0044
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            java.lang.Integer r0 = r8.A00
            r2 = 1
            if (r1 == r0) goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            r0 = 2131435004(0x7f0b1dfc, float:1.8491838E38)
            com.whatsapp.TextEmojiLabel r7 = X.AnonymousClass3MX.A0V(r4, r0)
            X.1BI r5 = X.C79103uS.A1C(r4)
            X.1CJ r0 = r4.A0E
            boolean r1 = r0.A0R(r5)
            X.00H r0 = r4.A1v
            if (r1 == 0) goto L_0x0072
            r0.get()
            X.AnonymousClass4XA.A00(r7, r13)
            r10 = 2
            X.3Ck r3 = new X.3Ck
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.10I r1 = r4.A1X
            java.lang.String r0 = "run_async_if_gated_serial_tag"
            r1.CGS(r3, r0)
        L_0x006d:
            r0 = r18
            r0.A00 = r2
        L_0x0071:
            return
        L_0x0072:
            java.lang.Object r1 = r0.get()
            X.4XA r1 = (X.AnonymousClass4XA) r1
            java.lang.Integer r0 = r8.A00
            r1.A01(r7, r6, r0, r9)
            goto L_0x006d
        L_0x007e:
            X.1Me r0 = r4.A0l
            X.1yg r8 = r0.A0D(r6, r9)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A0c(X.1xh, com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView, X.1E7, int, boolean):void");
    }

    public static void A0d(AnonymousClass3uP r3) {
        if (r3.A05 == null) {
            AnonymousClass3OA r0 = new AnonymousClass3OA(r3.getContext(), r3);
            r3.A0o = r0;
            r3.A05 = r0;
            r3.setClipToPadding(false);
            r3.setClipChildren(false);
            r3.addView(r3.A05, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public static void A0e(AnonymousClass3uP r4) {
        C108875cR r1;
        Runnable runnable = r4.A2Z;
        if (runnable != null) {
            runnable.run();
            return;
        }
        AnonymousClass206 fMessage = r4.getFMessage();
        if (C18050vg.A00(r4.getContext()) != null && (r1 = r4.A0k) != null) {
            if (((C32911hx) r4.A1y.get()).A01(fMessage)) {
                r4.A2R(fMessage);
                r1.BLe(fMessage);
                return;
            }
            r4.A0S.A06(2131892059, 1);
        }
    }

    public static void A0g(AnonymousClass3uP r15, AnonymousClass206 r16) {
        AnonymousClass206 r1 = r16;
        if (AnonymousClass9RY.A00(r1) != null) {
            C29681ch r6 = AnonymousClass9RY.A00(r1).A01;
            long j = (long) AnonymousClass9RY.A00(r1).A00;
            AnonymousClass1BI r0 = r1.A0v.A00;
            Integer A022 = AnonymousClass1PT.A02(r0);
            AnonymousClass3uP r12 = r15;
            if (r0.equals(r6)) {
                if (C18020vd.A05(C18040vf.A02, r15.A0F, 10414)) {
                    r15.A1X.CGF(new AnonymousClass3C3(r12, r6, 4, j));
                    return;
                }
            }
            ((C36341nj) r15.A2C.get()).A04(r15.getContext(), r6, AnonymousClass00R.A0C, C72463Mc.A0B(A022), j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r0 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0304, code lost:
        if (r1 != 0) goto L_0x0306;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0h(X.AnonymousClass3uP r26, boolean r27) {
        /*
            r5 = r26
            X.206 r4 = r5.getFMessage()
            r3 = 0
            if (r27 == 0) goto L_0x000e
            r5.A1S()
            r5.A2g = r3
        L_0x000e:
            int r0 = r4.A08
            if (r0 == 0) goto L_0x0052
            X.206 r1 = r5.getFMessage()
            r0 = 8
            boolean r0 = r1.A10(r0)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r5.A2g
            if (r0 != 0) goto L_0x0052
            X.0ve r2 = r5.A0F
            r1 = 4900(0x1324, float:6.866E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0052
            X.206 r6 = r5.getFMessage()
            X.22C r1 = X.C63892tr.A03(r6)
            r2 = 1
            if (r1 == 0) goto L_0x0050
            int r0 = r1.A00
            if (r0 != r2) goto L_0x0050
            X.11P r0 = r5.A0u
            boolean r0 = r1.A1D(r0)
            if (r0 == 0) goto L_0x0050
            r0 = 0
            X.C63892tr.A06(r6, r0)
            int r1 = r6.A08
            r0 = -9
            r0 = r0 & r1
            r6.A08 = r0
        L_0x0050:
            r5.A2g = r2
        L_0x0052:
            X.205 r2 = r4.A0v
            r5.setTag(r2)
            X.8G7 r7 = r5.A0t
            if (r7 == 0) goto L_0x006d
            X.1DT r6 = r7.A07
            X.206 r0 = X.AnonymousClass3MX.A0r(r6)
            if (r0 == r4) goto L_0x006d
            if (r0 == 0) goto L_0x069d
            X.205 r0 = r0.A0v
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x069d
        L_0x006d:
            boolean r0 = r5.A2f(r4)
            if (r0 == 0) goto L_0x0163
            X.206 r8 = r5.getFMessage()
            X.206 r7 = r8.A0K()
            if (r7 == 0) goto L_0x0676
            int r1 = r7.A0u
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 > r0) goto L_0x0676
            if (r1 < 0) goto L_0x0676
            android.view.ViewGroup r0 = r5.A07
            if (r0 != 0) goto L_0x00a4
            r0 = 2131434296(0x7f0b1b38, float:1.8490402E38)
            r6 = 2131434296(0x7f0b1b38, float:1.8490402E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x009c
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r1.inflate()
        L_0x009c:
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0D(r5, r6)
            r5.A07 = r0
            if (r0 == 0) goto L_0x0163
        L_0x00a4:
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r5.A08
            r6 = 1
            if (r0 != 0) goto L_0x0120
            android.content.Context r13 = r5.getContext()
            X.0ve r14 = r5.A0F
            X.5bZ r12 = r5.A09
            X.C18070vi.A0d(r13, r3)
            int r11 = X.C72453Mb.A0G(r14, r12, r6)
            r10 = 2131626665(0x7f0e0aa9, float:1.8880573E38)
            android.view.ViewGroup r9 = r5.A07
            r1 = 3783(0xec7, float:5.301E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r14, r1)
            if (r0 == r6) goto L_0x0668
            if (r0 == r11) goto L_0x0668
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r13)
            android.view.View r9 = r0.inflate(r10, r9, r6)
        L_0x00d4:
            r0 = 2131434295(0x7f0b1b37, float:1.84904E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r5.A08 = r1
            android.graphics.drawable.Drawable r0 = r5.getInnerFrameForegroundDrawable()
            r1.setForeground(r0)
            r0 = 2131434308(0x7f0b1b44, float:1.8490426E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r1 = (com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView) r1
            r5.A0q = r1
            r0 = 2131434307(0x7f0b1b43, float:1.8490424E38)
            android.widget.TextView r10 = X.C17880vN.A0E(r1, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r1 = r5.A0q
            r0 = 2131434293(0x7f0b1b35, float:1.8490396E38)
            android.widget.TextView r9 = X.C17880vN.A0E(r1, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderQuotedView r1 = r5.A0q
            r0 = 2131434304(0x7f0b1b40, float:1.8490418E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r1, r0)
            float r0 = r5.getNameInGroupTextFontSize()
            r10.setTextSize(r0)
            r9.setTextSize(r0)
            r1.setTextSize(r0)
            X.C43421zm.A04(r10)
            X.C43421zm.A04(r9)
            X.C43421zm.A04(r1)
        L_0x0120:
            X.5cS r0 = X.C88404Zo.A02(r5)
            if (r0 == 0) goto L_0x013d
            X.1FY r11 = r0.CFa()
            android.widget.FrameLayout r0 = r5.A08
            X.48k r9 = new X.48k
            r10 = r5
            r12 = r8
            r13 = r7
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r0.setOnClickListener(r9)
            android.widget.FrameLayout r0 = r5.A08
            A0W(r0, r5)
        L_0x013d:
            X.205 r0 = r8.A0v
            X.1BI r1 = r0.A00
            boolean r0 = r0.A02
            X.6sH r7 = new X.6sH
            r7.<init>(r1, r0, r6)
            android.widget.FrameLayout r6 = r5.A08
            X.00H r0 = r5.A29
            java.lang.Object r1 = r0.get()
            X.724 r1 = (X.AnonymousClass724) r1
            X.00H r0 = r5.A2O
            java.lang.Object r0 = r0.get()
            X.6z1 r0 = (X.C139546z1) r0
            r9 = r5
            r10 = r6
            r11 = r1
            r12 = r8
            r13 = r7
            r14 = r0
            r9.A2D(r10, r11, r12, r13, r14)
        L_0x0163:
            android.widget.ImageView r10 = r5.getStatusView()
            X.4M0 r16 = r5.getFailedMessageBundle()
            r0 = r16
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r12 = 0
            android.widget.ImageView r0 = r5.A09
            if (r1 == 0) goto L_0x065a
            if (r0 != 0) goto L_0x020f
            android.widget.ImageView r1 = X.C72453Mb.A0U(r5)
            r5.A09 = r1
            r0 = 2131430784(0x7f0b0d80, float:1.8483279E38)
            r1.setId(r0)
            android.widget.ImageView r6 = r5.A09
            android.content.Context r1 = r5.getContext()
            r0 = 2131892092(0x7f12177c, float:1.9418923E38)
            X.AnonymousClass3MY.A0w(r1, r6, r0)
            android.widget.ImageView r0 = r5.A09
            X.AnonymousClass3MW.A1Q(r0)
            android.widget.ImageView r1 = r5.A09
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r1.setScaleType(r0)
            android.widget.ImageView r1 = r5.A09
            r0 = 2131232121(0x7f080579, float:1.8080342E38)
            r1.setImageResource(r0)
            android.widget.ImageView r6 = r5.A09
            android.content.Context r1 = r5.getContext()
            r0 = 2131100226(0x7f060242, float:1.7812827E38)
            int r0 = X.C19740yt.A00(r1, r0)
            r6.setColorFilter(r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r5)
            r0 = 2131166270(0x7f07043e, float:1.794678E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView r0 = r5.A09
            r5.addView(r0, r1, r1)
            android.widget.ImageView r15 = r5.A09
            android.content.Context r14 = r5.getContext()
            X.1KB r13 = r5.A0S
            X.1kd r11 = r5.A0V
            X.10I r9 = r5.A1X
            X.1iW r8 = r5.A0a
            X.00H r0 = r5.A1g
            X.1pj r7 = X.AnonymousClass3MW.A0V(r0)
            X.122 r6 = r5.A0x
            X.1WM r1 = r5.A13
            X.C18070vi.A0d(r14, r3)
            r0 = 3
            X.C72473Md.A1M(r13, r11, r9, r0)
            X.C18070vi.A0q(r8, r7, r6)
            r0 = 9
            X.C18070vi.A0d(r1, r0)
            X.48e r0 = new X.48e
            r26 = r9
            r24 = r4
            r25 = r16
            r22 = r6
            r23 = r1
            r20 = r8
            r21 = r7
            r18 = r13
            r19 = r11
            r16 = r0
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r15.setOnClickListener(r0)
        L_0x020f:
            X.C72453Mb.A1B(r10)
        L_0x0212:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0603
            X.0vb r0 = r5.A0D
            X.C27641Ww.A05(r5, r0, r3, r3)
        L_0x021b:
            r5.A2K(r4)
            r11 = -1
            A0f(r5, r11)
            if (r10 == 0) goto L_0x028a
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x028a
            int r7 = r5.getMessageStatus()
            int r6 = r5.A1k(r7)
            int r1 = r5.A1l(r7)
            if (r1 != 0) goto L_0x05f9
            r0 = r12
        L_0x0237:
            X.C28081Yu.A00(r0, r10)
            int r0 = r5.A2j
            if (r6 == r0) goto L_0x0274
            if (r27 != 0) goto L_0x05f1
            if (r0 == 0) goto L_0x05f1
            r0 = 13
            boolean r0 = X.C446824j.A02(r7, r0)
            if (r0 == 0) goto L_0x05f1
            X.3OY r7 = new X.3OY
            r7.<init>(r10, r6)
            r0 = 400(0x190, double:1.976E-321)
            X.C72463Mc.A17(r7, r0)
            r10.startAnimation(r7)
        L_0x0257:
            android.content.Context r8 = r10.getContext()
            int r7 = r4.A0D()
            int r9 = r4.A0u
            r0 = 13
            boolean r0 = X.C446824j.A02(r7, r0)
            if (r0 == 0) goto L_0x05dc
            r1 = 2131892090(0x7f12177a, float:1.9418918E38)
            if (r9 != 0) goto L_0x0271
            r1 = 2131892085(0x7f121775, float:1.9418908E38)
        L_0x0271:
            X.AnonymousClass3MY.A0w(r8, r10, r1)
        L_0x0274:
            boolean r0 = X.AnonymousClass25A.A0p(r4)
            if (r0 == 0) goto L_0x0288
            int r0 = r4.A0D()
            r1 = 4
            boolean r0 = X.C446824j.A02(r0, r1)
            if (r0 == 0) goto L_0x0288
            r10.setVisibility(r1)
        L_0x0288:
            r5.A2j = r6
        L_0x028a:
            boolean r0 = r5.A0V
            boolean r0 = r5.A2g(r4, r0)
            if (r0 == 0) goto L_0x029f
            X.12L r1 = r5.A17
            X.1BI r0 = r2.A00
            boolean r0 = X.C42761yh.A01(r1, r0)
            if (r0 == 0) goto L_0x05d7
            r5.setupChatPSAView(r4)
        L_0x029f:
            r5.A1z()
            X.4Q6 r6 = r5.A0r
            boolean r1 = r5.A0V
            X.206 r0 = r5.getFMessage()
            X.4NB r8 = r6.A00(r0, r1)
            r14 = -2
            r13 = 2
            r6 = 1
            android.widget.TextView r0 = r5.A0I
            if (r8 == 0) goto L_0x05c1
            if (r0 != 0) goto L_0x0328
            int r0 = r5.getTopAttributeTextAnchorId()
            android.view.View r10 = r5.findViewById(r0)
            if (r10 == 0) goto L_0x0328
            android.content.Context r1 = r5.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r5.A0F = r0
            android.content.Context r0 = r5.getContext()
            com.whatsapp.TextEmojiLabel r9 = new com.whatsapp.TextEmojiLabel
            r9.<init>(r0)
            r5.A0I = r9
            android.content.res.Resources r15 = r5.getResources()
            android.content.Context r7 = r5.getContext()
            r1 = 2130971964(0x7f040d3c, float:1.7552681E38)
            r0 = 2131103119(0x7f060d8f, float:1.7818695E38)
            int r7 = X.AnonymousClass3Ma.A01(r7, r15, r1, r0)
            android.widget.TextView r0 = r5.A0I
            android.graphics.Typeface r0 = r0.getTypeface()
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r13)
            r0 = 2131429618(0x7f0b08f2, float:1.8480914E38)
            r5.setTopAttributeTextViewAttributes(r9, r0, r7, r1)
            android.widget.LinearLayout r7 = r5.A0F
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r0 = r5.A0p
            if (r0 == 0) goto L_0x0306
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x0307
        L_0x0306:
            r0 = 0
        L_0x0307:
            r5.A0a(r7, r0)
            android.widget.LinearLayout r1 = r5.A0F
            android.widget.TextView r0 = r5.A0I
            r1.addView(r0, r14, r14)
            android.widget.LinearLayout r9 = r5.A0F
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r11, r14)
            r0 = 3
            r1.gravity = r0
            int r0 = r7.indexOfChild(r10)
            r7.addView(r9, r0, r1)
        L_0x0328:
            android.widget.TextView r0 = r5.A0I
            if (r0 == 0) goto L_0x03f3
            int r0 = r8.A02
            int r10 = r8.A01
            android.widget.LinearLayout r7 = r5.A0F
            r9 = 0
            if (r7 == 0) goto L_0x0349
            android.content.Context r1 = r7.getContext()
            int r8 = r8.A00
            X.AnonymousClass3MY.A0w(r1, r7, r8)
            com.whatsapp.WaTextView r7 = r5.A0b
            if (r7 == 0) goto L_0x0349
            android.widget.LinearLayout r1 = r5.A0F
            r1.removeView(r7)
            r5.A0b = r12
        L_0x0349:
            r8 = 2131895511(0x7f1224d7, float:1.9425857E38)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C19620yd.A08
            if (r0 != r8) goto L_0x05af
            r7.append(r1)
            android.content.Context r8 = r5.getContext()
            r0 = 2131890528(0x7f121160, float:1.941575E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r1, r7)
            android.widget.TextView r0 = r5.A0I
            r0.setText(r1)
            X.1FU r8 = X.AnonymousClass3Ma.A0K(r5)
            android.widget.LinearLayout r0 = r5.A0F
            if (r0 == 0) goto L_0x03c5
            if (r8 == 0) goto L_0x03c5
            X.00H r0 = r5.A2P
            java.lang.Object r1 = r0.get()
            X.4R1 r1 = (X.AnonymousClass4R1) r1
            X.206 r0 = r5.getFMessage()
            java.util.List r7 = r1.A00(r0)
            if (r7 == 0) goto L_0x03c5
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x03c5
            android.content.Context r0 = r5.getContext()
            com.whatsapp.WaTextView r1 = new com.whatsapp.WaTextView
            r1.<init>(r0)
            r5.A0b = r1
            android.text.SpannableStringBuilder r0 = r5.getSearchTheWebTopAttributeText()
            r1.setText(r0)
            com.whatsapp.WaTextView r15 = r5.A0b
            android.content.Context r1 = r5.getContext()
            r0 = 2132084416(0x7f1506c0, float:1.9809002E38)
            r15.setTextAppearance(r1, r0)
            com.whatsapp.WaTextView r1 = r5.A0b
            r0 = 42
            X.C90084dV.A00(r1, r5, r7, r8, r0)
            com.whatsapp.WaTextView r1 = r5.A0b
            X.0ve r0 = r5.A0F
            X.AnonymousClass3Ma.A1I(r1, r0)
            android.widget.LinearLayout r0 = r5.A0F
            r0.setOrientation(r6)
            android.widget.LinearLayout r1 = r5.A0F
            com.whatsapp.WaTextView r0 = r5.A0b
            r1.addView(r0, r14, r14)
        L_0x03c5:
            X.0vb r0 = r5.A0D
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            android.widget.TextView r0 = r5.A0I
            if (r1 == 0) goto L_0x05aa
            r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r10, r3)
        L_0x03d2:
            android.content.Context r8 = r5.getContext()
            android.content.Context r7 = r5.getContext()
            r1 = 2130970099(0x7f0405f3, float:1.7548899E38)
            r0 = 2131101222(0x7f060626, float:1.7814848E38)
            int r0 = X.AnonymousClass1YL.A01(r7, r1, r0, r3)
            int r1 = X.C19740yt.A00(r8, r0)
            android.widget.TextView r0 = r5.A0I
            if (r1 == 0) goto L_0x03f0
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r1)
        L_0x03f0:
            X.C29261bv.A02(r9, r0)
        L_0x03f3:
            int r0 = r5.getTopAttributeTextAnchorId()
            android.view.View r0 = r5.findViewById(r0)
            r5.A0Y(r0, r4)
            X.5c7 r0 = r5.A0l
            boolean r0 = r0.CLh()
            if (r0 == 0) goto L_0x0517
            r5.setClipToPadding(r3)
            r5.setClipChildren(r3)
            android.view.View r0 = r5.A2k
            if (r0 != 0) goto L_0x04a5
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            r0 = 2131626985(0x7f0e0be9, float:1.8881222E38)
            android.view.View r0 = r1.inflate(r0, r12)
            r5.A2k = r0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setClipToPadding(r3)
            android.view.View r0 = r5.A2k
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setClipChildren(r3)
            android.view.View r1 = r5.A2k
            r0 = 2131435199(0x7f0b1ebf, float:1.8492233E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0W(r1, r0)
            r5.A2p = r1
            float r0 = r5.getNameInGroupTextFontSize()
            r1.setTextSize(r0)
            com.whatsapp.TextEmojiLabel r0 = r5.A2p
            X.C43421zm.A04(r0)
            android.view.View r1 = r5.A2k
            r0 = 2131434395(0x7f0b1b9b, float:1.8490603E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0W(r1, r0)
            r5.A2o = r1
            float r0 = r5.getNameInGroupTextFontSize()
            r1.setTextSize(r0)
            com.whatsapp.TextEmojiLabel r0 = r5.A2o
            X.C43421zm.A04(r0)
            android.view.View r1 = r5.A2k
            r0 = 2131428467(0x7f0b0473, float:1.847858E38)
            android.widget.TextView r7 = X.C17880vN.A0E(r1, r0)
            float r1 = r5.getNameInGroupTextFontSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r7.setTextSize(r1)
            X.0vb r0 = r5.A0D
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x05a6
            java.lang.String r0 = "▶"
        L_0x0474:
            r7.setText(r0)
            android.view.View r1 = r5.A2k
            r0 = 2131432676(0x7f0b14e4, float:1.8487116E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r1, r0)
            r5.A2m = r0
            android.view.View r1 = r5.A2k
            r0 = 2131429091(0x7f0b06e3, float:1.8479845E38)
            android.widget.ImageView r8 = X.AnonymousClass3MW.A0H(r1, r0)
            X.0vb r7 = r5.A0D
            android.content.Context r1 = r5.getContext()
            r0 = 2131231228(0x7f0801fc, float:1.8078531E38)
            X.AnonymousClass3NL.A01(r1, r8, r7, r0)
            android.view.View r1 = r5.A2k
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r11, r14)
            r5.addView(r1, r0)
            android.view.View r0 = r5.A2k
            r5.A0e = r0
        L_0x04a5:
            X.1BI r8 = r2.A00
            boolean r1 = X.C22971Dz.A0e(r8)
            int r9 = X.C72453Mb.A04(r1)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x056e
            boolean r0 = r4.A0w()
            if (r0 != 0) goto L_0x056e
            android.content.Context r1 = r5.getContext()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r7 = r1.getString(r0)
            X.1Me r1 = r5.A0l
            X.1M9 r0 = r5.A0j
            java.lang.String r10 = X.AnonymousClass3MY.A0p(r0, r1, r8)
        L_0x04cc:
            com.whatsapp.TextEmojiLabel r0 = r5.A2p
            r0.A0R(r7)
            com.whatsapp.TextEmojiLabel r0 = r5.A2o
            r0.A0R(r10)
            android.view.View r1 = r5.A2k
            r0 = 2131435202(0x7f0b1ec2, float:1.849224E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r1, r0)
            android.content.Context r8 = r9.getContext()
            r1 = 2131896287(0x7f1227df, float:1.942743E38)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r3] = r7
            java.lang.String r0 = X.C17880vN.A0q(r8, r10, r0, r6, r1)
            r9.setContentDescription(r0)
            android.widget.TextView r9 = r5.A2m
            X.11P r8 = r5.A0u
            X.0vb r7 = r5.A0D
            long r0 = r4.A0I
            long r0 = r8.A09(r0)
            java.lang.String r0 = X.C64052u8.A0C(r7, r0, r3)
            r9.setText(r0)
            android.widget.TextView r9 = r5.A2m
            X.11P r8 = r5.A0u
            X.0vb r7 = r5.A0D
            long r0 = r4.A0I
            long r0 = r8.A09(r0)
            java.lang.String r0 = X.C64052u8.A0C(r7, r0, r6)
            r9.setContentDescription(r0)
        L_0x0517:
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x06e0
            int r1 = r4.A0D()
            r0 = 16
            if (r1 == r0) goto L_0x06e0
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x06e0
            boolean r0 = r4 instanceof X.AnonymousClass21Y
            if (r0 != 0) goto L_0x06e0
            boolean r0 = r4 instanceof X.C441822l
            if (r0 != 0) goto L_0x06e0
            boolean r0 = r4 instanceof X.AnonymousClass23N
            if (r0 != 0) goto L_0x06e0
            X.00H r0 = r5.A2B
            X.0ve r7 = X.AnonymousClass3MY.A0W(r0)
            r1 = 4760(0x1298, float:6.67E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x06e0
            X.00H r0 = r5.A2F
            java.lang.Object r8 = r0.get()
            X.4aG r8 = (X.C88634aG) r8
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x06e0
            X.1BI r1 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r1, r0)
            X.1ch r1 = (X.C29681ch) r1
            X.1ch r0 = r8.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0569
            X.C88634aG.A03(r8, r6)
            r8.A00 = r1
        L_0x0569:
            java.lang.Object r9 = r8.A06
            monitor-enter(r9)
            goto L_0x06b2
        L_0x056e:
            if (r1 == 0) goto L_0x0591
            X.1Me r7 = r5.A0l
            X.1M9 r1 = r5.A0j
            X.1BI r0 = r4.A0H()
            X.C17960vV.A07(r0)
            X.1E7 r0 = r1.A0H(r0)
            java.lang.String r7 = r7.A0U(r0, r9, r3)
            X.1Me r1 = r5.A0l
            X.1M9 r0 = r5.A0j
            X.1E7 r0 = r0.A0H(r8)
            java.lang.String r10 = r1.A0U(r0, r9, r3)
            goto L_0x04cc
        L_0x0591:
            X.1Me r1 = r5.A0l
            X.1M9 r0 = r5.A0j
            java.lang.String r7 = X.AnonymousClass3MY.A0p(r0, r1, r8)
            android.content.Context r1 = r5.getContext()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x04cc
        L_0x05a6:
            java.lang.String r0 = "◀"
            goto L_0x0474
        L_0x05aa:
            r0.setCompoundDrawablesWithIntrinsicBounds(r10, r3, r3, r3)
            goto L_0x03d2
        L_0x05af:
            r7.append(r1)
            java.lang.String r0 = X.AnonymousClass3Ma.A11(r5, r0)
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r1, r7)
            android.widget.TextView r0 = r5.A0I
            r0.setText(r1)
            goto L_0x03c5
        L_0x05c1:
            if (r0 == 0) goto L_0x03f3
            android.widget.LinearLayout r1 = r5.A0F
            r1.removeView(r0)
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
            r5.A0I = r12
            r5.A0F = r12
            goto L_0x03f3
        L_0x05d7:
            r5.setupUsernameInGroupViewContainer(r4)
            goto L_0x029f
        L_0x05dc:
            r0 = 5
            boolean r0 = X.C446824j.A02(r7, r0)
            r1 = 2131892054(0x7f121756, float:1.9418845E38)
            if (r0 != 0) goto L_0x0271
            r0 = 4
            r1 = 2131892069(0x7f121765, float:1.9418876E38)
            if (r7 != r0) goto L_0x0271
            r1 = 2131892094(0x7f12177e, float:1.9418927E38)
            goto L_0x0271
        L_0x05f1:
            r10.clearAnimation()
            r10.setImageResource(r6)
            goto L_0x0257
        L_0x05f9:
            android.content.Context r0 = r5.getContext()
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r0, r1)
            goto L_0x0237
        L_0x0603:
            X.5bZ r0 = r5.A09
            X.4iP r0 = (X.C93084iP) r0
            X.0vp r0 = r0.A0Q
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r1 = r0.left
            X.5c7 r8 = r5.A0l
            android.content.Context r0 = r5.getContext()
            int r6 = r8.BW4(r0, r1)
            android.content.Context r0 = r5.getContext()
            int r1 = r8.BW1(r0, r1)
            android.content.res.Resources r7 = r5.getResources()
            r0 = 2131165534(0x7f07015e, float:1.7945288E38)
            int r7 = r7.getDimensionPixelSize(r0)
            android.widget.ImageView r0 = r5.A09
            if (r0 == 0) goto L_0x0648
            boolean r0 = r8.Beq()
            if (r0 == 0) goto L_0x064f
            boolean r0 = X.C79103uS.A1I(r5)
            if (r0 == 0) goto L_0x064f
            int r0 = r8.BNi()
            int r7 = r7 - r0
            int r0 = java.lang.Math.max(r3, r7)
            int r1 = r1 + r0
        L_0x0648:
            X.0vb r0 = r5.A0D
            X.C27641Ww.A05(r5, r0, r6, r1)
            goto L_0x021b
        L_0x064f:
            int r0 = r8.BNi()
            int r7 = r7 - r0
            int r0 = java.lang.Math.max(r3, r7)
            int r6 = r6 + r0
            goto L_0x0648
        L_0x065a:
            if (r0 == 0) goto L_0x0661
            r5.removeView(r0)
            r5.A09 = r12
        L_0x0661:
            if (r10 == 0) goto L_0x0212
            r10.setVisibility(r3)
            goto L_0x0212
        L_0x0668:
            com.whatsapp.WaFrameLayout r0 = X.AnonymousClass4GN.A00(r13, r12)
            if (r9 == 0) goto L_0x0673
            r9.addView(r0)
            goto L_0x00d4
        L_0x0673:
            r9 = r0
            goto L_0x00d4
        L_0x0676:
            android.view.ViewGroup r1 = r5.A07
            if (r1 == 0) goto L_0x0681
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0163
        L_0x0681:
            X.0ve r1 = r5.A0F
            r0 = 11799(0x2e17, float:1.6534E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 != 0) goto L_0x0163
            r0 = 2131434296(0x7f0b1b38, float:1.8490402E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0163
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r1.inflate()
            goto L_0x0163
        L_0x069d:
            X.1DT r0 = r7.A08
            r1 = 0
            X.C137196v4.A01(r0, r1)
            X.1DT r0 = r7.A09
            X.C137196v4.A01(r0, r1)
            X.1DT r0 = r7.A05
            X.C137196v4.A01(r0, r1)
            r6.A0F(r4)
            goto L_0x006d
        L_0x06b2:
            java.util.Set r0 = r8.A08     // Catch:{ all -> 0x06dc }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x06dc }
            if (r0 != 0) goto L_0x06df
            java.util.Map r2 = r8.A07     // Catch:{ all -> 0x06dc }
            boolean r0 = r2.containsKey(r4)     // Catch:{ all -> 0x06dc }
            if (r0 != 0) goto L_0x06df
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06dc }
            X.0vl r0 = r8.A09     // Catch:{ all -> 0x06dc }
            long r0 = X.C72453Mb.A0K(r0)     // Catch:{ all -> 0x06dc }
            long r6 = r6 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x06dc }
            r2.put(r4, r0)     // Catch:{ all -> 0x06dc }
            monitor-exit(r9)
            X.C88634aG.A00(r8)
            X.C88634aG.A01(r8)
            goto L_0x06e0
        L_0x06dc:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x06df:
            monitor-exit(r9)
        L_0x06e0:
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x06ef
            X.00H r0 = r5.A26
            java.lang.Object r0 = r0.get()
            X.7Ka r0 = (X.C145127Ka) r0
            r0.A04(r4)
        L_0x06ef:
            if (r27 == 0) goto L_0x06f3
            r5.A2d = r3
        L_0x06f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A0h(X.3uP, boolean):void");
    }

    private boolean A0i() {
        AnonymousClass206 firstEverKnownLastMessage;
        C108875cR r0 = this.A0k;
        if (r0 == null) {
            firstEverKnownLastMessage = null;
        } else {
            firstEverKnownLastMessage = r0.getFirstEverKnownLastMessage();
        }
        return getFMessage().equals(firstEverKnownLastMessage);
    }

    private int getExtraBottomPadding() {
        LinearLayout linearLayout;
        int i = this.A01;
        if ((i != 1 && i != 2) || (linearLayout = this.A06) == null || linearLayout.getVisibility() == 8) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131168413);
    }

    private AnonymousClass4M0 getFailedMessageBundle() {
        AnonymousClass11P r4 = this.A0u;
        return AnonymousClass4Z2.A02(this.A0U, r4, this.A0F, this.A1I, getFMessage());
    }

    private C54272ds getMessagePrivacyStateFromDbOnMainThread() {
        return this.A11.A00(getFMessage().A0x);
    }

    private float getNameInGroupTextFontSize() {
        return this.A0n.A00(AnonymousClass3Ma.A06(this), getResources());
    }

    private AnonymousClass3QI getOrCreateActionButtonContainer() {
        if (this.A0A == null) {
            this.A0A = new AnonymousClass3QI(getContext(), this.A0F);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(getResources().getDimensionPixelSize(2131166397), 0, 0, 0);
            this.A0A.setLayoutParams(marginLayoutParams);
            addView(this.A0A);
            this.A0A.A01();
        }
        return this.A0A;
    }

    private SpannableStringBuilder getSearchTheWebTopAttributeText() {
        C36401np r6 = this.A1R;
        Context context = getContext();
        Context context2 = getContext();
        int i = 2131895511;
        if (getFMessage().A0w()) {
            i = 2131895510;
        }
        return r6.A05(context, new C21422Ajp(14), C17880vN.A0q(context2, "LINK_SPAN", AnonymousClass3MW.A1a(), 0, i), "LINK_SPAN");
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.3cE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.3cE] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.3d6] */
    /* JADX WARNING: type inference failed for: r18v6, types: [X.3d7] */
    /* JADX WARNING: type inference failed for: r18v7, types: [X.3cE] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setTextWithUrlSpanOverrides(android.text.Spannable r27, com.whatsapp.TextEmojiLabel r28, X.AnonymousClass206 r29, X.C82924Cr r30) {
        /*
            r26 = this;
            r3 = r26
            android.content.Context r9 = r3.getContext()
            if (r9 == 0) goto L_0x01ef
            X.00H r0 = r3.A2T
            java.lang.Object r0 = r0.get()
            X.4Qh r0 = (X.AnonymousClass4Qh) r0
            r5 = r27
            r10 = r29
            int r17 = r0.A00(r9, r5, r10)
            int r2 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r0 = 0
            java.lang.Object[] r8 = r5.getSpans(r0, r2, r1)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            r4 = r28
            if (r8 == 0) goto L_0x01b3
            int r2 = r8.length
            r7 = 0
        L_0x002b:
            if (r7 >= r2) goto L_0x019b
            r0 = r8[r7]
            if (r0 == 0) goto L_0x0197
            java.lang.String r12 = r0.getURL()
            if (r12 == 0) goto L_0x0197
            int r6 = r5.getSpanStart(r0)
            int r1 = r5.getSpanEnd(r0)
            int r16 = r5.getSpanFlags(r0)
            X.ALX r15 = r3.A1K
            java.lang.String r0 = "wapay"
            boolean r0 = r12.startsWith(r0)
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "upi"
            boolean r0 = r12.startsWith(r0)
            if (r0 != 0) goto L_0x0179
            android.net.Uri r11 = android.net.Uri.parse(r12)
            if (r11 == 0) goto L_0x00d4
            X.1i4 r0 = r15.A05
            int r11 = r0.A0E(r11)
            r0 = 21
            if (r11 != r0) goto L_0x00d4
            X.1KB r14 = r15.A00
            X.11C r13 = r15.A03
            X.1nl r0 = r15.A01
            X.3cE r11 = new X.3cE
            r21 = r14
            r22 = r13
            r23 = r12
            r18 = r11
            r19 = r9
            r20 = r0
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x007c:
            X.0ve r14 = r3.A0F
            if (r14 == 0) goto L_0x008d
            X.0vf r13 = X.C18040vf.A01
            r0 = 11924(0x2e94, float:1.6709E-41)
            boolean r0 = X.C18020vd.A05(r13, r14, r0)
            if (r0 == 0) goto L_0x008d
            r0 = 1
            r11.A03 = r0
        L_0x008d:
            X.4Ni r13 = r3.A0f
            X.0ve r0 = r13.A00
            r15 = 355(0x163, float:4.97E-43)
            X.0vf r14 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r14, r0, r15)
            if (r0 == 0) goto L_0x00b4
            X.9kp r0 = r13.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00b4
            X.9zF r0 = r13.A02
            boolean r0 = r0.A01(r12)
            if (r0 == 0) goto L_0x00b4
            r12 = 0
            X.4gm r0 = new X.4gm
            r0.<init>(r13, r12)
            r11.A04(r0)
        L_0x00b4:
            X.00H r0 = r3.A24
            r0.get()
            java.lang.Class<X.48p> r0 = X.AnonymousClass48p.class
            java.lang.Object[] r15 = r5.getSpans(r6, r1, r0)
            X.C18070vi.A0X(r15)
            X.48p[] r15 = (X.AnonymousClass48p[]) r15
            int r14 = r15.length
            r13 = 0
            if (r14 == 0) goto L_0x0192
            r12 = 1
            r11.A03 = r12
        L_0x00cb:
            r0 = r15[r13]
            r0.A02 = r12
            int r13 = r13 + 1
            if (r13 >= r14) goto L_0x0192
            goto L_0x00cb
        L_0x00d4:
            X.00H r0 = r3.A2M
            java.lang.Object r0 = r0.get()
            X.6yk r0 = (X.C139386yk) r0
            X.5rb r11 = r0.A01(r9, r10, r12)
            if (r11 != 0) goto L_0x007c
            X.00H r0 = r3.A2G
            java.lang.Object r14 = r0.get()
            X.4Nv r14 = (X.C85554Nv) r14
            r0 = 2
            X.C18070vi.A0d(r10, r0)
            java.lang.String r11 = "order"
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r12, r11, r0)
            if (r0 == 0) goto L_0x0115
            X.1KB r0 = r14.A01
            r15 = r0
            X.11C r13 = r14.A03
            X.1nl r0 = r14.A02
            X.3d7 r11 = new X.3d7
            r21 = r0
            r22 = r14
            r23 = r13
            r24 = r10
            r25 = r12
            r18 = r11
            r19 = r9
            r20 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x007c
        L_0x0115:
            X.00H r0 = r3.A1l
            java.lang.Object r11 = r0.get()
            X.4NC r11 = (X.AnonymousClass4NC) r11
            X.5cR r0 = r3.A0k
            r15 = r0
            java.lang.String r13 = "commands"
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r12, r13, r0)
            if (r0 == 0) goto L_0x0144
            X.1KB r14 = r11.A00
            X.11C r13 = r11.A02
            X.1nl r0 = r11.A01
            X.3d6 r11 = new X.3d6
            r21 = r0
            r22 = r15
            r23 = r13
            r24 = r12
            r18 = r11
            r19 = r9
            r20 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x007c
        L_0x0144:
            X.00H r0 = r3.A1z
            java.lang.Object r0 = r0.get()
            X.4RL r0 = (X.AnonymousClass4RL) r0
            X.3d8 r11 = r0.A00(r9, r10, r12)
            r13 = 1
            X.4gn r0 = new X.4gn
            r0.<init>(r3, r10, r13)
            r11.A04(r0)
            X.205 r13 = r10.A0v
            X.1BI r0 = r13.A00
            if (r0 == 0) goto L_0x007c
            X.00H r0 = r3.A1d
            java.lang.Object r0 = r0.get()
            X.A8x r0 = (X.C20136A8x) r0
            boolean r0 = r0.A0R(r13)
            if (r0 == 0) goto L_0x007c
            X.4go r0 = new X.4go
            r13 = r30
            r0.<init>(r3, r13, r10)
            r11.A04(r0)
            goto L_0x007c
        L_0x0179:
            X.1KB r13 = r15.A00
            X.11C r0 = r15.A03
            X.3cE r11 = new X.3cE
            r21 = r13
            r22 = r0
            r23 = r10
            r24 = r12
            r18 = r11
            r19 = r9
            r20 = r15
            r18.<init>((android.content.Context) r19, (X.AnonymousClass1L8) r20, (X.AnonymousClass1KB) r21, (X.AnonymousClass11C) r22, (X.AnonymousClass206) r23, (java.lang.String) r24)
            goto L_0x007c
        L_0x0192:
            r0 = r16
            r5.setSpan(r11, r6, r1, r0)
        L_0x0197:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x019b:
            if (r2 <= 0) goto L_0x01b4
            X.1t1 r0 = r4.A01
            if (r0 != 0) goto L_0x01b4
            X.0ve r1 = r3.A0F
            X.11C r0 = r3.A0C
            X.AnonymousClass1Y5.A0C(r4, r0, r1)
            r0 = 0
            r4.setFocusable(r0)
            r4.setClickable(r0)
            r4.setLongClickable(r0)
            goto L_0x01b4
        L_0x01b3:
            r2 = 0
        L_0x01b4:
            r0 = 2131435949(0x7f0b21ad, float:1.8493755E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x01dd
            X.1bI r7 = X.AnonymousClass3MW.A0p(r0)
            if (r17 <= 0) goto L_0x01e9
            android.view.View r1 = r7.A02()
            r0 = 2131435948(0x7f0b21ac, float:1.8493753E38)
            android.view.View r6 = r1.findViewById(r0)
            com.whatsapp.components.SuspiciousLinkView r6 = (com.whatsapp.components.SuspiciousLinkView) r6
            r0 = 0
            r7.A04(r0)
            r0 = r17
            long r0 = (long) r0
            r6.A0M(r2, r0)
            r3.A1q()
        L_0x01dd:
            if (r2 <= 0) goto L_0x01ef
            java.lang.CharSequence r1 = r3.A1p(r5)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r1, r0)
            return
        L_0x01e9:
            r0 = 8
            r7.A04(r0)
            goto L_0x01dd
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.setTextWithUrlSpanOverrides(android.text.Spannable, com.whatsapp.TextEmojiLabel, X.206, X.4Cr):void");
    }

    private void setupUIForUserNameInGroup(AnonymousClass206 r11, C42141xh r12, ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView, AnonymousClass1E7 r14, int i, AnonymousClass1BI r16) {
        int i2;
        TextEmojiLabel textEmojiLabel;
        AnonymousClass8G7 r2;
        AnonymousClass1BI r7 = r16;
        if (C22971Dz.A0d(r7)) {
            AnonymousClass206 r6 = r11;
            AnonymousClass1BI r1 = r11.A0v.A00;
            if (r1 != null) {
                C42141xh r8 = r12;
                if (C22971Dz.A0e(r1) && this.A0i.A0D()) {
                    AnonymousClass1VX A012 = AnonymousClass1VW.A01(r7);
                    int A002 = C19740yt.A00(getContext(), A012.accentColorRes);
                    textEmojiLabel = r12.A01;
                    textEmojiLabel.setTextColor(A002);
                    r2 = this.A0t;
                    if (r2 != null) {
                        C137196v4.A01(r2.A09, A012);
                    }
                } else if (C22971Dz.A0e(r1)) {
                    int A003 = C19740yt.A00(getContext(), 2131102080);
                    textEmojiLabel = r12.A01;
                    textEmojiLabel.setTextColor(A003);
                    r2 = this.A0t;
                    if (r2 != null) {
                        C137196v4.A01(r2.A08, Integer.valueOf(A003));
                    }
                    this.A1X.CGN(new C70833Cr((Object) this, (Object) r6, (Object) r7, (Object) r8, 9));
                } else {
                    boolean A004 = ((C86084Qc) this.A25.get()).A00(r11);
                    Context context = getContext();
                    if (A004) {
                        i2 = C72463Mc.A01(getContext());
                    } else {
                        i2 = 2131102080;
                    }
                    int A005 = C19740yt.A00(context, i2);
                    textEmojiLabel = r12.A01;
                    textEmojiLabel.setTextColor(A005);
                    r2 = this.A0t;
                    if (r2 != null) {
                        C137196v4.A01(r2.A08, Integer.valueOf(A005));
                    }
                }
                textEmojiLabel.setTextSize(getNameInGroupTextFontSize());
                C43421zm.A04(textEmojiLabel);
                boolean A2X2 = A2X();
                ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView2 = this.A0p;
                if (A2X2) {
                    if (conversationRowParticipantHeaderMainView2 != null) {
                        if (((C86304Rc) this.A1t.get()).A01()) {
                            conversationRowParticipantHeaderMainView2.setOnTouchListener((View.OnTouchListener) this.A2w.get());
                        } else {
                            C89904dD.A00(conversationRowParticipantHeaderMainView2, this, 20);
                        }
                    }
                } else if (conversationRowParticipantHeaderMainView2 != null) {
                    conversationRowParticipantHeaderMainView2.setOnTouchListener((View.OnTouchListener) null);
                    conversationRowParticipantHeaderMainView2.setOnClickListener((View.OnClickListener) null);
                }
                conversationRowParticipantHeaderMainView.setBackgroundResource(2131232942);
                A0W(conversationRowParticipantHeaderMainView, this);
                if (r2 != null) {
                    C137196v4.A01(r2.A06, this.A0l.A0S(r14, i));
                }
            }
        }
    }

    private void setupUsernameInGroupViewContainer(AnonymousClass206 r20) {
        AnonymousClass1BI A0H2;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0p;
        if (conversationRowParticipantHeaderMainView != null) {
            TextEmojiLabel A0W2 = AnonymousClass3MX.A0W(this, 2131432909);
            AnonymousClass206 r7 = r20;
            AnonymousClass205 r2 = r7.A0v;
            boolean z = r2.A02;
            if (z) {
                if (this.A0l.CN6()) {
                    A0H2 = AnonymousClass11S.A01(this.A0U);
                }
                C17960vV.A0F(false, "ConversationRow/setUpUsernameInGroupViewContainer/not allowed state");
                return;
            }
            A0H2 = r7.A0H();
            boolean A002 = ((C86084Qc) this.A25.get()).A00(r7);
            if ((A0H2 != null || (A002 && (A0H2 = r2.A00) != null)) && A0W2 != null) {
                C42141xh BGE = this.A08.BGE(getContext(), A0W2);
                AnonymousClass1E7 A0H3 = this.A0j.A0H(A0H2);
                int A082 = this.A0l.A08(A0H3, r2.A00);
                if (this.A0U.A0O(A0H2)) {
                    A082 = 8;
                }
                setupUIForUserNameInGroup(r7, BGE, conversationRowParticipantHeaderMainView, A0H3, A082, A0H2);
                if (z) {
                    if (this.A0l.CN6()) {
                        A0c(BGE, conversationRowParticipantHeaderMainView, A0H3, A082, false);
                    }
                    C17960vV.A0F(false, "ConversationRow/setUpUsernameInGroupViewContainer/not allowed state");
                    return;
                }
                A0c(BGE, conversationRowParticipantHeaderMainView, A0H3, A082, true);
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("conversation_row/missing_rmt_src:");
                C17890vO.A19(A102, AnonymousClass25A.A0D(r7));
            }
            AnonymousClass1EC A0i2 = AnonymousClass3MW.A0i(r2.A00);
            UserJid A003 = C22941Dw.A00(A0H2);
            View findViewById = findViewById(2131429607);
            if (findViewById != null) {
                this.A1X.CGS(new C70833Cr((Object) this, (Object) A003, (Object) A0i2, (Object) findViewById, 8), "run_async_if_gated_serial_tag");
            }
            if (this.A01 < 2) {
                conversationRowParticipantHeaderMainView.setVisibility(0);
            }
        }
    }

    public int A1k(int i) {
        if (C446824j.A02(i, 13) || C446824j.A02(i, 5)) {
            return 2131232631;
        }
        if (i == 4) {
            return 2131232629;
        }
        return 2131232640;
    }

    public int A1l(int i) {
        boolean A022 = C446824j.A02(i, 13);
        Context context = getContext();
        int i2 = 2130970569;
        int i3 = 2131101888;
        if (A022) {
            i2 = 2130970568;
            i3 = 2131101887;
        }
        return AnonymousClass1YL.A01(context, i2, i3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3 != 1) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C95874mw A1m(X.AnonymousClass206 r5) {
        /*
            r4 = this;
            X.5cR r0 = r4.A0k
            if (r0 == 0) goto L_0x0035
            int r3 = r0.BW6(r5)
        L_0x0008:
            X.5c7 r0 = r4.getRowCustomizer()
            int r0 = r0.BQ7()
            r2 = 1
            if (r0 <= 0) goto L_0x0023
            int r0 = X.C95874mw.A06
            X.5c7 r0 = r4.getRowCustomizer()
            int r0 = r0.BQ7()
        L_0x001d:
            X.4mw r1 = new X.4mw
            r1.<init>(r2, r0)
            return r1
        L_0x0023:
            boolean r0 = X.AnonymousClass25A.A0m(r5)
            if (r0 == 0) goto L_0x002d
            r0 = 308(0x134, float:4.32E-43)
            if (r3 == r2) goto L_0x001d
        L_0x002d:
            r0 = 768(0x300, float:1.076E-42)
            X.4mw r1 = new X.4mw
            r1.<init>(r3, r0)
            return r1
        L_0x0035:
            r3 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A1m(X.206):X.4mw");
    }

    public C85694Oj A1n() {
        AnonymousClass1KB r1 = this.A0S;
        AnonymousClass10I r5 = this.A1X;
        return new C85694Oj(r1, this.A0X, this.A0y, this.A1D, r5);
    }

    public void A1q() {
        AnonymousClass3QI r2 = this.A0A;
        if (r2 != null && AnonymousClass4DK.FORWARD == r2.A00) {
            r2.A01.setVisibility(8);
        }
    }

    public void A1w() {
        View view = this.A05;
        if (view != null) {
            view.setVisibility(0);
            this.A05.bringToFront();
        }
        A0d(this);
        C89904dD.A00(this.A05, this, 23);
    }

    public void A1y() {
        if (this instanceof AnonymousClass3u7) {
            AnonymousClass3u7 r7 = (AnonymousClass3u7) this;
            List albumMessages = r7.getAlbumMessages();
            boolean z = true;
            if (!albumMessages.isEmpty()) {
                int size = albumMessages.size();
                Iterator it = albumMessages.iterator();
                int i = 0;
                while (it.hasNext()) {
                    AnonymousClass21V A0b2 = C17880vN.A0b(it);
                    C62572rc A0M2 = AnonymousClass3Ma.A0M(A0b2);
                    if (A0M2.A0f && !A0M2.A0d) {
                        int i2 = (int) A0M2.A0C;
                        C32861hs sendMediaMessageManager = r7.getSendMediaMessageManager();
                        AnonymousClass34B A042 = sendMediaMessageManager.A04(C32861hs.A00(sendMediaMessageManager, A0b2));
                        if (A042 != null && A042.A02().A0L) {
                            i2 /= 2;
                            if (r7.getSendMediaMessageManager().A08(A0b2)) {
                                i2 += 50;
                            }
                        }
                        i += i2;
                    } else if (A0M2.A0V) {
                        i += 100;
                    }
                }
                if (size != 0) {
                    int i3 = i / size;
                    if (!(i == 0 || i == 100)) {
                        z = false;
                    }
                    int A2i2 = r7.A2i(i);
                    C28931bI r1 = r7.A0B;
                    if (r1.A00 != null) {
                        ConversationRowMediaControlView conversationRowMediaControlView = (ConversationRowMediaControlView) r1.A02();
                        C28931bI r3 = conversationRowMediaControlView.A05;
                        StringBuilder A102 = AnonymousClass000.A10();
                        C17900vP.A0a(conversationRowMediaControlView, A102);
                        r3.A08(new C98234qn(i3, A2i2, 0, z), AnonymousClass000.A0y("#updateProgress", A102));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A22() {
        /*
            r3 = this;
            X.0ve r2 = r3.A0F
            r1 = 6806(0x1a96, float:9.537E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x003b
            X.3QI r0 = r3.A0A
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            r0.A01()
        L_0x0013:
            boolean r0 = r3.A1W()
            if (r0 == 0) goto L_0x0029
            X.3QI r2 = r3.getOrCreateActionButtonContainer()
            r0 = 38
            X.48m r1 = new X.48m
            r1.<init>(r3, r0)
            android.view.View$OnLongClickListener r0 = r3.A2t
            r2.setupRateButton(r1, r0)
        L_0x0029:
            X.206 r0 = r3.getFMessage()
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3Ma.A0o(r0)
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 == 0) goto L_0x003a
            r3.A1q()
        L_0x003a:
            return
        L_0x003b:
            X.3QI r0 = r3.getOrCreateActionButtonContainer()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A22():void");
    }

    public void A23(int i) {
        int i2;
        int i3;
        int i4;
        Resources resources;
        int i5;
        this.A01 = i;
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0p;
        int i6 = 0;
        if (conversationRowParticipantHeaderMainView != null) {
            conversationRowParticipantHeaderMainView.setVisibility(C72453Mb.A07(A2d(this.A17, getFMessage(), i, this.A0V) ? 1 : 0));
        }
        AnonymousClass8G7 r0 = this.A0t;
        if (r0 != null) {
            C137196v4.A01(r0.A05, Integer.valueOf(i));
        }
        int extraBottomPadding = getExtraBottomPadding();
        if (this instanceof AnonymousClass5XH) {
            i6 = getResources().getDimensionPixelOffset(2131166393);
            i2 = getResources().getDimensionPixelOffset(2131166391);
        } else {
            i2 = 0;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int A002 = (int) ((C72473Md.A00(this) * 4.0f) / 3.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168070);
        C108675c7 r1 = this.A0l;
        if (r1.CLy()) {
            i3 = r1.BNl(getContext());
            i4 = r1.BNl(getContext());
        } else {
            i3 = A002;
            i4 = dimensionPixelSize;
        }
        int i7 = this.A01;
        if (i7 != 1) {
            if (i7 == 2) {
                setPadding(paddingLeft, A002 - i6, paddingRight, (i3 - i2) + extraBottomPadding);
            } else if (i7 != 3) {
                if (this.A2c) {
                    i6 = getResources().getDimensionPixelOffset(2131166393);
                }
                setPadding(paddingLeft, dimensionPixelSize - i6, paddingRight, i4 - i2);
                resources = getResources();
                i5 = 2131166269;
            } else {
                setPadding(paddingLeft, A002 - i6, paddingRight, (i4 - i2) + extraBottomPadding);
            }
            resources = getResources();
            i5 = 2131166270;
        } else {
            if (this.A2c) {
                i6 = getResources().getDimensionPixelOffset(2131166393);
            }
            setPadding(paddingLeft, dimensionPixelSize - i6, paddingRight, (i3 - i2) + extraBottomPadding);
            resources = getResources();
            i5 = 2131166270;
        }
        setMinimumHeight(AnonymousClass3MW.A01(resources, i5));
    }

    public void A27(Bundle bundle) {
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_WIDTH", getWidth());
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_HEIGHT", getHeight());
        bundle.putInt("EXTRA_SELECTION_SAVE_STATE_COLLAPSE_TYPE", this.A01);
        C108875cR r1 = this.A0k;
        if (r1 != null) {
            bundle.putInt("EXTRA_SELECTION_SAVE_STATE_PAGE_LIMIT", r1.BW6(getFMessage()));
        }
    }

    public /* synthetic */ void A29(SpannableStringBuilder spannableStringBuilder, TextEmojiLabel textEmojiLabel, AnonymousClass4U6 r11, C82924Cr r12, AnonymousClass206 r13) {
        boolean z = r11.A02;
        if (z) {
            AnonymousClass4U6 r7 = new AnonymousClass4U6(spannableStringBuilder, r11.A00, z);
            SpannableStringBuilder spannableStringBuilder2 = r7.A01;
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), URLSpan.class)) {
                if (r7.A00 <= spannableStringBuilder2.getSpanEnd(uRLSpan)) {
                    spannableStringBuilder2.removeSpan(uRLSpan);
                }
            }
            A0U(spannableStringBuilder, this);
        }
        setTextWithUrlSpanOverrides(spannableStringBuilder, textEmojiLabel, r13, r12);
    }

    public void A2C(ViewGroup viewGroup, Runnable runnable, int i, boolean z) {
        if (z) {
            View view = this.A05;
            if (view == null) {
                view = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), (ViewGroup) null, 2131623986);
                this.A05 = view;
            }
            TextView A0E2 = C17880vN.A0E(view, 2131427479);
            A0E2.setText(i);
            C43421zm.A04(A0E2);
            if (this.A05.getParent() != null) {
                viewGroup.removeView(this.A05);
            }
            C72453Mb.A1E(this.A05, viewGroup);
            C825248h.A00(this.A05, this, runnable, 37);
            return;
        }
        View view2 = this.A05;
        if (view2 != null) {
            viewGroup.removeView(view2);
            this.A05 = null;
        }
    }

    public void A2H(AnonymousClass8BG r7, AnonymousClass1BI r8) {
        boolean A172;
        ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment;
        if (r7 == null) {
            Log.e("ConversationRow/onReactionViewClicked null message reactions.");
            return;
        }
        AnonymousClass1FL r5 = (AnonymousClass1FL) C18050vg.A01(getContext(), AnonymousClass1FU.class);
        if (r5 == null) {
            return;
        }
        if (C22971Dz.A0V(r8)) {
            AnonymousClass25J r0 = C29681ch.A03;
            if (!(r8 instanceof C29681ch)) {
                r8 = null;
            }
            C17960vV.A07(r8);
            List allMessages = getAllMessages();
            AnonymousClass3MW.A0c(this.A1s).A01(C217717i.class);
            C17960vV.A07(r8);
            C18070vi.A0d(allMessages, 1);
            NewsletterReactionsSheet newsletterReactionsSheet = new NewsletterReactionsSheet();
            newsletterReactionsSheet.A0C = allMessages;
            C34001jj A0H2 = AnonymousClass3Ma.A0H(r5);
            A0H2.A0G = true;
            A0H2.A0B(newsletterReactionsSheet, "newsletter_reaction_sheet");
            A0H2.A02();
            return;
        }
        AnonymousClass206 fMessage = getFMessage();
        if (this instanceof AnonymousClass3u7) {
            A172 = C18070vi.A16(r8, fMessage);
            C17960vV.A07(r8);
            AnonymousClass4MO r02 = ((AnonymousClass3u7) this).A0A;
            reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
            reactionsBottomSheetDialogFragment.A0I = r8;
            reactionsBottomSheetDialogFragment.A0J = fMessage;
            reactionsBottomSheetDialogFragment.A05 = r7;
            reactionsBottomSheetDialogFragment.A0A = r02;
            reactionsBottomSheetDialogFragment.A0Q = AnonymousClass000.A1W(r02);
        } else {
            A172 = C18070vi.A17(r8, fMessage);
            reactionsBottomSheetDialogFragment = new ReactionsBottomSheetDialogFragment();
            reactionsBottomSheetDialogFragment.A0I = r8;
            reactionsBottomSheetDialogFragment.A0J = fMessage;
            reactionsBottomSheetDialogFragment.A05 = r7;
            reactionsBottomSheetDialogFragment.A0A = null;
            reactionsBottomSheetDialogFragment.A0Q = false;
        }
        reactionsBottomSheetDialogFragment.A0P = A172;
        reactionsBottomSheetDialogFragment.A2C(r5.getSupportFragmentManager(), "reactionsheet");
        this.A1O.A00(fMessage, AnonymousClass00R.A18, 1);
    }

    public void A2L(AnonymousClass206 r5) {
        this.A1i.get();
        C18070vi.A0d(r5, 0);
        boolean A002 = C87494Vu.A00(r5);
        if (!AnonymousClass25A.A0j(r5) || A002) {
            C72453Mb.A1B(this.A2l);
            return;
        }
        if (this.A2l == null) {
            TextView textView = (TextView) AnonymousClass3MZ.A0D(this).inflate(2131625166, (ViewGroup) null, false);
            this.A2l = textView;
            ViewGroup viewGroup = this.A06;
            viewGroup.addView(textView, viewGroup.indexOfChild(this.A0H));
        }
        int i = 2132084357;
        if (r5.A0v.A02) {
            i = 2132084359;
        }
        C29261bv.A08(this.A2l, i);
        this.A2l.setVisibility(0);
    }

    public void A2M(AnonymousClass206 r11) {
        if (this instanceof AnonymousClass3u7) {
            AnonymousClass3u7 r1 = (AnonymousClass3u7) this;
            ArrayList arrayList = r1.A0C;
            if (arrayList.size() > 0) {
                AnonymousClass4Xe conversationRowAlbumUtils = r1.getConversationRowAlbumUtils();
                Context A042 = AnonymousClass3MY.A04(r1);
                List albumMessages = r1.getAlbumMessages();
                List revokedAlbumMessages = r1.getRevokedAlbumMessages();
                AnonymousClass206 fMessage = r1.getFMessage();
                C18070vi.A0X(fMessage);
                Object obj = arrayList.get(0);
                C18070vi.A0X(obj);
                conversationRowAlbumUtils.A02(A042, (C87804Xb) obj, fMessage, albumMessages, revokedAlbumMessages, arrayList, 0);
                return;
            }
            return;
        }
        C107055Yf r0 = (C107055Yf) C88404Zo.A03(getContext(), C107055Yf.class);
        if (r0 != null) {
            r0.BhI(r11);
        }
    }

    public void A2T(AnonymousClass206 r4, int i) {
        if (this.A0k != null) {
            getRowCustomizer();
            this.A1X.CGF(new C21470Akb((Object) this, i, 35, (Object) r4));
        }
    }

    public final void A2U(AnonymousClass206 r4, int i, int i2) {
        C28931bI r1;
        int i3;
        int A002;
        View findViewById;
        if (r4.A0l) {
            AnonymousClass205 r12 = r4.A0v;
            if (r12.A02 && !C22971Dz.A0N(r12.A00)) {
                if (this.A2s == null && (findViewById = findViewById(i)) != null) {
                    this.A2s = AnonymousClass3MW.A0p(findViewById);
                }
                C28931bI r0 = this.A2s;
                if (r0 != null) {
                    ImageView imageView = (ImageView) r0.A02();
                    imageView.setImageResource(i2);
                    if (i2 == 2131231130) {
                        A002 = -1;
                    } else {
                        A002 = C19740yt.A00(getContext(), 2131101873);
                    }
                    imageView.setColorFilter(A002, PorterDuff.Mode.SRC_IN);
                    r1 = this.A2s;
                    i3 = 0;
                    r1.A04(i3);
                }
                return;
            }
        }
        r1 = this.A2s;
        if (r1 != null) {
            i3 = 8;
            r1.A04(i3);
        }
    }

    public void A2W(boolean z) {
        int i;
        this.A2c = z;
        WaTextView waTextView = this.A2r;
        if (z) {
            if (waTextView == null) {
                WaTextView waTextView2 = new WaTextView(getContext());
                this.A2r = waTextView2;
                C43421zm.A04(waTextView2);
                this.A2r.setId(2131429594);
                WaTextView waTextView3 = this.A2r;
                C72463Mc.A0w(getContext(), getContext(), waTextView3, 2130969234, 2131100231);
                this.A2r.setBackground(this.A09.BQF());
                this.A2r.setGravity(17);
                this.A2r.setImportantForAccessibility(1);
                AnonymousClass3MZ.A1K(this.A2r, this, 5);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131166182);
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                int dimensionPixelSize2 = dimensionPixelSize - getResources().getDimensionPixelSize(2131166391);
                marginLayoutParams.bottomMargin = dimensionPixelSize2;
                if (this instanceof AnonymousClass5XH) {
                    marginLayoutParams.bottomMargin = dimensionPixelSize2 - getResources().getDimensionPixelSize(2131166393);
                }
                addView(this.A2r, marginLayoutParams);
                waTextView = this.A2r;
                this.A0e = waTextView;
            }
            waTextView.setText(C64052u8.A0B(this.A0D, getFMessage().A0I));
            this.A2r.setTextSize(this.A0n.A03(getResources()));
            waTextView = this.A2r;
            i = 0;
        } else if (waTextView != null) {
            i = 8;
        } else {
            return;
        }
        waTextView.setVisibility(i);
    }

    public boolean A2Z() {
        return this.A2i;
    }

    public boolean A2f(AnonymousClass206 r2) {
        return !this.A0V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2 == 7) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2g(X.AnonymousClass206 r5, boolean r6) {
        /*
            r4 = this;
            int r2 = r5.A0u
            r0 = 21
            if (r2 == r0) goto L_0x000e
            r0 = 22
            if (r2 == r0) goto L_0x000e
            r1 = 7
            r0 = 1
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3 = 0
            if (r0 == 0) goto L_0x0043
            X.205 r2 = r5.A0v
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0020
            X.5c7 r0 = r4.A0l
            boolean r0 = r0.CN6()
            if (r0 == 0) goto L_0x0038
        L_0x0020:
            X.1BI r0 = r2.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.C87494Vu.A01(r5)
            if (r0 == 0) goto L_0x0038
        L_0x002e:
            if (r6 != 0) goto L_0x0038
            X.5c7 r0 = r4.A0l
            boolean r0 = r0.Beq()
            if (r0 != 0) goto L_0x0042
        L_0x0038:
            X.12L r1 = r4.A17
            X.1BI r0 = r2.A00
            boolean r0 = X.C42761yh.A01(r1, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r3 = 1
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A2g(X.206, boolean):boolean");
    }

    public int getCollapseType() {
        return this.A01;
    }

    public int getConfigHash() {
        return this.A00;
    }

    public TextView getDateView() {
        return this.A0H;
    }

    public ViewGroup getDateWrapper() {
        return this.A06;
    }

    public float getDividerFontSize() {
        return this.A0n.A03(getResources());
    }

    public List getHighlightTerms() {
        C108875cR r0 = this.A0k;
        if (r0 == null) {
            return null;
        }
        return r0.getSearchTerms();
    }

    public Drawable getInnerFrameForegroundDrawable() {
        return this.A09.BS0(AnonymousClass00R.A01, C72453Mb.A05(C79103uS.A1I(this) ? 1 : 0), isPressed());
    }

    public ImageView getStatusView() {
        return this.A0D;
    }

    public float getTextFontSize() {
        return this.A0n.A01(AnonymousClass3Ma.A06(this), getResources());
    }

    public void onMeasure(int i, int i2) {
        int mode;
        if (this.A01 != 0) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int i3 = this.A01;
            if (mode2 == 0) {
                mode = Integer.MIN_VALUE;
            } else {
                i3 = Math.min(i3, View.MeasureSpec.getSize(i2));
                mode = View.MeasureSpec.getMode(i2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, mode);
        }
        super.onMeasure(i, i2);
    }

    public void setHeaderChevronVisibility(boolean z) {
        this.A2k.findViewById(2131429091).setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setPressed(boolean z) {
        if (!this.A2e) {
            super.setPressed(z);
        }
    }

    public void setRecipientNameVisibility(boolean z) {
        View view = this.A2k;
        if (view != null && this.A2o != null) {
            View findViewById = view.findViewById(2131428467);
            int A072 = C72453Mb.A07(z ? 1 : 0);
            findViewById.setVisibility(A072);
            this.A2o.setVisibility(A072);
        }
    }

    public void setSelected(boolean z) {
        AnonymousClass3OA r0 = this.A0o;
        if (r0 != null) {
            r0.setRowSelected(z);
        }
    }

    public static void A0U(SpannableStringBuilder spannableStringBuilder, AnonymousClass3uP r6) {
        Context context = r6.getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(context.getString(2131894929));
            spannableStringBuilder2.setSpan(new C74623c6(r6.getContext(), r6), 0, spannableStringBuilder2.length(), 18);
            spannableStringBuilder.append(spannableStringBuilder2);
        }
    }

    public static void A0X(View view, AnonymousClass3uP r6) {
        AnonymousClass1FU A0K2;
        UserJid A0I2 = r6.getFMessage().A0I();
        if (A0I2 != null && (A0K2 = AnonymousClass3Ma.A0K(r6)) != null) {
            if (C42701yb.A01(A0I2)) {
                AnonymousClass3MW.A0W(r6.A1h).A07(A0K2, (AnonymousClass86Z) null, (C1598286a) null, new C92944iB(view, A0K2, r6, A0I2));
                return;
            }
            r6.A0z.A03(A0I2, AnonymousClass3MW.A0f(C79103uS.A1C(r6))).A0A(A0K2, new C91514fo(view, A0K2, r6, 1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
        if (r0 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        r1 = r0.getVisibility();
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r1 == 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        A0a(r2, r0);
        r5.A0E.addView(r5.A0Y, -2, -2);
        r3 = r5.A0E;
        r2 = (android.view.ViewGroup) r6.getParent();
        r1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        r1.gravity = 3;
        r2.addView(r3, r2.indexOfChild(r6), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        if (A0j(r5, r7) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0F, 4683) != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r5.A0Y != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r5.A0E = new android.widget.LinearLayout(getContext());
        r5.A0Y = new com.whatsapp.TextEmojiLabel(getContext());
        r5.A0Z = r5.A08.BGE(getContext(), r5.A0Y);
        r3 = r5.A0Y;
        r1 = getResources().getColor(X.C72473Md.A05(r5));
        getContext();
        setTopAttributeTextViewAttributes(r3, 2131433062, r1, X.C43421zm.A03());
        r2 = r5.A0E;
        r0 = r5.A0p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Y(android.view.View r6, X.AnonymousClass206 r7) {
        /*
            r5 = this;
            X.Ac1 r1 = X.AnonymousClass9RY.A00(r7)
            if (r6 == 0) goto L_0x0093
            android.widget.LinearLayout r0 = r5.A0F
            if (r0 == 0) goto L_0x0093
            if (r1 == 0) goto L_0x008d
            X.0ve r2 = r5.A0F
            r1 = 4683(0x124b, float:6.562E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x008d
        L_0x0018:
            com.whatsapp.TextEmojiLabel r0 = r5.A0Y
            if (r0 != 0) goto L_0x008c
            android.content.Context r1 = r5.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r5.A0E = r0
            android.content.Context r1 = r5.getContext()
            com.whatsapp.TextEmojiLabel r0 = new com.whatsapp.TextEmojiLabel
            r0.<init>(r1)
            r5.A0Y = r0
            X.3Kk r2 = r5.A08
            android.content.Context r1 = r5.getContext()
            com.whatsapp.TextEmojiLabel r0 = r5.A0Y
            X.1xh r0 = r2.BGE(r1, r0)
            r5.A0Z = r0
            com.whatsapp.TextEmojiLabel r3 = r5.A0Y
            r2 = 2131433062(0x7f0b1666, float:1.84879E38)
            android.content.res.Resources r1 = r5.getResources()
            int r0 = X.C72473Md.A05(r5)
            int r1 = r1.getColor(r0)
            r5.getContext()
            android.graphics.Typeface r0 = X.C43421zm.A03()
            r5.setTopAttributeTextViewAttributes(r3, r2, r1, r0)
            android.widget.LinearLayout r2 = r5.A0E
            com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView r0 = r5.A0p
            if (r0 == 0) goto L_0x0068
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            r5.A0a(r2, r0)
            android.widget.LinearLayout r1 = r5.A0E
            com.whatsapp.TextEmojiLabel r0 = r5.A0Y
            r4 = -2
            r1.addView(r0, r4, r4)
            android.widget.LinearLayout r3 = r5.A0E
            android.view.ViewParent r2 = r6.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = -1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r4)
            r0 = 3
            r1.gravity = r0
            int r0 = r2.indexOfChild(r6)
            r2.addView(r3, r0, r1)
        L_0x008c:
            return
        L_0x008d:
            boolean r0 = A0j(r5, r7)
            if (r0 != 0) goto L_0x0018
        L_0x0093:
            com.whatsapp.TextEmojiLabel r0 = r5.A0Y
            r2 = 0
            if (r0 == 0) goto L_0x00b3
            android.widget.LinearLayout r1 = r5.A0E
            if (r1 == 0) goto L_0x00b3
            r1.removeView(r0)
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
            android.widget.LinearLayout r0 = r5.A0E
            r0.setOnClickListener(r2)
            r5.A0Y = r2
            r5.A0E = r2
            r5.A0Z = r2
        L_0x00b3:
            android.widget.LinearLayout r0 = r5.A0F
            if (r0 == 0) goto L_0x008c
            r0.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A0Y(android.view.View, X.206):void");
    }

    private void A0Z(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, ImageView imageView, int i, int i2, int i3) {
        imageView.setLayoutParams(layoutParams);
        AnonymousClass3MY.A0w(imageView.getContext(), imageView, i);
        C27641Ww.A05(imageView, this.A0D, 0, i2);
        if (viewGroup != null) {
            viewGroup.addView(imageView, C87424Vn.A00(new View[]{this.A0C, this.A0A, this.A0B, null}, i3));
            viewGroup.setClipChildren(false);
        }
    }

    private void A0a(LinearLayout linearLayout, boolean z) {
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166343);
        int dimensionPixelSize2 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166344);
        linearLayout.setOrientation(0);
        if (z) {
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
        }
    }

    public static void A0b(AnonymousClass1FU r7, AnonymousClass3uP r8) {
        r7.A3w(new C92044gf(2), new C92074gi(r7, r8, 0), 2131892992, 2131899286, 2131899101);
    }

    public static boolean A0j(AnonymousClass3uP r5, AnonymousClass206 r6) {
        AnonymousClass1E7 r0;
        C691936g A002 = AnonymousClass2UY.A00(r6);
        C18030ve r02 = r5.A0F;
        boolean z = r5.A0V;
        boolean z2 = false;
        if (!C26180Cu0.A03(r02, r6) && AnonymousClass25A.A0w(r6) && !z) {
            z2 = true;
        }
        if (!z2 || A002 == null) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, r5.A0F, 4652) || (r0 = A002.A00) == null || r0.A0G == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public String getMoreInfoString() {
        Context context;
        int i;
        String str;
        C42691ya r3;
        C54272ds messagePrivacyStateFromDbOnMainThread = getMessagePrivacyStateFromDbOnMainThread();
        if (messagePrivacyStateFromDbOnMainThread == null || (r3 = messagePrivacyStateFromDbOnMainThread.A00) == null) {
            context = getContext();
            i = 2131888730;
        } else {
            C63852tn r0 = new C63852tn(r3, 3, 1);
            context = getContext();
            switch (r0.A02()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 7:
                case 8:
                    i = 2131888729;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                    str = null;
                    break;
                default:
                    i = 2131888731;
                    break;
            }
            i = 2131888730;
        }
        str = context.getString(i);
        return C27641Ww.A01(this.A0D, str);
    }

    private void setTopAttributeTextViewAttributes(TextView textView, int i, int i2, Typeface typeface) {
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166342);
        textView.setId(i);
        textView.setTextColor(i2);
        textView.setTypeface(typeface);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setTextSize(getNameInGroupTextFontSize());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setCompoundDrawablePadding(dimensionPixelSize);
        C29261bv.A03(PorterDuff.Mode.SRC_IN, textView);
        textView.setImportantForAccessibility(2);
    }

    private void setupChatPSAView(AnonymousClass206 r9) {
        TextEmojiLabel A0W2 = AnonymousClass3MX.A0W(this, 2131432909);
        if (A0W2 != null) {
            C42141xh BGE = this.A08.BGE(getContext(), A0W2);
            AnonymousClass1E7 A0H2 = this.A0j.A0H(r9.A0H());
            BGE.A04(BGE.A02.A0D(A0H2, 1), A0H2, (List) null, 1, BGE.A0C(A0H2));
            int color = getResources().getColor(2131103264);
            TextEmojiLabel textEmojiLabel = BGE.A01;
            textEmojiLabel.setTextColor(color);
            textEmojiLabel.setTextSize(getNameInGroupTextFontSize());
            C43421zm.A04(textEmojiLabel);
            textEmojiLabel.setVisibility(0);
        }
    }

    public CharSequence A1p(CharSequence charSequence) {
        List highlightTerms;
        if (TextUtils.isEmpty(charSequence) || (highlightTerms = getHighlightTerms()) == null || highlightTerms.isEmpty()) {
            return charSequence;
        }
        return C43351zf.A01(getContext(), this.A0D, charSequence, highlightTerms);
    }

    public void A1r() {
        C108875cR r1;
        if (A2Z() && (r1 = this.A0k) != null && !r1.Bcq()) {
            r1.COH(getFMessage());
            A2T(getFMessage(), 1);
            C87794Wz r2 = this.A1J;
            r2.A01 = AnonymousClass11P.A01(r2.A04);
            r2.A02 = C17890vO.A0Q();
            r2.A00 = 1;
            r2.A03 = r2.A06.A00();
            C87794Wz r12 = this.A1J;
            if (r12.A03 && r12.A00 == 1) {
                r12.A00 = 2;
                C87794Wz.A00(r12, 0);
            }
        }
    }

    public void A1t() {
        Handler handler = getHandler();
        if (handler == null) {
            Runnable runnable = this.A2x;
            removeCallbacks(runnable);
            post(runnable);
            return;
        }
        Runnable runnable2 = this.A2x;
        if (!handler.hasMessages(0, runnable2)) {
            Message obtain = Message.obtain(handler, runnable2);
            obtain.what = 0;
            obtain.obj = runnable2;
            obtain.sendToTarget();
        }
    }

    public /* synthetic */ void A21() {
        if (getTag().equals(getFMessage().A0v)) {
            AnonymousClass4DK r3 = AnonymousClass4DK.FORWARD;
            AnonymousClass48m r4 = new AnonymousClass48m(this, 37);
            View.OnLongClickListener onLongClickListener = this.A2t;
            Integer forwardButtonAccessibilityResource = getForwardButtonAccessibilityResource();
            C18070vi.A0d(onLongClickListener, 3);
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0F, 6806);
            AnonymousClass3QI orCreateActionButtonContainer = getOrCreateActionButtonContainer();
            if (!A052 || orCreateActionButtonContainer != null) {
                orCreateActionButtonContainer.A01();
                orCreateActionButtonContainer.setupActionButton(r3, r4, onLongClickListener, false, forwardButtonAccessibilityResource);
            }
            if (A1W()) {
                getOrCreateActionButtonContainer().setupRateButton(new AnonymousClass48m(this, 38), onLongClickListener);
            }
            if (C22971Dz.A0S(AnonymousClass3Ma.A0o(getFMessage()))) {
                A1q();
            }
        }
    }

    public void A28(Spannable spannable) {
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new C74703cE(getContext(), this.A0T, this.A0S, this.A0C, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
    }

    public void A2D(FrameLayout frameLayout, AnonymousClass724 r3, AnonymousClass206 r4, C135486sH r5, C139546z1 r6) {
        AnonymousClass206 A0K2 = r4.A0K();
        if (A0K2 != null) {
            r6.A01(frameLayout, r3, A0K2, r5);
        }
    }

    public void A2K(AnonymousClass206 r3) {
        A2B(getDateWrapper(), getDateView(), r3);
    }

    public void A2N(AnonymousClass206 r6) {
        C42141xh r0;
        LinearLayout linearLayout;
        int i;
        C20947Ac1 A002 = AnonymousClass9RY.A00(r6);
        C691936g A003 = AnonymousClass2UY.A00(r6);
        if (A002 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 4683)) {
                String str = A002.A04;
                if (this.A0Y == null) {
                    A0Y(findViewById(getTopAttributeTextAnchorId()), r6);
                }
                TextEmojiLabel textEmojiLabel = this.A0Y;
                if (textEmojiLabel != null) {
                    textEmojiLabel.A0N();
                    TextEmojiLabel textEmojiLabel2 = this.A0Y;
                    if (TextUtils.isEmpty(str)) {
                        str = getResources().getString(2131897901);
                    }
                    textEmojiLabel2.setText(str);
                }
                C90074dU.A01(this.A0E, this, r6, 3);
                linearLayout = this.A0F;
                i = 4;
                C90074dU.A01(linearLayout, this, r6, i);
            }
        }
        if (A0j(this, r6)) {
            String A0U2 = this.A0l.A0U(A003.A00, -1, true);
            if (!TextUtils.isEmpty(A0U2) && (r0 = this.A0Z) != null) {
                r0.A01.setText(A0U2);
                this.A0Z.A03(0);
                C90074dU.A01(this.A0E, this, r6, 5);
                linearLayout = this.A0F;
                i = 6;
                C90074dU.A01(linearLayout, this, r6, i);
            }
        }
    }

    public void A2O(AnonymousClass206 r3) {
        C108875cR r0;
        if (A2Z() && (r0 = this.A0k) != null) {
            this.A0o.setRowSelected(r0.CPY(r3));
        }
    }

    public void A2P(AnonymousClass206 r6) {
        int i;
        int i2;
        int i3;
        ViewGroup A0D2 = AnonymousClass3MW.A0D(this, 2131432248);
        if (A0D2 != null) {
            if (AnonymousClass000.A1W(AnonymousClass9RY.A00(r6))) {
                if (C18020vd.A05(C18040vf.A02, this.A0F, 9422)) {
                    i2 = 2131897901;
                    i3 = 45;
                    A2C(A0D2, new C146497Pi(this, r6, i3), i2, true);
                }
            }
            if (!A0j(this, r6) || !((i = r6.A0u) == 0 || i == 1 || i == 9 || i == 3)) {
                View view = this.A05;
                if (view != null) {
                    A0D2.removeView(view);
                    this.A05 = null;
                    return;
                }
                return;
            }
            i2 = 2131892041;
            i3 = 46;
            A2C(A0D2, new C146497Pi(this, r6, i3), i2, true);
        }
    }

    public void A2Q(AnonymousClass206 r5) {
        if (!TextUtils.isEmpty(r5.A0S()) || AnonymousClass4IG.A00.contains(r5)) {
            if (this.A2n == null) {
                TextView textView = (TextView) AnonymousClass3MZ.A0D(this).inflate(2131627231, (ViewGroup) null, false);
                this.A2n = textView;
                ViewGroup viewGroup = this.A06;
                viewGroup.addView(textView, viewGroup.indexOfChild(this.A0H));
            }
            TextView textView2 = this.A2n;
            int i = 2131897132;
            if (AnonymousClass4IG.A00.contains(r5)) {
                i = 2131897133;
            }
            textView2.setText(i);
            this.A2n.setVisibility(0);
            return;
        }
        C72453Mb.A1B(this.A2n);
    }

    public void A2S(AnonymousClass206 r1, int i) {
        setFMessage(r1);
        A0f(this, i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A2V(X.AnonymousClass206 r6, boolean r7) {
        /*
            r5 = this;
            X.206 r4 = r5.getFMessage()
            boolean r3 = X.AnonymousClass3Ma.A1Z(r4, r6)
            r5.setFMessage(r6)
            if (r3 != 0) goto L_0x000f
            if (r7 == 0) goto L_0x0042
        L_0x000f:
            boolean r0 = r6.A0w()
            if (r0 == 0) goto L_0x0034
            X.00H r0 = r5.A2F
            java.lang.Object r2 = r0.get()
            X.4aG r2 = (X.C88634aG) r2
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A06
            monitor-enter(r1)
            java.util.Map r0 = r2.A07     // Catch:{ all -> 0x0031 }
            r0.remove(r4)     // Catch:{ all -> 0x0031 }
            monitor-exit(r1)
            goto L_0x003f
        L_0x0031:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0034:
            X.00H r0 = r5.A26
            java.lang.Object r0 = r0.get()
            X.7Ka r0 = (X.C145127Ka) r0
            r0.A05(r4)
        L_0x003f:
            A0h(r5, r3)
        L_0x0042:
            X.5cR r2 = r5.A0k
            if (r2 == 0) goto L_0x0064
            boolean r0 = r2.Bcq()
            if (r0 == 0) goto L_0x0064
            boolean r0 = r5.A2Y()
            if (r0 == 0) goto L_0x0064
            r5.A1w()
            X.3OA r1 = r5.A0o
            boolean r0 = r2.Bfa(r6)
        L_0x005b:
            r1.setRowSelected(r0)
        L_0x005e:
            X.1u6 r0 = r5.A1L
            java.util.Set r1 = r0.A00
            monitor-enter(r1)
            goto L_0x006f
        L_0x0064:
            android.view.View r0 = r5.A05
            X.C72453Mb.A1B(r0)
            X.3OA r1 = r5.A0o
            if (r1 == 0) goto L_0x005e
            r0 = 0
            goto L_0x005b
        L_0x006f:
            r1.clear()     // Catch:{ all -> 0x0074 }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A2V(X.206, boolean):void");
    }

    public boolean A2X() {
        AnonymousClass206 fMessage = getFMessage();
        if (this.A0E.A0R(fMessage.A0v.A00)) {
            return this.A0z.A0R(fMessage);
        }
        return true;
    }

    public boolean A2d(AnonymousClass12L r7, AnonymousClass206 r8, int i, boolean z) {
        if (!A2g(r8, z)) {
            return false;
        }
        if (i <= 1 || r8.A0F != 0 || r8.A0u != 0 || AnonymousClass25A.A0t(r8) || AnonymousClass25A.A0w(r8) || C42761yh.A01(r7, r8.A0v.A00)) {
            return true;
        }
        return false;
    }

    public boolean A2h(AnonymousClass205 r2) {
        return getFMessage().A0v.equals(r2);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A1L.A01();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return this.A2y.onKey(this, keyEvent.getKeyCode(), keyEvent);
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(isPressed());
        for (FrameLayout frameLayout : getInnerFrameLayouts()) {
            if (frameLayout != null) {
                frameLayout.setPressed(isPressed());
                frameLayout.setForeground(getInnerFrameForegroundDrawable());
            }
        }
    }

    public List getAllMessages() {
        return Collections.singletonList(getFMessage());
    }

    public C37451pZ getContactPhotosLoader() {
        Activity A002 = C18050vg.A00(getContext());
        if (A002 instanceof AnonymousClass5YT) {
            return ((AnonymousClass5YT) A002).getContactPhotosLoader();
        }
        return null;
    }

    public String getGroupRoleTitle() {
        return getContext().getString(2131888494);
    }

    public Set getInnerFrameLayouts() {
        HashSet A122 = C17880vN.A12();
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            A122.add(frameLayout);
        }
        View findViewById = findViewById(2131432020);
        if (findViewById != null) {
            A122.add(findViewById);
        }
        return A122;
    }

    public Drawable getKeepAnimDrawable() {
        Context context = getContext();
        C18070vi.A0d(context, 0);
        return AnonymousClass4aX.A03(context, 2130970828, 2131102239, 2131232634);
    }

    public C692336k getMessageCommentInfo() {
        return A1o(getFMessage());
    }

    public AnonymousClass8BG getMessageReactions() {
        getRowCustomizer();
        AnonymousClass206 fMessage = getFMessage();
        this.A0c.A02(fMessage, (Runnable) null, 56, false);
        return C63892tr.A01(fMessage);
    }

    public int getMessageStatus() {
        return getFMessage().A0D();
    }

    public int getMessageType() {
        return getFMessage().A0u;
    }

    public Drawable getPinAnimDrawable() {
        Context context = getContext();
        C18070vi.A0d(context, 0);
        return AnonymousClass4aX.A03(context, 2130970828, 2131102239, 2131233512);
    }

    public Drawable getPopupDrawable() {
        Context context = getContext();
        C18070vi.A0d(context, 0);
        return AnonymousClass4aX.A03(context, 2130970828, 2131102239, 2131232639);
    }

    public int getProfilePictureFullWidth() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(2131166964) + resources.getDimensionPixelSize(2131166960) + resources.getDimensionPixelSize(2131166961);
    }

    public int getSecondaryTextColor() {
        boolean A1I2 = C79103uS.A1I(this);
        Context context = getContext();
        int i = 2130971113;
        int i2 = 2131102439;
        if (A1I2) {
            i = 2130971114;
            i2 = 2131102444;
        }
        return AnonymousClass3MY.A02(this, AnonymousClass1YL.A00(context, i, i2));
    }

    public boolean isPressed() {
        if (!super.isPressed()) {
            return false;
        }
        AnonymousClass3OA r0 = this.A0o;
        if (r0 == null || !r0.A02) {
            return true;
        }
        return false;
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 7) {
            motionEvent.getAction();
        }
        motionEvent.getAction();
        return super.onInterceptHoverEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C108875cR r0;
        if (motionEvent.getAction() != 0) {
            motionEvent.getAction();
        }
        motionEvent.getAction();
        if (motionEvent.getAction() == 1) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 9405) && !(this instanceof C79053uH) && (r0 = this.A0k) != null) {
                r0.BId();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A05;
        if (view != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0p;
        if (conversationRowParticipantHeaderMainView != null && conversationRowParticipantHeaderMainView.getVisibility() == 0) {
            conversationRowParticipantHeaderMainView.A00(AnonymousClass3MW.A1Z(this.A0D));
        }
        ConversationRowParticipantHeaderQuotedView conversationRowParticipantHeaderQuotedView = this.A0q;
        if (!(conversationRowParticipantHeaderQuotedView == null || conversationRowParticipantHeaderQuotedView.getVisibility() != 0 || AnonymousClass1HF.A06(this.A0q, 2131434293).getVisibility() == 0)) {
            this.A0q.A00(AnonymousClass3MW.A1Z(this.A0D));
        }
        ImageView imageView = this.A09;
        if (imageView != null) {
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = this.A09.getDrawable().getIntrinsicHeight();
            View view2 = this.A0j;
            int top = view2.getTop();
            if (this.A0V) {
                paddingTop = getResources().getDimensionPixelSize(2131166257);
            } else {
                paddingTop = view2.getPaddingTop() + ((C72473Md.A04(view2) - intrinsicHeight) / 2);
            }
            int i5 = top + paddingTop;
            int A002 = AnonymousClass3MX.A00(getResources(), 2131166257, C87344Vf.A00(getContext()));
            C108675c7 r1 = this.A0l;
            C17960vV.A07(r1);
            boolean Beq = r1.Beq();
            boolean BgQ = r1.BgQ();
            if (Beq) {
                BgQ = AnonymousClass000.A1T(BgQ ? 1 : 0, C79103uS.A1I(this) ? 1 : 0);
            }
            ImageView imageView2 = this.A09;
            if (BgQ) {
                imageView2.layout((getWidth() - intrinsicWidth) - A002, i5, getWidth() - A002, intrinsicHeight + i5);
            } else {
                imageView2.layout(A002, i5, intrinsicWidth + A002, intrinsicHeight + i5);
            }
        }
    }

    public void setCacheInflated(boolean z) {
        this.A2b = z;
    }

    public void setConfigHash(int i) {
        this.A00 = i;
    }

    public void setForwardButtonAction(Runnable runnable) {
        this.A2Z = runnable;
    }

    public void setIgnorePressedStateUpdates(boolean z) {
        this.A2e = z;
    }

    public void setMaxHeight(int i) {
        this.A01 = i;
    }

    public void setSearchButtonAction(Runnable runnable) {
        this.A2a = runnable;
    }

    public void setSelectable(boolean z) {
        this.A2i = z;
    }

    public void A1s() {
        A0e(this);
    }

    public int getBroadcastDrawableId() {
        return 2131231129;
    }

    public int getTopAttributeTextAnchorId() {
        return 2131434296;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03a4, code lost:
        r9 = new X.C25807CmK(r10, r11, 0, r13, false, r15, false, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03af, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0280, code lost:
        if (X.C18020vd.A05(r5, r6, 11843) == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0284, code lost:
        if (r13 == false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0286, code lost:
        r6 = r2.A03;
        r5 = X.C18040vf.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0290, code lost:
        if (X.C18020vd.A05(r5, r6, 12539) == false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0292, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0299, code lost:
        if (X.C18020vd.A05(r5, r6, 10986) != false) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x029b, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x029c, code lost:
        if (r13 == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x029e, code lost:
        r6 = r2.A03;
        r5 = X.C18040vf.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02a8, code lost:
        if (X.C18020vd.A05(r5, r6, 12539) == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02b0, code lost:
        if (X.C18020vd.A05(r5, r6, 10886) == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b6, code lost:
        if (X.AnonymousClass000.A0Y(r4) == null) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02b8, code lost:
        r9 = new X.C25807CmK(r10, r11, X.AnonymousClass000.A0Y(r4).getDimensionPixelSize(2131169446), r13, r14, r15, false, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ca, code lost:
        r6 = r2.A00;
        r5 = r2.A05;
        X.C26302CxJ.A05(r4.getContext(), android.text.SpannableStringBuilder.valueOf(r7), r4.getPaint(), r2.A03, r9, r7, X.C26302CxJ.A00(r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ef, code lost:
        if (r1.A00 == Integer.MIN_VALUE) goto L_0x02f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x026c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2F(com.whatsapp.TextEmojiLabel r32, X.C82924Cr r33, X.AnonymousClass206 r34, java.lang.String r35, int r36, boolean r37, boolean r38, boolean r39) {
        /*
            r31 = this;
            r3 = r31
            if (r38 == 0) goto L_0x0249
            float r6 = r3.getTextFontSize()
        L_0x0008:
            r8 = r34
            X.4mw r1 = r3.A1m(r8)
            X.00H r0 = r3.A1r
            java.lang.Object r2 = r0.get()
            X.2td r2 = (X.C63752td) r2
            X.1gc r13 = r3.A1G
            r21 = 0
            int r0 = r8.A0u
            r4 = r32
            android.content.Context r9 = r4.getContext()
            r5 = 0
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x002a
            r4.setTextSize(r6)
        L_0x002a:
            java.lang.CharSequence r5 = X.AnonymousClass1EG.A02(r35)
            java.lang.String r15 = r5.toString()
            android.text.SpannableStringBuilder r7 = X.AnonymousClass3MW.A09(r15)
            android.text.TextPaint r23 = r4.getPaint()
            r27 = 1067869798(0x3fa66666, float:1.3)
            X.1KW r5 = r2.A02
            r22 = r9
            r24 = r1
            r25 = r5
            r26 = r7
            X.C43251zV.A00(r22, r23, r24, r25, r26, r27)
            if (r39 == 0) goto L_0x020d
            int r10 = r1.A03
            if (r10 == 0) goto L_0x020d
            r25 = r36
            if (r36 <= 0) goto L_0x020d
            r1 = 0
            r5 = 78
            if (r0 != r5) goto L_0x0190
            X.4U6 r0 = new X.4U6
            r0.<init>(r7, r1, r1)
        L_0x005e:
            if (r9 == 0) goto L_0x008f
            if (r13 == 0) goto L_0x008f
            X.205 r1 = r8.A0v
            X.1BI r5 = r1.A00
            java.util.List r1 = r8.A0h
            X.0ve r11 = r2.A03
            if (r11 == 0) goto L_0x018c
            X.0vf r10 = X.C18040vf.A01
            r6 = 11924(0x2e94, float:1.6709E-41)
            boolean r30 = X.C18020vd.A05(r10, r11, r6)
        L_0x0074:
            r28 = 1
            r10 = 2130970499(0x7f040783, float:1.754971E38)
            r6 = 2131101293(0x7f06066d, float:1.7814992E38)
            int r27 = X.AnonymousClass1YL.A00(r9, r10, r6)
            r29 = 0
            r24 = r7
            r25 = r5
            r26 = r1
            r22 = r13
            r23 = r9
            r22.A05(r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x008f:
            X.2ch r5 = r2.A04
            r1 = 2
            X.C18070vi.A0d(r15, r1)
            X.0ve r6 = r5.A00
            r5 = 12655(0x316f, float:1.7733E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r6, r5)
            if (r1 == 0) goto L_0x024d
            java.lang.Class<X.4pa> r1 = X.C97504pa.class
            X.25F r1 = X.C18070vi.A09(r8, r1)
            X.229 r1 = r1.A02
            X.4pa r1 = (X.C97504pa) r1
            if (r1 == 0) goto L_0x024d
            int r20 = r7.length()
            java.util.List r1 = r1.A00
            java.util.Iterator r19 = r1.iterator()
            r18 = 0
        L_0x00b9:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x024d
            java.lang.Object r1 = r19.next()
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            int r13 = X.AnonymousClass3MZ.A04(r1)
            java.lang.Object r1 = r1.second
            int r12 = X.AnonymousClass000.A0M(r1)
            r1 = r20
            if (r13 >= r1) goto L_0x024d
            int r1 = r15.length()
            if (r12 > r1) goto L_0x024d
            java.lang.CharSequence r1 = r15.subSequence(r13, r12)
            java.lang.String r6 = r1.toString()
            r17 = r6
            r14 = 0
            X.C18070vi.A0d(r6, r14)
            java.lang.String r11 = X.C32011gU.A00(r6)
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x014a }
            r1.<init>(r11)     // Catch:{ Exception -> 0x014a }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x014a }
            X.C18070vi.A0b(r1)     // Catch:{ Exception -> 0x014a }
            int r1 = X.AnonymousClass1YF.A0F(r6, r1, r14, r14)     // Catch:{ Exception -> 0x014a }
            int r5 = r6.length()     // Catch:{ Exception -> 0x014a }
            java.lang.CharSequence r5 = r6.subSequence(r1, r5)     // Catch:{ Exception -> 0x014a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x014a }
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r5)     // Catch:{ Exception -> 0x014a }
            int r16 = X.AnonymousClass3MZ.A04(r1)     // Catch:{ Exception -> 0x014a }
            java.lang.Object r10 = r1.second     // Catch:{ Exception -> 0x014a }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x014a }
            int r5 = r10.length()     // Catch:{ Exception -> 0x014a }
            r1 = 10
            if (r5 <= r1) goto L_0x014a
            int r5 = r5 + -5
            int r1 = r10.length()     // Catch:{ Exception -> 0x014a }
            java.lang.CharSequence r1 = r10.subSequence(r5, r1)     // Catch:{ Exception -> 0x014a }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x014a }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x014a }
            r1 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r10 = X.C17890vO.A0Z(r10, r5, r1)     // Catch:{ Exception -> 0x014a }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x014a }
            r1 = r16
            java.lang.String r1 = r6.substring(r14, r1)     // Catch:{ Exception -> 0x014a }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x014a }
            r5.append(r1)     // Catch:{ Exception -> 0x014a }
            r5.append(r10)     // Catch:{ Exception -> 0x014a }
            java.lang.String r17 = r5.toString()     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            r1 = r17
            X.1D6 r1 = X.AnonymousClass1D6.A01(r11, r1)
            java.lang.Object r14 = r1.first
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r11 = r1.second
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r12 + r18
            int r10 = r11.length()
            int r6 = r6.length()
            if (r10 >= r6) goto L_0x0171
            int r5 = r13 + r18
            int r1 = r7.length()
            int r1 = java.lang.Math.min(r12, r1)
            r7.replace(r5, r1, r11)
        L_0x0171:
            int r13 = r13 + r18
            int r5 = r10 + r13
            X.4So r11 = new X.4So
            r11.<init>(r14)
            int r1 = r7.length()
            int r5 = java.lang.Math.min(r5, r1)
            r1 = 33
            r7.setSpan(r11, r13, r5, r1)
            int r10 = r10 - r6
            int r18 = r18 + r10
            goto L_0x00b9
        L_0x018c:
            r30 = 0
            goto L_0x0074
        L_0x0190:
            android.text.TextPaint r24 = r4.getPaint()
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r27 = r4.getLineSpacingMultiplier()
            float r28 = r4.getLineSpacingExtra()
            boolean r29 = r4.getIncludeFontPadding()
            android.text.StaticLayout r22 = new android.text.StaticLayout
            r23 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            int r0 = r22.getLineCount()
            if (r0 > r10) goto L_0x01b5
            int r5 = r15.length()
            goto L_0x023b
        L_0x01b5:
            int r6 = r15.length()
            r5 = 0
            r0 = 0
        L_0x01bb:
            if (r0 > r6) goto L_0x01f0
            int r5 = r6 + r0
            int r5 = r5 / 2
            java.lang.String r11 = r15.substring(r1, r5)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A11(r11)
            java.lang.String r11 = "... "
            java.lang.String r23 = X.AnonymousClass000.A0y(r11, r12)
            android.text.TextPaint r24 = r4.getPaint()
            float r27 = r4.getLineSpacingMultiplier()
            float r28 = r4.getLineSpacingExtra()
            boolean r29 = r4.getIncludeFontPadding()
            android.text.StaticLayout r22 = new android.text.StaticLayout
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            int r11 = r22.getLineCount()
            if (r11 > r10) goto L_0x01ed
            int r0 = r5 + 1
            goto L_0x01bb
        L_0x01ed:
            int r6 = r5 + -1
            goto L_0x01bb
        L_0x01f0:
            int r0 = r5 + -2
            int r1 = java.lang.Math.max(r1, r0)
            int r0 = r7.length()
            r7.delete(r1, r0)
            int r5 = r7.length()
            r0 = 4
            int r5 = r5 - r0
            r4.getContext()
            java.lang.String r0 = "... "
            r7.append(r0)
            r1 = 1
            goto L_0x023b
        L_0x020d:
            int r5 = r1.A04
            r10 = 0
            if (r5 <= 0) goto L_0x0242
            int r1 = r7.length()
            if (r5 >= r1) goto L_0x0242
            r1 = 78
            if (r0 == r1) goto L_0x0242
            int r0 = r5 + -1
            int r0 = r15.codePointAt(r0)
            int r6 = java.lang.Character.charCount(r0)
            int r6 = r6 + r5
            r1 = 1
            int r6 = r6 - r1
            int r0 = r7.length()
            if (r6 == r0) goto L_0x0242
            int r0 = r7.length()
            r7.delete(r6, r0)
            java.lang.String r0 = "... "
            r7.append(r0)
        L_0x023b:
            X.4U6 r0 = new X.4U6
            r0.<init>(r7, r5, r1)
            goto L_0x005e
        L_0x0242:
            X.4U6 r0 = new X.4U6
            r0.<init>(r7, r5, r10)
            goto L_0x005e
        L_0x0249:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0008
        L_0x024d:
            if (r37 == 0) goto L_0x02e6
            if (r9 == 0) goto L_0x02e6
            r5 = 2130970892(0x7f04090c, float:1.7550507E38)
            r1 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r10 = X.AnonymousClass3Ma.A00(r9, r5, r1)
            r5 = 2130970132(0x7f040614, float:1.7548965E38)
            r1 = 2131101250(0x7f060642, float:1.7814904E38)
            int r11 = X.AnonymousClass3Ma.A00(r9, r5, r1)
            boolean r13 = X.C87494Vu.A00(r8)
            r15 = 1
            if (r13 == 0) goto L_0x0282
            X.0ve r6 = r2.A03
            X.0vf r5 = X.C18040vf.A01
            r1 = 12539(0x30fb, float:1.7571E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            if (r1 == 0) goto L_0x0282
            r1 = 11843(0x2e43, float:1.6596E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            r17 = 1
            if (r1 != 0) goto L_0x0286
        L_0x0282:
            r17 = 0
            if (r13 == 0) goto L_0x029b
        L_0x0286:
            X.0ve r6 = r2.A03
            X.0vf r5 = X.C18040vf.A01
            r1 = 12539(0x30fb, float:1.7571E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            if (r1 == 0) goto L_0x029b
            r1 = 10986(0x2aea, float:1.5395E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            r14 = 1
            if (r1 != 0) goto L_0x029e
        L_0x029b:
            r14 = 0
            if (r13 == 0) goto L_0x03af
        L_0x029e:
            X.0ve r6 = r2.A03
            X.0vf r5 = X.C18040vf.A01
            r1 = 12539(0x30fb, float:1.7571E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            if (r1 == 0) goto L_0x03af
            r1 = 10886(0x2a86, float:1.5255E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            if (r1 == 0) goto L_0x03af
        L_0x02b2:
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r4)
            if (r1 == 0) goto L_0x03a4
            android.content.res.Resources r5 = X.AnonymousClass000.A0Y(r4)
            r1 = 2131169446(0x7f0710a6, float:1.7953222E38)
            int r12 = r5.getDimensionPixelSize(r1)
            r16 = 0
            X.CmK r9 = new X.CmK
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x02ca:
            X.11C r6 = r2.A00
            X.0vc r5 = r2.A05
            android.text.TextPaint r12 = r4.getPaint()
            android.content.Context r10 = r4.getContext()
            X.0ve r1 = r2.A03
            int r16 = X.C26302CxJ.A00(r6, r5)
            android.text.SpannableStringBuilder r11 = android.text.SpannableStringBuilder.valueOf(r7)
            r13 = r1
            r14 = r9
            r15 = r7
            X.C26302CxJ.A05(r10, r11, r12, r13, r14, r15, r16)
        L_0x02e6:
            X.1t1 r1 = r4.A01
            if (r1 == 0) goto L_0x02f1
            int r2 = r1.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1
            if (r2 != r1) goto L_0x02f2
        L_0x02f1:
            r10 = 0
        L_0x02f2:
            X.5cR r2 = r3.A0k
            if (r2 == 0) goto L_0x03a1
            java.lang.Class<X.4RR> r1 = X.AnonymousClass4RR.class
            java.lang.Object r7 = r2.BPO(r1)
            X.4RR r7 = (X.AnonymousClass4RR) r7
        L_0x02fe:
            android.text.SpannableStringBuilder r6 = r0.A01
            android.text.SpannableStringBuilder r1 = X.AnonymousClass3MW.A09(r6)
            r3.A2q = r1
            boolean r2 = r0.A02
            if (r2 == 0) goto L_0x030d
            A0U(r1, r3)
        L_0x030d:
            android.text.SpannableStringBuilder r9 = r3.A2q
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L_0x0335
            r5 = 0
            if (r2 == 0) goto L_0x0398
            X.1t1 r1 = r4.A01
            if (r1 != 0) goto L_0x0398
            X.0ve r2 = r3.A0F
            X.11C r1 = r3.A0C
            X.AnonymousClass1Y5.A0C(r4, r1, r2)
            r4.setFocusable(r5)
            r4.setClickable(r5)
            r4.setLongClickable(r5)
        L_0x032c:
            java.lang.CharSequence r2 = r3.A1p(r9)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r2, r1)
        L_0x0335:
            if (r7 == 0) goto L_0x036b
            boolean r1 = X.C87494Vu.A00(r8)
            if (r1 == 0) goto L_0x034d
            X.36h r1 = X.AnonymousClass2UW.A00(r8)
            if (r1 == 0) goto L_0x036b
            X.2Qn r2 = X.C49452Qn.LAST
            X.2Qn r1 = r1.A01
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x036b
        L_0x034d:
            X.00H r1 = r3.A1r
            java.lang.Object r1 = r1.get()
            X.2td r1 = (X.C63752td) r1
            boolean r1 = r1.A04(r8)
            if (r1 == 0) goto L_0x036b
            X.4kf r1 = new X.4kf
            r15 = r33
            r11 = r1
            r12 = r4
            r13 = r3
            r14 = r0
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r7.A00(r4, r1, r8, r6)
        L_0x036b:
            if (r10 == 0) goto L_0x0374
            r1 = 64
            r0 = r21
            r3.performAccessibilityAction(r1, r0)
        L_0x0374:
            X.205 r0 = r8.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x03b2
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r8.A11(r0)
            if (r0 == 0) goto L_0x03b2
            X.0zA r1 = r3.A0L
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x03b2
            r1.A03()
            r3.getContext()
            java.lang.String r0 = "premiumMessageInflatePlaceHolders"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0398:
            r4.setFocusable(r5)
            r1 = r21
            r4.setAccessibilityHelper(r1)
            goto L_0x032c
        L_0x03a1:
            r7 = 0
            goto L_0x02fe
        L_0x03a4:
            r12 = 0
            X.CmK r9 = new X.CmK
            r16 = r12
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02ca
        L_0x03af:
            r15 = 0
            goto L_0x02b2
        L_0x03b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uP.A2F(com.whatsapp.TextEmojiLabel, X.4Cr, X.206, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public void setMessageText(String str, TextEmojiLabel textEmojiLabel, AnonymousClass206 r12) {
        A2F(textEmojiLabel, (C82924Cr) null, r12, str, 0, true, true, false);
    }
}
