package X;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.21V  reason: invalid class name */
public abstract class AnonymousClass21V extends AnonymousClass206 {
    public long A00;
    public long A01;
    public C62572rc A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final AnonymousClass25F A0C = A0N(C693436v.class);
    public volatile int A0D;

    public synchronized void A15(byte[] bArr, boolean z) {
        float f;
        int i;
        C62572rc r3 = this.A02;
        if (r3 != null) {
            if (bArr != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i2 = options.outWidth;
                if (i2 > 0 && (i = options.outHeight) > 0) {
                    f = ((float) i) / ((float) i2);
                    r3.A00 = f;
                }
            }
            f = -1.0f;
            r3.A00 = f;
        }
        super.A15(bArr, z);
    }

    public synchronized boolean A16() {
        boolean z;
        z = true;
        if (!super.A16()) {
            C62572rc r0 = this.A02;
            if (r0 == null || r0.A00 <= 0.0f) {
                z = false;
            }
        }
        return z;
    }

    public static boolean A0A(String str) {
        if (str == null || !str.contains("static.whatsapp.net/downloadable?category=PSA")) {
            return false;
        }
        return true;
    }

    public C693436v A17() {
        AnonymousClass25F r1 = this.A0C;
        if (r1.A02 == null && C693436v.A00(C63972u0.A02(this)) && r1.A02 == null) {
            C693436v r0 = new C693436v(this);
            synchronized (r1) {
                r1.A02 = r0;
            }
        }
        return (C693436v) r1.A02;
    }

    public String A18() {
        C20285AEt aEt;
        C58072k6 r0;
        if (this instanceof C438121a) {
            aEt = ((C438121a) this).A00;
        } else {
            if (this instanceof C440321w) {
                r0 = ((C440321w) this).A00;
            } else if (this instanceof C440121u) {
                r0 = ((C440121u) this).A00;
            } else if (this instanceof C440521y) {
                r0 = ((C440521y) this).A00;
            } else if (!(this instanceof C438521e)) {
                return this.A04;
            } else {
                aEt = ((C438521e) this).A00;
            }
            return r0.A02;
        }
        if (aEt != null) {
            return aEt.A0B;
        }
        return null;
    }

    public String A19() {
        if (!(this instanceof C438921i)) {
            return this.A09;
        }
        String str = this.A09;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String A18 = A18();
        if (TextUtils.isEmpty(A18)) {
            return null;
        }
        String A032 = C25291Nq.A03(this.A06);
        if (TextUtils.isEmpty(A032)) {
            return A18;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A18);
        sb.append(".");
        sb.append(A032);
        return sb.toString();
    }

    public void A1A(Cursor cursor, C62572rc r5) {
        this.A02 = r5;
        A1D(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A09 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A0D = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
        this.A00 = AnonymousClass1Eu.A02(cursor, cursor.getColumnIndexOrThrow("first_viewed_timestamp"), 0);
    }

    public void A1B(Cursor cursor, C62572rc r4) {
        this.A02 = r4;
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A09 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A0D = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
        if (A0O() != null) {
            A15(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
        }
    }

    public void A1C(String str) {
        AnonymousClass205 r1 = this.A0v;
        if (C22971Dz.A0V(r1.A00)) {
            return;
        }
        if (C20133A8t.A0D(r1, str)) {
            this.A07 = str;
            return;
        }
        throw new C32711hd(15);
    }

    public void A1D(String str) {
        this.A0A = str;
        if (!TextUtils.isEmpty(str)) {
            A0b(64);
        } else {
            A0c(64);
        }
    }

    public boolean A1E() {
        File file;
        C62572rc r0 = this.A02;
        if (r0 == null || (file = r0.A0G) == null || !file.canRead()) {
            return false;
        }
        return true;
    }

    public boolean A1F() {
        if (this.A07 != null) {
            return true;
        }
        C62572rc r0 = this.A02;
        if (r0 == null || r0.A0J == null) {
            return false;
        }
        return true;
    }

    public AnonymousClass21V(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }
}
