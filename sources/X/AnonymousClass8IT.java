package X;

/* renamed from: X.8IT  reason: invalid class name */
public abstract class AnonymousClass8IT extends C42011xT {
    public void A0B() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        if (r0.A01 == X.AnonymousClass00R.A0C) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0b0e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r19
            r4 = r18
            X.8xj r4 = (X.C175028xj) r4
            boolean r1 = r4 instanceof X.C174548wx
            if (r1 == 0) goto L_0x0022
            X.8wR r0 = (X.C174228wR) r0
            android.view.View r1 = X.C108965cb.A09(r4, r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.content.Context r1 = r1.getContext()
            int r0 = r0.A00
            float r0 = (float) r0
            int r0 = X.C62762rw.A01(r1, r0)
            r2.height = r0
        L_0x0021:
            return
        L_0x0022:
            boolean r1 = r4 instanceof X.C174638x6
            if (r1 == 0) goto L_0x0049
            X.8x6 r4 = (X.C174638x6) r4
            android.view.ViewGroup r0 = r4.A00
            android.view.LayoutInflater r5 = X.AnonymousClass3MZ.A0D(r0)
            android.view.View r1 = r4.A0H
            r0 = 2131435413(0x7f0b1f95, float:1.8492667E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MW.A0C(r1, r0)
            r3.removeAllViews()
            r2 = 0
        L_0x003b:
            r1 = 2131626755(0x7f0e0b03, float:1.8880755E38)
            r0 = 1
            r5.inflate(r1, r3, r0)
            int r2 = r2 + 1
            r0 = 14
            if (r2 >= r0) goto L_0x0021
            goto L_0x003b
        L_0x0049:
            boolean r1 = r4 instanceof X.C174778xK
            if (r1 == 0) goto L_0x007d
            X.8xK r4 = (X.C174778xK) r4
            X.9Xr r0 = (X.C183289Xr) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            com.whatsapp.WaTextView r2 = r4.A00
            X.AF0 r1 = r0.A00
            java.lang.String r0 = r1.A0I
            r2.setText(r0)
            java.lang.String r5 = r1.A0G
            if (r5 == 0) goto L_0x0ad3
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0ad3
            X.9Xp r3 = r4.A02
            com.whatsapp.components.button.ThumbnailButton r2 = r4.A01
            android.content.Context r1 = r2.getContext()
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r1, r0)
            X.4VT r0 = r3.A00
            r0.A01(r1, r1, r2, r5)
            return
        L_0x007d:
            boolean r1 = r4 instanceof X.C174978xe
            if (r1 == 0) goto L_0x0089
            X.8xe r4 = (X.C174978xe) r4
            X.8vo r0 = (X.C173838vo) r0
            r4.A0D(r0)
            return
        L_0x0089:
            boolean r1 = r4 instanceof X.C174898xW
            if (r1 == 0) goto L_0x009b
            X.8xW r4 = (X.C174898xW) r4
            boolean r1 = r4 instanceof X.C175018xi
            if (r1 == 0) goto L_0x0adc
            X.8xi r4 = (X.C175018xi) r4
            X.8wE r0 = (X.C174098wE) r0
            r4.A0D(r0)
            return
        L_0x009b:
            boolean r1 = r4 instanceof X.C174928xZ
            if (r1 == 0) goto L_0x00f8
            X.8xZ r4 = (X.C174928xZ) r4
            X.8km r0 = (X.C169278km) r0
            r4.A00 = r0
            boolean r5 = r0.A01
            r1 = r5 ^ 1
            r0.A03 = r1
            X.A7p r1 = r4.A07
            r1.A06(r0)
            com.whatsapp.WaTextView r1 = r4.A05
            r2 = 8
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r4.A02
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r4.A03
            r1.setVisibility(r2)
            r3 = 0
            if (r5 == 0) goto L_0x00e5
            X.1pZ r5 = r4.A09
            X.AF0 r1 = r0.A00
            java.lang.String r1 = r1.A0F
            X.1BI r1 = X.AnonymousClass3MX.A0l(r1)
            X.1E7 r2 = new X.1E7
            r2.<init>(r1)
            com.whatsapp.CircleWaImageView r1 = r4.A04
            r5.A0C(r1, r2, r3)
            r1 = 1
            X.AQA r2 = new X.AQA
            r2.<init>(r0, r4, r1)
            r4.A01 = r2
            X.1Lf r1 = r4.A08
            r1.registerObserver(r2)
        L_0x00e5:
            X.AF0 r0 = r0.A00
            int r1 = r0.A08
            r0 = 2
            if (r1 != r0) goto L_0x0021
            com.whatsapp.WaTextView r1 = r4.A06
            r0 = 2131887063(0x7f1203d7, float:1.9408722E38)
            r1.setText(r0)
            r1.setVisibility(r3)
            return
        L_0x00f8:
            boolean r1 = r4 instanceof X.C174768xJ
            if (r1 == 0) goto L_0x0149
            X.8xJ r4 = (X.C174768xJ) r4
            X.8wU r0 = (X.C174258wU) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            android.widget.TextView r2 = r4.A01
            r1 = 2131887089(0x7f1203f1, float:1.9408775E38)
            r2.setText(r1)
            com.google.android.material.chip.ChipGroup r7 = r4.A02
            r7.removeAllViews()
            java.util.List r1 = r0.A00
            java.util.Iterator r6 = r1.iterator()
        L_0x0117:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0021
            java.lang.String r5 = X.C17880vN.A0v(r6)
            android.view.View r1 = r4.A00
            android.content.Context r1 = X.AnonymousClass3MY.A04(r1)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            r1 = 2131626834(0x7f0e0b52, float:1.8880915E38)
            android.view.View r3 = X.AnonymousClass3MX.A09(r2, r7, r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.google.android.material.chip.Chip"
            X.C18070vi.A0z(r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r5)
            r2 = 5
            X.AFV r1 = new X.AFV
            r1.<init>(r2, r5, r0)
            r3.setOnClickListener(r1)
            r7.addView(r3)
            goto L_0x0117
        L_0x0149:
            boolean r1 = r4 instanceof X.C174708xD
            if (r1 == 0) goto L_0x0154
            java.lang.String r0 = "displayName"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0154:
            boolean r1 = r4 instanceof X.C174528wv
            if (r1 == 0) goto L_0x015f
            java.lang.String r0 = "onClickListener"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x015f:
            boolean r1 = r4 instanceof X.C174758xI
            if (r1 == 0) goto L_0x01db
            X.8xI r4 = (X.C174758xI) r4
            X.8w9 r0 = (X.C174048w9) r0
            X.A5L r1 = r4.A01
            X.A6f r1 = r1.A02()
            if (r1 == 0) goto L_0x0178
            java.lang.Integer r3 = r0.A01
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            r1 = 2131887053(0x7f1203cd, float:1.9408702E38)
            if (r3 != r2) goto L_0x017b
        L_0x0178:
            r1 = 2131887052(0x7f1203cc, float:1.94087E38)
        L_0x017b:
            com.whatsapp.TextEmojiLabel r11 = r4.A00
            X.9yV r3 = r4.A02
            android.view.View r2 = r4.A0H
            java.lang.String r1 = X.AnonymousClass3Ma.A11(r2, r1)
            X.C196599vK.A01(r11, r3, r1)
            android.content.Context r12 = r2.getContext()
            java.lang.CharSequence r1 = r11.getText()
            android.view.View$OnClickListener r13 = r0.A00
            java.lang.String r10 = "clear-search-location"
            android.text.SpannableStringBuilder r9 = X.AnonymousClass3MW.A09(r1)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r8 = 0
            java.lang.Object[] r7 = r9.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x0021
            int r6 = r7.length
        L_0x01a8:
            if (r8 >= r6) goto L_0x0ae2
            r5 = r7[r8]
            java.lang.String r0 = r5.getURL()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x01d8
            int r4 = r9.getSpanStart(r5)
            int r3 = r9.getSpanEnd(r5)
            int r2 = r9.getSpanFlags(r5)
            X.8dA r0 = new X.8dA
            r0.<init>(r12, r13)
            r9.setSpan(r0, r4, r3, r2)
            r1 = 2132083122(0x7f1501b2, float:1.9806377E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r12, r1)
            r9.setSpan(r0, r4, r3, r2)
            r9.removeSpan(r5)
        L_0x01d8:
            int r8 = r8 + 1
            goto L_0x01a8
        L_0x01db:
            boolean r1 = r4 instanceof X.C174698xC
            if (r1 == 0) goto L_0x01f4
            X.8xC r4 = (X.C174698xC) r4
            X.8wd r0 = (X.C174348wd) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0ae6
            r0 = 2
            android.widget.TextView r1 = r4.A00
            if (r2 == r0) goto L_0x0aec
            X.AnonymousClass3MW.A1S(r1)
            return
        L_0x01f4:
            boolean r1 = r4 instanceof X.C174748xH
            if (r1 == 0) goto L_0x023b
            X.8xH r4 = (X.C174748xH) r4
            X.8wH r0 = (X.C174128wH) r0
            java.lang.String r3 = r0.A02
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r1 != 0) goto L_0x0233
            X.9kB r2 = r4.A02
            android.widget.ImageView r1 = r4.A00
            r2.A00(r1, r3)
            r1.setVisibility(r5)
        L_0x020f:
            com.whatsapp.WaTextView r2 = r4.A01
            java.lang.String r1 = r0.A01
            r2.setText(r1)
            android.view.View r3 = r4.A0H
            X.1rL r1 = r0.A00
            r3.setOnClickListener(r1)
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r3)
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0230
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131166488(0x7f070518, float:1.7947223E38)
            int r5 = r1.getDimensionPixelSize(r0)
        L_0x0230:
            r2.bottomMargin = r5
            return
        L_0x0233:
            android.widget.ImageView r2 = r4.A00
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x020f
        L_0x023b:
            boolean r1 = r4 instanceof X.C174688xB
            if (r1 == 0) goto L_0x0278
            X.8xB r4 = (X.C174688xB) r4
            X.8wF r0 = (X.C174108wF) r0
            int r5 = r0.A00
            if (r5 == 0) goto L_0x0af3
            r1 = 1
            r3 = 0
            com.whatsapp.WaTextView r2 = r4.A00
            if (r5 == r1) goto L_0x0264
            r1 = 2131887040(0x7f1203c0, float:1.9408676E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r2 = r4.A01
            r2.setVisibility(r3)
            r1 = 2131887092(0x7f1203f4, float:1.9408781E38)
            r2.setText(r1)
            r1 = 49
        L_0x0260:
            X.AFN.A00(r2, r0, r1)
            return
        L_0x0264:
            r1 = 2131887050(0x7f1203ca, float:1.9408696E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r2 = r4.A01
            r2.setVisibility(r3)
            r1 = 2131887092(0x7f1203f4, float:1.9408781E38)
            r2.setText(r1)
            r1 = 48
            goto L_0x0260
        L_0x0278:
            boolean r1 = r4 instanceof X.C174678xA
            if (r1 == 0) goto L_0x02b2
            X.8xA r4 = (X.C174678xA) r4
            X.8vr r0 = (X.C173868vr) r0
            com.whatsapp.WaTextView r3 = r4.A01
            android.view.View r5 = r4.A0H
            android.content.Context r2 = r5.getContext()
            X.A6f r1 = r0.A00
            java.lang.String r1 = X.C196589vJ.A01(r2, r1)
            r3.setText(r1)
            com.whatsapp.WaImageView r4 = r4.A00
            android.content.Context r3 = r5.getContext()
            X.A6f r1 = r0.A00
            java.lang.String r2 = r1.A08
            java.lang.String r1 = "device"
            boolean r2 = r1.equals(r2)
            r1 = 2131232063(0x7f08053f, float:1.8080225E38)
            if (r2 == 0) goto L_0x02a9
            r1 = 2131232133(0x7f080585, float:1.8080367E38)
        L_0x02a9:
            X.AnonymousClass3MX.A1B(r3, r4, r1)
            X.1rL r0 = r0.A01
            r5.setOnClickListener(r0)
            return
        L_0x02b2:
            boolean r1 = r4 instanceof X.C174878xU
            if (r1 == 0) goto L_0x02c6
            X.8xU r4 = (X.C174878xU) r4
            androidx.recyclerview.widget.RecyclerView r1 = r4.A00
            X.8He r0 = r4.A01
            r1.setAdapter(r0)
            java.lang.String r0 = "historyBarItems"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02c6:
            boolean r1 = r4 instanceof X.C174868xT
            if (r1 == 0) goto L_0x02e5
            X.8xT r4 = (X.C174868xT) r4
            X.8wC r0 = (X.C174078wC) r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.A00
            X.8Ht r3 = r4.A01
            r1.setAdapter(r3)
            java.util.List r2 = r0.A01
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            r3.A02 = r2
            r3.notifyDataSetChanged()
            X.BCk r0 = r0.A00
            r3.A01 = r0
            return
        L_0x02e5:
            boolean r1 = r4 instanceof X.C174668x9
            if (r1 == 0) goto L_0x0303
            X.8x9 r4 = (X.C174668x9) r4
            X.8wT r0 = (X.C174248wT) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            com.google.android.material.chip.Chip r3 = r4.A00
            java.lang.String r1 = r0.A01
            r3.setText(r1)
            r2 = 47
            X.AFN r1 = new X.AFN
            r1.<init>(r0, r2)
            r3.setOnCloseIconClickListener(r1)
            return
        L_0x0303:
            boolean r1 = r4 instanceof X.C174998xg
            if (r1 == 0) goto L_0x031f
            X.8xg r4 = (X.C174998xg) r4
            X.8wK r0 = (X.C174158wK) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            r4.A03 = r0
            X.AGj r1 = r4.A01
            X.Bth r3 = r1.A00
            r2 = 1
            X.AIA r1 = new X.AIA
            r1.<init>(r0, r4, r2)
            r3.A0J(r1)
            return
        L_0x031f:
            boolean r1 = r4 instanceof X.C174788xL
            if (r1 == 0) goto L_0x034a
            X.8xL r4 = (X.C174788xL) r4
            X.8wG r0 = (X.C174118wG) r0
            android.view.View r6 = r4.A0H
            android.content.Context r5 = r6.getContext()
            com.whatsapp.WaTextView r2 = r4.A02
            java.lang.String r1 = r0.A02
            r2.setText(r1)
            r3 = 2131100065(0x7f0601a1, float:1.78125E38)
            android.widget.FrameLayout r2 = r4.A00
            r1 = 0
            r2.setBackground(r1)
            com.whatsapp.WaImageView r2 = r4.A01
            int r1 = r0.A00
            X.AnonymousClass4aX.A0B(r5, r2, r1, r3)
            X.1rL r0 = r0.A01
            r6.setOnClickListener(r0)
            return
        L_0x034a:
            boolean r1 = r4 instanceof X.C174518wu
            if (r1 == 0) goto L_0x0355
            java.lang.String r0 = "onClickListener"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0355:
            boolean r1 = r4 instanceof X.C174838xQ
            if (r1 == 0) goto L_0x03b1
            X.8xQ r4 = (X.C174838xQ) r4
            X.8wb r0 = (X.C174328wb) r0
            boolean r1 = r0.A03
            r5 = 0
            r6 = 8
            if (r1 == 0) goto L_0x03a1
            com.whatsapp.WaTextView r2 = r4.A02
            java.lang.String r1 = r0.A02
            r2.setText(r1)
            java.lang.String r3 = r0.A01
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            com.whatsapp.WaTextView r1 = r4.A03
            if (r2 == 0) goto L_0x039a
            r1.setVisibility(r6)
        L_0x0378:
            android.widget.LinearLayout r1 = r4.A00
            r1.setVisibility(r5)
            com.whatsapp.WaTextView r1 = r4.A04
            r1.setVisibility(r6)
        L_0x0382:
            com.whatsapp.WaImageView r3 = r4.A01
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x038a
            r5 = 8
        L_0x038a:
            r3.setVisibility(r5)
            android.view.View r2 = r4.A0H
            r1 = 45
            X.AFN.A00(r2, r0, r1)
            r1 = 46
            X.AFN.A00(r3, r0, r1)
            return
        L_0x039a:
            r1.setVisibility(r5)
            r1.setText(r3)
            goto L_0x0378
        L_0x03a1:
            com.whatsapp.WaTextView r2 = r4.A04
            java.lang.String r1 = r0.A02
            r2.setText(r1)
            android.widget.LinearLayout r1 = r4.A00
            r1.setVisibility(r6)
            r2.setVisibility(r5)
            goto L_0x0382
        L_0x03b1:
            boolean r1 = r4 instanceof X.C174628x5
            if (r1 == 0) goto L_0x03c5
            X.8x5 r4 = (X.C174628x5) r4
            X.8w5 r0 = (X.C174008w5) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            com.whatsapp.WaTextView r1 = r4.A00
            X.1rL r0 = r0.A00
            r1.setOnClickListener(r0)
            return
        L_0x03c5:
            boolean r1 = r4 instanceof X.C174618x4
            if (r1 == 0) goto L_0x03e1
            X.8x4 r4 = (X.C174618x4) r4
            X.8Dq r3 = r4.A00
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131887066(0x7f1203da, float:1.9408729E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0m(r2, r1)
            r3.setSearchHint(r1)
            r1 = 44
            X.AFN.A00(r3, r0, r1)
            return
        L_0x03e1:
            boolean r1 = r4 instanceof X.C174908xX
            if (r1 == 0) goto L_0x0406
            X.8xX r4 = (X.C174908xX) r4
            X.8w7 r0 = (X.C174028w7) r0
            X.8Hb r2 = r4.A04
            java.util.List r1 = r0.A01
            r2.A00 = r1
            r2.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r1 = r4.A02
            r1.setAdapter(r2)
            com.whatsapp.WaTextView r2 = r4.A03
            r1 = 42
            X.AFN.A00(r2, r0, r1)
            android.view.View r2 = r4.A00
            r1 = 43
            X.AFN.A00(r2, r0, r1)
            return
        L_0x0406:
            boolean r1 = r4 instanceof X.C174988xf
            if (r1 == 0) goto L_0x0435
            X.8xf r4 = (X.C174988xf) r4
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1XN r0 = r4.A03
            boolean r0 = r0.A01()
            r2 = 8
            if (r0 == 0) goto L_0x041b
            r2 = 6
        L_0x041b:
            r1 = 0
        L_0x041c:
            X.9Pl r0 = new X.9Pl
            r0.<init>()
            r3.add(r0)
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x041c
            X.8Ha r1 = r4.A02
            r1.A00 = r3
            r1.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            r0.setAdapter(r1)
            return
        L_0x0435:
            boolean r1 = r4 instanceof X.C174498ws
            if (r1 == 0) goto L_0x0464
            X.8wc r0 = (X.C174338wc) r0
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            android.view.View r2 = r4.A0H
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.C18070vi.A0z(r2, r1)
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r3 = r0.A00
            if (r3 == 0) goto L_0x0b03
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0b03
            android.content.Context r2 = r2.getContext()
            r1 = 2131887099(0x7f1203fb, float:1.9408796E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            r0[r5] = r3
            X.AnonymousClass3MY.A0y(r2, r4, r0, r1)
            return
        L_0x0464:
            boolean r1 = r4 instanceof X.C174658x8
            if (r1 == 0) goto L_0x0472
            X.8x8 r4 = (X.C174658x8) r4
            com.whatsapp.WaTextView r2 = r4.A00
            r1 = 41
            X.AFN.A00(r2, r0, r1)
            return
        L_0x0472:
            boolean r1 = r4 instanceof X.C174738xG
            if (r1 == 0) goto L_0x0487
            X.8xG r4 = (X.C174738xG) r4
            com.whatsapp.TextEmojiLabel r2 = r4.A01
            r1 = 39
            X.AFN.A00(r2, r0, r1)
            android.view.View r2 = r4.A00
            r1 = 40
            X.AFN.A00(r2, r0, r1)
            return
        L_0x0487:
            boolean r1 = r4 instanceof X.C174728xF
            if (r1 == 0) goto L_0x0511
            X.8xF r4 = (X.C174728xF) r4
            X.8wW r0 = (X.C174278wW) r0
            r6 = 0
            X.C18070vi.A0d(r0, r6)
            com.whatsapp.WaTextView r5 = r4.A00
            java.util.List r3 = r0.A02
            int r1 = r3.size()
            r2 = 3
            if (r1 > r2) goto L_0x04a0
            r6 = 8
        L_0x04a0:
            r5.setVisibility(r6)
            r1 = 38
            X.AFN.A00(r5, r0, r1)
            X.8vh r4 = r4.A01
            java.util.List r1 = X.C29431cG.A0v(r3, r2)
            java.util.ArrayList r3 = X.C29351c6.A0D(r1)
            java.util.Iterator r7 = r1.iterator()
        L_0x04b6:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0b0a
            java.lang.Object r13 = r7.next()
            X.AF0 r13 = (X.AF0) r13
            X.A6f r6 = r0.A00
            java.lang.String r2 = r6.A08
            java.lang.String r1 = "country_default"
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 != 0) goto L_0x050f
            java.lang.Double r1 = r6.A03
            X.C18070vi.A0b(r1)
            double r1 = r1.doubleValue()
            java.lang.Double r5 = r6.A04
            X.C18070vi.A0b(r5)
            com.google.android.gms.maps.model.LatLng r9 = X.AnonymousClass8BV.A09(r5, r1)
        L_0x04e0:
            int r15 = r6.A03()
            boolean r1 = r6.A07()
            if (r1 == 0) goto L_0x04f2
            boolean r1 = r13.A02()
            r16 = 1
            if (r1 != 0) goto L_0x04f4
        L_0x04f2:
            r16 = 0
        L_0x04f4:
            X.APQ r10 = new X.APQ
            r10.<init>(r0, r13)
            r1 = 0
            X.APU r11 = new X.APU
            r11.<init>(r1)
            r12 = 0
            r14 = 11
            X.8wY r8 = new X.8wY
            r17 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r8.A05 = r1
            r3.add(r8)
            goto L_0x04b6
        L_0x050f:
            r9 = 0
            goto L_0x04e0
        L_0x0511:
            boolean r1 = r4 instanceof X.C174608x3
            if (r1 == 0) goto L_0x0553
            X.8x3 r4 = (X.C174608x3) r4
            X.8wP r0 = (X.C174208wP) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            android.view.View r5 = r4.A00
            r1 = 2131435413(0x7f0b1f95, float:1.8492667E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0C(r5, r1)
            r4.removeAllViews()
            boolean r0 = r0.A00
            r3 = 1
            if (r0 == 0) goto L_0x0538
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            r0 = 2131624633(0x7f0e02b9, float:1.8876451E38)
            r1.inflate(r0, r4, r3)
        L_0x0538:
            r2 = 0
        L_0x0539:
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            r0 = 2131624390(0x7f0e01c6, float:1.8875958E38)
            r1.inflate(r0, r4, r3)
            int r2 = r2 + 1
            r0 = 3
            if (r2 < r0) goto L_0x0539
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            r0 = 2131626144(0x7f0e08a0, float:1.8879516E38)
            r1.inflate(r0, r4, r3)
            return
        L_0x0553:
            boolean r1 = r4 instanceof X.C174598x2
            if (r1 == 0) goto L_0x0571
            X.8x2 r4 = (X.C174598x2) r4
            android.view.View r1 = r4.A00
            r0 = 2131435413(0x7f0b1f95, float:1.8492667E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MW.A0C(r1, r0)
            r3.removeAllViews()
            r2 = 1
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r1)
            r0 = 2131625758(0x7f0e071e, float:1.8878733E38)
            r1.inflate(r0, r3, r2)
            return
        L_0x0571:
            boolean r1 = r4 instanceof X.C174828xP
            if (r1 == 0) goto L_0x05b8
            X.8xP r4 = (X.C174828xP) r4
            X.8wS r0 = (X.C174238wS) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A03
            r1 = 36
            X.AFN.A00(r2, r0, r1)
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A04
            r1 = 37
            X.AFN.A00(r2, r0, r1)
            com.whatsapp.WaImageView r3 = r4.A01
            if (r3 == 0) goto L_0x05a3
            android.content.Context r2 = X.C108945cZ.A0D(r4)
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0599
            java.lang.String r0 = ""
        L_0x0599:
            int r1 = X.C181159Pj.A00(r0)
            r0 = 2131099850(0x7f0600ca, float:1.7812065E38)
            X.AnonymousClass4aX.A0B(r2, r3, r1, r0)
        L_0x05a3:
            com.whatsapp.TextEmojiLabel r3 = r4.A00
            if (r3 == 0) goto L_0x0021
            X.9yV r2 = r4.A02
            android.content.Context r1 = X.C108945cZ.A0D(r4)
            r0 = 2131887052(0x7f1203cc, float:1.94087E38)
            java.lang.String r0 = r1.getString(r0)
            X.C196599vK.A01(r3, r2, r0)
            return
        L_0x05b8:
            boolean r1 = r4 instanceof X.C174588x1
            if (r1 == 0) goto L_0x05f1
            X.8x1 r4 = (X.C174588x1) r4
            X.8w8 r0 = (X.C174038w8) r0
            r7 = 0
            X.C18070vi.A0d(r0, r7)
            java.lang.String r6 = r0.A01
            if (r6 == 0) goto L_0x05e8
            int r1 = r6.length()
            if (r1 == 0) goto L_0x05e8
            com.whatsapp.WaTextView r5 = r4.A00
            android.content.Context r3 = X.C108945cZ.A0D(r4)
            r2 = 2131886987(0x7f12038b, float:1.9408568E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r1[r7] = r6
            X.AnonymousClass3MY.A0y(r3, r5, r1, r2)
        L_0x05e0:
            android.view.View r1 = r4.A0H
            X.1rL r0 = r0.A00
            r1.setOnClickListener(r0)
            return
        L_0x05e8:
            com.whatsapp.WaTextView r2 = r4.A00
            r1 = 2131886986(0x7f12038a, float:1.9408566E38)
            r2.setText(r1)
            goto L_0x05e0
        L_0x05f1:
            boolean r1 = r4 instanceof X.C174478wq
            if (r1 == 0) goto L_0x0625
            X.8wa r0 = (X.C174318wa) r0
            android.view.View r4 = r4.A0H
            r1 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r4, r1)
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r4)
            r1 = 2131166478(0x7f07050e, float:1.7947202E38)
            int r2 = r2.getDimensionPixelSize(r1)
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x061b
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r4)
            r0 = 2131168346(0x7f070c5a, float:1.7950991E38)
            int r2 = r1.getDimensionPixelSize(r0)
        L_0x061b:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r0.width = r2
            X.AnonymousClass3MX.A1F(r3, r2)
            return
        L_0x0625:
            boolean r1 = r4 instanceof X.C174578x0
            if (r1 == 0) goto L_0x0678
            X.8x0 r4 = (X.C174578x0) r4
            android.view.ViewGroup r7 = r4.A00
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r6 = r0.getResources()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r0)
            android.view.View r1 = r4.A0H
            r0 = 2131435413(0x7f0b1f95, float:1.8492667E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0C(r1, r0)
            r4.removeAllViews()
            r3 = 0
            r2 = 0
            r1 = 0
        L_0x0648:
            int r0 = r7.getChildCount()
            if (r2 >= r0) goto L_0x0659
            android.view.View r0 = r7.getChildAt(r2)
            int r1 = X.AnonymousClass3MW.A02(r0, r1)
            int r2 = r2 + 1
            goto L_0x0648
        L_0x0659:
            r0 = 2131165804(0x7f07026c, float:1.7945835E38)
            int r2 = r6.getDimensionPixelSize(r0)
            int r0 = r7.getHeight()
            int r0 = r0 - r1
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            int r2 = java.lang.Math.round(r1)
        L_0x066c:
            if (r3 >= r2) goto L_0x0021
            r1 = 2131626751(0x7f0e0aff, float:1.8880747E38)
            r0 = 1
            r5.inflate(r1, r4, r0)
            int r3 = r3 + 1
            goto L_0x066c
        L_0x0678:
            boolean r1 = r4 instanceof X.C174568wz
            if (r1 == 0) goto L_0x06e1
            X.8wz r4 = (X.C174568wz) r4
            X.8wD r0 = (X.C174088wD) r0
            android.view.ViewGroup r7 = r4.A00
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r8 = r1.getResources()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r1)
            android.view.View r2 = r4.A0H
            r1 = 2131435413(0x7f0b1f95, float:1.8492667E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0C(r2, r1)
            r4.removeAllViews()
            boolean r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x06a5
            r1 = 2131624369(0x7f0e01b1, float:1.8875916E38)
            r5.inflate(r1, r4, r3)
        L_0x06a5:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x06af
            r0 = 2131625758(0x7f0e071e, float:1.8878733E38)
            r5.inflate(r0, r4, r3)
        L_0x06af:
            r6 = 0
            r2 = 0
            r1 = 0
        L_0x06b2:
            int r0 = r7.getChildCount()
            if (r2 >= r0) goto L_0x06c3
            android.view.View r0 = r7.getChildAt(r2)
            int r1 = X.AnonymousClass3MW.A02(r0, r1)
            int r2 = r2 + 1
            goto L_0x06b2
        L_0x06c3:
            r0 = 2131165567(0x7f07017f, float:1.7945355E38)
            int r2 = r8.getDimensionPixelSize(r0)
            int r0 = r7.getHeight()
            int r0 = r0 - r1
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            int r1 = java.lang.Math.round(r1)
        L_0x06d6:
            if (r6 >= r1) goto L_0x0021
            r0 = 2131624390(0x7f0e01c6, float:1.8875958E38)
            r5.inflate(r0, r4, r3)
            int r6 = r6 + 1
            goto L_0x06d6
        L_0x06e1:
            boolean r1 = r4 instanceof X.C174468wp
            if (r1 == 0) goto L_0x06ff
            X.8vq r0 = (X.C173858vq) r0
            android.view.View r3 = X.C108965cb.A09(r4, r0)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.C18070vi.A0z(r3, r1)
            r2 = r3
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131887101(0x7f1203fd, float:1.94088E38)
            r2.setText(r1)
            android.view.View$OnClickListener r0 = r0.A00
            r3.setOnClickListener(r0)
            return
        L_0x06ff:
            boolean r1 = r4 instanceof X.C174718xE
            if (r1 == 0) goto L_0x07b9
            X.8xE r4 = (X.C174718xE) r4
            X.8wV r0 = (X.C174268wV) r0
            r12 = 0
            X.C18070vi.A0d(r0, r12)
            com.whatsapp.TextEmojiLabel r5 = r4.A01
            X.A6f r3 = r0.A01
            java.lang.String r9 = r3.A08
            java.lang.String r8 = "device"
            boolean r1 = X.C18070vi.A18(r9, r8)
            android.view.View r7 = r4.A00
            android.content.Context r10 = r7.getContext()
            android.content.Context r6 = r7.getContext()
            if (r1 == 0) goto L_0x07b1
            r2 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r1 = 2131102239(0x7f060a1f, float:1.781691E38)
        L_0x0729:
            X.C72463Mc.A0w(r6, r10, r5, r2, r1)
            com.whatsapp.WaTextView r2 = r4.A02
            int r1 = r0.A00
            r2.setText(r1)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "# "
            r2.append(r1)
            android.content.Context r1 = r7.getContext()
            java.lang.String r1 = X.C196589vJ.A01(r1, r3)
            java.lang.String r2 = X.AnonymousClass000.A0y(r1, r2)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r2)
            r10.append(r1)
            android.content.Context r2 = r7.getContext()
            r1 = 2131232063(0x7f08053f, float:1.8080225E38)
            android.graphics.drawable.Drawable r6 = X.C24261Jm.A00(r2, r1)
            android.content.Context r4 = r7.getContext()
            android.content.Context r3 = r7.getContext()
            r2 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r1 = 2131101312(0x7f060680, float:1.781503E38)
            int r2 = X.AnonymousClass3MZ.A02(r3, r4, r2, r1)
            boolean r1 = X.C18070vi.A18(r9, r8)
            if (r1 == 0) goto L_0x0795
            android.content.Context r2 = r7.getContext()
            r1 = 2131232133(0x7f080585, float:1.8080367E38)
            android.graphics.drawable.Drawable r6 = X.C24261Jm.A00(r2, r1)
            android.content.Context r4 = r7.getContext()
            android.content.Context r3 = r7.getContext()
            r2 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r1 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r2 = X.AnonymousClass3MZ.A02(r3, r4, r2, r1)
        L_0x0795:
            X.C17960vV.A07(r6)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass4aX.A08(r6, r2)
            X.C18070vi.A0X(r9)
            android.text.TextPaint r8 = r5.getPaint()
            r13 = 1
            r11 = -1
            X.C72813Np.A04(r8, r9, r10, r11, r12, r13)
            r5.setText(r10)
            r1 = 35
            X.AFN.A00(r5, r0, r1)
            return
        L_0x07b1:
            r2 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r1 = 2131101312(0x7f060680, float:1.781503E38)
            goto L_0x0729
        L_0x07b9:
            boolean r1 = r4 instanceof X.C174818xO
            if (r1 == 0) goto L_0x0872
            X.8xO r4 = (X.C174818xO) r4
            X.8wZ r0 = (X.C174308wZ) r0
            com.whatsapp.WaTextView r3 = r4.A01
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x086d;
                case 1: goto L_0x0868;
                case 2: goto L_0x0863;
                case 3: goto L_0x085e;
                case 4: goto L_0x07c8;
                case 5: goto L_0x07c8;
                case 6: goto L_0x0859;
                case 7: goto L_0x0854;
                default: goto L_0x07c8;
            }
        L_0x07c8:
            r1 = 2131887093(0x7f1203f5, float:1.9408783E38)
        L_0x07cb:
            r3.setText(r1)
            X.BCq r3 = r0.A01
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L_0x0847
            r0 = 2
            if (r2 == r0) goto L_0x0847
            if (r2 == 0) goto L_0x083d
            r0 = 7
            if (r2 == r0) goto L_0x083d
            r0 = 6
            if (r2 == r0) goto L_0x083d
            com.whatsapp.WaTextView r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r4.A0H
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x07ec:
            com.whatsapp.WaTextView r5 = r4.A00
            r0 = 0
            r5.setVisibility(r0)
            if (r2 == 0) goto L_0x082f
            r0 = 3
            if (r2 == r0) goto L_0x082f
            r0 = 4
            if (r2 == r0) goto L_0x0823
            r0 = 5
            if (r2 == r0) goto L_0x081a
            r0 = 6
            if (r2 == r0) goto L_0x082f
            r0 = 7
            if (r2 == r0) goto L_0x082f
            r0 = 8
            r5.setVisibility(r0)
            r1 = 0
        L_0x0809:
            r5.setOnClickListener(r1)
        L_0x080c:
            com.whatsapp.WaTextView r1 = r4.A03
            if (r2 != 0) goto L_0x0b0e
            r0 = 0
            r1.setVisibility(r0)
            r0 = 30
            X.AFN.A00(r1, r3, r0)
            return
        L_0x081a:
            r0 = 2131887015(0x7f1203a7, float:1.9408625E38)
            r5.setText(r0)
            r0 = 32
            goto L_0x082b
        L_0x0823:
            r0 = 2131887142(0x7f120426, float:1.9408883E38)
            r5.setText(r0)
            r0 = 31
        L_0x082b:
            X.AFN.A00(r5, r3, r0)
            goto L_0x080c
        L_0x082f:
            r0 = 2131887058(0x7f1203d2, float:1.9408712E38)
            r5.setText(r0)
            r0 = 8
            X.4dX r1 = new X.4dX
            r1.<init>(r3, r2, r0)
            goto L_0x0809
        L_0x083d:
            com.whatsapp.WaTextView r0 = r4.A02
            r0.setVisibility(r1)
            android.view.View r1 = r4.A0H
            r0 = 34
            goto L_0x0850
        L_0x0847:
            com.whatsapp.WaTextView r0 = r4.A02
            r0.setVisibility(r1)
            android.view.View r1 = r4.A0H
            r0 = 33
        L_0x0850:
            X.AFN.A00(r1, r3, r0)
            goto L_0x07ec
        L_0x0854:
            r1 = 2131887040(0x7f1203c0, float:1.9408676E38)
            goto L_0x07cb
        L_0x0859:
            r1 = 2131892928(0x7f121ac0, float:1.9420618E38)
            goto L_0x07cb
        L_0x085e:
            r1 = 2131887094(0x7f1203f6, float:1.9408785E38)
            goto L_0x07cb
        L_0x0863:
            r1 = 2131887102(0x7f1203fe, float:1.9408802E38)
            goto L_0x07cb
        L_0x0868:
            r1 = 2131887097(0x7f1203f9, float:1.9408791E38)
            goto L_0x07cb
        L_0x086d:
            r1 = 2131887095(0x7f1203f7, float:1.9408787E38)
            goto L_0x07cb
        L_0x0872:
            boolean r1 = r4 instanceof X.C174428wl
            if (r1 == 0) goto L_0x0882
            X.8vp r0 = (X.C173848vp) r0
            android.view.View r1 = X.C108965cb.A09(r4, r0)
            android.view.View$OnClickListener r0 = r0.A00
            r1.setOnClickListener(r0)
            return
        L_0x0882:
            boolean r1 = r4 instanceof X.C174418wk
            if (r1 == 0) goto L_0x089e
            X.8w6 r0 = (X.C174018w6) r0
            android.view.View r2 = X.C108965cb.A09(r4, r0)
            android.view.View$OnClickListener r1 = r0.A00
            r2.setOnClickListener(r1)
            r1 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r2, r1)
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            return
        L_0x089e:
            boolean r1 = r4 instanceof X.C174808xN
            if (r1 == 0) goto L_0x08ef
            X.8xN r4 = (X.C174808xN) r4
            X.8wJ r0 = (X.C174148wJ) r0
            java.lang.String r3 = r0.A02
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x08e6
            X.9kB r2 = r4.A04
            com.whatsapp.WaImageView r1 = r4.A03
            r2.A00(r1, r3)
        L_0x08b5:
            android.widget.TextView r2 = r4.A00
            java.lang.String r1 = r0.A01
            r2.setText(r1)
            java.lang.String r6 = r0.A03
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            r3 = 0
            r2 = 8
            android.widget.TextView r1 = r4.A01
            if (r5 != 0) goto L_0x08e2
            r1.setVisibility(r3)
            r1.setText(r6)
        L_0x08cf:
            com.whatsapp.WaImageView r2 = r4.A02
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x08d7
            r3 = 8
        L_0x08d7:
            r2.setVisibility(r3)
            android.view.View r1 = r4.A0H
            X.1rL r0 = r0.A00
            r1.setOnClickListener(r0)
            return
        L_0x08e2:
            r1.setVisibility(r2)
            goto L_0x08cf
        L_0x08e6:
            com.whatsapp.WaImageView r2 = r4.A03
            r1 = 2131232271(0x7f08060f, float:1.8080647E38)
            r2.setImageResource(r1)
            goto L_0x08b5
        L_0x08ef:
            boolean r1 = r4 instanceof X.C175008xh
            if (r1 == 0) goto L_0x094f
            X.8xh r4 = (X.C175008xh) r4
            X.8wB r0 = (X.C174068wB) r0
            r4.A00 = r0
            X.9d1 r3 = r4.A01
            java.util.Queue r6 = r0.A01
            X.8HQ r8 = r3.A01
            java.util.LinkedList r7 = X.AnonymousClass8BR.A14()
            boolean r2 = r6.isEmpty()
            androidx.recyclerview.widget.RecyclerView r5 = r3.A00
            android.content.Context r1 = r5.getContext()
            r0 = 2131889608(0x7f120dc8, float:1.9413884E38)
            java.lang.String r1 = r1.getString(r0)
            X.BAV r4 = r3.A02
            X.8kG r0 = new X.8kG
            r0.<init>(r4, r1, r2)
            r7.add(r0)
            java.util.Iterator r3 = r6.iterator()
        L_0x0922:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x093d
            java.lang.Object r2 = r3.next()
            X.9rR r2 = (X.C194259rR) r2
            boolean r0 = r3.hasNext()
            r1 = r0 ^ 1
            X.8kF r0 = new X.8kF
            r0.<init>(r4, r2, r1)
            r7.add(r0)
            goto L_0x0922
        L_0x093d:
            r8.A0W(r7)
            int r1 = r6.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0021
            int r0 = r6.size()
            r5.A0g(r0)
            return
        L_0x094f:
            boolean r1 = r4 instanceof X.C174918xY
            if (r1 == 0) goto L_0x09b3
            X.8xY r4 = (X.C174918xY) r4
            X.8wI r0 = (X.C174138wI) r0
            X.1pZ r3 = r4.A01
            java.lang.String r1 = r0.A03
            X.1BI r1 = X.AnonymousClass3MX.A0l(r1)
            X.1E7 r2 = new X.1E7
            r2.<init>(r1)
            com.whatsapp.CircleWaImageView r1 = r4.A02
            r5 = 0
            r3.A0C(r1, r2, r5)
            X.AQA r2 = new X.AQA
            r2.<init>(r0, r4, r5)
            r4.A00 = r2
            X.1Lf r1 = r4.A07
            r1.registerObserver(r2)
            java.util.List r3 = r0.A04
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x09ab
            java.lang.String r1 = X.C17880vN.A0w(r3, r5)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x09ab
            com.whatsapp.WaTextView r2 = r4.A05
            java.lang.String r1 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r1, r3)
            r2.setText(r1)
            r2.setVisibility(r5)
        L_0x0996:
            com.whatsapp.WaTextView r2 = r4.A04
            java.lang.String r1 = r0.A02
            r2.setText(r1)
            com.whatsapp.WaImageView r2 = r4.A03
            r1 = 26
            X.AFN.A00(r2, r0, r1)
            android.view.View r2 = r4.A0H
            r1 = 5
            X.C89994dM.A00(r2, r4, r0, r1)
            return
        L_0x09ab:
            com.whatsapp.WaTextView r2 = r4.A05
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x0996
        L_0x09b3:
            boolean r1 = r4 instanceof X.C174858xS
            if (r1 == 0) goto L_0x09c3
            X.8xS r4 = (X.C174858xS) r4
            X.8wY r0 = (X.C174298wY) r0
            r4.A00 = r0
            X.A7p r1 = r4.A01
            r1.A06(r0)
            return
        L_0x09c3:
            boolean r1 = r4 instanceof X.C174798xM
            if (r1 == 0) goto L_0x09f5
            X.8xM r4 = (X.C174798xM) r4
            java.lang.String r0 = "https://faq.whatsapp.com/591394022726343"
            android.net.Uri r5 = android.net.Uri.parse(r0)
            X.C18070vi.A0X(r5)
            X.0ve r10 = r4.A04
            X.1KB r7 = r4.A01
            android.content.Context r1 = X.C108945cZ.A0D(r4)
            r0 = 2131886974(0x7f12037e, float:1.9408542E38)
            java.lang.String r11 = X.C18070vi.A0F(r1, r0)
            com.whatsapp.TextEmojiLabel r8 = r4.A02
            X.1L9 r6 = r4.A00
            X.11C r9 = r4.A03
            java.lang.String r12 = "learn-more"
            r0 = 5
            X.C18070vi.A0d(r8, r0)
            android.content.Context r4 = r8.getContext()
            X.C26302CxJ.A0K(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x09f5:
            boolean r1 = r4 instanceof X.C174558wy
            if (r1 == 0) goto L_0x0a10
            X.8wy r4 = (X.C174558wy) r4
            X.8Dq r3 = r4.A00
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131886975(0x7f12037f, float:1.9408544E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0m(r2, r1)
            r3.setSearchHint(r1)
            r1 = 5
            X.AFN.A00(r3, r0, r1)
            return
        L_0x0a10:
            boolean r1 = r4 instanceof X.C174378wg
            if (r1 == 0) goto L_0x0a38
            android.view.View r1 = r4.A0H
            android.content.Context r0 = X.AnonymousClass3MY.A04(r1)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r0)
            r0 = 2131433965(0x7f0b19ed, float:1.848973E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeAllViews()
            r2 = 0
        L_0x0a2b:
            r1 = 2131626499(0x7f0e0a03, float:1.8880236E38)
            r0 = 1
            r4.inflate(r1, r3, r0)
            int r2 = r2 + 1
            r0 = 6
            if (r2 >= r0) goto L_0x0021
            goto L_0x0a2b
        L_0x0a38:
            boolean r1 = r4 instanceof X.C174648x7
            if (r1 == 0) goto L_0x0a69
            X.8x7 r4 = (X.C174648x7) r4
            X.8wA r0 = (X.C174058wA) r0
            int r3 = r0.A00
            r1 = 1
            if (r3 == r1) goto L_0x0b14
            r1 = 2
            r2 = 2131896262(0x7f1227c6, float:1.942738E38)
            if (r3 == r1) goto L_0x0a4e
            r2 = 2131895516(0x7f1224dc, float:1.9425867E38)
        L_0x0a4e:
            com.whatsapp.WaTextView r1 = r4.A01
            r1.setText(r2)
            com.whatsapp.WaTextView r2 = r4.A00
            r1 = 2131897145(0x7f122b39, float:1.9429171E38)
            r2.setText(r1)
            r1 = 0
            r2.setVisibility(r1)
            X.B7b r1 = r0.A01
            X.C17960vV.A07(r1)
            r1 = 4
            X.AFN.A00(r2, r0, r1)
            return
        L_0x0a69:
            boolean r1 = r4 instanceof X.C174848xR
            if (r1 == 0) goto L_0x0021
            X.8xR r4 = (X.C174848xR) r4
            X.8wX r0 = (X.C174288wX) r0
            r8 = 0
            X.C18070vi.A0d(r0, r8)
            android.widget.TextView r6 = r4.A04
            java.lang.String r1 = r0.A01
            r6.setText(r1)
            java.lang.Integer r7 = r0.A00
            if (r7 == 0) goto L_0x0acb
            int r1 = r7.intValue()
            if (r1 == 0) goto L_0x0acb
            android.widget.TextView r5 = r4.A03
            r5.setVisibility(r8)
            X.0vb r1 = r4.A05
            java.util.Locale r3 = r1.A0N()
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object[] r2 = X.C108945cZ.A1b(r7, r1, r8, r2)
            java.lang.String r1 = "%,d"
            java.lang.String r1 = X.C108955ca.A12(r3, r1, r2)
            r5.setText(r1)
        L_0x0aa1:
            X.1OS r3 = r0.A04
            android.widget.ImageView r2 = r4.A02
            java.lang.String r1 = r0.A02
            r3.invoke(r2, r1)
            android.view.View r2 = r4.A00
            r1 = 3
            X.AFN.A00(r2, r0, r1)
            X.0vb r0 = r4.A05
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            android.widget.ImageView r1 = r4.A01
            if (r0 == 0) goto L_0x0ac4
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.setScaleX(r0)
            r0 = 5
        L_0x0ac0:
            r6.setGravity(r0)
            return
        L_0x0ac4:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleY(r0)
            r0 = 3
            goto L_0x0ac0
        L_0x0acb:
            android.widget.TextView r2 = r4.A03
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x0aa1
        L_0x0ad3:
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A01
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r1.setImageResource(r0)
            return
        L_0x0adc:
            X.8wE r0 = (X.C174098wE) r0
            r4.A0D(r0)
            return
        L_0x0ae2:
            r11.setText(r9)
            return
        L_0x0ae6:
            android.widget.TextView r1 = r4.A00
            r0 = 2131887021(0x7f1203ad, float:1.9408637E38)
            goto L_0x0aef
        L_0x0aec:
            r0 = 2131887064(0x7f1203d8, float:1.9408725E38)
        L_0x0aef:
            r1.setText(r0)
            return
        L_0x0af3:
            com.whatsapp.WaTextView r1 = r4.A00
            r0 = 2131887067(0x7f1203db, float:1.940873E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r4.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0b03:
            r0 = 2131887098(0x7f1203fa, float:1.9408793E38)
            r4.setText(r0)
            return
        L_0x0b0a:
            r4.A0W(r3)
            return
        L_0x0b0e:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0b14:
            com.whatsapp.WaTextView r1 = r4.A01
            r0 = 2131895515(0x7f1224db, float:1.9425865E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r4.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8IT.A0C(java.lang.Object):void");
    }
}
