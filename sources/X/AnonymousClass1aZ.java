package X;

import android.database.sqlite.SQLiteBlobTooBigException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1aZ  reason: invalid class name */
public class AnonymousClass1aZ extends C28381a4 {
    public final AnonymousClass1QB A00;
    public final Map A01 = new HashMap();

    public boolean A0J(Throwable th, int i) {
        if (i != 1 || !(th instanceof SQLiteBlobTooBigException)) {
            return super.A0J(th, i);
        }
        Log.e("FtsDatabaseMigration/skipping BlobTooBigException single row");
        return true;
    }

    public AnonymousClass1aZ(AnonymousClass1QB r3, C28371a3 r4) {
        super(r4, "message_fts", Integer.MIN_VALUE);
        this.A00 = r3;
    }

    public void A0A() {
        super.A0A();
        this.A03.A05("fts_ready", 5);
    }
}
