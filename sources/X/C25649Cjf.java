package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.Cjf  reason: case insensitive filesystem */
public class C25649Cjf {
    public final String A00;
    public final Map A01;

    public void A00(C24473C5o c5o) {
        if (c5o != null) {
            this.A01.put(c5o.A01(), c5o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r5.A04 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r3 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r3.A01 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        r1 = new X.C22923BVl(r9, r2, "file", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (r5 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (r5.A04 == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
        if (r3 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r3.A01 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        r3 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        r4 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25649Cjf(int r11) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = X.C20055A5d.A02(r11)
            if (r0 == 0) goto L_0x009d
            r10.A00 = r0
            java.util.HashMap r8 = X.C17880vN.A11()
            r10.A01 = r8
            java.util.Map r7 = java.util.Collections.emptyMap()
            java.lang.String r0 = "user_scope"
            java.lang.Object r6 = r7.remove(r0)
            X.BVi r6 = (X.C22920BVi) r6
            java.lang.String r0 = "max_size"
            java.lang.Object r5 = r7.remove(r0)
            X.8Qu r5 = (X.AnonymousClass8Qu) r5
            r4 = 0
            if (r5 != 0) goto L_0x0036
            X.8Qu r5 = X.C20055A5d.A00(r11)
            if (r5 == 0) goto L_0x009b
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0036
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x009b
        L_0x0036:
            java.lang.String r0 = "stale_removal"
            java.lang.Object r3 = r7.remove(r0)
            X.BVh r3 = (X.C22919BVh) r3
            if (r3 != 0) goto L_0x004a
            X.BVh r3 = X.C20055A5d.A01(r11)
            if (r3 == 0) goto L_0x0099
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0099
        L_0x004a:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0058
        L_0x0050:
            if (r3 == 0) goto L_0x007c
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x007c
            if (r5 == 0) goto L_0x005d
        L_0x0058:
            boolean r0 = r5.A04
            r9 = r5
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r9 = r4
        L_0x005e:
            if (r3 == 0) goto L_0x0065
            boolean r0 = r3.A01
            r2 = r3
            if (r0 != 0) goto L_0x0066
        L_0x0065:
            r2 = r4
        L_0x0066:
            java.lang.String r0 = "file"
            X.BVl r1 = new X.BVl
            r1.<init>(r9, r2, r0, r4)
            if (r5 == 0) goto L_0x0074
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0074
            r5 = r4
        L_0x0074:
            if (r3 == 0) goto L_0x0097
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0097
        L_0x007a:
            r3 = r4
            r4 = r1
        L_0x007c:
            java.lang.String r0 = "version"
            java.lang.Object r0 = r7.remove(r0)
            X.C5o r0 = (X.C24473C5o) r0
            r10.A00(r6)
            r10.A00(r4)
            r10.A00(r5)
            r10.A00(r3)
            r10.A00(r0)
            r8.putAll(r7)
            return
        L_0x0097:
            r4 = r3
            goto L_0x007a
        L_0x0099:
            r3 = r4
            goto L_0x004a
        L_0x009b:
            r5 = r4
            goto L_0x0036
        L_0x009d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown storage config: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25649Cjf.<init>(int):void");
    }

    public C25649Cjf(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            this.A01 = C17880vN.A11();
            return;
        }
        throw AnonymousClass000.A0k("feature should always be set");
    }
}
