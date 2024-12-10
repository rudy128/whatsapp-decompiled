package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.status.playback.fragment.OpenLinkDialogFragment;
import java.util.Set;

/* renamed from: X.6vP  reason: invalid class name and case insensitive filesystem */
public abstract class C137406vP {
    public static final void A00(Context context, AnonymousClass1L8 r8, AnonymousClass89L r9, String str, String str2, Set set, boolean z, boolean z2) {
        OpenLinkDialogFragment A00;
        AnonymousClass1L8 r1 = r8;
        boolean A1K = C108975cc.A1K(r8);
        Context context2 = context;
        if (set != null) {
            A00 = C123646Vg.A00(str, str2, set);
        } else if (!z || z2) {
            r1.CGW(context2, Uri.parse(str), (AnonymousClass206) null, 0, A1K ? 1 : 0);
            return;
        } else {
            A00 = C124096Xa.A00(str, str2);
        }
        A00.A04 = r9;
        AnonymousClass3MZ.A0P(context).CMl(A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r0.A0r == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.AnonymousClass72Z.A03((X.AnonymousClass21W) r12) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C18030ve r10, X.AnonymousClass168 r11, X.AnonymousClass206 r12) {
        /*
            boolean r7 = X.C18070vi.A16(r11, r12)
            boolean r3 = r12 instanceof X.AnonymousClass21V
            boolean r2 = r12 instanceof X.AnonymousClass21Y
            r9 = 0
            if (r2 == 0) goto L_0x0015
            r0 = r12
            X.21W r0 = (X.AnonymousClass21W) r0
            boolean r0 = X.AnonymousClass72Z.A03(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            X.205 r0 = r12.A0v
            boolean r0 = r0.A02
            if (r3 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0023
            if (r2 == 0) goto L_0x0022
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            return r7
        L_0x0023:
            r6 = r12
            X.21V r6 = (X.AnonymousClass21V) r6
            X.2rc r5 = r6.A02
            if (r5 == 0) goto L_0x0074
            r8 = 0
            if (r10 == 0) goto L_0x0035
            r1 = 2917(0xb65, float:4.088E-42)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r8 = X.C18020vd.A01(r0, r10, r1)
        L_0x0035:
            int r1 = r12.A0u
            r0 = 3
            boolean r4 = X.AnonymousClass000.A1T(r1, r0)
            boolean r3 = r5.A0f
            X.5ti r0 = r11.A00(r5)
            if (r0 == 0) goto L_0x0049
            X.6ug r0 = r0.A0r
            r2 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            int r0 = r5.A07
            boolean r1 = X.AnonymousClass000.A1S(r0, r7)
            if (r4 == 0) goto L_0x005e
            if (r3 == 0) goto L_0x005e
            if (r2 == 0) goto L_0x005e
            boolean r0 = X.C39761tb.A0D(r8)
            if (r0 != 0) goto L_0x005e
        L_0x005c:
            r9 = 1
        L_0x005d:
            return r9
        L_0x005e:
            boolean r0 = r12 instanceof X.C438421d
            if (r0 == 0) goto L_0x0069
            boolean r0 = X.AnonymousClass25A.A0z(r6)
            if (r0 == 0) goto L_0x0069
            goto L_0x005c
        L_0x0069:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x005d
            java.io.File r0 = r5.A0G
            if (r0 == 0) goto L_0x005d
            goto L_0x005c
        L_0x0074:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137406vP.A01(X.0ve, X.168, X.206):boolean");
    }
}
