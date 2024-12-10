package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2jG  reason: invalid class name and case insensitive filesystem */
public final class C57552jG {
    public final AnonymousClass1M9 A00;
    public final C27191Vc A01;
    public final C33251iW A02;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.24N, X.206] */
    public final void A00(Context context, C29681ch r18, String str, String str2, HashMap hashMap) {
        byte[] bArr;
        C29681ch r8 = r18;
        String str3 = str2;
        C18070vi.A0f(r8, 1, str3);
        Bitmap A04 = this.A01.A04(context, this.A00.A0H(r8), "NewsletterAdminInvitationsUtils.getThumbnailBytes", 0.0f, 96, false);
        if (A04 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            A04.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } else {
            bArr = null;
        }
        C33251iW r10 = this.A02;
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            AnonymousClass205 A012 = r10.A0x.A01((AnonymousClass1BI) A16.getKey(), true);
            long A013 = AnonymousClass11P.A01(r10.A0K);
            long longValue = ((Number) A16.getValue()).longValue();
            ? r1 = new AnonymousClass206(A012, 94, A013);
            r1.A01 = r8;
            r1.A03 = str;
            r1.A00 = longValue;
            r1.A02 = str3;
            r1.A02 = 1;
            if (bArr != null) {
                r1.A0p(bArr);
            }
            r10.A0b(r1);
            r10.A0U.BBM(r1);
        }
    }

    public C57552jG(C33251iW r1, AnonymousClass1M9 r2, C27191Vc r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }
}
