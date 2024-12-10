package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.util.Log;

/* renamed from: X.8dO  reason: invalid class name and case insensitive filesystem */
public abstract class C166668dO extends C166958eu implements AnonymousClass1FR {
    public Intent A00;
    public AnonymousClass1KB A01;
    public Integer A02;
    public boolean A03 = true;
    public boolean A04;
    public int A05;
    public int A06;
    public long A07;
    public ProgressDialog A08;
    @Deprecated
    public String A09;
    public WaPreferenceFragment A0A;
    public final AnonymousClass11V A0B = new C95294m0(this, 0);

    public void CEx() {
        this.A08 = null;
        AnonymousClass4Yv.A00(this, 501);
    }

    public void onCreate(Bundle bundle) {
        this.A04 = false;
        getTheme().applyStyle(2132083487, true);
        getLayoutInflater().setFactory2(new AF9(A2n()));
        A2n().A0b();
        super.onCreate(bundle);
        C18030ve r2 = this.A01;
        C27641Ww.A08(getWindow(), this.A00, r2);
        View findViewById = findViewById(16908298);
        if (findViewById != null) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingLeft2 = findViewById.getPaddingLeft();
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                paddingLeft += view.getPaddingLeft();
                paddingLeft2 += view.getPaddingRight();
                view.setPadding(0, 0, 0, 0);
            }
            findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
            findViewById.setScrollBarStyle(33554432);
        }
        C18000vb r0 = this.A00;
        r0.A09.add(this.A0B);
    }

    public void BhQ(int i) {
        this.A05 = i;
        AnonymousClass4Yv.A01(this, 500);
    }

    @Deprecated
    public void BhR(String str) {
        this.A09 = str;
        AnonymousClass4Yv.A01(this, 500);
    }

    public void BhS(String str, String str2) {
        throw AnonymousClass000.A0n("Unsupported operation");
    }

    public void BhU(Object[] objArr, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        AnonymousClass4Yv.A01(this, 500);
    }

    public void CMm(DialogFragment dialogFragment, String str) {
        if (!AnonymousClass4Yv.A02(this)) {
            C20098A7b.A04(dialogFragment, getSupportFragmentManager(), "BrazilPaymentIncomeCollectionBottomSheet");
        }
    }

    public void CNB(int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        AnonymousClass4Yv.A01(this, 501);
    }

    public void CRG(String str) {
        ProgressDialog progressDialog = this.A08;
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((this.A03 || SystemClock.elapsedRealtime() - this.A07 > 500 || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2)) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        if (this.A03) {
            super.onBackPressed();
        } else {
            Log.e("dialogtoasttreferenceactivity/onbackpressed/activity no active");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A00.A0O();
        super.onConfigurationChanged(configuration);
        A2n().A0a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r13) {
        /*
            r12 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r13 == r0) goto L_0x00d2
            r0 = 501(0x1f5, float:7.02E-43)
            if (r13 == r0) goto L_0x00ba
            com.whatsapp.WaPreferenceFragment r3 = r12.A0A
            boolean r0 = r3 instanceof com.whatsapp.settings.SettingsJidNotificationFragment
            if (r0 == 0) goto L_0x002c
            com.whatsapp.settings.SettingsJidNotificationFragment r3 = (com.whatsapp.settings.SettingsJidNotificationFragment) r3
            if (r13 != 0) goto L_0x00b5
            X.8dO r4 = r3.A00
            X.1KW r6 = r3.A04
            X.1L9 r5 = r3.A00
            X.129 r7 = r3.A07
            r0 = 2131894704(0x7f1221b0, float:1.942422E38)
            java.lang.String r8 = r3.A1H(r0)
            r10 = 0
            java.lang.String r9 = "26000003"
            r11 = r10
            X.05w r0 = X.AnonymousClass9QX.A00(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0029:
            if (r0 == 0) goto L_0x00b5
            return r0
        L_0x002c:
            boolean r0 = r3 instanceof com.whatsapp.settings.SettingsChatHistoryFragment
            if (r0 == 0) goto L_0x00b5
            com.whatsapp.settings.SettingsChatHistoryFragment r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r3
            X.8dO r5 = r3.A00
            r4 = 0
            if (r5 == 0) goto L_0x00b5
            r8 = 3
            r6 = 0
            if (r13 == r8) goto L_0x009f
            r0 = 4
            if (r13 == r0) goto L_0x0082
            r0 = 5
            if (r13 == r0) goto L_0x0050
            r0 = 10
            if (r13 != r0) goto L_0x00b5
            X.1BI r1 = r3.A0A
            if (r1 == 0) goto L_0x00b5
            X.4Xl r0 = r3.A06
            X.05w r0 = r0.A01(r5, r5, r1)
            goto L_0x0029
        L_0x0050:
            X.1Nd r0 = r3.A05
            int r0 = r0.A05()
            if (r0 <= 0) goto L_0x0059
            r6 = 1
        L_0x0059:
            X.A9T r2 = new X.A9T
            r2.<init>(r8, r3, r6)
            android.content.Context r0 = r3.A1n()
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131897264(0x7f122bb0, float:1.9429413E38)
            if (r6 == 0) goto L_0x006e
            r0 = 2131886723(0x7f120283, float:1.9408033E38)
        L_0x006e:
            r1.A0D(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.A0Z(r2, r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r1.A0X(r4, r0)
            X.05w r0 = r1.create()
            goto L_0x0029
        L_0x0082:
            X.Ae9 r1 = new X.Ae9
            r1.<init>(r3)
            X.1oO r2 = r3.A0B
            android.content.Context r3 = r3.A1n()
            r0 = 1
            X.4qY r4 = new X.4qY
            r4.<init>(r1, r0)
            r5 = -1
            r8 = r6
            r7 = r6
            X.3Rj r0 = r2.A00(r3, r4, r5, r6, r7, r8)
            X.05w r0 = r0.create()
            goto L_0x0029
        L_0x009f:
            X.AeB r6 = new X.AeB
            r6.<init>(r3)
            X.1oO r4 = r3.A0B
            r9 = 1
            r7 = -1
            r10 = r9
            X.3Rj r0 = r4.A00(r5, r6, r7, r8, r9, r10)
            X.05w r0 = r0.create()
            r0.show()
            return r0
        L_0x00b5:
            android.app.Dialog r0 = super.onCreateDialog(r13)
            return r0
        L_0x00ba:
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r12)
            int r0 = r12.A06
            if (r0 == 0) goto L_0x00c6
            r1.setTitle(r0)
        L_0x00c6:
            int r0 = r12.A05
            java.lang.String r0 = r12.getString(r0)
            X.AnonymousClass8BX.A0x(r1, r0)
            r12.A08 = r1
            return r1
        L_0x00d2:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r12)
            java.lang.String r0 = r12.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fa
            int r0 = r12.A05
            java.lang.String r0 = r12.getString(r0)
        L_0x00e4:
            r2.A0S(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 3
            X.C20151A9n.A00(r2, r12, r0, r1)
            int r0 = r12.A06
            if (r0 == 0) goto L_0x00f5
            r2.A0E(r0)
        L_0x00f5:
            X.05w r1 = r2.create()
            return r1
        L_0x00fa:
            java.lang.String r0 = r12.A09
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166668dO.onCreateDialog(int):android.app.Dialog");
    }

    public void onPause() {
        this.A01.A0A(this);
        super.onPause();
        this.A03 = false;
        this.A07 = SystemClock.elapsedRealtime();
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        String str;
        if (i != 500) {
            super.onPrepareDialog(i, dialog);
            return;
        }
        C010105w r4 = (C010105w) dialog;
        if (TextUtils.isEmpty(this.A09)) {
            str = getString(this.A05);
        } else {
            str = this.A09;
        }
        AnonymousClass0QH r0 = r4.A00;
        r0.A0R = str;
        TextView textView = r0.A0L;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public boolean Bed() {
        return AnonymousClass4Yv.A02(this);
    }

    public void CMk(DialogFragment dialogFragment, String str) {
        if (!AnonymousClass4Yv.A02(this)) {
            C20098A7b.A03(dialogFragment, getSupportFragmentManager(), str);
        }
    }

    public void CMl(DialogFragment dialogFragment) {
        if (!AnonymousClass4Yv.A02(this)) {
            C20098A7b.A01(dialogFragment, getSupportFragmentManager());
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A2n().A0g(view, layoutParams);
    }

    public void onDestroy() {
        super.onDestroy();
        A2n().A0c();
        C18000vb r0 = this.A00;
        r0.A09.remove(this.A0B);
        this.A00 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        AnonymousClass01V.A0O((AnonymousClass01V) A2n());
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass01V r0 = (AnonymousClass01V) A2n();
        AnonymousClass01V.A0P(r0);
        C003401n r1 = r0.A09;
        if (r1 != null) {
            r1.A0Z(true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A09 = bundle.getString("dialogToastMessage");
        this.A05 = bundle.getInt("dialogToastMessageId", 0);
        this.A06 = bundle.getInt("dialogToastTitleId", 0);
    }

    public void onResume() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BW.A1M(this, A10);
        C17890vO.A1A(A10, ".onResume");
        if (this.A04) {
            this.A04 = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A01.A0C(this);
        this.A03 = true;
        Intent intent = this.A00;
        if (intent != null) {
            Integer num = this.A02;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            this.A00 = null;
            this.A02 = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BW.A1M(this, A10);
        C17890vO.A1A(A10, ".onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("dialogToastMessage", this.A09);
        bundle.putInt("dialogToastMessageId", this.A05);
        bundle.putInt("dialogToastTitleId", this.A06);
    }

    public void onStop() {
        super.onStop();
        AnonymousClass01V r0 = (AnonymousClass01V) A2n();
        AnonymousClass01V.A0P(r0);
        C003401n r1 = r0.A09;
        if (r1 != null) {
            r1.A0Z(false);
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A2n().A0j(charSequence);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A2n().A0h(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A2n().A0i(toolbar);
        if (toolbar != null && C22891Dp.A02) {
            C28261Zr.A00(getWindow(), toolbar);
        }
    }

    public void BhT(C72033Kj r1, Object[] objArr, int i, int i2, int i3) {
        BhU(objArr, i, i2);
    }

    public void setContentView(int i) {
        Toolbar toolbar = (Toolbar) AnonymousClass3MX.A09(getLayoutInflater(), (ViewGroup) null, 2131627211);
        toolbar.setTitle(getTitle());
        toolbar.setElevation(C28891bE.A00(this));
        int i2 = 2131230921;
        if (AnonymousClass3MW.A1Z(this.A00)) {
            i2 = 2131231900;
        }
        toolbar.setNavigationIcon(i2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, -1, getResources().getDimensionPixelSize(2131165186));
        FrameLayout frameLayout = new FrameLayout(this);
        getLayoutInflater().inflate(i, frameLayout, true);
        linearLayout.addView(frameLayout, -1, -1);
        setContentView((View) linearLayout);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new AFE(this, 22));
    }

    public void setContentView(View view) {
        A2n().A0f(view);
    }
}
