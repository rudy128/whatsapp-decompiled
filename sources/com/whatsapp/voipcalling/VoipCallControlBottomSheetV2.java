package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1FD;
import X.AnonymousClass1FL;
import X.AnonymousClass1G4;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass1HQ;
import X.AnonymousClass1KB;
import X.AnonymousClass1PM;
import X.AnonymousClass1V9;
import X.AnonymousClass1Z2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3WN;
import X.AnonymousClass4aR;
import X.AnonymousClass6Z8;
import X.AnonymousClass735;
import X.AnonymousClass75B;
import X.AnonymousClass75F;
import X.AnonymousClass793;
import X.AnonymousClass7AM;
import X.AnonymousClass7DS;
import X.AnonymousClass7RN;
import X.AnonymousClass867;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C109985ek;
import X.C123576Uz;
import X.C126746dE;
import X.C131796lg;
import X.C133046o5;
import X.C1407973c;
import X.C1422178p;
import X.C160868Ag;
import X.C160958At;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C19740yt;
import X.C24911Md;
import X.C26911Ty;
import X.C27301Vn;
import X.C28931bI;
import X.C34001jj;
import X.C37961qT;
import X.C38391rD;
import X.C40811vJ;
import X.C63982u1;
import X.C72453Mb;
import X.C93694jO;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.views.InCallDialPadView;
import com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.util.Log;

