package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.5kd  reason: invalid class name and case insensitive filesystem */
public final class C111915kd extends C38391rD {
    public final /* synthetic */ PhoneContactsSelector A00;

    public C111915kd(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    public int A0Q() {
        return this.A00.A0h.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C113215mj r62 = (C113215mj) r6;
        PhoneContactsSelector phoneContactsSelector = this.A00;
        AnonymousClass25N r3 = (AnonymousClass25N) phoneContactsSelector.A0h.get(i);
        String str = r3.A05;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = r62.A01;
        if (!isEmpty) {
            textView.setText(str);
        } else {
            textView.setText(r3.A06);
        }
        ThumbnailButton thumbnailButton = r62.A02;
        phoneContactsSelector.A08.A09(thumbnailButton, 2131231047);
        phoneContactsSelector.A0B.A04(thumbnailButton, r3);
        C90004dN.A00(r62.A00, this, r3, 35);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113215mj(AnonymousClass3MX.A09(this.A00.getLayoutInflater(), viewGroup, 2131626868));
    }
}
