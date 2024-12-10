package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass11S;
import X.AnonymousClass1M9;
import X.AnonymousClass1OW;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass1Y1;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C18600wl;
import X.C24921Me;
import X.C30391dr;
import X.C37451pZ;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.components.button.ThumbnailButton;

public final class CommentContactPictureView extends ThumbnailButton {
    public AnonymousClass11S A00;
    public AnonymousClass1VW A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C18600wl A04;
    public C18600wl A05;
    public boolean A06;
    public AnonymousClass206 A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentContactPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A05();
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
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
        this.A03 = r2;
    }

    public final void A07(C37451pZ r4, AnonymousClass206 r5) {
        AnonymousClass205 r1;
        AnonymousClass206 r0 = this.A07;
        if (r0 != null) {
            r1 = r0.A0v;
        } else {
            r1 = null;
        }
        if (!C18070vi.A18(r1, r5.A0v)) {
            this.A07 = r5;
            getContactAvatars().A0B(this, (AnonymousClass1VX) null, 2131231047);
            AnonymousClass3MX.A1Q(new CommentContactPictureView$bind$1(r4, this, r5, (C30391dr) null), AnonymousClass1OW.A02(getIoDispatcher()));
        }
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1K();
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
        C24921Me r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public CommentContactPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A05();
    }

    public /* synthetic */ CommentContactPictureView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
