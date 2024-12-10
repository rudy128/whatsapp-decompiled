package X;

import android.database.Cursor;

/* renamed from: X.24v  reason: invalid class name and case insensitive filesystem */
public final class C448024v implements C447624r {
    public final AnonymousClass00H A00;

    public C448024v(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r10, C49702Rn r11) {
        Cursor A0A;
        C693536w r2;
        C18070vi.A0d(r10, 0);
        if (r10.A11(2048)) {
            C32631hV r4 = ((C32641hW) this.A00.get()).A01;
            long j = r10.A0x;
            C28781at A04 = r4.A01.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT message_row_id, direct_path, media_key, media_key_timestamp, enc_thumb_hash, thumb_hash, thumb_width, thumb_height, transferred, micro_thumbnail, insert_timestamp, handle FROM mms_thumbnail_metadata WHERE message_row_id = ?", "GET_MMS_THUMBNAIL_METADATA_SQL", new String[]{Long.toString(j)});
                if (A0A.moveToLast()) {
                    r2 = new C693536w((C49572Qz) null, j);
                    r2.A05 = A0A.getString(A0A.getColumnIndexOrThrow("direct_path"));
                    r2.A0B = A0A.getBlob(A0A.getColumnIndexOrThrow("media_key"));
                    r2.A02 = A0A.getLong(A0A.getColumnIndexOrThrow("media_key_timestamp"));
                    r2.A06 = A0A.getString(A0A.getColumnIndexOrThrow("enc_thumb_hash"));
                    r2.A09 = A0A.getString(A0A.getColumnIndexOrThrow("thumb_hash"));
                    r2.A01 = A0A.getInt(A0A.getColumnIndexOrThrow("thumb_width"));
                    r2.A00 = A0A.getInt(A0A.getColumnIndexOrThrow("thumb_height"));
                    r2.A0A = AnonymousClass1Eu.A06(A0A, A0A.getColumnIndexOrThrow("transferred"));
                    r2.A0C = A0A.getBlob(A0A.getColumnIndexOrThrow("micro_thumbnail"));
                    r2.A07 = A0A.getString(A0A.getColumnIndexOrThrow("handle"));
                    A0A.close();
                    A04.close();
                } else {
                    A0A.close();
                    A04.close();
                    r2 = null;
                }
                C60502o8.A01(r10, r2);
                if (r2 != null && C63652tT.A02(r4.A02, r10)) {
                    r2.A0E = true;
                }
                if (r11 != null) {
                    new AnonymousClass20F(C448024v.class);
                    throw new NullPointerException("onProcessorExecuted");
                }
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
