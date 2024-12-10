package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cq1  reason: case insensitive filesystem */
public final class C25987Cq1 {
    public static final ConcurrentHashMap A07 = AnonymousClass8BR.A17();
    public static final String[] A08;
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Uri A02;
    public final Object A03 = C17880vN.A0p();
    public final Object A04 = C17880vN.A0p();
    public final List A05 = AnonymousClass000.A13();
    public volatile Map A06;

    public final Map A01() {
        Map A002 = C26240Cvd.A04("gms:phenotype:phenotype_flag:debug_disable_caching") ? A00() : this.A06;
        if (A002 == null) {
            synchronized (this.A03) {
                A002 = this.A06;
                if (A002 == null) {
                    A002 = A00();
                    this.A06 = A002;
                }
            }
        }
        return A002 == null ? Collections.emptyMap() : A002;
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "key";
        A1Z[1] = "value";
        A08 = A1Z;
    }

    public C25987Cq1(ContentResolver contentResolver, Uri uri) {
        this.A00 = contentResolver;
        this.A02 = uri;
        this.A01 = new C22589BEo(this);
    }

    private final HashMap A00() {
        Cursor query;
        try {
            HashMap A11 = C17880vN.A11();
            query = this.A00.query(this.A02, A08, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return A11;
            }
            while (query.moveToNext()) {
                A11.put(query.getString(0), query.getString(1));
            }
            query.close();
            return A11;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
