package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.7RD  reason: invalid class name */
public class AnonymousClass7RD implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7RD(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(AnonymousClass10I r1, Object obj, Object obj2, int i) {
        r1.CGF(new AnonymousClass7RD(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: X.61y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: X.62N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: X.61y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: X.61y} */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03fa, code lost:
        if (r4 == false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r9.A00(r0) != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06e6, code lost:
        com.whatsapp.updates.viewmodels.UpdatesViewModel.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0744, code lost:
        com.whatsapp.updates.viewmodels.UpdatesViewModel.A0A(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0747, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0956, code lost:
        r1.BhQ(2131890014);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x095c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x09d1, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09d5, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0115, code lost:
        if (r1 != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0a71, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0a74, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013a, code lost:
        r0.CC7(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0367;
                case 2: goto L_0x03d3;
                case 3: goto L_0x03e1;
                case 4: goto L_0x0449;
                case 5: goto L_0x04a0;
                case 6: goto L_0x086d;
                case 7: goto L_0x0353;
                case 8: goto L_0x09dd;
                case 9: goto L_0x04de;
                case 10: goto L_0x004e;
                case 11: goto L_0x0500;
                case 12: goto L_0x00f5;
                case 13: goto L_0x0123;
                case 14: goto L_0x013e;
                case 15: goto L_0x019e;
                case 16: goto L_0x0570;
                case 17: goto L_0x05cf;
                case 18: goto L_0x0225;
                case 19: goto L_0x001b;
                case 20: goto L_0x001b;
                case 21: goto L_0x05e4;
                case 22: goto L_0x0257;
                case 23: goto L_0x05f1;
                case 24: goto L_0x02b3;
                case 25: goto L_0x0602;
                case 26: goto L_0x0612;
                case 27: goto L_0x0646;
                case 28: goto L_0x06ea;
                case 29: goto L_0x070c;
                case 30: goto L_0x0748;
                case 31: goto L_0x0754;
                case 32: goto L_0x079d;
                case 33: goto L_0x07c1;
                case 34: goto L_0x07e0;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0313;
                case 38: goto L_0x07f6;
                case 39: goto L_0x0847;
                case 40: goto L_0x0856;
                case 41: goto L_0x0892;
                case 42: goto L_0x08bc;
                case 43: goto L_0x0a09;
                case 44: goto L_0x08ed;
                case 45: goto L_0x0a5c;
                case 46: goto L_0x0918;
                case 47: goto L_0x0330;
                case 48: goto L_0x0932;
                case 49: goto L_0x093f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.A34 r0 = (X.A34) r0
            java.lang.Object r2 = r2.A02
            X.3Lm r2 = (X.C72323Lm) r2
            r1 = 1
            X.8CU r0 = r0.A02
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001b
            r2.BG5()
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r5 = r2.A01
            X.7FQ r5 = (X.AnonymousClass7FQ) r5
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0028:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r3 = r4.next()
            X.7PZ r3 = (X.AnonymousClass7PZ) r3
            X.1BI r1 = r3.A01()
            java.lang.Object r2 = r5.A01
            com.whatsapp.storage.StorageUsageGalleryActivity r2 = (com.whatsapp.storage.StorageUsageGalleryActivity) r2
            X.1BI r0 = r2.A0L
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0028
            X.D3j r0 = r3.A00
            long r0 = r0.A0I
            r2.A03 = r0
            com.whatsapp.storage.StorageUsageGalleryActivity.A0Q(r2)
            return
        L_0x004e:
            java.lang.Object r3 = r2.A01
            X.1iM r3 = (X.C33151iM) r3
            java.lang.Object r2 = r2.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1iK r9 = r3.A01
            X.0ve r1 = r9.A00
            r0 = 9949(0x26dd, float:1.3942E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x001b
            X.1M9 r0 = r3.A00
            X.1E7 r2 = r0.A0F(r2)
            if (r2 == 0) goto L_0x0080
            boolean r1 = r2.A0C()
            r0 = 1
            if (r1 != r0) goto L_0x0080
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r2)
            if (r0 == 0) goto L_0x0080
            java.lang.Boolean r0 = r9.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            X.1i7 r7 = r9.A01
            X.0vl r6 = r7.A02
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r6)
            java.lang.String r5 = "last_refresh_ver"
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00c5
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r6)
            int r1 = X.C17890vO.A00(r0, r5)
            X.0ve r12 = r7.A00
            r0 = 10159(0x27af, float:1.4236E-41)
            int r0 = X.C18020vd.A00(r8, r12, r0)
            if (r1 != r0) goto L_0x00c5
            if (r2 == 0) goto L_0x001b
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r6)
            java.lang.String r0 = "last_update_ts"
            long r10 = X.C17890vO.A05(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10582(0x2956, float:1.4829E-41)
            int r0 = X.C18020vd.A00(r8, r12, r0)
            long r0 = (long) r0
            long r1 = r2.toMillis(r0)
            long r3 = r3 - r10
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
        L_0x00c5:
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r6)
            X.C18070vi.A0X(r0)
            android.content.SharedPreferences$Editor r3 = r0.edit()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "last_update_ts"
            r3.putLong(r2, r0)
            X.0ve r1 = r7.A00
            r0 = 10159(0x27af, float:1.4236E-41)
            int r0 = X.C18020vd.A00(r8, r1, r0)
            r3.putInt(r5, r0)
            r3.apply()
            X.10I r2 = r9.A04
            r0 = 11
            X.7RC r1 = X.AnonymousClass7RC.A00(r9, r0)
            java.lang.String r0 = "QualityBizIntentService/refresh_task"
            r2.CGL(r1, r0)
            return
        L_0x00f5:
            java.lang.Object r3 = r2.A01
            X.7Jl r3 = (X.C144987Jl) r3
            java.lang.Object r1 = r2.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Integer r2 = X.C144987Jl.A00(r1, r3)
            if (r2 == 0) goto L_0x001b
            X.62N r4 = new X.62N
            r4.<init>()
            X.1R3 r0 = r3.A00
            X.206 r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x0117
            X.205 r0 = r0.A0v
            boolean r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x0118
        L_0x0117:
            r0 = 1
        L_0x0118:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            r4.A01 = r2
            X.18K r0 = r3.A01
            goto L_0x013a
        L_0x0123:
            java.lang.Object r1 = r2.A01
            X.7Jl r1 = (X.C144987Jl) r1
            java.lang.Object r0 = r2.A02
            X.1BI r0 = (X.AnonymousClass1BI) r0
            java.lang.Integer r0 = X.C144987Jl.A00(r0, r1)
            if (r0 == 0) goto L_0x001b
            X.61y r4 = new X.61y
            r4.<init>()
            r4.A00 = r0
            X.18K r0 = r1.A01
        L_0x013a:
            r0.CC7(r4)
            return
        L_0x013e:
            java.lang.Object r0 = r2.A01
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r3 = r2.A02
            X.6xX r3 = (X.C138696xX) r3
            r6 = 1
            java.util.ArrayList r5 = X.C108955ca.A16(r3, r6)
            java.util.Iterator r4 = r0.iterator()
        L_0x014f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x017a
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1M9 r0 = r3.A05
            X.1E7 r1 = r0.A0G(r1)
            if (r1 == 0) goto L_0x014f
            boolean r0 = r1.A0F()
            if (r0 != r6) goto L_0x014f
            java.lang.String r0 = r1.A0K()
            if (r0 == 0) goto L_0x0176
            int r0 = r0.length()
            if (r0 != 0) goto L_0x014f
        L_0x0176:
            r5.add(r2)
            goto L_0x014f
        L_0x017a:
            java.util.Iterator r2 = r5.iterator()
        L_0x017e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r9 = r2.next()
            X.1E9 r9 = (X.AnonymousClass1E9) r9
            X.1NI r1 = r3.A0A
            X.118 r7 = r3.A09
            X.11S r4 = r3.A04
            X.1M9 r5 = r3.A05
            X.1Me r6 = r3.A07
            X.1MZ r8 = r3.A0B
            java.lang.String r0 = X.C88374Zl.A00(r4, r5, r6, r7, r8, r9)
            r1.A03(r9, r0)
            goto L_0x017e
        L_0x019e:
            java.lang.Object r6 = r2.A01
            X.7E0 r6 = (X.AnonymousClass7E0) r6
            java.lang.Object r0 = r2.A02
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x01ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r0 = r0.A0J
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x01ae
            r4.add(r1)
            goto L_0x01ae
        L_0x01c7:
            java.util.ArrayList r3 = X.C29351c6.A0D(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x01cf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01e2
            X.1BI r1 = X.C72453Mb.A0l(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r0)
            r3.add(r1)
            goto L_0x01cf
        L_0x01e2:
            java.lang.Object r5 = r6.A01
            X.6xX r5 = (X.C138696xX) r5
            java.util.Set r1 = r5.A0H
            monitor-enter(r1)
            r1.addAll(r3)     // Catch:{ all -> 0x0961 }
            java.lang.Long r0 = r5.A00     // Catch:{ all -> 0x0961 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x095d
            long r3 = android.os.SystemClock.uptimeMillis()
            long r0 = r0.longValue()
            long r3 = r3 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x095d
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A01
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x001b
            X.10I r4 = r5.A0E
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 2
            long r2 = r2.toMillis(r0)
            r1 = 17
            X.7RD r0 = new X.7RD
            r0.<init>(r5, r6, r1)
            r4.CGv(r0, r2)
            return
        L_0x0225:
            java.lang.Object r0 = r2.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r7 = r2.A02
            com.whatsapp.updates.ui.UpdatesFragment r7 = (com.whatsapp.updates.ui.UpdatesFragment) r7
            java.lang.Object r5 = X.C108975cc.A0Z(r0)
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x001b
            X.00H r0 = r7.A0U
            if (r0 == 0) goto L_0x09af
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r6 = r0.A0O()
            X.00H r0 = r7.A28()
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            boolean r0 = r0.A0A(r6)
            if (r0 != 0) goto L_0x0964
            java.lang.String r0 = "UpdatesFragment/maybeCalculateTilesSpec: Not calculating as user has no tiles"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0257:
            java.lang.Object r4 = r2.A01
            X.5lM r4 = (X.C112365lM) r4
            java.lang.Object r2 = r2.A02
            java.util.List r2 = (java.util.List) r2
            java.util.List r0 = X.C112365lM.A06(r4)
            java.util.Iterator r1 = r0.iterator()
            r5 = 0
        L_0x0268:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C121336Jg
            if (r0 != 0) goto L_0x027a
            int r5 = r5 + 1
            goto L_0x0268
        L_0x0279:
            r5 = -1
        L_0x027a:
            java.util.Iterator r3 = r2.iterator()
        L_0x027e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r2 = r3.next()
            X.6s7 r2 = (X.C135386s7) r2
            X.1M9 r1 = r4.A0V
            X.2Dk r0 = r2.A02
            X.1ch r0 = r0.A0M()
            X.1E7 r0 = r1.A0H(r0)
            X.5yh r1 = new X.5yh
            r1.<init>(r0)
            X.1E7 r0 = r2.A00
            r1.A01(r0)
            goto L_0x027e
        L_0x02a1:
            X.00H r0 = r4.A0d
            if (r0 == 0) goto L_0x001b
            X.1KB r2 = X.C108945cZ.A0a(r0)
            if (r2 == 0) goto L_0x001b
            r0 = 0
            X.7Qt r1 = new X.7Qt
            r1.<init>(r4, r5, r0)
            goto L_0x0a71
        L_0x02b3:
            java.lang.Object r3 = r2.A01
            X.6Js r3 = (X.C121456Js) r3
            java.lang.Object r10 = r2.A02
            X.206 r10 = (X.AnonymousClass206) r10
            java.util.List r0 = X.C42011xT.A0I
            r4 = 0
            r2 = 1
            X.6J8 r5 = r3.A04
            boolean r0 = r5 instanceof X.AnonymousClass6JB
            r7 = 0
            if (r0 == 0) goto L_0x001b
            X.6JB r5 = (X.AnonymousClass6JB) r5
            if (r5 == 0) goto L_0x001b
            X.205 r6 = r10.A0v
            X.206 r0 = r5.A03
            if (r0 == 0) goto L_0x0311
            X.205 r0 = r0.A0v
        L_0x02d2:
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x030e
            r9 = r10
        L_0x02d9:
            X.206 r8 = r5.A04
            X.205 r0 = r8.A0v
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x02e4
            r8 = r10
        L_0x02e4:
            X.206 r1 = r5.A02
            if (r1 == 0) goto L_0x02ea
            X.205 r7 = r1.A0v
        L_0x02ea:
            boolean r0 = X.C18070vi.A18(r6, r7)
            if (r0 != 0) goto L_0x02f1
            r10 = r1
        L_0x02f1:
            X.2sx r6 = r5.A01
            X.1E7 r7 = r5.A00
            java.lang.CharSequence r11 = r5.A05
            boolean r12 = r5.A06
            boolean r13 = r5.A07
            X.C18070vi.A0d(r6, r4)
            X.C18070vi.A0d(r7, r2)
            X.6JB r5 = new X.6JB
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            com.google.android.material.imageview.ShapeableImageView r0 = r3.A0A
            r3.A0E(r0, r5, r2, r4)
            r3.A04 = r5
            return
        L_0x030e:
            X.206 r9 = r5.A03
            goto L_0x02d9
        L_0x0311:
            r0 = r7
            goto L_0x02d2
        L_0x0313:
            java.lang.Object r1 = r2.A01
            X.1Sl r1 = (X.C26521Sl) r1
            java.lang.Object r3 = r2.A02
            java.io.File r3 = (java.io.File) r3
            X.17r r0 = r1.A00     // Catch:{ IOException -> 0x09fe }
            boolean r0 = r0.A0n(r3)     // Catch:{ IOException -> 0x09fe }
            if (r0 == 0) goto L_0x001b
            X.118 r0 = r1.A02     // Catch:{ IOException -> 0x09fe }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x09fe }
            android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ IOException -> 0x09fe }
            X.C26511Sk.A0O(r1, r0)     // Catch:{ IOException -> 0x09fe }
            goto L_0x09fd
        L_0x0330:
            java.lang.Object r3 = r2.A01
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r1 = r2.A02
            java.io.File r1 = (java.io.File) r1
            boolean r0 = X.C22781De.A03()
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)
            X.C64062u9.A0Q(r3)
            if (r1 == 0) goto L_0x001b
            boolean r0 = X.C22781De.A03()
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)
            X.C64062u9.A0Q(r1)
            return
        L_0x0353:
            java.lang.Object r0 = r2.A01
            com.whatsapp.textstatus.AddTextStatusActivity r0 = (com.whatsapp.textstatus.AddTextStatusActivity) r0
            java.lang.Object r1 = r2.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.whatsapp.WaImageButton r0 = r0.A02
            if (r0 != 0) goto L_0x0363
            java.lang.String r0 = "emojiButton"
            goto L_0x09d1
        L_0x0363:
            r0.setImageDrawable(r1)
            return
        L_0x0367:
            java.lang.Object r6 = r2.A01
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r6 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r6
            java.lang.Object r7 = r2.A02
            X.206 r7 = (X.AnonymousClass206) r7
            long r4 = X.AnonymousClass25A.A02(r7)
            long r1 = X.AnonymousClass25A.A03(r7)
            X.00H r0 = r6.A0B
            if (r0 == 0) goto L_0x03cf
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            X.206 r8 = r0.BWF(r7)
            X.00H r0 = r6.A0D
            if (r0 == 0) goto L_0x03cb
            X.1LU r9 = X.C108945cZ.A0h(r0)
            android.content.Context r3 = r6.A14()
            X.205 r7 = r7.A0v
            X.1BI r0 = r7.A00
            android.content.Intent r3 = X.AnonymousClass3MY.A06(r3, r9, r0)
            X.C18070vi.A0X(r3)
            java.lang.String r0 = "row_id"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "sort_id"
            r3.putExtra(r0, r1)
            if (r8 == 0) goto L_0x03b6
            java.lang.String r2 = "parent_row_id"
            long r0 = r8.A0x
            r3.putExtra(r2, r0)
            java.lang.String r2 = "parent_sort_id"
            long r0 = r8.A0y
            r3.putExtra(r2, r0)
        L_0x03b6:
            X.AnonymousClass4aU.A00(r3, r7)
            X.00H r0 = r6.A0C
            if (r0 == 0) goto L_0x03c7
            java.lang.Object r0 = r0.get()
            X.11P r0 = (X.AnonymousClass11P) r0
            X.C137086ut.A00(r3, r6, r0)
            return
        L_0x03c7:
            java.lang.String r0 = "time"
            goto L_0x09d1
        L_0x03cb:
            java.lang.String r0 = "waIntents"
            goto L_0x09d1
        L_0x03cf:
            java.lang.String r0 = "messageAssociationManager"
            goto L_0x09d1
        L_0x03d3:
            java.lang.Object r0 = r2.A01
            X.1W4 r0 = (X.AnonymousClass1W4) r0
            java.lang.Object r1 = r2.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.1Q6 r0 = r0.A02
            r0.A0B(r1)
            return
        L_0x03e1:
            java.lang.Object r5 = r2.A01
            com.whatsapp.support.DescribeProblemActivity r5 = (com.whatsapp.support.DescribeProblemActivity) r5
            java.lang.Object r0 = r2.A02
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.6nD r2 = r5.A0A
            android.widget.EditText r1 = r5.A02
            java.lang.String r1 = X.C108985cd.A0h(r1)
            androidx.appcompat.widget.AppCompatCheckBox r3 = r5.A03
            if (r3 == 0) goto L_0x03fc
            boolean r4 = r3.isChecked()
            r3 = 1
            if (r4 != 0) goto L_0x03fd
        L_0x03fc:
            r3 = 0
        L_0x03fd:
            r13 = 0
            if (r3 == 0) goto L_0x043f
            java.lang.String r8 = r5.A0N
            java.lang.String r9 = r5.A0O
            X.6Ug r3 = r5.A0F
            if (r3 == 0) goto L_0x040c
            java.util.ArrayList r13 = r3.A00()
        L_0x040c:
            r7 = 0
            X.1mQ r4 = r5.A0I
            X.00H r3 = r5.A0C
            long r16 = X.C108975cc.A07(r3)
            X.00H r3 = r5.A0C
            java.lang.Object r3 = r3.get()
            X.11Z r3 = (X.AnonymousClass11Z) r3
            long r18 = r3.A02()
            java.lang.String r11 = android.os.Environment.getExternalStorageState()
            X.00H r3 = r5.A0L
            java.lang.Object r3 = r3.get()
            X.1mP r3 = (X.C35541mP) r3
            android.util.Pair r6 = r3.A00()
            r20 = 1
            r12 = r7
            r14 = r7
            r15 = r7
            r22 = r20
            r10 = r7
            r21 = r20
            java.lang.String r13 = r4.A04(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22)
        L_0x043f:
            X.7II r3 = new X.7II
            r3.<init>(r0, r5)
            r0 = 1
            r2.A00(r3, r1, r13, r0)
            return
        L_0x0449:
            java.lang.Object r4 = r2.A01
            com.whatsapp.support.faq.SearchFAQActivity r4 = (com.whatsapp.support.faq.SearchFAQActivity) r4
            java.lang.Object r3 = r2.A02
            android.content.Intent r3 = (android.content.Intent) r3
            r2 = 0
            r9 = 0
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.showContactUs"
            boolean r0 = r3.hasExtra(r1)
            if (r0 == 0) goto L_0x0469
            boolean r0 = r3.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L_0x0469
            android.content.Intent r0 = com.whatsapp.support.faq.SearchFAQActivity.A0y(r9, r4)
            r4.startActivity(r0)
            return
        L_0x0469:
            java.lang.String r0 = r4.A09
            boolean r0 = X.C197289wS.A00(r0)
            if (r0 == 0) goto L_0x0487
            X.18O r0 = r4.A06
            X.18S r1 = X.AnonymousClass18O.A1X
            java.lang.String r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x0487
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0487
            X.18O r0 = r4.A06
            java.lang.String r9 = r0.A07(r1)
        L_0x0487:
            X.6oJ r3 = r4.A05
            if (r3 == 0) goto L_0x049c
            java.lang.String r7 = r4.A09
            java.lang.String r8 = r4.A0A
            java.lang.String r10 = r4.A0B
            java.util.ArrayList r11 = r4.A0C
            java.util.List r12 = r4.A0F
            r5 = 0
            r13 = 1
            r6 = r5
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x049c:
            java.lang.String r0 = "contactSupportManager"
            goto L_0x09d1
        L_0x04a0:
            java.lang.Object r6 = r2.A01
            com.whatsapp.support.faq.SearchFAQActivity r6 = (com.whatsapp.support.faq.SearchFAQActivity) r6
            java.lang.Object r5 = r2.A02
            X.184 r5 = (X.AnonymousClass184) r5
            r4 = 0
            r3 = 1
            X.C18070vi.A0d(r5, r3)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            int r0 = r6.A00
            X.C17880vN.A1T(r1, r0, r4)
            java.util.HashSet r0 = r6.A0E
            if (r0 == 0) goto L_0x04d8
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04c4:
            r1[r3] = r0
            r0 = 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "search-faq/post-event count:%d read:%d"
            X.C108955ca.A1W(r0, r2, r1)
            X.18K r0 = r6.A02
            if (r0 == 0) goto L_0x04da
            r0.CC7(r5)
            return
        L_0x04d8:
            r0 = 0
            goto L_0x04c4
        L_0x04da:
            java.lang.String r0 = "wamRuntime"
            goto L_0x09d1
        L_0x04de:
            java.lang.Object r0 = r2.A01
            int[] r0 = (int[]) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.textstatus.AddTextStatusActivity r1 = (com.whatsapp.textstatus.AddTextStatusActivity) r1
            android.content.res.Resources r3 = X.C108955ca.A0D(r1)
            X.1KW r2 = r1.A0D
            X.C18070vi.A0X(r2)
            X.5z5 r4 = new X.5z5
            r4.<init>(r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -1
            android.graphics.drawable.Drawable r0 = r2.A08(r3, r4, r5, r6)
            com.whatsapp.textstatus.AddTextStatusActivity.A03(r0, r1)
            return
        L_0x0500:
            java.lang.Object r3 = r2.A01
            X.6zw r3 = (X.C140096zw) r3
            X.1DT r0 = r3.A04
            java.lang.String r1 = ""
            r0.A0E(r1)
            X.1DT r0 = r3.A02
            java.lang.Integer r4 = X.AnonymousClass3MY.A0f()
            r0.A0E(r4)
            X.1DT r0 = r3.A03
            r0.A0E(r1)
            X.1DT r1 = r3.A05
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A0E(r0)
            X.1DT r0 = r3.A06
            r0.A0E(r4)
            java.lang.Object r4 = r2.A02
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r4 = (com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity) r4
            X.0vl r1 = r4.A0L
            X.73G r0 = X.C108945cZ.A10(r1)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x053a
            r0 = 0
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0r(r4, r0)
        L_0x053a:
            X.73G r0 = X.C108945cZ.A10(r1)
            java.util.HashMap r0 = r0.A0E
            java.util.Collection r1 = X.C108955ca.A17(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0565
            java.util.Iterator r2 = r1.iterator()
        L_0x054e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0565
            java.lang.Object r0 = r2.next()
            X.6tB r0 = (X.C136046tB) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r3.A08
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x054e
            return
        L_0x0565:
            java.util.List r1 = r4.A0K
            X.81V r0 = new X.81V
            r0.<init>(r3)
            X.C29401cD.A0N(r1, r0)
            return
        L_0x0570:
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r2.A02
            X.6xX r5 = (X.C138696xX) r5
            X.C18070vi.A0h(r0, r5)
            java.util.LinkedHashSet r4 = X.C17880vN.A14()
            java.util.Iterator r6 = r0.iterator()
        L_0x0583:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x05cb
            java.lang.Object r1 = r6.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1MZ r0 = r5.A0B
            X.1MW r0 = r0.A08
            java.util.HashSet r0 = r0.A0G(r1)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x059f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05b1
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x059f
            r3.add(r1)
            goto L_0x059f
        L_0x05b1:
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x05b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05c7
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L_0x05b9
        L_0x05c7:
            r4.addAll(r2)
            goto L_0x0583
        L_0x05cb:
            X.C138696xX.A00(r5, r4)
            return
        L_0x05cf:
            java.lang.Object r0 = r2.A01
            X.6xX r0 = (X.C138696xX) r0
            java.lang.Object r2 = r2.A02
            X.7E0 r2 = (X.AnonymousClass7E0) r2
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01
            r0.getAndSet(r1)
            X.AnonymousClass7E0.A00(r2)
            return
        L_0x05e4:
            java.lang.Object r1 = r2.A01
            X.10T r1 = (X.AnonymousClass10T) r1
            java.lang.Object r0 = r2.A02
            r1.registerObserver(r0)
            r0 = 1
            X.AnonymousClass6UA.A00 = r0
            return
        L_0x05f1:
            java.lang.Object r3 = r2.A01
            X.6Js r3 = (X.C121456Js) r3
            java.lang.Object r2 = r2.A02
            X.6J8 r2 = (X.AnonymousClass6J8) r2
            java.util.List r0 = X.C42011xT.A0I
            com.google.android.material.imageview.ShapeableImageView r1 = r3.A0A
            r0 = 1
            r3.A0E(r1, r2, r0, r0)
            return
        L_0x0602:
            java.lang.Object r3 = r2.A01
            X.6KC r3 = (X.AnonymousClass6KC) r3
            java.lang.Object r1 = r2.A02
            X.6U0 r1 = (X.AnonymousClass6U0) r1
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.updates.ui.UpdatesFragment r0 = r3.A02
            r0.A2G(r1)
            return
        L_0x0612:
            java.lang.Object r0 = r2.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r3 = r2.A02
            X.7K9 r3 = (X.AnonymousClass7K9) r3
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0622:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x062c
            A01(r2, r1)
            goto L_0x0622
        L_0x062c:
            java.util.Iterator r2 = r2.iterator()
        L_0x0630:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06e4
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.1Co r0 = (X.C22621Co) r0
            r0.A03(r1)
            goto L_0x0630
        L_0x0646:
            java.lang.Object r0 = r2.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r9 = r2.A02
            X.7K9 r9 = (X.AnonymousClass7K9) r9
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0656:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0660
            A01(r2, r1)
            goto L_0x0656
        L_0x0660:
            java.util.Set r1 = X.C29431cG.A11(r2)
            X.00H r8 = r9.A07
            java.lang.Object r0 = X.C18070vi.A0E(r8)
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            java.util.LinkedHashSet r0 = r0.A0e()
            r1.addAll(r0)
            int r0 = r1.size()
            long r4 = (long) r0
            r2 = 2
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x06a0
            X.00H r0 = r9.A09
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.1KB r7 = (X.AnonymousClass1KB) r7
            X.00H r0 = r9.A0E
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.0vb r6 = (X.C18000vb) r6
            r5 = 2131755041(0x7f100021, float:1.914095E38)
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            X.AnonymousClass3MX.A1S(r1, r0, r2)
            java.lang.String r0 = r6.A0K(r1, r5, r2)
            r7.A0H(r0, r4)
            return
        L_0x06a0:
            X.11P r0 = r9.A01
            long r3 = X.AnonymousClass11P.A01(r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x06aa:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x06de
            X.1BI r6 = X.C17880vN.A0Q(r7)
            X.00H r5 = r9.A0C
            java.lang.Object r1 = X.C18070vi.A0E(r5)
            X.1To r1 = (X.C26811To) r1
            r0 = 1
            java.util.Set r2 = r1.A06(r6, r0)
            X.C18070vi.A0X(r2)
            java.lang.Object r0 = X.C18070vi.A0E(r8)
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            java.lang.Long r1 = r0.A0c(r6, r3)
            java.lang.Object r0 = X.C18070vi.A0E(r5)
            X.1To r0 = (X.C26811To) r0
            if (r1 == 0) goto L_0x06da
            r0.A0R(r2)
            goto L_0x06aa
        L_0x06da:
            r0.A0Q(r2)
            goto L_0x06aa
        L_0x06de:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0A(r9)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r9.A03
            goto L_0x06e6
        L_0x06e4:
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r3.A03
        L_0x06e6:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0E(r0)
            return
        L_0x06ea:
            java.lang.Object r4 = r2.A01
            X.7K9 r4 = (X.AnonymousClass7K9) r4
            java.lang.Object r1 = r2.A02
            java.util.Collection r1 = (java.util.Collection) r1
            X.00H r0 = r4.A08
            java.lang.Object r3 = r0.get()
            X.1hl r3 = (X.C32791hl) r3
            java.util.ArrayList r2 = X.C29351c6.A0D(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0702:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0741
            A01(r2, r1)
            goto L_0x0702
        L_0x070c:
            java.lang.Object r4 = r2.A01
            X.7K9 r4 = (X.AnonymousClass7K9) r4
            java.lang.Object r0 = r2.A02
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x071c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0726
            A01(r2, r1)
            goto L_0x071c
        L_0x0726:
            java.util.Iterator r3 = r2.iterator()
        L_0x072a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0744
            X.1BI r2 = X.C17880vN.A0Q(r3)
            X.00H r0 = r4.A08
            java.lang.Object r1 = r0.get()
            X.1hl r1 = (X.C32791hl) r1
            r0 = 1
            r1.A02(r2, r0)
            goto L_0x072a
        L_0x0741:
            r3.A03(r2)
        L_0x0744:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0A(r4)
            return
        L_0x0748:
            java.lang.Object r1 = r2.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r1
            java.lang.Object r0 = r2.A02
            X.6nQ r0 = (X.C132706nQ) r0
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A09(r0, r1)
            return
        L_0x0754:
            java.lang.Object r3 = r2.A01
            X.71O r3 = (X.AnonymousClass71O) r3
            java.lang.Object r4 = r2.A02
            X.A0c r0 = X.C19945A0c.A00()
            X.BCv r0 = r0.A00
            byte[] r1 = r0.BLs()
            byte[] r0 = r0.generatePublicKey(r1)
            X.6fZ r2 = new X.6fZ
            r2.<init>(r0, r1)
            byte[] r1 = r2.A01
            r0 = 3
            java.lang.String r11 = android.util.Base64.encodeToString(r1, r0)
            X.6aX r0 = r3.A01
            X.10F r0 = r0.A00
            X.10E r0 = r0.A00
            X.0ve r8 = X.AnonymousClass10E.A8r(r0)
            X.181 r6 = X.C108965cb.A0H(r0)
            X.0z4 r7 = X.AnonymousClass3Ma.A0c(r0)
            X.00H r10 = X.C108945cZ.A14(r0)
            X.1fq r9 = X.C108955ca.A0X(r0)
            X.67S r5 = new X.67S
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = 2
            X.7I1 r0 = new X.7I1
            r0.<init>(r2, r4, r3, r1)
            r5.CBv(r0)
            return
        L_0x079d:
            java.lang.Object r4 = r2.A01
            X.1q1 r4 = (X.C37721q1) r4
            java.lang.Object r3 = r2.A02
            X.Bqy r3 = (X.C23841Bqy) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r2 = 0
            java.lang.String r1 = r4.A0A
            java.lang.Integer r0 = r4.A09
            X.C37721q1.A01(r3, r4, r0, r1)
            java.lang.Integer r0 = X.C17880vN.A0j()
            r3.A07 = r0
            X.18K r0 = r4.A02
            r0.CC7(r3)
            r4.A0A = r2
            r4.A09 = r2
            return
        L_0x07c1:
            java.lang.Object r3 = r2.A01
            X.1q1 r3 = (X.C37721q1) r3
            java.lang.Object r2 = r2.A02
            X.Bqy r2 = (X.C23841Bqy) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            java.lang.String r1 = r3.A0A
            java.lang.Integer r0 = r3.A09
            X.C37721q1.A01(r2, r3, r0, r1)
            java.lang.Integer r0 = X.C108955ca.A0e()
            r2.A07 = r0
            X.18K r0 = r3.A02
            r0.CC7(r2)
            return
        L_0x07e0:
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r2.A02
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            android.content.Intent r0 = r0.setData(r1)
            r3.sendBroadcast(r0)
            return
        L_0x07f6:
            java.lang.Object r1 = r2.A01
            X.2SA r1 = (X.AnonymousClass2SA) r1
            java.lang.Object r0 = r2.A02
            X.6jR r0 = (X.C130446jR) r0
            android.graphics.Bitmap r13 = r1.A00()
            X.1gV r3 = r0.A04
            X.206 r7 = r0.A01
            boolean r2 = r0.A06
            X.3M2 r9 = r0.A03
            android.view.View r6 = r0.A00
            java.lang.Object r8 = r0.A05
            X.2SA r4 = r0.A02
            X.36u r5 = r7.A0O()
            if (r13 != 0) goto L_0x0838
            if (r5 == 0) goto L_0x0838
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r7, r0)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0838
            r1 = 17
            X.7Qx r0 = new X.7Qx
            r0.<init>(r9, r6, r1, r2)
            X.C32021gV.A08(r3, r0)
            X.1gW r0 = r3.A03
            r10 = 5
            X.AkV r2 = new X.AkV
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.A00(r7, r2)
            return
        L_0x0838:
            r16 = 33
            X.AkZ r10 = new X.AkZ
            r11 = r4
            r12 = r9
            r14 = r6
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.C32021gV.A08(r3, r10)
            return
        L_0x0847:
            java.lang.Object r3 = r2.A01
            X.122 r3 = (X.AnonymousClass122) r3
            java.lang.Object r0 = r2.A02
            r1 = 1
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.BIL(r0, r1)
            return
        L_0x0856:
            java.lang.Object r4 = r2.A02
            X.2so r4 = (X.C63282so) r4
            monitor-enter(r4)
            java.util.Map r3 = r4.A05     // Catch:{ all -> 0x086a }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x086a }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ all -> 0x086a }
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()     // Catch:{ all -> 0x086a }
            r3.put(r1, r0)     // Catch:{ all -> 0x086a }
            monitor-exit(r4)     // Catch:{ all -> 0x086a }
            return
        L_0x086a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x086a }
            throw r0
        L_0x086d:
            java.lang.Object r3 = r2.A01
            X.4UI r3 = (X.AnonymousClass4UI) r3
            java.lang.Object r2 = r2.A02
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r1 = 1
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0883
            r3.A00(r1)
        L_0x0883:
            com.whatsapp.textstatus.AddTextStatusActivity.A0Q(r2)
            X.5kn r0 = r2.A08
            r1 = 0
            if (r0 != 0) goto L_0x088f
            X.AnonymousClass3MW.A1B()
            throw r1
        L_0x088f:
            r0.A00 = r1
            return
        L_0x0892:
            java.lang.Object r3 = r2.A01
            X.3DM r3 = (X.AnonymousClass3DM) r3
            java.lang.Object r0 = r2.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch:{ all -> 0x08ac }
            monitor-enter(r3)
            int r0 = r3.A00     // Catch:{ all -> 0x08a9 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x08a9 }
            X.AnonymousClass3DM.A00(r3)     // Catch:{ all -> 0x08a9 }
            monitor-exit(r3)     // Catch:{ all -> 0x08a9 }
            return
        L_0x08a9:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08a9 }
            throw r1
        L_0x08ac:
            r1 = move-exception
            monitor-enter(r3)
            int r0 = r3.A00     // Catch:{ all -> 0x08b9 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x08b9 }
            X.AnonymousClass3DM.A00(r3)     // Catch:{ all -> 0x08b9 }
        L_0x08b7:
            monitor-exit(r3)     // Catch:{ all -> 0x08b9 }
            goto L_0x08bb
        L_0x08b9:
            r1 = move-exception
            goto L_0x08b7
        L_0x08bb:
            throw r1
        L_0x08bc:
            java.lang.Object r4 = r2.A01
            X.7B9 r4 = (X.AnonymousClass7B9) r4
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x08cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08e3
            java.lang.Object r0 = r2.next()
            X.D3K r0 = (X.D3K) r0
            java.lang.CharSequence r1 = r0.A00
            X.CqQ r0 = new X.CqQ
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x08cc
        L_0x08e3:
            X.6Mr r0 = r4.A00
            X.6Mw r0 = r0.A0a
            com.facebook.android.exoplayer2.ui.SubtitleView r0 = r0.A07
            r0.Bqd(r3)
            return
        L_0x08ed:
            java.lang.Object r0 = r2.A01
            X.7OH r0 = (X.AnonymousClass7OH) r0
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            com.whatsapp.conversation.waveforms.VoiceVisualizer r3 = r0.A0H
            java.util.List r0 = r3.A0E
            boolean r0 = r0.isEmpty()
            X.C17960vV.A0C(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0904:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0914
            java.lang.Object r1 = r2.next()
            java.util.LinkedList r0 = r3.A0C
            r0.add(r1)
            goto L_0x0904
        L_0x0914:
            r3.invalidate()
            return
        L_0x0918:
            java.lang.Object r3 = r2.A01
            X.74M r3 = (X.AnonymousClass74M) r3
            java.lang.Object r0 = r2.A02
            java.io.File r0 = (java.io.File) r0
            X.6tp r4 = r3.A1A
            long r5 = r0.length()
            long r1 = r3.A05
            int r0 = (int) r1
            long r8 = (long) r0
            X.70F r0 = r3.A0w
            boolean r7 = r0.A0B
            r4.A02(r5, r7, r8)
            return
        L_0x0932:
            java.lang.Object r3 = r2.A01
            X.74M r3 = (X.AnonymousClass74M) r3
            java.lang.Object r1 = r2.A02
            X.1FR r1 = (X.AnonymousClass1FR) r1
            r0 = 0
            r3.A0Z(r0, r0)
            goto L_0x0956
        L_0x093f:
            java.lang.Object r3 = r2.A01
            X.74M r3 = (X.AnonymousClass74M) r3
            java.lang.Object r1 = r2.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0 = 4
            X.AnonymousClass74M.A0D(r3, r0)
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeRecording/resume failed"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            r3.A0Z(r0, r0)
            X.1FR r1 = r3.A0e
        L_0x0956:
            r0 = 2131890014(0x7f120f5e, float:1.9414708E38)
            r1.BhQ(r0)
            return
        L_0x095d:
            X.AnonymousClass7E0.A00(r6)
            return
        L_0x0961:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0964:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UpdatesFragment/maybeCalculateTilesSpec calculating spec hasNewsletter: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", Orientation: "
            r1.append(r0)
            int r0 = r7.A00
            X.C17900vP.A0o(r1, r0)
            X.00H r0 = r7.A0y
            if (r0 == 0) goto L_0x09ac
            java.lang.Object r4 = r0.get()
            X.Cq2 r4 = (X.C25988Cq2) r4
            int r3 = r7.A00
            X.00H r0 = r7.A28()
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            int r1 = r0.A00(r6)
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            X.00H r0 = r7.A28()
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            int r1 = r0.A00(r6)
            r0 = 5
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r4.A02(r5, r3, r2, r0)
            return
        L_0x09ac:
            java.lang.String r0 = "tilesSpecLazy"
            goto L_0x09d1
        L_0x09af:
            java.lang.String r0 = "chatsCache"
            goto L_0x09d1
        L_0x09b2:
            X.1KW r3 = r8.A0D
            X.C18070vi.A0W(r3)
            X.6d3 r2 = r8.A0K
            X.6d2 r1 = r8.A0J
            X.5kn r0 = new X.5kn
            r0.<init>(r3, r1, r2, r5)
            r8.A08 = r0
            r1 = 1
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r8, r1, r6)
            r7.setLayoutManager(r0)
            X.5kn r0 = r8.A08
            if (r0 != 0) goto L_0x09d6
            java.lang.String r0 = "adapter"
        L_0x09d1:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x09d6:
            r7.setAdapter(r0)
            r7.setVisibility(r6)
            goto L_0x09f6
        L_0x09dd:
            java.lang.Object r8 = r2.A01
            com.whatsapp.textstatus.AddTextStatusActivity r8 = (com.whatsapp.textstatus.AddTextStatusActivity) r8
            java.lang.Object r7 = r2.A02
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r6 = 0
            java.util.List r5 = r8.A0L
            boolean r0 = r5.isEmpty()
            r4 = 8
            if (r0 == 0) goto L_0x09b2
            r0 = 2131435919(0x7f0b218f, float:1.8493694E38)
            X.AnonymousClass3MX.A1H(r8, r0, r4)
        L_0x09f6:
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            X.AnonymousClass3MX.A1H(r8, r0, r4)
            return
        L_0x09fd:
            return
        L_0x09fe:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaFileUtils/broadcastScanMediaIntent/unable to scan file "
            X.C108995ce.A1J(r3, r0, r1, r2)
            return
        L_0x0a09:
            java.lang.Object r8 = r2.A01
            X.5ks r8 = (X.C112065ks) r8
            java.lang.Object r9 = r2.A02
            X.73C r9 = (X.AnonymousClass73C) r9
            byte[] r1 = r9.A0B
            r7 = 0
            if (r1 == 0) goto L_0x0a50
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0a50
            android.graphics.Bitmap r6 = X.C72473Md.A0E(r1)
        L_0x0a1d:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r5 = r8.A02
            r5.A0R = r9
            java.util.List r4 = r5.A0Z
            r4.clear()
            java.util.ArrayList r3 = r5.A0Y
            r3.clear()
            java.util.List r0 = r9.A06
            if (r0 == 0) goto L_0x0a52
            java.util.Iterator r2 = r0.iterator()
        L_0x0a33:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a52
            java.lang.Object r1 = r2.next()
            X.6ib r1 = (X.C129926ib) r1
            java.lang.String r0 = r1.A02
            r3.add(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 == 0) goto L_0x0a4c
            r4.add(r0)
            goto L_0x0a33
        L_0x0a4c:
            r4.add(r7)
            goto L_0x0a33
        L_0x0a50:
            r6 = r7
            goto L_0x0a1d
        L_0x0a52:
            X.1KB r2 = r5.A05
            r0 = 29
            X.7RO r1 = new X.7RO
            r1.<init>(r8, r9, r6, r0)
            goto L_0x0a71
        L_0x0a5c:
            java.lang.Object r4 = r2.A01
            X.7OH r4 = (X.AnonymousClass7OH) r4
            java.lang.Object r0 = r2.A02
            java.io.File r0 = (java.io.File) r0
            java.util.ArrayList r3 = X.AnonymousClass70j.A01(r0)
            X.1KB r2 = r4.A0G
            r0 = 44
            X.7RD r1 = new X.7RD
            r1.<init>(r4, r3, r0)
        L_0x0a71:
            r2.A0J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RD.run():void");
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C29691ci) it.next()).A08());
    }
}
