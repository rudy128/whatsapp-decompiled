package com.whatsapp.backup.google;

import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass19K;
import X.AnonymousClass1J8;
import X.AnonymousClass1L9;
import X.AnonymousClass1NT;
import X.AnonymousClass1NW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass78R;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.C000200d;
import X.C137116uw;
import X.C167498gR;
import X.C17880vN;
import X.C17960vV;
import X.C196239ug;
import X.C19880zA;
import X.C19890zB;
import X.C20296AFe;
import X.C20313AFv;
import X.C25011Mn;
import X.C36801oU;
import X.C36861oa;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72483Me;
import android.content.ActivityNotFoundException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.List;

public final class GoogleDriveNewUserSetupActivity extends C167498gR {
    public int A00;
    public RadioGroup A01;
    public AppCompatSpinner A02;
    public C19880zA A03;
    public C25011Mn A04;
    public List A05;
    public Button A06;
    public boolean A07;
    public RadioButton[] A08;
    public final ViewTreeObserver.OnGlobalLayoutListener A09;

    public static void A0V(RadioButton radioButton, GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity, String str) {
        int i = 2;
        Object[] objArr = new Object[2];
        AnonymousClass001.A1Q(str, radioButton, objArr);
        String.format("gdrive-new-user-setup/freq-option-changed item:%s radioBtn:%s", objArr);
        if (googleDriveNewUserSetupActivity.getString(2131895861).equals(str)) {
            i = 1;
        } else if (!googleDriveNewUserSetupActivity.getString(2131895865).equals(str)) {
            i = 0;
            if (googleDriveNewUserSetupActivity.getString(2131895863).equals(str)) {
                i = 3;
            }
        }
        int i2 = googleDriveNewUserSetupActivity.A00;
        googleDriveNewUserSetupActivity.A00 = i;
        if (radioButton != null) {
            googleDriveNewUserSetupActivity.A0Q();
            radioButton.toggle();
            radioButton.getText();
            googleDriveNewUserSetupActivity.A02.setSelection(googleDriveNewUserSetupActivity.A05.indexOf(AnonymousClass3MZ.A18(radioButton)));
        }
        if ((i2 == 0 || AnonymousClass8BR.A0z(googleDriveNewUserSetupActivity) == null) && i != 0) {
            googleDriveNewUserSetupActivity.A09.performClick();
        }
    }

