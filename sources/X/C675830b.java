package X;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.30b  reason: invalid class name and case insensitive filesystem */
public class C675830b implements AnonymousClass1Ce {
    public final /* synthetic */ AnonymousClass1KH A00;

    public C675830b(AnonymousClass1KH r1) {
        this.A00 = r1;
    }

    public void Bqu() {
        Log.i("PAY: PaymentStore successfully created payments database");
    }

    public void Bqv(SQLiteException sQLiteException) {
        if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
            AnonymousClass1KH r1 = this.A00;
            synchronized (r1) {
                AnonymousClass2Di r0 = r1.A00;
                if (r0 != null) {
                    r0.A08();
                }
                r1.A09 = false;
            }
        }
    }

    public void Bqw(C23141Ev r2) {
        Log.i("PAY: PaymentStore successfully opened payments database");
    }
}
