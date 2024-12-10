package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.6Ec  reason: invalid class name and case insensitive filesystem */
public abstract class C120536Ec extends C161468Ek {
    public C218617r A00;
    public AnonymousClass1KB A01;

    public void onCreate(Bundle bundle) {
        String str;
        IOException iOException;
        super.onCreate(bundle);
        setTitle(2131895381);
        Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
        String stringExtra = getIntent().getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C18070vi.A0b(stringExtra);
        String replaceAll = stringExtra.replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
        C18070vi.A0X(replaceAll);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
        C218617r r0 = this.A00;
        if (r0 != null) {
            File file = r0.A08().A0I;
            C218617r.A07(file, false);
            StringBuilder A11 = AnonymousClass000.A11(replaceAll);
            A11.append(' ');
            A11.append(simpleDateFormat.format(new Date()));
            File A0e = C17880vN.A0e(file, AnonymousClass000.A0y(".jpg", A11));
            if (uri != null) {
                try {
                    String path = uri.getPath();
                    if (path != null) {
                        C218617r r1 = this.A00;
                        if (r1 != null) {
                            r1.A0i(C108945cZ.A17(path), A0e);
                            C26511Sk.A0O(this, Uri.fromFile(A0e));
                            AnonymousClass1KB r12 = this.A01;
                            if (r12 != null) {
                                r12.A08(2131894554, 0);
                                finish();
                                return;
                            }
                            AnonymousClass3MW.A1C();
                        } else {
                            C18070vi.A11("fMessageIO");
                        }
                        iOException = null;
                        throw iOException;
                    }
                } catch (IOException e) {
                    Log.e("viewprofilephoto/save/failed", e);
                    AnonymousClass1KB r2 = this.A01;
                    if (r2 != null) {
                        r2.A08(2131894542, 1);
                    } else {
                        str = "globalUI";
                    }
                }
            }
            iOException = C17880vN.A0f("Invalid Uri");
            throw iOException;
        }
        str = "fMessageIO";
        C18070vi.A11(str);
        throw null;
    }
}
