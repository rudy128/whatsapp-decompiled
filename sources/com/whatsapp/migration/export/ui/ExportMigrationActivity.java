package com.whatsapp.migration.export.ui;

import X.A7R;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.AnonymousClass7AQ;
import X.AnonymousClass7Pt;
import X.C000200d;
import X.C003401n;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C110885hR;
import X.C1412374v;
import X.C1423279a;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C186049dZ;
import X.C196129uV;
import X.C20006A2w;
import X.C36801oU;
import X.C36841oY;
import X.C40751vD;
import X.C70593Bs;
import X.C73203Rj;
import X.C88584aA;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class ExportMigrationActivity extends AnonymousClass1FY {
    public C40751vD A00;
    public WaNetworkResourceImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public C36801oU A07;
    public C36841oY A08;
    public RoundCornerProgressBar A09;
    public AnonymousClass118 A0A;
    public AnonymousClass18K A0B;
    public AnonymousClass1LU A0C;
    public C196129uV A0D;
    public A7R A0E;
    public ExportMigrationViewModel A0F;
    public C186049dZ A0G;
    public WDSButton A0H;
    public WDSButton A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public String A0L;
    public boolean A0M;

    public static void A03(ExportMigrationActivity exportMigrationActivity, int i) {
        MessagesExporterService.A00(exportMigrationActivity.A0A.A00, exportMigrationActivity.A0E);
        C17900vP.A0j("ExportMigrationActivity/cancelMigrationAndReturn/resultCode: ", AnonymousClass000.A10(), i);
        exportMigrationActivity.setResult(i);
        exportMigrationActivity.finish();
    }

    public void A2y() {
        if (!this.A0M) {
            this.A0M = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A00 = (C40751vD) A0A2.AB7.get();
            this.A0A = AnonymousClass3MZ.A0l(A0A2);
            this.A0C = AnonymousClass3MY.A0Z(A0A2);
            this.A0B = AnonymousClass3Ma.A0g(A0A2);
            this.A0E = (A7R) A0A2.ALW.get();
            this.A0J = C000200d.A00(A0A2.A0j);
            this.A0K = C000200d.A00(A0K2.A4t);
            this.A0D = (C196129uV) A0A2.A6q.get();
            this.A0G = (C186049dZ) r2.A1g.get();
            this.A07 = (C36801oU) A0A2.A4c.get();
            this.A08 = (C36841oY) A0A2.A4f.get();
        }
    }

    public void onBackPressed() {
        A0c(new C70593Bs(this, 44));
    }

    public ExportMigrationActivity(int i) {
        this.A0M = false;
        C1423279a.A00(this, 15);
    }

    public static void A0Q(ExportMigrationActivity exportMigrationActivity, long j) {
        ExportMigrationActivity exportMigrationActivity2 = exportMigrationActivity;
        String string = exportMigrationActivity.getString(2131892289);
        String A042 = C88584aA.A04(exportMigrationActivity.A00, j);
        C18000vb r4 = exportMigrationActivity2.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = r4.A0F(A042);
        exportMigrationActivity2.runOnUiThread(new AnonymousClass7Pt(exportMigrationActivity2, string, r4.A0K(A1a, 2131755242, j), j));
    }

    public static void A0V(ExportMigrationActivity exportMigrationActivity, Runnable runnable, Runnable runnable2, boolean z) {
        String string = exportMigrationActivity.getString(2131892283);
        String string2 = exportMigrationActivity.getString(2131892280);
        C73203Rj A002 = AnonymousClass4a6.A00(exportMigrationActivity);
        A002.A0k(string);
        A002.A0S(string2);
        A002.A0T(z);
        A002.A0L(new AnonymousClass758(runnable, 2), exportMigrationActivity.getString(2131892282));
        String string3 = exportMigrationActivity.getString(2131892281);
        A002.A00.A0J(new AnonymousClass758(runnable2, 3), string3);
        A002.A0C();
    }

    private void A0c(Runnable runnable) {
        String string = getString(2131892294);
        if (!this.A0E.A08()) {
            C108965cb.A0S(this).A00(this.A0L, 15);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(string);
        A002.A0L(new AnonymousClass758(this, 5), getString(2131892282));
        String string2 = getString(2131892281);
        A002.A00.A0J(new C1412374v(runnable, this, 5), string2);
        A002.A0C();
    }

    public /* synthetic */ void A4b() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0L = this.A0D.A02();
        C108965cb.A0S(this).A00(this.A0L, 11);
        if (!C18020vd.A05(C18040vf.A02, this.A0E, 843)) {
            C108965cb.A0S(this).A01(this.A0L, 18);
            Log.e("ExportMigrationActivity/verifyActivityStartRequest; disabled: platform migration feature is disabled");
            setResult(102);
        } else {
            try {
                C186049dZ r2 = this.A0G;
                synchronized (r2.A02.get()) {
                }
                if (!r2.A01.A00("com.apple.movetoios")) {
                    C108965cb.A0S(this).A01(this.A0L, 19);
                    Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed");
                    this.A03.A0G("xpm-export-activity-permission-denied", (String) null, false);
                    setResult(104);
                    this.A0D.A03();
                    super.finish();
                    return;
                } else if (!this.A0E.A08() && AnonymousClass11S.A00(this.A02) == null) {
                    C108965cb.A0S(this).A01(this.A0L, 21);
                    Log.e("ExportMigrationActivity/onCreate/user: no user logged in, skipping.");
                    startActivity(AnonymousClass1LU.A04(this));
                    setResult(105);
                } else if (this.A0E.A08()) {
                    C20006A2w a2w = this.A0E.A08;
                    if (!a2w.A05()) {
                        a2w.A03();
                    }
                    Log.i("ExportMigrationActivity/providerReady/finishing");
                    C108965cb.A0S(this).A01(this.A0L, 24);
                    Log.i("ExportMigrationActivity/activateContentProviderAndFinishActivity");
                    setResult(100);
                    finish();
                    return;
                } else {
                    C108965cb.A0S(this).A00(this.A0L, 1);
                    setContentView(2131625284);
                    setTitle(getString(2131892290));
                    C003401n supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A0W(true);
                    }
                    this.A05 = (WaTextView) C110885hR.A0A(this, 2131430729);
                    this.A04 = (WaTextView) C110885hR.A0A(this, 2131430728);
                    this.A06 = (WaTextView) C110885hR.A0A(this, 2131430730);
                    this.A02 = (WaTextView) C110885hR.A0A(this, 2131430722);
                    this.A0H = (WDSButton) C110885hR.A0A(this, 2131430724);
                    this.A0I = (WDSButton) C110885hR.A0A(this, 2131430727);
                    this.A01 = (WaNetworkResourceImageView) C110885hR.A0A(this, 2131430723);
                    this.A09 = (RoundCornerProgressBar) C110885hR.A0A(this, 2131430725);
                    this.A03 = (WaTextView) C110885hR.A0A(this, 2131430726);
                    ExportMigrationViewModel exportMigrationViewModel = (ExportMigrationViewModel) AnonymousClass3MW.A0N(this).A00(ExportMigrationViewModel.class);
                    this.A0F = exportMigrationViewModel;
                    AnonymousClass7AQ.A00(this, exportMigrationViewModel.A02, 12);
                    AnonymousClass7AQ.A00(this, this.A0F.A00, 13);
                    AnonymousClass7AQ.A00(this, this.A0F.A01, 14);
                    return;
                }
            } catch (SecurityException e) {
                C108965cb.A0S(this).A01(this.A0L, 20);
                Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed", e);
                this.A03.A0E("xpm-export-activity-permission-denied", (String) null, e);
                setResult(104);
                this.A0D.A03();
                super.finish();
                return;
            }
        }
        this.A0D.A03();
        super.finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A0c((Runnable) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2.A01 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            X.A7R r0 = r3.A0E
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0012
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0F
            r0 = 5
        L_0x000e:
            r1.A0T(r0)
            return
        L_0x0012:
            X.A7R r2 = r3.A0E
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0026
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0F
            r0 = 1
            goto L_0x000e
        L_0x0026:
            X.10I r2 = r3.A05
            r1 = 45
            X.3Bs r0 = new X.3Bs
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.ui.ExportMigrationActivity.onResume():void");
    }

    public ExportMigrationActivity() {
        this(0);
    }
}
