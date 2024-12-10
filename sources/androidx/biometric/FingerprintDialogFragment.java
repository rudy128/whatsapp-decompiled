package androidx.biometric;

import X.AnonymousClass0Bs;
import X.AnonymousClass0DM;
import X.AnonymousClass0R2;
import X.AnonymousClass0YB;
import X.AnonymousClass0Z1;
import X.AnonymousClass1FL;
import X.C010105w;
import X.C19740yt;
import X.C24071It;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.fragment.app.DialogFragment;

public class FingerprintDialogFragment extends DialogFragment {
    public TextView A00;
    public AnonymousClass0Bs A01;
    public int A02;
    public int A03;
    public ImageView A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final Runnable A06 = new AnonymousClass0Z1(this);

    public static FingerprintDialogFragment A02() {
        return new FingerprintDialogFragment();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r3 = r4.A01.A0V();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2F(int r5) {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.A04
            if (r0 == 0) goto L_0x0031
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0031
            X.0Bs r0 = r4.A01
            int r3 = r0.A0V()
            android.graphics.drawable.Drawable r2 = r4.A01(r3, r5)
            if (r2 == 0) goto L_0x0031
            android.widget.ImageView r0 = r4.A04
            r0.setImageDrawable(r2)
            r1 = 1
            if (r3 == 0) goto L_0x002c
            r0 = 2
            if (r3 != r1) goto L_0x0032
            if (r5 != r0) goto L_0x002c
        L_0x0023:
            boolean r0 = r2 instanceof android.graphics.drawable.AnimatedVectorDrawable
            if (r0 == 0) goto L_0x002c
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            r2.start()
        L_0x002c:
            X.0Bs r0 = r4.A01
            r0.A0p(r5)
        L_0x0031:
            return
        L_0x0032:
            if (r3 != r0) goto L_0x002c
            if (r5 != r1) goto L_0x002c
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.A2F(int):void");
    }

    public void A2G(int i) {
        int i2;
        TextView textView = this.A00;
        if (textView != null) {
            if (i == 2) {
                i2 = this.A02;
            } else {
                i2 = this.A03;
            }
            textView.setTextColor(i2);
        }
    }

    public void A2H(CharSequence charSequence) {
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.A01.A14(true);
    }

    private int A00(int i) {
        Context A1n = A1n();
        AnonymousClass1FL A1B = A1B();
        if (A1n == null || A1B == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        A1n.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = A1B.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 == 3) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = 2131231498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r5 == 2) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r6 == 1) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable A01(int r5, int r6) {
        /*
            r4 = this;
            android.content.Context r3 = r4.A1n()
            r2 = 0
            if (r3 != 0) goto L_0x000f
            java.lang.String r1 = "FingerprintFragment"
            java.lang.String r0 = "Unable to get asset. Context is null."
            android.util.Log.w(r1, r0)
        L_0x000e:
            return r2
        L_0x000f:
            r1 = 1
            if (r5 == 0) goto L_0x0027
            r0 = 2
            if (r5 != r1) goto L_0x0025
            r1 = 2131231497(0x7f080309, float:1.8079077E38)
            if (r6 == r0) goto L_0x0020
            r0 = 3
            if (r6 != r0) goto L_0x000e
        L_0x001d:
            r1 = 2131231498(0x7f08030a, float:1.8079079E38)
        L_0x0020:
            android.graphics.drawable.Drawable r0 = X.C19740yt.A04(r3, r1)
            return r0
        L_0x0025:
            if (r5 != r0) goto L_0x000e
        L_0x0027:
            if (r6 != r1) goto L_0x000e
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.A01(int, int):android.graphics.drawable.Drawable");
    }

    private void A03() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass0Bs r0 = (AnonymousClass0Bs) new C24071It(A1B).A00(AnonymousClass0Bs.class);
            this.A01 = r0;
            r0.A0f().A0A(this, new AnonymousClass0YB(this, 6));
            this.A01.A0e().A0A(this, new AnonymousClass0YB(this, 7));
        }
    }

    public void A1t() {
        super.A1t();
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    public void A1u() {
        super.A1u();
        AnonymousClass0Bs r1 = this.A01;
        r1.A0p(0);
        r1.A0q(1);
        this.A01.A0x(A1H(2131899040));
    }

    public void A1z(Bundle bundle) {
        int i;
        super.A1z(bundle);
        A03();
        if (Build.VERSION.SDK_INT >= 26) {
            i = A00(AnonymousClass0DM.A00());
        } else {
            Context A1n = A1n();
            i = 0;
            if (A1n != null) {
                i = C19740yt.A00(A1n, 2131099848);
            }
        }
        this.A02 = i;
        this.A03 = A00(16842808);
    }

    public Dialog A27(Bundle bundle) {
        CharSequence A0k;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(A14());
        alertDialog$Builder.setTitle(this.A01.A0m());
        View inflate = LayoutInflater.from(alertDialog$Builder.getContext()).inflate(2131625326, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(2131430875);
        if (textView != null) {
            CharSequence A0l = this.A01.A0l();
            if (TextUtils.isEmpty(A0l)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(A0l);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(2131430870);
        if (textView2 != null) {
            if (TextUtils.isEmpty((CharSequence) null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.A04 = (ImageView) inflate.findViewById(2131430872);
        this.A00 = (TextView) inflate.findViewById(2131430871);
        AnonymousClass0Bs r2 = this.A01;
        if ((r2.A0T() & 32768) != 0) {
            A0k = A1H(2131898816);
        } else {
            A0k = r2.A0k();
        }
        alertDialog$Builder.A0J(new AnonymousClass0R2(this), A0k);
        alertDialog$Builder.setView(inflate);
        C010105w create = alertDialog$Builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void A2E() {
        Context A1n = A1n();
        if (A1n == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        this.A01.A0q(1);
        this.A01.A0x(A1n.getString(2131899040));
    }
}
