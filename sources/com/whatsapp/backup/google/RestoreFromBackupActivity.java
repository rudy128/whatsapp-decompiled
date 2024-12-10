package com.whatsapp.backup.google;

import X.A1C;
import X.A3f;
import X.A84;
import X.A9B;
import X.A9Q;
import X.AA1;
import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11W;
import X.AnonymousClass11Z;
import X.AnonymousClass122;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass196;
import X.AnonymousClass19D;
import X.AnonymousClass1Cd;
import X.AnonymousClass1DK;
import X.AnonymousClass1DT;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L7;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1NL;
import X.AnonymousClass1NP;
import X.AnonymousClass1NT;
import X.AnonymousClass1NW;
import X.AnonymousClass1WZ;
import X.AnonymousClass2SS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VU;
import X.AnonymousClass4Yv;
import X.AnonymousClass73I;
import X.AnonymousClass74O;
import X.AnonymousClass78J;
import X.AnonymousClass78Q;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass996;
import X.C000200d;
import X.C003401n;
import X.C107885am;
import X.C108255bO;
import X.C108945cZ;
import X.C108965cb;
import X.C108975cc;
import X.C110885hR;
import X.C134036pu;
import X.C137116uw;
import X.C167518gV;
import X.C167528gW;
import X.C170778qe;
import X.C177959Bg;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C179389Ht;
import X.C17960vV;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C188789hz;
import X.C192039nf;
import X.C195939uB;
import X.C195999uI;
import X.C196239ug;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C19948A0f;
import X.C19986A1x;
import X.C20134A8u;
import X.C20334AGq;
import X.C21366Aiv;
import X.C21424Ajr;
import X.C21452AkJ;
import X.C21453AkK;
import X.C21454AkL;
import X.C21457AkO;
import X.C21479Akk;
import X.C218617r;
import X.C219217x;
import X.C22781De;
import X.C25081Mu;
import X.C26302CxJ;
import X.C27431Wb;
import X.C30391dr;
import X.C33641j9;
import X.C33841jT;
import X.C36801oU;
import X.C36821oW;
import X.C36841oY;
import X.C36851oZ;
import X.C37581pm;
import X.C40751vD;
import X.C41361wE;
import X.C41371wF;
import X.C57352iw;
import X.C58712l8;
import X.C63662tU;
import X.C63932tv;
import X.C64052u8;
import X.C72453Mb;
import X.C72463Mc;
import X.C74703cE;
import X.C88584aA;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class RestoreFromBackupActivity extends AnonymousClass996 implements C107885am, C108255bO {
    public int A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public C19880zA A04;
    public C19880zA A05;
    public AnonymousClass181 A06;
    public C40751vD A07;
    public AnonymousClass1NW A08;
    public AnonymousClass1NT A09;
    public A1C A0A;
    public C36801oU A0B;
    public C196239ug A0C;
    public C36841oY A0D;
    public GoogleDriveRestoreAnimationView A0E;
    public C19948A0f A0F;
    public RestoreFromBackupViewModel A0G;
    public AnonymousClass118 A0H;
    public C219217x A0I;
    public AnonymousClass196 A0J;
    public AnonymousClass122 A0K;
    public C27431Wb A0L;
    public C192039nf A0M;
    public AnonymousClass1Cd A0N;
    public AnonymousClass1WZ A0O;
    public AnonymousClass1DK A0P;
    public C134036pu A0Q;
    public AnonymousClass19D A0R;
    public AnonymousClass18K A0S;
    public AnonymousClass1LU A0T;
    public C18010vc A0U;
    public C33841jT A0V;
    public C33641j9 A0W;
    public C57352iw A0X;
    public C195939uB A0Y;
    public AnonymousClass1NL A0Z;
    public AnonymousClass11W A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m = false;
    public boolean A0n;
    public long A0o;
    public long A0p;
    public View A0q;
    public TextView A0r;
    public WaTextView A0s;
    public C177959Bg A0t;
    public boolean A0u;
    public final ServiceConnection A0v;
    public final ConditionVariable A0w;
    public final ConditionVariable A0x;
    public final C36851oZ A0y;
    public final C36821oW A0z;
    public final List A10;
    public final Set A11;
    public final AtomicBoolean A12;
    public final AtomicBoolean A13;
    public final AtomicBoolean A14;
    public final AtomicBoolean A15;
    public final ConditionVariable A16;

    public RestoreFromBackupActivity() {
        super(true, false);
        AGB.A00(this, 13);
        this.A10 = AnonymousClass000.A13();
        this.A11 = Collections.newSetFromMap(AnonymousClass8BR.A17());
        this.A16 = new ConditionVariable(false);
        this.A0w = new ConditionVariable(false);
        this.A14 = new AtomicBoolean();
        this.A0x = new ConditionVariable(false);
        this.A12 = new AtomicBoolean(false);
        this.A13 = new AtomicBoolean(false);
        this.A15 = new AtomicBoolean(true);
        this.A0j = "no_backup_found";
        this.A0v = new AA1(this, 1);
        this.A0z = new C167528gW(this, 2);
        this.A0y = new C167518gV(this);
    }

    private void A0r(int i) {
        int i2 = 2131890676;
        if (this.A08.A02()) {
            i2 = 2131890675;
        }
        AnonymousClass00H r3 = this.A0g;
        AnonymousClass74O.A0M(this, r3, "google_backup", new int[]{2131233246}, i, 2131890677, i2, 2131898766, !this.A08.A03(), !C72463Mc.A1W(this.A0e));
    }

    public static void A0z(RestoreFromBackupActivity restoreFromBackupActivity, C195999uI r9, C179389Ht r10) {
        RestoreFromBackupActivity restoreFromBackupActivity2 = restoreFromBackupActivity;
        restoreFromBackupActivity.A0q(2);
        if (r9.A03) {
            restoreFromBackupActivity.startActivityForResult(AnonymousClass1LU.A0D(restoreFromBackupActivity, 2), 0);
            return;
        }
        RestoreFromBackupViewModel restoreFromBackupViewModel = restoreFromBackupActivity.A0G;
        C17960vV.A07(restoreFromBackupViewModel);
        C37581pm A002 = AnonymousClass2SS.A00(restoreFromBackupActivity);
        AnonymousClass1DT r1 = restoreFromBackupViewModel.A04;
        r1.A0E(C179389Ht.NOT_TRIGGERED);
        restoreFromBackupViewModel.A02.A0E((Object) null);
        C179389Ht r7 = r10;
        if (r9.A02) {
            C19986A1x a1x = r9.A00;
            C17960vV.A07(a1x);
            C18070vi.A0X(a1x);
            AnonymousClass3MX.A1Q(new RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1(restoreFromBackupActivity2, a1x, restoreFromBackupViewModel, r7, (C30391dr) null), A002);
            return;
        }
        r1.A0E(r10);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass10I r3;
        Runnable akJ;
        this.A0i = null;
        AnonymousClass8BT.A1A(this, "unknown");
        int i3 = i;
        int i4 = i2;
        if (i3 == 5) {
            C17900vP.A0j("restore>RestoreFromBackupActivity/request-permissions/result/", AnonymousClass000.A10(), i4);
        } else if (i3 == 6) {
            C17900vP.A0j("restore>RestoreFromBackupActivity/request-permissions-storage-and-contact/result/", AnonymousClass000.A10(), i4);
            A12(this, false);
            return;
        } else if (i3 == 2) {
            C17900vP.A0j("restore>RestoreFromBackupActivity/request-to-fix-google-play-services/result/", AnonymousClass000.A10(), i4);
            A11(this, false);
            return;
        } else {
            Intent intent2 = intent;
            if (i3 == 1) {
                if (i4 == -1) {
                    C17960vV.A07(intent2);
                    this.A0k = intent2.getStringExtra("authtoken");
                    this.A0x.open();
                    r3 = this.A05;
                    akJ = new C21457AkO((Object) this, 37);
                } else {
                    return;
                }
            } else if (i3 == 3) {
                if (i4 == -1) {
                    C17960vV.A07(intent2);
                    C17960vV.A07(intent2.getExtras());
                    String string = intent2.getExtras().getString("authAccount");
                    C41361wE.A08(string);
                    if (string == null) {
                        Log.e("restore>RestoreFromBackupActivity/activity-result/account-picker/no account was provided");
                        return;
                    } else {
                        r3 = this.A05;
                        akJ = new C21452AkJ(19, string, this);
                    }
                } else {
                    C17900vP.A0i("restore>RestoreFromBackupActivity/activity-result/account-picker-request/", AnonymousClass000.A10(), i4);
                    A0d();
                    A4e(false);
                    return;
                }
            } else if (i3 == 4) {
                C17900vP.A0j("restore>RestoreFromBackupActivity/activity-result/account-added-request/", AnonymousClass000.A10(), i4);
                Intent className = C17880vN.A0A().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
                className.setAction("action_show_restore_one_time_setup");
                startActivity(className);
                return;
            } else if (i == 0) {
                C17900vP.A0j("restore>RestoreFromBackupActivity/activity-result/password-input-activity/", AnonymousClass000.A10(), i4);
                if (i4 == -1) {
                    A0q(7);
                    RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0G;
                    C17960vV.A07(restoreFromBackupViewModel);
                    if (restoreFromBackupViewModel.A00 == 23) {
                        A4j((C192039nf) null, 27);
                        A4g();
                        A10(this, true);
                        return;
                    }
                    A1C a1c = this.A0A;
                    C17960vV.A07(a1c);
                    A4g();
                    A1C a1c2 = a1c;
                    this.A05.CGF(new C21366Aiv(this, a1c2, a1c.A05, 0, a1c.A00));
                    return;
                }
                return;
            } else if (i3 == 7) {
                A15(true);
                return;
            } else if (i3 == 8) {
                if (!this.A08.A03()) {
                    C17960vV.A02();
                    if (!A19(this)) {
                        AnonymousClass4VU r1 = new AnonymousClass4VU(22);
                        AnonymousClass8BW.A11(this, r1, 2131890716);
                        AnonymousClass8BS.A12(this, r1, 2131890717);
                        r1.A05(false);
                        AnonymousClass8BS.A11(this, r1, 2131899286);
                        AnonymousClass8BV.A18(AnonymousClass3Ma.A0H(this), AnonymousClass8BW.A0I(this, r1, 2131899101), (String) null);
                        return;
                    }
                    return;
                }
            } else if (i3 == 25) {
                if (i4 == 1) {
                    RestoreFromBackupViewModel restoreFromBackupViewModel2 = this.A0G;
                    C17960vV.A07(restoreFromBackupViewModel2);
                    int i5 = restoreFromBackupViewModel2.A00;
                    if (i5 == 22) {
                        A4j((C192039nf) null, 24);
                        A13(this, true);
                    } else {
                        C17960vV.A07(restoreFromBackupViewModel2);
                        if (i5 == 23) {
                            A4j((C192039nf) null, 27);
                            A4k(true);
                        }
                    }
                } else if (i4 == 2) {
                    startActivityForResult(AnonymousClass1LU.A1b(this, (String) null, (String) null, 1, false), 26);
                } else if (i4 == 3) {
                    A0c();
                    RestoreFromBackupViewModel restoreFromBackupViewModel3 = this.A0G;
                    C17960vV.A07(restoreFromBackupViewModel3);
                    if (restoreFromBackupViewModel3.A00 == 21) {
                        A0u(this);
                        setResult(1);
                    } else {
                        A4h();
                    }
                }
                C17880vN.A1F(AnonymousClass8BR.A08(this), "chat_transfer_finished", true);
                return;
            } else if (i3 != 26) {
                super.onActivityResult(i3, i4, intent2);
                return;
            } else if (i4 == -1) {
                setResult(5);
                finish();
                return;
            } else if (i2 == 0) {
                RestoreFromBackupViewModel restoreFromBackupViewModel4 = this.A0G;
                C17960vV.A07(restoreFromBackupViewModel4);
                int i6 = restoreFromBackupViewModel4.A00;
                if (i6 == 21) {
                    A0c();
                    A0u(this);
                    setResult(1);
                    return;
                }
                C17960vV.A07(restoreFromBackupViewModel4);
                if (i6 == 22) {
                    A13(this, false);
                    return;
                }
                C17960vV.A07(restoreFromBackupViewModel4);
                if (i6 == 23) {
                    A4k(false);
                    return;
                }
                return;
            } else {
                return;
            }
            r3.CGF(akJ);
            return;
        }
        A11(this, true);
    }

    public void onCreate(Bundle bundle) {
        C192039nf r0;
        Bundle bundle2;
        C003401n A0K2;
        super.onCreate(bundle);
        C72463Mc.A0t(this);
        this.A0X.A00(this);
        this.A0G = (RestoreFromBackupViewModel) AnonymousClass3MW.A0N(this).A00(RestoreFromBackupViewModel.class);
        if (!C41361wE.A09(this.A0H.A00)) {
            Log.w("restore>RestoreFromBackupActivity/google drive access is not possible");
            setResult(0);
            finish();
            return;
        }
        setContentView(2131624053);
        ((ViewStub) C110885hR.A0A(this, 2131431181)).inflate();
        int i = 2131436208;
        if (this.A0A.A2L()) {
            i = 2131436252;
        }
        this.A0s = (WaTextView) ((ViewStub) C110885hR.A0A(this, i)).inflate();
        Toolbar toolbar = (Toolbar) findViewById(2131436246);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey() && (A0K2 = AnonymousClass3MY.A0K(this, toolbar)) != null) {
            A0K2.A0W(false);
            A0K2.A0Y(false);
        }
        setTitle(2131886444);
        AnonymousClass8BV.A0P(this).setHeadlineText(getString(2131899187));
        this.A01 = (ProgressBar) C110885hR.A0A(this, 2131431174);
        this.A03 = AnonymousClass3MW.A0I(this, 2131431175);
        this.A0q = C110885hR.A0A(this, 2131431097);
        this.A02 = AnonymousClass3MW.A0I(this, 2131431098);
        C20334AGq.A00(this, this.A0G.A03, 5);
        this.A0n = getApplicationContext().bindService(AnonymousClass1LU.A1M(getApplicationContext(), (String) null), this.A0v, 1);
        if (bundle == null) {
            RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0G;
            C17960vV.A07(restoreFromBackupViewModel);
            restoreFromBackupViewModel.A00 = 21;
            this.A0M = null;
            C17880vN.A1B(AnonymousClass8BR.A08(this).remove("gdrive_activity_state"), "gdrive_activity_msgstore_init_key");
        } else {
            AnonymousClass00H r4 = this.A0A.A00;
            Pair A0N2 = C108945cZ.A0N(Integer.valueOf(C17880vN.A0B(r4).getInt("gdrive_activity_state", -1)), Integer.valueOf(C17880vN.A0B(r4).getInt("gdrive_activity_msgstore_init_key", -1)));
            RestoreFromBackupViewModel restoreFromBackupViewModel2 = this.A0G;
            C17960vV.A07(restoreFromBackupViewModel2);
            int A012 = C108965cb.A01(A0N2);
            if (A012 == -1) {
                A012 = 21;
            }
            restoreFromBackupViewModel2.A00 = A012;
            if (A012 == 26) {
                int A0M2 = AnonymousClass000.A0M(A0N2.second);
                if (A0M2 == -1) {
                    r0 = new C192039nf(0);
                } else if (A0M2 == 21 || A0M2 <= 7) {
                    r0 = new C192039nf(A0M2);
                } else {
                    throw AnonymousClass001.A13("Initialization state is not recognized. State = ", AnonymousClass000.A10(), A0M2);
                }
            } else {
                r0 = null;
            }
            this.A0M = r0;
        }
        A9B.A0Q(this.A00, this, 2131436246, false, false, C17880vN.A0I(this.A0b).A0J(false));
        RestoreFromBackupViewModel restoreFromBackupViewModel3 = this.A0G;
        C17960vV.A07(restoreFromBackupViewModel3);
        if (restoreFromBackupViewModel3.A00 == 24 && !this.A0B.A0S.get()) {
            Log.i("restore>RestoreFromBackupActivity/update-state/it looks like restoring from gdrive has been completed but we missed it, let's try again");
            A4j(this.A0M, 22);
        }
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle.getBundle("restore_account_data");
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("restore>RestoreFromBackupActivity/update-state/");
        C17890vO.A1A(A102, A0V(this.A0G.A00));
        int i2 = this.A0G.A00;
        switch (i2) {
            case 21:
                Intent intent = getIntent();
                if (intent.getAction() != null) {
                    onNewIntent(intent);
                    break;
                } else {
                    Log.e("restore>RestoreFromBackupActivity/update-state/new state but no action provided. Finishing.");
                    finish();
                    break;
                }
            case 22:
                if (bundle2 != null) {
                    this.A0A = A1C.A00(bundle2);
                    A4j((C192039nf) null, 22);
                    A13(this, false);
                    this.A05.CGF(new C21453AkK(this, bundle, 21));
                    break;
                } else {
                    throw AnonymousClass000.A0n("restore_account_data cannot be null");
                }
            case 23:
                A4j((C192039nf) null, 23);
                A4k(false);
                break;
            case 24:
                if (bundle2 != null) {
                    this.A0A = A1C.A00(bundle2);
                    A4j((C192039nf) null, 22);
                    A13(this, false);
                    A4j((C192039nf) null, 24);
                    A4g();
                    AnonymousClass1NP A0B2 = AnonymousClass8BU.A0B(this);
                    AnonymousClass00H r02 = C20134A8u.A00;
                    if (A0B2.A05() != 3) {
                        Log.i("restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-not-pending");
                        A10(this, true);
                        break;
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-pending");
                        break;
                    }
                } else {
                    throw AnonymousClass000.A0n("restore_account_data cannot be null");
                }
            case 25:
                if (bundle2 != null) {
                    this.A0A = A1C.A00(bundle2);
                    break;
                }
                break;
            case 26:
                C192039nf r2 = this.A0M;
                if (bundle2 != null) {
                    this.A0A = A1C.A00(bundle2);
                    A4j((C192039nf) null, 22);
                    A13(this, false);
                } else {
                    A4j((C192039nf) null, 23);
                    A4k(false);
                }
                A4g();
                C17900vP.A0Y(r2, "restore>RestoreFromBackupActivity/update-state/msgstore-init-status/", AnonymousClass000.A10());
                A4d(r2);
                break;
            case 27:
                A4j((C192039nf) null, 23);
                A4k(false);
                A4g();
                A10(this, true);
                A4j((C192039nf) null, 27);
                break;
            default:
                throw AnonymousClass8BX.A0W("Unknown state: ", AnonymousClass000.A10(), i2);
        }
        C20334AGq.A00(this, this.A0G.A04, 6);
        C20334AGq.A00(this, this.A0G.A02, 7);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A0l = true;
        if (this.A14.compareAndSet(true, false)) {
            this.A0D.A02(this.A0y);
        }
        if (this.A0n) {
            getApplicationContext().unbindService(this.A0v);
        }
        AnonymousClass8BU.A1F(this.A0h);
        super.onDestroy();
    }

    private SpannableStringBuilder A03(String str, String str2) {
        HashMap A112 = C17880vN.A11();
        A112.put(str2, new C74703cE(this, this.A01, this.A05, this.A08, this.A03.A00("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history").toString()));
        return C26302CxJ.A03(str, A112);
    }

    private void A0c() {
        int i = 2131436280;
        if (this.A0A.A2L()) {
            i = 2131436281;
        }
        AnonymousClass8BV.A12(this, i);
    }

    private void A0d() {
        Log.i("restore>RestoreFromBackupActivity/skip restore");
        this.A0u = true;
        setResult(2);
    }

    private void A0q(int i) {
        C170778qe r1 = new C170778qe();
        r1.A00 = Integer.valueOf(i);
        this.A0S.CC7(r1);
    }

    public static void A0t(RestoreFromBackupActivity restoreFromBackupActivity) {
        AnonymousClass8BR.A0q(restoreFromBackupActivity.A0g).A0I("backup_found", "restore");
        if (A1A(restoreFromBackupActivity)) {
            return;
        }
        if (C108975cc.A07(restoreFromBackupActivity.A0C) < restoreFromBackupActivity.A0o) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore insufficient storage, available: ");
            A102.append(C108975cc.A07(restoreFromBackupActivity.A0C));
            A102.append(" required: ");
            C17890vO.A16(A102, restoreFromBackupActivity.A0o);
            restoreFromBackupActivity.A0C.get();
            int i = 2131890687;
            if (AnonymousClass11Z.A00()) {
                i = 2131890685;
            }
            String A0b2 = C108975cc.A0b(restoreFromBackupActivity, C88584aA.A03(restoreFromBackupActivity.A00, restoreFromBackupActivity.A0o), new Object[1], i);
            AnonymousClass4VU r4 = new AnonymousClass4VU(13);
            String string = restoreFromBackupActivity.getString(2131890686);
            Bundle bundle = r4.A00;
            bundle.putString("title", string);
            r4.A02(A0b2);
            String string2 = restoreFromBackupActivity.getString(2131887456);
            if (Build.VERSION.SDK_INT >= 26) {
                string2 = restoreFromBackupActivity.getString(2131887449);
            }
            r4.A04(string2);
            bundle.putString("neutral_button", restoreFromBackupActivity.getString(2131899286));
            r4.A00().A2C(restoreFromBackupActivity.getSupportFragmentManager(), (String) null);
            restoreFromBackupActivity.A0i = null;
            AnonymousClass8BT.A1A(restoreFromBackupActivity, "unknown");
            return;
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore starting restore from ");
        A1C a1c = restoreFromBackupActivity.A0A;
        C17960vV.A07(a1c);
        C17890vO.A1A(A103, C41361wE.A08(a1c.A05));
        Log.i("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore/stopping-approx-transfer-size-calc-thread");
        restoreFromBackupActivity.A12.set(true);
        A0z(restoreFromBackupActivity, restoreFromBackupActivity.A0A.A01, C179389Ht.TRIGGER_RESTORE_FROM_REMOTE_BACKUP);
    }

    public static void A0u(RestoreFromBackupActivity restoreFromBackupActivity) {
        Log.i("restore>RestoreFromBackupActivity/skip-restore-and-prepare-empty-message-store/show-new-user-settings");
        restoreFromBackupActivity.A0d();
        restoreFromBackupActivity.A4e(false);
        AnonymousClass8BX.A15(restoreFromBackupActivity);
    }

    public static void A0v(RestoreFromBackupActivity restoreFromBackupActivity, int i) {
        AnonymousClass4VU r1 = new AnonymousClass4VU(i);
        AnonymousClass8BS.A12(restoreFromBackupActivity, r1, 2131889545);
        r1.A05(true);
        AnonymousClass8BS.A11(restoreFromBackupActivity, r1, 2131892330);
        PromptDialogFragment A0I2 = AnonymousClass8BW.A0I(restoreFromBackupActivity, r1, 2131898766);
        if (!A19(restoreFromBackupActivity)) {
            AnonymousClass8BV.A18(AnonymousClass3Ma.A0H(restoreFromBackupActivity), A0I2, (String) null);
        }
    }

    public static void A0y(RestoreFromBackupActivity restoreFromBackupActivity, C195999uI r3) {
        boolean z = r3.A01;
        View view = restoreFromBackupActivity.A0q;
        C17960vV.A05(view);
        if (z) {
            view.setVisibility(0);
            restoreFromBackupActivity.A0q(1);
            return;
        }
        view.setVisibility(8);
    }

    public static void A10(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        String str;
        A1C a1c;
        if (z && (a1c = restoreFromBackupActivity.A0A) != null && a1c.A01.A01) {
            restoreFromBackupActivity.A0q(8);
        }
        restoreFromBackupActivity.A0c();
        boolean A0Q2 = AnonymousClass8BU.A0B(restoreFromBackupActivity).A0Q();
        StringBuilder A102 = AnonymousClass000.A10();
        if (A0Q2) {
            str = "restore>RestoreFromBackupActivity/msgstore-download/finished with success: ";
        } else {
            str = "restore>RestoreFromBackupActivity/msgstore-download/not performed since we are using local backup, success: ";
        }
        A102.append(str);
        A102.append(z);
        C17890vO.A1A(A102, ", starting to restore it.");
        super.A4e(z);
    }

    public static void A12(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        if (!restoreFromBackupActivity.A08.A03()) {
            if (z) {
                restoreFromBackupActivity.A0r(6);
                return;
            }
        } else if (restoreFromBackupActivity.A0L.A0E() > 0) {
            restoreFromBackupActivity.A0L.A00 = 3;
            restoreFromBackupActivity.A4j((C192039nf) null, 23);
            restoreFromBackupActivity.A4k(false);
            return;
        }
        restoreFromBackupActivity.A0L.A00 = 4;
        restoreFromBackupActivity.A0d();
        restoreFromBackupActivity.A4e(false);
    }

    public static void A13(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        int i;
        long j;
        A1C a1c = restoreFromBackupActivity.A0A;
        if (a1c == null) {
            Log.e("restore>RestoreFromBackupActivity/show-restore-panel-for-users-with-google-drive-backups/restore-account-data is null");
            return;
        }
        long j2 = a1c.A04;
        if (z || !restoreFromBackupActivity.A18()) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/");
            String str = a1c.A05;
            C17890vO.A1A(A102, C41361wE.A08(str));
            long j3 = a1c.A00;
            AnonymousClass8BV.A12(restoreFromBackupActivity, 2131431172);
            C110885hR.A0A(restoreFromBackupActivity, 2131431180).setVisibility(0);
            restoreFromBackupActivity.A16.open();
            restoreFromBackupActivity.A0c();
            if (restoreFromBackupActivity.A0E == null) {
                restoreFromBackupActivity.A0E = (GoogleDriveRestoreAnimationView) restoreFromBackupActivity.findViewById(2131431178);
            }
            boolean z2 = a1c.A02;
            TextView A0I2 = AnonymousClass3MW.A0I(restoreFromBackupActivity, 2131434654);
            if (z2) {
                restoreFromBackupActivity.A0C.get();
                i = 2131896126;
                if (AnonymousClass11Z.A00()) {
                    i = 2131895473;
                }
            } else {
                i = 2131890742;
            }
            A0I2.setText(i);
            StringBuilder sb = new StringBuilder(restoreFromBackupActivity.getString(2131890667));
            StringBuilder A103 = AnonymousClass000.A10();
            if (j2 > 0) {
                sb.setLength(0);
                sb.append(C64052u8.A08(restoreFromBackupActivity.A00, j2));
            }
            if (a1c.A02) {
                j = 0;
            } else {
                j = j3;
            }
            restoreFromBackupActivity.A0o = j;
            if (j3 >= 0) {
                A103.setLength(0);
                A103.append(C88584aA.A03(restoreFromBackupActivity.A00, j3));
            }
            if (!a1c.A03) {
                sb.setLength(0);
                sb.append(C64052u8.A08(restoreFromBackupActivity.A00, restoreFromBackupActivity.A0L.A0G()));
                Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/local backup is newer than google drive backup, showing local backup timestamp.");
            }
            TextView A0I3 = AnonymousClass3MW.A0I(restoreFromBackupActivity, 2131431098);
            int i2 = 2131890743;
            if (a1c.A02) {
                i2 = 2131891802;
            }
            Object[] A1a = AnonymousClass8BR.A1a();
            A1a[0] = str;
            A1a[1] = sb.toString();
            A1a[2] = A103.toString();
            AnonymousClass3MY.A0y(restoreFromBackupActivity, A0I3, A1a, i2);
            A0y(restoreFromBackupActivity, a1c.A01);
            if (z) {
                A0t(restoreFromBackupActivity);
            } else {
                A0s(new AnonymousClass78J(restoreFromBackupActivity, 47), new AnonymousClass78J(restoreFromBackupActivity, 48), restoreFromBackupActivity, 2131892339);
                restoreFromBackupActivity.A0i = "backup_found";
                AnonymousClass8BT.A1A(restoreFromBackupActivity, "backup_found");
            }
            AnonymousClass8BR.A0q(restoreFromBackupActivity.A0g).A0C("backup_found");
        } else if (!a1c.A03) {
            C21457AkO.A01(restoreFromBackupActivity.A05, restoreFromBackupActivity, 43);
            Log.i("restore>RestoreFromBackupActivity/show-restore-transfer-selector-ui-with-google-backup/local backup is newer than google drive backup, showing local backup timestamp.");
        } else {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("restore>RestoreFromBackupActivity/show-restore-transfer-selector-ui-with-google-backup/");
            C17890vO.A1A(A104, C41361wE.A08(a1c.A05));
            A0x(restoreFromBackupActivity, j2);
        }
    }

    public static void A14(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        String str;
        Log.i("restore>RestoreFromBackupActivity/start to download message store");
        A1C a1c = restoreFromBackupActivity.A0A;
        if (a1c == null || !a1c.A02) {
            if (z) {
                str = "action_restore";
            } else {
                str = "action_resume_restore";
            }
            C25081Mu.A00(restoreFromBackupActivity, AnonymousClass1LU.A1M(restoreFromBackupActivity, str));
        } else {
            restoreFromBackupActivity.A0y.ByU(true);
        }
        C21457AkO.A00(restoreFromBackupActivity.A05, restoreFromBackupActivity, 40);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0.A02 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A16(boolean r9) {
        /*
            r8 = this;
            X.00H r0 = r8.A0g
            X.A8V r0 = X.AnonymousClass8BR.A0q(r0)
            if (r9 == 0) goto L_0x007d
            java.lang.String r7 = "restore_successful"
        L_0x000a:
            r0.A0C(r7)
            X.C17960vV.A02()
            X.A1C r0 = r8.A0A
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.A02
            r5 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r8.A0E
            if (r0 != 0) goto L_0x002b
            r0 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r0 = X.C110885hR.A0A(r8, r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r8.A0E = r0
        L_0x002b:
            r0.A03(r6)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r2 = X.AnonymousClass8BV.A0P(r8)
            r0 = 0
            r2.setPrimaryButtonText(r0)
            r2.setSecondaryButtonText(r0)
            android.widget.ProgressBar r0 = r8.A01
            X.C17960vV.A05(r0)
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r8.A03
            X.C17960vV.A05(r0)
            r0.setVisibility(r2)
            android.widget.TextView r0 = r8.A0r
            if (r0 != 0) goto L_0x0058
            r0 = 2131431173(0x7f0b0f05, float:1.8484068E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r8, r0)
            r8.A0r = r0
        L_0x0058:
            r0.setVisibility(r2)
            if (r9 == 0) goto L_0x0080
            r0 = 2131892338(0x7f121872, float:1.9419421E38)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r2 = X.AnonymousClass8BV.A0P(r8)
            java.lang.String r0 = r8.getString(r0)
            r2.setHeadlineText(r0)
            X.0zA r2 = r8.A05
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0080
            r2.A03()
            java.lang.String r0 = "checkVersionOnRestoreSuccess"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x007d:
            java.lang.String r7 = "restore_unsuccessful"
            goto L_0x000a
        L_0x0080:
            if (r5 == 0) goto L_0x00df
            X.1NP r2 = X.AnonymousClass8BU.A0B(r8)
            X.00H r0 = X.C20134A8u.A00
            r0 = 2
            r2.A0H(r0)
            android.content.res.Resources r4 = r8.getResources()
            r3 = 2131755155(0x7f100093, float:1.9141181E38)
            X.1Cd r0 = r8.A0N
            int r2 = r0.A03()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.1Cd r0 = r8.A0N
            int r0 = r0.A03()
            X.C17880vN.A1T(r1, r0, r6)
            java.lang.String r2 = r4.getQuantityString(r3, r2, r1)
            java.lang.String r0 = "restored_from_backup_bg_media"
        L_0x00aa:
            r8.A0i = r0
            if (r9 != 0) goto L_0x00b1
            r0 = 0
            r8.A0i = r0
        L_0x00b1:
            X.AnonymousClass8BT.A1A(r8, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/restore-media/ "
            X.C17900vP.A0f(r0, r2, r1)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r0 = X.AnonymousClass8BV.A0P(r8)
            r0.setFootnoteText(r2)
            X.AFG r2 = new X.AFG
            r2.<init>(r8, r6, r9, r5)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r1 = X.AnonymousClass8BV.A0P(r8)
            r0 = 2131899268(0x7f123384, float:1.9433477E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setPrimaryButtonText(r0)
            r1.setPrimaryButtonClickListener(r2)
            r0 = 0
            r1.setSecondaryButtonText(r0)
            return
        L_0x00df:
            android.content.res.Resources r4 = r8.getResources()
            r3 = 2131755156(0x7f100094, float:1.9141183E38)
            X.1Cd r0 = r8.A0N
            int r2 = r0.A03()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.1Cd r0 = r8.A0N
            int r0 = r0.A03()
            X.C17880vN.A1T(r1, r0, r6)
            java.lang.String r2 = r4.getQuantityString(r3, r2, r1)
            java.lang.String r0 = "restored_from_backup_no_media"
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A16(boolean):void");
    }

    private boolean A17() {
        if (this.A11.size() >= this.A10.size() || !this.A15.get()) {
            return false;
        }
        return true;
    }

    public static boolean A1A(RestoreFromBackupActivity restoreFromBackupActivity) {
        if (restoreFromBackupActivity.A08.A03() || !AnonymousClass74O.A0S(restoreFromBackupActivity.A0A, AnonymousClass73I.A04())) {
            return false;
        }
        restoreFromBackupActivity.A0r(8);
        return true;
    }

    public void A2y() {
        if (!this.A0m) {
            this.A0m = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r3 = r2.A00;
            C63932tv.A01(r2, r3, this);
            C63662tU.A00(r2, r3, this, r3.A5A);
            this.A01 = AnonymousClass3MY.A0Z(r2);
            this.A00 = AnonymousClass10G.A51(r3);
            this.A00 = AnonymousClass1K1.A1f(A002);
            this.A07 = C72453Mb.A0d(r2);
            this.A0H = AnonymousClass3MZ.A0l(r2);
            this.A0T = AnonymousClass3MY.A0Z(r2);
            this.A0a = AnonymousClass8BU.A0e(r2);
            this.A0S = AnonymousClass3Ma.A0g(r2);
            C19890zB r1 = C19890zB.A00;
            this.A04 = r1;
            this.A06 = C108965cb.A0H(r2);
            this.A0g = C000200d.A00(r2.A4U);
            this.A0R = C72463Mc.A0e(r2);
            this.A0b = AnonymousClass8BT.A0g(r2);
            this.A0K = AnonymousClass3MZ.A0n(r2);
            this.A09 = (AnonymousClass1NT) r2.A3f.get();
            this.A0J = (AnonymousClass196) r2.AJ6.get();
            this.A0P = (AnonymousClass1DK) r2.A6s.get();
            this.A0L = (C27431Wb) r2.A6f.get();
            this.A0h = C000200d.A00(A002.A5g);
            this.A0e = C000200d.A00(r2.A2b);
            this.A0Y = (C195939uB) r2.A0e.get();
            this.A0Q = (C134036pu) r3.AB8.get();
            this.A0C = (C196239ug) r2.A4d.get();
            this.A0N = (AnonymousClass1Cd) r2.A6i.get();
            this.A0V = AnonymousClass8BU.A0c(r2);
            this.A0F = (C19948A0f) r2.A9X.get();
            this.A0I = AnonymousClass3Ma.A0b(r2);
            this.A0c = C000200d.A00(r2.A9q);
            this.A0f = AnonymousClass8BT.A0f(r2);
            this.A0Z = (AnonymousClass1NL) r2.A3u.get();
            this.A0X = C72463Mc.A0i(r3);
            this.A0W = AnonymousClass8BW.A0T(r2);
            this.A08 = (AnonymousClass1NW) r2.A0h.get();
            this.A0d = C000200d.A00(r2.A0j);
            this.A0O = (AnonymousClass1WZ) r2.A6j.get();
            this.A0U = AnonymousClass3Ma.A0r(r2);
            this.A0B = (C36801oU) r2.A4c.get();
            this.A0D = (C36841oY) r2.A4f.get();
            this.A05 = r1;
        }
    }

    public void A4j(C192039nf r5, int i) {
        Integer num;
        RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0G;
        C17960vV.A07(restoreFromBackupViewModel);
        restoreFromBackupViewModel.A00 = i;
        this.A0M = r5;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("restore>RestoreFromBackupActivity/state ");
        A102.append(A0V(i));
        A102.append(" ");
        Object obj = r5;
        if (r5 == null) {
            obj = "";
        }
        C17900vP.A0b(obj, A102);
        C19830z4 r2 = this.A0A;
        int i2 = this.A0G.A00;
        C192039nf r0 = this.A0M;
        if (r0 != null) {
            num = Integer.valueOf(r0.A00);
        } else {
            num = null;
        }
        SharedPreferences.Editor A002 = C19830z4.A00(r2);
        A002.putInt("gdrive_activity_state", i2);
        if (num != null) {
            A002.putInt("gdrive_activity_msgstore_init_key", num.intValue());
        } else {
            A002.remove("gdrive_activity_msgstore_init_key");
        }
        A002.apply();
    }

    public void A4k(boolean z) {
        C195999uI r4;
        if (z || !A18()) {
            Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup");
            AnonymousClass8BV.A12(this, 2131431172);
            C110885hR.A0A(this, 2131431180).setVisibility(0);
            this.A16.open();
            A0c();
            AnonymousClass8BV.A0P(this).setFootnoteText((CharSequence) null);
            String A082 = C64052u8.A08(this.A00, this.A0L.A0G());
            AnonymousClass3MY.A0y(this, AnonymousClass3MW.A0I(this, 2131431098), new Object[]{A082}, 2131891803);
            RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0G;
            C17960vV.A07(restoreFromBackupViewModel);
            C20334AGq.A00(this, restoreFromBackupViewModel.A01, 4);
            RestoreFromBackupViewModel restoreFromBackupViewModel2 = this.A0G;
            C21424Ajr.A00(restoreFromBackupViewModel2.A09, restoreFromBackupViewModel2, 8);
            if (!this.A0L.A0Q()) {
                r4 = new C195999uI((C19986A1x) null, false);
            }
            A0y(this, r4);
            if (this.A0E == null) {
                this.A0E = (GoogleDriveRestoreAnimationView) findViewById(2131431178);
            }
            TextView A0I2 = AnonymousClass3MW.A0I(this, 2131434654);
            this.A0C.get();
            int i = 2131896126;
            if (AnonymousClass11Z.A00()) {
                i = 2131895473;
            }
            A0I2.setText(i);
            if (z) {
                AnonymousClass8BR.A0q(this.A0g).A0I("backup_found", "restore");
                if (!A1A(this)) {
                    A0z(this, r4, C179389Ht.TRIGGER_RESTORE_FROM_LOCAL_BACKUP);
                }
            } else {
                A0s(new AnonymousClass78Q((Object) this, (Object) r4, 20), new AnonymousClass78J(this, 43), this, 2131892339);
                this.A0i = null;
                AnonymousClass8BT.A1A(this, "unknown");
            }
            AnonymousClass8BR.A0q(this.A0g).A0C("backup_found");
            return;
        }
        Log.i("restore>RestoreFromBackupActivity/show-restore-transfer-selector-ui-for-local-backup");
        C21457AkO.A01(this.A05, this, 38);
    }

    public void BrZ(int i) {
        String str;
        String str2;
        if (i == 10 || i == 11) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("restore>RestoreFromBackupActivity/user clicked skip restore for");
            if (i == 11) {
                str = "google";
            } else {
                str = "local";
            }
            A102.append(str);
            C17890vO.A1A(A102, "backup");
        } else if (i == 12) {
            Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user agreed to restore media on cellular.");
            C17880vN.A1E(AnonymousClass8BT.A04(AnonymousClass8BU.A0B(this)), "gdrive_media_restore_network_setting", String.valueOf(1));
            Log.i("restore>RestoreFromBackupActivity/start to restore media");
            AnonymousClass8BU.A0B(this).A09();
            C25081Mu.A00(this, AnonymousClass1LU.A1M(this, "action_restore_media"));
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
            setResult(3);
            finish();
        } else if (i == 14) {
            Log.i("restore>RestoreFromBackupActivity/no-local-or-gdrive-backup-found-dialog/no google drive backups found and user is not interested in adding an account for that either.");
            if (A18()) {
                A0x(this, 0);
                return;
            }
            A0u(this);
            setResult(1);
        } else if (i == 16) {
            Log.i("restore>RestoreFromBackupActivity/one-time-setup-is-taking-too-long/user decided to cancel looking for backups");
            A84.A02();
            this.A13.set(true);
            if (this.A0L.A0E() > 0) {
                A4j((C192039nf) null, 23);
                A4k(false);
                return;
            }
            A0d();
            A4e(false);
        } else {
            if (i == 18) {
                Log.i("restore>RestoreFromBackupActivity/failed-to-restore-messages-from-selected-backup/user decided to continue without restore");
                A0d();
            } else {
                if (i == 19) {
                    str2 = "restore>RestoreFromBackupActivity/failed-to-restore-messages/internal-storage-out-of-free-space/user clicked ok";
                } else if (i == 20) {
                    if (A17()) {
                        str2 = "restore>RestoreFromBackupActivity/msgstore-jid-mismatch/restore-from-older";
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mismatch/skip");
                    }
                } else if (i == 22) {
                    AnonymousClass8BT.A14(this, Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history"), "android.intent.action.VIEW");
                    return;
                } else if (i == 23 || i == 27) {
                    AnonymousClass8BT.A14(this, Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history"), "android.intent.action.VIEW");
                    A15(true);
                    return;
                } else {
                    throw AnonymousClass8BX.A0W("unexpected dialog box: ", AnonymousClass000.A10(), i);
                }
                Log.i(str2);
                A15(true);
                return;
            }
            A4e(false);
            A16(false);
        }
    }

    public void Bra(int i) {
        if (i == 13) {
            Log.i("restore>RestoreFromBackupActivity/insufficient-space-dialog/neutral-click");
            return;
        }
        throw AnonymousClass8BX.A0W("unexpected dialog box: ", AnonymousClass000.A10(), i);
    }

    public void Brb(int i) {
        String str;
        if (i == 10) {
            Log.i("restore>RestoreFromBackupActivity/show-restore/user declined to restore from local backup");
            setResult(2);
            A0u(this);
        } else if (i == 11) {
            Log.i("restore>RestoreFromBackupActivity/user confirmed to skip restore");
            if (this.A0L.A0E() <= 0 || !this.A15.get()) {
                A4h();
                return;
            }
            A4j((C192039nf) null, 23);
            A4k(false);
        } else {
            if (i == 12) {
                Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user declined to restore media on cellular.");
                setResult(3);
            } else {
                if (i == 13) {
                    Log.i("restore>RestoreFromBackupActivity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
                } else if (i == 14) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup/no google drive backups found and user decided to add an account or give permission to an existing one.");
                    Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                    Arrays.sort(accountsByType, new C21479Akk(this, 2));
                    int length = accountsByType.length;
                    int i2 = length + 1;
                    String[] strArr = new String[i2];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = accountsByType[i3].name;
                    }
                    int i4 = i2 - 1;
                    strArr[i4] = getString(2131890787);
                    String[] strArr2 = new String[i2];
                    boolean[] zArr = new boolean[i2];
                    List list = this.A10;
                    list.clear();
                    for (int i5 = 0; i5 < length; i5++) {
                        Account account = accountsByType[i5];
                        list.add(account);
                        if (this.A11.contains(account)) {
                            strArr2[i5] = getString(2131890806);
                            zArr[i5] = false;
                        } else {
                            strArr2[i5] = null;
                            zArr[i5] = true;
                        }
                    }
                    zArr[i4] = true;
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A092 = AnonymousClass8BY.A09(this);
                    A092.putStringArray("multi_line_list_items_key", strArr);
                    A092.putStringArray("multi_line_list_item_values_key", strArr2);
                    A092.putBooleanArray("list_item_enabled_key", zArr);
                    A092.putString("disabled_item_toast_key", getString(2131890736));
                    singleChoiceListDialogFragment.A1R(A092);
                    if (!A19(this)) {
                        AnonymousClass3MY.A1H(singleChoiceListDialogFragment, this, (String) null);
                        return;
                    }
                    return;
                } else if (i == 15) {
                    Log.i("restore>RestoreFromBackupActivity/google-play-services-is-broken/user decided to skip restore");
                    setResult(1);
                } else if (i == 16) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup-taking-too-long/user decided to wait for restore");
                    return;
                } else {
                    if (i == 18) {
                        Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/restoring from an older backup");
                    } else if (i != 19) {
                        if (i == 20) {
                            Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mistmatch/user decided to re-register");
                            C18010vc r1 = this.A0U;
                            Log.i("RegistrationUtils/clearAllRegistrationPref");
                            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(r1, C33841jT.A01(this, "com.whatsapp.registration.phonenumberentry.RegisterPhone"));
                            A082.clear();
                            if (!A082.commit()) {
                                Log.w("RegistrationUtils/clearAllRegistrationPref/failed");
                            }
                            this.A0V.A0A();
                            Intent A0A2 = AnonymousClass1LU.A0A(this);
                            A0A2.setFlags(268435456);
                            startActivity(A0A2);
                            this.A0J.A04("RestoreFromBackupActivity");
                            return;
                        } else if (i == 21) {
                            Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/re-enter-encryption-key");
                            A15(false);
                            return;
                        } else if (i == 22) {
                            return;
                        } else {
                            if (i != 23) {
                                if (i != 27) {
                                    throw AnonymousClass8BX.A0W("restore>RestoreFromBackupActivity/unexpected dialog box: ", AnonymousClass000.A10(), i);
                                }
                                return;
                            }
                        }
                    }
                    A15(true);
                    return;
                }
                if (C108975cc.A1C(Build.VERSION.SDK_INT, 26)) {
                    str = "android.os.storage.action.MANAGE_STORAGE";
                } else {
                    str = "android.settings.INTERNAL_STORAGE_SETTINGS";
                }
                startActivityForResult(C108945cZ.A0G(str), 7);
                return;
            }
            finish();
        }
    }

    public void Brp(int i) {
        if (i == 17) {
            Log.i("restore>RestoreFromBackupActivity/account-selector-dialog/user dismissed the dialog");
            A11(this, true);
            return;
        }
        throw AnonymousClass8BX.A0W("Unexpected dialog id:", AnonymousClass000.A10(), i);
    }

    public void C5j(String[] strArr, int i, int i2) {
        if (i != 17) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Unexpected dialogId: ");
            A102.append(i);
            throw AnonymousClass8BX.A0W(" index:", A102, i2);
        } else if (strArr[i2].equals(getString(2131890787))) {
            ((Executor) C20134A8u.A00.get()).execute(new C21453AkK(this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), 20));
            Log.i("restore>RestoreFromBackupActivity/show-accounts/waiting-for-add-account-activity-to-return");
        } else {
            Intent A0A2 = C17880vN.A0A();
            A0A2.putExtra("authAccount", strArr[i2]);
            onActivityResult(3, -1, A0A2);
        }
    }

    public void onBackPressed() {
        if (C17880vN.A0I(this.A0b).A0J(false)) {
            Log.i("restore>RestoreFromBackupActivity/onBackPressed/is adding new account");
            A9B.A0L(this, (Runnable) null, (String) null, this.A0B.A01(), this.A0A.A0E());
            return;
        }
        AnonymousClass1L9.A02(this);
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        super.onNewIntent(intent2);
        if (intent2.getAction() == null) {
            Log.e("restore>RestoreFromBackupActivity/new-intent action is null");
        } else if (!intent2.getAction().equals("action_show_restore_one_time_setup")) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("restore>RestoreFromBackupActivity/new-intent/unexpected action: ");
            C17890vO.A19(A102, intent2.getAction());
            finish();
        } else {
            Dialog A012 = C20134A8u.A01(this, new A9Q(this, 2), C41371wF.A00(this.A0H.A00), 2, false);
            if (A012 != null && !A19(this)) {
                boolean z = C72453Mb.A0M(this).getBoolean("new_jid", false);
                C17900vP.A0n("gdrive-util/is-new-jid/", AnonymousClass000.A10(), z);
                if (!z) {
                    Log.i("restore>RestoreFromBackupActivity/new-intent/existing user with unavailable google play services");
                    A012.show();
                    return;
                }
            }
            if (AnonymousClass8BR.A0z(this) == null) {
                A11(this, false);
            } else if (AnonymousClass000.A1T(AnonymousClass8BU.A0B(this).A05(), 3)) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/continue-msgstore-download");
                AnonymousClass8BS.A0z(this, 2131431172, 8);
                AnonymousClass8BS.A0z(this, 2131431180, 0);
                A4g();
                String A0z2 = AnonymousClass8BR.A0z(this);
                C17960vV.A07(A0z2);
                long A0V2 = this.A0A.A0V(A0z2);
                long A0U2 = this.A0A.A0U(A0z2);
                String string = getString(2131890667);
                if (A0U2 > 0) {
                    string = C64052u8.A08(this.A00, A0U2);
                }
                if (!AnonymousClass8BU.A0B(this).A0Q()) {
                    string = C64052u8.A08(this.A00, this.A0L.A0G());
                }
                String A032 = C88584aA.A03(this.A00, A0V2);
                if (this.A0A == null) {
                    this.A0A = new A1C(A0Q(this), A0z2, A0U2, A0V2, AnonymousClass8BU.A0B(this).A0Q(), false);
                }
                TextView A0I2 = AnonymousClass3MW.A0I(this, 2131431098);
                Object[] A1a = C108945cZ.A1a(A0z2, string, 3, 1);
                A1a[2] = A032;
                AnonymousClass3MY.A0y(this, A0I2, A1a, 2131890743);
                A0y(this, this.A0A.A01);
                A14(this, false);
            } else if (AnonymousClass8BV.A02(this.A0d) != 0) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/msgstore-download-already-finished, restoring");
                AnonymousClass8BS.A0z(this, 2131431172, 8);
                AnonymousClass8BS.A0z(this, 2131431180, 0);
                RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0G;
                C17960vV.A07(restoreFromBackupViewModel);
                AnonymousClass1DT r1 = restoreFromBackupViewModel.A03;
                C20334AGq.A00(this, r1, 5);
                Number A1C = C108945cZ.A1C(r1);
                if (A1C != null) {
                    long longValue = A1C.longValue();
                    TextView textView = this.A02;
                    C17960vV.A05(textView);
                    textView.setText(A3f.A02(this, this.A00, longValue));
                }
                RestoreFromBackupViewModel restoreFromBackupViewModel2 = this.A0G;
                C21424Ajr.A00(restoreFromBackupViewModel2.A09, restoreFromBackupViewModel2, 7);
                A0y(this, A0Q(this));
                A4g();
                A10(this, true);
            } else {
                A0u(this);
                setResult(2);
            }
        }
    }

    public void setTitle(int i) {
        int i2 = 2131436280;
        if (this.A0A.A2L()) {
            i2 = 2131436281;
        }
        this.A0s.setText(i);
        A9B.A0T(this, this.A0R, i2);
    }

    public static C195999uI A0Q(RestoreFromBackupActivity restoreFromBackupActivity) {
        String string = C72453Mb.A0M(restoreFromBackupActivity).getString("gdrive_last_restore_file_encryption_metadata", (String) null);
        if (string == null) {
            return new C195999uI((C19986A1x) null, false);
        }
        try {
            JSONObject A162 = C17880vN.A16(string);
            boolean z = A162.getBoolean("isPasswordOrEncryptionKeyEncrypted");
            JSONObject optJSONObject = A162.optJSONObject("passkeyEncryptionMetadata");
            C19986A1x a1x = null;
            if (optJSONObject != null) {
                a1x = C19986A1x.A04.A00(optJSONObject);
            }
            return new C195999uI(a1x, z);
        } catch (JSONException e) {
            C17960vV.A0F(false, AnonymousClass001.A1E(e, "Failed to parse encryption metadata from WaSharedPreferences: ", AnonymousClass000.A10()));
            return new C195999uI((C19986A1x) null, false);
        }
    }

    public static String A0V(int i) {
        switch (i) {
            case 21:
                return "new";
            case 22:
                return "restore-from-gdrive";
            case 23:
                return "restore-from-local";
            case 24:
                return "restoring-from-gdrive";
            case 25:
                return "return-from-auth";
            case 26:
                return "msgstore-restored";
            case 27:
                return "restoring-from-local";
            default:
                throw AnonymousClass8BX.A0W("Unknown state: ", AnonymousClass000.A10(), i);
        }
    }

    public static void A0s(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, RestoreFromBackupActivity restoreFromBackupActivity, int i) {
        WDSTextLayout A0P2 = AnonymousClass8BV.A0P(restoreFromBackupActivity);
        A0P2.setPrimaryButtonText(restoreFromBackupActivity.getString(i));
        A0P2.setPrimaryButtonClickListener(onClickListener);
        A0P2.setSecondaryButtonText(restoreFromBackupActivity.getString(2131899432));
        A0P2.setSecondaryButtonClickListener(onClickListener2);
    }

    public static void A0w(RestoreFromBackupActivity restoreFromBackupActivity, int i, int i2) {
        C17960vV.A02();
        if (!A19(restoreFromBackupActivity)) {
            AnonymousClass4VU r1 = new AnonymousClass4VU(27);
            AnonymousClass8BW.A11(restoreFromBackupActivity, r1, i);
            AnonymousClass8BS.A12(restoreFromBackupActivity, r1, i2);
            r1.A05(false);
            AnonymousClass8BS.A11(restoreFromBackupActivity, r1, 2131899286);
            AnonymousClass8BV.A18(AnonymousClass3Ma.A0H(restoreFromBackupActivity), AnonymousClass8BW.A0I(restoreFromBackupActivity, r1, 2131899101), (String) null);
        }
    }

    public static void A0x(RestoreFromBackupActivity restoreFromBackupActivity, long j) {
        Intent putExtra = C17880vN.A0A().setClassName(restoreFromBackupActivity.getPackageName(), "com.whatsapp.backup.google.RestoreTransferSelectorActivity").putExtra("backup_time", j);
        C18070vi.A0X(putExtra);
        restoreFromBackupActivity.startActivityForResult(putExtra, 25);
    }

    public static void A11(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        boolean A032;
        C17960vV.A02();
        Log.i("restore>RestoreFromBackupActivity/perform-one-time-setup");
        RestoreFromBackupActivity restoreFromBackupActivity2 = restoreFromBackupActivity;
        boolean z2 = !restoreFromBackupActivity2.A08.A01();
        if (restoreFromBackupActivity2.A08.A02()) {
            A032 = C72463Mc.A1W(restoreFromBackupActivity2.A0e);
        } else {
            A032 = restoreFromBackupActivity2.A08.A03();
        }
        boolean A1P = AnonymousClass000.A1P(A032 ? 1 : 0);
        if (z2 || A1P) {
            if (!z) {
                restoreFromBackupActivity2.A0r(5);
                return;
            } else if (A1P) {
                restoreFromBackupActivity2.setResult(1);
                restoreFromBackupActivity2.finish();
                return;
            } else {
                restoreFromBackupActivity2.A4j((C192039nf) null, 23);
                restoreFromBackupActivity2.A4k(false);
            }
        }
        Account[] A012 = C41371wF.A01(restoreFromBackupActivity2.A0H.A00);
        List list = restoreFromBackupActivity2.A10;
        list.clear();
        Collections.addAll(list, A012);
        AnonymousClass1KB r39 = restoreFromBackupActivity2.A05;
        AnonymousClass118 r26 = restoreFromBackupActivity2.A0H;
        AnonymousClass1L7 r25 = restoreFromBackupActivity2.A04;
        Set set = restoreFromBackupActivity2.A11;
        AtomicBoolean atomicBoolean = restoreFromBackupActivity2.A15;
        C27431Wb r28 = restoreFromBackupActivity2.A0L;
        C19830z4 r27 = restoreFromBackupActivity2.A0A;
        C18030ve r18 = restoreFromBackupActivity2.A0E;
        AnonymousClass11W r17 = restoreFromBackupActivity2.A0a;
        AnonymousClass10I r15 = restoreFromBackupActivity2.A05;
        C218617r r11 = restoreFromBackupActivity2.A04;
        AnonymousClass181 r10 = restoreFromBackupActivity2.A06;
        AnonymousClass1NT r9 = restoreFromBackupActivity2.A09;
        AnonymousClass1DK r8 = restoreFromBackupActivity2.A0P;
        C195939uB r7 = restoreFromBackupActivity2.A0Y;
        C19948A0f a0f = restoreFromBackupActivity2.A0F;
        AnonymousClass1NL r5 = restoreFromBackupActivity2.A0Z;
        AnonymousClass1NW r4 = restoreFromBackupActivity2.A08;
        C18030ve r30 = r18;
        C218617r r172 = r11;
        AnonymousClass181 r182 = r10;
        AnonymousClass1NW r19 = r4;
        AnonymousClass1NT r20 = r9;
        C177959Bg r16 = new C177959Bg(r39, restoreFromBackupActivity2.A0B, restoreFromBackupActivity2, new C188789hz(r172, r182, r19, r20, restoreFromBackupActivity2, a0f, restoreFromBackupActivity2.A0z, restoreFromBackupActivity2.A07, r25, r26, r27, r28, r8, r30, r7, r5, r17, r15, restoreFromBackupActivity2.A0d, atomicBoolean, restoreFromBackupActivity2.A12), r25, r26, r27, r28, set, atomicBoolean, restoreFromBackupActivity2.A13, A012);
        restoreFromBackupActivity2.A0t = r16;
        restoreFromBackupActivity2.A05.CGD(r16, new Object[0]);
    }

    private void A15(boolean z) {
        C17960vV.A02();
        A0s(new AnonymousClass78J(this, 47), new AnonymousClass78J(this, 48), this, 2131892339);
        AnonymousClass8BV.A0P(this).setFootnoteText((CharSequence) null);
        C110885hR.A0A(this, 2131434654).setVisibility(0);
        AnonymousClass8BV.A0P(this).setFootnoteText(getString(2131899056));
        AnonymousClass8BS.A0z(this, 2131431172, 0);
        C110885hR.A0A(this, 2131431178).setVisibility(8);
        AnonymousClass8BS.A0z(this, 2131431174, 8);
        AnonymousClass8BS.A0z(this, 2131431175, 8);
        AnonymousClass8BS.A0z(this, 2131431180, 8);
        AnonymousClass8BS.A0z(this, 2131431173, 8);
        File databasePath = getDatabasePath("msgstore.db");
        if (databasePath.exists()) {
            boolean delete = databasePath.delete();
            StringBuilder A112 = AnonymousClass000.A11("restore>RestoreFromBackupActivity/show-msgstore-downloading-view/restore-failed ");
            if (!delete) {
                A112.append(databasePath);
                C17890vO.A1B(A112, " exists but cannot be deleted, message restore might fail");
            } else {
                A112.append(databasePath);
                C17890vO.A1A(A112, " deleted");
            }
        }
        this.A0O.A01();
        A11(this, !z);
    }

    private boolean A18() {
        if (AnonymousClass112.A01() && !C17880vN.A1W(C72453Mb.A0M(this), "chat_transfer_finished")) {
            if (!C18020vd.A05(C18040vf.A02, this.A0R, 4485)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A19(RestoreFromBackupActivity restoreFromBackupActivity) {
        if (AnonymousClass4Yv.A02(restoreFromBackupActivity) || restoreFromBackupActivity.A0l) {
            return true;
        }
        return false;
    }

    public static boolean A1B(RestoreFromBackupActivity restoreFromBackupActivity, String str, int i) {
        C17960vV.A00();
        AnonymousClass8BY.A1H("restore>RestoreFromBackupActivity/auth-request/ account being used is ", str, AnonymousClass000.A10());
        restoreFromBackupActivity.A05.CGF(new C21454AkL(restoreFromBackupActivity, str, i, 0));
        Log.i("restore>RestoreFromBackupActivity/auth-request/blocking on tokenReceived");
        restoreFromBackupActivity.A0x.block(100000);
        return AnonymousClass000.A1W(restoreFromBackupActivity.A0k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x019a, code lost:
        if (A17() == false) goto L_0x019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4d(X.C192039nf r11) {
        /*
            r10 = this;
            X.C17960vV.A02()
            boolean r0 = r10.A0u
            if (r0 == 0) goto L_0x000b
            r10.finish()
        L_0x000a:
            return
        L_0x000b:
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = r10.A0G
            X.C17960vV.A07(r0)
            int r0 = r0.A00
            r2 = 26
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 != r2) goto L_0x0020
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/state-is-msgstore-restored/call-ignored "
            X.C17900vP.A0Y(r11, r0, r1)
            return
        L_0x0020:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/status:"
            X.C17900vP.A0Y(r11, r0, r1)
            r10.A4j(r11, r2)
            int r7 = r11.A00
            r0 = 2
            r3 = 1
            r2 = 0
            boolean r4 = X.AnonymousClass000.A1S(r7, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r7)
            java.lang.String r0 = " is unexpected here"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C17960vV.A0F(r4, r0)
            if (r7 == r3) goto L_0x0271
            r0 = 21
            if (r7 == r0) goto L_0x0271
            r0 = 5
            if (r7 != r0) goto L_0x00a7
            X.C17960vV.A02()
            boolean r0 = A19(r10)
            if (r0 != 0) goto L_0x000a
            r0 = 2131890712(0x7f121218, float:1.9416124E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "restore-failure-low-on-storage-learn-more"
            android.text.SpannableStringBuilder r4 = r10.A03(r1, r0)
            r0 = 19
            X.4VU r1 = new X.4VU
            r1.<init>(r0)
            r0 = 2131890716(0x7f12121c, float:1.9416132E38)
            X.AnonymousClass8BW.A11(r10, r1, r0)
            r1.A02(r4)
            r1.A01()
            r1.A05(r2)
            r0 = 2131887456(0x7f120560, float:1.940952E38)
            java.lang.String r4 = r10.getString(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x008a
            r0 = 2131887449(0x7f120559, float:1.9409505E38)
            java.lang.String r4 = r10.getString(r0)
        L_0x008a:
            r1.A04(r4)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
        L_0x0090:
            java.lang.String r0 = r10.getString(r2)
            r1.A03(r0)
        L_0x0097:
            com.whatsapp.dialogs.PromptDialogFragment r2 = r1.A00()
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r10)
            r0 = 0
            r1.A0B(r2, r0)
            r1.A00(r3)
            return
        L_0x00a7:
            java.lang.String r4 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ed
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/storage-state/error-external-storage-unavailable/state="
            X.C17900vP.A0g(r0, r4, r1)
            X.C17960vV.A02()
            boolean r0 = A19(r10)
            if (r0 != 0) goto L_0x000a
            r0 = 23
            X.4VU r1 = new X.4VU
            r1.<init>(r0)
            r0 = 2131890716(0x7f12121c, float:1.9416132E38)
            X.AnonymousClass8BW.A11(r10, r1, r0)
            r0 = 2131890713(0x7f121219, float:1.9416126E38)
            X.AnonymousClass8BS.A12(r10, r1, r0)
            r1.A05(r2)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            X.AnonymousClass8BS.A11(r10, r1, r0)
            r2 = 2131899101(0x7f1232dd, float:1.9433138E38)
            goto L_0x0090
        L_0x00ed:
            X.1NW r0 = r10.A08
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x010d
            X.17x r1 = r10.A0I
            java.lang.String[] r0 = X.AnonymousClass73I.A04()
            int r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = "restore>RestoreFromBackupActivity/storage-state/error-permission-unavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r10.A15(r3)
            A1A(r10)
            return
        L_0x010d:
            X.A1C r1 = r10.A0A
            if (r1 == 0) goto L_0x0259
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0259
            java.util.Set r5 = r10.A11
            java.lang.String r4 = r1.A05
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r4, r1)
            r5.add(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/failed/google drive backup is unrestorable for "
            r1.append(r0)
            X.A1C r0 = r10.A0A
            java.lang.String r0 = r0.A05
            java.lang.String r0 = X.C41361wE.A08(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0138:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = 3
            if (r7 != r6) goto L_0x01e9
            X.C17960vV.A02()
            boolean r0 = A19(r10)
            if (r0 != 0) goto L_0x000a
            X.1Wb r0 = r10.A0L
            java.util.Set r0 = r0.A0f
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r9 = r1.toArray(r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/get-jid-mismatch-message for "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r9)
            X.C17890vO.A1A(r1, r0)
            int r0 = r9.length
            if (r0 != 0) goto L_0x01a1
            r0 = 2131890709(0x7f121215, float:1.9416117E38)
            java.lang.String r1 = r10.getString(r0)
        L_0x0171:
            java.lang.String r0 = "restore-failure-jid-mismatch-learn-more"
            android.text.SpannableStringBuilder r4 = r10.A03(r1, r0)
            r0 = 20
            X.4VU r1 = new X.4VU
            r1.<init>(r0)
            r0 = 2131890711(0x7f121217, float:1.9416122E38)
            X.AnonymousClass8BW.A11(r10, r1, r0)
            r1.A02(r4)
            r1.A01()
            r1.A05(r2)
            r0 = 2131890714(0x7f12121a, float:1.9416128E38)
            X.AnonymousClass8BS.A11(r10, r1, r0)
            boolean r0 = r10.A17()
            r2 = 2131895310(0x7f12240e, float:1.942545E38)
            if (r0 != 0) goto L_0x0090
        L_0x019c:
            r2 = 2131899432(0x7f123428, float:1.943381E38)
            goto L_0x0090
        L_0x01a1:
            r8 = 2
            if (r0 != r3) goto L_0x01be
            r7 = 2131890710(0x7f121216, float:1.941612E38)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            X.0z4 r0 = r10.A0A
            java.lang.String r0 = r0.A0m()
            java.lang.String r0 = X.AnonymousClass17K.A06(r0)
            r6[r2] = r0
            r0 = r9[r2]
            r6[r3] = r0
        L_0x01b9:
            java.lang.String r1 = r10.getString(r7, r6)
            goto L_0x0171
        L_0x01be:
            java.util.Arrays.sort(r9)
            int r0 = r0 - r3
            java.lang.String[] r5 = new java.lang.String[r0]
            r4 = r9[r0]
            java.lang.System.arraycopy(r9, r2, r5, r2, r0)
            r7 = 2131890708(0x7f121214, float:1.9416115E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.0z4 r0 = r10.A0A
            java.lang.String r0 = r0.A0m()
            java.lang.String r0 = X.AnonymousClass17K.A06(r0)
            r6[r2] = r0
            X.0vb r1 = r10.A00
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.lang.String r0 = X.C60592oI.A00(r1, r0, r2)
            r6[r3] = r0
            r6[r8] = r4
            goto L_0x01b9
        L_0x01e9:
            if (r7 != 0) goto L_0x01f9
            X.1KB r1 = r10.A05
            r0 = 45
            X.C21457AkO.A00(r1, r10, r0)
            X.10I r1 = r10.A05
            r0 = 46
            X.C21457AkO.A01(r1, r10, r0)
        L_0x01f9:
            java.util.List r0 = r10.A10
            java.lang.String r1 = ","
            android.text.TextUtils.join(r1, r0)
            java.util.Set r0 = r10.A11
            android.text.TextUtils.join(r1, r0)
            X.1NP r0 = X.AnonymousClass8BU.A0B(r10)
            X.2Qv r1 = r0.A08()
            X.2Qv r0 = X.C49532Qv.ENCRYPTION_KEY_ENCRYPTED
            if (r1 != r0) goto L_0x0232
            X.C17960vV.A02()
            boolean r0 = A19(r10)
            if (r0 != 0) goto L_0x000a
            r0 = 21
            X.4VU r1 = new X.4VU
            r1.<init>(r0)
            r0 = 2131890707(0x7f121213, float:1.9416113E38)
            X.AnonymousClass8BS.A12(r10, r1, r0)
            r1.A05(r2)
            r0 = 2131889835(0x7f120eab, float:1.9414345E38)
            X.AnonymousClass8BS.A11(r10, r1, r0)
            goto L_0x0097
        L_0x0232:
            boolean r0 = r10.A17()
            if (r0 == 0) goto L_0x0262
            X.C17960vV.A02()
            boolean r0 = A19(r10)
            if (r0 != 0) goto L_0x000a
            r0 = 18
            X.4VU r1 = new X.4VU
            r1.<init>(r0)
            r0 = 2131890715(0x7f12121b, float:1.941613E38)
            X.AnonymousClass8BS.A12(r10, r1, r0)
            r1.A05(r2)
            r0 = 2131895310(0x7f12240e, float:1.942545E38)
            X.AnonymousClass8BS.A11(r10, r1, r0)
            goto L_0x019c
        L_0x0259:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A15
            r0.set(r2)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/failed/local backup is unrestorable"
            goto L_0x0138
        L_0x0262:
            r10.A4e(r2)
            r10.A16(r2)
            X.1KB r1 = r10.A05
            r0 = 2131892332(0x7f12186c, float:1.941941E38)
            r1.A0E(r10, r0)
            return
        L_0x0271:
            X.10I r1 = r10.A05
            r0 = 44
            X.C21457AkO.A01(r1, r10, r0)
            r10.A16(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A4d(X.9nf):void");
    }

    public void A4g() {
        SharedPreferences A0B2;
        C17960vV.A02();
        Log.i("restore>RestoreFromBackupActivity/show-msgstore-downloading-view");
        WDSTextLayout A0P2 = AnonymousClass8BV.A0P(this);
        A0P2.setPrimaryButtonText((String) null);
        A0P2.setSecondaryButtonText((String) null);
        AnonymousClass8BV.A0P(this).setFootnoteText((CharSequence) null);
        AnonymousClass8BV.A12(this, 2131434654);
        C110885hR.A0A(this, 2131431178).setVisibility(0);
        AnonymousClass8BS.A0z(this, 2131431179, 0);
        ProgressBar progressBar = this.A01;
        C17960vV.A05(progressBar);
        progressBar.setVisibility(0);
        this.A01.setIndeterminate(true);
        TextView textView = this.A03;
        C17960vV.A05(textView);
        textView.setVisibility(0);
        this.A0r = AnonymousClass3MX.A0L(this, 2131431173);
        long j = this.A0p;
        if (j == 0) {
            AnonymousClass1NP A0B3 = AnonymousClass8BU.A0B(this);
            if (A0B3.A07().contains("gdrive_approx_media_download_size")) {
                A0B2 = A0B3.A07();
            } else {
                A0B2 = C17890vO.A0B(A0B3.A00);
            }
            j = A0B2.getLong("gdrive_approx_media_download_size", 0);
            this.A0p = j;
        }
        if (j > 0) {
            String A032 = C88584aA.A03(this.A00, j);
            TextView textView2 = this.A0r;
            C17960vV.A05(textView2);
            AnonymousClass3MY.A0y(this, textView2, new Object[]{A032}, 2131886438);
            this.A0r.setVisibility(0);
        }
    }

    public void A4h() {
        String A082;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("restore>RestoreFromBackupActivity/skip-restore/user declined to restore backup from ");
        A1C a1c = this.A0A;
        if (a1c == null) {
            A082 = "<unset account>";
        } else {
            A082 = C41361wE.A08(a1c.A05);
        }
        C17890vO.A1A(A102, A082);
        Log.i("restore>RestoreFromBackupActivity/skip-restore/stopping-approx-transfer-size-calc-thread");
        A1C a1c2 = this.A0A;
        if (a1c2 != null && a1c2.A01.A01) {
            A0q(6);
        }
        this.A12.set(true);
        AnonymousClass1NP A0B2 = AnonymousClass8BU.A0B(this);
        AnonymousClass00H r0 = C20134A8u.A00;
        A0B2.A0H(0);
        AnonymousClass8BU.A0B(this).A09();
        AnonymousClass8BU.A0B(this).A0G(0);
        AnonymousClass8BU.A0B(this).A0O(false);
        C21457AkO akO = new C21457AkO((Object) this, 47);
        if (C22781De.A03()) {
            this.A05.CGF(akO);
        } else {
            akO.run();
        }
        this.A0C.A05(10);
        String A0z2 = AnonymousClass8BR.A0z(this);
        if (A0z2 != null) {
            Intent A1M = AnonymousClass1LU.A1M(this, "action_remove_backup_info");
            A1M.putExtra("account_name", A0z2);
            A1M.putExtra("remove_account_name", true);
            C25081Mu.A00(this, A1M);
        }
        setResult(2);
        A0u(this);
    }

    public void A4i(long j, long j2) {
        String A0b2;
        C17960vV.A00();
        this.A0o = j;
        this.A0p = j2;
        AnonymousClass1NP A0B2 = AnonymousClass8BU.A0B(this);
        C17880vN.A1D(AnonymousClass8BT.A04(A0B2), "gdrive_approx_media_download_size", this.A0p);
        if (j <= 0) {
            A0b2 = getString(2131890679);
        } else {
            A0b2 = C108975cc.A0b(this, C88584aA.A03(this.A00, j), AnonymousClass3MW.A1a(), 2131890678);
        }
        this.A16.block();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("restore>RestoreFromBackupActivity/update-restore-info/ total download size: ");
        A102.append(j);
        C17900vP.A0m(" media download size: ", A102, j2);
        this.A05.A0J(new C21452AkJ(21, A0b2, this));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A112;
        String str;
        StringBuilder A113;
        String str2;
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str3 = "one-time-restore";
        this.A0W.A02(str3);
        C58712l8 r5 = (C58712l8) this.A0h.get();
        C33641j9 r4 = this.A0W;
        C192039nf r0 = this.A0M;
        if (r0 != null) {
            int i = r0.A00;
            if (i == 3) {
                A113 = AnonymousClass000.A11(str3);
                str2 = "-jid-mismatch";
            } else if (i == 4) {
                A113 = AnonymousClass000.A11(str3);
                str2 = "-integrity-check-failed";
            }
            str3 = AnonymousClass000.A0y(str2, A113);
        }
        int A002 = C41371wF.A00(this.A0H.A00);
        if (A002 != 0) {
            if (A002 == 1) {
                A112 = AnonymousClass000.A11(str3);
                str = "-no-gs";
            } else if (A002 != 2) {
                A112 = AnonymousClass000.A10();
                if (A002 != 3) {
                    A112.append(str3);
                    str = "-gs-invalid";
                } else {
                    A112.append(str3);
                    str = "-gs-disabled";
                }
            } else {
                A112 = AnonymousClass000.A11(str3);
                str = "-update-gs";
            }
            str3 = AnonymousClass000.A0y(str, A112);
        }
        r5.A01(this, r4, str3);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A1C a1c = this.A0A;
        if (a1c != null) {
            bundle.putBundle("restore_account_data", a1c.A01());
        }
        bundle.putLong("total_download_size", this.A0o);
        bundle.putLong("media_download_size", this.A0p);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("restore>RestoreFromBackupActivity/save-state/total-download-size:");
        A102.append(this.A0o);
        A102.append(", media-download-size:");
        A102.append(this.A0p);
        A102.append(", restore-account-data:");
        C17900vP.A0b(this.A0A, A102);
    }
}
