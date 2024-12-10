package com.whatsapp.documentpicker;

import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4P4;
import X.AnonymousClass6ZN;
import X.AnonymousClass747;
import X.AnonymousClass79Z;
import X.AnonymousClass851;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C109005cf;
import X.C114645rS;
import X.C121776Ll;
import X.C21467AkY;
import X.C26521Sl;
import X.C34531kd;
import X.C62272r8;
import X.C88184Yq;
import X.C98564rM;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.io.File;

public class DocumentPreviewActivity extends C114645rS implements AnonymousClass851 {
    public C34531kd A00;
    public AnonymousClass1LU A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public void Bxj(File file, String str) {
        File file2 = file;
        String str2 = str;
        super.Bxj(file, str);
        if (isFinishing()) {
            return;
        }
        if (((C62272r8) this.A02.get()).A00(str)) {
            this.A05.CGM(new C121776Ll(this, this, (C62272r8) this.A02.get(), file2, str2), new Void[0]);
            return;
        }
        this.A02.setVisibility(8);
        this.A04.setVisibility(8);
        this.A05.CGF(new C21467AkY(this, file, str, 29));
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r3 = A0A.A00;
            C109005cf.A0d(A0A, r3, this);
            C109005cf.A0e(A0A, r3, this, r3.A5A);
            this.A09 = AnonymousClass3Ma.A0d(A0A);
            this.A0B = C108955ca.A0M(A0A);
            this.A0C = C108985cd.A0T(A0A);
            this.A0M = C000200d.A00(A0A.AAB);
            this.A0O = C000200d.A00(A0A.AC9);
            this.A0N = C000200d.A00(A0A.ABv);
            this.A06 = AnonymousClass10E.A4z(A0A);
            this.A07 = AnonymousClass3MZ.A0g(A0A);
            this.A0I = C108965cb.A0h(A0A);
            this.A0H = (C26521Sl) A0A.A69.get();
            this.A0F = C108965cb.A0Z(A0A);
            this.A0J = C108965cb.A0i(r3);
            this.A0E = AnonymousClass3Ma.A0r(A0A);
            this.A0L = C000200d.A00(r3.A4e);
            this.A0K = C108965cb.A0j(r3);
            this.A0D = AnonymousClass1K1.A1G(A0K);
            this.A08 = (C88184Yq) r3.A15.get();
            this.A05 = (AnonymousClass6ZN) A0K.A2F.get();
            this.A00 = AnonymousClass3MZ.A0R(A0A);
            this.A01 = AnonymousClass3MY.A0Z(A0A);
            this.A02 = C000200d.A00(A0A.AKg);
        }
    }

    public DocumentPreviewActivity(int i) {
        this.A03 = false;
        AnonymousClass79Z.A00(this, 45);
    }

    public static String A03(DocumentPreviewActivity documentPreviewActivity) {
        if (documentPreviewActivity.getIntent().getParcelableExtra("uri") == null) {
            return documentPreviewActivity.getString(2131897363);
        }
        return AnonymousClass747.A02((Uri) documentPreviewActivity.getIntent().getParcelableExtra("uri"), documentPreviewActivity.A08);
    }

    public static void A0Q(View view, DocumentPreviewActivity documentPreviewActivity, String str, String str2, int i) {
        TextView A0J = AnonymousClass3MW.A0J(view, 2131430110);
        String A032 = AnonymousClass747.A03(documentPreviewActivity.A00, str, i);
        if (!TextUtils.isEmpty(A032)) {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(A032, str2, A1b);
            str2 = documentPreviewActivity.getString(2131889538, A1b);
        }
        A0J.setText(str2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.CGF(new C98564rM(this, 27));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass4P4 r2 = this.A0G;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A01);
            r2.A05.A0L();
            r2.A03.dismiss();
            this.A0G = null;
        }
    }

    public DocumentPreviewActivity() {
        this(0);
    }
}
