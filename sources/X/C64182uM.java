package X;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: X.2uM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64182uM implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ C72313Ll A03;
    public final /* synthetic */ C36741oO A04;
    public final /* synthetic */ boolean A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C36741oO r5 = this.A04;
        CheckBox checkBox = this.A01;
        C72313Ll r4 = this.A03;
        CheckBox checkBox2 = this.A02;
        int i2 = this.A00;
        boolean z = this.A05;
        boolean isChecked = checkBox.isChecked();
        r4.C12(!checkBox2.isChecked(), isChecked);
        if (i2 == 2 && z != isChecked) {
            C17880vN.A1F(C19830z4.A00(r5.A01), "pref_media_delete_per_conversation", isChecked);
        }
    }

    public /* synthetic */ C64182uM(CheckBox checkBox, CheckBox checkBox2, C72313Ll r3, C36741oO r4, int i, boolean z) {
        this.A04 = r4;
        this.A01 = checkBox;
        this.A03 = r3;
        this.A02 = checkBox2;
        this.A00 = i;
        this.A05 = z;
    }
}
