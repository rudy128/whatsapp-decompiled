package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.5f4  reason: invalid class name and case insensitive filesystem */
public class C110185f4 extends ArrayAdapter {
    public final /* synthetic */ PhoneContactsSelector A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110185f4(Context context, PhoneContactsSelector phoneContactsSelector, List list) {
        super(context, 2131626450, list);
        this.A00 = phoneContactsSelector;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C129606i4 r0;
        Object item = getItem(i);
        C17960vV.A07(item);
        AnonymousClass25N r6 = (AnonymousClass25N) item;
        if (view == null) {
            view = this.A00.getLayoutInflater().inflate(2131626450, viewGroup, false);
            r0 = new C129606i4(view);
            view.setTag(r0);
        } else {
            r0 = (C129606i4) view.getTag();
        }
        PhoneContactsSelector phoneContactsSelector = this.A00;
        AnonymousClass1VW r3 = phoneContactsSelector.A08;
        ImageView imageView = r0.A00;
        r3.A09(imageView, 2131231047);
        phoneContactsSelector.A0B.A04(imageView, r6);
        r0.A01.A0S(r6.A06, phoneContactsSelector.A0X, 0, false);
        SelectionCheckView selectionCheckView = r0.A03;
        selectionCheckView.A04(r6.A03, false);
        selectionCheckView.setTag(r6);
        return view;
    }
}
