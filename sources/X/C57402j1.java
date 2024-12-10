package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: X.2j1  reason: invalid class name and case insensitive filesystem */
public class C57402j1 {
    public final C37001oo A00;
    public final AnonymousClass11C A01;

    public C57402j1(AnonymousClass11C r2, AnonymousClass118 r3, C37021oq r4) {
        this.A00 = new C37001oo(r3, r4);
        this.A01 = r2;
    }

    public ContentProviderClient A00(Context context, Uri uri) {
        PackageManager packageManager;
        ProviderInfo resolveContentProvider;
        String authority = uri.getAuthority();
        if (authority == null || (packageManager = context.getPackageManager()) == null || (resolveContentProvider = packageManager.resolveContentProvider(authority, 0)) == null) {
            return null;
        }
        this.A00.A02(resolveContentProvider.packageName);
        AnonymousClass11B A0O = this.A01.A0O();
        ContentResolver A002 = AnonymousClass11B.A00(A0O);
        ((C138956xy) A0O.A01.get()).A00(AnonymousClass00R.A00, authority);
        return A002.acquireUnstableContentProviderClient(authority);
    }
}
