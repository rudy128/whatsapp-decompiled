package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5E0;
import X.AnonymousClass5MX;
import X.AnonymousClass5X4;
import X.C101765Dw;
import X.C101775Dx;
import X.C101785Dy;
import X.C101795Dz;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C72473Md;
import X.C89704ct;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class AudioChatBottomSheetFooterView extends ConstraintLayout implements AnonymousClass009 {
    public AnonymousClass5X4 A00;
    public C18030ve A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    private final C28931bI getBluetoothButtonStub() {
        return AnonymousClass3MX.A0v(this.A04);
    }

    private final C28931bI getJoinButtonStub() {
        return AnonymousClass3MX.A0v(this.A05);
    }

    private final C28931bI getLeaveButtonStub() {
        return AnonymousClass3MX.A0v(this.A06);
    }

    private final C28931bI getMuteButtonStub() {
        return AnonymousClass3MX.A0v(this.A07);
    }

    private final C28931bI getSpeakerButtonStub() {
        return AnonymousClass3MX.A0v(this.A08);
    }

    private final C28931bI getStartButtonStub() {
        return AnonymousClass3MX.A0v(this.A09);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass5X4 getListener() {
        return this.A00;
    }

    public final void setListener(AnonymousClass5X4 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = AnonymousClass10E.A8r(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A08 = AnonymousClass1DF.A01(new C101795Dz(this));
        this.A07 = AnonymousClass1DF.A01(new C101785Dy(this));
        this.A04 = AnonymousClass1DF.A01(new C101765Dw(this));
        this.A06 = AnonymousClass1DF.A01(new AnonymousClass5MX(context, this));
        this.A05 = AnonymousClass1DF.A01(new C101775Dx(this));
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5E0(this));
        View.inflate(context, 2131624229, this);
        if (isAttachedToWindow()) {
            if (C18020vd.A05(C18040vf.A01, getAbProps(), 7875)) {
                C72473Md.A11(this, getResources().getDimensionPixelSize(2131168775));
                return;
            }
            return;
        }
        C89704ct.A00(this, 5);
    }

    public /* synthetic */ AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
