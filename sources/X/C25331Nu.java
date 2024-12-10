package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Nu  reason: invalid class name and case insensitive filesystem */
public class C25331Nu {
    public final AnonymousClass1LW A00;
    public final C25321Nt A01;
    public final AnonymousClass1Cd A02;

    public byte[] A05(AnonymousClass206 r9) {
        Cursor A0A;
        StringBuilder sb;
        String str;
        if (r9 == null) {
            return null;
        }
        if (r9 instanceof C441322g) {
            return A01(((AnonymousClass21V) r9).A05);
        }
        if (r9.A0x <= 0) {
            sb = new StringBuilder();
            str = "ThumbnailMessageStore/getMessageThumbnail/message must have row_id set; key=";
        } else if (r9.A0E() != 1) {
            sb = new StringBuilder();
            str = "ThumbnailMessageStore/getMessageThumbnail/message must be in main storage; key=";
        } else {
            boolean z = false;
            if (r9.A0x > 0) {
                z = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ThumbnailMessageStore/getThumbnailV2/message must have row_id set; key=");
            sb2.append(r9.A0v);
            C17960vV.A0G(z, sb2.toString());
            try {
                C28781at A04 = this.A02.get();
                try {
                    A0A = ((C28801av) A04).A02.A0A("SELECT thumbnail FROM message_thumbnail WHERE message_row_id = ?", "GET_THUMBNAIL_BY_ROW_ID_SQL", new String[]{Long.toString(r9.A0x)});
                    if (A0A.moveToNext()) {
                        byte[] blob = A0A.getBlob(A0A.getColumnIndexOrThrow("thumbnail"));
                        A0A.close();
                        A04.close();
                        return blob;
                    }
                    A0A.close();
                    A04.close();
                    return null;
                } catch (Throwable th) {
                    A04.close();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ThumbnailMessageStore/getThumbnailV2/failed to read thumbnail", e);
                return null;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        sb.append(str);
        sb.append(r9.A0v);
        Log.w(sb.toString());
        return null;
        throw th;
    }

    public static void A00(AnonymousClass206 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A0x > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbnailMessageStore/isThumbnailV2Ready/message must have row_id set; key=");
        AnonymousClass205 r2 = r8.A0v;
        sb.append(r2);
        C17960vV.A0G(z2, sb.toString());
        if (r8.A0E() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ThumbnailMessageStore/isThumbnailV2Ready/message must be in main storage; key=");
        sb2.append(r2);
        C17960vV.A0G(z, sb2.toString());
    }

    public void A02(AnonymousClass206 r10) {
        C28781at r8;
        Cursor A0A;
        C28791au A05;
        if (r10 instanceof C441322g) {
            AnonymousClass21V r102 = (AnonymousClass21V) r10;
            String str = r102.A05;
            if (!TextUtils.isEmpty(str)) {
                r8 = this.A01.A02.get();
                try {
                    boolean z = false;
                    A0A = ((C28801av) r8).A02.A0A("SELECT COUNT(1) as count FROM message_media WHERE file_hash = ? AND message_row_id != ?", "SELECT_REFERENCED_FILE_HASH_WITH_MESSAGE_ROW_ID_SQL", new String[]{r102.A05, String.valueOf(r102.A0x)});
                    if (A0A.moveToNext()) {
                        if (A0A.getLong(A0A.getColumnIndexOrThrow("count")) == 0) {
                            z = true;
                        }
                        A0A.close();
                        r8.close();
                        if (!z) {
                            return;
                        }
                    } else {
                        A0A.close();
                        r8.close();
                    }
                    A05 = this.A02.A05();
                } catch (Throwable th) {
                    th = th;
                    r8.close();
                    throw th;
                }
                try {
                    ((C28801av) A05).A02.A04("media_hash_thumbnail", "media_hash = ?", "DELETE_MEDIA_HASH_THUMBNAIL_SQL", new String[]{str});
                    A05.close();
                    return;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            } else {
                return;
            }
        } else {
            A00(r10);
            long j = r10.A0x;
            r8 = this.A02.A05();
            ((C28801av) r8).A02.A04("message_thumbnail", "message_row_id = ?", "DELETE_MESSAGE_THUMBNAIL_SQL", new String[]{String.valueOf(j)});
            r8.close();
            return;
        }
        throw th;
    }

    public void A03(AnonymousClass206 r9, byte[] bArr) {
        C28791au r7;
        if (r9 instanceof C441322g) {
            String str = ((AnonymousClass21V) r9).A05;
            if (!TextUtils.isEmpty(str) && A01(str) == null) {
                r7 = this.A02.A05();
                try {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("media_hash", str);
                    contentValues.put("thumbnail", bArr);
                    ((C28801av) r7).A02.A05("media_hash_thumbnail", "INSERT_MEDIA_HASH_THUMBNAIL_SQL", contentValues);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            } else {
                return;
            }
        } else {
            A00(r9);
            if (bArr != null) {
                long j = r9.A0x;
                r7 = this.A02.A05();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("message_row_id", Long.valueOf(j));
                contentValues2.put("thumbnail", bArr);
                boolean z = false;
                if (((C28801av) r7).A02.A09("message_thumbnail", "INSERT_MESSAGE_THUMBNAIL_SQL", contentValues2, 5) == j) {
                    z = true;
                }
                C17960vV.A0H(z, "ThumbnailMessageStore/insertOrUpdateThumbnailV2/inserted row should has same row_id");
            } else {
                return;
            }
        }
        r7.close();
    }

    public void A04(Collection collection) {
        Cursor A0A;
        C28791au A05 = this.A02.A05();
        try {
            C41851xA BD0 = A05.BD0();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    boolean z = true;
                    String[] strArr = {str};
                    C28781at A04 = this.A01.A02.get();
                    try {
                        A0A = ((C28801av) A04).A02.A0A("SELECT COUNT(1) as count FROM message_media WHERE file_hash=?", "SELECT_REFERENCED_FILE_HASH_SQL", strArr);
                        if (A0A.moveToNext() && A0A.getLong(A0A.getColumnIndexOrThrow("count")) != 0) {
                            z = false;
                        }
                        A0A.close();
                        A04.close();
                        if (!z) {
                            ((C28801av) A05).A02.A04("media_hash_thumbnail", "media_hash = ?", "DELETE_MEDIA_HASH_THUMBNAIL_SQL", new String[]{str});
                        }
                    } catch (Throwable th) {
                        A04.close();
                        throw th;
                    }
                }
                BD0.A00();
                BD0.close();
                A05.close();
                return;
                throw th;
            } catch (Throwable th2) {
                BD0.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A05.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public C25331Nu(AnonymousClass1LW r1, C25321Nt r2, AnonymousClass1Cd r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    private byte[] A01(String str) {
        Cursor A0A;
        byte[] bArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr = {str};
        C28781at A04 = this.A02.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT thumbnail FROM media_hash_thumbnail WHERE media_hash = ?", "GET_THUMBNAIL_BY_MEDIA_HASH_SQL", strArr);
            if (A0A.moveToNext()) {
                bArr = A0A.getBlob(A0A.getColumnIndexOrThrow("thumbnail"));
            }
            A0A.close();
            A04.close();
            return bArr;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}
