package X;

import android.view.View;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.3bl  reason: invalid class name and case insensitive filesystem */
public class C74493bl extends C6X {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GroupAdminPickerActivity A01;

    public void A03(View view, int i) {
        if (i == 4) {
            GroupAdminPickerActivity groupAdminPickerActivity = this.A01;
            groupAdminPickerActivity.finish();
            groupAdminPickerActivity.overridePendingTransition(0, 0);
        }
    }

    public C74493bl(GroupAdminPickerActivity groupAdminPickerActivity, int i) {
        this.A01 = groupAdminPickerActivity;
        this.A00 = i;
    }

    public void A02(View view, float f) {
        int i = ((int) (f * 127.0f)) << 24;
        GroupAdminPickerActivity groupAdminPickerActivity = this.A01;
        groupAdminPickerActivity.A00.setColor(i);
        groupAdminPickerActivity.getWindow().setStatusBarColor(AnonymousClass1Z2.A03(1.0f, this.A00, i));
    }
}