public class VoipCallControlBottomSheetV2 extends Hilt_VoipCallControlBottomSheetV2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public Space A0C;
    public NestedScrollView A0D;
    public RecyclerView A0E;
    public MaterialButton A0F;
    public MaterialButton A0G;
    public AnonymousClass1KB A0H;
    public C26911Ty A0I;
    public AnonymousClass1HQ A0J;
    public C1407973c A0K;
    public AnonymousClass3WN A0L;
    public BottomSheetViewModel A0M;
    public CallControlButtonsViewModel A0N;
    public C160868Ag A0O;
    public AnonymousClass1V9 A0P;
    public ParticipantsListViewModel A0Q;
    public C24911Md A0R;
    public VoipCallControlBottomSheetDragIndicator A0S;
    public VoipCallFooter A0T;
    public AnonymousClass1PM A0U;
    public AnonymousClass11C A0V;
    public C27301Vn A0W;
    public C18030ve A0X;
    public AnonymousClass1DC A0Y;
    public C28931bI A0Z;
    public AnonymousClass10I A0a;
    public C131796lg A0b;
    public AnonymousClass00H A0c;
    public String A0d;
    public boolean A0e;
    public int A0f;
    public C28931bI A0g;

    public static int A00(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        AnonymousClass1FL A1B;
        if (Build.VERSION.SDK_INT >= 24 && (A1B = voipCallControlBottomSheetV2.A1B()) != null && A1B.isInMultiWindowMode()) {
            return 0;
        }
        int identifier = AnonymousClass3MZ.A09(voipCallControlBottomSheetV2).getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return AnonymousClass3MZ.A09(voipCallControlBottomSheetV2).getDimensionPixelSize(identifier);
        }
        return 25;
    }

    public boolean A2H() {
        return A25() != 0 ? A25() == 2132084324 : this.A06.getBoolean("is_video_call", false);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.voipcalling.VoipCallControlBottomSheetV2, androidx.fragment.app.Fragment, com.whatsapp.voipcalling.Hilt_VoipCallControlBottomSheetV2] */
    public static VoipCallControlBottomSheetV2 A01(boolean z, boolean z2) {
        ? hilt_VoipCallControlBottomSheetV2 = new Hilt_VoipCallControlBottomSheetV2();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("is_video_call", z);
        A0D2.putBoolean("is_incoming_capi_call", z2);
        hilt_VoipCallControlBottomSheetV2.A1R(A0D2);
        return hilt_VoipCallControlBottomSheetV2;
    }

    public static void A02(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        Dialog dialog = voipCallControlBottomSheetV2.A03;
        if (dialog != null && dialog.getWindow() != null) {
            View decorView = voipCallControlBottomSheetV2.A03.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256 | 4);
        }
    }

    public static void A03(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        C1407973c r1;
        int i;
        boolean z;
        C1407973c r4 = voipCallControlBottomSheetV2.A0K;
        if (r4 != null) {
            if (r4.A07()) {
                z = false;
            } else if (r4.A0G.A0X) {
                AnonymousClass1V9 r3 = voipCallControlBottomSheetV2.A0P;
                int i2 = 31;
                if (r4.A08()) {
                    i2 = 30;
                }
                r3.A01(C17880vN.A0j(), i2, 16);
                if (voipCallControlBottomSheetV2.A0K.A08()) {
                    Dialog dialog = voipCallControlBottomSheetV2.A03;
                    if (!(dialog == null || dialog.getWindow() == null)) {
                        View decorView = voipCallControlBottomSheetV2.A03.getWindow().getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                    }
                    r4 = voipCallControlBottomSheetV2.A0K;
                    z = true;
                } else {
                    A02(voipCallControlBottomSheetV2);
                    r1 = voipCallControlBottomSheetV2.A0K;
                    if (r1.A0G.A0X) {
                        i = 5;
                        C1407973c.A01(r1, i);
                    }
                    return;
                }
            } else {
                return;
            }
            if (r4.A06 && !r4.A0A) {
                float A0R2 = ((float) r4.A0G.A0R()) * 0.07f;
                View view = r4.A0D;
                if (z) {
                    A0R2 = -A0R2;
                }
                view.setTranslationY(A0R2);
            }
            r1 = voipCallControlBottomSheetV2.A0K;
            i = 4;
            C1407973c.A01(r1, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5, float r6) {
        /*
            X.73c r1 = r5.A0K
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A06
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x0050
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0050
            if (r1 == 0) goto L_0x0054
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0M
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0054
        L_0x0027:
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r4 == 0) goto L_0x004d
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0M
            if (r0 == 0) goto L_0x0051
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x0051
            float r1 = r5.A02
        L_0x0045:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            float r1 = r1 * r6
            int r3 = java.lang.Math.round(r1)
        L_0x004d:
            r2.setAlpha(r3)
        L_0x0050:
            return
        L_0x0051:
            float r1 = r5.A01
            goto L_0x0045
        L_0x0054:
            r4 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A04(com.whatsapp.voipcalling.VoipCallControlBottomSheetV2, float):void");
    }

    public static void A05(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, float f) {
        Dialog dialog;
        Window window;
        BottomSheetViewModel bottomSheetViewModel = voipCallControlBottomSheetV2.A0M;
        if (bottomSheetViewModel != null && bottomSheetViewModel.A02 && (dialog = voipCallControlBottomSheetV2.A03) != null && (window = dialog.getWindow()) != null) {
            window.setNavigationBarColor(AnonymousClass1Z2.A06(voipCallControlBottomSheetV2.A0f, (int) (f * 255.0f)));
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.4Rb, java.lang.Object] */
    public static void A06(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, int i) {
        CallInfo A0Q2;
        NetworkInfo networkInfo;
        C131796lg r0 = voipCallControlBottomSheetV2.A0b;
        if (r0 == null || (A0Q2 = VoipActivityV2.A0Q(r0.A00)) == null || voipCallControlBottomSheetV2.A0b == null || voipCallControlBottomSheetV2.A1n() == null) {
            Log.w("voip/VoipCallControlBottomSheetV2/failed to get call info when build call action intent");
            return;
        }
        boolean A26 = VoipActivityV2.A26(voipCallControlBottomSheetV2.A0b.A00);
        Intent intent = null;
        if (i != 0) {
            if (i != 1) {
                Context A1n = voipCallControlBottomSheetV2.A1n();
                intent = C17880vN.A0A();
                String packageName = A1n.getPackageName();
                if (i != 2) {
                    intent.setClassName(packageName, "com.whatsapp.voipcalling.VoipActivityV2");
                    intent.setAction(AnonymousClass6Z8.A09);
                } else {
                    intent.setClassName(packageName, "com.whatsapp.voipcalling.VoipActivityV2");
                    intent.setAction(AnonymousClass6Z8.A04);
                    intent.putExtra("isTaskRoot", false);
                }
            } else {
                Context A1n2 = voipCallControlBottomSheetV2.A1n();
                String str = A0Q2.callId;
                intent = C17880vN.A0A();
                intent.setClassName(A1n2.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
                intent.setAction(AnonymousClass6Z8.A06);
                intent.putExtra("pendingCall", A26);
                intent.putExtra("call_id", str);
            }
            intent.setFlags(268435456);
        } else {
            ConnectivityManager A0E2 = voipCallControlBottomSheetV2.A0V.A0E();
            if (A0E2 != null) {
                networkInfo = A0E2.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (A0Q2.isCallFull()) {
                VoipErrorDialogFragment A002 = VoipErrorDialogFragment.A00(new Object(), 7);
                AnonymousClass1FL A1B = voipCallControlBottomSheetV2.A1B();
                if (A1B != null) {
                    AnonymousClass3MY.A1H(A002, A1B, (String) null);
                }
            } else if (networkInfo == null) {
                VoipErrorDialogFragment A003 = VoipErrorDialogFragment.A00(new Object(), 3);
                AnonymousClass1FL A1B2 = voipCallControlBottomSheetV2.A1B();
                if (A1B2 != null) {
                    AnonymousClass3MY.A1H(A003, A1B2, (String) null);
                }
            } else {
                int i2 = 3;
                if (A26) {
                    i2 = 10;
                }
                intent = new Object().A22(voipCallControlBottomSheetV2.A1n(), AnonymousClass6Z8.A00, A0Q2.callId, i2, true);
            }
        }
        voipCallControlBottomSheetV2.A0W.BES(A0Q2.callId);
        AnonymousClass1FL A1B3 = voipCallControlBottomSheetV2.A1B();
        if (A1B3 != null && intent != null) {
            A1B3.startActivity(intent);
        }
    }

    public void A2C(AnonymousClass1GP r4, String str) {
        C131796lg r0 = this.A0b;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            if (!(!voipActivityV2.A2K && voipActivityV2.A16 == null && voipActivityV2.A0g.A0M.A06() == null)) {
                Log.i("voip/VoipCallControlBottomSheetV2 bottom sheet action is disabled");
                return;
            }
        }
        if (this.A0e) {
            Log.i("voip/VoipCallControlBottomSheetV2 show after attached");
            C1407973c r02 = this.A0K;
            if (r02 != null && r02.A08()) {
                Dialog dialog = this.A03;
                if (!(dialog == null || dialog.getWindow() == null)) {
                    View decorView = this.A03.getWindow().getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                }
                C1407973c.A01(this.A0K, 4);
                C1407973c r1 = this.A0K;
                if (r1.A06 && !r1.A0A) {
                    r1.A0D.setTranslationY(-(((float) r1.A0G.A0R()) * 0.07f));
                    return;
                }
                return;
            }
            return;
        }
        this.A0e = true;
        Log.i("voip/VoipCallControlBottomSheetV2 attaching bottom sheet");
        Fragment A0Q2 = r4.A0Q(str);
        C34001jj r03 = new C34001jj(r4);
        if (A0Q2 != null) {
            r03.A07(A0Q2);
        }
        r03.A0B(this, str);
        r03.A04();
    }

    public void A2E(int i, float f) {
        C133046o5 r0;
        C131796lg r02 = this.A0b;
        if (r02 != null) {
            VoipActivityV2 voipActivityV2 = r02.A00;
            if (voipActivityV2.A2D) {
                AnonymousClass1G4 r3 = C108955ca.A0L(voipActivityV2).A0Q;
                float f2 = f;
                if (f > 0.0f) {
                    f2 = 0.0f;
                }
                r3.setValue(Float.valueOf(f2));
            }
            if (f <= 0.0f) {
                if (voipActivityV2.A00 == 3 && (r0 = voipActivityV2.A0f) != null) {
                    r0.A01 = f;
                    r0.A00();
                }
                View A022 = voipActivityV2.A1V.A02();
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A022);
                C17900vP.A0j("VoipCallNewParticipantBanner/moveBannerYPosition yOffset: ", AnonymousClass000.A10(), i);
                A0B2.bottomMargin -= i;
                A022.setLayoutParams(A0B2);
                if (!voipActivityV2.A2D) {
                    voipActivityV2.A1X.A02().setTranslationY(C108945cZ.A04(voipActivityV2.A1X.A02()) * f);
                }
            } else if (!voipActivityV2.A2D) {
                voipActivityV2.A1X.A02().setTranslationY(0.0f);
            }
            AnonymousClass735 r1 = voipActivityV2.A0w;
            if (r1 != null) {
                r1.A03(AnonymousClass000.A1P((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
            }
            C160958At r03 = voipActivityV2.A0n;
            if (r03 != null) {
                r03.CIy(f);
            }
        }
        A05(this, Math.min(1.0f, Math.max(0.0f, (f + 1.0f) / 0.7f)));
    }

    public /* synthetic */ void A2F(DialogInterface dialogInterface, CallInfo callInfo, boolean z) {
        C131796lg r0 = this.A0b;
        if (r0 != null) {
            VoipActivityV2.A1X(r0.A00);
        }
        View view = this.A0A;
        C17960vV.A05(view);
        view.setVisibility(0);
        Dialog dialog = (Dialog) dialogInterface;
        View A002 = C123576Uz.A00(dialog, 2131429948);
        this.A07 = A002;
        C18030ve r5 = this.A0X;
        this.A0K = new C1407973c(A002, this.A09, r5, this.A0Y, this.A0Z, this);
        Bundle bundle = this.A06;
        if (bundle != null && bundle.getBoolean("is_incoming_capi_call", false) && C40811vJ.A0Q(this.A0X)) {
            Log.i("Disable dragging for bottom sheet for incoming call");
            this.A0K.A0G.A0b(false);
        } else if (z && C40811vJ.A0Q(this.A0X)) {
            AnonymousClass7RN.A02(this.A0a, this, callInfo, 12);
        }
        this.A0O.CI9(this.A07);
        AnonymousClass7AM.A00(this, this.A0O.BO0(), 14);
        ViewTreeObserver viewTreeObserver = this.A07.getViewTreeObserver();
        C160868Ag r1 = this.A0O;
        r1.getClass();
        AnonymousClass793.A00(viewTreeObserver, r1, 28);
        AnonymousClass7AM.A00(this, this.A0Q.A02, 15);
        AnonymousClass7AM.A00(this, this.A0M.A06, 16);
        AnonymousClass7AM.A00(this, this.A0M.A0A, 17);
        AnonymousClass7AM.A00(this, this.A0M.A0B, 18);
        AnonymousClass7AM.A00(this, this.A0M.A03, 19);
        AnonymousClass7AM.A00(this, this.A0M.A09, 20);
        AnonymousClass7AM.A00(this, this.A0M.A05, 21);
        AnonymousClass1DT r3 = this.A0M.A04;
        C1407973c r2 = this.A0K;
        r2.getClass();
        r3.A0A(this, new AnonymousClass7AM(r2, 12));
        AnonymousClass7AM.A00(this, this.A0N.A01, 13);
        C123576Uz.A00(dialog, 2131436333).setOnTouchListener(new C1422178p(this));
        View view2 = this.A07;
        if (!(view2 == null || view2.getContext() == null)) {
            View view3 = this.A07;
            view3.setElevation(AnonymousClass000.A0Y(view3).getDimension(2131165605));
            this.A07.setClipToOutline(true);
            this.A07.setOutlineProvider(new C109985ek(this));
        }
        C131796lg r12 = this.A0b;
        if (r12 != null) {
            r12.A00(true);
        }
        if (callInfo != null) {
            this.A0R.A03(callInfo.callId, "voip_call_control_bottom_sheet_onshown");
        }
    }

    public boolean A2G() {
        C1407973c r0;
        if (!this.A0e || (r0 = this.A0K) == null || !r0.A07()) {
            return false;
        }
        return true;
    }

    public void A1K() {
        super.A1K();
        Log.i("voip/VoipCallControlBottomSheetV2 onDetach");
        this.A0e = false;
        if (this.A0E != null) {
            Log.i("voip/VoipCallControlBottomSheetV2 Setting adapter to null");
            this.A0E.setAdapter((C38391rD) null);
        }
        this.A0K = null;
        this.A07 = null;
        this.A0b = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CallInfo callInfo;
        int A002;
        Bundle bundle2;
        Resources.Theme theme = A26().getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(2130971759, typedValue, true);
        this.A06 = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(2130971754, typedValue2, true);
        this.A05 = typedValue2.data;
        TypedValue typedValue3 = new TypedValue();
        theme.resolveAttribute(2130971753, typedValue3, true);
        this.A02 = typedValue3.getFloat();
        TypedValue typedValue4 = new TypedValue();
        theme.resolveAttribute(2130971752, typedValue4, true);
        this.A04 = typedValue4.data;
        TypedValue typedValue5 = new TypedValue();
        theme.resolveAttribute(2130971751, typedValue5, true);
        this.A01 = typedValue5.getFloat();
        this.A0f = AnonymousClass3MZ.A02(A26().getContext(), A26().getContext(), 2130970679, 2131102070);
        View inflate = layoutInflater.inflate(2131627484, viewGroup, false);
        C17960vV.A05(inflate);
        this.A0A = inflate;
        this.A09 = AnonymousClass1HF.A06(inflate, 2131428755);
        C131796lg r0 = this.A0b;
        if (r0 != null) {
            callInfo = VoipActivityV2.A0Q(r0.A00);
            if (callInfo != null) {
                this.A0d = callInfo.callId;
            }
        } else {
            callInfo = null;
        }
        boolean A0A2 = C63982u1.A0A(this.A0U, callInfo);
        C18030ve r1 = this.A0X;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r1, 4229) && C40811vJ.A0S(this.A0X) && (((bundle2 = this.A06) != null && bundle2.getBoolean("is_incoming_capi_call", false)) || A0A2 || C18020vd.A00(r5, this.A0X, 8207) <= 0)) {
            C28931bI A0s = C72453Mb.A0s(this.A0A, 2131436939);
            this.A0Z = A0s;
            ((InCallDialPadView) A0s.A02()).setDialPadUpdateListener(new C93694jO(this));
        }
        Dialog dialog = this.A03;
        C17960vV.A07(dialog);
        dialog.setOnShowListener(new AnonymousClass75F(callInfo, this, A0A2));
        this.A03.setOnKeyListener(new AnonymousClass75B(this, 3));
        Window window = this.A03.getWindow();
        if (window != null) {
            window.addFlags(524288);
            window.setDimAmount(0.0f);
            if (C108965cb.A1X(this.A0V)) {
                window.addFlags(8);
            }
            window.setStatusBarColor(C108955ca.A01(this.A03.getContext()));
            if (callInfo == null || !callInfo.videoEnabled) {
                A002 = C19740yt.A00(this.A03.getContext(), 2131102871);
            } else {
                A002 = this.A0f;
            }
            window.setNavigationBarColor(A002);
        }
        this.A0E = C108945cZ.A0U(this.A0A, 2131433437);
        this.A0D = (NestedScrollView) AnonymousClass1HF.A06(this.A0A, 2131433439);
        this.A0E.setImportantForAccessibility(2);
        this.A0E.setLayoutManager(new LinearLayoutManager(A1n(), 1, false));
        Log.i("voip/VoipCallControlBottomSheetV2 Setting adapter");
        this.A0E.setAdapter(this.A0L);
        AnonymousClass793.A00(this.A0E.getViewTreeObserver(), this, 29);
        View.OnClickListener onClickListener = null;
        this.A0E.setItemAnimator((C37961qT) null);
        this.A0C = (Space) AnonymousClass1HF.A06(this.A0A, 2131428659);
        VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = (VoipCallControlBottomSheetDragIndicator) AnonymousClass1HF.A06(this.A0A, 2131428658);
        this.A0S = voipCallControlBottomSheetDragIndicator;
        voipCallControlBottomSheetDragIndicator.setOnClickListener(new AnonymousClass7DS(this));
        Bundle bundle3 = this.A06;
        if (bundle3 != null && bundle3.getBoolean("is_incoming_capi_call", false) && C40811vJ.A0Q(this.A0X)) {
            this.A0S.setVisibility(8);
        } else if (C63982u1.A0A(this.A0U, callInfo) && C40811vJ.A0Q(this.A0X)) {
            this.A0a.CGN(new AnonymousClass7RN(this, callInfo, 13));
        }
        View A062 = AnonymousClass1HF.A06(this.A09, 2131436563);
        C131796lg r02 = this.A0b;
        if (r02 != null) {
            onClickListener = r02.A00.A07;
        }
        A062.setOnClickListener(onClickListener);
        AnonymousClass4aR.A07(A062, A1H(2131898766), A1H(2131898181));
        this.A0B = C108945cZ.A0P(this.A0A, 2131428655);
        this.A08 = AnonymousClass1HF.A06(this.A0A, 2131428651);
        this.A0B.setFocusable(true);
        this.A0B.setTag(0);
        this.A0A.setVisibility(8);
        this.A0g = C28931bI.A00(this.A0A, 2131428669);
        return this.A0A;
    }

    public void A1x(Context context) {
        CallInfo A0Q2;
        super.A1x(context);
        Log.i("voip/VoipCallControlBottomSheetV2 onAttach");
        try {
            this.A03 = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) ((AnonymousClass867) context);
            C131796lg r0 = voipActivityV2.A1a;
            if (r0 == null) {
                r0 = new C131796lg(voipActivityV2);
                voipActivityV2.A1a = r0;
            }
            this.A0b = r0;
            AnonymousClass1FD r2 = (AnonymousClass1FD) context;
            ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) AnonymousClass3MW.A0N(r2).A00(ParticipantsListViewModel.class);
            this.A0Q = participantsListViewModel;
            participantsListViewModel.A00 = this.A0b;
            this.A0M = (BottomSheetViewModel) AnonymousClass3MW.A0N(r2).A00(BottomSheetViewModel.class);
            this.A0N = (CallControlButtonsViewModel) AnonymousClass3MW.A0N(r2).A00(CallControlButtonsViewModel.class);
            AnonymousClass3WN r1 = this.A0L;
            r1.A0B = new C126746dE(this);
            r1.A02 = this.A0Q;
            C131796lg r02 = this.A0b;
            if (r02 != null && (A0Q2 = VoipActivityV2.A0Q(r02.A00)) != null) {
                this.A0R.A03(A0Q2.callId, "voip_call_control_bottom_sheet_onattach");
            }
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0y(" must implement VoipCallControlBottomSheet$HostProvider", C17890vO.A0f(context)));
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        C17960vV.A0F(AnonymousClass000.A1W(bundle2), "Arguments must not be null");
        if (bundle2 != null) {
            int i = 2132084325;
            if (bundle2.getBoolean("is_video_call", false)) {
                i = 2132084324;
            }
            A2A(0, i);
        }
    }
}
