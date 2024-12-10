package com.whatsapp.migration.export.ui;

import X.A7R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C110885hR;
import X.C17960vV;
import X.C24291Jp;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C90054dS;
import X.C91014f0;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExportMigrationDataExportedActivity extends AnonymousClass1FU {
    public AnonymousClass1LU A00;
    public A7R A01;
    public boolean A02;

    public ExportMigrationDataExportedActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            C72453Mb.A1K(r1, this);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
            this.A01 = (A7R) A0L.ALW.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625284);
        AnonymousClass3MY.A0t(this, 2131892290);
        C72473Md.A18(this);
        TextView A0I = AnonymousClass3MW.A0I(this, 2131430729);
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131430728);
        TextView A0I3 = AnonymousClass3MW.A0I(this, 2131430724);
        View A0A = C110885hR.A0A(this, 2131430727);
        A0I3.setVisibility(0);
        A0I3.setText(2131899268);
        A0A.setVisibility(8);
        C24291Jp A002 = C24291Jp.A00((Resources.Theme) null, getResources(), 2131233130);
        C17960vV.A08(A002, "ExportMigrationDataExportedActivity/getVectorDrawable/drawableId is invalid");
        ((ImageView) C110885hR.A0A(this, 2131430723)).setImageDrawable(A002);
        C90054dS.A00(A0I3, this, 13);
        A0I.setText(2131892279);
        A0I2.setText(2131892287);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String string = getString(2131892294);
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(string);
        A002.A0L((DialogInterface.OnClickListener) null, getString(2131892282));
        String string2 = getString(2131892281);
        A002.A00.A0J(new AnonymousClass4bB(this, 26), string2);
        A002.A0C();
        return true;
    }

    public ExportMigrationDataExportedActivity(int i) {
        this.A02 = false;
        C91014f0.A00(this, 45);
    }
}
