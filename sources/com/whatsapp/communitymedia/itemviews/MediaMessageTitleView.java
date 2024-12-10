package com.whatsapp.communitymedia.itemviews;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C108965cb;
import X.C18000vb;
import X.C18070vi;
import X.C27691Xc;
import X.C32091gc;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class MediaMessageTitleView extends FrameLayout implements AnonymousClass009 {
    public WaTextView A00;
    public C18000vb A01;
    public C32091gc A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final WaImageView A07;

    public final void setMentions(C32091gc r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C32091gc getMentions() {
        C32091gc r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mentions");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public MediaMessageTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            C27691Xc.A0q((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaMessageTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A04) {
            this.A04 = true;
            C27691Xc.A0q((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        C72473Md.A0z(View.inflate(context, 2131625964, this));
        this.A05 = C72453Mb.A0c(this, 2131427913);
        this.A00 = AnonymousClass3Ma.A0N(this, 2131427914);
        this.A07 = C108965cb.A0I(this, 2131432690);
        this.A06 = C72453Mb.A0c(this, 2131428830);
    }
}
