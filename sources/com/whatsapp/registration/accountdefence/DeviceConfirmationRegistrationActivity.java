package com.whatsapp.registration.accountdefence;

import X.A9B;
import X.AGE;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1D9;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.AnonymousClass4a6;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.C003401n;
import X.C010105w;
import X.C110885hR;
import X.C137116uw;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C192309o9;
import X.C19830z4;
import X.C20152A9o;
import X.C20338AGu;
import X.C21449AkG;
import X.C33641j9;
import X.C36401np;
import X.C57352iw;
import X.C58712l8;
import X.C63662tU;
import X.C63932tv;
import X.C64052u8;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public class DeviceConfirmationRegistrationActivity extends AnonymousClass1FY {
    public ProgressDialog A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public AnonymousClass19D A04;
    public AnonymousClass1D9 A05;
    public AnonymousClass1LU A06;
    public NewDeviceConfirmationRegistrationViewModel A07;
    public C57352iw A08;
    public C36401np A09;
    public WDSTextLayout A0A;
    public AnonymousClass00H A0B;
    public boolean A0C;
    public boolean A0D;

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        int i2;
        int i3;
        switch (i) {
            case 11:
                View inflate = getLayoutInflater().inflate(2131624128, (ViewGroup) null);
                C73203Rj A002 = AnonymousClass4a6.A00(this);
                A002.A0c(inflate);
                A002.A0E(2131895297);
                C20152A9o.A00(A002, this, 14, 2131895668);
                A002.A0X(new C20152A9o(this, 15), 2131898766);
                C010105w create = A002.create();
                A03(AnonymousClass3MX.A0W(inflate, 2131432664), new C21449AkG((Object) this, 38), "send-device-confirmation-dialog-learn-more");
                return create;
            case 12:
                View inflate2 = getLayoutInflater().inflate(2131625101, (ViewGroup) null);
                r2 = AnonymousClass4a6.A00(this);
                TextView A0E = C17880vN.A0E(inflate2, 2131436698);
                if (A0E != null) {
                    A0E.setText(2131895298);
                }
                r2.setView(inflate2);
                break;
            case 13:
                r2 = AnonymousClass4a6.A00(this);
                r2.A0D(2131895290);
                i2 = 2131899286;
                i3 = 9;
                break;
            case 14:
                r2 = AnonymousClass4a6.A00(this);
                r2.A0E(2131895292);
                r2.A0D(2131895291);
                i2 = 2131899286;
                i3 = 10;
                break;
            case 15:
                long A0T = this.A07.A0T();
                View inflate3 = getLayoutInflater().inflate(2131624128, (ViewGroup) null);
                TextEmojiLabel A0V = AnonymousClass3MX.A0V(inflate3, 2131432664);
                C73203Rj A003 = AnonymousClass4a6.A00(this);
                A003.A0c(inflate3);
                A003.A0k(C17880vN.A0q(this, C64052u8.A0A(this.A00, A0T), new Object[1], 0, 2131895294));
                C20152A9o.A00(A003, this, 11, 2131899286);
                C010105w create2 = A003.create();
                A0V.setText(2131895293);
                A03(A0V, new C21449AkG((Object) this, 33), "send-device-confirmation-too-recent-dialog-learn-more");
                return create2;
            case 16:
                r2 = AnonymousClass4a6.A00(this);
                r2.A0E(2131895083);
                r2.A0D(2131895082);
                r2.A0T(false);
                i2 = 2131893145;
                i3 = 12;
                break;
            case 17:
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A07;
                String str = newDeviceConfirmationRegistrationViewModel.A01;
                C17960vV.A07(str);
                String str2 = newDeviceConfirmationRegistrationViewModel.A00;
                C17960vV.A07(str2);
                String A0H = A9B.A0H(str2, str);
                C17960vV.A07(A0H);
                String A0q = C17880vN.A0q(this, this.A00.A0G(A0H.replace(' ', 160)), new Object[1], 0, 2131889387);
                r2 = AnonymousClass4a6.A00(this);
                r2.A0S(Html.fromHtml(A0q));
                i2 = 2131893145;
                i3 = 13;
                break;
            default:
                return super.onCreateDialog(i);
        }
        C20152A9o.A00(r2, this, i3, i2);
        return r2.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, 2131895081);
        if (!this.A0C) {
            menu.add(0, 1, 0, 2131894970);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void A03(TextEmojiLabel textEmojiLabel, Runnable runnable, String str) {
        SpannableStringBuilder A052 = this.A09.A05(textEmojiLabel.getContext(), new C21449AkG((Object) runnable, 37), AnonymousClass3MZ.A18(textEmojiLabel), str);
        AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel);
        AnonymousClass3Ma.A1K(textEmojiLabel, this.A08);
        textEmojiLabel.setText(A052);
    }

    public static void A0Q(DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity) {
        Log.i("DeviceConfirmationRegistrationActivity/removeProgressDialog/");
        ProgressDialog progressDialog = deviceConfirmationRegistrationActivity.A00;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        deviceConfirmationRegistrationActivity.A00 = null;
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A06 = AnonymousClass3MY.A0Z(r2);
            this.A09 = AnonymousClass3MY.A0e(r1);
            this.A05 = AnonymousClass8BT.A0J(r2);
            this.A04 = C72463Mc.A0e(r2);
            this.A08 = C72463Mc.A0i(r1);
            this.A0B = AnonymousClass8BT.A0f(r2);
        }
    }

    public DeviceConfirmationRegistrationActivity(int i) {
        this.A0D = false;
        AGE.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        ViewStub viewStub;
        int i;
        Intent intent;
        C003401n A0K;
        super.onCreate(bundle);
        setContentView(2131624009);
        this.A08.A00(this);
        Toolbar toolbar = (Toolbar) findViewById(2131436246);
        if (!ViewConfiguration.get(this).hasPermanentMenuKey() && (A0K = AnonymousClass3MY.A0K(this, toolbar)) != null) {
            A0K.A0W(false);
            A0K.A0Y(false);
        }
        if (this.A0A.A2L()) {
            viewStub = (ViewStub) C110885hR.A0A(this, 2131436252);
            i = 2131436281;
        } else {
            viewStub = (ViewStub) C110885hR.A0A(this, 2131436208);
            i = 2131436280;
        }
        ((TextView) viewStub.inflate()).setText(2131889392);
        A9B.A0T(this, this.A04, i);
        this.A0A = (WDSTextLayout) AnonymousClass1HF.A06(this.A00, 2131429957);
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = (NewDeviceConfirmationRegistrationViewModel) AnonymousClass3MW.A0N(this).A00(NewDeviceConfirmationRegistrationViewModel.class);
        this.A07 = newDeviceConfirmationRegistrationViewModel;
        C19830z4 r1 = newDeviceConfirmationRegistrationViewModel.A08;
        newDeviceConfirmationRegistrationViewModel.A00 = r1.A0l();
        newDeviceConfirmationRegistrationViewModel.A01 = r1.A0n();
        getLifecycle().A05(this.A07);
        if (bundle == null && (intent = getIntent()) != null) {
            boolean hasExtra = intent.hasExtra("sms_retry_time");
            boolean hasExtra2 = intent.hasExtra("voice_retry_time");
            long longExtra = intent.getLongExtra("sms_retry_time", 0);
            long longExtra2 = intent.getLongExtra("voice_retry_time", 0);
            this.A0C = getIntent().getBooleanExtra("change_number", false);
            boolean booleanExtra = getIntent().getBooleanExtra("use_sms_retriever", false);
            NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel2 = this.A07;
            boolean z = this.A0C;
            if (hasExtra) {
                C192309o9 r9 = newDeviceConfirmationRegistrationViewModel2.A0C.A05;
                C17900vP.A0m("AccountDefenceLocalDataRepository/saveSmsRetryTime/", AnonymousClass000.A10(), longExtra);
                SharedPreferences.Editor A082 = AnonymousClass8BU.A08(r9.A00, "AccountDefenceLocalDataRepository_prefs");
                A082.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.sms_retry_time", longExtra);
                A082.apply();
            }
            if (hasExtra2) {
                C192309o9 r4 = newDeviceConfirmationRegistrationViewModel2.A0C.A05;
                C17900vP.A0m("AccountDefenceLocalDataRepository/saveVoiceRetryTime/", AnonymousClass000.A10(), longExtra2);
                SharedPreferences.Editor A083 = AnonymousClass8BU.A08(r4.A00, "AccountDefenceLocalDataRepository_prefs");
                A083.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.voice_retry_time", longExtra2);
                A083.apply();
            }
            newDeviceConfirmationRegistrationViewModel2.A03 = z;
            newDeviceConfirmationRegistrationViewModel2.A04 = booleanExtra;
        }
        C20338AGu.A00(this, this.A07.A0E, 11);
        C20338AGu.A00(this, this.A07.A0D, 12);
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel3 = this.A07;
        int A002 = newDeviceConfirmationRegistrationViewModel3.A0A.A00(false);
        C17900vP.A0j("NewDeviceConfirmationRegistrationViewModel/validateRegistrationState/registration state is ", AnonymousClass000.A10(), A002);
        if (A002 != 14) {
            AnonymousClass3MX.A1J(newDeviceConfirmationRegistrationViewModel3.A0E, 1);
        }
        this.A0A.setHeadlineText(getString(2131889391));
        View A084 = AnonymousClass3MX.A08(this, 2131625085);
        this.A02 = AnonymousClass3MX.A0W(A084, 2131429956);
        this.A03 = AnonymousClass3MX.A0W(A084, 2131429958);
        this.A01 = AnonymousClass3MX.A0W(A084, 2131429959);
        TextEmojiLabel textEmojiLabel = this.A02;
        Object[] A1a = AnonymousClass3MW.A1a();
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel4 = this.A07;
        String str = newDeviceConfirmationRegistrationViewModel4.A01;
        C17960vV.A07(str);
        String str2 = newDeviceConfirmationRegistrationViewModel4.A00;
        C17960vV.A07(str2);
        String A0H = A9B.A0H(str2, str);
        C17960vV.A07(A0H);
        A1a[0] = this.A00.A0G(A0H.replace(' ', 160));
        AnonymousClass3MY.A0y(this, textEmojiLabel, A1a, 2131889388);
        A03(this.A02, new C21449AkG((Object) this, 32), "device-confirmation-learn-more");
        A03(this.A03, new C21449AkG((Object) this, 34), "device-confirmation-resend-notice");
        A03(this.A01, new C21449AkG((Object) this, 35), "confirm-with-second-code");
        this.A0A.setContent(new AnonymousClass4CG(A084));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A07;
                C33641j9 r2 = newDeviceConfirmationRegistrationViewModel.A0B;
                r2.A02("device-confirm");
                ((C58712l8) newDeviceConfirmationRegistrationViewModel.A0I.get()).A01(this, r2, "device-confirm");
            }
            return super.onOptionsItemSelected(menuItem);
        }
        this.A07.A0U();
        return true;
    }

    public DeviceConfirmationRegistrationActivity() {
        this(0);
    }
}
