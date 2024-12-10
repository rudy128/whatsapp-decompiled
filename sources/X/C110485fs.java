package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.TextData;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.5fs  reason: invalid class name and case insensitive filesystem */
public final class C110485fs extends FrameLayout implements AnonymousClass009 {
    public CardView A00;
    public AnonymousClass86P A01;
    public TextEmojiLabel A02;
    public AnonymousClass11C A03;
    public AnonymousClass11P A04;
    public AnonymousClass1KW A05;
    public C36381nn A06;
    public C32011gU A07;
    public C18010vc A08;
    public AnonymousClass210 A09;
    public AnonymousClass031 A0A;
    public boolean A0B;
    public C136026t9 A0C;
    public final List A0D;

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkifyWeb(C32011gU r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setMessage(AnonymousClass210 r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r5.length != 0) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTextContent(java.lang.String r24) {
        /*
            r23 = this;
            r9 = r24
            android.text.SpannableStringBuilder r8 = X.AnonymousClass3MW.A09(r9)
            r7 = r23
            X.11C r1 = r7.getSystemServices()
            X.0vc r0 = r7.getSharedPreferencesFactory()
            X.C26302CxJ.A0C(r1, r0, r8)
            X.1gU r0 = r7.getLinkifyWeb()
            r0.A05(r8)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r6 = 0
            java.lang.Object[] r5 = r8.getSpans(r6, r1, r0)
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5
            X.1gU r0 = r7.getLinkifyWeb()
            int r10 = X.AnonymousClass74F.A02(r0, r9)
            com.whatsapp.TextEmojiLabel r3 = r7.A02
            java.lang.String r0 = "textContentView"
            if (r3 != 0) goto L_0x003a
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x003a:
            r0 = 150(0x96, float:2.1E-43)
            if (r10 >= r0) goto L_0x012f
            r0 = 17
            r3.setGravity(r0)
            r0 = 4
            r3.setTextAlignment(r0)
        L_0x0047:
            android.util.DisplayMetrics r1 = X.AnonymousClass3Ma.A09(r7)
            int r0 = r1.heightPixels
            float r11 = (float) r0
            float r0 = r1.density
            float r11 = r11 / r0
            X.1nn r0 = r7.A06
            if (r0 == 0) goto L_0x012c
            X.210 r0 = r7.A09
            if (r0 == 0) goto L_0x012c
            X.C18070vi.A0b(r5)
            int r0 = r5.length
            if (r0 == 0) goto L_0x012c
            X.210 r4 = r7.A09
            if (r4 == 0) goto L_0x012c
            X.1nn r2 = r7.A06
            if (r2 == 0) goto L_0x012c
            r0 = r5[r6]
            java.lang.String r1 = r0.getURL()
            X.1BI r0 = r4.A0H()
            java.util.Set r2 = r2.BX2(r0, r4, r1)
        L_0x0075:
            r0 = 350(0x15e, float:4.9E-43)
            r1 = 0
            if (r10 > r0) goto L_0x007b
            r1 = 1
        L_0x007b:
            X.210 r0 = r7.A09
            if (r0 == 0) goto L_0x0090
            byte[] r0 = r0.A1A()
            if (r0 == 0) goto L_0x0090
            if (r1 == 0) goto L_0x0090
            if (r2 != 0) goto L_0x0090
            X.C18070vi.A0b(r5)
            int r0 = r5.length
            r1 = 1
            if (r0 != 0) goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            int r0 = (int) r11
            int r0 = X.AnonymousClass74F.A01(r10, r0, r1)
            float r1 = (float) r0
            r0 = 2
            r3.setTextSize(r0, r1)
            android.content.Context r2 = r7.getContext()
            android.text.TextPaint r1 = r3.getPaint()
            X.1KW r0 = r7.getEmojiLoader()
            X.C43251zV.A03(r2, r1, r0, r8)
            X.C18070vi.A0b(r5)
            int r4 = r5.length
            r11 = 0
            r14 = 0
        L_0x00b0:
            if (r11 >= r4) goto L_0x013d
            r10 = r5[r11]
            java.lang.String r18 = r10.getURL()
            int r2 = r8.getSpanStart(r10)
            int r1 = r8.getSpanEnd(r10)
            int r0 = r1 - r2
            int r14 = r14 + r0
            r8.removeSpan(r10)
            X.C18070vi.A0b(r18)
            java.lang.String r12 = X.C124326Xx.A00(r18)
            r8.replace(r2, r1, r12)
            int r1 = r12.length()
            int r1 = r1 + r2
            android.content.res.Resources r10 = r7.getResources()
            r0 = 2131168873(0x7f070e69, float:1.795206E38)
            int r13 = X.AnonymousClass3MW.A01(r10, r0)
            float r10 = (float) r13
            r0 = 0
            r3.setShadowLayer(r10, r0, r0, r6)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r10 >= r0) goto L_0x00f0
            r10 = 1
            r0 = 0
            r3.setLayerType(r10, r0)
        L_0x00f0:
            r3.setPadding(r13, r13, r13, r13)
            float r0 = r3.getTextSize()
            int r10 = (int) r0
            java.lang.String r0 = "…"
            boolean r22 = X.AnonymousClass1YF.A0Y(r12, r0, r6)
            X.86P r0 = r7.A01
            X.7Br r15 = new X.7Br
            r20 = r1
            r21 = r10
            r19 = r2
            r17 = r3
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r8.setSpan(r15, r2, r1, r6)
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r10 = r8.getSpans(r2, r1, r0)
            android.text.style.ImageSpan[] r10 = (android.text.style.ImageSpan[]) r10
            X.C18070vi.A0b(r10)
            int r2 = r10.length
            r1 = 0
        L_0x011f:
            if (r1 >= r2) goto L_0x0129
            r0 = r10[r1]
            r8.removeSpan(r0)
            int r1 = r1 + 1
            goto L_0x011f
        L_0x0129:
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x012c:
            r2 = 0
            goto L_0x0075
        L_0x012f:
            r0 = 16
            r3.setGravity(r0)
            r0 = 5
            r3.setTextAlignment(r0)
            r3.setTextDirection(r0)
            goto L_0x0047
        L_0x013d:
            r3.setText(r8)
            r3.requestLayout()
            int r8 = X.C137186v3.A00(r9)
            int r3 = r9.length()
            r2 = 0
        L_0x014c:
            if (r2 >= r3) goto L_0x0162
            if (r8 <= 0) goto L_0x0162
            int r1 = r9.codePointAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 == 0) goto L_0x015c
            int r8 = r8 + -1
        L_0x015c:
            int r0 = java.lang.Character.charCount(r1)
            int r2 = r2 + r0
            goto L_0x014c
        L_0x0162:
            int r8 = r8 - r14
            int r8 = r8 + r4
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r8 <= r0) goto L_0x016a
            r8 = 1000(0x3e8, float:1.401E-42)
        L_0x016a:
            int r0 = r8 * 60
            long r2 = (long) r0
            r0 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r0
            X.11P r1 = r7.getTime()
            X.6t9 r0 = new X.6t9
            r0.<init>(r1, r2)
            r7.A0C = r0
            java.util.List r1 = r7.A0D
            r1.clear()
        L_0x0180:
            if (r6 >= r4) goto L_0x0191
            r0 = r5[r6]
            java.lang.String r0 = r0.getURL()
            X.C18070vi.A0X(r0)
            r1.add(r0)
            int r6 = r6 + 1
            goto L_0x0180
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110485fs.setTextContent(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void setTextContentProperties(TextData textData) {
        int i = textData.textColor;
        if (i != 0) {
            TextEmojiLabel textEmojiLabel = this.A02;
            if (textEmojiLabel != null) {
                textEmojiLabel.setTextColor(i);
            }
            C18070vi.A11("textContentView");
            throw null;
        }
        int i2 = textData.backgroundColor;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setTypeface(AnonymousClass74F.A04(AnonymousClass3MY.A04(this), textData.fontStyle));
            return;
        }
        C18070vi.A11("textContentView");
        throw null;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0A;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final C32011gU getLinkifyWeb() {
        C32011gU r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifyWeb");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final C136026t9 getStaticContentPlayer() {
        C136026t9 r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("staticContentPlayer");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final CardView getWebPagePreviewContainer() {
        CardView cardView = this.A00;
        if (cardView != null) {
            return cardView;
        }
        C18070vi.A11("webPagePreviewContainer");
        throw null;
    }

    public C110485fs(Context context) {
        super(context);
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass3Ma.A0f(A0O);
            this.A07 = AnonymousClass3MY.A0d(A0O);
            this.A08 = AnonymousClass3Ma.A0r(A0O);
            this.A03 = AnonymousClass3Ma.A0a(A0O);
            this.A04 = AnonymousClass10E.A6O(A0O);
        }
        this.A0D = AnonymousClass000.A13();
        View A0A2 = AnonymousClass3MX.A0A(LayoutInflater.from(context), this, 2131627045);
        this.A02 = (TextEmojiLabel) AnonymousClass3MX.A0C(A0A2, 2131432683);
        this.A00 = (CardView) AnonymousClass3MX.A0C(A0A2, 2131437043);
    }

    public final List getDisplayedUrls() {
        return this.A0D;
    }

    public final void setLinkCallback(AnonymousClass86P r1) {
        this.A01 = r1;
    }

    public final void setPhishingManager(C36381nn r1) {
        this.A06 = r1;
    }
}
