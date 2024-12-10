package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.stickers.StickerView;

public class AQ4 implements C22539BBw {
    public View.OnFocusChangeListener A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public EmojiSearchContainer A08;
    public EmojiSearchKeyboardContainer A09;
    public GifSearchContainer A0A;
    public MentionableEntry A0B;
    public AQ3 A0C;
    public C1418377d A0D;
    public StickerView A0E;
    public Integer A0F;
    public final Context A0G;
    public final AnonymousClass11C A0H;
    public final AnonymousClass1L2 A0I;
    public final AnonymousClass1KW A0J;
    public final C18030ve A0K;
    public final C18010vc A0L;
    public final TextWatcher A0M = new AnonymousClass9AL(this, 10);
    public final C18000vb A0N;
    public final C26631Sw A0O;

    public void A00(C1418377d r16, Integer num) {
        this.A07.setVisibility(0);
        C26631Sw r3 = this.A0O;
        StickerView stickerView = this.A0E;
        Context context = this.A0G;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168203);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131168202);
        C1418377d r6 = r16;
        C21058Ado ado = new C21058Ado(this, r6, num);
        C18070vi.A0e(r6, 1, stickerView);
        r3.A06(new C59842my(stickerView, r6, ado, dimensionPixelSize, dimensionPixelSize2, 1, 0, true, false, false));
    }

    public /* bridge */ /* synthetic */ void BD6(Object obj) {
        this.A0B.setText((String) obj);
    }

    public int BTw() {
        C18030ve r2 = this.A0K;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 3792) || !C18020vd.A05(r1, r2, 5372)) {
            return 2131626950;
        }
        return 2131626952;
    }

    public AQ4(Context context, AnonymousClass11C r4, C18000vb r5, AnonymousClass1L2 r6, AnonymousClass1KW r7, C18030ve r8, AQ3 aq3, C18010vc r10, C26631Sw r11) {
        this.A0G = context;
        this.A0K = r8;
        this.A0J = r7;
        this.A0H = r4;
        this.A0N = r5;
        this.A0O = r11;
        this.A0L = r10;
        this.A0C = aq3;
        this.A0I = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004a, code lost:
        if (X.C18020vd.A05(r4, r10, 5372) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CA8(android.view.View r18) {
        /*
            r17 = this;
            r0 = 2131431654(0x7f0b10e6, float:1.8485043E38)
            r3 = r18
            android.widget.LinearLayout r0 = X.AnonymousClass3MX.A0K(r3, r0)
            r2 = r17
            r2.A06 = r0
            r0 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r2.A05 = r0
            r0 = 2131435192(0x7f0b1eb8, float:1.849222E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r2.A0B = r0
            r0 = 2131436064(0x7f0b2220, float:1.8493988E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            r2.A03 = r0
            r0 = 2131431135(0x7f0b0edf, float:1.848399E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            r2.A0A = r0
            X.0ve r10 = r2.A0K
            r0 = 3792(0xed0, float:5.314E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r10, r0)
            if (r0 == 0) goto L_0x004c
            r0 = 5372(0x14fc, float:7.528E-42)
            boolean r0 = X.C18020vd.A05(r4, r10, r0)
            r1 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            if (r1 == 0) goto L_0x0108
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            r2.A09 = r0
        L_0x005a:
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            r2.A01 = r0
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = X.C18020vd.A05(r4, r10, r0)
            if (r0 == 0) goto L_0x008c
            r0 = 2131435756(0x7f0b20ec, float:1.8493363E38)
            android.widget.LinearLayout r1 = X.AnonymousClass3MX.A0K(r3, r0)
            r2.A07 = r1
            r0 = 2131435755(0x7f0b20eb, float:1.8493361E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            r2.A0E = r0
            android.widget.LinearLayout r1 = r2.A07
            r0 = 2131435759(0x7f0b20ef, float:1.849337E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r2.A04 = r0
        L_0x008c:
            r0 = 2131433536(0x7f0b1840, float:1.848886E38)
            android.view.View r1 = r3.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00fb
            X.AQ3 r0 = r2.A0C
            X.AnonymousClass9Q1.A00(r1, r0)
        L_0x009c:
            r0 = 2131433535(0x7f0b183f, float:1.8488858E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            r2.A02 = r0
            com.whatsapp.mentions.MentionableEntry r1 = r2.A0B
            android.text.TextWatcher r0 = r2.A0M
            r1.addTextChangedListener(r0)
            com.whatsapp.mentions.MentionableEntry r4 = r2.A0B
            android.content.Context r1 = r3.getContext()
            r0 = 2131899382(0x7f1233f6, float:1.9433708E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setHint(r0)
            com.whatsapp.mentions.MentionableEntry r5 = r2.A0B
            r0 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r0]
            r0 = 1024(0x400, float:1.435E-42)
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r1.<init>(r0)
            r0 = 0
            r4[r0] = r1
            r5.setFilters(r4)
            com.whatsapp.mentions.MentionableEntry r1 = r2.A0B
            r0 = 10
            X.AFX.A00(r1, r2, r0)
            X.1KW r9 = r2.A0J
            X.11C r6 = r2.A0H
            X.0vb r7 = r2.A0N
            X.0vc r11 = r2.A0L
            X.1L2 r8 = r2.A0I
            com.whatsapp.mentions.MentionableEntry r4 = r2.A0B
            r0 = 2131429680(0x7f0b0930, float:1.848104E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r3, r0)
            r12 = 1024(0x400, float:1.435E-42)
            r13 = 30
            r14 = 1
            r15 = 0
            X.48A r3 = new X.48A
            r16 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.whatsapp.mentions.MentionableEntry r0 = r2.A0B
            r0.addTextChangedListener(r3)
            return
        L_0x00fb:
            r0 = 2131433535(0x7f0b183f, float:1.8488858E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r3, r0)
            X.AQ3 r0 = r2.A0C
            r0.CA8(r1)
            goto L_0x009c
        L_0x0108:
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            r2.A08 = r0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQ4.CA8(android.view.View):void");
    }
}
