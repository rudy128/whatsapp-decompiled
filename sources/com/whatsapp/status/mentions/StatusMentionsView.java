package com.whatsapp.status.mentions;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C19740yt;
import X.C72483Me;
import X.C82794Cc;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;
import java.util.Set;

public final class StatusMentionsView extends WaImageView {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusMentionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A05();
        A00();
    }

    public void A05() {
        if (!this.A00) {
            this.A00 = true;
            C72483Me.A0x(this);
        }
    }

    private final void A00() {
        setImageResource(2131233361);
        setColorFilter(C19740yt.A00(getContext(), 2131103383));
        AnonymousClass3MY.A0w(getContext(), this, 2131896361);
    }

    private final void setState(C82794Cc r3) {
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            setImageResource(2131232093);
            clearColorFilter();
        } else if (ordinal == 1) {
            A00();
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    public StatusMentionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A05();
    }

    public final void setState(Set set) {
        C82794Cc r0;
        if (set == null || set.isEmpty()) {
            r0 = C82794Cc.NO_MENTIONS;
        } else {
            r0 = C82794Cc.MENTIONS_SELECTED;
        }
        setState(r0);
    }

    public /* synthetic */ StatusMentionsView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusMentionsView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
