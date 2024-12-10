package com.whatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11C;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass1HQ;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5X5;
import X.C104885Pw;
import X.C18070vi;
import X.C18100vl;
import X.C27691Xc;
import X.C72453Mb;
import X.C72483Me;
import X.C89994dM;
import X.C90304dr;
import X.C93694jO;
import android.content.Context;
import android.media.ToneGenerator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.Iterator;
import java.util.Map;

public final class InCallDialPadView extends LinearLayout implements AnonymousClass009 {
    public static final Map A08 = AnonymousClass1D7.A0B(AnonymousClass1D6.A01(2131437100, "0"), AnonymousClass1D6.A01(2131433281, "1"), AnonymousClass1D6.A01(2131436468, "2"), AnonymousClass1D6.A01(2131436121, "3"), AnonymousClass1D6.A01(2131430993, "4"), AnonymousClass1D6.A01(2131430891, "5"), AnonymousClass1D6.A01(2131435467, "6"), AnonymousClass1D6.A01(2131435336, "7"), AnonymousClass1D6.A01(2131430277, "8"), AnonymousClass1D6.A01(2131433127, "9"), AnonymousClass1D6.A01(2131435570, "*"), AnonymousClass1D6.A01(2131434013, "#"));
    public static final Map A09;
    public AnonymousClass1HQ A00;
    public AnonymousClass11C A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public TextView A04;
    public AnonymousClass5X5 A05;
    public final C18100vl A06;
    public final StringBuilder A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InCallDialPadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A03) {
            this.A03 = true;
            C27691Xc.A0n((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A07 = new StringBuilder("");
        this.A06 = AnonymousClass1DF.A01(C104885Pw.A00);
    }

    public final void setDialPadUpdateListener(AnonymousClass5X5 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setVoipNative(AnonymousClass1HQ r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    static {
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[12];
        C72483Me.A18(2131437100, 2131433281, r3, 0, 1);
        C72483Me.A18(2131436468, 2131436121, r3, 2, 3);
        C72483Me.A18(2131430993, 2131430891, r3, 4, 5);
        C72483Me.A18(2131435467, 2131435336, r3, 6, 7);
        C72483Me.A18(2131430277, 2131433127, r3, 8, 9);
        C72483Me.A18(2131435570, 2131434013, r3, 10, 11);
        A09 = AnonymousClass1D7.A0B(r3);
    }

    private final void A00() {
        TextView textView = this.A04;
        if (textView == null) {
            C18070vi.A11("keyPadTextDisplay");
            throw null;
        }
        int i = 0;
        if (this.A07.length() <= 0) {
            i = 8;
        }
        textView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int i2 = layoutParams.width;
        int i3 = 1073741824;
        int i4 = 0;
        if (i2 > 0) {
            i4 = 1073741824;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i4);
        int i5 = layoutParams.height;
        if (i5 <= 0) {
            i3 = 0;
        }
        AnonymousClass3MY.A1C(this, i5, i3, makeMeasureSpec);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass1HQ getVoipNative() {
        AnonymousClass1HQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("voipNative");
        throw null;
    }

    public void setVisibility(int i) {
        if (i == 8) {
            StringBuilder sb = this.A07;
            C18070vi.A0d(sb, 0);
            sb.setLength(0);
            TextView textView = this.A04;
            if (textView == null) {
                C18070vi.A11("keyPadTextDisplay");
                throw null;
            } else {
                textView.setText(sb);
                A00();
            }
        }
        super.setVisibility(i);
    }

    public static final void setupKeypad$lambda$1$lambda$0(Map.Entry entry, InCallDialPadView inCallDialPadView, View view) {
        boolean A15 = C18070vi.A15(entry, inCallDialPadView);
        String str = (String) entry.getValue();
        inCallDialPadView.getVoipNative();
        Voip.sendDTMFTone(str);
        StringBuilder sb = inCallDialPadView.A07;
        sb.append(str);
        TextView textView = inCallDialPadView.A04;
        if (textView == null) {
            C18070vi.A11("keyPadTextDisplay");
            throw null;
        }
        textView.setText(sb);
        inCallDialPadView.A00();
        view.playSoundEffect(A15 ? 1 : 0);
        AnonymousClass5X5 r0 = inCallDialPadView.A05;
        if (r0 != null) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = ((C93694jO) r0).A00;
            voipCallControlBottomSheetV2.A0K.A04();
            voipCallControlBottomSheetV2.A0K.A05();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C18100vl r1 = this.A06;
        if (r1.Bf6()) {
            ((ToneGenerator) r1.getValue()).release();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A04 = C72453Mb.A0W(this, 2131431915);
        Iterator A15 = AnonymousClass000.A15(A08);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            C89994dM.A00(findViewById(AnonymousClass000.A0M(A16.getKey())), A16, this, 47);
        }
        Iterator A152 = AnonymousClass000.A15(A09);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            findViewById(AnonymousClass000.A0M(A162.getKey())).setOnTouchListener(new C90304dr(A162, this, 3));
        }
        A00();
    }

    public InCallDialPadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            C27691Xc.A0n((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public /* synthetic */ InCallDialPadView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InCallDialPadView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
