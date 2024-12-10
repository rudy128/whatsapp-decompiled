package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass11W;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1NM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3S1;
import X.AnonymousClass48u;
import X.AnonymousClass4VT;
import X.C000200d;
import X.C003401n;
import X.C04190Me;
import X.C146757Qm;
import X.C17880vN;
import X.C200710s;
import X.C23501Gn;
import X.C24261Jm;
import X.C28081Yu;
import X.C63462t7;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C72983On;
import X.C74803cp;
import X.C826749h;
import X.C86284Ra;
import X.C89964dJ;
import X.C91024f1;
import X.C91174fG;
import X.C91184fH;
import X.C95274ly;
import X.CTp;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

public class WebImagePicker extends C74803cp {
    public int A00;
    public int A01;
    public Uri A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public ProgressBar A06;
    public AnonymousClass181 A07;
    public AnonymousClass1NM A08;
    public AnonymousClass11P A09;
    public AnonymousClass118 A0A;
    public AnonymousClass1D9 A0B;
    public C826749h A0C;
    public CTp A0D;
    public AnonymousClass4VT A0E;
    public C200710s A0F;
    public AnonymousClass11W A0G;
    public File A0H;
    public SearchView A0I;
    public C72983On A0J;
    public boolean A0K;
    public final ArrayList A0L;
    public final C23501Gn A0M;

    public WebImagePicker() {
        this(0);
        this.A0L = AnonymousClass000.A13();
        this.A00 = 3;
        this.A0M = new C95274ly(this, 1);
    }

