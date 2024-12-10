package com.facebook.smartcapture.view;

import X.AnonymousClass000;
import X.AnonymousClass1D7;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass7RP;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8DG;
import X.BHG;
import X.BHs;
import X.BLP;
import X.C108965cb;
import X.C108985cd;
import X.C146847Qv;
import X.C17880vN;
import X.C18070vi;
import X.C18460wS;
import X.C200410p;
import X.C24350Bzl;
import X.C24568C9p;
import X.C25120CYt;
import X.C25556Chu;
import X.C25971Cpe;
import X.C26132Csv;
import X.C26544D3f;
import X.C26548D3k;
import X.C26805DEn;
import X.C27082DTh;
import X.C28510E4u;
import X.C28555E7g;
import X.C28556E7h;
import X.C29431cG;
import X.C34001jj;
import X.C72453Mb;
import X.D45;
import X.E8K;
import X.EEE;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.smartcapture.camera.CameraFragment;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.ui.CaptureOverlayFragment;
import com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class IdCaptureActivity extends BLP implements C28555E7g, C28556E7h, C28510E4u {
    public Uri A00;
    public FrameLayout A01;
    public CameraFragment A02;
    public C26805DEn A03;
    public CaptureOverlayFragment A04;

    public void Bvy(C25556Chu chu) {
        C26132Csv csv;
        CameraFragment cameraFragment = this.A02;
        C26132Csv csv2 = null;
        if (cameraFragment != null) {
            csv = (C26132Csv) CameraFragment.A00(C25971Cpe.A0q, cameraFragment);
        } else {
            csv = null;
        }
        CameraFragment cameraFragment2 = this.A02;
        if (cameraFragment2 != null) {
            csv2 = (C26132Csv) CameraFragment.A00(C25971Cpe.A0k, cameraFragment2);
        }
        if (csv != null && csv2 != null) {
            A2n();
            int i = csv.A02;
            int i2 = csv.A01;
            int i3 = csv2.A02;
            int i4 = csv2.A01;
            FrameLayout frameLayout = this.A01;
            C18070vi.A0b(frameLayout);
            int width = frameLayout.getWidth();
            FrameLayout frameLayout2 = this.A01;
            C18070vi.A0b(frameLayout2);
            int height = frameLayout2.getHeight();
            Object[] objArr = new Object[12];
            objArr[0] = "preview_width";
            C17880vN.A1T(objArr, i, 1);
            objArr[2] = "preview_height";
            C17880vN.A1T(objArr, i2, 3);
            objArr[4] = "image_width";
            C17880vN.A1T(objArr, i3, 5);
            objArr[6] = "image_height";
            C17880vN.A1T(objArr, i4, 7);
            objArr[8] = "view_width";
            C17880vN.A1T(objArr, width, 9);
            objArr[10] = "view_height";
            C17880vN.A1T(objArr, height, 11);
            C24568C9p.A00(objArr);
        }
    }

    public void CIE(int i) {
        CameraFragment cameraFragment = this.A02;
        C18070vi.A0b(cameraFragment);
        BHG bhg = cameraFragment.A01;
        if (bhg != null) {
            bhg.post(new AnonymousClass7RP(cameraFragment, i, 10));
        }
    }

    public void CKl(boolean z, boolean z2) {
        CaptureOverlayFragment captureOverlayFragment = this.A04;
        C18070vi.A0b(captureOverlayFragment);
        AnonymousClass1FL A1B = captureOverlayFragment.A1B();
        if (A1B != null) {
            A1B.runOnUiThread(new C146847Qv(captureOverlayFragment, 0, z, z2));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624496);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131428791);
        this.A01 = frameLayout;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new BHs(frameLayout, this, 0));
            frameLayout.setClipToOutline(true);
        }
        C26548D3k A2m = A2m();
        this.A03 = new C26805DEn(this, new DocAuthManager(this, A2m(), A2n()), this.A01, A2m, A2n(), this);
        AnonymousClass3MZ.A0F(this).post(C27082DTh.A00(this, 37));
        if (this.A05 == C24350Bzl.INITIAL) {
            A2n();
        }
        if (this.A06 == null) {
            A2n();
        } else {
            try {
                D45 d45 = new D45(A00("__external__permissions_title"), A00("__external__id_permissions_explanation"), AnonymousClass3MY.A0m(getResources(), 17039370), AnonymousClass3MY.A0m(getResources(), 17039360), A00("__external__permissions_title"), A00("__external__id_permissions_in_settings_explanation"), A00("__external__id_permissions_in_settings_ok_button"), AnonymousClass3MY.A0m(getResources(), 17039360));
                CameraFragment cameraFragment = new CameraFragment();
                C26544D3f d3f = A2m().A03;
                Bundle A0D = C17880vN.A0D();
                A0D.putParcelable("fixed_photo_size", d3f);
                A0D.putParcelable("texts", d45);
                cameraFragment.A1R(A0D);
                C26805DEn dEn = this.A03;
                if (dEn == null) {
                    C18070vi.A11("presenter");
                    throw null;
                }
                DocAuthManager docAuthManager = dEn.A06;
                E8K e8k = cameraFragment.A08;
                EEE[] eeeArr = CameraFragment.A0B;
                e8k.CLJ(docAuthManager, eeeArr[0]);
                cameraFragment.A09.CLJ(this, eeeArr[1]);
                C18070vi.A0b(this.A06);
                CaptureOverlayFragment newInstance = DefaultCaptureOverlayFragment.class.newInstance();
                C34001jj r1 = new C34001jj(getSupportFragmentManager());
                r1.A09(cameraFragment, 2131428791);
                r1.A09(newInstance, 2131428840);
                r1.A01();
                this.A02 = cameraFragment;
                this.A04 = newInstance;
            } catch (IllegalAccessException | InstantiationException e) {
                A2n();
                C72453Mb.A1R(e.getMessage());
            }
        }
        A2m();
        A2m();
        Resources resources = this.A00;
        C18070vi.A0b(this.A04);
        C18460wS r2 = C18460wS.A00;
        C18070vi.A0d(r2, 2);
        if (resources != null) {
            try {
                Locale locale = resources.getConfiguration().locale;
                if (C200410p.A0U(locale.getLanguage(), new String[]{new Locale("hi").getLanguage(), new Locale("th").getLanguage(), new Locale("uk").getLanguage()})) {
                    Configuration configuration = new Configuration(C108965cb.A03(this));
                    configuration.setLocale(Locale.ENGLISH);
                    Resources resources2 = createConfigurationContext(configuration).getResources();
                    C18070vi.A0X(resources2);
                    Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        int A0H = C72453Mb.A0H(it);
                        String A0m = AnonymousClass3MY.A0m(resources, A0H);
                        String A0m2 = AnonymousClass3MY.A0m(resources2, A0H);
                        if (A0m.equals(A0m2)) {
                            String language = resources.getConfiguration().locale.getLanguage();
                            C18070vi.A0X(language);
                            HashMap A11 = C17880vN.A11();
                            A11.put("str", A0m2);
                            A11.put("lang", language);
                            A2n();
                        }
                    }
                }
            } catch (Throwable th) {
                Log.e("SCPUtil", th.toString());
            }
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

    public void Bnx() {
        A2n();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION;
        A1b[1] = "capture_step_back_button";
        C24568C9p.A00(A1b);
        super.onBackPressed();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                this.A00 = intent.getData();
            }
            C26805DEn dEn = this.A03;
            if (dEn == null) {
                C18070vi.A11("presenter");
                throw null;
            } else {
                dEn.A01();
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().addFlags(128);
    }

    public void onBackPressed() {
        Fragment A0O = getSupportFragmentManager().A0O(2131428840);
        if (A0O instanceof DefaultCaptureOverlayFragment) {
            DefaultCaptureOverlayFragment defaultCaptureOverlayFragment = (DefaultCaptureOverlayFragment) A0O;
            PhotoRequirementsView photoRequirementsView = defaultCaptureOverlayFragment.A08;
            C18070vi.A0b(photoRequirementsView);
            if (photoRequirementsView.A02) {
                PhotoRequirementsView photoRequirementsView2 = defaultCaptureOverlayFragment.A08;
                C18070vi.A0b(photoRequirementsView2);
                AnonymousClass8DG r0 = photoRequirementsView2.A01;
                if (r0 != null) {
                    r0.A00();
                    photoRequirementsView2.A01 = null;
                }
                photoRequirementsView2.A02 = false;
                return;
            }
        }
        A2n();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION;
        A1b[1] = "system_back_button";
        C24568C9p.A00(A1b);
        super.onBackPressed();
    }

    public void onPause() {
        super.onPause();
        C26805DEn dEn = this.A03;
        if (dEn == null) {
            C18070vi.A11("presenter");
            throw null;
        }
        synchronized (dEn.A06) {
        }
        dEn.A0A.disable();
        String obj = dEn.A09.toString();
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass8BS.A1B("state_history", obj, A1b);
        C24568C9p.A00(A1b);
    }

    public void onResume() {
        super.onResume();
        C26805DEn dEn = this.A03;
        if (dEn == null) {
            C18070vi.A11("presenter");
            throw null;
        }
        C25120CYt cYt = dEn.A09;
        synchronized (cYt) {
            cYt.A00 = AnonymousClass8BR.A1A();
        }
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("initial", BigDecimal.valueOf((double) (((float) (System.currentTimeMillis() - cYt.A01)) / 1000.0f)).setScale(3, roundingMode));
        } catch (JSONException unused) {
        }
        cYt.A00(A15);
        DocAuthManager docAuthManager = dEn.A06;
        AnonymousClass1D7.A0I();
        synchronized (docAuthManager) {
        }
        dEn.A02();
        dEn.A0A.enable();
        dEn.A0B.get();
    }

    public void BtV(Exception exc) {
        A2n();
    }
}
