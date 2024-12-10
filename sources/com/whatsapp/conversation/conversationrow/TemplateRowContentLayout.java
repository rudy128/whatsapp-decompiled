package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass3uP;
import X.AnonymousClass5XK;
import X.AnonymousClass70E;
import X.C000200d;
import X.C18030ve;
import X.C28931bI;
import X.C39441t5;
import X.C43421zm;
import X.C439421n;
import X.C58072k6;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C82924Cr;
import X.C90474e8;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

public class TemplateRowContentLayout extends LinearLayout implements AnonymousClass009 {
    public TextEmojiLabel A00;
    public AnonymousClass70E A01;
    public AnonymousClass3uP A02;
    public C18030ve A03;
    public AnonymousClass00H A04;
    public AnonymousClass031 A05;
    public View A06;
    public AnonymousClass1GP A07;
    public TextEmojiLabel A08;
    public AnonymousClass5XK A09;
    public C28931bI A0A;
    public boolean A0B;
    public final List A0C;

    private void A00(Context context) {
        setOrientation(1);
        View.inflate(context, 2131627170, this);
        this.A08 = AnonymousClass3MX.A0W(this, 2131436301);
        this.A00 = AnonymousClass3MX.A0W(this, 2131428334);
        this.A0A = C72453Mb.A0s(this, 2131436027);
        this.A06 = findViewById(2131428599);
        List<TextView> list = this.A0C;
        list.add(findViewById(2131427480));
        list.add(findViewById(2131427481));
        list.add(findViewById(2131427482));
        for (TextView A042 : list) {
            C43421zm.A04(A042);
        }
    }

    private void setMessageText(String str, TextEmojiLabel textEmojiLabel, int i, C82924Cr r14) {
        String str2 = str;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        C82924Cr r3 = r14;
        if (i == 0 || getWidth() > C72453Mb.A0C(textEmojiLabel)) {
            AnonymousClass3uP r1 = this.A02;
            r1.A2F(textEmojiLabel2, r3, r1.getFMessage(), str2, (getWidth() - textEmojiLabel.getPaddingRight()) - textEmojiLabel.getPaddingLeft(), true, true, AnonymousClass000.A1O(i));
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new C90474e8(textEmojiLabel, this, r14, str));
    }

    public void A01() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A03 = AnonymousClass10E.A8r(A0O);
            this.A01 = (AnonymousClass70E) A0O.A2I.get();
            this.A04 = C000200d.A00(A0O.A7q);
        }
    }

    public void A02(AnonymousClass1GP r10, AnonymousClass3uP r11, AnonymousClass5XK r12) {
        this.A02 = r11;
        this.A09 = r12;
        this.A07 = r10;
        C58072k6 BaE = ((C439421n) r11.getFMessage()).BaE();
        String str = BaE.A03;
        String str2 = BaE.A02;
        int BQ6 = r11.A0l.BQ6();
        boolean isEmpty = TextUtils.isEmpty(str);
        C18030ve r1 = this.A03;
        if (!isEmpty) {
            setupContentView(r1, this.A08);
            this.A00.setLinkHandler((C39441t5) null);
            this.A08.setVisibility(0);
            setMessageText(str2, this.A08, BQ6, C82924Cr.BODY);
            setMessageText(str, this.A00, 0, C82924Cr.FOOTER);
            this.A00.setTextSize(r11.A0n.A02(AnonymousClass3Ma.A06(r11), r11.getResources(), -1));
            this.A00.setTextColor(r11.getSecondaryTextColor());
        } else {
            setupContentView(r1, this.A00);
            this.A08.setVisibility(8);
            this.A00.setTextSize(r11.getTextFontSize());
            TextEmojiLabel textEmojiLabel = this.A00;
            C72463Mc.A0w(r11.getContext(), r11.getContext(), textEmojiLabel, 2130969264, 2131100275);
            setMessageText(str2, this.A00, BQ6, C82924Cr.BODY);
        }
        this.A06.setVisibility(8);
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            AnonymousClass3MX.A0E(it).setVisibility(8);
        }
        this.A0A.A04(0);
        ((TemplateButtonListLayout) this.A0A.A02()).A02(r10, r11, r12);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public TextEmojiLabel getContentTextView() {
        if (this.A08.getVisibility() == 0) {
            return this.A08;
        }
        return this.A00;
    }

    public TextEmojiLabel getFooterTextView() {
        return this.A00;
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0C = AnonymousClass000.A13();
        A00(context);
    }

    public static void setupContentView(C18030ve r0, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLongClickable(C72483Me.A1A(textEmojiLabel, r0));
    }

    public void setEnabled(boolean z) {
        AnonymousClass5XK r1;
        AnonymousClass1GP r0;
        super.setEnabled(z);
        AnonymousClass3uP r2 = this.A02;
        if (r2 != null && (r1 = this.A09) != null && (r0 = this.A07) != null) {
            A02(r0, r2, r1);
        }
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A0C = AnonymousClass000.A13();
        A00(context);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public TemplateRowContentLayout(Context context) {
        super(context);
        A01();
        this.A0C = AnonymousClass000.A13();
        A00(context);
    }
}
