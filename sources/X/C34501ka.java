package X;

import android.net.Uri;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1ka  reason: invalid class name and case insensitive filesystem */
public class C34501ka extends C26511Sk {
    public final AnonymousClass11C A00;
    public final WamediaManager A01;
    public final AnonymousClass1NL A02;

    public int A00(Uri uri) {
        AnonymousClass11B A0O = this.A00.A0O();
        String A0M = C26511Sk.A0M(uri, A0O);
        try {
            if ("image/gif".equals(A0M)) {
                AnonymousClass1NL r0 = this.A02;
                try {
                    DRK.A02(uri, r0, A0O);
                    if (!DRK.A02(uri, r0, A0O).A02) {
                        return 1;
                    }
                    return 13;
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            Log.e("Media file cannot be read", e);
        }
        int A04 = C26511Sk.A04(A0M);
        if (A04 == 0) {
            return 9;
        }
        return A04;
    }

    public int A01(AnonymousClass72S r4) {
        boolean z = false;
        if (r4.A06 != null) {
            z = true;
        }
        if (z) {
            return 3;
        }
        Integer A0D = r4.A0D();
        if (A0D == null) {
            int A002 = A00(r4.A0X);
            A0D = Integer.valueOf(A002);
            if (A002 == 3 && this.A01.hasGifTag(r4.A0C())) {
                A0D = 13;
            }
        }
        return A0D.intValue();
    }

    public C34501ka(AnonymousClass11C r3, WamediaManager wamediaManager, AnonymousClass1NL r5) {
        this.A00 = r3;
        this.A01 = wamediaManager;
        this.A02 = r5;
        r5.A02.add("com.whatsapp.provider.MigrationContentProvider");
    }
}
