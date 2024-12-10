package com.whatsapp.viewsharedcontacts;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LA;
import X.AnonymousClass1M9;
import X.AnonymousClass1VP;
import X.AnonymousClass205;
import X.AnonymousClass25A;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6MV;
import X.AnonymousClass6UK;
import X.AnonymousClass700;
import X.AnonymousClass73C;
import X.AnonymousClass78L;
import X.AnonymousClass7E0;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C112065ks;
import X.C113425n4;
import X.C129386hi;
import X.C1423379b;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C19830z4;
import X.C219217x;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C27201Vd;
import X.C30191dX;
import X.C33251iW;
import X.C34481kY;
import X.C36451nu;
import X.C37311pJ;
import X.C37451pZ;
import X.C37721q1;
import X.C72453Mb;
import X.C72473Md;
import X.C88184Yq;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ViewSharedContactArrayActivity extends AnonymousClass1FY {
    public AnonymousClass1LA A00;
    public C33251iW A01;
    public AnonymousClass1VP A02;
    public C30191dX A03;
    public AnonymousClass1M9 A04;
    public C24671Lf A05;
    public AnonymousClass700 A06;
    public C24921Me A07;
    public C37451pZ A08;
    public C27201Vd A09;
    public C37311pJ A0A;
    public C88184Yq A0B;
    public AnonymousClass118 A0C;
    public C219217x A0D;
    public C19830z4 A0E;
    public C18000vb A0F;
    public AnonymousClass122 A0G;
    public AnonymousClass1BI A0H;
    public C36451nu A0I;
    public AnonymousClass1DC A0J;
    public C34481kY A0K;
    public C112065ks A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public List A0P;
    public Pattern A0Q;
    public AnonymousClass73C A0R;
    public boolean A0S;
    public boolean A0T;
    public C23581Gv A0U;
    public boolean A0V;
    public final ArrayList A0W;
    public final ArrayList A0X;
    public final ArrayList A0Y;
    public final List A0Z;

    public static String A0Q(ViewSharedContactArrayActivity viewSharedContactArrayActivity, Class cls, int i) {
        try {
            Method method = cls.getMethod("getTypeLabelResource", new Class[]{Integer.TYPE});
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, i, 0);
            return viewSharedContactArrayActivity.A0F.A0A(((Integer) method.invoke((Object) null, objArr)).intValue());
        } catch (Exception e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public static void A0c(C113425n4 r4, ViewSharedContactArrayActivity viewSharedContactArrayActivity, String str, String str2, int i, int i2, boolean z) {
        TextView textView = r4.A07;
        if (i2 > 1) {
            textView.setMaxLines(i2);
            textView.setSingleLine(false);
        } else {
            textView.setSingleLine(true);
        }
        textView.setTextDirection(3);
        if (!str.equalsIgnoreCase("null")) {
            textView.setText(str);
        }
        if (str2 == null || str2.equalsIgnoreCase("null")) {
            r4.A06.setText(2131892956);
        } else {
            r4.A06.setText(str2);
        }
        r4.A03.setImageResource(i);
        if (viewSharedContactArrayActivity.A0S) {
            CheckBox checkBox = r4.A02;
            checkBox.setChecked(z);
            checkBox.setClickable(false);
            checkBox.setVisibility(0);
            AnonymousClass78L.A00(r4.A00, viewSharedContactArrayActivity, 32);
        }
    }

    public static void A0V(C113425n4 r3) {
        r3.A01.setClickable(false);
        ImageView imageView = r3.A04;
        imageView.setVisibility(8);
        imageView.setClickable(false);
        ImageView imageView2 = r3.A05;
        imageView2.setVisibility(8);
        imageView2.setClickable(false);
    }

    public void A2y() {
        if (!this.A0V) {
            this.A0V = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r3 = A0A2.A00;
            C109005cf.A0d(A0A2, r3, this);
            C109005cf.A0e(A0A2, r3, this, r3.A5A);
            this.A0C = AnonymousClass3MZ.A0l(A0A2);
            this.A01 = AnonymousClass3MZ.A0U(A0A2);
            this.A0K = (C34481kY) A0A2.ABK.get();
            this.A02 = (AnonymousClass1VP) A0A2.A1l.get();
            this.A09 = AnonymousClass3MZ.A0i(A0A2);
            this.A04 = AnonymousClass10E.A4z(A0A2);
            this.A07 = AnonymousClass3MZ.A0g(A0A2);
            this.A0F = AnonymousClass10E.A6Q(A0A2);
            this.A0J = AnonymousClass3MZ.A13(A0A2);
            this.A0G = AnonymousClass3MZ.A0n(A0A2);
            this.A0N = AnonymousClass3MX.A12(A0A2);
            this.A00 = C72453Mb.A0b(A0A2);
            this.A06 = (AnonymousClass700) r3.AH6.get();
            this.A0M = C000200d.A00(A0A2.A0F);
            this.A0B = (C88184Yq) r3.A15.get();
            this.A0O = C000200d.A00(A0A2.ABV);
            this.A0A = (C37311pJ) A0K2.A4y.get();
            this.A0I = (C36451nu) A0A2.A0G.get();
            this.A0D = AnonymousClass3Ma.A0b(A0A2);
            this.A03 = (C30191dX) A0A2.A2b.get();
            this.A0E = AnonymousClass3Ma.A0c(A0A2);
            this.A05 = AnonymousClass3Ma.A0S(A0A2);
        }
    }

    public ViewSharedContactArrayActivity(int i) {
        this.A0V = false;
        C1423379b.A00(this, 11);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.6UK] */
    public static AnonymousClass6UK A03(SparseArray sparseArray, int i) {
        AnonymousClass6UK r2 = (AnonymousClass6UK) sparseArray.get(i);
        if (r2 != null) {
            return r2;
        }
        ? obj = new Object();
        obj.A01 = true;
        obj.A00 = null;
        sparseArray.put(i, obj);
        return obj;
    }

    public void A3h(int i) {
        if (i == 2131890000) {
            finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1 && this.A0R != null) {
                if (intent == null || intent.getData() == null) {
                    str = null;
                } else {
                    str = intent.getData().getLastPathSegment();
                }
                this.A06.A03(this.A0R.A02(), str, this.A0Y, this.A0Z);
                ((C37721q1) this.A0M.get()).A04((AnonymousClass1BI) null, (Boolean) null, (Boolean) null, (Boolean) null, C17880vN.A0j(), (Integer) null, 1);
            }
            C72453Mb.A1O(this.A0M);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A1S = C72473Md.A1S(this);
        setContentView(2131627381);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vcard");
        AnonymousClass205 A092 = AnonymousClass25A.A09(intent.getBundleExtra("vcard_message"));
        List stringArrayListExtra = intent.getStringArrayListExtra("vcard_array");
        Uri uri = (Uri) intent.getParcelableExtra("vcard_uri");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("vcard_sender_infos");
        if (stringExtra != null) {
            stringArrayListExtra = Collections.singletonList(stringExtra);
        }
        C129386hi r9 = new C129386hi(uri, A092, stringArrayListExtra, parcelableArrayListExtra);
        this.A08 = this.A09.A06(this, "view-shared-contact-array");
        this.A0S = getIntent().getBooleanExtra("edit_mode", A1S);
        this.A0H = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
        this.A0P = r9.A02;
        C17890vO.A0u(new AnonymousClass6MV(this.A04, this.A08, this.A0C, this.A0F, C17880vN.A0c(this.A0N), this.A0K, r9, this), this.A05);
        boolean A1W = AnonymousClass3MX.A1W(this.A0E);
        this.A0T = A1W;
        if (A1W) {
            AnonymousClass7E0 r1 = new AnonymousClass7E0(this, 13);
            this.A0U = r1;
            this.A05.registerObserver(r1);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C23581Gv r1 = this.A0U;
        if (r1 != null) {
            this.A05.unregisterObserver(r1);
        }
        this.A08.A02();
    }

    public ViewSharedContactArrayActivity() {
        this(0);
        this.A0W = AnonymousClass000.A13();
        this.A0X = AnonymousClass000.A13();
        this.A0Z = AnonymousClass000.A13();
        this.A0Y = AnonymousClass000.A13();
    }
}
