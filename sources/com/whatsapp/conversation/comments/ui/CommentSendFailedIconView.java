package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass1KB;
import X.AnonymousClass1O2;
import X.AnonymousClass1WM;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C18030ve;
import X.C18070vi;
import X.C33251iW;
import X.C34531kd;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

public final class CommentSendFailedIconView extends WaImageView {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public C34531kd A02;
    public C33251iW A03;
    public AnonymousClass11P A04;
    public AnonymousClass122 A05;
    public AnonymousClass1WM A06;
    public C18030ve A07;
    public AnonymousClass1O2 A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentSendFailedIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A05();
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setBlockListManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setCoreMessageStore(AnonymousClass122 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setInFlightMessages(AnonymousClass1O2 r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageAddOnManager(AnonymousClass1WM r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setSendMedia(C34531kd r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setUserActions(C33251iW r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public void A05() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E A0P = C72483Me.A0P(this);
            this.A07 = AnonymousClass10E.A8r(A0P);
            this.A0A = C000200d.A00(A0P.A0x);
            this.A05 = AnonymousClass3MZ.A0n(A0P);
            this.A00 = AnonymousClass10E.A12(A0P);
            this.A08 = (AnonymousClass1O2) A0P.A57.get();
            this.A01 = AnonymousClass10E.A17(A0P);
            this.A06 = (AnonymousClass1WM) A0P.A6I.get();
            this.A02 = AnonymousClass3MZ.A0R(A0P);
            this.A04 = AnonymousClass10E.A6O(A0P);
            this.A03 = AnonymousClass3MZ.A0U(A0P);
            this.A09 = AnonymousClass10E.AL1(A0P);
        }
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass00H getBlockListManager() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("blockListManager");
        throw null;
    }

    public final AnonymousClass122 getCoreMessageStore() {
        AnonymousClass122 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("coreMessageStore");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass1O2 getInFlightMessages() {
        AnonymousClass1O2 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inFlightMessages");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final AnonymousClass1WM getMessageAddOnManager() {
        AnonymousClass1WM r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageAddOnManager");
        throw null;
    }

    public final C34531kd getSendMedia() {
        C34531kd r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sendMedia");
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C33251iW getUserActions() {
        C33251iW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userActions");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public CommentSendFailedIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A05();
    }

    public /* synthetic */ CommentSendFailedIconView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentSendFailedIconView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
