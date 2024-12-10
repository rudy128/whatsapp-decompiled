package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass114;
import X.AnonymousClass11C;
import X.AnonymousClass12Q;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1OR;
import X.AnonymousClass20F;
import X.AnonymousClass29w;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4D9;
import X.AnonymousClass4DS;
import X.AnonymousClass4aO;
import X.AnonymousClass5MA;
import X.AnonymousClass7DT;
import X.C010105w;
import X.C101165Bo;
import X.C101175Bp;
import X.C134126q5;
import X.C17880vN;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C219217x;
import X.C24191Jf;
import X.C25073CWg;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C72483Me;
import X.C86094Qd;
import X.C91074f6;
import X.C97614pl;
import X.C99274sY;
import X.C99764tQ;
import X.CX1;
import X.DAT;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.pushtorecordmedia.MediaProgressRing;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;
import java.util.Timer;
import org.json.JSONObject;

public final class ImagineMeOnboardingCameraFragment extends Hilt_ImagineMeOnboardingCameraFragment {
    public AnonymousClass02n A00;
    public C010105w A01;
    public CircularProgressIndicator A02;
    public AnonymousClass1KB A03;
    public WaImageView A04;
    public WaImageView A05;
    public WaImageView A06;
    public WaImageView A07;
    public WaTextView A08;
    public WaTextView A09;
    public CX1 A0A;
    public C86094Qd A0B;
    public ImagineMeOnboardingErrorDialogFragment A0C;
    public LiteCameraView A0D;
    public AnonymousClass11C A0E;
    public C219217x A0F;
    public C18030ve A0G;
    public C18010vc A0H;
    public MediaProgressRing A0I;
    public WDSButton A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public C18600wl A0M;
    public ViewGroup A0N;
    public final C18100vl A0O;
    public final AnonymousClass29w A0P = ((AnonymousClass29w) AnonymousClass12Q.A01(16461));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625369, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        this.A02 = (CircularProgressIndicator) AnonymousClass1HF.A06(view, 2131428795);
        this.A0N = AnonymousClass3MW.A0C(view, 2131428809);
        this.A0J = AnonymousClass3MW.A0q(view, 2131436020);
        this.A05 = AnonymousClass3MW.A0R(view, 2131433276);
        this.A06 = AnonymousClass3MW.A0R(view, 2131433277);
        this.A07 = AnonymousClass3MW.A0R(view, 2131433278);
        this.A09 = AnonymousClass3MW.A0T(view, 2131433280);
        this.A08 = AnonymousClass3MW.A0T(view, 2131433279);
        this.A04 = AnonymousClass3MW.A0R(view, 2131429136);
        this.A0I = (MediaProgressRing) AnonymousClass1HF.A06(view, 2131432410);
        C37581pm A0G2 = AnonymousClass3MZ.A0G(this);
        ImagineMeOnboardingCameraFragment$onViewCreated$1 imagineMeOnboardingCameraFragment$onViewCreated$1 = new ImagineMeOnboardingCameraFragment$onViewCreated$1(this, (C30391dr) null);
        AnonymousClass1OR r3 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r3, imagineMeOnboardingCameraFragment$onViewCreated$1, A0G2);
        C30451dy.A02(A0w, r3, new ImagineMeOnboardingCameraFragment$onViewCreated$2(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
        C30451dy.A02(A0w, r3, new ImagineMeOnboardingCameraFragment$onViewCreated$3(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
        C219217x r0 = this.A0F;
        if (r0 != null) {
            if (r0.A02("android.permission.CAMERA") != 0) {
                AnonymousClass00H r02 = this.A0L;
                if (r02 != null) {
                    r02.get();
                    C134126q5 r32 = new C134126q5(A14());
                    r32.A01 = 2131232198;
                    r32.A02 = 2131894343;
                    r32.A03 = 2131894342;
                    r32.A01(new String[]{"android.permission.CAMERA"});
                    r32.A06 = true;
                    Intent A002 = r32.A00();
                    AnonymousClass02n r03 = this.A00;
                    if (r03 == null) {
                        str = "permissionActivityLauncher";
                    } else {
                        r03.A03(A002);
                    }
                } else {
                    str = "waIntents";
                }
            } else {
                A02(this);
            }
            WDSButton wDSButton = this.A0J;
            if (wDSButton != null) {
                AnonymousClass3MZ.A1H(wDSButton, this, 20);
            }
            WaImageView waImageView = this.A04;
            if (waImageView != null) {
                AnonymousClass3MZ.A1H(waImageView, this, 21);
                return;
            }
            return;
        }
        str = "waPermissionsHelper";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A01(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        LiteCameraView liteCameraView = imagineMeOnboardingCameraFragment.A0D;
        if (liteCameraView != null) {
            liteCameraView.pause();
            liteCameraView.COZ();
        }
        imagineMeOnboardingCameraFragment.A0D = null;
        ViewGroup viewGroup = imagineMeOnboardingCameraFragment.A0N;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        imagineMeOnboardingCameraFragment.A0N = null;
        C86094Qd r3 = imagineMeOnboardingCameraFragment.A0B;
        if (r3 != null) {
            JSONObject A15 = C17880vN.A15();
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "memu_stop_detector");
            ((C25073CWg) r3.A03.getValue()).A00(A15);
        }
        imagineMeOnboardingCameraFragment.A0B = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.4rD] */
    public static final void A02(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        String str;
        ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment2 = imagineMeOnboardingCameraFragment;
        CircularProgressIndicator circularProgressIndicator = imagineMeOnboardingCameraFragment2.A02;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(0);
        }
        C18010vc r1 = imagineMeOnboardingCameraFragment2.A0H;
        if (r1 != null) {
            AnonymousClass11C r0 = imagineMeOnboardingCameraFragment2.A0E;
            if (r0 != null) {
                int A022 = C24191Jf.A02(r0, r1);
                CX1 cx1 = imagineMeOnboardingCameraFragment2.A0A;
                if (cx1 != null) {
                    Context A14 = imagineMeOnboardingCameraFragment2.A14();
                    C18030ve r9 = imagineMeOnboardingCameraFragment2.A0G;
                    if (r9 != null) {
                        DAT A002 = cx1.A00(A14, AnonymousClass4D9.IMAGINE_ME, r9, "whatsapp_imagine_me", false);
                        A002.CJv(12582912);
                        A002.CK8(2073600);
                        A002.CLM(2073600);
                        LiteCameraView liteCameraView = new LiteCameraView(A022, imagineMeOnboardingCameraFragment2.A14(), A002, C17880vN.A0h());
                        liteCameraView.A06 = new AnonymousClass7DT(imagineMeOnboardingCameraFragment2, 0);
                        AnonymousClass29w r12 = imagineMeOnboardingCameraFragment2.A0P;
                        ImagineMeOnboardingViewModel A0O2 = AnonymousClass3Ma.A0O(imagineMeOnboardingCameraFragment2);
                        Context A0A2 = C72483Me.A0A(r12);
                        try {
                            C86094Qd r6 = new C86094Qd(A0O2, liteCameraView);
                            AnonymousClass12Q.A04();
                            AnonymousClass114.A02(A0A2);
                            Timer timer = new Timer();
                            ? obj = new Object();
                            timer.schedule(new C99764tQ(obj), 0, 1);
                            MediaProgressRing mediaProgressRing = imagineMeOnboardingCameraFragment2.A0I;
                            if (mediaProgressRing != null) {
                                mediaProgressRing.A02(imagineMeOnboardingCameraFragment2.A1D(), new C97614pl(obj, 0));
                            }
                            r6.A00();
                            imagineMeOnboardingCameraFragment2.A0B = r6;
                            liteCameraView.setQrScanningEnabled(false);
                            imagineMeOnboardingCameraFragment2.A0D = liteCameraView;
                            ViewGroup viewGroup = imagineMeOnboardingCameraFragment2.A0N;
                            if (viewGroup != null) {
                                viewGroup.addView(liteCameraView, new FrameLayout.LayoutParams(-2, -2, 17));
                                AnonymousClass4aO.A02(viewGroup);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            AnonymousClass12Q.A04();
                            AnonymousClass114.A02(A0A2);
                            throw th;
                        }
                    } else {
                        str = "abProps";
                    }
                } else {
                    str = "liteCameraArFactory";
                }
            } else {
                str = "systemServices";
            }
        } else {
            str = "sharedPreferencesFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ImagineMeOnboardingCameraFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ImagineMeOnboardingViewModel.class);
        this.A0O = C99274sY.A00(new C101165Bo(this), new C101175Bp(this), new AnonymousClass5MA(this), A15);
    }

    public static final String A00(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, AnonymousClass4DS r7) {
        List list = AnonymousClass3Ma.A0O(imagineMeOnboardingCameraFragment).A0I;
        Resources A092 = AnonymousClass3MZ.A09(imagineMeOnboardingCameraFragment);
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, list.indexOf(r7) + 1);
        C17880vN.A1T(A1b, list.size(), 1);
        String string = A092.getString(2131892154, A1b);
        C18070vi.A0X(string);
        return string;
    }

    public void A1s() {
        super.A1s();
        A01(this);
        this.A0J = null;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A08 = null;
        this.A04 = null;
        MediaProgressRing mediaProgressRing = this.A0I;
        if (mediaProgressRing != null) {
            mediaProgressRing.A01();
        }
        this.A0I = null;
        this.A02 = null;
        ImagineMeOnboardingErrorDialogFragment imagineMeOnboardingErrorDialogFragment = this.A0C;
        if (imagineMeOnboardingErrorDialogFragment != null) {
            imagineMeOnboardingErrorDialogFragment.A01 = null;
        }
        this.A0C = null;
        C010105w r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A01 = null;
    }

    public void A1t() {
        super.A1t();
        LiteCameraView liteCameraView = this.A0D;
        if (liteCameraView != null) {
            liteCameraView.pause();
            if (liteCameraView.getVisibility() == 0) {
                liteCameraView.setVisibility(8);
            }
        }
    }

    public void A1u() {
        super.A1u();
        LiteCameraView liteCameraView = this.A0D;
        if (liteCameraView != null) {
            liteCameraView.CG0();
            if (liteCameraView.getVisibility() == 8) {
                liteCameraView.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A00 = CDw(new C91074f6(this, 0), new Object());
    }
}
