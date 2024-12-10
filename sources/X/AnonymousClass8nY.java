package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout;
import java.util.Set;

/* renamed from: X.8nY  reason: invalid class name */
public final class AnonymousClass8nY extends AnonymousClass8nP implements C108405be, B8b {
    public C40751vD A00;
    public C36461nv A01;
    public C219217x A02;
    public C24751Ln A03;
    public C32861hs A04;
    public C32431hB A05;
    public AnonymousClass1QL A06;
    public A6R A07;
    public AnonymousClass1QJ A08;
    public AnonymousClass1QO A09;
    public AnonymousClass1QS A0A;
    public AnonymousClass72F A0B;
    public AQF A0C;
    public C192479oS A0D;
    public AnonymousClass1R2 A0E;
    public C50522Ut A0F;
    public AnonymousClass129 A0G;
    public AnonymousClass00H A0H;
    public final View A0I;
    public final C28931bI A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final View A0O = AnonymousClass1HF.A06(this, 2131436057);
    public final FrameLayout A0P = C108945cZ.A0P(this, 2131433487);
    public final FrameLayout A0Q;
    public final FrameLayout A0R;
    public final LinearLayout A0S = AnonymousClass3MX.A0K(this, 2131432248);
    public final TextEmojiLabel A0T;
    public final TextEmojiLabel A0U = AnonymousClass3MX.A0V(this, 2131433600);
    public final TextEmojiLabel A0V = AnonymousClass3MX.A0V(this, 2131436378);
    public final WaTextView A0W = AnonymousClass3MW.A0T(this, 2131433678);
    public final ConversationPaymentRowTransactionLayout A0X = ((ConversationPaymentRowTransactionLayout) AnonymousClass1HF.A06(this, 2131436379));
    public final C1407773a A0Y;
    public final C28931bI A0Z;
    public final C28931bI A0a = C28931bI.A00(this, 2131433688);
    public final C28931bI A0b;
    public final C28931bI A0c;

    public /* synthetic */ void CKk() {
    }

    public int getBubbleAlpha() {
        return 255;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8nY(Context context, C108875cR r33, AnonymousClass206 r34) {
        super(context, r33, r34);
        C28931bI r0;
        A1M();
        TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(this, 2131432683);
        this.A0T = A0V2;
        A0V2.A0L();
        AnonymousClass3Ma.A1L(this.A0F, A0V2);
        A0V2.setAutoLinkMask(0);
        A0V2.setLinksClickable(false);
        A0V2.setFocusable(false);
        A0V2.setClickable(false);
        A0V2.setLongClickable(false);
        FrameLayout A0P2 = C108945cZ.A0P(this, 2131433514);
        this.A0Q = A0P2;
        FrameLayout A0P3 = C108945cZ.A0P(this, 2131434616);
        this.A0R = A0P3;
        this.A0I = AnonymousClass1HF.A06(this, 2131433669);
        this.A0J = C28931bI.A00(this, 2131433567);
        this.A0Z = C28931bI.A00(this, 2131433648);
        this.A0K = findViewById(2131427372);
        View findViewById = findViewById(2131435177);
        C28931bI r1 = null;
        if (findViewById != null) {
            r0 = new C28931bI(findViewById);
        } else {
            r0 = null;
        }
        this.A0c = r0;
        this.A0M = findViewById(2131434682);
        this.A0L = findViewById(2131434575);
        View findViewById2 = findViewById(2131434687);
        this.A0b = findViewById2 != null ? new C28931bI(findViewById2) : r1;
        A0P2.setForeground(getInnerFrameForegroundDrawable());
        A0P3.setForeground(getInnerFrameForegroundDrawable());
        this.A0N = AnonymousClass1HF.A06(this, 2131432381);
        C18030ve r16 = this.A0F;
        C34531kd r15 = this.A0V;
        C33251iW r13 = this.A0a;
        C18000vb r11 = this.A0D;
        AnonymousClass1KB r10 = this.A0S;
        AnonymousClass00H r9 = this.A0O;
        AnonymousClass10I r8 = this.A1X;
        C32021gV r7 = this.A1S;
        C219217x r6 = this.A02;
        C19830z4 r5 = this.A0v;
        C32431hB r4 = this.A05;
        C26631Sw r3 = this.A1P;
        C18030ve r21 = r16;
        C18000vb r20 = r11;
        C19830z4 r19 = r5;
        C219217x r18 = r6;
        C33251iW r17 = r13;
        C34531kd r162 = r15;
        AnonymousClass1KB r152 = r10;
        this.A0Y = new C1407773a(this, r152, r162, r17, r18, r19, r20, r21, this.A04, r4, (AnonymousClass70H) this.A0H.get(), r3, this.A0F, r7, r8, r9, (Runnable) null);
        A2i();
    }

    private void A00() {
        this.A0P.setVisibility(8);
        View view = this.A0K;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A0M;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        C28931bI r0 = this.A0c;
        if (r0 != null) {
            r0.A04(8);
        }
        this.A0S.setOnClickListener((View.OnClickListener) null);
        this.A0V.setVisibility(8);
        this.A0R.setVisibility(8);
        View view3 = this.A0L;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    private boolean A01() {
        C18030ve r1 = this.A0F;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 605) || C18020vd.A05(r2, this.A0F, 629)) {
            return true;
        }
        return false;
    }

