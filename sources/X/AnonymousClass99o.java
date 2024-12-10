package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.99o  reason: invalid class name */
public final class AnonymousClass99o extends C696237x {
    public String A00;
    public String A01;
    public final AnonymousClass1SY A02;
    public final boolean A03;
    public final boolean A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public String BLw(C191779nA r2) {
        C18070vi.A0d(r2, 0);
        return C18070vi.A0H(A00(r2, this).build());
    }

    public static final Uri.Builder A01(C191779nA r6, AnonymousClass99o r7) {
        byte[] bArr;
        byte[] bArr2;
        String str = r7.A01;
        if (str == null) {
            AnonymousClass1SY r1 = r7.A02;
            C17960vV.A07(r1);
            String str2 = r7.A01;
            str = null;
            if (!(str2 == null || r1 == null)) {
                if (r7.A04) {
                    bArr = new byte[32];
                    new Random().nextBytes(bArr);
                } else {
                    C19830z4 A0K = C17880vN.A0K(r1.A00);
                    String A0r = C17880vN.A0r(C17890vO.A0B(A0K), "upload_token_random_bytes");
                    if (TextUtils.isEmpty(A0r) || (bArr2 = Base64.decode(A0r, 3)) == null) {
                        bArr2 = new byte[32];
                        new SecureRandom().nextBytes(bArr2);
                        C17880vN.A1E(C19830z4.A00(A0K), "upload_token_random_bytes", Base64.encodeToString(bArr2, 3));
                    }
                    byte[] A1a = AnonymousClass8BT.A1a(str2);
                    if (A1a == null) {
                        bArr = (byte[]) bArr2.clone();
                    } else {
                        int length = bArr2.length;
                        int length2 = A1a.length;
                        bArr = new byte[(length + length2)];
                        System.arraycopy(bArr2, 0, bArr, 0, length);
                        System.arraycopy(A1a, 0, bArr, length, length2);
                    }
                }
                try {
                    str = AnonymousClass1EG.A0A(C108955ca.A14(C108945cZ.A1I().digest(bArr)));
                } catch (NoSuchAlgorithmException e) {
                    throw AnonymousClass8BR.A0v(e);
                }
            }
            r7.A01 = str;
        }
        C17960vV.A0F(AnonymousClass000.A1W(str), "Upload token has not been set");
        Uri.Builder A022 = r7.A02(r6);
        A022.appendQueryParameter("token", r7.A01);
        return A022;
    }

    public AnonymousClass99o(AnonymousClass1SY r2, Long l, Long l2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(str, str2, str3);
        this.A02 = r2;
        this.A04 = z;
        this.A03 = z2;
        this.A07 = str4;
        this.A05 = l;
        this.A06 = l2;
        this.A0A = z3;
        this.A09 = z4;
        this.A08 = z5;
        if (!z2) {
            this.A00 = this.A02;
        }
    }

    public static final Uri.Builder A00(C191779nA r3, AnonymousClass99o r4) {
        Uri.Builder A012 = A01(r3, r4);
        if (r4.A03) {
            A012.appendQueryParameter("stream", "1");
        }
        String str = r4.A07;
        if (str != null) {
            A012.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        Long l = r4.A05;
        if (l != null) {
            A012.appendQueryParameter("media_id", l.toString());
        }
        Long l2 = r4.A06;
        if (l2 != null) {
            A012.appendQueryParameter("media_id_upload", l2.toString());
        }
        if (r4.A0A) {
            A012.appendQueryParameter("streaming", "riff");
        }
        if (r4.A09) {
            A012.appendQueryParameter("server_transcode", "1");
        }
        if (r4.A08) {
            A012.appendQueryParameter("server_thumb_gen", "1");
        }
        return A012;
    }
}
