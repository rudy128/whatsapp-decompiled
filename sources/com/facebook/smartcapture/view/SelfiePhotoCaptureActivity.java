package com.facebook.smartcapture.view;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.BLO;
import X.C108985cd;
import X.C17880vN;
import X.C18070vi;
import X.C26553D3t;
import X.C29431cG;
import X.C34001jj;
import X.C72453Mb;
import X.CNV;
import X.CXR;
import X.D3T;
import X.D46;
import X.DAR;
import X.E1N;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.smartcapture.camera.LiteCameraFragment;
import com.facebook.smartcapture.camera.PhotoCameraFragment;
import com.facebook.smartcapture.ui.PhotoSelfieCaptureOverlayFragment;
import com.facebook.smartcapture.ui.SelfieCaptureOverlayFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class SelfiePhotoCaptureActivity extends BLO implements View.OnLayoutChangeListener, E1N {
    public PhotoCameraFragment A00;
    public CXR A01;
    public DAR A02;
    public SelfieCaptureOverlayFragment A03;
    public FrameLayout A04;
    public FrameLayout A05;

    public void onBackPressed() {
        String str;
        DAR dar = this.A02;
        if (dar == null) {
            str = "presenter";
        } else {
            if (dar.A00 == AnonymousClass00R.A01) {
                dar.A00 = AnonymousClass00R.A0N;
            }
            if (this.A03 == null) {
                str = "cameraOverlayFragment";
            } else {
                super.onBackPressed();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.onCreate(bundle);
        setContentView(2131626879);
        this.A04 = (FrameLayout) findViewById(2131428791);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131430899);
        this.A05 = frameLayout;
        if (frameLayout == null) {
            C18070vi.A11("parentContainer");
        } else {
            frameLayout.addOnLayoutChangeListener(this);
            if (this.A04 == null || A2m().A03 == null) {
                C18070vi.A0b(this.A02);
            } else {
                try {
                    this.A03 = PhotoSelfieCaptureOverlayFragment.class.newInstance();
                    Bundle bundle2 = A2m().A01;
                    SelfieCaptureOverlayFragment selfieCaptureOverlayFragment = this.A03;
                    if (selfieCaptureOverlayFragment == null) {
                        C18070vi.A11("cameraOverlayFragment");
                        throw null;
                    }
                    String str5 = A2m().A07;
                    if (bundle2 != null) {
                        str = bundle2.getString("challenge_use_case");
                        str2 = bundle2.getString("av_session_id");
                        str3 = bundle2.getString("flow_id");
                        str4 = bundle2.getString("product_surface");
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                    }
                    selfieCaptureOverlayFragment.A25(str5, str, str2, str3, str4, A2m().A08);
                    C34001jj r2 = new C34001jj(getSupportFragmentManager());
                    SelfieCaptureOverlayFragment selfieCaptureOverlayFragment2 = this.A03;
                    if (selfieCaptureOverlayFragment2 == null) {
                        C18070vi.A11("cameraOverlayFragment");
                        throw null;
                    } else {
                        r2.A09(selfieCaptureOverlayFragment2, 2131428798);
                        r2.A01();
                    }
                } catch (IllegalAccessException | InstantiationException e) {
                    e.getMessage();
                    C18070vi.A0b(this.A02);
                }
            }
            C26553D3t d3t = A2m().A03;
            if (d3t == null) {
                C18070vi.A0b(this.A02);
            } else {
                Integer num = d3t.A00;
                Integer num2 = d3t.A02;
                Integer num3 = d3t.A01;
                PhotoCameraFragment photoCameraFragment = new PhotoCameraFragment();
                this.A00 = photoCameraFragment;
                photoCameraFragment.A26(new D46(A00("__external__permissions_title"), A00("__external__id_permissions_explanation"), AnonymousClass3MY.A0m(getResources(), 17039370), AnonymousClass3MY.A0m(getResources(), 17039360), A00("__external__permissions_title"), A00("__external__id_permissions_in_settings_explanation"), A00("__external__id_permissions_in_settings_ok_button"), AnonymousClass3MY.A0m(getResources(), 17039360)), num, num2, num3);
                D3T d3t2 = A2m().A02;
                C18070vi.A0z(d3t2, "null cannot be cast to non-null type com.facebook.smartcapture.capture.PhotoEvidenceRecorderProvider");
                d3t2.A03 = photoCameraFragment;
                D3T d3t3 = A2m().A02;
                new LiteCameraFragment();
                PhotoCameraFragment photoCameraFragment2 = d3t3.A03;
                C18070vi.A0b(photoCameraFragment2);
                CXR cxr = new CXR(photoCameraFragment2, d3t3.A05, d3t3.A06, d3t3.A07, d3t3.A01);
                d3t3.A03 = null;
                this.A01 = cxr;
                C34001jj r22 = new C34001jj(getSupportFragmentManager());
                r22.A09(photoCameraFragment, 2131428791);
                r22.A03();
            }
            this.A02 = new DAR(this.A01, this);
            PhotoCameraFragment photoCameraFragment3 = this.A00;
            C18070vi.A0b(photoCameraFragment3);
            DAR dar = this.A02;
            if (dar != null) {
                photoCameraFragment3.A02 = AnonymousClass3MW.A0z(dar);
                if (this.A02 != null) {
                    PhotoCameraFragment photoCameraFragment4 = this.A00;
                    C18070vi.A0b(photoCameraFragment4);
                    photoCameraFragment4.A25();
                    return;
                }
            }
            C18070vi.A11("presenter");
        }
        throw null;
    }

    public void onDestroy() {
        String str;
        FrameLayout frameLayout = this.A05;
        if (frameLayout == null) {
            str = "parentContainer";
        } else {
            frameLayout.removeOnLayoutChangeListener(this);
            if (this.A02 == null) {
                str = "presenter";
            } else {
                super.onDestroy();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            SelfieCaptureOverlayFragment selfieCaptureOverlayFragment = this.A03;
            String str = "cameraOverlayFragment";
            if (selfieCaptureOverlayFragment != null) {
                if (!selfieCaptureOverlayFragment.A0j && !selfieCaptureOverlayFragment.A0Z && selfieCaptureOverlayFragment.A1B() != null && selfieCaptureOverlayFragment.A0B != null && selfieCaptureOverlayFragment.A1b()) {
                    FrameLayout frameLayout = this.A04;
                    if (frameLayout == null) {
                        str = "cameraFragmentContainer";
                    } else {
                        int i9 = i3 - i;
                        int i10 = i4 - i2;
                        PhotoSelfieCaptureOverlayFragment photoSelfieCaptureOverlayFragment = (PhotoSelfieCaptureOverlayFragment) selfieCaptureOverlayFragment;
                        AnonymousClass1FL A1B = photoSelfieCaptureOverlayFragment.A1B();
                        if (A1B != null) {
                            RectF rectF = photoSelfieCaptureOverlayFragment.A02;
                            C18070vi.A0d(rectF, 1);
                            float dimension = A1B.getResources().getDimension(2131168495) + A1B.getResources().getDimension(2131168494);
                            float dimension2 = A1B.getResources().getDimension(2131168498) + dimension;
                            float f = (float) i9;
                            float min = Math.min(f - ((A1B.getResources().getDimension(2131168496) + dimension) * 2.0f), ((float) i10) - dimension2) / 2.0f;
                            float f2 = f / 2.0f;
                            rectF.set(f2 - min, dimension2, f2 + min, dimension2 + min + min);
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.width = (int) rectF.width();
                            marginLayoutParams.height = (int) rectF.height();
                            marginLayoutParams.topMargin = (int) rectF.top;
                            frameLayout.requestLayout();
                            View view3 = photoSelfieCaptureOverlayFragment.A0B;
                            ViewGroup.LayoutParams layoutParams2 = null;
                            if (view3 != null) {
                                view2 = view3.findViewById(2131432146);
                                if (view2 != null) {
                                    layoutParams2 = view2.getLayoutParams();
                                }
                            } else {
                                view2 = null;
                            }
                            C18070vi.A0z(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (rectF.bottom + ((float) ((int) A1B.getResources().getDimension(2131168497))));
                            if (view2 != null) {
                                view2.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void onPause() {
        if (this.A02 == null) {
            C18070vi.A11("presenter");
            throw null;
        } else {
            super.onPause();
        }
    }

    private final String A00(String str) {
        Map BSj = BSj();
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(BSj);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (str.equals(A16.getValue())) {
                C108985cd.A1R(A13, A16);
            }
        }
        if (A13.isEmpty()) {
            return "";
        }
        return AnonymousClass3MY.A0m(getResources(), AnonymousClass000.A0M(C29431cG.A0X(A13.keySet())));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            setResult(i2, intent);
            finish();
        } else if (i2 == 1003) {
            onBackPressed();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    public void onResume() {
        super.onResume();
        DAR dar = this.A02;
        if (dar == null) {
            C18070vi.A11("presenter");
            throw null;
        }
        CXR cxr = this.A01;
        C72453Mb.A1R(cxr);
        cxr.A02 = new CNV(cxr, dar);
        dar.A01 = AnonymousClass3MW.A0z(cxr);
        View findViewById = findViewById(16908315);
        if (findViewById != null) {
            AnonymousClass3MZ.A1N(findViewById, this, 7);
        }
        CXR cxr2 = this.A01;
        if (cxr2 != null) {
            cxr2.A00();
        }
    }
}
