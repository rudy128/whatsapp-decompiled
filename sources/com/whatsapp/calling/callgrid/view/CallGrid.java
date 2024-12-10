package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1GC;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1V9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Ob;
import X.AnonymousClass4RO;
import X.AnonymousClass6RE;
import X.AnonymousClass6bT;
import X.AnonymousClass6bU;
import X.AnonymousClass70A;
import X.AnonymousClass74S;
import X.AnonymousClass7AC;
import X.AnonymousClass7AN;
import X.AnonymousClass7DJ;
import X.AnonymousClass7DK;
import X.AnonymousClass7E1;
import X.C000200d;
import X.C108525bq;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C111715kJ;
import X.C112285lE;
import X.C112655lp;
import X.C112735lx;
import X.C112745ly;
import X.C113615nN;
import X.C113685nY;
import X.C113775ni;
import X.C116095wO;
import X.C116155wU;
import X.C116165wV;
import X.C125676bV;
import X.C130786k0;
import X.C131136kZ;
import X.C135626sV;
import X.C139926zf;
import X.C1420978d;
import X.C143867Fc;
import X.C146427Pb;
import X.C1594484o;
import X.C160958At;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18140vp;
import X.C185769d7;
import X.C21141AfC;
import X.C23581Gv;
import X.C24261Jm;
import X.C24671Lf;
import X.C24771Lp;
import X.C27201Vd;
import X.C27691Xc;
import X.C28931bI;
import X.C37451pZ;
import X.C37961qT;
import X.C39711tW;
import X.C40811vJ;
import X.C41111vp;
import X.C42011xT;
import X.C454028v;
import X.C6Y;
import X.C72453Mb;
import X.C72463Mc;
import X.C89874dA;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.header.CallHeaderStateHolder;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public class CallGrid extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public C454028v A01;
    public AnonymousClass1KB A02;
    public C24771Lp A03;
    public C143867Fc A04;
    public C1594484o A05;
    public C112285lE A06;
    public FocusViewContainer A07;
    public C116095wO A08;
    public PipViewContainer A09;
    public CallGridViewModel A0A;
    public MenuBottomSheetViewModel A0B;
    public CallHeaderStateHolder A0C;
    public AnonymousClass1V9 A0D;
    public AnonymousClass4RO A0E;
    public ScreenShareViewModel A0F;
    public C185769d7 A0G;
    public C21141AfC A0H;
    public AnonymousClass1M9 A0I;
    public C24671Lf A0J;
    public C37451pZ A0K;
    public C27201Vd A0L;
    public C18000vb A0M;
    public C18030ve A0N;
    public AnonymousClass1DC A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass031 A0Q;
    public C18140vp A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public Parcelable A0Z;
    public C6Y A0a;
    public VoiceChatBottomSheetViewModel A0b;
    public boolean A0c;
    public final View A0d;
    public final View A0e;
    public final View A0f;
    public final TextView A0g;
    public final AnonymousClass1GC A0h;
    public final C39711tW A0i;
    public final C39711tW A0j;
    public final RecyclerView A0k;
    public final RecyclerView A0l;
    public final AnonymousClass6bT A0m;
    public final CallGridLayoutManager A0n;
    public final C112655lp A0o;
    public final C108525bq A0p;
    public final C23581Gv A0q;
    public final C28931bI A0r;
    public final C28931bI A0s;
    public final View A0t;
    public final View A0u;
    public final View A0v;
    public final LinearLayoutManager A0w;
    public final C113685nY A0x;
    public final C28931bI A0y;
    public final C28931bI A0z;

    public CallGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0T) {
            this.A0T = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r3.A10;
            this.A0N = AnonymousClass10E.A8r(r1);
            AnonymousClass1K1 r2 = r3.A0z;
            this.A06 = (C112285lE) r2.A6M.get();
            this.A08 = C27691Xc.A09(r3);
            this.A0L = AnonymousClass3MZ.A0i(r1);
            this.A0I = AnonymousClass10E.A4z(r1);
            this.A0J = AnonymousClass3Ma.A0S(r1);
            this.A03 = C108965cb.A0K(r1);
            this.A02 = AnonymousClass10E.A12(r1);
            this.A0M = AnonymousClass10E.A6Q(r1);
            this.A0G = (C185769d7) r1.AmC.get();
            this.A0H = (C21141AfC) r1.ABO.get();
            this.A04 = (C143867Fc) r1.A00.AFD.get();
            this.A0O = AnonymousClass3MZ.A13(r1);
            this.A0D = (AnonymousClass1V9) r1.A1e.get();
            this.A0P = C000200d.A00(r2.A40);
            this.A0R = r1.A8t;
        }
        this.A0j = new C112735lx(this, 1);
        this.A0i = new C112745ly(this);
        this.A0h = new AnonymousClass7AC(this);
        this.A0q = new AnonymousClass7E1(this, 0);
        this.A0p = new AnonymousClass7DJ(this, 0);
        LayoutInflater.from(context).inflate(2131624427, this, true);
        RecyclerView A0U2 = C108945cZ.A0U(this, 2131428683);
        this.A0l = A0U2;
        RecyclerView A0U3 = C108945cZ.A0U(this, 2131428680);
        this.A0k = A0U3;
        Log.i("CallGrid/constructor Setting adapters");
        A0U2.setAdapter(this.A06);
        A0U3.setAdapter(this.A08);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131169250);
        C112655lp r4 = new C112655lp(this.A04, dimensionPixelSize, 3, AnonymousClass3MY.A1b(this.A0M), true);
        A0U3.A0r(r4);
        this.A08.A00 = dimensionPixelSize;
        if (this.A0O.BgK()) {
            r4.A02 = true;
        }
        this.A0v = AnonymousClass1HF.A06(this, 2131428685);
        this.A0t = AnonymousClass1HF.A06(this, 2131428679);
        this.A0d = AnonymousClass1HF.A06(this, 2131431975);
        this.A0f = AnonymousClass1HF.A06(this, 2131434712);
        View A062 = AnonymousClass1HF.A06(this, 2131433859);
        this.A0u = A062;
        this.A0g = AnonymousClass3MW.A0J(this, 2131428681);
        this.A0e = AnonymousClass1HF.A06(this, 2131428682);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        int[] A1W = C108945cZ.A1W();
        A1W[0] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130968802, 2131099877);
        A1W[1] = C108955ca.A01(getContext());
        A062.setBackground(new GradientDrawable(orientation, A1W));
        boolean A1b = AnonymousClass3MY.A1b(this.A0M);
        View view = this.A0d;
        if (A1b) {
            view.setRotation(0.0f);
            this.A0f.setRotation(180.0f);
        } else {
            view.setRotation(180.0f);
            this.A0f.setRotation(0.0f);
        }
        A04(this);
        AnonymousClass6bU r5 = new AnonymousClass6bU(this);
        C113685nY r42 = new C113685nY();
        this.A0x = r42;
        r42.A00 = new C125676bV(this);
        r42.A00 = false;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(this.A04, r42);
        this.A0n = callGridLayoutManager;
        callGridLayoutManager.A02 = r5;
        callGridLayoutManager.A1H((String) null);
        if (0 != callGridLayoutManager.A01) {
            callGridLayoutManager.A01 = 0;
            callGridLayoutManager.A0Q();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A0w = linearLayoutManager;
        A0U3.setLayoutManager(linearLayoutManager);
        A0U3.setItemAnimator((C37961qT) null);
        C1420978d.A00(A0U3, this, 0);
        new C111715kJ().A08(A0U3);
        A0U2.setLayoutManager(callGridLayoutManager);
        A0U2.setItemAnimator(r42);
        C112655lp r7 = new C112655lp(this.A04, getResources().getDimensionPixelSize(2131169249), 0, AnonymousClass3MY.A1b(this.A0M), false);
        this.A0o = r7;
        A0U2.A0r(r7);
        this.A0W = false;
        this.A04.A00 = false;
        if (!C40811vJ.A0b(this.A0N, this.A0R)) {
            PipViewContainer pipViewContainer = (PipViewContainer) C72453Mb.A0S(this, 2131433862);
            this.A09 = pipViewContainer;
            pipViewContainer.setVisibility(8);
            this.A09.A0A = new AnonymousClass7DK(this);
        }
        if (!C40811vJ.A0b(this.A0N, this.A0R)) {
            this.A07 = (FocusViewContainer) C72453Mb.A0S(this, 2131430940);
        }
        this.A0m = new AnonymousClass6bT();
        this.A0y = C28931bI.A00(this, C40811vJ.A0W(this.A0N) ? 2131436549 : 2131432221);
        this.A0z = C28931bI.A00(this, 2131436871);
        this.A0r = C28931bI.A00(this, 2131428676);
        C28931bI A002 = C28931bI.A00(this, 2131435566);
        this.A0s = A002;
        if (this.A0O.Bfb()) {
            this.A01 = C454028v.A03(context, 2131233446);
            this.A0a = new C113775ni(this, 0);
            ((ImageView) A002.A02()).setImageDrawable(this.A01);
        }
        if (C40811vJ.A0b(this.A0N, this.A0R)) {
            A0U2.setMotionEventSplittingEnabled(false);
        }
    }

    private C42011xT A00(AnonymousClass70A r5) {
        int i;
        RecyclerView recyclerView;
        C112285lE r2 = this.A06;
        int i2 = 0;
        while (true) {
            List list = r2.A09;
            if (i >= list.size()) {
                break;
            } else if (!AnonymousClass70A.A00(r5, (AnonymousClass70A) list.get(i))) {
                i2 = i + 1;
            } else if (i >= 0) {
                recyclerView = this.A0l;
            }
        }
        C116095wO r22 = this.A08;
        i = 0;
        while (true) {
            List list2 = r22.A09;
            if (i >= list2.size()) {
                return null;
            }
            if (!AnonymousClass70A.A00(r5, (AnonymousClass70A) list2.get(i))) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                recyclerView = this.A0k;
            }
        }
        return recyclerView.A0O(i);
    }

    public static void A04(CallGrid callGrid) {
        View view = callGrid.A0d;
        RecyclerView recyclerView = callGrid.A0k;
        int i = 0;
        view.setVisibility(C72453Mb.A07(recyclerView.canScrollHorizontally(-1) ? 1 : 0));
        View view2 = callGrid.A0f;
        if (!recyclerView.canScrollHorizontally(1)) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A0l.canScrollVertically(-1) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(com.whatsapp.calling.callgrid.view.CallGrid r4) {
        /*
            android.view.View r2 = r4.A0v
            boolean r0 = r4.A0W
            r3 = 0
            if (r0 != 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0l
            r0 = -1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r2.setVisibility(r0)
            android.view.View r2 = r4.A0t
            boolean r0 = r4.A0W
            if (r0 != 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0l
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0029
        L_0x0025:
            r2.setVisibility(r3)
            return
        L_0x0029:
            r3 = 8
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.A05(com.whatsapp.calling.callgrid.view.CallGrid):void");
    }

    public static void A06(CallGrid callGrid, AnonymousClass6RE r10) {
        C28931bI r3;
        C28931bI r0;
        AnonymousClass1E7 r2;
        int i = 8;
        if (callGrid.A0X) {
            r3 = callGrid.A0z;
            r0 = callGrid.A0y;
        } else {
            r3 = callGrid.A0y;
            r0 = callGrid.A0z;
        }
        r0.A04(8);
        boolean A1Z = AnonymousClass3Ma.A1Z(r10, AnonymousClass6RE.NONE);
        r3.A04(C72453Mb.A0J(A1Z));
        RecyclerView recyclerView = callGrid.A0l;
        int i2 = 2;
        if (A1Z) {
            i2 = 4;
        }
        recyclerView.setImportantForAccessibility(i2);
        if (A1Z) {
            ViewGroup viewGroup = (ViewGroup) r3.A02();
            CallGridViewModel callGridViewModel = callGrid.A0A;
            C89874dA r7 = null;
            if (callGridViewModel == null) {
                r2 = null;
            } else {
                r2 = callGridViewModel.A05;
            }
            WDSButton A0r2 = AnonymousClass3MW.A0r(viewGroup, 2131432222);
            if (A0r2 != null) {
                if (callGrid.A00 != 3 || CallGridViewModel.A05(callGrid.A0A).A04 == 0) {
                    A0r2.setVisibility(8);
                } else {
                    if (CallGridViewModel.A05(callGrid.A0A).A04 == 2) {
                        A0r2.setIcon((Drawable) null);
                        A0r2.setText(2131898483);
                        A0r2.setEnabled(true);
                    } else if (CallGridViewModel.A05(callGrid.A0A).A04 == 1) {
                        A0r2.setIcon(2131233239);
                        A0r2.setText(2131898482);
                        A0r2.setEnabled(false);
                    }
                    A0r2.setVisibility(0);
                    r7 = new C89874dA(callGrid, 14);
                }
                A0r2.setOnClickListener(r7);
            }
            View findViewById = viewGroup.findViewById(2131429433);
            if (findViewById != null) {
                if (r2 != null && !callGrid.A0X) {
                    i = 0;
                }
                findViewById.setVisibility(i);
                if (r2 != null) {
                    A09(callGrid, r2);
                }
            }
            callGrid.setupLonelyStateText(viewGroup, r10);
            callGrid.setupLonelyStateButton(viewGroup, r2, r10);
        }
    }

    public static void A07(CallGrid callGrid, C135626sV r6) {
        View view;
        int i;
        int i2;
        C28931bI r1;
        int i3;
        if (r6 != null) {
            boolean A1C = C108975cc.A1C(C18020vd.A00(C18040vf.A02, callGrid.A0N, 3153), 3);
            if (r6.A02) {
                TextView textView = callGrid.A0g;
                textView.setText(String.valueOf(r6.A01));
                if (A1C) {
                    View view2 = callGrid.A0e;
                    float f = ((float) r6.A00) * -90.0f;
                    view2.setRotation(f);
                    textView.setRotation(f);
                }
                i2 = 0;
                textView.setVisibility(0);
            } else {
                i2 = 8;
                callGrid.A0g.setVisibility(8);
            }
            callGrid.A0e.setVisibility(i2);
            if (r6.A03) {
                if (A1C) {
                    callGrid.A0s.A02().setRotation(((float) r6.A00) * -90.0f);
                }
                r1 = callGrid.A0s;
                i3 = 0;
            } else {
                r1 = callGrid.A0s;
                i3 = 8;
            }
            r1.A04(i3);
            view = callGrid.A0u;
            i = 0;
        } else {
            view = callGrid.A0u;
            i = 8;
        }
        view.setVisibility(i);
        callGrid.setSSPipIconAnimation(r6);
    }

    public static void A08(CallGrid callGrid, C139926zf r3) {
        callGrid.A0c = AnonymousClass000.A1T(r3.A00, 2);
        callGrid.setupLonelyStateContainerMargins(callGrid.A0W);
    }

    public static void A09(CallGrid callGrid, AnonymousClass1E7 r5) {
        ImageView A0H2;
        if (!C18020vd.A05(C18040vf.A02, callGrid.A0N, 7175) && (A0H2 = AnonymousClass3MW.A0H(callGrid.A0y.A02(), 2131429433)) != null) {
            C37451pZ r0 = callGrid.A0K;
            if (r0 == null) {
                r0 = callGrid.A0L.A06(callGrid.getContext(), "lonely-state-contact-photo-loader");
                callGrid.A0K = r0;
            }
            r0.A07(A0H2, r5);
        }
    }

    private void A0D(String str) {
        C17960vV.A0F(AnonymousClass000.A1W(this.A09), String.format("CallGrid/%s/ pipViewContainer is null", new Object[]{str}));
    }

    /* access modifiers changed from: private */
    public List getVisibleParticipantJids() {
        Collection A13;
        C17960vV.A0C(this.A0W);
        RecyclerView recyclerView = this.A0l;
        C17960vV.A0C(AnonymousClass000.A1W(recyclerView.getLayoutManager()));
        if (C18020vd.A05(C18040vf.A02, this.A0N, 5200)) {
            A13 = C17880vN.A12();
        } else {
            A13 = AnonymousClass000.A13();
        }
        FocusViewContainer focusViewContainer = this.A07;
        if (!(focusViewContainer == null || focusViewContainer.getVisiblePeerJid() == null)) {
            A13.add(focusViewContainer.getVisiblePeerJid());
        }
        for (int i = 0; i <= recyclerView.getLayoutManager().A0K(); i++) {
            C113615nN r1 = (C113615nN) recyclerView.A0O(i);
            if (!(r1 == null || r1.A05 == null || r1.A05.A0N)) {
                A13.add(r1.A05.A0h);
            }
        }
        LinearLayoutManager linearLayoutManager = this.A0w;
        int A1O = linearLayoutManager.A1O();
        int A1Q = linearLayoutManager.A1Q();
        for (int i2 = A1O; i2 <= A1Q; i2++) {
            C113615nN r3 = (C113615nN) this.A0k.A0O(i2);
            if (!(r3 == null || r3.A05 == null)) {
                AnonymousClass70A r0 = r3.A05;
                C17960vV.A07(r0);
                if (!r0.A0N) {
                    if (i2 == A1O || i2 == A1Q) {
                        Rect A072 = AnonymousClass3MW.A07();
                        View view = r3.A0H;
                        view.getGlobalVisibleRect(A072);
                        if (A072.width() < view.getWidth() / 3) {
                        }
                    }
                    A13.add(r3.A05.A0h);
                }
            }
        }
        if (!(A13 instanceof List)) {
            return C17880vN.A10(A13);
        }
        return (List) A13;
    }

    /* access modifiers changed from: private */
    public void setIsVoiceChat(boolean z) {
        this.A0X = z;
        CallGridLayoutManager callGridLayoutManager = this.A0n;
        callGridLayoutManager.A07 = z;
        if (z) {
            callGridLayoutManager.A09.post(new C146427Pb(callGridLayoutManager, 2));
        }
        this.A06.A05 = z;
        this.A0o.A04 = z;
        CallGridViewModel callGridViewModel = this.A0A;
        if (callGridViewModel != null) {
            callGridViewModel.A0u.A06();
            A06(this, (AnonymousClass6RE) this.A0A.A0u.A06());
        }
    }

    /* access modifiers changed from: private */
    public void setPaddings(Rect rect) {
        if (rect != null) {
            this.A0l.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    private void setPipScale(boolean z) {
        A0D("setPipScale");
        PipViewContainer pipViewContainer = this.A09;
        if (pipViewContainer != null) {
            float f = 2.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = 2.0f;
            }
            pipViewContainer.setScaleX(f2);
            if (!z) {
                f = 1.0f;
            }
            pipViewContainer.setScaleY(f);
        }
    }

    private void setSSPipIconAnimation(C135626sV r4) {
        C6Y c6y;
        C454028v r2 = this.A01;
        if (r2 != null && (c6y = this.A0a) != null) {
            if (r4 == null || !r4.A03) {
                r2.A09(c6y);
                if (r2.isRunning()) {
                    r2.stop();
                    return;
                }
                return;
            }
            r2.A08(c6y);
            if (!r2.isRunning()) {
                r2.start();
            }
        }
    }

    private void setupLonelyStateContainerMargins(boolean z) {
        int i;
        Resources resources;
        int i2;
        if (!this.A0X) {
            if (!C18020vd.A05(C18040vf.A02, this.A0N, 7175)) {
                View A022 = this.A0y.A02();
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A022);
                Resources resources2 = getResources();
                if (z) {
                    i = resources2.getDimensionPixelSize(2131169532);
                    if (!this.A0c) {
                        resources = getResources();
                        i2 = 2131167331;
                    }
                    resources = getResources();
                    i2 = 2131167332;
                } else {
                    i = resources2.getDimensionPixelSize(2131167332);
                    resources = getResources();
                    i2 = 2131167332;
                }
                A0B2.setMargins(i, 0, i, resources.getDimensionPixelSize(i2));
                A022.setLayoutParams(A0B2);
            }
        }
    }

    public void A0E() {
        setupLonelyStateText((ViewGroup) this.A0z.A02(), AnonymousClass6RE.CONNECTING);
    }

    public /* synthetic */ void A0F() {
        int size = this.A06.A09.size();
        C17900vP.A0j("CallGrid/updateGridLayoutMode, nTiles: ", AnonymousClass000.A10(), size);
        for (int i = 0; i < size; i++) {
            C113615nN r2 = (C113615nN) this.A0l.A0O(i);
            if ((r2 instanceof C116165wV) || (r2 instanceof C116155wU)) {
                int i2 = 2;
                if (!this.A0X) {
                    if (size <= 2) {
                        i2 = 0;
                    } else if (size <= 8) {
                        i2 = 1;
                    }
                }
                r2.A0E(i2);
            }
        }
        A05(this);
        if (this.A0A != null && this.A0W) {
            if (this.A08.A09.size() <= 0) {
                if (!C18020vd.A05(C18040vf.A02, this.A0N, 5200)) {
                    return;
                }
            }
            this.A0A.A0Z(getVisibleParticipantJids());
        }
    }

    public void A0G(TimeInterpolator timeInterpolator, int i, long j, boolean z) {
        int i2;
        Point point;
        Integer num;
        int i3;
        int height;
        int i4;
        int i5;
        C28931bI r3;
        int i6;
        A0D("onCallControlsTransitionStarted");
        PipViewContainer pipViewContainer = this.A09;
        if (pipViewContainer != null && this.A0A != null) {
            float f = 1.0f;
            if (z) {
                f = 2.0f;
            }
            if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                i2 = AnonymousClass3MW.A0B(this).topMargin;
                i -= i2;
            } else {
                i2 = 0;
            }
            CallGridViewModel callGridViewModel = this.A0A;
            UserJid userJid = callGridViewModel.A06;
            if (userJid == null || callGridViewModel.A0V.A0O(userJid)) {
                pipViewContainer.A02 = i2;
                C130786k0 r4 = pipViewContainer.A0B;
                if (!(r4 == null || (point = pipViewContainer.A05) == null)) {
                    Float f2 = null;
                    if (pipViewContainer.A00 == 3) {
                        int i7 = i;
                        boolean z2 = r4.A08;
                        if (z) {
                            if (!z2) {
                                i4 = pipViewContainer.A07.A00;
                                WeakReference weakReference = pipViewContainer.A0F;
                                if (!(weakReference == null || (r3 = (C28931bI) weakReference.get()) == null || r3.A00 == null)) {
                                    i4 = r3.A02().getBottom() - pipViewContainer.A02;
                                }
                                i5 = pipViewContainer.A0P;
                            }
                            height = (i7 - pipViewContainer.getHeight()) - pipViewContainer.A0P;
                            num = Integer.valueOf(height);
                        } else if (z2) {
                            i7 = point.y;
                            height = (i7 - pipViewContainer.getHeight()) - pipViewContainer.A0P;
                            num = Integer.valueOf(height);
                        } else {
                            i4 = pipViewContainer.A0P;
                            i5 = pipViewContainer.A07.A00;
                        }
                        height = i4 + i5;
                        num = Integer.valueOf(height);
                    } else {
                        num = null;
                    }
                    if (pipViewContainer.A0B.A07) {
                        f2 = Float.valueOf(f);
                    }
                    WeakReference weakReference2 = pipViewContainer.A0G;
                    if (!(weakReference2 == null || weakReference2.get() == null)) {
                        ((C160958At) weakReference2.get()).C0f(timeInterpolator, j, z);
                    }
                    if (j == 0 || pipViewContainer.getVisibility() != 0) {
                        if (z) {
                            i3 = pipViewContainer.A05.y - i;
                        } else {
                            i3 = 0;
                        }
                        pipViewContainer.A01 = i3;
                        if (num != null) {
                            PipViewContainer.A01(pipViewContainer);
                        }
                        if (f2 != null) {
                            PipViewContainer.A03(pipViewContainer);
                            float floatValue = f2.floatValue();
                            pipViewContainer.setScaleX(floatValue);
                            pipViewContainer.setScaleY(floatValue);
                        }
                        if (j == 0) {
                            pipViewContainer.A0K = z;
                        }
                    } else {
                        AnonymousClass74S r32 = new AnonymousClass74S(pipViewContainer, i, z);
                        ViewPropertyAnimator animate = pipViewContainer.animate();
                        if (num != null) {
                            animate.y((float) num.intValue());
                        }
                        if (f2 != null) {
                            PipViewContainer.A03(pipViewContainer);
                            float floatValue2 = f2.floatValue();
                            animate.scaleX(floatValue2);
                            animate.scaleY(floatValue2);
                        }
                        animate.setDuration(j).setInterpolator(timeInterpolator).setListener(r32).start();
                    }
                }
            } else {
                if (z) {
                    pipViewContainer.setScaleY(2.0f);
                    pipViewContainer.setScaleX(2.0f);
                }
                if (pipViewContainer.A05 != null) {
                    pipViewContainer.setY((float) ((i - pipViewContainer.getHeight()) - pipViewContainer.A0P));
                    pipViewContainer.A0K = z;
                    pipViewContainer.A02 = i2;
                    if (z) {
                        i6 = pipViewContainer.A05.y - i;
                    } else {
                        i6 = 0;
                    }
                    pipViewContainer.A01 = i6;
                    WeakReference weakReference3 = pipViewContainer.A0G;
                    if (!(weakReference3 == null || weakReference3.get() == null)) {
                        ((C160958At) weakReference3.get()).C0f((TimeInterpolator) null, 0, z);
                    }
                }
            }
            CallGridViewModel callGridViewModel2 = this.A0A;
            callGridViewModel2.A0A = z;
            CallGridViewModel.A0D(callGridViewModel2);
        }
    }

    public void A0H(AnonymousClass1F9 r8, CallGridViewModel callGridViewModel, MenuBottomSheetViewModel menuBottomSheetViewModel, CallHeaderStateHolder callHeaderStateHolder, VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, ScreenShareViewModel screenShareViewModel) {
        FocusViewContainer focusViewContainer;
        if (this.A0A == null) {
            this.A0A = callGridViewModel;
            this.A0F = screenShareViewModel;
            if (screenShareViewModel != null) {
                AnonymousClass7AN.A01(r8, screenShareViewModel.A0E, this, 29);
            }
            AnonymousClass7AN.A01(r8, this.A0A.A0R, this, 17);
            AnonymousClass7AN.A01(r8, this.A0A.A0p, this, 21);
            AnonymousClass7AN.A01(r8, this.A0A.A0N, this, 22);
            C18030ve r4 = this.A0N;
            C18140vp r2 = this.A0R;
            if (!C40811vJ.A0b(r4, r2)) {
                A0D("bind");
                FocusViewContainer focusViewContainer2 = this.A07;
                C17960vV.A0F(AnonymousClass000.A1W(focusViewContainer2), String.format("CallGrid/%s/ focusViewContainer is null", new Object[]{"bind"}));
                PipViewContainer pipViewContainer = this.A09;
                if (pipViewContainer != null) {
                    AnonymousClass7AN.A01(r8, this.A0A.A0U, pipViewContainer, 23);
                    AnonymousClass1DT r1 = this.A0A.A0L;
                    focusViewContainer2.getClass();
                    AnonymousClass7AN.A01(r8, r1, focusViewContainer2, 24);
                }
            }
            AnonymousClass7AN.A01(r8, this.A0A.A0M, this, 25);
            AnonymousClass7AN.A01(r8, this.A0A.A0m, this, 26);
            AnonymousClass7AN.A01(r8, this.A0A.A0r, this, 27);
            AnonymousClass7AN.A01(r8, this.A0A.A0n, this, 28);
            C41111vp r12 = this.A0A.A0q;
            CallGridLayoutManager callGridLayoutManager = this.A0n;
            callGridLayoutManager.getClass();
            AnonymousClass7AN.A01(r8, r12, callGridLayoutManager, 30);
            AnonymousClass7AN.A01(r8, this.A0A.A0s, callGridLayoutManager, 31);
            AnonymousClass7AN.A01(r8, this.A0A.A0v, this, 9);
            AnonymousClass7AN.A01(r8, this.A0A.A0Q, this, 10);
            AnonymousClass7AN.A01(r8, this.A0A.A0l, this, 11);
            AnonymousClass7AN.A01(r8, this.A0A.A0w, this, 12);
            AnonymousClass7AN.A01(r8, this.A0A.A0t, this, 13);
            AnonymousClass7AN.A01(r8, this.A0A.A0k, this, 14);
            AnonymousClass7AN.A01(r8, this.A0A.A0u, this, 15);
            AnonymousClass7AN.A01(r8, this.A0A.A0T, this, 16);
            C41111vp r13 = this.A0A.A0x;
            C112285lE r3 = this.A06;
            r3.getClass();
            AnonymousClass7AN.A01(r8, r13, r3, 18);
            AnonymousClass7AN.A01(r8, this.A0A.A0j, this, 19);
            if (C40811vJ.A0b(r4, r2)) {
                AnonymousClass1DT r14 = ((C131136kZ) this.A0P.get()).A03;
                callGridViewModel.getClass();
                AnonymousClass7AN.A01(r8, r14, callGridViewModel, 20);
            }
            r3.A04 = callGridViewModel;
            this.A08.A04 = callGridViewModel;
            if (C72463Mc.A1Z(r2)) {
                this.A0B = menuBottomSheetViewModel;
            }
            if (!(menuBottomSheetViewModel == null || (focusViewContainer = this.A07) == null)) {
                focusViewContainer.setMenuViewModel(r8, menuBottomSheetViewModel);
            }
            this.A0b = voiceChatBottomSheetViewModel;
            this.A0C = callHeaderStateHolder;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0Q;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0Q = r0;
        }
        return r0.generatedComponent();
    }

    public FocusViewContainer getFocusViewContainer() {
        FocusViewContainer focusViewContainer = this.A07;
        C17960vV.A05(focusViewContainer);
        return focusViewContainer;
    }

    public LinearLayout getLonelyState() {
        return (LinearLayout) this.A0y.A02();
    }

    public PipViewContainer getPipViewContainer() {
        PipViewContainer pipViewContainer = this.A09;
        C17960vV.A05(pipViewContainer);
        return pipViewContainer;
    }

    public View getVoiceChatLonelyStateView() {
        return this.A0z.A02();
    }

    public void setBannerAndHeaderWeakReference(WeakReference weakReference, WeakReference weakReference2) {
        A0D("setBannerAndHeaderWeakReference");
        PipViewContainer pipViewContainer = this.A09;
        if (pipViewContainer != null) {
            pipViewContainer.setBannerAndHeaderWeakReference(weakReference, weakReference2);
        }
    }

    public void setGlassesUiPlugin(C160958At r2) {
        A0D("setGlassesUiPlugin");
        PipViewContainer pipViewContainer = this.A09;
        if (pipViewContainer != null) {
            pipViewContainer.setGlassesUiPlugin(r2);
        }
    }

    public void setIsCallControlsShown(boolean z) {
        CallGridViewModel callGridViewModel = this.A0A;
        if (callGridViewModel != null) {
            callGridViewModel.A0A = z;
            CallGridViewModel.A0D(callGridViewModel);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0278, code lost:
        if (r0.A0h.equals(r3.A0h) != false) goto L_0x027a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(com.whatsapp.calling.callgrid.view.CallGrid r14, java.util.List r15, boolean r16) {
        /*
            java.util.ArrayList r6 = X.C17880vN.A10(r15)
            X.0ve r5 = r14.A0N
            X.0vp r4 = r14.A0R
            boolean r0 = X.C40811vJ.A0b(r5, r4)
            r8 = 0
            r7 = 0
            r3 = r8
            r2 = r8
            r13 = 0
            if (r0 != 0) goto L_0x0031
            r13 = r16 ^ 1
            r9 = 0
        L_0x0016:
            int r0 = r6.size()
            if (r9 >= r0) goto L_0x0031
            java.lang.Object r1 = r6.get(r9)
            X.70A r1 = (X.AnonymousClass70A) r1
            if (r13 == 0) goto L_0x0029
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0029
            r3 = r1
        L_0x0029:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x002e
            r2 = r1
        L_0x002e:
            int r9 = r9 + 1
            goto L_0x0016
        L_0x0031:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0059
            com.whatsapp.calling.callgrid.view.CallGridLayoutManager r0 = r14.A0n
            int r10 = r0.A06
            X.7Fc r9 = r14.A04
            int r1 = r6.size()
            boolean r0 = r14.A0U
            int r0 = r9.A01(r1, r0)
            if (r10 != r0) goto L_0x0059
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r14.A0A
            if (r0 == 0) goto L_0x0252
            X.6sX r1 = r0.A04
            if (r1 == 0) goto L_0x0252
            com.whatsapp.jid.UserJid r0 = r1.A00
            if (r0 != 0) goto L_0x0059
            com.whatsapp.jid.UserJid r0 = r1.A02
            if (r0 == 0) goto L_0x0252
        L_0x0059:
            androidx.recyclerview.widget.RecyclerView r9 = r14.A0l
            r9.setItemAnimator(r8)
        L_0x005e:
            boolean r0 = X.C40811vJ.A0b(r5, r4)
            if (r0 != 0) goto L_0x016a
            java.lang.String r12 = "bindParticipants"
            r14.A0D(r12)
            com.whatsapp.calling.callgrid.view.FocusViewContainer r10 = r14.A07
            r0 = 1
            boolean r11 = X.AnonymousClass000.A1W(r10)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r7] = r12
            java.lang.String r0 = "CallGrid/%s/ focusViewContainer is null"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C17960vV.A0F(r11, r0)
            com.whatsapp.calling.callgrid.view.PipViewContainer r12 = r14.A09
            if (r12 == 0) goto L_0x016a
            if (r10 == 0) goto L_0x016a
            java.lang.String r0 = "getFocusSourceVisibleRect"
            r14.A0D(r0)
            if (r2 == 0) goto L_0x024c
            com.whatsapp.jid.UserJid r1 = r2.A0h
            X.5nN r0 = r12.A09
            if (r0 == 0) goto L_0x0235
            X.70A r0 = r0.A05
            if (r0 == 0) goto L_0x0235
            com.whatsapp.jid.UserJid r0 = r0.A0h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0235
            android.graphics.Rect r11 = r12.getGlobalVisibleRect()
        L_0x00a0:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r14.A0A
            if (r0 == 0) goto L_0x00b7
            com.whatsapp.jid.UserJid r1 = r0.A06
            if (r1 == 0) goto L_0x00b7
            X.11S r0 = r0.A0V
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = X.C72463Mc.A1Z(r4)
            if (r0 == 0) goto L_0x00b7
            r7 = 1
        L_0x00b7:
            if (r3 == 0) goto L_0x01cb
            r6.remove(r3)
            if (r2 == 0) goto L_0x01d1
            boolean r0 = X.AnonymousClass70A.A00(r3, r2)
            if (r0 == 0) goto L_0x01d1
            r12.A07(r8, r7)
        L_0x00c7:
            X.1xT r0 = r14.A00(r2)
            if (r0 == 0) goto L_0x00d2
            X.5nN r0 = (X.C113615nN) r0
            r0.A0B()
        L_0x00d2:
            r3 = 8
            X.5nN r0 = r10.A02
            if (r0 == 0) goto L_0x00f1
            X.70A r0 = r0.A05
            if (r0 == 0) goto L_0x00f1
            boolean r0 = X.AnonymousClass70A.A00(r2, r0)
            if (r0 == 0) goto L_0x00ec
            boolean r1 = r2.A0D
            X.5nN r0 = r10.A02
            X.70A r0 = r0.A05
            boolean r0 = r0.A0D
            if (r1 == r0) goto L_0x0127
        L_0x00ec:
            X.5nN r0 = r10.A02
            r0.A0B()
        L_0x00f1:
            android.widget.FrameLayout r8 = r10.A09
            r8.removeAllViews()
            X.5lE r7 = r10.A01
            boolean r1 = r2.A0D
            r0 = 2
            if (r1 == 0) goto L_0x00fe
            r0 = 6
        L_0x00fe:
            X.1xT r1 = r7.A0F(r10, r0)
            X.5nN r1 = (X.C113615nN) r1
            r10.A02 = r1
            boolean r0 = r1 instanceof X.C116185wX
            if (r0 == 0) goto L_0x010f
            X.5wX r1 = (X.C116185wX) r1
            r1.A0K()
        L_0x010f:
            X.5nN r0 = r10.A02
            android.view.View r1 = r0.A0H
            int r0 = r2.hashCode()
            r1.setId(r0)
            X.5nN r0 = r10.A02
            android.view.View r7 = r0.A0H
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r8.addView(r7, r0)
        L_0x0127:
            X.5nN r0 = r10.A02
            if (r0 == 0) goto L_0x012e
            r0.A0J(r2)
        L_0x012e:
            com.whatsapp.WaTextView r7 = r10.A0B
            r0 = 0
            r7.setVisibility(r0)
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x01be
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            r7.setText(r0)
        L_0x013e:
            int r0 = r10.getVisibility()
            if (r0 == r3) goto L_0x0148
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x016a
        L_0x0148:
            android.view.ViewPropertyAnimator r0 = r10.animate()
            r0.cancel()
            r0 = 0
            r10.setVisibility(r0)
            int r0 = r11.width()
            if (r0 == 0) goto L_0x016a
            int r0 = r11.height()
            if (r0 == 0) goto L_0x016a
            android.widget.FrameLayout r2 = r10.A09
            r1 = 3
            X.4dh r0 = new X.4dh
            r0.<init>(r11, r10, r1)
            r2.addOnLayoutChangeListener(r0)
        L_0x016a:
            if (r16 != 0) goto L_0x01b8
            X.1qy r0 = r9.getLayoutManager()
            if (r0 == 0) goto L_0x0178
            android.os.Parcelable r0 = r0.A0u()
            r14.A0Z = r0
        L_0x0178:
            X.5lE r0 = r14.A06
            r0.A0a(r6)
            boolean r0 = r14.A0Y
            if (r0 == 0) goto L_0x018e
            r9.A0Y()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r14.A0A
            if (r0 == 0) goto L_0x018e
            X.1vp r1 = r0.A0w
            r0 = 0
            X.AnonymousClass3MY.A1L(r1, r0)
        L_0x018e:
            android.os.Parcelable r1 = r14.A0Z
            if (r1 == 0) goto L_0x019b
            X.1qy r0 = r9.getLayoutManager()
            if (r0 == 0) goto L_0x019b
            r0.A19(r1)
        L_0x019b:
            boolean r0 = X.C40811vJ.A0b(r5, r4)
            if (r0 == 0) goto L_0x01b5
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r14.A0A
            if (r0 == 0) goto L_0x01b6
            X.6sX r1 = r0.A04
            if (r1 == 0) goto L_0x01b6
            com.whatsapp.jid.UserJid r0 = r1.A00
            if (r0 != 0) goto L_0x01b1
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 == 0) goto L_0x01b6
        L_0x01b1:
            r0 = 4
        L_0x01b2:
            r9.setImportantForAccessibility(r0)
        L_0x01b5:
            return
        L_0x01b6:
            r0 = 2
            goto L_0x01b2
        L_0x01b8:
            X.5wO r0 = r14.A08
            r0.A0a(r6)
            goto L_0x019b
        L_0x01be:
            X.1Me r1 = r10.A04
            X.1E7 r0 = r2.A0g
            java.lang.String r0 = r1.A0I(r0)
            r7.setText(r0)
            goto L_0x013e
        L_0x01cb:
            if (r13 == 0) goto L_0x01df
            r12.A07(r8, r7)
            goto L_0x01df
        L_0x01d1:
            X.1xT r0 = r14.A00(r3)
            if (r0 == 0) goto L_0x01dc
            X.5nN r0 = (X.C113615nN) r0
            r0.A0B()
        L_0x01dc:
            r12.A07(r3, r7)
        L_0x01df:
            if (r2 != 0) goto L_0x00c7
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r14.A0A
            X.1DT r0 = r0.A0M
            java.lang.Object r0 = r0.A06()
            if (r0 != 0) goto L_0x016a
            r1 = 8
            X.5nN r2 = r10.A02
            if (r2 == 0) goto L_0x01f8
            X.70A r0 = r2.A05
            if (r0 == 0) goto L_0x01f8
            r2.A0B()
        L_0x01f8:
            r10.A02 = r8
            android.widget.FrameLayout r0 = r10.A09
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r10.A0A
            r0.removeAllViews()
            int r0 = r10.getVisibility()
            if (r0 == r1) goto L_0x016a
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x016a
            android.view.ViewPropertyAnimator r0 = r10.animate()
            r0.cancel()
            r0 = 1
            r10.A07 = r0
            com.whatsapp.WaTextView r0 = r10.A0B
            r0.setVisibility(r1)
            android.view.ViewPropertyAnimator r2 = X.C108985cd.A0F(r10)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            X.3Mp r0 = new X.3Mp
            r0.<init>(r10)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.start()
            goto L_0x016a
        L_0x0235:
            X.1xT r1 = r14.A00(r2)
            X.5nN r1 = (X.C113615nN) r1
            if (r1 == 0) goto L_0x024c
            android.graphics.Rect r11 = X.AnonymousClass3MW.A07()
            X.70A r0 = r1.A05
            if (r0 == 0) goto L_0x00a0
            android.view.View r0 = r1.A0H
            r0.getGlobalVisibleRect(r11)
            goto L_0x00a0
        L_0x024c:
            android.graphics.Rect r11 = X.AnonymousClass3MW.A07()
            goto L_0x00a0
        L_0x0252:
            com.whatsapp.calling.callgrid.view.FocusViewContainer r0 = r14.A07
            if (r0 == 0) goto L_0x0260
            X.5nN r0 = r0.A02
            if (r0 == 0) goto L_0x0260
            X.70A r0 = r0.A05
            if (r0 == 0) goto L_0x0260
            goto L_0x0059
        L_0x0260:
            if (r2 != 0) goto L_0x0059
            if (r3 == 0) goto L_0x027a
            com.whatsapp.calling.callgrid.view.PipViewContainer r0 = r14.A09
            if (r0 == 0) goto L_0x027a
            X.5nN r0 = r0.A09
            if (r0 == 0) goto L_0x027a
            X.70A r0 = r0.A05
            if (r0 == 0) goto L_0x027a
            com.whatsapp.jid.UserJid r1 = r3.A0h
            com.whatsapp.jid.UserJid r0 = r0.A0h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0059
        L_0x027a:
            androidx.recyclerview.widget.RecyclerView r9 = r14.A0l
            X.5nY r0 = r14.A0x
            r9.setItemAnimator(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.A0A(com.whatsapp.calling.callgrid.view.CallGrid, java.util.List, boolean):void");
    }

    public static void A0B(CallGrid callGrid, boolean z) {
        C17900vP.A0n("CallGrid/onAvSwitched, isVideoEnabled: ", AnonymousClass000.A10(), z);
        callGrid.A0W = z;
        callGrid.A04.A00 = z;
        callGrid.A0n.A06 = z;
        callGrid.A0x.A09 = z;
        callGrid.setupLonelyStateContainerMargins(z);
    }

    /* access modifiers changed from: private */
    public void setMargins(Rect rect) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.rightMargin = rect.right;
            setLayoutParams(marginLayoutParams);
        }
    }

    private void setupLonelyStateButton(ViewGroup viewGroup, AnonymousClass1E7 r8, AnonymousClass6RE r9) {
        int i;
        WDSButton A0r2 = AnonymousClass3MW.A0r(viewGroup, 2131432217);
        if (A0r2 != null) {
            VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = (VoipCallControlRingingDotsIndicator) viewGroup.findViewById(2131434728);
            if (!(r9 == AnonymousClass6RE.RINGING || voipCallControlRingingDotsIndicator == null)) {
                voipCallControlRingingDotsIndicator.clearAnimation();
                voipCallControlRingingDotsIndicator.setVisibility(8);
            }
            int ordinal = r9.ordinal();
            if (ordinal == 2 || ordinal == 6) {
                if (this.A0A != null) {
                    int i2 = 8;
                    if (r8 != null) {
                        i2 = 0;
                    }
                    A0r2.setVisibility(i2);
                    if (r8 != null) {
                        A0r2.setText(2131891830);
                        A0r2.setIcon(C24261Jm.A00(getContext(), 2131233235));
                        i = 15;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (ordinal != 1) {
                if (ordinal != 0) {
                    A0r2.setVisibility(8);
                    return;
                } else if (this.A0A != null && voipCallControlRingingDotsIndicator != null) {
                    AnonymousClass3MW.A1S(A0r2);
                    A0r2.setIcon((Drawable) null);
                    A0r2.setVisibility(0);
                    voipCallControlRingingDotsIndicator.setVisibility(0);
                    Animation animation = voipCallControlRingingDotsIndicator.getAnimation();
                    if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                        AnonymousClass3Ob r1 = new AnonymousClass3Ob(voipCallControlRingingDotsIndicator);
                        r1.setRepeatCount(-1);
                        voipCallControlRingingDotsIndicator.startAnimation(r1);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (this.A0A != null) {
                int i3 = 8;
                if (r8 != null) {
                    i3 = 0;
                }
                A0r2.setVisibility(i3);
                if (r8 != null) {
                    A0r2.setVisibility(0);
                    A0r2.setText(2131895365);
                    A0r2.setIcon(2131232143);
                    i = 13;
                } else {
                    return;
                }
            } else {
                return;
            }
            C89874dA.A00(A0r2, this, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r5.A0N, 7875) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupLonelyStateText(android.view.ViewGroup r6, X.AnonymousClass6RE r7) {
        /*
            r5 = this;
            r0 = 2131432220(0x7f0b131c, float:1.8486191E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r6, r0)
            r0 = 2131432219(0x7f0b131b, float:1.848619E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r6, r0)
            X.0vp r0 = r5.A0R
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r5.A0X
            if (r0 == 0) goto L_0x0026
            X.0ve r2 = r5.A0N
            X.0vf r1 = X.C18040vf.A01
            r0 = 7875(0x1ec3, float:1.1035E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x002d
        L_0x0026:
            android.content.res.Resources r0 = r5.getResources()
            X.C1402770r.A00(r0, r4, r3)
        L_0x002d:
            r2 = 3
            if (r4 == 0) goto L_0x004b
            X.6RE r0 = X.AnonymousClass6RE.CONNECTING
            if (r7 != r0) goto L_0x0063
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = r5.A0b
            if (r0 == 0) goto L_0x0057
            X.4ZN r1 = r0.A02
            if (r1 == 0) goto L_0x0057
            android.content.Context r0 = r5.getContext()
            java.lang.CharSequence r0 = r1.A03(r0)
            java.lang.String r0 = r0.toString()
        L_0x0048:
            r4.setText(r0)
        L_0x004b:
            if (r3 == 0) goto L_0x0056
            X.6RE r0 = X.AnonymousClass6RE.NO_ONE_HERE
            if (r7 == r0) goto L_0x0080
            r0 = 8
            r3.setVisibility(r0)
        L_0x0056:
            return
        L_0x0057:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131898124(0x7f122f0c, float:1.9431157E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0048
        L_0x0063:
            X.6RE r0 = X.AnonymousClass6RE.NO_ONE_HERE
            if (r7 != r0) goto L_0x0075
            int r0 = r5.A00
            r1 = 2131898048(0x7f122ec0, float:1.9431003E38)
            if (r0 == r2) goto L_0x0071
            r1 = 2131898035(0x7f122eb3, float:1.9430976E38)
        L_0x0071:
            r4.setText(r1)
            goto L_0x004b
        L_0x0075:
            X.6RE r0 = X.AnonymousClass6RE.GO_TO_CHAT_WITHOUT_PARTICIPANT_LIST
            r1 = 2131898234(0x7f122f7a, float:1.943138E38)
            if (r7 != r0) goto L_0x0071
            r1 = 2131898032(0x7f122eb0, float:1.943097E38)
            goto L_0x0071
        L_0x0080:
            int r1 = r5.A00
            r0 = 0
            if (r1 == r2) goto L_0x00c1
            r3.setVisibility(r0)
            X.0ve r2 = r5.A0N
            X.0vf r1 = X.C18040vf.A01
            r0 = 7875(0x1ec3, float:1.1035E-41)
            boolean r4 = X.C18020vd.A05(r1, r2, r0)
            android.content.Context r2 = r5.getContext()
            r1 = 2131233316(0x7f080a24, float:1.8082766E38)
            r0 = 2131103389(0x7f060e9d, float:1.7819243E38)
            if (r4 == 0) goto L_0x00a4
            r1 = 2131233313(0x7f080a21, float:1.808276E38)
            r0 = 2131103225(0x7f060df9, float:1.781891E38)
        L_0x00a4:
            android.graphics.drawable.Drawable r4 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2131898040(0x7f122eb8, float:1.9430987E38)
            java.lang.String r2 = r1.getString(r0)
            android.text.TextPaint r1 = r3.getPaint()
            java.lang.String r0 = "%s"
            android.text.SpannableStringBuilder r0 = X.C72813Np.A02(r1, r4, r2, r0)
            r3.setText(r0)
            return
        L_0x00c1:
            r3.setVisibility(r0)
            r0 = 2131898045(0x7f122ebd, float:1.9430997E38)
            r3.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.setupLonelyStateText(android.view.ViewGroup, X.6RE):void");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        PipViewContainer pipViewContainer = this.A09;
        if (pipViewContainer != null) {
            pipViewContainer.A05 = new Point(i, i2);
            if (pipViewContainer.isLayoutRequested()) {
                pipViewContainer.post(new C146427Pb(pipViewContainer, 3));
            } else {
                PipViewContainer.A01(pipViewContainer);
            }
        }
        int measuredHeight = (int) (0.04d * ((double) getMeasuredHeight()));
        C17900vP.A0j("CallGrid/onSizeChanged, scrolling peek height: ", AnonymousClass000.A10(), measuredHeight);
        View view = this.A0v;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view2 = this.A0t;
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view2);
        layoutParams.height = measuredHeight;
        A0B2.height = measuredHeight;
        if (this.A0X) {
            this.A0l.A0Y();
            A0B2.leftMargin = 0;
            A0B2.rightMargin = 0;
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(A0B2);
    }

    private void setCallType(int i) {
        this.A00 = i;
    }

    private void setShouldInvalidateItemDecorations(boolean z) {
        this.A0Y = z;
    }

    public void setCallGridListener(C1594484o r1) {
        this.A05 = r1;
    }

    public CallGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallGrid(Context context) {
        this(context, (AttributeSet) null);
    }
}
