package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.4je  reason: invalid class name and case insensitive filesystem */
public final class C93854je implements C108775cH {
    public final C31191fA A00;
    public final C108775cH A01;
    public final List A02 = AnonymousClass000.A13();

    public C93854je(C31191fA r2, C108775cH r3) {
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public Cursor BQ4() {
        return this.A01.BQ4();
    }

    public AnonymousClass206 BTU(Cursor cursor, int i) {
        return this.A01.BTU(cursor, i);
    }

    public int BTY(AnonymousClass206 r2, int i) {
        return this.A01.BTY(r2, i);
    }

    public View BbW(View view, ViewGroup viewGroup, AnonymousClass206 r4, int i) {
        return this.A01.BbW(view, viewGroup, r4, i);
    }

    public boolean areAllItemsEnabled() {
        return this.A01.areAllItemsEnabled();
    }

    public long getItemId(int i) {
        return this.A01.getItemId(i);
    }

    public int getViewTypeCount() {
        return this.A01.getViewTypeCount();
    }

    public boolean hasStableIds() {
        return this.A01.hasStableIds();
    }

    public boolean isEnabled(int i) {
        return this.A01.isEnabled(i);
    }

    public void notifyDataSetChanged() {
        this.A01.notifyDataSetChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.unregisterDataSetObserver(dataSetObserver);
    }

    /* renamed from: BTT */
    public AnonymousClass206 getItem(int i) {
        List list = this.A02;
        if (list.size() > i) {
            return AnonymousClass3MW.A0k(list, i);
        }
        return null;
    }

    public Cursor COs(Cursor cursor) {
        AnonymousClass1BI r2;
        List list = this.A02;
        list.clear();
        if (cursor != null) {
            int count = cursor.getCount();
            for (int i = 0; i < count; i++) {
                AnonymousClass206 BTU = this.A01.BTU(cursor, i);
                if (BTU != null && ((r2 = BTU.A0v.A00) == null || (true ^ this.A00.A0M(r2)))) {
                    list.add(BTU);
                }
            }
        }
        return this.A01.COs(cursor);
    }

    public int getCount() {
        return this.A02.size();
    }

    public boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public int getItemViewType(int i) {
        return this.A01.BTY(getItem(i), i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.A01.BbW(view, viewGroup, getItem(i), i);
    }
}
