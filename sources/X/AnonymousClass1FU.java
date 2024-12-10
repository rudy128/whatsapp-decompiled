package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1FU  reason: invalid class name */
public class AnonymousClass1FU extends AnonymousClass1FQ implements AnonymousClass1FR, AnonymousClass1FS, AnonymousClass1FT {
    public static final long A0V = 500;
    public static final String A0W = "screenshot.jpg";
    public View A00;
    public ViewGroup A01;
    public Toolbar A02;
    public AnonymousClass190 A03;
    public C218617r A04;
    public AnonymousClass1KB A05;
    public AnonymousClass18O A06;
    public AnonymousClass11E A07;
    public AnonymousClass11C A08;
    public AnonymousClass11P A09;
    public C19830z4 A0A;
    public AnonymousClass11O A0B;
    public AnonymousClass1L2 A0C;
    public AnonymousClass1KW A0D;
    public C18030ve A0E;
    public AnonymousClass1L1 A0F;
    public AnonymousClass00H A0G;
    public boolean A0H = true;
    public int A0I;
    public int A0J = 0;
    public long A0K;
    public Intent A0L;
    public View A0M;
    public ViewGroup A0N;
    public AnonymousClass02n A0O;
    public AnonymousClass1J4 A0P;
    public Integer A0Q;
    public String A0R = null;
    public boolean A0S;
    public final C23451Gc A0T = new C23451Gc(this);
    public final List A0U = new ArrayList();

    public void A3Y() {
    }

    public /* synthetic */ void A3g() {
        AnonymousClass1XH.A00(this);
    }

    public void A3h(int i) {
    }

