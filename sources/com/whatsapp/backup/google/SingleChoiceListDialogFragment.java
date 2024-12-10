package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1KB;
import X.AnonymousClass3Rf;
import X.AnonymousClass4a6;
import X.AnonymousClass4b3;
import X.C107885am;
import X.C17880vN;
import X.C17890vO;
import X.C73203Rj;
import X.C88864ax;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SingleChoiceListDialogFragment extends Hilt_SingleChoiceListDialogFragment {
    public AnonymousClass1KB A00;
    public C107885am A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public Dialog A27(Bundle bundle) {
        String str;
        int length;
        int length2;
        Bundle bundle2 = this.A06;
        if (bundle2 == null || !bundle2.containsKey("dialog_id")) {
            throw AnonymousClass000.A0n("dialog_id should be provided.");
        }
        int i = bundle2.getInt("dialog_id");
        this.A02.set(false);
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0k(bundle2.getString("title"));
        A04.A0Z((DialogInterface.OnClickListener) null, 2131898766);
        if (bundle2.containsKey("items") && bundle2.containsKey("multi_line_list_items_key")) {
            throw AnonymousClass000.A0n("Cannot provide both items and multi_line_list_items_key");
        } else if (bundle2.containsKey("items") || bundle2.containsKey("multi_line_list_items_key")) {
            int i2 = bundle2.getInt("selected_item_index", -1);
            if (bundle2.containsKey("items")) {
                A04.A0N(new C88864ax(bundle2, i, 1, this), bundle2.getStringArray("items"), i2);
            } else if (bundle2.containsKey("multi_line_list_items_key")) {
                ArrayList A13 = AnonymousClass000.A13();
                String[] stringArray = bundle2.getStringArray("multi_line_list_items_key");
                if (stringArray != null) {
                    String[] stringArray2 = bundle2.getStringArray("multi_line_list_item_values_key");
                    boolean[] booleanArray = bundle2.getBooleanArray("list_item_enabled_key");
                    String string = bundle2.getString("disabled_item_toast_key");
                    if (stringArray2 == null || (length = stringArray.length) == (length2 = stringArray2.length)) {
                        for (int i3 = 0; i3 < stringArray.length; i3++) {
                            HashMap A11 = C17880vN.A11();
                            A11.put("line1", stringArray[i3]);
                            if (stringArray2 != null) {
                                str = stringArray2[i3];
                            } else {
                                str = null;
                            }
                            A11.put("line2", str);
                            A13.add(A11);
                        }
                        A04.A0I(new AnonymousClass4b3(stringArray, this, booleanArray, string, i, 0), new AnonymousClass3Rf(A1n(), this, A13, new int[]{16908308, 16908309}, new String[]{"line1", "line2"}, stringArray, booleanArray, i2), i2);
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("keys.length = ");
                        A10.append(length);
                        A10.append(" ≠ ");
                        A10.append(length2);
                        throw AnonymousClass001.A12(" values.length", A10);
                    }
                } else {
                    throw AnonymousClass000.A0k("Must provide multi_line_list_items_key");
                }
            }
            return A04.create();
        } else {
            throw AnonymousClass000.A0n("Must provide either items or multi_line_list_items_key");
        }
    }

    public void A1x(Context context) {
        super.A1x(context);
        try {
            this.A01 = (C107885am) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0y(" must implement SingleChoiceListListener", C17890vO.A0f(context)));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle bundle = this.A06;
        if (this.A01 != null && !this.A02.get() && bundle != null && bundle.containsKey("dialog_id")) {
            this.A01.Brp(bundle.getInt("dialog_id"));
        }
    }
}
