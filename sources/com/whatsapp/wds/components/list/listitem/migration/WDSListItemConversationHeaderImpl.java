package com.whatsapp.wds.components.list.listitem.migration;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C42121xe;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSListItemConversationHeaderImpl extends LinearLayout implements C42121xe {
    public ViewStub A00;
    public ViewStub A01;
    public TextEmojiLabel A02;
    public WaTextView A03;
    public WaImageView A04;
    public WaTextView A05;
    public boolean A06;
    public boolean A07;

    public WaImageView getUnreadImportantIndicatorView() {
        View view;
        if (!this.A06) {
            ViewStub viewStub = this.A00;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.A04 = (WaImageView) view;
            this.A06 = true;
        }
        return this.A04;
    }

    public WaTextView getUnreadIndicatorView() {
        View view;
        if (!this.A07) {
            ViewStub viewStub = this.A01;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.A05 = (WaTextView) view;
            this.A07 = true;
        }
        return this.A05;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemConversationHeaderImpl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18070vi.A0j(context, attributeSet);
    }

    public TextEmojiLabel getContactNameView() {
        return this.A02;
    }

    public View getContentView() {
        return this;
    }

    public WaTextView getDateView() {
        return this.A03;
    }

    public boolean getUnreadImportantIndicatorInflated() {
        return this.A06;
    }

    public final ViewStub getUnreadImportantIndicatorStub() {
        return this.A00;
    }

    public boolean getUnreadIndicatorInflated() {
        return this.A07;
    }

    public final ViewStub getUnreadIndicatorStub() {
        return this.A01;
    }

    public final void setUnreadImportantIndicatorStub(ViewStub viewStub) {
        this.A00 = viewStub;
    }

    public final void setUnreadIndicatorStub(ViewStub viewStub) {
        this.A01 = viewStub;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSListItemConversationHeaderImpl(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        View.inflate(context, 2131627558, this);
        this.A02 = AnonymousClass3MX.A0W(this, 2131429643);
        this.A03 = AnonymousClass3MW.A0U(this, 2131429645);
        this.A01 = AnonymousClass3MW.A0F(this, 2131429657);
        this.A00 = AnonymousClass3MW.A0F(this, 2131429651);
        setOrientation(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemConversationHeaderImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0j(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemConversationHeaderImpl(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSListItemConversationHeaderImpl(Context context, AttributeSet attributeSet, int i, int i2, int i3, AnonymousClass1Y1 r9) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i3), AnonymousClass3MY.A00(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }
}
