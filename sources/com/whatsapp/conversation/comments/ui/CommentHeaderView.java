package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1M9;
import X.AnonymousClass1OW;
import X.AnonymousClass1Y1;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass5GI;
import X.AnonymousClass5GJ;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C23761Hn;
import X.C24921Me;
import X.C27691Xc;
import X.C30391dr;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class CommentHeaderView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public AnonymousClass00H A03;
    public AnonymousClass031 A04;
    public C18600wl A05;
    public boolean A06;
    public AnonymousClass206 A07;
    public final C18100vl A08;
    public final C18100vl A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc.A0r((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A08 = AnonymousClass1DF.A01(new AnonymousClass5GI(this));
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5GJ(this));
        View.inflate(context, 2131624561, this);
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setAliasedDisplayNameRepository(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    /* access modifiers changed from: private */
    public final CommentContactNamePrimaryView getContactNamePrimary() {
        return (CommentContactNamePrimaryView) AnonymousClass3MX.A14(this.A08);
    }

    /* access modifiers changed from: private */
    public final CommentContactNameSecondaryView getContactNameSecondary() {
        return (CommentContactNameSecondaryView) AnonymousClass3MX.A14(this.A09);
    }

    public final void A02(AnonymousClass206 r4) {
        AnonymousClass205 r1;
        AnonymousClass206 r0 = this.A07;
        if (r0 != null) {
            r1 = r0.A0v;
        } else {
            r1 = null;
        }
        if (!C18070vi.A18(r1, r4.A0v)) {
            this.A07 = r4;
            AnonymousClass3MX.A1Q(new CommentHeaderView$bind$1(this, r4, (C30391dr) null), AnonymousClass1OW.A02(C23761Hn.A01));
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getAliasedDisplayNameRepository() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("aliasedDisplayNameRepository");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1L();
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public CommentHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc.A0r((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public /* synthetic */ CommentHeaderView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
