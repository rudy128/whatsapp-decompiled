package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4M8;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C17880vN;
import X.C23321Fo;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C86194Qr;
import X.C91574fu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment;
import java.util.ArrayList;

public class SingleSelectionDialogFragment extends Hilt_SingleSelectionDialogFragment {
    public int A00;
    public C86194Qr A01;
    public boolean A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;
    public boolean A07;
    public CharSequence[] A08;
    public String[] A09;

    public AlertDialog$Builder A2I() {
        C73203Rj A002;
        LinearLayout linearLayout;
        boolean z = this.A07;
        AnonymousClass1FL A1D = A1D();
        if (z) {
            A002 = AnonymousClass4a6.A01(A1D, 2132083735);
        } else {
            A002 = AnonymousClass4a6.A00(A1D);
        }
        A002.setTitle(this.A06);
        this.A00 = this.A03;
        if (this instanceof WallpaperSetConfirmationDialogFragment) {
            LinearLayout linearLayout2 = new LinearLayout(A14());
            linearLayout2.setOrientation(1);
            C72473Md.A0z(linearLayout2);
            linearLayout2.addView(A2H());
            TextView textView = (TextView) AnonymousClass3MY.A0D(LayoutInflater.from(A1B()), 2131627538);
            textView.setText(2131898411);
            linearLayout2.addView(textView);
            linearLayout = linearLayout2;
        } else {
            linearLayout = A2H();
        }
        A002.setView(linearLayout);
        if (this.A02) {
            A002.setPositiveButton(this.A05, new AnonymousClass4aq(this, 6));
            A002.setNegativeButton(2131898766, new AnonymousClass4aq(this, 7));
        }
        return A002;
    }

    public static Bundle A00(int i, int i2, int i3, int i4) {
        Bundle A0I = C72483Me.A0I(i, i2, i3);
        A0I.putInt("itemsArrayResId", i4);
        A0I.putBoolean("showConfirmation", true);
        return A0I;
    }

    public static Bundle A01(CharSequence[] charSequenceArr, int i, int i2, int i3, boolean z) {
        Bundle A0I = C72483Me.A0I(i, i2, i3);
        A0I.putCharSequenceArray("itemsCharSequence", charSequenceArr);
        A0I.putBoolean("hasRadioSubtitle", z);
        A0I.putBoolean("showConfirmation", true);
        return A0I;
    }

    public static Bundle A02(String[] strArr) {
        Bundle A0I = C72483Me.A0I(1, 0, 2131889576);
        A0I.putStringArray("items", strArr);
        A0I.putBoolean("showConfirmation", true);
        A0I.putInt("dialogPositiveButtonTextResId", 2131895378);
        return A0I;
    }

    public static Bundle A03(String[] strArr, int i, int i2, int i3) {
        Bundle A0I = C72483Me.A0I(i, i2, i3);
        A0I.putStringArray("items", strArr);
        A0I.putBoolean("showConfirmation", true);
        return A0I;
    }

    public static void A04(SingleSelectionDialogFragment singleSelectionDialogFragment) {
        AnonymousClass1FL A1B = singleSelectionDialogFragment.A1B();
        if (A1B instanceof C23321Fo) {
            ((C23321Fo) A1B).C5k(singleSelectionDialogFragment.A04, singleSelectionDialogFragment.A00);
        } else {
            Bundle A0D = C17880vN.A0D();
            A0D.putBoolean("isSuccess", true);
            A0D.putInt("selectedIndex", singleSelectionDialogFragment.A00);
            singleSelectionDialogFragment.A1F().A0w("single_selection_dialog_result", A0D);
        }
        singleSelectionDialogFragment.A28();
    }

    public void A1z(Bundle bundle) {
        String string;
        String[] stringArray;
        int i;
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        this.A04 = bundle2.getInt("dialogId");
        this.A03 = bundle2.getInt("currentIndex");
        if (bundle2.containsKey("dialogTitleResId")) {
            string = A1H(bundle2.getInt("dialogTitleResId"));
        } else {
            string = bundle2.getString("dialogTitle");
        }
        this.A06 = string;
        if (bundle2.containsKey("itemsArrayResId")) {
            stringArray = AnonymousClass3MZ.A09(this).getStringArray(bundle2.getInt("itemsArrayResId"));
        } else {
            stringArray = bundle2.getStringArray("items");
        }
        this.A09 = stringArray;
        if (bundle2.containsKey("dialogPositiveButtonTextResId")) {
            i = bundle2.getInt("dialogPositiveButtonTextResId");
        } else {
            i = 2131899286;
        }
        this.A05 = i;
        if (bundle2.containsKey("itemsCharSequence")) {
            this.A08 = bundle2.getCharSequenceArray("itemsCharSequence");
        }
        this.A02 = bundle2.getBoolean("showConfirmation", false);
        this.A07 = bundle2.getBoolean("hasRadioSubtitle", false);
    }

    public Dialog A27(Bundle bundle) {
        return A2I().create();
    }

    public View A2H() {
        View inflate = AnonymousClass3MZ.A0E(this).inflate(2131626966, (ViewGroup) null, false);
        SingleSelectionDialogRadioGroup singleSelectionDialogRadioGroup = (SingleSelectionDialogRadioGroup) AnonymousClass1HF.A06(inflate, 2131435464);
        Object[] objArr = this.A08;
        if (objArr == null) {
            objArr = this.A09;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object obj : objArr) {
            A13.add(new AnonymousClass4M8(obj, String.valueOf(obj)));
        }
        this.A01.A00(singleSelectionDialogRadioGroup, objArr[this.A00], A13);
        C91574fu.A00(this, this.A01.A01, 3);
        return inflate;
    }

    public /* synthetic */ void A2J() {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("isSuccess", false);
        A1F().A0w("single_selection_dialog_result", A0D);
        A28();
    }
}
