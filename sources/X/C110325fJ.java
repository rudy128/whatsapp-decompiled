package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.status.StatusesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5fJ  reason: invalid class name and case insensitive filesystem */
public class C110325fJ extends Filter {
    public final /* synthetic */ StatusesFragment A00;

    public C110325fJ(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(charSequence)) {
            StatusesFragment statusesFragment = this.A00;
            C63372sx r6 = statusesFragment.A0k.A00;
            C63372sx r7 = r6;
            if (r6 == null) {
                r7 = new C63372sx(statusesFragment.A0Q, AnonymousClass1E5.A00, 0, 0, -1, -1, -1, -1, -1, 0);
            }
            A13.add(new AnonymousClass7M5(r7));
            if (r6 != null && ((C41701wv) statusesFragment.A0y.get()).A02()) {
                A13.add(new AnonymousClass7M6(statusesFragment));
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList = C20103A7h.A03(this.A00.A0U, charSequence.toString());
        }
        StatusesFragment statusesFragment2 = this.A00;
        ArrayList A002 = A00(arrayList, statusesFragment2.A0k.A02);
        ArrayList A003 = A00(arrayList, statusesFragment2.A0k.A03);
        ArrayList A004 = A00(arrayList, statusesFragment2.A0k.A01);
        if (!A002.isEmpty()) {
            A13.add(new AnonymousClass7M4(statusesFragment2, 0));
            A13.addAll(A002);
        }
        if (!A003.isEmpty()) {
            A13.add(new AnonymousClass7M4(statusesFragment2, 1));
            A13.addAll(A003);
        }
        filterResults.values = new C127776eu(A13, A004);
        filterResults.count = A13.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        String charSequence2;
        Object obj = filterResults.values;
        if (obj != null) {
            C127776eu r1 = (C127776eu) obj;
            StatusesFragment statusesFragment = this.A00;
            statusesFragment.A1B = r1.A00;
            List list = r1.A01;
            statusesFragment.A1C = list;
            if (!list.isEmpty()) {
                statusesFragment.A1B.add(new AnonymousClass7M4(statusesFragment, 2));
                if (!statusesFragment.A1H || statusesFragment.A1F || !statusesFragment.A1E) {
                    statusesFragment.A1B.addAll(statusesFragment.A1C);
                }
            }
        }
        StatusesFragment statusesFragment2 = this.A00;
        statusesFragment2.A19 = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        statusesFragment2.A1A = C20103A7h.A03(statusesFragment2.A0U, charSequence2);
        StatusesFragment.A07(statusesFragment2);
        AnimatorSet animatorSet = statusesFragment2.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
            statusesFragment2.A00 = null;
        }
        statusesFragment2.A0e.notifyDataSetChanged();
    }

    public ArrayList A00(ArrayList arrayList, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63372sx r3 = (C63372sx) it.next();
            StatusesFragment statusesFragment = this.A00;
            if (statusesFragment.A0J.A0l(statusesFragment.A0H.A0H(r3.A0A), arrayList)) {
                A13.add(new AnonymousClass7M5(r3));
            }
        }
        return A13;
    }
}
