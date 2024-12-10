package com.whatsapp.settings;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass126;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C003401n;
import X.C146777Qo;
import X.C1604688p;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C26261Rl;
import X.C26302CxJ;
import X.C26491Si;
import X.C36721oM;
import X.C57742jZ;
import X.C72473Md;
import X.C72483Me;
import X.C90064dT;
import X.C91034f2;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.TextEmojiLabel;

public final class SettingsCallingPrivacyActivity extends AnonymousClass1FY implements C1604688p {
    public ProgressBar A00;
    public SwitchCompat A01;
    public C26261Rl A02;
    public C36721oM A03;
    public AnonymousClass126 A04;
    public C26491Si A05;
    public C57742jZ A06;
    public SettingsRowPrivacyLinearLayout A07;
    public boolean A08;
    public boolean A09;

    public SettingsCallingPrivacyActivity() {
        this(0);
    }

    public /* synthetic */ void C5C(String str, String str2) {
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C26261Rl r0 = this.A02;
        if (r0 != null) {
            r0.observeUntilDestroy(this, this);
            setContentView(2131626900);
            C003401n supportActionBar = getSupportActionBar();
            C72473Md.A16(supportActionBar);
            supportActionBar.A0M(2131887859);
            this.A07 = (SettingsRowPrivacyLinearLayout) AnonymousClass3MY.A0H(this, 2131435448);
            this.A01 = (SwitchCompat) AnonymousClass3MY.A0H(this, 2131435450);
            this.A00 = (ProgressBar) AnonymousClass3MY.A0H(this, 2131435449);
            if (C18020vd.A05(C18040vf.A02, this.A0E, 8926)) {
                C36721oM r2 = this.A03;
                if (r2 != null) {
                    r2.A00(this, (TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131429947), C18070vi.A0F(this, 2131896144), "calling_privacy_help", "silence-unknown-callers");
                } else {
                    str = "contextualHelpUtils";
                }
            } else {
                C18030ve r9 = this.A0E;
                AnonymousClass1KB r6 = this.A05;
                AnonymousClass1L9 r5 = this.A01;
                AnonymousClass11C r8 = this.A08;
                String string = getString(2131896144);
                C26302CxJ.A0K(this, Uri.parse("https://faq.whatsapp.com/1238612517047244/"), r5, r6, (TextEmojiLabel) findViewById(2131429947), r8, r9, string, "calling_privacy_help");
            }
            SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A07;
            if (settingsRowPrivacyLinearLayout != null) {
                C90064dT.A00(settingsRowPrivacyLinearLayout, this, 30);
                if ("silence_unknown_caller".equals(getIntent().getStringExtra("target_setting"))) {
                    SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout2 = this.A07;
                    if (settingsRowPrivacyLinearLayout2 != null) {
                        settingsRowPrivacyLinearLayout2.A00();
                    }
                }
                AnonymousClass3MZ.A1U(this.A05, this, 39);
                return;
            }
            str = "silenceCallLayout";
        } else {
            str = "privacySettingManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A03(SettingsCallingPrivacyActivity settingsCallingPrivacyActivity) {
        String str;
        C26261Rl r0 = settingsCallingPrivacyActivity.A02;
        if (r0 != null) {
            int A002 = r0.A00("calladd");
            C26261Rl r02 = settingsCallingPrivacyActivity.A02;
            if (r02 != null) {
                Object obj = r02.A06.get("calladd");
                boolean z = false;
                ProgressBar progressBar = settingsCallingPrivacyActivity.A00;
                if (obj != null) {
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                        SwitchCompat switchCompat = settingsCallingPrivacyActivity.A01;
                        if (switchCompat != null) {
                            switchCompat.setVisibility(4);
                            return;
                        }
                        C18070vi.A11("silenceCallPrivacySwitch");
                        throw null;
                    }
                } else if (progressBar != null) {
                    progressBar.setVisibility(4);
                    SwitchCompat switchCompat2 = settingsCallingPrivacyActivity.A01;
                    if (switchCompat2 != null) {
                        switchCompat2.setVisibility(0);
                        SwitchCompat switchCompat3 = settingsCallingPrivacyActivity.A01;
                        if (switchCompat3 != null) {
                            if (A002 == 5) {
                                z = true;
                            }
                            switchCompat3.setChecked(z);
                            SwitchCompat switchCompat4 = settingsCallingPrivacyActivity.A01;
                            if (switchCompat4 != null) {
                                C26491Si r03 = settingsCallingPrivacyActivity.A05;
                                if (r03 != null) {
                                    switchCompat4.setEnabled(!r03.A00());
                                    return;
                                }
                                str = "traffAnonGating";
                                C18070vi.A11(str);
                                throw null;
                            }
                        }
                    }
                    C18070vi.A11("silenceCallPrivacySwitch");
                    throw null;
                }
                C18070vi.A11("silenceCallPrivacySpinner");
                throw null;
            }
        }
        str = "privacySettingManager";
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A03 = (C36721oM) A0K.A0m.get();
            this.A04 = AnonymousClass3MY.A0X(r2);
            this.A02 = (C26261Rl) r2.A8j.get();
            this.A05 = (C26491Si) r2.AlQ.get();
            this.A06 = (C57742jZ) r2.AlS.get();
        }
    }

    public void C5L() {
        this.A05.A0J(new C146777Qo((Object) this, 40));
    }

    public void onResume() {
        super.onResume();
        A03(this);
    }

    public SettingsCallingPrivacyActivity(int i) {
        this.A09 = false;
        C91034f2.A00(this, 12);
    }
}
