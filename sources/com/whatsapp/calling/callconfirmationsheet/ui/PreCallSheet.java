package com.whatsapp.calling.callconfirmationsheet.ui;

import X.AnonymousClass1FL;
import X.C18030ve;
import X.C18070vi;
import X.C28931bI;
import X.C72453Mb;
import X.C72483Me;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.button.WDSButtonGroup;

public abstract class PreCallSheet extends WDSBottomSheetDialogFragment {
    public View A00;
    public TextView A01;
    public TextEmojiLabel A02;
    public C18030ve A03;
    public C28931bI A04;
    public C28931bI A05;
    public WDSButton A06;
    public MaxHeightLinearLayout A07;
    public WDSButtonGroup A08;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if ((!X.C72453Mb.A1a(X.AnonymousClass3Ma.A0P((com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet) r1).A0D)) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r7, android.view.View r8) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            super.A21(r7, r8)
            r0 = r8
            com.whatsapp.components.MaxHeightLinearLayout r0 = (com.whatsapp.components.MaxHeightLinearLayout) r0
            r6.A07 = r0
            r6.A02()
            r1 = r6
            boolean r0 = r6 instanceof com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet
            if (r0 == 0) goto L_0x0027
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet) r1
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r0 = X.AnonymousClass3Ma.A0P(r1)
            X.0vl r0 = r0.A0D
            boolean r0 = X.C72453Mb.A1a(r0)
            r1 = r0 ^ 1
            r0 = 2131431384(0x7f0b0fd8, float:1.8484496E38)
            if (r1 == 0) goto L_0x002a
        L_0x0027:
            r0 = 2131431380(0x7f0b0fd4, float:1.8484488E38)
        L_0x002a:
            android.view.View r1 = X.C72453Mb.A0S(r8, r0)
            r6.A00 = r1
            r0 = 2131428603(0x7f0b04fb, float:1.8478855E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r8, r0)
            com.whatsapp.wds.components.button.WDSButtonGroup r0 = (com.whatsapp.wds.components.button.WDSButtonGroup) r0
            r6.A08 = r0
            r0 = 2131435593(0x7f0b2049, float:1.8493033E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r8, r0)
            r6.A06 = r0
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r1, r0)
            r6.A01 = r0
            r0 = 2131429927(0x7f0b0a27, float:1.848154E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r1, r0)
            r6.A02 = r0
            r0 = 2131434430(0x7f0b1bbe, float:1.8490674E38)
            X.1bI r0 = X.C28931bI.A00(r8, r0)
            r6.A04 = r0
            r0 = 2131435594(0x7f0b204a, float:1.8493035E38)
            X.1bI r1 = X.C28931bI.A00(r8, r0)
            r6.A05 = r1
            r0 = 3
            X.C98254qp.A00(r1, r6, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A06
            if (r1 == 0) goto L_0x0075
            r0 = 10
            X.C89874dA.A00(r1, r6, r0)
        L_0x0075:
            r5 = r6
            boolean r0 = r6 instanceof com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet
            if (r0 == 0) goto L_0x008a
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet r5 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet) r5
            X.1pm r2 = X.AnonymousClass3MZ.A0G(r5)
            r1 = 0
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1 r0 = new com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1
            r0.<init>(r5, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x008a:
            boolean r0 = r6 instanceof com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet
            if (r0 == 0) goto L_0x009e
            com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet r5 = (com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet) r5
            X.1pm r2 = X.AnonymousClass3MZ.A0G(r5)
            r1 = 0
            com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet$initObservables$1 r0 = new com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet$initObservables$1
            r0.<init>(r5, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x009e:
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r5 = (com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet) r5
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = X.AnonymousClass3Ma.A0P(r5)
            X.1OX r2 = X.C41561wd.A00(r3)
            X.0wl r1 = r3.A0F
            r4 = 0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$init$1 r0 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$init$1
            r0.<init>(r3, r4)
            java.lang.Integer r3 = X.AnonymousClass3MW.A0w(r1, r0, r2)
            X.1pm r2 = X.AnonymousClass3MZ.A0G(r5)
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet$initObservables$1 r1 = new com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet$initObservables$1
            r1.<init>(r5, r4)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.C30451dy.A02(r3, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callconfirmationsheet.ui.PreCallSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public int A2K(int i, int i2) {
        float f = 0.85f;
        if (i2 == 2) {
            f = 1.0f;
        }
        return (int) (((float) i) * f);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A02();
    }

    public void A2L() {
        C28931bI r0;
        WDSButtonGroup wDSButtonGroup = this.A08;
        if (wDSButtonGroup != null) {
            WDSButton wDSButton = this.A06;
            int i = 0;
            if ((wDSButton == null || wDSButton.getVisibility() != 0) && ((r0 = this.A05) == null || r0.A01() != 0)) {
                i = 8;
            }
            wDSButtonGroup.setVisibility(i);
        }
    }

    public PreCallSheet() {
        super(2131626510);
    }

    private final void A02() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            int A022 = C72483Me.A02(A1B);
            MaxHeightLinearLayout maxHeightLinearLayout = this.A07;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight(A2K(A022, C72453Mb.A08(A14())));
            }
        }
    }

    public void A1s() {
        super.A1s();
        this.A08 = null;
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        this.A07 = null;
    }
}