    public static void A0z(WebImagePicker webImagePicker) {
        String charSequence = webImagePicker.A0I.A0b.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            webImagePicker.A05.A08(2131894546, 0);
            return;
        }
        webImagePicker.A09.A01(webImagePicker.A0I);
        webImagePicker.A06.setVisibility(0);
        AnonymousClass3MW.A1S((TextView) webImagePicker.getListView().getEmptyView());
        C72983On r2 = webImagePicker.A0J;
        if (charSequence != null) {
            AnonymousClass48u r1 = r2.A00;
            if (r1 != null) {
                r1.A0B(false);
            }
            r2.A01 = true;
            WebImagePicker webImagePicker2 = r2.A02;
            webImagePicker2.A0D = new CTp(webImagePicker2.A07, webImagePicker2.A09, webImagePicker2.A0A, webImagePicker2.A0B, charSequence);
            webImagePicker2.A0L.clear();
            webImagePicker2.A0E.A02.A04(false);
            C86284Ra r5 = new C86284Ra(webImagePicker2.A05, webImagePicker2.A07, webImagePicker2.A0B, webImagePicker2.A05, webImagePicker2.A0H, "web-image-picker-adapter");
            r5.A00 = webImagePicker2.A01;
            r5.A01 = 4194304;
            r5.A03 = C24261Jm.A00(webImagePicker2, 2131231549);
            r5.A02 = C24261Jm.A00(webImagePicker2, 2131232110);
            webImagePicker2.A0E = r5.A00();
        }
        AnonymousClass48u r4 = new AnonymousClass48u(r2);
        r2.A00 = r4;
        r4.A02.executeOnExecutor(r2.A02.A0F, new Void[0]);
        if (charSequence != null) {
            r2.notifyDataSetChanged();
        }
    }

    public void A2y() {
        if (!this.A0K) {
            this.A0K = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0K2.A63);
            this.A0G = (AnonymousClass11W) r2.ABB.get();
            this.A09 = AnonymousClass10E.A6O(r2);
            this.A0A = AnonymousClass3MZ.A0l(r2);
            this.A07 = (AnonymousClass181) r2.AA9.get();
            this.A0B = (AnonymousClass1D9) r2.A0n.get();
            this.A08 = (AnonymousClass1NM) r2.A6D.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0z(this);
        } else {
            finish();
        }
    }

    private void A0y() {
        int A002 = (int) (C72463Mc.A00(this) * 3.3333333f);
        this.A01 = ((int) (C72463Mc.A00(this) * 83.333336f)) + (((int) (C72463Mc.A00(this) * 1.3333334f)) * 2) + A002;
        int i = C72483Me.A0D(this).x;
        int min = Math.min(i / this.A01, 3);
        this.A00 = min;
        this.A01 = (i / min) - A002;
        AnonymousClass4VT r0 = this.A0E;
        if (r0 != null) {
            r0.A02.A04(false);
        }
        C86284Ra r2 = new C86284Ra(this.A05, this.A07, this.A0B, this.A05, this.A0H, "web-image-picker");
        r2.A00 = this.A01;
        r2.A01 = 4194304;
        r2.A03 = C24261Jm.A00(this, 2131232816);
        r2.A02 = C24261Jm.A00(this, 2131232110);
        this.A0E = r2.A00();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0y();
        this.A0J.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131895530);
        this.A0H = C17880vN.A0e(getCacheDir(), "Thumbs");
        C003401n A0J2 = AnonymousClass3MY.A0J(this);
        A0J2.A0W(true);
        A0J2.A0Y(false);
        A0J2.A0G();
        this.A0H.mkdirs();
        this.A0D = new CTp(this.A07, this.A09, this.A0A, this.A0B, "");
        C200710s r2 = new C200710s(this.A05, false);
        this.A0F = r2;
        r2.execute(new C146757Qm((Object) this, 41));
        setContentView(2131627601);
        this.A06 = (ProgressBar) findViewById(2131431610);
        String stringExtra = getIntent().getStringExtra("query");
        if (stringExtra != null) {
            stringExtra = C63462t7.A03(stringExtra);
        }
        C04190Me r0 = SearchView.A0o;
        AnonymousClass3S1 r7 = new AnonymousClass3S1(A0J2.A0A(), this);
        this.A0I = r7;
        TextView A0E2 = C17880vN.A0E(r7, 2131434969);
        int A002 = AnonymousClass3Ma.A00(this, 2130971105, 2131102431);
        A0E2.setTextColor(A002);
        A0E2.setHintTextColor(AnonymousClass3Ma.A00(this, 2130970055, 2131101191));
        ImageView A0H2 = AnonymousClass3MW.A0H(r7, 2131434869);
        C28081Yu.A01(PorterDuff.Mode.SRC_IN, A0H2);
        C28081Yu.A00(ColorStateList.valueOf(A002), A0H2);
        this.A0I.setQueryHint(getString(2131895489));
        this.A0I.A0H();
        SearchView searchView = this.A0I;
        searchView.A05 = new C91174fG();
        searchView.A0N(stringExtra);
        SearchView searchView2 = this.A0I;
        searchView2.A02 = new C89964dJ(this, 44);
        C91184fH.A00(searchView2, this, 10);
        A0J2.A0P(searchView2);
        Bundle A092 = AnonymousClass3MY.A09(this);
        if (A092 != null) {
            this.A02 = (Uri) A092.getParcelable("output");
        }
        ListView listView = getListView();
        listView.requestFocus();
        listView.setClickable(false);
        listView.setBackground((Drawable) null);
        listView.setDividerHeight(0);
        View inflate = getLayoutInflater().inflate(2131627602, listView, false);
        listView.addFooterView(inflate, (Object) null, false);
        listView.setFooterDividersEnabled(false);
        this.A05 = inflate.findViewById(2131434180);
        this.A04 = inflate.findViewById(2131427866);
        C72983On r02 = new C72983On(this);
        this.A0J = r02;
        A4b(r02);
        this.A03 = new C89964dJ(this, 45);
        A0y();
        this.A08.A03(this.A0M);
        this.A0I.requestFocus();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0L.clear();
        this.A0E.A02.A04(true);
        C826749h r0 = this.A0C;
        if (r0 != null) {
            r0.A0B(true);
            Log.i("webimagesearch/cancel_image_download_task");
            if (this.A0C.A00 != null) {
                Log.i("webimagesearch/cancel_dialog");
                this.A0C.A00.dismiss();
                this.A0C.A00 = null;
            }
            this.A0C = null;
        }
        AnonymousClass48u r1 = this.A0J.A00;
        if (r1 != null) {
            r1.A0B(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public WebImagePicker(int i) {
        this.A0K = false;
        C91024f1.A00(this, 39);
    }
}
