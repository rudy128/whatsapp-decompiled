package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.8qR  reason: invalid class name and case insensitive filesystem */
public class C170648qR extends C196279uk {
    public static final int A0E = ((int) TimeUnit.MINUTES.toMillis(60));
    public static final String A0F;
    public static final String A0G = C198229y0.A03;
    public static final String A0H;
    public C171198rK A00;
    public Long A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass1KB A04;
    public final C186529eL A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C19830z4 A08;
    public final C18000vb A09;
    public final C18030ve A0A;
    public final AnonymousClass18K A0B;
    public final C24481Km A0C;
    public final AnonymousClass1QO A0D;

    public void A0B(BCV bcv, String str, boolean z) {
        this.A03 = z;
        this.A02 = str;
        if (this.A09) {
            C21451AkI.A01(this.A03, this, bcv, 13);
            return;
        }
        String str2 = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str2 = "2.24.24.78";
        }
        C18030ve r6 = this.A0A;
        C24481Km r1 = this.A0C;
        String A012 = A01(this);
        String A052 = this.A09.A05();
        Uri.Builder A002 = C88574a9.A00(r6, r1, "wa/static/downloadable");
        A002.appendQueryParameter("category", A012);
        A002.appendQueryParameter("locale", A052);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A002.appendQueryParameter("existing_id", (String) null);
        }
        if (!TextUtils.isEmpty(str2)) {
            A002.appendQueryParameter("version", str2);
        }
        super.A04(bcv, (Object) null, A002.build().toString(), (Map) null);
    }

    public C170648qR(AnonymousClass1KB r9, AnonymousClass181 r10, C186529eL r11, AnonymousClass11P r12, AnonymousClass118 r13, C19830z4 r14, C18000vb r15, C18030ve r16, AnonymousClass18K r17, AnonymousClass1D9 r18, AnonymousClass1QO r19, C24481Km r20, C220418j r21, AnonymousClass10I r22) {
        super(r10, r13, r18, r21, r22, 14);
        this.A06 = r12;
        this.A0A = r16;
        this.A04 = r9;
        this.A07 = r13;
        this.A0B = r17;
        this.A09 = r15;
        this.A05 = r11;
        this.A08 = r14;
        this.A0D = r19;
        this.A0C = r20;
        this.A00 = 15;
        this.A01 = 4;
    }

    public static C171198rK A00(C170648qR r3) {
        C171198rK r2 = new C171198rK();
        int i = 0;
        if ("BR".equals(C63572tK.A01(r3.A05.A02.A0l()).A03)) {
            i = 4;
        }
        r2.A02 = C17880vN.A0n(i);
        r2.A05 = "2.24.24.78";
        r2.A01 = Boolean.valueOf(r3.A03);
        r2.A06 = r3.A02;
        return r2;
    }

    public static String A01(C170648qR r1) {
        String A0s = C17880vN.A0s(C63572tK.A01(r1.A05.A02.A0l()).A03, AnonymousClass9TN.A00);
        if (TextUtils.isEmpty(A0s)) {
            return CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        }
        return AnonymousClass000.A0y("_p", AnonymousClass000.A11(A0s));
    }

    public boolean A0C() {
        if (A05(A02(A0G)) || A05(A02(A0H))) {
            return false;
        }
        return true;
    }

    public boolean A0E(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        File A022 = A02(A0F);
        if (A022 != null) {
            C64062u9.A0R(A022);
        }
        File A023 = A02(A0G);
        File A024 = A02(A0H);
        if (A023 == null || A024 == null) {
            Log.e("BloksAssetManager/store/Could not prepare resource subdirectory");
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String A092 = C64062u9.A09(nextEntry.getName());
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(C64062u9.A0A(nextEntry.getName()));
                        String A1H = AnonymousClass001.A1H(".", A092, A10);
                        if ("png".equals(A092)) {
                            File A062 = C64062u9.A06(A023.getCanonicalPath(), nextEntry.getName());
                            if (A062 == null) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("BloksAssetManager/store/malicious zip file: ");
                                C17890vO.A19(A102, nextEntry.getName());
                                zipInputStream.close();
                                return false;
                            }
                            AnonymousClass8BV.A1H(A062.getParentFile());
                            fileOutputStream = C108945cZ.A19(A062);
                        } else if ("json".equals(A092)) {
                            fileOutputStream = C108945cZ.A19(AnonymousClass8BR.A0u(A024.getAbsolutePath(), A1H));
                        }
                        C64062u9.A00(zipInputStream, fileOutputStream);
                        fileOutputStream.close();
                    } else {
                        zipInputStream.close();
                        return true;
                    }
                } catch (Throwable th) {
                    zipInputStream.close();
                    throw th;
                }
            }
        } catch (IOException e) {
            Log.e("BloksAssetManager/store/Failed!", e);
            return false;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("downloadable");
        String str = File.separator;
        A10.append(str);
        String A0y = AnonymousClass000.A0y("bloks_pay", A10);
        A0F = A0y;
        A0H = AnonymousClass000.A0y("layout", AnonymousClass8BW.A0o(A0y, str));
    }

    public boolean A0D() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("2.24.24.78");
        A10.append(C63572tK.A01(this.A05.A02.A0l()).A03);
        A10.append(" ");
        return AnonymousClass000.A0y(this.A09.A05(), A10).equals(C17880vN.A0r(C17890vO.A0B(this.A08), "bloks_version"));
    }
}