    private void setPaymentContext(AnonymousClass206 r9, TextEmojiLabel textEmojiLabel) {
        Pair pair;
        Context context;
        int i;
        Object[] objArr;
        String string;
        Context context2;
        int i2;
        String A0H2;
        AnonymousClass1R2 r5 = this.A0E;
        if (r9.A0v.A00 == null || AnonymousClass25B.A00(r9) == null) {
            pair = new Pair("", "");
        } else {
            AW0 A002 = AnonymousClass25B.A00(r9);
            String str = "";
            if (A002.A0K()) {
                if (!r5.A00.A0O(A002.A0E) || "en".equals(r5.A05.A05())) {
                    str = r5.A0W(A002);
                    context = r5.A04.A00;
                    i = 2131893987;
                    objArr = new Object[]{str};
                    string = context.getString(i, objArr);
                    pair = C108945cZ.A0N(str, string);
                } else {
                    context2 = r5.A04.A00;
                    i2 = 2131893988;
                }
            } else if (r5.A0j(A002)) {
                AnonymousClass8pG r0 = A002.A0A;
                if (r0 == null) {
                    A0H2 = null;
                } else {
                    A0H2 = r0.A0H();
                }
                boolean equals = "UPI app".equals(A0H2);
                AnonymousClass118 r02 = r5.A04;
                if (!equals) {
                    context = r02.A00;
                    i = 2131894102;
                    objArr = new Object[]{A0H2};
                    string = context.getString(i, objArr);
                    pair = C108945cZ.A0N(str, string);
                } else {
                    context2 = r02.A00;
                    i2 = 2131894103;
                }
            } else if (!r5.A00.A0O(A002.A0D) || "en".equals(r5.A05.A05())) {
                str = r5.A0V(A002);
                context = r5.A04.A00;
                i = 2131894097;
                objArr = new Object[]{str};
                string = context.getString(i, objArr);
                pair = C108945cZ.A0N(str, string);
            } else {
                context2 = r5.A04.A00;
                i2 = 2131894101;
            }
            string = context2.getString(i2);
            pair = C108945cZ.A0N(str, string);
        }
        String str2 = (String) pair.second;
        if (!TextUtils.isEmpty(str2)) {
            String str3 = (String) pair.first;
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(str2);
            if (!TextUtils.isEmpty(str3)) {
                getContext();
                C22628BGo bGo = new C22628BGo();
                int length = str2.length();
                A092.setSpan(bGo, length - str3.length(), length, 0);
                textEmojiLabel.setText(A092, TextView.BufferType.SPANNABLE);
            } else {
                textEmojiLabel.setText(A092);
            }
            textEmojiLabel.setVisibility(0);
            return;
        }
        textEmojiLabel.setVisibility(8);
    }

    private void setRequestPaymentText(AW0 aw0, TextView textView) {
        Pair A0L2 = this.A0E.A0L(aw0);
        String str = (String) A0L2.first;
        SpannableStringBuilder A092 = AnonymousClass3MW.A09((String) A0L2.second);
        if (!TextUtils.isEmpty(str)) {
            getContext();
            A092.setSpan(new C22628BGo(), 0, str.length(), 0);
            textView.setText(A092, TextView.BufferType.SPANNABLE);
            return;
        }
        textView.setText(A092);
    }

