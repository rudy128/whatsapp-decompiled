package com.whatsapp.migration.android.view;

import X.A8V;
import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VU;
import X.AnonymousClass73I;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BX;
import X.C108255bO;
import X.C108945cZ;
import X.C110885hR;
import X.C134126q5;
import X.C137116uw;
import X.C139916ze;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18070vi;
import X.C18150vq;
import X.C20296AFe;
import X.C20336AGs;
import X.C24291Jp;
import X.C27641Ww;
import X.C29401cD;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class GoogleMigrateImporterActivity extends AnonymousClass1FY implements C108255bO {
    public static final int A0C = 11;
    public static final int A0D = -1;
    public static final String A0E = "GoogleMigrateImporterActivity/";
    public static final String A0F = "com.whatsapp.migration.ACTION_OPENED_VIA_NOTIFICATION";
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public GoogleMigrateImporterViewModel A04;
    public View A05;
    public WaTextView A06;
    public WaTextView A07;
    public RoundCornerProgressBar A08;
    public WDSButton A09;
    public WDSButton A0A;
    public boolean A0B;

    public void BrZ(int i) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        boolean z;
        switch (i) {
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                AnonymousClass8BR.A0q(this.A04.A0C).A0H("google_migrate_recoverable_error", "google_migrate_attempt_to_skip_import");
                A0s(4, 2131891280, 2131891279, 2131891278, 2131890831);
                return;
            case 3:
                googleMigrateImporterViewModel = this.A04;
                z = false;
                break;
            case 4:
                googleMigrateImporterViewModel = this.A04;
                z = true;
                break;
            default:
                return;
        }
        googleMigrateImporterViewModel.A0X(z);
    }

    public void Bra(int i) {
    }

    public void Brb(int i) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        String str;
        boolean z = true;
        switch (i) {
            case 1:
                googleMigrateImporterViewModel = this.A04;
                z = false;
                break;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A0X(true);
                return;
            case 3:
            case 4:
                googleMigrateImporterViewModel = this.A04;
                break;
            default:
                return;
        }
        A8V A0q = AnonymousClass8BR.A0q(googleMigrateImporterViewModel.A0C);
        if (z) {
            str = "google_migrate_cancel_import_dialog";
        } else {
            str = "google_migrate_unrecoverable_error";
        }
        A0q.A0I(str, "google_migrate_confirm_skip_import");
        Context context = googleMigrateImporterViewModel.A06.A00;
        Log.i("GoogleMigrateService/cancelImport()");
        ((C139916ze) googleMigrateImporterViewModel.A0B.get()).A02(context, C108945cZ.A0G("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT"), GoogleMigrateService.class);
    }

    private void A0Q() {
        AGB.A00(this, 44);
    }

    public static void A0t(Context context) {
        AnonymousClass8BR.A07(context, GoogleMigrateImporterActivity.class).addFlags(335544320);
    }

    public static void A0v(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        View view;
        if (i == 100) {
            googleMigrateImporterActivity.A06.setVisibility(8);
            view = googleMigrateImporterActivity.A08;
        } else {
            RoundCornerProgressBar roundCornerProgressBar = googleMigrateImporterActivity.A08;
            if (i == -1) {
                roundCornerProgressBar.setVisibility(0);
                googleMigrateImporterActivity.A08.setProgress(0);
                googleMigrateImporterActivity.A06.setVisibility(0);
                googleMigrateImporterActivity.A06.setText(2131891797);
                return;
            } else if (i >= 0) {
                roundCornerProgressBar.setVisibility(0);
                googleMigrateImporterActivity.A08.setProgress(i);
                googleMigrateImporterActivity.A06.setVisibility(0);
                WaTextView waTextView = googleMigrateImporterActivity.A06;
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = AnonymousClass8BX.A0Z(googleMigrateImporterActivity.A00, i);
                AnonymousClass3MY.A0y(googleMigrateImporterActivity, waTextView, A1a, 2131890821);
                return;
            } else {
                roundCornerProgressBar.setVisibility(8);
                view = googleMigrateImporterActivity.A06;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        r12.A0r(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        r3.A0s(r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r6 = null;
        r8 = null;
        r9 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        r3.A14(r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0y(com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r12, java.lang.Integer r13) {
        /*
            if (r13 != 0) goto L_0x0008
            java.lang.String r0 = "GoogleMigrateImporterActivity/currentScreen is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0008:
            r0 = 2131890816(0x7f121280, float:1.9416334E38)
            r3 = r12
            java.lang.String r5 = r12.getString(r0)
            r1 = 7
            X.AlP r0 = new X.AlP
            r0.<init>(r12, r1)
            r1 = 0
            X.0vq r4 = new X.0vq
            r4.<init>(r1, r0)
            com.whatsapp.components.RoundCornerProgressBar r0 = r12.A08
            r2 = 8
            r0.setVisibility(r2)
            com.whatsapp.WaTextView r0 = r12.A06
            r0.setVisibility(r2)
            int r0 = r13.intValue()
            r7 = 0
            switch(r0) {
                case 0: goto L_0x0127;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0030;
                case 3: goto L_0x00d0;
                case 4: goto L_0x0030;
                case 5: goto L_0x00ab;
                case 6: goto L_0x009b;
                case 7: goto L_0x0084;
                case 8: goto L_0x0030;
                case 9: goto L_0x009b;
                case 10: goto L_0x0076;
                case 11: goto L_0x006f;
                case 12: goto L_0x0067;
                case 13: goto L_0x0058;
                case 14: goto L_0x0049;
                case 15: goto L_0x0044;
                case 16: goto L_0x003f;
                case 17: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            r6 = r1
            r8 = r1
            r9 = r1
            r10 = r1
        L_0x0034:
            r3.A14(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0038:
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r12.CNA(r0)
            goto L_0x0030
        L_0x003f:
            r2 = 7
            r0 = 2131888270(0x7f12088e, float:1.941117E38)
            goto L_0x006b
        L_0x0044:
            r2 = 6
            r0 = 2131890811(0x7f12127b, float:1.9416324E38)
            goto L_0x006b
        L_0x0049:
            r10 = 2131890830(0x7f12128e, float:1.9416363E38)
            r11 = 2131890810(0x7f12127a, float:1.9416322E38)
            r12 = 2131890814(0x7f12127e, float:1.941633E38)
            r13 = 2131890832(0x7f121290, float:1.9416367E38)
            r9 = 9
            goto L_0x00a6
        L_0x0058:
            r10 = 2131890813(0x7f12127d, float:1.9416328E38)
            r11 = 2131890812(0x7f12127c, float:1.9416326E38)
            r12 = 2131890814(0x7f12127e, float:1.941633E38)
            r13 = 2131890832(0x7f121290, float:1.9416367E38)
            r9 = 8
            goto L_0x00a6
        L_0x0067:
            r2 = 2
            r0 = 2131899070(0x7f1232be, float:1.9433076E38)
        L_0x006b:
            r12.A0r(r2, r0)
            goto L_0x0030
        L_0x006f:
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r2 = r12.A04
            r0 = 1
            r2.A0X(r0)
            goto L_0x0030
        L_0x0076:
            r10 = 2131891280(0x7f121450, float:1.9417276E38)
            r11 = 2131891279(0x7f12144f, float:1.9417274E38)
            r12 = 2131891278(0x7f12144e, float:1.9417272E38)
            r13 = 2131890831(0x7f12128f, float:1.9416365E38)
            r9 = 3
            goto L_0x00a6
        L_0x0084:
            r0 = 2131890817(0x7f121281, float:1.9416337E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r9 = r12.getString(r0)
            r0 = 2131890809(0x7f121279, float:1.941632E38)
            r12.CNA(r0)
            r8 = r1
            r10 = r1
            goto L_0x0034
        L_0x009b:
            r10 = 2131890835(0x7f121293, float:1.9416373E38)
            r11 = 2131890834(0x7f121292, float:1.941637E38)
            r12 = 2131890832(0x7f121290, float:1.9416367E38)
            r13 = -1
            r9 = 1
        L_0x00a6:
            r8 = r3
            r8.A0s(r9, r10, r11, r12, r13)
            goto L_0x0030
        L_0x00ab:
            r0 = 2131890819(0x7f121283, float:1.941634E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131899268(0x7f123384, float:1.9433477E38)
            java.lang.String r8 = r12.getString(r0)
            r2 = 9
            X.AlP r0 = new X.AlP
            r0.<init>(r12, r2)
            X.0vq r4 = new X.0vq
            r4.<init>(r1, r0)
            r0 = 2131886230(0x7f120096, float:1.9407033E38)
            java.lang.String r10 = r12.getString(r0)
            r6 = r1
            r9 = r1
            goto L_0x0034
        L_0x00d0:
            r0 = 2131890817(0x7f121281, float:1.9416337E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r9 = r12.getString(r0)
            com.whatsapp.components.RoundCornerProgressBar r2 = r12.A08
            r0 = 0
            r2.setVisibility(r0)
            r12.CEx()
            r0 = 2131886231(0x7f120097, float:1.9407035E38)
            java.lang.String r10 = r12.getString(r0)
            r8 = r1
            goto L_0x0034
        L_0x00f1:
            r0 = 2131890829(0x7f12128d, float:1.941636E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131890818(0x7f121282, float:1.9416339E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131890820(0x7f121284, float:1.9416343E38)
            java.lang.String r7 = r12.getString(r0)
            r0 = 2131890833(0x7f121291, float:1.9416369E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131890815(0x7f12127f, float:1.9416332E38)
            java.lang.String r9 = r12.getString(r0)
            X.AlP r0 = new X.AlP
            r0.<init>(r12, r2)
            X.0vq r4 = new X.0vq
            r4.<init>(r1, r0)
            r0 = 2131886232(0x7f120098, float:1.9407037E38)
            java.lang.String r10 = r12.getString(r0)
            goto L_0x0034
        L_0x0127:
            r0 = 2131890818(0x7f121282, float:1.9416339E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131890820(0x7f121284, float:1.9416343E38)
            java.lang.String r7 = r12.getString(r0)
            r0 = 2131890833(0x7f121291, float:1.9416369E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131886233(0x7f120099, float:1.940704E38)
            java.lang.String r10 = r12.getString(r0)
            r9 = r1
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A0y(com.whatsapp.migration.android.view.GoogleMigrateImporterActivity, java.lang.Integer):void");
    }

    public static void A10(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        if (!z) {
            googleMigrateImporterActivity.A0s(5, 2131888272, 2131892242, 2131899286, -1);
        }
    }

    public static void A11(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        int i;
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                i = 2131894414;
            } else {
                i = 2131894416;
                if (i2 < 33) {
                    i = 2131894415;
                }
            }
            C18070vi.A0d(googleMigrateImporterActivity, 0);
            if (!googleMigrateImporterActivity.isFinishing()) {
                C134126q5 r2 = new C134126q5(googleMigrateImporterActivity);
                r2.A09 = new int[]{2131231832, 2131231658, 2131231920};
                ArrayList A13 = AnonymousClass000.A13();
                A13.add("android.permission.GET_ACCOUNTS");
                A13.add("android.permission.READ_CONTACTS");
                A13.add("android.permission.WRITE_CONTACTS");
                C29401cD.A0L(A13, AnonymousClass73I.A04());
                r2.A01(C17890vO.A1b(A13, 0));
                r2.A02 = 2131894413;
                r2.A0A = null;
                r2.A03 = i;
                r2.A08 = null;
                r2.A06 = false;
                googleMigrateImporterActivity.startActivityForResult(r2.A00(), 11);
            }
        }
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
        }
    }

    public GoogleMigrateImporterActivity(int i) {
        this.A0B = false;
        A0Q();
    }

    public static C24291Jp A03(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        C24291Jp A002 = C24291Jp.A00((Resources.Theme) null, googleMigrateImporterActivity.getResources(), i);
        C17960vV.A08(A002, AnonymousClass001.A1I("GoogleMigrateImporterActivity/getVectorDrawable/drawableId is invalid/drawableId = ", AnonymousClass000.A10(), i));
        return A002;
    }

    public static /* synthetic */ void A0V() {
    }

    public static /* synthetic */ void A0c() {
    }

    public static /* synthetic */ void A0d() {
    }

    public static /* synthetic */ void A0q() {
    }

    private void A0r(int i, int i2) {
        A0s(i, 2131890830, i2, 2131895332, 2131890832);
    }

    private void A0s(int i, int i2, int i3, int i4, int i5) {
        String string;
        String string2;
        String num = Integer.toString(i);
        if (getSupportFragmentManager().A0Q(num) != null) {
            C17900vP.A0f("GoogleMigrateImporterActivity/showDialog/dialog is already shown/dialogId = ", num, AnonymousClass000.A10());
            return;
        }
        AnonymousClass4VU r5 = new AnonymousClass4VU(i);
        String str = null;
        if (i2 == -1) {
            string = null;
        } else {
            string = getString(i2);
        }
        r5.A00.putString("title", string);
        AnonymousClass8BS.A12(this, r5, i3);
        r5.A05(false);
        if (i4 == -1) {
            string2 = null;
        } else {
            string2 = getString(i4);
        }
        r5.A04(string2);
        if (i5 != -1) {
            str = getString(i5);
        }
        r5.A03(str);
        CMk(r5.A00(), num);
    }

    public static void A0u(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        String str;
        googleMigrateImporterActivity.setResult(i);
        if (googleMigrateImporterActivity.getIntent() != null && A0F.equals(googleMigrateImporterActivity.getIntent().getAction())) {
            Intent className = C17880vN.A0A().setClassName(googleMigrateImporterActivity.getPackageName(), "com.whatsapp.registration.RegisterName");
            if (i == 2) {
                str = "google_migrate_import_canceled";
            } else {
                if (i == 1) {
                    str = "google_migrate_import_success";
                }
                googleMigrateImporterActivity.startActivity(className);
            }
            className.putExtra(str, true);
            googleMigrateImporterActivity.startActivity(className);
        }
        googleMigrateImporterActivity.finish();
    }

    private void A14(C18150vq r8, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
            this.A01.setImageDrawable((Drawable) r8.get());
            if (str6 != null) {
                this.A01.setFocusable(true);
            }
            this.A01.setContentDescription(str6);
            WaTextView waTextView = this.A02;
            int i = 0;
            int i2 = 8;
            if (str2 != null) {
                i2 = 0;
            }
            waTextView.setVisibility(i2);
            WaTextView waTextView2 = this.A07;
            int i3 = 8;
            if (str3 != null) {
                i3 = 0;
            }
            waTextView2.setVisibility(i3);
            WDSButton wDSButton = this.A09;
            int i4 = 8;
            if (str4 != null) {
                i4 = 0;
            }
            wDSButton.setVisibility(i4);
            WDSButton wDSButton2 = this.A0A;
            if (str5 == null) {
                i = 8;
            }
            wDSButton2.setVisibility(i);
            boolean isEmpty = TextUtils.isEmpty(str5);
            Resources resources = getResources();
            int i5 = 2131169564;
            if (isEmpty) {
                i5 = 2131169584;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i5);
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this.A09);
            C27641Ww.A06(this.A09, this.A00, A0B2.leftMargin, A0B2.topMargin, A0B2.rightMargin, dimensionPixelSize);
            this.A03.setText(str);
            this.A02.setText(str2);
            this.A07.setText(str3);
            this.A09.setText(str4);
            this.A0A.setText(str5);
        }
    }

    public /* synthetic */ void A4b() {
        A03(this, 2131233504);
    }

    public /* synthetic */ void A4c() {
        A03(this, 2131233502);
    }

    public /* synthetic */ void A4d() {
        A03(this, 2131233503);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A04;
            if (googleMigrateImporterViewModel.A08.A0G()) {
                Log.i("GoogleMigrateImporterViewModel/onPermissionGranted/import already successfully finished, skipping import again");
                return;
            }
            AnonymousClass8BR.A0q(googleMigrateImporterViewModel.A0C).A0I("google_migrate_permission", "google_migrate_accepted_permission");
            googleMigrateImporterViewModel.A0U();
            return;
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel2 = this.A04;
        boolean A0G = googleMigrateImporterViewModel2.A07.A0G();
        boolean A1W = C72463Mc.A1W(googleMigrateImporterViewModel2.A0A);
        if (!A0G) {
            if (!A1W) {
                str = "google_migrate_rejected_contact_and_storage_permission";
            } else {
                str = "google_migrate_rejected_storage_permission";
            }
        } else if (!A1W) {
            str = "google_migrate_rejected_contact_permission";
        } else {
            str = "unknown";
        }
        AnonymousClass8BR.A0q(googleMigrateImporterViewModel2.A0C).A0I("google_migrate_permission", str);
        googleMigrateImporterViewModel2.A0V(1);
    }

    public void onBackPressed() {
        AnonymousClass1L9.A02(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625467);
        this.A03 = (WaTextView) C110885hR.A0A(this, 2131431191);
        this.A02 = (WaTextView) C110885hR.A0A(this, 2131431190);
        this.A07 = (WaTextView) C110885hR.A0A(this, 2131431192);
        this.A09 = (WDSButton) C110885hR.A0A(this, 2131431186);
        this.A0A = (WDSButton) C110885hR.A0A(this, 2131431189);
        this.A01 = (WaImageView) C110885hR.A0A(this, 2131431184);
        this.A08 = (RoundCornerProgressBar) C110885hR.A0A(this, 2131431187);
        this.A06 = (WaTextView) C110885hR.A0A(this, 2131431188);
        View findViewById = findViewById(2131431185);
        this.A05 = findViewById;
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) AnonymousClass3MW.A0N(this).A00(GoogleMigrateImporterViewModel.class);
        this.A04 = googleMigrateImporterViewModel;
        C20336AGs.A00(this, googleMigrateImporterViewModel.A01, 8);
        C20336AGs.A00(this, this.A04.A03, 9);
        C20336AGs.A00(this, this.A04.A00, 10);
        C20336AGs.A00(this, this.A04.A04, 11);
        C20336AGs.A00(this, this.A04.A02, 12);
        AnonymousClass3Ma.A1D(this.A09, this, 12);
        AnonymousClass3Ma.A1D(this.A0A, this, 13);
    }

    public void onDestroy() {
        super.onDestroy();
        CEx();
    }

    public GoogleMigrateImporterActivity() {
        this(0);
        this.A00 = new C20296AFe(this, 3);
    }
}
