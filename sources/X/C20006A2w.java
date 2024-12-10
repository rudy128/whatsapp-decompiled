package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.whatsapp.migration.export.api.ExportMigrationContentProvider;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A2w  reason: case insensitive filesystem */
public class C20006A2w {
    public static final long A06 = AnonymousClass8BW.A05();
    public static final long A07 = TimeUnit.DAYS.toMillis(2);
    public final ComponentName A00;
    public final PackageManager A01;
    public final C196129uV A02;
    public final Context A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11P A05;

    public void A02() {
        C196129uV r0 = this.A02;
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass00H r2 = r0.A01;
        C17880vN.A1D(AnonymousClass8BV.A06(r2), "/export/provider_closed/timestamp", currentTimeMillis);
        C17880vN.A1B(AnonymousClass8BV.A06(r2), "/export/provider/timestamp");
        this.A01.setComponentEnabledSetting(this.A00, 0, 1);
        if (A05()) {
            this.A04.A0G("xpm-provider-disable-failed", A01(), false);
        }
    }

    public void A03() {
        C17880vN.A1B(AnonymousClass8BV.A06(this.A02.A01), "/export/provider_closed/timestamp");
        A04();
        this.A01.setComponentEnabledSetting(this.A00, 1, 1);
    }

    public boolean A05() {
        return C17890vO.A1R(this.A01.getComponentEnabledSetting(this.A00));
    }

    public C20006A2w(Context context, AnonymousClass190 r4, AnonymousClass11P r5, C196129uV r6) {
        this.A05 = r5;
        this.A03 = context;
        this.A01 = context.getPackageManager();
        this.A04 = r4;
        this.A02 = r6;
        this.A00 = new ComponentName(context, ExportMigrationContentProvider.class);
    }

    public String A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long A052 = C17890vO.A05(C17880vN.A0B(this.A02.A01), "/export/provider_closed/timestamp");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("providerState: ");
        A10.append(this.A01.getComponentEnabledSetting(this.A00));
        A10.append("; closedUnsuccessfully: ");
        A10.append(A052);
        A10.append("; currentTime: ");
        A10.append(currentTimeMillis);
        return AnonymousClass000.A0y(";", A10);
    }

    public String A01() {
        String str;
        int length;
        long currentTimeMillis = System.currentTimeMillis();
        long A052 = C17890vO.A05(C17880vN.A0B(this.A02.A01), "/export/provider/timestamp");
        Context context = this.A03;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str2 = ">";
        if (applicationInfo != null) {
            try {
                str = C108945cZ.A17(applicationInfo.dataDir).getCanonicalFile().toString();
            } catch (IOException e) {
                str = AnonymousClass8BX.A0g(e, "<failed: ", str2).toString();
            }
        } else {
            str = null;
        }
        try {
            Signature[] signatureArr = this.A01.getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                str2 = "<no signatures>";
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("providerState: ");
                A10.append(this.A01.getComponentEnabledSetting(this.A00));
                A10.append("; lastAccessTime: ");
                A10.append(A052);
                A10.append("; currentTime: ");
                A10.append(currentTimeMillis);
                A10.append("; dataDir: ");
                A10.append(str);
                A10.append("; signature: ");
                A10.append(str2);
                return AnonymousClass000.A0y(";", A10);
            }
            if (length > 1) {
                str2 = "<multiple signatures>";
            } else {
                try {
                    str2 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray()), 11);
                } catch (NoSuchAlgorithmException e2) {
                    str2 = AnonymousClass8BX.A0g(e2, "<failed: ", str2).toString();
                }
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("providerState: ");
            A102.append(this.A01.getComponentEnabledSetting(this.A00));
            A102.append("; lastAccessTime: ");
            A102.append(A052);
            A102.append("; currentTime: ");
            A102.append(currentTimeMillis);
            A102.append("; dataDir: ");
            A102.append(str);
            A102.append("; signature: ");
            A102.append(str2);
            return AnonymousClass000.A0y(";", A102);
        } catch (PackageManager.NameNotFoundException e3) {
            str2 = AnonymousClass8BX.A0g(e3, "<failed: ", str2).toString();
        }
    }

    public void A04() {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass00H r10 = this.A02.A01;
        long j = C17880vN.A0B(r10).getLong("/export/provider/timestamp", 0);
        long j2 = currentTimeMillis - j;
        if (j == 0 || j2 < 0 || j2 > 60000) {
            AnonymousClass8BW.A12(C17880vN.A0B(r10), "/export/provider/timestamp", currentTimeMillis);
        }
    }
}
