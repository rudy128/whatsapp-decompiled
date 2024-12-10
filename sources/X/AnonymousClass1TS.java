package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.1TS  reason: invalid class name */
public class AnonymousClass1TS {
    public final C25551Oq A00;

    public void A04(String str, long j) {
        C41851xA BD0;
        long j2 = j;
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        C17960vV.A0D(z);
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            String str2 = str;
            A00(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dirty_version", Long.valueOf(j2));
            if (((long) ((C28801av) A06).A02.A02(contentValues, "collection_versions", "collection_name = ? ", "CollectionVersionsTable.UPDATE_COLLECTION_DIRTY_VERSION", new String[]{str})) <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncDbStore/updateCollectionDirtyVersion failed for collection: ");
                sb.append(str2);
                sb.append(", dirtyVersion: ");
                sb.append(j2);
                Log.e(sb.toString());
            }
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    private void A00(String str) {
        C28791au A06 = this.A00.A06();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("collection_name", str);
            contentValues.put("version", 0);
            contentValues.putNull("lt_hash");
            contentValues.put("dirty_version", -1);
            ((C28801av) A06).A02.A09("collection_versions", "CollectionVersionsTable.INSERT_OR_IGNORE", contentValues, 4);
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Long A01(String str) {
        Cursor A0A;
        Long l;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", new String[]{str});
            if (A0A.moveToFirst()) {
                l = Long.valueOf(A0A.getLong(A0A.getColumnIndexOrThrow("version")));
            } else {
                l = null;
            }
            A0A.close();
            A05.close();
            return l;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public HashMap A02() {
        Cursor A0A;
        HashMap hashMap = new HashMap();
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT collection_name, version FROM collection_versions", "CollectionVersionsTable.GET_ALL_COLLECTION_VERSIONS", (String[]) null);
            while (A0A.moveToNext()) {
                hashMap.put(A0A.getString(A0A.getColumnIndexOrThrow("collection_name")), Long.valueOf(A0A.getLong(A0A.getColumnIndexOrThrow("version"))));
            }
            A0A.close();
            A05.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(String str) {
        C41851xA BD0;
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            ((C28801av) A06).A02.A0F("UPDATE collection_versions SET dirty_version = -1 WHERE collection_name = ? AND dirty_version = 0", "CollectionVersionsTable.MARK_COLLECTION_AS_UPDATED", new String[]{str});
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(String str, byte[] bArr, long j) {
        C41851xA BD0;
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            String str2 = str;
            A00(str2);
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("version", Long.valueOf(j2));
            byte[] bArr2 = bArr;
            if (bArr != null) {
                contentValues.put("lt_hash", bArr2);
            } else {
                contentValues.putNull("lt_hash");
            }
            if (((long) ((C28801av) A06).A02.A02(contentValues, "collection_versions", "collection_name = ? ", "CollectionVersionsTable.UPDATE_COLLECTION_VERSION", new String[]{str})) <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncDbStore/updateCollectionVersion failed for collection: ");
                sb.append(str2);
                sb.append(", version: ");
                sb.append(j2);
                sb.append(", ltHash: ");
                sb.append(Arrays.toString(bArr2));
                Log.e(sb.toString());
            }
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A06(String str) {
        Cursor A0A;
        long j;
        long j2;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", new String[]{str});
            if (A0A.moveToFirst()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("version"));
                j2 = A0A.getLong(A0A.getColumnIndexOrThrow("dirty_version"));
            } else {
                j = 0;
                j2 = 0;
            }
            A0A.close();
            A05.close();
            if (j2 == 0 || j < j2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public byte[] A07(String str) {
        Cursor A0A;
        byte[] bArr;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", new String[]{str});
            if (A0A.moveToFirst()) {
                bArr = A0A.getBlob(A0A.getColumnIndexOrThrow("lt_hash"));
            } else {
                bArr = null;
            }
            A0A.close();
            A05.close();
            if (bArr == null) {
                return new byte[128];
            }
            return bArr;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1TS(C25551Oq r1) {
        this.A00 = r1;
    }
}
