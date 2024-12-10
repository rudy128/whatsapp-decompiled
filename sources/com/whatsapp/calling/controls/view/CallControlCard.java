package com.whatsapp.calling.controls.view;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1V9;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DG;
import X.AnonymousClass4DM;
import X.AnonymousClass4RO;
import X.AnonymousClass4YS;
import X.AnonymousClass4ZN;
import X.AnonymousClass4aL;
import X.AnonymousClass4aR;
import X.AnonymousClass5DA;
import X.AnonymousClass5DB;
import X.AnonymousClass5DC;
import X.AnonymousClass5X0;
import X.AnonymousClass5X1;
import X.AnonymousClass74H;
import X.C105105Qs;
import X.C106735Wz;
import X.C108895cT;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C27691Xc;
import X.C27881Xz;
import X.C28931bI;
import X.C30391dr;
import X.C43531zx;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C84074Ht;
import X.C89704ct;
import X.C89874dA;
import X.C89994dM;
import X.C90034dQ;
import X.C93424ix;
import X.C93444iz;
import X.C93454j0;
import X.C93464j1;
import X.C93474j2;
import X.C93484j3;
import X.C95774mm;
import X.C98244qo;
import X.C98254qp;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.calling.wds.CallingMediaWDSButton;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class CallControlCard extends ConstraintLayout implements AnonymousClass009 {
    public C108895cT A00;
    public AnonymousClass4aL A01;
    public AnonymousClass1V9 A02;
    public AnonymousClass4RO A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C18070vi.A0d(context, 1);
    }

    public static final void setAcceptDeclineClickListeners$lambda$19(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        AnonymousClass4aL callControlStateHolder = callControlCard.getCallControlStateHolder();
        Log.i("CallControlState/onDeclineUpgradeRequest");
        A99 a99 = callControlStateHolder.A05.A00;
        if (a99 != null) {
            a99.A0k(0);
        }
    }

    public static final void setAcceptDeclineClickListeners$lambda$20(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        AnonymousClass4aL callControlStateHolder = callControlCard.getCallControlStateHolder();
        if (AnonymousClass74H.A0A(callControlStateHolder.A07, callControlStateHolder.A0A, true)) {
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(callControlStateHolder.A0B), 11525)) {
                AnonymousClass4aL.A02(callControlStateHolder, "CallControlState/onAcceptUpgradeRequest/requesting permission").A01(AnonymousClass4DM.CALL_UPGRADE_ACCEPT_NO_PERMISSION);
                return;
            }
        }
        Log.i("CallControlState/onAcceptUpgradeRequest");
        A99 a99 = callControlStateHolder.A05.A00;
        if (a99 != null) {
            a99.A0T();
        }
    }

    public static final void setCallOnHoldClickListeners$lambda$23(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        AnonymousClass4aL.A02(callControlCard.getCallControlStateHolder(), "CallControlState/onEndCall").A01(AnonymousClass4DM.END_CALL);
    }

    public static final void setCallOnHoldClickListeners$lambda$24(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        ((AnonymousClass4YS) callControlCard.getCallControlStateHolder().A0D.getValue()).A01(AnonymousClass4DM.RESUME_CALL);
    }

    public static final void setLobbyClickListeners$lambda$21(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        callControlCard.getCallControlStateHolder().A05();
    }

    public static final void setLobbyClickListeners$lambda$22(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        callControlCard.getCallControlStateHolder().A06();
    }

    public static final void setupOnAttach$lambda$10(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        C18070vi.A0b(view);
        callControlCard.getCallControlsConfig();
        AnonymousClass3Ma.A16(view);
        AnonymousClass4aL.A02(callControlCard.getCallControlStateHolder(), "CallControlState/onMoreMenuClick").A01(AnonymousClass4DM.SHOW_MORE_MENU);
        callControlCard.A00(52);
    }

    public static final void setupOnAttach$lambda$12(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        AnonymousClass4aL.A02(callControlCard.getCallControlStateHolder(), "CallControlState/onParticipantHeaderClicked").A01(AnonymousClass4DM.PARTICIPANTS);
    }

    public static final void setupOnAttach$lambda$13(CallControlCard callControlCard, View view) {
        C18070vi.A0d(callControlCard, 0);
        C18070vi.A0b(view);
        AnonymousClass3Ma.A16(view);
        AnonymousClass4aL callControlStateHolder = callControlCard.getCallControlStateHolder();
        Log.i("CallControlState/onUpgradeCallCancelled");
        A99 a99 = callControlStateHolder.A05.A00;
        if (a99 != null) {
            a99.A0i(0);
        }
    }

    public static final void setupOnAttach$lambda$16(CallControlCard callControlCard, ViewGroup viewGroup) {
        C18070vi.A0d(callControlCard, 0);
        View findViewById = callControlCard.findViewById(2131430878);
        findViewById.setOnClickListener(new C89994dM(callControlCard, findViewById, 35));
        View findViewById2 = callControlCard.findViewById(2131434991);
        findViewById2.setOnClickListener(new C89994dM(callControlCard, findViewById2, 36));
    }

    public final void setCallControlStateHolder(AnonymousClass4aL r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCallControlsConfig(C108895cT r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setUserJourneyLogger(AnonymousClass1V9 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public static final void A01(CallControlCard callControlCard) {
        AnonymousClass3MW.A0A(callControlCard.A0H).setVisibility(8);
        C90034dQ.A01(callControlCard.getAudioRouteButton(), callControlCard, 1);
        C90034dQ.A01(callControlCard.getEndCallButton(), callControlCard, 2);
        C90034dQ.A01(callControlCard.getMuteButton(), callControlCard, 3);
        C90034dQ.A01(callControlCard.getCameraButton(), callControlCard, 4);
        AnonymousClass3MX.A0v(callControlCard.A09).A05(new C90034dQ(callControlCard, 5));
        C90034dQ.A01(callControlCard.getMoreButton(), callControlCard, 6);
        C98244qo.A00(AnonymousClass3MX.A0v(callControlCard.A0C), 0);
        C18100vl r2 = callControlCard.A0E;
        C90034dQ.A01(AnonymousClass3MW.A0A(r2), callControlCard, 7);
        AnonymousClass4aR.A07(AnonymousClass3MW.A0A(r2), AnonymousClass3Ma.A11(callControlCard, 2131898189), AnonymousClass3Ma.A11(callControlCard, 2131898188));
        AnonymousClass3MX.A0v(callControlCard.A0D).A05(new C89874dA(callControlCard, 45));
        C98254qp.A00(AnonymousClass3MX.A0v(callControlCard.A0I), callControlCard, 4);
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(callControlCard);
        if (A002 != null) {
            AnonymousClass3MX.A1Q(new CallControlCard$setupOnAttach$11(A002, callControlCard, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
            AnonymousClass3MY.A1K(A002, callControlCard.getCallControlStateHolder().A03, AnonymousClass3MW.A16(callControlCard, 5), 22);
            AnonymousClass3MY.A1K(A002, callControlCard.getCallControlStateHolder().A04, new C105105Qs(callControlCard), 22);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.whatsapp.calling.controls.view.CallControlCard r6, X.AnonymousClass4E9 r7) {
        /*
            boolean r2 = r7 instanceof X.C76203mm
            if (r2 != 0) goto L_0x01ad
            boolean r0 = r7 instanceof X.C76213mn
            if (r0 == 0) goto L_0x01a2
            r0 = r7
            X.3mn r0 = (X.C76213mn) r0
            int r5 = r0.A02
        L_0x000d:
            r3 = 0
            r4 = 8
            X.0vl r1 = r6.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r1)
            if (r5 != 0) goto L_0x016e
            r0.setVisibility(r4)
        L_0x001b:
            boolean r0 = r7 instanceof X.C76213mn
            if (r0 == 0) goto L_0x00a9
            X.3mn r7 = (X.C76213mn) r7
            X.5X0 r1 = r7.A03
            com.whatsapp.calling.wds.CallingMediaWDSButton r0 = r6.getAudioRouteButton()
            float r2 = r7.A01
            r6.A04(r1, r0, r2)
            X.5X0 r3 = r7.A05
            boolean r0 = r3 instanceof X.C93454j0
            if (r0 == 0) goto L_0x003c
            X.0vl r0 = r6.A09
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0051
        L_0x003c:
            X.0vl r0 = r6.A09
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            android.view.View r1 = r0.A02()
            boolean r0 = r1 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x0051
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            if (r1 == 0) goto L_0x0051
            r6.A04(r3, r1, r2)
        L_0x0051:
            r6.getCallControlsConfig()
            X.5X0 r1 = r7.A07
            com.whatsapp.calling.wds.CallingMediaWDSButton r0 = r6.getMoreButton()
            r6.A04(r1, r0, r2)
            X.5X0 r1 = r7.A08
            com.whatsapp.calling.wds.CallingMediaWDSButton r0 = r6.getMuteButton()
            r6.A04(r1, r0, r2)
            X.5X0 r1 = r7.A04
            com.whatsapp.calling.wds.CallingMediaWDSButton r0 = r6.getCameraButton()
            r6.A04(r1, r0, r2)
            X.5X0 r1 = r7.A06
            com.whatsapp.wds.components.button.WDSButton r0 = r6.getEndCallButton()
            r6.A04(r1, r0, r2)
            X.4iy r1 = X.C93434iy.A00
            X.0vl r0 = r6.A07
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            X.0vl r0 = r6.A0I
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            X.0vl r0 = r6.A0E
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r4)
            X.5X1 r0 = r7.A09
            r6.A05(r0)
        L_0x009a:
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r6)
            r0 = 2131165614(0x7f0701ae, float:1.794545E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r6.setMaxWidth(r0)
        L_0x00a8:
            return
        L_0x00a9:
            boolean r0 = r7 instanceof X.C76193ml
            if (r0 == 0) goto L_0x00ef
            X.0vl r0 = r6.A0H
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r4)
            X.3ml r7 = (X.C76193ml) r7
            X.5Wz r1 = r7.A02
            X.0vl r0 = r6.A07
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            X.0vl r0 = r6.A0E
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r4)
            X.5X1 r0 = r7.A03
            r6.A05(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.getButtonGroupFirstButton()
            r0 = 48
            X.C89874dA.A00(r1, r6, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.getButtonGroupSecondButton()
            r0 = 49
            X.C89874dA.A00(r1, r6, r0)
            X.4iy r1 = X.C93434iy.A00
            X.0vl r0 = r6.A0I
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            goto L_0x009a
        L_0x00ef:
            if (r2 == 0) goto L_0x0134
            X.0vl r0 = r6.A0H
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r4)
            X.0vl r0 = r6.A0E
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r3)
            X.3mm r7 = (X.C76203mm) r7
            X.5X1 r0 = r7.A03
            r6.A05(r0)
            X.5Wz r1 = r7.A02
            X.0vl r0 = r6.A07
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            X.5Wz r1 = r7.A01
            X.0vl r0 = r6.A0I
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.getButtonGroupFirstButton()
            r0 = 46
            X.C89874dA.A00(r1, r6, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.getButtonGroupSecondButton()
            r0 = 47
            X.C89874dA.A00(r1, r6, r0)
            goto L_0x009a
        L_0x0134:
            boolean r0 = r7 instanceof X.C76183mk
            if (r0 == 0) goto L_0x00a8
            X.0vl r0 = r6.A0H
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r4)
            X.0vl r0 = r6.A0E
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setVisibility(r4)
            X.3mk r7 = (X.C76183mk) r7
            X.5X1 r0 = r7.A02
            r6.A05(r0)
            X.5Wz r1 = r7.A01
            X.0vl r0 = r6.A07
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r6.A03(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.getButtonGroupFirstButton()
            r0 = 44
            X.C89874dA.A00(r1, r6, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r6.getButtonGroupSecondButton()
            X.C90034dQ.A01(r0, r6, r3)
            goto L_0x009a
        L_0x016e:
            r0.setVisibility(r3)
            android.view.View r0 = X.AnonymousClass3MW.A0A(r1)
            r0.setBackgroundResource(r5)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r1)
            if (r2 == 0) goto L_0x0188
            r0 = r7
            X.3mm r0 = (X.C76203mm) r0
            float r0 = r0.A00
        L_0x0183:
            r1.setAlpha(r0)
            goto L_0x001b
        L_0x0188:
            boolean r0 = r7 instanceof X.C76213mn
            if (r0 == 0) goto L_0x0192
            r0 = r7
            X.3mn r0 = (X.C76213mn) r0
            float r0 = r0.A00
            goto L_0x0183
        L_0x0192:
            boolean r0 = r7 instanceof X.C76193ml
            if (r0 == 0) goto L_0x019c
            r0 = r7
            X.3ml r0 = (X.C76193ml) r0
            float r0 = r0.A00
            goto L_0x0183
        L_0x019c:
            r0 = r7
            X.3mk r0 = (X.C76183mk) r0
            float r0 = r0.A00
            goto L_0x0183
        L_0x01a2:
            boolean r0 = r7 instanceof X.C76193ml
            if (r0 == 0) goto L_0x01ad
            r0 = r7
            X.3ml r0 = (X.C76193ml) r0
            int r5 = r0.A01
            goto L_0x000d
        L_0x01ad:
            r5 = 2131231174(0x7f0801c6, float:1.8078422E38)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.controls.view.CallControlCard.A02(com.whatsapp.calling.controls.view.CallControlCard, X.4E9):void");
    }

    private final void A03(C106735Wz r5, C28931bI r6) {
        boolean z = r5 instanceof C93424ix;
        r6.A04(C72453Mb.A07(z ? 1 : 0));
        if (z) {
            View A022 = r6.A02();
            C93424ix r52 = (C93424ix) r5;
            A04(r52.A00, (WDSButton) AnonymousClass3MX.A0C(A022, 2131430878), 0.0f);
            A04(r52.A01, (WDSButton) AnonymousClass3MX.A0C(A022, 2131434991), 0.0f);
        }
    }

    private final void A04(AnonymousClass5X0 r6, WDSButton wDSButton, float f) {
        String str;
        String A11;
        int i;
        if (r6 instanceof C93454j0) {
            wDSButton.setVisibility(8);
            return;
        }
        if (r6 instanceof C93464j1) {
            C93464j1 r62 = (C93464j1) r6;
            AnonymousClass4DG r0 = r62.A06;
            if (r0 != null) {
                wDSButton.setAction(r0);
            }
            C27881Xz r02 = r62.A07;
            if (r02 != null) {
                wDSButton.setVariant(r02);
            }
            boolean isSelected = wDSButton.isSelected();
            boolean z = r62.A09;
            if (!(isSelected == z || (i = r62.A04) == 0)) {
                wDSButton.announceForAccessibility(AnonymousClass3Ma.A11(this, i));
            }
            wDSButton.setVisibility(0);
            wDSButton.setRotation(f);
            wDSButton.setEnabled(r62.A08);
            wDSButton.setSelected(z);
            int i2 = r62.A02;
            if (i2 != 0) {
                int i3 = r62.A03;
                if (i3 == 0) {
                    wDSButton.A08 = false;
                    wDSButton.setIcon(i2);
                } else {
                    wDSButton.A08 = true;
                    wDSButton.setIcon(new C95774mm(i2, i3).BQt(getContext()));
                }
            }
            int i4 = r62.A01;
            int i5 = r62.A00;
            str = null;
            if (i4 == 0) {
                A11 = null;
            } else {
                A11 = AnonymousClass3Ma.A11(this, i4);
            }
            if (i5 != 0) {
                str = AnonymousClass3Ma.A11(this, i5);
            }
        } else if (r6 instanceof C93444iz) {
            C93444iz r63 = (C93444iz) r6;
            wDSButton.setText(r63.A02);
            wDSButton.setIcon(r63.A01);
            int i6 = r63.A00;
            str = null;
            if (i6 == 0) {
                A11 = null;
            } else {
                A11 = AnonymousClass3Ma.A11(this, i6);
            }
        } else {
            return;
        }
        AnonymousClass4aR.A07(wDSButton, A11, str);
    }

    private final void A05(AnonymousClass5X1 r9) {
        C18100vl r5;
        int dimensionPixelSize;
        if (r9 instanceof C93484j3) {
            AnonymousClass3MX.A0v(this.A0F).A04(8);
            AnonymousClass3MX.A0v(this.A0D).A04(8);
            AnonymousClass3MX.A0v(this.A0B).A04(8);
            AnonymousClass3MX.A0v(this.A0C).A04(8);
            AnonymousClass3MX.A0v(this.A08).A04(8);
        } else if (r9 instanceof C93474j2) {
            C18100vl r2 = this.A0F;
            AnonymousClass3MX.A0v(r2).A04(0);
            C18100vl r4 = this.A0D;
            AnonymousClass3MX.A0v(r4).A04(0);
            C93474j2 r92 = (C93474j2) r9;
            AnonymousClass3MX.A0v(this.A0B).A04(0);
            AnonymousClass3MX.A0v(r2).A02().setTextAlignment(r92.A00);
            AnonymousClass4ZN.A02(this, AnonymousClass3MX.A0M(AnonymousClass3MX.A0v(r2)), r92.A02);
            List list = r92.A03;
            boolean isEmpty = list.isEmpty();
            C18100vl r3 = this.A08;
            C28931bI A0v = AnonymousClass3MX.A0v(r3);
            if (isEmpty) {
                A0v.A04(8);
                r5 = this.A0C;
                AnonymousClass3MX.A0v(r5).A04(8);
                AnonymousClass3MX.A0M(AnonymousClass3MX.A0v(r2)).setSingleLine(false);
            } else {
                A0v.A04(0);
                r5 = this.A0C;
                AnonymousClass3MX.A0v(r5).A04(0);
                ((PeerAvatarLayout) AnonymousClass3MX.A0v(r5).A02()).A05.A0W(list);
                AnonymousClass3MX.A0M(AnonymousClass3MX.A0v(r2)).setSingleLine(true);
                AnonymousClass3MX.A0M(AnonymousClass3MX.A0v(r2)).setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            A04(r92.A01, (WDSButton) AnonymousClass3MX.A0D(AnonymousClass3MX.A0v(r4)), 0.0f);
            if (AnonymousClass3MX.A0v(r2).A01() == 0) {
                int A012 = AnonymousClass3MX.A0v(r5).A01();
                int i = 0;
                if (A012 == 0 || AnonymousClass3MX.A0v(r4).A01() == 0) {
                    dimensionPixelSize = getResources().getDimensionPixelSize(2131168777);
                } else {
                    dimensionPixelSize = 0;
                }
                if (AnonymousClass3MX.A0v(r3).A01() == 0) {
                    i = C72463Mc.A05(this);
                }
                View A0D2 = AnonymousClass3MX.A0D(AnonymousClass3MX.A0v(r2));
                ViewGroup.LayoutParams layoutParams = A0D2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(i);
                    marginLayoutParams.setMarginEnd(dimensionPixelSize);
                    A0D2.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    private final CallingMediaWDSButton getAudioRouteButton() {
        return (CallingMediaWDSButton) this.A0J.getValue();
    }

    private final View getBackgroundView() {
        return AnonymousClass3MW.A0A(this.A06);
    }

    private final WDSButton getButtonGroupFirstButton() {
        return (WDSButton) this.A0K.getValue();
    }

    private final WDSButton getButtonGroupSecondButton() {
        return (WDSButton) this.A0L.getValue();
    }

    private final C28931bI getButtonGroupStubHolder() {
        return AnonymousClass3MX.A0v(this.A07);
    }

    private final CallingMediaWDSButton getCameraButton() {
        return (CallingMediaWDSButton) this.A0M.getValue();
    }

    private final C28931bI getConnectIcon() {
        return AnonymousClass3MX.A0v(this.A08);
    }

    private final C28931bI getDialpadButtonStubHolder() {
        return AnonymousClass3MX.A0v(this.A09);
    }

    private final C28931bI getDialpadStubHolder() {
        return AnonymousClass3MX.A0v(this.A0A);
    }

    private final C28931bI getDividerStubHolder() {
        return AnonymousClass3MX.A0v(this.A0B);
    }

    private final WDSButton getEndCallButton() {
        return (WDSButton) this.A0N.getValue();
    }

    private final C28931bI getFacePileStubHolder() {
        return AnonymousClass3MX.A0v(this.A0C);
    }

    private final C28931bI getHeaderButtonStubHolder() {
        return AnonymousClass3MX.A0v(this.A0D);
    }

    private final View getHeaderClickArea() {
        return AnonymousClass3MW.A0A(this.A0E);
    }

    private final C28931bI getHeaderTextStubHolder() {
        return AnonymousClass3MX.A0v(this.A0F);
    }

    private final int getInCallControlButtonsHeightWithMargin() {
        return C72453Mb.A0I(this.A0G);
    }

    private final View getInCallControlsGroup() {
        return AnonymousClass3MW.A0A(this.A0H);
    }

    private final CallingMediaWDSButton getMoreButton() {
        return (CallingMediaWDSButton) this.A0O.getValue();
    }

    private final CallingMediaWDSButton getMuteButton() {
        return (CallingMediaWDSButton) this.A0P.getValue();
    }

    private final C28931bI getPreCallButtonGroupStubHolder() {
        return AnonymousClass3MX.A0v(this.A0I);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4RO getAudioRoutePopupMenu() {
        return this.A03;
    }

    public final AnonymousClass4aL getCallControlStateHolder() {
        AnonymousClass4aL r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callControlStateHolder");
        throw null;
    }

    public final C108895cT getCallControlsConfig() {
        C108895cT r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callControlsConfig");
        throw null;
    }

    public final AnonymousClass1V9 getUserJourneyLogger() {
        AnonymousClass1V9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userJourneyLogger");
        throw null;
    }

    private final void A00(int i) {
        getUserJourneyLogger().A01(C17880vN.A0k(), i, 16);
    }

    public static final void setupOnAttach$lambda$11(PeerAvatarLayout peerAvatarLayout) {
        peerAvatarLayout.setFixedContactPhotoSizeRes(2131165616);
    }

    public static final void setupOnAttach$lambda$16$lambda$14(CallControlCard callControlCard, View view, View view2) {
        C72483Me.A0n(view2, callControlCard);
        callControlCard.getCallControlStateHolder().A08();
        int i = 28;
        if (view.isSelected()) {
            i = 29;
        }
        callControlCard.A00(i);
    }

    public static final void setupOnAttach$lambda$16$lambda$15(CallControlCard callControlCard, View view, View view2) {
        C72483Me.A0n(view2, callControlCard);
        AnonymousClass4aL callControlStateHolder = callControlCard.getCallControlStateHolder();
        Log.i("CallControlState/onMuteToggled");
        A99 a99 = callControlStateHolder.A05.A00;
        if (a99 != null) {
            a99.A0z((Boolean) null);
        }
        callControlCard.A00(C72453Mb.A03(view.isSelected() ? 1 : 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.C17880vN.A0P(r8.A0B), 11441) != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupOnAttach$lambda$5(com.whatsapp.calling.controls.view.CallControlCard r9, android.view.View r10) {
        /*
            X.C72483Me.A0n(r10, r9)
            X.4aL r8 = r9.getCallControlStateHolder()
            java.lang.String r0 = "CallControlState/onAudioRouteClick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Sa r0 = r8.A01
            if (r0 == 0) goto L_0x00c8
            X.00H r7 = r8.A0C
            X.4U2 r1 = X.C88054Yd.A00(r7)
            boolean r10 = r0.A0Q
            if (r10 != 0) goto L_0x0027
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00c9
            int r1 = r1.A00
            r0 = 4
            if (r1 != r0) goto L_0x00c9
        L_0x0027:
            java.lang.String r0 = "CallControlState/onAudioRouteClick/getAudioRouteOptions"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wy r4 = r8.A09
            X.DcQ r6 = X.AnonymousClass1ZT.A01()
            r9 = 2131886796(0x7f1202cc, float:1.940818E38)
            r3 = 2131232425(0x7f0806a9, float:1.8080959E38)
            X.4U2 r0 = X.C88054Yd.A00(r7)
            int r0 = r0.A00
            r5 = 0
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r0, r2)
            X.4UV r0 = new X.4UV
            r0.<init>(r9, r3, r2, r1)
            r6.add(r0)
            if (r10 != 0) goto L_0x0067
            r9 = 2131886794(0x7f1202ca, float:1.9408177E38)
            r3 = 2131233399(0x7f080a77, float:1.8082934E38)
            X.4U2 r0 = X.C88054Yd.A00(r7)
            int r0 = r0.A00
            r2 = 2
            boolean r1 = X.AnonymousClass000.A1T(r0, r2)
            X.4UV r0 = new X.4UV
            r0.<init>(r9, r3, r2, r1)
            r6.add(r0)
        L_0x0067:
            X.4U2 r0 = X.C88054Yd.A00(r7)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0088
            r9 = 2131886792(0x7f1202c8, float:1.9408173E38)
            r3 = 2131231721(0x7f0803e9, float:1.807953E38)
            X.4U2 r0 = X.C88054Yd.A00(r7)
            int r0 = r0.A00
            r2 = 3
            boolean r1 = X.AnonymousClass000.A1T(r0, r2)
            X.4UV r0 = new X.4UV
            r0.<init>(r9, r3, r2, r1)
            r6.add(r0)
        L_0x0088:
            X.4U2 r1 = X.C88054Yd.A00(r7)
            int r0 = r1.A00
            r3 = 4
            if (r0 == r3) goto L_0x00a5
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00bc
            X.00H r0 = r8.A0B
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 11441(0x2cb1, float:1.6032E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00bc
        L_0x00a5:
            r2 = 2131886795(0x7f1202cb, float:1.9408179E38)
            r1 = 2131233317(0x7f080a25, float:1.8082768E38)
            X.4U2 r0 = X.C88054Yd.A00(r7)
            int r0 = r0.A00
            if (r0 != r3) goto L_0x00b4
            r5 = 1
        L_0x00b4:
            X.4UV r0 = new X.4UV
            r0.<init>(r2, r1, r3, r5)
            r6.add(r0)
        L_0x00bc:
            X.DcQ r1 = X.AnonymousClass1ZT.A02(r6)
            X.4Sf r0 = new X.4Sf
            r0.<init>(r1)
            r4.A0F(r0)
        L_0x00c8:
            return
        L_0x00c9:
            X.4U2 r0 = X.C88054Yd.A00(r7)
            int r2 = r0.A00
            r1 = 1
            r0 = 9
            if (r2 != r1) goto L_0x00d6
            r0 = 10
        L_0x00d6:
            X.AnonymousClass4aL.A04(r8, r0)
            java.lang.String r0 = "CallControlState/onAudioRouteClick/toggleSpeakerphone"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4jH r0 = r8.A05
            X.A99 r0 = r0.A00
            if (r0 == 0) goto L_0x00c8
            r0.A0e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$5(com.whatsapp.calling.controls.view.CallControlCard, android.view.View):void");
    }

    public static final void setupOnAttach$lambda$6(CallControlCard callControlCard, View view) {
        C72483Me.A0n(view, callControlCard);
        AnonymousClass4aL.A02(callControlCard.getCallControlStateHolder(), "CallControlState/onEndCall").A01(AnonymousClass4DM.END_CALL);
        callControlCard.A00(24);
    }

    public static final void setupOnAttach$lambda$7(CallControlCard callControlCard, View view) {
        C72483Me.A0n(view, callControlCard);
        AnonymousClass4aL callControlStateHolder = callControlCard.getCallControlStateHolder();
        Log.i("CallControlState/onMuteToggled");
        A99 a99 = callControlStateHolder.A05.A00;
        if (a99 != null) {
            a99.A0z((Boolean) null);
        }
        callControlCard.A00(C72453Mb.A03(callControlCard.getMuteButton().isSelected() ? 1 : 0));
    }

    public static final void setupOnAttach$lambda$8(CallControlCard callControlCard, View view) {
        C72483Me.A0n(view, callControlCard);
        if (callControlCard.getCallControlStateHolder().A08()) {
            int i = 28;
            if (callControlCard.getCameraButton().isSelected()) {
                i = 29;
            }
            callControlCard.A00(i);
        }
    }

    public static final void setupOnAttach$lambda$9(CallControlCard callControlCard, View view) {
        C72483Me.A0n(view, callControlCard);
        C18100vl r0 = callControlCard.A0A;
        AnonymousClass3MX.A0v(r0).A04(C72453Mb.A02(AnonymousClass3MX.A0v(r0).A01()));
    }

    public final int getInCallControlsTop() {
        return getBottom() - C72453Mb.A0I(this.A0G);
    }

    public final void setAudioRoutePopupMenu(AnonymousClass4RO r1) {
        this.A03 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A01 = (AnonymousClass4aL) r1.A0z.A0O.get();
            AnonymousClass10E r12 = r1.A10;
            this.A00 = (C108895cT) r12.A00.AFB.get();
            this.A02 = (AnonymousClass1V9) r12.A1e.get();
        }
        Integer num = AnonymousClass00R.A0C;
        this.A0N = C43531zx.A02(this, num, 2131430466);
        this.A0J = C43531zx.A02(this, num, 2131427902);
        this.A0O = C43531zx.A02(this, num, 2131432786);
        this.A0P = C43531zx.A02(this, num, 2131432878);
        this.A0M = C43531zx.A02(this, num, 2131428783);
        this.A0H = C43531zx.A02(this, num, 2131431588);
        this.A0E = C43531zx.A02(this, num, 2131431366);
        this.A06 = C43531zx.A02(this, num, 2131428018);
        this.A08 = C84074Ht.A00(this, num, 2131429358);
        this.A09 = C84074Ht.A00(this, num, 2131429992);
        this.A0A = C84074Ht.A00(this, num, 2131429995);
        this.A0B = C84074Ht.A00(this, num, 2131430073);
        this.A0F = C84074Ht.A00(this, num, 2131431386);
        this.A0D = C84074Ht.A00(this, num, 2131431365);
        this.A0C = C84074Ht.A00(this, num, 2131430773);
        this.A07 = C84074Ht.A00(this, num, 2131428604);
        this.A0I = C84074Ht.A00(this, num, 2131434014);
        this.A0K = AnonymousClass1DF.A01(new AnonymousClass5DA(this));
        this.A0L = AnonymousClass1DF.A01(new AnonymousClass5DB(this));
        this.A0G = AnonymousClass1DF.A01(new AnonymousClass5DC(this));
        View.inflate(context, 2131624412, this);
        if (isAttachedToWindow()) {
            A01(this);
        } else {
            C89704ct.A00(this, 1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallControlCard(Context context, AttributeSet attributeSet, int i, int i2, int i3, AnonymousClass1Y1 r9) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i3), AnonymousClass3MY.A00(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallControlCard(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        C18070vi.A0d(context, 1);
    }
}
