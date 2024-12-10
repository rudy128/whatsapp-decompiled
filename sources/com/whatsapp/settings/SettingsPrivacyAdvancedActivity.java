package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1VE;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C003401n;
import X.C103655Ld;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C26261Rl;
import X.C26491Si;
import X.C26811To;
import X.C36401np;
import X.C57732jY;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C89974dK;
import X.C90094dW;
import X.C91034f2;
import X.C92144gp;
import X.C98844ro;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPrivacyAdvancedActivity extends AnonymousClass1FY {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public AnonymousClass1VE A03;
    public C26811To A04;
    public C26491Si A05;
    public C36401np A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C18100vl A0D;
    public final C92144gp A0E;

    public SettingsPrivacyAdvancedActivity() {
        this(0);
        this.A0D = AnonymousClass1DF.A01(new C103655Ld(this));
        this.A0E = new C92144gp(this, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r5 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.settings.SettingsPrivacyAdvancedActivity r6) {
        /*
            androidx.appcompat.widget.SwitchCompat r1 = r6.A00
            if (r1 != 0) goto L_0x000b
            java.lang.String r0 = "brigadingSwitch"
        L_0x0006:
            X.C18070vi.A11(r0)
        L_0x0009:
            r0 = 0
            throw r0
        L_0x000b:
            boolean r0 = A0Q(r6)
            r1.setChecked(r0)
            X.1Si r0 = r6.A05
            if (r0 == 0) goto L_0x0051
            boolean r5 = r0.A00()
            androidx.appcompat.widget.SwitchCompat r1 = r6.A01
            java.lang.String r4 = "callRelayingPrivacySwitch"
            if (r1 == 0) goto L_0x004d
            boolean r0 = r6.A0A
            r3 = 0
            if (r0 != 0) goto L_0x0028
            r0 = 0
            if (r5 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r1.setChecked(r0)
            androidx.appcompat.widget.SwitchCompat r0 = r6.A01
            if (r0 == 0) goto L_0x004d
            r2 = r5 ^ 1
            r0.setEnabled(r2)
            androidx.appcompat.widget.SwitchCompat r1 = r6.A02
            java.lang.String r4 = "disableLinkPreviewsSwitch"
            if (r1 == 0) goto L_0x004d
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0041
            if (r5 == 0) goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            r1.setChecked(r3)
            androidx.appcompat.widget.SwitchCompat r0 = r6.A02
            if (r0 == 0) goto L_0x004d
            r0.setEnabled(r2)
            return
        L_0x004d:
            X.C18070vi.A11(r4)
            goto L_0x0009
        L_0x0051:
            java.lang.String r0 = "traffAnonGating"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A03(com.whatsapp.settings.SettingsPrivacyAdvancedActivity):void");
    }

    public static final boolean A0Q(SettingsPrivacyAdvancedActivity settingsPrivacyAdvancedActivity) {
        AnonymousClass00H r0 = settingsPrivacyAdvancedActivity.A09;
        if (r0 == null) {
            C18070vi.A11("privacySettingManager");
            throw null;
        } else if (1 != ((C26261Rl) r0.get()).A00("messages")) {
            return false;
        } else {
            return true;
        }
    }

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A07 = C000200d.A00(A0L.A1B);
            this.A08 = AnonymousClass3MX.A10(A0L);
            this.A06 = AnonymousClass3MY.A0e(r1);
            this.A09 = C000200d.A00(A0L.A8j);
            this.A04 = (C26811To) A0L.AAf.get();
            this.A05 = (C26491Si) A0L.AlQ.get();
            this.A03 = (AnonymousClass1VE) A0L.ABT.get();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass1VE r0 = this.A03;
        if (r0 != null) {
            this.A0A = C17880vN.A1W(AnonymousClass1VE.A00(r0), "privacy_always_relay");
            setContentView(2131626915);
            C003401n supportActionBar = getSupportActionBar();
            C72473Md.A16(supportActionBar);
            supportActionBar.A0M(2131886557);
            this.A00 = (SwitchCompat) AnonymousClass3MY.A0H(this, 2131428418);
            View A0H = AnonymousClass3MY.A0H(this, 2131428417);
            C18100vl r02 = this.A0D;
            A0H.setVisibility(C72453Mb.A07(C72453Mb.A1a(r02) ? 1 : 0));
            if (C72453Mb.A1a(r02)) {
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131428415);
                C36401np r4 = this.A06;
                if (r4 != null) {
                    SpannableStringBuilder A062 = r4.A06(textEmojiLabel.getContext(), new C98844ro((Object) this, 16), getString(2131887435), "brigading_learn_more", 2131101293);
                    AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel);
                    textEmojiLabel.setText(A062);
                    SwitchCompat switchCompat = this.A00;
                    if (switchCompat == null) {
                        str = "brigadingSwitch";
                    } else {
                        C90094dW.A00(switchCompat, this, 48);
                    }
                }
                str = "linkifier";
            }
            this.A01 = (SwitchCompat) AnonymousClass3MY.A0H(this, 2131428727);
            this.A02 = (SwitchCompat) AnonymousClass3MY.A0H(this, 2131430017);
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131428724);
            C36401np r42 = this.A06;
            if (r42 != null) {
                SpannableStringBuilder A063 = r42.A06(textEmojiLabel2.getContext(), new C98844ro((Object) this, 18), getString(2131887839), "call_relaying_help", 2131101293);
                AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel2);
                textEmojiLabel2.setText(A063);
                TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131430014);
                C36401np r5 = this.A06;
                if (r5 != null) {
                    SpannableStringBuilder A064 = r5.A06(textEmojiLabel3.getContext(), new C98844ro((Object) this, 19), getString(2131889460), "disable_link_previews_help", 2131101293);
                    AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel3);
                    textEmojiLabel3.setText(A064);
                    SwitchCompat switchCompat2 = this.A01;
                    if (switchCompat2 == null) {
                        str = "callRelayingPrivacySwitch";
                    } else {
                        C90094dW.A00(switchCompat2, this, 49);
                        SwitchCompat switchCompat3 = this.A02;
                        if (switchCompat3 == null) {
                            str = "disableLinkPreviewsSwitch";
                        } else {
                            C89974dK.A00(switchCompat3, this, 0);
                            if (C72453Mb.A1a(r02)) {
                                AnonymousClass00H r03 = this.A09;
                                if (r03 != null) {
                                    C17880vN.A0V(r03).observeUntilDestroy(this.A0E, this);
                                    AnonymousClass00H r04 = this.A09;
                                    if (r04 != null) {
                                        ((C26261Rl) r04.get()).A01((C57732jY) null);
                                    }
                                }
                                str = "privacySettingManager";
                            }
                            C26491Si r05 = this.A05;
                            if (r05 != null) {
                                r05.observeUntilDestroy(this, this);
                                return;
                            }
                            str = "traffAnonGating";
                        }
                    }
                }
            }
            str = "linkifier";
        } else {
            str = "voipSharedPreferences";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1VE r0 = this.A03;
        if (r0 != null) {
            this.A0A = AnonymousClass1VE.A00(r0).getBoolean("privacy_always_relay", false);
            this.A0B = C72453Mb.A0M(this).getBoolean("privacy_linkpreview", false);
            A03(this);
            return;
        }
        C18070vi.A11("voipSharedPreferences");
        throw null;
    }

    public SettingsPrivacyAdvancedActivity(int i) {
        this.A0C = false;
        C91034f2.A00(this, 21);
    }
}
