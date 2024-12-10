package com.whatsapp.payments.ui.widget;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1Y1;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C21433Ak0;
import X.C27691Xc;
import X.C36401np;
import X.C39401t1;
import X.C39411t2;
import X.C39441t5;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

public final class ContactMerchantView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1M9 A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public C36401np A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final TextEmojiLabel A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContactMerchantView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public final void A00(AnonymousClass1BI r10) {
        TextEmojiLabel textEmojiLabel = this.A06;
        Rect rect = C39401t1.A0A;
        textEmojiLabel.setAccessibilityHelper(new C39411t2(textEmojiLabel, getSystemServices()));
        textEmojiLabel.setLinkHandler(new C39441t5(getAbProps()));
        AnonymousClass1E7 A0E = getContactManager().A0E(r10);
        if (A0E != null) {
            String A0K = A0E.A0K();
            if (A0K == null) {
                A0K = A0E.A0L();
            }
            Context context = getContext();
            SpannableStringBuilder A052 = getLinkifier().A05(textEmojiLabel.getContext(), new C21433Ak0(context, A0E, 11), C17890vO.A0R(context, A0K, 1, 0, 2131893187), "merchant-name");
            C18070vi.A0X(A052);
            textEmojiLabel.setText(A052);
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemServices");
        throw null;
    }

    public ContactMerchantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc.A12((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactMerchantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc.A12((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        View.inflate(context, 2131626354, this);
        this.A06 = (TextEmojiLabel) C18070vi.A05(this, 2131429426);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactMerchantView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
