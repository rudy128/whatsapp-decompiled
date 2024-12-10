package com.whatsapp.emoji.search;

import X.AnonymousClass00H;
import X.AnonymousClass160;
import X.AnonymousClass1KW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3NL;
import X.AnonymousClass6Ii;
import X.AnonymousClass7GF;
import X.AnonymousClass872;
import X.C107385Zm;
import X.C110445fe;
import X.C112385lO;
import X.C112665lq;
import X.C117035z6;
import X.C1193267r;
import X.C133686pK;
import X.C1422478s;
import X.C142997Bp;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C72453Mb;
import X.C72463Mc;
import X.C825148g;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.perf.MeasuringFrameLayout;

public final class EmojiSearchKeyboardContainer extends MeasuringFrameLayout {
    public long A00;
    public Activity A01;
    public View A02;
    public View A03;
    public InterceptingEditText A04;
    public C18000vb A05;
    public C1193267r A06;
    public AnonymousClass1KW A07;
    public C112385lO A08;
    public AnonymousClass872 A09;
    public C18030ve A0A;
    public C18010vc A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public String A0F;
    public boolean A0G;
    public RecyclerView A0H;
    public boolean A0I;
    public final AnonymousClass160 A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A0J = C110445fe.A00(this);
    }

    public final void A04(Activity activity, C1193267r r11, C107385Zm r12, AnonymousClass872 r13) {
        boolean A17 = C18070vi.A17(activity, r11);
        this.A01 = activity;
        this.A06 = r11;
        this.A09 = r13;
        if (!this.A0I) {
            this.A0I = A17;
            activity.getLayoutInflater().inflate(2131625192, this, A17);
            this.A03 = findViewById(2131433163);
            this.A0H = AnonymousClass3MX.A0Q(this, 2131434954);
            int A062 = C72463Mc.A06(this);
            RecyclerView recyclerView = this.A0H;
            if (recyclerView != null) {
                recyclerView.A0r(new C112665lq(A062, 2));
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
            linearLayoutManager.A1Z(0);
            RecyclerView recyclerView2 = this.A0H;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            this.A02 = findViewById(2131434187);
            InterceptingEditText interceptingEditText = (InterceptingEditText) findViewById(2131434853);
            this.A04 = interceptingEditText;
            if (interceptingEditText != null) {
                interceptingEditText.setHint(2131889729);
            }
            View findViewById = findViewById(2131429122);
            C825148g.A00(findViewById, this, A17 ? 1 : 0);
            C1422478s.A00(this, 3);
            InterceptingEditText interceptingEditText2 = this.A04;
            if (interceptingEditText2 != null) {
                interceptingEditText2.A00 = new C142997Bp(r12, A17);
                interceptingEditText2.addTextChangedListener(new AnonymousClass6Ii(findViewById, this, (int) A17));
            }
            C825148g.A00(findViewById(2131428012), r12, 2);
            View findViewById2 = findViewById(2131428012);
            C18070vi.A0z(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            C18000vb whatsAppLocale = getWhatsAppLocale();
            AnonymousClass3NL.A01(getContext(), (ImageView) findViewById2, whatsAppLocale, 2131231672);
        }
        setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
        C72453Mb.A1D(this.A02);
        Activity activity2 = this.A01;
        if (activity2 == null) {
            C18070vi.A11("activity");
            throw null;
        }
        C117035z6 r3 = new C117035z6(activity2, getWhatsAppLocale(), getEmojiLoader(), new AnonymousClass7GF(this, 1), getSharedPreferencesFactory(), this, getResources().getDimensionPixelSize(2131166635), 1);
        this.A08 = r3;
        RecyclerView recyclerView3 = this.A0H;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(r3);
        }
        this.A0F = "";
        A01(this, "");
        InterceptingEditText interceptingEditText3 = this.A04;
        if (interceptingEditText3 != null) {
            interceptingEditText3.setText("");
            interceptingEditText3.requestFocus();
            interceptingEditText3.A0I(false);
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setEmojiSearchProvider(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setExpressionUserJourneyLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setFrequentReactionsLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass00H getEmojiSearchProvider() {
        AnonymousClass00H r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiSearchProvider");
        throw null;
    }

    public final AnonymousClass00H getExpressionUserJourneyLogger() {
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("expressionUserJourneyLogger");
        throw null;
    }

    public final AnonymousClass00H getFrequentReactionsLazy() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("frequentReactionsLazy");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void A01(EmojiSearchKeyboardContainer emojiSearchKeyboardContainer, String str) {
        if (((C133686pK) emojiSearchKeyboardContainer.getEmojiSearchProvider().get()).A02) {
            C72453Mb.A1D(emojiSearchKeyboardContainer.A03);
            C72453Mb.A1C(emojiSearchKeyboardContainer.A02);
            C112385lO r2 = emojiSearchKeyboardContainer.A08;
            if (r2 != null) {
                C18070vi.A0d(str, 0);
                r2.A0U(((C133686pK) emojiSearchKeyboardContainer.getEmojiSearchProvider().get()).A00(str, true, true));
            }
            emojiSearchKeyboardContainer.A0F = str;
        }
    }

    public final void A03() {
        if (getVisibility() == 0) {
            setVisibility(8);
            InterceptingEditText interceptingEditText = this.A04;
            if (interceptingEditText != null) {
                interceptingEditText.A0H();
            }
            InterceptingEditText interceptingEditText2 = this.A04;
            if (interceptingEditText2 != null) {
                interceptingEditText2.clearFocus();
            }
        }
    }

    public final AnonymousClass160 getQuickEmojiTypeModel() {
        return this.A0J;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        this.A0J = C110445fe.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A0J = C110445fe.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchKeyboardContainer(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        this.A0J = C110445fe.A00(this);
    }

    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
