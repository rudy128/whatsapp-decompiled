package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import androidx.fragment.app.Fragment;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;
import com.whatsapp.camera.mode.CameraModeTabLayout;
import com.whatsapp.pushtorecordmedia.MediaProgressRing;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7DY  reason: invalid class name */
public final class AnonymousClass7DY implements AnonymousClass8A5 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ObjectAnimator A04;
    public Rect A05;
    public SoundPool A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public ViewGroup A0C;
    public ViewGroup A0D;
    public ViewGroup A0E;
    public ViewGroup A0F;
    public CircularProgressBar A0G;
    public AnonymousClass1FU A0H;
    public C106595Wl A0I = C92724hn.A00;
    public C1419577p A0J;
    public C160978Av A0K;
    public C109775dz A0L;
    public AnonymousClass741 A0M;
    public C75393hQ A0N;
    public C75603ho A0O;
    public AnonymousClass701 A0P;
    public C133936pk A0Q;
    public C1605288v A0R;
    public C133796pV A0S;
    public C140086zv A0T;
    public AnonymousClass1EC A0U;
    public MediaProgressRing A0V;
    public C28931bI A0W;
    public C28931bI A0X;
    public C28931bI A0Y;
    public File A0Z;
    public Integer A0a;
    public String A0b;
    public String A0c;
    public List A0d = C18460wS.A00;
    public List A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i = true;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public final int A0s;
    public final long A0t = SystemClock.elapsedRealtime();
    public final long A0u;
    public final Fragment A0v;
    public final AnonymousClass7OI A0w;
    public final C218617r A0x;
    public final AnonymousClass1KB A0y;
    public final CX1 A0z;
    public final AnonymousClass2PB A10;
    public final C24771Lp A11;
    public final AnonymousClass1HS A12;
    public final C127066dk A13;
    public final C27251Vi A14;
    public final C136596u4 A15;
    public final C131506lD A16;
    public final CX2 A17;
    public final AnonymousClass731 A18;
    public final C1408973m A19;
    public final C88184Yq A1A;
    public final AnonymousClass11C A1B;
    public final AnonymousClass11P A1C;
    public final AnonymousClass118 A1D;
    public final C19830z4 A1E;
    public final C18000vb A1F;
    public final C18030ve A1G;
    public final C139176yM A1H;
    public final C18010vc A1I;
    public final C136246tV A1J;
    public final C139676zG A1K;
    public final C20050A4v A1L;
    public final C41111vp A1M;
    public final AnonymousClass10I A1N;
    public final AnonymousClass1VT A1O;
    public final AnonymousClass00H A1P;
    public final AnonymousClass00H A1Q;
    public final AnonymousClass00H A1R;
    public final AnonymousClass00H A1S;
    public final Runnable A1T;
    public final C18100vl A1U;
    public final C18100vl A1V;
    public final C18100vl A1W;
    public final boolean A1X;
    public final /* synthetic */ C1606289h A1Y;

    private final ObjectAnimator A02(View view, Runnable runnable, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ViewGroup viewGroup = this.A0C;
        if (viewGroup == null) {
            C18070vi.A11("cameraProgressWrapper");
            throw null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(150);
        ofFloat2.setDuration(150);
        ofFloat.addListener(new AnonymousClass74U(ofFloat2, this, runnable, z));
        ofFloat.addListener(new AnonymousClass74R(ofFloat2, 0));
        ofFloat.start();
        return ofFloat;
    }

    public static void A0E(View view, boolean z) {
        int i = 8;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            i = 0;
            f2 = 1.0f;
            f = 0.0f;
        }
        view.setAlpha(f);
        view.setVisibility(0);
        view.animate().alpha(f2).setDuration(300).withEndAction(new AnonymousClass7RP(view, i, 36)).start();
    }

    public static final void A0Y(AnonymousClass7DY r12, boolean z) {
        String str;
        if (z) {
            C160978Av r0 = r12.A0K;
            if (r0 == null) {
                str = "camera";
                C18070vi.A11(str);
                throw null;
            } else if (!r0.Beu() && !r12.A0q) {
                if (C18020vd.A05(C18040vf.A02, r12.A1G, 11382)) {
                    A0L(r12);
                    r12.A0q = true;
                }
            }
        }
        r12.A0f = z;
        AnonymousClass741 r1 = r12.A0M;
        if (r1 != null) {
            boolean z2 = !z;
            r1.A0L.setEnabled(z2);
            r1.A0T.setEnabled(z2);
            r1.A0U.setEnabled(z2);
            WDSButton wDSButton = r1.A09;
            if (wDSButton != null) {
                wDSButton.setEnabled(z2);
            }
            A03(r12, 2131428796).setEnabled(z2);
            C140086zv r13 = r12.A0T;
            if (r13 == null) {
                str = "recordingController";
                C18070vi.A11(str);
                throw null;
            }
            boolean z3 = r12.A0f;
            boolean z4 = r12.A0j;
            C136596u4 r02 = r12.A15;
            r13.A06.A01(r12.A0N, z3, z4, r02.A01(), true);
            if (z) {
                A0H(r12);
                r12.A09();
            } else if (r12.A16.A00(r02.A00)) {
                A0I(r12);
            }
            A0Z(r12, z2, true);
            A0E(A03(r12, 2131428796), z2);
            AnonymousClass741 r4 = r12.A0M;
            if (r4 != null) {
                View[] viewArr = new View[3];
                viewArr[0] = r4.A0J;
                viewArr[1] = r4.A05;
                Iterator it = C18070vi.A0O(r4.A0L, viewArr, 2).iterator();
                while (it.hasNext()) {
                    A0E(AnonymousClass3MX.A0E(it), z2);
                }
                A0E(C72453Mb.A0T(r12.A1V), z);
                A0E(AnonymousClass3MW.A0A(r12.A1U), z);
                C75603ho r03 = r12.A0O;
                if (r03 != null) {
                    r03.A0j(z);
                    return;
                }
                return;
            }
        }
        C18070vi.A11("cameraActionsController");
        throw null;
    }

    public void C5h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C160978Av r0 = this.A0K;
        if (r0 != null) {
            boolean z = false;
            if (!r0.isRecording()) {
                this.A0l = false;
                return;
            } else if (actionMasked != 1 || !A0t() || this.A15.A01()) {
                if (actionMasked == 2 && motionEvent.getPointerCount() == 1) {
                    if (!this.A15.A01()) {
                        this.A0l = false;
                        if (motionEvent.getY() < 0.0f) {
                            C160978Av r02 = this.A0K;
                            if (r02 != null) {
                                int maxZoom = r02.getMaxZoom();
                                if (maxZoom > 0) {
                                    View view = this.A0A;
                                    if (view != null) {
                                        float height = (float) (view.getHeight() / 2);
                                        float f = -motionEvent.getY();
                                        float f2 = height;
                                        if (height > f) {
                                            f2 = f;
                                        }
                                        int i = (int) (((float) maxZoom) * (f2 / height));
                                        if (i > 0) {
                                            z = true;
                                        }
                                        this.A0l = z;
                                        C160978Av r03 = this.A0K;
                                        if (r03 != null) {
                                            r03.CLV(i);
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (motionEvent.getPointerCount() > 1 && !this.A0l) {
                    View view2 = this.A0A;
                    if (view2 != null) {
                        view2.onTouchEvent(motionEvent);
                        return;
                    }
                } else {
                    return;
                }
                C18070vi.A11("cameraView");
                throw null;
            } else {
                A0X(this, true);
                C140086zv r04 = this.A0T;
                if (r04 == null) {
                    C18070vi.A11("recordingController");
                    throw null;
                } else {
                    A0W(this, r04.A03());
                    return;
                }
            }
        }
        C18070vi.A11("camera");
        throw null;
    }

    private final int A00() {
        C1606289h r2 = this.A1Y;
        int BVn = r2.BVn();
        if (BVn == 17 || BVn == 18 || r2.BVn() == 19 || A0g(this)) {
            return A04(this).getIntent().getIntExtra("max_items", this.A01);
        }
        if (this.A15.A05) {
            if (!C18020vd.A05(C18040vf.A02, this.A1G, 5643)) {
                return 1;
            }
        }
        return this.A01;
    }

    public static final int A01(AnonymousClass7DY r1) {
        if (r1.A15.A01()) {
            return 18;
        }
        return 17;
    }

    public static final View A03(AnonymousClass7DY r0, int i) {
        View view = r0.A0B;
        if (view != null) {
            return AnonymousClass1HF.A06(view, i);
        }
        C18070vi.A11("rootView");
        throw null;
    }

    public static final AnonymousClass1FU A04(AnonymousClass7DY r0) {
        AnonymousClass1FU r02 = r0.A0H;
        if (r02 != null) {
            return r02;
        }
        throw AnonymousClass000.A0s("Host activity is NULL");
    }

    public static String A05(int i) {
        if (i == 20) {
            return "my_status_fab_camera";
        }
        if (i == 21) {
            return "status_tab_fab_camera";
        }
        switch (i) {
            case 1:
                return "camera_tab";
            case 2:
                return "chat_button";
            case 3:
                return "chat_menu";
            case 4:
                return "status_tab";
            case 5:
                return "status_reply";
            case 6:
                return "smb_quick_reply_edit";
            case 7:
                return "smb_quick_reply_send";
            default:
                switch (i) {
                    case 16:
                        return "smb_premium_message";
                    case 17:
                        return "flows_camera_experience";
                    case 18:
                        return "flows_camera_only_experience";
                    default:
                        switch (i) {
                            case 23:
                                return "status_tab_self_pog";
                            case 24:
                                return "sticker_maker";
                            case 25:
                                return "media_picker";
                            case 26:
                                return "chat_media_picker";
                            default:
                                return "unknown";
                        }
                }
        }
    }

    private final void A07() {
        if (this.A0H != null) {
            AnonymousClass1FU A042 = A04(this);
            AnonymousClass11C r7 = this.A1B;
            C18000vb r6 = this.A1F;
            Set set = this.A15.A09;
            long size = (long) set.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, set.size());
            AnonymousClass1Y5.A00(A042, r7, r6.A0K(A1a, 2131755256, size));
        }
    }

    private final void A08() {
        if (C18020vd.A05(C18040vf.A02, this.A1G, 8308)) {
            int size = this.A15.A09.size();
            C133936pk r0 = this.A0Q;
            if (size > 0) {
                if (r0 != null) {
                    CameraModeTabLayout cameraModeTabLayout = r0.A02;
                    C136836uU r1 = cameraModeTabLayout.A00;
                    if (r1 != null) {
                        if (r1.A03 == cameraModeTabLayout) {
                            cameraModeTabLayout.A0C(r1.A00);
                        } else {
                            throw AnonymousClass000.A0k("Tab does not belong to this TabLayout.");
                        }
                    }
                    cameraModeTabLayout.A00 = null;
                    return;
                }
            } else if (r0 != null) {
                r0.A00();
                return;
            }
            C18070vi.A11("cameraModeTabController");
            throw null;
        }
    }

    private final void A09() {
        int A012;
        AnonymousClass741 r4 = this.A0M;
        if (r4 == null) {
            C18070vi.A11("cameraActionsController");
            throw null;
        }
        boolean A1R2 = C17890vO.A1R(this.A15.A01);
        boolean z = this.A0f;
        if (!r4.A0N.A02) {
            ViewGroup.LayoutParams layoutParams = r4.A0H.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = r4.A0U.getLayoutParams();
            C18070vi.A0z(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int i = marginLayoutParams.bottomMargin;
            if (z) {
                A012 = C62762rw.A01(r4.A0E, 121.0f);
            } else if (A1R2) {
                A012 = r4.A0E.getResources().getDimensionPixelSize(2131167636);
            } else {
                A012 = marginLayoutParams2.bottomMargin + marginLayoutParams.height + C62762rw.A01(r4.A0E, 8.0f);
            }
            ValueAnimator A0B2 = C108995ce.A0B(i, A012);
            A0B2.setInterpolator(new AccelerateDecelerateInterpolator());
            A0B2.addUpdateListener(new C88704ae(r4, marginLayoutParams, 1));
            A0B2.setDuration(150);
            A0B2.start();
        }
    }

    private final void A0A(int i) {
        View view = this.A07;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C108965cb.A0A(view);
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, i);
            View view2 = this.A07;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
                return;
            }
        }
        C18070vi.A11("cameraActions");
        throw null;
    }

    private final void A0B(int i) {
        View view = this.A07;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C108965cb.A0A(view);
            marginLayoutParams.setMargins(0, i, 0, marginLayoutParams.bottomMargin);
            View view2 = this.A07;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
                View A032 = A03(this, 2131431056);
                C72463Mc.A14(A032, A032.getPaddingLeft(), i);
                return;
            }
        }
        C18070vi.A11("cameraActions");
        throw null;
    }

    private final void A0C(int i) {
        AnonymousClass701 r2 = this.A0P;
        if (r2 == null) {
            C18070vi.A11("cameraBottomSheetController");
            throw null;
        } else {
            r2.A0C.A0V(i + AnonymousClass3MZ.A01(this.A1D.A00, 2131165724) + r2.A0B.getMeasuredHeight());
        }
    }

    public static final void A0F(AnonymousClass7DY r3) {
        r3.A0y.A08(2131889961, 1);
        A0O(r3);
        r3.A1Y.BnQ();
    }

    public static final void A0G(AnonymousClass7DY r12) {
        AnonymousClass731 r4 = r12.A18;
        C160978Av r0 = r12.A0K;
        if (r0 != null) {
            boolean Beu = r0.Beu();
            C160978Av r02 = r12.A0K;
            if (r02 != null) {
                int zoomLevel = r02.getZoomLevel();
                C160978Av r03 = r12.A0K;
                if (r03 != null) {
                    String flashMode = r03.getFlashMode();
                    boolean z = r12.A0j;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C1408973m r2 = r12.A19;
                    AnonymousClass731.A01(r4, flashMode, zoomLevel, 2, elapsedRealtime - r2.A05, Beu, z);
                    C160978Av r04 = r12.A0K;
                    if (r04 != null) {
                        Integer valueOf = Integer.valueOf(r04.getCameraApi());
                        C160978Av r05 = r12.A0K;
                        if (r05 != null) {
                            int cameraType = r05.getCameraType();
                            boolean z2 = !r05.Beu();
                            C160978Av r06 = r12.A0K;
                            if (r06 != null) {
                                String valueOf2 = String.valueOf(r06.getVideoResolution());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                long j = r2.A04;
                                AnonymousClass63U r1 = new AnonymousClass63U();
                                r1.A02 = Integer.valueOf(cameraType);
                                r1.A00 = valueOf;
                                r1.A01 = Integer.valueOf(z2 ? 1 : 0);
                                r1.A05 = valueOf2;
                                r1.A03 = Long.valueOf(j);
                                r1.A04 = Long.valueOf(elapsedRealtime2);
                                r2.A06.CC7(r1);
                                if (r2.A08) {
                                    C1408973m.A02(r2, "stop_video_recording", 554249147);
                                    C1408973m.A01(r2, valueOf, 554249147, cameraType);
                                    C1408973m.A00(r2, 554249147, z2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11("camera");
        throw null;
    }

    public static final void A0H(AnonymousClass7DY r4) {
        C136596u4 r3 = r4.A15;
        if (r3.A01 == 1) {
            AnonymousClass701 r0 = r4.A0P;
            if (r0 != null) {
                AnimatorSet animatorSet = r0.A00;
                if (animatorSet == null || !animatorSet.isStarted()) {
                    r3.A01 = 2;
                    r4.A09();
                    AnonymousClass701 r1 = r4.A0P;
                    if (r1 != null) {
                        r1.A02(false);
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11("cameraBottomSheetController");
            throw null;
        }
    }

    public static final void A0I(AnonymousClass7DY r4) {
        C136596u4 r3 = r4.A15;
        if (r3.A01 != 1) {
            AnonymousClass701 r0 = r4.A0P;
            if (r0 != null) {
                AnimatorSet animatorSet = r0.A00;
                if (animatorSet == null || !animatorSet.isStarted()) {
                    r3.A01 = 1;
                    r4.A09();
                    AnonymousClass701 r02 = r4.A0P;
                    if (r02 != null) {
                        r02.A02(true);
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11("cameraBottomSheetController");
            throw null;
        }
    }

    public static final void A0J(AnonymousClass7DY r12) {
        String str;
        Integer num;
        C109775dz r0;
        if (r12.A0f) {
            A0X(r12, true);
        }
        if (r12.A0k) {
            if (C18020vd.A05(C18040vf.A02, r12.A1G, 11100)) {
                return;
            }
        }
        if (!r12.A0d()) {
            if (r12.A14.A00.A0E()) {
                Log.i("CameraUi/startVideoCapture");
                C136246tV r1 = r12.A1J;
                C160978Av r02 = r12.A0K;
                if (r02 != null) {
                    if (r02.getCameraFacing() == 0) {
                        num = AnonymousClass00R.A00;
                    } else {
                        num = AnonymousClass00R.A01;
                    }
                    r1.A04 = num;
                    C136596u4 r7 = r12.A15;
                    Set set = r7.A09;
                    if (set.size() >= r12.A01) {
                        r12.A0o(C18020vd.A00(C18040vf.A02, r12.A1G, 2693));
                    }
                    int size = set.size();
                    int i = r12.A01;
                    if (size >= i) {
                        AnonymousClass1KB r4 = r12.A0y;
                        AnonymousClass118 r2 = r12.A1D;
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, i, 0);
                        r4.A0G(r2.A02(2131896124, objArr), 0);
                        return;
                    } else if (r12.A12.A03()) {
                        A0F(r12);
                        return;
                    } else {
                        C1408973m r6 = r12.A19;
                        if (r6.A08) {
                            r6.A07.markerStart(554249147);
                            C1408973m.A03(r6, "start_video_capture", 554249147);
                        }
                        C218617r r10 = r12.A0x;
                        C18010vc r9 = r12.A1I;
                        C26551So r8 = C26551So.A0q;
                        int i2 = 1;
                        if (C18020vd.A05(C18040vf.A02, r12.A1G, 401)) {
                            i2 = 4;
                        }
                        r12.A0Z = C1403270y.A00(r10, r9, r8, ".mp4", i2);
                        if (!r12.A1X && (r0 = r12.A0L) != null) {
                            r0.disable();
                        }
                        C160978Av r03 = r12.A0K;
                        if (r03 != null) {
                            if (r03.Bk9() && r12.A0H != null) {
                                AnonymousClass741 r13 = r12.A0M;
                                if (r13 != null) {
                                    Window window = A04(r12).getWindow();
                                    C18070vi.A0X(window);
                                    WindowManager.LayoutParams attributes = window.getAttributes();
                                    View view = r13.A0G;
                                    view.setVisibility(0);
                                    view.setBackgroundColor(-855638017);
                                    attributes.screenBrightness = 1.0f;
                                    window.setAttributes(attributes);
                                }
                                C18070vi.A11("cameraActionsController");
                                throw null;
                            }
                            boolean A012 = r7.A01();
                            AnonymousClass741 r22 = r12.A0M;
                            if (A012) {
                                if (r22 != null) {
                                    AnonymousClass741.A02(r22, 1.0f, 1.25f);
                                }
                                C18070vi.A11("cameraActionsController");
                                throw null;
                            }
                            if (r22 != null) {
                                AnonymousClass741.A03(r22, 1.0f, 0.6f, true);
                                AnonymousClass741.A02(r22, 1.0f, 2.0f);
                                AnonymousClass741 r04 = r12.A0M;
                                if (r04 != null) {
                                    r04.A0L.setPressed(false);
                                }
                            }
                            C18070vi.A11("cameraActionsController");
                            throw null;
                            View view2 = r12.A0A;
                            if (view2 == null) {
                                str = "cameraView";
                            } else {
                                view2.setKeepScreenOn(true);
                                r6.A05 = SystemClock.elapsedRealtime();
                                r12.A0h(true);
                                File file = r12.A0Z;
                                if (file != null) {
                                    C160978Av r23 = r12.A0K;
                                    if (r23 != null) {
                                        int i3 = 0;
                                        if (r23.Beu()) {
                                            i3 = 360;
                                        }
                                        r23.COO(file, i3);
                                    }
                                }
                                C140086zv r62 = r12.A0T;
                                if (r62 == null) {
                                    str = "recordingController";
                                } else {
                                    boolean A013 = r7.A01();
                                    r62.A00 = SystemClock.elapsedRealtime();
                                    r62.A04.sendEmptyMessage(0);
                                    r62.A02(true, true, !A013);
                                    if (!r12.A0f) {
                                        AnonymousClass741 r14 = r12.A0M;
                                        if (r14 != null) {
                                            r14.A0B(r7.A01());
                                        }
                                        C18070vi.A11("cameraActionsController");
                                        throw null;
                                    }
                                    C133936pk r05 = r12.A0Q;
                                    if (r05 == null) {
                                        str = "cameraModeTabController";
                                    } else {
                                        A0R(r12, r05, 4);
                                        A0Z(r12, false, false);
                                        AnonymousClass4a5.A03(r12.A1B);
                                        AnonymousClass3MY.A1L(r12.A1M, true);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                C18070vi.A11("camera");
                throw null;
            }
            AnonymousClass741 r06 = r12.A0M;
            if (r06 == null) {
                str = "cameraActionsController";
            } else {
                r06.A09();
                AnonymousClass1FU A042 = A04(r12);
                C134126q5 r24 = new C134126q5(A04(r12));
                r24.A01 = 2131232106;
                r24.A02 = 2131894361;
                r24.A0A = null;
                r24.A03 = 2131894360;
                r24.A08 = null;
                String[] A1Y2 = C17880vN.A1Y();
                A1Y2[0] = "android.permission.RECORD_AUDIO";
                r24.A0C = A1Y2;
                A042.startActivity(r24.A00());
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A0K(AnonymousClass7DY r4) {
        View view = r4.A0A;
        if (view == null) {
            C18070vi.A11("cameraView");
            throw null;
        } else {
            view.postDelayed(new AnonymousClass7R9((Object) r4, 12), 150);
        }
    }

    public static final void A0M(AnonymousClass7DY r8) {
        int i;
        int i2;
        AnonymousClass1FU r0 = r8.A0H;
        if (r0 == null || C108965cb.A03(r0).screenWidthDp < 600) {
            View A032 = A03(r8, 2131428809);
            View A033 = A03(r8, 2131428796);
            Rect A072 = AnonymousClass3MW.A07();
            Rect A073 = AnonymousClass3MW.A07();
            View view = r8.A0B;
            if (view != null) {
                view.getGlobalVisibleRect(A072);
                A032.getGlobalVisibleRect(A073);
                int measuredHeight = A033.getMeasuredHeight();
                View view2 = r8.A0B;
                if (view2 != null) {
                    int measuredHeight2 = (view2.getMeasuredHeight() - A032.getMeasuredHeight()) - measuredHeight;
                    if (measuredHeight2 >= 0) {
                        if (measuredHeight2 <= measuredHeight) {
                            i = 0;
                        } else {
                            i = measuredHeight2 / 2;
                        }
                        int i3 = A073.top;
                        int i4 = (i3 - (measuredHeight - i3)) - i;
                        Rect rect = r8.A05;
                        if (rect != null) {
                            int i5 = rect.top;
                            i2 = i4;
                            if (i4 < i5) {
                                i2 = i5;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = measuredHeight + i;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C108965cb.A0A(A032);
                        marginLayoutParams.setMargins(0, i4, 0, i6);
                        A032.setLayoutParams(marginLayoutParams);
                        r8.A0B(i2);
                        r8.A0A(i6);
                        r8.A0C(i6);
                        r8.A0D(A033, 2131428777, i);
                        return;
                    }
                    int i7 = A072.bottom - A073.bottom;
                    r8.A0B(A073.top);
                    int i8 = i7 + measuredHeight;
                    r8.A0A(i8);
                    r8.A0C(i8);
                    r8.A0D(A033, -1, i7);
                    return;
                }
            }
            C18070vi.A11("rootView");
            throw null;
        }
    }

    public static final void A0N(AnonymousClass7DY r9) {
        String str;
        AnonymousClass741 r6 = r9.A0M;
        if (r6 != null) {
            boolean z = r9.A0g;
            boolean z2 = r9.A0f;
            ViewGroup viewGroup = r6.A0J;
            viewGroup.setAlpha(C108975cc.A00(z2 ? 1 : 0));
            boolean z3 = !z2;
            int i = 8;
            viewGroup.setVisibility(C72453Mb.A07(z3 ? 1 : 0));
            r6.A0C(z3);
            WaImageView waImageView = r6.A0L;
            waImageView.setEnabled(true);
            if (z && !z2) {
                waImageView.sendAccessibilityEvent(8);
            }
            WDSButton wDSButton = r6.A0U;
            wDSButton.setEnabled(true);
            if (r6.A0X && !z2) {
                i = 0;
            }
            wDSButton.setVisibility(i);
            r6.A0K.setEnabled(true);
            WDSButton wDSButton2 = r6.A08;
            if (wDSButton2 != null) {
                wDSButton2.setEnabled(true);
            }
            if (!z2) {
                AnonymousClass741.A01(r6);
                r6.A08();
                r6.A07();
                r6.A0S.setVisibility(0);
            }
            AnonymousClass741.A04(r6, false);
            AnonymousClass701 r0 = r9.A0P;
            if (r0 == null) {
                str = "cameraBottomSheetController";
            } else {
                if (r0.A0C.A0J != 3 && !r9.A0f) {
                    C133936pk r02 = r9.A0Q;
                    if (r02 == null) {
                        str = "cameraModeTabController";
                    } else {
                        A0R(r9, r02, 0);
                    }
                }
                AnonymousClass741 r03 = r9.A0M;
                if (r03 != null) {
                    r03.A09();
                    C140086zv r1 = r9.A0T;
                    if (r1 == null) {
                        str = "recordingController";
                    } else {
                        r1.A02(r9.A15.A01(), false, false);
                        return;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("cameraActionsController");
        throw null;
    }

    public static final void A0O(AnonymousClass7DY r3) {
        String str;
        if (C18020vd.A05(C18040vf.A02, r3.A1G, 12790)) {
            r3.A0p = true;
            C160978Av r0 = r3.A0K;
            if (r0 == null) {
                str = "camera";
            } else {
                r0.BEp();
                A0I(r3);
                A0Z(r3, !r3.A0f, true);
                A0N(r3);
                AnonymousClass741 r02 = r3.A0M;
                if (r02 == null) {
                    str = "cameraActionsController";
                } else {
                    r02.A06();
                    C133936pk r1 = r3.A0Q;
                    if (r1 == null) {
                        str = "cameraModeTabController";
                    } else if (!r1.A00) {
                        r1.A02.setEnabled(false);
                        return;
                    } else {
                        return;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A0P(AnonymousClass7DY r18) {
        String str;
        AnonymousClass7DY r4 = r18;
        C18030ve r6 = r4.A1G;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r6, 11875)) {
            C160978Av r0 = r4.A0K;
            if (r0 != null) {
                if (!r0.BeH()) {
                    r4.A0y.A08(2131887877, 0);
                    return;
                }
            }
            C18070vi.A11("camera");
            throw null;
        }
        if (r4.A0f) {
            A0X(r4, true);
        }
        Log.i("CameraUi/takePicture");
        SoundPool soundPool = r4.A06;
        if (r4.A0n && soundPool != null) {
            if (C18020vd.A05(r2, r6, 4959)) {
                r4.A10.execute(new C146627Pz(soundPool, (WeakReference) null, 1.0f, 1.0f, r4.A00));
            } else {
                soundPool.play(r4.A00, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
        Set set = r4.A15.A09;
        if (set.size() >= r4.A01) {
            r4.A0o(C18020vd.A00(r2, r6, 2693));
        }
        r4.A0o(r4.A00());
        int size = set.size();
        int i = r4.A01;
        if (size >= i) {
            AnonymousClass1KB r3 = r4.A0y;
            AnonymousClass118 r22 = r4.A1D;
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, i, 0);
            r3.A0G(r22.A02(2131896124, objArr), 0);
            return;
        }
        C1408973m r23 = r4.A19;
        r23.A00 = SystemClock.elapsedRealtime();
        if (r23.A08) {
            r23.A07.markerStart(554240366);
        }
        AnonymousClass741 r02 = r4.A0M;
        if (r02 != null) {
            r02.A06();
            if (!C108945cZ.A1U(set)) {
                AnonymousClass701 r1 = r4.A0P;
                if (r1 == null) {
                    str = "cameraBottomSheetController";
                } else {
                    boolean z = !r4.A0f;
                    View view = r1.A06;
                    if (view.getVisibility() != 4) {
                        view.setVisibility(4);
                        if (z) {
                            AnimationSet animationSet = new AnimationSet(true);
                            animationSet.addAnimation(C108985cd.A0H());
                            C108985cd.A11(view, animationSet);
                        }
                    }
                    if (!r4.A0f) {
                        AnonymousClass741 r03 = r4.A0M;
                        if (r03 != null) {
                            r03.A0B(false);
                        }
                    }
                    C133936pk r12 = r4.A0Q;
                    if (r12 == null) {
                        str = "cameraModeTabController";
                    } else {
                        A0R(r4, r12, 4);
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            C160978Av r04 = r4.A0K;
            if (r04 != null) {
                if (r04.Bk9()) {
                    if (r4.A0H != null) {
                        AnonymousClass741 r13 = r4.A0M;
                        if (r13 != null) {
                            Window window = A04(r4).getWindow();
                            C18070vi.A0X(window);
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            View view2 = r13.A0G;
                            view2.setVisibility(0);
                            view2.setBackgroundColor(-3886);
                            attributes.screenBrightness = 1.0f;
                            window.setAttributes(attributes);
                        }
                    }
                    View view3 = r4.A0A;
                    if (view3 == null) {
                        str = "cameraView";
                        C18070vi.A11(str);
                        throw null;
                    }
                    view3.postDelayed(new AnonymousClass7R9((Object) r4, 10), 300);
                    return;
                }
                A0Q(r4);
                return;
            }
            C18070vi.A11("camera");
            throw null;
        }
        C18070vi.A11("cameraActionsController");
        throw null;
    }

    public static final void A0Q(AnonymousClass7DY r5) {
        long j;
        C75603ho r1 = r5.A0O;
        boolean z = false;
        if (r1 != null) {
            z = C108975cc.A1B(r1.A0m() ? 1 : 0);
        }
        if (r5.A0h(z)) {
            j = 500;
        } else {
            j = 0;
        }
        View view = r5.A0A;
        if (view == null) {
            C18070vi.A11("cameraView");
            throw null;
        } else {
            view.postDelayed(new AnonymousClass7R9((Object) r5, 11), j);
        }
    }

    public static final void A0S(AnonymousClass7DY r8, AnonymousClass8B2 r9) {
        String str;
        if (r9 != null) {
            C136596u4 r4 = r8.A15;
            r4.A05 = C22971Dz.A0h(r8.A0d);
            Set set = r4.A09;
            if (set.size() >= r8.A01) {
                r8.A0o(C18020vd.A00(C18040vf.A02, r8.A1G, 2693));
            }
            int A002 = r8.A00();
            Uri BLl = r9.BLl();
            C18030ve r3 = r8.A1G;
            if (set.contains(BLl)) {
                set.remove(BLl);
                r4.A03.A03(BLl);
            } else if ((!r4.A05 || set.size() < 1 || C18020vd.A05(C18040vf.A02, r3, 5643)) && set.size() < A002) {
                set.add(BLl);
                if (set.size() > 1) {
                    r4.A04 = true;
                }
                r4.A03.A06(new AnonymousClass72S(BLl));
            } else {
                Object[] objArr = new Object[1];
                r8.A0y.A0G(AnonymousClass3MW.A05(r8.A1D).getQuantityString(2131755397, A002, objArr), C72453Mb.A1b(objArr, A002) ? 1 : 0);
            }
            if (C108945cZ.A1U(set)) {
                r8.A07();
            }
            AnonymousClass741 r2 = r8.A0M;
            if (r2 == null) {
                str = "cameraActionsController";
            } else {
                r2.A0D(C108945cZ.A1U(set), set.size());
                AnonymousClass701 r0 = r8.A0P;
                if (r0 == null) {
                    str = "cameraBottomSheetController";
                } else {
                    AnonymousClass701.A00(r0);
                    r8.A08();
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A0T(AnonymousClass7DY r6, AnonymousClass8B2 r7, AnonymousClass65B r8, boolean z) {
        String str;
        if (r7 == null) {
            Log.i("CameraUi/showMediaPreview/media-is-null");
            return;
        }
        Uri BLl = r7.BLl();
        C17900vP.A0Y(BLl, "CameraUi/showMediaPreview ", AnonymousClass000.A10());
        AnonymousClass1FU r0 = r6.A0H;
        if (r0 != null && !r0.Bed()) {
            if (z) {
                r6.A15.A08.add(0, r7);
            }
            C136596u4 r4 = r6.A15;
            r4.A03.A06(new AnonymousClass72S(BLl));
            Set set = r4.A09;
            if (set.size() > 0) {
                set.add(BLl);
                if (set.size() > 1) {
                    r4.A04 = true;
                }
                AnonymousClass701 r02 = r6.A0P;
                if (r02 == null) {
                    str = "cameraBottomSheetController";
                } else {
                    AnonymousClass701.A00(r02);
                    AnonymousClass741 r1 = r6.A0M;
                    if (r1 == null) {
                        str = "cameraActionsController";
                    } else {
                        r1.A0D(true, set.size());
                        r6.A07();
                        C160978Av r03 = r6.A0K;
                        if (r03 == null) {
                            str = "camera";
                        } else {
                            r03.CFx();
                            A0Z(r6, !r6.A0f, true);
                            if ((r7 instanceof AnonymousClass8BB) && r6.A0f) {
                                A0X(r6, false);
                                return;
                            }
                            return;
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            A0U(r6, r8, C18070vi.A0M(BLl));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006c, code lost:
        if (r2.A09.size() != 0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0U(X.AnonymousClass7DY r8, X.AnonymousClass65B r9, java.util.Collection r10) {
        /*
            boolean r0 = X.AnonymousClass745.A00
            r3 = r8
            if (r0 == 0) goto L_0x007b
            if (r9 == 0) goto L_0x007b
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r9)
            X.AnonymousClass3Ma.A1P(r9, r0, r8)
            r0 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
            android.view.View r1 = A03(r3, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            r0 = 2131430966(0x7f0b0e36, float:1.8483648E38)
            android.view.View r1 = A03(r3, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            r0 = 2131430860(0x7f0b0dcc, float:1.8483433E38)
            android.view.View r1 = A03(r3, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            r0 = 2131435149(0x7f0b1e8d, float:1.8492132E38)
            android.view.View r1 = A03(r3, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            android.graphics.Bitmap r4 = r9.A06
            X.8B2 r6 = r9.A08
        L_0x004e:
            X.6u4 r2 = r3.A15
            r7 = r10
            java.util.Iterator r1 = r10.iterator()
        L_0x0055:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            android.net.Uri r0 = X.C108945cZ.A0M(r1)
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0055
            java.util.Set r0 = r2.A09
            int r0 = r0.size()
            r9 = 2
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r9 = 3
        L_0x006f:
            androidx.fragment.app.Fragment r5 = r3.A0v
            java.util.Set r0 = r2.A09
            boolean r10 = X.C108945cZ.A1U(r0)
            r3.A0r(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x007b:
            r8 = 0
            r4 = r8
            r6 = r8
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0U(X.7DY, X.65B, java.util.Collection):void");
    }

    public static final void A0V(AnonymousClass7DY r5, boolean z) {
        if (r5.A0H != null) {
            AnonymousClass741 r1 = r5.A0M;
            String str = "cameraActionsController";
            if (r1 != null) {
                Window window = A04(r5).getWindow();
                C18070vi.A0X(window);
                WindowManager.LayoutParams attributes = window.getAttributes();
                r1.A0G.setVisibility(4);
                attributes.screenBrightness = -1.0f;
                window.setAttributes(attributes);
                if (!z) {
                    AnonymousClass741 r0 = r5.A0M;
                    if (r0 != null) {
                        r0.A09();
                        C140086zv r2 = r5.A0T;
                        str = "recordingController";
                        if (r2 != null) {
                            r2.A02(r5.A15.A01(), false, false);
                            C140086zv r02 = r5.A0T;
                            if (r02 != null) {
                                r02.A01();
                                C109775dz r03 = r5.A0L;
                                if (r03 != null) {
                                    r03.enable();
                                }
                            }
                        }
                    }
                } else {
                    A0N(r5);
                }
                r5.A1N.CGF(new AnonymousClass7RK(22, (Object) r5, z));
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1 == 3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0W(X.AnonymousClass7DY r4, boolean r5) {
        /*
            X.8Av r0 = r4.A0K
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "camera"
        L_0x0006:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x000b:
            boolean r0 = r0.Bga()
            if (r0 == 0) goto L_0x001b
            X.1KB r2 = r4.A0y
            r1 = 2131887879(0x7f120707, float:1.9410378E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x001b:
            X.741 r3 = r4.A0M
            if (r3 != 0) goto L_0x0022
            java.lang.String r0 = "cameraActionsController"
            goto L_0x0006
        L_0x0022:
            int r1 = r3.A01
            r0 = 2
            if (r1 == r0) goto L_0x002b
            r0 = 3
            r2 = 0
            if (r1 != r0) goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x0034
            r0 = 1067450368(0x3fa00000, float:1.25)
        L_0x0034:
            X.AnonymousClass741.A02(r3, r0, r1)
            android.view.View r3 = r4.A0A
            if (r3 != 0) goto L_0x003e
            java.lang.String r0 = "cameraView"
            goto L_0x0006
        L_0x003e:
            r0 = 23
            X.7RK r2 = new X.7RK
            r2.<init>((int) r0, (java.lang.Object) r4, (boolean) r5)
            r0 = 220(0xdc, double:1.087E-321)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0W(X.7DY, boolean):void");
    }

    public static final void A0Z(AnonymousClass7DY r1, boolean z, boolean z2) {
        String str;
        AnonymousClass701 r0 = r1.A0P;
        if (r0 == null) {
            str = "cameraBottomSheetController";
        } else {
            r0.A03(z);
            AnonymousClass741 r2 = r1.A0M;
            if (r2 == null) {
                str = "cameraActionsController";
            } else {
                Set set = r1.A15.A09;
                r2.A0D(C108945cZ.A1U(set) & z2, set.size());
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0a(AnonymousClass7DY r4, boolean z, boolean z2) {
        if (C18020vd.A05(C18040vf.A02, r4.A1G, 11998)) {
            C160978Av r3 = r4.A0K;
            if (r3 != null) {
                r3.COa(new C146847Qv(r4, 5, z2, z), new AnonymousClass7R9((Object) r4, 14));
                return;
            }
        } else {
            C160978Av r0 = r4.A0K;
            if (r0 != null) {
                r0.COZ();
                if (z2) {
                    r4.A0y.A0J(new AnonymousClass7R9((Object) r4, 16));
                }
                A0G(r4);
                r4.A0y.A0J(new AnonymousClass7RK(24, (Object) r4, z));
                return;
            }
        }
        C18070vi.A11("camera");
        throw null;
    }

    public static final void A0b(AnonymousClass7DY r4, boolean z, boolean z2, boolean z3) {
        String str;
        C160978Av r0 = r4.A0K;
        if (r0 == null) {
            str = "camera";
        } else if (!r0.Bga()) {
            AnonymousClass4a5.A03(r4.A1B);
            C1408973m.A02(r4.A19, "video_record", 554249147);
            View view = r4.A0A;
            if (view == null) {
                str = "cameraView";
            } else {
                boolean z4 = false;
                view.setKeepScreenOn(false);
                AnonymousClass3MY.A1L(r4.A1M, false);
                A0K(r4);
                C18030ve r2 = r4.A1G;
                C18040vf r1 = C18040vf.A02;
                if (C18020vd.A05(r1, r2, 12195) && (C18020vd.A05(r1, r2, 8708) || C18020vd.A05(r1, r2, 8233))) {
                    z4 = true;
                }
                if (!z2 || z4) {
                    A0a(r4, z, z3);
                    return;
                } else {
                    r4.A1N.CGF(new C146847Qv(r4, 4, z, z3));
                    return;
                }
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    private final void A0c(ArrayList arrayList) {
        String str;
        C136596u4 r4 = this.A15;
        r4.A04 = true;
        Set set = r4.A09;
        set.clear();
        if (arrayList != null) {
            set.addAll(arrayList);
        }
        this.A0o = true;
        AnonymousClass741 r2 = this.A0M;
        if (r2 == null) {
            str = "cameraActionsController";
        } else {
            r2.A0D(C108945cZ.A1U(set), set.size());
            if (r4.A01 != 1) {
                A09();
            }
            AnonymousClass701 r0 = this.A0P;
            if (r0 == null) {
                str = "cameraBottomSheetController";
            } else {
                AnonymousClass701.A00(r0);
                if (!this.A0p) {
                    A0m();
                }
                this.A18.A03(9);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    private final boolean A0d() {
        if (!AnonymousClass000.A1a(this.A0d) || !C42701yb.A01((AnonymousClass1BI) C29431cG.A0b(this.A0d)) || !(!this.A0d.isEmpty()) || !AnonymousClass3MW.A0W(this.A1P).A0E((AnonymousClass1BI) C29431cG.A0b(this.A0d))) {
            return false;
        }
        return true;
    }

    public static final boolean A0e(AnonymousClass7DY r2) {
        AnonymousClass701 r0 = r2.A0P;
        if (r0 != null) {
            C112255lB r02 = r0.A01;
            if (!(r02 == null || r02.A00 == null || r2.A0t())) {
                AnonymousClass701 r03 = r2.A0P;
                if (r03 != null) {
                    if (r03.A0C.A0J != 4 || r2.A0f) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        C18070vi.A11("cameraBottomSheetController");
        throw null;
    }

    public static final boolean A0f(AnonymousClass7DY r2) {
        int i = r2.A0s;
        if (i == 24 || i == 25 || i == 26) {
            return true;
        }
        if (i != 4 && i != 21 && i != 20 && i != 23) {
            return false;
        }
        if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(r2.A1S), 11868)) {
            return true;
        }
        return false;
    }

    public static final boolean A0g(AnonymousClass7DY r1) {
        if (!AnonymousClass000.A1a(r1.A0d) || !C42701yb.A01((AnonymousClass1BI) C29431cG.A0b(r1.A0d)) || !AnonymousClass3MW.A0X(r1.A1Q).A0B()) {
            return false;
        }
        return true;
    }

    private final boolean A0h(boolean z) {
        if (this.A0c != null) {
            return false;
        }
        C160978Av r0 = this.A0K;
        if (r0 != null) {
            if (r0.Beu()) {
                return false;
            }
            C160978Av r02 = this.A0K;
            if (r02 != null) {
                if (r02.Bgi()) {
                    return false;
                }
                C160978Av r03 = this.A0K;
                if (r03 != null) {
                    if (C18070vi.A18(r03.getFlashMode(), "off") || !z || this.A0H == null) {
                        return false;
                    }
                    C160978Av r1 = this.A0K;
                    if (r1 != null) {
                        this.A0c = r1.getFlashMode();
                        r1.CPa();
                        return true;
                    }
                }
            }
        }
        C18070vi.A11("camera");
        throw null;
    }

    public final void A0i() {
        C1408973m r4 = this.A19;
        r4.A01 = 0;
        if (r4.A08) {
            r4.A07.markerAnnotate(554251647, "error_message", "permission");
            r4.A05(4);
        }
    }

    public final void A0j() {
        String str;
        if (this.A0H != null) {
            C34001jj r1 = new C34001jj(AnonymousClass3MX.A0O(A04(this)));
            r1.A07(this.A0v);
            r1.A02();
            C140086zv r0 = this.A0T;
            if (r0 == null) {
                str = "recordingController";
            } else {
                r0.A01();
                this.A1O.unregisterObserver(this.A0w);
                AnonymousClass701 r3 = this.A0P;
                if (r3 == null) {
                    str = "cameraBottomSheetController";
                } else {
                    A34 a34 = r3.A03;
                    if (a34 != null) {
                        a34.A0B(true);
                        r3.A03 = null;
                    }
                    r3.A0F.CGF(new AnonymousClass7R9((Object) r3, 25));
                    MediaProgressRing mediaProgressRing = this.A0V;
                    if (mediaProgressRing == null) {
                        str = "recordingProgressRing";
                    } else {
                        mediaProgressRing.A01();
                        this.A0H = null;
                        this.A0R = null;
                        return;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public final void A0k() {
        String str;
        boolean z;
        if (this.A0H != null) {
            C160978Av r0 = this.A0K;
            if (r0 != null) {
                if (r0.isRecording()) {
                    z = C18020vd.A05(C18040vf.A02, this.A1G, 11998);
                    C140086zv r02 = this.A0T;
                    str = "recordingController";
                    if (r02 != null) {
                        SystemClock.elapsedRealtime();
                        A0b(this, r02.A03(), false, true);
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                z = false;
                View view = this.A0A;
                if (view != null) {
                    if (view.getVisibility() == 0) {
                        AnonymousClass741 r03 = this.A0M;
                        str = "cameraActionsController";
                        if (r03 != null) {
                            r03.A0C(false);
                            r03.A09();
                            View view2 = this.A0A;
                            if (view2 != null) {
                                view2.setVisibility(8);
                                AnonymousClass741 r04 = this.A0M;
                                if (r04 != null) {
                                    r04.A0L.setEnabled(false);
                                }
                            }
                        }
                        C18070vi.A11(str);
                        throw null;
                    }
                    if (!z) {
                        C160978Av r05 = this.A0K;
                        if (r05 != null) {
                            r05.pause();
                        }
                    }
                    C109775dz r06 = this.A0L;
                    if (r06 != null) {
                        r06.disable();
                        return;
                    }
                    return;
                }
                C18070vi.A11("cameraView");
                throw null;
            }
            C18070vi.A11("camera");
            throw null;
        }
    }

    public final void A0l() {
        if (this.A0H != null && this.A0g && !this.A0p) {
            C160978Av r0 = this.A0K;
            if (r0 == null) {
                C18070vi.A11("camera");
            } else {
                r0.CG0();
                View view = this.A0A;
                String str = "cameraView";
                if (view != null) {
                    if (view.getVisibility() == 8) {
                        View view2 = this.A0A;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                    }
                    C109775dz r02 = this.A0L;
                    if (r02 != null) {
                        r02.enable();
                    }
                    AnonymousClass741 r03 = this.A0M;
                    str = "cameraActionsController";
                    if (r03 != null) {
                        r03.A0C(true);
                        AnonymousClass741 r04 = this.A0M;
                        if (r04 != null) {
                            r04.A09();
                            AnonymousClass741 r05 = this.A0M;
                            if (r05 != null) {
                                r05.A05.setProgress(0);
                                this.A1J.A01 = 0;
                                C133796pV r06 = this.A0S;
                                str = "overlaysController";
                                if (r06 != null) {
                                    if (r06.A01.getVisibility() == 0) {
                                        C133796pV r07 = this.A0S;
                                        if (r07 != null) {
                                            r07.A01(false, true);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                C18070vi.A11(str);
            }
            throw null;
        }
    }

    public final void A0m() {
        String str;
        Log.i("CameraUi/restoreCameraUi");
        A0Z(this, !this.A0f, true);
        C136596u4 r4 = this.A15;
        if (C108945cZ.A1U(r4.A09) && A0f(this)) {
            A0I(this);
        }
        if (this.A0f) {
            A0X(this, false);
        }
        View view = this.A0A;
        if (view != null) {
            if (view.getVisibility() != 0) {
                View view2 = this.A0A;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            C160978Av r0 = this.A0K;
            if (r0 == null) {
                str = "camera";
            } else {
                boolean Bf2 = r0.Bf2();
                if (!Bf2) {
                    View view3 = this.A0A;
                    if (view3 != null) {
                        view3.requestLayout();
                        View view4 = this.A0A;
                        if (view4 != null) {
                            AnonymousClass793.A00(view4.getViewTreeObserver(), this, 5);
                        }
                    }
                }
                C140086zv r2 = this.A0T;
                if (r2 == null) {
                    str = "recordingController";
                } else {
                    r2.A02(r4.A01(), A0t(), false);
                    if (!this.A0f) {
                        AnonymousClass741 r42 = this.A0M;
                        if (r42 == null) {
                            str = "cameraActionsController";
                        } else {
                            ViewGroup viewGroup = r42.A0J;
                            viewGroup.setAlpha(1.0f);
                            viewGroup.setVisibility(0);
                            boolean z = true;
                            r42.A0C(true);
                            r42.A0L.setEnabled(Bf2);
                            WDSButton wDSButton = r42.A0U;
                            wDSButton.setEnabled(Bf2);
                            boolean A1P2 = AnonymousClass000.A1P(wDSButton.getVisibility());
                            wDSButton.setVisibility(C72453Mb.A07(r42.A0X ? 1 : 0));
                            boolean A1U2 = C108995ce.A1U(wDSButton);
                            if (!A1P2 && A1U2) {
                                wDSButton.startAnimation(r42.A04);
                            }
                            WaImageView waImageView = r42.A0K;
                            waImageView.setEnabled(Bf2);
                            WDSButton wDSButton2 = r42.A08;
                            if (wDSButton2 != null) {
                                wDSButton2.setEnabled(true);
                            }
                            boolean A1P3 = AnonymousClass000.A1P(waImageView.getVisibility());
                            AnonymousClass741.A01(r42);
                            if (waImageView.getVisibility() != 0) {
                                z = false;
                            }
                            if (!A1P3 && z) {
                                waImageView.startAnimation(r42.A04);
                            }
                            r42.A08();
                            r42.A07();
                            r42.A0S.setVisibility(0);
                        }
                    }
                    AnonymousClass701 r02 = this.A0P;
                    if (r02 == null) {
                        str = "cameraBottomSheetController";
                    } else if (r02.A0C.A0J != 3 && !this.A0f) {
                        C133936pk r03 = this.A0Q;
                        if (r03 == null) {
                            str = "cameraModeTabController";
                        } else {
                            A0R(this, r03, 0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("cameraView");
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5, 12096) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n() {
        /*
            r7 = this;
            X.73m r2 = r7.A19
            X.89h r5 = r7.A1Y
            int r0 = r5.BVn()
            java.lang.String r1 = A05(r0)
            java.lang.String r0 = "warm"
            X.C1408973m.A04(r2, r0, r1)
            r0 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r3 = "showCamera"
            X.C1408973m.A03(r2, r3, r0)
            X.1FU r6 = r7.A0H
            if (r6 == 0) goto L_0x00f3
            X.1FU r4 = A04(r7)
            r1 = 2130968944(0x7f040170, float:1.7546556E38)
            r0 = 2131100005(0x7f060165, float:1.781238E38)
            int r1 = X.AnonymousClass1YL.A00(r6, r1, r0)
            r0 = 2
            X.C28281Zt.A07(r4, r1, r0)
            boolean r0 = X.C39761tb.A02()
            if (r0 == 0) goto L_0x004b
            X.1HS r0 = r7.A12
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x004b
            A0F(r7)
            r0 = 554251647(0x2109357f, float:4.6488207E-19)
            X.C1408973m.A02(r2, r3, r0)
            r0 = 4
            r2.A05(r0)
            return
        L_0x004b:
            r4 = 1
            r7.A0g = r4
            X.5dz r0 = r7.A0L
            if (r0 == 0) goto L_0x0055
            r0.enable()
        L_0x0055:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A02 = r0
            X.731 r6 = r7.A18
            int r0 = r5.BVn()
            X.0ve r5 = r7.A1G
            switch(r0) {
                case 1: goto L_0x00f0;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00e5;
                case 6: goto L_0x0066;
                case 7: goto L_0x0066;
                case 8: goto L_0x0066;
                case 9: goto L_0x00e2;
                case 10: goto L_0x00df;
                case 11: goto L_0x00dc;
                case 12: goto L_0x00d9;
                case 13: goto L_0x00d6;
                case 14: goto L_0x0066;
                case 15: goto L_0x0066;
                case 16: goto L_0x0066;
                case 17: goto L_0x0066;
                case 18: goto L_0x0066;
                case 19: goto L_0x0066;
                case 20: goto L_0x00e7;
                case 21: goto L_0x00e7;
                case 22: goto L_0x0066;
                case 23: goto L_0x00e7;
                case 24: goto L_0x00c9;
                case 25: goto L_0x00ed;
                case 26: goto L_0x00ed;
                default: goto L_0x0066;
            }
        L_0x0066:
            r1 = 1
        L_0x0067:
            r6.A03(r1)
            X.8Av r0 = r7.A0K
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "camera"
        L_0x0070:
            X.C18070vi.A11(r0)
        L_0x0073:
            r0 = 0
            throw r0
        L_0x0075:
            r0.CG0()
            android.view.View r1 = r7.A0A
            java.lang.String r5 = "cameraView"
            if (r1 == 0) goto L_0x00c5
            java.lang.Runnable r0 = r7.A1T
            r1.removeCallbacks(r0)
            android.view.View r0 = r7.A08
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "cameraLayout"
            goto L_0x0070
        L_0x008a:
            r1 = 0
            r0.setVisibility(r1)
            X.6pk r0 = r7.A0Q
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "cameraModeTabController"
            goto L_0x0070
        L_0x0095:
            A0R(r7, r0, r1)
            android.view.View r0 = r7.A0A
            if (r0 == 0) goto L_0x00c5
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00af
            android.view.View r1 = r7.A09
            if (r1 != 0) goto L_0x00a9
            java.lang.String r0 = "cameraProtection"
            goto L_0x0070
        L_0x00a9:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00b6
        L_0x00af:
            android.view.View r0 = r7.A0A
            if (r0 == 0) goto L_0x00c5
            r0.setVisibility(r1)
        L_0x00b6:
            A0Z(r7, r4, r4)
            androidx.fragment.app.Fragment r0 = r7.A0v
            r0.A23(r4)
            r0 = 554251647(0x2109357f, float:4.6488207E-19)
            X.C1408973m.A02(r2, r3, r0)
            return
        L_0x00c5:
            X.C18070vi.A11(r5)
            goto L_0x0073
        L_0x00c9:
            r1 = 12096(0x2f40, float:1.695E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            r1 = 20
            if (r0 != 0) goto L_0x0067
            goto L_0x0066
        L_0x00d6:
            r1 = 14
            goto L_0x0067
        L_0x00d9:
            r1 = 13
            goto L_0x0067
        L_0x00dc:
            r1 = 12
            goto L_0x0067
        L_0x00df:
            r1 = 11
            goto L_0x0067
        L_0x00e2:
            r1 = 10
            goto L_0x0067
        L_0x00e5:
            r1 = 6
            goto L_0x0067
        L_0x00e7:
            r1 = 5
            goto L_0x0067
        L_0x00ea:
            r1 = 4
            goto L_0x0067
        L_0x00ed:
            r1 = 3
            goto L_0x0067
        L_0x00f0:
            r1 = 2
            goto L_0x0067
        L_0x00f3:
            X.C1408973m.A02(r2, r3, r0)
            r0 = 87
            r2.A05(r0)
            java.lang.String r0 = "need to call onCreate first"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0n():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        if (r8 == 3) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011b, code lost:
        if (r4 == 3) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0p(int r19) {
        /*
            r18 = this;
            r13 = r18
            X.6u4 r3 = r13.A15
            int r6 = r3.A00
            r5 = r19
            r3.A00 = r5
            X.8Av r4 = r13.A0K
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = "camera"
        L_0x0010:
            X.C18070vi.A11(r0)
        L_0x0013:
            r0 = 0
            throw r0
        L_0x0015:
            r2 = 1
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1S(r5, r1)
            r4.setShouldStoreCameraFacingMode(r0)
            if (r5 != r1) goto L_0x0026
            X.6tV r4 = r13.A1J
            r0 = 0
            r4.A01 = r0
        L_0x0026:
            X.6zv r4 = r13.A0T
            if (r4 == 0) goto L_0x0255
            boolean r1 = r3.A01()
            r0 = 0
            r4.A02(r1, r0, r0)
            X.741 r9 = r13.A0M
            if (r9 != 0) goto L_0x0039
            java.lang.String r0 = "cameraActionsController"
            goto L_0x0010
        L_0x0039:
            int r8 = r3.A00
            int r1 = r9.A01
            r9.A01 = r8
            r0 = 2
            if (r1 == r0) goto L_0x0045
            r0 = 3
            if (r1 != r0) goto L_0x00e9
        L_0x0045:
            r0 = 2
            if (r8 == r0) goto L_0x004b
            r0 = 3
            if (r8 != r0) goto L_0x00e9
        L_0x004b:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x00e2
            A0H(r13)
        L_0x0054:
            X.3ho r1 = r13.A0O
            if (r1 == 0) goto L_0x0125
            boolean r0 = r3.A01()
            r1.A00 = r0
            X.0vl r0 = r1.A0H
            java.lang.Object r0 = r0.getValue()
            X.4VF r0 = (X.AnonymousClass4VF) r0
            X.0vk r0 = r0.A06
            java.lang.Object r0 = r0.invoke()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.4hI r8 = new X.4hI
            r8.<init>(r0)
            X.0vl r0 = r1.A0J
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            java.util.Iterator r12 = X.C17890vO.A0l(r0)
        L_0x007d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r9 = r12.next()
            X.4S8 r9 = (X.AnonymousClass4S8) r9
            X.1G4 r11 = r9.A02
        L_0x008b:
            java.lang.Object r10 = r11.getValue()
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x009a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C92434hI
            if (r0 == 0) goto L_0x00a9
            r1 = r8
        L_0x00a9:
            r7.add(r1)
            goto L_0x009a
        L_0x00ad:
            boolean r0 = r11.BFK(r10, r7)
            if (r0 == 0) goto L_0x008b
            X.1G4 r7 = r9.A01
        L_0x00b5:
            java.lang.Object r4 = r7.getValue()
            r1 = r4
            X.4Sy r1 = (X.C86764Sy) r1
            X.5Wf r0 = r1.A00
            boolean r0 = r0 instanceof X.C92434hI
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r1.A01
            X.4Sy r1 = new X.4Sy
            r1.<init>(r8, r0)
        L_0x00c9:
            boolean r0 = r7.BFK(r4, r1)
            if (r0 == 0) goto L_0x00b5
            X.1G4 r7 = r9.A04
        L_0x00d1:
            java.lang.Object r4 = r7.getValue()
            r1 = r4
            boolean r0 = r4 instanceof X.C92434hI
            if (r0 == 0) goto L_0x00db
            r1 = r8
        L_0x00db:
            boolean r0 = r7.BFK(r4, r1)
            if (r0 == 0) goto L_0x00d1
            goto L_0x007d
        L_0x00e2:
            if (r5 != r2) goto L_0x0054
            A0I(r13)
            goto L_0x0054
        L_0x00e9:
            r0 = 2
            if (r8 == r0) goto L_0x00f3
            r0 = 3
            r7 = 0
            r4 = 2131232989(0x7f0808dd, float:1.8082103E38)
            if (r8 != r0) goto L_0x00f7
        L_0x00f3:
            r7 = 1
            r4 = 2131232872(0x7f080868, float:1.8081866E38)
        L_0x00f7:
            com.whatsapp.WaImageView r1 = r9.A0L
            android.content.Context r0 = r9.A0E
            X.AnonymousClass3MX.A1B(r0, r1, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = 1058642330(0x3f19999a, float:0.6)
            if (r7 == 0) goto L_0x010a
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = 1058642330(0x3f19999a, float:0.6)
        L_0x010a:
            r0 = 0
            X.AnonymousClass741.A03(r9, r1, r4, r0)
            com.whatsapp.WaImageView r8 = r9.A0L
            android.content.Context r7 = r9.A0E
            int r4 = r9.A01
            r0 = 2
            if (r4 == r0) goto L_0x011d
            r1 = 3
            r0 = 2131896142(0x7f12274e, float:1.9427137E38)
            if (r4 != r1) goto L_0x0120
        L_0x011d:
            r0 = 2131896143(0x7f12274f, float:1.9427139E38)
        L_0x0120:
            X.AnonymousClass3MY.A0w(r7, r8, r0)
            goto L_0x004b
        L_0x0125:
            X.701 r4 = r13.A0P
            if (r4 != 0) goto L_0x012d
            java.lang.String r0 = "cameraBottomSheetController"
            goto L_0x0010
        L_0x012d:
            int r0 = r3.A00
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            android.view.View r4 = r4.A07
            if (r4 == 0) goto L_0x013f
            int r0 = X.C72453Mb.A0J(r0)
            r4.setVisibility(r0)
        L_0x013f:
            X.741 r0 = r13.A0M
            java.lang.String r4 = "cameraActionsController"
            if (r0 == 0) goto L_0x0250
            r0.A08()
            X.741 r0 = r13.A0M
            if (r0 == 0) goto L_0x0250
            r0.A07()
            if (r6 == r1) goto L_0x0168
            if (r5 == r1) goto L_0x0168
        L_0x0153:
            X.6zv r0 = r13.A0T
            if (r0 == 0) goto L_0x0255
            boolean r4 = r13.A0f
            boolean r5 = r13.A0j
            boolean r6 = r3.A01()
            X.3hQ r3 = r13.A0N
            r7 = 0
            com.whatsapp.camera.recording.RecordingView r2 = r0.A06
            r2.A01(r3, r4, r5, r6, r7)
            return
        L_0x0168:
            android.view.ViewGroup r0 = r13.A0C
            java.lang.String r8 = "cameraProgressWrapper"
            if (r0 == 0) goto L_0x024b
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.view.ViewGroup r0 = r13.A0F
            java.lang.String r4 = "cameraViewHolder"
            if (r0 == 0) goto L_0x0250
            int r15 = r0.getMeasuredWidth()
            android.view.ViewGroup r0 = r13.A0F
            if (r0 == 0) goto L_0x0250
            int r16 = r0.getMeasuredHeight()
            android.view.View r0 = r13.A0A
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = "cameraView"
            goto L_0x0010
        L_0x018c:
            android.view.ViewGroup$LayoutParams r14 = r0.getLayoutParams()
            r4 = 0
            java.lang.String r7 = "recordingProgressRing"
            java.lang.String r6 = "camera"
            if (r5 == r2) goto L_0x01ed
            r2 = 2
            if (r5 == r2) goto L_0x01ed
            if (r5 != r1) goto L_0x0153
            X.8Av r0 = r13.A0K
            if (r0 == 0) goto L_0x0246
            boolean r0 = r0.Beu()
            if (r0 != 0) goto L_0x01eb
            X.0ve r5 = r13.A1G
            r1 = 11198(0x2bbe, float:1.5692E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x01eb
            X.8Av r0 = r13.A0K
            if (r0 == 0) goto L_0x0246
            r0.BkL()
            r1 = 1
        L_0x01ba:
            android.animation.ObjectAnimator r0 = r13.A04
            if (r0 == 0) goto L_0x01c1
            r0.cancel()
        L_0x01c1:
            android.view.ViewGroup r0 = r13.A0C
            if (r0 == 0) goto L_0x024b
            X.7Qh r11 = new X.7Qh
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            android.animation.ObjectAnimator r0 = r13.A02(r0, r11, r1)
            r13.A04 = r0
            X.1FU r2 = r13.A0H
            if (r2 == 0) goto L_0x0153
            com.whatsapp.pushtorecordmedia.MediaProgressRing r1 = r13.A0V
            if (r1 == 0) goto L_0x0241
            X.7La r0 = new X.7La
            r0.<init>(r13, r4)
            r1.A02(r2, r0)
            com.whatsapp.pushtorecordmedia.MediaProgressRing r0 = r13.A0V
            if (r0 == 0) goto L_0x0241
            r0.setVisibility(r4)
            goto L_0x0153
        L_0x01eb:
            r1 = 0
            goto L_0x01ba
        L_0x01ed:
            X.0z4 r0 = r13.A1E
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "camera_facing"
            int r1 = r1.getInt(r0, r4)
            X.8Av r0 = r13.A0K
            if (r0 == 0) goto L_0x0246
            int r0 = r0.getCameraFacing()
            if (r1 == r0) goto L_0x0217
            X.0ve r2 = r13.A1G
            r1 = 11198(0x2bbe, float:1.5692E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0217
            X.8Av r0 = r13.A0K
            if (r0 == 0) goto L_0x0246
            r0.BkL()
            r4 = 1
        L_0x0217:
            android.animation.ObjectAnimator r0 = r13.A04
            if (r0 == 0) goto L_0x021e
            r0.cancel()
        L_0x021e:
            android.view.ViewGroup r2 = r13.A0C
            if (r2 == 0) goto L_0x024b
            r1 = 33
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r12, r13, r14, r1)
            android.animation.ObjectAnimator r0 = r13.A02(r2, r0, r4)
            r13.A04 = r0
            com.whatsapp.pushtorecordmedia.MediaProgressRing r0 = r13.A0V
            if (r0 == 0) goto L_0x0241
            r0.A01()
            com.whatsapp.pushtorecordmedia.MediaProgressRing r1 = r13.A0V
            if (r1 == 0) goto L_0x0241
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0153
        L_0x0241:
            X.C18070vi.A11(r7)
            goto L_0x0013
        L_0x0246:
            X.C18070vi.A11(r6)
            goto L_0x0013
        L_0x024b:
            X.C18070vi.A11(r8)
            goto L_0x0013
        L_0x0250:
            X.C18070vi.A11(r4)
            goto L_0x0013
        L_0x0255:
            java.lang.String r0 = "recordingController"
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0p(int):void");
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015c, code lost:
        if (r2 != null) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0q(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            r0 = 90
            r2 = -1
            if (r8 == r0) goto L_0x00e2
            r0 = 101(0x65, float:1.42E-43)
            if (r8 != r0) goto L_0x003e
            if (r9 == r2) goto L_0x006d
            r0 = 1
            if (r9 == 0) goto L_0x003f
            if (r9 != r0) goto L_0x003e
            if (r10 == 0) goto L_0x003e
            X.6u4 r0 = r7.A15
            X.73D r1 = r0.A03
            android.os.Bundle r0 = r10.getExtras()
            r1.A05(r0)
            java.lang.String r1 = "media_quality_selection"
            r0 = 0
            int r0 = r10.getIntExtra(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0a = r0
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.util.ArrayList r0 = X.C72463Mc.A0r(r10, r0)
            r7.A0d = r0
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r10.getParcelableArrayListExtra(r0)
            r7.A0c(r0)
            r7.A08()
        L_0x003e:
            return
        L_0x003f:
            X.6u4 r1 = r7.A15
            java.util.Set r0 = r1.A09
            boolean r0 = X.C108945cZ.A1U(r0)
            if (r0 != 0) goto L_0x0065
            java.util.List r0 = r1.A08
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x0065
            r1.A00()
            X.701 r0 = r7.A0P
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "cameraBottomSheetController"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0062:
            X.AnonymousClass701.A00(r0)
        L_0x0065:
            boolean r0 = r7.A0p
            if (r0 != 0) goto L_0x003e
            r7.A0m()
            return
        L_0x006d:
            X.89h r4 = r7.A1Y
            r4.BVn()
            r4.BVn()
            int r1 = r4.BVn()
            r0 = 17
            if (r1 == r0) goto L_0x00f9
            r0 = 18
            if (r1 == r0) goto L_0x00f9
            int r1 = r4.BVn()
            r0 = 19
            if (r1 == r0) goto L_0x00f9
            int r1 = r4.BVn()
            r0 = 14
            if (r1 == r0) goto L_0x00f9
            X.6u4 r5 = r7.A15
            java.util.List r3 = r5.A08
            java.util.Iterator r6 = r3.iterator()
        L_0x0099:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r2 = r6.next()
            X.8BB r2 = (X.AnonymousClass8BB) r2
            X.C18070vi.A0b(r2)
            java.util.Set r1 = r5.A09
            boolean r0 = X.C108945cZ.A1U(r1)
            if (r0 == 0) goto L_0x00ba
            android.net.Uri r0 = r2.BLl()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ce
        L_0x00ba:
            int r1 = r4.BVn()
            r0 = 24
            if (r1 == r0) goto L_0x00ce
            X.1FU r1 = A04(r7)
            android.net.Uri r0 = r2.BLl()
            X.C26511Sk.A0O(r1, r0)
            goto L_0x0099
        L_0x00ce:
            java.io.File r2 = r2.BRc()
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CameraUi/cannot-delete-file "
            X.C17900vP.A0Z(r2, r0, r1)
            goto L_0x0099
        L_0x00e2:
            if (r9 != r2) goto L_0x00ef
            boolean r0 = A0g(r7)
            if (r0 != 0) goto L_0x00f9
            X.89h r0 = r7.A1Y
            r0.BVn()
        L_0x00ef:
            X.89h r0 = r7.A1Y
            int r1 = r0.BVn()
            r0 = 19
            if (r1 != r0) goto L_0x003e
        L_0x00f9:
            X.1FU r0 = A04(r7)
            r0.setResult(r2, r10)
            X.1FU r0 = A04(r7)
            r0.finish()
            return
        L_0x0108:
            java.util.Set r0 = r5.A09
            r0.clear()
            X.73D r0 = new X.73D
            r0.<init>()
            r5.A03 = r0
            r3.clear()
            X.701 r0 = r7.A0P
            r2 = 0
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = "cameraBottomSheetController"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0122:
            X.AnonymousClass701.A00(r0)
            java.lang.Class<X.1BI> r1 = X.AnonymousClass1BI.class
            if (r10 == 0) goto L_0x012f
            java.lang.String r0 = "jids"
            java.util.ArrayList r2 = r10.getStringArrayListExtra(r0)
        L_0x012f:
            java.util.ArrayList r5 = X.C22971Dz.A0A(r1, r2)
            java.util.List r0 = r7.A0d
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 != 0) goto L_0x0161
            int r1 = r5.size()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 1
            if (r1 != r0) goto L_0x0183
            X.1BI r0 = X.C22971Dz.A01(r5)
            if (r0 == 0) goto L_0x0165
            X.118 r0 = r7.A1D
            android.content.Context r3 = r0.A00
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r3)
            java.lang.String r0 = X.C28901bF.A05
        L_0x0154:
            android.content.Intent r0 = r1.setAction(r0)
            android.content.Intent r2 = r0.addFlags(r2)
            if (r2 == 0) goto L_0x0161
        L_0x015e:
            r3.startActivity(r2)
        L_0x0161:
            r4.C52()
            return
        L_0x0165:
            X.1LU r1 = new X.1LU
            r1.<init>()
            X.118 r0 = r7.A1D
            android.content.Context r3 = r0.A00
            java.lang.Object r0 = X.C29431cG.A0b(r5)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            android.content.Intent r2 = X.AnonymousClass3MY.A06(r3, r1, r0)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "CameraUi"
            X.11P r0 = r7.A1C
            X.C60442o2.A00(r2, r0, r1)
            goto L_0x015e
        L_0x0183:
            if (r1 <= r0) goto L_0x0161
            X.118 r0 = r7.A1D
            android.content.Context r3 = r0.A00
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r3)
            java.lang.String r0 = X.C28901bF.A02
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0q(int, int, android.content.Intent):void");
    }

    public final boolean A0t() {
        String str;
        C160978Av r0 = this.A0K;
        if (r0 == null) {
            str = "camera";
        } else {
            if (!r0.isRecording()) {
                C140086zv r02 = this.A0T;
                if (r02 == null) {
                    str = "recordingController";
                } else {
                    Handler handler = r02.A04;
                    if (handler.hasMessages(0) || handler.hasMessages(1)) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        if (r9 == 0) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0u() {
        /*
            r12 = this;
            X.1FU r0 = r12.A0H
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0144
            boolean r0 = r12.A0t()
            r5 = 1
            if (r0 == 0) goto L_0x001b
            X.6zv r0 = r12.A0T
            if (r0 != 0) goto L_0x013c
            java.lang.String r0 = "recordingController"
        L_0x0016:
            X.C18070vi.A11(r0)
        L_0x0019:
            r0 = 0
            throw r0
        L_0x001b:
            X.701 r0 = r12.A0P
            java.lang.String r4 = "cameraBottomSheetController"
            if (r0 == 0) goto L_0x0137
            com.whatsapp.camera.CameraBottomSheetBehavior r2 = r0.A0C
            int r1 = r2.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0060
            r0 = 4
            r2.A0W(r0)
            X.731 r3 = r12.A18
            X.6u4 r0 = r12.A15
            java.util.Set r0 = r0.A09
            boolean r2 = X.C108945cZ.A1U(r0)
            boolean r0 = X.AnonymousClass731.A02(r3)
            if (r0 == 0) goto L_0x0143
            X.64M r1 = new X.64M
            r1.<init>()
            X.C138896xs.A00(r3, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A01 = r0
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A09 = r0
            int r0 = X.C72453Mb.A03(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            X.18K r0 = r3.A00
            r0.CC4(r1)
            return r5
        L_0x0060:
            boolean r0 = r12.A0f
            if (r0 == 0) goto L_0x0068
            A0Y(r12, r3)
            return r5
        L_0x0068:
            X.6u4 r1 = r12.A15
            java.util.Set r2 = r1.A09
            boolean r0 = X.C108945cZ.A1U(r2)
            if (r0 == 0) goto L_0x0097
            r2.clear()
            X.73D r0 = new X.73D
            r0.<init>()
            r1.A03 = r0
            java.util.List r0 = r1.A08
            r0.clear()
            X.741 r1 = r12.A0M
            if (r1 != 0) goto L_0x0088
            java.lang.String r0 = "cameraActionsController"
            goto L_0x0016
        L_0x0088:
            int r0 = r2.size()
            r1.A0D(r3, r0)
            X.701 r0 = r12.A0P
            if (r0 == 0) goto L_0x0137
            X.AnonymousClass701.A00(r0)
            return r5
        L_0x0097:
            r1.A00()
            X.701 r0 = r12.A0P
            if (r0 == 0) goto L_0x0137
            X.AnonymousClass701.A00(r0)
            X.731 r4 = r12.A18
            X.8Av r0 = r12.A0K
            java.lang.String r1 = "camera"
            if (r0 == 0) goto L_0x0132
            boolean r11 = r0.Beu()
            X.8Av r0 = r12.A0K
            if (r0 == 0) goto L_0x0132
            int r9 = r0.getZoomLevel()
            X.8Av r0 = r12.A0K
            if (r0 == 0) goto L_0x0132
            java.lang.String r10 = r0.getFlashMode()
            boolean r8 = r12.A0j
            X.89h r0 = r12.A1Y
            int r5 = r0.BVn()
            boolean r0 = X.AnonymousClass731.A02(r4)
            if (r0 == 0) goto L_0x0144
            X.64M r2 = new X.64M
            r2.<init>()
            java.lang.Integer r0 = X.C17880vN.A0m()
            r2.A09 = r0
            X.00H r1 = r4.A01
            java.lang.Object r0 = r1.get()
            X.6xs r0 = (X.C138896xs) r0
            java.lang.Long r0 = r0.A00
            r2.A0G = r0
            r7 = 2
            r6 = 1
            int r0 = X.C72453Mb.A04(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 100
            if (r9 == r0) goto L_0x00f5
            r0 = 1
            if (r9 != 0) goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            int r0 = X.AnonymousClass731.A00(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            if (r8 == 0) goto L_0x0109
            r7 = 1
        L_0x0109:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A00 = r0
            if (r5 == r6) goto L_0x0123
            r0 = 2
            if (r5 == r0) goto L_0x0123
            r0 = 3
            if (r5 != r0) goto L_0x012c
        L_0x0123:
            java.lang.Object r1 = r1.get()
            X.6xs r1 = (X.C138896xs) r1
            r0 = 0
            r1.A00 = r0
        L_0x012c:
            X.18K r0 = r4.A00
            r0.CC4(r2)
            return r3
        L_0x0132:
            X.C18070vi.A11(r1)
            goto L_0x0019
        L_0x0137:
            X.C18070vi.A11(r4)
            goto L_0x0019
        L_0x013c:
            boolean r0 = r0.A03()
            A0W(r12, r0)
        L_0x0143:
            return r5
        L_0x0144:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0u():boolean");
    }

    public void C5f() {
        C72463Mc.A1F(this.A1L, 11, A01(this));
        boolean A0t2 = A0t();
        boolean A012 = this.A15.A01();
        if (A0t2) {
            if (A012) {
                C140086zv r0 = this.A0T;
                if (r0 == null) {
                    C18070vi.A11("recordingController");
                    throw null;
                } else {
                    A0W(this, r0.A03());
                }
            }
        } else if (A012) {
            A0J(this);
        } else {
            A0P(this);
        }
    }

    public void C5g() {
        this.A1L.A02(C108955ca.A0g(), 4, A01(this));
        int i = this.A16.A00;
        if (i != 17 && i != 18 && i != 24 && !A0d() && !A0t()) {
            A0J(this);
        }
    }

    public void C87(boolean z) {
        if (z) {
            AnonymousClass4a5.A03(this.A1B);
        }
        C20050A4v a4v = this.A1L;
        int A012 = A01(this);
        C160978Av r0 = this.A0K;
        if (r0 == null) {
            C18070vi.A11("camera");
            throw null;
        }
        boolean Beu = r0.Beu();
        int i = 50;
        if (Beu) {
            i = 51;
        }
        C72463Mc.A1F(a4v, i, A012);
        A0L(this);
        A0H(this);
    }

    public static final String A06(AnonymousClass709 r3) {
        StringBuilder A0K2 = C18070vi.A0K(r3);
        A0K2.append(r3.A03);
        A0K2.append(',');
        A0K2.append(r3.A01);
        A0K2.append(',');
        A0K2.append(r3.A02);
        A0K2.append(',');
        A0K2.append(r3.A00);
        A0K2.append(',');
        A0K2.append(r3.A06);
        A0K2.append(',');
        A0K2.append(r3.A04);
        A0K2.append(',');
        return C17880vN.A0t(A0K2, r3.A05);
    }

    private final void A0D(View view, int i, int i2) {
        C39151sZ r1 = (C39151sZ) C108965cb.A0A(view);
        r1.A0o = i;
        r1.A0B = 0;
        r1.setMargins(0, 0, 0, i2);
        view.setLayoutParams(r1);
        C28931bI r0 = this.A0Y;
        if (r0 != null) {
            ViewGroup.LayoutParams A032 = r0.A03();
            C18070vi.A0z(A032, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A032;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i2);
            C28931bI r02 = this.A0Y;
            if (r02 != null) {
                r02.A06(marginLayoutParams);
                return;
            }
        }
        C18070vi.A11("arEffectsTrayStub");
        throw null;
    }

    public static final void A0L(AnonymousClass7DY r6) {
        float f;
        String str;
        if (!r6.A0t() || r6.A15.A01()) {
            C133796pV r0 = r6.A0S;
            String str2 = "overlaysController";
            if (r0 != null) {
                if (C108995ce.A1U(r0.A01)) {
                    C133796pV r1 = r6.A0S;
                    if (r1 != null) {
                        r1.A01(false, true);
                    }
                }
                if (!r6.A0k) {
                    r6.A0k = true;
                    C160978Av r02 = r6.A0K;
                    str2 = "camera";
                    if (r02 != null) {
                        boolean Beu = r02.Beu();
                        C1408973m r2 = r6.A19;
                        r2.A03 = SystemClock.elapsedRealtime();
                        if (r2.A08) {
                            AnonymousClass19T r3 = r2.A07;
                            r3.markerStart(554250848);
                            if (Beu) {
                                str = "front";
                            } else {
                                str = "back";
                            }
                            r3.markerAnnotate(554250848, "origin", str);
                        }
                        C160978Av r03 = r6.A0K;
                        if (r03 != null) {
                            r03.BkL();
                            AnonymousClass741 r32 = r6.A0M;
                            if (r32 == null) {
                                str2 = "cameraActionsController";
                            } else {
                                boolean z = !Beu;
                                float f2 = r32.A00;
                                if (z) {
                                    f = 180.0f + f2;
                                } else {
                                    f = f2 - 180.0f;
                                }
                                RotateAnimation A002 = AnonymousClass741.A00(f2, f);
                                A002.setInterpolator((Interpolator) AnonymousClass6YW.A00.getValue());
                                C108985cd.A12(A002, 200);
                                r32.A0U.startAnimation(A002);
                                r6.A1J.A01++;
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11(str2);
            throw null;
        }
    }

    public static void A0R(AnonymousClass7DY r0, C133936pk r1, int i) {
        r1.A01(i);
        C1605288v r02 = r0.A0R;
        if (r02 != null) {
            r02.setVisibility(i);
        }
    }

    public static final void A0X(AnonymousClass7DY r4, boolean z) {
        View findViewById;
        int A012 = C72453Mb.A01(z ? 1 : 0);
        C28931bI r0 = r4.A0Y;
        String str = "arEffectsTrayStub";
        if (r0 != null) {
            if (!(r0.A00 == null || (findViewById = C72453Mb.A0T(r4.A1V).findViewById(2131434428)) == null)) {
                findViewById.setEnabled(!z);
            }
            C28931bI r02 = r4.A0Y;
            if (r02 != null) {
                r02.A04(A012);
                C28931bI r03 = r4.A0W;
                if (r03 == null) {
                    str = "arEffectsButtonHeaderStub";
                } else {
                    r03.A04(A012);
                    AnonymousClass741 r04 = r4.A0M;
                    str = "cameraActionsController";
                    if (r04 != null) {
                        r04.A0C(z);
                        AnonymousClass741 r1 = r4.A0M;
                        if (r1 != null) {
                            boolean z2 = !z;
                            ViewGroup viewGroup = r1.A0I;
                            int i = 0;
                            if (z2) {
                                C160978Av r2 = r1.A0M;
                                if (r2.getFlashModes().size() <= 1 && r2.getStoredFlashModeCount() <= 1) {
                                    Boolean bool = C17970vW.A03;
                                }
                                viewGroup.setVisibility(i);
                                return;
                            }
                            i = 8;
                            viewGroup.setVisibility(i);
                            return;
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void A0o(int i) {
        if (A0g(this)) {
            i = A04(this).getIntent().getIntExtra("max_items", C18020vd.A00(C18040vf.A01, AnonymousClass3MW.A0X(this.A1Q).A00, 8685));
        }
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Object, X.6tV] */
    public AnonymousClass7DY(Fragment fragment, C218617r r10, AnonymousClass1KB r11, CX1 cx1, AnonymousClass2PB r13, C24771Lp r14, AnonymousClass1HS r15, C1606289h r16, C27251Vi r17, C136596u4 r18, CX2 cx2, AnonymousClass731 r20, C1408973m r21, C88184Yq r22, AnonymousClass11C r23, AnonymousClass11P r24, AnonymousClass118 r25, C19830z4 r26, C18000vb r27, C18030ve r28, C139176yM r29, C18010vc r30, C139676zG r31, C20050A4v a4v, AnonymousClass10I r33, AnonymousClass1VT r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, boolean z) {
        this.A1Y = r16;
        C139176yM r5 = r29;
        C20050A4v a4v2 = a4v;
        CX2 cx22 = cx2;
        C108995ce.A1H(r5, cx22, cx1, a4v2);
        C18070vi.A0d(r5, 9);
        C18070vi.A0d(cx22, 19);
        C108975cc.A11(cx1, 20, a4v2);
        this.A1D = r25;
        this.A0v = fragment;
        this.A1C = r24;
        this.A11 = r14;
        C18030ve r2 = r28;
        this.A1G = r2;
        this.A0y = r11;
        this.A1N = r33;
        this.A0x = r10;
        this.A1H = r5;
        this.A1O = r34;
        this.A12 = r15;
        this.A1Q = r35;
        this.A1B = r23;
        this.A1F = r27;
        this.A1P = r36;
        this.A10 = r13;
        this.A15 = r18;
        this.A1E = r26;
        this.A17 = cx22;
        this.A0z = cx1;
        this.A18 = r20;
        this.A19 = r21;
        this.A14 = r17;
        this.A1I = r30;
        this.A1L = a4v2;
        this.A1A = r22;
        this.A1R = r37;
        this.A1K = r31;
        this.A1X = z;
        this.A1S = r38;
        Integer num = AnonymousClass00R.A01;
        ? obj = new Object();
        obj.A04 = num;
        obj.A05 = false;
        obj.A00 = -1;
        obj.A01 = 0;
        obj.A02 = 0;
        obj.A03 = 0;
        this.A1J = obj;
        this.A1W = AnonymousClass7S3.A00(this, 2);
        Integer num2 = AnonymousClass00R.A0C;
        this.A1V = AnonymousClass1DF.A00(num2, new AnonymousClass7S3((Object) this, 3));
        this.A1U = AnonymousClass1DF.A00(num2, new AnonymousClass7S3((Object) this, 4));
        this.A0w = new AnonymousClass7OI(this, 1);
        this.A1T = new AnonymousClass7R9((Object) this, 18);
        int BVn = this.A1Y.BVn();
        this.A0s = BVn;
        this.A16 = new C131506lD(BVn);
        this.A13 = new C127066dk(r2, BVn);
        this.A0u = C72453Mb.A0K(C87414Vm.A00(r2, num2).A04);
        this.A1M = AnonymousClass3MW.A0n(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b4, code lost:
        if (r1 == 21) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0r(android.graphics.Bitmap r48, androidx.fragment.app.Fragment r49, X.AnonymousClass8B2 r50, java.util.Collection r51, java.util.List r52, int r53, boolean r54) {
        /*
            r47 = this;
            r8 = 0
            r46 = r51
            r0 = r46
            X.C18070vi.A0d(r0, r8)
            r1 = 4
            r0 = 3
            r7 = 1
            r6 = r47
            r15 = r53
            r4 = r54
            if (r15 == r0) goto L_0x00a7
            if (r15 == r1) goto L_0x0098
            r1 = 0
        L_0x0016:
            X.6u4 r10 = r6.A15
            java.util.Iterator r2 = r46.iterator()
        L_0x001c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0096
            android.net.Uri r0 = X.C108945cZ.A0M(r2)
            boolean r0 = r10.A02(r0)
            if (r0 == 0) goto L_0x001c
            r12 = 1
        L_0x002d:
            int r9 = r6.A01
            int r0 = r46.size()
            int r9 = r9 - r0
            if (r9 != 0) goto L_0x0061
            boolean r0 = r6.A0r
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0g(r6)
            if (r0 != 0) goto L_0x0052
            X.0ve r4 = r6.A1G
            r0 = 2693(0xa85, float:3.774E-42)
            X.0vf r3 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r3, r4, r0)
            r0 = 2614(0xa36, float:3.663E-42)
            int r0 = X.C18020vd.A00(r3, r4, r0)
            int r2 = r2 - r0
            int r9 = r9 + r2
        L_0x0052:
            X.0ve r3 = r6.A1G
            r2 = 2693(0xa85, float:3.774E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r2)
            r6.A0o(r0)
            r6.A0r = r7
        L_0x0061:
            boolean r0 = A0g(r6)
            if (r0 == 0) goto L_0x00fb
            if (r12 != 0) goto L_0x0077
            X.00H r0 = r6.A1R
            java.lang.Object r2 = r0.get()
            X.1Po r2 = (X.C25771Po) r2
            r1 = 0
            r0 = 35
            X.AnonymousClass3MY.A1P(r1, r2, r0, r7)
        L_0x0077:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r46.iterator()
        L_0x007f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e2
            android.net.Uri r2 = X.C108945cZ.A0M(r3)
            boolean r1 = r10.A02(r2)
            X.4cI r0 = new X.4cI
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x007f
        L_0x0096:
            r12 = 0
            goto L_0x002d
        L_0x0098:
            X.731 r1 = r6.A18
            int r0 = r46.size()
            r1.A04(r4, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            goto L_0x0016
        L_0x00a7:
            X.731 r3 = r6.A18
            int r2 = r46.size()
            boolean r0 = X.AnonymousClass731.A02(r3)
            if (r0 == 0) goto L_0x00dc
            X.64M r1 = new X.64M
            r1.<init>()
            X.C138896xs.A00(r3, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A03 = r0
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A09 = r0
            int r0 = X.C72453Mb.A03(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            java.lang.Long r0 = X.C17880vN.A0n(r2)
            r1.A0F = r0
            X.18K r0 = r3.A00
            r0.CC4(r1)
        L_0x00dc:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            goto L_0x0016
        L_0x00e2:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r0, r4)
            X.1FU r1 = A04(r6)
            r0 = -1
            r1.setResult(r0, r2)
            X.1FU r0 = A04(r6)
            r0.finish()
            return
        L_0x00fb:
            java.util.ArrayList r35 = X.C17880vN.A10(r46)
            java.util.List r0 = r10.A08
            r17 = r0
            X.C18070vi.A0X(r17)
            X.0wS r0 = X.C18460wS.A00
            X.709 r5 = new X.709
            r5.<init>(r0, r0)
            X.709 r4 = new X.709
            r4.<init>(r0, r0)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r17.iterator()
        L_0x011a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r3 = r13.next()
            r0 = r3
            X.8B2 r0 = (X.AnonymousClass8B2) r0
            android.net.Uri r2 = r0.BLl()
            r0 = r46
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x011a
            r11.add(r3)
            goto L_0x011a
        L_0x0137:
            java.util.Iterator r11 = r11.iterator()
        L_0x013b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r11.next()
            X.8BB r0 = (X.AnonymousClass8BB) r0
            X.77X r3 = r0.BOL()
            X.C18070vi.A0X(r3)
            int r2 = r0.BUm()
            r0 = r4
            if (r2 != r7) goto L_0x0156
            r0 = r5
        L_0x0156:
            r0.A00(r3)
            goto L_0x013b
        L_0x015a:
            X.1D6 r13 = X.AnonymousClass1D6.A01(r5, r4)
            X.1FU r34 = A04(r6)
            r11 = 0
            r33 = 0
            r5 = 0
            r32 = 0
            r31 = 0
            r30 = 1
            r21 = -1
            r20 = -1
            java.util.List r0 = r6.A0d
            java.util.ArrayList r29 = X.C22971Dz.A0B(r0)
            java.util.Set r0 = r10.A09
            int r0 = r0.size()
            int r9 = r9 - r0
            boolean r0 = r6.A0r
            r45 = r0
            X.89h r0 = r6.A1Y
            r16 = r0
            int r0 = r16.BVn()
            int r4 = X.AnonymousClass6W1.A00(r1, r0, r12)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A0t
            long r2 = r2 - r0
            long r0 = r6.A03
            r43 = r0
            X.1EC r0 = r6.A0U
            java.lang.String r28 = X.C22971Dz.A06(r0)
            boolean r0 = r6.A0h
            r42 = r0
            int r1 = r16.BVn()
            r0 = 4
            if (r1 == r0) goto L_0x01b6
            r0 = 5
            if (r1 == r0) goto L_0x01b6
            r0 = 20
            if (r1 == r0) goto L_0x01b6
            r0 = 21
            r27 = 1
            if (r1 != r0) goto L_0x01b8
        L_0x01b6:
            r27 = 0
        L_0x01b8:
            X.6tV r14 = r6.A1J
            java.lang.Integer r0 = r14.A04
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x020a
            r0 = 1
        L_0x01c3:
            java.lang.Integer r26 = java.lang.Integer.valueOf(r0)
            boolean r0 = r14.A05
            r41 = r0
            long r0 = r14.A00
            r39 = r0
            long r0 = r14.A01
            r37 = r0
            java.lang.Object r0 = r13.first
            X.709 r0 = (X.AnonymousClass709) r0
            java.lang.String r25 = A06(r0)
            r0 = r25
            X.C18070vi.A0d(r0, r8)
            java.lang.Object r0 = r13.second
            X.709 r0 = (X.AnonymousClass709) r0
            java.lang.String r24 = A06(r0)
            r0 = r24
            X.C18070vi.A0d(r0, r8)
            int r0 = r17.size()
            if (r0 == r7) goto L_0x01ff
            r23 = 0
        L_0x01f5:
            X.8Av r0 = r6.A0K
            if (r0 != 0) goto L_0x020c
            java.lang.String r0 = "camera"
            X.C18070vi.A11(r0)
            throw r11
        L_0x01ff:
            r0 = r17
            java.lang.Object r0 = r0.get(r8)
            boolean r0 = r0 instanceof X.AnonymousClass65R
            r23 = r0
            goto L_0x01f5
        L_0x020a:
            r0 = 0
            goto L_0x01c3
        L_0x020c:
            boolean r22 = r0.Bgt()
            r0 = 2
            if (r15 != r0) goto L_0x0228
            r0 = 2131428809(0x7f0b05c9, float:1.8479273E38)
            android.view.View r0 = A03(r6, r0)
            android.view.ViewGroup$LayoutParams r1 = X.C108965cb.A0A(r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.topMargin
            r21 = r0
            int r0 = r1.bottomMargin
            r20 = r0
        L_0x0228:
            r16.BVn()
            r16.BVn()
            int r1 = r16.BVn()
            r0 = 17
            if (r1 == r0) goto L_0x0281
            r0 = 18
            if (r1 == r0) goto L_0x0281
            int r1 = r16.BVn()
            r0 = 19
            if (r1 == r0) goto L_0x0281
            r16.BVn()
            r19 = 1
        L_0x0247:
            int r1 = r16.BVn()
            r0 = 24
            if (r1 != r0) goto L_0x0256
            r9 = 1
            r32 = 1
            r30 = 1
            r31 = 37
        L_0x0256:
            boolean r0 = r6.A0o
            if (r0 != 0) goto L_0x02b1
            java.lang.Object r1 = X.C29431cG.A0b(r35)
            android.net.Uri r1 = (android.net.Uri) r1
            java.util.List r14 = r6.A0e
            java.lang.String r15 = r6.A0b
            X.73D r0 = r10.A03
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r13 = r0.iterator()
        L_0x026e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x028a
            java.lang.Object r0 = r13.next()
            X.72S r0 = (X.AnonymousClass72S) r0
            r0.A0P(r11)
            r0.A0S(r11)
            goto L_0x026e
        L_0x0281:
            r19 = 0
            r30 = 0
            r33 = 1
            r32 = 1
            goto L_0x0247
        L_0x028a:
            X.73D r0 = r10.A03
            X.72S r13 = r0.A02(r1)
            if (r14 == 0) goto L_0x02a8
            X.00H r0 = r10.A07
            java.lang.Object r1 = r0.get()
            X.2kg r1 = (X.C58432kg) r1
            java.lang.String r0 = r13.A0H()
            r1.A01(r0, r14)
            java.lang.String r0 = r13.A0H()
            r13.A0S(r0)
        L_0x02a8:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x02b1
            r13.A0P(r15)
        L_0x02b1:
            java.lang.Integer r14 = r6.A0a
            X.73D r0 = r10.A03
            android.os.Bundle r13 = X.C17880vN.A0D()
            X.AnonymousClass73D.A01(r13, r0)
            boolean r0 = X.AnonymousClass745.A00
            if (r0 == 0) goto L_0x048b
            int r0 = r46.size()
            if (r0 != r7) goto L_0x048b
            r1 = r52
            if (r52 == 0) goto L_0x048b
            r36 = r48
            if (r48 == 0) goto L_0x048b
            if (r50 == 0) goto L_0x048b
            long r17 = r50.getContentLength()
            r15 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x048b
            java.util.Iterator r0 = r46.iterator()
            android.net.Uri r11 = X.C108945cZ.A0M(r0)
            X.1Lp r0 = r6.A11
            X.1ga r15 = r0.A05()
            java.lang.StringBuilder r10 = X.C17890vO.A0f(r11)
            java.lang.String r0 = "-gallery_thumb"
            java.lang.String r10 = X.AnonymousClass000.A0y(r0, r10)
            r0 = r36
            r15.A0F(r10, r0)
            X.1FU r10 = A04(r6)
            X.0yx[] r0 = new X.C19760yx[r8]
            java.lang.Object[] r1 = r1.toArray(r0)
            X.0yx[] r1 = (X.C19760yx[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.0yx[] r0 = (X.C19760yx[]) r0
            X.5hM r0 = X.C1406772n.A01(r10, r0)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r15 = r0.toBundle()
        L_0x0315:
            android.content.Intent r10 = X.C17880vN.A0A()
            java.lang.String r1 = r34.getPackageName()
            java.lang.String r0 = "com.whatsapp.mediacomposer.MediaComposerActivity"
            r10.setClassName(r1, r0)
            java.lang.String r1 = "android.intent.extra.STREAM"
            r0 = r35
            r10.putExtra(r1, r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r10.putExtra(r0, r5)
            java.lang.String r0 = "first_caption"
            r10.putExtra(r0, r5)
            java.lang.String r0 = "jid"
            r10.putExtra(r0, r5)
            java.lang.String r1 = "jids"
            r0 = r29
            r10.putExtra(r1, r0)
            java.lang.String r0 = "max_items"
            r10.putExtra(r0, r9)
            java.lang.String r1 = "skip_max_items_new_limit"
            r0 = r45
            r10.putExtra(r1, r0)
            java.lang.String r0 = "origin"
            r10.putExtra(r0, r4)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r9 = "picker_open_time"
            r10.putExtra(r9, r0)
            java.lang.String r1 = "send"
            r0 = r19
            r10.putExtra(r1, r0)
            java.lang.String r0 = "disable_tools_for_newsletter_forward"
            r10.putExtra(r0, r8)
            java.lang.String r9 = "quoted_message_row_id"
            r0 = r43
            r10.putExtra(r9, r0)
            java.lang.String r1 = "quoted_group_jid"
            r0 = r28
            r10.putExtra(r1, r0)
            java.lang.String r1 = "number_from_url"
            r0 = r42
            r10.putExtra(r1, r0)
            java.lang.String r0 = "media_preview_params"
            r10.putExtra(r0, r13)
            java.lang.String r0 = "smb_quick_reply"
            r10.putExtra(r0, r8)
            java.lang.String r1 = "should_send_media"
            r0 = r30
            r10.putExtra(r1, r0)
            java.lang.String r1 = "should_hide_caption_view"
            r0 = r32
            r10.putExtra(r1, r0)
            java.lang.String r0 = "start_home"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "auto_play_video"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "animate_uri"
            r10.putExtra(r0, r11)
            java.lang.String r0 = "preselected_image_uri"
            r10.putExtra(r0, r5)
            java.lang.String r1 = "scan_for_qr"
            r0 = r27
            r10.putExtra(r1, r0)
            java.lang.String r0 = "is_new_content"
            r10.putExtra(r0, r12)
            java.lang.String r0 = "status_distribution"
            r10.putExtra(r0, r5)
            java.lang.String r1 = "gallery_duration_ms"
            r0 = 11
            if (r4 == r0) goto L_0x03d7
            r0 = 14
            if (r4 == r0) goto L_0x03d7
            r0 = 17
            if (r4 == r0) goto L_0x03d7
            r0 = 57
            if (r4 == r0) goto L_0x03d7
            r0 = 59
            if (r4 == r0) goto L_0x03d7
            r0 = 20
            if (r4 == r0) goto L_0x03d7
            r0 = 21
            if (r4 == r0) goto L_0x03d7
            r2 = -1
        L_0x03d7:
            r10.putExtra(r1, r2)
            java.lang.String r1 = "preview_top_margin"
            r0 = r21
            r10.putExtra(r1, r0)
            java.lang.String r1 = "preview_bottom_margin"
            r0 = r20
            r10.putExtra(r1, r0)
            java.lang.String r0 = "is_editing_allowed"
            r10.putExtra(r0, r7)
            java.lang.String r0 = "should_finish_task_on_send_or_close"
            r10.putExtra(r0, r8)
            if (r14 == 0) goto L_0x03f9
            java.lang.String r0 = "media_quality_selection"
            r10.putExtra(r0, r14)
        L_0x03f9:
            java.lang.String r0 = "show_delete_thumbnail_for_single_media"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "set_result_when_last_media_deleted"
            r10.putExtra(r0, r8)
            java.lang.String r1 = "disable_converting_video_to_gif_option"
            r0 = r33
            r10.putExtra(r1, r0)
            java.lang.String r1 = "media_sharing_user_journey_origin"
            r0 = r31
            r10.putExtra(r1, r0)
            java.lang.String r0 = "parent_handles_redirect"
            r10.putExtra(r0, r7)
            java.lang.String r1 = "is_media_ptv"
            r0 = r23
            r10.putExtra(r1, r0)
            java.lang.String r1 = "captured_with_old_camera_controller"
            r0 = r22
            r10.putExtra(r1, r0)
            java.lang.String r0 = "handle_redirect"
            r10.putExtra(r0, r8)
            java.lang.String r1 = "camera_capture_direction"
            r0 = r26
            r10.putExtra(r1, r0)
            java.lang.String r1 = "recording_stopped_automatic"
            r0 = r41
            r10.putExtra(r1, r0)
            java.lang.String r2 = "camera_ready_time"
            r0 = r39
            r10.putExtra(r2, r0)
            java.lang.String r2 = "camera_switch_count"
            r0 = r37
            r10.putExtra(r2, r0)
            java.lang.String r0 = "send_media_preview_params_as_result"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "show_try_templates_tooltip"
            r10.putExtra(r0, r8)
            java.lang.String r1 = "photos_effect_count"
            r0 = r25
            r10.putExtra(r1, r0)
            java.lang.String r1 = "videos_effect_count"
            r0 = r24
            r10.putExtra(r1, r0)
            java.lang.String r0 = "standalone_add_button_provider_key"
            r10.putExtra(r0, r5)
            java.lang.String r0 = "apply_rotation_on_not_send"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "enable_template_tool"
            r10.putExtra(r0, r8)
            java.lang.String r0 = "extra_status_source_attribution_url"
            r10.putExtra(r0, r5)
            r0 = 101(0x65, float:1.42E-43)
            r1 = r49
            r1.A1P(r10, r0, r15)
            if (r12 == 0) goto L_0x048a
            int r0 = r46.size()
            if (r0 != r7) goto L_0x048a
            X.1FU r1 = A04(r6)
            r0 = 2130772021(0x7f010035, float:1.7147149E38)
            r1.overridePendingTransition(r0, r8)
        L_0x048a:
            return
        L_0x048b:
            r15 = 0
            goto L_0x0315
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0r(android.graphics.Bitmap, androidx.fragment.app.Fragment, X.8B2, java.util.Collection, java.util.List, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x029a, code lost:
        if (r12 != null) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0304, code lost:
        if (A0d() != false) goto L_0x0306;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0s(android.view.ViewGroup r34, X.AnonymousClass1FU r35, X.C75603ho r36, X.AnonymousClass73D r37, X.AnonymousClass1EC r38, X.C20050A4v r39, java.lang.Integer r40, java.lang.String r41, java.util.ArrayList r42, java.util.ArrayList r43, java.util.List r44, java.util.List r45, long r46, boolean r48, boolean r49, boolean r50) {
        /*
            r33 = this;
            r8 = r34
            r5 = r35
            boolean r2 = X.C18070vi.A16(r5, r8)
            r1 = 13
            r32 = r39
            r0 = r32
            X.C18070vi.A0d(r0, r1)
            r1 = r33
            r6 = r36
            r1.A0O = r6
            android.view.LayoutInflater r3 = r5.getLayoutInflater()
            r0 = 2131624484(0x7f0e0224, float:1.887615E38)
            r3.inflate(r0, r8, r2)
            X.73m r7 = r1.A19     // Catch:{ all -> 0x0623 }
            X.89h r10 = r1.A1Y     // Catch:{ all -> 0x0623 }
            int r0 = r10.BVn()     // Catch:{ all -> 0x0623 }
            java.lang.String r3 = A05(r0)     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "cold"
            X.C1408973m.A04(r7, r0, r3)     // Catch:{ all -> 0x0623 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0623 }
            r7.A01 = r3     // Catch:{ all -> 0x0623 }
            r3 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r17 = "onCreate"
            r0 = r17
            X.C1408973m.A03(r7, r0, r3)     // Catch:{ all -> 0x0623 }
            r1.A0H = r5     // Catch:{ all -> 0x0623 }
            r0 = r44
            r1.A0d = r0     // Catch:{ all -> 0x0623 }
            r3 = r46
            r1.A03 = r3     // Catch:{ all -> 0x0623 }
            r0 = r38
            r1.A0U = r0     // Catch:{ all -> 0x0623 }
            r0 = r48
            r1.A0h = r0     // Catch:{ all -> 0x0623 }
            r0 = r41
            r1.A0b = r0     // Catch:{ all -> 0x0623 }
            r0 = r45
            r1.A0e = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131434744(0x7f0b1cf8, float:1.849131E38)
            android.view.View r0 = r8.findViewById(r0)     // Catch:{ all -> 0x0623 }
            r1.A0B = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428793(0x7f0b05b9, float:1.847924E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            r1.A08 = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            r1.A09 = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428781(0x7f0b05ad, float:1.8479216E38)
            X.1bI r0 = X.C28931bI.A00(r8, r0)     // Catch:{ all -> 0x0623 }
            r1.A0Y = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131429111(0x7f0b06f7, float:1.8479885E38)
            android.view.View r3 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            X.1bI r0 = new X.1bI     // Catch:{ all -> 0x0623 }
            r0.<init>(r3)     // Catch:{ all -> 0x0623 }
            r1.A0X = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428780(0x7f0b05ac, float:1.8479214E38)
            X.1bI r0 = X.C28931bI.A00(r8, r0)     // Catch:{ all -> 0x0623 }
            r1.A0W = r0     // Catch:{ all -> 0x0623 }
            if (r36 == 0) goto L_0x00d1
            r0 = 2131428779(0x7f0b05ab, float:1.8479212E38)
            android.view.View r8 = X.C18070vi.A05(r8, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewStub r8 = (android.view.ViewStub) r8     // Catch:{ all -> 0x0623 }
            X.0ve r4 = r1.A1G     // Catch:{ all -> 0x0623 }
            X.1KB r3 = r1.A0y     // Catch:{ all -> 0x0623 }
            X.3hQ r0 = new X.3hQ     // Catch:{ all -> 0x0623 }
            r11 = r0
            r12 = r8
            r13 = r5
            r14 = r3
            r15 = r6
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0623 }
            r1.A0N = r0     // Catch:{ all -> 0x0623 }
            r3 = 12773(0x31e5, float:1.7899E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0623 }
            boolean r0 = X.C18020vd.A05(r0, r4, r3)     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x00d1
            X.1bI r0 = r1.A0X     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x00d9
            android.view.View r3 = r0.A02()     // Catch:{ all -> 0x0623 }
            com.whatsapp.CircularProgressBar r3 = (com.whatsapp.CircularProgressBar) r3     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x00d9
            r0 = 8
            r3.setVisibility(r0)     // Catch:{ all -> 0x0623 }
        L_0x00cf:
            r1.A0G = r3     // Catch:{ all -> 0x0623 }
        L_0x00d1:
            X.1VT r3 = r1.A1O     // Catch:{ all -> 0x0623 }
            X.7OI r0 = r1.A0w     // Catch:{ all -> 0x0623 }
            r3.registerObserver(r0)     // Catch:{ all -> 0x0623 }
            goto L_0x00db
        L_0x00d9:
            r3 = 0
            goto L_0x00cf
        L_0x00db:
            r3 = r43
            if (r43 == 0) goto L_0x00eb
            X.6u4 r0 = r1.A15     // Catch:{ all -> 0x0623 }
            r0.A04 = r2     // Catch:{ all -> 0x0623 }
            java.util.Set r0 = r0.A09     // Catch:{ all -> 0x0623 }
            r0.clear()     // Catch:{ all -> 0x0623 }
            r0.addAll(r3)     // Catch:{ all -> 0x0623 }
        L_0x00eb:
            X.0ve r6 = r1.A1G     // Catch:{ all -> 0x0623 }
            r0 = 2614(0xa36, float:3.663E-42)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ all -> 0x0623 }
            int r0 = X.C18020vd.A00(r5, r6, r0)     // Catch:{ all -> 0x0623 }
            r1.A0o(r0)     // Catch:{ all -> 0x0623 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0623 }
            r1.A02 = r3     // Catch:{ all -> 0x0623 }
            X.0vc r3 = r1.A1I     // Catch:{ all -> 0x0623 }
            X.11C r0 = r1.A1B     // Catch:{ all -> 0x0623 }
            r31 = r0
            int r8 = X.C24191Jf.A02(r0, r3)     // Catch:{ all -> 0x0623 }
            X.1FU r4 = A04(r1)     // Catch:{ all -> 0x0623 }
            X.CX2 r13 = r1.A17     // Catch:{ all -> 0x0623 }
            X.CX1 r0 = r1.A0z     // Catch:{ all -> 0x0623 }
            r3 = 12471(0x30b7, float:1.7476E-41)
            boolean r3 = X.C18020vd.A05(r5, r6, r3)     // Catch:{ all -> 0x0623 }
            r11 = r3 ^ 1
            int r9 = r10.BVn()     // Catch:{ all -> 0x0623 }
            r3 = 24
            if (r9 != r3) goto L_0x0439
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0623 }
        L_0x0124:
            r9 = 8233(0x2029, float:1.1537E-41)
            boolean r9 = X.C18020vd.A05(r5, r6, r9)     // Catch:{ all -> 0x0623 }
            if (r9 == 0) goto L_0x03f8
            java.lang.String r9 = "CameraUtils/getCameraImpl/ArLiteCameraImpl"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x0623 }
            int r9 = r40.intValue()     // Catch:{ all -> 0x0623 }
            if (r9 == r2) goto L_0x03f4
            java.lang.String r22 = "whatsapp_camera"
        L_0x0139:
            X.4D9 r20 = X.AnonymousClass4D9.PRE_CAPTURE     // Catch:{ all -> 0x0623 }
            r18 = r0
            r19 = r4
            r21 = r6
            r23 = r11
            X.DAT r0 = r18.A00(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0623 }
            com.whatsapp.camera.litecamera.LiteCameraView r9 = new com.whatsapp.camera.litecamera.LiteCameraView     // Catch:{ all -> 0x0623 }
            r9.<init>(r8, r4, r0, r3)     // Catch:{ all -> 0x0623 }
        L_0x014c:
            r1.A0K = r9     // Catch:{ all -> 0x0623 }
            java.lang.String r14 = "camera"
            r0 = r49
            r9.setQrScanningEnabled(r0)     // Catch:{ all -> 0x0623 }
            X.8Av r3 = r1.A0K     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x01a3
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0623 }
            r1.A0A = r3     // Catch:{ all -> 0x0623 }
            java.lang.String r13 = "cameraView"
            if (r3 == 0) goto L_0x01dd
            r0 = 8
            r3.setVisibility(r0)     // Catch:{ all -> 0x0623 }
            r0 = 2131428809(0x7f0b05c9, float:1.8479273E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0623 }
            r1.A0F = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428801(0x7f0b05c1, float:1.8479257E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0623 }
            r1.A0C = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428808(0x7f0b05c8, float:1.847927E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0623 }
            r1.A0E = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131428807(0x7f0b05c7, float:1.8479269E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0623 }
            r1.A0D = r0     // Catch:{ all -> 0x0623 }
            r0 = 2131434414(0x7f0b1bae, float:1.8490641E38)
            android.view.View r0 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            com.whatsapp.pushtorecordmedia.MediaProgressRing r0 = (com.whatsapp.pushtorecordmedia.MediaProgressRing) r0     // Catch:{ all -> 0x0623 }
            r1.A0V = r0     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r9 = r1.A0D     // Catch:{ all -> 0x0623 }
            if (r9 != 0) goto L_0x01a8
            java.lang.String r14 = "cameraViewFrame"
        L_0x01a3:
            X.C18070vi.A11(r14)     // Catch:{ all -> 0x0623 }
            goto L_0x043c
        L_0x01a8:
            android.view.View r8 = r1.A0A     // Catch:{ all -> 0x0623 }
            if (r8 == 0) goto L_0x01dd
            r4 = 17
            r3 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0623 }
            r0.<init>(r3, r3, r4)     // Catch:{ all -> 0x0623 }
            r9.addView(r8, r0)     // Catch:{ all -> 0x0623 }
            boolean r8 = r1.A1X     // Catch:{ all -> 0x0623 }
            if (r8 != 0) goto L_0x01cc
            android.view.ViewGroup r0 = r1.A0F     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x01c2
            java.lang.String r14 = "cameraViewHolder"
            goto L_0x01a3
        L_0x01c2:
            android.view.ViewGroup$LayoutParams r3 = X.C108965cb.A0A(r0)     // Catch:{ all -> 0x0623 }
            X.1sZ r3 = (X.C39151sZ) r3     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "9:16"
            r3.A0t = r0     // Catch:{ all -> 0x0623 }
        L_0x01cc:
            X.118 r0 = r1.A1D     // Catch:{ all -> 0x0623 }
            android.content.Context r3 = r0.A00     // Catch:{ all -> 0x0623 }
            r0 = 2131100005(0x7f060165, float:1.781238E38)
            int r3 = X.C19740yt.A00(r3, r0)     // Catch:{ all -> 0x0623 }
            android.view.View r0 = r1.A08     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x01e2
            java.lang.String r13 = "cameraLayout"
        L_0x01dd:
            X.C18070vi.A11(r13)     // Catch:{ all -> 0x0623 }
            goto L_0x043c
        L_0x01e2:
            r0.setBackgroundColor(r3)     // Catch:{ all -> 0x0623 }
            android.view.View r0 = r1.A09     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x01ec
            java.lang.String r13 = "cameraProtection"
            goto L_0x01dd
        L_0x01ec:
            r0.setBackgroundColor(r3)     // Catch:{ all -> 0x0623 }
            r0 = 2131428777(0x7f0b05a9, float:1.8479208E38)
            android.view.View r12 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            r1.A07 = r12     // Catch:{ all -> 0x0623 }
            if (r12 != 0) goto L_0x01fd
            java.lang.String r13 = "cameraActions"
            goto L_0x01dd
        L_0x01fd:
            X.8Av r11 = r1.A0K     // Catch:{ all -> 0x0623 }
            if (r11 == 0) goto L_0x01a3
            r4 = 5
            X.7S3 r9 = new X.7S3     // Catch:{ all -> 0x0623 }
            r9.<init>((java.lang.Object) r1, (int) r4)     // Catch:{ all -> 0x0623 }
            X.7S3 r0 = new X.7S3     // Catch:{ all -> 0x0623 }
            r0.<init>((java.lang.Object) r1, (int) r2)     // Catch:{ all -> 0x0623 }
            X.6fp r3 = new X.6fp     // Catch:{ all -> 0x0623 }
            r3.<init>(r9, r0, r8)     // Catch:{ all -> 0x0623 }
            X.0z4 r0 = r1.A1E     // Catch:{ all -> 0x0623 }
            X.741 r9 = new X.741     // Catch:{ all -> 0x0623 }
            r18 = r9
            r19 = r12
            r20 = r11
            r21 = r1
            r22 = r3
            r23 = r0
            r24 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0623 }
            r1.A0M = r9     // Catch:{ all -> 0x0623 }
            com.whatsapp.WaImageView r3 = r9.A0L     // Catch:{ all -> 0x0623 }
            X.82C r0 = new X.82C     // Catch:{ all -> 0x0623 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0623 }
            X.C84084Hu.A00(r3, r0)     // Catch:{ all -> 0x0623 }
            X.C1421478i.A00(r3, r1, r4)     // Catch:{ all -> 0x0623 }
            r16 = 7
            r0 = r16
            X.C1422678u.A00(r3, r1, r0)     // Catch:{ all -> 0x0623 }
            com.whatsapp.wds.components.button.WDSButton r3 = r9.A0U     // Catch:{ all -> 0x0623 }
            r0 = 49
            X.C89994dM.A00(r3, r1, r9, r0)     // Catch:{ all -> 0x0623 }
            com.whatsapp.WaImageView r0 = r9.A0K     // Catch:{ all -> 0x0623 }
            X.C89884dB.A00(r0, r1, r4)     // Catch:{ all -> 0x0623 }
            android.view.View r4 = r9.A0H     // Catch:{ all -> 0x0623 }
            r3 = 3
            X.4dB r0 = new X.4dB     // Catch:{ all -> 0x0623 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0623 }
            X.AnonymousClass4WJ.A00(r0, r4)     // Catch:{ all -> 0x0623 }
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A0T     // Catch:{ all -> 0x0623 }
            X.C89884dB.A00(r0, r1, r2)     // Catch:{ all -> 0x0623 }
            com.whatsapp.wds.components.button.WDSButton r3 = r9.A0S     // Catch:{ all -> 0x0623 }
            r0 = 2
            X.C89884dB.A00(r3, r1, r0)     // Catch:{ all -> 0x0623 }
            X.0ve r0 = r9.A0P     // Catch:{ all -> 0x0623 }
            boolean r0 = X.C1402270m.A00(r0)     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x02d4
            com.whatsapp.wds.components.button.WDSButton r12 = r9.A08     // Catch:{ all -> 0x0623 }
            r3 = 0
            if (r12 != 0) goto L_0x029c
            boolean r0 = X.AnonymousClass741.A05(r9)     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x028c
            android.content.Context r0 = r9.A0E     // Catch:{ all -> 0x0623 }
            com.whatsapp.wds.components.button.WDSButton r12 = new com.whatsapp.wds.components.button.WDSButton     // Catch:{ all -> 0x0623 }
            r12.<init>(r0, r3)     // Catch:{ all -> 0x0623 }
            X.4DG r0 = X.AnonymousClass4DG.MEDIA     // Catch:{ all -> 0x0623 }
            r12.setAction(r0)     // Catch:{ all -> 0x0623 }
            r12.setToggleSelection(r2)     // Catch:{ all -> 0x0623 }
            X.1Xz r0 = X.C27881Xz.TONAL     // Catch:{ all -> 0x0623 }
            r12.setVariant(r0)     // Catch:{ all -> 0x0623 }
            r0 = -2
            X.C108965cb.A12(r12, r0)     // Catch:{ all -> 0x0623 }
        L_0x0289:
            r9.A08 = r12     // Catch:{ all -> 0x0623 }
            goto L_0x029a
        L_0x028c:
            X.1bI r0 = r9.A0Q     // Catch:{ all -> 0x0623 }
            android.view.View r4 = r0.A02()     // Catch:{ all -> 0x0623 }
            r0 = 2131427832(0x7f0b01f8, float:1.8477291E38)
            com.whatsapp.wds.components.button.WDSButton r12 = X.AnonymousClass3MW.A0r(r4, r0)     // Catch:{ all -> 0x0623 }
            goto L_0x0289
        L_0x029a:
            if (r12 == 0) goto L_0x02bf
        L_0x029c:
            com.whatsapp.areffects.button.ArEffectsLottieButton r0 = r9.A06     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x02bf
            boolean r0 = X.AnonymousClass741.A05(r9)     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x02bf
            X.1bI r0 = r9.A0Q     // Catch:{ all -> 0x0623 }
            android.view.View r11 = r0.A02()     // Catch:{ all -> 0x0623 }
            boolean r0 = r11 instanceof com.whatsapp.areffects.button.ArEffectsLottieButton     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x02bd
            com.whatsapp.areffects.button.ArEffectsLottieButton r11 = (com.whatsapp.areffects.button.ArEffectsLottieButton) r11     // Catch:{ all -> 0x0623 }
            if (r11 == 0) goto L_0x02bd
            r3 = 3000(0xbb8, double:1.482E-320)
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            r11.A02(r12, r0, r3)     // Catch:{ all -> 0x0623 }
            r3 = r11
        L_0x02bd:
            r9.A06 = r3     // Catch:{ all -> 0x0623 }
        L_0x02bf:
            com.whatsapp.areffects.button.ArEffectsLottieButton r3 = r9.A06     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x02cb
            X.7ia r0 = new X.7ia     // Catch:{ all -> 0x0623 }
            r0.<init>(r9)     // Catch:{ all -> 0x0623 }
            r3.A03(r0)     // Catch:{ all -> 0x0623 }
        L_0x02cb:
            com.whatsapp.wds.components.button.WDSButton r3 = r9.A08     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x02d4
            r0 = 48
            X.C89994dM.A00(r3, r9, r1, r0)     // Catch:{ all -> 0x0623 }
        L_0x02d4:
            android.view.View r0 = r1.A0A     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x01dd
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0623 }
            r0 = 4
            X.AnonymousClass793.A00(r3, r1, r0)     // Catch:{ all -> 0x0623 }
            X.7DU r12 = new X.7DU     // Catch:{ all -> 0x0623 }
            r12.<init>(r1)     // Catch:{ all -> 0x0623 }
            r0 = 2131428796(0x7f0b05bc, float:1.8479247E38)
            android.view.View r11 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            com.whatsapp.camera.mode.CameraModeTabLayout r11 = (com.whatsapp.camera.mode.CameraModeTabLayout) r11     // Catch:{ all -> 0x0623 }
            X.6lD r0 = r1.A16     // Catch:{ all -> 0x0623 }
            int r4 = r0.A00     // Catch:{ all -> 0x0623 }
            r3 = 17
            if (r4 == r3) goto L_0x0306
            r3 = 18
            if (r4 == r3) goto L_0x0306
            r3 = 24
            if (r4 == r3) goto L_0x0306
            boolean r3 = r1.A0d()     // Catch:{ all -> 0x0623 }
            r23 = 0
            if (r3 == 0) goto L_0x0308
        L_0x0306:
            r23 = 1
        L_0x0308:
            int r9 = r1.A0s     // Catch:{ all -> 0x0623 }
            java.util.List r3 = r1.A0d     // Catch:{ all -> 0x0623 }
            boolean r24 = X.C22971Dz.A0h(r3)     // Catch:{ all -> 0x0623 }
            boolean r4 = r1.A0m     // Catch:{ all -> 0x0623 }
            X.6pk r3 = new X.6pk     // Catch:{ all -> 0x0623 }
            r18 = r3
            r19 = r12
            r20 = r11
            r21 = r6
            r22 = r9
            r25 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0623 }
            r1.A0Q = r3     // Catch:{ all -> 0x0623 }
            X.6bZ r9 = new X.6bZ     // Catch:{ all -> 0x0623 }
            r9.<init>(r1)     // Catch:{ all -> 0x0623 }
            r3 = 2131434420(0x7f0b1bb4, float:1.8490653E38)
            android.view.View r4 = A03(r1, r3)     // Catch:{ all -> 0x0623 }
            com.whatsapp.camera.recording.RecordingView r4 = (com.whatsapp.camera.recording.RecordingView) r4     // Catch:{ all -> 0x0623 }
            X.0vb r3 = r1.A1F     // Catch:{ all -> 0x0623 }
            r30 = r3
            X.11P r12 = r1.A1C     // Catch:{ all -> 0x0623 }
            int r10 = r10.BVn()     // Catch:{ all -> 0x0623 }
            r3 = 19
            if (r10 != r3) goto L_0x0344
            r10 = 8606(0x219e, float:1.206E-41)
            goto L_0x0350
        L_0x0344:
            java.util.List r3 = r1.A0d     // Catch:{ all -> 0x0623 }
            boolean r3 = X.C22971Dz.A0h(r3)     // Catch:{ all -> 0x0623 }
            r10 = 3185(0xc71, float:4.463E-42)
            if (r3 == 0) goto L_0x0350
            r10 = 4155(0x103b, float:5.822E-42)
        L_0x0350:
            long r23 = X.C108995ce.A08(r6, r10)     // Catch:{ all -> 0x0623 }
            X.6dk r10 = r1.A13     // Catch:{ all -> 0x0623 }
            java.util.List r3 = r1.A0d     // Catch:{ all -> 0x0623 }
            X.1BI r3 = X.C22971Dz.A01(r3)     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x036b
            X.0ve r10 = r10.A01     // Catch:{ all -> 0x0623 }
            r3 = 7901(0x1edd, float:1.1072E-41)
            int r3 = X.C18020vd.A00(r5, r10, r3)     // Catch:{ all -> 0x0623 }
            long r25 = X.C17890vO.A03(r3)
            goto L_0x0376
        L_0x036b:
            int r10 = r10.A00     // Catch:{ all -> 0x0623 }
            r3 = 14
            if (r10 != r3) goto L_0x0374
            r25 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0376
        L_0x0374:
            r25 = -1
        L_0x0376:
            long r10 = r1.A0u     // Catch:{ all -> 0x0623 }
            X.6zv r3 = new X.6zv     // Catch:{ all -> 0x0623 }
            r18 = r3
            r19 = r9
            r20 = r4
            r21 = r12
            r22 = r30
            r27 = r10
            r18.<init>(r19, r20, r21, r22, r23, r25, r27)     // Catch:{ all -> 0x0623 }
            r1.A0T = r3     // Catch:{ all -> 0x0623 }
            X.8Av r9 = r1.A0K     // Catch:{ all -> 0x0623 }
            if (r9 == 0) goto L_0x01a3
            r3 = 2131428799(0x7f0b05bf, float:1.8479253E38)
            android.view.View r4 = A03(r1, r3)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0623 }
            X.6pV r3 = new X.6pV     // Catch:{ all -> 0x0623 }
            r3.<init>(r4, r9, r2)     // Catch:{ all -> 0x0623 }
            r1.A0S = r3     // Catch:{ all -> 0x0623 }
            X.1FU r10 = A04(r1)     // Catch:{ all -> 0x0623 }
            r9 = 0
            X.7DV r4 = new X.7DV     // Catch:{ all -> 0x0623 }
            r4.<init>(r1, r9)     // Catch:{ all -> 0x0623 }
            X.77p r3 = new X.77p     // Catch:{ all -> 0x0623 }
            r3.<init>(r10, r4, r2)     // Catch:{ all -> 0x0623 }
            r1.A0J = r3     // Catch:{ all -> 0x0623 }
            android.view.View r4 = r1.A0A     // Catch:{ all -> 0x0623 }
            if (r4 == 0) goto L_0x01dd
            r3 = 6
            X.C1422678u.A00(r4, r1, r3)     // Catch:{ all -> 0x0623 }
            X.8Av r4 = r1.A0K     // Catch:{ all -> 0x0623 }
            if (r4 == 0) goto L_0x01a3
            X.7DT r3 = new X.7DT     // Catch:{ all -> 0x0623 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0623 }
            r4.setCameraCallback(r3)     // Catch:{ all -> 0x0623 }
            if (r8 != 0) goto L_0x03df
            X.1FU r8 = A04(r1)     // Catch:{ all -> 0x0623 }
            X.6bW r3 = new X.6bW     // Catch:{ all -> 0x0623 }
            r3.<init>(r1)     // Catch:{ all -> 0x0623 }
            X.5dz r4 = new X.5dz     // Catch:{ all -> 0x0623 }
            r4.<init>(r8, r3)     // Catch:{ all -> 0x0623 }
            boolean r3 = r4.canDetectOrientation()     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x03e8
            r4.enable()     // Catch:{ all -> 0x0623 }
        L_0x03dd:
            r1.A0L = r4     // Catch:{ all -> 0x0623 }
        L_0x03df:
            r3 = 789(0x315, float:1.106E-42)
            boolean r3 = X.C18020vd.A05(r5, r6, r3)     // Catch:{ all -> 0x0623 }
            r1.A0n = r3     // Catch:{ all -> 0x0623 }
            goto L_0x03ea
        L_0x03e8:
            r4 = 0
            goto L_0x03dd
        L_0x03ea:
            if (r3 == 0) goto L_0x0456
            X.741 r3 = r1.A0M     // Catch:{ all -> 0x0623 }
            if (r3 != 0) goto L_0x043f
            java.lang.String r13 = "cameraActionsController"
            goto L_0x01dd
        L_0x03f4:
            java.lang.String r22 = "whatsapp_status"
            goto L_0x0139
        L_0x03f8:
            r0 = 8708(0x2204, float:1.2203E-41)
            boolean r9 = X.C18020vd.A05(r5, r6, r0)     // Catch:{ all -> 0x0623 }
            int r0 = r40.intValue()     // Catch:{ all -> 0x0623 }
            if (r0 == r2) goto L_0x0407
            java.lang.String r12 = "whatsapp_camera"
            goto L_0x0409
        L_0x0407:
            java.lang.String r12 = "whatsapp_status"
        L_0x0409:
            if (r9 == 0) goto L_0x040c
            goto L_0x041b
        L_0x040c:
            java.lang.String r0 = "CameraUtils/getLiteCameraImpl oldLiteCameraController"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0623 }
            android.view.TextureView r0 = new android.view.TextureView     // Catch:{ all -> 0x0623 }
            r0.<init>(r4)     // Catch:{ all -> 0x0623 }
            X.DAU r0 = X.C25307CdB.A00(r4, r0)     // Catch:{ all -> 0x0623 }
            goto L_0x042d
        L_0x041b:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "CameraUtils/getLiteCameraImpl/useCamera1 = "
            X.C17900vP.A0n(r0, r9, r11)     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "CameraUtils/getLiteCameraImpl newLiteCameraController"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0623 }
            X.DAT r0 = r13.A00(r4, r6, r12, r11)     // Catch:{ all -> 0x0623 }
        L_0x042d:
            com.whatsapp.camera.litecamera.LiteCameraView r9 = new com.whatsapp.camera.litecamera.LiteCameraView     // Catch:{ all -> 0x0623 }
            r9.<init>(r8, r4, r0, r3)     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "CameraUtils/getCameraImpl/LiteCameraImpl"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0623 }
            goto L_0x014c
        L_0x0439:
            r3 = 0
            goto L_0x0124
        L_0x043c:
            r0 = 0
            goto L_0x05b2
        L_0x043f:
            com.whatsapp.WaImageView r3 = r3.A0L     // Catch:{ all -> 0x0623 }
            r3.setSoundEffectsEnabled(r9)     // Catch:{ all -> 0x0623 }
            android.media.SoundPool r5 = new android.media.SoundPool     // Catch:{ all -> 0x0623 }
            r5.<init>(r2, r2, r9)     // Catch:{ all -> 0x0623 }
            X.1FU r4 = r1.A0H     // Catch:{ all -> 0x0623 }
            r3 = 2132017247(0x7f14005f, float:1.9672767E38)
            int r3 = r5.load(r4, r3, r9)     // Catch:{ all -> 0x0623 }
            r1.A00 = r3     // Catch:{ all -> 0x0623 }
            r1.A06 = r5     // Catch:{ all -> 0x0623 }
        L_0x0456:
            androidx.fragment.app.Fragment r10 = r1.A0v     // Catch:{ all -> 0x0623 }
            boolean r4 = r10 instanceof com.whatsapp.gallery.GalleryTabHostFragment     // Catch:{ all -> 0x0623 }
            r3 = 0
            if (r4 == 0) goto L_0x046a
            r5 = r10
            com.whatsapp.gallery.GalleryTabHostFragment r5 = (com.whatsapp.gallery.GalleryTabHostFragment) r5     // Catch:{ all -> 0x0623 }
        L_0x0460:
            android.view.View r4 = r1.A0B     // Catch:{ all -> 0x0623 }
            if (r4 != 0) goto L_0x046c
            java.lang.String r0 = "rootView"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0623 }
            throw r3     // Catch:{ all -> 0x0623 }
        L_0x046a:
            r5 = r3
            goto L_0x0460
        L_0x046c:
            X.1FU r3 = r1.A0H     // Catch:{ all -> 0x0623 }
            r24 = 0
            if (r3 == 0) goto L_0x047e
            android.content.res.Configuration r3 = X.C108965cb.A03(r3)     // Catch:{ all -> 0x0623 }
            int r6 = r3.screenWidthDp     // Catch:{ all -> 0x0623 }
            r3 = 600(0x258, float:8.41E-43)
            if (r6 < r3) goto L_0x047e
            r24 = 1
        L_0x047e:
            X.6u4 r8 = r1.A15     // Catch:{ all -> 0x0623 }
            int r3 = r8.A00     // Catch:{ all -> 0x0623 }
            boolean r25 = r0.A00(r3)     // Catch:{ all -> 0x0623 }
            X.1FU r3 = A04(r1)     // Catch:{ all -> 0x0623 }
            android.content.Intent r11 = r3.getIntent()     // Catch:{ all -> 0x0623 }
            java.lang.String r6 = "include"
            r3 = r16
            int r23 = r11.getIntExtra(r6, r3)     // Catch:{ all -> 0x0623 }
            X.0vl r3 = r1.A1W     // Catch:{ all -> 0x0623 }
            boolean r26 = X.C72453Mb.A1a(r3)     // Catch:{ all -> 0x0623 }
            X.10I r3 = r1.A1N     // Catch:{ all -> 0x0623 }
            r29 = r3
            X.701 r6 = new X.701     // Catch:{ all -> 0x0623 }
            r18 = r6
            r19 = r4
            r20 = r8
            r21 = r5
            r22 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0623 }
            X.1Lp r15 = r1.A11     // Catch:{ all -> 0x0623 }
            X.1FU r14 = A04(r1)     // Catch:{ all -> 0x0623 }
            java.util.Set r3 = r8.A09     // Catch:{ all -> 0x0623 }
            r19 = r3
            X.6bX r13 = new X.6bX     // Catch:{ all -> 0x0623 }
            r13.<init>(r1)     // Catch:{ all -> 0x0623 }
            java.util.List r3 = r8.A08     // Catch:{ all -> 0x0623 }
            r18 = r3
            X.A4v r12 = r1.A1L     // Catch:{ all -> 0x0623 }
            android.os.Handler r11 = X.C17890vO.A0D()     // Catch:{ all -> 0x0623 }
            java.lang.String r5 = "image-loader-camera-ui"
            X.6tN r4 = new X.6tN     // Catch:{ all -> 0x0623 }
            r3 = r31
            r4.<init>(r11, r15, r3, r5)     // Catch:{ all -> 0x0623 }
            r6.A02 = r4     // Catch:{ all -> 0x0623 }
            X.1KB r3 = r14.A05     // Catch:{ all -> 0x0623 }
            r15 = r3
            X.10I r11 = r14.A05     // Catch:{ all -> 0x0623 }
            boolean r5 = r6.A0I     // Catch:{ all -> 0x0623 }
            X.5lB r3 = new X.5lB     // Catch:{ all -> 0x0623 }
            r23 = r4
            r24 = r12
            r25 = r11
            r26 = r18
            r27 = r19
            r28 = r5
            r18 = r3
            r19 = r14
            r20 = r15
            r21 = r13
            r22 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0623 }
            r6.A01 = r3     // Catch:{ all -> 0x0623 }
            androidx.recyclerview.widget.RecyclerView r11 = r6.A0B     // Catch:{ all -> 0x0623 }
            r11.setAdapter(r3)     // Catch:{ all -> 0x0623 }
            r11.A0R = r2     // Catch:{ all -> 0x0623 }
            android.content.res.Resources r4 = r6.A05     // Catch:{ all -> 0x0623 }
            r3 = 2131165736(0x7f070228, float:1.7945698E38)
            int r5 = r4.getDimensionPixelSize(r3)     // Catch:{ all -> 0x0623 }
            X.5lk r4 = new X.5lk     // Catch:{ all -> 0x0623 }
            r3 = r30
            r4.<init>(r6, r3, r5)     // Catch:{ all -> 0x0623 }
            r11.A0r(r4)     // Catch:{ all -> 0x0623 }
            X.C72463Mc.A0z(r14, r11, r9)     // Catch:{ all -> 0x0623 }
            X.1FU r5 = A04(r1)     // Catch:{ all -> 0x0623 }
            com.whatsapp.camera.CameraBottomSheetBehavior r4 = r6.A0C     // Catch:{ all -> 0x0623 }
            X.5qT r3 = new X.5qT     // Catch:{ all -> 0x0623 }
            r3.<init>(r5, r1, r6, r12)     // Catch:{ all -> 0x0623 }
            r4.A0a(r3)     // Catch:{ all -> 0x0623 }
            int r3 = r8.A00     // Catch:{ all -> 0x0623 }
            boolean r0 = r0.A00(r3)     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x054a
            X.1FU r11 = A04(r1)     // Catch:{ all -> 0x0623 }
            X.6yM r5 = r1.A1H     // Catch:{ all -> 0x0623 }
            X.6bY r4 = new X.6bY     // Catch:{ all -> 0x0623 }
            r4.<init>(r1)     // Catch:{ all -> 0x0623 }
            X.A34 r0 = r6.A03     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x053c
            r0.A0B(r2)     // Catch:{ all -> 0x0623 }
        L_0x053c:
            int r0 = r6.A04     // Catch:{ all -> 0x0623 }
            X.6Lb r3 = new X.6Lb     // Catch:{ all -> 0x0623 }
            r3.<init>(r11, r4, r5, r0)     // Catch:{ all -> 0x0623 }
            r6.A03 = r3     // Catch:{ all -> 0x0623 }
            r0 = r29
            X.AnonymousClass3MW.A1T(r3, r0, r9)     // Catch:{ all -> 0x0623 }
        L_0x054a:
            r1.A0P = r6     // Catch:{ all -> 0x0623 }
            r0 = 2131428784(0x7f0b05b0, float:1.8479222E38)
            android.view.View r4 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0623 }
            X.1FU r3 = r1.A0H     // Catch:{ all -> 0x0623 }
            X.5eF r0 = new X.5eF     // Catch:{ all -> 0x0623 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0623 }
            r4.addView(r0, r9)     // Catch:{ all -> 0x0623 }
            r0 = 2131428784(0x7f0b05b0, float:1.8479222E38)
            android.view.View r3 = A03(r1, r0)     // Catch:{ all -> 0x0623 }
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x0623 }
            boolean r0 = r3.isLaidOut()     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x058d
            boolean r0 = r3.isLayoutRequested()     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x058d
            X.1FU r0 = A04(r1)     // Catch:{ all -> 0x0623 }
            X.1GP r0 = X.AnonymousClass3MX.A0O(r0)     // Catch:{ all -> 0x0623 }
            X.1jj r4 = new X.1jj     // Catch:{ all -> 0x0623 }
            r4.<init>(r0)     // Catch:{ all -> 0x0623 }
            r3 = 2131431056(0x7f0b0e90, float:1.848383E38)
            java.lang.String r0 = "media_picker_fragment_tag"
            r4.A0D(r10, r0, r3)     // Catch:{ all -> 0x0623 }
            r4.A02()     // Catch:{ all -> 0x0623 }
            goto L_0x0591
        L_0x058d:
            r0 = 2
            X.C1420978d.A00(r3, r1, r0)     // Catch:{ all -> 0x0623 }
        L_0x0591:
            r3 = r42
            if (r42 == 0) goto L_0x05b6
            boolean r0 = X.C17880vN.A1X(r3)     // Catch:{ all -> 0x0623 }
            if (r0 != r2) goto L_0x05b6
            r4 = r37
            if (r37 == 0) goto L_0x05b6
            if (r50 == 0) goto L_0x05b6
            X.73D r0 = r8.A03     // Catch:{ all -> 0x0623 }
            java.util.Map r2 = r0.A00     // Catch:{ all -> 0x0623 }
            monitor-enter(r2)     // Catch:{ all -> 0x0623 }
            r2.clear()     // Catch:{ all -> 0x05b0 }
            java.util.Map r0 = r4.A00     // Catch:{ all -> 0x05b0 }
            r2.putAll(r0)     // Catch:{ all -> 0x05b0 }
            monitor-exit(r2)     // Catch:{ all -> 0x05b0 }
            goto L_0x05b3
        L_0x05b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x05b0 }
        L_0x05b2:
            throw r0     // Catch:{ all -> 0x0623 }
        L_0x05b3:
            r1.A0c(r3)     // Catch:{ all -> 0x0623 }
        L_0x05b6:
            X.1FU r0 = A04(r1)     // Catch:{ all -> 0x0623 }
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "media_sharing_user_journey_origin"
            r4 = -1
            int r6 = r2.getIntExtra(r0, r4)     // Catch:{ all -> 0x0623 }
            X.1FU r0 = A04(r1)     // Catch:{ all -> 0x0623 }
            android.content.Intent r3 = r0.getIntent()     // Catch:{ all -> 0x0623 }
            java.lang.String r2 = "media_sharing_user_journey_start_target"
            r0 = 9
            int r5 = r3.getIntExtra(r2, r0)     // Catch:{ all -> 0x0623 }
            X.1FU r0 = A04(r1)     // Catch:{ all -> 0x0623 }
            android.content.Intent r2 = r0.getIntent()     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "media_sharing_user_journey_chat_type"
            int r2 = r2.getIntExtra(r0, r4)     // Catch:{ all -> 0x0623 }
            if (r6 <= 0) goto L_0x061a
            boolean r0 = r8.A01()     // Catch:{ all -> 0x0623 }
            r4 = 17
            if (r0 == 0) goto L_0x05ef
            r4 = 18
        L_0x05ef:
            if (r2 <= 0) goto L_0x05f6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0623 }
            goto L_0x060f
        L_0x05f6:
            java.util.List r3 = r1.A0d     // Catch:{ all -> 0x0623 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x0600
            r2 = 0
            goto L_0x060f
        L_0x0600:
            int r2 = r3.size()     // Catch:{ all -> 0x0623 }
            r0 = 1
            if (r2 != r0) goto L_0x0615
            X.1BI r0 = X.C108945cZ.A0i(r3, r9)     // Catch:{ all -> 0x0623 }
            java.lang.Integer r2 = X.AnonymousClass6WK.A00(r0)     // Catch:{ all -> 0x0623 }
        L_0x060f:
            r0 = r32
            r0.A03(r2, r4, r6, r5)     // Catch:{ all -> 0x0623 }
            goto L_0x061a
        L_0x0615:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0623 }
            goto L_0x060f
        L_0x061a:
            r1 = 554251647(0x2109357f, float:4.6488207E-19)
            r0 = r17
            X.C1408973m.A02(r7, r0, r1)
            return
        L_0x0623:
            r3 = move-exception
            X.73m r2 = r1.A19
            r1 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r0 = "onCreate"
            X.C1408973m.A02(r2, r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DY.A0s(android.view.ViewGroup, X.1FU, X.3ho, X.73D, X.1EC, X.A4v, java.lang.Integer, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, java.util.List, long, boolean, boolean, boolean):void");
    }
}
