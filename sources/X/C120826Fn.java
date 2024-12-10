package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6Fn  reason: invalid class name and case insensitive filesystem */
public abstract class C120826Fn extends C110625gN {
    public C19880zA A00;
    public AnonymousClass11S A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public AnonymousClass11C A04;
    public AnonymousClass11P A05;
    public C18000vb A06;
    public AnonymousClass1KW A07;
    public C18030ve A08;
    public C18010vc A09;
    public final ViewGroup A0A = AnonymousClass3MW.A0D(this, 2131434931);
    public final ViewGroup A0B = AnonymousClass3MW.A0D(this, 2131434932);
    public final ViewGroup A0C = AnonymousClass3MW.A0D(this, 2131434933);
    public final ViewGroup A0D = AnonymousClass3MW.A0D(this, 2131434934);
    public final ViewGroup A0E = AnonymousClass3MW.A0D(this, 2131434935);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.46n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.Bw1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.Bw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.5gQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.46l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.46l} */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.widget.LinearLayout, X.Bw2, android.view.View, java.lang.Object, X.BIs, android.view.ViewGroup, X.Bvz] */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.6FZ, X.6FM, X.46k, X.5fY] */
    /* JADX WARNING: type inference failed for: r4v8, types: [X.46m, X.6FZ, X.6FY, X.5fY] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r12 = this;
            r3 = r12
            X.6Fm r3 = (X.C120816Fm) r3
            X.0ve r2 = r3.A08
            if (r2 == 0) goto L_0x0265
            X.0vf r1 = X.C18040vf.A01
            r0 = 12387(0x3063, float:1.7358E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
        L_0x000f:
            android.content.Context r0 = r3.getContext()
            if (r1 == 0) goto L_0x025e
            com.whatsapp.wds.components.list.listitem.migration.WDSListItemConversationHeaderImpl r10 = new com.whatsapp.wds.components.list.listitem.migration.WDSListItemConversationHeaderImpl
            r10.<init>(r0)
        L_0x001a:
            r2 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r10.setLayoutParams(r0)
            com.whatsapp.TextEmojiLabel r0 = r10.getContactNameView()
            r1 = 0
            r0.setIncludeFontPadding(r1)
            com.whatsapp.WaTextView r0 = r10.getDateView()
            r0.setIncludeFontPadding(r1)
            X.0ve r9 = r3.A08
            android.content.Context r5 = r3.getContext()
            X.0vb r8 = r3.A06
            X.1Me r7 = r3.A03
            X.0zA r6 = r3.A00
            X.1xg r4 = new X.1xg
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.A02 = r4
            X.0ve r0 = r3.A08
            boolean r1 = X.AnonymousClass1J8.A09(r0)
            X.1xg r0 = r3.A02
            X.1xi r0 = r0.A03
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            if (r1 == 0) goto L_0x0259
            r0.A0L()
        L_0x0057:
            X.1xg r0 = r3.A02
            int r5 = r3.A06
            X.1xe r0 = r0.A06
            com.whatsapp.WaTextView r0 = r0.getDateView()
            r0.setTextColor(r5)
            android.view.View r1 = r10.getContentView()
            android.view.ViewGroup r0 = r12.A0C
            r0.addView(r1)
            android.content.Context r1 = r3.getContext()
            com.whatsapp.TextEmojiLabel r0 = new com.whatsapp.TextEmojiLabel
            r0.<init>(r1)
            r3.A01 = r0
            android.widget.LinearLayout$LayoutParams r4 = X.AnonymousClass3Ma.A0D()
            r2 = 3
            r4.gravity = r2
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168569(0x7f070d39, float:1.7951444E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.topMargin = r0
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setLayoutParams(r4)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setMaxLines(r2)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.setTextColor(r5)
            com.whatsapp.TextEmojiLabel r2 = r3.A01
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168567(0x7f070d37, float:1.795144E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setLineHeight(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            r0.A0L()
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            X.AnonymousClass3MW.A1S(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            r0 = 80
            r1.setPlaceholder(r0)
            com.whatsapp.TextEmojiLabel r2 = r3.A01
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168568(0x7f070d38, float:1.7951442E38)
            float r1 = X.AnonymousClass3MW.A00(r1, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            r0 = 2131434937(0x7f0b1db9, float:1.8491702E38)
            r1.setId(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            if (r1 == 0) goto L_0x00e6
            android.view.ViewGroup r0 = r12.A0B
            r0.addView(r1)
        L_0x00e6:
            r5 = r12
            boolean r0 = r12 instanceof X.C120726Fd
            if (r0 == 0) goto L_0x0162
            X.6Fd r5 = (X.C120726Fd) r5
            android.content.Context r1 = r5.getContext()
            X.1pb r0 = r5.A07
            X.5gQ r4 = new X.5gQ
            r4.<init>(r1, r0)
            r5.A00 = r4
        L_0x00fa:
            android.view.ViewGroup r1 = r12.A0A
            r1.addView(r4)
            r0 = 0
            r1.setVisibility(r0)
        L_0x0103:
            r2 = r12
            boolean r0 = r12 instanceof X.C120786Fj
            if (r0 == 0) goto L_0x0122
            X.6Fk r2 = (X.C120796Fk) r2
            android.content.Context r0 = r2.getContext()
            com.whatsapp.search.views.itemviews.SearchMessageVideoThumbView r1 = new com.whatsapp.search.views.itemviews.SearchMessageVideoThumbView
            r1.<init>(r0)
        L_0x0113:
            r2.A00 = r1
            r2.setUpThumbView(r1)
            X.5xG r1 = r2.A00
            if (r1 == 0) goto L_0x0121
            android.view.ViewGroup r0 = r12.A0E
            r0.addView(r1)
        L_0x0121:
            return
        L_0x0122:
            boolean r0 = r12 instanceof X.C120776Fi
            if (r0 == 0) goto L_0x0132
            X.6Fk r2 = (X.C120796Fk) r2
            android.content.Context r0 = X.AnonymousClass3MY.A04(r2)
            X.6FU r1 = new X.6FU
            r1.<init>(r0)
            goto L_0x0113
        L_0x0132:
            boolean r0 = r12 instanceof X.C120766Fh
            if (r0 == 0) goto L_0x0142
            X.6Fk r2 = (X.C120796Fk) r2
            android.content.Context r0 = X.AnonymousClass3MY.A04(r2)
            X.6FW r1 = new X.6FW
            r1.<init>(r0)
            goto L_0x0113
        L_0x0142:
            boolean r0 = r12 instanceof X.C120756Fg
            if (r0 == 0) goto L_0x0152
            X.6Fk r2 = (X.C120796Fk) r2
            android.content.Context r0 = r2.getContext()
            com.whatsapp.search.views.itemviews.SearchMessageImageThumbView r1 = new com.whatsapp.search.views.itemviews.SearchMessageImageThumbView
            r1.<init>(r0)
            goto L_0x0113
        L_0x0152:
            boolean r0 = r12 instanceof X.C120746Ff
            if (r0 == 0) goto L_0x0121
            X.6Fk r2 = (X.C120796Fk) r2
            android.content.Context r0 = r2.getContext()
            X.6Fo r1 = new X.6Fo
            r1.<init>(r0)
            goto L_0x0113
        L_0x0162:
            boolean r0 = r12 instanceof X.C120806Fl
            if (r0 == 0) goto L_0x017a
            X.6Fl r5 = (X.C120806Fl) r5
            android.content.Context r0 = r5.getContext()
            X.46m r4 = new X.46m
            r4.<init>(r0)
            r4.A01()
            r4.A04()
            r5.A02 = r4
            goto L_0x00fa
        L_0x017a:
            boolean r0 = r12 instanceof X.C120736Fe
            if (r0 == 0) goto L_0x0193
            X.6Fe r5 = (X.C120736Fe) r5
            android.content.Context r0 = r5.getContext()
            X.46k r4 = new X.46k
            r4.<init>(r0)
            r4.A01()
            r4.A04()
            r5.A05 = r4
            goto L_0x00fa
        L_0x0193:
            boolean r0 = r12 instanceof X.AnonymousClass6FR
            if (r0 == 0) goto L_0x01a6
            X.6FR r5 = (X.AnonymousClass6FR) r5
            android.content.Context r0 = r5.getContext()
            X.Bw0 r4 = new X.Bw0
            r4.<init>(r0)
            r5.A00 = r4
            goto L_0x00fa
        L_0x01a6:
            boolean r0 = r12 instanceof X.AnonymousClass6FQ
            if (r0 == 0) goto L_0x01b9
            X.6FQ r5 = (X.AnonymousClass6FQ) r5
            android.content.Context r0 = X.AnonymousClass3MY.A04(r5)
            X.Bw1 r4 = new X.Bw1
            r4.<init>(r0)
            r5.A00 = r4
            goto L_0x00fa
        L_0x01b9:
            boolean r0 = r12 instanceof X.AnonymousClass6FS
            if (r0 == 0) goto L_0x01ce
            X.6FS r5 = (X.AnonymousClass6FS) r5
            android.content.Context r1 = r5.getContext()
            X.1pZ r0 = r5.A02
            X.46n r4 = new X.46n
            r4.<init>(r1, r0)
            r5.A00 = r4
            goto L_0x00fa
        L_0x01ce:
            boolean r0 = r12 instanceof X.AnonymousClass6FT
            if (r0 == 0) goto L_0x01e5
            X.6FT r5 = (X.AnonymousClass6FT) r5
            android.content.Context r2 = r5.getContext()
            X.68H r1 = r5.A05
            X.1pZ r0 = r5.A04
            X.46l r4 = new X.46l
            r4.<init>(r2, r0, r1)
            r5.A02 = r4
            goto L_0x00fa
        L_0x01e5:
            boolean r0 = r12 instanceof X.AnonymousClass6FP
            if (r0 == 0) goto L_0x0103
            X.6FP r5 = (X.AnonymousClass6FP) r5
            android.content.Context r1 = r5.getContext()
            X.Bvz r4 = new X.Bvz
            r4.<init>(r1)
            r4.A04()
            r0 = 0
            r4.setOrientation(r0)
            r0 = 16
            r4.setGravity(r0)
            r0 = 2131626772(0x7f0e0b14, float:1.888079E38)
            android.view.View.inflate(r1, r0, r4)
            r0 = 2131434960(0x7f0b1dd0, float:1.8491749E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r4, r0)
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r0 = (com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview) r0
            r4.A00 = r0
            r0 = 2131434959(0x7f0b1dcf, float:1.8491747E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r4, r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = (com.whatsapp.search.views.itemviews.AudioPlayerView) r0
            r4.A03 = r0
            r0 = 2131232919(0x7f080897, float:1.808196E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass3MX.A06(r1, r0)
            android.content.Context r3 = r4.getContext()
            android.content.Context r2 = r4.getContext()
            r1 = 2130971095(0x7f0409d7, float:1.7550919E38)
            r0 = 2131102422(0x7f060ad6, float:1.7817281E38)
            int r0 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A08(r6, r0)
            r4.setBackground(r0)
            r0 = 1
            X.Bvy r10 = new X.Bvy
            r10.<init>(r4, r0)
            X.DQo r9 = new X.DQo
            r9.<init>(r4, r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r8 = r4.A03
            X.1f4 r7 = r4.A03
            X.00H r11 = r4.A04
            X.79X r6 = new X.79X
            r6.<init>(r7, r8, r9, r10, r11)
            r8.setPlaybackListener(r6)
            r5.A00 = r4
            goto L_0x00fa
        L_0x0259:
            X.C43421zm.A04(r0)
            goto L_0x0057
        L_0x025e:
            com.whatsapp.components.ConversationListRowHeaderView r10 = new com.whatsapp.components.ConversationListRowHeaderView
            r10.<init>(r0)
            goto L_0x001a
        L_0x0265:
            r1 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120826Fn.A04():void");
    }

    public C120826Fn(Context context) {
        super(context);
        A03();
        setOrientation(0);
        View.inflate(getContext(), 2131626814, this);
        TypedValue typedValue = new TypedValue();
        AnonymousClass3Ma.A06(this).resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168555);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131168556);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setMinimumHeight(getResources().getDimensionPixelSize(2131168570));
    }
}
