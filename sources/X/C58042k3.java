package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.concurrent.Executor;

/* renamed from: X.2k3  reason: invalid class name and case insensitive filesystem */
public class C58042k3 {
    public AnonymousClass1NM A00;
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1T6 A03;
    public final C31061ex A04;
    public final A54 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass10I A07;

    public void A00(AZ2 az2, C130136iw r19, C26551So r20, File file) {
        C130136iw r4 = r19;
        if (Build.VERSION.SDK_INT < 26) {
            this.A02.A05.execute(new C21425Ajs((Object) r4, 47));
            return;
        }
        try {
            File A012 = this.A00.A00().A01("enc");
            new FileOutputStream(A012).write(az2.A00.BK6(Files.readAllBytes(file.toPath()), C17970vW.A0I(16)));
            AnonymousClass34B A0C = this.A03.A0C(C63722ta.A00(Uri.fromFile(A012), (C61382pa) null, new AnonymousClass6nF(SearchActionVerificationClientService.NOTIFICATION_ID, 100, 1600, 1600), new C62022qf(true, false, true), r20, (AnonymousClass73B) null, (String) null, 0, false, false, false), true);
            A0C.A0Z = "mms";
            A0C.A07(new AnonymousClass3AW(r4, this, A0C, 13), (Executor) null);
            this.A07.CGF(new C70653Bz(this, A0C, 41));
        } catch (Exception unused) {
            Log.e("PAY: PaymentsComplianceMediaUploadManager encryption failure");
            this.A02.A05.execute(new C21425Ajs((Object) r4, 48));
        }
    }

    public C58042k3(Context context, AnonymousClass1KB r2, AnonymousClass1T6 r3, C31061ex r4, A54 a54, AnonymousClass10I r6, AnonymousClass00H r7) {
        this.A01 = context;
        this.A02 = r2;
        this.A07 = r6;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r7;
        this.A05 = a54;
    }
}
