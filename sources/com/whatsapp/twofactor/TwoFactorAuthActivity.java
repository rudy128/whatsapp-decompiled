package com.whatsapp.twofactor;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RC;
import X.AnonymousClass7RM;
import X.AnonymousClass89R;
import X.C003401n;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C28081Yu;
import X.C30901eh;
import X.C34001jj;
import X.C72473Md;
import X.C72483Me;
import X.C83984Hk;
import X.C91034f2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

public class TwoFactorAuthActivity extends AnonymousClass1FY implements AnonymousClass89R {
    public static final int[] A0C = {2131433398, 2131433399, 2131433400};
    public C003401n A00;
    public C30901eh A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public int[] A08;
    public boolean A09;
    public final Handler A0A;
    public final Runnable A0B;

    public TwoFactorAuthActivity() {
        this(0);
        this.A0A = C17890vO.A0D();
        this.A0B = new AnonymousClass7RC(this, 27);
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = (C30901eh) A0L.AB1.get();
        }
    }

    public boolean A4e(Fragment fragment) {
        if (this.A08.length == 1 || fragment.getClass() == SetEmailFragment.class) {
            return true;
        }
        return false;
    }

    public void C9N(int i) {
        Handler handler = this.A0A;
        handler.removeCallbacks(this.A0B);
        handler.postDelayed(new AnonymousClass7RM((Object) this, i, 48), 700);
    }

    public void C9O() {
        Handler handler = this.A0A;
        handler.removeCallbacks(this.A0B);
        handler.postDelayed(new AnonymousClass7RC(this, 25), 700);
    }

    public void A4b(View view, int i) {
        View A062 = AnonymousClass1HF.A06(view, 2131433397);
        if (C18020vd.A05(C18040vf.A02, this.A0E, 5711)) {
            A062.setVisibility(8);
            return;
        }
        int i2 = 0;
        A062.setVisibility(0);
        while (i2 < i) {
            i2++;
            C28081Yu.A00(ColorStateList.valueOf(AnonymousClass3Ma.A00(this, 2130970656, 2131102030)), AnonymousClass3MW.A0H(view, A0C[i2]));
        }
        int length = this.A08.length;
        while (true) {
            length++;
            int[] iArr = A0C;
            if (length < 3) {
                AnonymousClass3MY.A1B(view, iArr[length], 8);
            } else {
                return;
            }
        }
    }

    public void A4c(Fragment fragment, boolean z) {
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        A0H.A06(2130772058, 2130772061, 2130772057, 2130772062);
        A0H.A09(fragment, 2131429504);
        if (z) {
            A0H.A0H((String) null);
        }
        A0H.A01();
    }

    public void A4d(boolean z) {
        CNA(2131897199);
        this.A0A.postDelayed(this.A0B, C30901eh.A0G);
        this.A01.A00 = z;
        this.A05.CGN(new AnonymousClass7RC(this, 26));
    }

    public void onCreate(Bundle bundle) {
        Fragment hilt_SetCodeFragment;
        super.onCreate(bundle);
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        setTitle(2131896031);
        C003401n supportActionBar = getSupportActionBar();
        this.A00 = supportActionBar;
        boolean z = true;
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
        }
        setContentView(2131624119);
        int[] intArrayExtra = getIntent().getIntArrayExtra("workflows");
        C17960vV.A07(intArrayExtra);
        this.A08 = intArrayExtra;
        if (intArrayExtra.length <= 0) {
            z = false;
        }
        C17960vV.A0D(z);
        String stringExtra = getIntent().getStringExtra("primaryCTA");
        C17960vV.A07(stringExtra);
        this.A06 = stringExtra;
        this.A07 = getIntent().getBooleanExtra("isEntryPointSecurityCheckup", false);
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        int i = this.A08[0];
        if (i == 1) {
            Bundle A0D = C17880vN.A0D();
            A0D.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
            hilt_SetCodeFragment = new Hilt_SetCodeFragment();
            hilt_SetCodeFragment.A1R(A0D);
        } else if (i == 2) {
            hilt_SetCodeFragment = C83984Hk.A00(1);
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1I("Invalid work flow:", AnonymousClass000.A10(), i));
        }
        A0H.A09(hilt_SetCodeFragment, 2131429504);
        A0H.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A0K() > 0) {
                supportFragmentManager.A0b();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        List list = this.A01.A0A;
        C17960vV.A0D(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        List list = this.A01.A0A;
        C17960vV.A0D(!list.contains(this));
        list.add(this);
    }

    public TwoFactorAuthActivity(int i) {
        this.A09 = false;
        C91034f2.A00(this, 49);
    }
}
