package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.11B  reason: invalid class name */
public final class AnonymousClass11B {
    public ContentResolver A00;
    public final AnonymousClass00H A01;

    public AnonymousClass11B(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public int A01(Uri uri, String str, String[] strArr) {
        C18070vi.A0d(uri, 0);
        return A00(this).delete(uri, str, strArr);
    }

    public Cursor A02(Uri uri, String[] strArr) {
        C18070vi.A0d(uri, 0);
        ContentResolver A002 = A00(this);
        ((C138956xy) this.A01.get()).A00(AnonymousClass00R.A0C, uri.getAuthority());
        return A002.query(uri, strArr, (Bundle) null, (CancellationSignal) null);
    }

    public Cursor A03(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C18070vi.A0d(uri, 0);
        ContentResolver A002 = A00(this);
        ((C138956xy) this.A01.get()).A00(AnonymousClass00R.A0C, uri.getAuthority());
        return A002.query(uri, strArr, str, strArr2, str2);
    }

    public Bitmap A04(Uri uri, Size size) {
        Bitmap loadThumbnail = A00(this).loadThumbnail(uri, size, (CancellationSignal) null);
        C18070vi.A0X(loadThumbnail);
        return loadThumbnail;
    }

    public Bundle A05(Uri uri, Bundle bundle, String str) {
        C18070vi.A0d(uri, 0);
        return A00(this).call(uri, str, (String) null, bundle);
    }

    public ParcelFileDescriptor A06(Uri uri, String str) {
        C18070vi.A0d(uri, 0);
        ContentResolver A002 = A00(this);
        ((C138956xy) this.A01.get()).A00(AnonymousClass00R.A01, uri.getAuthority());
        return A002.openFileDescriptor(uri, str);
    }

    public InputStream A07(Uri uri) {
        C18070vi.A0d(uri, 0);
        ContentResolver A002 = A00(this);
        ((C138956xy) this.A01.get()).A00(AnonymousClass00R.A0N, uri.getAuthority());
        return A002.openInputStream(uri);
    }

    public OutputStream A08(Uri uri) {
        C18070vi.A0d(uri, 0);
        ContentResolver A002 = A00(this);
        ((C138956xy) this.A01.get()).A00(AnonymousClass00R.A0N, uri.getAuthority());
        return A002.openOutputStream(uri);
    }

    public void A09(Uri uri, ContentObserver contentObserver) {
        C18070vi.A0d(uri, 0);
        C18070vi.A0d(contentObserver, 2);
        A00(this).registerContentObserver(uri, true, contentObserver);
    }

    public static final ContentResolver A00(AnonymousClass11B r0) {
        ContentResolver contentResolver = r0.A00;
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new AnonymousClass3EV();
    }
}
