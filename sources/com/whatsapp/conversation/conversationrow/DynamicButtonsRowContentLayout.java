package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3uP;
import X.BE6;
import X.C18030ve;
import X.C194599rz;
import X.C20097A7a;
import X.C82924Cr;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

public class DynamicButtonsRowContentLayout extends LinearLayout implements AnonymousClass009 {
    public C18030ve A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setupContentView(TextEmojiLabel textEmojiLabel) {
        AnonymousClass3Ma.A1L(this.A00, textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    public void A00(AnonymousClass3uP r19) {
        int i;
        TextEmojiLabel textEmojiLabel;
        int A022;
        AnonymousClass3uP r9 = r19;
        AnonymousClass206 fMessage = r9.getFMessage();
        C194599rz r0 = fMessage.A0L().A00;
        if (r0 != null) {
            String str = r0.A00;
            String str2 = r0.A01;
            if (!TextUtils.isEmpty(str)) {
                Context context = getContext();
                Object[] objArr = new Object[1];
                Context context2 = getContext();
                int i2 = fMessage.A0u;
                if (i2 != 0) {
                    i = 2131886251;
                    if (i2 != 1) {
                        i = 2131886254;
                        if (i2 != 3) {
                            i = 2131886252;
                            if (i2 != 5) {
                                i = 2131886249;
                                if (i2 != 9) {
                                    i = 0;
                                }
                            }
                        }
                    }
                } else {
                    i = 2131886253;
                }
                objArr[0] = context2.getString(i);
                StringBuilder A0u = BE6.A0u(context.getString(2131886250, objArr));
                String A0P = fMessage.A0P();
                if (!TextUtils.isEmpty(A0P) && i2 == 0) {
                    A0u.append(A0P);
                }
                r9.setContentDescription(AnonymousClass000.A0y(C20097A7a.A01(fMessage), A0u));
                if (!TextUtils.isEmpty(str2)) {
                    TextEmojiLabel textEmojiLabel2 = this.A04;
                    r9.setMessageText(str, textEmojiLabel2, fMessage);
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel = this.A03;
                    r9.A2G(textEmojiLabel, fMessage, str2, true);
                    textEmojiLabel.setTextSize(r9.A0n.A02(r9.getContext().getTheme(), r9.getResources(), -1));
                    A022 = r9.getSecondaryTextColor();
                } else {
                    textEmojiLabel = this.A03;
                    r9.A2F(textEmojiLabel, (C82924Cr) null, fMessage, str, 0, true, true, false);
                    this.A04.setVisibility(8);
                    A022 = AnonymousClass3MZ.A02(r9.getContext(), r9.getContext(), 2130969264, 2131100275);
                }
                textEmojiLabel.setTextColor(A022);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C18030ve) AnonymousClass3MW.A0O(generatedComponent()).A04.get();
        }
        setOrientation(1);
        View.inflate(context, 2131625150, this);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(2131436301);
        this.A04 = textEmojiLabel;
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) findViewById(2131428334);
        this.A03 = textEmojiLabel2;
        setupContentView(textEmojiLabel);
        setupContentView(textEmojiLabel2);
    }

    public DynamicButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
