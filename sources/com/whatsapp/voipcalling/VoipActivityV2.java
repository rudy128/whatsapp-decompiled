package com.whatsapp.voipcalling;

import X.A1P;
import X.A4u;
import X.A69;
import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass126;
import X.AnonymousClass12E;
import X.AnonymousClass17P;
import X.AnonymousClass18K;
import X.AnonymousClass195;
import X.AnonymousClass1BI;
import X.AnonymousClass1Bd;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.AnonymousClass1HQ;
import X.AnonymousClass1HS;
import X.AnonymousClass1IV;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PM;
import X.AnonymousClass1TA;
import X.AnonymousClass1TD;
import X.AnonymousClass1V7;
import X.AnonymousClass1V9;
import X.AnonymousClass1VE;
import X.AnonymousClass1VF;
import X.AnonymousClass1VH;
import X.AnonymousClass1VP;
import X.AnonymousClass1VQ;
import X.AnonymousClass1VT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VX;
import X.AnonymousClass496;
import X.AnonymousClass4Fw;
import X.AnonymousClass4OO;
import X.AnonymousClass4OP;
import X.AnonymousClass4T4;
import X.AnonymousClass4a6;
import X.AnonymousClass4aL;
import X.AnonymousClass4aR;
import X.AnonymousClass4aX;
import X.AnonymousClass6N4;
import X.AnonymousClass6Z8;
import X.AnonymousClass72U;
import X.AnonymousClass735;
import X.AnonymousClass73H;
import X.AnonymousClass74H;
import X.AnonymousClass78L;
import X.AnonymousClass78M;
import X.AnonymousClass7A8;
import X.AnonymousClass7DL;
import X.AnonymousClass7OI;
import X.AnonymousClass7RN;
import X.AnonymousClass7RT;
import X.AnonymousClass867;
import X.AnonymousClass8B9;
import X.C010105w;
import X.C107155Yp;
import X.C107735aV;
import X.C107925aq;
import X.C108785cI;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109195cy;
import X.C115065tL;
import X.C116075wM;
import X.C116475xo;
import X.C116575y5;
import X.C122436Qg;
import X.C122576Qx;
import X.C122686Ri;
import X.C125666bS;
import X.C130566je;
import X.C131136kZ;
import X.C131796lg;
import X.C133046o5;
import X.C134216qE;
import X.C136746uK;
import X.C138266wn;
import X.C139876za;
import X.C1407973c;
import X.C1408673j;
import X.C1409273p;
import X.C1411074h;
import X.C1423479c;
import X.C142977Bn;
import X.C143867Fc;
import X.C146787Qp;
import X.C147087Rt;
import X.C1599886q;
import X.C160868Ag;
import X.C160958At;
import X.C160968Au;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C181259Pt;
import X.C18140vp;
import X.C18150vq;
import X.C18180vt;
import X.C185769d7;
import X.C192039nf;
import X.C19620yd;
import X.C19880zA;
import X.C21141AfC;
import X.C219217x;
import X.C221618v;
import X.C222219b;
import X.C22851Dl;
import X.C22971Dz;
import X.C23581Gv;
import X.C23661Hd;
import X.C24671Lf;
import X.C24901Mc;
import X.C24911Md;
import X.C24921Me;
import X.C26911Ty;
import X.C26995DOr;
import X.C27081Uq;
import X.C27301Vn;
import X.C27581Wq;
import X.C27641Ww;
import X.C28597E9o;
import X.C28671EDn;
import X.C28931bI;
import X.C29551cT;
import X.C32951i1;
import X.C34001jj;
import X.C36421nr;
import X.C36451nu;
import X.C40811vJ;
import X.C41111vp;
import X.C61342pW;
import X.C63982u1;
import X.C70313Ao;
import X.C72203La;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C89404cP;
import X.C98414r6;
import X.CIZ;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Pair;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel;
import com.whatsapp.calling.controls.view.CallControlCard;
import com.whatsapp.calling.dialogs.EndCallConfirmationDialogFragment;
import com.whatsapp.calling.dialogs.Hilt_SwitchConfirmationFragment;
import com.whatsapp.calling.dialogs.MessageDialogFragment;
import com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer;
import com.whatsapp.calling.header.CallHeaderStateHolder;
import com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.participantlist.view.ParticipantListBottomSheetDialog;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.calling.views.AppSettingsWarningDialogFragment;
import com.whatsapp.calling.views.PermissionDialogFragment;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VoipActivityV2 extends AnonymousClass6N4 implements C72203La, C107925aq, ViewTreeObserver.OnGlobalLayoutListener, C108785cI, C1599886q, AnonymousClass8B9, C107735aV, AnonymousClass867 {
    public int A00 = 3;
    public long A01;
    public PictureInPictureParams.Builder A02;
    public Intent A03;
    public Drawable A04;
    public Handler A05;
    public MotionEvent A06 = null;
    public View.OnClickListener A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public ViewGroup A0F;
    public ViewGroup A0G;
    public ImageButton A0H;
    public ImageView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public CIZ A0M;
    public DialogFragment A0N;
    public DialogFragment A0O;
    public DialogFragment A0P;
    public DialogFragment A0Q;
    public C19880zA A0R;
    public AnonymousClass195 A0S;
    public WaImageView A0T;
    public WaTextView A0U;
    public C26911Ty A0V;
    public CallDetailsLayout A0W;
    public C125666bS A0X;
    public AnonymousClass1HQ A0Y;
    public AnonymousClass1VE A0Z;
    public C116075wM A0a;
    public CallArEffectsViewModel A0b = null;
    public AnonymousClass1VF A0c;
    public C143867Fc A0d;
    public CallGrid A0e;
    public C133046o5 A0f;
    public CallGridViewModel A0g;
    public MenuBottomSheetViewModel A0h;
    public OrientationViewModel A0i;
    public AnonymousClass496 A0j;
    public C1409273p A0k;
    public AnonymousClass1VP A0l;
    public C160868Ag A0m;
    public C160958At A0n;
    public C115065tL A0o;
    public C160968Au A0p;
    public AnonymousClass1V9 A0q;
    public ParticipantsListViewModel A0r;
    public C24911Md A0s;
    public ScreenShareViewModel A0t;
    public A99 A0u;
    public AnonymousClass1V7 A0v;
    public AnonymousClass735 A0w;
    public A4u A0x;
    public C185769d7 A0y;
    public C21141AfC A0z;
    public C28671EDn A10;
    public AnonymousClass1HS A11;
    public AnonymousClass1M9 A12;
    public C24671Lf A13;
    public AnonymousClass1PM A14;
    public C24921Me A15;
    public ContactPickerFragment A16;
    public C1408673j A17;
    public AnonymousClass12E A18;
    public C32951i1 A19;
    public AnonymousClass118 A1A;
    public C27301Vn A1B;
    public C219217x A1C;
    public AnonymousClass1TD A1D;
    public AnonymousClass1MZ A1E;
    public AnonymousClass1TA A1F;
    public C27081Uq A1G;
    public C23661Hd A1H;
    public AnonymousClass18K A1I;
    public AnonymousClass126 A1J;
    public UserJid A1K = null;
    public C70313Ao A1L;
    public C24901Mc A1M;
    public C36451nu A1N;
    public AnonymousClass1DC A1O;
    public C28931bI A1P;
    public C28931bI A1Q;
    public C28931bI A1R;
    public C28931bI A1S;
    public C28931bI A1T;
    public C28931bI A1U;
    public C28931bI A1V;
    public C28931bI A1W;
    public C28931bI A1X;
    public CallInfo A1Y;
    public AnonymousClass1VT A1Z;
    public C131796lg A1a;
    public VoipCallControlBottomSheetV2 A1b;
    public VoipCameraManager A1c;
    public AnonymousClass00H A1d;
    public AnonymousClass00H A1e;
    public AnonymousClass00H A1f;
    public AnonymousClass00H A1g;
    public AnonymousClass00H A1h;
    public AnonymousClass00H A1i;
    public AnonymousClass00H A1j;
    public AnonymousClass00H A1k = C221618v.A00(AnonymousClass17P.class);
    public AnonymousClass00H A1l;
    public AnonymousClass00H A1m;
    public AnonymousClass00H A1n;
    public AnonymousClass00H A1o;
    public AnonymousClass00H A1p;
    public AnonymousClass00H A1q;
    public AnonymousClass00H A1r;
    public AnonymousClass00H A1s;
    public AnonymousClass00H A1t;
    public AnonymousClass00H A1u;
    public AnonymousClass00H A1v;
    public AnonymousClass00H A1w;
    public AnonymousClass00H A1x;
    public AnonymousClass00H A1y;
    public AnonymousClass00H A1z;
    public String A20;
    public String A21;
    public String A22;
    public C18140vp A23;
    public C18140vp A24;
    public C18140vp A25;
    public C18140vp A26;
    public C18140vp A27;
    public boolean A28;
    public boolean A29;
    public boolean A2A = false;
    public boolean A2B;
    public boolean A2C;
    public boolean A2D;
    public boolean A2E;
    public boolean A2F;
    public boolean A2G = false;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L = true;
    public boolean A2M = false;
    public int A2N;
    public int A2O;
    public int A2P;
    public int A2Q;
    public int A2R;
    public int A2S;
    public View.OnClickListener A2T;
    public View.OnClickListener A2U;
    public View.OnClickListener A2V;
    public ImageView A2W;
    public ImageView A2X;
    public CallHeaderViewModel A2Y;
    public AppSettingsWarningDialogFragment A2Z;
    public C23581Gv A2a = null;
    public C142977Bn A2b;
    public CallSuggestionsViewModel A2c;
    public C28931bI A2d;
    @Deprecated
    public C28931bI A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h = false;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public final View.OnClickListener A2o = new AnonymousClass78L(this, 39);
    public final AnonymousClass02n A2p = CDw(new C1423479c(this, 12), new Object());
    public final C107155Yp A2q = new AnonymousClass7DL(this);
    public final AnonymousClass1IV A2r = new AnonymousClass7OI(this, 5);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r6 != 10) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r0.A43 == 7) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A0d(X.AnonymousClass1BI r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            r1 = 2131898126(0x7f122f0e, float:1.943116E38)
            if (r6 == r0) goto L_0x004f
            r0 = 17
            if (r6 == r0) goto L_0x004c
            r0 = 25
            if (r6 == r0) goto L_0x003f
            r0 = 27
            if (r6 == r0) goto L_0x003f
            r0 = 4
            r1 = 2131898148(0x7f122f24, float:1.9431206E38)
            if (r6 == r0) goto L_0x004f
            r0 = 5
            r2 = 0
            if (r6 == r0) goto L_0x0025
            r0 = 9
            if (r6 == r0) goto L_0x0043
            r0 = 10
            if (r6 == r0) goto L_0x003f
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = X.C22971Dz.A0d(r5)
            if (r0 == 0) goto L_0x0024
            r3 = 2131894259(0x7f121ff3, float:1.9423318E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.1Me r1 = r4.A15
            X.1M9 r0 = r4.A12
            java.lang.String r0 = X.AnonymousClass3MY.A0p(r0, r1, r5)
            java.lang.String r0 = X.C108975cc.A0b(r4, r0, r2, r3)
            return r0
        L_0x003f:
            r1 = 2131898113(0x7f122f01, float:1.9431135E38)
            goto L_0x004f
        L_0x0043:
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x0024
            int r1 = r0.A43
            r0 = 7
            if (r1 != r0) goto L_0x0024
        L_0x004c:
            r1 = 2131898290(0x7f122fb2, float:1.9431494E38)
        L_0x004f:
            java.lang.String r0 = r4.getString(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0d(X.1BI, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1N(com.whatsapp.voipcalling.CallInfo r14, com.whatsapp.voipcalling.VoipActivityV2 r15, int r16) {
        /*
            r8 = r15
            boolean r0 = r15.isFinishing()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState finishing do not update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000c:
            return
        L_0x000d:
            if (r14 == 0) goto L_0x000c
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x000c
            boolean r0 = r15.A2E
            r2 = 1
            if (r0 == 0) goto L_0x0035
            boolean r0 = A26(r15)
            if (r0 != 0) goto L_0x0035
            boolean r0 = r14.videoEnabled
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState leave PIP mode due to voice call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r1 = r15.A05
            r0 = 2131898099(0x7f122ef3, float:1.9431106E38)
            r1.A08(r0, r2)
            r15.finish()
            return
        L_0x0035:
            boolean r0 = r14.hasOutgoingParticipantInActiveOneToOneCall()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r14.isInLonelyState()
            if (r0 == 0) goto L_0x0051
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0051
            if (r0 == r2) goto L_0x0051
        L_0x0047:
            boolean r0 = r15.A2L
            if (r0 != 0) goto L_0x0051
            boolean r0 = r14.videoEnabled
            if (r0 == 0) goto L_0x0051
            r15.A2L = r2
        L_0x0051:
            r15.A0z()
            A1J(r14, r15)
            A1K(r14, r15)
            boolean r4 = r14.isGroupCall
            com.whatsapp.voipcalling.CallState r3 = r14.callState
            X.1bI r1 = r15.A1S
            if (r1 == 0) goto L_0x007d
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x007d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 == r0) goto L_0x0074
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 == r0) goto L_0x0074
            if (r4 != 0) goto L_0x007d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r3 != r0) goto L_0x007d
        L_0x0074:
            boolean r0 = r15.A2D
            if (r0 == 0) goto L_0x007d
            r0 = 8
            r1.A04(r0)
        L_0x007d:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r15.A1b
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.A1b()
            if (r0 != 0) goto L_0x008d
        L_0x0087:
            X.1bI r0 = r15.A1R
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x00d0
        L_0x008d:
            boolean r0 = X.C108995ce.A1a(r15)
            if (r0 == 0) goto L_0x03a9
            boolean r0 = r14.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x00a2
            X.6qE r0 = r14.self
            if (r0 == 0) goto L_0x00d0
            int r1 = r0.A08
            r0 = 3
            if (r1 != r0) goto L_0x00d0
        L_0x00a2:
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r15.A16
            if (r0 == 0) goto L_0x00a9
            A1S(r15)
        L_0x00a9:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r15.A1b
            if (r0 == 0) goto L_0x00b0
            r15.A0t()
        L_0x00b0:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r15.A4i(r0)
            boolean r0 = r15.A2D
            if (r0 != 0) goto L_0x00c3
            X.1bI r0 = r15.A1X
            android.view.View r1 = r0.A02()
            r0 = 0
            r1.setTranslationY(r0)
        L_0x00c3:
            boolean r0 = X.C108995ce.A1a(r15)
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r15.A2E
            if (r0 != 0) goto L_0x00d0
        L_0x00cd:
            r15.A0v()
        L_0x00d0:
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            android.view.ViewGroup r0 = r15.A0F
            X.C72453Mb.A1B(r0)
            boolean r0 = r15.A2L
            r5 = 0
            if (r0 != 0) goto L_0x02fa
            X.5wM r0 = r15.A0a
            if (r0 == 0) goto L_0x00e3
            r0.A05(r5)
        L_0x00e3:
            boolean r0 = r15.A2D
            if (r0 == 0) goto L_0x01d6
            boolean r0 = A24(r15)
            if (r0 == 0) goto L_0x01be
            X.0ve r0 = r15.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x01be
            com.whatsapp.calling.header.CallHeaderStateHolder r0 = X.C108955ca.A0L(r15)
            r0.A01(r2)
        L_0x00fc:
            X.8At r0 = r15.A0n
            if (r0 == 0) goto L_0x0103
            r0.C9P(r14)
        L_0x0103:
            r15.CQl(r14)
            boolean r0 = r14.isStartedFromCallLink()
            if (r0 == 0) goto L_0x01b8
            boolean r0 = r14.isInLonelyState()
            if (r0 == 0) goto L_0x01b8
            boolean r0 = r15.A2E
            if (r0 != 0) goto L_0x01b8
            X.0ve r2 = r15.A0E
            r1 = 10631(0x2987, float:1.4897E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01b8
            X.1bI r1 = r15.A1W
            r0 = 0
        L_0x0125:
            r1.A04(r0)
            boolean r0 = r14.videoEnabled
            if (r0 == 0) goto L_0x0164
            boolean r0 = X.C108995ce.A1a(r15)
            if (r0 != 0) goto L_0x0164
        L_0x0132:
            X.8Ag r0 = r15.A0m
            X.1DS r0 = r0.BO1()
            java.lang.Object r0 = r0.A06()
            X.6zf r0 = (X.C139926zf) r0
            A19(r0, r15)
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            boolean r0 = r14.isGroupCall
            boolean r0 = A22(r1, r15, r0)
            if (r0 == 0) goto L_0x0150
            com.whatsapp.calling.CallDetailsLayout r0 = r15.A0W
            r0.A03(r14)
        L_0x0150:
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x015a
            android.view.View$OnClickListener r0 = r15.A2T
            if (r0 != 0) goto L_0x000c
        L_0x015a:
            r1 = 20
            X.78M r0 = new X.78M
            r0.<init>(r15, r14, r1)
            r15.A2T = r0
            return
        L_0x0164:
            com.whatsapp.WaImageView r0 = r15.A0T
            if (r0 == 0) goto L_0x0132
            r3 = 2131233686(0x7f080b96, float:1.8083517E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0132
            X.0ve r2 = r15.A0E
            r1 = 11860(0x2e54, float:1.662E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x019a
            X.10I r2 = r15.A05
            X.6dD r1 = new X.6dD
            r1.<init>(r15)
            X.6Li r0 = new X.6Li
            r0.<init>(r15, r1)
            X.C17890vO.A0u(r0, r2)
        L_0x0194:
            com.whatsapp.WaImageView r0 = r15.A0T
            r0.setTag(r4)
            goto L_0x0132
        L_0x019a:
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3MX.A06(r15, r3)
            android.content.res.Resources r2 = r15.getResources()
            r1 = 2130971740(0x7f040c5c, float:1.7552227E38)
            r0 = 2131102873(0x7f060c99, float:1.7818196E38)
            int r0 = X.AnonymousClass3Ma.A01(r15, r2, r1, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A08(r3, r0)
            com.whatsapp.WaImageView r0 = r15.A0T
            if (r0 == 0) goto L_0x0194
            r0.setImageDrawable(r1)
            goto L_0x0194
        L_0x01b8:
            X.1bI r1 = r15.A1W
            r0 = 8
            goto L_0x0125
        L_0x01be:
            X.1PM r0 = r15.A14
            boolean r0 = X.C63982u1.A0A(r0, r14)
            if (r0 == 0) goto L_0x00fc
            X.0ve r0 = r15.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x00fc
            X.10I r1 = r15.A05
            r0 = 3
            X.AnonymousClass7RN.A02(r1, r15, r14, r0)
            goto L_0x00fc
        L_0x01d6:
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Map r0 = r14.participants
            java.util.Iterator r3 = X.C17890vO.A0l(r0)
        L_0x01e0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01f6
            java.lang.Object r1 = r3.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x01e0
            com.whatsapp.jid.UserJid r0 = r1.A0A
            r11.add(r0)
            goto L_0x01e0
        L_0x01f6:
            android.view.View r3 = r15.A0C
            if (r3 == 0) goto L_0x02f1
            com.whatsapp.calling.CallDetailsLayout r0 = r15.A0W
            if (r0 == 0) goto L_0x02f1
            boolean r1 = A21(r14, r15)
            r13 = 0
            int r0 = X.C72453Mb.A07(r1)
            r3.setVisibility(r0)
            if (r1 == 0) goto L_0x0236
            boolean r0 = r14.isGroupCall
            r1 = 0
            if (r0 == 0) goto L_0x028c
            boolean r0 = r14.isInLonelyState()
            if (r0 == 0) goto L_0x028c
            boolean r0 = r14.videoEnabled
            if (r0 != 0) goto L_0x028c
            android.view.View r3 = r15.A0C
            com.whatsapp.calling.CallDetailsLayout r0 = r15.A0W
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0284
            com.whatsapp.calling.CallDetailsLayout r0 = r15.A0W
            java.lang.String r0 = r0.getNameViewContentDescription()
            if (r0 == 0) goto L_0x0284
            com.whatsapp.calling.CallDetailsLayout r0 = r15.A0W
            java.lang.String r0 = r0.getNameViewContentDescription()
        L_0x0233:
            X.AnonymousClass4aR.A08(r3, r0, r1, r2)
        L_0x0236:
            com.whatsapp.voipcalling.CallState r0 = r14.callState
            boolean r0 = X.C40811vJ.A0f(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0243
            boolean r0 = r15.A28
            if (r0 == 0) goto L_0x0247
        L_0x0243:
            boolean r0 = r14.isGroupCallEnabled
            if (r0 != 0) goto L_0x0248
        L_0x0247:
            r2 = 0
        L_0x0248:
            boolean r0 = A24(r15)
            if (r0 == 0) goto L_0x0268
            X.0ve r0 = r15.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x0268
            r2 = 0
        L_0x0257:
            boolean r0 = r15.A2D
            if (r0 != 0) goto L_0x00fc
            android.view.ViewGroup r0 = r15.A0G
            X.C17960vV.A05(r0)
            if (r2 != 0) goto L_0x0263
            r3 = 4
        L_0x0263:
            r0.setVisibility(r3)
            goto L_0x00fc
        L_0x0268:
            X.1PM r0 = r15.A14
            boolean r0 = X.C63982u1.A0A(r0, r14)
            if (r0 == 0) goto L_0x0257
            X.0ve r0 = r15.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x0257
            boolean r0 = r15.A2D
            if (r0 != 0) goto L_0x0257
            X.10I r1 = r15.A05
            r0 = 8
            X.AnonymousClass7RN.A02(r1, r15, r14, r0)
            goto L_0x0257
        L_0x0284:
            r0 = 2131899580(0x7f1234bc, float:1.943411E38)
            java.lang.String r0 = r15.getString(r0)
            goto L_0x0233
        L_0x028c:
            boolean r7 = r14.isAudioChat()
            com.whatsapp.jid.GroupJid r6 = r14.groupJid
            X.1M9 r5 = r15.A12
            X.1Me r4 = r15.A15
            X.1Mc r3 = r15.A1M
            X.126 r0 = r15.A1J
            X.1E7 r0 = X.C63982u1.A01(r5, r0, r6, r3, r7)
            if (r0 == 0) goto L_0x02e7
            java.lang.String r4 = X.AnonymousClass3MY.A0q(r4, r0)
            if (r4 == 0) goto L_0x02e7
        L_0x02a6:
            android.view.View r6 = r15.A0C
            com.whatsapp.calling.CallDetailsLayout r0 = r15.A0W
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x02d8
            if (r4 == 0) goto L_0x02d8
            boolean r3 = r14.videoEnabled
            r0 = 2131898153(0x7f122f29, float:1.9431216E38)
            if (r3 == 0) goto L_0x02bc
            r0 = 2131898151(0x7f122f27, float:1.9431212E38)
        L_0x02bc:
            java.lang.String r5 = X.C17890vO.A0R(r15, r4, r2, r13, r0)
        L_0x02c0:
            X.0ve r4 = r15.A0E
            r3 = 2541(0x9ed, float:3.56E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x02d3
            r0 = 2131898149(0x7f122f25, float:1.9431208E38)
            java.lang.String r1 = r15.getString(r0)
        L_0x02d3:
            X.AnonymousClass4aR.A08(r6, r5, r1, r2)
            goto L_0x0236
        L_0x02d8:
            boolean r3 = r14.videoEnabled
            r0 = 2131898152(0x7f122f28, float:1.9431214E38)
            if (r3 == 0) goto L_0x02e2
            r0 = 2131898150(0x7f122f26, float:1.943121E38)
        L_0x02e2:
            java.lang.String r5 = r15.getString(r0)
            goto L_0x02c0
        L_0x02e7:
            X.1M9 r9 = r15.A12
            X.1Me r10 = r15.A15
            r12 = 3
            java.lang.String r4 = X.AnonymousClass74H.A06(r8, r9, r10, r11, r12, r13)
            goto L_0x02a6
        L_0x02f1:
            boolean r1 = r15.A2D
            java.lang.String r0 = "E2ee container or call details cannot be null when call controls m1 is disabled"
            X.C17960vV.A0F(r1, r0)
            goto L_0x0236
        L_0x02fa:
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r1)
            if (r0 == 0) goto L_0x0332
            boolean r0 = r15.A28
            if (r0 != 0) goto L_0x0332
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible RECEIVED_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r14.isGroupCall
            if (r0 == 0) goto L_0x032e
            A28(r15)
            X.5wM r0 = r15.A0a
            if (r0 == 0) goto L_0x0317
            r0.A05(r2)
        L_0x0317:
            boolean r0 = A26(r15)
            if (r0 == 0) goto L_0x00e3
            X.1HQ r0 = r15.A0Y
            com.whatsapp.voipcalling.CallInfo r1 = r0.BO3()
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x00e3
            A1M(r1, r15)
            goto L_0x00e3
        L_0x032e:
            r15.A1H(r14)
            goto L_0x0317
        L_0x0332:
            boolean r0 = r14.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0390
            X.6qE r0 = r14.self
            int r1 = r0.A08
            r0 = 3
            if (r1 == r0) goto L_0x0390
            boolean r0 = r15.A28
            if (r0 != 0) goto L_0x0390
            boolean r0 = X.C108995ce.A1a(r15)
            if (r0 != 0) goto L_0x0390
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible kVideoStateUpgradeRequest"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DC r0 = r15.A1O
            boolean r0 = r0.BcY()
            if (r0 != 0) goto L_0x038b
            boolean r0 = r15.A28
            if (r0 != 0) goto L_0x038b
            X.6qE r0 = r14.getDefaultPeerInfo()
            java.lang.String r4 = r15.A0c(r0, r14)
            android.view.View r0 = r15.A0B
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r0 = 13
            r3.removeRule(r0)
            r1 = 14
            r0 = -1
            r3.addRule(r1, r0)
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131169268(0x7f070ff4, float:1.7952861E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setMargins(r5, r0, r5, r5)
            android.view.View r0 = r15.A0B
            r0.setLayoutParams(r3)
            r15.A4o(r4)
        L_0x038b:
            r15.A1H(r14)
            goto L_0x00e3
        L_0x0390:
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5wM r0 = r15.A0a
            if (r0 == 0) goto L_0x039c
            r0.A05(r5)
        L_0x039c:
            if (r16 == 0) goto L_0x03a4
            boolean r0 = X.C108995ce.A1a(r15)
            if (r0 != 0) goto L_0x00e3
        L_0x03a4:
            A28(r15)
            goto L_0x00e3
        L_0x03a9:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r15.A1b
            if (r0 == 0) goto L_0x00d0
            boolean r1 = r14.videoEnabled
            boolean r0 = r0.A2H()
            if (r1 == r0) goto L_0x00d0
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1N(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.whatsapp.calling.views.Hilt_AppSettingsWarningDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.calling.views.AppSettingsWarningDialogFragment] */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1g(com.whatsapp.voipcalling.VoipActivityV2 r5, int r6) {
        /*
            r4 = 1
            r5.A2n = r4
            com.whatsapp.calling.views.AppSettingsWarningDialogFragment r3 = r5.A2Z
            java.lang.String r2 = "AppSettingsWarningDialogFragment"
            if (r3 == 0) goto L_0x0013
            int r0 = r3.A00
            if (r6 == r0) goto L_0x0026
            r5.A4j(r2)
            r0 = 0
            r5.A2Z = r0
        L_0x0013:
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "reason"
            r1.putInt(r0, r6)
            com.whatsapp.calling.views.AppSettingsWarningDialogFragment r3 = new com.whatsapp.calling.views.AppSettingsWarningDialogFragment
            r3.<init>()
            r3.A1R(r1)
            r5.A2Z = r3
        L_0x0026:
            boolean r0 = r5.A2E
            if (r0 != 0) goto L_0x0037
            X.6dF r0 = new X.6dF
            r0.<init>()
            X.6za r0 = new X.6za
            r0.<init>(r4, r4)
            r5.A4g(r3, r0, r2)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1g(com.whatsapp.voipcalling.VoipActivityV2, int):void");
    }

    public static void A1k(VoipActivityV2 voipActivityV2, List list) {
        CallInfo A0Q2;
        List list2 = list;
        if (!list.isEmpty() && voipActivityV2.A0u != null && (A0Q2 = A0Q(voipActivityV2)) != null && A0Q2.callState != CallState.NONE) {
            A99 a99 = voipActivityV2.A0u;
            C17960vV.A0F(AnonymousClass000.A1a(list2), "voip/invite: Empty list of peers to invite");
            a99.A1E.execute(new AnonymousClass7RT(a99, list2, A0Q2, 10, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r4.A28 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A21(com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            r2 = 0
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x0020
            boolean r0 = r4.A28
            r1 = 0
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            boolean r0 = r4.A2D
            if (r0 != 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A21(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):boolean");
    }

    public int A31() {
        return 78318969;
    }

    public boolean A4W() {
        return false;
    }

    public void A4o(CharSequence charSequence) {
        this.A0J.setText(charSequence);
        this.A0B.setVisibility(0);
        this.A0B.setBackground((Drawable) null);
        this.A0A.setVisibility(8);
        this.A0U.setVisibility(8);
    }

    public void C5G() {
        this.A0u = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r1.A0F(r0) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (X.C72463Mc.A1O(r0.A0A) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0.Be0() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r0 != null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQl(com.whatsapp.voipcalling.CallInfo r12) {
        /*
            r11 = this;
            r5 = r12
            com.whatsapp.voipcalling.CallState r1 = r11.A0V(r12)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x009b
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r1)
            if (r0 != 0) goto L_0x009b
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r11.A1b
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00a3
            com.whatsapp.calling.views.VoipCallFooter r4 = r0.A0T
            if (r4 == 0) goto L_0x00a3
            X.A99 r0 = r11.A0u
            if (r0 == 0) goto L_0x00a0
            java.lang.String r6 = r0.A1B
            X.Adx r1 = r0.A0R
            X.C17960vV.A07(r1)
            int r7 = r1.A00
            java.lang.String r0 = r12.callId
            X.C17960vV.A07(r1)
            boolean r0 = r1.A0F(r0)
            r8 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r8 = 0
        L_0x0033:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r11.A0t
            if (r0 == 0) goto L_0x0040
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            X.8At r0 = r11.A0n
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.Be0()
            r10 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r4.A05(r5, r6, r7, r8, r9, r10)
            X.735 r0 = r11.A0w
            if (r0 == 0) goto L_0x0057
        L_0x0054:
            r0.A02(r12)
        L_0x0057:
            boolean r0 = r11.A2D
            if (r0 != 0) goto L_0x009b
            android.view.ViewGroup r1 = r11.A0G
            X.C17960vV.A05(r1)
            android.widget.ImageButton r0 = r11.A0H
            X.C17960vV.A05(r0)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0082
            android.view.ViewGroup r1 = r11.A0G
            com.whatsapp.jid.GroupJid r0 = r12.groupJid
            if (r0 != 0) goto L_0x007f
            com.whatsapp.voipcalling.CallState r0 = r12.callState
            boolean r0 = X.C40811vJ.A0f(r0)
            if (r0 == 0) goto L_0x009e
            boolean r0 = r12.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x009e
        L_0x007f:
            X.AnonymousClass4aR.A09(r1, r3)
        L_0x0082:
            android.widget.ImageButton r3 = r11.A0H
            com.whatsapp.voipcalling.CallState r1 = r12.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0092
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0092
            boolean r0 = r11.A28
            if (r0 == 0) goto L_0x009c
        L_0x0092:
            boolean r0 = r12.enableAudioVideoSwitch()
            if (r0 == 0) goto L_0x009c
        L_0x0098:
            r3.setVisibility(r2)
        L_0x009b:
            return
        L_0x009c:
            r2 = 4
            goto L_0x0098
        L_0x009e:
            r3 = 0
            goto L_0x007f
        L_0x00a0:
            r6 = 0
            r7 = 0
            goto L_0x0032
        L_0x00a3:
            X.735 r0 = r11.A0w
            if (r0 == 0) goto L_0x0057
            boolean r0 = X.C108995ce.A1a(r11)
            if (r0 == 0) goto L_0x0057
            X.0ve r1 = r11.A0E
            r0 = 9220(0x2404, float:1.292E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x00cd
            X.0ve r1 = r11.A0E
            r0 = 10274(0x2822, float:1.4397E-41)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x00cd
            X.0ve r1 = r11.A0E
            r0 = 10275(0x2823, float:1.4398E-41)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x0057
        L_0x00cd:
            X.735 r0 = r11.A0w
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.CQl(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void onResume() {
        CallHeaderStateHolder callHeaderStateHolder;
        A99 a99;
        C18030ve r1 = this.A0E;
        C18040vf r5 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r5, r1, 1807);
        if (A052) {
            try {
                this.A02.A09("VoipActivityV2_onResume");
            } catch (Throwable th) {
                if (A052) {
                    this.A02.A08("VoipActivityV2_onResume");
                }
                throw th;
            }
        }
        super.onResume();
        this.A2H = false;
        if (this.A0D != null) {
            this.A2F = true;
            this.A2I = true;
            CallInfo A0Q2 = A0Q(this);
            if (!(A0Q2 == null || A0Q2.callState == CallState.NONE)) {
                if (C18020vd.A05(r5, this.A0E, 11196)) {
                    A1Q(A0Q2.callState);
                }
                A1V(this);
                this.A05.sendEmptyMessageDelayed(1, 500);
                C160968Au r4 = this.A0p;
                if (r4 != null) {
                    r4.C6T(C27581Wq.ON_RESUME);
                }
                if (A0Q2.videoEnabled) {
                    if (!AnonymousClass000.A1T(A0Q2.self.A08, 6)) {
                        UserJid peerJid = A0Q2.getPeerJid();
                        if (!A0Q2.isCallLinkLobbyOrJoiningState()) {
                            C17960vV.A07(peerJid);
                            C134216qE infoByJid = A0Q2.getInfoByJid(peerJid);
                            if (infoByJid != null && infoByJid.A0R) {
                                videoRenderStarted(peerJid);
                            }
                        }
                        A1N(A0Q2, this, 0);
                    } else if (this.A2M && (a99 = this.A0u) != null) {
                        a99.A0g();
                    }
                }
                CallGrid callGrid = this.A0e;
                CallGridViewModel callGridViewModel = this.A0g;
                MenuBottomSheetViewModel menuBottomSheetViewModel = this.A0h;
                ScreenShareViewModel screenShareViewModel = this.A0t;
                if (C108995ce.A1a(this)) {
                    callHeaderStateHolder = C108955ca.A0L(this);
                } else {
                    callHeaderStateHolder = null;
                }
                callGrid.A0H(this, callGridViewModel, menuBottomSheetViewModel, callHeaderStateHolder, (VoiceChatBottomSheetViewModel) null, screenShareViewModel);
                if (this.A2M) {
                    this.A2M = false;
                }
                if (A23(this) && isInPictureInPictureMode()) {
                    onPictureInPictureModeChanged(true, C108965cb.A03(this));
                } else if (A23(this) && this.A02 == null) {
                    this.A02 = new PictureInPictureParams.Builder();
                    Rational rational = (Rational) this.A0g.A0S.A06();
                    if (rational != null) {
                        A15(rational, this);
                    }
                }
                if (this.A00 == 2) {
                    A11(3);
                    if (!A26(this)) {
                        A0w();
                    }
                }
                Iterator A152 = AnonymousClass000.A15(AnonymousClass1D7.A0F(this.A00));
                while (A152.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A152);
                    String A0x2 = C17880vN.A0x(A162);
                    AnonymousClass1D6 r0 = (AnonymousClass1D6) A162.getValue();
                    DialogFragment dialogFragment = (DialogFragment) r0.first;
                    if (((C139876za) r0.second).A01) {
                        CMm(dialogFragment, A0x2);
                    }
                }
                if (this.A2n && !C40811vJ.A0M(this.A08)) {
                    this.A2n = false;
                    if (this.A1O.Bfb()) {
                        this.A0v.A00(new A69("refresh_app_background_restrictions"));
                    }
                }
            }
        }
        if (A052) {
            this.A02.A08("VoipActivityV2_onResume");
        }
    }

    public void onUserInteraction() {
        this.A2I = true;
    }

    private int A03() {
        if (this.A0i != null) {
            if ((C18020vd.A00(C18040vf.A02, this.A0E, 11857) & 2) != 0) {
                return this.A0i.A02.get();
            }
        }
        return ((DisplayManager) getSystemService("display")).getDisplay(0).getRotation();
    }

    public static CallInfo A0Q(VoipActivityV2 voipActivityV2) {
        return C181259Pt.A00(voipActivityV2.A0Y, voipActivityV2.A21);
    }

    private CallState A0V(CallInfo callInfo) {
        CallState callState = callInfo.callState;
        if (Voip.A0A(callState) && this.A28) {
            return CallState.ACCEPT_SENT;
        }
        if (!callInfo.hasOutgoingParticipantInActiveOneToOneCall()) {
            return callState;
        }
        C134216qE defaultPeerInfo = callInfo.getDefaultPeerInfo();
        C17960vV.A07(defaultPeerInfo);
        if (defaultPeerInfo.A04 == 2) {
            return CallState.CALLING;
        }
        if (callInfo.getDefaultPeerInfo().A04 == 3) {
            return CallState.PRE_ACCEPT_RECEIVED;
        }
        return callState;
    }

    private void A0q() {
        Log.i("voip/VoipCallControlBottomSheetV2 detaching bottom sheet");
        if (this.A1b != null) {
            A41("CallControlSheet");
            return;
        }
        A4j("ParticipantListBottomSheetDialog");
        A2A(this, false, true);
    }

    private void A0s() {
        Log.i("voip/VoipActivityV2/hideInCallControls");
        this.A2L = false;
        if (!this.A2D) {
            this.A1X.A04(8);
            this.A1X.A02().setTranslationY(0.0f);
        }
        this.A0B.setVisibility(8);
        A0q();
        A2A(this, true, false);
    }

    private void A0t() {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1b;
        if (voipCallControlBottomSheetV2 != null && voipCallControlBottomSheetV2.A1b()) {
            voipCallControlBottomSheetV2.A29();
        }
        this.A1b = null;
        AnonymousClass735 r0 = this.A0w;
        if (r0 != null) {
            r0.A00 = null;
        }
        A2A(this, true, false);
        this.A2h = false;
    }

    private void A0w() {
        Log.i("voip/VoipActivityV2/showAllInCallControls");
        this.A2L = true;
        if (this.A1b != null) {
            A28(this);
            C133046o5 r0 = this.A0f;
            if (r0 != null) {
                r0.A00();
            }
            VoipInCallNotifBanner voipInCallNotifBanner = (VoipInCallNotifBanner) this.A1V.A02();
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(voipInCallNotifBanner);
            Log.i("VoipCallNewParticipantBanner/resetBannerYPosition");
            A0B2.bottomMargin = voipInCallNotifBanner.A0F;
            voipInCallNotifBanner.setLayoutParams(A0B2);
        } else {
            A28(this);
        }
        if (!this.A2D) {
            this.A1X.A04(0);
            this.A1X.A02().setTranslationY(0.0f);
        }
        if (this.A0J.length() > 0) {
            this.A0B.setVisibility(0);
        }
    }

    private void A0x() {
        this.A1r.get();
        A4h(new ParticipantListBottomSheetDialog(), "ParticipantListBottomSheetDialog");
        getSupportFragmentManager().A0t(new AnonymousClass7A8(this, 3), this, "participant_list_request");
    }

    private void A0y() {
        Log.i("VoipActivityV2 vm unbindService");
        try {
            this.A0v.A02(this);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
        }
        A99 a99 = this.A0u;
        if (a99 != null) {
            C17900vP.A0Y(a99, "voip/service/resetVoipUiIfEquals ", AnonymousClass000.A10());
            if (a99.A0f == this) {
                a99.A0f = null;
            }
            this.A0u = null;
        }
        C160968Au r0 = this.A0p;
        if (r0 != null) {
            r0.CLR((A99) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A11(int r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == r8) goto L_0x00e4
            r7.A00 = r8
            X.8Ag r0 = r7.A0m
            r0.C0Y()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r7.A0g
            r6 = 0
            r5 = 1
            boolean r0 = X.AnonymousClass000.A1T(r8, r5)
            r4.A0D = r0
            X.1DT r3 = r4.A0U
            java.lang.Object r2 = r3.A06()
            X.C17960vV.A07(r2)
            X.6k0 r2 = (X.C130786k0) r2
            r2.A01 = r8
            boolean r1 = r4.A0D
            r0 = 1046898278(0x3e666666, float:0.225)
            if (r1 == 0) goto L_0x002c
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
        L_0x002c:
            r2.A00 = r0
            r3.A0F(r2)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0E(r4)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0G(r4)
            if (r8 != 0) goto L_0x00f8
            X.1vp r1 = r4.A0p
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
        L_0x003f:
            r1.A0F(r0)
        L_0x0042:
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x005f
            boolean r3 = r4.A0D
            X.00H r0 = r4.A16
            X.A1P r2 = X.C108945cZ.A0d(r0)
            X.11S r1 = r4.A0V
            com.whatsapp.jid.UserJid r0 = r4.A06
            boolean r0 = r1.A0O(r0)
            if (r3 == 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00e8
            X.6uK r0 = r2.A0P
        L_0x005c:
            r0.A02()
        L_0x005f:
            X.8At r1 = r7.A0n
            if (r1 == 0) goto L_0x006c
            r0 = 1
            if (r8 == 0) goto L_0x0069
            if (r8 == r0) goto L_0x0069
            r0 = 0
        L_0x0069:
            r1.CJ9(r0)
        L_0x006c:
            X.8Au r0 = r7.A0p
            r0.C0b(r8)
            X.735 r4 = r7.A0w
            if (r4 == 0) goto L_0x008d
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x008d
            X.1vp r0 = r4.A0B
            java.lang.Object r3 = r0.A06()
            X.72C r3 = (X.AnonymousClass72C) r3
            r0 = 3
            boolean r2 = X.AnonymousClass000.A1S(r8, r0)
            int r1 = r3.A00
            boolean r0 = r3.A01
            X.AnonymousClass72C.A00(r4, r3, r1, r2, r0)
        L_0x008d:
            boolean r0 = r7.A2D
            if (r0 == 0) goto L_0x00b6
            com.whatsapp.calling.header.CallHeaderStateHolder r1 = X.C108955ca.A0L(r7)
            r3 = 1
            if (r8 == r3) goto L_0x009b
            if (r8 == 0) goto L_0x009b
            r3 = 0
        L_0x009b:
            X.1G4 r2 = r1.A0M
            java.lang.Object r0 = r2.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x00b3
            if (r3 != 0) goto L_0x00b3
            X.1G4 r1 = r1.A0Q
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.setValue(r0)
        L_0x00b3:
            X.AnonymousClass3MY.A1Y(r2, r3)
        L_0x00b6:
            boolean r0 = A25(r7)
            if (r0 == 0) goto L_0x00e4
            X.00H r0 = r7.A1n
            java.lang.Object r0 = r0.get()
            X.6kZ r0 = (X.C131136kZ) r0
            X.1G4 r1 = r0.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.setValue(r0)
            X.1bI r1 = r7.A1U
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00e4
            android.view.View r1 = r1.A02()
            com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer r1 = (com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer) r1
            r0 = 1
            if (r8 == r0) goto L_0x00e5
            r0 = 3
            if (r8 != r0) goto L_0x00e4
            X.6Ri r0 = X.C122686Ri.CONTROLS_SHOWN
        L_0x00e1:
            r1.setBehavior(r0)
        L_0x00e4:
            return
        L_0x00e5:
            X.6Ri r0 = X.C122686Ri.PIP
            goto L_0x00e1
        L_0x00e8:
            X.6uK r0 = r2.A0M
            goto L_0x005c
        L_0x00ec:
            if (r0 == 0) goto L_0x00f5
            X.6uK r0 = r2.A0P
        L_0x00f0:
            r0.A00()
            goto L_0x005f
        L_0x00f5:
            X.6uK r0 = r2.A0M
            goto L_0x00f0
        L_0x00f8:
            r0 = 2
            X.1vp r1 = r4.A0p
            if (r8 != r0) goto L_0x0103
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x003f
        L_0x0103:
            boolean r0 = r4.A0D
            r5 = r5 ^ r0
            X.AnonymousClass3MY.A1L(r1, r5)
            android.graphics.Rect r1 = r4.A01
            if (r1 == 0) goto L_0x0112
            X.1vp r0 = r4.A0v
            r0.A0F(r1)
        L_0x0112:
            X.4Sa r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r4)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r0, r4, r6)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A11(int):void");
    }

    private void A12(int i, float f) {
        C134216qE r0;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1b;
        if (voipCallControlBottomSheetV2 != null) {
            voipCallControlBottomSheetV2.A00 = f;
            VoipCallFooter voipCallFooter = voipCallControlBottomSheetV2.A0T;
            if (voipCallFooter != null) {
                voipCallFooter.A04(f);
            }
        }
        if (!this.A2D) {
            ViewGroup viewGroup = this.A0G;
            C17960vV.A05(viewGroup);
            viewGroup.setRotation(f);
        } else {
            CallHeaderStateHolder A0L2 = C108955ca.A0L(this);
            A0L2.A00 = i;
            A0L2.A0O.setValue(Integer.valueOf(i));
        }
        if (!C72463Mc.A1Z(this.A26) && !this.A2D) {
            ImageButton imageButton = this.A0H;
            C17960vV.A05(imageButton);
            imageButton.setRotation(f);
        }
        this.A0B.setRotation(f);
        CallGridViewModel callGridViewModel = this.A0g;
        callGridViewModel.A00 = i;
        if (!(callGridViewModel.A07 == null || (r0 = (C134216qE) CallGridViewModel.A05(callGridViewModel).A06.get(callGridViewModel.A07)) == null)) {
            CallGridViewModel.A0A(r0, callGridViewModel);
        }
        if (callGridViewModel.A0F && !callGridViewModel.A0V.A0O(callGridViewModel.A06)) {
            A1P A0d2 = C108945cZ.A0d(callGridViewModel.A16);
            int i2 = callGridViewModel.A00;
            boolean z = true;
            if (!(i2 == 1 || i2 == 3)) {
                z = false;
            }
            C136746uK r1 = A0d2.A0L;
            if (!z) {
                r1.A00();
            } else if (!r1.A01) {
                r1.A02();
            }
        }
        CallGridViewModel.A0D(callGridViewModel);
        if (C108995ce.A1a(this)) {
            AnonymousClass4aL r12 = (AnonymousClass4aL) this.A1i.get();
            if (r12.A00 != i) {
                r12.A00 = i;
                r12.A07();
            }
            if (A25(this)) {
                C131136kZ r13 = (C131136kZ) this.A1n.get();
                if (r13.A00 != i) {
                    r13.A00 = i;
                    r13.A0D.setValue(Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r1.A04.equals(r3) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A13(android.content.Intent r5, com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r4 = this;
            java.lang.String r0 = X.AnonymousClass6Z8.A00
            boolean r1 = X.C17890vO.A1S(r5, r0)
            java.lang.String r0 = "should only be called if intent action is ACTION_ACCEPT_INCOMING_CALL"
            X.C17960vV.A0F(r1, r0)
            java.lang.String r0 = "call_id"
            java.lang.String r3 = r5.getStringExtra(r0)
            boolean r0 = X.C40811vJ.A0e(r6)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r6.callId
            boolean r0 = r0.equals(r3)
            r2 = 1
            if (r0 != 0) goto L_0x002e
            X.2gu r1 = r6.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r2) goto L_0x003e
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003e
        L_0x002e:
            r4.A28 = r2
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = "call_ui_action"
            r0 = 0
            int r0 = r5.getIntExtra(r1, r0)
            A1e(r4, r0)
        L_0x003e:
            com.whatsapp.jid.GroupJid r2 = r6.groupJid
            if (r2 != 0) goto L_0x0048
            com.whatsapp.jid.UserJid r2 = r6.getCreatorJid()
            if (r2 == 0) goto L_0x004e
        L_0x0048:
            X.1i1 r1 = r4.A19
            r0 = 5
            r1.A0C(r2, r0)
        L_0x004e:
            return
        L_0x004f:
            r4.A2f = r2
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A13(android.content.Intent, com.whatsapp.voipcalling.CallInfo):void");
    }

    private void A14(Intent intent, CallInfo callInfo) {
        C17960vV.A0F(C17890vO.A1S(intent, "com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"), "should only be called if intent action is ACTION_SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
        if (callInfo.callState == CallState.ACTIVE) {
            String stringExtra = intent.getStringExtra("alertMessage");
            C18070vi.A0d(stringExtra, 0);
            WaDialogFragment waDialogFragment = new WaDialogFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("text", stringExtra);
            A0D2.putBoolean("dismiss", false);
            waDialogFragment.A1R(A0D2);
            A4h(waDialogFragment, "NonActivityDismissDialogFragment");
            return;
        }
        Log.i("voip/VoipActivityV2/new-intent call is gone, ignore the request to show alert message");
        finish();
    }

    public static void A16(View view) {
        C17900vP.A0j("calling/VoipUiUtils/animateButtonIn delay:", AnonymousClass000.A10(), 100);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        C108985cd.A12(scaleAnimation, 300);
        view.startAnimation(scaleAnimation);
    }

    public static void A17(C22851Dl r6, VoipActivityV2 voipActivityV2, boolean z) {
        String string;
        C17880vN.A1F(AnonymousClass3MZ.A08(voipActivityV2.A0Z), "screen_sharing_backward_compat_shown", true);
        C73203Rj A002 = AnonymousClass4a6.A00(voipActivityV2);
        int i = 2131895446;
        if (z) {
            i = 2131895444;
        }
        A002.A0E(i);
        if (z) {
            string = voipActivityV2.getString(2131895443);
        } else {
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, C18020vd.A00(C18040vf.A02, voipActivityV2.A0E, 3694));
            string = voipActivityV2.getString(2131895445, objArr);
        }
        A002.A0S(string);
        A002.A0g(voipActivityV2, r6, 2131899286);
        A002.A0e(voipActivityV2, (C22851Dl) null, 2131898766);
        voipActivityV2.A4f(A002.create(), "ScreenSharingBackwardCompatDialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r8.A00 != 2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r8.A00 != 2) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r8.A00 == 3) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0 = r9.A0i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r0 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r0.A07.A06() == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r1 = X.C72463Mc.A0A(r9.A0i.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        if (r2 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r2 = 0;
        com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1 * 90, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (com.whatsapp.voipcalling.Voip.setEnableFixedVideoOrientation(r4) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1 * 90, r2 * 90, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A0E, 12435) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r2 = (r9.A03() + r1) % 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        if (r8.A00 == 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.C72463Mc.A1O(r3.A0r) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A19(X.C139926zf r8, com.whatsapp.voipcalling.VoipActivityV2 r9) {
        /*
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r9.A0g
            if (r8 == 0) goto L_0x0025
            X.1vp r2 = r3.A0s
            X.1Hd r0 = r3.A0f
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x001c
            int r1 = r8.A00
            r0 = 3
            if (r1 == r0) goto L_0x001c
            X.1vp r0 = r3.A0r
            boolean r1 = X.C72463Mc.A1O(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            X.AnonymousClass3MY.A1L(r2, r0)
            X.1vp r0 = r3.A0m
            r0.A0F(r8)
        L_0x0025:
            r4 = 2
            r3 = 1
            r5 = 0
            if (r8 == 0) goto L_0x002f
            int r1 = r8.A00
            r0 = 1
            if (r1 == r4) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r9.A2j = r0
            X.6o5 r1 = r9.A0f
            if (r1 == 0) goto L_0x003a
            r0 = r0 ^ 1
            r1.A02 = r0
        L_0x003a:
            if (r8 == 0) goto L_0x00ab
            android.view.View r0 = r9.A09
            if (r0 == 0) goto L_0x006c
            android.view.ViewParent r7 = r0.getParent()
            android.view.View r7 = (android.view.View) r7
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165606(0x7f0701a6, float:1.7945434E38)
            int r6 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r9.A09
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r0)
            boolean r0 = r9.A2j
            if (r0 == 0) goto L_0x00d9
            int r1 = r7.getHeight()
            android.graphics.Rect r0 = r8.A01
            int r0 = r0.top
            int r1 = r1 - r0
            int r1 = r1 + r6
        L_0x0065:
            r2.bottomMargin = r1
            android.view.View r0 = r9.A09
            r0.setLayoutParams(r2)
        L_0x006c:
            X.1Hd r0 = r9.A1H
            boolean r1 = r0.A00()
            if (r1 == 0) goto L_0x0079
            int r0 = r8.A00
            r2 = 1
            if (r0 == r4) goto L_0x00d2
        L_0x0079:
            r2 = 0
            if (r1 != 0) goto L_0x00d2
            int r1 = r8.A00
            r0 = 3
            if (r1 != r0) goto L_0x00d7
        L_0x0081:
            r4 = 0
        L_0x0082:
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r9.A0i
            if (r0 == 0) goto L_0x00d0
            X.1DT r0 = r0.A07
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x00d0
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r9.A0i
            X.1DT r0 = r0.A07
            int r1 = X.C72463Mc.A0A(r0)
        L_0x0096:
            if (r2 == 0) goto L_0x00c8
            r2 = 0
            int r0 = r1 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r0, r5, r3)
        L_0x009e:
            boolean r0 = com.whatsapp.voipcalling.Voip.setEnableFixedVideoOrientation(r4)
            if (r0 == 0) goto L_0x00ab
            int r1 = r1 * 90
            int r0 = r2 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1, r0, r3)
        L_0x00ab:
            com.whatsapp.voipcalling.CallInfo r3 = A0Q(r9)
            boolean r0 = X.C108995ce.A1a(r9)
            if (r0 == 0) goto L_0x00c1
            X.0ve r2 = r9.A0E
            r1 = 12435(0x3093, float:1.7425E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00c4
        L_0x00c1:
            A1c(r9)
        L_0x00c4:
            A1L(r3, r9)
            return
        L_0x00c8:
            int r0 = r9.A03()
            int r0 = r0 + r1
            int r2 = r0 % 4
            goto L_0x009e
        L_0x00d0:
            r1 = 0
            goto L_0x0096
        L_0x00d2:
            int r0 = r8.A00
            if (r0 != 0) goto L_0x00d7
            goto L_0x0081
        L_0x00d7:
            r4 = 1
            goto L_0x0082
        L_0x00d9:
            r1 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A19(X.6zf, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1A(X.C160958At r2, com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            if (r3 == 0) goto L_0x0049
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0049
            r2.C9P(r3)
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r4.A0t
            if (r0 == 0) goto L_0x0018
            X.1vp r0 = r0.A0A
            boolean r1 = X.C72463Mc.A1O(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r2.C50(r0)
            X.1DS r1 = r2.BZH()
            r0 = 35
            X.AnonymousClass7AP.A00(r4, r1, r0)
            r4.A0n = r2
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r4.A0e
            if (r0 == 0) goto L_0x0036
            boolean r0 = A25(r4)
            if (r0 != 0) goto L_0x0036
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r4.A0e
            r0.setGlassesUiPlugin(r2)
        L_0x0036:
            X.73p r0 = r4.A0k
            if (r0 == 0) goto L_0x0048
            boolean r0 = A25(r4)
            if (r0 == 0) goto L_0x0048
            X.73p r1 = r4.A0k
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r2)
            r1.A00 = r0
        L_0x0048:
            return
        L_0x0049:
            r2.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1A(X.8At, com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A1C(AnonymousClass1BI r2, VoipActivityV2 voipActivityV2, int i) {
        A1h(voipActivityV2, 35, i);
        voipActivityV2.A01.A09(voipActivityV2, AnonymousClass3MY.A06(voipActivityV2, C108945cZ.A0h(voipActivityV2.A1z), r2));
        if (A23(voipActivityV2)) {
            A1y(A0Q(voipActivityV2), voipActivityV2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d5, code lost:
        if (r13 == 2) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1D(X.AnonymousClass1BI r11, com.whatsapp.voipcalling.VoipActivityV2 r12, int r13, boolean r14) {
        /*
            if (r11 != 0) goto L_0x000b
            java.lang.String r0 = "VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null jid"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r12.finish()
        L_0x000a:
            return
        L_0x000b:
            r12.A0y()
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r12.A4i(r0)
            java.lang.String r1 = r12.A0d(r11, r13)
            boolean r0 = r12.A2D
            if (r0 != 0) goto L_0x0022
            com.whatsapp.calling.CallDetailsLayout r0 = r12.A0W
            if (r0 == 0) goto L_0x0022
            r0.A05(r1, r1)
        L_0x0022:
            if (r1 == 0) goto L_0x0029
            X.11C r0 = r12.A08
            X.AnonymousClass1Y5.A00(r12, r0, r1)
        L_0x0029:
            r12.A0q()
            android.view.ViewGroup r0 = r12.A0F
            if (r0 != 0) goto L_0x004d
            r0 = 2131428674(0x7f0b0542, float:1.8479E38)
            android.view.View r3 = r12.findViewById(r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r2 = 2131624424(0x7f0e01e8, float:1.8876027E38)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/showCallFailedScreen found callFailedButtonsStub:"
            X.C17900vP.A0Y(r3, r0, r1)
            android.view.View r0 = X.AnonymousClass3MY.A0G(r3, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12.A0F = r0
        L_0x004d:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r12.A0g
            X.1vp r2 = r0.A0j
            java.lang.Object r0 = r2.A06()
            X.6qk r0 = (X.C134536qk) r0
            android.graphics.Bitmap r1 = r0.A01
            r8 = 0
            X.6qk r0 = new X.6qk
            r0.<init>(r8, r1)
            r2.A0F(r0)
            java.lang.String r0 = "VoipActivityV2 vm showing call failed screen from coordinator"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 21
            X.78M r9 = new X.78M
            r9.<init>(r12, r11, r0)
            X.EDn r7 = r12.A10
            android.view.ViewGroup r3 = r12.A0F
            X.C17960vV.A05(r3)
            android.view.View$OnClickListener r6 = r12.A2U
            android.view.View$OnClickListener r10 = r12.A2T
            r5 = 3
            X.C18070vi.A0f(r6, r5, r10)
            X.7DQ r7 = (X.AnonymousClass7DQ) r7
            r4 = 0
            X.C18070vi.A0d(r3, r8)
            r3.setVisibility(r8)
            r0 = 2131428817(0x7f0b05d1, float:1.847929E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r3, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r1 = r2.getChildCount()
        L_0x0093:
            if (r8 >= r1) goto L_0x009f
            android.view.View r0 = r2.getChildAt(r8)
            r0.setOnClickListener(r6)
            int r8 = r8 + 1
            goto L_0x0093
        L_0x009f:
            r0 = 2131428818(0x7f0b05d2, float:1.8479291E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0H(r3, r0)
            X.0vp r6 = r7.A00
            boolean r0 = X.C72473Md.A1Z(r6)
            if (r0 == 0) goto L_0x00bc
            android.content.Context r1 = X.AnonymousClass3MY.A04(r2)
            r0 = 2131103383(0x7f060e97, float:1.781923E38)
            int r0 = X.C19740yt.A00(r1, r0)
            X.C1402770r.A01(r2, r0, r4)
        L_0x00bc:
            r0 = 2131233243(0x7f0809db, float:1.8082618E38)
            r2.setImageResource(r0)
            A16(r2)
            r0 = 2131428642(0x7f0b0522, float:1.8478934E38)
            android.view.View r2 = r3.findViewById(r0)
            r8 = r2
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0 = 17
            if (r13 == r0) goto L_0x00d7
            r0 = 2
            r11 = 0
            if (r13 != r0) goto L_0x00d8
        L_0x00d7:
            r11 = 1
        L_0x00d8:
            r1 = r11 ^ 1
            X.C18070vi.A0b(r8)
            r7 = 0
            int r0 = X.C72453Mb.A07(r1)
            r8.setVisibility(r0)
            if (r1 == 0) goto L_0x0136
            X.C18070vi.A0X(r2)
            r0 = 2131428643(0x7f0b0523, float:1.8478936E38)
            android.widget.ImageView r2 = X.C108975cc.A0B(r3, r0)
            boolean r0 = X.C72473Md.A1Z(r6)
            if (r0 == 0) goto L_0x0121
            android.content.Context r1 = X.AnonymousClass3MY.A04(r2)
            r0 = 2131103277(0x7f060e2d, float:1.7819016E38)
            int r1 = X.C19740yt.A00(r1, r0)
            r0 = 1
            X.C1402770r.A01(r2, r1, r0)
            r0 = 2131231623(0x7f080387, float:1.8079332E38)
            if (r14 == 0) goto L_0x010e
            r0 = 2131231646(0x7f08039e, float:1.8079379E38)
        L_0x010e:
            r2.setImageResource(r0)
            int r1 = r8.getChildCount()
        L_0x0115:
            if (r7 >= r1) goto L_0x0133
            android.view.View r0 = r8.getChildAt(r7)
            r0.setOnClickListener(r10)
            int r7 = r7 + 1
            goto L_0x0115
        L_0x0121:
            r0 = 2131232856(0x7f080858, float:1.8081833E38)
            r2.setBackgroundResource(r0)
            r0 = 2131233225(0x7f0809c9, float:1.8082581E38)
            if (r14 == 0) goto L_0x012f
            r0 = 2131233480(0x7f080ac8, float:1.8083099E38)
        L_0x012f:
            r3.setBackgroundColor(r4)
            goto L_0x010e
        L_0x0133:
            A16(r2)
        L_0x0136:
            r0 = 2131432664(0x7f0b14d8, float:1.8487092E38)
            X.1bI r8 = X.C72453Mb.A0s(r3, r0)
            r7 = 0
            r8.A04(r4)
            android.view.View r2 = X.AnonymousClass3MX.A0D(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r1 = r2.getChildCount()
        L_0x014b:
            if (r7 >= r1) goto L_0x0157
            android.view.View r0 = r2.getChildAt(r7)
            r0.setOnClickListener(r9)
            int r7 = r7 + 1
            goto L_0x014b
        L_0x0157:
            r0 = 2131432671(0x7f0b14df, float:1.8487106E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0H(r3, r0)
            boolean r0 = X.C72473Md.A1Z(r6)
            if (r0 == 0) goto L_0x017f
            if (r2 == 0) goto L_0x017f
            android.view.View r0 = r8.A02()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)
            r0 = 2131102993(0x7f060d11, float:1.781844E38)
            int r1 = X.C19740yt.A00(r1, r0)
            r0 = 1
            X.C1402770r.A01(r2, r1, r0)
            r0 = 2131233237(0x7f0809d5, float:1.8082606E38)
            r2.setImageResource(r0)
        L_0x017f:
            A16(r2)
            boolean r0 = X.C72473Md.A1Z(r6)
            if (r0 == 0) goto L_0x01d0
            java.lang.Integer[] r1 = new java.lang.Integer[r5]
            r0 = 2131428819(0x7f0b05d3, float:1.8479293E38)
            X.C17880vN.A1T(r1, r0, r4)
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            X.AnonymousClass000.A1M(r1, r0)
            r0 = 2131428644(0x7f0b0524, float:1.8478938E38)
            X.AnonymousClass3Ma.A1S(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.util.ArrayList r2 = X.C108965cb.A0t(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01bc
            int r0 = X.C72453Mb.A0H(r1)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x01a8
            r2.add(r0)
            goto L_0x01a8
        L_0x01bc:
            java.util.Iterator r1 = r2.iterator()
        L_0x01c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r1.next()
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C1402770r.A02(r0, r14)
            goto L_0x01c0
        L_0x01d0:
            if (r11 == 0) goto L_0x01db
            android.os.Handler r3 = r12.A05
            r2 = 9
            r0 = 15000(0x3a98, double:7.411E-320)
            r3.sendEmptyMessageDelayed(r2, r0)
        L_0x01db:
            X.00H r0 = r12.A1w
            java.lang.Object r1 = r0.get()
            X.6wn r1 = (X.C138266wn) r1
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1.A01 = r0
            X.8At r0 = r12.A0n
            if (r0 == 0) goto L_0x000a
            r0.CNW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1D(X.1BI, com.whatsapp.voipcalling.VoipActivityV2, int, boolean):void");
    }

    private void A1G(CallInfo callInfo) {
        A99 a99;
        C134216qE r0;
        if (!this.A2E && (a99 = this.A0u) != null && a99.A1G(callInfo.callId) && callInfo.callState == CallState.ACTIVE && (r0 = callInfo.self) != null && r0.A0F && !C108995ce.A1a(this)) {
            Log.i("voip/VoipActivityV2/checkToShowResumeCallButton");
            String string = getString(2131898264);
            String string2 = getString(2131898285);
            View.OnClickListener onClickListener = this.A2V;
            this.A0J.setText(string);
            this.A0B.setVisibility(0);
            if (string2 == null) {
                this.A0B.setBackground((Drawable) null);
                this.A0A.setVisibility(8);
                this.A0U.setVisibility(8);
                return;
            }
            C17960vV.A0F(AnonymousClass000.A1W(onClickListener), "buttonOnClickListener must be set together with buttonText");
            this.A0B.setBackground(this.A04);
            this.A0A.setVisibility(0);
            this.A0U.setVisibility(0);
            this.A0U.setText(string2);
            AnonymousClass78M.A00(this.A0U, this, onClickListener, 26);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        if (r7.isEitherSideRequestingUpgrade() == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1H(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            java.lang.String r0 = "voip/VoipActivityV2/showAnswerCallView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5wM r0 = r6.A0a
            if (r0 != 0) goto L_0x002d
            r0 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.View r2 = r6.findViewById(r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r0 = r2.inflate()
            X.5wM r0 = (X.C116075wM) r0
            r6.A0a = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/showAnswerCallView found answerCallViewStub:"
            X.C17900vP.A0Y(r2, r0, r1)
            X.5wM r1 = r6.A0a
            X.7DG r0 = new X.7DG
            r0.<init>(r6)
            r1.setAnswerCallViewListener(r0)
        L_0x002d:
            X.73p r0 = r6.A0k
            if (r0 == 0) goto L_0x0036
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = r0.A04
            X.C72453Mb.A1C(r0)
        L_0x0036:
            X.5wM r2 = r6.A0a
            boolean r1 = A26(r6)
            X.11C r0 = r6.A08
            boolean r0 = X.C108965cb.A1X(r0)
            r2.A06(r7, r1, r0)
            com.whatsapp.voipcalling.CallState r1 = r7.callState
            boolean r0 = r7.isGroupCall
            boolean r0 = A22(r1, r6, r0)
            if (r0 == 0) goto L_0x0075
            com.whatsapp.calling.CallDetailsLayout r5 = r6.A0W
            boolean r0 = r7.videoEnabled
            r4 = 0
            if (r0 == 0) goto L_0x005d
            boolean r0 = r7.isEitherSideRequestingUpgrade()
            r3 = 0
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r3 = 1
        L_0x005e:
            com.whatsapp.components.button.ThumbnailButton r2 = r5.A08
            r1 = 8
            int r0 = X.C72453Mb.A0J(r3)
            r2.setVisibility(r0)
            X.1xh r0 = r5.A06
            if (r3 == 0) goto L_0x006e
            r1 = 0
        L_0x006e:
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setVisibility(r1)
            r5.A00 = r4
        L_0x0075:
            boolean r0 = r7.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x0080
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r6.A4i(r0)
        L_0x0080:
            r6.A0q()
            A27(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1H(com.whatsapp.voipcalling.CallInfo):void");
    }

    private void A1I(CallInfo callInfo) {
        boolean z;
        int i;
        if (this.A0K == null || this.A2W == null || this.A0H == null) {
            C17960vV.A0F(this.A2D, "header elements cannot be null when call controls m1 is disabled");
            return;
        }
        ViewGroup.LayoutParams A032 = this.A1X.A03();
        boolean A1W2 = AnonymousClass000.A1W(callInfo.groupJid);
        boolean z2 = callInfo.videoEnabled;
        Resources resources = getResources();
        int i2 = 2131167211;
        if (z2) {
            i2 = 2131165709;
        }
        A032.height = resources.getDimensionPixelSize(i2) + this.A0X.A00;
        this.A1X.A06(A032);
        this.A1X.A02().setPadding(this.A1X.A02().getPaddingLeft(), this.A0X.A00, this.A1X.A02().getPaddingRight(), this.A1X.A02().getPaddingBottom());
        ImageButton imageButton = this.A0H;
        float f = -1.0f;
        if (AnonymousClass3MY.A1b(this.A00)) {
            f = 1.0f;
        }
        imageButton.setScaleX(f);
        boolean A0A2 = C63982u1.A0A(this.A14, callInfo);
        if (A24(this) && C40811vJ.A0Q(this.A0E)) {
            this.A0K.setText(2131887857);
            A1d(this);
        } else if (A0A2 && C40811vJ.A0Q(this.A0E)) {
            AnonymousClass7RN.A02(this.A05, this, callInfo, 7);
        }
        View A062 = AnonymousClass1HF.A06(this.A09, 2131436293);
        if (callInfo.videoEnabled) {
            int i3 = 2130968808;
            int i4 = 2131099885;
            if (z2) {
                i3 = 2130968811;
                i4 = 2131099891;
            }
            int A002 = AnonymousClass3Ma.A00(this, i3, i4);
            A062.setVisibility(0);
            View A022 = this.A1X.A02();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int[] A1W3 = C108945cZ.A1W();
            A1W3[0] = A002;
            A1W3[1] = C108955ca.A01(this);
            A022.setBackground(new GradientDrawable(orientation, A1W3));
            this.A2W.setImageAlpha(255);
            C72463Mc.A0y(this, this.A0K, 2130972035, 2131103448);
        } else {
            this.A2W.setImageAlpha(153);
            C72463Mc.A0y(this, this.A0K, 2130972032, 2131103440);
            A062.setVisibility(0);
            this.A1X.A04(0);
        }
        if (this.A0G == null || this.A0L == null || this.A0I == null) {
            C17960vV.A0F(this.A2D, "Add participant btn/count/icon cannot be null when call controls m1 is disabled");
        } else {
            if (callInfo.getConnectedParticipantsCount() > 8) {
                z = true;
                i = 2131233398;
            } else {
                z = false;
                i = 2131232178;
                if (callInfo.groupJid != null) {
                    i = 2131233316;
                }
            }
            this.A0I.setImageResource(i);
            TextView textView = this.A0L;
            if (z) {
                textView.setText(String.valueOf(callInfo.getConnectedParticipantsCount()));
                this.A0L.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if (A24(this) && C40811vJ.A0Q(this.A0E)) {
                this.A0G.setVisibility(4);
            } else if (C63982u1.A0A(this.A14, callInfo) && C40811vJ.A0Q(this.A0E)) {
                AnonymousClass7RN.A02(this.A05, this, callInfo, 6);
            }
        }
        A1t(A1W2);
    }

    public static void A1J(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        if (Voip.A0A(callInfo.callState)) {
            C18030ve r2 = voipActivityV2.A0E;
            if (!callInfo.isGroupCall && C18020vd.A05(C18040vf.A02, r2, 5923)) {
                return;
            }
        }
        if (!A22(callInfo.callState, voipActivityV2, callInfo.isGroupCall)) {
            return;
        }
        if (callInfo.callState != CallState.LINK || !callInfo.isInLonelyState()) {
            CallDetailsLayout callDetailsLayout = voipActivityV2.A0W;
            C17960vV.A05(callDetailsLayout);
            callDetailsLayout.A02(callInfo);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0E, 4773) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1L(com.whatsapp.voipcalling.CallInfo r5, com.whatsapp.voipcalling.VoipActivityV2 r6) {
        /*
            if (r5 == 0) goto L_0x008c
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r6.A0t
            r2 = 1
            if (r0 == 0) goto L_0x001c
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x001c
            X.0ve r3 = r6.A0E
            r1 = 4773(0x12a5, float:6.688E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r1 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0091
            if (r1 != 0) goto L_0x0091
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r3 = r6.A0i
            if (r3 == 0) goto L_0x008c
            X.5e0 r0 = r3.A01
            if (r0 != 0) goto L_0x0054
            X.5e0 r0 = new X.5e0
            r0.<init>(r6, r3)
            r3.A01 = r0
            X.0ve r6 = r3.A09
            r5 = 11857(0x2e51, float:1.6615E-41)
            X.0vf r4 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r4, r6, r5)
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0054
            r0 = 11
            X.7Pb r1 = new X.7Pb
            r1.<init>(r3, r0)
            int r0 = X.C18020vd.A00(r4, r6, r5)
            r0 = r0 & 2
            if (r0 == 0) goto L_0x008d
            X.10I r0 = r3.A0A
            r0.CGF(r1)
        L_0x0054:
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x006c
            X.5e0 r0 = r3.A01
            boolean r0 = r0.canDetectOrientation()
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "voip/OrientationViewModel/enableOrientationListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5e0 r0 = r3.A01
            r0.enable()
            r3.A03 = r2
        L_0x006c:
            android.hardware.display.DisplayManager$DisplayListener r0 = r3.A00
            if (r0 != 0) goto L_0x008c
            X.75L r0 = new X.75L
            r0.<init>(r3)
            r3.A00 = r0
            X.118 r0 = r3.A08
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "display"
            java.lang.Object r2 = r1.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.hardware.display.DisplayManager$DisplayListener r1 = r3.A00
            android.os.Handler r0 = X.C17890vO.A0D()
            r2.registerDisplayListener(r1, r0)
        L_0x008c:
            return
        L_0x008d:
            r1.run()
            goto L_0x0054
        L_0x0091:
            r6.A1q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1L(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A1O(CallInfo callInfo, VoipActivityV2 voipActivityV2, String str) {
        C17960vV.A0F(AnonymousClass6Z8.A09.equals(str), "should only be called if intent action is ACTION_START_CALL");
        if (callInfo != null && callInfo.callState == CallState.PRECALLING && callInfo.groupJid != null) {
            Log.i("voip/VoipActivityV2/startCall");
            VoipActivityV2 voipActivityV22 = voipActivityV2;
            AnonymousClass1E7 A0H2 = voipActivityV22.A12.A0H(callInfo.groupJid);
            List A042 = C63982u1.A04(voipActivityV22.A02, voipActivityV22.A12, voipActivityV22.A1E, A0H2);
            if (!A042.isEmpty()) {
                AnonymousClass1VP r6 = voipActivityV22.A0l;
                AnonymousClass1VQ r62 = (AnonymousClass1VQ) r6;
                AnonymousClass1VQ.A00(voipActivityV22, r62, callInfo.groupJid, (Integer) null, callInfo.callId, callInfo.scheduledId, A042, 4, 0, callInfo.videoEnabled, false, false, false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.5xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.5xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.5xo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1P(com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4, boolean r5) {
        /*
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x0010
            X.10I r2 = r4.A05
            r1 = 18
            X.7Qx r0 = new X.7Qx
            r0.<init>(r4, r3, r1, r5)
            r2.CGN(r0)
        L_0x0010:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1b
            if (r0 == 0) goto L_0x002d
            com.whatsapp.jid.GroupJid r0 = r3.groupJid
            if (r0 != 0) goto L_0x0022
            if (r5 == 0) goto L_0x002d
            int r1 = r3.getConnectedParticipantsCount()
            r0 = 8
            if (r1 <= r0) goto L_0x002d
        L_0x0022:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1b
            X.73c r1 = r0.A0K
            if (r1 == 0) goto L_0x002c
            r0 = 3
            X.C1407973c.A01(r1, r0)
        L_0x002c:
            return
        L_0x002d:
            X.00H r0 = r4.A1t
            java.lang.Object r0 = r0.get()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            X.1VC r0 = r0.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x004d
            X.00H r0 = r4.A1t
            java.lang.Object r0 = r0.get()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r0 = r0.A00()
            r4.CMl(r0)
            return
        L_0x004d:
            java.util.Map r0 = r3.participants
            int r1 = r0.size()
            java.lang.String r2 = "VoipErrorDialogFragment"
            r0 = 64
            if (r0 != r1) goto L_0x0067
            X.4Rb r1 = new X.4Rb
            r1.<init>()
            r0 = 4
        L_0x005f:
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r1, r0)
            r4.A4h(r0, r2)
            return
        L_0x0067:
            boolean r0 = r3.isCallFull()
            if (r0 == 0) goto L_0x0075
            r0 = 2
            X.5xo r1 = new X.5xo
            r1.<init>(r4, r0)
            r0 = 5
            goto L_0x005f
        L_0x0075:
            A1W(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1P(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2, boolean):void");
    }

    private void A1Q(CallState callState) {
        if (this.A2i || ("join_call".equals(getIntent().getAction()) && Voip.A0B(callState))) {
            this.A0v.A00(new A69("refresh_notification"));
            this.A2i = false;
        }
    }

    public static void A1R(VoipActivityV2 voipActivityV2) {
        Log.i("voip/VoipActivityV2/clearCenterScreenCallStatus called ");
        AnonymousClass3MW.A1S(voipActivityV2.A0J);
        voipActivityV2.A0B.setVisibility(8);
    }

    public static void A1S(VoipActivityV2 voipActivityV2) {
        C17960vV.A0F(AnonymousClass000.A1W(voipActivityV2.A16), "contact picker fragment should not be null");
        ContactPickerFragment contactPickerFragment = voipActivityV2.A16;
        if (contactPickerFragment != null) {
            if (AnonymousClass000.A1P(contactPickerFragment.A20.A08.getVisibility())) {
                contactPickerFragment.A20.A02(false);
            }
            voipActivityV2.A16 = null;
            A1V(voipActivityV2);
            voipActivityV2.A4j("VoipContactPickerDialogFragment");
            if (voipActivityV2.A2l) {
                A28(voipActivityV2);
                voipActivityV2.A2l = false;
            }
        }
    }

    public static void A1T(VoipActivityV2 voipActivityV2) {
        Log.i("voip/VoipActivityV2/call/end");
        A99 a99 = voipActivityV2.A0u;
        if (a99 != null) {
            A99.A0G(a99, (CallInfo) null, (String) null, 1);
        }
        if (voipActivityV2.A2D) {
            C108955ca.A0L(voipActivityV2).A02 = true;
        }
        if (C108995ce.A1a(voipActivityV2)) {
            ((AnonymousClass4OP) ((AnonymousClass4OO) voipActivityV2.A1j.get()).A01.get()).A02 = true;
        }
        voipActivityV2.A2g = true;
    }

    public static void A1U(VoipActivityV2 voipActivityV2) {
        C1407973c r1;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1b;
        if (!(voipCallControlBottomSheetV2 == null || (r1 = voipCallControlBottomSheetV2.A0K) == null || !r1.A0G.A0X)) {
            C1407973c.A01(r1, 5);
            VoipCallControlBottomSheetV2.A02(voipCallControlBottomSheetV2);
        }
        A2A(voipActivityV2, true, false);
    }

    public static void A1V(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A2F) {
            ContactPickerFragment contactPickerFragment = voipActivityV2.A16;
            if (contactPickerFragment == null || contactPickerFragment.A0j) {
                voipActivityV2.A09.A01(voipActivityV2.A0D);
            }
        }
    }

    public static void A1W(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A16 != null) {
            Log.i("contact picker is already shown, ignore new events");
        } else if (A0Q(voipActivityV2) != null) {
            C146787Qp r3 = new C146787Qp(voipActivityV2, 14);
            if (C18020vd.A05(C18040vf.A02, voipActivityV2.A0E, 5102)) {
                voipActivityV2.A1o(r3);
                return;
            }
            KeyguardManager A062 = voipActivityV2.A08.A06();
            if (A062 != null && (A062.isKeyguardLocked() || A062.inKeyguardRestrictedInputMode())) {
                voipActivityV2.A1r(false);
            }
            r3.run();
        }
    }

    public static void A1Y(VoipActivityV2 voipActivityV2) {
        voipActivityV2.A0c.A00(AnonymousClass1VH.SCREEN_SHARING);
        ScreenShareViewModel screenShareViewModel = voipActivityV2.A0t;
        if (screenShareViewModel != null) {
            if (!C72463Mc.A1O(screenShareViewModel.A0A)) {
                C108945cZ.A0d(voipActivityV2.A1v).A09++;
            }
            if (C40811vJ.A0M(voipActivityV2.A08)) {
                A1g(voipActivityV2, 1);
                return;
            }
            if (!C72463Mc.A1O(voipActivityV2.A0t.A0A) && !voipActivityV2.isFinishing()) {
                AnonymousClass1VE r1 = voipActivityV2.A0Z;
                C18030ve r0 = r1.A01;
                C18040vf r8 = C18040vf.A02;
                int A002 = C18020vd.A00(r8, r0, 4536);
                boolean z = false;
                if (A002 != 0 && A002 > AnonymousClass1VE.A00(r1).getInt("ss_permission_dialog_show_count", 0)) {
                    z = true;
                }
                if (z) {
                    ScreenSharePermissionDialogFragment screenSharePermissionDialogFragment = new ScreenSharePermissionDialogFragment();
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putInt("BodyTextId", 2131895450);
                    A0D2.putBoolean("CancelEnabled", true);
                    screenSharePermissionDialogFragment.A1R(A0D2);
                    voipActivityV2.A4h(screenSharePermissionDialogFragment, "ScreenSharePermissionDialogFragment");
                    AnonymousClass1VE r3 = voipActivityV2.A0Z;
                    C17880vN.A1C(AnonymousClass3MZ.A08(r3), "ss_permission_dialog_show_count", AnonymousClass1VE.A00(r3).getInt("ss_permission_dialog_show_count", 0) + 1);
                    if (r3.A02.BeD()) {
                        C17880vN.A1C(AnonymousClass3MZ.A08(r3), "as_permission_dialog_show_count", AnonymousClass1VE.A00(r3).getInt("as_permission_dialog_show_count", 0) + 1);
                        return;
                    }
                    return;
                }
                AnonymousClass1VE r12 = voipActivityV2.A0Z;
                if (C18020vd.A00(r8, r12.A01, 4536) != 0 && r12.A02.BeD() && AnonymousClass1VE.A00(r12).getInt("as_permission_dialog_show_count", 0) < 1) {
                    ScreenSharePermissionDialogFragment screenSharePermissionDialogFragment2 = new ScreenSharePermissionDialogFragment();
                    Bundle A0D3 = C17880vN.A0D();
                    A0D3.putInt("BodyTextId", 2131886797);
                    A0D3.putBoolean("CancelEnabled", false);
                    screenSharePermissionDialogFragment2.A1R(A0D3);
                    voipActivityV2.A4h(screenSharePermissionDialogFragment2, "ScreenSharePermissionDialogFragment");
                    AnonymousClass1VE r2 = voipActivityV2.A0Z;
                    int i = AnonymousClass1VE.A00(r2).getInt("as_permission_dialog_show_count", 0) + 1;
                    C17880vN.A1C(AnonymousClass3MZ.A08(r2), "as_permission_dialog_show_count", i);
                    C108945cZ.A0d(voipActivityV2.A1v).A00 = i;
                    return;
                }
            }
            if (C18020vd.A05(C18040vf.A02, voipActivityV2.A0E, 5102)) {
                voipActivityV2.A1o(new C146787Qp(voipActivityV2, 16));
                return;
            }
            KeyguardManager A062 = voipActivityV2.A08.A06();
            if (A062 == null || (!A062.isKeyguardLocked() && !A062.inKeyguardRestrictedInputMode())) {
                voipActivityV2.A0t.A0T(C122576Qx.BOTTOM_SHEET);
            } else {
                voipActivityV2.A1r(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r3 = r3.A0u;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1Z(com.whatsapp.voipcalling.VoipActivityV2 r3) {
        /*
            X.A99 r0 = r3.A0u
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "voip/VoipActivityV2/resumeWhatsAppCallListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r2 = A0Q(r3)
            if (r2 == 0) goto L_0x0034
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0034
            X.A99 r1 = r3.A0u
            java.lang.String r0 = r2.callId
            r1.A13(r0)
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0034
            boolean r0 = r3.A29
            if (r0 != 0) goto L_0x0034
            X.A99 r3 = r3.A0u
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A1E
            if (r2 == 0) goto L_0x0034
            r1 = 33
            X.7Pb r0 = new X.7Pb
            r0.<init>(r3, r1)
            r2.execute(r0)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1Z(com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A1d(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A2W == null) {
            C17960vV.A0F(voipActivityV2.A2D, "e2eePadLock cannot be null when call controls m1 is disabled");
            return;
        }
        voipActivityV2.A2W.setImageDrawable(AnonymousClass4aX.A08(AnonymousClass3MX.A06(voipActivityV2, 2131232015), voipActivityV2.getResources().getColor(2131100010)));
        C27641Ww.A03(voipActivityV2.A2W, 0, 10);
    }

    public static void A1e(VoipActivityV2 voipActivityV2, int i) {
        int i2;
        Log.i("voip/VoipActivityV2/call/accept");
        CallInfo A0Q2 = A0Q(voipActivityV2);
        if (A0Q2 != null && A0Q2.callState != CallState.NONE) {
            if (!voipActivityV2.A28) {
                C116075wM r1 = voipActivityV2.A0a;
                if (r1 != null) {
                    r1.A05(true);
                }
                A28(voipActivityV2);
            } else {
                Log.w("callAccepted is true when calling acceptCall()");
            }
            voipActivityV2.A28 = true;
            if (voipActivityV2.A0u != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    boolean A0E2 = true ^ voipActivityV2.A1C.A0E();
                    boolean z = A0Q2.videoEnabled;
                    boolean A0A2 = AnonymousClass74H.A0A(voipActivityV2.A1C, voipActivityV2.A1O, z);
                    if (A0E2 || A0A2) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("voip/service/accept noRecordPermission = ");
                        A102.append(A0E2);
                        Log.w(C17900vP.A0D(", noCameraPermission = ", A102, A0A2));
                        if (A0A2) {
                            i2 = 2131887898;
                            if (A0E2) {
                                i2 = 2131887899;
                            }
                        } else {
                            i2 = 2131887902;
                        }
                        voipActivityV2.A0u.A0n(30, voipActivityV2.getString(i2));
                        return;
                    }
                }
                voipActivityV2.A0u.A0X.A06();
                UserJid A0T2 = C108955ca.A0T(A0Q2);
                boolean z2 = A0Q2.videoEnabled;
                int i3 = -1;
                if (A0Q2.isPeerRequestingUpgrade()) {
                    i3 = 2;
                }
                if (!A1w(A0T2, voipActivityV2, i3, z2)) {
                    return;
                }
                if (Voip.A0A(A0Q2.callState)) {
                    voipActivityV2.A0u.A0o(i, voipActivityV2.A21, false);
                } else if (A0Q2.isPeerRequestingUpgrade()) {
                    voipActivityV2.A0u.A0T();
                }
            } else {
                Log.e("voip/VoipActivityV2/call/accept voiceService is null");
            }
        }
    }

    public static void A1h(VoipActivityV2 voipActivityV2, int i, int i2) {
        voipActivityV2.A0q.A01(Integer.valueOf(i2), i, 16);
    }

    public static void A1i(VoipActivityV2 voipActivityV2, int i, boolean z) {
        ScreenShareViewModel screenShareViewModel;
        if (voipActivityV2.A0T != null && voipActivityV2.A09 != null) {
            if (!z || (C108995ce.A1a(voipActivityV2) && i < 3 && ((screenShareViewModel = voipActivityV2.A0t) == null || !C72463Mc.A1O(screenShareViewModel.A0A)))) {
                voipActivityV2.A09.setBackgroundResource(2131102872);
                voipActivityV2.A0T.setVisibility(0);
                return;
            }
            voipActivityV2.A09.setBackgroundResource(0);
            voipActivityV2.A0T.setVisibility(8);
        }
    }

    public static void A1j(VoipActivityV2 voipActivityV2, String str) {
        voipActivityV2.A05.removeMessages(7);
        voipActivityV2.A05.removeMessages(8);
        DialogFragment dialogFragment = voipActivityV2.A0N;
        if (dialogFragment != null && dialogFragment.A1b()) {
            voipActivityV2.A4j("NonActivityDismissDialogFragment");
            voipActivityV2.A0N = null;
        }
        C18070vi.A0d(str, 0);
        WaDialogFragment waDialogFragment = new WaDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("text", str);
        A0D2.putBoolean("dismiss", true);
        waDialogFragment.A1R(A0D2);
        voipActivityV2.A0N = waDialogFragment;
        voipActivityV2.A05.sendEmptyMessage(8);
        voipActivityV2.A05.sendEmptyMessageDelayed(7, 6000);
    }

    public static void A1n(VoipActivityV2 voipActivityV2, boolean z) {
        voipActivityV2.A2P = voipActivityV2.A0X.A00;
        voipActivityV2.A2O = 0;
        int dimensionPixelSize = (voipActivityV2.A2N - voipActivityV2.getResources().getDimensionPixelSize(2131165607)) - (voipActivityV2.getResources().getDimensionPixelSize(2131165639) / 2);
        if (!z) {
            if (voipActivityV2.A2D) {
                voipActivityV2.A2P += AnonymousClass3MX.A00(voipActivityV2.getResources(), 2131168779, voipActivityV2.getResources().getDimensionPixelSize(2131168777));
            }
            voipActivityV2.A2P += voipActivityV2.A2Q;
        } else if (!C108965cb.A1X(voipActivityV2.A08)) {
            return;
        }
        voipActivityV2.A2O += dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1o(java.lang.Runnable r5) {
        /*
            r4 = this;
            X.11C r0 = r4.A08
            android.app.KeyguardManager r3 = r0.A06()
            r2 = 0
            if (r3 == 0) goto L_0x002d
            boolean r1 = X.AnonymousClass112.A05()
            boolean r0 = r3.isKeyguardLocked()
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x001b
            boolean r0 = r3.inKeyguardRestrictedInputMode()
        L_0x0019:
            if (r0 == 0) goto L_0x002d
        L_0x001b:
            boolean r0 = X.AnonymousClass112.A03()
            if (r0 == 0) goto L_0x002a
            X.5d3 r0 = new X.5d3
            r0.<init>(r4, r5)
            r3.requestDismissKeyguard(r4, r0)
            return
        L_0x002a:
            r4.A1r(r2)
        L_0x002d:
            r5.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1o(java.lang.Runnable):void");
    }

    private void A1q(boolean z) {
        boolean z2;
        OrientationViewModel orientationViewModel = this.A0i;
        if (orientationViewModel != null) {
            if (!orientationViewModel.A03 || orientationViewModel.A01 == null) {
                z2 = false;
            } else {
                z2 = true;
                Log.i("voip/OrientationViewModel/disableOrientationListener");
                orientationViewModel.A01.disable();
                orientationViewModel.A03 = false;
            }
            if (orientationViewModel.A00 != null) {
                ((DisplayManager) orientationViewModel.A08.A00.getSystemService("display")).unregisterDisplayListener(orientationViewModel.A00);
                orientationViewModel.A00 = null;
            }
            if (z2 && z) {
                A12(0, 0.0f);
            }
        }
    }

    private void A1r(boolean z) {
        Dialog dialog;
        Window window = getWindow();
        if (z) {
            window.addFlags(524288);
        } else {
            window.clearFlags(524288);
        }
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1b;
        if (voipCallControlBottomSheetV2 != null && (dialog = voipCallControlBottomSheetV2.A03) != null && dialog.getWindow() != null) {
            Window window2 = voipCallControlBottomSheetV2.A03.getWindow();
            if (z) {
                window2.addFlags(524288);
            } else {
                window2.clearFlags(524288);
            }
        }
    }

    private void A1s(boolean z) {
        C122686Ri r0;
        if (z && this.A1U.A00 == null && A25(this)) {
            FloatingViewDraggableContainer floatingViewDraggableContainer = (FloatingViewDraggableContainer) this.A1U.A02();
            if (this.A1R.A01() == 0) {
                r0 = C122686Ri.CONTROLS_SHOWN;
            } else {
                r0 = C122686Ri.CONTROLS_HIDDEN;
            }
            floatingViewDraggableContainer.setBehavior(r0);
            C72463Mc.A1G(this.A2d);
        }
    }

    private void A1t(boolean z) {
        String string;
        int i;
        ViewGroup viewGroup = this.A0G;
        if (viewGroup == null) {
            C17960vV.A0F(this.A2D, "Add participant btn cannot be null when call controls m1 is disabled");
            return;
        }
        if (z) {
            string = getString(2131898189);
            i = 2131898188;
        } else {
            string = getString(2131898165);
            i = 2131898164;
        }
        AnonymousClass4aR.A08(viewGroup, string, getString(i), true);
    }

    private boolean A1u() {
        AnonymousClass11C r2 = this.A08;
        AppOpsManager appOpsManager = r2.A00;
        if (appOpsManager == null) {
            appOpsManager = (AppOpsManager) AnonymousClass11C.A03(r2, "appops", true);
            r2.A00 = appOpsManager;
        }
        C17960vV.A07(appOpsManager);
        try {
            if (appOpsManager.checkOp("android:picture_in_picture", Process.myUid(), getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            C17900vP.A0Z(e, "voip/VoipActivityV2/isPictureInPictureAllowed", AnonymousClass000.A10());
        }
    }

    public static boolean A1x(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        if (!callInfo.videoEnabled) {
            return false;
        }
        if (AnonymousClass000.A1T(callInfo.self.A08, 6)) {
            return true;
        }
        A1h(voipActivityV2, 27, 4);
        voipActivityV2.A05.removeMessages(3);
        Voip.switchCamera();
        voipActivityV2.A0z.A06();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3.videoEnabled == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1y(com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            if (r3 == 0) goto L_0x0007
            boolean r1 = r3.videoEnabled
            r0 = 1
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r2 = 0
            if (r0 == 0) goto L_0x0053
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0053
            com.whatsapp.voipcalling.CallState r1 = r4.A0V(r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x001d
            boolean r0 = r3.isInLonelyState()
            if (r0 == 0) goto L_0x0023
        L_0x001d:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0053
        L_0x0023:
            boolean r0 = r3.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x0053
            X.1GP r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "participant_list_request"
            r1.A0u(r0)
            android.app.PictureInPictureParams$Builder r1 = r4.A02
            java.lang.String r0 = "PiP Params Builder is null"
            X.C17960vV.A08(r1, r0)
            android.app.PictureInPictureParams r0 = r1.build()
            boolean r0 = r4.enterPictureInPictureMode(r0)     // Catch:{ Exception -> 0x0048 }
            if (r0 == 0) goto L_0x004e
            r4.A11(r2)
            r0 = 1
            return r0
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipActivityV2/minimize exception trying to enter PIP mode"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x004e:
            java.lang.String r0 = "voip/VoipActivityV2/minimize failed to enter PIP mode"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1y(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):boolean");
    }

    public static boolean A1z(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        if (callInfo == null || callInfo.isPeerRequestingUpgrade() || ((!callInfo.isGroupCall && Voip.A0B(callInfo.callState)) || voipActivityV2.A2E)) {
            return false;
        }
        return true;
    }

    public static boolean A20(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        if ((!C17880vN.A1W(AnonymousClass1VE.A00(voipActivityV2.A0Z), "screen_sharing_backward_compat_shown")) && voipActivityV2.A0g.A0F) {
            if (callInfo.getConnectedParticipantsCount() != C18020vd.A00(C18040vf.A02, voipActivityV2.A0E, 3694)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A22(CallState callState, VoipActivityV2 voipActivityV2, boolean z) {
        if (voipActivityV2.A0W == null) {
            return false;
        }
        if (voipActivityV2.A2D && callState != CallState.LINK && (z || callState != CallState.RECEIVED_CALL)) {
            return false;
        }
        if (!C108995ce.A1a(voipActivityV2) || !voipActivityV2.A2D) {
            return true;
        }
        return false;
    }

    public static boolean A23(VoipActivityV2 voipActivityV2) {
        if (Build.VERSION.SDK_INT < 26 || !voipActivityV2.A08.A0P("android.software.picture_in_picture") || !voipActivityV2.A1u()) {
            return false;
        }
        return true;
    }

    public static boolean A24(VoipActivityV2 voipActivityV2) {
        A99 a99 = voipActivityV2.A0u;
        if (a99 == null || !"capi".equals(a99.A1B)) {
            return false;
        }
        return true;
    }

    public static boolean A25(VoipActivityV2 voipActivityV2) {
        return C40811vJ.A0b(voipActivityV2.A0E, voipActivityV2.A23);
    }

    public static boolean A29(VoipActivityV2 voipActivityV2, boolean z) {
        if (voipActivityV2.A0k == null || voipActivityV2.A1P.A01() != 0) {
            return false;
        }
        C1409273p.A02(voipActivityV2.A0k, false, z);
        CallArEffectsViewModel callArEffectsViewModel = voipActivityV2.A0b;
        if (callArEffectsViewModel != null) {
            callArEffectsViewModel.A0j(false);
        }
        C160968Au r0 = voipActivityV2.A0p;
        if (r0 == null) {
            return true;
        }
        r0.CJD(false);
        return true;
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A1q).A02((AnonymousClass1BI) null, 16);
    }

    public void A3h(int i) {
        ContactPickerFragment contactPickerFragment = this.A16;
        if (contactPickerFragment != null) {
            contactPickerFragment.A2P(i);
        }
    }

    public C18150vq A4b() {
        AnonymousClass00H r2 = this.A1u;
        r2.getClass();
        return C18150vq.A01(new C147087Rt(r2, 0));
    }

    public void A4c() {
        ContactPickerFragment contactPickerFragment = this.A16;
        if (contactPickerFragment != null) {
            contactPickerFragment.A2I();
        }
    }

    public void A4d(C192039nf r2) {
        ContactPickerFragment contactPickerFragment = this.A16;
        if (contactPickerFragment != null) {
            contactPickerFragment.A2J();
            ContactPickerFragment.A4K = false;
        }
    }

    public void A4l() {
        if (this.A0Q != null) {
            A4j("MessageDialogFragment");
            this.A0Q = null;
            this.A20 = null;
        }
        A4j("VoipErrorDialogFragment");
    }

    public /* synthetic */ void A4m(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            Rect A072 = AnonymousClass3MW.A07();
            this.A0e.getGlobalVisibleRect(A072);
            if (A23(this) && this.A00 == 3) {
                PictureInPictureParams.Builder builder = this.A02;
                C17960vV.A08(builder, "PiP Params Builder is null");
                builder.setSourceRectHint(A072);
                setPictureInPictureParams(this.A02.build());
            }
            CallGridViewModel callGridViewModel = this.A0g;
            boolean A1D2 = C108975cc.A1D(A072.width(), A072.height());
            C41111vp r1 = callGridViewModel.A0n;
            if (C72463Mc.A1O(r1) != A1D2) {
                AnonymousClass3MY.A1L(r1, A1D2);
                CallGridViewModel.A0E(callGridViewModel);
                CallGridViewModel.A0C(CallGridViewModel.A05(callGridViewModel), callGridViewModel, true);
            }
        }
    }

    public /* synthetic */ void A4n(Pair pair) {
        if (pair != null) {
            AnonymousClass4T4 r1 = (AnonymousClass4T4) pair.first;
            int A002 = C108965cb.A00(pair);
            AnonymousClass1VF r0 = this.A0c;
            AnonymousClass1VH r8 = AnonymousClass1VH.CALL_LINK;
            r0.A00(r8);
            A4j("MenuBottomSheet");
            if (A002 == 4) {
                String str = r1.A00;
                boolean z = r1.A01;
                C89404cP A052 = AnonymousClass4aR.A05(this, str, z);
                if (A052 != null) {
                    startActivity(AnonymousClass1LU.A1J(this, A052.A01));
                }
                this.A0x.A03(AnonymousClass74H.A02((String) null, 3, 5, z));
                A1h(this, 73, 3);
            } else if (A002 == 5) {
                this.A0c.A00(r8);
                String str2 = r1.A00;
                boolean z2 = r1.A01;
                C29551cT.A02(this.A05, this.A08, AnonymousClass74H.A07(str2, z2));
                this.A0x.A03(AnonymousClass74H.A02((String) null, 1, 5, z2));
            } else if (A002 == 6) {
                this.A0c.A00(r8);
                String str3 = r1.A00;
                boolean z3 = r1.A01;
                C89404cP A053 = AnonymousClass4aR.A05(this, str3, z3);
                if (Build.VERSION.SDK_INT < 22) {
                    this.A0x.A03(AnonymousClass74H.A02((String) null, 2, 5, z3));
                }
                if (A053 != null) {
                    this.A0c.A00(r8);
                    A1h(this, 73, 3);
                    startActivity(AnonymousClass74H.A00(this, A053.A01, A053.A00, 5, z3));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01a8, code lost:
        if (r13 != com.whatsapp.voipcalling.CallState.REJOINING) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r1 == 1) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0192, code lost:
        if (r1 == 1) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE4(com.whatsapp.voipcalling.CallInfo r12, com.whatsapp.voipcalling.CallState r13, boolean r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x000b
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged info == NULL finishing current activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0007:
            r11.finish()
        L_0x000a:
            return
        L_0x000b:
            com.whatsapp.voipcalling.CallState r2 = r11.A0V(r12)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r13 != r0) goto L_0x0026
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 == r0) goto L_0x001b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x0026
        L_0x001b:
            java.lang.String r0 = r12.callId
            r11.A21 = r0
            boolean r0 = r12.videoEnabled
            if (r0 == 0) goto L_0x0026
            r11.A0u()
        L_0x0026:
            java.lang.String r1 = r12.callId
            java.lang.String r0 = r11.A21
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged from "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " to "
            X.C17900vP.A0Y(r2, r0, r1)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r13 != r0) goto L_0x0048
            r11.A4l()
        L_0x0048:
            if (r2 != r0) goto L_0x024c
            r11.A1Y = r12
            androidx.fragment.app.DialogFragment r0 = r11.A0O
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "EndCallConfirmationDialogFragment"
            r11.A4j(r0)
            r0 = 0
            r11.A0O = r0
        L_0x0058:
            android.view.Window r1 = r11.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r1.clearFlags(r0)
            int r6 = r12.callResult
            r1 = 8
            r4 = 0
            r3 = 1
            if (r14 == 0) goto L_0x00da
            boolean r0 = r11.A2D
            if (r0 != 0) goto L_0x00b2
            com.whatsapp.calling.CallDetailsLayout r0 = r11.A0W
            r0.setVisibility(r4)
            X.1bI r0 = r11.A1X
            r0.A04(r1)
            boolean r0 = r12.videoEnabled
            if (r0 == 0) goto L_0x008f
            com.whatsapp.calling.CallDetailsLayout r6 = r11.A0W
            X.C17960vV.A05(r6)
            boolean r5 = r6.A06(r12)
            int r1 = r11.A00
            if (r1 == 0) goto L_0x008b
            r0 = 0
            if (r1 != r3) goto L_0x008c
        L_0x008b:
            r0 = 1
        L_0x008c:
            r6.A04(r2, r5, r0)
        L_0x008f:
            com.whatsapp.jid.GroupJid r2 = r12.groupJid
            if (r2 != 0) goto L_0x0097
            com.whatsapp.jid.UserJid r2 = r12.getPeerJid()
        L_0x0097:
            boolean r1 = r12.videoEnabled
            r0 = 27
            A1D(r2, r11, r0, r1)
        L_0x009e:
            X.2gu r1 = r12.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r3) goto L_0x00af
            java.lang.String r1 = r1.A04
            r11.A21 = r1
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A0g
            X.8yP r0 = r0.A0W
            r0.A0D(r1)
        L_0x00af:
            r11.A28 = r4
            return
        L_0x00b2:
            X.73p r5 = r11.A0k
            if (r5 == 0) goto L_0x008f
            com.whatsapp.calling.controls.view.CallControlCard r2 = r5.A03
            int r0 = r2.getVisibility()
            if (r0 == 0) goto L_0x00c3
            X.1bI r0 = r5.A06
            r0.A01()
        L_0x00c3:
            r2.setVisibility(r1)
            X.1bI r0 = r5.A05
            r0.A04(r1)
            X.1bI r0 = r5.A06
            r0.A04(r1)
            X.73p r0 = r11.A0k
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = r0.A04
            if (r0 == 0) goto L_0x008f
            r0.setVisibility(r4)
            goto L_0x008f
        L_0x00da:
            java.lang.String r5 = r11.A20
            if (r5 == 0) goto L_0x013a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE showing text: "
            X.C17900vP.A0f(r0, r5, r1)
            boolean r0 = r11.A2F
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r11.A20
            r11.A1p(r0)
            goto L_0x009e
        L_0x00f1:
            X.195 r0 = r11.A0S
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0103
            X.1KB r1 = r11.A05
            X.1FR r0 = r1.A00
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r11.A20
            r1.A0L(r0, r3)
            goto L_0x009e
        L_0x0103:
            X.A99 r5 = r11.A0u
            if (r5 == 0) goto L_0x0133
            java.lang.String r2 = r11.A20
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/showCallFailedMessage "
            X.C17900vP.A0f(r0, r2, r1)
            X.195 r0 = r5.A1w
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            android.content.Context r5 = r5.A1r
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r7 = 0
            r10 = r7
            r9 = r7
            android.content.Intent r1 = X.AnonymousClass1LU.A1H(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "showCallFailedMessage"
            r1.putExtra(r0, r2)
            r5.startActivity(r1)
            goto L_0x009e
        L_0x0133:
            java.lang.String r0 = "can not show call failed message because voice service is null."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x009e
        L_0x013a:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r5 = 10
            if (r13 != r0) goto L_0x0156
            if (r6 == r5) goto L_0x0146
            r0 = 25
            if (r6 != r0) goto L_0x0156
        L_0x0146:
            X.A99 r0 = r11.A0u
            if (r0 == 0) goto L_0x0156
            int r7 = r0.A43
            r0 = 26
            if (r7 != r0) goto L_0x0156
            r0 = 7
            r11.A10(r0)
            goto L_0x009e
        L_0x0156:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r13 == r0) goto L_0x016c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 == r0) goto L_0x016c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r13 == r0) goto L_0x016c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 == r0) goto L_0x016c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r13 != r0) goto L_0x0221
            if (r6 == r3) goto L_0x0221
        L_0x016c:
            boolean r0 = r11.A2g
            if (r0 != 0) goto L_0x0221
            X.A99 r0 = r11.A0u
            if (r0 == 0) goto L_0x0221
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE showing call failed screen, result="
            X.C17900vP.A0j(r0, r1, r6)
            boolean r0 = r12.videoEnabled
            if (r0 == 0) goto L_0x0198
            boolean r0 = r11.A2D
            if (r0 != 0) goto L_0x0198
            com.whatsapp.calling.CallDetailsLayout r8 = r11.A0W
            if (r8 == 0) goto L_0x0198
            boolean r7 = r8.A06(r12)
            int r1 = r11.A00
            if (r1 == 0) goto L_0x0194
            r0 = 0
            if (r1 != r3) goto L_0x0195
        L_0x0194:
            r0 = 1
        L_0x0195:
            r8.A04(r2, r7, r0)
        L_0x0198:
            r2 = 17
            r1 = 2
            if (r6 == r1) goto L_0x01c4
            if (r6 == r2) goto L_0x01c4
            r0 = 4
            if (r6 != r0) goto L_0x01be
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 == r0) goto L_0x01c4
        L_0x01a6:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 == r0) goto L_0x0247
        L_0x01aa:
            com.whatsapp.jid.GroupJid r1 = r12.groupJid
            if (r1 != 0) goto L_0x01b2
            com.whatsapp.jid.UserJid r1 = r12.getPeerJid()
        L_0x01b2:
            X.C17960vV.A07(r1)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            boolean r0 = r12.videoEnabled
            A1D(r1, r11, r6, r0)
            goto L_0x009e
        L_0x01be:
            if (r6 != r5) goto L_0x01a6
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 != r0) goto L_0x01a6
        L_0x01c4:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 != r0) goto L_0x020c
            boolean r0 = r12.isEndedByMe
            if (r0 != 0) goto L_0x0007
            r0 = 2131898169(0x7f122f39, float:1.9431248E38)
        L_0x01cf:
            java.lang.String r1 = r11.getString(r0)
        L_0x01d3:
            X.11C r0 = r11.A08
            X.AnonymousClass1Y5.A00(r11, r0, r1)
            android.view.View r0 = r11.A0B
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01ff
            r11.A4o(r1)
        L_0x01e3:
            X.10I r1 = r11.A05
            r0 = 15
            X.C146787Qp.A00(r1, r11, r0)
            android.os.Handler r0 = r11.A05
            r5 = 9
            r0.removeMessages(r5)
            if (r6 == r2) goto L_0x01aa
            r0 = 2
            if (r6 == r0) goto L_0x01aa
            android.os.Handler r2 = r11.A05
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.sendEmptyMessageDelayed(r5, r0)
            goto L_0x009e
        L_0x01ff:
            boolean r0 = r11.A2D
            if (r0 != 0) goto L_0x01e3
            com.whatsapp.calling.CallDetailsLayout r0 = r11.A0W
            X.C17960vV.A05(r0)
            r0.A05(r1, r1)
            goto L_0x01e3
        L_0x020c:
            if (r6 != r2) goto L_0x0212
            r0 = 2131898290(0x7f122fb2, float:1.9431494E38)
            goto L_0x01cf
        L_0x0212:
            if (r6 != r1) goto L_0x0218
            r0 = 2131898126(0x7f122f0e, float:1.943116E38)
            goto L_0x01cf
        L_0x0218:
            com.whatsapp.jid.UserJid r0 = X.C108955ca.A0T(r12)
            java.lang.String r1 = r11.A0d(r0, r6)
            goto L_0x01d3
        L_0x0221:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 != r0) goto L_0x0236
            boolean r0 = r12.isGroupCall
            if (r0 == 0) goto L_0x0236
            boolean r0 = r12.isEndedByMe
            if (r0 != 0) goto L_0x0236
            int r0 = r12.callResult
            if (r0 != r5) goto L_0x0236
            r11.A10(r1)
            goto L_0x009e
        L_0x0236:
            boolean r0 = r11.A2E
            if (r0 == 0) goto L_0x0242
            X.1KB r1 = r11.A05
            r0 = 2131898098(0x7f122ef2, float:1.9431104E38)
            r1.A08(r0, r3)
        L_0x0242:
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE finishing current activity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0247:
            r11.finish()
            goto L_0x009e
        L_0x024c:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x02a9
            boolean r0 = r12.videoEnabled
            if (r0 == 0) goto L_0x0261
            boolean r0 = r11.A2m
            if (r0 != 0) goto L_0x025c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r13 != r0) goto L_0x0261
        L_0x025c:
            X.AfC r0 = r11.A0z
            r0.A06()
        L_0x0261:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 != r0) goto L_0x026c
            X.8At r0 = r11.A0n
            if (r0 == 0) goto L_0x026c
            r0.CFn()
        L_0x026c:
            boolean r0 = X.AnonymousClass72U.A02(r2)
            if (r0 == 0) goto L_0x0291
            boolean r0 = r12.isGroupCall
            if (r0 == 0) goto L_0x0291
            boolean r0 = r11.A4k()
            if (r0 != 0) goto L_0x0291
            boolean r0 = X.C108995ce.A1a(r11)
            if (r0 == 0) goto L_0x0291
            X.0ve r2 = r11.A0E
            r1 = 9219(0x2403, float:1.2919E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0291
            r11.A0x()
        L_0x0291:
            com.whatsapp.voipcalling.CallState r0 = r12.callState
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x02a3;
                case 1: goto L_0x02a1;
                case 2: goto L_0x02a1;
                case 3: goto L_0x029f;
                case 4: goto L_0x02a1;
                case 5: goto L_0x02a1;
                case 6: goto L_0x02a1;
                case 7: goto L_0x029a;
                case 8: goto L_0x029a;
                case 9: goto L_0x029a;
                case 10: goto L_0x02a1;
                default: goto L_0x029a;
            }
        L_0x029a:
            r0 = 0
            A1N(r12, r11, r0)
            return
        L_0x029f:
            r0 = 2
            goto L_0x02a5
        L_0x02a1:
            r0 = 0
            goto L_0x02a5
        L_0x02a3:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02a5:
            r11.setVolumeControlStream(r0)
            goto L_0x029a
        L_0x02a9:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 != r0) goto L_0x02b7
            boolean r0 = r12.videoEnabled
            if (r0 == 0) goto L_0x026c
            X.AfC r0 = r11.A0z
            r0.A06()
            goto L_0x026c
        L_0x02b7:
            java.lang.String r1 = r12.callId
            java.lang.String r0 = r11.A22
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x026c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 != r0) goto L_0x026c
            r0 = 0
            r11.A22 = r0
            X.AfC r0 = r11.A0z
            r0.A05()
            goto L_0x026c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.BE4(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.CallState, boolean):void");
    }

    public C142977Bn BSZ() {
        C142977Bn r0 = this.A2b;
        if (r0 != null) {
            return r0;
        }
        C116575y5 r02 = new C116575y5(this, this);
        this.A2b = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        if (r3 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C5F(X.A99 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "voip/VoipActivityV2/onServiceConnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A0u = r9
            r9.A0s(r8)
            X.A99 r0 = r8.A0u
            r2 = 0
            r0.A1h = r2
            com.whatsapp.voipcalling.CallInfo r3 = A0Q(r8)
            if (r3 == 0) goto L_0x005c
            X.1Md r4 = r8.A0s
            java.lang.String r1 = r3.callId
            java.lang.String r0 = "voice_service_connected"
            r4.A03(r1, r0)
            X.1Md r4 = r8.A0s
            java.lang.String r1 = r3.callId
            r0 = 2
            r4.A04(r1, r0)
            boolean r0 = A24(r8)
            if (r0 == 0) goto L_0x004a
            X.0ve r0 = r8.A0E
            boolean r0 = X.C40811vJ.A0S(r0)
            if (r0 == 0) goto L_0x004a
            X.0ve r4 = r8.A0E
            r1 = 4455(0x1167, float:6.243E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x004a
            com.whatsapp.jid.UserJid r4 = r3.getPeerJid()
            X.10I r1 = r8.A05
            r0 = 4
            X.AnonymousClass7RN.A02(r1, r8, r4, r0)
        L_0x004a:
            boolean r0 = A23(r8)
            if (r0 != 0) goto L_0x005c
            X.6qE r0 = r3.self
            int r1 = r0.A08
            r0 = 2
            if (r1 != r0) goto L_0x005c
            X.A99 r0 = r8.A0u
            r0.A0g()
        L_0x005c:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r8.BE4(r3, r0, r2)
            X.A99 r4 = r8.A0u
            java.lang.String r0 = "voip/restoreProximitySensor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r4.A1I
            if (r0 == 0) goto L_0x007a
            r4.A1I = r2
            android.os.Handler r0 = r4.A0H
            r1 = 14
            r0.removeMessages(r1)
            android.os.Handler r0 = r4.A0H
            r0.sendEmptyMessage(r1)
        L_0x007a:
            X.A99 r1 = r8.A0u
            boolean r0 = r1.A1J
            if (r0 == 0) goto L_0x011a
            X.A99.A08(r1)
        L_0x0083:
            boolean r0 = r8.A2f
            if (r0 == 0) goto L_0x0117
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto L_0x0117
            if (r3 == 0) goto L_0x0124
            com.whatsapp.voipcalling.CallState r0 = r3.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r0)
            if (r0 == 0) goto L_0x00a6
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "call_ui_action"
            int r0 = r1.getIntExtra(r0, r2)
            A1e(r8, r0)
            r8.A2f = r2
        L_0x00a6:
            com.whatsapp.voipcalling.CallState r7 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 == r0) goto L_0x00b4
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r7 == r0) goto L_0x00b4
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 != r0) goto L_0x0124
        L_0x00b4:
            boolean r0 = r3.isCaller
            if (r0 != 0) goto L_0x0124
            boolean r0 = r3.isGroupCall
            if (r0 == 0) goto L_0x0124
            X.A99 r6 = r8.A0u
            long r4 = r6.A07
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00cc
            long r0 = java.lang.System.currentTimeMillis()
            r6.A07 = r0
        L_0x00cc:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 == r0) goto L_0x0124
            android.content.Intent r2 = r8.getIntent()
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = -1
            int r1 = r2.getIntExtra(r1, r0)
            if (r1 == r0) goto L_0x00e2
            X.A99 r0 = r8.A0u
            r0.A0l(r1)
        L_0x00e2:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0124
            java.util.HashSet r5 = X.C17880vN.A12()
            java.util.Map r0 = r3.participants
            java.util.Iterator r4 = X.C17890vO.A0l(r0)
        L_0x00f2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r2 = r4.next()
            X.6qE r2 = (X.C134216qE) r2
            boolean r0 = r2.A0M
            if (r0 != 0) goto L_0x00f2
            int r1 = r2.A04
            r0 = 1
            if (r1 != r0) goto L_0x00f2
            com.whatsapp.jid.UserJid r1 = r2.A0A
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            if (r1 == 0) goto L_0x0115
            com.whatsapp.jid.DeviceJid r0 = r1.getPrimaryDevice()
        L_0x0111:
            r5.add(r0)
            goto L_0x00f2
        L_0x0115:
            r0 = 0
            goto L_0x0111
        L_0x0117:
            if (r3 == 0) goto L_0x0124
            goto L_0x00a6
        L_0x011a:
            X.A99.A07(r1)
            goto L_0x0083
        L_0x011f:
            X.A99 r0 = r8.A0u
            r0.A16(r5)
        L_0x0124:
            X.8Au r1 = r8.A0p
            if (r1 == 0) goto L_0x012d
            X.A99 r0 = r8.A0u
            r1.CLR(r0)
        L_0x012d:
            X.0vp r0 = r8.A24
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x016a
            X.A99 r0 = r8.A0u
            X.E9o r2 = r0.A0S
            if (r2 == 0) goto L_0x014b
            if (r3 == 0) goto L_0x014b
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x014b
            java.lang.String r0 = "VoipActivityV2Voice service already has a glasses delegate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A1B(r2, r3, r8)
        L_0x014b:
            android.content.Intent r1 = r8.A03
            if (r1 == 0) goto L_0x0169
            android.content.Intent r0 = r8.getIntent()
            if (r1 != r0) goto L_0x0169
            android.content.Intent r1 = r8.A03
            java.lang.String r0 = "jid"
            java.util.ArrayList r1 = r1.getStringArrayListExtra(r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r0 = X.C22971Dz.A0A(r0, r1)
            A1k(r8, r0)
            r0 = 0
            r8.A03 = r0
        L_0x0169:
            return
        L_0x016a:
            android.view.View r0 = r8.A09
            if (r0 == 0) goto L_0x014b
            X.0zA r0 = r8.A0R
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x014b
            boolean r0 = r8.A2A
            if (r0 != 0) goto L_0x014b
            X.0ve r0 = r8.A0E
            boolean r0 = X.C40811vJ.A0T(r0)
            if (r0 == 0) goto L_0x014b
            r0 = 1
            r8.A2A = r0
            android.view.View r1 = r8.A09
            r0 = 2131435446(0x7f0b1fb6, float:1.8492734E38)
            android.view.View r1 = r1.findViewById(r0)
            r8.A0E = r1
            if (r1 != 0) goto L_0x0198
            java.lang.String r0 = "VoipActivityV2Side bar is null. Skipping setup glasses plug-in"
        L_0x0194:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x014b
        L_0x0198:
            r0 = 2131435445(0x7f0b1fb5, float:1.8492732E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 != 0) goto L_0x01a4
            java.lang.String r0 = "VoipActivityV2overlay stub is null. Skipping setup glasses plug-in"
            goto L_0x0194
        L_0x01a4:
            X.0zA r0 = r8.A0R
            java.lang.Object r2 = r0.A03()
            X.6je r2 = (X.C130566je) r2
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131169062(0x7f070f26, float:1.7952443E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r0 = 7
            X.7S6 r3 = new X.7S6
            r3.<init>(r8, r0)
            X.0ve r0 = r2.A04
            boolean r0 = X.C40811vJ.A0T(r0)
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "VoipGlassesManagerWrapperImpl.kt Checking FOA for MWA/SG presence."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r0 = r2.A06
            r6 = 21
            X.Aiu r1 = new X.Aiu
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGF(r1)
            goto L_0x014b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.C5F(X.A99):void");
    }

    public void CEC(int i) {
        Log.i("voip/VoipActivityV2/call/reject");
        CallInfo A0Q2 = A0Q(this);
        if (A0Q2 != null && A0Q2.callState != CallState.NONE) {
            C116075wM r1 = this.A0a;
            if (r1 != null) {
                r1.A05(true);
            }
            A99 a99 = this.A0u;
            if (a99 == null) {
                return;
            }
            if (Voip.A0A(A0Q2.callState)) {
                a99.A0m(0, i, A0Q2.callId, (String) null);
            } else if (A0Q2.isPeerRequestingUpgrade()) {
                this.A0u.A0k(0);
            }
        }
    }

    public void CRo(CallInfo callInfo) {
        if (callInfo.callId.equals(this.A21)) {
            this.A2C = false;
            this.A05.removeMessages(10);
            CallState callState = callInfo.callState;
            if (callState != CallState.NONE && !callInfo.callEnding) {
                if (A22(callState, this, callInfo.isGroupCall)) {
                    this.A0W.clearAnimation();
                }
                if (callInfo.isEitherSideRequestingUpgrade()) {
                    this.A28 = false;
                }
                A1s(callInfo.videoEnabled);
                A1L(callInfo, this);
                A1N(callInfo, this, 1);
            }
        }
    }

    public void finish() {
        if (this.A1Y != null) {
            CallInfo callInfo = this.A1Y;
            C18070vi.A0d(callInfo, 0);
            if (C61342pW.A00((C61342pW) this.A1e.get(), callInfo.getPeerJid(), callInfo.callDuration, callInfo.isCaller, callInfo.isGroupCall)) {
                C146787Qp.A00(this.A05, this, 21);
            }
        }
        Log.i("voip/VoipActivityV2/finish");
        super.finish();
        C138266wn r1 = (C138266wn) this.A1w.get();
        if (r1.A02 != null || r1.A00 != null || r1.A01 != null) {
            C138266wn.A00(r1);
        }
    }

    public Window getWindow() {
        Window A3U;
        if (this.A16 == null || (A3U = A3U("VoipContactPickerDialogFragment")) == null) {
            return super.getWindow();
        }
        return A3U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r2 = (X.AnonymousClass4aL) r3.A1i.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r3 = this;
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r3.A16
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.A2o()
            if (r0 != 0) goto L_0x000d
            A1S(r3)
        L_0x000d:
            return
        L_0x000e:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r3.A0g
            if (r2 == 0) goto L_0x0024
            X.1DT r1 = r2.A0M
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r1.A06()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0H(r2, r0)
            return
        L_0x0024:
            r0 = 1
            boolean r0 = A29(r3, r0)
            if (r0 != 0) goto L_0x000d
            boolean r0 = A23(r3)
            if (r0 == 0) goto L_0x003c
            com.whatsapp.voipcalling.CallInfo r0 = A0Q(r3)
            boolean r0 = A1y(r0, r3)
            if (r0 == 0) goto L_0x003c
            return
        L_0x003c:
            X.00H r0 = r3.A1w
            java.lang.Object r1 = r0.get()
            X.6wn r1 = (X.C138266wn) r1
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r1.A02 = r0
            X.1bI r0 = r3.A1R
            if (r0 == 0) goto L_0x0077
            int r0 = r0.A01()
            if (r0 != 0) goto L_0x0077
            X.00H r0 = r3.A1i
            java.lang.Object r2 = r0.get()
            X.4aL r2 = (X.AnonymousClass4aL) r2
            X.4Sa r1 = r2.A01
            if (r1 == 0) goto L_0x0077
            com.whatsapp.voipcalling.CallState r0 = r1.A0B
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r0)
            if (r0 != 0) goto L_0x0073
            int r1 = r1.A00
            r0 = 1
            if (r1 == r0) goto L_0x0073
            r0 = 2
            if (r1 == r0) goto L_0x0073
            r0 = 3
            if (r1 != r0) goto L_0x0077
        L_0x0073:
            r2.A05()
            return
        L_0x0077:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onBackPressed():void");
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [com.whatsapp.jid.GroupJid] */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.whatsapp.jid.GroupJid, X.1BI] */
    /* JADX WARNING: type inference failed for: r8v278, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0459, code lost:
        if (r12.startsWith("PD1818") == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0473, code lost:
        if (r9.equalsIgnoreCase("davinciin") == false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03eb, code lost:
        if (r12.equalsIgnoreCase("OP4A57") == false) goto L_0x03ed;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x04fa A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0530 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x05a4 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x05c8 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x05cd A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x05d7 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0692 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x06df A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0734 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0748 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x077f A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0780 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0817 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0927 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0943 A[Catch:{ IllegalStateException -> 0x0367, all -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x09e0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            super.onCreate(r1)
            boolean r1 = X.C39761tb.A01()
            if (r1 == 0) goto L_0x0016
            android.view.Window r2 = r0.getWindow()
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r2.clearFlags(r1)
        L_0x0016:
            X.0ve r2 = r0.A0E
            r1 = 1807(0x70f, float:2.532E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r17 = X.C18020vd.A05(r7, r2, r1)
            java.lang.String r18 = "VoipActivityV2"
            java.lang.String r16 = "VoipActivityV2_onCreate"
            if (r17 == 0) goto L_0x0034
            X.1Bd r2 = r0.A02     // Catch:{ all -> 0x0b9b }
            r1 = r18
            r2.A0A(r1)     // Catch:{ all -> 0x0b9b }
            X.1Bd r2 = r0.A02     // Catch:{ all -> 0x0b9b }
            r1 = r16
            r2.A09(r1)     // Catch:{ all -> 0x0b9b }
        L_0x0034:
            java.lang.String r6 = X.AnonymousClass6Z8.A00     // Catch:{ all -> 0x0b9b }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            boolean r1 = X.C17890vO.A1S(r1, r6)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x004b
            X.00H r1 = r0.A1x     // Catch:{ all -> 0x0b9b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0b9b }
            X.9sx r1 = (X.C195199sx) r1     // Catch:{ all -> 0x0b9b }
            r1.A00()     // Catch:{ all -> 0x0b9b }
        L_0x004b:
            r1 = 2131898097(0x7f122ef1, float:1.9431102E38)
            r0.setTitle(r1)     // Catch:{ all -> 0x0b9b }
            X.00H r1 = r0.A1k     // Catch:{ all -> 0x0b9b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0b9b }
            X.17P r1 = (X.AnonymousClass17P) r1     // Catch:{ all -> 0x0b9b }
            java.util.ArrayList r1 = r1.A00     // Catch:{ all -> 0x0b9b }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0b9b }
        L_0x005f:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0b9b }
            X.86g r1 = (X.C1598886g) r1     // Catch:{ all -> 0x0b9b }
            r1.BLH()     // Catch:{ all -> 0x0b9b }
            goto L_0x005f
        L_0x006f:
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = "call_id"
            java.lang.String r1 = r2.getStringExtra(r1)     // Catch:{ all -> 0x0b9b }
            r0.A21 = r1     // Catch:{ all -> 0x0b9b }
            com.whatsapp.voipcalling.CallInfo r5 = A0Q(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = r0.A21     // Catch:{ all -> 0x0b9b }
            if (r1 != 0) goto L_0x0089
            if (r5 == 0) goto L_0x0089
            java.lang.String r1 = r5.callId     // Catch:{ all -> 0x0b9b }
            r0.A21 = r1     // Catch:{ all -> 0x0b9b }
        L_0x0089:
            r11 = 4
            java.lang.String r9 = "lobbyEntryPoint"
            r3 = 0
            r2 = 1
            r1 = 0
            if (r5 == 0) goto L_0x09fc
            com.whatsapp.voipcalling.CallState r8 = r5.callState     // Catch:{ all -> 0x0b9b }
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.NONE     // Catch:{ all -> 0x0b9b }
            if (r8 == r4) goto L_0x09fc
            boolean r4 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            if (r4 == 0) goto L_0x00a7
            android.content.res.Resources$Theme r8 = r0.getTheme()     // Catch:{ all -> 0x0b9b }
            r4 = 2132084336(0x7f150670, float:1.980884E38)
            r8.applyStyle(r4, r2)     // Catch:{ all -> 0x0b9b }
        L_0x00a7:
            android.content.Intent r8 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            r4 = -1
            int r9 = r8.getIntExtra(r9, r4)     // Catch:{ all -> 0x0b9b }
            android.content.Intent r4 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            boolean r8 = X.C17890vO.A1S(r4, r6)     // Catch:{ all -> 0x0b9b }
            r10 = 27
            r4 = 2
            if (r8 != 0) goto L_0x00c7
            r8 = 7
            if (r9 == r8) goto L_0x00c7
            if (r9 == r4) goto L_0x00c7
            if (r9 == r2) goto L_0x00c7
            if (r9 == r10) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            X.1Md r9 = r0.A0s     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = r0.A21     // Catch:{ all -> 0x0b9b }
            r9.A01(r8)     // Catch:{ all -> 0x0b9b }
            goto L_0x00d8
        L_0x00cf:
            X.1Md r12 = r0.A0s     // Catch:{ all -> 0x0b9b }
            java.lang.String r9 = r0.A21     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "voipactivity_oncreate_start"
            r12.A03(r9, r8)     // Catch:{ all -> 0x0b9b }
        L_0x00d8:
            r0.A0E = r1     // Catch:{ all -> 0x0b9b }
            r0.A1r(r2)     // Catch:{ all -> 0x0b9b }
            android.view.Window r9 = r0.getWindow()     // Catch:{ all -> 0x0b9b }
            r8 = 2097152(0x200000, float:2.938736E-39)
            r9.addFlags(r8)     // Catch:{ all -> 0x0b9b }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0b9b }
            if (r8 < r10) goto L_0x00ed
            r0.setTurnScreenOn(r2)     // Catch:{ all -> 0x0b9b }
        L_0x00ed:
            r8 = 2131627478(0x7f0e0dd6, float:1.8882222E38)
            r0.setContentView((int) r8)     // Catch:{ all -> 0x0b9b }
            r8 = 2131428735(0x7f0b057f, float:1.8479123E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch:{ all -> 0x0b9b }
            r0.A09 = r8     // Catch:{ all -> 0x0b9b }
            r8 = 2131428729(0x7f0b0579, float:1.847911E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch:{ all -> 0x0b9b }
            r0.A08 = r8     // Catch:{ all -> 0x0b9b }
            r8 = 2131428645(0x7f0b0525, float:1.847894E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.WaImageView r8 = (com.whatsapp.WaImageView) r8     // Catch:{ all -> 0x0b9b }
            r0.A0T = r8     // Catch:{ all -> 0x0b9b }
            r13 = 43
            X.78L r8 = new X.78L     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r13)     // Catch:{ all -> 0x0b9b }
            r0.A2U = r8     // Catch:{ all -> 0x0b9b }
            boolean r8 = A25(r0)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x014f
            r8 = 2131428652(0x7f0b052c, float:1.8478955E38)
            X.1bI r8 = X.AnonymousClass3Ma.A0x(r0, r8)     // Catch:{ all -> 0x0b9b }
        L_0x0126:
            r0.A1R = r8     // Catch:{ all -> 0x0b9b }
            android.view.Window r8 = r0.getWindow()     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r8.getDecorView()     // Catch:{ all -> 0x0b9b }
            int r8 = r9.getSystemUiVisibility()     // Catch:{ all -> 0x0b9b }
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r9.setSystemUiVisibility(r8)     // Catch:{ all -> 0x0b9b }
            X.0ve r9 = r0.A0E     // Catch:{ all -> 0x0b9b }
            r8 = 7175(0x1c07, float:1.0054E-41)
            boolean r8 = X.C18020vd.A05(r7, r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A2D = r8     // Catch:{ all -> 0x0b9b }
            android.content.res.Resources r10 = r0.getResources()     // Catch:{ all -> 0x0b9b }
            boolean r9 = r0.A2D     // Catch:{ all -> 0x0b9b }
            r8 = 2131167211(0x7f0707eb, float:1.794869E38)
            if (r9 == 0) goto L_0x015a
            goto L_0x0157
        L_0x014f:
            r8 = 2131428653(0x7f0b052d, float:1.8478957E38)
            X.1bI r8 = X.AnonymousClass3Ma.A0x(r0, r8)     // Catch:{ all -> 0x0b9b }
            goto L_0x0126
        L_0x0157:
            r8 = 2131165621(0x7f0701b5, float:1.7945464E38)
        L_0x015a:
            int r8 = r10.getDimensionPixelSize(r8)     // Catch:{ all -> 0x0b9b }
            r0.A2Q = r8     // Catch:{ all -> 0x0b9b }
            android.content.res.Resources r9 = r0.getResources()     // Catch:{ all -> 0x0b9b }
            r8 = 2131165596(0x7f07019c, float:1.7945414E38)
            int r10 = r9.getDimensionPixelSize(r8)     // Catch:{ all -> 0x0b9b }
            android.content.res.Resources r9 = r0.getResources()     // Catch:{ all -> 0x0b9b }
            r8 = 2131165603(0x7f0701a3, float:1.7945428E38)
            int r8 = X.AnonymousClass3MX.A00(r9, r8, r10)     // Catch:{ all -> 0x0b9b }
            r0.A2N = r8     // Catch:{ all -> 0x0b9b }
            boolean r8 = r5.videoEnabled     // Catch:{ all -> 0x0b9b }
            boolean r8 = X.AnonymousClass000.A1O(r8)
            A1n(r0, r8)     // Catch:{ all -> 0x0b9b }
            boolean r8 = A23(r0)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x018e
            android.app.PictureInPictureParams$Builder r8 = new android.app.PictureInPictureParams$Builder     // Catch:{ all -> 0x0b9b }
            r8.<init>()     // Catch:{ all -> 0x0b9b }
            r0.A02 = r8     // Catch:{ all -> 0x0b9b }
        L_0x018e:
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel> r8 = com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel.class
            X.1J2 r8 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r8 = (com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel) r8     // Catch:{ all -> 0x0b9b }
            r0.A0h = r8     // Catch:{ all -> 0x0b9b }
            X.1DT r9 = r8.A03     // Catch:{ all -> 0x0b9b }
            r8 = 39
            X.C91614fy.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r8 = r0.A0h     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r8.A08     // Catch:{ all -> 0x0b9b }
            r14 = 42
            X.C91614fy.A00(r0, r8, r14)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r8 = r0.A0h     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A07     // Catch:{ all -> 0x0b9b }
            r8 = 7
            X.AnonymousClass7AM.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel> r8 = com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.class
            X.1J2 r8 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r8 = (com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel) r8     // Catch:{ all -> 0x0b9b }
            r0.A0i = r8     // Catch:{ all -> 0x0b9b }
            X.1DT r9 = r8.A07     // Catch:{ all -> 0x0b9b }
            r8 = 8
            X.AnonymousClass7AM.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            X.00H r8 = r0.A1h     // Catch:{ all -> 0x0b9b }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0b9b }
            X.9l5 r8 = (X.C190519l5) r8     // Catch:{ all -> 0x0b9b }
            boolean r8 = r8.A00()     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x0266
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.areffects.CallArEffectsViewModel> r8 = com.whatsapp.calling.areffects.CallArEffectsViewModel.class
            X.1J2 r8 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r8     // Catch:{ all -> 0x0b9b }
            r0.A0b = r8     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0H     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = X.C108945cZ.A0Q(r8)     // Catch:{ all -> 0x0b9b }
            r8 = 9
            X.AnonymousClass7AM.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = r0.A0b     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0F     // Catch:{ all -> 0x0b9b }
            java.lang.Object r10 = r8.getValue()     // Catch:{ all -> 0x0b9b }
            X.1wy r10 = (X.C41731wy) r10     // Catch:{ all -> 0x0b9b }
            r9 = 10
            X.7AM r8 = new X.7AM     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x0b9b }
            X.C18070vi.A0d(r10, r1)     // Catch:{ all -> 0x0b9b }
            r10.A09(r0)     // Catch:{ all -> 0x0b9b }
            r10.A0A(r0, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = r0.A0b     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0I     // Catch:{ all -> 0x0b9b }
            java.lang.Object r10 = r8.getValue()     // Catch:{ all -> 0x0b9b }
            X.1wy r10 = (X.C41731wy) r10     // Catch:{ all -> 0x0b9b }
            r9 = 28
            X.7AP r8 = new X.7AP     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x0b9b }
            X.C18070vi.A0d(r10, r1)     // Catch:{ all -> 0x0b9b }
            r10.A09(r0)     // Catch:{ all -> 0x0b9b }
            r10.A0A(r0, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = r0.A0b     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0D     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = X.C108945cZ.A0Q(r8)     // Catch:{ all -> 0x0b9b }
            r8 = 29
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = r0.A0b     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0G     // Catch:{ all -> 0x0b9b }
            X.1DS r8 = X.C108945cZ.A0Q(r8)     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AP.A00(r0, r8, r13)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = r0.A0b     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0E     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = X.C108945cZ.A0Q(r8)     // Catch:{ all -> 0x0b9b }
            r8 = 45
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            X.00H r8 = r0.A1h     // Catch:{ all -> 0x0b9b }
            java.lang.Object r9 = r8.get()     // Catch:{ all -> 0x0b9b }
            X.9l5 r9 = (X.C190519l5) r9     // Catch:{ all -> 0x0b9b }
            boolean r8 = r5.videoEnabled     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x025f
            X.0ve r9 = r9.A00     // Catch:{ all -> 0x0b9b }
            r8 = 11157(0x2b95, float:1.5634E-41)
            boolean r8 = X.C18020vd.A05(r7, r9, r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0266
        L_0x025f:
            com.whatsapp.calling.areffects.CallArEffectsViewModel r9 = r0.A0b     // Catch:{ all -> 0x0b9b }
            X.0wl r8 = r9.A0J     // Catch:{ all -> 0x0b9b }
            r9.A0i(r8)     // Catch:{ all -> 0x0b9b }
        L_0x0266:
            android.view.View r9 = r0.A09     // Catch:{ all -> 0x0b9b }
            r8 = 2131428677(0x7f0b0545, float:1.8479005E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.view.CallGrid r8 = (com.whatsapp.calling.callgrid.view.CallGrid) r8     // Catch:{ all -> 0x0b9b }
            r0.A0e = r8     // Catch:{ all -> 0x0b9b }
            X.1Fv r9 = r0.getLifecycle()     // Catch:{ all -> 0x0b9b }
            X.1GC r8 = r8.A0h     // Catch:{ all -> 0x0b9b }
            r9.A05(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.view.CallGrid r9 = r0.A0e     // Catch:{ all -> 0x0b9b }
            r8 = 22
            X.C1420978d.A00(r9, r0, r8)     // Catch:{ all -> 0x0b9b }
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel> r8 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.class
            X.1J2 r8 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r8     // Catch:{ all -> 0x0b9b }
            r0.A0g = r8     // Catch:{ all -> 0x0b9b }
            java.lang.String r9 = r0.A21     // Catch:{ all -> 0x0b9b }
            X.8yP r8 = r8.A0W     // Catch:{ all -> 0x0b9b }
            r8.A0D(r9)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r12 = r0.A0g     // Catch:{ all -> 0x0b9b }
            android.util.DisplayMetrics r8 = X.C108965cb.A08(r0)     // Catch:{ all -> 0x0b9b }
            int r10 = r8.widthPixels     // Catch:{ all -> 0x0b9b }
            int r9 = r8.heightPixels     // Catch:{ all -> 0x0b9b }
            android.util.Rational r8 = new android.util.Rational     // Catch:{ all -> 0x0b9b }
            r8.<init>(r10, r9)     // Catch:{ all -> 0x0b9b }
            r12.A0Y(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1DT r9 = r8.A0M     // Catch:{ all -> 0x0b9b }
            r8 = 44
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1DT r8 = r8.A0O     // Catch:{ all -> 0x0b9b }
            r10 = 40
            X.C91614fy.A00(r0, r8, r10)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r8.A10     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AM.A00(r0, r8, r11)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1vp r9 = r8.A0r     // Catch:{ all -> 0x0b9b }
            r8 = 11
            X.AnonymousClass7AM.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A0z     // Catch:{ all -> 0x0b9b }
            r8 = 30
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1DT r9 = r8.A0N     // Catch:{ all -> 0x0b9b }
            r8 = 31
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A0y     // Catch:{ all -> 0x0b9b }
            r8 = 36
            X.C91614fy.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1DT r9 = r8.A0S     // Catch:{ all -> 0x0b9b }
            r8 = 32
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A11     // Catch:{ all -> 0x0b9b }
            r8 = 33
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.1DT r8 = r8.A0P     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AP.A00(r0, r8, r14)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callgrid.view.CallGrid r9 = r0.A0e     // Catch:{ all -> 0x0b9b }
            X.7DI r8 = new X.7DI     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0)     // Catch:{ all -> 0x0b9b }
            r9.A05 = r8     // Catch:{ all -> 0x0b9b }
            X.8Ag r8 = r0.A0m     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = r8.BO1()     // Catch:{ all -> 0x0b9b }
            r8 = 46
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel> r8 = com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel.class
            X.1J2 r8 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r8 = (com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel) r8     // Catch:{ all -> 0x0b9b }
            r0.A0r = r8     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A0I     // Catch:{ all -> 0x0b9b }
            r8 = 37
            X.C91614fy.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r8 = r0.A0r     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A0G     // Catch:{ all -> 0x0b9b }
            r8 = 38
            X.C91614fy.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r8 = r0.A0r     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r8.A0H     // Catch:{ all -> 0x0b9b }
            X.C91614fy.A00(r0, r8, r10)     // Catch:{ all -> 0x0b9b }
            X.1DC r8 = r0.A1O     // Catch:{ all -> 0x0b9b }
            boolean r8 = r8.Bfb()     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x0396
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.screenshare.ScreenShareViewModel> r8 = com.whatsapp.calling.screenshare.ScreenShareViewModel.class
            X.1J2 r15 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r15 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r15     // Catch:{ all -> 0x0b9b }
            r0.A0t = r15     // Catch:{ all -> 0x0b9b }
            X.01M r14 = r0.A04     // Catch:{ all -> 0x0b9b }
            X.C18070vi.A0d(r14, r2)     // Catch:{ all -> 0x0b9b }
            java.lang.String r9 = "screen_sharing_req"
            X.02i r8 = new X.02i     // Catch:{ IllegalStateException -> 0x0367 }
            r8.<init>()     // Catch:{ IllegalStateException -> 0x0367 }
            X.79c r12 = new X.79c     // Catch:{ IllegalStateException -> 0x0367 }
            r12.<init>(r15, r4)     // Catch:{ IllegalStateException -> 0x0367 }
            X.05q r8 = r14.A03(r12, r8, r0, r9)     // Catch:{ IllegalStateException -> 0x0367 }
            r15.A02 = r8     // Catch:{ IllegalStateException -> 0x0367 }
            goto L_0x036d
        L_0x0367:
            r9 = move-exception
            java.lang.String r8 = "registerForActivityResult must be called before Activity is in STARTED state"
            X.C17960vV.A09(r8, r9)     // Catch:{ all -> 0x0b9b }
        L_0x036d:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r8 = r0.A0t     // Catch:{ all -> 0x0b9b }
            X.1vp r9 = r8.A0A     // Catch:{ all -> 0x0b9b }
            r8 = 47
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r8 = r0.A0t     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A0B     // Catch:{ all -> 0x0b9b }
            r8 = 48
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r8 = r0.A0t     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A0D     // Catch:{ all -> 0x0b9b }
            r8 = 49
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r8 = r0.A0t     // Catch:{ all -> 0x0b9b }
            X.1vp r8 = r8.A09     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AM.A00(r0, r8, r1)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r8 = r0.A0t     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r8.A0C     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AM.A00(r0, r8, r2)     // Catch:{ all -> 0x0b9b }
        L_0x0396:
            X.1It r9 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel> r8 = com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel.class
            X.1J2 r8 = r9.A00(r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel r8 = (com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel) r8     // Catch:{ all -> 0x0b9b }
            r0.A2c = r8     // Catch:{ all -> 0x0b9b }
            android.view.Window r8 = r0.getWindow()     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r8.getDecorView()     // Catch:{ all -> 0x0b9b }
            android.graphics.Rect r8 = X.AnonymousClass3MW.A07()     // Catch:{ all -> 0x0b9b }
            r9.getWindowVisibleDisplayFrame(r8)     // Catch:{ all -> 0x0b9b }
            boolean r8 = r5.isCaller     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0477
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "asus"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x03cb
            java.lang.String r12 = android.os.Build.DEVICE     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "ASUS_I01WD"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
        L_0x03cb:
            java.lang.String r8 = "oppo"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x03ed
            java.lang.String r12 = android.os.Build.DEVICE     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "OP4863"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "OP4B65L1"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "OP4A57"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
        L_0x03ed:
            java.lang.String r8 = "Realme"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x03ff
            java.lang.String r12 = android.os.Build.DEVICE     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "RMX1901"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
        L_0x03ff:
            java.lang.String r8 = "samsung"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x0411
            java.lang.String r12 = android.os.Build.MODEL     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "r1q"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
        L_0x0411:
            java.lang.String r8 = "vivo"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x045b
            java.lang.String r12 = android.os.Build.DEVICE     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "1805"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "PD1805"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "1909"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "1910"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "1910N"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "1819"
            boolean r8 = r12.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "1818"
            boolean r8 = r12.startsWith(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "PD1818"
            boolean r8 = r12.startsWith(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
        L_0x045b:
            java.lang.String r8 = "Xiaomi"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x0477
            java.lang.String r9 = android.os.Build.DEVICE     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = "raphaelin"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0475
            java.lang.String r8 = "davinciin"
            boolean r8 = r9.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x0477
        L_0x0475:
            r8 = 1
            goto L_0x0478
        L_0x0477:
            r8 = 0
        L_0x0478:
            r0.A2m = r8     // Catch:{ all -> 0x0b9b }
            r8 = 2131428953(0x7f0b0659, float:1.8479565E38)
            android.view.View r9 = r0.findViewById(r8)     // Catch:{ all -> 0x0b9b }
            r0.A0B = r9     // Catch:{ all -> 0x0b9b }
            r8 = 2131428954(0x7f0b065a, float:1.8479567E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A0J = r8     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r0.A0B     // Catch:{ all -> 0x0b9b }
            r8 = 2131428952(0x7f0b0658, float:1.8479563E38)
            android.view.View r8 = r9.findViewById(r8)     // Catch:{ all -> 0x0b9b }
            r0.A0A = r8     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r0.A0B     // Catch:{ all -> 0x0b9b }
            r8 = 2131428951(0x7f0b0657, float:1.847956E38)
            com.whatsapp.WaTextView r8 = X.AnonymousClass3MW.A0U(r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A0U = r8     // Catch:{ all -> 0x0b9b }
            X.C43421zm.A04(r8)     // Catch:{ all -> 0x0b9b }
            r8 = 2131233562(0x7f080b1a, float:1.8083265E38)
            android.graphics.drawable.Drawable r8 = X.C24261Jm.A00(r0, r8)     // Catch:{ all -> 0x0b9b }
            r0.A04 = r8     // Catch:{ all -> 0x0b9b }
            r9 = 44
            X.78L r8 = new X.78L     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x0b9b }
            r0.A07 = r8     // Catch:{ all -> 0x0b9b }
            r9 = 45
            X.78L r8 = new X.78L     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x0b9b }
            r0.A2V = r8     // Catch:{ all -> 0x0b9b }
            r8 = 2131428671(0x7f0b053f, float:1.8478993E38)
            X.1bI r8 = X.C72453Mb.A0r(r0, r8)     // Catch:{ all -> 0x0b9b }
            r0.A1S = r8     // Catch:{ all -> 0x0b9b }
            com.whatsapp.voipcalling.CallState r9 = r5.callState     // Catch:{ all -> 0x0b9b }
            boolean r12 = r5.isGroupCall     // Catch:{ all -> 0x0b9b }
            boolean r8 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x04db
            com.whatsapp.voipcalling.CallState r8 = com.whatsapp.voipcalling.CallState.LINK     // Catch:{ all -> 0x0b9b }
            if (r9 == r8) goto L_0x04db
            if (r12 != 0) goto L_0x04f6
            com.whatsapp.voipcalling.CallState r8 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL     // Catch:{ all -> 0x0b9b }
            if (r9 != r8) goto L_0x04f6
        L_0x04db:
            boolean r8 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x04e5
            boolean r8 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x04f6
        L_0x04e5:
            X.1bI r8 = r0.A1S     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r8.A02()     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.CallDetailsLayout r9 = (com.whatsapp.calling.CallDetailsLayout) r9     // Catch:{ all -> 0x0b9b }
            r0.A0W = r9     // Catch:{ all -> 0x0b9b }
            X.6bS r8 = r0.A0X     // Catch:{ all -> 0x0b9b }
            int r8 = r8.A00     // Catch:{ all -> 0x0b9b }
            r9.setPadding(r1, r8, r1, r1)     // Catch:{ all -> 0x0b9b }
        L_0x04f6:
            boolean r8 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x052a
            r8 = 2131428730(0x7f0b057a, float:1.8479113E38)
            android.view.View r8 = X.C110885hR.A0A(r0, r8)     // Catch:{ all -> 0x0b9b }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x0b9b }
            r8.inflate()     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.header.CallHeaderStateHolder r8 = X.C108955ca.A0L(r0)     // Catch:{ all -> 0x0b9b }
            X.4YS r12 = r8.A08     // Catch:{ all -> 0x0b9b }
            r9 = 8
            X.7S6 r8 = new X.7S6     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x0b9b }
            r12.A00(r0, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.header.CallHeaderStateHolder r8 = X.C108955ca.A0L(r0)     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = r8.A06     // Catch:{ all -> 0x0b9b }
            r8 = 33
            X.AnonymousClass7AP.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.header.CallHeaderStateHolder r8 = X.C108955ca.A0L(r0)     // Catch:{ all -> 0x0b9b }
            X.1DS r8 = r8.A05     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AM.A00(r0, r8, r4)     // Catch:{ all -> 0x0b9b }
        L_0x052a:
            boolean r8 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x05cd
            X.00H r8 = r0.A1i     // Catch:{ all -> 0x0b9b }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0b9b }
            X.4aL r8 = (X.AnonymousClass4aL) r8     // Catch:{ all -> 0x0b9b }
            X.0vl r8 = r8.A0E     // Catch:{ all -> 0x0b9b }
            java.lang.Object r12 = r8.getValue()     // Catch:{ all -> 0x0b9b }
            X.4YS r12 = (X.AnonymousClass4YS) r12     // Catch:{ all -> 0x0b9b }
            r9 = 10
            X.7S8 r8 = new X.7S8     // Catch:{ all -> 0x0b9b }
            r8.<init>(r5, r0, r9)     // Catch:{ all -> 0x0b9b }
            r12.A00(r0, r8)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r9 = r0.A0r     // Catch:{ all -> 0x0b9b }
            X.6lg r8 = r0.A1a     // Catch:{ all -> 0x0b9b }
            if (r8 != 0) goto L_0x0557
            X.6lg r8 = new X.6lg     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0)     // Catch:{ all -> 0x0b9b }
            r0.A1a = r8     // Catch:{ all -> 0x0b9b }
        L_0x0557:
            r9.A00 = r8     // Catch:{ all -> 0x0b9b }
            X.00H r8 = r0.A1p     // Catch:{ all -> 0x0b9b }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0b9b }
            X.4RC r8 = (X.AnonymousClass4RC) r8     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = r8.A03     // Catch:{ all -> 0x0b9b }
            r8 = 41
            X.C91614fy.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
            boolean r8 = A25(r0)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x057c
            X.00H r8 = r0.A1n     // Catch:{ all -> 0x0b9b }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0b9b }
            X.6kZ r8 = (X.C131136kZ) r8     // Catch:{ all -> 0x0b9b }
            X.1wy r9 = r8.A08     // Catch:{ all -> 0x0b9b }
            r8 = 3
            X.AnonymousClass7AM.A00(r0, r9, r8)     // Catch:{ all -> 0x0b9b }
        L_0x057c:
            android.view.View r9 = r0.A09     // Catch:{ all -> 0x0b9b }
            r8 = 2131431587(0x7f0b10a3, float:1.8484907E38)
            X.1bI r8 = X.C28931bI.A00(r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A1V = r8     // Catch:{ all -> 0x0b9b }
            X.0ve r9 = r0.A0E     // Catch:{ all -> 0x0b9b }
            X.00H r8 = r0.A1y     // Catch:{ all -> 0x0b9b }
            r8.get()     // Catch:{ all -> 0x0b9b }
            X.C40811vJ.A0B(r9)     // Catch:{ all -> 0x0b9b }
            r8 = 2131435361(0x7f0b1f61, float:1.8492562E38)
            X.1bI r8 = X.C72453Mb.A0r(r0, r8)     // Catch:{ all -> 0x0b9b }
            r0.A1W = r8     // Catch:{ all -> 0x0b9b }
            X.0ve r9 = r0.A0E     // Catch:{ all -> 0x0b9b }
            r8 = 10631(0x2987, float:1.4897E-41)
            boolean r8 = X.C18020vd.A05(r7, r9, r8)     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x05ae
            X.1bI r9 = r0.A1W     // Catch:{ all -> 0x0b9b }
            X.6LG r8 = new X.6LG     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r13)     // Catch:{ all -> 0x0b9b }
            r9.A05(r8)     // Catch:{ all -> 0x0b9b }
        L_0x05ae:
            android.view.View r9 = r0.A09     // Catch:{ all -> 0x0b9b }
            r8 = 2131436292(0x7f0b2304, float:1.849445E38)
            X.1bI r8 = X.C28931bI.A00(r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A1X = r8     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r0.A09     // Catch:{ all -> 0x0b9b }
            r8 = 2131428734(0x7f0b057e, float:1.847912E38)
            X.1bI r9 = X.C28931bI.A00(r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A1T = r9     // Catch:{ all -> 0x0b9b }
            boolean r8 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x05d7
            r9.A04(r1)     // Catch:{ all -> 0x0b9b }
            goto L_0x0690
        L_0x05cd:
            r8 = 2131436748(0x7f0b24cc, float:1.8495375E38)
            X.1bI r8 = X.AnonymousClass3Ma.A0x(r0, r8)     // Catch:{ all -> 0x0b9b }
            r0.A2e = r8     // Catch:{ all -> 0x0b9b }
            goto L_0x057c
        L_0x05d7:
            X.1bI r8 = r0.A1X     // Catch:{ all -> 0x0b9b }
            r8.A04(r1)     // Catch:{ all -> 0x0b9b }
            r8 = 2131430236(0x7f0b0b5c, float:1.8482167E38)
            android.widget.TextView r8 = X.AnonymousClass3MX.A0L(r0, r8)     // Catch:{ all -> 0x0b9b }
            r0.A0K = r8     // Catch:{ all -> 0x0b9b }
            r8 = 2131430238(0x7f0b0b5e, float:1.8482171E38)
            android.widget.ImageView r8 = X.AnonymousClass3MX.A0I(r0, r8)     // Catch:{ all -> 0x0b9b }
            r0.A2W = r8     // Catch:{ all -> 0x0b9b }
            r8 = 2131430232(0x7f0b0b58, float:1.848216E38)
            android.view.View r9 = r0.findViewById(r8)     // Catch:{ all -> 0x0b9b }
            r0.A0C = r9     // Catch:{ all -> 0x0b9b }
            r8 = 27
            X.AnonymousClass78M.A00(r9, r0, r5, r8)     // Catch:{ all -> 0x0b9b }
            android.view.View r9 = r0.A0C     // Catch:{ all -> 0x0b9b }
            boolean r8 = r5.videoEnabled     // Catch:{ all -> 0x0b9b }
            if (r8 == 0) goto L_0x0612
            r8 = 2131898150(0x7f122f26, float:1.943121E38)
            java.lang.String r12 = r0.getString(r8)     // Catch:{ all -> 0x0b9b }
        L_0x0609:
            X.0ve r13 = r0.A0E     // Catch:{ all -> 0x0b9b }
            r8 = 2541(0x9ed, float:3.56E-42)
            boolean r8 = X.C18020vd.A05(r7, r13, r8)     // Catch:{ all -> 0x0b9b }
            goto L_0x061a
        L_0x0612:
            r8 = 2131898152(0x7f122f28, float:1.9431214E38)
            java.lang.String r12 = r0.getString(r8)     // Catch:{ all -> 0x0b9b }
            goto L_0x0609
        L_0x061a:
            if (r8 == 0) goto L_0x0623
            r3 = 2131898149(0x7f122f25, float:1.9431208E38)
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0b9b }
        L_0x0623:
            X.AnonymousClass4aR.A08(r9, r12, r3, r2)     // Catch:{ all -> 0x0b9b }
            android.view.View r8 = r0.A09     // Catch:{ all -> 0x0b9b }
            r3 = 2131436303(0x7f0b230f, float:1.8494473E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r8, r3)     // Catch:{ all -> 0x0b9b }
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3     // Catch:{ all -> 0x0b9b }
            r0.A0H = r3     // Catch:{ all -> 0x0b9b }
            android.view.View r8 = r0.A09     // Catch:{ all -> 0x0b9b }
            r3 = 2131436289(0x7f0b2301, float:1.8494444E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MW.A0C(r8, r3)     // Catch:{ all -> 0x0b9b }
            r0.A0G = r3     // Catch:{ all -> 0x0b9b }
            android.view.View r8 = r0.A09     // Catch:{ all -> 0x0b9b }
            r3 = 2131427626(0x7f0b012a, float:1.8476874E38)
            android.widget.ImageView r3 = X.AnonymousClass3MW.A0G(r8, r3)     // Catch:{ all -> 0x0b9b }
            r0.A0I = r3     // Catch:{ all -> 0x0b9b }
            android.view.View r8 = r0.A09     // Catch:{ all -> 0x0b9b }
            r3 = 2131427625(0x7f0b0129, float:1.8476872E38)
            android.widget.TextView r3 = X.AnonymousClass3MW.A0J(r8, r3)     // Catch:{ all -> 0x0b9b }
            r0.A0L = r3     // Catch:{ all -> 0x0b9b }
            X.118 r3 = r0.A1A     // Catch:{ all -> 0x0b9b }
            android.content.res.Resources r8 = X.AnonymousClass3MW.A05(r3)     // Catch:{ all -> 0x0b9b }
            r3 = 2131169533(0x7f0710fd, float:1.7953399E38)
            int r8 = r8.getDimensionPixelSize(r3)     // Catch:{ all -> 0x0b9b }
            android.widget.ImageView r3 = r0.A0I     // Catch:{ all -> 0x0b9b }
            r3.setPadding(r1, r8, r1, r8)     // Catch:{ all -> 0x0b9b }
            android.widget.ImageButton r8 = r0.A0H     // Catch:{ all -> 0x0b9b }
            android.view.View$OnClickListener r3 = r0.A2o     // Catch:{ all -> 0x0b9b }
            r8.setOnClickListener(r3)     // Catch:{ all -> 0x0b9b }
            android.widget.ImageButton r9 = r0.A0H     // Catch:{ all -> 0x0b9b }
            r3 = 2131898204(0x7f122f5c, float:1.943132E38)
            java.lang.String r8 = r0.getString(r3)     // Catch:{ all -> 0x0b9b }
            r3 = 2131898203(0x7f122f5b, float:1.9431317E38)
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass4aR.A08(r9, r8, r3, r2)     // Catch:{ all -> 0x0b9b }
            android.view.ViewGroup r8 = r0.A0G     // Catch:{ all -> 0x0b9b }
            r3 = 46
            X.AnonymousClass78L.A00(r8, r0, r3)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.jid.GroupJid r3 = r5.groupJid     // Catch:{ all -> 0x0b9b }
            boolean r3 = X.AnonymousClass000.A1W(r3)
            r0.A1t(r3)     // Catch:{ all -> 0x0b9b }
        L_0x0690:
            if (r17 == 0) goto L_0x06aa
            X.1Bd r12 = r0.A02     // Catch:{ all -> 0x0b9b }
            boolean r3 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x0779
            X.1bI r3 = r0.A1T     // Catch:{ all -> 0x0b9b }
        L_0x069a:
            android.view.View r9 = r3.A02()     // Catch:{ all -> 0x0b9b }
            r3 = 22
            X.7Qp r8 = new X.7Qp     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r3)     // Catch:{ all -> 0x0b9b }
            r3 = r18
            r12.A05(r9, r8, r3, r11)     // Catch:{ all -> 0x0b9b }
        L_0x06aa:
            r3 = 2131427846(0x7f0b0206, float:1.847732E38)
            X.1bI r3 = X.C72453Mb.A0r(r0, r3)     // Catch:{ all -> 0x0b9b }
            r0.A1Q = r3     // Catch:{ all -> 0x0b9b }
            r3 = 2131427842(0x7f0b0202, float:1.8477312E38)
            X.1bI r3 = X.C72453Mb.A0r(r0, r3)     // Catch:{ all -> 0x0b9b }
            r0.A1P = r3     // Catch:{ all -> 0x0b9b }
            r3 = 2131430911(0x7f0b0dff, float:1.8483536E38)
            X.1bI r3 = X.C72453Mb.A0r(r0, r3)     // Catch:{ all -> 0x0b9b }
            r0.A2d = r3     // Catch:{ all -> 0x0b9b }
            r3 = 2131430910(0x7f0b0dfe, float:1.8483534E38)
            X.1bI r3 = X.C72453Mb.A0r(r0, r3)     // Catch:{ all -> 0x0b9b }
            r0.A1U = r3     // Catch:{ all -> 0x0b9b }
            boolean r3 = r5.videoEnabled     // Catch:{ all -> 0x0b9b }
            r0.A1s(r3)     // Catch:{ all -> 0x0b9b }
            X.0ve r9 = r0.A0E     // Catch:{ all -> 0x0b9b }
            X.0vf r8 = X.C18040vf.A01     // Catch:{ all -> 0x0b9b }
            r3 = 9899(0x26ab, float:1.3871E-41)
            boolean r3 = X.C18020vd.A05(r8, r9, r3)     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x0748
            X.1It r8 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2> r3 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2.class
            X.1J2 r3 = r8.A00(r3)     // Catch:{ all -> 0x0b9b }
            X.8Au r3 = (X.C160968Au) r3     // Catch:{ all -> 0x0b9b }
            r0.A0p = r3     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r3 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r3     // Catch:{ all -> 0x0b9b }
            X.0vl r3 = r3.A0J     // Catch:{ all -> 0x0b9b }
            X.1DS r9 = X.C108945cZ.A0Q(r3)     // Catch:{ all -> 0x0b9b }
            r8 = 36
            X.7AP r3 = new X.7AP     // Catch:{ all -> 0x0b9b }
            r3.<init>(r0, r8)     // Catch:{ all -> 0x0b9b }
        L_0x06fc:
            r9.A0A(r0, r3)     // Catch:{ all -> 0x0b9b }
        L_0x06ff:
            X.8Au r8 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.A99 r3 = r0.A0u     // Catch:{ all -> 0x0b9b }
            r8.CLR(r3)     // Catch:{ all -> 0x0b9b }
            X.8Au r3 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r3.BWL()     // Catch:{ all -> 0x0b9b }
            r3 = 37
            X.AnonymousClass7AP.A00(r0, r8, r3)     // Catch:{ all -> 0x0b9b }
            X.8Au r3 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r3.BST()     // Catch:{ all -> 0x0b9b }
            r3 = 38
            X.AnonymousClass7AP.A00(r0, r8, r3)     // Catch:{ all -> 0x0b9b }
            X.8Au r3 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r3.BVK()     // Catch:{ all -> 0x0b9b }
            r3 = 39
            X.AnonymousClass7AP.A00(r0, r8, r3)     // Catch:{ all -> 0x0b9b }
            X.8Au r3 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.1wy r3 = r3.BSA()     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AP.A00(r0, r3, r10)     // Catch:{ all -> 0x0b9b }
            boolean r3 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x0743
            X.8Au r8 = r0.A0p     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.header.CallHeaderStateHolder r3 = X.C108955ca.A0L(r0)     // Catch:{ all -> 0x0b9b }
            X.1DS r3 = r3.A05     // Catch:{ all -> 0x0b9b }
            boolean r3 = X.C72463Mc.A1O(r3)     // Catch:{ all -> 0x0b9b }
            r8.CJG(r3)     // Catch:{ all -> 0x0b9b }
        L_0x0743:
            boolean r3 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            goto L_0x077d
        L_0x0748:
            X.1It r8 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel> r3 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel.class
            X.1J2 r9 = r8.A00(r3)     // Catch:{ all -> 0x0b9b }
            X.8Au r9 = (X.C160968Au) r9     // Catch:{ all -> 0x0b9b }
            r0.A0p = r9     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel r9 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel) r9     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r9.A0B     // Catch:{ all -> 0x0b9b }
            r3 = 27
            X.AnonymousClass7AP.A00(r0, r8, r3)     // Catch:{ all -> 0x0b9b }
            boolean r3 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            if (r3 != 0) goto L_0x06ff
            X.0ve r8 = r0.A0E     // Catch:{ all -> 0x0b9b }
            r3 = 8207(0x200f, float:1.15E-41)
            int r3 = X.C18020vd.A00(r7, r8, r3)     // Catch:{ all -> 0x0b9b }
            if (r3 < r4) goto L_0x06ff
            X.1DT r9 = r9.A04     // Catch:{ all -> 0x0b9b }
            r8 = 34
            X.7AP r3 = new X.7AP     // Catch:{ all -> 0x0b9b }
            r3.<init>(r0, r8)     // Catch:{ all -> 0x0b9b }
            goto L_0x06fc
        L_0x0779:
            X.1bI r3 = r0.A1X     // Catch:{ all -> 0x0b9b }
            goto L_0x069a
        L_0x077d:
            if (r3 == 0) goto L_0x0780
            goto L_0x079d
        L_0x0780:
            X.0ve r8 = r0.A0E     // Catch:{ all -> 0x0b9b }
            r3 = 8207(0x200f, float:1.15E-41)
            int r3 = X.C18020vd.A00(r7, r8, r3)     // Catch:{ all -> 0x0b9b }
            X.1bI r8 = r0.A1V     // Catch:{ all -> 0x0b9b }
            if (r3 > r2) goto L_0x0798
            android.view.View r8 = r8.A02()     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r8 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r8     // Catch:{ all -> 0x0b9b }
            X.8Au r3 = r0.A0p     // Catch:{ all -> 0x0b9b }
            r8.A02(r0, r3)     // Catch:{ all -> 0x0b9b }
            goto L_0x07f8
        L_0x0798:
            r3 = 6
            X.C145907Nb.A00(r8, r0, r3)     // Catch:{ all -> 0x0b9b }
            goto L_0x07f8
        L_0x079d:
            android.view.View r8 = r0.A09     // Catch:{ all -> 0x0b9b }
            r3 = 2131431586(0x7f0b10a2, float:1.8484905E38)
            android.view.ViewStub r10 = X.AnonymousClass3MW.A0E(r8, r3)     // Catch:{ all -> 0x0b9b }
            X.1KB r9 = r0.A05     // Catch:{ all -> 0x0b9b }
            X.6bS r8 = r0.A0X     // Catch:{ all -> 0x0b9b }
            X.5tL r3 = new X.5tL     // Catch:{ all -> 0x0b9b }
            r3.<init>(r10, r9, r8)     // Catch:{ all -> 0x0b9b }
            r0.A0o = r3     // Catch:{ all -> 0x0b9b }
            boolean r3 = A25(r0)     // Catch:{ all -> 0x0b9b }
            if (r3 != 0) goto L_0x07c8
            com.whatsapp.calling.callgrid.view.CallGrid r9 = r0.A0e     // Catch:{ all -> 0x0b9b }
            X.5tL r3 = r0.A0o     // Catch:{ all -> 0x0b9b }
            java.lang.ref.WeakReference r8 = X.AnonymousClass3MW.A0z(r3)     // Catch:{ all -> 0x0b9b }
            X.1bI r3 = r0.A1T     // Catch:{ all -> 0x0b9b }
            java.lang.ref.WeakReference r3 = X.AnonymousClass3MW.A0z(r3)     // Catch:{ all -> 0x0b9b }
            r9.setBannerAndHeaderWeakReference(r8, r3)     // Catch:{ all -> 0x0b9b }
        L_0x07c8:
            X.5tL r10 = r0.A0o     // Catch:{ all -> 0x0b9b }
            X.8Au r11 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.C18070vi.A0d(r11, r2)     // Catch:{ all -> 0x0b9b }
            r10.A00 = r11     // Catch:{ all -> 0x0b9b }
            boolean r3 = r11 instanceof com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x0803
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel r11 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel) r11     // Catch:{ all -> 0x0b9b }
            X.1DT r8 = r11.A04     // Catch:{ all -> 0x0b9b }
            X.7yq r3 = new X.7yq     // Catch:{ all -> 0x0b9b }
            r3.<init>(r10)     // Catch:{ all -> 0x0b9b }
            r9 = 19
            X.AnonymousClass7AT.A01(r0, r8, r3, r9)     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r11.A05     // Catch:{ all -> 0x0b9b }
            X.7yr r3 = new X.7yr     // Catch:{ all -> 0x0b9b }
            r3.<init>(r10)     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass7AT.A01(r0, r8, r3, r9)     // Catch:{ all -> 0x0b9b }
        L_0x07ed:
            X.8Au r3 = r0.A0p     // Catch:{ all -> 0x0b9b }
            X.1wy r8 = r3.BYL()     // Catch:{ all -> 0x0b9b }
            r3 = 41
            X.AnonymousClass7AP.A00(r0, r8, r3)     // Catch:{ all -> 0x0b9b }
        L_0x07f8:
            r0.A0t()     // Catch:{ all -> 0x0b9b }
            r0.A0v()     // Catch:{ all -> 0x0b9b }
            boolean r3 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            goto L_0x0815
        L_0x0803:
            boolean r3 = r11 instanceof com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x07ed
            X.1pm r9 = X.AnonymousClass3MZ.A0H(r0)     // Catch:{ all -> 0x0b9b }
            r8 = 0
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBannerCoordinator$bindViewModel$3 r3 = new com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBannerCoordinator$bindViewModel$3     // Catch:{ all -> 0x0b9b }
            r3.<init>(r0, r10, r11, r8)     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass3MX.A1Q(r3, r9)     // Catch:{ all -> 0x0b9b }
            goto L_0x07ed
        L_0x0815:
            if (r3 != 0) goto L_0x0851
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ all -> 0x0b9b }
            r3 = 2131166080(0x7f070380, float:1.7946395E38)
            int r13 = X.AnonymousClass3MW.A01(r8, r3)     // Catch:{ all -> 0x0b9b }
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ all -> 0x0b9b }
            r3 = 2131167007(0x7f07071f, float:1.7948275E38)
            int r3 = X.AnonymousClass3MW.A01(r8, r3)     // Catch:{ all -> 0x0b9b }
            int r3 = r3 * 2
            int r13 = r13 + r3
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ all -> 0x0b9b }
            r3 = 2131165694(0x7f0701fe, float:1.7945612E38)
            int r3 = X.AnonymousClass3MW.A01(r8, r3)     // Catch:{ all -> 0x0b9b }
            int r13 = r13 - r3
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r0.A0g     // Catch:{ all -> 0x0b9b }
            X.6bS r3 = r0.A0X     // Catch:{ all -> 0x0b9b }
            int r10 = r3.A00     // Catch:{ all -> 0x0b9b }
            int r11 = r0.A2N     // Catch:{ all -> 0x0b9b }
            int r12 = r0.A2Q     // Catch:{ all -> 0x0b9b }
            boolean r3 = r0.A2j     // Catch:{ all -> 0x0b9b }
            r14 = r3 ^ 1
            X.6o5 r8 = new X.6o5     // Catch:{ all -> 0x0b9b }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0b9b }
            r0.A0f = r8     // Catch:{ all -> 0x0b9b }
        L_0x0851:
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r0.findViewById(r3)     // Catch:{ all -> 0x0b9b }
            r0.A0D = r3     // Catch:{ all -> 0x0b9b }
            r3 = 2131436758(0x7f0b24d6, float:1.8495395E38)
            android.widget.ImageView r3 = X.AnonymousClass3MX.A0I(r0, r3)     // Catch:{ all -> 0x0b9b }
            r0.A2X = r3     // Catch:{ all -> 0x0b9b }
            r0.A0z()     // Catch:{ all -> 0x0b9b }
            X.0ve r8 = r0.A0E     // Catch:{ all -> 0x0b9b }
            r3 = 5341(0x14dd, float:7.484E-42)
            boolean r3 = X.C18020vd.A05(r7, r8, r3)     // Catch:{ all -> 0x0b9b }
            if (r3 != 0) goto L_0x0888
            r3 = 9220(0x2404, float:1.292E-41)
            boolean r3 = X.C18020vd.A05(r7, r8, r3)     // Catch:{ all -> 0x0b9b }
            if (r3 != 0) goto L_0x0888
            r3 = 10274(0x2822, float:1.4397E-41)
            boolean r3 = X.C18020vd.A05(r7, r8, r3)     // Catch:{ all -> 0x0b9b }
            if (r3 != 0) goto L_0x0888
            r3 = 10275(0x2823, float:1.4398E-41)
            boolean r3 = X.C18020vd.A05(r7, r8, r3)     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x08c9
        L_0x0888:
            X.11C r14 = r0.A08     // Catch:{ all -> 0x0b9b }
            X.0vb r13 = r0.A00     // Catch:{ all -> 0x0b9b }
            X.11P r12 = r0.A05     // Catch:{ all -> 0x0b9b }
            X.0ve r11 = r0.A0E     // Catch:{ all -> 0x0b9b }
            boolean r30 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            X.1pm r29 = X.AnonymousClass3MZ.A0H(r0)     // Catch:{ all -> 0x0b9b }
            X.1DC r10 = r0.A1O     // Catch:{ all -> 0x0b9b }
            X.1VE r9 = r0.A0Z     // Catch:{ all -> 0x0b9b }
            X.1VF r8 = r0.A0c     // Catch:{ all -> 0x0b9b }
            X.1V9 r7 = r0.A0q     // Catch:{ all -> 0x0b9b }
            X.735 r3 = new X.735     // Catch:{ all -> 0x0b9b }
            r20 = r0
            r18 = r3
            r19 = r0
            r21 = r9
            r22 = r8
            r23 = r7
            r24 = r14
            r25 = r12
            r26 = r13
            r27 = r11
            r28 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0b9b }
            r0.A0w = r3     // Catch:{ all -> 0x0b9b }
            X.1DT r7 = r3.A04     // Catch:{ all -> 0x0b9b }
            r3 = 5
            X.AnonymousClass7AM.A00(r0, r7, r3)     // Catch:{ all -> 0x0b9b }
            X.735 r7 = r0.A0w     // Catch:{ all -> 0x0b9b }
            android.view.View r3 = r0.A0D     // Catch:{ all -> 0x0b9b }
            r7.A01 = r3     // Catch:{ all -> 0x0b9b }
        L_0x08c9:
            X.00H r3 = r0.A1x     // Catch:{ all -> 0x0b9b }
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x0b9b }
            X.9sx r8 = (X.C195199sx) r8     // Catch:{ all -> 0x0b9b }
            android.view.View r7 = r0.A0D     // Catch:{ all -> 0x0b9b }
            java.lang.String r3 = r5.callId     // Catch:{ all -> 0x0b9b }
            r8.A02(r7, r3)     // Catch:{ all -> 0x0b9b }
            android.content.Intent r3 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            r0.setIntent(r3)     // Catch:{ all -> 0x0b9b }
            java.lang.String r7 = "callAccepted"
            boolean r1 = r3.getBooleanExtra(r7, r1)     // Catch:{ all -> 0x0b9b }
            r0.A28 = r1     // Catch:{ all -> 0x0b9b }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = "voip/VoipActivityV2/create intent: "
            r7.append(r1)     // Catch:{ all -> 0x0b9b }
            r7.append(r3)     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = ", call info: "
            X.C17900vP.A0Y(r5, r1, r7)     // Catch:{ all -> 0x0b9b }
            r7 = 14
            X.7E0 r8 = new X.7E0     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x0b9b }
            r0.A2a = r8     // Catch:{ all -> 0x0b9b }
            X.1Lf r1 = r0.A13     // Catch:{ all -> 0x0b9b }
            r1.registerObserver(r8)     // Catch:{ all -> 0x0b9b }
            r1 = 9
            X.75Y r8 = new X.75Y     // Catch:{ all -> 0x0b9b }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x0b9b }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x0b9b }
            r1.<init>(r8)     // Catch:{ all -> 0x0b9b }
            r0.A05 = r1     // Catch:{ all -> 0x0b9b }
            android.view.Window r1 = r0.getWindow()     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass1L9.A04(r1)     // Catch:{ all -> 0x0b9b }
            java.lang.String r8 = r3.getAction()     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = X.AnonymousClass6Z8.A09     // Catch:{ all -> 0x0b9b }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x0943
            java.lang.String r1 = r3.getAction()     // Catch:{ all -> 0x0b9b }
            A1O(r5, r0, r1)     // Catch:{ all -> 0x0b9b }
        L_0x092e:
            X.1VT r2 = r0.A1Z     // Catch:{ all -> 0x0b9b }
            X.1IV r1 = r0.A2r     // Catch:{ all -> 0x0b9b }
            r2.registerObserver(r1)     // Catch:{ all -> 0x0b9b }
            X.1Md r3 = r0.A0s     // Catch:{ all -> 0x0b9b }
            java.lang.String r2 = r0.A21     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = "voipactivity_oncreate_done"
            r3.A03(r2, r1)     // Catch:{ all -> 0x0b9b }
            boolean r1 = X.C108995ce.A1a(r0)     // Catch:{ all -> 0x0b9b }
            goto L_0x09af
        L_0x0943:
            boolean r1 = r6.equals(r8)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x094d
            r0.A13(r3, r5)     // Catch:{ all -> 0x0b9b }
            goto L_0x092e
        L_0x094d:
            java.lang.String r1 = "com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x0959
            r0.A14(r3, r5)     // Catch:{ all -> 0x0b9b }
            goto L_0x092e
        L_0x0959:
            java.lang.String r1 = X.AnonymousClass6Z8.A08     // Catch:{ all -> 0x0b9b }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x0967
            r0.A29 = r2     // Catch:{ all -> 0x0b9b }
            A1M(r5, r0)     // Catch:{ all -> 0x0b9b }
            goto L_0x092e
        L_0x0967:
            java.lang.String r1 = X.AnonymousClass6Z8.A0A     // Catch:{ all -> 0x0b9b }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0b9b }
            if (r1 != 0) goto L_0x092e
            java.lang.String r2 = X.AnonymousClass6Z8.A02     // Catch:{ all -> 0x0b9b }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            boolean r1 = X.C17890vO.A1S(r1, r2)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x0990
            X.1HS r1 = r0.A11     // Catch:{ all -> 0x0b9b }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x0990
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0b9b }
            r1.removeMessages(r7)     // Catch:{ all -> 0x0b9b }
            android.os.Handler r3 = r0.A05     // Catch:{ all -> 0x0b9b }
            r1 = 500(0x1f4, double:2.47E-321)
            r3.sendEmptyMessageDelayed(r7, r1)     // Catch:{ all -> 0x0b9b }
            goto L_0x092e
        L_0x0990:
            java.lang.String r1 = X.AnonymousClass6Z8.A01     // Catch:{ all -> 0x0b9b }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x092e
            X.A99 r1 = r0.A0u     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x09ac
            java.lang.String r1 = "jid"
            java.util.ArrayList r2 = r3.getStringArrayListExtra(r1)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r1 = X.C22971Dz.A0A(r1, r2)     // Catch:{ all -> 0x0b9b }
            A1k(r0, r1)     // Catch:{ all -> 0x0b9b }
            goto L_0x092e
        L_0x09ac:
            r0.A03 = r3     // Catch:{ all -> 0x0b9b }
            goto L_0x092e
        L_0x09af:
            if (r1 == 0) goto L_0x09b5
            boolean r1 = r0.A2D     // Catch:{ all -> 0x0b9b }
            if (r1 != 0) goto L_0x09c9
        L_0x09b5:
            X.1It r2 = X.AnonymousClass3MW.A0N(r0)     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel> r1 = com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel.class
            X.1J2 r1 = r2.A00(r1)     // Catch:{ all -> 0x0b9b }
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r1 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r1     // Catch:{ all -> 0x0b9b }
            r0.A2Y = r1     // Catch:{ all -> 0x0b9b }
            X.1DT r2 = r1.A01     // Catch:{ all -> 0x0b9b }
            r1 = 6
            X.AnonymousClass7AM.A00(r0, r2, r1)     // Catch:{ all -> 0x0b9b }
        L_0x09c9:
            X.0vp r1 = r0.A25     // Catch:{ all -> 0x0b9b }
            boolean r1 = X.C72463Mc.A1Z(r1)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x09de
            int r1 = X.C72453Mb.A08(r0)     // Catch:{ all -> 0x0b9b }
            if (r1 != r4) goto L_0x09de
            android.content.res.Configuration r1 = X.C108965cb.A03(r0)     // Catch:{ all -> 0x0b9b }
            r0.onConfigurationChanged(r1)     // Catch:{ all -> 0x0b9b }
        L_0x09de:
            if (r17 == 0) goto L_0x09e7
            X.1Bd r2 = r0.A02
            r1 = r16
            r2.A08(r1)
        L_0x09e7:
            android.view.View r2 = r0.A00
            X.1KB r1 = r0.A05
            r0.A39(r2, r1)
            r2 = 8
            X.5dy r1 = new X.5dy
            r1.<init>(r0, r2)
            X.CIZ r1 = X.C108965cb.A0C(r0, r1)
            r0.A0M = r1
            return
        L_0x09fc:
            android.content.Intent r5 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r4 = "joinable"
            boolean r4 = r5.getBooleanExtra(r4, r1)     // Catch:{ all -> 0x0b9b }
            if (r4 == 0) goto L_0x0a33
            java.lang.String r3 = r0.A21     // Catch:{ all -> 0x0b9b }
            if (r3 != 0) goto L_0x0a11
            r0.finish()     // Catch:{ all -> 0x0b9b }
            goto L_0x0b91
        L_0x0a11:
            android.content.Intent r3 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            int r7 = r3.getIntExtra(r9, r11)     // Catch:{ all -> 0x0b9b }
            X.5Yp r6 = r0.A2q     // Catch:{ all -> 0x0b9b }
            X.1TD r4 = r0.A1D     // Catch:{ all -> 0x0b9b }
            X.1TA r3 = r0.A1F     // Catch:{ all -> 0x0b9b }
            X.496 r5 = new X.496     // Catch:{ all -> 0x0b9b }
            r5.<init>(r6, r4, r3, r7)     // Catch:{ all -> 0x0b9b }
            r0.A0j = r5     // Catch:{ all -> 0x0b9b }
            X.10I r4 = r0.A05     // Catch:{ all -> 0x0b9b }
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0b9b }
            java.lang.String r2 = r0.A21     // Catch:{ all -> 0x0b9b }
            r3[r1] = r2     // Catch:{ all -> 0x0b9b }
            r4.CGD(r5, r3)     // Catch:{ all -> 0x0b9b }
            goto L_0x0b91
        L_0x0a33:
            r0.finish()     // Catch:{ all -> 0x0b9b }
            android.content.Intent r5 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r4 = "fromCallNotification"
            boolean r4 = r5.getBooleanExtra(r4, r1)     // Catch:{ all -> 0x0b9b }
            if (r4 == 0) goto L_0x0b13
            X.00H r4 = r0.A1x     // Catch:{ all -> 0x0b9b }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x0b9b }
            X.9sx r5 = (X.C195199sx) r5     // Catch:{ all -> 0x0b9b }
            X.6uK r4 = r5.A03     // Catch:{ all -> 0x0b9b }
            if (r4 == 0) goto L_0x0a51
            r4.A01()     // Catch:{ all -> 0x0b9b }
        L_0x0a51:
            r5.A03 = r3     // Catch:{ all -> 0x0b9b }
            X.6uK r4 = r5.A02     // Catch:{ all -> 0x0b9b }
            if (r4 == 0) goto L_0x0a5a
            r4.A01()     // Catch:{ all -> 0x0b9b }
        L_0x0a5a:
            r5.A02 = r3     // Catch:{ all -> 0x0b9b }
            X.3Ao r6 = r0.A1L     // Catch:{ all -> 0x0b9b }
            android.content.Intent r5 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r4 = "notificationKey"
            int r10 = r5.getIntExtra(r4, r1)     // Catch:{ all -> 0x0b9b }
            X.2qZ r9 = r6.A01     // Catch:{ all -> 0x0b9b }
            if (r9 == 0) goto L_0x0a84
            if (r10 == 0) goto L_0x0a84
            X.1Vn r7 = r6.A03     // Catch:{ all -> 0x0b9b }
            X.0z4 r8 = r6.A04     // Catch:{ all -> 0x0b9b }
            X.C18070vi.A0d(r7, r1)     // Catch:{ all -> 0x0b9b }
            X.C18070vi.A0d(r8, r2)     // Catch:{ all -> 0x0b9b }
            X.10s r4 = r9.A00     // Catch:{ all -> 0x0b9b }
            r11 = 7
            X.Aiu r6 = new X.Aiu     // Catch:{ all -> 0x0b9b }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0b9b }
            r4.execute(r6)     // Catch:{ all -> 0x0b9b }
            goto L_0x0a87
        L_0x0a84:
            r6.A04()     // Catch:{ all -> 0x0b9b }
        L_0x0a87:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0b9b }
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            android.content.Intent r5 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r4 = "jid"
            java.util.ArrayList r4 = r5.getStringArrayListExtra(r4)     // Catch:{ all -> 0x0b9b }
            java.util.ArrayList r5 = X.C22971Dz.A0A(r7, r4)     // Catch:{ all -> 0x0b9b }
            int r4 = r5.size()     // Catch:{ all -> 0x0b9b }
            if (r4 <= 0) goto L_0x0ad3
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x0b9b }
        L_0x0aa5:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x0b9b }
            if (r4 == 0) goto L_0x0ab7
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x0b9b }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0b9b }
            X.1M9 r4 = r0.A12     // Catch:{ all -> 0x0b9b }
            X.AnonymousClass3MY.A1O(r4, r5, r6)     // Catch:{ all -> 0x0b9b }
            goto L_0x0aa5
        L_0x0ab7:
            int r4 = r6.size()     // Catch:{ all -> 0x0b9b }
            if (r4 <= 0) goto L_0x0afe
            int r4 = r6.size()     // Catch:{ all -> 0x0b9b }
            int r4 = r4 - r2
            java.lang.Object r2 = r6.get(r4)     // Catch:{ all -> 0x0b9b }
            X.1E7 r2 = (X.AnonymousClass1E7) r2     // Catch:{ all -> 0x0b9b }
            X.1BI r5 = r2.A0J     // Catch:{ all -> 0x0b9b }
            if (r5 == 0) goto L_0x0afe
            X.1i1 r4 = r0.A19     // Catch:{ all -> 0x0b9b }
            r2 = 3
            r4.A0C(r5, r2)     // Catch:{ all -> 0x0b9b }
            goto L_0x0afe
        L_0x0ad3:
            android.content.Intent r3 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r2 = "group_jid"
            java.lang.String r3 = r3.getStringExtra(r2)     // Catch:{ all -> 0x0b9b }
            X.1nh r2 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0b9b }
            com.whatsapp.jid.GroupJid r3 = r2.A03(r3)     // Catch:{ all -> 0x0b9b }
            if (r3 == 0) goto L_0x0afe
            X.1M9 r2 = r0.A12     // Catch:{ all -> 0x0b9b }
            X.1E7 r7 = r2.A0H(r3)     // Catch:{ all -> 0x0b9b }
            X.1MZ r5 = r0.A1E     // Catch:{ all -> 0x0b9b }
            X.11S r4 = r0.A02     // Catch:{ all -> 0x0b9b }
            X.1M9 r2 = r0.A12     // Catch:{ all -> 0x0b9b }
            java.util.List r2 = X.C63982u1.A04(r4, r2, r5, r7)     // Catch:{ all -> 0x0b9b }
            r6.addAll(r2)     // Catch:{ all -> 0x0b9b }
            X.1i1 r4 = r0.A19     // Catch:{ all -> 0x0b9b }
            r2 = 3
            r4.A0C(r3, r2)     // Catch:{ all -> 0x0b9b }
        L_0x0afe:
            X.1VP r5 = r0.A0l     // Catch:{ all -> 0x0b9b }
            android.content.Intent r4 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r2 = "video_call"
            boolean r12 = r4.getBooleanExtra(r2, r1)     // Catch:{ all -> 0x0b9b }
            r11 = 5
            r7 = r5
            r8 = r0
            r9 = r3
            r10 = r6
            r7.CNy(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0b9b }
            goto L_0x0b91
        L_0x0b13:
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r3 = r2.getAction()     // Catch:{ all -> 0x0b9b }
            java.lang.String r2 = X.AnonymousClass6Z8.A05     // Catch:{ all -> 0x0b9b }
            boolean r2 = X.C42171xk.A00(r3, r2)     // Catch:{ all -> 0x0b9b }
            if (r2 == 0) goto L_0x0b54
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = "scheduled_call_row_id"
            long r7 = X.C108975cc.A05(r2, r1)     // Catch:{ all -> 0x0b9b }
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = "group_jid"
            java.lang.String r2 = r2.getStringExtra(r1)     // Catch:{ all -> 0x0b9b }
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0b9b }
            com.whatsapp.jid.GroupJid r5 = r1.A03(r2)     // Catch:{ all -> 0x0b9b }
            r2 = 0
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0b91
            if (r5 == 0) goto L_0x0b91
            X.10I r2 = r0.A05     // Catch:{ all -> 0x0b9b }
            r6 = 18
            X.3C3 r1 = new X.3C3     // Catch:{ all -> 0x0b9b }
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x0b9b }
            r2.CGN(r1)     // Catch:{ all -> 0x0b9b }
            goto L_0x0b91
        L_0x0b54:
            java.lang.String r2 = "voip/VoipActivityV2/create/call_not_active"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0b9b }
            android.content.Intent r3 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            java.lang.String r2 = "fgservice_start_failed"
            boolean r1 = r3.getBooleanExtra(r2, r1)     // Catch:{ all -> 0x0b9b }
            if (r1 == 0) goto L_0x0b91
            X.62G r3 = new X.62G     // Catch:{ all -> 0x0b9b }
            r3.<init>()     // Catch:{ all -> 0x0b9b }
            java.lang.String r1 = "voip_call_lobby_open_fail_fgservice_restriction"
            r3.A00 = r1     // Catch:{ all -> 0x0b9b }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            boolean r1 = X.C17890vO.A1S(r1, r6)     // Catch:{ all -> 0x0b9b }
            if (r1 != 0) goto L_0x0b8e
            java.lang.String r2 = "join_call"
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x0b9b }
            boolean r1 = X.C17890vO.A1S(r1, r2)     // Catch:{ all -> 0x0b9b }
            if (r1 != 0) goto L_0x0b8e
            java.lang.String r1 = "false"
        L_0x0b86:
            r3.A01 = r1     // Catch:{ all -> 0x0b9b }
            X.18K r1 = r0.A1I     // Catch:{ all -> 0x0b9b }
            r1.CC7(r3)     // Catch:{ all -> 0x0b9b }
            goto L_0x0b91
        L_0x0b8e:
            java.lang.String r1 = "true"
            goto L_0x0b86
        L_0x0b91:
            if (r17 == 0) goto L_0x0b9a
            X.1Bd r1 = r0.A02
            r0 = r16
            r1.A08(r0)
        L_0x0b9a:
            return
        L_0x0b9b:
            r2 = move-exception
            if (r17 == 0) goto L_0x0ba5
            X.1Bd r1 = r0.A02
            r0 = r16
            r1.A08(r0)
        L_0x0ba5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C010105w A292;
        ContactPickerFragment contactPickerFragment = this.A16;
        if (contactPickerFragment == null || (A292 = contactPickerFragment.A29(i)) == null) {
            return super.onCreateDialog(i);
        }
        return A292;
    }

    public void onGlobalLayout() {
        if (this.A0D.getWidth() != this.A2S || this.A0D.getHeight() != this.A2R) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("voip/VoipActivityV2/onGlobalLayout size: ");
            A102.append(this.A0D.getWidth());
            A102.append("x");
            A102.append(this.A0D.getHeight());
            A102.append(", orientation: ");
            C17900vP.A0o(A102, C72453Mb.A08(this));
            this.A2S = this.A0D.getWidth();
            this.A2R = this.A0D.getHeight();
            this.A0m.onGlobalLayout();
            CallInfo A0Q2 = A0Q(this);
            A1N(A0Q2, this, 0);
            if (!this.A2J || A0Q2 == null || !A0Q2.videoEnabled) {
                CallGrid callGrid = this.A0e;
                callGrid.A06.notifyDataSetChanged();
                callGrid.A08.notifyDataSetChanged();
            } else {
                if (!C18020vd.A05(C18040vf.A02, this.A0E, 9746)) {
                    this.A1c.updateCameraPreviewOrientation();
                }
            }
            Log.i("voip/VoipActivityV2/onGlobalLayout/end");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A16 == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A16.A2g(true);
        A1S(this);
        return true;
    }

    public void onRestart() {
        C28931bI r0;
        if (C18020vd.A05(C18040vf.A02, this.A0E, 1807)) {
            AnonymousClass1Bd r4 = this.A02;
            if (this.A2D) {
                r0 = this.A1T;
            } else {
                r0 = this.A1X;
            }
            r4.A06(r0.A02(), new C146787Qp(this, 13), "VoipActivityV2", 4);
        }
        super.onRestart();
    }

    public void onSaveInstanceState(Bundle bundle) {
        A4i(AnonymousClass00R.A0Y);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A16;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A2K();
        return true;
    }

    public void onUserLeaveHint() {
        ScreenShareViewModel screenShareViewModel;
        Log.i("voip/VoipActivityV2/onUserLeaveHint");
        if (this.A16 != null || (((screenShareViewModel = this.A0t) != null && C72463Mc.A1O(screenShareViewModel.A09)) || !A23(this) || !A1y(A0Q(this), this))) {
            this.A2I = false;
            CallInfo A0Q2 = A0Q(this);
            if (A0Q2 != null && A0Q2.callState == CallState.PRECALLING) {
                A1T(this);
            }
        }
    }

    public void recreate() {
        if (this.A00 == 3) {
            super.recreate();
        }
    }

    private String A0c(C134216qE r7, CallInfo callInfo) {
        int i;
        if (AnonymousClass73H.A00(r7) == 0) {
            String A0q2 = AnonymousClass3MY.A0q(this.A15, this.A12.A0H(r7.A0A));
            if (!r7.A0M && callInfo.callState == CallState.ACTIVE) {
                int i2 = r7.A08;
                if (i2 == 3) {
                    return C72473Md.A0j(this, A0q2, 2131898281);
                }
                if (callInfo.isGroupCall) {
                    int i3 = r7.A04;
                    if (i3 == 2) {
                        i = 2131887856;
                    } else if (i3 == 3) {
                        i = 2131895366;
                    }
                    return getString(i);
                }
                C134216qE r0 = callInfo.self;
                if ((r0 == null || !r0.A0F) && !r7.A0F) {
                    if (r7.A0J) {
                        i = 2131898279;
                    } else if (callInfo.videoEnabled && !AnonymousClass000.A1T(i2, 6) && !r7.A0R && i2 != 2) {
                        i = 2131898124;
                    }
                    return getString(i);
                }
                i = 2131898264;
                return getString(i);
            }
        }
        return null;
    }

    private void A0r() {
        Fragment A0Q2 = getSupportFragmentManager().A0Q("permission_request");
        if (A0Q2 != null) {
            C34001jj A0H2 = AnonymousClass3Ma.A0H(this);
            A0H2.A07(A0Q2);
            A0H2.A04();
        }
    }

    private void A0u() {
        if (C108995ce.A1a(this)) {
            boolean A1P2 = AnonymousClass000.A1P(this.A1R.A01());
            boolean A252 = A25(this);
            CallGrid callGrid = this.A0e;
            if (A252) {
                callGrid.setIsCallControlsShown(A1P2);
                return;
            }
            callGrid.A0G((DecelerateInterpolator) C1409273p.A0E.getValue(), ((CallControlCard) this.A1R.A02()).getInCallControlsTop(), 0, A1P2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (X.C40811vJ.A0Q(r12.A0E) == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0v() {
        /*
            r12 = this;
            boolean r0 = X.C108995ce.A1a(r12)
            r4 = 0
            if (r0 == 0) goto L_0x006d
            X.73p r0 = r12.A0k
            if (r0 != 0) goto L_0x0067
            X.1bI r0 = r12.A1R
            r0.A04(r4)
            X.1bI r0 = r12.A1U
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0029
            boolean r0 = A25(r12)
            if (r0 == 0) goto L_0x0029
            X.1bI r0 = r12.A1U
            android.view.View r1 = r0.A02()
            com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer r1 = (com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer) r1
            X.6Ri r0 = X.C122686Ri.CONTROLS_SHOWN
            r1.setBehavior(r0)
        L_0x0029:
            X.0ve r2 = r12.A0E
            r1 = 11525(0x2d05, float:1.615E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0038
            A1X(r12)
        L_0x0038:
            X.1bI r0 = r12.A1R
            android.view.View r2 = r0.A02()
            com.whatsapp.calling.controls.view.CallControlCard r2 = (com.whatsapp.calling.controls.view.CallControlCard) r2
            boolean r0 = r12.A2D
            if (r0 == 0) goto L_0x006b
            X.1bI r0 = r12.A1T
            android.view.View r3 = r0.A02()
            com.whatsapp.calling.header.ui.CallScreenHeaderView r3 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r3
        L_0x004c:
            com.whatsapp.calling.callgrid.view.CallGrid r1 = r12.A0e
            X.1bI r6 = r12.A1Q
            X.1bI r7 = r12.A1P
            X.11C r5 = r12.A08
            X.5tL r4 = r12.A0o
            X.1bI r8 = r12.A1U
            X.1bI r9 = r12.A2d
            X.0vp r10 = r12.A23
            boolean r11 = A25(r12)
            X.73p r0 = new X.73p
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A0k = r0
        L_0x0067:
            r12.A0u()
        L_0x006a:
            return
        L_0x006b:
            r3 = 0
            goto L_0x004c
        L_0x006d:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A1b
            if (r0 != 0) goto L_0x006a
            com.whatsapp.voipcalling.CallInfo r2 = A0Q(r12)
            boolean r0 = A24(r12)
            r3 = 1
            if (r0 == 0) goto L_0x0085
            X.0ve r0 = r12.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            if (r2 == 0) goto L_0x008d
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x008d
            r4 = 1
        L_0x008d:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A01(r4, r1)
            r12.A1b = r0
            boolean r0 = r12.A2D
            if (r0 != 0) goto L_0x00a1
            X.1bI r0 = r12.A1X
            android.view.View r1 = r0.A02()
            r0 = 0
            r1.setTranslationY(r0)
        L_0x00a1:
            boolean r0 = A1z(r2, r12)
            if (r0 == 0) goto L_0x006a
            A28(r12)
            X.0ve r2 = r12.A0E
            r1 = 8207(0x200f, float:1.15E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 > r3) goto L_0x00ce
            X.1bI r0 = r12.A1V
            android.view.View r2 = r0.A02()
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r2 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r2
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass3MW.A0B(r2)
            java.lang.String r0 = "VoipCallNewParticipantBanner/resetBannerYPosition"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r2.A0F
            r1.bottomMargin = r0
            r2.setLayoutParams(r1)
        L_0x00ce:
            X.5wM r0 = r12.A0a
            if (r0 == 0) goto L_0x006a
            r0.A05(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0v():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1 == 1) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (com.whatsapp.voipcalling.Voip.A0A(r3.callState) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r9.A28 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0z() {
        /*
            r9 = this;
            X.C17960vV.A02()
            com.whatsapp.voipcalling.CallInfo r3 = A0Q(r9)
            if (r3 == 0) goto L_0x00dd
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00dd
            com.whatsapp.voipcalling.CallState r6 = r9.A0V(r3)
            boolean r0 = r3.isEitherSideRequestingUpgrade()
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r9.A28
            r8 = 1
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r8 = 0
        L_0x0021:
            boolean r0 = r3.videoEnabled
            r4 = 8
            if (r0 == 0) goto L_0x00e6
            r0 = 2131898291(0x7f122fb3, float:1.9431496E38)
            r9.setTitle(r0)
            java.lang.String r1 = r9.getString(r0)
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription
            r0.<init>(r1)
            r9.setTaskDescription(r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A16
            if (r0 != 0) goto L_0x0059
            android.view.Window r1 = r9.getWindow()
            int r0 = X.C108955ca.A01(r9)
            r1.setStatusBarColor(r0)
            android.view.Window r4 = r9.getWindow()
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r0 = X.AnonymousClass3Ma.A00(r9, r1, r0)
            r4.setNavigationBarColor(r0)
        L_0x0059:
            int r0 = r3.getConnectedParticipantsCount()
            A1i(r9, r0, r2)
            boolean r0 = r9.A2D
            if (r0 != 0) goto L_0x0067
            r9.A1I(r3)
        L_0x0067:
            boolean r0 = r3.isGroupCall
            boolean r0 = A22(r6, r9, r0)
            if (r0 == 0) goto L_0x0080
            com.whatsapp.calling.CallDetailsLayout r7 = r9.A0W
            boolean r4 = r7.A06(r3)
            int r1 = r9.A00
            if (r1 == 0) goto L_0x007c
            r0 = 0
            if (r1 != r2) goto L_0x007d
        L_0x007c:
            r0 = 1
        L_0x007d:
            r7.A04(r6, r4, r0)
        L_0x0080:
            X.1bI r1 = r9.A2e
            if (r1 == 0) goto L_0x0095
            if (r8 != 0) goto L_0x0092
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r0) goto L_0x0092
            boolean r0 = r3.isInLonelyState()
            if (r0 != 0) goto L_0x0092
            r5 = 8
        L_0x0092:
            r1.A04(r5)
        L_0x0095:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1b
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0T
            if (r0 == 0) goto L_0x00a0
            r0.A03()
        L_0x00a0:
            boolean r0 = r3.isCaller
            if (r0 != 0) goto L_0x00ad
            com.whatsapp.voipcalling.CallState r0 = r3.callState
            boolean r1 = com.whatsapp.voipcalling.Voip.A0A(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00ca
            boolean r0 = X.C40811vJ.A0e(r3)
            if (r0 == 0) goto L_0x00de
            boolean r0 = r3.videoEnabled
            if (r0 != 0) goto L_0x00ca
            boolean r0 = X.C39761tb.A09()
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r3.videoEnabled
            if (r0 != 0) goto L_0x00de
            boolean r0 = r3.isGroupCall
            if (r0 == 0) goto L_0x00de
        L_0x00ca:
            android.view.Window r0 = r9.getWindow()
            r0.addFlags(r1)
        L_0x00d1:
            X.0vp r0 = r9.A25
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x00da
            r2 = 2
        L_0x00da:
            r9.setRequestedOrientation(r2)
        L_0x00dd:
            return
        L_0x00de:
            android.view.Window r0 = r9.getWindow()
            r0.clearFlags(r1)
            goto L_0x00d1
        L_0x00e6:
            r0 = 2131898097(0x7f122ef1, float:1.9431102E38)
            r9.setTitle(r0)
            java.lang.String r1 = r9.getString(r0)
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription
            r0.<init>(r1)
            r9.setTaskDescription(r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A16
            if (r0 != 0) goto L_0x011e
            android.view.Window r1 = r9.getWindow()
            int r0 = X.C108955ca.A01(r9)
            r1.setStatusBarColor(r0)
            boolean r1 = X.C108995ce.A1a(r9)
            r0 = 2131102871(0x7f060c97, float:1.7818192E38)
            if (r1 == 0) goto L_0x0113
            r0 = 2131102739(0x7f060c13, float:1.7817924E38)
        L_0x0113:
            android.view.Window r1 = r9.getWindow()
            int r0 = X.C19740yt.A00(r9, r0)
            r1.setNavigationBarColor(r0)
        L_0x011e:
            boolean r0 = r9.A2D
            if (r0 != 0) goto L_0x0125
            r9.A1I(r3)
        L_0x0125:
            A1R(r9)
            boolean r0 = r3.isGroupCall
            boolean r0 = A22(r6, r9, r0)
            if (r0 == 0) goto L_0x0155
            com.whatsapp.calling.CallDetailsLayout r1 = r9.A0W
            boolean r0 = r1.A06(r3)
            com.whatsapp.calling.CallDetailsLayout.A01(r1, r6, r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 == r0) goto L_0x01ae
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 == r0) goto L_0x01ae
            int r0 = r1.A01
            r1.setBackgroundColor(r0)
            X.C108975cc.A0u(r1, r5)
            X.1xh r0 = r1.A06
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setVisibility(r5)
            android.widget.TextView r0 = r1.A03
            r0.setVisibility(r5)
        L_0x0155:
            r0 = 2131436748(0x7f0b24cc, float:1.8495375E38)
            X.AnonymousClass3MX.A1H(r9, r0, r4)
            android.widget.ImageView r0 = r9.A2X
            r0.setVisibility(r4)
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r9.A0e
            X.C17960vV.A05(r0)
            r0.setVisibility(r5)
            boolean r0 = r9.A2D
            if (r0 != 0) goto L_0x0178
            X.1bI r0 = r9.A1X
            android.view.View r1 = r0.A02()
            r0 = 2131102739(0x7f060c13, float:1.7817924E38)
            r1.setBackgroundResource(r0)
        L_0x0178:
            int r0 = r3.getConnectedParticipantsCount()
            A1i(r9, r0, r5)
            r9.A2L = r2
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1b
            if (r0 == 0) goto L_0x01b2
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0T
            if (r0 == 0) goto L_0x01b2
            r0.A02()
            boolean r0 = A24(r9)
            if (r0 == 0) goto L_0x00a0
            X.0ve r0 = r9.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r9.A1b
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r1.A0S
            if (r0 == 0) goto L_0x01a3
            r0.setVisibility(r4)
        L_0x01a3:
            X.73c r0 = r1.A0K
            if (r0 == 0) goto L_0x00a0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0G
            r0.A0b(r5)
            goto L_0x00a0
        L_0x01ae:
            r1.setVisibility(r4)
            goto L_0x0155
        L_0x01b2:
            boolean r0 = X.C108995ce.A1a(r9)
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x00a0
            X.1bI r0 = r9.A1R
            int r0 = r0.A01()
            if (r0 != r4) goto L_0x00a0
            A28(r9)
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0z():void");
    }

    private void A10(int i) {
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("finish", true);
        C116475xo r3 = new C116475xo(this, 3);
        Bundle A0D3 = C17880vN.A0D();
        A0D3.putAll(A0D2);
        A0D3.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A1R(A0D3);
        voipErrorDialogFragment.A02 = r3;
        A4h(voipErrorDialogFragment, "VoipErrorDialogFragment");
    }

    public static void A15(Rational rational, VoipActivityV2 voipActivityV2) {
        if (A23(voipActivityV2)) {
            PictureInPictureParams.Builder builder = voipActivityV2.A02;
            C17960vV.A08(builder, "PiP Params Builder is null");
            builder.setAspectRatio(rational);
            if (voipActivityV2.A2E) {
                voipActivityV2.setPictureInPictureParams(voipActivityV2.A02.build());
            }
        }
    }

    public static void A18(C122436Qg r2, VoipActivityV2 voipActivityV2) {
        C1409273p r0;
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            CallInfo A0Q2 = A0Q(voipActivityV2);
            if (!(A0Q2 == null || A0Q2.callState == CallState.NONE)) {
                A1x(A0Q2, voipActivityV2);
            }
            A1a(voipActivityV2);
        } else if (ordinal == 1 && (r0 = voipActivityV2.A0k) != null) {
            C1409273p.A02(r0, true, true);
            CallArEffectsViewModel callArEffectsViewModel = voipActivityV2.A0b;
            if (callArEffectsViewModel != null) {
                callArEffectsViewModel.A0j(true);
            }
            C160968Au r02 = voipActivityV2.A0p;
            if (r02 != null) {
                r02.CJD(true);
            }
        }
    }

    public static void A1B(C28597E9o e9o, CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        View view;
        String str;
        C17960vV.A0F(AnonymousClass000.A1W(e9o), "Glasses service should not be null when setting up UI");
        if (e9o != null && (view = voipActivityV2.A09) != null) {
            View findViewById = view.findViewById(2131435446);
            voipActivityV2.A0E = findViewById;
            if (findViewById == null) {
                str = "VoipActivityV2Side bar is null. Skipping setup glasses UI";
            } else {
                ViewStub A0F2 = AnonymousClass3MW.A0F(findViewById, 2131435445);
                if (A0F2 == null) {
                    str = "VoipActivityV2overlay stub is null. Skipping setup glasses UI";
                } else {
                    int dimensionPixelSize = voipActivityV2.getResources().getDimensionPixelSize(2131169062);
                    C26995DOr A012 = ((C130566je) voipActivityV2.A0R.A03()).A02.A01(e9o);
                    A012.A05(A0F2, (A99) null, dimensionPixelSize);
                    A1A(A012, callInfo, voipActivityV2);
                    return;
                }
            }
            Log.i(str);
        }
    }

    public static void A1E(UserJid userJid, VoipActivityV2 voipActivityV2) {
        A99 a99;
        CallInfo A0Q2 = A0Q(voipActivityV2);
        if (A0Q2 != null && A0Q2.callState != CallState.NONE && (a99 = voipActivityV2.A0u) != null) {
            a99.A1E.execute(new AnonymousClass7RT(a99, userJid, A0Q2));
        }
    }

    public static void A1F(UserJid userJid, VoipActivityV2 voipActivityV2) {
        if (C17890vO.A00(C72453Mb.A0M(voipActivityV2), "switch_to_video_call_confirmation_dialog_count") < 5) {
            voipActivityV2.A4h(new Hilt_SwitchConfirmationFragment(), "SwitchConfirmationFragment");
            voipActivityV2.getSupportFragmentManager().A0t(new AnonymousClass7A8(voipActivityV2, 3), voipActivityV2, "switch_to_video_result");
        } else if (A1w(userJid, voipActivityV2, 1, true)) {
            A99 a99 = voipActivityV2.A0u;
            C17960vV.A07(a99);
            a99.A0b();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0182, code lost:
        if (r9.isGroupCall != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0198, code lost:
        if (r9.getConnectedParticipantsCount() == 2) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01a8, code lost:
        if (r9.isJoinableGroupCall != false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01aa, code lost:
        r1 = 2131898234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01bc, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 5923) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c0, code lost:
        r4 = r9.isAudioChat();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d0, code lost:
        if (X.C63982u1.A01(r10.A12, r10.A1J, r9.groupJid, r10.A1M, r4) == null) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d2, code lost:
        r3 = r10.A12.A0H(X.C108955ca.A0T(r9));
        r2 = 2131890361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e1, code lost:
        if (r9.videoEnabled != false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e3, code lost:
        r2 = 2131890362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e6, code lost:
        r8 = X.C17880vN.A0q(r10, X.AnonymousClass3MY.A0q(r10.A15, r3), new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f2, code lost:
        r1 = null;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f6, code lost:
        r1 = r9.isGroupCall;
        r0 = r9.videoEnabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fa, code lost:
        if (r1 == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01fc, code lost:
        r1 = 2131891167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ff, code lost:
        if (r0 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0201, code lost:
        r1 = 2131891176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0204, code lost:
        r8 = r10.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0209, code lost:
        r1 = 2131897837;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x020c, code lost:
        if (r0 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x020e, code lost:
        r1 = 2131898117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r0 = r10.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r1 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        r0.A05(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        r10.A0W.A0I.A04(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
        r3 = new java.lang.Object[1];
        X.AnonymousClass3MX.A1N(r10.A15, r10.A12.A0H(X.C108955ca.A0T(r9)), r3, 0);
        r8 = r10.getString(2131894259, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0154, code lost:
        if (r4.A0I != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0170, code lost:
        if (r9.isGroupCall != false) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1K(com.whatsapp.voipcalling.CallInfo r9, com.whatsapp.voipcalling.VoipActivityV2 r10) {
        /*
            X.C17960vV.A02()
            int r0 = r10.A2S
            if (r0 == 0) goto L_0x0018
            int r0 = r10.A2R
            if (r0 == 0) goto L_0x0018
            boolean r0 = r10.A2C
            if (r0 != 0) goto L_0x0018
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r0 == 0) goto L_0x0019
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            if (r9 == 0) goto L_0x0018
            boolean r0 = r9.callEnding
            if (r0 != 0) goto L_0x0018
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0018
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0018
            boolean r0 = r9.isInLonelyState()
            if (r0 != 0) goto L_0x0018
            X.6qE r0 = r9.self
            if (r0 == 0) goto L_0x0018
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r0 == 0) goto L_0x0212
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            boolean r0 = r9.isGroupCall
            boolean r0 = A22(r1, r10, r0)
            if (r0 == 0) goto L_0x0212
            java.lang.String r0 = r9.scheduledId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006e
            com.whatsapp.voipcalling.CallState r0 = r10.A0V(r9)
            int r0 = r0.ordinal()
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0084;
                case 2: goto L_0x0077;
                case 3: goto L_0x01ae;
                case 4: goto L_0x0072;
                case 5: goto L_0x0072;
                case 6: goto L_0x00a6;
                case 7: goto L_0x0018;
                case 8: goto L_0x01ae;
                case 9: goto L_0x0057;
                case 10: goto L_0x01aa;
                case 11: goto L_0x01c0;
                default: goto L_0x0057;
            }
        L_0x0057:
            java.lang.String r0 = "voip/VoipActivityV2/updateCallStatusBar/unknownCallState"
            X.C17960vV.A0F(r6, r0)
            r1 = r5
        L_0x005d:
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r1 != 0) goto L_0x0062
            r1 = r5
        L_0x0062:
            r0.A05(r5, r1)
        L_0x0065:
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            X.1bI r1 = r0.A0I
            r0 = 8
            r1.A04(r0)
        L_0x006e:
            r10.A1G(r9)
            return
        L_0x0072:
            r1 = 2131898124(0x7f122f0c, float:1.9431157E38)
            goto L_0x0204
        L_0x0077:
            X.A99 r0 = r10.A0u
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.A1a
            if (r0 != 0) goto L_0x008c
        L_0x007f:
            r1 = 2131898119(0x7f122f07, float:1.9431147E38)
            goto L_0x0204
        L_0x0084:
            X.A99 r0 = r10.A0u
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r0.A1a
            if (r0 == 0) goto L_0x01a3
        L_0x008c:
            r4 = 2131894259(0x7f121ff3, float:1.9423318E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.whatsapp.jid.UserJid r2 = X.C108955ca.A0T(r9)
            X.1Me r1 = r10.A15
            X.1M9 r0 = r10.A12
            X.1E7 r0 = r0.A0H(r2)
            X.AnonymousClass3MX.A1N(r1, r0, r3, r6)
            java.lang.String r8 = r10.getString(r4, r3)
            goto L_0x01f2
        L_0x00a6:
            boolean r0 = r9.isInLonelyState()
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x00e2
            X.1DC r0 = r10.A1O
            boolean r0 = r0.BcY()
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r9.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r10.A28
            if (r0 == 0) goto L_0x00c5
        L_0x00c2:
            A1R(r10)
        L_0x00c5:
            r10.A1G(r9)
            boolean r0 = r10.A2B
            if (r0 != 0) goto L_0x0018
            long r5 = r10.A01
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0018
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r5
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0221
            r10.A2B = r7
            return
        L_0x00e2:
            boolean r0 = r9.isCallOnHold()
            if (r0 == 0) goto L_0x0128
            r0 = 2131898264(0x7f122f98, float:1.943144E38)
        L_0x00eb:
            java.lang.String r8 = r10.getString(r0)
        L_0x00ef:
            boolean r0 = r10.A2B
            if (r0 != 0) goto L_0x0108
            long r0 = r10.A01
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0108
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            r10.A2B = r7
        L_0x0108:
            if (r8 != 0) goto L_0x01f2
            X.0vb r2 = r10.A00
            long r0 = r9.callDuration
            long r0 = X.C17880vN.A04(r0)
            java.lang.String r5 = X.C64052u8.A0D(r2, r5, r0)
            X.0vb r2 = r10.A00
            long r0 = r9.callDuration
            java.lang.String r1 = X.C64052u8.A07(r2, r0)
            goto L_0x005d
        L_0x0120:
            r0 = 2131898100(0x7f122ef4, float:1.9431108E38)
            java.lang.String r8 = r10.getString(r0)
            goto L_0x0108
        L_0x0128:
            boolean r0 = r9.isGroupCall
            if (r0 != 0) goto L_0x01a0
            X.6qE r4 = r9.getDefaultPeerInfo()
            X.C17960vV.A07(r4)
            java.lang.String r8 = r10.A0c(r4, r9)
            if (r8 != 0) goto L_0x00ef
            int r0 = X.AnonymousClass73H.A00(r4)
            r8 = 0
            if (r0 != 0) goto L_0x00ef
            com.whatsapp.jid.UserJid r2 = r4.A0A
            X.1Me r1 = r10.A15
            X.1M9 r0 = r10.A12
            X.1E7 r0 = r0.A0H(r2)
            java.lang.String r2 = X.AnonymousClass3MY.A0q(r1, r0)
            boolean r0 = r9.videoEnabled
            if (r0 != 0) goto L_0x015e
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x00ef
        L_0x0156:
            r1 = 2131898266(0x7f122f9a, float:1.9431445E38)
        L_0x0159:
            java.lang.String r8 = X.C17890vO.A0R(r10, r2, r7, r6, r1)
            goto L_0x00ef
        L_0x015e:
            int r3 = r4.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r3, r0)
            if (r0 == 0) goto L_0x0176
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x0172
            boolean r0 = r9.isGroupCall
            r1 = 2131898267(0x7f122f9b, float:1.9431447E38)
            if (r0 == 0) goto L_0x0159
        L_0x0172:
            r1 = 2131898273(0x7f122fa1, float:1.943146E38)
            goto L_0x0159
        L_0x0176:
            r1 = 2
            if (r3 != r1) goto L_0x0188
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x0184
            boolean r0 = r9.isGroupCall
            r1 = 2131898269(0x7f122f9d, float:1.943145E38)
            if (r0 == 0) goto L_0x0159
        L_0x0184:
            r1 = 2131898272(0x7f122fa0, float:1.9431457E38)
            goto L_0x0159
        L_0x0188:
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x019b
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x019b
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x00ef
            int r0 = r9.getConnectedParticipantsCount()
            if (r0 != r1) goto L_0x00ef
            goto L_0x0156
        L_0x019b:
            r0 = 2131897839(0x7f122def, float:1.9430579E38)
            goto L_0x00eb
        L_0x01a0:
            r8 = r5
            goto L_0x00ef
        L_0x01a3:
            boolean r0 = r9.isJoinableGroupCall
            r1 = 2131898118(0x7f122f06, float:1.9431145E38)
            if (r0 == 0) goto L_0x0204
        L_0x01aa:
            r1 = 2131898234(0x7f122f7a, float:1.943138E38)
            goto L_0x0204
        L_0x01ae:
            X.0ve r2 = r10.A0E
            boolean r0 = r9.isGroupCall
            if (r0 != 0) goto L_0x01c0
            r1 = 5923(0x1723, float:8.3E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01c0
            goto L_0x0065
        L_0x01c0:
            boolean r4 = r9.isAudioChat()
            com.whatsapp.jid.GroupJid r3 = r9.groupJid
            X.1M9 r2 = r10.A12
            X.1Mc r1 = r10.A1M
            X.126 r0 = r10.A1J
            X.1E7 r0 = X.C63982u1.A01(r2, r0, r3, r1, r4)
            if (r0 == 0) goto L_0x01f6
            X.1M9 r1 = r10.A12
            com.whatsapp.jid.UserJid r0 = X.C108955ca.A0T(r9)
            X.1E7 r3 = r1.A0H(r0)
            boolean r0 = r9.videoEnabled
            r2 = 2131890361(0x7f1210b9, float:1.9415412E38)
            if (r0 != 0) goto L_0x01e6
            r2 = 2131890362(0x7f1210ba, float:1.9415414E38)
        L_0x01e6:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.1Me r0 = r10.A15
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r3)
            java.lang.String r8 = X.C17880vN.A0q(r10, r0, r1, r6, r2)
        L_0x01f2:
            r1 = r5
            r5 = r8
            goto L_0x005d
        L_0x01f6:
            boolean r1 = r9.isGroupCall
            boolean r0 = r9.videoEnabled
            if (r1 == 0) goto L_0x0209
            r1 = 2131891167(0x7f1213df, float:1.9417046E38)
            if (r0 != 0) goto L_0x0204
            r1 = 2131891176(0x7f1213e8, float:1.9417065E38)
        L_0x0204:
            java.lang.String r8 = r10.getString(r1)
            goto L_0x01f2
        L_0x0209:
            r1 = 2131897837(0x7f122ded, float:1.9430575E38)
            if (r0 != 0) goto L_0x0204
            r1 = 2131898117(0x7f122f05, float:1.9431143E38)
            goto L_0x0204
        L_0x0212:
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x006e
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x006e
            A1R(r10)
            goto L_0x006e
        L_0x0221:
            boolean r0 = r10.A2E
            if (r0 != 0) goto L_0x0018
            r0 = 2131898100(0x7f122ef4, float:1.9431108E38)
            java.lang.String r0 = r10.getString(r0)
            r10.A4o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1K(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.Be0() == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r3 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1M(com.whatsapp.voipcalling.CallInfo r4, com.whatsapp.voipcalling.VoipActivityV2 r5) {
        /*
            boolean r3 = A27(r5)
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r5.A0t
            if (r0 == 0) goto L_0x0018
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x0018
            if (r3 != 0) goto L_0x0018
            java.lang.String r0 = "Screen sharing active, skip capture pause"
        L_0x0014:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0017:
            return
        L_0x0018:
            X.8At r0 = r5.A0n
            r2 = 1
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.Be0()
            r1 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            boolean r0 = r5.A29
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x0040
            if (r3 == 0) goto L_0x0038
        L_0x002d:
            X.1HQ r0 = r5.A0Y
            com.whatsapp.voipcalling.CallInfo r0 = r0.BO3()
            X.2gu r0 = r0.callWaitingInfo
            boolean r0 = r0.A08
            r2 = r2 ^ r0
        L_0x0038:
            X.A99 r0 = r5.A0u
            if (r0 == 0) goto L_0x0068
            r0.A1A(r3, r2)
            return
        L_0x0040:
            if (r3 != 0) goto L_0x002d
            boolean r0 = r4.isCallOnHold()
            if (r0 != 0) goto L_0x0017
            X.A99 r3 = r5.A0u
            if (r3 == 0) goto L_0x005b
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A1E
            if (r2 == 0) goto L_0x0017
            r1 = 33
            X.7Pb r0 = new X.7Pb
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x005b:
            X.1HQ r0 = r5.A0Y
            X.1HR r0 = (X.AnonymousClass1HR) r0
            boolean r0 = X.AnonymousClass1HR.A00(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "VoipNative/startVideoCaptureStream skipping as call ended or ending"
            goto L_0x0014
        L_0x0068:
            com.whatsapp.voipcalling.Voip.stopVideoCaptureStream(r3, r2)
            return
        L_0x006c:
            com.whatsapp.voipcalling.Voip.startVideoCaptureStream()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1M(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A1X(VoipActivityV2 voipActivityV2) {
        CallInfo A0Q2 = A0Q(voipActivityV2);
        if (A0Q2 != null && A0Q2.callState != CallState.LINK) {
            UserJid A0T2 = C108955ca.A0T(A0Q2);
            boolean z = A0Q2.videoEnabled;
            int i = -1;
            if (A0Q2.isPeerRequestingUpgrade()) {
                i = 2;
            }
            A1w(A0T2, voipActivityV2, i, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1a(com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            com.whatsapp.voipcalling.CallInfo r2 = A0Q(r4)
            if (r2 == 0) goto L_0x0048
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0048
            boolean r0 = r4.A2L
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4.A2J
            if (r0 == 0) goto L_0x0048
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0048
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0048
            java.util.Map r0 = r2.participants
            java.util.Iterator r2 = X.C17890vO.A0l(r0)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x003b
            int r1 = r1.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x0022
        L_0x003b:
            android.os.Handler r0 = r4.A05
            r3 = 3
            r0.removeMessages(r3)
            android.os.Handler r2 = r4.A05
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1a(com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A1b(VoipActivityV2 voipActivityV2) {
        if (!A23(voipActivityV2) || !A1y(A0Q(voipActivityV2), voipActivityV2)) {
            voipActivityV2.finish();
            if (voipActivityV2.getIntent().getBooleanExtra("isTaskRoot", true)) {
                voipActivityV2.startActivity(AnonymousClass1LU.A02(voipActivityV2));
            }
        }
    }

    public static void A1c(VoipActivityV2 voipActivityV2) {
        boolean z;
        int i;
        int i2;
        CallInfo A0Q2 = A0Q(voipActivityV2);
        if (A0Q2 != null) {
            if (voipActivityV2.A2E || (!voipActivityV2.A2j && A0Q2.videoEnabled && A0Q2.getConnectedParticipantsCount() <= 2)) {
                z = true;
            } else {
                z = false;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) voipActivityV2.A0e.getLayoutParams();
            layoutParams.removeRule(3);
            if (z) {
                voipActivityV2.A0g.A0W(0, 0);
            } else if (A0Q2.videoEnabled || !voipActivityV2.A2D) {
                if (voipActivityV2.A2j) {
                    i = 0;
                } else {
                    i = voipActivityV2.A2O;
                }
                voipActivityV2.A0g.A0W(voipActivityV2.A2P, i);
            } else {
                layoutParams.addRule(3, 2131428733);
                Resources resources = voipActivityV2.getResources();
                int i3 = 2131168774;
                if (C108995ce.A1a(voipActivityV2)) {
                    i3 = 2131168777;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i3);
                if (voipActivityV2.A2j) {
                    i2 = 0;
                } else {
                    i2 = voipActivityV2.A2O;
                }
                voipActivityV2.A0g.A0W(dimensionPixelSize, i2);
            }
            voipActivityV2.A0u();
            voipActivityV2.A0e.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r3.self.A0N == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010c, code lost:
        if (r3 == 2) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1f(com.whatsapp.voipcalling.VoipActivityV2 r10, int r11) {
        /*
            com.whatsapp.voipcalling.CallInfo r3 = A0Q(r10)
            if (r3 == 0) goto L_0x0014
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0014
            boolean r0 = r3.callEnding
            if (r0 != 0) goto L_0x0014
            boolean r0 = r10.A2g
            if (r0 == 0) goto L_0x0026
        L_0x0014:
            X.0ve r2 = r10.A0E
            r1 = 9746(0x2612, float:1.3657E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "onOrientationChanged while call is ending, skip"
        L_0x0022:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0026:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onOrientationChanged/orientation = "
            X.C17900vP.A0j(r0, r1, r11)
            X.0ve r1 = r10.A0E
            r0 = 3153(0xc51, float:4.418E-42)
            X.0vf r6 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r6, r1, r0)
            r0 = 4
            if (r1 < r0) goto L_0x0049
            if (r3 == 0) goto L_0x0049
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x0049
            X.6qE r0 = r3.self
            boolean r0 = r0.A0N
            r5 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            int r3 = r10.A03()
            if (r5 == 0) goto L_0x006b
            X.00H r0 = r10.A1o
            java.lang.Object r2 = r0.get()
            X.9g9 r2 = (X.C187649g9) r2
            boolean r1 = r10.A2E
            boolean r0 = X.AnonymousClass000.A1P(r3)
            if (r1 == 0) goto L_0x01d0
            if (r0 != 0) goto L_0x01d0
            X.6uK r1 = r2.A05
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x006b
            r1.A02()
        L_0x006b:
            int r0 = r11 + r3
            int r4 = r0 % 4
            X.0vp r0 = r10.A26
            boolean r0 = X.C72463Mc.A1Z(r0)
            r3 = 0
            if (r0 == 0) goto L_0x00c7
            android.content.ContentResolver r1 = r10.getContentResolver()
            java.lang.String r0 = "accelerometer_rotation"
            int r9 = android.provider.Settings.System.getInt(r1, r0, r3)
            if (r5 == 0) goto L_0x00b9
            X.00H r0 = r10.A1o
            java.lang.Object r2 = r0.get()
            X.9g9 r2 = (X.C187649g9) r2
            boolean r5 = X.AnonymousClass000.A1P(r9)
            int r0 = r2.A00
            if (r11 == r0) goto L_0x00b9
            r7 = 1
            if (r5 == 0) goto L_0x009d
            long r0 = r2.A01
            long r0 = r0 + r7
            r2.A01 = r0
        L_0x009d:
            long r0 = r2.A02
            long r0 = r0 + r7
            r2.A02 = r0
            r1 = 1
            if (r11 == r1) goto L_0x00a9
            r0 = 3
            if (r11 == r0) goto L_0x00a9
            r1 = 0
        L_0x00a9:
            X.6uK r0 = r2.A03
            if (r1 == 0) goto L_0x01c6
            r0.A02()
            if (r5 == 0) goto L_0x00b7
            X.6uK r0 = r2.A04
            r0.A02()
        L_0x00b7:
            r2.A00 = r11
        L_0x00b9:
            X.0ve r1 = r10.A0E
            r0 = 3538(0xdd2, float:4.958E-42)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x00c7
            if (r9 != 0) goto L_0x00c7
            r11 = 0
            r4 = 0
        L_0x00c7:
            X.8At r0 = r10.A0n
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r0.Be0()
            if (r0 == 0) goto L_0x01c3
        L_0x00d1:
            int r7 = r3 * 90
            X.0vp r0 = r10.A27
            boolean r0 = X.C72463Mc.A1Z(r0)
            java.lang.String r5 = "update_voip_orientation"
            if (r0 != 0) goto L_0x00f0
            X.0vp r0 = r10.A26
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x01a8
            X.0ve r1 = r10.A0E
            r0 = 3153(0xc51, float:4.418E-42)
            int r1 = X.C18020vd.A00(r6, r1, r0)
            r0 = 3
            if (r1 < r0) goto L_0x01a8
        L_0x00f0:
            X.7Pf r2 = new X.7Pf
            r2.<init>(r7, r4)
            X.0ve r1 = r10.A0E
            r0 = 8679(0x21e7, float:1.2162E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x01a3
            X.10I r0 = r10.A05
            r0.CGS(r2, r5)
        L_0x0104:
            boolean r0 = r10.A2E
            if (r0 == 0) goto L_0x010e
            if (r3 == r4) goto L_0x010e
            r0 = 2
            r5 = 1
            if (r3 != r0) goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r6 = r10.A0g
            X.11S r1 = r6.A0V
            X.4Sa r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r6)
            boolean r0 = r0.A0N
            com.whatsapp.jid.UserJid r2 = X.C40811vJ.A01(r1, r0)
            if (r2 == 0) goto L_0x013e
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0198
            java.util.LinkedHashMap r0 = r6.A18
            int r1 = r0.size()
            r0 = 2
            if (r1 > r0) goto L_0x0198
            com.whatsapp.jid.UserJid r0 = r6.A07
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0198
            X.AfC r1 = r6.A0b
            r0 = 0
            X.DRB r0 = X.C21141AfC.A00(r1, r2, r0)
            r0.setScaleType(r5)
        L_0x013e:
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r10.A1c
            r0.updateCameraPreviewOrientation()
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = r10.A0b
            if (r0 == 0) goto L_0x0166
            X.00H r0 = r10.A1h
            java.lang.Object r1 = r0.get()
            X.9l5 r1 = (X.C190519l5) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0166
            X.0ve r2 = r1.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 9382(0x24a6, float:1.3147E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0166
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = r10.A0b
            r0.A0c(r3)
        L_0x0166:
            X.0vp r0 = r10.A25
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0193
            r4 = 0
            r0 = 0
        L_0x0170:
            r10.A12(r4, r0)
            X.735 r4 = r10.A0w
            if (r4 == 0) goto L_0x018a
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x018a
            X.1vp r0 = r4.A0B
            java.lang.Object r2 = r0.A06()
            X.72C r2 = (X.AnonymousClass72C) r2
            boolean r1 = r2.A06
            boolean r0 = r2.A01
            X.AnonymousClass72C.A00(r4, r2, r3, r1, r0)
        L_0x018a:
            X.8Ag r0 = r10.A0m
            r0.Bzi()
            java.lang.String r0 = "onOrientationChanged/complete"
            goto L_0x0022
        L_0x0193:
            float r0 = X.C88234Yw.A00(r4)
            goto L_0x0170
        L_0x0198:
            X.AfC r0 = r6.A0b
            r1 = 0
            X.DRB r0 = X.C21141AfC.A00(r0, r2, r1)
            r0.setScaleType(r1)
            goto L_0x013e
        L_0x01a3:
            r2.run()
            goto L_0x0104
        L_0x01a8:
            r0 = 4
            X.Aij r2 = new X.Aij
            r2.<init>(r7, r0)
            X.0ve r1 = r10.A0E
            r0 = 8679(0x21e7, float:1.2162E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x01be
            X.10I r0 = r10.A05
            r0.CGS(r2, r5)
            goto L_0x013e
        L_0x01be:
            r2.run()
            goto L_0x013e
        L_0x01c3:
            r3 = r11
            goto L_0x00d1
        L_0x01c6:
            r0.A00()
            X.6uK r0 = r2.A04
            r0.A00()
            goto L_0x00b7
        L_0x01d0:
            X.6uK r0 = r2.A05
            r0.A00()
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1f(com.whatsapp.voipcalling.VoipActivityV2, int):void");
    }

    public static void A1l(VoipActivityV2 voipActivityV2, boolean z) {
        float[] A1V2 = C108945cZ.A1V();
        float f = 0.0f;
        A1V2[0] = C108975cc.A00(z ? 1 : 0);
        if (z) {
            f = 1.0f;
        }
        A1V2[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V2);
        if (voipActivityV2.A0f != null) {
            C109195cy.A02(ofFloat, voipActivityV2, 40);
            C1411074h.A00(ofFloat, voipActivityV2, 42);
        }
        ofFloat.setDuration(600);
        ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat.start();
        if (!z && voipActivityV2.getResources() != null && voipActivityV2.A1b != null) {
            int dimensionPixelSize = voipActivityV2.getResources().getDimensionPixelSize(2131165594);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1b;
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.0f);
            C1407973c r3 = voipCallControlBottomSheetV2.A0K;
            if (r3 != null) {
                r3.A06(decelerateInterpolator, 100, 150, 0, dimensionPixelSize);
            }
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV22 = voipActivityV2.A1b;
            DecelerateInterpolator decelerateInterpolator2 = new DecelerateInterpolator(2.0f);
            C1407973c r4 = voipCallControlBottomSheetV22.A0K;
            if (r4 != null) {
                r4.A06(decelerateInterpolator2, 300, 250, dimensionPixelSize, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r1.A08 != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r0 == false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1m(com.whatsapp.voipcalling.VoipActivityV2 r4, boolean r5) {
        /*
            com.whatsapp.voipcalling.CallInfo r3 = A0Q(r4)
            if (r3 == 0) goto L_0x0022
            r1 = 4
            if (r5 == 0) goto L_0x000a
            r1 = 5
        L_0x000a:
            r0 = 3
            A1h(r4, r0, r1)
            X.1VF r1 = r4.A0c
            X.1VH r0 = X.AnonymousClass1VH.ADD_PARTICIPANT
            r1.A00(r0)
            boolean r0 = X.C108995ce.A1a(r4)
            if (r0 == 0) goto L_0x0023
            boolean r0 = r3.isGroupCall
            if (r0 == 0) goto L_0x0023
            r4.A0x()
        L_0x0022:
            return
        L_0x0023:
            X.1VE r0 = r4.A0Z
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r0 = "screen_sharing_backward_compat_shown"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0042
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r4.A0g
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0042
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x0042
            boolean r0 = r1.A08
            r2 = 1
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            boolean r0 = A20(r3, r4)
            if (r2 != 0) goto L_0x004f
            if (r0 != 0) goto L_0x0052
            A1P(r3, r4, r5)
            return
        L_0x004f:
            r1 = 0
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            java.lang.String r0 = "voipactivityv2/onAddParticipantButtonClicked/ backward compat conditions should be exclusive"
            X.C17960vV.A0F(r1, r0)
            r1 = 2
            X.AGp r0 = new X.AGp
            r0.<init>(r3, r4, r1, r5)
            A17(r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1m(com.whatsapp.voipcalling.VoipActivityV2, boolean):void");
    }

    private void A1p(String str) {
        C17900vP.A0f("voip/VoipActivityV2/showCallFailedMessage ", str, AnonymousClass000.A10());
        if (str != null) {
            A4l();
            MessageDialogFragment A002 = AnonymousClass4Fw.A00(new C98414r6(this, 2), str);
            this.A0Q = A002;
            A4h(A002, "MessageDialogFragment");
            return;
        }
        C17960vV.A0F(false, "call failed message not defined");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0090, code lost:
        if (r9.getRepeatCount() == 0) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A1v(int r8, android.view.KeyEvent r9) {
        /*
            r7 = this;
            com.whatsapp.voipcalling.CallInfo r6 = A0Q(r7)
            X.A99 r5 = r7.A0u
            r3 = 0
            if (r5 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r2 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r4 = 1
            if (r2 != r0) goto L_0x003d
            r0 = 24
            if (r8 == r0) goto L_0x00af
            r0 = 25
            if (r8 == r0) goto L_0x00af
            r0 = 91
            if (r8 == r0) goto L_0x00af
            r0 = 164(0xa4, float:2.3E-43)
            if (r8 == r0) goto L_0x00af
            r0 = 5
            if (r8 == r0) goto L_0x00a4
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L_0x00a4
            r0 = 79
            if (r8 == r0) goto L_0x00a4
            r0 = 85
            if (r8 == r0) goto L_0x00a4
            r0 = 6
            if (r8 == r0) goto L_0x0099
            r0 = 86
            if (r8 == r0) goto L_0x0099
        L_0x003c:
            return r3
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            java.lang.String r1 = "voip/VoipActivityV2/handleKeyActon end call from remote control"
            if (r2 != r0) goto L_0x005a
            r0 = 5
            if (r8 == r0) goto L_0x00b5
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L_0x00b5
            r0 = 79
            if (r8 == r0) goto L_0x00b5
            r0 = 85
            if (r8 == r0) goto L_0x00b5
            r0 = 6
            if (r8 == r0) goto L_0x0092
            r0 = 86
            if (r8 == r0) goto L_0x0092
            return r3
        L_0x005a:
            r0 = 6
            if (r8 == r0) goto L_0x0092
            r0 = 86
            if (r8 == r0) goto L_0x0092
            r0 = 79
            if (r8 == r0) goto L_0x008c
            r0 = 85
            if (r8 == r0) goto L_0x008c
            r0 = 24
            if (r8 == r0) goto L_0x00c0
            r0 = 25
            if (r8 == r0) goto L_0x00c1
            r0 = 131(0x83, float:1.84E-43)
            if (r8 != r0) goto L_0x0080
            java.lang.String r0 = "Should be used for automation only"
            X.C17960vV.A0F(r3, r0)
            java.lang.String r0 = "it can only be used in smoke or automation"
            X.C17960vV.A0F(r3, r0)
            return r3
        L_0x0080:
            r0 = 4
            if (r8 != r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 != r0) goto L_0x003c
            r0 = 2
            r7.CEC(r0)
            return r3
        L_0x008c:
            int r0 = r9.getRepeatCount()
            if (r0 != 0) goto L_0x003c
        L_0x0092:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            A1T(r7)
            return r4
        L_0x0099:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon reject call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 9
            r7.CEC(r0)
            return r4
        L_0x00a4:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon accept call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 8
            A1e(r7, r0)
            return r4
        L_0x00af:
            X.A7v r0 = r5.A0X
            r0.A06()
            return r4
        L_0x00b5:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon start call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = X.AnonymousClass6Z8.A09
            A1O(r6, r7, r0)
            return r4
        L_0x00c0:
            r3 = 1
        L_0x00c1:
            X.00H r0 = r5.A35
            java.lang.Object r4 = r0.get()
            X.6wm r4 = (X.C138256wm) r4
            X.0ve r2 = r5.A2p
            r1 = 2903(0xb57, float:4.068E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e7
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r5.A1E
        L_0x00d7:
            X.0vl r0 = r4.A03
            java.lang.Object r5 = r0.getValue()
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            r1 = 0
            if (r5 == 0) goto L_0x0141
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0141
            goto L_0x00e9
        L_0x00e7:
            r2 = 0
            goto L_0x00d7
        L_0x00e9:
            int r6 = r5.getStreamMaxVolume(r1)     // Catch:{ Exception -> 0x013b }
            int r5 = r5.getStreamVolume(r1)     // Catch:{ Exception -> 0x013b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = "AudioLevelController/adjustVoipStackAudioLevel direction "
            r1.append(r0)     // Catch:{ Exception -> 0x013b }
            if (r3 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            java.lang.String r0 = "DOWN"
            goto L_0x0102
        L_0x0100:
            java.lang.String r0 = "UP"
        L_0x0102:
            r1.append(r0)     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = ", volume "
            r1.append(r0)     // Catch:{ Exception -> 0x013b }
            r1.append(r5)     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = ", maxVolume "
            X.C17900vP.A0j(r0, r1, r6)     // Catch:{ Exception -> 0x013b }
            if (r3 == 0) goto L_0x012c
            if (r5 != r6) goto L_0x0141
            int r1 = r4.A00     // Catch:{ Exception -> 0x013b }
            int r0 = r4.A01     // Catch:{ Exception -> 0x013b }
            int r0 = r0 + 192
            if (r1 <= r0) goto L_0x0124
            java.lang.String r0 = "AudioLevelController/adjustVoipStackAudioLevel no-op, audio level is 192"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x013b }
            goto L_0x0141
        L_0x0124:
            int r0 = r1 + 32
            r4.A00 = r0     // Catch:{ Exception -> 0x013b }
            X.C138256wm.A00(r4, r2)     // Catch:{ Exception -> 0x013b }
            goto L_0x0141
        L_0x012c:
            int r1 = r4.A00     // Catch:{ Exception -> 0x013b }
            int r0 = r4.A01     // Catch:{ Exception -> 0x013b }
            if (r1 <= r0) goto L_0x0141
            int r0 = r1 + -32
            r4.A00 = r0     // Catch:{ Exception -> 0x013b }
            X.C138256wm.A00(r4, r2)     // Catch:{ Exception -> 0x013b }
            r0 = 1
            return r0
        L_0x013b:
            r1 = move-exception
            java.lang.String r0 = "AudioLevelController/adjustVoipStackAudioLevel failed to set audio level"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0141:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1v(int, android.view.KeyEvent):boolean");
    }

    public static boolean A1w(UserJid userJid, VoipActivityV2 voipActivityV2, int i, boolean z) {
        voipActivityV2.A0r();
        boolean z2 = !voipActivityV2.A1C.A0E();
        boolean A0A2 = AnonymousClass74H.A0A(voipActivityV2.A1C, voipActivityV2.A1O, z);
        boolean A1O2 = AnonymousClass000.A1O(voipActivityV2.A1C.A0J() ? 1 : 0);
        if (!A0A2 && !z2 && !A1O2) {
            return true;
        }
        if (i == -1) {
            if (z2) {
                i = 0;
            } else {
                i = 3;
                if (A0A2) {
                    i = 4;
                }
            }
        }
        PermissionDialogFragment A002 = PermissionDialogFragment.A00(userJid, i, z2, A0A2, A1O2);
        C34001jj A0H2 = AnonymousClass3Ma.A0H(voipActivityV2);
        A0H2.A0B(A002, "permission_request");
        A0H2.A04();
        return false;
    }

    public static boolean A26(VoipActivityV2 voipActivityV2) {
        return AnonymousClass6Z8.A08.equals(voipActivityV2.getIntent().getAction());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r3.callId.equals(r5.A21) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A27(com.whatsapp.voipcalling.VoipActivityV2 r5) {
        /*
            boolean r0 = A26(r5)
            r4 = 0
            if (r0 != 0) goto L_0x0011
            com.whatsapp.calling.areffects.CallArEffectsViewModel r1 = r5.A0b
            if (r1 == 0) goto L_0x0010
            boolean r0 = r5.A28
            r1.A0l(r4, r0)
        L_0x0010:
            return r4
        L_0x0011:
            X.1HQ r0 = r5.A0Y
            com.whatsapp.voipcalling.CallInfo r3 = r0.BO3()
            if (r3 == 0) goto L_0x0024
            java.lang.String r1 = r3.callId
            java.lang.String r0 = r5.A21
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            com.whatsapp.calling.areffects.CallArEffectsViewModel r1 = r5.A0b
            if (r1 == 0) goto L_0x0037
            if (r2 == 0) goto L_0x0032
            X.2gu r0 = r3.callWaitingInfo
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0032
            r4 = 1
        L_0x0032:
            boolean r0 = r5.A28
            r1.A0l(r4, r0)
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A27(com.whatsapp.voipcalling.VoipActivityV2):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r0.getVisibility() != 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r0.getVisibility() != 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A28(com.whatsapp.voipcalling.VoipActivityV2 r6) {
        /*
            boolean r0 = r6.isFinishing()
            r5 = 0
            if (r0 != 0) goto L_0x0012
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r6.A1b
            r4 = 1
            if (r2 == 0) goto L_0x0013
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r6.A16
            if (r0 == 0) goto L_0x00af
            r6.A2l = r4
        L_0x0012:
            return r5
        L_0x0013:
            X.73p r0 = r6.A0k
            if (r0 == 0) goto L_0x0012
            boolean r0 = X.C108995ce.A1a(r6)
            if (r0 == 0) goto L_0x0012
            X.5wM r0 = r6.A0a
            if (r0 == 0) goto L_0x0028
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            android.view.ViewGroup r0 = r6.A0F
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            boolean r0 = r6.A4k()
            if (r0 != 0) goto L_0x0012
            com.whatsapp.jid.UserJid r0 = r6.A1K
            if (r0 != 0) goto L_0x0012
            if (r2 != 0) goto L_0x0012
            if (r1 != 0) goto L_0x0012
            r6.A2L = r4
            boolean r0 = r6.A2h
            if (r0 != 0) goto L_0x005a
            X.0ve r2 = r6.A0E
            r1 = 11525(0x2d05, float:1.615E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0058
            A1X(r6)
        L_0x0058:
            r6.A2h = r4
        L_0x005a:
            A1a(r6)
            X.73p r1 = r6.A0k
            boolean r0 = r1.A01
            r3 = 0
            if (r0 != 0) goto L_0x007d
            X.1bI r0 = r1.A06
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x007d
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x007d
            com.whatsapp.calling.controls.view.CallControlCard r0 = r1.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x007e
            X.C1409273p.A01(r1, r4)
        L_0x007d:
            return r3
        L_0x007e:
            r0 = 0
            r2 = 250(0xfa, double:1.235E-321)
            X.C1409273p.A00(r0, r1, r2, r4, r5)
            r3 = 1
            X.735 r0 = r6.A0w
            if (r0 == 0) goto L_0x007d
            X.0ve r1 = r6.A0E
            r0 = 9220(0x2404, float:1.292E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x00a9
            X.0ve r1 = r6.A0E
            r0 = 10274(0x2822, float:1.4397E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x00a9
            X.0ve r1 = r6.A0E
            r0 = 10275(0x2823, float:1.4398E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x007d
        L_0x00a9:
            X.735 r0 = r6.A0w
            r0.A03(r4)
            return r3
        L_0x00af:
            X.1GP r1 = r6.getSupportFragmentManager()
            java.lang.String r0 = "CallControlSheet"
            r2.A2C(r1, r0)
            X.735 r1 = r6.A0w
            if (r1 == 0) goto L_0x00c2
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r6.A1b
            android.view.View r0 = r0.A0A
            r1.A00 = r0
        L_0x00c2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A28(com.whatsapp.voipcalling.VoipActivityV2):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r3.A06.A01() == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r4 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A2A(com.whatsapp.voipcalling.VoipActivityV2 r7, boolean r8, boolean r9) {
        /*
            com.whatsapp.voipcalling.CallInfo r3 = A0Q(r7)
            X.73p r2 = r7.A0k
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            int r1 = r7.A00
            X.0ve r0 = r7.A0E
            boolean r0 = r2.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0015
            if (r9 == 0) goto L_0x00ad
        L_0x0015:
            boolean r0 = X.C108995ce.A1a(r7)
            if (r0 == 0) goto L_0x00ad
            if (r9 == 0) goto L_0x0020
            A29(r7, r5)
        L_0x0020:
            X.73p r2 = r7.A0k
            int r1 = r7.A00
            X.0ve r0 = r7.A0E
            boolean r0 = r2.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x005a
            X.73p r2 = r7.A0k
            boolean r0 = r2.A01
            r4 = 0
            if (r0 != 0) goto L_0x0043
            if (r9 != 0) goto L_0x0044
            X.1bI r0 = r2.A06
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            return r4
        L_0x0044:
            com.whatsapp.calling.controls.view.CallControlCard r0 = r2.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00a9
            if (r8 == 0) goto L_0x0057
            r3 = 200(0xc8, double:9.9E-322)
        L_0x0050:
            r1 = 0
            r6 = r5
            X.C1409273p.A00(r1, r2, r3, r5, r6)
            r4 = 1
            goto L_0x007f
        L_0x0057:
            r3 = 0
            goto L_0x0050
        L_0x005a:
            X.73p r3 = r7.A0k
            com.whatsapp.calling.controls.view.CallControlCard r2 = r3.A03
            int r0 = r2.getVisibility()
            if (r0 == 0) goto L_0x006d
            X.1bI r0 = r3.A06
            int r0 = r0.A01()
            r4 = 0
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r4 = 1
        L_0x006e:
            r1 = 8
            r2.setVisibility(r1)
            X.1bI r0 = r3.A05
            r0.A04(r1)
            X.1bI r0 = r3.A06
            r0.A04(r1)
            if (r4 == 0) goto L_0x0043
        L_0x007f:
            X.735 r0 = r7.A0w
            if (r0 == 0) goto L_0x0043
            X.0ve r1 = r7.A0E
            r0 = 9220(0x2404, float:1.292E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x00a3
            X.0ve r1 = r7.A0E
            r0 = 10274(0x2822, float:1.4397E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x00a3
            X.0ve r1 = r7.A0E
            r0 = 10275(0x2823, float:1.4398E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0043
        L_0x00a3:
            X.735 r0 = r7.A0w
            r0.A03(r5)
            return r4
        L_0x00a9:
            X.C1409273p.A01(r2, r5)
            return r4
        L_0x00ad:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2A(com.whatsapp.voipcalling.VoipActivityV2, boolean, boolean):boolean");
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void A3H() {
        CallInfo A0Q2 = A0Q(this);
        if (A0Q2 != null) {
            int i = 10;
            if (A0Q2.videoEnabled) {
                i = 11;
            }
            ((C36421nr) this.A1s.get()).A00(i, 0);
        }
    }

    public Class BN9() {
        return CallArEffectsViewModel.class;
    }

    public C18180vt BYS() {
        return C19620yd.A01;
    }

    public void C0S(int i) {
        A99 a99;
        String str;
        int i2;
        A0r();
        if (this.A0u != null) {
            int intExtra = getIntent().getIntExtra("call_ui_action", 0);
            if (i == 0) {
                a99 = this.A0u;
                str = this.A21;
                i2 = 5;
            } else if (i == 1) {
                return;
            } else {
                if (i == 2) {
                    this.A0u.A0k(0);
                    return;
                } else if (i == 3) {
                    A99 a992 = this.A0u;
                    String str2 = this.A21;
                    a992.A1V = true;
                    a992.A0m(0, intExtra, str2, (String) null);
                    return;
                } else if (i != 4) {
                    C17960vV.A0F(false, "Unknown request code");
                    return;
                } else {
                    a99 = this.A0u;
                    str = this.A21;
                    i2 = 6;
                }
            }
            a99.A0m(i2, intExtra, str, "unavailable");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        if (r10 != 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0T(java.lang.String[] r9, int r10) {
        /*
            r8 = this;
            r8.A0r()
            com.whatsapp.voipcalling.CallInfo r5 = A0Q(r8)
            boolean r0 = X.C40811vJ.A0e(r5)
            if (r0 == 0) goto L_0x0042
            X.A99 r0 = r8.A0u
            if (r0 == 0) goto L_0x0042
            int r6 = r9.length
            r4 = 0
            r2 = 0
        L_0x0014:
            r3 = 1
            if (r2 >= r6) goto L_0x00e5
            r1 = r9[r2]
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e1
            r6 = 1
        L_0x0022:
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x00a7
            if (r10 == 0) goto L_0x009b
            if (r10 == r3) goto L_0x009b
            r0 = 2
            if (r10 == r0) goto L_0x009b
            r0 = 4
            if (r10 == r0) goto L_0x009b
        L_0x0032:
            if (r10 == r3) goto L_0x00e8
            r0 = 2
            if (r10 == r0) goto L_0x0087
            r0 = 3
            if (r10 == r0) goto L_0x0043
            r0 = 4
            if (r10 == r0) goto L_0x00aa
            java.lang.String r0 = "Unknown request code"
            X.C17960vV.A0F(r4, r0)
        L_0x0042:
            return
        L_0x0043:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r0)
            if (r0 == 0) goto L_0x0042
            X.A99 r6 = r8.A0u
            java.lang.String r5 = r8.A21
            boolean r0 = r6.A1G(r5)
            if (r0 != 0) goto L_0x0077
            android.telephony.TelephonyManager r7 = r6.A1s
            X.17x r0 = r6.A2e
            int r2 = X.C63982u1.A00(r7, r0)
            if (r2 == 0) goto L_0x006e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/acceptCall/cellularCallInProgress "
            X.C17900vP.A0k(r0, r1, r2)
            java.lang.String r0 = "busy"
            r6.A0m(r4, r3, r5, r0)
            return
        L_0x006e:
            if (r7 == 0) goto L_0x0077
            android.telephony.PhoneStateListener r1 = r6.A0N
            r0 = 32
            r7.listen(r1, r0)
        L_0x0077:
            X.0ve r2 = r6.A2p
            r1 = 9172(0x23d4, float:1.2853E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0042
            r6.A0o(r3, r5, r4)
            return
        L_0x0087:
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0042
            com.whatsapp.voipcalling.Voip.refreshVideoDevice()
            X.AfC r0 = r8.A0z
            r0.A06()
            X.A99 r0 = r8.A0u
            r0.A0T()
            return
        L_0x009b:
            X.1V7 r2 = r8.A0v
            java.lang.String r1 = "refresh_notification"
            X.A69 r0 = new X.A69
            r0.<init>(r1)
            r2.A00(r0)
        L_0x00a7:
            if (r10 == 0) goto L_0x00aa
            goto L_0x0032
        L_0x00aa:
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x00b8
            if (r6 == 0) goto L_0x00b8
            com.whatsapp.voipcalling.Voip.refreshVideoDevice()
            X.AfC r0 = r8.A0z
            r0.A06()
        L_0x00b8:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r0)
            if (r0 == 0) goto L_0x0042
            com.whatsapp.jid.UserJid r2 = X.C108955ca.A0T(r5)
            boolean r1 = r5.videoEnabled
            r0 = -1
            boolean r0 = A1w(r2, r8, r0, r1)
            if (r0 == 0) goto L_0x0042
            X.0ve r2 = r8.A0E
            r1 = 9172(0x23d4, float:1.2853E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0042
            X.A99 r1 = r8.A0u
            java.lang.String r0 = r8.A21
            r1.A0o(r3, r0, r4)
            return
        L_0x00e1:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x00e5:
            r6 = 0
            goto L_0x0022
        L_0x00e8:
            java.lang.String r0 = "voip/VoipActivityV2/onPermissionsGranted switching to video call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A99 r0 = r8.A0u
            r0.A0b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.C0T(java.lang.String[], int):void");
    }

    public void C2A(boolean z) {
        C17960vV.A02();
        Window window = getWindow();
        View childAt = AnonymousClass3MW.A0D(window.getDecorView(), 16908290).getChildAt(0);
        if (childAt == null) {
            Log.w("voip/voipactivity/ear-near - failed to get view.");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            Log.i("voip/voipactivity/ear-near. changing visibility of the window.");
            if (childAt.getVisibility() == 0) {
                attributes.flags |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                attributes.screenBrightness = 0.1f;
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
            this.A05.removeMessages(2);
            this.A05.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        Log.i("voip/voipactivity/ear-far. changing visibility of the window.");
        if (childAt.getVisibility() == 4) {
            attributes.flags &= -1025;
            attributes.screenBrightness = -1.0f;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
            childAt.setVisibility(0);
            window.setAttributes(attributes);
        }
        this.A05.removeMessages(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (X.C72463Mc.A1O(r0.A0A) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0.Be0() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQS(com.whatsapp.voipcalling.CallInfo r10, int r11, boolean r12) {
        /*
            r9 = this;
            X.C17960vV.A02()
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1b
            r3 = r10
            if (r0 == 0) goto L_0x003b
            com.whatsapp.calling.views.VoipCallFooter r2 = r0.A0T
            if (r2 == 0) goto L_0x003b
            X.A99 r0 = r9.A0u
            if (r0 == 0) goto L_0x0039
            java.lang.String r4 = r0.A1B
        L_0x0012:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r9.A0t
            if (r0 == 0) goto L_0x001f
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            X.8At r0 = r9.A0n
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.Be0()
            r8 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            r5 = r11
            r6 = r12
            r2.A05(r3, r4, r5, r6, r7, r8)
            X.735 r0 = r9.A0w
            if (r0 == 0) goto L_0x0038
        L_0x0035:
            r0.A02(r10)
        L_0x0038:
            return
        L_0x0039:
            r4 = 0
            goto L_0x0012
        L_0x003b:
            X.735 r0 = r9.A0w
            if (r0 == 0) goto L_0x0038
            boolean r0 = X.C108995ce.A1a(r9)
            if (r0 == 0) goto L_0x0038
            X.0ve r1 = r9.A0E
            r0 = 9220(0x2404, float:1.292E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x0065
            X.0ve r1 = r9.A0E
            r0 = 10274(0x2822, float:1.4397E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x0065
            X.0ve r1 = r9.A0E
            r0 = 10275(0x2823, float:1.4398E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0038
        L_0x0065:
            X.735 r0 = r9.A0w
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.CQS(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r4.A0Q != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        if (X.AnonymousClass4aO.A05(X.AnonymousClass3MW.A07(), r15, r1) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d2, code lost:
        if (r1 == false) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x0008
            r14.A06 = r15
        L_0x0008:
            boolean r7 = super.dispatchTouchEvent(r15)
            boolean r0 = X.C108995ce.A1a(r14)
            if (r0 == 0) goto L_0x0032
            X.1bI r1 = r14.A1R
            if (r1 == 0) goto L_0x0032
            int r0 = r14.A00
            r2 = 3
            if (r0 != r2) goto L_0x0032
            android.view.View r1 = r1.A02()
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0033
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            boolean r0 = X.AnonymousClass4aO.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x0033
        L_0x002f:
            A1a(r14)
        L_0x0032:
            return r7
        L_0x0033:
            r12 = 0
            r3 = 1
            X.1bI r1 = r14.A1T
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0047
            android.view.View r0 = r1.A02()
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r0
            boolean r0 = r0.A09(r15)
            if (r0 != 0) goto L_0x002f
        L_0x0047:
            com.whatsapp.calling.callgrid.view.CallGrid r6 = r14.A0e
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x0051
            r6.A0S = r12
        L_0x0051:
            boolean r5 = r6.A0V
            int r0 = r15.getAction()
            if (r0 == r3) goto L_0x005f
            int r0 = r15.getAction()
            if (r0 != r2) goto L_0x0061
        L_0x005f:
            r6.A0V = r12
        L_0x0061:
            com.whatsapp.calling.callgrid.view.PipViewContainer r4 = r6.A09
            if (r4 == 0) goto L_0x0087
            boolean r1 = r4.A0M
            int r0 = r15.getAction()
            if (r0 == r2) goto L_0x0073
            int r0 = r15.getAction()
            if (r0 != r3) goto L_0x0075
        L_0x0073:
            r4.A0M = r12
        L_0x0075:
            if (r1 == 0) goto L_0x0087
            X.0vp r0 = r4.A0H
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x002f
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x002f
        L_0x0087:
            boolean r0 = r6.A0S
            if (r0 != 0) goto L_0x002f
            if (r5 != 0) goto L_0x002f
            X.8At r0 = r14.A0n
            if (r0 == 0) goto L_0x0097
            boolean r0 = r0.CSB(r15)
            if (r0 != 0) goto L_0x002f
        L_0x0097:
            X.1bI r1 = r14.A1Q
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00b6
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x00b6
            X.1bI r0 = r14.A1Q
            android.view.View r1 = r0.A02()
            X.C18070vi.A0d(r1, r12)
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            boolean r0 = X.AnonymousClass4aO.A05(r0, r15, r1)
            if (r0 != 0) goto L_0x002f
        L_0x00b6:
            X.1bI r1 = r14.A1U
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00d4
            android.view.View r4 = r1.A02()
            com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer r4 = (com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer) r4
            boolean r1 = r4.A07
            int r0 = r15.getAction()
            if (r0 == r3) goto L_0x00d0
            int r0 = r15.getAction()
            if (r0 != r2) goto L_0x00d2
        L_0x00d0:
            r4.A07 = r12
        L_0x00d2:
            if (r1 != 0) goto L_0x002f
        L_0x00d4:
            X.5tL r0 = r14.A0o
            if (r0 == 0) goto L_0x0102
            X.1bI r1 = r0.A00
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0102
            android.view.View r0 = X.AnonymousClass3MX.A0D(r1)
            java.util.Iterator r4 = X.C99434so.A00(r0, r3)
        L_0x00e6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0102
            android.view.View r1 = X.AnonymousClass3MX.A0E(r4)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00e6
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            boolean r0 = X.AnonymousClass4aO.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x00e6
            goto L_0x002f
        L_0x0102:
            X.1bI r1 = r14.A1P
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0145
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0145
            X.1GP r1 = r14.getSupportFragmentManager()
            r0 = 2131427838(0x7f0b01fe, float:1.8477304E38)
            androidx.fragment.app.Fragment r5 = r1.A0O(r0)
            boolean r0 = r5 instanceof com.whatsapp.areffects.ArEffectsButtonHeaderFragment
            if (r0 == 0) goto L_0x0145
            com.whatsapp.areffects.ArEffectsButtonHeaderFragment r5 = (com.whatsapp.areffects.ArEffectsButtonHeaderFragment) r5
            android.view.View r1 = r5.A0B
            boolean r0 = r1 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x0145
            if (r1 == 0) goto L_0x0145
            java.util.Iterator r4 = X.C99434so.A00(r1, r3)
        L_0x012b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0145
            android.view.View r1 = X.AnonymousClass3MX.A0E(r4)
            X.0vl r0 = r5.A01
            java.lang.Object r0 = r0.getValue()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            boolean r0 = X.AnonymousClass4aO.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x012b
            goto L_0x002f
        L_0x0145:
            X.CIZ r0 = r14.A0M
            if (r0 == 0) goto L_0x0032
            android.view.GestureDetector r0 = r0.A00
            boolean r0 = r0.onTouchEvent(r15)
            if (r0 == 0) goto L_0x0032
            X.73p r0 = r14.A0k
            if (r0 == 0) goto L_0x0172
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0172
            X.73p r9 = r14.A0k
            r10 = 200(0xc8, double:9.9E-322)
            r1 = 2
            X.1bX r8 = new X.1bX
            r8.<init>()
            X.1bZ r0 = new X.1bZ
            r0.<init>(r1)
            r8.A0a(r0)
            r13 = r12
            X.C1409273p.A00(r8, r9, r10, r12, r13)
            return r7
        L_0x0172:
            boolean r0 = A29(r14, r3)
            if (r0 != 0) goto L_0x002f
            X.1bI r0 = r14.A1R
            int r1 = r0.A01()
            r0 = 8
            if (r1 != r0) goto L_0x018e
            boolean r0 = A28(r14)
            if (r0 == 0) goto L_0x0032
            r0 = 30
        L_0x018a:
            A1h(r14, r0, r2)
            return r7
        L_0x018e:
            boolean r0 = A2A(r14, r3, r12)
            if (r0 == 0) goto L_0x0032
            r0 = 31
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onAttachedToWindow() {
        int dimensionPixelSize;
        super.onAttachedToWindow();
        C125666bS r5 = this.A0X;
        Window window = getWindow();
        AnonymousClass1HO A0C2 = AnonymousClass1HF.A0C(window.getDecorView());
        if (A0C2 != null) {
            dimensionPixelSize = A0C2.A07(1).A03;
        } else {
            C17960vV.A0F(false, "getSystemStatusBarSize/ could not compute window insets");
            Context context = window.getContext();
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            Resources resources = context.getResources();
            if (identifier <= 0) {
                identifier = 2131168793;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        }
        r5.A00 = dimensionPixelSize;
        CallDetailsLayout callDetailsLayout = this.A0W;
        if (callDetailsLayout != null) {
            callDetailsLayout.setPadding(0, this.A0X.A00, 0, 0);
        }
        CallInfo A0Q2 = A0Q(this);
        if (A0Q2 != null) {
            A1n(this, A0Q2.videoEnabled);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CallGridViewModel callGridViewModel = this.A0g;
        if (callGridViewModel == null) {
            return;
        }
        if (C72463Mc.A1Z(callGridViewModel.A1A) || C72463Mc.A1Z(callGridViewModel.A1C)) {
            boolean A1T2 = AnonymousClass000.A1T(configuration.orientation, 2);
            C41111vp r1 = callGridViewModel.A0o;
            if (C72463Mc.A1O(r1) != A1T2) {
                AnonymousClass3MY.A1L(r1, A1T2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CallGrid callGrid = this.A0e;
        if (callGrid != null) {
            getLifecycle().A06(callGrid.A0h);
        }
        Handler handler = this.A05;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        CallDetailsLayout callDetailsLayout = this.A0W;
        if (callDetailsLayout != null) {
            callDetailsLayout.A0C.A02();
        }
        C23581Gv r1 = this.A2a;
        if (r1 != null) {
            this.A13.unregisterObserver(r1);
        }
        A99 a99 = this.A0u;
        if (a99 != null) {
            C17900vP.A0Y(a99, "voip/service/resetVoipUiIfEquals ", AnonymousClass000.A10());
            if (a99.A0f == this) {
                a99.A0f = null;
            }
        }
        A1q(false);
        Set<VideoPort> set = this.A0y.A02;
        for (VideoPort videoPort : set) {
            if (videoPort != null) {
                videoPort.release();
            }
        }
        set.clear();
        A0t();
        C28931bI r0 = this.A1V;
        if (r0 != null && r0.A01() == 0) {
            ((VoipInCallNotifBanner) this.A1V.A02()).A01();
            ((VoipInCallNotifBanner) this.A1V.A02()).A0I.A02();
        }
        C160958At r02 = this.A0n;
        if (r02 != null) {
            if (r02.Be0() && !C72463Mc.A1Z(this.A24)) {
                this.A0n.CFn();
            }
            this.A0n.onDestroy();
            this.A0n = null;
            this.A2A = false;
        }
        this.A1Z.unregisterObserver(this.A2r);
        try {
            CallArEffectsViewModel callArEffectsViewModel = this.A0b;
            if (callArEffectsViewModel != null) {
                C108945cZ.A0Q(callArEffectsViewModel.A0I).A09(this);
                C108945cZ.A0Q(this.A0b.A0F).A09(this);
            }
        } catch (IllegalStateException e) {
            Log.e("VoipActivityV2/onDestory failed to remove allArEffectsViewModel observers ", e);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C17900vP.A0Y(keyEvent, "voip/VoipActivityV2/onKeyDown ", AnonymousClass000.A10());
        boolean A1v2 = A1v(i, keyEvent);
        this.A2k = true;
        if (A1v2 || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/VoipActivityV2/onKeyUp ");
        A102.append(keyEvent);
        A102.append(", keyDownPressed: ");
        C17900vP.A0r(A102, this.A2k);
        if (this.A2k) {
            this.A2k = false;
            return super.onKeyUp(i, keyEvent);
        } else if (A1v(i, keyEvent) || super.onKeyUp(i, keyEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void onNewIntent(Intent intent) {
        String str;
        EndCallConfirmationDialogFragment endCallConfirmationDialogFragment;
        C28931bI r2;
        String action = intent.getAction();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/VoipActivityV2/onNewIntent ");
        A102.append(intent);
        A102.append(", action ");
        A102.append(action);
        A102.append(", is finishing ");
        C17900vP.A0r(A102, isFinishing());
        super.onNewIntent(intent);
        setIntent(intent);
        this.A2C = false;
        this.A2f = false;
        this.A21 = intent.getStringExtra("call_id");
        CallInfo A0Q2 = A0Q(this);
        if (A0Q2 != null) {
            if (this.A21 == null) {
                this.A21 = A0Q2.callId;
            }
            if (Voip.A0A(A0Q2.callState) && (r2 = this.A1S) != null && r2.A00 == null) {
                r2.A04(0);
                this.A0W = (CallDetailsLayout) this.A1S.A02();
            }
            CallHeaderViewModel callHeaderViewModel = this.A2Y;
            if (callHeaderViewModel != null) {
                AnonymousClass3VX.A00(callHeaderViewModel.A03, callHeaderViewModel);
            }
            CallGridViewModel callGridViewModel = this.A0g;
            if (callGridViewModel != null) {
                callGridViewModel.A0W.A0D(this.A21);
            }
            if (this.A0u == null) {
                this.A0v.A01(this);
            }
            ViewGroup viewGroup = this.A0F;
            boolean z = false;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                z = true;
            }
            if (z) {
                this.A05.removeMessages(9);
                if (A0Q2.videoEnabled) {
                    this.A0z.A06();
                }
            }
            A1L(A0Q2, this);
            if (AnonymousClass6Z8.A00.equals(action)) {
                A13(intent, A0Q2);
            } else if (AnonymousClass6Z8.A09.equals(action)) {
                A1O(A0Q2, this, action);
            } else if (AnonymousClass6Z8.A08.equals(action) || "join_call".equals(action)) {
                this.A0s.A01(A0Q2.callId);
                this.A28 = false;
                this.A2L = true;
                if (this.A16 != null) {
                    A1S(this);
                }
                A0t();
                A0v();
                ScreenShareViewModel screenShareViewModel = this.A0t;
                if (screenShareViewModel != null && C72463Mc.A1O(screenShareViewModel.A0A)) {
                    this.A0t.A0T(C122576Qx.PENDING_CALL_SCREEN);
                }
                C160958At r1 = this.A0n;
                if (r1 != null && r1.Be0()) {
                    r1.CFn();
                }
                A1N(A0Q2, this, 0);
                if (this.A2D && C108995ce.A1a(this)) {
                    C108955ca.A0L(this).A01(false);
                }
                this.A0v.A00(new A69("refresh_notification"));
            } else if (AnonymousClass6Z8.A07.equals(action)) {
                boolean booleanExtra = intent.getBooleanExtra("isGroupCall", false);
                String stringExtra = intent.getStringExtra("confirmationString");
                if (booleanExtra) {
                    Log.w("voip/VoipActivityV2/showGCEndCallConfirmationDialog.");
                    if (this.A0P != null) {
                        A4j("EndCallConfirmationDialogFragment");
                        this.A0P = null;
                    }
                    C18070vi.A0d(stringExtra, 1);
                    endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment(this);
                    C108985cd.A15(endCallConfirmationDialogFragment, "message", stringExtra);
                    this.A0P = endCallConfirmationDialogFragment;
                } else if (this.A0O == null && this.A11.A01()) {
                    Log.w("voip/VoipActivityV2/showEndCallConfirmationDialog.");
                    C18070vi.A0d(stringExtra, 1);
                    endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment(this);
                    C108985cd.A15(endCallConfirmationDialogFragment, "message", stringExtra);
                    this.A0O = endCallConfirmationDialogFragment;
                }
                A4h(endCallConfirmationDialogFragment, "EndCallConfirmationDialogFragment");
            } else {
                int i = 2;
                if (AnonymousClass6Z8.A03.equals(action)) {
                    A99 a99 = this.A0u;
                    if (a99 != null) {
                        A99.A0G(a99, (CallInfo) null, (String) null, 2);
                    }
                } else if ("com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL".equals(action)) {
                    A14(intent, A0Q2);
                } else if ("ACTION_AUTOMATION_BRING_TO_FRONT".equals(action)) {
                    C17960vV.A0F(false, "it can only be used in smoke or automation");
                } else if (AnonymousClass6Z8.A02.equals(action) && this.A11.A01()) {
                    this.A05.removeMessages(14);
                    this.A05.sendEmptyMessageDelayed(14, 500);
                } else if (AnonymousClass6Z8.A06.equals(action)) {
                    if (A0Q2.callState == CallState.PRECALLING) {
                        A1T(this);
                    }
                    if (A0Q2.isCallLinkLobbyOrJoiningState()) {
                        A99 a992 = this.A0u;
                        if (a992 != null) {
                            a992.A11(A0Q2.callId);
                        }
                        finish();
                    } else {
                        if (intent.getBooleanExtra("pendingCall", false)) {
                            i = 7;
                        }
                        CEC(i);
                    }
                } else if (AnonymousClass6Z8.A04.equals(action)) {
                    if (this.A0u != null) {
                        this.A0c.A00(AnonymousClass1VH.CALL_LINK);
                        this.A0u.A0W();
                    }
                } else if (AnonymousClass6Z8.A0A.equals(action)) {
                    this.A0c.A00(AnonymousClass1VH.SCREEN_SHARING);
                } else if (!AnonymousClass6Z8.A01.equals(action)) {
                    if (isFinishing()) {
                        str = "voip/VoipActivityV2/new-intent activity is finishing, do nothing";
                    } else if (C40811vJ.A0e(A0Q2)) {
                        str = "voip/VoipActivityV2/new-intent the WhatsApp call is active, do nothing";
                    } else {
                        if (this.A00 != 3) {
                            A11(3);
                        }
                        A1N(A0Q2, this, 0);
                        if (intent.getBooleanExtra("newCall", false)) {
                            Log.i("voip/VoipActivityV2/onNewIntent/NewCall clearing states");
                            this.A28 = intent.getBooleanExtra("callAccepted", false);
                            this.A05.removeMessages(9);
                            A4l();
                        }
                    }
                    Log.e(str);
                    return;
                } else if (this.A0u != null) {
                    A1k(this, C22971Dz.A0A(UserJid.class, intent.getStringArrayListExtra("jid")));
                } else {
                    this.A03 = intent;
                }
            }
            this.A1B.BEJ(7, "VoipActivity1");
        }
    }

    public void onPause() {
        super.onPause();
        this.A2F = false;
        this.A2g = false;
        if (this.A00 == 0) {
            A0s();
        }
        AppSettingsWarningDialogFragment appSettingsWarningDialogFragment = this.A2Z;
        if (appSettingsWarningDialogFragment != null && (!appSettingsWarningDialogFragment.A1b() || appSettingsWarningDialogFragment.A00 == 1)) {
            A4j("AppSettingsWarningDialogFragment");
            this.A2Z = null;
        }
        A4i(AnonymousClass00R.A0N);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r5.A0E, 8207) <= 2) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPictureInPictureModeChanged(boolean r6, android.content.res.Configuration r7) {
        /*
            r5 = this;
            super.onPictureInPictureModeChanged(r6, r7)
            android.app.PictureInPictureParams$Builder r1 = r5.A02
            java.lang.String r0 = "PiP params builder is null"
            X.C17960vV.A08(r1, r0)
            r4 = 0
            r3 = 1
            if (r6 == 0) goto L_0x00dd
            r5.A2E = r3
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r5.A0g
            X.1DT r1 = r2.A0M
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.A06()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0H(r2, r0)
        L_0x0023:
            r5.A0s()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r5.A4i(r0)
            boolean r0 = X.C108995ce.A1a(r5)
            if (r0 == 0) goto L_0x0047
            X.1bI r0 = r5.A1R
            android.view.View r0 = r0.A02()
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            X.4RO r1 = r0.A03
            if (r1 == 0) goto L_0x0047
            X.0SF r0 = r1.A02
            if (r0 == 0) goto L_0x0044
            r0.dismiss()
        L_0x0044:
            r0 = 0
            r1.A02 = r0
        L_0x0047:
            X.A99 r2 = r5.A0u
            if (r2 == 0) goto L_0x0056
            java.lang.String r0 = "VoiceService:onEnterPictureInPicture"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A09 = r0
        L_0x0056:
            boolean r0 = r5.A2H
            if (r0 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x006d
            X.0ve r2 = r5.A0E
            r1 = 8207(0x200f, float:1.15E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 2
            if (r1 > r0) goto L_0x0080
        L_0x006d:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "isTaskRoot"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0080
            android.content.Intent r0 = X.AnonymousClass1LU.A02(r5)
            r5.startActivity(r0)
        L_0x0080:
            r5.A11(r3)
            X.0ve r3 = r5.A0E
            com.whatsapp.voipcalling.CallInfo r2 = A0Q(r5)
            r1 = 3153(0xc51, float:4.418E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r3, r1)
            r0 = 4
            if (r1 < r0) goto L_0x00bc
            if (r2 == 0) goto L_0x00bc
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x00bc
            X.6qE r0 = r2.self
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x00bc
            X.00H r0 = r5.A1o
            java.lang.Object r1 = r0.get()
            X.9g9 r1 = (X.C187649g9) r1
            int r0 = r5.A03()
            if (r0 != 0) goto L_0x00af
            r4 = 1
        L_0x00af:
            if (r6 == 0) goto L_0x00d7
            if (r4 != 0) goto L_0x00d7
            X.6uK r1 = r1.A05
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00bc
            r1.A02()
        L_0x00bc:
            com.whatsapp.voipcalling.CallInfo r0 = A0Q(r5)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r0.videoEnabled
            if (r0 == 0) goto L_0x00d6
            A1c(r5)
            X.6o5 r1 = r5.A0f
            if (r1 == 0) goto L_0x00d3
            r0 = 0
            r1.A01 = r0
            r1.A00()
        L_0x00d3:
            com.whatsapp.voipcalling.Voip.processPipModeChange(r6)
        L_0x00d6:
            return
        L_0x00d7:
            X.6uK r0 = r1.A05
            r0.A00()
            goto L_0x00bc
        L_0x00dd:
            r5.A2E = r4
            r5.A0w()
            X.A99 r0 = r5.A0u
            if (r0 == 0) goto L_0x00e9
            r0.A0Z()
        L_0x00e9:
            r5.A2H = r4
            r3 = 2
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0E, 12435) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart() {
        /*
            r5 = this;
            super.onStart()
            android.view.View r1 = r5.A0D
            if (r1 == 0) goto L_0x00ad
            r0 = 1
            r5.A2J = r0
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r5)
            X.A99 r0 = r5.A0u
            r3 = 0
            if (r0 == 0) goto L_0x0018
            r0.A1h = r3
        L_0x0018:
            boolean r0 = X.C108995ce.A1a(r5)
            if (r0 == 0) goto L_0x002a
            X.0ve r2 = r5.A0E
            r1 = 12435(0x3093, float:1.7425E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0031
        L_0x002a:
            X.8Ag r1 = r5.A0m
            android.view.View r0 = r5.A09
            r1.C6C(r0)
        L_0x0031:
            com.whatsapp.voipcalling.CallInfo r2 = A0Q(r5)
            if (r2 == 0) goto L_0x00ae
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00ae
            boolean r0 = r2.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0045
            r5.A28 = r3
        L_0x0045:
            A1L(r2, r5)
            A1N(r2, r5, r3)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r5.A0g
            X.4Sa r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r1)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r0, r1, r3)
            X.0ve r4 = r5.A0E
            r1 = 11196(0x2bbc, float:1.5689E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x0065
            com.whatsapp.voipcalling.CallState r0 = r2.callState
            r5.A1Q(r0)
        L_0x0065:
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x009c
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = X.AnonymousClass6Z8.A08
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0089
            X.6qE r0 = r2.self
            int r1 = r0.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x0089
            r5.A29 = r3
            A1M(r2, r5)
        L_0x0089:
            X.A99 r2 = r5.A0u
            if (r2 == 0) goto L_0x009c
            boolean r0 = r5.A2E
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "VoiceService:onEnterPictureInPicture"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A09 = r0
        L_0x009c:
            X.8At r0 = r5.A0n
            if (r0 == 0) goto L_0x00a3
            r0.But()
        L_0x00a3:
            java.lang.String r0 = "voip/VoipActivityV2/bindService"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1V7 r0 = r5.A0v
            r0.A01(r5)
        L_0x00ad:
            return
        L_0x00ae:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "showCallFailedMessage"
            boolean r0 = r1.hasExtra(r0)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r5.A20
            r5.A1p(r0)
            return
        L_0x00c0:
            r5.finish()
            java.lang.String r0 = "voip/VoipActivityV2/onStart call_not_active, finishing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onStart():void");
    }

    public void onStop() {
        CallState callState;
        super.onStop();
        boolean A1G2 = C108975cc.A1G(this.A0j);
        this.A0m.C6z();
        if (!getIntent().getBooleanExtra("joinable", false)) {
            A1q(false);
            this.A2J = false;
            View view = this.A0D;
            if (view != null) {
                AnonymousClass3MY.A1D(view, this);
            }
            Handler handler = this.A05;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            CallInfo A0Q2 = A0Q(this);
            if (!(A0Q2 == null || (callState = A0Q2.callState) == CallState.NONE)) {
                if (callState == CallState.RECEIVED_CALL) {
                    if (!this.A08.A01() && !this.A28) {
                        Bundle A0D2 = C17880vN.A0D();
                        A0D2.putInt("notification_type", A1G2 ? 1 : 0);
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("voip/VoipActivityV2/onStop post ");
                        C17890vO.A1A(A102, "NOTIFICATION_HEADS_UP");
                        this.A0v.A00(new A69("refresh_notification", A0D2));
                        this.A2i = A1G2;
                    }
                    if (A26(this) && AnonymousClass72U.A02(A0Q2.callState)) {
                        this.A0v.A00(new A69("backgrounded_while_pending_call", C17880vN.A0D()));
                    }
                }
                A99 a99 = this.A0u;
                if (a99 != null && this.A2E) {
                    a99.A0Z();
                }
                if (A0Q2.videoEnabled) {
                    this.A29 = A1G2;
                    A1M(A0Q2, this);
                }
                if (this.A0u != null && !this.A0S.A00) {
                    Log.i("voip/VoipActivityV2/onStop. App is put to background, mark to show VoipActivity again when foregrounded.");
                    this.A0u.A1h = A1G2;
                }
                C160958At r0 = this.A0n;
                if (r0 != null) {
                    r0.BmB();
                }
            }
            A0y();
        }
    }

    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        try {
            super.setPictureInPictureParams(pictureInPictureParams);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.e("voip/VoipActivityV2/setPictureInPictureParams", e);
        }
    }

    public void videoRenderStarted(UserJid userJid) {
        C17960vV.A02();
        C17900vP.A0Y(userJid, "voip/VoipActivityV2/videoRenderStarted ", AnonymousClass000.A10());
        A1N(A0Q(this), this, 0);
        A1a(this);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A16;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A2K();
        return true;
    }
}
