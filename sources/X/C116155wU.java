package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.5wU  reason: invalid class name and case insensitive filesystem */
public class C116155wU extends C116165wV {
    public View A00;
    public C26216Cuy A01;
    public final TextView A02;
    public final TextView A03;
    public final C22851Dl A04 = new AnonymousClass7AN(this, 35);

    public void A0E(int i) {
        if (this.A02 != i) {
            super.A0E(i);
            AnonymousClass70A r0 = this.A05;
            if (r0 != null) {
                A0J(r0);
            }
        }
    }

    public C116155wU(View view, C72043Kk r4, C24771Lp r5, C143867Fc r6, AnonymousClass6bT r7, CallGridViewModel callGridViewModel, AnonymousClass1VW r9, C24921Me r10, C18000vb r11, C18030ve r12, AnonymousClass1DC r13, C18140vp r14) {
        super(view, r4, r5, r6, r7, callGridViewModel, r9, r10, r11, r12, r13, r14);
        this.A02 = -1;
        this.A03 = AnonymousClass3MW.A0J(view, 2131427886);
        this.A02 = AnonymousClass3MW.A0J(view, 2131427880);
        this.A00 = view.findViewById(2131432786);
    }

    public void A0B() {
        super.A0B();
        this.A05 = null;
        this.A01 = null;
        CallGridViewModel callGridViewModel = this.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0K.A0D(this.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass70A r7) {
        /*
            r6 = this;
            super.A0J(r7)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r5 = r6.A04
            r3 = 0
            r2 = 8
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0050
            com.whatsapp.WaImageView r1 = r6.A0I
            if (r1 == 0) goto L_0x001b
            boolean r0 = r7.A0a
            if (r0 != 0) goto L_0x0018
            r3 = 8
        L_0x0018:
            r1.setVisibility(r3)
        L_0x001b:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r6.A0K
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A02
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r0 = r6.A0G
        L_0x002c:
            r0.setVisibility(r2)
        L_0x002f:
            boolean r0 = X.AnonymousClass112.A02()
            if (r0 == 0) goto L_0x004f
            boolean r0 = r7.A0V
            if (r0 == 0) goto L_0x00d0
            X.Cuy r0 = r6.A01
            if (r0 != 0) goto L_0x0048
            android.view.View r2 = r6.A0H
            android.view.View r1 = r6.A00
            X.Cuy r0 = new X.Cuy
            r0.<init>(r2, r1)
            r6.A01 = r0
        L_0x0048:
            android.view.View r1 = r6.A00
            r0 = 17
            X.C89994dM.A00(r1, r6, r7, r0)
        L_0x004f:
            return
        L_0x0050:
            X.70A r4 = r6.A05
            if (r4 == 0) goto L_0x0095
            int r1 = r6.A02
            r0 = 4
            if (r1 != r0) goto L_0x0095
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0095
            X.4ZN r4 = r7.A0C
            if (r4 == 0) goto L_0x008f
            android.widget.TextView r1 = r6.A03
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r4.A03(r0)
            r1.setVisibility(r3)
            r1.setText(r0)
        L_0x0071:
            if (r5 == 0) goto L_0x007a
            X.1DT r1 = r5.A0K
            X.1Dl r0 = r6.A04
            r1.A0C(r0)
        L_0x007a:
            android.widget.TextView r1 = r6.A02
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x0082
            r3 = 8
        L_0x0082:
            r1.setVisibility(r3)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r6.A0K
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r0 = r6.A0I
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        L_0x008f:
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r2)
            goto L_0x0071
        L_0x0095:
            if (r5 == 0) goto L_0x009e
            X.1DT r1 = r5.A0K
            X.1Dl r0 = r6.A04
            r1.A0D(r0)
        L_0x009e:
            int r1 = r6.A02
            r0 = 11
            if (r1 == r0) goto L_0x00bd
            r0 = 12
            if (r1 == r0) goto L_0x00bd
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r6.A0K
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r6.A0I
            if (r0 == 0) goto L_0x00b4
            r0.setVisibility(r2)
        L_0x00b4:
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.A02
            goto L_0x002c
        L_0x00bd:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r6.A0K
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r1 = r6.A0I
            if (r1 == 0) goto L_0x00b4
            boolean r0 = r7.A0a
            if (r0 != 0) goto L_0x00cc
            r3 = 8
        L_0x00cc:
            r1.setVisibility(r3)
            goto L_0x00b4
        L_0x00d0:
            android.view.View r0 = r6.A00
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116155wU.A0J(X.70A):void");
    }
}
