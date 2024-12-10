package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.C28931bI;
import X.C42121xe;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class ConversationListRowHeaderView extends LinearLayout implements AnonymousClass009, C42121xe {
    public AnonymousClass031 A00;
    public TextEmojiLabel A01;
    public WaTextView A02;
    public C28931bI A03;
    public C28931bI A04;
    public boolean A05;

    public View getContentView() {
        return this;
    }

    public void A01() {
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean getUnreadImportantIndicatorInflated() {
        if (this.A03.A00 != null) {
            return true;
        }
        return false;
    }

    public WaImageView getUnreadImportantIndicatorView() {
        return (WaImageView) this.A03.A02();
    }

    public boolean getUnreadIndicatorInflated() {
        if (this.A04.A00 != null) {
            return true;
        }
        return false;
    }

    public WaTextView getUnreadIndicatorView() {
        return (WaTextView) this.A04.A02();
    }

    public ConversationListRowHeaderView(Context context) {
        super(context);
        A01();
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, 2131624747, this);
        this.A01 = (TextEmojiLabel) findViewById(2131429643);
        this.A02 = (WaTextView) findViewById(2131429645);
        this.A04 = new C28931bI(findViewById(2131429657));
        this.A03 = new C28931bI(findViewById(2131429651));
        setOrientation(0);
    }

    public TextEmojiLabel getContactNameView() {
        return this.A01;
    }

    public WaTextView getDateView() {
        return this.A02;
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context);
    }
}
