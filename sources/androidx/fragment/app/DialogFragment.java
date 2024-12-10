package androidx.fragment.app;

import X.AnonymousClass029;
import X.AnonymousClass1GP;
import X.AnonymousClass1ZG;
import X.AnonymousClass1ZI;
import X.AnonymousClass759;
import X.AnonymousClass7AN;
import X.C1411674o;
import X.C21466AkX;
import X.C22851Dl;
import X.C34001jj;
import X.C64932vZ;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;

public abstract class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public Dialog A03;
    public DialogInterface.OnCancelListener A04 = new C1411674o(this, 0);
    public DialogInterface.OnDismissListener A05 = new AnonymousClass759(this, 0);
    public C22851Dl A06 = new AnonymousClass7AN(this, 0);
    public Runnable A07 = new C21466AkX((Object) this, 6);
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = true;
    public boolean A0E;
    public Handler A0F;

    public void A1K() {
        this.A0X = true;
        if (!this.A0C && !this.A0B) {
            this.A0B = true;
        }
        this.A0M.A0D(this.A06);
    }

    public void A1Q(Bundle bundle) {
        Bundle bundle2;
        this.A0X = true;
        if (this.A03 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    public void A1j() {
        this.A0X = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void A1s() {
        this.A0X = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0E = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.A03.dismiss();
            if (!this.A0B) {
                onDismiss(this.A03);
            }
            this.A03 = null;
            this.A0A = false;
        }
    }

    public void A1v() {
        this.A0X = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0E = false;
            dialog.show();
            View decorView = this.A03.getWindow().getDecorView();
            AnonymousClass1ZG.A01(decorView, this);
            ViewTreeViewModelStoreOwner.A01(decorView, this);
            AnonymousClass1ZI.A01(decorView, this);
        }
    }

    public Dialog A27(Bundle bundle) {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new AnonymousClass029(A14(), A25());
    }

    public void A28() {
        A04(false, false);
    }

    public void A29() {
        A04(true, false);
    }

    public void A2A(int i, int i2) {
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            Log.d("FragmentManager", sb.toString());
        }
        this.A01 = i;
        if (i == 2) {
            this.A02 = 16973913;
        }
        if (i2 != 0) {
            this.A02 = i2;
        }
    }

    public void A2B(int i, Dialog dialog) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    private void A04(boolean z, boolean z2) {
        if (!this.A0B) {
            this.A0B = true;
            this.A0C = false;
            Dialog dialog = this.A03;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.A03.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.A0F.getLooper()) {
                        onDismiss(this.A03);
                    } else {
                        this.A0F.post(this.A07);
                    }
                }
            }
            this.A0E = true;
            if (this.A00 >= 0) {
                AnonymousClass1GP A1F = A1F();
                int i = this.A00;
                if (i >= 0) {
                    A1F.A0r(new C64932vZ(A1F, (String) null, i, 1), z);
                    this.A00 = -1;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Bad id: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            C34001jj r1 = new C34001jj(A1F());
            r1.A0G = true;
            r1.A07(this);
            if (z) {
                r1.A00(true);
            } else {
                r1.A00(false);
            }
        }
    }

    public void A20(Bundle bundle) {
        Dialog dialog = this.A03;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A01;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A02;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A08;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0D;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A00;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public final Dialog A26() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public void A2C(AnonymousClass1GP r3, String str) {
        C34001jj r1;
        boolean z;
        if (this instanceof ProgressDialogFragment) {
            r1 = new C34001jj(r3);
            r1.A0B(this, str);
            z = true;
        } else {
            this.A0B = false;
            this.A0C = true;
            r1 = new C34001jj(r3);
            r1.A0G = true;
            r1.A0B(this, str);
            z = false;
        }
        r1.A00(z);
    }

    public void A2D(boolean z) {
        this.A08 = z;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener;
        if ((this instanceof SupportErrorDialogFragment) && (onCancelListener = ((SupportErrorDialogFragment) this).A01) != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0E) {
            if (AnonymousClass1GP.A0G(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            A04(true, true);
        }
    }

    public void A1S(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle bundle2;
        super.A1S(bundle, layoutInflater, viewGroup);
        if (this.A0B == null && this.A03 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater A1o(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater A1o = super.A1o(bundle);
        if (this.A0D && !this.A09) {
            if (!this.A0A) {
                try {
                    this.A09 = true;
                    Dialog A27 = A27(bundle);
                    this.A03 = A27;
                    if (this.A0D) {
                        A2B(this.A01, A27);
                        Context A1n = A1n();
                        if (A1n instanceof Activity) {
                            this.A03.setOwnerActivity((Activity) A1n);
                        }
                        this.A03.setCancelable(this.A08);
                        this.A03.setOnCancelListener(this.A04);
                        this.A03.setOnDismissListener(this.A05);
                        this.A0A = true;
                    } else {
                        this.A03 = null;
                    }
                    this.A09 = false;
                } catch (Throwable th) {
                    this.A09 = false;
                    throw th;
                }
            }
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get layout inflater for DialogFragment ");
                sb2.append(this);
                sb2.append(" from dialog context");
                Log.d("FragmentManager", sb2.toString());
            }
            Dialog dialog = this.A03;
            if (dialog != null) {
                return A1o.cloneInContext(dialog.getContext());
            }
        } else if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getting layout inflater for DialogFragment ");
            sb3.append(this);
            String obj = sb3.toString();
            if (!this.A0D) {
                str = "mShowsDialog = false: ";
            } else {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb.append(str);
            sb.append(obj);
            Log.d("FragmentManager", sb.toString());
        }
        return A1o;
    }

    public void A1x(Context context) {
        super.A1x(context);
        this.A0M.A0C(this.A06);
        if (!this.A0C) {
            this.A0B = false;
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0F = new Handler();
        boolean z = false;
        if (this.A01 == 0) {
            z = true;
        }
        this.A0D = z;
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A02 = bundle.getInt("android:theme", 0);
            this.A08 = bundle.getBoolean("android:cancelable", true);
            this.A0D = bundle.getBoolean("android:showsDialog", this.A0D);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
    }

    public int A25() {
        return this.A02;
    }
}
