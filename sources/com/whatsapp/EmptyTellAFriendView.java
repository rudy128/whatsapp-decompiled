package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C19830z4;
import X.C27691Xc;
import X.C28931bI;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;

public final class EmptyTellAFriendView extends ScrollView implements AnonymousClass009 {
    public WaTextView A00;
    public C19830z4 A01;
    public AnonymousClass031 A02;
    public C28931bI A03;
    public C28931bI A04;
    public WDSButton A05;
    public boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        A00(true);
    }

    public final void setHeaderView(List list) {
        C18070vi.A0d(list, 0);
        C28931bI r3 = this.A03;
        if (r3 == null) {
            C18070vi.A11("headerViewStub");
            throw null;
        }
        r3.A04(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewGroup) r3.A02()).addView(AnonymousClass3MX.A0E(it));
        }
    }

    public final void setInviteButtonClickListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        WDSButton wDSButton = this.A05;
        if (wDSButton == null) {
            C18070vi.A11("inviteButton");
            throw null;
        } else {
            wDSButton.setOnClickListener(onClickListener);
        }
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public void A01() {
        if (!this.A06) {
            this.A06 = true;
            this.A01 = AnonymousClass3Ma.A0c(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    private final void A00(boolean z) {
        View.inflate(getContext(), 2131625208, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A05 = (WDSButton) C18070vi.A05(this, 2131431796);
        this.A00 = AnonymousClass3Ma.A0N(this, 2131435893);
        if (!z) {
            View A052 = C18070vi.A05(this, 2131429504);
            A052.setPadding(A052.getPaddingLeft(), 0, A052.getPaddingRight(), A052.getPaddingBottom());
        }
        boolean equals = "91".equals(getWaSharedPreferences().A0l());
        WaTextView waTextView = this.A00;
        if (waTextView == null) {
            C18070vi.A11("subtitleTextView");
            throw null;
        }
        int i = 2131898524;
        if (equals) {
            i = 2131898525;
        }
        waTextView.setText(i);
        this.A04 = C72453Mb.A0s(this, 2131430379);
        this.A03 = C72453Mb.A0s(this, 2131430376);
    }

    public final void setImage(int i) {
        if (getResources().getBoolean(2131034126)) {
            C28931bI r0 = this.A04;
            if (r0 == null) {
                C18070vi.A11("imageViewStub");
                throw null;
            } else {
                ((ImageView) C72463Mc.A0N(r0)).setImageResource(i);
            }
        }
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyTellAFriendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        A00(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyTellAFriendView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        A00(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyTellAFriendView(Context context, boolean z) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        A00(z);
    }
}
