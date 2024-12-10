package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusesFragment;
import java.util.Map;

/* renamed from: X.5fE  reason: invalid class name and case insensitive filesystem */
public class C110285fE extends BaseAdapter implements Filterable {
    public long A00 = 5;
    public Filter A01;
    public final Map A02 = C17880vN.A11();
    public final /* synthetic */ StatusesFragment A03;

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C110285fE(StatusesFragment statusesFragment) {
        this.A03 = statusesFragment;
    }

    public static void A00(StatusesFragment statusesFragment) {
        statusesFragment.A0e.getFilter().filter(statusesFragment.A19);
    }

    public int getCount() {
        return this.A03.A1B.size();
    }

    public Filter getFilter() {
        Filter filter = this.A01;
        if (filter != null) {
            return filter;
        }
        C110325fJ r1 = new C110325fJ(this.A03);
        this.A01 = r1;
        return r1;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.A1B.get(i);
    }

    public long getItemId(int i) {
        C1603187z r1 = (C1603187z) this.A03.A1B.get(i);
        if (r1 instanceof AnonymousClass7M5) {
            UserJid userJid = ((AnonymousClass7M5) r1).A01.A0A;
            Map map = this.A02;
            Number A1E = C108945cZ.A1E(userJid, map);
            if (A1E == null) {
                long j = this.A00;
                this.A00 = 1 + j;
                A1E = Long.valueOf(j);
                map.put(userJid, A1E);
            }
            return A1E.longValue();
        } else if (r1 instanceof AnonymousClass7M4) {
            return ((AnonymousClass7M4) r1).A00;
        } else {
            if (r1 instanceof AnonymousClass7M6) {
                r1.getClass();
                return 3;
            }
            throw new UnsupportedOperationException("Each list item must have an id");
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A03.A1B.get(i);
        if (obj instanceof AnonymousClass7M5) {
            return 0;
        }
        if (obj instanceof AnonymousClass7M4) {
            return 1;
        }
        if (obj instanceof AnonymousClass7M6) {
            return 2;
        }
        throw new UnsupportedOperationException("Each list item type must have a itemType");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        StatusesFragment statusesFragment = this.A03;
        return ((C1603187z) statusesFragment.A1B.get(i)).BbX(statusesFragment.A1n(), view, viewGroup, statusesFragment.A0K, statusesFragment.A1M, statusesFragment.A1N, statusesFragment.A1L, statusesFragment.A1A, statusesFragment.A1G);
    }
}
