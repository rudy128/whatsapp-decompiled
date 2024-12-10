package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.contact.FacepileView;
import com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillActionButton$3;
import com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillCoverImage$2;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3ty  reason: invalid class name and case insensitive filesystem */
public final class C78943ty extends AnonymousClass3sK {
    public AnonymousClass1VW A00;
    public C86304Rc A01;
    public C32981i4 A02;
    public C57242il A03;
    public AnonymousClass1PU A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public C18600wl A09;
    public C18600wl A0A;
    public final LinearLayout A0B = ((LinearLayout) C18070vi.A05(this, 2131430545));
    public final LinearLayout A0C = ((LinearLayout) C18070vi.A05(this, 2131434639));
    public final TextEmojiLabel A0D = C72453Mb.A0c(this, 2131430612);
    public final WaImageView A0E = ((WaImageView) C18070vi.A05(this, 2131430547));
    public final WaImageView A0F = ((WaImageView) C18070vi.A05(this, 2131430583));
    public final WaTextView A0G = AnonymousClass3Ma.A0N(this, 2131430548);
    public final WaTextView A0H = AnonymousClass3Ma.A0N(this, 2131430569);
    public final WaTextView A0I = AnonymousClass3Ma.A0N(this, 2131434638);
    public final FacepileView A0J = ((FacepileView) C18070vi.A05(this, 2131434637));
    public final C37451pZ A0K;
    public final C38471rL A0L;
    public final C28931bI A0M = C28931bI.A00(this, 2131429697);
    public final C28931bI A0N = C28931bI.A00(this, 2131430555);
    public final C28931bI A0O = C28931bI.A00(this, 2131430603);
    public final AnonymousClass1OX A0P = AnonymousClass1OW.A02(getIoDispatcher());
    public final AnonymousClass3L6 A0Q = new C96294nc(this, 9);
    public final C28931bI A0R = C28931bI.A00(this, 2131431779);
    public final C18100vl A0S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78943ty(Context context, C37451pZ r5, C108875cR r6, C445823z r7) {
        super(context, r6, r7);
        C18070vi.A0d(context, 1);
        C18070vi.A0f(r7, 2, r5);
        A1M();
        this.A0K = r5;
        this.A0S = AnonymousClass1DF.A01(new AnonymousClass5NF(context, this));
        this.A0L = new C825048f(this, 2);
        A01(this);
    }

    public static final void A02(C78943ty r11, C445823z r12) {
        C49552Qx r9;
        C445823z r8 = r12;
        Integer num = r12.A02;
        Integer num2 = AnonymousClass00R.A00;
        boolean A1Z = AnonymousClass000.A1Z(num, num2);
        if (!A1Z) {
            r11.A0R.A07(new C98214ql(r11, r12, 2));
        }
        C28931bI r1 = r11.A0R;
        int i = 8;
        if (!A1Z) {
            i = 0;
        }
        r1.A04(i);
        if (r12.A08 || r12.A02 != num2) {
            r11.A0E.setVisibility(8);
        } else if (((C88124Yk) r11.getEventUtils().get()).A02(r12)) {
            r11.A0E.setVisibility(8);
            if (AnonymousClass11P.A01(((C88124Yk) r11.getEventUtils().get()).A01) < r12.A00 + TimeUnit.DAYS.toMillis(1)) {
                A00(new C825248h(r12, r11, 38), r11, r12.A0v.A02);
                return;
            }
        } else {
            boolean z = r12.A0v.A02;
            if (z) {
                r11.A0E.setVisibility(8);
                if (C18020vd.A05(C18040vf.A01, r11.A0F, 7357)) {
                    A00(new C825248h(r12, r11, 39), r11, z);
                } else {
                    r11.A0B.setOnClickListener((View.OnClickListener) null);
                }
            } else {
                boolean A042 = AnonymousClass3MW.A0d(r11.getEventMessageManager()).A04(r12);
                WaImageView waImageView = r11.A0E;
                if (A042) {
                    waImageView.setVisibility(8);
                    A00((View.OnClickListener) null, r11, z);
                } else {
                    waImageView.setVisibility(0);
                    AnonymousClass24H A012 = AnonymousClass3MW.A0d(r11.getEventMessageManager()).A01(r12);
                    if (A012 == null || (r9 = A012.A02) == null) {
                        r9 = C49552Qx.UNKNOWN;
                    }
                    A00(new AnonymousClass48k(r8, r9, A012, r11, 2), r11, z);
                }
            }
            AnonymousClass1OX r4 = r11.A0P;
            C30451dy.A02(num2, AnonymousClass1OR.A00, new ConversationRowEvent$fillActionButton$3(r11, r8, (C30391dr) null), r4);
            return;
        }
        A00((View.OnClickListener) null, r11, r12.A0v.A02);
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setDeepLinkHelper(C32981i4 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setDoubleTapTrayUtils(C86304Rc r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setEventMessageManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setEventMessageUtils(C57242il r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setEventTimeUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setEventUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public void setFMessage(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        C17960vV.A0H(r4 instanceof C445823z, AnonymousClass001.A1E(r4, "Expected a message of type FMessageEvent but instead found ", AnonymousClass000.A10()));
        this.A0I = r4;
    }

    public final void setGroupChatUtils(AnonymousClass1PU r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setGroupDataObservers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    static {
        new Object();
    }

    public static final void A00(View.OnClickListener onClickListener, C78943ty r4, boolean z) {
        int i;
        LinearLayout linearLayout = r4.A0B;
        linearLayout.setOnClickListener(onClickListener);
        linearLayout.setEnabled(AnonymousClass000.A1W(onClickListener));
        WaTextView waTextView = r4.A0G;
        Context context = r4.getContext();
        if (onClickListener == null) {
            i = 2131100251;
            if (z) {
                i = 2131100260;
            }
        } else {
            i = 2131100252;
        }
        AnonymousClass3MX.A1C(context, waTextView, i);
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final C32981i4 getDeepLinkHelper() {
        C32981i4 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("deepLinkHelper");
        throw null;
    }

    public final C86304Rc getDoubleTapTrayUtils() {
        C86304Rc r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("doubleTapTrayUtils");
        throw null;
    }

    public final AnonymousClass00H getEventMessageManager() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventMessageManager");
        throw null;
    }

    public final C57242il getEventMessageUtils() {
        C57242il r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventMessageUtils");
        throw null;
    }

    public final AnonymousClass00H getEventTimeUtils() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventTimeUtils");
        throw null;
    }

    public final AnonymousClass00H getEventUtils() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventUtils");
        throw null;
    }

    public C445823z getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.event.fmessage.FMessageEvent");
        return (C445823z) r1;
    }

    public final AnonymousClass1PU getGroupChatUtils() {
        AnonymousClass1PU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatUtils");
        throw null;
    }

    public final AnonymousClass00H getGroupDataObservers() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupDataObservers");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1K();
        throw null;
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166688);
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1L();
        throw null;
    }

