package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.1os  reason: invalid class name and case insensitive filesystem */
public class C37041os {
    public final AnonymousClass118 A00;
    public final C37011op A01;

    public void A00(String str) {
        int i = Build.VERSION.SDK_INT;
        Uri parse = Uri.parse("content://com.whatsapp.provider.instrumentation");
        Context context = this.A00.A00;
        if (i >= 26) {
            context.revokeUriPermission(str, parse, 3);
        } else {
            context.revokeUriPermission(parse, 3);
        }
    }

    public C37041os(AnonymousClass118 r1, C37011op r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
