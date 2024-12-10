package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.util.Log;

/* renamed from: X.6BF  reason: invalid class name */
public final class AnonymousClass6BF extends AnonymousClass6GE implements AnonymousClass009 {
    public C84664Kj A00;
    public AnonymousClass4Q6 A01;
    public AnonymousClass11P A02;
    public C18000vb A03;
    public C18030ve A04;
    public C32011gU A05;
    public AnonymousClass87j A06;
    public AnonymousClass1PP A07;
    public C36401np A08;
    public C32021gV A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass031 A0D;
    public boolean A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final ViewGroup A0I;
    public final FrameLayout A0J;
    public final FrameLayout A0K;
    public final ImageView A0L;
    public final LinearLayout A0M;
    public final TextView A0N;
    public final TextView A0O;
    public final TextView A0P;
    public final TextView A0Q;
    public final TextView A0R;
    public final TextView A0S;
    public final CardView A0T;
    public final TextEmojiLabel A0U;
    public final TextEmojiLabel A0V;
    public final C42141xh A0W;
    public final ThumbnailButton A0X;
    public final C28931bI A0Y;
    public final C18100vl A0Z;
    public final ConstraintLayout A0a;
    public final WallPaperView A0b;
    public final C18100vl A0c;
    public final C18100vl A0d;

