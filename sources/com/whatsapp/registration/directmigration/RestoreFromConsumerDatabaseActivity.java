package com.whatsapp.registration.directmigration;

import X.AGE;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1Cd;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1NR;
import X.AnonymousClass1Nb;
import X.AnonymousClass1WZ;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4aW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8GT;
import X.AnonymousClass8Gf;
import X.C000200d;
import X.C137116uw;
import X.C18070vi;
import X.C20338AGu;
import X.C203911y;
import X.C219017v;
import X.C27361Vu;
import X.C27371Vv;
import X.C27391Vx;
import X.C27431Wb;
import X.C28931bI;
import X.C33621j7;
import X.C33841jT;
import X.C57352iw;
import X.C58802lH;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72463Mc;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;

public final class RestoreFromConsumerDatabaseActivity extends AnonymousClass1FY {
    public WaTextView A00;
    public WaTextView A01;
    public C33621j7 A02;
    public GoogleDriveRestoreAnimationView A03;
    public C27431Wb A04;
    public AnonymousClass1Cd A05;
    public AnonymousClass1WZ A06;
    public AnonymousClass19D A07;
    public AnonymousClass1LU A08;
    public C219017v A09;
    public C203911y A0A;
    public C58802lH A0B;
    public C33841jT A0C;
    public C27371Vv A0D;
    public AnonymousClass8GT A0E;
    public C27361Vu A0F;
    public C27391Vx A0G;
    public AnonymousClass1NR A0H;
    public C57352iw A0I;
    public AnonymousClass1Nb A0J;
    public AnonymousClass4aW A0K;
    public C28931bI A0L;
    public C28931bI A0M;
    public C28931bI A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public WaTextView A0Q;
    public boolean A0R;

    public void onBackPressed() {
    }

    public static final void A03(RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity) {
        View A022;
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = restoreFromConsumerDatabaseActivity.A03;
        if (googleDriveRestoreAnimationView != null) {
            googleDriveRestoreAnimationView.A03(true);
        }
        WaTextView waTextView = restoreFromConsumerDatabaseActivity.A0Q;
        if (waTextView != null) {
            waTextView.setText(2131892249);
        }
        C28931bI r1 = restoreFromConsumerDatabaseActivity.A0L;
        if (r1 != null) {
            r1.A04(0);
        }
        C28931bI r0 = restoreFromConsumerDatabaseActivity.A0L;
        if (!(r0 == null || (A022 = r0.A02()) == null)) {
            AnonymousClass3MZ.A1L(A022, restoreFromConsumerDatabaseActivity, 18);
        }
        C72453Mb.A1D(restoreFromConsumerDatabaseActivity.A00);
    }

    public static final void A0Q(RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = restoreFromConsumerDatabaseActivity.A03;
        if (!(googleDriveRestoreAnimationView == null || googleDriveRestoreAnimationView.A01 == 1)) {
            googleDriveRestoreAnimationView.A01();
        }
        WaTextView waTextView = restoreFromConsumerDatabaseActivity.A00;
        if (waTextView != null) {
            waTextView.setVisibility(0);
        }
        AnonymousClass3Ma.A1M(restoreFromConsumerDatabaseActivity.A0L);
        WaTextView waTextView2 = restoreFromConsumerDatabaseActivity.A0Q;
        if (waTextView2 != null) {
            waTextView2.setText(2131892248);
        }
        WaTextView waTextView3 = restoreFromConsumerDatabaseActivity.A01;
        if (waTextView3 != null) {
            waTextView3.setText(2131892247);
        }
        WaTextView waTextView4 = restoreFromConsumerDatabaseActivity.A00;
        if (waTextView4 != null) {
            waTextView4.setText(2131892250);
        }
    }

    public void A2y() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A02 = (C33621j7) r2.A0g.get();
            this.A0O = C000200d.A00(r2.A23);
            this.A0J = AnonymousClass3MZ.A11(r2);
            this.A0D = (C27371Vv) r2.A3Q.get();
            this.A0F = (C27361Vu) r2.A5Q.get();
            this.A0I = C72463Mc.A0i(r1);
            this.A0G = (C27391Vx) r2.AYF.get();
            this.A09 = (C219017v) r2.A6S.get();
            this.A04 = (C27431Wb) r2.A6f.get();
            this.A05 = (AnonymousClass1Cd) r2.A6i.get();
            this.A06 = (AnonymousClass1WZ) r2.A6j.get();
            this.A0H = (AnonymousClass1NR) r2.Aa2.get();
            this.A0B = (C58802lH) r2.A8V.get();
            this.A07 = C72463Mc.A0e(r2);
            this.A0C = AnonymousClass8BU.A0c(r2);
            this.A0A = (C203911y) r2.A9n.get();
            this.A0P = C000200d.A00(r2.AAM);
            this.A08 = AnonymousClass3MY.A0Z(r2);
            this.A0K = (AnonymousClass4aW) r1.A5C.get();
        }
    }

    public RestoreFromConsumerDatabaseActivity(int i) {
        this.A0R = false;
        AGE.A00(this, 28);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626740);
        C57352iw r0 = this.A0I;
        if (r0 != null) {
            r0.A00(this);
            this.A0Q = (WaTextView) findViewById(2131434653);
            this.A01 = (WaTextView) findViewById(2131434652);
            this.A00 = (WaTextView) findViewById(2131434649);
            this.A0L = AnonymousClass3Ma.A0x(this, 2131434646);
            this.A0N = AnonymousClass3Ma.A0x(this, 2131434651);
            this.A0M = AnonymousClass3Ma.A0x(this, 2131434650);
            this.A03 = (GoogleDriveRestoreAnimationView) findViewById(2131434647);
            AnonymousClass3MY.A0H(this, 2131434648).setBackgroundDrawable(AnonymousClass3NL.A00(this, this.A00, 2131231542));
            A0Q(this);
            AnonymousClass8GT r02 = (AnonymousClass8GT) AnonymousClass8BR.A0C(new AnonymousClass8Gf(this, 3), this).A00(AnonymousClass8GT.class);
            this.A0E = r02;
            if (r02 != null) {
                C20338AGu.A00(this, r02.A01, 14);
            }
            AnonymousClass8GT r03 = this.A0E;
            if (r03 != null) {
                C20338AGu.A00(this, r03.A02, 15);
                return;
            }
            return;
        }
        C18070vi.A11("landscapeModeBacktest");
        throw null;
    }

    public RestoreFromConsumerDatabaseActivity() {
        this(0);
    }
}
