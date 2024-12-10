package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass11N;
import X.AnonymousClass11S;
import X.AnonymousClass12D;
import X.AnonymousClass12E;
import X.AnonymousClass18K;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1PY;
import X.AnonymousClass1QL;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1UN;
import X.AnonymousClass1UW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5LW;
import X.AnonymousClass5VZ;
import X.AnonymousClass8nK;
import X.AnonymousClass9Q2;
import X.BIE;
import X.C003401n;
import X.C127086dm;
import X.C133956pm;
import X.C146777Qo;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C19830z4;
import X.C219217x;
import X.C22821Di;
import X.C23520Bik;
import X.C33821jR;
import X.C36401np;
import X.C37301pI;
import X.C49642Rh;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C75273eH;
import X.C90064dT;
import X.C98844ro;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.Set;

public final class SettingsContactsActivity extends C75273eH implements AnonymousClass12D {
    public int A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public SwitchCompat A06;
    public SwitchCompat A07;
    public CircularProgressBar A08;
    public AnonymousClass1KB A09;
    public TextEmojiLabel A0A;
    public AnonymousClass1M9 A0B;
    public C127086dm A0C;
    public AnonymousClass12E A0D;
    public AnonymousClass1UW A0E;
    public C33821jR A0F;
    public AnonymousClass11N A0G;
    public C219217x A0H;
    public AnonymousClass1UN A0I;
    public AnonymousClass18K A0J;
    public AnonymousClass1PY A0K;
    public AnonymousClass1QL A0L;
    public AnonymousClass1QO A0M;
    public AnonymousClass1QS A0N;
    public C133956pm A0O;
    public SettingsRowPrivacyLinearLayout A0P;
    public SettingsRowPrivacyLinearLayout A0Q;
    public C36401np A0R;
    public C37301pI A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public String A0Z;
    public boolean A0a;
    public boolean A0b;
    public final Set A0c = C17880vN.A12();
    public volatile boolean A0d;

