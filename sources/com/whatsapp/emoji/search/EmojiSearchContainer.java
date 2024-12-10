package com.whatsapp.emoji.search;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass160;
import X.AnonymousClass1KW;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass872;
import X.C108985cd;
import X.C112385lO;
import X.C1193167q;
import X.C1193267r;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C221618v;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;

public class EmojiSearchContainer extends FrameLayout implements AnonymousClass009 {
    public Activity A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public InterceptingEditText A04;
    public C18000vb A05;
    public C1193167q A06;
    public C1193267r A07;
    public AnonymousClass1KW A08;
    public C112385lO A09;
    public EmojiSearchProvider A0A;
    public AnonymousClass872 A0B;
    public C18030ve A0C;
    public C18010vc A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass031 A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;

    public static void A00(EmojiSearchContainer emojiSearchContainer, String str) {
        EmojiSearchProvider emojiSearchProvider = emojiSearchContainer.A0A;
        if (emojiSearchProvider != null && emojiSearchProvider.A02) {
            emojiSearchContainer.A02.setVisibility(8);
            emojiSearchContainer.A01.setVisibility(0);
            C112385lO r2 = emojiSearchContainer.A09;
            EmojiSearchProvider emojiSearchProvider2 = emojiSearchContainer.A0A;
            C18070vi.A0d(str, 0);
            r2.A0U(emojiSearchProvider2.A00(str, true, true));
            emojiSearchContainer.A0G = str;
        }
    }

    public void A01() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A08 = AnonymousClass3Ma.A0f(A0O);
            this.A07 = C108985cd.A0T(A0O);
            this.A06 = (C1193167q) A0O.A00.ABP.get();
            this.A05 = AnonymousClass10E.A6Q(A0O);
            this.A0D = AnonymousClass3Ma.A0r(A0O);
            this.A0C = AnonymousClass10E.A8r(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0F;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A0E = C221618v.A00(AnonymousClass160.class);
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A0E = C221618v.A00(AnonymousClass160.class);
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0E = C221618v.A00(AnonymousClass160.class);
    }

    public EmojiSearchContainer(Context context) {
        super(context);
        A01();
        this.A0E = C221618v.A00(AnonymousClass160.class);
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
