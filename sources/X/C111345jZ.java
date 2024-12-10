package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.5jZ  reason: invalid class name and case insensitive filesystem */
public class C111345jZ extends C22702BLf {
    public static final String[] A04 = {"_id", "artist", "title", "_data", "duration", "_size"};
    public CancellationSignal A00;
    public Cursor A01;
    public final AnonymousClass11B A02;
    public final ArrayList A03;

    public /* bridge */ /* synthetic */ Object A06() {
        Cursor query;
        synchronized (this) {
            if (!AnonymousClass000.A1W(this.A01)) {
                this.A00 = new CancellationSignal();
            } else {
                throw new AnonymousClass1QC();
            }
        }
        try {
            ArrayList arrayList = this.A03;
            String[] strArr = new String[(arrayList.size() * 2)];
            StringBuilder A10 = AnonymousClass000.A10();
            for (int i = 0; i < arrayList.size(); i++) {
                A10.append(" AND ");
                A10.append("(");
                A10.append("title");
                A10.append(" LIKE ?");
                A10.append(" OR ");
                A10.append("artist");
                A10.append(" LIKE ?");
                A10.append(")");
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("%");
                strArr[i * 2] = AnonymousClass001.A1H(C108945cZ.A1H(arrayList, i), "%", A102);
                strArr[(i * 2) + 1] = AnonymousClass001.A1H(C108945cZ.A1H(arrayList, i), "%", AnonymousClass000.A11("%"));
            }
            AnonymousClass11B r2 = this.A02;
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = A04;
            String A1E = AnonymousClass001.A1E(A10, "(is_music!=0 OR is_podcast!=0)", AnonymousClass000.A10());
            CancellationSignal cancellationSignal = this.A00;
            C18070vi.A0d(uri, 0);
            ContentResolver A002 = AnonymousClass11B.A00(r2);
            ((C138956xy) r2.A01.get()).A00(AnonymousClass00R.A0C, uri.getAuthority());
            query = A002.query(uri, strArr2, A1E, strArr, "date_modified DESC", cancellationSignal);
            if (query != null) {
                query.getCount();
            }
            synchronized (this) {
                this.A00 = null;
            }
            return query;
        } catch (RuntimeException e) {
            query.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A07() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.A00;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    public void A02() {
        Cursor cursor = this.A01;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A01 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A01;
            this.A01 = cursor;
            if (this.A06) {
                super.A04(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C111345jZ(Context context, AnonymousClass11B r3, ArrayList arrayList) {
        super(context);
        this.A02 = r3;
        if (arrayList == null) {
            this.A03 = AnonymousClass000.A13();
        } else {
            this.A03 = arrayList;
        }
    }

    public void A01() {
        A00();
        Cursor cursor = this.A01;
        if (cursor != null && !cursor.isClosed()) {
            this.A01.close();
        }
        this.A01 = null;
    }

    public void A03() {
        A00();
    }
}
