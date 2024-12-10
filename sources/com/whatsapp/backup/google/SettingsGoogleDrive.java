package com.whatsapp.backup.google;

import X.A1Q;
import X.A3f;
import X.A9Q;
import X.AFU;
import X.AGB;
import X.ARB;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11Z;
import X.AnonymousClass18K;
import X.AnonymousClass19K;
import X.AnonymousClass1Ez;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1NM;
import X.AnonymousClass1NP;
import X.AnonymousClass1NT;
import X.AnonymousClass1NW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4A9;
import X.AnonymousClass4VU;
import X.AnonymousClass4XT;
import X.AnonymousClass4Yv;
import X.AnonymousClass74O;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass9PD;
import X.C000200d;
import X.C107885am;
import X.C108255bO;
import X.C108955ca;
import X.C137116uw;
import X.C143707Em;
import X.C1600586y;
import X.C171828sL;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C192369oH;
import X.C195779tt;
import X.C196239ug;
import X.C196349ut;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C20113A7w;
import X.C20134A8u;
import X.C20441ALe;
import X.C21055Adl;
import X.C21424Ajr;
import X.C21453AkK;
import X.C21455AkM;
import X.C21459AkQ;
import X.C22654BId;
import X.C23501Gn;
import X.C25081Mu;
import X.C27341Vs;
import X.C27431Wb;
import X.C28931bI;
import X.C34001jj;
import X.C36801oU;
import X.C36841oY;
import X.C36861oa;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaLinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.banners.WDSBanner;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public class SettingsGoogleDrive extends AnonymousClass1FY implements C107885am, C108255bO {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public View.OnClickListener A05;
    public ImageView A06;
    public ImageView A07;
    public ProgressBar A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public C19880zA A0E;
    public TextEmojiLabel A0F;
    public WaLinearLayout A0G;
    public WaTextView A0H;
    public AnonymousClass1NW A0I;
    public C27341Vs A0J;
    public AnonymousClass1NT A0K;
    public C36801oU A0L;
    public C196239ug A0M;
    public C36841oY A0N;
    public C36861oa A0O;
    public SettingsGoogleDriveViewModel A0P;
    public AnonymousClass1NM A0Q;
    public AnonymousClass118 A0R;
    public A1Q A0S;
    public C27431Wb A0T;
    public AnonymousClass18K A0U;
    public C28931bI A0V;
    public WDSBanner A0W;
    public WDSButton A0X;
    public WDSListItem A0Y;
    public WDSListItem A0Z;
    public WDSListItem A0a;
    public WDSListItem A0b;
    public WDSListItem A0c;
    public WDSSwitch A0d;
    public WDSSwitch A0e;
    public AnonymousClass19K A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public String[] A0o;
    public C20441ALe A0p;
    public C1600586y A0q;
    public boolean A0r;
    public boolean A0s;
    public final ConditionVariable A0t;
    public final C23501Gn A0u;
    public volatile boolean A0v;

    private void A0Q() {
        C21455AkM.A00(this.A05, this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new Hilt_SettingsGoogleDrive_AuthRequestDialogFragment(), 15);
    }

    public static void A0q(SettingsGoogleDrive settingsGoogleDrive) {
        SettingsGoogleDrive settingsGoogleDrive2 = settingsGoogleDrive;
        AnonymousClass1NM r0 = settingsGoogleDrive.A0Q;
        C23501Gn r1 = settingsGoogleDrive.A0u;
        if (r0.A04(r1) && settingsGoogleDrive.A0Q.A03(r1)) {
            settingsGoogleDrive.A0M.A05(10);
            settingsGoogleDrive.A0P.A05.A0E(false);
            settingsGoogleDrive.A0P.A0B.A0E(false);
            C171828sL r12 = new C171828sL();
            r12.A0J = C108955ca.A0m();
            r12.A09 = 0;
            r12.A04 = C17880vN.A0h();
            A1Q a1q = settingsGoogleDrive.A0S;
            C18000vb r8 = settingsGoogleDrive.A00;
            C27341Vs r7 = settingsGoogleDrive.A0J;
            SettingsGoogleDrive settingsGoogleDrive3 = settingsGoogleDrive2;
            a1q.A01(new ARB(settingsGoogleDrive2, settingsGoogleDrive3, settingsGoogleDrive.A0I, r7, r8, (AnonymousClass11Z) settingsGoogleDrive.A0C.get(), a1q, new C21055Adl(settingsGoogleDrive2, r12, 0)), r12, 0);
        }
    }

    public static void A0s(SettingsGoogleDrive settingsGoogleDrive) {
        SettingsGoogleDrive settingsGoogleDrive2 = settingsGoogleDrive;
        settingsGoogleDrive.A0M.A05(10);
        C18030ve r7 = settingsGoogleDrive.A0E;
        settingsGoogleDrive2.A0n.get();
        C20134A8u.A04(settingsGoogleDrive2, AnonymousClass8BR.A0D(settingsGoogleDrive2.A0f), AnonymousClass8BT.A0C(settingsGoogleDrive2), settingsGoogleDrive2.A0K, settingsGoogleDrive2.A0A, r7);
    }

    public static void A0v(SettingsGoogleDrive settingsGoogleDrive, String str, String str2, int i, boolean z) {
        CharSequence A0q2;
        Spanned spanned;
        SettingsGoogleDrive settingsGoogleDrive2 = settingsGoogleDrive;
        if (i == 1) {
            AnonymousClass4XT r4 = new AnonymousClass4XT();
            r4.A02 = AnonymousClass4A9.A00;
            settingsGoogleDrive.A0W.setClickable(AnonymousClass000.A1W(settingsGoogleDrive.A02));
            settingsGoogleDrive.A0W.setOnClickListener(settingsGoogleDrive.A02);
            if (!TextUtils.isEmpty(str2)) {
                A0q2 = Html.fromHtml(str2);
            } else {
                A0q2 = AnonymousClass8BV.A0q(settingsGoogleDrive, new Object[1], 2131886911, 0, 2131890683);
            }
            r4.A03 = A0q2;
            if (!TextUtils.isEmpty(str)) {
                spanned = Html.fromHtml(str);
            } else {
                spanned = null;
            }
            r4.A04 = spanned;
            if (z) {
                r4.A05 = true;
                settingsGoogleDrive.A0W.setOnDismissListener((View.OnClickListener) new AFU((Object) settingsGoogleDrive, 11));
            } else {
                r4.A05 = false;
            }
            settingsGoogleDrive.A0W.setState(r4.A01());
            settingsGoogleDrive.A0W.setVisibility(0);
        } else if (i == 3) {
            AnonymousClass9PD.A00(settingsGoogleDrive.A0A, settingsGoogleDrive.A0W, settingsGoogleDrive.A0g);
        } else if (i != 4) {
            settingsGoogleDrive.A0W.setVisibility(8);
        } else {
            C20441ALe aLe = settingsGoogleDrive.A0p;
            if (aLe == null) {
                C18030ve r14 = settingsGoogleDrive.A0E;
                AnonymousClass18K r15 = settingsGoogleDrive.A0U;
                AnonymousClass1L9 r8 = settingsGoogleDrive.A01;
                C18000vb r13 = settingsGoogleDrive.A00;
                C19830z4 r12 = settingsGoogleDrive.A0A;
                aLe = new C20441ALe(settingsGoogleDrive2, settingsGoogleDrive2.A0W, r8, (C22654BId) null, AnonymousClass8BT.A0C(settingsGoogleDrive2), (C192369oH) settingsGoogleDrive2.A0i.get(), r12, r13, r14, r15, 1);
                settingsGoogleDrive2.A0p = aLe;
            }
            aLe.A01();
        }
    }

    public void onDestroy() {
        this.A0r = true;
        this.A0P.A0f.set(false);
        unbindService(this.A0P.A00);
        super.onDestroy();
    }

    public class AuthRequestDialogFragment extends Hilt_SettingsGoogleDrive_AuthRequestDialogFragment {
        public Dialog A27(Bundle bundle) {
            ProgressDialog progressDialog = new ProgressDialog(A14());
            progressDialog.setTitle(2131895854);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage(A1H(2131895853));
            progressDialog.setCancelable(true);
            progressDialog.setOnCancelListener(new A9Q(this, 5));
            return progressDialog;
        }
    }

    public static int A03(SettingsGoogleDrive settingsGoogleDrive, boolean z) {
        if (z) {
            return 1;
        }
        C192369oH r5 = (C192369oH) settingsGoogleDrive.A0i.get();
        int A022 = AnonymousClass8BV.A02(r5.A02);
        if (!(A022 == 0 || A022 == 4)) {
            C19830z4 r1 = r5.A00;
            if (!(r1.A0U(r1.A0f()) == 0 || r5.A00() == 0)) {
                return 4;
            }
        }
        if (!AnonymousClass8BV.A1S(settingsGoogleDrive.A0g) || C17880vN.A1W(C72453Mb.A0M(settingsGoogleDrive), "backup_warning_shown")) {
            return 0;
        }
        return 3;
    }

    public static void A0V(View view, int i) {
        if (view == null) {
            C17960vV.A0F(AnonymousClass000.A1O(i), "settings-gdrive/view is null");
        } else if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public static void A0d(SettingsGoogleDrive settingsGoogleDrive) {
        Log.i("settings-gdrive/cancel-backup");
        AnonymousClass3MY.A1M(settingsGoogleDrive.A0P.A09, false);
        settingsGoogleDrive.A0M.A04();
        C18030ve r3 = settingsGoogleDrive.A0E;
        AnonymousClass00H r0 = C20134A8u.A00;
        if (C18020vd.A05(C18040vf.A02, r3, 603)) {
            try {
                Iterator A13 = AnonymousClass8BR.A13(AnonymousClass8BR.A0D(settingsGoogleDrive.A0f).A04("com.whatsapp.backup.google.google-backup-worker").get());
                while (A13.hasNext()) {
                    if (!C196349ut.A01(((C195779tt) A13.next()).A02)) {
                        AnonymousClass8BR.A0D(settingsGoogleDrive.A0f).A0A("com.whatsapp.backup.google.google-backup-worker");
                        return;
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
                Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
            }
        }
    }

    public static void A0t(SettingsGoogleDrive settingsGoogleDrive, int i) {
        TextView textView = settingsGoogleDrive.A0B;
        int i2 = 8;
        if (i == 13) {
            textView.setText(2131886957);
            textView = settingsGoogleDrive.A0B;
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    public static void A0u(SettingsGoogleDrive settingsGoogleDrive, String str, String str2) {
        settingsGoogleDrive.A0t.open();
        AnonymousClass8BY.A0j(settingsGoogleDrive);
        if (str != null) {
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = settingsGoogleDrive.A0P;
            C19830z4 r1 = settingsGoogleDriveViewModel.A0Y;
            if (!TextUtils.equals(r1.A0f(), str2)) {
                r1.A1Z(str2);
                AnonymousClass8BS.A0A(settingsGoogleDriveViewModel.A0d).A0F(10);
                AnonymousClass3MX.A1J(settingsGoogleDriveViewModel.A0D, 10);
                C196239ug r2 = settingsGoogleDriveViewModel.A0S;
                synchronized (r2.A0D) {
                    r2.A00 = null;
                }
                AnonymousClass8BY.A1H("gdrive-setting-view-model/update-account-name new accountName is ", str2, AnonymousClass000.A10());
                settingsGoogleDriveViewModel.A02.A0F(str2);
                settingsGoogleDriveViewModel.A0U();
                if (!C18020vd.A05(C18040vf.A02, settingsGoogleDriveViewModel.A0a, 11593)) {
                    settingsGoogleDriveViewModel.A0O.A0E((Object) null);
                } else {
                    C21424Ajr.A00(settingsGoogleDriveViewModel.A0c, settingsGoogleDriveViewModel, 9);
                }
                settingsGoogleDrive.A0n.get();
                Intent A1M = AnonymousClass1LU.A1M(settingsGoogleDrive, "action_fetch_backup_info");
                A1M.putExtra("account_name", str2);
                C25081Mu.A00(settingsGoogleDrive, A1M);
            } else {
                AnonymousClass8BY.A1H("gdrive-setting-view-model/update-account-name account unchanged, token received for ", str2, AnonymousClass000.A10());
            }
        }
        C21424Ajr.A00(settingsGoogleDrive.A05, settingsGoogleDrive, 6);
    }

    public void A2y() {
        if (!this.A0s) {
            this.A0s = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A0R = AnonymousClass3MZ.A0l(r1);
            this.A0n = AnonymousClass3MW.A0s(r1);
            this.A0U = AnonymousClass3Ma.A0g(r1);
            this.A0E = C19890zB.A00;
            this.A0l = C000200d.A00(r1.A5j);
            this.A0f = (AnonymousClass19K) r1.AC4.get();
            this.A0K = (AnonymousClass1NT) r1.A3f.get();
            this.A0J = (C27341Vs) r1.A0i.get();
            this.A0Q = (AnonymousClass1NM) r1.A6D.get();
            this.A0S = (A1Q) r1.AXQ.get();
            this.A0T = (C27431Wb) r1.A6f.get();
            this.A0m = C000200d.A00(A002.A5o);
            this.A0j = C000200d.A00(r1.A2b);
            this.A0M = (C196239ug) r1.A4d.get();
            this.A0g = AnonymousClass8BT.A0g(r1);
            this.A0I = (AnonymousClass1NW) r1.A0h.get();
            this.A0k = AnonymousClass8BT.A0f(r1);
            this.A0h = C000200d.A00(r1.A0j);
            this.A0i = C000200d.A00(r2.A0J);
            this.A0L = (C36801oU) r1.A4c.get();
            this.A0O = (C36861oa) r1.A4g.get();
            this.A0N = (C36841oY) r1.A4f.get();
        }
    }

    public /* synthetic */ void A4b() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            i = 2131894466;
        } else {
            i = 2131894467;
            if (i2 < 33) {
                i = 2131894469;
            }
        }
        AnonymousClass74O.A08(this, i, 2131894468);
    }

    public void C5j(String[] strArr, int i, int i2) {
        if (i == 10) {
            int[] iArr = SettingsGoogleDriveViewModel.A0h;
            StringBuilder A10 = AnonymousClass000.A10();
            if (i2 > 5) {
                C17900vP.A0i("settings-gdrive/change-freq/unexpected-choice/", A10, i2);
                return;
            }
            A10.append("settings-gdrive/change-freq/index:");
            A10.append(i2);
            A10.append("/value:");
            C17900vP.A0o(A10, iArr[i2]);
            int A022 = AnonymousClass8BV.A02(this.A0h);
            int i3 = iArr[i2];
            this.A0P.A0V(i3);
            if (i3 == 0) {
                AnonymousClass8BT.A0C(this).A0F(10);
                A0t(this, 10);
                this.A0W.setVisibility(8);
                if (C17890vO.A0B(this.A0A).getLong("gdrive_next_prompt_for_setup_timestamp", -1) < System.currentTimeMillis() + 2592000000L) {
                    this.A0A.A1K(System.currentTimeMillis() + 2592000000L);
                }
            } else if (A022 == 0) {
                if (this.A0W.getVisibility() != 0) {
                    int A023 = AnonymousClass8BT.A0C(this).A02();
                    A0v(this, (String) null, (String) null, A03(this, AnonymousClass000.A1S(A023, 10)), true);
                    A0t(this, A023);
                }
                AnonymousClass1NP A0C2 = AnonymousClass8BT.A0C(this);
                AnonymousClass00H r0 = C20134A8u.A00;
                if (!C17890vO.A1R(A0C2.A05()) && !AnonymousClass8BW.A1T(this.A0h) && TextUtils.isEmpty(AnonymousClass8BR.A0z(this))) {
                    this.A0Y.performClick();
                }
            }
        } else if (i != 17) {
            throw AnonymousClass8BX.A0W("unexpected dialog box: ", AnonymousClass000.A10(), i);
        } else if (strArr[i2].equals(getString(2131890787))) {
            A0Q();
        } else {
            A0w(strArr[i2]);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return A3f.A01(this);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        this.A0C.get();
        return A3f.A00(this);
    }

    public void onPause() {
        AnonymousClass1NM r0 = this.A0Q;
        C1600586y r1 = this.A0q;
        if (r1 != null) {
            r0.A02.remove(r1);
        }
        super.onPause();
    }

    public SettingsGoogleDrive(int i) {
        this.A0s = false;
        AGB.A00(this, 14);
    }

    public static void A0c(AuthRequestDialogFragment authRequestDialogFragment, SettingsGoogleDrive settingsGoogleDrive, String str) {
        C17960vV.A00();
        AnonymousClass8BY.A1H("settings-gdrive/auth-request account being used is ", str, AnonymousClass000.A10());
        settingsGoogleDrive.A0v = false;
        C21453AkK.A01(settingsGoogleDrive.A05, settingsGoogleDrive, authRequestDialogFragment, 23);
        ConditionVariable conditionVariable = settingsGoogleDrive.A0t;
        conditionVariable.close();
        C21459AkQ.A01(settingsGoogleDrive.A05, settingsGoogleDrive, authRequestDialogFragment, str, 20);
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        AnonymousClass1Ez r2 = new AnonymousClass1Ez("settings-gdrive/fetch-auth-token");
        conditionVariable.block(C20113A7w.A0L);
        C21453AkK.A01(settingsGoogleDrive.A05, settingsGoogleDrive, r2, 24);
    }

    public static void A0r(SettingsGoogleDrive settingsGoogleDrive) {
        int i;
        C17960vV.A02();
        if (!A0x(settingsGoogleDrive)) {
            AnonymousClass1NP A0C2 = AnonymousClass8BT.A0C(settingsGoogleDrive);
            AnonymousClass00H r0 = C20134A8u.A00;
            if (C17890vO.A1R(A0C2.A05())) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i = 2131895885;
            } else if (AnonymousClass8BW.A1T(settingsGoogleDrive.A0h)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i = 2131895889;
            } else {
                int i2 = 0;
                if (!settingsGoogleDrive.A0I.A01()) {
                    settingsGoogleDrive.A0n.get();
                    AnonymousClass8BY.A0v(settingsGoogleDrive);
                    return;
                }
                String A0z = AnonymousClass8BR.A0z(settingsGoogleDrive);
                Account[] accountsByType = AccountManager.get(settingsGoogleDrive).getAccountsByType("com.google");
                int length = accountsByType.length;
                if (length > 0) {
                    C17900vP.A0j("settings-gdrive/account-selector/starting-account-picker/num-accounts/", AnonymousClass000.A10(), length);
                    int i3 = length + 1;
                    String[] strArr = new String[i3];
                    int i4 = -1;
                    do {
                        String str = accountsByType[i2].name;
                        strArr[i2] = str;
                        if (A0z != null && A0z.equals(str)) {
                            i4 = i2;
                        }
                        i2++;
                    } while (i2 < length);
                    strArr[i3 - 1] = settingsGoogleDrive.getString(2131890787);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A092 = AnonymousClass8BY.A09(settingsGoogleDrive);
                    A092.putInt("selected_item_index", i4);
                    A092.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A1R(A092);
                    if (settingsGoogleDrive.getSupportFragmentManager().A0Q("account-picker") == null) {
                        C34001jj A0H2 = AnonymousClass3Ma.A0H(settingsGoogleDrive);
                        A0H2.A0B(singleChoiceListDialogFragment, "account-picker");
                        A0H2.A00(true);
                        return;
                    }
                    return;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                settingsGoogleDrive.A0Q();
                return;
            }
            settingsGoogleDrive.BhQ(i);
        }
    }

    private void A0w(String str) {
        AnonymousClass8BY.A1H("setting-gdrive/activity-result/account-picker accountName is ", str, AnonymousClass000.A10());
        if (str != null) {
            C21459AkQ.A01(this.A05, this, new Hilt_SettingsGoogleDrive_AuthRequestDialogFragment(), str, 22);
        } else if (AnonymousClass8BR.A0z(this) == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            this.A0P.A0V(0);
        }
    }

    public static boolean A0x(SettingsGoogleDrive settingsGoogleDrive) {
        if (AnonymousClass4Yv.A02(settingsGoogleDrive) || settingsGoogleDrive.A0r) {
            return true;
        }
        return false;
    }

    public void BrZ(int i) {
        String str;
        switch (i) {
            case 12:
                str = "settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel";
                break;
            case 13:
                str = "settings-gdrive/perform-backup user declined to perform Google storage backup over cellular (when the settings say Wi-Fi only)";
                break;
            case 15:
                str = "settings-gdrive/user-declined-to-restore-media-over-cellular";
                break;
            case 16:
                str = "settings-gdrive/user-declined-to-backup-over-cellular";
                break;
            case 18:
                str = "settings-gdrive/user-declined-to-cancel-encrypted-backup";
                break;
            default:
                throw AnonymousClass8BX.A0W("unexpected dialog box: ", AnonymousClass000.A10(), i);
        }
        Log.i(str);
    }

    public void Bra(int i) {
        throw AnonymousClass8BX.A0W("unexpected dialog box: ", AnonymousClass000.A10(), i);
    }

    public void Brb(int i) {
        switch (i) {
            case 12:
                this.A0M.A04();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google storage backup over cellular (when the settings say Wi-Fi only)");
                this.A0L.A03();
                A0s(this);
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0P.A0V(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0L.A04();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0L.A03();
                return;
            case 18:
                Log.i("settings-gdrive/user-confirmed-cancel-encrypted-backup");
                A0d(this);
                return;
            default:
                throw AnonymousClass8BX.A0W("unexpected dialog box: ", AnonymousClass000.A10(), i);
        }
    }

    public void Brp(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("settings-gdrive/dialogId-");
        A10.append(i);
        C17890vO.A1A(A10, "-dismissed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (X.C17890vO.A1R(r1.A05()) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "settings-gdrive/activity-result request: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " result: "
            X.C17900vP.A0j(r0, r1, r8)
            super.onActivityResult(r7, r8, r9)
            r3 = -1
            if (r7 == 0) goto L_0x0064
            r0 = 1
            java.lang.String r2 = "authAccount"
            if (r7 == r0) goto L_0x0104
            r0 = 2
            if (r7 == r0) goto L_0x00f4
            r0 = 150(0x96, float:2.1E-43)
            if (r7 == r0) goto L_0x005e
            r0 = 151(0x97, float:2.12E-43)
            if (r7 != r0) goto L_0x005d
            if (r8 != r3) goto L_0x005d
            X.1NP r0 = X.AnonymousClass8BT.A0C(r6)
            int r1 = r0.A02()
            r0 = 23
            if (r1 != r0) goto L_0x003c
            X.9ug r1 = r6.A0M
            r0 = 10
            r1.A05(r0)
        L_0x003c:
            X.00H r0 = r6.A0h
            boolean r0 = X.AnonymousClass8BW.A1T(r0)
            if (r0 != 0) goto L_0x0054
            X.1NP r1 = X.AnonymousClass8BT.A0C(r6)
            X.00H r0 = X.C20134A8u.A00
            int r0 = r1.A05()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 == 0) goto L_0x00f0
        L_0x0054:
            X.1oU r2 = r6.A0L
            X.10I r1 = r2.A0L
            r0 = 25
            X.C21457AkO.A01(r1, r2, r0)
        L_0x005d:
            return
        L_0x005e:
            if (r8 != r3) goto L_0x005d
            A0r(r6)
            return
        L_0x0064:
            if (r8 != r3) goto L_0x005d
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r6.A0P
            X.1DT r1 = r0.A0A
            X.1NT r0 = r0.A0Q
            boolean r0 = r0.A04()
            X.AnonymousClass3MY.A1L(r1, r0)
            java.lang.String r5 = X.AnonymousClass8BR.A0z(r6)
            if (r5 == 0) goto L_0x00d3
            X.0z4 r0 = r6.A0A
            long r3 = r0.A0V(r5)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d3
            X.0z4 r0 = r6.A0A
            boolean r0 = r0.A2Z(r5)
            if (r0 == 0) goto L_0x00dc
            X.1NP r0 = X.AnonymousClass8BT.A0C(r6)
            X.2Qv r1 = r0.A08()
            X.2Qv r0 = X.C49532Qv.UNENCRYPTED
            if (r1 != r0) goto L_0x00dc
            X.11S r0 = r6.A02
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)
            if (r3 == 0) goto L_0x005d
            X.8gU r1 = new X.8gU
            r1.<init>(r6, r5)
            X.1oY r0 = r6.A0N
            r0.A01(r1)
            X.00H r0 = r6.A0n
            r0.get()
            java.lang.String r0 = "action_delete"
            android.content.Intent r2 = X.AnonymousClass1LU.A1M(r6, r0)
            java.lang.String r1 = X.AnonymousClass8BR.A0z(r6)
            java.lang.String r0 = "account_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "jid_user"
            java.lang.String r0 = r3.user
            r2.putExtra(r1, r0)
            X.10I r3 = r6.A05
            r0 = 22
            X.AkK r1 = new X.AkK
            r1.<init>(r6, r2, r0)
        L_0x00cf:
            r3.CGF(r1)
            return
        L_0x00d3:
            X.10I r3 = r6.A05
            r0 = 0
            X.Ajr r1 = new X.Ajr
            r1.<init>(r6, r0)
            goto L_0x00cf
        L_0x00dc:
            X.0z4 r0 = r6.A0A
            boolean r0 = r0.A2Z(r5)
            if (r0 != 0) goto L_0x005d
            X.1NP r0 = X.AnonymousClass8BT.A0C(r6)
            X.2Qv r1 = r0.A08()
            X.2Qv r0 = X.C49532Qv.UNENCRYPTED
            if (r1 == r0) goto L_0x005d
        L_0x00f0:
            A0q(r6)
            return
        L_0x00f4:
            r1 = 0
            if (r9 == 0) goto L_0x0102
            java.lang.String r0 = r9.getStringExtra(r2)
        L_0x00fb:
            if (r8 != r3) goto L_0x00fe
            r1 = r0
        L_0x00fe:
            r6.A0w(r1)
            return
        L_0x0102:
            r0 = r1
            goto L_0x00fb
        L_0x0104:
            if (r8 != r3) goto L_0x0117
            X.C17960vV.A07(r9)
            java.lang.String r0 = "authtoken"
            java.lang.String r1 = r9.getStringExtra(r0)
            java.lang.String r0 = r9.getStringExtra(r2)
            A0u(r6, r1, r0)
            return
        L_0x0117:
            X.AnonymousClass8BY.A0j(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.SettingsGoogleDrive.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            this.A0n.get();
            startActivity(AnonymousClass1LU.A0A(this));
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a5, code lost:
        if (r3 != 4) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007d, code lost:
        if (X.AnonymousClass8BW.A1T(r7) != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            X.1It r1 = X.AnonymousClass3MW.A0N(r10)
            java.lang.Class<com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel> r0 = com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel.class
            X.1J2 r9 = r1.A00(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r9 = (com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r9
            r10.A0P = r9
            android.os.Bundle r8 = X.AnonymousClass3MY.A09(r10)
            X.11E r0 = r9.A0X
            r0.registerObserver(r9)
            X.1DT r1 = r9.A0F
            X.00H r7 = r9.A0d
            X.1NP r0 = X.AnonymousClass8BS.A0A(r7)
            boolean r0 = r0.A0P()
            X.AnonymousClass3MY.A1L(r1, r0)
            X.0z4 r6 = r9.A0Y
            java.lang.String r5 = r6.A0f()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -1
            if (r0 != 0) goto L_0x0059
            android.content.SharedPreferences r4 = X.C17890vO.A0B(r6)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive_last_successful_backup_video_size:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r3)
            long r2 = r4.getLong(r0, r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            X.1DT r1 = r9.A0P
            X.8h1 r0 = new X.8h1
            r0.<init>(r2)
            r1.A0F(r0)
        L_0x0059:
            X.1DT r1 = r9.A02
            java.lang.String r0 = r6.A0f()
            r1.A0F(r0)
            X.1DT r1 = r9.A04
            int r0 = X.AnonymousClass8BV.A02(r7)
            X.AnonymousClass3MX.A1J(r1, r0)
            X.1DT r3 = r9.A07
            X.1oU r0 = r9.A0R
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P
            boolean r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x007f
            boolean r2 = X.AnonymousClass8BW.A1T(r7)
            r0 = 1
            if (r2 == 0) goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            X.AnonymousClass3MY.A1L(r3, r0)
            r0 = 62
            r9.A0W(r1, r0)
            X.1DT r0 = r9.A0I
            X.AnonymousClass3MY.A1L(r0, r1)
            if (r8 == 0) goto L_0x00a7
            java.lang.String r0 = "entry_point"
            r4 = 1
            int r3 = r8.getInt(r0, r1)
            X.8qd r2 = new X.8qd
            r2.<init>()
            r0 = 0
            if (r3 == r1) goto L_0x037d
            r0 = 2
            if (r3 == r0) goto L_0x0378
            r4 = 3
            if (r3 == r4) goto L_0x037d
            r0 = 4
            if (r3 == r0) goto L_0x0378
        L_0x00a7:
            r2 = 0
            X.AQZ r0 = new X.AQZ
            r0.<init>(r10, r2)
            r10.A0q = r0
            r0 = 2131895805(0x7f1225fd, float:1.9426453E38)
            r10.setTitle(r0)
            r0 = 2131624100(0x7f0e00a4, float:1.887537E38)
            r10.setContentView((int) r0)
            X.01n r0 = r10.getSupportActionBar()
            X.C17960vV.A07(r0)
            r3 = 1
            r0.A0W(r1)
            r0 = 2131428035(0x7f0b02c3, float:1.8477703E38)
            android.view.View r4 = X.C110885hR.A0A(r10, r0)
            boolean r0 = r4 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00e7
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.0ve r0 = r10.A0E
            boolean r1 = X.AnonymousClass1J8.A05(r0)
            r0 = 2131624101(0x7f0e00a5, float:1.8875372E38)
            if (r1 == 0) goto L_0x00e1
            r0 = 2131624102(0x7f0e00a6, float:1.8875374E38)
        L_0x00e1:
            r4.setLayoutResource(r0)
            r4.inflate()
        L_0x00e7:
            r0 = 2131430211(0x7f0b0b43, float:1.8482117E38)
            android.view.View r4 = X.C110885hR.A0A(r10, r0)
            boolean r0 = r4 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0108
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.0ve r0 = r10.A0E
            boolean r1 = X.AnonymousClass1J8.A05(r0)
            r0 = 2131624103(0x7f0e00a7, float:1.8875376E38)
            if (r1 == 0) goto L_0x0102
            r0 = 2131624104(0x7f0e00a8, float:1.8875378E38)
        L_0x0102:
            r4.setLayoutResource(r0)
            r4.inflate()
        L_0x0108:
            r0 = 2131437032(0x7f0b25e8, float:1.8495951E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            com.whatsapp.wds.components.banners.WDSBanner r0 = (com.whatsapp.wds.components.banners.WDSBanner) r0
            r10.A0W = r0
            r0 = 2131435284(0x7f0b1f14, float:1.8492406E38)
            android.view.View r1 = X.C110885hR.A0A(r10, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r10.A0V = r0
            r0 = 2131435281(0x7f0b1f11, float:1.84924E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0Y = r0
            r0 = 2131435282(0x7f0b1f12, float:1.8492402E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0a = r0
            r0 = 2131435285(0x7f0b1f15, float:1.8492408E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0c = r0
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r0.A0D
            r10.A0e = r0
            r0 = 2131435283(0x7f0b1f13, float:1.8492404E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0Z = r0
            r0 = 2131431080(0x7f0b0ea8, float:1.848388E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaLinearLayout r0 = (com.whatsapp.WaLinearLayout) r0
            r10.A0G = r0
            r0 = 2131431601(0x7f0b10b1, float:1.8484936E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r0
            r10.A0b = r0
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r0.A0D
            r10.A0d = r0
            r0 = 2131432174(0x7f0b12ee, float:1.8486098E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r10, r0)
            r10.A0D = r0
            r0 = 2131431084(0x7f0b0eac, float:1.8483887E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r10, r0)
            r10.A0C = r0
            r0 = 2131431082(0x7f0b0eaa, float:1.8483883E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r10, r0)
            r10.A0A = r0
            r0 = 2131431083(0x7f0b0eab, float:1.8483885E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r10, r0)
            r10.A0B = r0
            X.1NP r0 = X.AnonymousClass8BT.A0C(r10)
            int r0 = r0.A02()
            A0t(r10, r0)
            int[] r8 = com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel.A0g
            r0 = 5
            r4 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r10.A0o = r0
            r7 = 0
        L_0x01a3:
            r0 = r8[r7]
            r6 = 2131895862(0x7f122636, float:1.942657E38)
            if (r0 != r6) goto L_0x036e
            java.lang.String[] r5 = r10.A0o
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131886911(0x7f12033f, float:1.9408414E38)
            java.lang.String r0 = X.AnonymousClass8BV.A0q(r10, r1, r0, r2, r6)
            r5[r7] = r0
        L_0x01b7:
            int r7 = r7 + 1
            if (r7 < r4) goto L_0x01a3
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = r10.A0Z
            r0 = 14
            X.AnonymousClass3Ma.A1C(r1, r10, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0H
            r0 = 9
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0P
            r0 = 24
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0J
            r0 = 25
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0F
            r0 = 12
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A02
            r0 = 13
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A04
            r0 = 14
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0M
            r0 = 15
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0K
            r0 = 16
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0L
            r0 = 17
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A09
            r0 = 19
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0N
            r0 = 20
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0B
            r0 = 18
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A06
            r0 = 21
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A07
            r0 = 22
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A05
            r0 = 23
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A08
            r0 = 26
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0D
            r0 = 27
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0E
            r0 = 28
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r0 = r0.A0C
            X.1Dg r1 = X.C22791Df.A00(r0)
            r0 = 29
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0A
            r0 = 30
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r0 = r0.A0I
            r5 = 8
            X.C20334AGq.A00(r10, r0, r5)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0O
            r0 = 10
            X.C20334AGq.A00(r10, r1, r0)
            com.whatsapp.wds.components.toggle.WDSSwitch r1 = r10.A0e
            X.1NP r0 = X.AnonymousClass8BT.A0C(r10)
            int r0 = r0.A04()
            boolean r0 = X.AnonymousClass000.A1T(r0, r3)
            r1.setChecked(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A0A
            X.1NT r0 = r0.A0Q
            boolean r0 = r0.A04()
            X.AnonymousClass3MY.A1L(r1, r0)
            r1 = 2
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A04 = r0
            r1 = 3
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A00 = r0
            r1 = 4
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A05 = r0
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r10, (int) r4)
            r10.A01 = r0
            r1 = 6
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r10, (int) r1)
            r10.A03 = r0
            r0 = 7
            X.AFU r4 = new X.AFU
            r4.<init>((java.lang.Object) r10, (int) r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r10.A0Y
            r0.setOnClickListener(r4)
            X.1bI r1 = r10.A0V
            X.AFU r0 = new X.AFU
            r0.<init>((java.lang.Object) r10, (int) r5)
            r1.A05(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            r0.A0U()
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r10.A0c
            r0.setOnClickListener(r4)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r10.A0a
            r0.setOnClickListener(r4)
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r10.A0b
            r0.setOnClickListener(r4)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            X.1DT r1 = r0.A03
            r0 = 11
            X.C20334AGq.A00(r10, r1, r0)
            X.00H r0 = r10.A0n
            r0.get()
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A1M(r10, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0P
            android.content.ServiceConnection r0 = r0.A00
            r10.bindService(r1, r0, r3)
            X.118 r0 = r10.A0R
            android.content.Context r0 = r0.A00
            boolean r0 = X.C41361wE.A09(r0)
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = "settings-gdrive/create google drive access not allowed."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.finish()
        L_0x0326:
            if (r11 == 0) goto L_0x035e
            java.lang.String r0 = "intent_already_parsed"
            boolean r0 = r11.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x035e
        L_0x0330:
            X.00H r0 = r10.A0m
            java.lang.Object r3 = r0.get()
            X.4Xf r3 = (X.C87824Xf) r3
            android.view.View r2 = r10.A00
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "search_result_key"
            java.lang.String r1 = r1.getStringExtra(r0)
            java.lang.String r0 = "chat_backup"
            r3.A02(r2, r0, r1)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r3 = r10.A0P
            X.0ve r2 = r3.A0a
            r1 = 11593(0x2d49, float:1.6245E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x038a
            X.1DT r1 = r3.A0O
            r0 = 0
            r1.A0E(r0)
            return
        L_0x035e:
            android.content.Intent r1 = r10.getIntent()
            if (r1 == 0) goto L_0x0330
            java.lang.String r0 = r1.getAction()
            if (r0 == 0) goto L_0x0330
            r10.onNewIntent(r1)
            goto L_0x0330
        L_0x036e:
            java.lang.String[] r1 = r10.A0o
            java.lang.String r0 = r10.getString(r0)
            r1[r7] = r0
            goto L_0x01b7
        L_0x0378:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0381
        L_0x037d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0381:
            r2.A00 = r0
            X.18K r0 = r9.A0b
            r0.CC7(r2)
            goto L_0x00a7
        L_0x038a:
            X.10I r1 = r3.A0c
            r0 = 9
            X.C21424Ajr.A00(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.SettingsGoogleDrive.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        AnonymousClass4VU r1;
        int i;
        super.onNewIntent(intent);
        String action = intent.getAction();
        C17900vP.A0f("settings-gdrive/new-intent/action/", action, AnonymousClass000.A10());
        if (action != null) {
            String str = "action_perform_backup_over_cellular";
            if (!action.equals(str)) {
                str = "action_perform_media_restore_over_cellular";
                if (!action.equals(str)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("settings-gdrive/new-intent/unexpected-action/");
                    C17890vO.A19(A10, intent.getAction());
                    return;
                }
                r1 = new AnonymousClass4VU(15);
                i = 2131890793;
            } else {
                r1 = new AnonymousClass4VU(16);
                i = 2131890792;
            }
            AnonymousClass8BS.A12(this, r1, i);
            r1.A05(false);
            AnonymousClass8BS.A11(this, r1, 2131890808);
            AnonymousClass8BV.A18(AnonymousClass3Ma.A0H(this), AnonymousClass8BW.A0I(this, r1, 2131892995), str);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1NM r0 = this.A0Q;
        C1600586y r1 = this.A0q;
        if (r1 != null) {
            r0.A02.add(r1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }

    public SettingsGoogleDrive() {
        this(0);
        this.A0u = new C143707Em(this, 1);
        this.A0t = new ConditionVariable(false);
    }
}
