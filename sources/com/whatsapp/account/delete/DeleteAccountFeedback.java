package com.whatsapp.account.delete;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C03610Iy;
import X.C70613Bu;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C88834au;
import X.C90664eR;
import X.C90684eT;
import X.C90994ey;
import X.C91134fC;
import X.C91164fF;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;

public class DeleteAccountFeedback extends AnonymousClass1FY {
    public static final int[] A0A = {2131889270, 2131889269, 2131889276, 2131889272, 2131889273, 2131889274};
    public int A00;
    public int A01;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public C03610Iy A05;
    public DialogFragment A06;
    public AnonymousClass1LU A07;
    public boolean A08;
    public boolean A09;

    public DeleteAccountFeedback() {
        this(0);
        this.A01 = -1;
        this.A08 = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131895841);
        C72473Md.A18(this);
        setContentView(2131625065);
        this.A04 = (ScrollView) findViewById(2131434837);
        this.A03 = (EditText) findViewById(2131429902);
        this.A02 = findViewById(2131428324);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131435081);
        A0L.setBackground(AnonymousClass3NL.A00(this, this.A00, 2131230962));
        this.A00 = getResources().getDimensionPixelSize(2131168631);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A08 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i = 2131889253;
            if (this.A01 == 2) {
                i = 2131889254;
            }
            editText.setHint(i);
        }
        int i2 = this.A01;
        int[] iArr = A0A;
        if (i2 >= 6 || i2 < 0) {
            AnonymousClass3MW.A1S(A0L);
        } else {
            A0L.setText(iArr[i2]);
        }
        this.A05 = new C03610Iy(this, findViewById(2131429903), 0, 2130970787, 0);
        int i3 = 0;
        do {
            this.A05.A03.add(0, i3, 0, iArr[i3]);
            i3++;
        } while (i3 < 6);
        C03610Iy r1 = this.A05;
        r1.A00 = new C91134fC(this, 0);
        r1.A01 = new C91164fF((Object) A0L, (Object) this, 0);
        AnonymousClass3MZ.A1N(A0L, this, 39);
        AnonymousClass3MZ.A1N(findViewById(2131429878), this, 40);
        this.A00.post(new C70613Bu(this, 18));
        this.A00 = AnonymousClass3MZ.A01(this, 2131168631);
        this.A04.getViewTreeObserver().addOnScrollChangedListener(new C90684eT(this, 0));
        C90664eR.A00(this.A04.getViewTreeObserver(), this, 0);
    }

    public class ChangeNumberMessageDialogFragment extends Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment {
        public AnonymousClass1LU A00;

        public Dialog A27(Bundle bundle) {
            int i = A15().getInt("deleteReason", -1);
            String string = A15().getString("additionalComments");
            C73203Rj A02 = AnonymousClass4a6.A02(this);
            A02.A0S(AnonymousClass3MX.A16(this, A1H(2131895811), AnonymousClass3MW.A1a(), 0, 2131889255));
            A02.setPositiveButton(2131895811, new AnonymousClass4aq(this, 8));
            return AnonymousClass3MX.A0N(new C88834au(this, string, i), A02, 2131895840);
        }
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A07 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A08);
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C90664eR.A00(this.A04.getViewTreeObserver(), this, 0);
    }

    public void onStop() {
        super.onStop();
        C03610Iy r1 = this.A05;
        if (r1 != null) {
            r1.A00 = null;
            r1.A04.A02();
        }
    }

    public DeleteAccountFeedback(int i) {
        this.A09 = false;
        C90994ey.A00(this, 4);
    }
}
