package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.B6U;
import X.B6V;
import X.C010105w;
import X.C20151A9n;
import X.C20162A9y;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import java.util.Set;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public DialogPreference A2E() {
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((B6U) Fragment.A0L(this, true)).BLF(this.A06.getString("key"));
        this.A03 = dialogPreference2;
        return dialogPreference2;
    }

    public void A1z(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.A1z(bundle);
        Fragment A0L = Fragment.A0L(this, true);
        if (A0L instanceof B6U) {
            B6U b6u = (B6U) A0L;
            String string = this.A06.getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) b6u.BLF(string);
                this.A03 = dialogPreference;
                this.A05 = dialogPreference.A03;
                this.A07 = dialogPreference.A05;
                this.A06 = dialogPreference.A04;
                this.A04 = dialogPreference.A02;
                this.A00 = dialogPreference.A00;
                Drawable drawable = dialogPreference.A01;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(AnonymousClass3MZ.A09(this), createBitmap);
                }
                this.A02 = bitmapDrawable;
                return;
            }
            this.A05 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.A07 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.A06 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.A04 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.A00 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.A02 = new BitmapDrawable(AnonymousClass3MZ.A09(this), bitmap);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Target fragment must implement TargetFragment interface");
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public Dialog A27(Bundle bundle) {
        View inflate;
        AnonymousClass1FL A1B = A1B();
        this.A01 = -2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(A1B);
        alertDialog$Builder.setTitle(this.A05);
        alertDialog$Builder.A01.A0B = this.A02;
        alertDialog$Builder.A0L(this, this.A07);
        alertDialog$Builder.A0J(this, this.A06);
        int i = this.A00;
        if (i == 0 || (inflate = A16().inflate(i, (ViewGroup) null)) == null) {
            alertDialog$Builder.A0S(this.A04);
        } else {
            A2F(inflate);
            alertDialog$Builder.setView(inflate);
        }
        if (this instanceof MultiSelectListPreferenceDialogFragmentCompat) {
            MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = (MultiSelectListPreferenceDialogFragmentCompat) this;
            int length = multiSelectListPreferenceDialogFragmentCompat.A03.length;
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                zArr[i2] = multiSelectListPreferenceDialogFragmentCompat.A00.contains(multiSelectListPreferenceDialogFragmentCompat.A03[i2].toString());
            }
            alertDialog$Builder.A0Q(new C20162A9y(multiSelectListPreferenceDialogFragmentCompat), multiSelectListPreferenceDialogFragmentCompat.A02, zArr);
        } else if (this instanceof ListPreferenceDialogFragmentCompat) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) this;
            alertDialog$Builder.A0N(new C20151A9n(listPreferenceDialogFragmentCompat, 0), listPreferenceDialogFragmentCompat.A01, listPreferenceDialogFragmentCompat.A00);
            alertDialog$Builder.A0L((DialogInterface.OnClickListener) null, (CharSequence) null);
        }
        C010105w create = alertDialog$Builder.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    public void A2F(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        int i;
        super.onDismiss(dialogInterface);
        boolean A1T = AnonymousClass000.A1T(this.A01, -1);
        if (this instanceof MultiSelectListPreferenceDialogFragmentCompat) {
            MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = (MultiSelectListPreferenceDialogFragmentCompat) this;
            if (A1T && multiSelectListPreferenceDialogFragmentCompat.A01) {
                MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) multiSelectListPreferenceDialogFragmentCompat.A2E();
                Set set = multiSelectListPreferenceDialogFragmentCompat.A00;
                B6V b6v = multiSelectListPreference.A0A;
                if (b6v != null) {
                    b6v.C1R(multiSelectListPreference, set);
                }
                multiSelectListPreference.A0R(set);
            }
            multiSelectListPreferenceDialogFragmentCompat.A01 = false;
        } else if (this instanceof ListPreferenceDialogFragmentCompat) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) this;
            if (A1T && (i = listPreferenceDialogFragmentCompat.A00) >= 0) {
                String charSequence = listPreferenceDialogFragmentCompat.A02[i].toString();
                ListPreference listPreference = (ListPreference) listPreferenceDialogFragmentCompat.A2E();
                B6V b6v2 = listPreference.A0A;
                if (b6v2 != null) {
                    b6v2.C1R(listPreference, charSequence);
                }
                listPreference.A0S(charSequence);
            }
        } else {
            EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = (EditTextPreferenceDialogFragmentCompat) this;
            if (A1T) {
                String A12 = AnonymousClass3Ma.A12(editTextPreferenceDialogFragmentCompat.A00);
                EditTextPreference editTextPreference = (EditTextPreference) editTextPreferenceDialogFragmentCompat.A2E();
                B6V b6v3 = editTextPreference.A0A;
                if (b6v3 != null) {
                    b6v3.C1R(editTextPreference, A12);
                }
                editTextPreference.A0R(A12);
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.A01 = i;
    }
}
