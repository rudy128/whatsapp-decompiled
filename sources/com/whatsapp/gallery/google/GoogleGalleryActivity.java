package com.whatsapp.gallery.google;

import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass65P;
import X.AnonymousClass79Z;
import X.AnonymousClass7HC;
import X.AnonymousClass7HD;
import X.AnonymousClass855;
import X.C108955ca;
import X.C109005cf;
import X.C138436x4;
import X.C1406772n;
import X.C151277m2;
import X.C151287m3;
import X.C151297m4;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C72453Mb;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import com.whatsapp.util.Log;

public final class GoogleGalleryActivity extends AnonymousClass1FY {
    public boolean A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
        }
    }

    public GoogleGalleryActivity(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 48);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass855 r6;
        super.onCreate(bundle);
        try {
            long A002 = (long) C19740yt.A00(this, 2131103261);
            int A0I = C72453Mb.A0I(this.A02);
            if (C72453Mb.A1a(this.A01)) {
                r6 = AnonymousClass7HC.A00;
            } else {
                r6 = AnonymousClass7HD.A00;
            }
            AnonymousClass855 r62 = r6;
            AnonymousClass65P r5 = AnonymousClass65P.A00;
            Integer valueOf = Integer.valueOf(A0I);
            Long valueOf2 = Long.valueOf(A002);
            C18070vi.A0d(r62, 0);
            C138436x4 r2 = new C138436x4();
            r2.A01 = r62;
            r2.A02 = valueOf;
            r2.A04 = true;
            r2.A00 = r5;
            r2.A03 = valueOf2;
            ((AnonymousClass02n) this.A03.getValue()).A02((C1406772n) null, r2);
        } catch (ActivityNotFoundException e) {
            Log.e("GoogleGalleryActivity/create/ActivityNotFoundException", e);
            this.A05.A08(2131890789, 0);
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(0, 0);
    }

    public GoogleGalleryActivity() {
        this(0);
        this.A02 = AnonymousClass1DF.A01(new C151287m3(this));
        this.A01 = AnonymousClass1DF.A01(new C151277m2(this));
        this.A03 = AnonymousClass1DF.A01(new C151297m4(this));
    }
}
