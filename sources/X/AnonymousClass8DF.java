package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.8DF  reason: invalid class name */
public final class AnonymousClass8DF extends BaseExpandableListAdapter {
    public List A00 = C18460wS.A00;
    public Map A01 = AnonymousClass1D7.A0I();
    public final C20324AGg A02;

    public AnonymousClass8DF(C20324AGg aGg) {
        C18070vi.A0d(aGg, 1);
        this.A02 = aGg;
    }

    public long getChildId(int i, int i2) {
        return (long) ((i * 1000) + i2);
    }

    public int getChildTypeCount() {
        return 5;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        int i3;
        C22821Di r1;
        C18070vi.A0d(viewGroup, 4);
        AnonymousClass9XB A002 = getChild(i, i2);
        if (A002 instanceof AnonymousClass8la) {
            i3 = 2131625848;
            r1 = new C22158Aya(this);
        } else if (A002 instanceof AnonymousClass8lX) {
            i3 = 2131625847;
            r1 = B23.A00;
        } else {
            throw AnonymousClass000.A0n("Unhandled group-child type in getChildView()");
        }
        C22821Di r12 = r1;
        if (view == null) {
            view = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, i3);
            C18070vi.A0b(view);
            view.setTag(r12.invoke(view));
        }
        Object tag = view.getTag();
        C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
        ((AnonymousClass8IP) tag).A0B(A002);
        return view;
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public int getGroupTypeCount() {
        return 5;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        int i2;
        C22821Di r1;
        int i3;
        C18070vi.A0d(viewGroup, 3);
        AnonymousClass9XB r4 = (AnonymousClass9XB) this.A00.get(i);
        if (r4 instanceof AnonymousClass8lb) {
            C22159Ayb ayb = new C22159Ayb(this);
            if (view == null) {
                view = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625846);
                C18070vi.A0b(view);
                view.setTag(ayb.invoke(view));
            }
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CategoryGroupExpandableItemViewHolder");
            C169498lk r12 = (C169498lk) tag;
            r12.A0B(r4);
            ImageView imageView = (ImageView) r12.A02.getValue();
            if (z) {
                i3 = 2131233291;
            } else {
                i3 = 2131233292;
            }
            imageView.setImageResource(i3);
            return view;
        }
        if (r4 instanceof AnonymousClass8la) {
            i2 = 2131625845;
            r1 = new C22160Ayc(this);
        } else if (r4 instanceof AnonymousClass8lY) {
            i2 = 2131625852;
            r1 = B24.A00;
        } else {
            throw AnonymousClass000.A0n("Unhandled group type in getGroupView()");
        }
        C22821Di r13 = r1;
        if (view == null) {
            view = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, i2);
            C18070vi.A0b(view);
            view.setTag(r13.invoke(view));
        }
        Object tag2 = view.getTag();
        C18070vi.A0z(tag2, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
        ((AnonymousClass8IP) tag2).A0B(r4);
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    /* renamed from: A00 */
    public AnonymousClass9XB getChild(int i, int i2) {
        AnonymousClass9XB r2 = (AnonymousClass9XB) this.A00.get(i);
        if (r2 instanceof AnonymousClass8lb) {
            return (AnonymousClass9XB) ((List) AnonymousClass8BV.A0m(((AnonymousClass8lb) r2).A00.A01, this.A01)).get(i2);
        }
        throw AnonymousClass000.A0n("Unhandled category parent type in getChild()");
    }

    public int getChildrenCount(int i) {
        AnonymousClass9XB r2 = (AnonymousClass9XB) this.A00.get(i);
        if (!(r2 instanceof AnonymousClass8lb)) {
            return 0;
        }
        return ((List) AnonymousClass8BV.A0m(((AnonymousClass8lb) r2).A00.A01, this.A01)).size();
    }

    public /* bridge */ /* synthetic */ Object getGroup(int i) {
        return this.A00.get(i);
    }

    public int getGroupCount() {
        return this.A00.size();
    }

    public int getGroupType(int i) {
        return ((AnonymousClass9XB) this.A00.get(i)).A00;
    }

    public int getChildType(int i, int i2) {
        return getChild(i, i2).A00;
    }
}
