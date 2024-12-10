package com.whatsapp.usercontrol.view;

import X.AnonymousClass1DF;
import X.AnonymousClass205;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4D7;
import X.AnonymousClass4aU;
import X.AnonymousClass6U3;
import X.AnonymousClass78M;
import X.AnonymousClass7RO;
import X.C108965cb;
import X.C121596Kp;
import X.C122666Rg;
import X.C126676d7;
import X.C129866iV;
import X.C138056wS;
import X.C154687rX;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C19740yt;
import X.C22941Dw;
import X.C24261Jm;
import X.C35761ml;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.FAQTextView;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import com.whatsapp.wds.components.actiontile.WDSActionTileGroup;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.util.Iterator;
import java.util.List;

public abstract class UserControlBaseFragment extends Hilt_UserControlBaseFragment {
    public LinearLayout A00;
    public LinearLayout A01;
    public FAQTextView A02;
    public WaTextView A03;
    public C35761ml A04;
    public C18030ve A05;
    public C138056wS A06;
    public WDSActionTileGroup A07;
    public WDSListItem A08;
    public C18600wl A09;
    public WaImageButton A0A;
    public C126676d7 A0B;
    public final C18100vl A0C = AnonymousClass1DF.A01(new C154687rX(this));

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0148, code lost:
        if (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A04(r3) != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r8, android.view.View r9) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.A21(r8, r9)
            X.6d7 r4 = r7.A0B
            java.lang.String r6 = "ucBuilder"
            if (r4 == 0) goto L_0x01b7
            boolean r0 = r7 instanceof com.whatsapp.usercontrol.view.UserControlNotInterestedFragment
            if (r0 == 0) goto L_0x0129
            X.0vl r5 = r7.A0C
            java.lang.Object r3 = r5.getValue()
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r3 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r3
            X.6wS r0 = r3.A07
            X.0ve r2 = r0.A00
            r1 = 10668(0x29ac, float:1.4949E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002e
            boolean r0 = com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A04(r3)
            r3 = 1
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            java.lang.Object r2 = r5.getValue()
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r2 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r2
            X.6rX r0 = r2.A01
            if (r0 == 0) goto L_0x0126
            X.206 r0 = r0.A01
            if (r0 == 0) goto L_0x0126
            com.whatsapp.jid.UserJid r1 = r0.A0I()
            if (r1 == 0) goto L_0x0126
            X.00H r0 = r2.A0B
            boolean r0 = X.C72463Mc.A1U(r1, r0)
            r0 = r0 ^ 1
        L_0x004b:
            X.7N2 r1 = new X.7N2
            r1.<init>(r3, r0)
        L_0x0050:
            X.6iV r0 = r4.A00
            r0.A01 = r1
            X.6iV r0 = r7.A00()
            X.88J r1 = r0.A01
            if (r1 == 0) goto L_0x0063
            X.6d7 r0 = r7.A0B
            if (r0 == 0) goto L_0x01b7
            r1.BFb(r0)
        L_0x0063:
            android.view.View r1 = r7.A17()
            r0 = 2131436490(0x7f0b23ca, float:1.8494852E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r7.A03 = r0
            android.view.View r1 = r7.A17()
            r0 = 2131436489(0x7f0b23c9, float:1.849485E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.WaImageButton r1 = (com.whatsapp.WaImageButton) r1
            r0 = 14
            X.AnonymousClass78L.A00(r1, r7, r0)
            r7.A0A = r1
            r0 = 2131436491(0x7f0b23cb, float:1.8494854E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            com.whatsapp.FAQTextView r0 = (com.whatsapp.FAQTextView) r0
            r7.A02 = r0
            r0 = 2131436487(0x7f0b23c7, float:1.8494846E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r0 = (com.whatsapp.wds.components.actiontile.WDSActionTileGroup) r0
            r7.A07 = r0
            r0 = 2131436484(0x7f0b23c4, float:1.849484E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.A00 = r0
            r0 = 2131436485(0x7f0b23c5, float:1.8494842E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.A01 = r0
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r5 = r7.A07
            r2 = 8
            if (r5 == 0) goto L_0x0152
            X.6iV r0 = r7.A00()
            java.util.List r0 = r0.A04
            boolean r0 = X.AnonymousClass000.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r5.setVisibility(r0)
            X.6iV r0 = r7.A00()
            java.util.List r0 = r0.A04
            java.util.Iterator r6 = r0.iterator()
        L_0x00d1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r3 = r6.next()
            X.6Rg r3 = (X.C122666Rg) r3
            android.view.LayoutInflater r1 = r7.A16()
            r0 = 2131627287(0x7f0e0d17, float:1.8881834E38)
            android.view.View r4 = X.AnonymousClass3MY.A0D(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.actiontile.WDSActionTile"
            X.C18070vi.A0z(r4, r0)
            com.whatsapp.wds.components.actiontile.WDSActionTile r4 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r4
            int r1 = r3.iconRes
            int r0 = r3.titleRes
            r4.setIcon((int) r1)
            r4.setText((int) r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setWeightSum(r0)
            r0 = 16
            X.AnonymousClass78M.A00(r4, r7, r3, r0)
            r5.addView(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.C18070vi.A0z(r3, r0)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r7)
            r0 = 2131168779(0x7f070e0b, float:1.795187E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setMarginStart(r0)
            r3.setMarginEnd(r0)
            r4.setLayoutParams(r3)
            goto L_0x00d1
        L_0x0126:
            r0 = 0
            goto L_0x004b
        L_0x0129:
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r3 = X.C108965cb.A0e(r7)
            X.6wS r0 = r3.A07
            X.0ve r2 = r0.A00
            r0 = 11241(0x2be9, float:1.5752E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x014a
            r0 = 10668(0x29ac, float:1.4949E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x014a
            boolean r1 = com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel.A04(r3)
            r0 = 1
            if (r1 == 0) goto L_0x014b
        L_0x014a:
            r0 = 0
        L_0x014b:
            X.7N1 r1 = new X.7N1
            r1.<init>(r0)
            goto L_0x0050
        L_0x0152:
            android.widget.LinearLayout r1 = r7.A00
            if (r1 == 0) goto L_0x0170
            X.6iV r0 = r7.A00()
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass000.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            X.6iV r0 = r7.A00()
            java.util.List r0 = r0.A02
            r7.A01(r1, r0)
        L_0x0170:
            android.widget.LinearLayout r1 = r7.A01
            if (r1 == 0) goto L_0x018e
            X.6iV r0 = r7.A00()
            java.util.List r0 = r0.A03
            boolean r0 = X.AnonymousClass000.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            X.6iV r0 = r7.A00()
            java.util.List r0 = r0.A03
            r7.A01(r1, r0)
        L_0x018e:
            X.6iV r0 = r7.A00()
            int r0 = r0.A00
            if (r0 == 0) goto L_0x01a6
            com.whatsapp.WaTextView r1 = r7.A03
            if (r1 == 0) goto L_0x01a6
            X.6iV r0 = r7.A00()
            int r0 = r0.A00
            if (r0 == 0) goto L_0x01a3
            r2 = 0
        L_0x01a3:
            r1.setVisibility(r2)
        L_0x01a6:
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r0 = X.C108965cb.A0e(r7)
            X.1DS r2 = r0.A02
            r1 = 32
            X.7AS r0 = new X.7AS
            r0.<init>(r7, r1)
            r2.A0A(r7, r0)
            return
        L_0x01b7:
            X.C18070vi.A11(r6)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.view.UserControlBaseFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        UserControlMessageLevelViewModel A0e = C108965cb.A0e(this);
        A0e.A05.A02(A0e.A00);
    }

    private final C129866iV A00() {
        C126676d7 r0 = this.A0B;
        if (r0 != null) {
            return r0.A00;
        }
        C18070vi.A11("ucBuilder");
        throw null;
    }

    public void A2K(AnonymousClass6U3 r2) {
        if (r2 instanceof C121596Kp) {
            A28();
        }
    }

    private final void A01(ViewGroup viewGroup, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C122666Rg r6 = (C122666Rg) it.next();
            View A0D = AnonymousClass3MY.A0D(A16(), 2131627283);
            C18070vi.A0z(A0D, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
            WDSListItem wDSListItem = (WDSListItem) A0D;
            AnonymousClass78M.A00(wDSListItem, this, r6, 17);
            int i = 0;
            wDSListItem.A09(C24261Jm.A00(wDSListItem.getContext(), r6.iconRes), AnonymousClass3Ma.A1Z(r6, C122666Rg.INTERESTED));
            wDSListItem.setText((CharSequence) A1H(r6.titleRes));
            WDSSwitch wDSSwitch = wDSListItem.A0D;
            if (wDSSwitch != null) {
                if (r6 != C122666Rg.MUTE_PREFS) {
                    i = 8;
                }
                wDSSwitch.setVisibility(i);
            }
            if (r6 == C122666Rg.REPORT_AND_BLOCK || r6 == C122666Rg.BLOCK) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C19740yt.A00(wDSListItem.getContext(), 2131103172));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(A1H(r6.titleRes));
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                wDSListItem.setText((CharSequence) spannableStringBuilder);
                WDSIcon wDSIcon = wDSListItem.A0A;
                if (wDSIcon != null) {
                    wDSIcon.setAction(AnonymousClass4D7.DESTRUCTIVE);
                }
            } else if (r6 == C122666Rg.STOP) {
                this.A08 = wDSListItem;
            }
            viewGroup.addView(wDSListItem);
        }
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        if (bundle != null) {
            A28();
        }
        this.A0B = new C126676d7();
        UserControlMessageLevelViewModel A0e = C108965cb.A0e(this);
        Bundle bundle2 = this.A06;
        C22941Dw r1 = UserJid.Companion;
        AnonymousClass205 r3 = null;
        if (bundle2 != null) {
            str = bundle2.getString("jid_extra");
        } else {
            str = null;
        }
        UserJid A042 = r1.A04(str);
        if (bundle2 != null) {
            r3 = AnonymousClass4aU.A03(bundle2, "");
        }
        AnonymousClass7RO.A02(A0e.A0A, A0e, r3, A042, 24);
    }
}
