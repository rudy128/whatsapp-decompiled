package X;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.B3n  reason: case insensitive filesystem */
public final class C22336B3n extends AnonymousClass11G implements AnonymousClass20G {
    public final /* synthetic */ BA0 $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22336B3n(BA0 ba0) {
        super(4);
        this.$query = ba0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        BA0 ba0 = this.$query;
        C18070vi.A0b(sQLiteQuery);
        ba0.BDD(new AHW(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