    public final View.OnTouchListener getViewOnTouchLister() {
        return (View.OnTouchListener) this.A0S.getValue();
    }

    public static final void A01(C78943ty r7) {
        C445823z fMessage = r7.getFMessage();
        C18030ve r2 = r7.getEventMessageUtils().A01;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 8783) || !C18020vd.A05(r1, r2, 8792)) {
            r7.A0M.A04(8);
        } else {
            if (fMessage.A0z(ZipDecompressor.UNZIP_BUFFER_SIZE)) {
                C28931bI r4 = r7.A0M;
                r7.A0S.A0J(new C98784ri((Object) AnonymousClass3MX.A0D(r4), 6));
                r4.A02().setVisibility(0);
            }
            AnonymousClass3MX.A1Q(new ConversationRowEvent$fillCoverImage$2(r7, fMessage, (C30391dr) null), AnonymousClass1OW.A02(r7.getIoDispatcher()));
        }
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(r7.A1p(AnonymousClass1EG.A0F(fMessage.A06, 150)));
        Context context = r7.getContext();
        TextEmojiLabel textEmojiLabel = r7.A0D;
        C43251zV.A03(context, textEmojiLabel.getPaint(), r7.A15, A092);
        textEmojiLabel.setText(A092);
        WaTextView waTextView = r7.A0H;
        long j = fMessage.A00;
        waTextView.setText(((AnonymousClass4S4) C18070vi.A0E(r7.getEventTimeUtils())).A01(AnonymousClass00R.A01, fMessage.A03, j));
        String A022 = AnonymousClass3MW.A0d(r7.getEventMessageManager()).A02(fMessage);
        if (A022 == null || A022.length() == 0) {
            r7.A0O.A04(8);
        } else {
            SpannableStringBuilder A093 = AnonymousClass3MW.A09(A022);
            Context context2 = r7.getContext();
            C28931bI r22 = r7.A0O;
            C43251zV.A03(context2, AnonymousClass3MX.A0M(r22).getPaint(), r7.A15, A093);
            AnonymousClass3MX.A0M(r22).setText(A093);
            r22.A04(0);
        }
        String str = fMessage.A05;
        if (str == null || str.length() == 0 || !r7.getDeepLinkHelper().A0I(fMessage.A05)) {
            r7.A0N.A04(8);
        } else {
            boolean A0L2 = r7.getDeepLinkHelper().A0L(fMessage.A05);
            C28931bI r23 = r7.A0N;
            TextView A0M2 = AnonymousClass3MX.A0M(r23);
            int i = 2131898570;
            if (A0L2) {
                i = 2131898569;
            }
            A0M2.setText(i);
            r23.A04(0);
        }
        if (r7.getDoubleTapTrayUtils().A01()) {
            r7.setOnTouchListener(r7.getViewOnTouchLister());
        } else {
            r7.setOnClickListener(r7.A0L);
        }
        A02(r7, fMessage);
        boolean A042 = AnonymousClass3MW.A0d(r7.getEventMessageManager()).A04(fMessage);
        WaImageView waImageView = r7.A0F;
        Context context3 = r7.getContext();
        Context context4 = r7.getContext();
        int i2 = 2130970098;
        int i3 = 2131101221;
        if (A042) {
            i2 = 2130970099;
            i3 = 2131101222;
        }
        C28081Yu.A00(ColorStateList.valueOf(C19740yt.A00(context3, AnonymousClass1YL.A01(context4, i2, i3, false))), waImageView);
        r7.A2L(fMessage);
        ((C88124Yk) r7.getEventUtils().get()).A00(fMessage, "ConversationRowEvent", new C105395Rv(r7));
    }

    public void A1u() {
        A01(this);
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A01(this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass3MW.A0e(getGroupDataObservers()).A00(this.A0Q);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass3MW.A0e(getGroupDataObservers()).A01(this.A0Q);
        C30551e8.A04(this.A0P.getCoroutineContext());
    }

    public int getCenteredLayoutId() {
        return 2131624822;
    }

    public int getIncomingLayoutId() {
        return 2131624822;
    }

    public int getOutgoingLayoutId() {
        return 2131624823;
    }
}
