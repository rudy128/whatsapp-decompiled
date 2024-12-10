package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3P1  reason: invalid class name */
public class AnonymousClass3P1 extends Filter {
    public final /* synthetic */ C73083Ox A00;

    public AnonymousClass3P1(C73083Ox r1) {
        this.A00 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList A13 = AnonymousClass000.A13();
            String charSequence2 = charSequence.toString();
            C73083Ox r2 = this.A00;
            GroupChatInfoActivity groupChatInfoActivity = r2.A07;
            ArrayList A03 = C20103A7h.A03(groupChatInfoActivity.A0m, charSequence2);
            boolean contains = AnonymousClass1EG.A06(charSequence).contains(AnonymousClass1EG.A06(groupChatInfoActivity.getString(2131890881)));
            for (C107485Zw r5 : r2.A01) {
                if (r5 instanceof C96234nW) {
                    AnonymousClass1E7 r8 = ((C96234nW) r5).A00;
                    if (!groupChatInfoActivity.A0d.A0l(r8, A03)) {
                        if (!C20103A7h.A04(groupChatInfoActivity.A0m, r8.A0c, A03, true)) {
                            if (contains) {
                                if (!groupChatInfoActivity.A0J.A0Q(groupChatInfoActivity.A1K, (UserJid) C72453Mb.A0m(r8))) {
                                }
                            }
                        }
                    }
                    A13.add(r5);
                }
            }
            boolean isEmpty = A13.isEmpty();
            arrayList = A13;
            if (isEmpty) {
                A13.add(0, new C96244nX(charSequence.toString()));
                arrayList = A13;
            }
        } else {
            arrayList = this.A00.A01;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        Object obj = filterResults.values;
        if (obj == null) {
            list = this.A00.A01;
        } else {
            list = (ArrayList) obj;
        }
        C73083Ox.A00(this.A00, list);
    }
}
