package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Chf  reason: case insensitive filesystem */
public final class C25542Chf {
    public static final C25712Cki A02 = new C25712Cki("ReviewService");
    public C25994CqA A00;
    public final String A01;

    public C25542Chf(Context context) {
        C25712Cki cki;
        Object[] objArr;
        String str;
        int length;
        String str2;
        this.A01 = context.getPackageName();
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                cki = CFK.A00;
                objArr = new Object[0];
                str = "Play Store package is disabled.";
            } else {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    cki = CFK.A00;
                    objArr = new Object[0];
                    str = "Play Store package is not signed -- possibly self-built package. Could not verify.";
                } else {
                    ArrayList A13 = AnonymousClass000.A13();
                    int i = 0;
                    do {
                        try {
                            str2 = AnonymousClass8BT.A0x(AnonymousClass8BW.A1W(signatureArr[i].toByteArray(), "SHA-256"));
                        } catch (NoSuchAlgorithmException unused) {
                            str2 = "";
                        }
                        A13.add(str2);
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str2)) {
                            String str3 = Build.TAGS;
                            if ((!str3.contains("dev-keys") && !str3.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str2)) {
                                i++;
                            }
                        }
                        this.A00 = new C25994CqA(context, C108945cZ.A0G("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), A02);
                        return;
                    } while (i < length);
                    C25712Cki cki2 = CFK.A00;
                    Object[] objArr2 = new Object[1];
                    StringBuilder A10 = AnonymousClass000.A10();
                    Iterator it = A13.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            A10.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            A10.append(", ");
                        }
                    }
                    BE6.A1H(A10, objArr2, 0);
                    cki2.A02(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr2), new Object[0]);
                    return;
                }
            }
            cki.A02(str, objArr);
        } catch (PackageManager.NameNotFoundException unused2) {
            CFK.A00.A02("Play Store package is not found.", new Object[0]);
        }
    }
}
