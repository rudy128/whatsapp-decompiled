package X;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

/* renamed from: X.5cH  reason: invalid class name and case insensitive filesystem */
public interface C108775cH extends ListAdapter {
    Cursor BQ4();

    AnonymousClass206 BTT(int i);

    AnonymousClass206 BTU(Cursor cursor, int i);

    int BTY(AnonymousClass206 r1, int i);

    View BbW(View view, ViewGroup viewGroup, AnonymousClass206 r3, int i);

    Cursor COs(Cursor cursor);

    void notifyDataSetChanged();
}
