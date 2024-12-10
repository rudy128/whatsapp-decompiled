package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49J  reason: invalid class name */
public class AnonymousClass49J extends A34 {
    public final C24921Me A00;
    public final C18000vb A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str = this.A02;
        if (TextUtils.isEmpty(str)) {
            return this.A04;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C18000vb r5 = this.A01;
        ArrayList A032 = C20103A7h.A03(r5, str);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            if (this.A00.A0l(A0O, A032) || C20103A7h.A04(r5, A0O.A0c, A032, true)) {
                A13.add(A0O);
            }
        }
        return A13;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A03.get();
        if (groupAdminPickerActivity != null && !groupAdminPickerActivity.Bed()) {
            C73483Wd r2 = groupAdminPickerActivity.A0D;
            String str = groupAdminPickerActivity.A0I;
            r2.A01 = list;
            r2.A00 = C20103A7h.A03(r2.A02.A0A, str);
            r2.notifyDataSetChanged();
            TextView A0L = AnonymousClass3MX.A0L(groupAdminPickerActivity, 2131434939);
            if (!list.isEmpty() || TextUtils.isEmpty(groupAdminPickerActivity.A0I)) {
                A0L.setVisibility(8);
                return;
            }
            A0L.setVisibility(0);
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = groupAdminPickerActivity.A0I;
            AnonymousClass3MY.A0y(groupAdminPickerActivity, A0L, A1a, 2131895497);
        }
    }

    public AnonymousClass49J(C24921Me r3, C18000vb r4, GroupAdminPickerActivity groupAdminPickerActivity, String str, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A04 = A13;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = AnonymousClass3MW.A0z(groupAdminPickerActivity);
        A13.addAll(list);
        this.A02 = str;
    }
}
