package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Map;

public abstract class BLP extends AnonymousClass1FL implements C28557E7i, EDO {
    public Resources A00;
    public C24321BzI A01 = C24321BzI.ID1;
    public C26548D3k A02;
    public BVO A03;
    public C24350Bzl A04;
    public C24350Bzl A05 = C24350Bzl.INITIAL;
    public BVV A06;
    public CDP A07;
    public boolean A08;
    public final C18100vl A09 = DWX.A00(this, 0);

    public void onBackPressed() {
        setResult(0);
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("step_change_logged", this.A08);
    }

    public final C26548D3k A2m() {
        C26548D3k d3k = this.A02;
        if (d3k != null) {
            return d3k;
        }
        C18070vi.A11("idCaptureConfig");
        throw null;
    }

    public final BVO A2n() {
        BVO bvo = this.A03;
        if (bvo != null) {
            return bvo;
        }
        C18070vi.A11("mIdCaptureLogger");
        throw null;
    }

    public CDP BQu() {
        return this.A07;
    }

    public Map BSj() {
        if (this.A06 != null) {
            return C24719CHg.A01;
        }
        return AnonymousClass1D7.A0I();
    }

    public C72023Ki BZn() {
        return (C72023Ki) this.A09.getValue();
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
        if (i2 == 0) {
            this.A08 = false;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.BVO, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        C24350Bzl bzl;
        boolean z;
        C24350Bzl bzl2;
        String str;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("id_capture_config");
        if (parcelableExtra != null) {
            C26548D3k d3k = (C26548D3k) parcelableExtra;
            C18070vi.A0d(d3k, 0);
            this.A02 = d3k;
            this.A06 = A2m().A05;
            BVX bvx = A2m().A06;
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
                        this.A07 = cdp;
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            A2m();
            this.A03 = new Object();
            A2n();
            if (this.A05 == C24350Bzl.FIRST_PHOTO_CONFIRMATION) {
                bzl = C24350Bzl.SECOND_PHOTO_CAPTURE;
            } else {
                bzl = C24350Bzl.FIRST_PHOTO_CAPTURE;
            }
            C18070vi.A0d(bzl.text, 0);
            A2m();
            if (getIntent().hasExtra("preset_document_type")) {
                C24321BzI bzI = (C24321BzI) getIntent().getSerializableExtra("preset_document_type");
                if (bzI != null) {
                    this.A01 = bzI;
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            if (getIntent().hasExtra("previous_step")) {
                Serializable serializableExtra = getIntent().getSerializableExtra("previous_step");
                if (!(serializableExtra instanceof C24350Bzl) || (bzl2 = (C24350Bzl) serializableExtra) == null) {
                    bzl2 = C24350Bzl.INITIAL;
                }
                this.A05 = bzl2;
            }
            if (bundle != null) {
                z = bundle.getBoolean("step_change_logged");
            } else {
                z = false;
            }
            this.A08 = z;
            int i = A2m().A00;
            if (i != 0) {
                setTheme(i);
                A2m();
            }
            super.onCreate(bundle);
            return;
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public void onResume() {
        C24350Bzl bzl;
        C24350Bzl bzl2;
        super.onResume();
        if (!this.A08) {
            this.A08 = true;
            C24350Bzl bzl3 = this.A04;
            BVO A2n = A2n();
            if (bzl3 != null) {
                C24350Bzl bzl4 = this.A04;
                C18070vi.A0b(bzl4);
                if (this.A05 == C24350Bzl.FIRST_PHOTO_CONFIRMATION) {
                    bzl2 = C24350Bzl.SECOND_PHOTO_CAPTURE;
                } else {
                    bzl2 = C24350Bzl.FIRST_PHOTO_CAPTURE;
                }
                A2n.A00(bzl4, bzl2);
                this.A04 = null;
                return;
            }
            C24350Bzl bzl5 = this.A05;
            if (bzl5 == C24350Bzl.FIRST_PHOTO_CONFIRMATION) {
                bzl = C24350Bzl.SECOND_PHOTO_CAPTURE;
            } else {
                bzl = C24350Bzl.FIRST_PHOTO_CAPTURE;
            }
            A2n.A00(bzl5, bzl);
        }
    }
}
