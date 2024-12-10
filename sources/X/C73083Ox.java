package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ox  reason: invalid class name and case insensitive filesystem */
public class C73083Ox extends BaseAdapter implements Filterable {
    public String A00;
    public List A01 = AnonymousClass000.A13();
    public List A02 = AnonymousClass000.A13();
    public ArrayList A03;
    public final C84944Ll A04;
    public final Map A05 = C17880vN.A11();
    public final Filter A06 = new AnonymousClass3P1(this);
    public final /* synthetic */ GroupChatInfoActivity A07;

    public boolean areAllItemsEnabled() {
        return false;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C73083Ox(C84944Ll r2, GroupChatInfoActivity groupChatInfoActivity) {
        this.A07 = groupChatInfoActivity;
        this.A04 = r2;
    }

    public static void A00(C73083Ox r3, List list) {
        GroupChatInfoActivity groupChatInfoActivity = r3.A07;
        if (groupChatInfoActivity.A1A.A0I(groupChatInfoActivity.A0u) == 1) {
            r3.A02 = Collections.emptyList();
        } else {
            r3.A02 = list;
            r3.A03 = C20103A7h.A03(groupChatInfoActivity.A0m, r3.A00);
        }
        r3.notifyDataSetChanged();
    }

    public int getCount() {
        return this.A02.size();
    }

    public Filter getFilter() {
        return this.A06;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A02.get(i);
        if (obj instanceof C96234nW) {
            return 0;
        }
        if ((obj instanceof C96224nV) || (obj instanceof C96214nU)) {
            return 1;
        }
        if (obj instanceof C96244nX) {
            return 2;
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C139106yE r2;
        UserJid A002;
        Object r1;
        C107485Zw r3 = (C107485Zw) this.A02.get(i);
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                GroupChatInfoActivity groupChatInfoActivity = this.A07;
                view = groupChatInfoActivity.getLayoutInflater().inflate(2131625487, viewGroup, false);
                r1 = new AnonymousClass40Z(view, this.A04, groupChatInfoActivity);
            } else if (itemViewType == 1) {
                GroupChatInfoActivity groupChatInfoActivity2 = this.A07;
                view = groupChatInfoActivity2.getLayoutInflater().inflate(2131625486, viewGroup, false);
                r1 = new AnonymousClass40X(view, groupChatInfoActivity2);
            } else if (itemViewType == 2) {
                GroupChatInfoActivity groupChatInfoActivity3 = this.A07;
                view = groupChatInfoActivity3.getLayoutInflater().inflate(2131625488, viewGroup, false);
                r1 = new AnonymousClass40Y(view, groupChatInfoActivity3);
            } else {
                throw AnonymousClass000.A0n(AnonymousClass001.A1I("Unknown type: ", AnonymousClass000.A10(), itemViewType));
            }
            view.setTag(r1);
        }
        if (!(r3 instanceof C96234nW) || (A002 = C22941Dw.A00(((C96234nW) r3).A00.A0J)) == null) {
            r2 = null;
        } else {
            r2 = (C139106yE) this.A05.get(A002);
        }
        ((AnonymousClass4FH) view.getTag()).A00(r3, r2, this.A03);
        return view;
    }

    public boolean isEnabled(int i) {
        return ((C107485Zw) this.A02.get(i)).isEnabled();
    }
}
