package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment;
import com.whatsapp.backup.google.Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.banners.WDSBanner;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8gR  reason: invalid class name and case insensitive filesystem */
public abstract class C167498gR extends C166748du implements C107885am, C108255bO {
    public AnonymousClass1NW A00;
    public AnonymousClass1NT A01;
    public C36801oU A02;
    public C196239ug A03;
    public C36861oa A04;
    public GoogleDriveNewUserSetupViewModel A05;
    public AnonymousClass118 A06;
    public AnonymousClass1LU A07;
    public WDSBanner A08;
    public WDSListItem A09;
    public WDSListItem A0A;
    public WDSListItem A0B;
    public WDSListItem A0C;
    public WDSSwitch A0D;
    public WDSSwitch A0E;
    public AnonymousClass19K A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public boolean A0J;
    public String[] A0K;
    public final ConditionVariable A0L = new ConditionVariable(false);
    public final ConditionVariable A0M = new ConditionVariable(false);
    public final AtomicBoolean A0N = new AtomicBoolean();
    public final ServiceConnection A0O = new AA1(this, 0);
    public volatile boolean A0P;

    private void A0c() {
        C21455AkM.A00(this.A05, this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment(), 14);
    }

    public static void A0q(C167498gR r7) {
        C167498gR r2 = r7;
        r7.A03.A05(10);
        C18030ve r72 = r7.A0E;
        C20134A8u.A04(r2, AnonymousClass8BR.A0D(r2.A0F), AnonymousClass8BS.A0A(r2.A0H), r2.A01, r2.A0A, r72);
    }

    public void onDestroy() {
        this.A0J = true;
        this.A0N.set(false);
        unbindService(this.A0O);
        super.onDestroy();
    }

    public static void A0r(C167498gR r4, String str, String str2) {
        r4.A0M.open();
        AnonymousClass8BY.A0j(r4);
        if (str != null) {
            GoogleDriveNewUserSetupViewModel googleDriveNewUserSetupViewModel = r4.A05;
            C19830z4 r1 = googleDriveNewUserSetupViewModel.A04;
            if (!TextUtils.equals(r1.A0f(), str2)) {
                r1.A1Z(str2);
                C196239ug r2 = googleDriveNewUserSetupViewModel.A03;
                synchronized (r2.A0D) {
                    r2.A00 = null;
                }
                AnonymousClass8BY.A1H("gdrive-new-user-view-model/update-account-name new accountName is ", str2, AnonymousClass000.A10());
                googleDriveNewUserSetupViewModel.A00.A0F(str2);
                Intent A1M = AnonymousClass1LU.A1M(r4, "action_fetch_backup_info");
                A1M.putExtra("account_name", str2);
                C25081Mu.A00(r4, A1M);
            } else {
                AnonymousClass8BY.A1H("gdrive-new-user-view-model/update-account-name account unchanged, token received for ", str2, AnonymousClass000.A10());
            }
        }
        C21457AkO.A01(r4.A05, r4, 21);
    }