    public /* synthetic */ void A3j(Context context, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, C18090vk r12, C18090vk r13, String[] strArr) {
        int i;
        int length;
        C18070vi.A0d(context, 1);
        if (str == null) {
            if (num2 == null) {
                str = null;
            } else if (strArr == null || (length = strArr.length) == 0) {
                str = context.getString(num2.intValue());
            } else {
                str = context.getString(num2.intValue(), Arrays.copyOf(strArr, length));
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        if (num != null) {
            alertDialog$Builder.A0E(num.intValue());
        }
        if (str != null) {
            alertDialog$Builder.A0S(str);
        }
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = 2131899286;
        }
        alertDialog$Builder.setPositiveButton(i, new AnonymousClass4aq(r12, 2));
        if (num4 != null) {
            alertDialog$Builder.setNegativeButton(num4.intValue(), new AnonymousClass4aq(r13, 3));
        }
        C010105w create = alertDialog$Builder.create();
        C18070vi.A0X(create);
        if (num5 != null) {
            int intValue = num5.intValue();
            Button button = create.A00.A0F;
            if (button != null) {
                button.setTextColor(intValue);
            }
        }
        create.show();
    }

    public void A3l(Intent intent) {
        A3q(intent, false);
    }

    public void A3p(Intent intent, String str, int i) {
        A3o(intent, (C1406772n) null, str, i);
    }

    public /* synthetic */ void A40(Integer num, Integer num2, Integer num3, Object[] objArr) {
        AnonymousClass1XH.A01(this, num, num2, num3, objArr);
    }

    public /* synthetic */ void Bjo(String str) {
    }

    public /* synthetic */ void BkF(String str) {
    }

    public /* synthetic */ void CBt(String str) {
    }

    public void CNh(Intent intent, int i) {
        A3n(intent, i, false);
    }

    private AnonymousClass1J4 A03() {
        return (AnonymousClass1J4) new C24071It(new C24061Is(this), this).A00(AnonymousClass1J4.class);
    }

    private void A0Q() {
        Intent intent = this.A0L;
        if (intent != null) {
            Integer num = this.A0Q;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            if (this.A0S) {
                finish();
            }
            this.A0L = null;
            this.A0Q = null;
            this.A0S = false;
        }
    }

    public static /* synthetic */ void A0b(Bitmap bitmap, File file) {
        StringBuilder sb;
        String str;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return;
        } catch (FileNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str = "File not found: ";
            sb.append(str);
            sb.append(e.getMessage());
            Log.e(sb.toString());
            return;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "IOException: ";
            sb.append(str);
            sb.append(e.getMessage());
            Log.e(sb.toString());
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    private void A0c(Bundle bundle) {
        String str = this.A0R;
        int i = this.A0J;
        C18070vi.A0d(bundle, 0);
        bundle.putInt("wa_handler_request_code", i);
        bundle.putString("wa_result_handler_key", str);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    private void A0d(Bundle bundle) {
        int intExtra;
        String str;
        this.A0O = CDw(new C64812vN(this, 3), new Object());
        Intent intent = getIntent();
        C18070vi.A0d(intent, 1);
        if (bundle != null) {
            intExtra = bundle.getInt("wa_handler_request_code");
        } else {
            intExtra = intent.getIntExtra("wa_handler_request_code", 0);
        }
        this.A0J = intExtra;
        Intent intent2 = getIntent();
        C18070vi.A0d(intent2, 1);
        if (bundle == null || (str = bundle.getString("wa_result_handler_key")) == null) {
            str = intent2.getStringExtra("wa_result_handler_key");
        }
        this.A0R = str;
    }

    public static void A0e(C005702m r5, AnonymousClass1FU r6) {
        String stringExtra;
        AnonymousClass2ZU r4 = (AnonymousClass2ZU) r6.A0G.get();
        C18070vi.A0d(r5, 0);
        Intent intent = r5.A01;
        if (intent == null || (stringExtra = intent.getStringExtra("wa_result_handler_key")) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Handler key not found ");
            sb.append(r5);
            Log.e(sb.toString());
            return;
        }
        int intExtra = intent.getIntExtra("wa_handler_request_code", 0);
        AnonymousClass2ZT r0 = (AnonymousClass2ZT) r4.A00.get(stringExtra);
        if (r0 != null) {
            Object obj = r0.A00.get();
            C18070vi.A0X(obj);
            AnonymousClass749 r02 = (AnonymousClass749) obj;
            if (r02 != null) {
                r02.A06(r5, r6, intExtra, false);
            }
        }
    }

    public void A2l(Fragment fragment) {
        this.A0U.add(new WeakReference(fragment));
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.ViewGroup$MarginLayoutParams, X.039] */
    public void A2v(boolean z) {
        C003401n supportActionBar;
        if (z || this.A0M != null) {
            int i = 0;
            if (this.A0M == null) {
                View inflate = getLayoutInflater().inflate(2131624002, (ViewGroup) null, false);
                View findViewById = inflate.findViewById(2131434181);
                this.A0M = findViewById;
                if (!(findViewById == null || (supportActionBar = getSupportActionBar()) == null)) {
                    supportActionBar.A0G();
                    ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.A00 = 21;
                    supportActionBar.A0Q(inflate, marginLayoutParams);
                }
            }
            View view = this.A0M;
            if (view != null) {
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    public Window A3U(String str) {
        Dialog dialog;
        Fragment A0Q2 = this.A03.A00.A03.A0Q(str);
        if (!(A0Q2 instanceof DialogFragment) || (dialog = ((DialogFragment) A0Q2).A03) == null) {
            return null;
        }
        return dialog.getWindow();
    }

    public List A3W() {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : this.A0U) {
            Fragment fragment = (Fragment) reference.get();
            if (fragment != null && fragment.A1b()) {
                arrayList.add(fragment);
            }
        }
        return arrayList;
    }

    public void A3m(Intent intent) {
        int i = this.A0J;
        String str = this.A0R;
        C18070vi.A0d(intent, 0);
        intent.putExtra("wa_handler_request_code", i);
        intent.putExtra("wa_result_handler_key", str);
    }

    public void A3n(Intent intent, int i, boolean z) {
        if (!this.A0H) {
            this.A0L = intent;
            this.A0Q = Integer.valueOf(i);
            this.A0S = z;
            return;
        }
        startActivityForResult(intent, i);
        if (z) {
            finish();
        }
    }

    public void A3o(Intent intent, C1406772n r3, String str, int i) {
        if (this.A0O != null) {
            C18070vi.A0d(intent, 0);
            intent.putExtra("wa_result_handler_key", str);
            intent.putExtra("wa_handler_request_code", i);
            AnonymousClass02n r0 = this.A0O;
            C17960vV.A07(r0);
            r0.A02(r3, intent);
        }
    }

    public void A3q(Intent intent, boolean z) {
        boolean z2;
        if (!this.A0H) {
            this.A0L = intent;
            z2 = false;
        } else {
            startActivity(intent);
            z2 = true;
        }
        if (!z) {
            return;
        }
        if (z2) {
            finish();
        } else {
            this.A0S = true;
        }
    }

    public void A3s(Configuration configuration) {
        this.A0P.A0T(configuration);
    }

    public void A42(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(2131168960));
        C003401n supportActionBar = getSupportActionBar();
        C17960vV.A07(supportActionBar);
        supportActionBar.A0R(C43251zV.A03(this, textPaint, this.A0D, str));
    }

    public void A43(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(2131169036));
        setTitle(C43251zV.A03(this, textPaint, this.A0D, str));
    }

    public boolean A46() {
        if (this.A07.A09()) {
            return false;
        }
        int i = 2131892439;
        if (AnonymousClass11E.A02(this)) {
            i = 2131892440;
        }
        BhQ(i);
        return true;
    }

    public boolean A47(int i) {
        if (this.A07.A09()) {
            return false;
        }
        BhQ(i);
        return true;
    }

    public AnonymousClass1GP BZu() {
        return this.A03.A00.A03;
    }

    public void C81(AnonymousClass02B r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            toolbar.setImportantForAccessibility(0);
        }
    }

    public void C82(AnonymousClass02B r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            toolbar.setImportantForAccessibility(4);
        }
    }

    public void CEx() {
        C23451Gc r1 = this.A0T;
        C23451Gc.A02 = false;
        if (!AnonymousClass4Yv.A02(r1.A01)) {
            ProgressDialogFragment progressDialogFragment = r1.A00;
            if (progressDialogFragment != null) {
                progressDialogFragment.A29();
            }
            r1.A00 = null;
        }
    }

    public /* synthetic */ void CMx(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Object[] objArr) {
        int i;
        AnonymousClass1GP r0 = this.A03.A00.A03;
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = 2131899286;
        }
        AnonymousClass9P2.A00(r0, num, num2, num4, num5, str, str2, objArr, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((this.A0H || SystemClock.elapsedRealtime() - this.A0K > 500 || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2)) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        if (Build.VERSION.SDK_INT < 29) {
            onStateNotSaved();
        }
        if (this.A0H) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        if (r2.data != 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            int r0 = X.AnonymousClass013.A00
            r5.A0I = r0
            X.1J4 r1 = r5.A03()
            r5.A0P = r1
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1.A00 = r0
            X.1J4 r0 = r5.A0P
            X.1DT r2 = r0.A01
            r1 = 0
            X.2vi r0 = new X.2vi
            r0.<init>(r5, r1)
            r2.A0A(r5, r0)
            android.content.res.Resources$Theme r1 = r5.getTheme()
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r0 = 2130972038(0x7f040d86, float:1.7552831E38)
            r3 = 1
            r1.resolveAttribute(r0, r2, r3)
            int r1 = r2.type
            r0 = 18
            if (r1 != r0) goto L_0x0040
            int r1 = r2.data
            r0 = 1
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r4 = r0 ^ 1
            if (r4 == 0) goto L_0x004f
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2132083487(0x7f15031f, float:1.9807118E38)
            r1.applyStyle(r0, r3)
        L_0x004f:
            super.onCreate(r6)
            if (r4 == 0) goto L_0x0065
            X.0ve r2 = r5.A0E
            if (r2 == 0) goto L_0x0065
            r1 = 10380(0x288c, float:1.4545E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0065
            r5.A2r(r3)
        L_0x0065:
            X.0ve r2 = r5.A0E
            X.0vb r1 = r5.A00
            android.view.Window r0 = r5.getWindow()
            X.C27641Ww.A08(r0, r1, r2)
            X.0ve r2 = r5.A0E
            if (r2 == 0) goto L_0x007e
            r1 = 9620(0x2594, float:1.348E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00a0
        L_0x007e:
            X.0vb r0 = r5.A00
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00a0
            android.content.res.Resources$Theme r2 = r5.getTheme()
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 2130971016(0x7f040988, float:1.7550758E38)
            r2.resolveAttribute(r0, r1, r3)
            int r0 = r1.type
            if (r0 != r3) goto L_0x00ac
            int r0 = r1.data
        L_0x009d:
            r2.applyStyle(r0, r3)
        L_0x00a0:
            if (r4 == 0) goto L_0x00a5
            r5.A3f()
        L_0x00a5:
            X.AnonymousClass1XH.A00(r5)
            r5.A0d(r6)
            return
        L_0x00ac:
            r0 = 2132083620(0x7f1503a4, float:1.9807387E38)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FU.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C23451Gc r1 = this.A0T;
        ProgressDialogFragment progressDialogFragment = r1.A00;
        if (progressDialogFragment != null) {
            progressDialogFragment.A29();
        }
        r1.A00 = null;
        this.A0L = null;
        this.A0S = false;
        super.onDestroy();
    }

    public void onPause() {
        this.A05.A0A(this);
        super.onPause();
        this.A0H = false;
        this.A0K = SystemClock.elapsedRealtime();
    }

    public void setContentView(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass1HF.A0c(view, 8);
        }
        if (this.A01 != null) {
            this.A0N.addView(view, -1, -1);
            view = this.A01;
        }
        this.A00 = view;
        super.setContentView(view);
    }

    public AnonymousClass1FU(int i) {
        super(i);
    }

    public static AnonymousClass1FU A00(Context context) {
        Activity A002 = C18050vg.A00(context);
        if (A002 instanceof AnonymousClass1FU) {
            return (AnonymousClass1FU) A002;
        }
        return null;
    }

    private void A0V() {
        getTheme().resolveAttribute(2130972038, new TypedValue(), true);
    }

    /* JADX INFO: finally extract failed */
    private void A0W(int i) {
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(i, (ViewGroup) null, false);
        toolbar.setFitsSystemWindows(true);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(2130968594, typedValue, true);
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, C002501d.A00);
        try {
            float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
            obtainStyledAttributes.recycle();
            toolbar.setElevation(dimension);
            AnonymousClass01V r3 = (AnonymousClass01V) A2n();
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            boolean z = true;
            if (!r3.A0P && !r3.A06.hasFeature(9)) {
                z = false;
            }
            if (z) {
                this.A01 = new FrameLayout(this);
                FrameLayout frameLayout = new FrameLayout(this);
                this.A0N = frameLayout;
                this.A01.addView(frameLayout, -1, -1);
            } else {
                LinearLayout linearLayout = new LinearLayout(this);
                this.A01 = linearLayout;
                this.A0N = linearLayout;
                linearLayout.setOrientation(1);
            }
            this.A01.addView(toolbar, -1, getResources().getDimensionPixelSize(2131165285));
            setSupportActionBar(toolbar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void A0X(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime < j2) {
            SystemClock.sleep(j2 - elapsedRealtime);
        }
    }

    public Uri A3T() {
        View rootView = getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap drawingCache = rootView.getDrawingCache();
        if (drawingCache == null) {
            Log.i("DialogActivity: takeScreenshot() - rootView.getDrawingCache() is null");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
        rootView.setDrawingCacheEnabled(false);
        File A022 = C218617r.A02(this.A04.A0G(), A0W);
        this.A05.CGN(new C70713Cf(A022, createBitmap, 24));
        return C64062u9.A02(this, A022);
    }

    public DialogFragment A3V(Class cls) {
        if (Bed()) {
            return null;
        }
        Fragment A0Q2 = this.A03.A00.A03.A0Q(cls.getName());
        if (A0Q2 instanceof DialogFragment) {
            return (DialogFragment) A0Q2;
        }
        return null;
    }

    public void A3X() {
    }

    public void A3Z() {
    }

    public void A3a() {
    }

    public void A3b() {
    }

    public void A3c() {
    }

    public void A3d() {
    }

    public void A3e() {
        View view;
        if (!isFinishing() && (view = this.A00) != null) {
            view.postDelayed(new C70603Bt(this, 0), 300);
        }
    }

    public void A3f() {
        A0W(2131627211);
    }

    public void A3i(int i, int i2) {
        View view;
        if (!Bed()) {
            this.A0T.A00(0, i);
            if (!isFinishing() && (view = this.A00) != null) {
                view.postDelayed(new C70603Bt(this, 0), (long) i2);
            }
        }
    }

    public void A3k(DialogInterface.OnKeyListener onKeyListener, int i, int i2) {
        if (!Bed()) {
            C23451Gc r1 = this.A0T;
            if (r1.A00 == null) {
                ProgressDialogFragment A002 = ProgressDialogFragment.A00(i, i2);
                r1.A00 = A002;
                A002.A00 = onKeyListener;
                A002.A2C(r1.A01.A03.A00.A03, C23451Gc.A03);
            }
            C23451Gc.A02 = true;
        }
    }

    public void A3r(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Deprecated
    public void A3t(C72033Kj r12, int i, int i2, int i3) {
        if (!Bed()) {
            int i4 = i2;
            AnonymousClass4FY.A00(new C26331Cxo(r12, 8), (DialogInterface.OnClickListener) null, (CharSequence) null, new Object[0], new Object[0], i2, i4, i3, 0, i).A2C(this.A03.A00.A03, (String) null);
        }
    }

    public void A3u(C72033Kj r12, int i, int i2, int i3) {
        if (!Bed()) {
            AnonymousClass4FY.A00(new C1411874q(1), new C26331Cxo(r12, 7), (CharSequence) null, new Object[0], (Object[]) null, i, i, i2, i3, 0).A2C(this.A03.A00.A03, (String) null);
        }
    }

    @Deprecated
    public void A3v(C72033Kj r12, int i, int i2, int i3, int i4) {
        if (!Bed()) {
            int i5 = i2;
            AnonymousClass4FY.A00(new C26331Cxo(r12, 4), new C1411874q(0), (CharSequence) null, new Object[0], new Object[0], i2, i5, i3, i4, i).A2C(this.A03.A00.A03, (String) null);
        }
    }

    @Deprecated
    public void A3w(C72033Kj r12, C72033Kj r13, int i, int i2, int i3) {
        if (!Bed()) {
            AnonymousClass4FY.A00(new C26331Cxo(r12, 11), new C26331Cxo(r13, 12), (CharSequence) null, new Object[0], (Object[]) null, i, i, i2, i3, 0).A2C(this.A03.A00.A03, (String) null);
        }
    }

    @Deprecated
    public void A3x(C72033Kj r12, C72033Kj r13, int i, int i2, int i3, int i4) {
        if (!Bed()) {
            int i5 = i2;
            AnonymousClass4FY.A00(new C26331Cxo(r12, 5), new C26331Cxo(r13, 6), (CharSequence) null, new Object[0], new Object[0], i2, i5, i3, i4, i).A2C(this.A03.A00.A03, (String) null);
        }
    }

    public void A3y(C72033Kj r12, C72033Kj r13, int i, int i2, int i3, int i4) {
        if (!Bed()) {
            int i5 = i2;
            CMk(AnonymousClass4FY.A00(new C26331Cxo(r12, 9), new C26331Cxo(r13, 10), (CharSequence) null, new Object[0], new Object[0], i2, i5, i3, i4, i), (String) null);
        }
    }

    public /* synthetic */ void A3z(Integer num) {
        if (num.intValue() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append(" ActivityLifecycleCallbacks: Recreating");
            Log.i(sb.toString());
            recreate();
        }
    }

    public void A41(String str) {
        if (!Bed()) {
            AnonymousClass1GP r0 = this.A03.A00.A03;
            C34001jj r1 = new C34001jj(r0);
            Fragment A0Q2 = r0.A0Q(str);
            if (A0Q2 != null) {
                r1.A07(A0Q2);
                r1.A00(true);
            }
        }
    }

    public void A44(String str) {
        if (!Bed()) {
            this.A0T.A01((String) null, str);
        }
    }

    public void A45(String str, String str2) {
        if (!Bed()) {
            this.A0T.A01(str, str2);
        }
    }

    public boolean Bed() {
        return AnonymousClass4Yv.A02(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r5 != 0) goto L_0x001b;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BhQ(int r5) {
        /*
            r4 = this;
            boolean r0 = r4.Bed()
            if (r0 != 0) goto L_0x002c
            r3 = 0
            com.whatsapp.LegacyMessageDialogFragment r2 = new com.whatsapp.LegacyMessageDialogFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = -1
            if (r5 == r0) goto L_0x001b
            java.lang.String r0 = "id"
            r1.putInt(r0, r5)
            if (r5 == 0) goto L_0x0020
        L_0x001b:
            java.lang.String r0 = "message_res"
            r1.putInt(r0, r5)
        L_0x0020:
            r2.A1R(r1)
            X.1Gb r0 = r4.A03
            X.1GO r0 = r0.A00
            X.1GP r0 = r0.A03
            r2.A2C(r0, r3)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FU.BhQ(int):void");
    }

    @Deprecated
    public void BhR(String str) {
        if (!Bed()) {
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putCharSequence("message", str);
            }
            legacyMessageDialogFragment.A1R(bundle);
            legacyMessageDialogFragment.A2C(this.A03.A00.A03, (String) null);
        }
    }

    @Deprecated
    public void BhS(String str, String str2) {
        if (!Bed()) {
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putCharSequence("title", str);
            }
            if (str2 != null) {
                bundle.putCharSequence("message", str2);
            }
            legacyMessageDialogFragment.A1R(bundle);
            legacyMessageDialogFragment.A2C(this.A03.A00.A03, (String) null);
        }
    }

    @Deprecated
    public void BhT(C72033Kj r12, Object[] objArr, int i, int i2, int i3) {
        if (!Bed()) {
            int i4 = i2;
            AnonymousClass4FY.A00(new C26331Cxo(r12, 3), new C1411874q(2), (CharSequence) null, objArr, new Object[0], i2, i4, i3, 2131898766, i).A2C(this.A03.A00.A03, (String) null);
        }
    }

    @Deprecated
    public void BhU(Object[] objArr, int i, int i2) {
        if (!Bed()) {
            AnonymousClass4FY.A00((DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, (CharSequence) null, objArr, new Object[0], i2, i2, 0, 0, i).A2C(this.A03.A00.A03, (String) null);
        }
    }

    public void CMk(DialogFragment dialogFragment, String str) {
        if (!Bed()) {
            C20098A7b.A03(dialogFragment, this.A03.A00.A03, str);
        }
    }

    public void CMl(DialogFragment dialogFragment) {
        if (!Bed()) {
            C20098A7b.A01(dialogFragment, this.A03.A00.A03);
        }
    }

    public void CMm(DialogFragment dialogFragment, String str) {
        if (!Bed()) {
            C20098A7b.A04(dialogFragment, this.A03.A00.A03, str);
        }
    }

    public void CNA(int i) {
        if (!Bed()) {
            CNB(0, i);
        }
    }

    public void CNB(int i, int i2) {
        if (!Bed()) {
            this.A0T.A00(i, i2);
        }
    }

    public AnonymousClass02B COJ(AnonymousClass02H r5) {
        AnonymousClass02B COJ = super.COJ(r5);
        if (COJ != null) {
            COJ.A06();
        }
        View findViewById = findViewById(2131427512);
        if (findViewById != null) {
            AnonymousClass1HF.A0f(findViewById, new AnonymousClass3SS(this, 0));
        }
        return COJ;
    }

    public void CRG(String str) {
        StringBuilder sb;
        String str2;
        if (!Bed()) {
            ProgressDialogFragment progressDialogFragment = this.A0T.A00;
            if (progressDialogFragment == null) {
                sb = new StringBuilder();
                str2 = "dialogtoast/update-progress-message/progress-spinner-not-shown \"";
            } else {
                Dialog dialog = progressDialogFragment.A03;
                if (dialog == null) {
                    sb = new StringBuilder();
                    str2 = "dialogtoast/update-progress-message/null-dialog/ \"";
                } else if (!(dialog instanceof ProgressDialog)) {
                    sb = new StringBuilder();
                    str2 = "dialogtoast/update-progress-message/dialog-type-not-progress-dialog/ \"";
                } else {
                    ((AlertDialog) dialog).setMessage(str);
                    return;
                }
            }
            sb.append(str2);
            sb.append(str);
            sb.append("\"");
            Log.w(sb.toString());
        }
    }

    public C18030ve getAbProps() {
        return this.A0E;
    }

    public View getContentView() {
        return this.A00;
    }

    public AnonymousClass190 getCrashLogs() {
        return this.A03;
    }

    public AnonymousClass1KW getEmojiLoader() {
        return this.A0D;
    }

    public AnonymousClass1KB getGlobalUI() {
        return this.A05;
    }

    public AnonymousClass18O getServerProps() {
        return this.A06;
    }

    public AnonymousClass11C getSystemServices() {
        return this.A08;
    }

    public C19830z4 getWaSharedPreferences() {
        return this.A0A;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A3s(configuration);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onRestart() {
        super.onRestart();
        if (AnonymousClass013.A00 != this.A0I) {
            recreate();
        }
    }

    public void onResume() {
        super.onResume();
        this.A05.A0C(this);
        this.A0H = true;
        A0Q();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A0c(bundle);
    }

    public void onStart() {
        super.onStart();
        this.A0P.A0T(getResources().getConfiguration());
    }

    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        this.A02 = toolbar;
    }

    public AnonymousClass1FU() {
    }

    public void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null, false));
    }
}