    private void A0Q() {
        this.A01.clearCheck();
        this.A02.setSelection(this.A05.size() - 1, true);
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A06 = AnonymousClass3MZ.A0l(r1);
            this.A07 = AnonymousClass3MY.A0Z(r1);
            this.A0F = (AnonymousClass19K) r1.AC4.get();
            this.A01 = (AnonymousClass1NT) r1.A3f.get();
            this.A0I = C000200d.A00(r1.A2b);
            this.A03 = (C196239ug) r1.A4d.get();
            this.A00 = (AnonymousClass1NW) r1.A0h.get();
            this.A0G = AnonymousClass8BT.A0g(r1);
            this.A0H = C000200d.A00(r1.A0j);
            this.A02 = (C36801oU) r1.A4c.get();
            this.A04 = (C36861oa) r1.A4g.get();
            this.A03 = C19890zB.A00;
            this.A04 = (C25011Mn) r1.A9o.get();
        }
    }

    public void Brb(int i) {
        if (i == 14) {
            this.A00 = 0;
            this.A06.performClick();
            return;
        }
        super.Brb(i);
    }

    public GoogleDriveNewUserSetupActivity(int i) {
        this.A07 = false;
        AGB.A00(this, 12);
    }

    private void A03() {
        int dimensionPixelSize = C72483Me.A0D(this).x - getResources().getDimensionPixelSize(2131167007);
        for (RadioButton width : this.A08) {
            width.setWidth(dimensionPixelSize);
        }
    }

    public void A4c() {
        super.A4c();
        if (this.A00 != 0) {
            A0Q();
            this.A00 = 0;
        }
    }

    public void onBackPressed() {
        try {
            AnonymousClass1L9.A02(this);
        } catch (ActivityNotFoundException e) {
            Log.e("gdrive-new-user-setup/back-pressed", e);
            this.A05.A08(2131890728, 1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        List list;
        int i;
        super.onConfigurationChanged(configuration);
        A03();
        int i2 = this.A00;
        if (i2 == 0) {
            list = this.A05;
            i = 2131895864;
        } else if (i2 != 1) {
            list = this.A05;
            if (i2 != 2) {
                i = 2131895863;
            } else {
                i = 2131895865;
            }
        } else {
            list = this.A05;
            i = 2131895861;
        }
        int indexOf = list.indexOf(getString(i));
        if (indexOf >= 0) {
            RadioButton radioButton = this.A08[indexOf];
            radioButton.toggle();
            radioButton.getText();
            this.A02.setSelection(this.A05.indexOf(AnonymousClass3MZ.A18(radioButton)));
            this.A02.setSelection(indexOf);
        } else {
            A0Q();
        }
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A02.A0D()) {
            Log.i("gdrive-new-user-setup/create no need to display GoogleDriveNewUserSetupActivity, exiting.");
            C72453Mb.A14(this);
            return;
        }
        setTitle(2131890735);
        getSupportActionBar().A0W(false);
        View findViewById = findViewById(2131431092);
        if (findViewById instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) findViewById;
            int i = 2131624105;
            if (AnonymousClass1J8.A05(this.A0E)) {
                i = 2131627594;
            }
            viewStub.setLayoutResource(i);
            findViewById = viewStub.inflate();
        }
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = getString(2131899400);
        A1a[1] = getString(2131895812);
        String A0q = C17880vN.A0q(this, getString(2131895805), A1a, 2, 2131890730);
        if (findViewById instanceof WaTextView) {
            ((TextView) findViewById).setText(A0q);
        } else if (findViewById instanceof WDSSectionFooter) {
            ((WDSSectionFooter) findViewById).setFooterText(A0q);
        }
        findViewById.setVisibility(0);
        AnonymousClass3MX.A1H(this, 2131431093, 0);
        View findViewById2 = findViewById(2131435280);
        findViewById2.setVisibility(0);
        if (findViewById2 instanceof WaTextView) {
            ((TextView) findViewById2).setText(2131890729);
        } else if (findViewById2 instanceof WDSSectionHeader) {
            ((WDSSectionHeader) findViewById2).setHeaderText(2131890729);
        }
        this.A09.setText(2131890727);
        this.A01 = (RadioGroup) findViewById(2131431094);
        this.A05 = AnonymousClass000.A13();
        int[] iArr = SettingsGoogleDriveViewModel.A0g;
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            if (!(i3 == 2131895862 || i3 == 2131895864)) {
                this.A05.add(getString(i3));
            }
            i2++;
        } while (i2 < 5);
        this.A05.add(getString(2131895864));
        this.A05.add(getString(2131890734));
        this.A01.setVisibility(0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.A05);
        arrayAdapter.setDropDownViewResource(17367049);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) findViewById(2131431095);
        this.A02 = appCompatSpinner;
        appCompatSpinner.setAdapter(arrayAdapter);
        this.A02.setSelection(AnonymousClass3MX.A02(this.A05, 1));
        this.A02.setOnItemSelectedListener(new C20313AFv(this, 1));
        LayoutInflater layoutInflater = (LayoutInflater) AnonymousClass11C.A02(this, "layout_inflater");
        C17960vV.A07(layoutInflater);
        this.A08 = new RadioButton[AnonymousClass3MX.A02(this.A05, 1)];
        this.A01.addView(layoutInflater.inflate(2131625462, (ViewGroup) null));
        for (int i4 = 0; i4 < this.A08.length; i4++) {
            String A0w = C17880vN.A0w(this.A05, i4);
            TextView textView = (TextView) layoutInflater.inflate(2131625463, (ViewGroup) null);
            textView.setText(A0w);
            this.A01.addView(textView);
            this.A01.addView(layoutInflater.inflate(2131625462, (ViewGroup) null));
            this.A08[i4] = textView;
            textView.setOnClickListener(new AnonymousClass78R(this, textView, A0w, 0));
        }
        A03();
        Button button = (Button) findViewById(2131431091);
        this.A06 = button;
        AnonymousClass3MZ.A1J(button, this, 42);
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
    }

    public GoogleDriveNewUserSetupActivity() {
        this(0);
        this.A00 = 1;
        this.A09 = new C20296AFe(this, 0);
    }
}
