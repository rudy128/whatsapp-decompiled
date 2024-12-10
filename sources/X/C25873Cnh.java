package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cnh  reason: case insensitive filesystem */
public abstract class C25873Cnh {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C24919CPq A00(X.C53 r4) {
        /*
            java.lang.String r0 = "audio/"
            java.util.ArrayList r4 = A02(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            java.util.Iterator r3 = r4.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r2 = r3.next()
            X.CPq r2 = (X.C24919CPq) r2
            java.lang.String r1 = r2.A02
            X.Bzp r0 = X.C24354Bzp.CODEC_AUDIO_AAC
            java.lang.String r0 = r0.value
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0034
            X.Bzp r0 = X.C24354Bzp.CODEC_AUDIO_MP3
            java.lang.String r0 = r0.value
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0012
        L_0x0034:
            int r1 = r4.size()
            r0 = 1
            if (r1 <= r0) goto L_0x003e
            A01(r4)
        L_0x003e:
            return r2
        L_0x003f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported audio codec. Contained "
            r1.append(r0)
            java.lang.String r0 = A01(r4)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.BW1 r0 = new X.BW1
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25873Cnh.A00(X.C53):X.CPq");
    }

    public static String A01(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A13.add(((C24919CPq) it.next()).A02);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A15("", A10, list);
        A10.append(" tracks: ");
        Iterator it2 = A13.iterator();
        StringBuilder A102 = AnonymousClass000.A10();
        if (it2.hasNext()) {
            while (true) {
                A102.append(it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                A102.append(", ");
            }
        } else {
            A102.append("null, input is empty");
        }
        AnonymousClass8BS.A1D(A102, A10);
        return A10.toString();
    }

    public static ArrayList A02(C53 c53, String str) {
        ArrayList A13 = AnonymousClass000.A13();
        int trackCount = c53.A00.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = c53.A00.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string != null && string.startsWith(str)) {
                A13.add(new C24919CPq(trackFormat, string, i));
            }
        }
        return A13;
    }
}
