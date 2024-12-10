package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2NY  reason: invalid class name */
public final class AnonymousClass2NY extends C696237x {
    public final C18030ve A00;
    public final String A01;
    public final String A02;

    public String BLw(C191779nA r7) {
        Uri.Builder A022;
        Set set;
        String A012;
        C18070vi.A0d(r7, 0);
        String str = this.A01;
        if (str == null || str.length() == 0) {
            A022 = A02(r7);
        } else {
            Uri.Builder buildUpon = Uri.parse(new Uri.Builder().scheme("https").encodedAuthority(r7.A02).encodedPath(str).build().toString()).buildUpon();
            int i = 1;
            if (r7.A00 == 0) {
                i = 0;
            }
            A022 = buildUpon.appendQueryParameter("direct_ip", String.valueOf(i));
            String str2 = this.A02;
            if (!(str2 == null || str2.length() == 0)) {
                A022.appendQueryParameter("hash", str2);
            }
        }
        String str3 = r7.A03;
        if (str3 != null) {
            C18070vi.A0b(A022);
            C50462Un.A00(A022, "_nc_cat", str3);
        }
        String str4 = this.A02;
        if (str4 != null) {
            A022.appendQueryParameter("mode", str4);
        }
        C18030ve r3 = this.A00;
        if (r3 == null || (A012 = C18020vd.A01(C18040vf.A02, r3, 4836)) == null) {
            set = C25511Om.A00;
        } else {
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = ",";
            List A0S = AnonymousClass1YF.A0S(A012, A1Y, 0);
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                if (!Collections.unmodifiableSet(C60942or.A00).contains(A0v)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Mms4DownloadUrlGenerator/loadLowHitRateTypes ");
                    A10.append(A0v);
                    C17890vO.A19(A10, " is not a supported media type. ABProps LOW_CACHE_HIT_RATE_MEDIA_TYPES might have corrupted data");
                } else if (A0v != null) {
                    A13.add(A0v);
                }
            }
            set = C29431cG.A12(A13);
        }
        if (set.contains(this.A00)) {
            A022.appendQueryParameter("_nc_map", "whatsapp-nofna");
        }
        return C18070vi.A0H(A022.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r6 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2NY(X.C18030ve r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r1 = this;
            r1.<init>(r3, r4, r5)
            r1.A00 = r2
            r1.A01 = r6
            r1.A02 = r7
            if (r3 != 0) goto L_0x000e
            r0 = 0
            if (r6 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C17960vV.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2NY.<init>(X.0ve, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
