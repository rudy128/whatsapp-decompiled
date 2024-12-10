package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.9BF  reason: invalid class name */
public class AnonymousClass9BF extends A34 {
    public WeakReference A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass18K A03;
    public final C136746uK A04 = new Object();
    public final File A05;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str = (String) obj;
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A00);
        if (A0Z != null && !A0Z.Bed()) {
            A0Z.CEx();
            if (TextUtils.isEmpty(str)) {
                this.A01.A06(2131895475, 0);
                return;
            }
            C170758qc r2 = new C170758qc();
            r2.A00 = Long.valueOf(this.A04.A00);
            this.A03.CC7(r2);
            A0Z.A3q(new Intent("android.intent.action.VIEW", Uri.parse(str)), false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.6uK] */
    public AnonymousClass9BF(AnonymousClass1FU r2, AnonymousClass1KB r3, AnonymousClass181 r4, AnonymousClass18K r5, File file) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = AnonymousClass3MW.A0z(r2);
        this.A05 = file;
    }
}