    /* JADX WARNING: type inference failed for: r14v8, types: [java.lang.Object, X.9iW] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a5, code lost:
        if (r12 == 10) goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r32 = this;
            r8 = r32
            X.206 r7 = r8.getFMessage()
            X.AW0 r6 = X.AnonymousClass25B.A00(r7)
            com.whatsapp.TextEmojiLabel r9 = r8.A0T
            r9.A0L()
            com.whatsapp.TextEmojiLabel r11 = r8.A0U
            X.0ve r0 = r8.A0F
            X.AnonymousClass3Ma.A1L(r0, r11)
            android.view.ViewGroup r12 = r8.A06
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131166200(0x7f0703f8, float:1.7946639E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = X.AnonymousClass3Ma.A02(r8, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131166198(0x7f0703f6, float:1.7946635E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5 = 0
            r12.setPadding(r3, r5, r2, r0)
            android.view.View r2 = r8.A0O
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r2)
            r0.topMargin = r5
            android.view.View r1 = r8.A0N
            r4 = 8
            r1.setVisibility(r4)
            int r14 = r7.A0u
            r0 = 12
            r10 = 1
            r13 = 2
            r3 = 0
            if (r14 != r0) goto L_0x05db
            android.content.Context r14 = r8.getContext()
            X.1vD r1 = r8.A00
            X.00H r0 = r8.A1q
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r2 = r1.A03()
            X.C18070vi.A0X(r2)
            r1 = 2131890595(0x7f1211a3, float:1.9415886E38)
            X.6kd r0 = X.C1404271j.A08
            java.lang.String r0 = r0.A00(r14, r2, r1)
        L_0x006d:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
            r8.A28(r1)
            X.11C r0 = r8.A0C
            X.AnonymousClass3Ma.A1K(r11, r0)
            r11.setText(r1)
            android.graphics.Typeface r0 = r11.getTypeface()
            r11.setTypeface(r0, r13)
        L_0x0087:
            r11.setVisibility(r5)
        L_0x008a:
            com.whatsapp.WaTextView r1 = r8.A0W
            r1.setVisibility(r5)
            X.1bI r2 = r8.A0a
            r2.A04(r4)
            com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout r0 = r8.A0X
            r23 = r0
            int r0 = r11.getVisibility()
            r14 = r3
            if (r0 != r4) goto L_0x00a0
            r14 = r12
        L_0x00a0:
            r0 = r23
            r0.A00 = r14
            android.view.View r0 = r8.A0I
            r31 = r0
            r0.setVisibility(r4)
            X.1bI r0 = r8.A0J
            r30 = r0
            r0.A04(r4)
            X.A8n r0 = X.C20128A8n.$redex_init_class
            if (r6 == 0) goto L_0x0148
            int r12 = r6.A03
            r0 = 5
            if (r12 != r0) goto L_0x0148
            r8.A00()
            r1.setVisibility(r4)
            r2.A04(r5)
            android.content.Context r3 = r8.getContext()
            X.1vD r1 = r8.A00
            X.00H r0 = r8.A1q
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r2 = r1.A03()
            X.C18070vi.A0X(r2)
            r1 = 2131893632(0x7f121d80, float:1.9422046E38)
            X.6kd r0 = X.C1404271j.A08
            java.lang.String r0 = r0.A00(r3, r2, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
            r8.A28(r1)
            X.11C r0 = r8.A0C
            X.AnonymousClass3Ma.A1K(r9, r0)
            r9.setText(r1)
            android.graphics.Typeface r0 = r9.getTypeface()
            r9.setTypeface(r0, r13)
            r9.setVisibility(r5)
        L_0x0100:
            android.widget.LinearLayout r1 = r8.A0S
            android.view.View$OnLongClickListener r0 = r8.A2t
            r1.setOnLongClickListener(r0)
            boolean r0 = r8.A01()
            X.1bI r6 = r8.A0Z
            if (r0 == 0) goto L_0x0692
            r6.A04(r5)
            r0 = 2131435056(0x7f0b1e30, float:1.8491943E38)
            android.widget.ImageView r3 = X.AnonymousClass3MW.A0G(r8, r0)
            X.205 r0 = r7.A0v
            boolean r2 = r0.A02
            android.content.Context r1 = r8.getContext()
            r0 = 2131102142(0x7f0609be, float:1.7816714E38)
            if (r2 == 0) goto L_0x0129
            r0 = 2131102143(0x7f0609bf, float:1.7816716E38)
        L_0x0129:
            int r0 = X.C19740yt.A00(r1, r0)
            r3.setColorFilter(r0)
            android.view.View r0 = r6.A02()
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r0 = 1500(0x5dc, float:2.102E-42)
            r1.setEnterFadeDuration(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setExitFadeDuration(r0)
            r1.start()
            return
        L_0x0148:
            boolean r0 = X.C20128A8n.A07(r6)
            if (r0 == 0) goto L_0x0162
            r8.A00()
            r9.setVisibility(r5)
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            r9.setText(r0)
            android.graphics.Typeface r0 = r9.getTypeface()
            r9.setTypeface(r0, r13)
            goto L_0x0100
        L_0x0162:
            X.1QO r0 = r8.A09
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05d4
            X.1QS r2 = r8.A0A
            java.lang.String r0 = r6.A0G
            X.2is r2 = r2.A04(r0)
            if (r2 == 0) goto L_0x05d4
            java.lang.String r0 = r6.A0I
            X.BD1 r2 = r2.A00(r0)
            if (r2 == 0) goto L_0x05d5
            X.1QO r0 = r8.A09
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05d5
            X.BDG r22 = r2.BPY()
            X.A5D r21 = r2.BUf()
        L_0x018c:
            r8.setPaymentContext(r7, r9)
            int r12 = r6.A03
            if (r12 == r10) goto L_0x01a7
            if (r12 == r13) goto L_0x01a7
            r0 = 100
            if (r12 == r0) goto L_0x01a7
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 == r0) goto L_0x01a7
            r0 = 20
            if (r12 == r0) goto L_0x01a7
            r0 = 10
            r20 = 0
            if (r12 != r0) goto L_0x01a9
        L_0x01a7:
            r20 = 1
        L_0x01a9:
            if (r2 == 0) goto L_0x05c6
            int r14 = r2.Baj(r6)
            r0 = r22
            java.lang.String r16 = r2.BWl(r0, r7)
        L_0x01b5:
            X.AW0 r0 = X.AnonymousClass25B.A00(r7)
            boolean r0 = X.C20128A8n.A07(r0)
            r19 = 0
            if (r0 == 0) goto L_0x01c4
            r19 = 2131893926(0x7f121ea6, float:1.9422642E38)
        L_0x01c4:
            if (r2 == 0) goto L_0x05c0
            int r18 = r2.Bah(r6)
        L_0x01ca:
            if (r20 == 0) goto L_0x05b9
            if (r14 == 0) goto L_0x05b9
            com.whatsapp.TextEmojiLabel r12 = r8.A0V
            java.lang.String r17 = X.AnonymousClass3Ma.A11(r8, r14)
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x05b5
            android.content.Context r15 = r8.getContext()
            r14 = r17
            r0 = r16
            java.lang.Object[] r14 = X.C108945cZ.A1a(r14, r0, r13, r10)
            r0 = 2131893942(0x7f121eb6, float:1.9422675E38)
            java.lang.String r15 = r15.getString(r0, r14)
        L_0x01ed:
            if (r19 == 0) goto L_0x0208
            android.content.Context r16 = r8.getContext()
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r5] = r15
            r0 = r19
            java.lang.String r0 = X.AnonymousClass3Ma.A11(r8, r0)
            r13[r10] = r0
            r14 = 2131893941(0x7f121eb5, float:1.9422673E38)
            r0 = r16
            java.lang.String r15 = r0.getString(r14, r13)
        L_0x0208:
            r0 = r17
            int r16 = r15.indexOf(r0)
            int r14 = r17.length()
            int r14 = r14 + r16
            android.text.SpannableStringBuilder r13 = X.AnonymousClass3MW.A09(r15)
            android.content.res.Resources r0 = r8.getResources()
            r15 = r0
            r0 = r18
            int r0 = r15.getColor(r0)
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            r15.<init>(r0)
            r0 = r16
            r13.setSpan(r15, r0, r14, r5)
            r8.getContext()
            X.BGo r0 = new X.BGo
            r0.<init>()
            r15 = r0
            r0 = r16
            r13.setSpan(r15, r0, r14, r5)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r12.setText(r13, r0)
            r12.setVisibility(r5)
        L_0x0243:
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x05ae
            int r0 = r9.getVisibility()
            if (r0 == 0) goto L_0x05ae
            r0 = r23
            r0.setVisibility(r4)
        L_0x0254:
            android.widget.FrameLayout r0 = r8.A0P
            r0.setVisibility(r5)
            if (r2 == 0) goto L_0x059c
            X.9iW r13 = r2.BWT()
            X.0ve r12 = r8.A0F
            X.0vb r9 = r8.A0D
            X.72F r0 = r8.A0B
            X.BBw r9 = r2.BWU(r9, r12, r0, r13)
        L_0x0269:
            r0 = 2131433492(0x7f0b1814, float:1.8488771E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0590
            X.AnonymousClass9Q1.A00(r0, r9)
        L_0x0277:
            r9.BD6(r6)
            X.1QO r0 = r8.A09
            boolean r0 = r0.A04(r5)
            if (r0 == 0) goto L_0x058d
            if (r2 == 0) goto L_0x058d
            X.3M8 r13 = r2.BPV()
        L_0x0288:
            X.1QO r0 = r8.A09
            boolean r0 = r0.A04(r5)
            if (r0 == 0) goto L_0x0584
            int r12 = r6.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r12 != r0) goto L_0x0584
            android.view.View r12 = r8.A0K
            if (r12 == 0) goto L_0x0584
            if (r13 == 0) goto L_0x057a
            boolean r0 = r13.CLf()
            if (r0 == 0) goto L_0x0584
        L_0x02a2:
            r0 = 2131427373(0x7f0b002d, float:1.847636E38)
            android.view.View r13 = r8.findViewById(r0)
            int r0 = r11.getVisibility()
            r13.setVisibility(r0)
            r0 = 2131427370(0x7f0b002a, float:1.8476354E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r12, r0)
            X.C43421zm.A04(r0)
            r12.setVisibility(r5)
            r0 = 45
            X.C90084dV.A00(r12, r8, r2, r6, r0)
        L_0x02c2:
            android.view.View r13 = r8.A0M
            if (r13 == 0) goto L_0x02de
            X.1QO r0 = r8.A09
            boolean r0 = r0.A04(r5)
            if (r0 == 0) goto L_0x0575
            if (r2 == 0) goto L_0x0575
            int r12 = r6.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r12 != r0) goto L_0x0575
            r13.setVisibility(r5)
            r0 = 46
            X.C90084dV.A00(r13, r8, r2, r7, r0)
        L_0x02de:
            X.1bI r13 = r8.A0c
            if (r13 == 0) goto L_0x031a
            X.1QO r0 = r8.A09
            boolean r0 = r0.A04(r5)
            if (r0 == 0) goto L_0x0570
            X.1R2 r14 = r8.A0E
            r12 = r21
            r0 = r22
            boolean r0 = r14.A0l(r6, r12, r0, r5)
            if (r0 == 0) goto L_0x0570
            android.view.View r14 = r13.A02()
            r0 = 2131435178(0x7f0b1eaa, float:1.849219E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r14, r0)
            int r0 = r11.getVisibility()
            r12.setVisibility(r0)
            r0 = 2131435176(0x7f0b1ea8, float:1.8492187E38)
            android.widget.TextView r12 = X.AnonymousClass3MW.A0J(r14, r0)
            X.C43421zm.A04(r12)
            r13.A04(r5)
            r0 = 47
            X.C90084dV.A00(r12, r8, r6, r7, r0)
        L_0x031a:
            X.1QO r0 = r8.A09
            boolean r0 = r0.A04(r5)
            if (r0 == 0) goto L_0x0567
            X.1R2 r0 = r8.A0E
            boolean r0 = r0.A0k(r6)
            if (r0 == 0) goto L_0x0567
            X.1bI r13 = r8.A0b
            if (r13 == 0) goto L_0x0567
            X.1QO r0 = r8.A09
            X.0ve r14 = r0.A02
            r12 = 1905(0x771, float:2.67E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r12)
            if (r0 == 0) goto L_0x0567
            X.2tK r12 = X.C63572tK.A0E
            X.1QJ r0 = r8.A08
            X.2tK r0 = r0.A02()
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0567
            android.view.View r14 = r13.A02()
            r0 = 2131434688(0x7f0b1cc0, float:1.8491197E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r14, r0)
            int r0 = r11.getVisibility()
            r12.setVisibility(r0)
            r0 = 2131434686(0x7f0b1cbe, float:1.8491193E38)
            android.widget.TextView r12 = X.AnonymousClass3MW.A0J(r14, r0)
            X.C43421zm.A04(r12)
            r13.A04(r5)
            r26 = 6
            X.78E r0 = new X.78E
            r21 = r0
            r22 = r8
            r23 = r2
            r24 = r6
            r25 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            r12.setOnClickListener(r0)
        L_0x037d:
            android.view.View r12 = r8.A0L
            if (r12 == 0) goto L_0x03e3
            boolean r0 = r6.A0J()
            if (r0 == 0) goto L_0x0562
            X.11S r13 = r8.A0U
            com.whatsapp.jid.UserJid r0 = r6.A0E
            boolean r0 = r13.A0O(r0)
            if (r0 == 0) goto L_0x0562
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x0398
            r10 = 0
        L_0x0398:
            r0 = 2131434577(0x7f0b1c51, float:1.8490972E38)
            android.view.View r11 = r8.findViewById(r0)
            int r0 = X.C72453Mb.A07(r10)
            r11.setVisibility(r0)
            r0 = 2131428629(0x7f0b0515, float:1.8478908E38)
            android.view.View r11 = r8.findViewById(r0)
            android.content.res.Resources r13 = r8.getResources()
            if (r10 == 0) goto L_0x0556
            android.content.Context r14 = r8.getContext()
            r10 = 2130969386(0x7f04032a, float:1.7547452E38)
            r0 = 2131100378(0x7f0602da, float:1.7813136E38)
            X.C72463Mc.A0x(r14, r13, r11, r10, r0)
        L_0x03c0:
            X.205 r10 = r7.A0v
            X.1BI r0 = r10.A00
            if (r0 == 0) goto L_0x03c8
            r6.A0C = r0
        L_0x03c8:
            java.lang.String r0 = r10.A01
            r6.A0L = r0
            X.A6R r0 = r8.A07
            java.lang.String r28 = "chat"
            r25 = r3
            r21 = r0
            r22 = r12
            r23 = r3
            r24 = r6
            r26 = r8
            r27 = r7
            r29 = r5
            r21.A05(r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x03e3:
            if (r20 == 0) goto L_0x0535
            android.widget.LinearLayout r11 = r8.A0S
            r17 = 7
            X.78E r0 = new X.78E
            r12 = r0
            r13 = r8
            r14 = r6
            r15 = r7
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            r11.setOnClickListener(r0)
        L_0x03f7:
            android.content.Context r0 = r8.getContext()
            java.lang.CharSequence r12 = X.AnonymousClass1R2.A04(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x04f1
            r1.setVisibility(r4)
        L_0x0408:
            java.lang.String r0 = r6.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04eb
            X.1QS r0 = r8.A0A
            X.1QR r1 = X.AnonymousClass8BR.A0O(r0)
            java.lang.String r0 = r6.A0M
            X.AW0 r12 = X.AnonymousClass8BU.A0J(r1, r0, r3)
            if (r12 == 0) goto L_0x04eb
            int r1 = r12.A02
            r0 = 18
            if (r1 == r0) goto L_0x04eb
            r0 = 2131434613(0x7f0b1c75, float:1.8491045E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r8, r0)
            r8.setRequestPaymentText(r12, r0)
            r0 = 2131434618(0x7f0b1c7a, float:1.8491055E38)
            X.1bI r13 = X.C28931bI.A00(r8, r0)
            android.view.View r16 = r13.A02()
            r0 = 2131434617(0x7f0b1c79, float:1.8491053E38)
            android.widget.TextView r10 = X.AnonymousClass3MW.A0J(r8, r0)
            android.content.Context r1 = r8.getContext()
            X.0vb r0 = r8.A0D
            r14 = r0
            X.1KN r0 = r6.A09
            r17 = r0
            X.1KJ r0 = r6.A01()
            r15 = r1
            r1 = r17
            android.text.SpannableStringBuilder r15 = X.A3U.A00(r15, r14, r0, r1)
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x04e1
            X.AEX r1 = r12.A04()
            if (r1 == 0) goto L_0x04d7
            r14 = 2131434620(0x7f0b1c7c, float:1.849106E38)
            r0 = r16
            android.widget.TextView r14 = X.AnonymousClass3MW.A0J(r0, r14)
            r10.setVisibility(r4)
            r13.A04(r5)
            r14.setText(r15)
            X.72F r13 = r8.A0B
            r10 = 2131434619(0x7f0b1c7b, float:1.8491057E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0G(r0, r10)
            r13.A02(r0, r14, r1)
        L_0x0480:
            android.widget.FrameLayout r10 = r8.A0R
            r10.setVisibility(r5)
            r1 = 21
            X.4dU r0 = new X.4dU
            r0.<init>(r8, r12, r1)
            r10.setOnClickListener(r0)
        L_0x048f:
            int r1 = r6.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0100
            X.AQF r10 = r8.A0C
            java.lang.String r1 = r6.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x04cc
            java.util.HashSet r0 = r10.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x04cc
            r0 = r31
            r0.setVisibility(r4)
            r0 = r30
            r0.A04(r5)
        L_0x04b1:
            r9.BD6(r3)
            r0 = 2131429609(0x7f0b08e9, float:1.8480896E38)
            X.AnonymousClass3MY.A1B(r8, r0, r4)
            X.78E r0 = new X.78E
            r12 = r0
            r13 = r8
            r14 = r6
            r15 = r2
            r16 = r7
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r11.setOnClickListener(r0)
            goto L_0x0100
        L_0x04cc:
            r0 = r31
            r0.setVisibility(r5)
            r0 = r30
            r0.A04(r4)
            goto L_0x04b1
        L_0x04d7:
            r10.setVisibility(r5)
            r10.setText(r15)
            r13.A04(r4)
            goto L_0x0480
        L_0x04e1:
            r10.setVisibility(r5)
            r10.setText(r15)
            r13.A04(r4)
            goto L_0x0480
        L_0x04eb:
            android.widget.FrameLayout r0 = r8.A0R
            r0.setVisibility(r4)
            goto L_0x048f
        L_0x04f1:
            android.content.res.Resources r10 = r8.getResources()
            r0 = r18
            X.AnonymousClass8BS.A14(r10, r1, r0)
            r1.setText(r12)
            android.view.ViewParent r13 = r1.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            X.Cw9 r12 = new X.Cw9
            r12.<init>()
            r12.A0C(r13)
            r14 = 4
            r10 = 6
            int r15 = r1.getId()
            if (r20 == 0) goto L_0x052a
            r0 = 3
            r12.A09(r15, r0, r5, r0)
            int r0 = r1.getId()
            r12.A09(r0, r14, r5, r14)
            int r0 = r1.getId()
            r12.A09(r0, r10, r5, r10)
        L_0x0525:
            r12.A0A(r13)
            goto L_0x0408
        L_0x052a:
            r12.A06(r15)
            int r0 = r1.getId()
            r12.A09(r0, r10, r5, r10)
            goto L_0x0525
        L_0x0535:
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x054f
            X.AEX r0 = r6.A04()
            if (r0 == 0) goto L_0x054f
            android.widget.LinearLayout r11 = r8.A0S
            r10 = 20
            X.4dU r0 = new X.4dU
            r0.<init>(r8, r6, r10)
            r11.setOnClickListener(r0)
            goto L_0x03f7
        L_0x054f:
            android.widget.LinearLayout r11 = r8.A0S
            r11.setOnClickListener(r3)
            goto L_0x03f7
        L_0x0556:
            r0 = 2131232800(0x7f080820, float:1.808172E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            r11.setBackground(r0)
            goto L_0x03c0
        L_0x0562:
            r12.setVisibility(r4)
            goto L_0x03e3
        L_0x0567:
            X.1bI r0 = r8.A0b
            if (r0 == 0) goto L_0x037d
            r0.A04(r4)
            goto L_0x037d
        L_0x0570:
            r13.A04(r4)
            goto L_0x031a
        L_0x0575:
            r13.setVisibility(r4)
            goto L_0x02de
        L_0x057a:
            X.1QL r0 = r8.A06
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0584
            goto L_0x02a2
        L_0x0584:
            android.view.View r0 = r8.A0K
            if (r0 == 0) goto L_0x02c2
            r0.setVisibility(r4)
            goto L_0x02c2
        L_0x058d:
            r13 = r3
            goto L_0x0288
        L_0x0590:
            r0 = 2131433491(0x7f0b1813, float:1.848877E38)
            android.view.View r0 = r8.findViewById(r0)
            r9.CA8(r0)
            goto L_0x0277
        L_0x059c:
            X.9iW r14 = new X.9iW
            r14.<init>()
            X.0ve r13 = r8.A0F
            X.0vb r12 = r8.A0D
            X.72F r0 = r8.A0B
            X.AQ1 r9 = new X.AQ1
            r9.<init>(r12, r13, r0, r14)
            goto L_0x0269
        L_0x05ae:
            r0 = r23
            r0.setVisibility(r5)
            goto L_0x0254
        L_0x05b5:
            r15 = r17
            goto L_0x01ed
        L_0x05b9:
            com.whatsapp.TextEmojiLabel r12 = r8.A0V
            r12.setVisibility(r4)
            goto L_0x0243
        L_0x05c0:
            int r18 = X.AnonymousClass1R2.A01(r6)
            goto L_0x01ca
        L_0x05c6:
            X.1R2 r0 = r8.A0E
            int r14 = r0.A0G(r6)
            X.1R2 r0 = r8.A0E
            java.lang.String r16 = r0.A0b(r3, r7)
            goto L_0x01b5
        L_0x05d4:
            r2 = r3
        L_0x05d5:
            r22 = r3
            r21 = r3
            goto L_0x018c
        L_0x05db:
            boolean r0 = X.C20133A8t.A0A(r7)
            if (r0 == 0) goto L_0x05fd
            r0 = 11
            X.129 r1 = r8.A0G
            if (r14 != r0) goto L_0x05fa
            java.lang.String r0 = "26000015"
        L_0x05e9:
            java.lang.String r2 = r1.A06(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131893689(0x7f121db9, float:1.9422162E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r2, r10, r5, r0)
            goto L_0x006d
        L_0x05fa:
            java.lang.String r0 = "835452491239734"
            goto L_0x05e9
        L_0x05fd:
            X.0ve r14 = r8.A0F
            r0 = 812(0x32c, float:1.138E-42)
            X.0vf r15 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r15, r14, r0)
            if (r0 != 0) goto L_0x0613
            X.0ve r14 = r8.A0F
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = X.C18020vd.A05(r15, r14, r0)
            if (r0 == 0) goto L_0x063d
        L_0x0613:
            boolean r0 = r7 instanceof X.C441322g
            if (r0 == 0) goto L_0x063d
            r2 = r7
            X.22g r2 = (X.C441322g) r2
            r1.setVisibility(r5)
            X.73a r1 = r8.A0Y
            r1.A06(r3, r2, r5)
            boolean r0 = X.AnonymousClass25A.A11(r2)
            if (r0 == 0) goto L_0x062d
            r1.A04()
            goto L_0x008a
        L_0x062d:
            boolean r0 = X.AnonymousClass25A.A12(r2)
            if (r0 == 0) goto L_0x0638
            r1.A05()
            goto L_0x008a
        L_0x0638:
            r1.A03()
            goto L_0x008a
        L_0x063d:
            java.lang.String r0 = r7.A0P()
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 != 0) goto L_0x0653
            java.lang.String r0 = r7.A0P()
            r8.setMessageText(r0, r11, r7)
            r11.A0L()
            goto L_0x0087
        L_0x0653:
            r11.setVisibility(r4)
            boolean r0 = X.C20128A8n.A07(r6)
            if (r0 != 0) goto L_0x008a
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168191(0x7f070bbf, float:1.7950677E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.AnonymousClass3Ma.A02(r8, r0)
            r12.setPadding(r1, r5, r0, r5)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r12.measure(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r14 = X.AnonymousClass3MW.A0B(r2)
            int r0 = r12.getMeasuredHeight()
            int r2 = -r0
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168190(0x7f070bbe, float:1.7950675E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            r14.topMargin = r2
            goto L_0x008a
        L_0x0692:
            r6.A04(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nY.A2i():void");
    }

    public void CNi() {
        C18030ve r1 = this.A0F;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 812) || C18020vd.A05(r2, this.A0F, 811)) {
            this.A0Y.A0E.A07();
        }
    }

    public void COV() {
        C18030ve r1 = this.A0F;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 812) || C18020vd.A05(r2, this.A0F, 811)) {
            this.A0Y.A0E.A08();
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return AnonymousClass3MW.A01(getResources(), 2131168188) + (AnonymousClass3MW.A01(getResources(), 2131168192) * 2);
    }

    public void A1u() {
        super.A1u();
        A2i();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    public boolean Be6() {
        AnonymousClass206 fMessage = getFMessage();
        if (!(fMessage instanceof C441322g) || !((C441322g) fMessage).A03) {
            return false;
        }
        return true;
    }

    public void C0N() {
        A1u();
    }

    public int getCenteredLayoutId() {
        return 2131624891;
    }

    public int getIncomingLayoutId() {
        return 2131624891;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A0Q);
        innerFrameLayouts.add(this.A0R);
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return 2131624896;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(AnonymousClass000.A1W(AnonymousClass25B.A00(r2)));
        this.A0I = r2;
    }
}