    public void A4c() {
        this.A05.A0T(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C5j(java.lang.String[] r8, int r9, int r10) {
        /*
            r7 = this;
            X.00H r0 = r7.A0H
            int r2 = X.AnonymousClass8BV.A02(r0)
            if (r10 < 0) goto L_0x00ac
            int[] r1 = com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel.A08
            r0 = 5
            if (r10 >= r0) goto L_0x00ac
            r0 = r1[r10]
        L_0x000f:
            if (r0 == 0) goto L_0x00a3
            if (r2 != 0) goto L_0x001c
            X.00H r2 = r7.A0G
            X.0z4 r1 = r7.A0A
            com.whatsapp.wds.components.banners.WDSBanner r0 = r7.A08
            X.AnonymousClass9PD.A00(r1, r0, r2)
        L_0x001c:
            r0 = 10
            if (r9 != r0) goto L_0x00af
            int[] r2 = com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel.A08
            r0 = 5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r10 <= r0) goto L_0x002f
            java.lang.String r0 = "settings-gdrive/change-freq/unexpected-choice/"
            X.C17900vP.A0i(r0, r1, r10)
        L_0x002e:
            return
        L_0x002f:
            java.lang.String r0 = "settings-gdrive/change-freq/index:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/value:"
            r1.append(r0)
            r0 = r2[r10]
            X.C17900vP.A0o(r1, r0)
            X.00H r0 = r7.A0H
            int r3 = X.AnonymousClass8BV.A02(r0)
            r2 = r2[r10]
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r0 = r7.A05
            r0.A0T(r2)
            r1 = 8
            com.whatsapp.wds.components.banners.WDSBanner r0 = r7.A08
            if (r2 == 0) goto L_0x0079
            r0.setVisibility(r1)
            if (r3 != 0) goto L_0x002e
            X.00H r0 = r7.A0H
            X.1NP r1 = X.AnonymousClass8BS.A0A(r0)
            X.00H r0 = X.C20134A8u.A00
            int r0 = r1.A05()
            boolean r0 = X.C17890vO.A1R(r0)
            if (r0 != 0) goto L_0x002e
            X.00H r0 = r7.A0H
            boolean r0 = X.AnonymousClass8BW.A1T(r0)
            if (r0 != 0) goto L_0x002e
            com.whatsapp.wds.components.list.listitem.WDSListItem r0 = r7.A09
            r0.performClick()
            return
        L_0x0079:
            r0.setVisibility(r1)
            X.0z4 r0 = r7.A0A
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            long r5 = r0.getLong(r3, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r1 = r1 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            X.0z4 r2 = r7.A0A
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r3
            r2.A1K(r0)
            return
        L_0x00a3:
            com.whatsapp.wds.components.banners.WDSBanner r1 = r7.A08
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x001c
        L_0x00ac:
            r0 = r2
            goto L_0x000f
        L_0x00af:
            r0 = 17
            if (r9 != r0) goto L_0x00cc
            r1 = r8[r10]
            r0 = 2131890787(0x7f121263, float:1.9416276E38)
            java.lang.String r0 = r7.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c6
            r7.A0c()
            return
        L_0x00c6:
            r0 = r8[r10]
            r7.A0s(r0)
            return
        L_0x00cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unexpected dialog box: "
            java.lang.IllegalStateException r0 = X.AnonymousClass8BX.A0W(r0, r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167498gR.C5j(java.lang.String[], int, int):void");
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

    public static void A0d(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, C167498gR r5, String str) {
        C17960vV.A00();
        AnonymousClass8BY.A1H("settings-gdrive/auth-request account being used is ", str, AnonymousClass000.A10());
        r5.A0P = false;
        C21453AkK.A01(r5.A05, r5, baseNewUserSetupActivity$AuthRequestDialogFragment, 14);
        ConditionVariable conditionVariable = r5.A0M;
        conditionVariable.close();
        C21459AkQ.A01(r5.A05, r5, baseNewUserSetupActivity$AuthRequestDialogFragment, str, 19);
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        AnonymousClass1Ez r2 = new AnonymousClass1Ez("settings-gdrive/fetch-auth-token");
        conditionVariable.block(C20113A7w.A0L);
        C21453AkK.A01(r5.A05, r5, r2, 15);
    }

    private void A0s(String str) {
        AnonymousClass8BY.A1H("setting-gdrive/activity-result/account-picker accountName is ", str, AnonymousClass000.A10());
        if (str != null) {
            C21459AkQ.A01(this.A05, this, new Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment(), str, 18);
        } else if (AnonymousClass8BR.A0z(this) == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            A4c();
        }
    }

    public void A4b() {
        int i;
        C17960vV.A02();
        if (!AnonymousClass4Yv.A02(this) && !this.A0J) {
            AnonymousClass1NP A0A2 = AnonymousClass8BS.A0A(this.A0H);
            AnonymousClass00H r0 = C20134A8u.A00;
            if (C17890vO.A1R(A0A2.A05())) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i = 2131895885;
            } else if (AnonymousClass8BW.A1T(this.A0H)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i = 2131895889;
            } else {
                int i2 = 0;
                if (!this.A00.A01()) {
                    AnonymousClass8BY.A0v(this);
                    return;
                }
                String A0z = AnonymousClass8BR.A0z(this);
                Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
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
                    strArr[i3 - 1] = getString(2131890787);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A092 = AnonymousClass8BY.A09(this);
                    A092.putInt("selected_item_index", i4);
                    A092.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A1R(A092);
                    if (getSupportFragmentManager().A0Q("account-picker") == null) {
                        C34001jj A0H2 = AnonymousClass3Ma.A0H(this);
                        A0H2.A0B(singleChoiceListDialogFragment, "account-picker");
                        A0H2.A00(true);
                        return;
                    }
                    return;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                A0c();
                return;
            }
            BhQ(i);
        }
    }

    public void BrZ(int i) {
        String str;
        switch (i) {
            case 12:
                str = "settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel";
                break;
            case 13:
                str = "settings-gdrive/perform-backup user declined to perform Google Drive backup over cellular (when the settings say Wi-Fi only)";
                break;
            case 15:
                str = "settings-gdrive/user-declined-to-restore-media-over-cellular";
                break;
            case 16:
                str = "settings-gdrive/user-declined-to-backup-over-cellular";
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
                this.A03.A04();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                this.A02.A03();
                A0q(this);
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A05.A0T(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A02.A04();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A02.A03();
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

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("settings-gdrive/activity-result request: ");
        A10.append(i);
        C17900vP.A0j(" result: ", A10, i2);
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    String str2 = null;
                    if (intent != null) {
                        str = intent.getStringExtra("authAccount");
                    } else {
                        str = null;
                    }
                    if (i2 == -1) {
                        str2 = str;
                    }
                    A0s(str2);
                } else if (i == 150 && i2 == -1) {
                    A4b();
                }
            } else if (i2 == -1) {
                C17960vV.A07(intent);
                A0r(this, intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
            } else {
                AnonymousClass8BY.A0j(this);
            }
        } else if (i2 == -1) {
            boolean A042 = this.A01.A04();
            WDSListItem wDSListItem = this.A0A;
            int i3 = 2131895856;
            if (A042) {
                i3 = 2131895857;
            }
            wDSListItem.setSubText(i3);
        }
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        this.A05 = (GoogleDriveNewUserSetupViewModel) AnonymousClass3MW.A0N(this).A00(GoogleDriveNewUserSetupViewModel.class);
        setTitle(2131895805);
        setContentView(2131624079);
        View A0A2 = C110885hR.A0A(this, 2131428035);
        if (A0A2 instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) A0A2;
            int i = 2131624101;
            if (AnonymousClass1J8.A05(this.A0E)) {
                i = 2131624102;
            }
            viewStub.setLayoutResource(i);
            viewStub.inflate();
        }
        View A0A3 = C110885hR.A0A(this, 2131430211);
        if (A0A3 instanceof ViewStub) {
            ViewStub viewStub2 = (ViewStub) A0A3;
            int i2 = 2131624103;
            if (AnonymousClass1J8.A05(this.A0E)) {
                i2 = 2131624104;
            }
            viewStub2.setLayoutResource(i2);
            viewStub2.inflate();
        }
        C003401n supportActionBar = getSupportActionBar();
        C17960vV.A07(supportActionBar);
        supportActionBar.A0W(true);
        this.A08 = (WDSBanner) C110885hR.A0A(this, 2131437032);
        this.A09 = (WDSListItem) findViewById(2131435281);
        WDSListItem wDSListItem = (WDSListItem) findViewById(2131435285);
        this.A0C = wDSListItem;
        this.A0E = wDSListItem.A0D;
        this.A0A = (WDSListItem) findViewById(2131435283);
        WDSListItem wDSListItem2 = (WDSListItem) C110885hR.A0A(this, 2131431601);
        this.A0B = wDSListItem2;
        this.A0D = wDSListItem2.A0D;
        int[] iArr = GoogleDriveNewUserSetupViewModel.A07;
        this.A0K = new String[5];
        int i3 = 0;
        do {
            int i4 = iArr[i3];
            if (i4 == 2131895862) {
                this.A0K[i3] = AnonymousClass8BV.A0q(this, new Object[1], 2131886911, 0, 2131895862);
            } else {
                this.A0K[i3] = getString(i4);
            }
            i3++;
        } while (i3 < 5);
        AnonymousClass3Ma.A1C(this.A0A, this, 13);
        C20334AGq.A00(this, this.A05.A01, 2);
        C20334AGq.A00(this, this.A05.A00, 3);
        boolean A042 = this.A01.A04();
        WDSListItem wDSListItem3 = this.A0A;
        int i5 = 2131895856;
        if (A042) {
            i5 = 2131895857;
        }
        wDSListItem3.setSubText(i5);
        AnonymousClass78J r1 = new AnonymousClass78J(this, 41);
        this.A09.setOnClickListener(r1);
        this.A0C.setOnClickListener(r1);
        this.A0B.setOnClickListener(r1);
        bindService(AnonymousClass1LU.A1M(this, (String) null), this.A0O, 1);
        if (!C41361wE.A09(this.A06.A00)) {
            Log.i("settings-gdrive/create google drive access not allowed.");
            finish();
        }
        if ((bundle == null || !bundle.getBoolean("intent_already_parsed", false)) && (intent = getIntent()) != null && intent.getAction() != null) {
            onNewIntent(intent);
        }
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

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
