package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: X.3Oy  reason: invalid class name and case insensitive filesystem */
public abstract class C73093Oy extends BaseAdapter implements C108175bG, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public C72583Ms A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass3P0 A07;

    public static void A03(Context context, C73093Oy r4) {
        r4.A05 = true;
        r4.A02 = null;
        r4.A06 = false;
        r4.A01 = context;
        r4.A00 = -1;
        r4.A04 = new C72583Ms(r4);
        r4.A03 = new C72613Mv(r4);
    }

    public abstract View A05(Context context, Cursor cursor, ViewGroup viewGroup);

    public boolean hasStableIds() {
        return true;
    }

    public View A04(Context context, Cursor cursor, ViewGroup viewGroup) {
        if (!(this instanceof AnonymousClass3SV)) {
            return A05(context, cursor, viewGroup);
        }
        AnonymousClass3SV r0 = (AnonymousClass3SV) this;
        return AnonymousClass3MX.A09(r0.A01, viewGroup, r0.A00);
    }

    public void A06(Cursor cursor, View view) {
        throw new AssertionError();
    }

    public CharSequence BFv(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Cursor BQ4() {
        return this.A02;
    }

    public Cursor COs(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C72583Ms r0 = this.A04;
            if (r0 != null) {
                cursor2.unregisterContentObserver(r0);
            }
            DataSetObserver dataSetObserver = this.A03;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A02 = cursor;
        if (cursor != null) {
            C72583Ms r02 = this.A04;
            if (r02 != null) {
                cursor.registerContentObserver(r02);
            }
            DataSetObserver dataSetObserver2 = this.A03;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A06 = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.A00 = -1;
        this.A06 = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            return null;
        }
        this.A02.moveToPosition(i);
        if (view == null) {
            view = A04(this.A01, this.A02, viewGroup);
        }
        A06(this.A02, view);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3P0, android.widget.Filter] */
    public Filter getFilter() {
        AnonymousClass3P0 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        ? filter = new Filter();
        filter.A00 = this;
        this.A07 = filter;
        return filter;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            throw AnonymousClass000.A0n("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i)) {
            if (view == null) {
                view = A05(this.A01, this.A02, viewGroup);
            }
            A06(this.A02, view);
            return view;
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1I("couldn't move cursor to position ", AnonymousClass000.A10(), i));
        }
    }

    public void BEZ(Cursor cursor) {
        Cursor COs = COs(cursor);
        if (COs != null) {
            COs.close();
        }
    }

    public Cursor CGR(CharSequence charSequence) {
        return this.A02;
    }
}
