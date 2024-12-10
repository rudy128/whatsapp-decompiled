package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;

/* renamed from: X.1SR  reason: invalid class name */
public class AnonymousClass1SR {
    public static final AnonymousClass1SQ A07 = new AnonymousClass1SP(4, 0, 5, false);
    public SecureRandom A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass00H A03;
    public final C18030ve A04;
    public final AnonymousClass1NL A05;
    public final AnonymousClass1SO A06;

    public static AnonymousClass9j6 A01(C185849dF r3, InputStream inputStream, int i) {
        AnonymousClass8oL r2;
        try {
            r2 = new AnonymousClass8oL(r3, inputStream, i);
            do {
            } while (r2.read(new byte[DefaultCrypto.BUFFER_SIZE]) >= 0);
            AnonymousClass9j6 r0 = r2.A04;
            r2.close();
            return r0;
        } catch (IOException e) {
            Log.e("mediaupload/calculate-sidecar/ioexception", e);
            throw e;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static InputStream A02(C62492rU r3, AnonymousClass1SR r4, File file) {
        if (r3 instanceof AnonymousClass68R) {
            File file2 = r3.A02.A07;
            C17960vV.A07(file2);
            AnonymousClass2QQ r2 = new AnonymousClass2QQ((AnonymousClass68R) r3, r4, file2);
            r4.A05.A08(r2, (String) null, (String) null);
            return r2;
        }
        C17960vV.A07(file);
        FileInputStream A0J = C26511Sk.A0J(file);
        C26551So r1 = r3.A02.A06;
        if (C63972u0.A07(r1) || r1 == C26551So.A0k || r1 == C26551So.A0Y || r1 == C26551So.A0C || r1 == C26551So.A0F || r1 == C26551So.A0r || r1 == C26551So.A0D || r1 == C26551So.A0L || r1 == C26551So.A0a || r1 == C26551So.A0l || r1 == C26551So.A0b) {
            if (C18020vd.A05(C18040vf.A02, r4.A04, 11097)) {
                r4.A05.A07(file, "EXTERNAL_FILE_STICKER_THUMBNAIL_CRITICAL_EVENT");
            }
        } else {
            r4.A05.A08(A0J, (String) null, (String) null);
        }
        return new BufferedInputStream(A0J);
    }

    public C21331AiG A05(C72133Kt r5, InputStream inputStream) {
        AnonymousClass9HQ r3 = new AnonymousClass9HQ(inputStream, MessageDigest.getInstance("SHA-256"));
        return new C21331AiG(r3, new AnonymousClass9HQ(r5.BK5(r3), MessageDigest.getInstance("SHA-256")), (AnonymousClass9HQ) null, this);
    }

    public C185999dU A06(C22498BAf bAf, C62492rU r7, C184609bE r8) {
        AnonymousClass9HQ r1;
        C61382pa r0 = r8.A00;
        C17960vV.A07(r0);
        C72133Kt BRG = bAf.BRG(r0.A01);
        File file = r7.A02.A07;
        C17960vV.A07(file);
        C21331AiG A032 = A03(BRG, r7, file);
        try {
            byte[] bArr = new byte[16384];
            do {
                r1 = A032.A00;
            } while (r1.read(bArr) >= 0);
            C185999dU r02 = new C185999dU(new C190099kN(A032.A02.A00(), false), new C190099kN(r1.A00(), false), r8);
            A032.close();
            return r02;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1SR(AnonymousClass190 r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass1NL r4, AnonymousClass1SO r5, AnonymousClass00H r6) {
        this.A02 = r2;
        this.A04 = r3;
        this.A01 = r1;
        this.A03 = r6;
        this.A05 = r4;
        this.A06 = r5;
    }

    public static int A00(C63642tS r3) {
        AnonymousClass1BI r2 = r3.A01().A0v.A00;
        boolean z = true;
        if (r2 == null) {
            return 1;
        }
        if (r3.A03.size() <= 1) {
            z = false;
        }
        return A8F.A01(r2, z);
    }

    public C21331AiG A03(C72133Kt r4, C62492rU r5, File file) {
        if (!r5.A01()) {
            AnonymousClass9HQ r2 = new AnonymousClass9HQ(A02(r5, this, file), MessageDigest.getInstance("SHA-256"));
            return new C21331AiG(r2, r2, (AnonymousClass9HQ) null, this);
        }
        int[] iArr = r5.A02.A0J;
        if (iArr == null || iArr.length <= 0) {
            return A05(r4, A02(r5, this, file));
        }
        return A04(r4, file, iArr);
    }

    public C21331AiG A04(C72133Kt r8, File file, int[] iArr) {
        C17960vV.A07(file);
        FileInputStream A0J = C26511Sk.A0J(file);
        this.A05.A08(A0J, (String) null, (String) null);
        if (iArr.length == 4) {
            long j = (long) (iArr[0] + iArr[1] + iArr[2]);
            if (j != -1) {
                AnonymousClass9HQ r4 = new AnonymousClass9HQ(new BufferedInputStream(A0J), MessageDigest.getInstance("SHA-256"));
                AnonymousClass9HQ r3 = new AnonymousClass9HQ(new AnonymousClass6QY(r4, j), MessageDigest.getInstance("SHA-256"));
                return new C21331AiG(r4, new AnonymousClass9HQ(r8.BK5(new AnonymousClass6QZ(r3, r4)), MessageDigest.getInstance("SHA-256")), r3, this);
            }
        }
        return A05(r8, new BufferedInputStream(A0J));
    }

    public boolean A07(C26551So r3, File file, boolean z) {
        if (C63972u0.A03(r3)) {
            if (z || this.A06.A0F(file)) {
                return true;
            }
            return false;
        } else if (C63972u0.A09(r3)) {
            return this.A06.A0G(file);
        } else {
            return true;
        }
    }
}
