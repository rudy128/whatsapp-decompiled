package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0SG  reason: invalid class name */
public class AnonymousClass0SG implements C16940tT, DialogInterface.OnClickListener {
    public C010105w A00;
    public CharSequence A01;
    public ListAdapter A02;
    public final /* synthetic */ AppCompatSpinner A03;

    public Drawable BNI() {
        return null;
    }

    public int BSY() {
        return 0;
    }

    public int BbP() {
        return 0;
    }

    public AnonymousClass0SG(AppCompatSpinner appCompatSpinner) {
        this.A03 = appCompatSpinner;
    }

    public boolean BgV() {
        C010105w r0 = this.A00;
        if (r0 != null) {
            return r0.isShowing();
        }
        return false;
    }

    public void CI3(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public void CJ6(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public void CJ7(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public void CLK(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public void CMY(int i, int i2) {
        if (this.A02 != null) {
            AppCompatSpinner appCompatSpinner = this.A03;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(appCompatSpinner.A04);
            CharSequence charSequence = this.A01;
            if (charSequence != null) {
                alertDialog$Builder.setTitle(charSequence);
            }
            alertDialog$Builder.A0I(this, this.A02, appCompatSpinner.getSelectedItemPosition());
            C010105w create = alertDialog$Builder.create();
            this.A00 = create;
            ListView A07 = create.A07();
            C03740Kl.A01(A07, i);
            C03740Kl.A00(A07, i2);
            this.A00.show();
        }
    }

    public void dismiss() {
        C010105w r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
            this.A00 = null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.A03;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick((View) null, i, this.A02.getItemId(i));
        }
        dismiss();
    }

    public CharSequence BSV() {
        return this.A01;
    }

    public void CHm(ListAdapter listAdapter) {
        this.A02 = listAdapter;
    }

    public void CKF(CharSequence charSequence) {
        this.A01 = charSequence;
    }
}
