package com.whatsapp.glasses;

import X.AnonymousClass000;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass74O;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18070vi;
import X.C18090vk;
import X.C19830z4;
import X.C219217x;
import X.C824748c;
import X.C825148g;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;

public final class BluetoothPermissionDialogFragment extends Hilt_BluetoothPermissionDialogFragment {
    public Dialog A00;
    public TextView A01;
    public C219217x A02;
    public C19830z4 A03;
    public C18090vk A04;
    public boolean A05;
    public String[] A06 = new String[0];

    public void A1O(int i, String[] strArr, int[] iArr) {
        C18070vi.A0d(strArr, 1);
        int i2 = 0;
        if (i != 100) {
            C17960vV.A0F(false, "Unknown request code");
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BTPermissionDialogFragment/onRequestPermissionsResult permissions: ");
        A10.append(Arrays.toString(strArr));
        A10.append(", grantResults: ");
        C17890vO.A1A(A10, Arrays.toString(iArr));
        int length = iArr.length;
        if (length != 0) {
            while (iArr[i2] == 0) {
                i2++;
                if (i2 >= length) {
                    C18090vk r0 = this.A04;
                    if (r0 != null) {
                        r0.invoke();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A1r() {
        super.A1r();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void A1u() {
        super.A1u();
        if (this.A05) {
            String[] strArr = this.A06;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Dialog dialog = this.A00;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    C18090vk r0 = this.A04;
                    if (r0 != null) {
                        r0.invoke();
                    }
                } else {
                    String str = strArr[i];
                    C219217x r02 = this.A02;
                    if (r02 != null) {
                        if (r02.A02(str) != 0) {
                            break;
                        }
                        i++;
                    } else {
                        C18070vi.A11("waPermissionsHelper");
                        throw null;
                    }
                }
            }
            this.A05 = false;
        }
    }

    public void A1v() {
        Window window;
        super.A1v();
        Dialog dialog = this.A00;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(AnonymousClass3MZ.A09(this).getDisplayMetrics().widthPixels, AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        boolean z = A15().getBoolean("bluetooth");
        C17960vV.A0F(z, "bluetooth permission is needed");
        ArrayList A13 = AnonymousClass000.A13();
        if (z && Build.VERSION.SDK_INT >= 31) {
            A13.add("android.permission.BLUETOOTH_CONNECT");
        }
        boolean z2 = false;
        this.A06 = (String[]) A13.toArray(new String[0]);
        Dialog dialog = new Dialog(A1D());
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        C17960vV.A07(window);
        AnonymousClass3Ma.A1H(window, 0);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(2131626448);
        ImageView imageView = (ImageView) dialog.findViewById(2131433767);
        imageView.setImageResource(2131233218);
        imageView.setVisibility(0);
        C825148g.A00(dialog.findViewById(2131428811), this, 14);
        this.A00 = dialog;
        View findViewById = dialog.findViewById(2131435879);
        C18070vi.A0X(findViewById);
        TextView textView = (TextView) findViewById;
        this.A01 = (TextView) dialog.findViewById(2131433770);
        boolean A0N = AnonymousClass74O.A0N(A1D(), this.A06);
        C19830z4 r1 = this.A03;
        if (r1 != null) {
            boolean A0S = AnonymousClass74O.A0S(r1, this.A06);
            if (!A0N && !A0S) {
                z2 = true;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BTPermissionDialogFragment/permissions needBluetoothPermission=");
            A10.append(z);
            A10.append(", showRational=");
            A10.append(A0N);
            A10.append(", isFistTimeRequest=");
            A10.append(A0S);
            C17900vP.A0n(", permanentDenial=", A10, z2);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setText(2131887296);
            }
            if (z2) {
                textView.setText(2131894393);
            }
            textView.setOnClickListener(new C824748c(this, dialog, 0, z2));
            dialog.show();
            return;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }
}
