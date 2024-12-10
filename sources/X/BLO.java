package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.Map;

public abstract class BLO extends AnonymousClass1FL implements C28557E7i, C28509E4t, E1M {
    public Resources A00;
    public D4D A01;
    public BVP A02;
    public C72023Ki A03;
    public BVW A04;
    public CDP A05;

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        BVP bvp = this.A02;
        C18070vi.A0b(bvp);
        bvp.A01(bundle);
    }

    public final D4D A2m() {
        D4D d4d = this.A01;
        if (d4d != null) {
            return d4d;
        }
        C18070vi.A11("selfieCaptureConfig");
        throw null;
    }

    public CDP BQu() {
        return this.A05;
    }

    public Map BSj() {
        if (this.A04 == null) {
            return AnonymousClass1D7.A0I();
        }
        return C24705CGr.A00;
    }

    public C72023Ki BZn() {
        C72023Ki r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stringOverride");
        throw null;
    }

    public Resources getResources() {
        Resources resources = this.A00;
        if (resources != null) {
            return resources;
        }
        Resources resources2 = super.getResources();
        C18070vi.A0X(resources2);
        return resources2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BVP bvp = this.A02;
        C18070vi.A0b(bvp);
        if (i2 == 0) {
            bvp.A01 = false;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C18070vi.A0b(this.A02);
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION;
        A1b[1] = "system_back_button";
        C24568C9p.A00(A1b);
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        D4D d4d = (D4D) getIntent().getParcelableExtra("selfie_capture_config");
        if (d4d == null) {
            finish();
            return;
        }
        this.A01 = d4d;
        D4D A2m = A2m();
        int i = A2m.A00;
        if (i != 0) {
            setTheme(i);
        }
        ECW ecw = A2m.A04;
        C18070vi.A0b(ecw);
        this.A03 = ecw.BGC();
        super.onCreate(bundle);
        Intent intent = getIntent();
        D4D A2m2 = A2m();
        BVW bvw = A2m2.A05;
        C18070vi.A0b(bvw);
        this.A04 = bvw;
        BVX bvx = A2m2.A06;
        if (bvx != null) {
            bvx.A00(this);
            Resources resources = bvx.A00;
            if (resources == null) {
                str = "resources";
            } else {
                this.A00 = resources;
                CDP cdp = bvx.A01;
                if (cdp == null) {
                    str = "drawableProvider";
                } else {
                    this.A05 = cdp;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        BVP bvp = new BVP(C24345Bzg.CAPTURE);
        this.A02 = bvp;
        bvp.A00(intent, bundle);
    }

    public void onResume() {
        super.onResume();
        BVP bvp = this.A02;
        C18070vi.A0b(bvp);
        if (!bvp.A01) {
            bvp.A01 = true;
            C24345Bzg bzg = bvp.A00;
            C24345Bzg bzg2 = bvp.A02;
            C18070vi.A0d(bzg2.text, 0);
            Object[] A1a = BE6.A1a();
            A1a[0] = "previous";
            A1a[1] = bzg.text;
            A1a[2] = "next";
            A1a[3] = bzg2.text;
            C24568C9p.A00(A1a);
        }
    }
}
