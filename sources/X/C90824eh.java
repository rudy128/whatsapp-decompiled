package X;

import android.widget.CompoundButton;
import com.whatsapp.group.GroupPermissionsActivity;

/* renamed from: X.4eh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90824eh implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C106945Xu A01;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C106945Xu r0 = this.A01;
        int i = this.A00;
        C108655c5 r02 = ((GroupPermissionsActivity) r0).A05;
        if (r02 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else {
            r02.CRL(i, z);
        }
    }

    public /* synthetic */ C90824eh(C106945Xu r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