    public AnonymousClass6BF(Context context) {
        super(context);
        if (!this.A0E) {
            this.A0E = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r3.A10;
            this.A03 = AnonymousClass3Ma.A0d(r1);
            this.A01 = AnonymousClass3MZ.A0e(r1);
            AnonymousClass10G r2 = r1.A00;
            this.A05 = C000200d.A00(r2.A3O);
            this.A04 = AnonymousClass3Ma.A0r(r1);
            this.A02 = AnonymousClass3Ma.A0a(r1);
            this.A00 = AnonymousClass3MZ.A0T(r2);
            this.A04 = AnonymousClass10E.A8r(r1);
            AnonymousClass1K1 r4 = r3.A0z;
            this.A00 = (C84664Kj) r4.A0n.get();
            this.A01 = C27691Xc.A0L(r3);
            this.A0A = C000200d.A00(r1.AN9);
            this.A07 = (AnonymousClass1PP) r1.A3y.get();
            this.A08 = AnonymousClass3MY.A0e(r2);
            this.A05 = AnonymousClass3MY.A0d(r1);
            this.A0B = C000200d.A00(r4.A4j);
            this.A09 = C108955ca.A0b(r1);
            this.A06 = (AnonymousClass87j) r3.A09.get();
            this.A0C = C000200d.A00(r2.AGC);
            this.A02 = AnonymousClass10E.A6O(r1);
            this.A03 = AnonymousClass10E.A6Q(r1);
        }
        this.A0c = AnonymousClass1DF.A01(new C99134sK(context, this, 14));
        this.A0Z = AnonymousClass7S3.A00(context, 47);
        this.A0d = AnonymousClass7S3.A00(context, 48);
        View inflate = View.inflate(context, 2131626249, this);
        this.A0T = (CardView) inflate.findViewById(2131433085);
        this.A0a = (ConstraintLayout) inflate.findViewById(2131433086);
        this.A0L = AnonymousClass3MW.A0H(inflate, 2131433104);
        this.A0W = C42141xh.A01(this, getTextEmojiLabelViewControllerFactory(), 2131433103);
        this.A0N = C17880vN.A0E(inflate, 2131433099);
        WallPaperView wallPaperView = (WallPaperView) inflate.findViewById(2131433105);
        this.A0b = wallPaperView;
        View findViewById = findViewById(2131433096);
        this.A0F = findViewById;
        this.A0I = AnonymousClass3MW.A0D(findViewById, 2131433093);
        this.A0O = C17880vN.A0E(inflate, 2131433100);
        this.A0U = AnonymousClass3MX.A0W(inflate, 2131433101);
        this.A0Y = C72453Mb.A0s(findViewById, 2131433064);
        this.A0K = (FrameLayout) findViewById.findViewById(2131433073);
        this.A0G = AnonymousClass3MZ.A0D(this).inflate(2131626665, (ViewGroup) null, false);
        this.A0X = (ThumbnailButton) findViewById(2131433087);
        this.A0J = (FrameLayout) findViewById(2131433088);
        this.A0H = findViewById(2131433091);
        this.A0S = C17880vN.A0E(this, 2131433092);
        this.A0Q = C17880vN.A0E(this, 2131433089);
        this.A0R = C17880vN.A0E(this, 2131433090);
        this.A0V = AnonymousClass3MX.A0W(this, 2131433097);
        this.A0M = (LinearLayout) findViewById.findViewById(2131433094);
        this.A0P = C17880vN.A0E(findViewById, 2131433095);
        float radius = this.A0T.getRadius();
        Bitmap A002 = C88594aB.A00(context, getResources());
        wallPaperView.setRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, radius, radius, radius, radius});
        wallPaperView.setImageBitmap(A002);
    }

    public final void A05(AnonymousClass206 r18) {
        int charCount;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166858);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166856);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824);
        C108995ce.A0v(this, makeMeasureSpec, makeMeasureSpec2);
        TextEmojiLabel textEmojiLabel = this.A0V;
        CharSequence text = textEmojiLabel.getText();
        int length = text.length();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("... ");
        C18100vl r16 = this.A0Z;
        String A0y = AnonymousClass000.A0y(AnonymousClass3MW.A0y(r16), A10);
        AnonymousClass7S3 r5 = new AnonymousClass7S3((Object) this, 46);
        while (!A01(this.A0F)) {
            if (textEmojiLabel.getLineCount() <= 2 || length <= 2) {
                Log.e("Error measuring view");
                return;
            }
            length--;
            SpannableStringBuilder append = AnonymousClass3MW.A09(text.subSequence(0, length)).append(A0y);
            int i = r18.A0u;
            String obj = text.toString();
            Context context = getContext();
            if (length <= 0 || length >= append.length() || i == 78 || (charCount = (Character.charCount(obj.codePointAt(length - 1)) + length) - 1) == append.length()) {
                new AnonymousClass4U6(append, length, false);
            } else {
                append.delete(charCount, append.length());
                append.append("... ");
                if (context != null) {
                    SpannableStringBuilder A092 = AnonymousClass3MW.A09(context.getString(2131894929));
                    A092.setSpan(r5.invoke(), 0, A092.length(), 18);
                    append.append(A092);
                }
                new AnonymousClass4U6(append, length, true);
            }
            C22628BGo mediumTypefaceSpan = getMediumTypefaceSpan();
            int length2 = append.length() - AnonymousClass3MW.A0y(r16).length();
            if (length2 < 0) {
                length2 = 0;
            }
            append.setSpan(mediumTypefaceSpan, length2, append.length(), 33);
            textEmojiLabel.setText(append, TextView.BufferType.SPANNABLE);
            C108995ce.A0v(this, makeMeasureSpec, makeMeasureSpec2);
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setConversationBubbleResolverFactory(C84664Kj r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setConversationTopAttributeTextModelFactory(AnonymousClass4Q6 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setFMessageForwardingSubsystem(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setFMessageKeyFactory(AnonymousClass1PP r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setLinkifyWeb(C32011gU r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setMessageReplyHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setMessageThumbCache(C32021gV r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setPollSnapshotOptionViewHolderFactory(AnonymousClass87j r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setReplySubsystem(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    private final C22628BGo getMediumTypefaceSpan() {
        return (C22628BGo) this.A0d.getValue();
    }

    private final String getReadMoreString() {
        return AnonymousClass3MW.A0y(this.A0Z);
    }

    private final void setForwardedAttributionPadding(AnonymousClass206 r4) {
        if (r4.A11(1)) {
            int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168352);
            if (r4 instanceof AnonymousClass21V) {
                if (AnonymousClass9RY.A00(r4) != null) {
                    this.A0U.setPadding(0, 0, 0, dimensionPixelSize);
                    dimensionPixelSize = 0;
                }
                this.A0O.setPadding(0, 0, 0, dimensionPixelSize);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0D;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C108355bZ getBubbleResolver() {
        return (C108355bZ) this.A0c.getValue();
    }

    public final C84664Kj getConversationBubbleResolverFactory() {
        C84664Kj r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationBubbleResolverFactory");
        throw null;
    }

    public final AnonymousClass4Q6 getConversationTopAttributeTextModelFactory() {
        AnonymousClass4Q6 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationTopAttributeTextModelFactory");
        throw null;
    }

    public final AnonymousClass00H getFMessageForwardingSubsystem() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageForwardingSubsystem");
        throw null;
    }

    public final AnonymousClass1PP getFMessageKeyFactory() {
        AnonymousClass1PP r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageKeyFactory");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public final C32011gU getLinkifyWeb() {
        C32011gU r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifyWeb");
        throw null;
    }

    public final AnonymousClass00H getMessageReplyHelper() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageReplyHelper");
        throw null;
    }

    public final C32021gV getMessageThumbCache() {
        C32021gV r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageThumbCache");
        throw null;
    }

    public final AnonymousClass87j getPollSnapshotOptionViewHolderFactory() {
        AnonymousClass87j r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pollSnapshotOptionViewHolderFactory");
        throw null;
    }

    public final RectF getReadMoreRectF() {
        TextEmojiLabel textEmojiLabel = this.A0V;
        CharSequence text = textEmojiLabel.getText();
        C18070vi.A0X(text);
        C18100vl r7 = this.A0Z;
        int A0E2 = AnonymousClass1YF.A0E(text, AnonymousClass3MW.A0y(r7), text.length() - 1);
        if (A0E2 <= -1) {
            return null;
        }
        Layout layout = textEmojiLabel.getLayout();
        int lineForOffset = layout.getLineForOffset(A0E2);
        Rect A072 = AnonymousClass3MW.A07();
        layout.getLineBounds(lineForOffset, A072);
        RectF rectF = new RectF(A072);
        float paddingLeft = rectF.left + ((float) textEmojiLabel.getPaddingLeft()) + layout.getPrimaryHorizontal(A0E2);
        rectF.left = paddingLeft;
        rectF.right = paddingLeft + layout.getPaint().measureText(AnonymousClass3MW.A0y(r7));
        RectF A002 = AnonymousClass4aO.A00(textEmojiLabel);
        rectF.offset(A002.left, A002.top);
        return rectF;
    }

    public final AnonymousClass00H getReplySubsystem() {
        AnonymousClass00H r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("replySubsystem");
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final boolean A01(View view) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height = view.getHeight();
        ViewGroup.MarginLayoutParams A0L2 = C108995ce.A0L(view);
        if (A0L2 != null) {
            i = A0L2.topMargin;
        } else {
            i = 0;
        }
        int i3 = height + i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i2 = 0;
        } else {
            i2 = marginLayoutParams.bottomMargin;
        }
        if (i3 + i2 <= this.A0b.getHeight()) {
            return true;
        }
        return false;
    }

    public CardView getCardView() {
        return this.A0T;
    }

    public TextView getFollowersView() {
        return this.A0N;
    }

    public ThumbnailButton getMediaView() {
        return this.A0X;
    }

    public C42141xh getNameViewController() {
        return this.A0W;
    }

    public ImageView getThumbnailView() {
        return this.A0L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0288  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass1E7 r27, X.AnonymousClass206 r28, X.AnonymousClass7E7 r29, boolean r30) {
        /*
            r26 = this;
            r1 = 0
            r5 = r29
            X.C18070vi.A0d(r5, r1)
            r0 = r26
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131168052(0x7f070b34, float:1.7950395E38)
            int r10 = r3.getDimensionPixelSize(r2)
            float r9 = X.C108945cZ.A02(r10)
            android.content.Context r6 = X.AnonymousClass3MY.A04(r0)
            java.lang.String r8 = "NewsletterStatusView.bind"
            r7 = r27
            android.graphics.Bitmap r6 = r5.BX4(r6, r7, r8, r9, r10)
            r2 = r28
            android.graphics.Bitmap r4 = X.C110375fP.A00(r6, r2, r5)
            if (r30 == 0) goto L_0x0032
            android.graphics.drawable.GradientDrawable r3 = r0.A02(r4)
            r0.setBackground(r3)
        L_0x0032:
            android.widget.ImageView r5 = r0.A0L
            if (r6 != 0) goto L_0x004e
            X.1VW r3 = r0.getContactAvatars()
            int r15 = r3.A02(r7)
            X.1VW r11 = r0.getContactAvatars()
            android.content.Context r12 = X.AnonymousClass3MY.A04(r0)
            r13 = 0
            r14 = r9
            r16 = r10
            android.graphics.Bitmap r6 = r11.A04(r12, r13, r14, r15, r16)
        L_0x004e:
            r5.setImageBitmap(r6)
            X.1xh r5 = r0.A0W
            r3 = -1
            r5.A08(r7, r3)
            X.1CJ r3 = r0.getChatsCache()
            X.205 r8 = r2.A0v
            X.1BI r7 = r8.A00
            X.1ci r5 = r3.A0A(r7)
            boolean r3 = r5 instanceof X.C46162Dk
            if (r3 == 0) goto L_0x0324
            X.2Dk r5 = (X.C46162Dk) r5
            if (r5 == 0) goto L_0x0324
            long r5 = r5.A0G
            int r9 = (int) r5
        L_0x006e:
            X.00H r3 = r0.getNewsletterNumberFormatter()
            java.lang.Object r3 = r3.get()
            X.4XM r3 = (X.AnonymousClass4XM) r3
            int r11 = X.AnonymousClass4XM.A00(r3, r9)
            java.lang.String r10 = r3.A01(r11)
            r3 = 1
            X.C18070vi.A0d(r10, r3)
            android.widget.TextView r9 = r0.A0N
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131755282(0x7f100112, float:1.9141439E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r10
            X.AnonymousClass3MX.A1E(r6, r9, r3, r5, r11)
            boolean r9 = r2 instanceof X.AnonymousClass21V
            if (r9 == 0) goto L_0x0313
            r3 = r2
            X.21V r3 = (X.AnonymousClass21V) r3
            java.lang.String r18 = r3.A18()
        L_0x009f:
            r5 = 1
            boolean r3 = r2.A11(r5)
            if (r3 != 0) goto L_0x029d
            android.widget.TextView r3 = r0.A0O
            r5 = 8
            r3.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r3 = r0.A0U
            r3.setVisibility(r5)
        L_0x00b3:
            X.206 r3 = r2.A0K()
            if (r3 == 0) goto L_0x028f
            X.0ve r6 = r0.getAbProps()
            r5 = 7237(0x1c45, float:1.0141E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r6, r5)
            if (r3 == 0) goto L_0x028f
            android.view.View r11 = r0.A0G
            r3 = 2131434295(0x7f0b1b37, float:1.84904E38)
            android.view.View r12 = r11.findViewById(r3)
            X.206 r10 = r2.A0K()
            boolean r3 = r8.A02
            X.6sH r6 = new X.6sH
            r6.<init>(r7, r3, r1)
            if (r10 == 0) goto L_0x00f7
            X.00H r3 = r0.getReplySubsystem()
            java.lang.Object r5 = r3.get()
            X.6z1 r5 = (X.C139546z1) r5
            X.C18070vi.A0b(r12)
            X.00H r3 = r0.getMessageReplyHelper()
            java.lang.Object r3 = X.C18070vi.A0E(r3)
            X.724 r3 = (X.AnonymousClass724) r3
            r5.A01(r12, r3, r10, r6)
        L_0x00f7:
            android.widget.FrameLayout r3 = r0.A0K
            r3.addView(r11)
            r3.setVisibility(r1)
        L_0x00ff:
            r0.A03()
            if (r9 == 0) goto L_0x012b
            r3 = r2
            X.21V r3 = (X.AnonymousClass21V) r3
            if (r3 == 0) goto L_0x012b
            X.2rc r3 = r3.A02
            if (r3 == 0) goto L_0x012b
            int r5 = r3.A08
            int r3 = r3.A06
            r7 = 1065123391(0x3f7c7e3f, float:0.98630136)
            r6 = 1077936128(0x40400000, float:3.0)
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            float r6 = X.C28851b7.A02(r5, r7, r6)
            com.whatsapp.components.button.ThumbnailButton r3 = r0.A0X
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            float r3 = X.C108945cZ.A03(r3)
            float r3 = r3 / r6
            int r3 = (int) r3
            r5.height = r3
        L_0x012b:
            r10 = 8
            if (r4 == 0) goto L_0x0288
            X.5bZ r6 = r0.getBubbleResolver()
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            r3 = 2
            android.graphics.drawable.Drawable r6 = r6.BS0(r5, r3, r1)
            com.whatsapp.components.button.ThumbnailButton r5 = r0.A0X
            r5.setImageBitmap(r4)
            android.widget.FrameLayout r3 = r0.A0J
            r3.setForeground(r6)
        L_0x0144:
            boolean r3 = r2 instanceof X.AnonymousClass210
            if (r3 == 0) goto L_0x01a6
            r7 = r2
            X.210 r7 = (X.AnonymousClass210) r7
            java.lang.String r6 = r7.A07
            if (r6 == 0) goto L_0x0281
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.A01 = r3
            r4 = 1
            X.7BV r3 = new X.7BV
            r3.<init>(r0, r4)
            r5.A05 = r3
            r3 = 2
            X.7NE r4 = new X.7NE
            r4.<init>(r0, r3)
            X.1gV r3 = r0.getMessageThumbCache()
            r3.A0D(r5, r7, r4)
            android.view.View r3 = r0.A0H
            r3.setVisibility(r1)
            android.widget.TextView r5 = r0.A0S
            java.lang.String r4 = r7.A06
            if (r4 == 0) goto L_0x0179
            boolean r3 = X.AnonymousClass1YF.A0T(r4)
            if (r3 == 0) goto L_0x017c
        L_0x0179:
            r5.setVisibility(r10)
        L_0x017c:
            r5.setText(r4)
            android.widget.TextView r5 = r0.A0Q
            java.lang.String r4 = r7.A05
            if (r4 == 0) goto L_0x018b
            boolean r3 = X.AnonymousClass1YF.A0T(r4)
            if (r3 == 0) goto L_0x018e
        L_0x018b:
            r5.setVisibility(r10)
        L_0x018e:
            r5.setText(r4)
            X.1gU r3 = r0.getLinkifyWeb()
            java.lang.String r5 = X.AnonymousClass2VB.A00(r3, r6)
            if (r5 == 0) goto L_0x01a6
            android.widget.TextView r4 = r0.A0R
            r3 = 150(0x96, float:2.1E-43)
            java.lang.String r3 = X.AnonymousClass1EG.A0C(r5, r3)
            r4.setText(r3)
        L_0x01a6:
            boolean r3 = r2 instanceof X.AnonymousClass22G
            if (r3 == 0) goto L_0x039b
            android.widget.FrameLayout r3 = r0.A0J
            r3.setVisibility(r10)
            r9 = r2
            X.22G r9 = (X.AnonymousClass22G) r9
            X.1bI r12 = r0.A0Y
            r8 = 0
            r12.A04(r1)
            android.view.View r5 = X.AnonymousClass3MX.A0D(r12)
            X.1PP r3 = r0.getFMessageKeyFactory()
            r7 = 0
            X.205 r20 = X.C17880vN.A0Z(r7, r3)
            X.11P r3 = r0.getTime()
            long r22 = X.AnonymousClass11P.A01(r3)
            r11 = 0
            X.2mf r6 = new X.2mf
            r25 = r1
            r19 = r6
            r21 = r11
            r24 = r1
            r19.<init>(r20, r21, r22, r24, r25)
            boolean r3 = r9 instanceof X.AnonymousClass24P
            if (r3 == 0) goto L_0x0263
            X.24P r9 = (X.AnonymousClass24P) r9
        L_0x01e1:
            r3 = 2131433927(0x7f0b19c7, float:1.8489654E38)
            android.widget.TextView r4 = X.AnonymousClass3Ma.A0E(r5, r3)
            java.lang.String r3 = r9.A00
            r4.setText(r3)
            r3 = 2131433939(0x7f0b19d3, float:1.8489678E38)
            android.view.View r13 = X.C18070vi.A05(r5, r3)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            java.util.List r3 = r9.A01
            java.util.Iterator r17 = r3.iterator()
            boolean r3 = r17.hasNext()
            if (r3 != 0) goto L_0x023c
            r14 = r7
        L_0x0203:
            X.2lq r14 = (X.C59152lq) r14
            if (r14 == 0) goto L_0x020a
            long r3 = r14.A00
            int r8 = (int) r3
        L_0x020a:
            r13.removeAllViews()
            android.view.LayoutInflater r6 = X.AnonymousClass3MZ.A0D(r0)
            java.util.List r3 = r9.A01
            java.util.Iterator r14 = r3.iterator()
        L_0x0217:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0327
            java.lang.Object r5 = r14.next()
            X.2lq r5 = (X.C59152lq) r5
            r3 = 2131626496(0x7f0e0a00, float:1.888023E38)
            android.view.View r4 = r6.inflate(r3, r7)
            X.87j r3 = r0.getPollSnapshotOptionViewHolderFactory()
            X.C18070vi.A0b(r4)
            X.6Cs r3 = r3.BGd(r4)
            r3.A04(r5, r9, r11, r8)
            r13.addView(r4)
            goto L_0x0217
        L_0x023c:
            java.lang.Object r14 = r17.next()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0203
            r3 = r14
            X.2lq r3 = (X.C59152lq) r3
            long r5 = r3.A00
        L_0x024b:
            java.lang.Object r16 = r17.next()
            r3 = r16
            X.2lq r3 = (X.C59152lq) r3
            long r3 = r3.A00
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 >= 0) goto L_0x025c
            r14 = r16
            r5 = r3
        L_0x025c:
            boolean r3 = r17.hasNext()
            if (r3 != 0) goto L_0x024b
            goto L_0x0203
        L_0x0263:
            X.00H r3 = r0.getFMessageForwardingSubsystem()
            java.lang.Object r4 = r3.get()
            X.1hx r4 = (X.C32911hx) r4
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePoll"
            X.C18070vi.A0z(r9, r3)
            X.206 r9 = (X.AnonymousClass206) r9
            X.206 r9 = r4.A00(r6, r9)
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.pollresultsnapshot.fmessage.FMessagePollResultSnapshot"
            X.C18070vi.A0z(r9, r3)
            X.24P r9 = (X.AnonymousClass24P) r9
            goto L_0x01e1
        L_0x0281:
            android.widget.FrameLayout r3 = r0.A0J
            r3.setVisibility(r10)
            goto L_0x01a6
        L_0x0288:
            com.whatsapp.components.button.ThumbnailButton r5 = r0.A0X
            r5.setVisibility(r10)
            goto L_0x0144
        L_0x028f:
            android.widget.FrameLayout r5 = r0.A0K
            r3 = 8
            r5.setVisibility(r3)
            android.view.View r3 = r0.A0G
            r5.removeView(r3)
            goto L_0x00ff
        L_0x029d:
            X.4Q6 r3 = r0.getConversationTopAttributeTextModelFactory()
            X.4NB r10 = r3.A00(r2, r1)
            if (r10 == 0) goto L_0x00b3
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r6 = X.C19620yd.A08
            r11.append(r6)
            android.content.Context r5 = r0.getContext()
            int r3 = r10.A02
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r3 = X.AnonymousClass001.A1H(r3, r6, r11)
            android.widget.TextView r6 = r0.A0O
            r6.setVisibility(r1)
            r6.setText(r3)
            X.0vb r3 = r0.getWhatsAppLocale()
            boolean r5 = X.AnonymousClass3MW.A1Z(r3)
            int r3 = r10.A01
            if (r5 == 0) goto L_0x030f
            r6.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r3, r1)
        L_0x02d5:
            int r3 = X.C108985cd.A03(r0)
            if (r3 == 0) goto L_0x030d
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
        L_0x02df:
            X.C29261bv.A02(r3, r6)
            android.graphics.Typeface r5 = r6.getTypeface()
            r3 = 2
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r5, r3)
            r6.setTypeface(r3)
            X.Ac1 r3 = X.AnonymousClass9RY.A00(r2)
            if (r3 == 0) goto L_0x0308
            com.whatsapp.TextEmojiLabel r5 = r0.A0U
            r5.setVisibility(r1)
            java.lang.String r3 = r3.A04
            r5.setText(r3)
            r0.getContext()
            android.graphics.Typeface r3 = X.C43421zm.A03()
            r5.setTypeface(r3)
        L_0x0308:
            r0.setForwardedAttributionPadding(r2)
            goto L_0x00b3
        L_0x030d:
            r3 = 0
            goto L_0x02df
        L_0x030f:
            r6.setCompoundDrawablesWithIntrinsicBounds(r3, r1, r1, r1)
            goto L_0x02d5
        L_0x0313:
            boolean r3 = r2 instanceof X.AnonymousClass210
            if (r3 == 0) goto L_0x0320
            r3 = r2
            X.210 r3 = (X.AnonymousClass210) r3
            java.lang.String r18 = r3.A17()
            goto L_0x009f
        L_0x0320:
            r18 = 0
            goto L_0x009f
        L_0x0324:
            r9 = 0
            goto L_0x006e
        L_0x0327:
            android.view.View r7 = X.AnonymousClass3MX.A0D(r12)
            r3 = 2131433939(0x7f0b19d3, float:1.8489678E38)
            android.view.View r8 = X.C18070vi.A05(r7, r3)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131166858(0x7f07068a, float:1.7947973E38)
            int r5 = r4.getDimensionPixelSize(r3)
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131166856(0x7f070688, float:1.794797E38)
            int r4 = r4.getDimensionPixelSize(r3)
            r3 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            X.C108995ce.A0v(r0, r5, r4)
            r6 = 0
        L_0x0358:
            android.view.View r3 = r0.A0F
            boolean r3 = r0.A01(r3)
            if (r3 != 0) goto L_0x0377
            java.util.List r3 = r9.A01
            int r3 = r3.size()
            if (r6 >= r3) goto L_0x0377
            int r6 = r6 + 1
            java.util.List r3 = r9.A01
            int r3 = X.AnonymousClass3MX.A02(r3, r6)
            r8.removeViewAt(r3)
            X.C108995ce.A0v(r0, r5, r4)
            goto L_0x0358
        L_0x0377:
            if (r6 <= 0) goto L_0x039b
            r3 = 2131432799(0x7f0b155f, float:1.8487366E38)
            android.view.View r3 = X.C18070vi.A05(r7, r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r4 = r3.inflate()
            r3 = 2131433943(0x7f0b19d7, float:1.8489686E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r4, r3)
            android.content.res.Resources r4 = X.AnonymousClass000.A0Y(r0)
            r3 = 2131755341(0x7f10014d, float:1.9141559E38)
            java.lang.String r3 = X.C72473Md.A0k(r4, r6, r3)
            r5.setText(r3)
        L_0x039b:
            if (r18 == 0) goto L_0x049b
            boolean r3 = X.AnonymousClass1YF.A0T(r18)
            if (r3 != 0) goto L_0x049b
            android.widget.FrameLayout r3 = r0.A0J
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x03be
            com.whatsapp.TextEmojiLabel r3 = r0.A0V
            android.view.ViewGroup$MarginLayoutParams r5 = X.C72463Mc.A0P(r3)
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131168042(0x7f070b2a, float:1.7950375E38)
            int r3 = r4.getDimensionPixelSize(r3)
            r5.topMargin = r3
        L_0x03be:
            android.text.SpannableStringBuilder r7 = X.AnonymousClass3MW.A09(r18)
            android.content.Context r6 = r0.getContext()
            android.content.Context r5 = r0.getContext()
            r4 = 2130970892(0x7f04090c, float:1.7550507E38)
            r3 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r9 = X.AnonymousClass3MZ.A02(r5, r6, r4, r3)
            android.content.Context r6 = r0.getContext()
            android.content.Context r5 = r0.getContext()
            r4 = 2130970132(0x7f040614, float:1.7548965E38)
            r3 = 2131101250(0x7f060642, float:1.7814904E38)
            int r10 = X.AnonymousClass3MZ.A02(r5, r6, r4, r3)
            X.CmK r8 = new X.CmK
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r11 = r1
            r12 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.11C r6 = r0.getSystemServices()
            X.0vc r4 = r0.getSharedPreferencesFactory()
            com.whatsapp.TextEmojiLabel r5 = r0.A0V
            android.text.TextPaint r3 = r5.getPaint()
            X.C26302CxJ.A06(r3, r6, r4, r8, r7)
            X.1np r4 = r0.getLinkifier()
            android.content.Context r3 = r0.getContext()
            r4.A08(r3, r7)
            r3 = 0
            r5.A0S(r7, r3, r1, r1)
        L_0x0412:
            X.8BG r5 = X.C63892tr.A01(r2)
            r10 = 0
            if (r5 == 0) goto L_0x0497
            X.0ve r4 = r0.getAbProps()
            java.lang.String[] r2 = X.C1409073n.A04
            r3 = 2378(0x94a, float:3.332E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            r3 = 3
            if (r2 == 0) goto L_0x042b
            r3 = 4
        L_0x042b:
            X.73n r2 = X.C1409073n.A03
            java.util.ArrayList r9 = r2.A05(r5, r3, r1)
            int r7 = r5.BXt()
        L_0x0435:
            boolean r2 = r9.isEmpty()
            r8 = 8
            if (r2 == 0) goto L_0x0443
            android.widget.LinearLayout r0 = r0.A0M
        L_0x043f:
            r0.setVisibility(r8)
            return
        L_0x0443:
            android.view.ViewGroup r2 = r0.A0I
            android.view.ViewGroup$MarginLayoutParams r4 = X.C72463Mc.A0P(r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131168046(0x7f070b2e, float:1.7950383E38)
            int r2 = r3.getDimensionPixelSize(r2)
            r4.bottomMargin = r2
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131168047(0x7f070b2f, float:1.7950385E38)
            float r6 = X.AnonymousClass3MW.A00(r3, r2)
            int r5 = r9.size()
            r4 = 0
        L_0x0466:
            if (r4 >= r5) goto L_0x0491
            android.content.Context r3 = r0.getContext()
            r2 = 2131626670(0x7f0e0aae, float:1.8880583E38)
            android.view.View r3 = android.view.View.inflate(r3, r2, r10)
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel"
            X.C18070vi.A0z(r3, r2)
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            r3.setSingleLine(r1)
            r3.setTextSize(r1, r6)
            java.lang.Object r2 = r9.get(r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.A0S(r2, r10, r1, r1)
            android.widget.LinearLayout r2 = r0.A0M
            r2.addView(r3, r4)
            int r4 = r4 + 1
            goto L_0x0466
        L_0x0491:
            r1 = 1
            if (r7 > r1) goto L_0x04a2
            android.widget.TextView r0 = r0.A0P
            goto L_0x043f
        L_0x0497:
            X.0wS r9 = X.C18460wS.A00
            r7 = 0
            goto L_0x0435
        L_0x049b:
            com.whatsapp.TextEmojiLabel r3 = r0.A0V
            r3.setVisibility(r10)
            goto L_0x0412
        L_0x04a2:
            android.widget.TextView r1 = r0.A0P
            X.00H r0 = r0.getNewsletterNumberFormatter()
            java.lang.Object r0 = r0.get()
            X.4XM r0 = (X.AnonymousClass4XM) r0
            java.lang.String r0 = r0.A01(r7)
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BF.A04(X.1E7, X.206, X.7E7, boolean):void");
    }
}
