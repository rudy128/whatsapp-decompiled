package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3uG  reason: invalid class name and case insensitive filesystem */
public class C79043uG extends C78663tJ {
    public AnonymousClass2ZN A00;
    public A1M A01;
    public AnonymousClass00H A02;
    public int A03;
    public boolean A04;
    public final ConversationRowImage$RowImageView A05;
    public final View A06;
    public final ViewGroup A07;
    public final LinearLayout A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextAndDateLayout A0B;
    public final AnonymousClass3M2 A0C = new C98114qb(this, 6);
    public final C28931bI A0D;
    public final C28931bI A0E;
    public final C28931bI A0F;
    public final C28931bI A0G;

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A04(false);
    }

    private void A04(boolean z) {
        int A002;
        AnonymousClass22Q r2 = (AnonymousClass22Q) ((AnonymousClass21V) this.A0I);
        C62572rc A003 = AnonymousClass206.A00(r2);
        if (z) {
            this.A09.setTag(Collections.singletonList(r2));
        }
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A05;
        conversationRowImage$RowImageView.setImageBitmap((Bitmap) null);
        conversationRowImage$RowImageView.setImageData(new C62572rc(A003));
        conversationRowImage$RowImageView.setInAlbum(false);
        conversationRowImage$RowImageView.setFullWidth(C79103uS.A1H(this));
        conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        if (AnonymousClass25A.A11(getFMessage())) {
            View view = this.A06;
            view.setVisibility(0);
            C28931bI r10 = this.A0G;
            C28931bI r11 = this.A0D;
            TextView textView = this.A09;
            AnonymousClass3uL.A0P(view, textView, r10, r11, true, !z);
            AnonymousClass3MY.A0w(getContext(), conversationRowImage$RowImageView, 2131891256);
            if (r2.A0v.A02) {
                conversationRowImage$RowImageView.setOnClickListener(this.A0F);
            } else {
                conversationRowImage$RowImageView.setOnClickListener((View.OnClickListener) null);
            }
            C38471rL r7 = this.A0C;
            textView.setOnClickListener(r7);
            r10.A05(r7);
        } else {
            boolean A1L = C79103uS.A1L(this);
            View view2 = this.A06;
            if (A1L) {
                view2.setVisibility(8);
                C28931bI r8 = this.A0G;
                C28931bI r72 = this.A0D;
                TextView textView2 = this.A09;
                AnonymousClass3uL.A0P(view2, textView2, r8, r72, false, false);
                AnonymousClass3MY.A0w(getContext(), conversationRowImage$RowImageView, 2131897960);
                C38471rL r73 = this.A0F;
                textView2.setOnClickListener(r73);
                conversationRowImage$RowImageView.setOnClickListener(r73);
            } else {
                view2.setVisibility(0);
                C28931bI r82 = this.A0G;
                C28931bI r74 = this.A0D;
                TextView textView3 = this.A09;
                TextView textView4 = textView3;
                AnonymousClass3uL.A0P(view2, textView4, r82, r74, false, !z);
                conversationRowImage$RowImageView.setContentDescription((CharSequence) null);
                if (!AnonymousClass4H3.A00(getFMessage())) {
                    textView3.setText(2131895332);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(2131232382, 0, 0, 0);
                    textView3.setOnClickListener(this.A0E);
                    conversationRowImage$RowImageView.setOnClickListener(this.A0F);
                } else {
                    A2E(textView4, (Integer) null, Collections.singletonList(r2), r2.A01);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(2131231868, 0, 0, 0);
                    C38471rL r75 = this.A0D;
                    textView3.setOnClickListener(r75);
                    conversationRowImage$RowImageView.setOnClickListener(r75);
                }
            }
        }
        A1y();
        AnonymousClass3uP.A0W(conversationRowImage$RowImageView, this);
        SpannableString A012 = this.A01.A01(r2);
        String str = r2.A0A;
        String str2 = r2.A02;
        String str3 = r2.A05;
        Resources A0Y = AnonymousClass000.A0Y(this);
        A2k();
        this.A0B.setTextSize(this.A0n.A02(AnonymousClass3Ma.A06(this), getResources(), -1));
        this.A0B.A0L();
        this.A0B.setTextColor(getSecondaryTextColor());
        this.A0B.setVisibility(8);
        TextAndDateLayout textAndDateLayout = this.A0B;
        textAndDateLayout.setMaxTextLineCount(2);
        textAndDateLayout.invalidate();
        boolean isEmpty = TextUtils.isEmpty(str);
        C28931bI r112 = this.A0F;
        if (!isEmpty) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0I(r112, 0);
            textEmojiLabel.setTextSize(getTextFontSize());
            textEmojiLabel.setAutoLinkMask(0);
            textEmojiLabel.setLinksClickable(false);
            textEmojiLabel.setFocusable(false);
            textEmojiLabel.setLongClickable(false);
            setMessageText(str, textEmojiLabel, r2);
        } else {
            r112.A04(8);
        }
        boolean z2 = r2.A0v.A02;
        if (z2 || A3I.A01(r2)) {
            this.A0E.A04(8);
            this.A07.setVisibility(0);
        } else if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            View A0I = AnonymousClass3MY.A0I(this.A0E, 0);
            TextEmojiLabel A0V = AnonymousClass3MX.A0V(A0I, 2131434099);
            TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(A0I, 2131434113);
            AnonymousClass1HF.A06(A0I, 2131434104);
            if (!TextUtils.isEmpty(str2)) {
                setMessageText(str2, A0V, r2);
                A0V.setVisibility(0);
            } else {
                A0V.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str3)) {
                A2G(A0V2, r2, str3, true);
                A0V2.setVisibility(0);
            } else {
                A0V2.setVisibility(8);
            }
            this.A07.setVisibility(8);
        } else {
            this.A0E.A04(8);
        }
        A2K(r2);
        if (!TextUtils.isEmpty(A012) || this.A03 > 0) {
            this.A0B.setMinLines(this.A03);
            this.A0B.A0Q(C43351zf.A00, A012, getHighlightTerms(), 300, false);
            this.A0B.setVisibility(0);
        } else if (!TextUtils.isEmpty(str)) {
            r112.A04(8);
            textAndDateLayout.setMaxTextLineCount(1);
            this.A0B.setVisibility(0);
            this.A0B.A0S(str, (List) null, 150, false);
            this.A0B.setTextSize(getTextFontSize());
            this.A0B.A0J();
            TextEmojiLabel textEmojiLabel2 = this.A0B;
            textEmojiLabel2.setTextColor(AnonymousClass3Ma.A01(textEmojiLabel2.getContext(), A0Y, 2130968978, 2131100037));
        }
        conversationRowImage$RowImageView.setOutgoing(z2);
        conversationRowImage$RowImageView.A0E = false;
        int i = A003.A08;
        if (i == 0 || (A002 = A003.A06) == 0) {
            i = 100;
            A002 = C32021gV.A00(r2, 100);
            if (A002 <= 0) {
                i = (int) (C72463Mc.A00(getContext()) * 83.333336f);
                A002 = (i * 9) / 16;
            }
        }
        conversationRowImage$RowImageView.A04(i, A002);
        AnonymousClass3MW.A1R(conversationRowImage$RowImageView);
        if (!z && this.A04) {
            this.A1S.A0J(r2, AnonymousClass00R.A00);
        }
        this.A04 = false;
        this.A1S.A0D(conversationRowImage$RowImageView, r2, this.A0C);
        ((AnonymousClass4N7) this.A02.get()).A00.A0N(3544);
        ((AnonymousClass4N7) this.A02.get()).A00.A0N(3545);
        A2N(r2);
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public void A1v() {
        AnonymousClass206 r3 = this.A0I;
        this.A04 = true;
        this.A1S.A0J(r3, AnonymousClass00R.A00);
        this.A1S.A0D(this.A05, r3, this.A0C);
    }

    public void A1y() {
        C28931bI r2 = this.A0G;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        A2j(r2, C88564a8.A01(r0, (AnonymousClass21V) this.A0I, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0.exists() == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A20() {
        /*
            r7 = this;
            X.17x r0 = r7.A03
            if (r0 == 0) goto L_0x0011
            android.content.Context r1 = r7.getContext()
            X.17x r0 = r7.A03
            boolean r0 = X.AnonymousClass74O.A0O(r1, r0)
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            X.206 r6 = r7.A0I
            X.21V r6 = (X.AnonymousClass21V) r6
            X.22Q r6 = (X.AnonymousClass22Q) r6
            X.2rc r5 = X.AnonymousClass206.A00(r6)
            X.205 r0 = r6.A0v
            boolean r4 = r0.A02
            if (r4 != 0) goto L_0x0026
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            java.io.File r0 = r5.A0G
            r3 = 0
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.exists()
            r2 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "viewmessage/ from_me:"
            X.C79103uS.A1F(r5, r6, r0, r1, r4)
            if (r2 != 0) goto L_0x004a
            boolean r0 = r7.A2p()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "viewmessage/ no file to download from receiver side"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x004a:
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r7.A05
            r7.A2A(r0, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79043uG.A20():void");
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A04(A1Z);
        }
    }

    public int getBroadcastDrawableId() {
        if (AnonymousClass3MZ.A1b((AnonymousClass21V) this.A0I)) {
            return 2131231130;
        }
        return 2131231129;
    }

    public TextView getDateView() {
        AnonymousClass22Q r1 = (AnonymousClass22Q) ((AnonymousClass21V) this.A0I);
        if ((TextUtils.isEmpty(r1.A02) && TextUtils.isEmpty(r1.A05)) || r1.A0v.A02 || A3I.A01(r1)) {
            return this.A0A;
        }
        C28931bI r0 = this.A0E;
        if (r0 != null) {
            return AnonymousClass3MW.A0J(r0.A02(), 2131429789);
        }
        return null;
    }

    public ViewGroup getDateWrapper() {
        AnonymousClass22Q r1 = (AnonymousClass22Q) ((AnonymousClass21V) this.A0I);
        if ((TextUtils.isEmpty(r1.A02) && TextUtils.isEmpty(r1.A05)) || r1.A0v.A02 || A3I.A01(r1)) {
            return this.A07;
        }
        C28931bI r0 = this.A0E;
        if (r0 != null) {
            return AnonymousClass3MW.A0C(r0.A02(), 2131429812);
        }
        return null;
    }

    public AnonymousClass22Q getFMessage() {
        return (AnonymousClass22Q) ((AnonymousClass21V) this.A0I);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass22Q);
        super.setFMessage(r2);
    }

    public C79043uG(Context context, C108875cR r6, AnonymousClass22Q r7, int i) {
        super(context, r6, r7);
        A1M();
        this.A03 = i;
        this.A09 = AnonymousClass3MW.A0J(this, 2131429541);
        this.A05 = (ConversationRowImage$RowImageView) AnonymousClass1HF.A06(this, 2131431526);
        C28931bI A002 = C28931bI.A00(this, 2131434181);
        this.A0G = A002;
        C98244qo.A00(A002, 8);
        this.A0D = C28931bI.A00(this, 2131428820);
        this.A06 = AnonymousClass1HF.A06(this, 2131429544);
        this.A0B = (TextAndDateLayout) AnonymousClass1HF.A06(this, 2131436057);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(this, 2131436812);
        this.A0F = C28931bI.A00(this, 2131434128);
        this.A0E = C28931bI.A00(this, 2131434106);
        this.A07 = AnonymousClass3MW.A0C(this, 2131429812);
        this.A0A = AnonymousClass3MW.A0J(this, 2131429789);
        LinearLayout A0K = AnonymousClass3MX.A0K(this, 2131434124);
        this.A08 = A0K;
        if (A0W != null) {
            A0W.A0R(getContext().getString(2131897960));
        }
        AnonymousClass3uP.A0W(A0K, this);
        C89904dD.A00(A0K, this, 47);
        A04(true);
    }

    public boolean A1V() {
        if (!C79103uS.A1L(this) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A05;
        boolean isPressed = isPressed();
        if (conversationRowImage$RowImageView.A0I != isPressed) {
            conversationRowImage$RowImageView.A0I = isPressed;
            ConversationRowImage$RowImageView.A01(conversationRowImage$RowImageView);
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getMainChildMaxWidth() {
        if (C79103uS.A1H(this)) {
            return 0;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166243);
        int i = 72;
        if (this.A0V) {
            i = 100;
        }
        return Math.min(dimensionPixelSize, C88264Yz.A01(getContext(), i));
    }

    public int getCenteredLayoutId() {
        return 2131624907;
    }

    public int getIncomingLayoutId() {
        return 2131624907;
    }

    public int getOutgoingLayoutId() {
        return 2131624908;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
