package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1BI;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6LH;
import X.C000200d;
import X.C18070vi;
import X.C27691Xc;
import X.C40501uo;
import X.C81723zh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public final class InviteViaLinkView extends RelativeLayout implements AnonymousClass009 {
    public AnonymousClass00H A00;
    public AnonymousClass031 A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteViaLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setGroupInviteClickUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setupOnClick(AnonymousClass1BI r8, AnonymousClass1FU r9, C81723zh r10, AnonymousClass1EC r11) {
        setOnClickListener(new AnonymousClass6LH(r9, r10, r11, r8, this, C18070vi.A15(r8, r9) ? 1 : 0));
    }

    public static /* synthetic */ void setupOnClick$default(InviteViaLinkView inviteViaLinkView, AnonymousClass1BI r2, AnonymousClass1FU r3, C81723zh r4, AnonymousClass1EC r5, int i, Object obj) {
        if ((i & 8) != 0) {
            r5 = null;
        }
        inviteViaLinkView.setupOnClick(r2, r3, r4, r5);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getGroupInviteClickUtils() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupInviteClickUtils");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteViaLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C000200d.A00(((C27691Xc) ((AnonymousClass033) generatedComponent())).A0z.A4A);
        }
        View.inflate(context, 2131625743, this);
        if (attributeSet == null) {
            setId(2131431813);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131168743)));
            setBackground(C40501uo.A00(context.getTheme(), getResources(), 2131232942));
            setGravity(16);
        }
    }

    public /* synthetic */ InviteViaLinkView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteViaLinkView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
