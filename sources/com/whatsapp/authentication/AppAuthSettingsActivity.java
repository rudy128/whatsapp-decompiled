package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass0IT;
import X.AnonymousClass0Q0;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1XL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3S2;
import X.C000200d;
import X.C003401n;
import X.C03320Hp;
import X.C167288fl;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C18070vi;
import X.C19740yt;
import X.C19830z4;
import X.C27301Vn;
import X.C28721an;
import X.C32291gx;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C75653hu;
import X.C87824Xf;
import X.C89714cu;
import X.C90994ey;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.util.Log;

public final class AppAuthSettingsActivity extends AnonymousClass1FY {
    public View A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public TextView A04;
    public TextView A05;
    public SwitchCompat A06;
    public SwitchCompat A07;
    public C03320Hp A08;
    public AnonymousClass0Q0 A09;
    public C28721an A0A;
    public C27301Vn A0B;
    public C32291gx A0C;
    public AnonymousClass00H A0D;
    public View A0E;
    public boolean A0F;
    public final C167288fl A0G;

    public AppAuthSettingsActivity() {
        this(0);
        this.A0G = new C75653hu(this);
    }

    /* access modifiers changed from: private */
    public final void A0d() {
        Log.i("AppAuthSettingsActivity/disable-setting");
        ((AnonymousClass1XL) this.A0A.get()).A02(true);
        this.A0A.A27(false);
        A4c().A08();
        A0v(false);
        SwitchCompat switchCompat = this.A06;
        if (switchCompat == null) {
            C18070vi.A11("appAuthSettingsSwitch");
            throw null;
        }
        switchCompat.setChecked(false);
        A4b().A01();
        ((AnonymousClass1XL) this.A0A.get()).A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (12 == r1) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0q(com.whatsapp.authentication.AppAuthSettingsActivity r3) {
        /*
            androidx.appcompat.widget.SwitchCompat r0 = r3.A06
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "appAuthSettingsSwitch"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x000b:
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005f
            X.00H r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.1XL r0 = (X.AnonymousClass1XL) r0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.2iW r0 = (X.C57092iW) r0
            X.0PO r1 = r0.A00
            r0 = 255(0xff, float:3.57E-43)
            int r1 = r1.A03(r0)
            r0 = 11
            if (r0 == r1) goto L_0x0034
            r0 = 12
            r2 = 1
            if (r0 != r1) goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AppAuthManager/hasEnrolledBiometrics: enrolled: "
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 == 0) goto L_0x0051
            java.lang.String r0 = "AppAuthSettingsActivity/show-bottom-sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0Hp r1 = r3.A08
            if (r1 == 0) goto L_0x0050
            X.0Q0 r0 = r3.A09
            if (r0 == 0) goto L_0x0050
            X.AnonymousClass0Q0.A04(r1, r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r0 = "AppAuthSettingsActivity/setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.authentication.SetupDeviceAuthDialog r0 = new com.whatsapp.authentication.SetupDeviceAuthDialog
            r0.<init>()
            r3.CMl(r0)
            return
        L_0x005f:
            r3.A0d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.authentication.AppAuthSettingsActivity.A0q(com.whatsapp.authentication.AppAuthSettingsActivity):void");
    }

    public static /* synthetic */ void A0r(AppAuthSettingsActivity appAuthSettingsActivity) {
        SwitchCompat switchCompat = appAuthSettingsActivity.A07;
        if (switchCompat != null) {
            boolean z = !switchCompat.isChecked();
            C17880vN.A1F(C19830z4.A00(appAuthSettingsActivity.A0A), "privacy_fingerprint_show_notification_content", z);
            SwitchCompat switchCompat2 = appAuthSettingsActivity.A07;
            if (switchCompat2 != null) {
                switchCompat2.setChecked(z);
                C27301Vn r1 = appAuthSettingsActivity.A0B;
                if (r1 != null) {
                    r1.BEJ(1, "AppAuthSettingsActivity");
                    appAuthSettingsActivity.A4c().A08();
                    appAuthSettingsActivity.A4b().A01();
                    return;
                }
                C18070vi.A11("waNotificationManager");
                throw null;
            }
        }
        C18070vi.A11("notificationContentSwitch");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void A0v(boolean z) {
        String str;
        Log.i("AppAuthSettingsActivity/update-dependent-views");
        View view = this.A0E;
        if (view == null) {
            str = "timeoutView";
        } else {
            int i = 0;
            view.setVisibility(C72453Mb.A07(z ? 1 : 0));
            View view2 = this.A00;
            if (view2 == null) {
                str = "notificationView";
            } else {
                if (!z) {
                    i = 8;
                }
                view2.setVisibility(i);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A0C = (C32291gx) r2.A6X.get();
            this.A0D = C000200d.A00(A0K.A5o);
            this.A0B = (C27301Vn) r2.A9A.get();
            this.A0A = (C28721an) r2.AC2.get();
        }
    }

    public final C28721an A4b() {
        C28721an r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("widgetUpdater");
        throw null;
    }

    public final C32291gx A4c() {
        C32291gx r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageNotification");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624196);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            this.A04 = AnonymousClass3MX.A0L(this, 2131435053);
            this.A05 = AnonymousClass3MX.A0L(this, 2131435055);
            setTitle(2131895990);
            TextView textView = this.A05;
            if (textView == null) {
                str = "settingsTitle";
            } else {
                textView.setText(2131895976);
                TextView textView2 = this.A04;
                if (textView2 == null) {
                    str = "description";
                } else {
                    textView2.setText(2131895977);
                    this.A09 = new AnonymousClass0Q0(new AnonymousClass3S2(this, 0), this, C19740yt.A08(this));
                    AnonymousClass0IT r1 = new AnonymousClass0IT();
                    r1.A01 = getString(2131886958);
                    r1.A03 = getString(2131886959);
                    r1.A00 = 255;
                    r1.A04 = false;
                    this.A08 = r1.A00();
                    this.A0E = findViewById(2131436196);
                    this.A00 = findViewById(2131433211);
                    this.A06 = (SwitchCompat) findViewById(2131427812);
                    this.A07 = (SwitchCompat) findViewById(2131433207);
                    AnonymousClass3MZ.A1J(findViewById(2131427811), this, 2);
                    View view = this.A00;
                    if (view == null) {
                        str = "notificationView";
                    } else {
                        AnonymousClass3MZ.A1J(view, this, 1);
                        this.A01 = (RadioButton) findViewById(2131436197);
                        this.A02 = (RadioButton) findViewById(2131436198);
                        this.A03 = (RadioButton) findViewById(2131436199);
                        RadioButton radioButton = this.A01;
                        if (radioButton != null) {
                            radioButton.setText(2131886678);
                            RadioButton radioButton2 = this.A02;
                            if (radioButton2 != null) {
                                C18000vb r5 = this.A00;
                                Object[] objArr = new Object[1];
                                AnonymousClass3MX.A1S(objArr, 0, 1);
                                radioButton2.setText(r5.A0K(objArr, 2131755020, 1));
                                RadioButton radioButton3 = this.A03;
                                if (radioButton3 != null) {
                                    C18000vb r3 = this.A00;
                                    Object[] objArr2 = new Object[1];
                                    AnonymousClass3MX.A1S(objArr2, 0, 30);
                                    radioButton3.setText(r3.A0K(objArr2, 2131755020, 30));
                                    RadioButton radioButton4 = this.A01;
                                    if (radioButton4 != null) {
                                        radioButton4.setOnClickListener(new C89714cu(this, 0, 0));
                                        RadioButton radioButton5 = this.A02;
                                        if (radioButton5 != null) {
                                            radioButton5.setOnClickListener(new C89714cu(this, 60000, 0));
                                            RadioButton radioButton6 = this.A03;
                                            if (radioButton6 != null) {
                                                radioButton6.setOnClickListener(new C89714cu(this, 1800000, 0));
                                                return;
                                            }
                                        }
                                    }
                                }
                                C18070vi.A11("timeoutThirtyMinutes");
                                throw null;
                            }
                            C18070vi.A11("timeoutOneMinute");
                            throw null;
                        }
                        C18070vi.A11("timeoutImmediately");
                        throw null;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17880vN.A0g();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0Q0 r0 = this.A09;
        if (r0 != null) {
            r0.A05();
        }
        this.A09 = null;
    }

    public void onResume() {
        String str;
        super.onResume();
        Log.i("AppAuthSettingsActivity/update-ui");
        boolean A2T = this.A0A.A2T();
        long A0Q = this.A0A.A0Q();
        boolean A1T = AnonymousClass3MX.A1T(C72453Mb.A0M(this), "privacy_fingerprint_show_notification_content");
        A0v(A2T);
        C17900vP.A0m("AppAuthSettingsActivity/update-timeout: ", AnonymousClass000.A10(), A0Q);
        RadioButton radioButton = this.A01;
        if (radioButton == null) {
            str = "timeoutImmediately";
        } else {
            boolean z = true;
            radioButton.setChecked(AnonymousClass000.A1P((A0Q > 0 ? 1 : (A0Q == 0 ? 0 : -1))));
            RadioButton radioButton2 = this.A02;
            if (radioButton2 == null) {
                str = "timeoutOneMinute";
            } else {
                radioButton2.setChecked(AnonymousClass000.A1P((A0Q > 60000 ? 1 : (A0Q == 60000 ? 0 : -1))));
                RadioButton radioButton3 = this.A03;
                if (radioButton3 == null) {
                    str = "timeoutThirtyMinutes";
                } else {
                    if (A0Q != 1800000) {
                        z = false;
                    }
                    radioButton3.setChecked(z);
                    SwitchCompat switchCompat = this.A06;
                    if (switchCompat == null) {
                        str = "appAuthSettingsSwitch";
                    } else {
                        switchCompat.setChecked(A2T);
                        SwitchCompat switchCompat2 = this.A07;
                        if (switchCompat2 == null) {
                            str = "notificationContentSwitch";
                        } else {
                            switchCompat2.setChecked(A1T);
                            AnonymousClass00H r0 = this.A0D;
                            if (r0 != null) {
                                View view = this.A00;
                                C18070vi.A0X(view);
                                ((C87824Xf) r0.get()).A02(view, "screen_lock", C72453Mb.A0w(this));
                                return;
                            }
                            str = "settingsSearchUtil";
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public AppAuthSettingsActivity(int i) {
        this.A0F = false;
        C90994ey.A00(this, 6);
    }
}
