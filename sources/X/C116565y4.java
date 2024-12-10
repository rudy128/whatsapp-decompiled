package X;

import android.util.Pair;
import android.widget.SectionIndexer;
import java.util.List;

/* renamed from: X.5y4  reason: invalid class name and case insensitive filesystem */
public final class C116565y4 extends C116625yK implements SectionIndexer {
    public List A00;
    public List A01;

    public int getPositionForSection(int i) {
        List list = this.A00;
        C18070vi.A0d(list, 1);
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return AnonymousClass001.A0n(list, i);
    }

    public int getSectionForPosition(int i) {
        List list = this.A02;
        C18070vi.A0W(list);
        List list2 = this.A01;
        List list3 = this.A00;
        C18070vi.A0o(list, list2, list3);
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return AnonymousClass3MX.A01(list2);
        }
        int A012 = AnonymousClass3MX.A01(list3);
        if (A012 < 0) {
            return 0;
        }
        while (true) {
            int i2 = A012 - 1;
            if (AnonymousClass001.A0n(list3, A012) <= i) {
                return A012;
            }
            if (i2 < 0) {
                return 0;
            }
            A012 = i2;
        }
    }

    public /* bridge */ /* synthetic */ Object[] getSections() {
        return this.A01.toArray(new String[0]);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        List list = this.A02;
        C18070vi.A0W(list);
        C18000vb r0 = this.A04.A19;
        C18070vi.A0W(r0);
        Pair A002 = AnonymousClass6W7.A00(r0, list);
        Object obj = A002.first;
        C18070vi.A0W(obj);
        this.A01 = (List) obj;
        Object obj2 = A002.second;
        C18070vi.A0W(obj2);
        this.A00 = (List) obj2;
    }
}