    public final void A4b(C22821Di r5, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        A0c(this, true);
        C127086dm r1 = this.A0C;
        if (r1 == null) {
            str = "contactsSharedPreferences";
        } else if (this.A0G != null) {
            C17880vN.A1D(C17890vO.A0A(r1.A01), "last_backup_settings_change_ms", System.currentTimeMillis());
            C133956pm r0 = this.A0O;
            if (r0 != null) {
                r0.A01(new AnonymousClass5VZ(this, r5, i, z, z2, z3, z4), z);
                return;
            }
            str = "settingsContactsUtil";
        } else {
            str = "systemTime";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void Bp4(C49642Rh r3) {
        C18070vi.A0d(r3, 0);
        C98844ro.A00(this.A05, this, 0);
        if (r3 instanceof AnonymousClass8nK) {
            Log.i("SettingsContactsActivity/backupon/iplskeysuccess");
            AnonymousClass12E r0 = this.A0D;
            if (r0 != null) {
                r0.A0A();
            } else {
                C18070vi.A11("contactSyncMethods");
                throw null;
            }
        } else {
            Log.e("SettingsContactsActivity/backupon/iplskeyerror");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.settings.SettingsContactsActivity r3) {
        /*
            X.00H r0 = r3.A0T
            if (r0 == 0) goto L_0x0080
            X.1pj r0 = X.AnonymousClass3MW.A0V(r0)
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x006e
            X.00H r0 = r3.A0T
            if (r0 == 0) goto L_0x0080
            X.1pj r0 = X.AnonymousClass3MW.A0V(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0M
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x006e
            java.util.Set r0 = r3.A0c
            int r2 = r0.size()
            X.1QO r0 = r3.A0M
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x005c
            X.1QL r0 = r3.A0L
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x005c
            X.1QS r0 = r3.A0N
            if (r0 == 0) goto L_0x0083
            X.BD1 r0 = r0.A06()
            X.9uc r1 = r0.BPW()
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x005c
            monitor-enter(r1)
            java.util.Set r0 = r1.A09     // Catch:{ all -> 0x0054 }
            int r0 = r0.size()     // Catch:{ all -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0057:
            java.lang.String r0 = "paymentAccountSetup"
            goto L_0x0085
        L_0x005a:
            monitor-exit(r1)
            int r2 = r2 + r0
        L_0x005c:
            if (r2 <= 0) goto L_0x0063
            java.lang.String r1 = java.lang.String.valueOf(r2)
            goto L_0x0075
        L_0x0063:
            r0 = 2131892980(0x7f121af4, float:1.9420724E38)
            java.lang.String r1 = X.AnonymousClass3MX.A15(r3, r0)
            goto L_0x0075
        L_0x006b:
            java.lang.String r0 = "paymentsGatingManager"
            goto L_0x0085
        L_0x006e:
            r0 = 2131887189(0x7f120455, float:1.9408978E38)
            java.lang.String r1 = X.C18070vi.A0F(r3, r0)
        L_0x0075:
            android.widget.TextView r0 = r3.A05
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "selectedBlockListPreferenceView"
            goto L_0x0085
        L_0x007c:
            r0.setText(r1)
            return
        L_0x0080:
            java.lang.String r0 = "blockListManager"
            goto L_0x0085
        L_0x0083:
            java.lang.String r0 = "paymentsManager"
        L_0x0085:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsContactsActivity.A03(com.whatsapp.settings.SettingsContactsActivity):void");
    }

    public static final void A0Q(SettingsContactsActivity settingsContactsActivity) {
        String str;
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = settingsContactsActivity.A0P;
        if (settingsRowPrivacyLinearLayout == null) {
            str = "contactsBackupLayout";
        } else {
            AnonymousClass1UN r0 = settingsContactsActivity.A0I;
            if (r0 != null) {
                settingsRowPrivacyLinearLayout.setVisibility(C72453Mb.A06(r0.A07() ? 1 : 0));
                SwitchCompat switchCompat = settingsContactsActivity.A07;
                if (switchCompat == null) {
                    str = "contactSyncSwitch";
                } else {
                    switchCompat.setChecked(AnonymousClass3MX.A1T(C72453Mb.A0M(settingsContactsActivity), "native_contacts_sync_all_contacts"));
                    SwitchCompat switchCompat2 = settingsContactsActivity.A06;
                    if (switchCompat2 == null) {
                        str = "contactBackupSwitch";
                    } else {
                        switchCompat2.setChecked(settingsContactsActivity.A0A.A2J());
                        return;
                    }
                }
            } else {
                str = "nativeContactGateKeeper";
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0V(SettingsContactsActivity settingsContactsActivity, int i) {
        C23520Bik A012 = C23520Bik.A01(settingsContactsActivity.A00, i, -1);
        BIE bie = A012.A0J;
        ViewGroup.MarginLayoutParams A0P2 = C72463Mc.A0P(bie);
        int dimensionPixelSize = settingsContactsActivity.getResources().getDimensionPixelSize(2131168774);
        A0P2.setMargins(dimensionPixelSize, A0P2.topMargin, dimensionPixelSize, dimensionPixelSize);
        bie.setLayoutParams(A0P2);
        A012.A08();
    }

    public static final void A0c(SettingsContactsActivity settingsContactsActivity, boolean z) {
        CircularProgressBar circularProgressBar = settingsContactsActivity.A08;
        if (z) {
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(0);
                SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = settingsContactsActivity.A0P;
                if (settingsRowPrivacyLinearLayout != null) {
                    settingsRowPrivacyLinearLayout.setClickable(false);
                    SwitchCompat switchCompat = settingsContactsActivity.A06;
                    if (switchCompat != null) {
                        switchCompat.setVisibility(4);
                        return;
                    }
                }
                C18070vi.A11("contactsBackupLayout");
                throw null;
            }
            C18070vi.A11("backupProgressBar");
            throw null;
        }
        if (circularProgressBar != null) {
            circularProgressBar.setVisibility(4);
            SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout2 = settingsContactsActivity.A0P;
            if (settingsRowPrivacyLinearLayout2 != null) {
                settingsRowPrivacyLinearLayout2.setClickable(true);
                SwitchCompat switchCompat2 = settingsContactsActivity.A06;
                if (switchCompat2 != null) {
                    switchCompat2.setVisibility(0);
                    return;
                }
            }
            C18070vi.A11("contactsBackupLayout");
            throw null;
        }
        C18070vi.A11("backupProgressBar");
        throw null;
        C18070vi.A11("contactBackupSwitch");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131626901);
        this.A0Z = C72453Mb.A0w(this);
        this.A00 = getIntent().getIntExtra("entry_point", -1);
        C003401n supportActionBar = getSupportActionBar();
        C72473Md.A16(supportActionBar);
        supportActionBar.A0M(2131893351);
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = (SettingsRowPrivacyLinearLayout) AnonymousClass3MY.A0H(this, 2131429501);
        this.A0Q = settingsRowPrivacyLinearLayout;
        if (settingsRowPrivacyLinearLayout != null) {
            settingsRowPrivacyLinearLayout.setVisibility(8);
            this.A07 = (SwitchCompat) AnonymousClass3MY.A0H(this, 2131429503);
            this.A0P = (SettingsRowPrivacyLinearLayout) AnonymousClass3MY.A0H(this, 2131429486);
            this.A06 = (SwitchCompat) AnonymousClass3MY.A0H(this, 2131429487);
            this.A08 = (CircularProgressBar) AnonymousClass3MY.A0H(this, 2131428032);
            this.A04 = (TextView) AnonymousClass3MY.A0H(this, 2131429500);
            this.A03 = (TextView) AnonymousClass3MY.A0H(this, 2131429499);
            TextView textView = this.A04;
            if (textView == null) {
                str = "contactsSyncTitle";
            } else {
                textView.setText(2131893377);
                TextView textView2 = this.A03;
                if (textView2 == null) {
                    str = "contactsSyncDescription";
                } else {
                    textView2.setText(2131893375);
                    TextView textView3 = (TextView) AnonymousClass3MY.A0H(this, 2131429485);
                    this.A02 = textView3;
                    if (textView3 == null) {
                        str = "contactsBackupTitle";
                    } else {
                        textView3.setText(2131893405);
                        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131429484);
                        this.A0A = textEmojiLabel;
                        C36401np r4 = this.A0R;
                        if (r4 != null) {
                            if (textEmojiLabel != null) {
                                SpannableStringBuilder A062 = r4.A06(textEmojiLabel.getContext(), new C146777Qo((Object) this, 46), getString(2131893404), "backup-contacts-learn-more", 2131101293);
                                TextEmojiLabel textEmojiLabel2 = this.A0A;
                                if (textEmojiLabel2 != null) {
                                    AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel2);
                                    TextEmojiLabel textEmojiLabel3 = this.A0A;
                                    if (textEmojiLabel3 != null) {
                                        textEmojiLabel3.setText(A062);
                                        View A0C2 = AnonymousClass3MY.A0C(this, 2131428224);
                                        this.A01 = A0C2;
                                        str = "blockListPreferenceView";
                                        AnonymousClass3Ma.A0E(A0C2, 2131435305).setText(2131887189);
                                        View view = this.A01;
                                        if (view != null) {
                                            this.A05 = AnonymousClass3Ma.A0E(view, 2131435304);
                                            AnonymousClass3MZ.A1U(this.A05, this, 48);
                                            SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout2 = this.A0Q;
                                            if (settingsRowPrivacyLinearLayout2 != null) {
                                                C90064dT.A00(settingsRowPrivacyLinearLayout2, this, 43);
                                                SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout3 = this.A0P;
                                                if (settingsRowPrivacyLinearLayout3 == null) {
                                                    str = "contactsBackupLayout";
                                                } else {
                                                    C90064dT.A00(settingsRowPrivacyLinearLayout3, this, 44);
                                                    View view2 = this.A01;
                                                    if (view2 != null) {
                                                        C90064dT.A00(view2, this, 42);
                                                        A0c(this, true);
                                                        AnonymousClass1PY r3 = this.A0K;
                                                        if (r3 != null) {
                                                            C19830z4 r2 = this.A0A;
                                                            C18070vi.A0W(r2);
                                                            AnonymousClass11S r1 = this.A02;
                                                            C18070vi.A0W(r1);
                                                            AnonymousClass9Q2.A00(r1, r2, r3, new AnonymousClass5LW(this));
                                                            return;
                                                        }
                                                        str = "graphQlClient";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C18070vi.A11("contactsBackupDescription");
                            throw null;
                        }
                        str = "linkifier";
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "contactsSyncLayout";
        C18070vi.A11(str);
        throw null;
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            SwitchCompat switchCompat = this.A07;
            if (switchCompat == null) {
                C18070vi.A11("contactSyncSwitch");
                throw null;
            }
            boolean isChecked = switchCompat.isChecked();
            boolean z = this.A0a;
            if (AnonymousClass3MX.A1T(C72453Mb.A0M(this), "native_contacts_sync_all_contacts") != isChecked) {
                C17880vN.A1F(C72453Mb.A0M(this).edit(), "native_contacts_sync_all_contacts", isChecked);
                C17880vN.A1F(C17890vO.A0B(this.A0A).edit(), "contact_sync_policy_reset", true);
            }
            if (C17880vN.A1W(C72453Mb.A0M(this), "native_contacts_delete_contacts") != z) {
                C17880vN.A1F(C72453Mb.A0M(this).edit(), "native_contacts_delete_contacts", z);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.A0d) {
            AnonymousClass3MZ.A1U(this.A05, this, 49);
        }
        A0Q(this);
    }
}
