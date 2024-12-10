package com.whatsapp.calling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass126;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1M9;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass74H;
import X.C108945cZ;
import X.C108955ca;
import X.C108985cd;
import X.C109195cy;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C21446AkD;
import X.C24901Mc;
import X.C24921Me;
import X.C27201Vd;
import X.C27691Xc;
import X.C28931bI;
import X.C37451pZ;
import X.C42141xh;
import X.C63982u1;
import X.C66812ym;
import X.C72043Kk;
import X.C72463Mc;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

@Deprecated
public class CallDetailsLayout extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public FrameLayout A02;
    public TextView A03;
    public TextView A04;
    public C72043Kk A05;
    public C42141xh A06;
    public C66812ym A07;
    public ThumbnailButton A08;
    public AnonymousClass1VW A09;
    public AnonymousClass1M9 A0A;
    public C24921Me A0B;
    public C37451pZ A0C;
    public C27201Vd A0D;
    public C18030ve A0E;
    public AnonymousClass126 A0F;
    public C24901Mc A0G;
    public AnonymousClass1DC A0H;
    public C28931bI A0I;
    public C28931bI A0J;
    public C28931bI A0K;
    public AnonymousClass031 A0L;
    public boolean A0M;

    public static void A01(CallDetailsLayout callDetailsLayout, CallState callState, boolean z) {
        String str;
        int i = 0;
        boolean z2 = true;
        CallState callState2 = callState;
        CallDetailsLayout callDetailsLayout2 = callDetailsLayout;
        if (z || !(Voip.A0B(callState2) || callState2 == CallState.CALLING || callState2 == CallState.PRE_ACCEPT_RECEIVED || callDetailsLayout.A00 == 1)) {
            z2 = false;
        }
        ThumbnailButton thumbnailButton = callDetailsLayout.A08;
        if (thumbnailButton.getVisibility() == 0) {
            if (!z2) {
                Log.i("voip/CallDetailsLayout/animateAvatarLayout");
                if (callState2 == CallState.NONE) {
                    str = "voip/CallDetailsLayout/animateAvatarLayout return directly, no call is going on";
                } else {
                    int i2 = callDetailsLayout.A00;
                    if (i2 == 1) {
                        str = AnonymousClass001.A1I("voip/CallDetailsLayout/animateAvatarLayout return directly, avatarAnimationState: ", AnonymousClass000.A10(), i2);
                    } else if (thumbnailButton.getVisibility() == 8) {
                        str = "voip/CallDetailsLayout/animateAvatarLayout return directly, peerAvatarLayout.getVisibility() == View.GONE ";
                    } else {
                        if (thumbnailButton.getHeight() == 0) {
                            C72463Mc.A12(thumbnailButton);
                        }
                        callDetailsLayout.A00 = 1;
                        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[3];
                        if (!z) {
                            C108985cd.A0F(thumbnailButton).setDuration(200).setListener(new C109195cy(callDetailsLayout, 3)).start();
                        } else {
                            int measuredHeight = thumbnailButton.getMeasuredHeight();
                            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setInterpolator(new DecelerateInterpolator());
                            scaleAnimation.setDuration(125);
                            thumbnailButton.startAnimation(scaleAnimation);
                            float f = (float) (-measuredHeight);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(thumbnailButton, "translationY", new float[]{f});
                            C108955ca.A1A(ofFloat);
                            ofFloat.setDuration(125);
                            objectAnimatorArr[0] = ofFloat;
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(callDetailsLayout2.A04, "translationY", new float[]{f});
                            C108955ca.A1A(ofFloat2);
                            ofFloat2.setDuration(125);
                            objectAnimatorArr[1] = ofFloat2;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(callDetailsLayout2.A03, "translationY", new float[]{f});
                            C108955ca.A1A(ofFloat3);
                            ofFloat3.setDuration(125);
                            objectAnimatorArr[2] = ofFloat3;
                            AnimatorSet A0B2 = C108945cZ.A0B();
                            A0B2.playTogether(objectAnimatorArr);
                            A0B2.start();
                            C109195cy.A02(A0B2, callDetailsLayout2, 2);
                        }
                    }
                }
                Log.i(str);
            }
            thumbnailButton.setVisibility(i);
        } else {
            if (!z2) {
                i = 8;
            }
            thumbnailButton.setVisibility(i);
        }
        int dimensionPixelSize = callDetailsLayout2.getResources().getDimensionPixelSize(2131167211);
        if (z2) {
            dimensionPixelSize = AnonymousClass3MX.A00(callDetailsLayout2.getResources(), 2131165575, dimensionPixelSize) - callDetailsLayout2.getResources().getDimensionPixelSize(2131165576);
        }
        A00(callDetailsLayout2, Integer.valueOf(dimensionPixelSize));
    }

    private void setCallDetailsDescription(List list, CallInfo callInfo) {
        String str;
        String A062;
        String str2;
        TextView textView;
        String A0q;
        setFocusable(true);
        this.A08.setImportantForAccessibility(1);
        CallInfo callInfo2 = callInfo;
        boolean isAudioChat = callInfo2.isAudioChat();
        GroupJid groupJid = callInfo2.groupJid;
        AnonymousClass1M9 r11 = this.A0A;
        C24921Me r12 = this.A0B;
        AnonymousClass1E7 A012 = C63982u1.A01(r11, this.A0F, groupJid, this.A0G, isAudioChat);
        if (A012 != null) {
            str = AnonymousClass3MY.A0q(r12, A012);
            if (str != null) {
                A062 = str;
            }
            A062 = AnonymousClass74H.A06(getContext(), r11, r12, list, 3, false);
        } else {
            str = null;
            A062 = AnonymousClass74H.A06(getContext(), r11, r12, list, 3, false);
        }
        if (Voip.A0B(callInfo2.callState)) {
            Context context = getContext();
            int i = 2131898195;
            if (callInfo2.videoEnabled) {
                i = 2131898194;
            }
            str2 = context.getString(i);
            this.A03.setImportantForAccessibility(2);
            if (str != null) {
                textView = this.A04;
                Context context2 = getContext();
                Object[] objArr = new Object[3];
                objArr[0] = str2;
                objArr[1] = AnonymousClass3MY.A0q(r12, r11.A0H(C108955ca.A0T(callInfo2)));
                A0q = C17880vN.A0q(context2, A062, objArr, 2, 2131891696);
            }
            textView = this.A04;
            Context context3 = getContext();
            Object[] objArr2 = new Object[2];
            objArr2[0] = str2;
            A0q = C17880vN.A0q(context3, A062, objArr2, 1, 2131898160);
        } else if (!callInfo2.isGroupCall || (!callInfo2.isInLonelyState() && callInfo2.callState != CallState.CALLING)) {
            Context context4 = getContext();
            int i2 = 2131898713;
            if (callInfo2.videoEnabled) {
                i2 = 2131899576;
            }
            str2 = context4.getString(i2);
            TextView textView2 = this.A03;
            textView2.setImportantForAccessibility(1);
            textView2.setFocusable(true);
            textView = this.A04;
            Context context32 = getContext();
            Object[] objArr22 = new Object[2];
            objArr22[0] = str2;
            A0q = C17880vN.A0q(context32, A062, objArr22, 1, 2131898160);
        } else {
            TextView textView3 = this.A04;
            Context context5 = getContext();
            int i3 = 2131898213;
            if (callInfo2.videoEnabled) {
                i3 = 2131898212;
            }
            textView3.setContentDescription(C17890vO.A0R(context5, A062, 1, 0, i3));
            this.A03.setImportantForAccessibility(2);
            return;
        }
        textView.setContentDescription(A0q);
    }

    public void A04(CallState callState, boolean z, boolean z2) {
        if (!z2 && callState != CallState.ACTIVE && callState != CallState.CONNECTED_LONELY && callState != CallState.ACCEPT_SENT) {
            A01(this, callState, z);
            setAlpha(1.0f);
            setVisibility(0);
            setBackgroundColor(0);
        } else if (this.A00 != 1) {
            setVisibility(8);
            this.A08.setVisibility(8);
        }
    }

    public void A03(CallInfo callInfo) {
        AnonymousClass1E7 A0H2;
        ThumbnailButton thumbnailButton = this.A08;
        if (thumbnailButton.getVisibility() != 8) {
            if (callInfo.isGroupCall) {
                boolean isAudioChat = callInfo.isAudioChat();
                GroupJid groupJid = callInfo.groupJid;
                A0H2 = C63982u1.A01(this.A0A, this.A0F, groupJid, this.A0G, isAudioChat);
                if (A0H2 == null) {
                    return;
                }
            } else {
                UserJid peerJid = callInfo.getPeerJid();
                if (peerJid != null) {
                    A0H2 = this.A0A.A0H(peerJid);
                } else {
                    return;
                }
            }
            this.A0C.A05(thumbnailButton, this.A07, A0H2, true);
        }
    }

    public void A05(String str, String str2) {
        TextView textView = this.A03;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(str);
        textView.setContentDescription(str2);
        if (!textView.isSelected()) {
            postDelayed(new C21446AkD(this, 35), 2500);
        }
    }

    public boolean A06(CallInfo callInfo) {
        if (callInfo.isGroupCall) {
            if (callInfo.videoEnabled) {
                return true;
            }
            boolean isAudioChat = callInfo.isAudioChat();
            GroupJid groupJid = callInfo.groupJid;
            if (C63982u1.A01(this.A0A, this.A0F, groupJid, this.A0G, isAudioChat) == null) {
                return true;
            }
        }
        if (Voip.A0B(callInfo.callState) || !callInfo.videoEnabled) {
            return false;
        }
        return true;
    }

    public void clearAnimation() {
        ThumbnailButton thumbnailButton = this.A08;
        thumbnailButton.clearAnimation();
        thumbnailButton.setTranslationY(0.0f);
        thumbnailButton.setAlpha(1.0f);
        TextView textView = this.A03;
        textView.clearAnimation();
        textView.setTranslationY(0.0f);
        TextView textView2 = this.A04;
        textView2.clearAnimation();
        textView2.setTranslationY(0.0f);
        thumbnailButton.setScaleX(1.0f);
        thumbnailButton.setScaleY(1.0f);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0L;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0L = r0;
        }
        return r0.generatedComponent();
    }

    public String getNameViewContentDescription() {
        TextView textView = this.A04;
        if (textView.getContentDescription() != null) {
            return textView.getContentDescription().toString();
        }
        return null;
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0M) {
            this.A0M = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A0E = AnonymousClass10E.A8r(r1);
            this.A0G = (C24901Mc) r1.AA5.get();
            this.A0A = AnonymousClass10E.A4z(r1);
            this.A0B = AnonymousClass3MZ.A0g(r1);
            this.A0F = (AnonymousClass126) r1.A4h.get();
            this.A09 = AnonymousClass3MZ.A0e(r1);
            this.A0D = AnonymousClass3MZ.A0i(r1);
            this.A07 = C27691Xc.A0A(r2);
            this.A05 = AnonymousClass3MZ.A0T(r1.A00);
            this.A0H = AnonymousClass3MZ.A13(r1);
        }
        LayoutInflater.from(context).inflate(2131624420, this, true);
        this.A04 = C17880vN.A0E(this, 2131432903);
        this.A02 = C108945cZ.A0P(this, 2131434234);
        this.A06 = C42141xh.A01(this, this.A05, 2131432903);
        this.A03 = C17880vN.A0E(this, 2131428742);
        this.A01 = getResources().getColor(2131102739);
        this.A0J = C28931bI.A00(this, 2131431261);
        this.A0K = C28931bI.A00(this, 2131431262);
        C108955ca.A1K(this.A03, this, 3);
        ThumbnailButton thumbnailButton = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131429433);
        this.A08 = thumbnailButton;
        thumbnailButton.A01 = -1.0f;
        this.A0I = C28931bI.A00(this, 2131428669);
        this.A0C = this.A0D.A08("peer-avatar-photo", 0.0f, getResources().getDimensionPixelSize(2131165582));
    }

    public static void A00(View view, Integer num) {
        int intValue;
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view);
        if (num == null) {
            intValue = A0B2.topMargin;
        } else {
            intValue = num.intValue();
        }
        int i = A0B2.bottomMargin;
        if (A0B2.topMargin != intValue) {
            A0B2.topMargin = intValue;
            A0B2.bottomMargin = i;
            view.setLayoutParams(A0B2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.voipcalling.CallInfo r11) {
        /*
            r10 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Map r0 = r11.participants
            java.util.Iterator r4 = X.C17890vO.A0l(r0)
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r3 = r4.next()
            X.6qE r3 = (X.C134216qE) r3
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x000e
            int r2 = r3.A04
            r1 = 1
            com.whatsapp.jid.UserJid r0 = r3.A0A
            if (r2 != r1) goto L_0x0029
            r6.add(r0)
            goto L_0x000e
        L_0x0029:
            r5.add(r0)
            goto L_0x000e
        L_0x002d:
            java.util.ArrayList r7 = X.C17880vN.A10(r6)
            r7.addAll(r5)
            r10.setCallDetailsDescription(r7, r11)
            boolean r3 = r11.isAudioChat()
            com.whatsapp.jid.GroupJid r2 = r11.groupJid
            X.1M9 r5 = r10.A0A
            X.1Me r6 = r10.A0B
            X.1Mc r1 = r10.A0G
            X.126 r0 = r10.A0F
            X.1E7 r0 = X.C63982u1.A01(r5, r0, r2, r1, r3)
            if (r0 == 0) goto L_0x012e
            java.lang.String r3 = X.AnonymousClass3MY.A0q(r6, r0)
        L_0x004f:
            int r4 = r7.size()
            boolean r0 = r11.isInLonelyState()
            if (r0 != 0) goto L_0x005c
            if (r4 != 0) goto L_0x005c
        L_0x005b:
            return
        L_0x005c:
            com.whatsapp.jid.UserJid r0 = r11.getInitialPeerJid()
            X.C17960vV.A07(r0)
            boolean r0 = r11.isInLonelyState()
            r2 = 1
            r9 = 0
            if (r0 != 0) goto L_0x011d
            com.whatsapp.voipcalling.CallState r1 = r11.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0079
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0079
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x011d
        L_0x0079:
            r1 = 1
        L_0x007a:
            if (r4 != r2) goto L_0x00f8
            com.whatsapp.jid.UserJid r0 = r11.getInitialPeerJid()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x00f1
            com.whatsapp.jid.UserJid r0 = r11.getInitialPeerJid()
        L_0x008a:
            X.1E7 r3 = r5.A0H(r0)
            X.1xh r1 = r10.A06
            r0 = 11
            r1.A08(r3, r0)
        L_0x0095:
            android.widget.FrameLayout r4 = r10.A02
            int r0 = r4.getChildCount()
            if (r0 <= r2) goto L_0x00e4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallDetailsLayout/updatePushNameViews: Too many children("
            r1.append(r0)
            int r0 = r4.getChildCount()
            r1.append(r0)
            java.lang.String r0 = ")"
            X.C17890vO.A19(r1, r0)
            r4.removeAllViews()
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r3 == 0) goto L_0x0120
            X.2lf r1 = r3.A0H
            if (r1 != 0) goto L_0x0120
            boolean r1 = r11.isCaller
            if (r1 != 0) goto L_0x0120
            java.lang.String r3 = X.AnonymousClass3MX.A17(r6, r3)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0120
            if (r0 != 0) goto L_0x00dd
            android.content.Context r2 = r10.getContext()
            r1 = 2131624421(0x7f0e01e5, float:1.8876021E38)
            r0 = 0
            android.view.View r0 = android.view.View.inflate(r2, r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.addView(r0)
        L_0x00dd:
            r0.setVisibility(r9)
            r0.setText(r3)
            return
        L_0x00e4:
            int r0 = r4.getChildCount()
            if (r0 != r2) goto L_0x00b5
            android.view.View r0 = r4.getChildAt(r9)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00b6
        L_0x00f1:
            java.lang.Object r0 = r7.get(r9)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            goto L_0x008a
        L_0x00f8:
            if (r3 != 0) goto L_0x010b
            boolean r0 = r11.videoEnabled
            if (r0 != 0) goto L_0x0113
            if (r1 == 0) goto L_0x0113
            android.content.Context r1 = r10.getContext()
            r0 = 2131891177(0x7f1213e9, float:1.9417067E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x010b:
            X.1xh r1 = r10.A06
            r0 = 0
            r1.A0B(r0, r3)
            r3 = 0
            goto L_0x0095
        L_0x0113:
            android.content.Context r4 = r10.getContext()
            r8 = 3
            java.lang.String r3 = X.AnonymousClass74H.A06(r4, r5, r6, r7, r8, r9)
            goto L_0x010b
        L_0x011d:
            r1 = 0
            goto L_0x007a
        L_0x0120:
            if (r0 == 0) goto L_0x005b
            int r2 = r0.getVisibility()
            r1 = 8
            if (r2 == r1) goto L_0x005b
            r0.setVisibility(r1)
            return
        L_0x012e:
            r3 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.CallDetailsLayout.A02(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0C.A02();
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallDetailsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
