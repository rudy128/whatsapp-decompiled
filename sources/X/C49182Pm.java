package X;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.2Pm  reason: invalid class name and case insensitive filesystem */
public class C49182Pm extends A34 {
    public final Uri A00;
    public final C26521Sl A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass3LO A03;
    public final WeakReference A04;

    public void A0F() {
        AnonymousClass1FR r2 = (AnonymousClass1FR) this.A04.get();
        if (r2 != null) {
            r2.CNB(0, 2131899151);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        try {
            return this.A01.A0j(this.A00, false);
        } catch (IOException e) {
            return e;
        }
    }

    public void A0H(Object obj) {
        AnonymousClass1FR r3 = (AnonymousClass1FR) this.A04.get();
        if (r3 != null) {
            r3.CEx();
        }
        if (obj instanceof File) {
            this.A03.BuX((File) obj);
            return;
        }
        if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            C17900vP.A0X(th, "MediaFileUtils/getFileFromMediaStoreAsync/ioerror ", AnonymousClass000.A10());
            if (th.getMessage() != null && th.getMessage().contains("No space")) {
                this.A02.A0E(r3, 2131889993);
                return;
            }
        }
        this.A02.A08(2131896086, 0);
    }

    public C49182Pm(Uri uri, AnonymousClass1FR r3, AnonymousClass1KB r4, AnonymousClass3LO r5, C26521Sl r6) {
        this.A02 = r4;
        this.A01 = r6;
        this.A04 = new WeakReference(r3);
        this.A00 = uri;
        this.A03 = r5;
    }
}
