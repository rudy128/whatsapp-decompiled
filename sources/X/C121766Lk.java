package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Lk  reason: invalid class name and case insensitive filesystem */
public class C121766Lk extends A34 {
    public final C18000vb A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A02;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            arrayList = this.A03;
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            for (AnonymousClass25N r3 : this.A03) {
                if (C20103A7h.A04(this.A00, r3.A06, arrayList2, true)) {
                    A13.add(r3);
                }
            }
            arrayList = A13;
        }
        Collections.sort(arrayList, new C146907Rb(this.A00));
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Collection collection = (Collection) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A01.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.Bed()) {
            phoneContactsSelector.A0G = null;
            ArrayList arrayList = phoneContactsSelector.A0f;
            arrayList.clear();
            arrayList.addAll(collection);
            phoneContactsSelector.A0F.notifyDataSetChanged();
            View findViewById = phoneContactsSelector.findViewById(2131429490);
            View findViewById2 = phoneContactsSelector.findViewById(2131429489);
            View findViewById3 = phoneContactsSelector.findViewById(2131434939);
            View findViewById4 = phoneContactsSelector.findViewById(2131431631);
            if (C72463Mc.A1W(phoneContactsSelector.A0Q) || ((C37311pJ) phoneContactsSelector.A0T.get()).A02()) {
                if (phoneContactsSelector.A0H != null) {
                    findViewById4.setVisibility(0);
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(8);
                } else {
                    boolean isEmpty = TextUtils.isEmpty(phoneContactsSelector.A0W);
                    findViewById4.setVisibility(8);
                    if (!isEmpty) {
                        findViewById.setVisibility(8);
                        findViewById2.setVisibility(8);
                        findViewById3.setVisibility(0);
                        Object[] A1a = AnonymousClass3MW.A1a();
                        A1a[0] = phoneContactsSelector.A0W;
                        AnonymousClass3MY.A0y(phoneContactsSelector, (TextView) findViewById3, A1a, 2131895497);
                        return;
                    }
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(0);
                }
                findViewById3.setVisibility(8);
                return;
            }
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
            phoneContactsSelector.A02.setVisibility(8);
        }
    }

    public C121766Lk(PhoneContactsSelector phoneContactsSelector, C18000vb r3, List list, List list2) {
        ArrayList arrayList;
        this.A00 = r3;
        this.A01 = AnonymousClass3MW.A0z(phoneContactsSelector);
        if (list != null) {
            arrayList = C17880vN.A10(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = C17880vN.A10(list2);
    }
}
