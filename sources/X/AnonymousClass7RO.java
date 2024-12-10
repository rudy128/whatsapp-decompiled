package X;

import java.io.File;

/* renamed from: X.7RO  reason: invalid class name */
public class AnonymousClass7RO implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public static Long A00(File file) {
        return Long.valueOf((C64062u9.A01((C42621yT) null, file) / 10000000) * 10000000);
    }

    public AnonymousClass7RO(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static void A01(AnonymousClass1KB r1, Object obj, Object obj2, Object obj3, int i) {
        r1.A0J(new AnonymousClass7RO(obj, obj2, obj3, i));
    }

    public static void A02(AnonymousClass10I r1, Object obj, Object obj2, Object obj3, int i) {
        r1.CGF(new AnonymousClass7RO(obj, obj2, obj3, i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0a90, code lost:
        X.AnonymousClass7RN.A00(r4, r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0a93, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0c71, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0c75, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0cfb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0cff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0da8, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0dab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x05d1;
                case 1: goto L_0x05fb;
                case 2: goto L_0x0aa5;
                case 3: goto L_0x0628;
                case 4: goto L_0x063b;
                case 5: goto L_0x0661;
                case 6: goto L_0x0bd4;
                case 7: goto L_0x0671;
                case 8: goto L_0x0688;
                case 9: goto L_0x006a;
                case 10: goto L_0x0c1b;
                case 11: goto L_0x0128;
                case 12: goto L_0x0326;
                case 13: goto L_0x0017;
                case 14: goto L_0x0c47;
                case 15: goto L_0x0c76;
                case 16: goto L_0x0393;
                case 17: goto L_0x06b1;
                case 18: goto L_0x0757;
                case 19: goto L_0x03f1;
                case 20: goto L_0x0757;
                case 21: goto L_0x076a;
                case 22: goto L_0x079a;
                case 23: goto L_0x07ae;
                case 24: goto L_0x0453;
                case 25: goto L_0x0487;
                case 26: goto L_0x04b2;
                case 27: goto L_0x07d4;
                case 28: goto L_0x07fc;
                case 29: goto L_0x080f;
                case 30: goto L_0x083f;
                case 31: goto L_0x0501;
                case 32: goto L_0x0515;
                case 33: goto L_0x0859;
                case 34: goto L_0x0869;
                case 35: goto L_0x052c;
                case 36: goto L_0x0901;
                case 37: goto L_0x091c;
                case 38: goto L_0x0930;
                case 39: goto L_0x0940;
                case 40: goto L_0x099a;
                case 41: goto L_0x09b5;
                case 42: goto L_0x09c5;
                case 43: goto L_0x09dd;
                case 44: goto L_0x09fd;
                case 45: goto L_0x0a0d;
                case 46: goto L_0x0a25;
                case 47: goto L_0x0561;
                case 48: goto L_0x0a59;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r5.A02
            X.6nu r2 = (X.C132946nu) r2
            java.lang.Object r1 = r5.A01
            X.705 r1 = (X.AnonymousClass705) r1
            java.lang.Object r0 = r5.A03
            X.732 r0 = (X.AnonymousClass732) r0
            r2.A00(r0, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r1 = r5.A01
            com.whatsapp.storage.StorageUsageActivity r1 = (com.whatsapp.storage.StorageUsageActivity) r1
            java.lang.Object r6 = r5.A02
            java.lang.Object r5 = r5.A03
            X.D3j r5 = (X.D3j) r5
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            X.5lJ r4 = r1.A0H
            if (r4 != 0) goto L_0x002d
            java.lang.String r0 = "storageUsageAdapter"
            goto L_0x0c71
        L_0x002d:
            java.util.List r0 = r4.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0033:
            boolean r0 = r2.hasNext()
            r3 = -1
            if (r0 == 0) goto L_0x0016
            java.lang.Object r1 = r2.next()
            X.7PZ r1 = (X.AnonymousClass7PZ) r1
            X.1BI r0 = r1.A01()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0033
            java.util.List r0 = r4.A05
            int r2 = r0.indexOf(r1)
            if (r2 == r3) goto L_0x0016
            java.util.List r0 = r4.A05
            java.lang.Object r1 = r0.get(r2)
            X.7PZ r1 = (X.AnonymousClass7PZ) r1
            r1.A00 = r5
            java.util.List r0 = r4.A05
            r0.set(r2, r1)
            java.util.List r0 = r4.A05
            java.util.Collections.sort(r0)
            r4.notifyDataSetChanged()
            return
        L_0x006a:
            java.lang.Object r3 = r5.A01
            X.4rF r3 = (X.C98494rF) r3
            java.lang.Object r4 = r5.A02
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r4 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r4
            java.lang.Object r8 = r5.A03
            java.util.List r8 = (java.util.List) r8
            r6 = 0
            X.C18070vi.A0e(r3, r6, r8)
            java.lang.Object r1 = r3.element
            X.725 r1 = (X.AnonymousClass725) r1
            boolean r0 = r1.A0U
            if (r0 != 0) goto L_0x00b0
            java.util.List r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b0
            java.util.List r0 = r1.A07
            java.lang.Object r1 = r0.get(r6)
            X.77d r1 = (X.C1418377d) r1
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x00b0
            int r0 = r1.A01
            r5 = 1
            if (r0 == r5) goto L_0x00b0
            X.1SB r2 = r4.A08
            if (r2 == 0) goto L_0x0a9c
            java.lang.Object r0 = r3.element
            X.725 r0 = (X.AnonymousClass725) r0
            java.lang.String r1 = r0.A0H
            r0 = 0
            X.725 r0 = r2.A06(r0, r1, r6, r5)
            if (r0 != 0) goto L_0x00ae
            java.lang.Object r0 = r3.element
        L_0x00ae:
            r3.element = r0
        L_0x00b0:
            X.1SB r2 = r4.A08
            if (r2 == 0) goto L_0x0a9c
            java.lang.Object r1 = r3.element
            X.725 r1 = (X.AnonymousClass725) r1
            boolean r0 = r1.A0W
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "StickerRepository/retrieveThirdPartyTrayIconFile attempted to get tray icon of non-third party pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00c1:
            java.lang.String r0 = "StickerStorePackPreviewActivity/onActivityResult tray icon is null"
        L_0x00c3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r2 = r4.A05
            r0 = 28
            X.7RI r1 = X.AnonymousClass7RI.A00(r4, r0)
            goto L_0x0da8
        L_0x00d0:
            X.00H r0 = r2.A0M
            java.lang.Object r0 = r0.get()
            X.6pr r0 = (X.C134006pr) r0
            java.io.File r2 = r0.A01(r1)
            if (r2 == 0) goto L_0x00c1
            X.00H r0 = r4.A0N
            if (r0 == 0) goto L_0x0a98
            java.lang.Object r1 = r0.get()
            X.71v r1 = (X.C1405271v) r1
            java.lang.Object r0 = r3.element
            X.725 r0 = (X.AnonymousClass725) r0
            java.io.File r6 = r1.A02(r0, r2)
            if (r6 != 0) goto L_0x00f5
            java.lang.String r0 = "StickerStorePackPreviewActivity/onActivityResult stickerPackFileInternal is null"
            goto L_0x00c3
        L_0x00f5:
            X.00H r0 = r4.A0N
            if (r0 == 0) goto L_0x0a98
            java.lang.Object r1 = r0.get()
            X.71v r1 = (X.C1405271v) r1
            java.lang.Object r0 = r3.element
            X.725 r0 = (X.AnonymousClass725) r0
            byte[] r9 = r1.A03(r0)
            if (r9 != 0) goto L_0x010c
            java.lang.String r0 = "StickerStorePackPreviewActivity/onActivityResult thumbnail is null"
            goto L_0x00c3
        L_0x010c:
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r4.A0P
            if (r0 == 0) goto L_0x0a94
            java.lang.Object r4 = r0.get()
            X.1iW r4 = (X.C33251iW) r4
            java.lang.Object r5 = r3.element
            X.725 r5 = (X.AnonymousClass725) r5
            java.lang.String r7 = r2.getName()
            r4.A0m(r5, r6, r7, r8, r9)
            return
        L_0x0128:
            java.lang.Object r3 = r5.A01
            X.6kS r3 = (X.C131066kS) r3
            java.lang.Object r2 = r5.A02
            X.64Q r2 = (X.AnonymousClass64Q) r2
            java.lang.Object r4 = r5.A03
            X.1Be r4 = (X.AnonymousClass1Be) r4
            X.11S r0 = r3.A01
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0016
            X.1Cd r0 = r3.A07
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0016
            X.1CM r0 = r3.A0C
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0016
            r18 = 10000000(0x989680, double:4.9406565E-317)
            X.00H r5 = r3.A0E
            java.lang.Object r0 = r5.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r0 = r0.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0L = r0
            java.lang.Object r0 = r5.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r0 = r0.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0M = r0
            long r0 = X.C108975cc.A07(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            java.lang.Object r0 = r5.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r0 = r0.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            X.1Ro r0 = r3.A06
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            r6 = 0
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r7.<init>(r6)
            X.7FR r5 = new X.7FR
            r5.<init>(r2, r3, r7)
            X.72h r1 = r3.A08
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A07
            r0.add(r5)
            r0 = 0
            X.C1406372h.A01(r0, r1, r7)
            X.118 r0 = r3.A05
            android.content.Context r1 = r0.A00
            java.io.File r0 = r1.getFilesDir()
            java.io.File r0 = r0.getParentFile()
            java.lang.Long r0 = A00(r0)
            r2.A0C = r0
            java.io.File r0 = r1.getFilesDir()
            java.lang.Long r0 = A00(r0)
            r2.A0B = r0
            java.lang.String r0 = "ignore"
            java.io.File r0 = r1.getDatabasePath(r0)
            java.io.File r0 = r0.getParentFile()
            java.lang.Long r0 = A00(r0)
            r2.A0A = r0
            java.io.File r0 = r1.getCacheDir()
            java.lang.Long r0 = A00(r0)
            r2.A09 = r0
            X.1L7 r1 = r3.A04
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            java.lang.Long r0 = A00(r0)
            r2.A08 = r0
            X.17r r0 = r3.A00
            java.io.File r0 = r0.A0J()
            java.lang.Long r0 = A00(r0)
            r2.A05 = r0
            java.io.File r0 = r1.A04()
            java.lang.Long r0 = A00(r0)
            r2.A04 = r0
            java.io.File r0 = r1.A03()
            java.lang.Long r0 = A00(r0)
            r2.A03 = r0
            X.2u4 r5 = r3.A02
            java.util.List r0 = r5.A0F()
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x021e
            r6 = 1
        L_0x021e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A00 = r0
            if (r1 != 0) goto L_0x024c
            java.lang.Long r0 = r2.A0B
            r2.A0J = r0
            java.lang.Long r0 = r2.A09
            r2.A0H = r0
            java.lang.Long r0 = r2.A0A
            r2.A0I = r0
            java.lang.Long r0 = r2.A0C
            r2.A0K = r0
            java.lang.Long r0 = r2.A01
            r2.A0D = r0
            java.lang.Long r0 = r2.A03
            r2.A0E = r0
            java.lang.Long r0 = r2.A05
            r2.A0G = r0
            java.lang.Long r0 = r2.A04
            r2.A0F = r0
        L_0x0246:
            X.18K r0 = r3.A0A
            r0.CC8(r2, r4)
            return
        L_0x024c:
            java.util.List r1 = r5.A0F()
            java.lang.Long r0 = r2.A09
            long r16 = r0.longValue()
            java.lang.Long r0 = r2.A0B
            long r14 = r0.longValue()
            java.lang.Long r0 = r2.A0A
            long r12 = r0.longValue()
            java.lang.Long r0 = r2.A01
            long r10 = r0.longValue()
            java.util.Iterator r9 = r1.iterator()
        L_0x026c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r6 = r9.next()
            X.2rb r6 = (X.C62562rb) r6
            X.A8T r8 = r3.A03
            java.io.File r1 = r8.A0A(r6)
            if (r1 == 0) goto L_0x0286
            r0 = 0
            long r0 = X.C64062u9.A01(r0, r1)
            long r14 = r14 + r0
        L_0x0286:
            java.io.File r1 = r8.A0C(r6)
            if (r1 == 0) goto L_0x0292
            r0 = 0
            long r0 = X.C64062u9.A01(r0, r1)
            long r12 = r12 + r0
        L_0x0292:
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.String r0 = "AccountSwitchingFileManager/getCacheDirForInactiveAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.io.File r7 = r8.A0B(r6)
            if (r7 == 0) goto L_0x02d6
            boolean r1 = r7.exists()
            r0 = 1
            if (r1 != r0) goto L_0x02d6
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.String r0 = "cache"
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r0)
            r0 = 0
            long r0 = X.C64062u9.A01(r0, r1)
            long r16 = r16 + r0
        L_0x02ba:
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x026c
            X.10d r0 = r3.A0B
            java.lang.String r1 = r6.A05
            X.10c r0 = r0.A01
            X.10i r1 = r0.A00(r1)
            java.lang.String r0 = "msgstore.db"
            java.io.File r0 = r1.A04(r0)
            long r0 = r0.length()
            long r10 = r10 + r0
            goto L_0x026c
        L_0x02d6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingFileManager/getCacheDirForInactiveAccount/Account "
            r1.append(r0)
            java.lang.String r0 = X.C49842Sd.A00(r6)
            r1.append(r0)
            java.lang.String r0 = " does not exist"
            X.C17890vO.A19(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingFileManager/getCacheDirForInactiveAccount/stagingDirLogString/"
            r1.append(r0)
            java.lang.String r0 = X.C60322np.A00(r8)
            X.C17890vO.A1A(r1, r0)
            goto L_0x02ba
        L_0x02fc:
            long r14 = r14 / r18
            long r14 = r14 * r18
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r2.A0J = r0
            long r12 = r12 / r18
            long r12 = r12 * r18
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r2.A0I = r0
            long r16 = r16 / r18
            long r16 = r16 * r18
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r2.A0H = r0
            long r10 = r10 / r18
            long r10 = r10 * r18
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r2.A0D = r0
            goto L_0x0246
        L_0x0326:
            java.lang.Object r1 = r5.A01
            X.4rF r1 = (X.C98494rF) r1
            java.lang.Object r4 = r5.A02
            com.whatsapp.storage.StorageUsageActivity r4 = (com.whatsapp.storage.StorageUsageActivity) r4
            java.lang.Object r7 = r5.A03
            java.util.List r7 = (java.util.List) r7
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r6 = r1.element
            java.util.List r6 = (java.util.List) r6
            r5 = 0
            if (r6 == 0) goto L_0x0374
            X.5lJ r3 = r4.A0H
            if (r3 != 0) goto L_0x0347
            java.lang.String r0 = "storageUsageAdapter"
        L_0x0343:
            X.C18070vi.A11(r0)
            throw r5
        L_0x0347:
            java.lang.String r2 = r4.A0S
            java.util.List r1 = r4.A0V
            X.6RN r0 = r4.A0G
            r3.A05 = r6
            r3.A04 = r2
            r3.A06 = r1
            r3.A00 = r0
            r0 = 1
            r3.A07 = r0
            if (r7 == 0) goto L_0x0371
            java.util.Iterator r2 = r7.iterator()
        L_0x035e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0374
            int r1 = X.C72453Mb.A0H(r2)
            int r0 = X.C112335lJ.A00(r3)
            int r1 = r1 + r0
            r3.A0H(r1)
            goto L_0x035e
        L_0x0371:
            r3.notifyDataSetChanged()
        L_0x0374:
            X.00H r0 = r4.A0P
            if (r0 == 0) goto L_0x0390
            java.lang.Object r3 = r0.get()
            X.4Xf r3 = (X.C87824Xf) r3
            android.view.View r2 = r4.A00
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "manage_storage"
            java.lang.String r0 = r4.A0R
            boolean r0 = r3.A02(r2, r1, r0)
            if (r0 == 0) goto L_0x0016
            r4.A0R = r5
            return
        L_0x0390:
            java.lang.String r0 = "settingsSearchUtil"
            goto L_0x0343
        L_0x0393:
            java.lang.Object r0 = r5.A01
            X.5dl r0 = (X.C109635dl) r0
            java.lang.Object r1 = r5.A02
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r7 = r5.A03
            java.io.File r7 = (java.io.File) r7
            java.lang.ref.WeakReference r0 = r0.A09
            java.lang.Object r5 = r0.get()
            X.7Mt r5 = (X.C145827Mt) r5
            if (r5 == 0) goto L_0x0016
            r5.A08 = r1
            r5.A09 = r7
            X.6LS r0 = r5.A05
            r6 = 0
            r4 = 1
            if (r0 != 0) goto L_0x03cf
            int r0 = r5.A00
            X.6fE r3 = new X.6fE
            r3.<init>(r7, r0)
            X.79u r0 = new X.79u
            r0.<init>(r5, r4)
            X.6LS r2 = new X.6LS
            r2.<init>(r0)
            X.10I r1 = r5.A0K
            X.6fE[] r0 = new X.C127966fE[r4]
            r0[r6] = r3
            r1.CGD(r2, r0)
            r5.A05 = r2
        L_0x03cf:
            X.6LS r0 = r5.A04
            if (r0 != 0) goto L_0x0016
            r0 = 192(0xc0, float:2.69E-43)
            X.6fE r3 = new X.6fE
            r3.<init>(r7, r0)
            r1 = 2
            X.79u r0 = new X.79u
            r0.<init>(r5, r1)
            X.6LS r2 = new X.6LS
            r2.<init>(r0)
            X.10I r1 = r5.A0K
            X.6fE[] r0 = new X.C127966fE[r4]
            r0[r6] = r3
            r1.CGD(r2, r0)
            r5.A04 = r2
            return
        L_0x03f1:
            java.lang.Object r4 = r5.A01
            X.6Jr r4 = (X.C121446Jr) r4
            java.lang.Object r11 = r5.A02
            X.206 r11 = (X.AnonymousClass206) r11
            java.lang.Object r5 = r5.A03
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.util.List r0 = X.C42011xT.A0I
            r3 = 0
            r2 = 1
            X.6J8 r6 = r4.A02
            boolean r0 = r6 instanceof X.AnonymousClass6JB
            r8 = 0
            if (r0 == 0) goto L_0x0016
            X.6JB r6 = (X.AnonymousClass6JB) r6
            if (r6 == 0) goto L_0x0016
            X.205 r7 = r11.A0v
            X.206 r0 = r6.A03
            if (r0 == 0) goto L_0x0451
            X.205 r0 = r0.A0v
        L_0x0414:
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x044e
            r10 = r11
        L_0x041b:
            X.206 r9 = r6.A04
            X.205 r0 = r9.A0v
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0426
            r9 = r11
        L_0x0426:
            X.206 r1 = r6.A02
            if (r1 == 0) goto L_0x042c
            X.205 r8 = r1.A0v
        L_0x042c:
            boolean r0 = X.C18070vi.A18(r7, r8)
            if (r0 != 0) goto L_0x0433
            r11 = r1
        L_0x0433:
            X.2sx r7 = r6.A01
            X.1E7 r8 = r6.A00
            java.lang.CharSequence r12 = r6.A05
            boolean r13 = r6.A06
            boolean r14 = r6.A07
            X.C18070vi.A0d(r7, r3)
            X.C18070vi.A0d(r8, r2)
            X.6JB r6 = new X.6JB
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A0E(r5, r6, r2, r3)
            r4.A02 = r6
            return
        L_0x044e:
            X.206 r10 = r6.A03
            goto L_0x041b
        L_0x0451:
            r0 = r8
            goto L_0x0414
        L_0x0453:
            java.lang.Object r3 = r5.A01
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r3 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r3
            java.lang.Object r1 = r5.A02
            X.205 r1 = (X.AnonymousClass205) r1
            java.lang.Object r2 = r5.A03
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.00H r0 = r3.A0C
            X.206 r1 = X.AnonymousClass1W2.A01(r1, r0)
            r3.A00 = r1
            if (r1 == 0) goto L_0x0470
            com.whatsapp.jid.UserJid r0 = r1.A0I()
            if (r0 == 0) goto L_0x0470
            r2 = r0
        L_0x0470:
            X.6rX r0 = new X.6rX
            r0.<init>(r2, r1)
            r3.A01 = r0
            X.206 r0 = r3.A00
            if (r0 == 0) goto L_0x0016
            X.10I r1 = r3.A0A
            r0 = 49
            X.7RC r0 = X.AnonymousClass7RC.A00(r3, r0)
            r1.CGF(r0)
            return
        L_0x0487:
            java.lang.Object r2 = r5.A01
            X.1Vg r2 = (X.C27231Vg) r2
            java.lang.Object r3 = r5.A02
            java.lang.Object r4 = r5.A03
            X.00H r0 = r2.A06
            java.lang.Object r0 = r0.get()
            X.1f4 r0 = (X.C31131f4) r0
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x04a3
            boolean r0 = X.C39761tb.A0A()
            if (r0 != 0) goto L_0x0016
        L_0x04a3:
            r5 = 5
            java.util.concurrent.ExecutorService r0 = X.C27231Vg.A00(r2)
            r6 = 7
            X.7Px r1 = new X.7Px
            r1.<init>(r2, r3, r4, r5, r6)
            r0.submit(r1)
            return
        L_0x04b2:
            java.lang.Object r0 = r5.A01
            X.2Q0 r0 = (X.AnonymousClass2Q0) r0
            java.lang.Object r6 = r5.A02
            X.6j5 r6 = (X.C130226j5) r6
            java.lang.Object r4 = r5.A03
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.1gY r0 = r0.A04
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0C
            r0.decrementAndGet()
            X.1gV r2 = r6.A04
            X.206 r3 = r6.A01
            X.36w r1 = r6.A02
            android.graphics.BitmapFactory$Options r0 = X.C32021gV.A0E
            monitor-enter(r2)
            if (r1 == 0) goto L_0x04d1
            goto L_0x04d4
        L_0x04d1:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0aa2 }
            goto L_0x04dc
        L_0x04d4:
            X.2Qz r1 = r1.A0D     // Catch:{ all -> 0x0aa2 }
            X.2Qz r0 = X.C49572Qz.FAVICON     // Catch:{ all -> 0x0aa2 }
            if (r1 != r0) goto L_0x04d1
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0aa2 }
        L_0x04dc:
            java.lang.String r1 = X.C32021gV.A04(r3, r0)     // Catch:{ all -> 0x0aa2 }
            java.util.HashMap r0 = r2.A06     // Catch:{ all -> 0x0aa0 }
            r0.remove(r1)     // Catch:{ all -> 0x0aa0 }
            if (r4 == 0) goto L_0x04ec
            X.1Mz r0 = r2.A01     // Catch:{ all -> 0x0aa0 }
            r0.A0F(r1, r4)     // Catch:{ all -> 0x0aa0 }
        L_0x04ec:
            monitor-exit(r2)
            java.lang.Object r2 = r6.A05
            android.view.View r1 = r6.A00
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.3M2 r0 = r6.A03
            r0.CMa(r4, r1, r3)
            return
        L_0x0501:
            java.lang.Object r2 = r5.A01
            X.74M r2 = (X.AnonymousClass74M) r2
            java.lang.Object r1 = r5.A02
            X.72K r1 = (X.AnonymousClass72K) r1
            java.lang.Object r0 = r5.A03
            X.88W r0 = (X.AnonymousClass88W) r0
            r2.A0J = r1
            if (r0 == 0) goto L_0x0016
            r0.BE1()
            return
        L_0x0515:
            java.lang.Object r0 = r5.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            java.lang.Object r2 = r5.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r1 = r5.A03
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.10I r0 = r0.A12
            r0.CEz(r2)
            if (r1 == 0) goto L_0x0016
            r0.CEz(r1)
            return
        L_0x052c:
            java.lang.Object r4 = r5.A01
            X.5qx r4 = (X.C114515qx) r4
            java.lang.Object r3 = r5.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r5.A03
            r0 = 8
            r3.setVisibility(r0)
            X.74M r0 = r4.A04
            X.72K r0 = r0.A0J
            if (r0 != 0) goto L_0x0016
            r6 = 1
            r13 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r10 = r6
            r11 = r7
            r12 = r6
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r8 = r6
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 4
            X.5qy r0 = new X.5qy
            r0.<init>(r2, r4, r1)
            r5.setAnimationListener(r0)
            r0 = 213(0xd5, double:1.05E-321)
            r5.setDuration(r0)
            r3.startAnimation(r5)
            return
        L_0x0561:
            java.lang.Object r4 = r5.A01
            X.1x5 r4 = (X.C41801x5) r4
            java.lang.Object r3 = r5.A02
            X.6tc r3 = (X.C136316tc) r3
            java.lang.Object r2 = r5.A03
            X.6Re r2 = (X.C122646Re) r2
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.1dO r1 = X.C41801x5.A00(r4)
            if (r1 == 0) goto L_0x057c
            java.lang.String r0 = "TAP_UNDO_CROSSPOST"
            r1.A02(r0)
        L_0x057c:
            X.00H r0 = r4.A06
            java.lang.Object r0 = r0.get()
            X.6y4 r0 = (X.C139016y4) r0
            r0.A01(r3)
            X.00H r0 = r4.A05
            java.lang.Object r5 = r0.get()
            X.7PL r5 = (X.AnonymousClass7PL) r5
            int r0 = r2.ordinal()
            r4 = 0
            if (r0 == r4) goto L_0x05bf
            r3 = 1
            if (r0 != r3) goto L_0x05a9
            X.6tC r2 = r5.A01
            X.6Rr r1 = r2.A01
            X.6Rr r0 = X.C122726Rr.SHOW_APP_EXIST_XPOST_DISABLED
            if (r1 != r0) goto L_0x05a9
            r2.A02 = r3
            r2.A04 = r4
            X.6Rr r0 = X.C122726Rr.SHOW_APP_EXIST
            r2.A01 = r0
        L_0x05a9:
            X.6tC r2 = r5.A01
            X.6Rr r0 = r2.A00
            X.6Rr r1 = X.C122726Rr.SHOW_APP_EXIST
            if (r0 == r1) goto L_0x05b7
            X.6Rr r0 = r2.A01
            if (r0 == r1) goto L_0x05b7
            r2.A02 = r4
        L_0x05b7:
            X.89a r0 = r5.A00
            if (r0 == 0) goto L_0x0016
            r0.C5S(r2)
            return
        L_0x05bf:
            X.6tC r2 = r5.A01
            X.6Rr r1 = r2.A00
            X.6Rr r0 = X.C122726Rr.SHOW_APP_EXIST_XPOST_DISABLED
            if (r1 != r0) goto L_0x05a9
            r0 = 1
            r2.A02 = r0
            r2.A04 = r4
            X.6Rr r0 = X.C122726Rr.SHOW_APP_EXIST
            r2.A00 = r0
            goto L_0x05a9
        L_0x05d1:
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r5.A02
            X.6ws r3 = (X.C138316ws) r3
            java.lang.Object r1 = r5.A03
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            X.1KB r2 = r3.A01
            boolean r0 = X.AnonymousClass1L9.A05(r4, r1)
            if (r0 != 0) goto L_0x05f0
            r1 = 2131886448(0x7f120170, float:1.9407475E38)
            r0 = 0
            r2.A08(r1, r0)
        L_0x05f0:
            com.whatsapp.dialogs.ProgressDialogFragment r0 = r3.A00
            if (r0 == 0) goto L_0x05f7
            r0.A29()
        L_0x05f7:
            r0 = 0
            r3.A00 = r0
            return
        L_0x05fb:
            java.lang.Object r1 = r5.A01
            X.6ws r1 = (X.C138316ws) r1
            java.lang.Object r4 = r5.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r5.A03
            X.6cp r3 = (X.C126496cp) r3
            r2 = 1
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            com.whatsapp.dialogs.ProgressDialogFragment r0 = r1.A00
            if (r0 == 0) goto L_0x0613
            r0.A29()
        L_0x0613:
            r0 = 0
            r1.A00 = r0
            X.1KB r1 = r1.A01
            r0 = 2131896388(0x7f122844, float:1.9427636E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0G(r0, r2)
            X.6Gl r0 = r3.A00
            r0.A0N()
            return
        L_0x0628:
            java.lang.Object r2 = r5.A01
            X.6wt r2 = (X.C138326wt) r2
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r5.A03
            X.6UX r0 = (X.AnonymousClass6UX) r0
            X.C138326wt.A00(r2, r1)
            r0.A00(r1)
            return
        L_0x063b:
            java.lang.Object r0 = r5.A01
            X.6pf r0 = (X.C133886pf) r0
            java.lang.Object r3 = r5.A02
            X.725 r3 = (X.AnonymousClass725) r3
            java.lang.Object r1 = r5.A03
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r9 = 0
            X.00H r0 = r0.A03
            java.lang.Object r2 = r0.get()
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r2 = (com.whatsapp.stickers.stickerpack.StickerPackDownloader) r2
            r0 = 1
            X.7MR r4 = new X.7MR
            r4.<init>(r1, r0)
            java.lang.Integer r5 = X.C17880vN.A0k()
            r6 = 0
            r8 = r6
            r7 = r6
            r2.A02(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0661:
            java.lang.Object r2 = r5.A01
            X.67t r2 = (X.C1193467t) r2
            java.lang.Object r1 = r5.A02
            X.77d r1 = (X.C1418377d) r1
            java.lang.Object r0 = r5.A03
            X.887 r0 = (X.AnonymousClass887) r0
            r2.A0K(r0, r1)
            return
        L_0x0671:
            java.lang.Object r3 = r5.A01
            X.6CG r3 = (X.AnonymousClass6CG) r3
            java.lang.Object r2 = r5.A02
            X.77d r2 = (X.C1418377d) r2
            java.lang.Object r1 = r5.A03
            X.77d r1 = (X.C1418377d) r1
            X.6Hy r0 = r3.A0L
            r0.A05(r2)
            X.6Hx r0 = r3.A0M
            r0.A05(r1)
            return
        L_0x0688:
            java.lang.Object r2 = r5.A01
            X.5lF r2 = (X.C112295lF) r2
            java.lang.Object r4 = r5.A02
            X.5nB r4 = (X.C113495nB) r4
            java.lang.Object r5 = r5.A03
            X.5lK r0 = r4.A00
            if (r0 != 0) goto L_0x06ae
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r2.A01
            X.1SB r0 = r0.A0A
            X.4VT r3 = r0.A08()
            r7 = 1
        L_0x069f:
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r2.A01
            X.1KB r0 = r0.A05
            r6 = 18
            X.Ak4 r1 = new X.Ak4
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A0J(r1)
            return
        L_0x06ae:
            r3 = 0
            r7 = 0
            goto L_0x069f
        L_0x06b1:
            java.lang.Object r2 = r5.A01
            X.7Mz r2 = (X.C145887Mz) r2
            java.lang.Object r4 = r5.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r5.A03
            java.util.List r1 = (java.util.List) r1
            r6 = 2
            X.C18070vi.A0d(r1, r6)
            X.6ae r0 = r2.A02
            X.6fF r3 = new X.6fF
            r3.<init>(r2, r1)
            X.10F r0 = r0.A00
            X.10E r2 = r0.A00
            X.00S r0 = r2.A6N
            java.lang.Object r1 = r0.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            X.11E r0 = X.AnonymousClass3MZ.A0d(r2)
            X.7LO r10 = new X.7LO
            r10.<init>(r0, r1, r3, r4)
            X.11E r0 = r10.A00
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x06ef
            X.6fF r0 = r10.A02
            X.7Mz r0 = r0.A00
            X.1NV r0 = r0.A06
            r0.A02()
            return
        L_0x06ef:
            X.1OZ r9 = r10.A01
            java.lang.String r12 = r9.A0B()
            java.util.List r0 = r10.A03
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x06ff:
            boolean r0 = r4.hasNext()
            java.lang.String r8 = "id"
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L_0x071d
            java.lang.String r0 = X.C17880vN.A0v(r4)
            X.1MD[] r2 = new X.AnonymousClass1MD[r7]
            X.C17880vN.A1Q(r8, r0, r2, r5)
            java.lang.String r1 = "notice"
            X.1ca r0 = new X.1ca
            r0.<init>(r1, r2)
            r3.add(r0)
            goto L_0x06ff
        L_0x071d:
            X.1MD[] r2 = new X.AnonymousClass1MD[r7]
            java.lang.String r0 = "session_update"
            java.lang.String r4 = "type"
            X.C17880vN.A1Q(r4, r0, r2, r5)
            X.1ca[] r0 = new X.C29621ca[r5]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.1ca[] r1 = (X.C29621ca[]) r1
            java.lang.String r0 = "request"
            X.1ca r3 = new X.1ca
            r3.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r2, (X.C29621ca[]) r1)
            r0 = 4
            X.1MD[] r2 = new X.AnonymousClass1MD[r0]
            X.8v4 r1 = X.C173438v4.A00
            java.lang.String r0 = "to"
            X.C17880vN.A1I(r1, r0, r2, r5)
            X.C17880vN.A1Q(r8, r12, r2, r7)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "tos"
            X.C17880vN.A1Q(r1, r0, r2, r6)
            java.lang.String r0 = "set"
            X.1ca r11 = X.C29621ca.A01(r3, r4, r0, r2)
            r14 = 32000(0x7d00, double:1.581E-319)
            r13 = 290(0x122, float:4.06E-43)
            r9.A0J(r10, r11, r12, r13, r14)
            return
        L_0x0757:
            java.lang.Object r3 = r5.A01
            X.6KK r3 = (X.AnonymousClass6KK) r3
            java.lang.Object r2 = r5.A02
            X.6J8 r2 = (X.AnonymousClass6J8) r2
            java.lang.Object r1 = r5.A03
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.util.List r0 = X.C42011xT.A0I
            r0 = 1
            r3.A0E(r1, r2, r0, r0)
            return
        L_0x076a:
            java.lang.Object r3 = r5.A01
            X.6KP r3 = (X.AnonymousClass6KP) r3
            java.lang.Object r0 = r5.A02
            X.1rD r0 = (X.C38391rD) r0
            java.lang.Object r1 = r5.A03
            X.1ty r1 = (X.C39991ty) r1
            X.AnonymousClass3MX.A1O(r3)
            com.whatsapp.collections.ObservableRecyclerView r2 = r3.A04
            X.C108965cb.A14(r0, r2)
            X.5ly r0 = r3.A02
            r2.A0t(r0)
            X.1u6 r0 = r2.A02
            r0.A02(r1)
            X.1u5 r0 = r2.A01
            r0.A02(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.7Ah r1 = new X.7Ah
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A12
            r0.add(r1)
            return
        L_0x079a:
            java.lang.Object r3 = r5.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r3 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r3
            java.lang.Object r2 = r5.A02
            X.2HK r2 = (X.AnonymousClass2HK) r2
            java.lang.Object r1 = r5.A03
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A07(r2, r3, r1)
            return
        L_0x07ae:
            java.lang.Object r4 = r5.A01
            X.71O r4 = (X.AnonymousClass71O) r4
            java.lang.Object r3 = r5.A02
            X.7IA r3 = (X.AnonymousClass7IA) r3
            java.lang.Object r2 = r5.A03
            X.89S r2 = (X.AnonymousClass89S) r2
            X.11E r0 = r4.A04
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x07cc
            r1 = 5
            X.7Hz r0 = new X.7Hz
            r0.<init>(r2, r4, r1)
            r3.CBv(r0)
            return
        L_0x07cc:
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.Btp(r0)
            return
        L_0x07d4:
            java.lang.Object r4 = r5.A01
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r5.A02
            X.1kd r3 = (X.C34531kd) r3
            java.lang.Object r2 = r5.A03
            X.1iW r2 = (X.C33251iW) r2
            int r1 = r4.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r1)
            if (r0 != 0) goto L_0x07f6
            boolean r0 = X.AnonymousClass25A.A0I(r1)
            if (r0 != 0) goto L_0x07f6
            r0 = 82
            if (r1 == r0) goto L_0x07f6
            r2.A0c(r4)
            return
        L_0x07f6:
            X.21V r4 = (X.AnonymousClass21V) r4
            r3.A07(r4)
            return
        L_0x07fc:
            java.lang.Object r2 = r5.A01
            X.6Ml r2 = (X.C122016Ml) r2
            java.lang.Object r1 = r5.A03
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            long r0 = X.C26521Sl.A02(r1)
            r2.A00 = r0
            return
        L_0x080f:
            java.lang.Object r0 = r5.A01
            X.5ks r0 = (X.C112065ks) r0
            java.lang.Object r6 = r5.A02
            java.lang.Object r5 = r5.A03
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r4 = r0.A02
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131886468(0x7f120184, float:1.9407516E38)
            r3.A0D(r0)
            r2 = 2131892464(0x7f1218f0, float:1.9419677E38)
            r1 = 2
            X.74z r0 = new X.74z
            r0.<init>(r6, r4, r5, r1)
            r3.A0Z(r0, r2)
            r2 = 2131890163(0x7f120ff3, float:1.941501E38)
            r1 = 3
            X.74z r0 = new X.74z
            r0.<init>(r6, r4, r5, r1)
            r3.A0X(r0, r2)
            X.AnonymousClass3MY.A1G(r3)
            return
        L_0x083f:
            java.lang.Object r0 = r5.A01
            X.791 r0 = (X.AnonymousClass791) r0
            java.lang.Object r3 = r5.A02
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r5.A03
            X.70T r2 = (X.AnonymousClass70T) r2
            X.7OH r1 = r0.A02
            java.util.List r0 = r1.A0M
            r0.clear()
            r0.addAll(r3)
            X.AnonymousClass7OH.A00(r2, r1, r0)
            return
        L_0x0859:
            java.lang.Object r2 = r5.A01
            X.74M r2 = (X.AnonymousClass74M) r2
            java.lang.Object r1 = r5.A02
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r5.A03
            java.io.File r0 = (java.io.File) r0
            r2.A0T(r1, r0)
            return
        L_0x0869:
            java.lang.Object r4 = r5.A01
            X.74M r4 = (X.AnonymousClass74M) r4
            java.lang.Object r7 = r5.A02
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r8 = r5.A03
            java.io.File r8 = (java.io.File) r8
            X.6tp r1 = r4.A1A
            r0 = 1
            r1.A04 = r0
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.A06
            long r5 = r5 - r0
            long r0 = r4.A05
            long r5 = r5 + r0
            r4.A05 = r5
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0895
            r4.A0Z(r6, r6)
            return
        L_0x0895:
            int r0 = X.AnonymousClass74M.A1e
            X.AnonymousClass74M.A0E(r4, r0)
            X.11C r3 = r4.A0m
            X.C84094Hv.A00(r3)
            X.5de r1 = r4.A0F
            r5 = 0
            if (r1 == 0) goto L_0x08b1
            monitor-enter(r1)
            android.os.HandlerThread r0 = r1.A00     // Catch:{ all -> 0x08ab }
            r0.quit()     // Catch:{ all -> 0x08ab }
            goto L_0x08ae
        L_0x08ab:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x08ae:
            monitor-exit(r1)
            r4.A0F = r5
        L_0x08b1:
            X.6uN r0 = r4.A0y
            r0.A00()
            boolean r0 = r4.A1N
            if (r0 == 0) goto L_0x08c3
            X.1FL r1 = r4.A0a
            X.C18070vi.A0d(r1, r6)
            r0 = -1
            r1.setRequestedOrientation(r0)
        L_0x08c3:
            android.os.Handler r0 = r4.A0U
            r0.removeCallbacksAndMessages(r5)
            X.7OH r2 = r4.A15
            java.util.List r0 = r2.A0M
            r0.clear()
            r0 = 1
            r4.A0W(r7, r8, r6, r0)
            X.16P r0 = r4.A1G
            r0.A00 = r6
            X.2LC r1 = r4.A18
            java.lang.String r0 = "voicenote/voicenotestopped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 37
            X.AnonymousClass7KX.A00(r1, r0)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r2 = r2.A0H
            r2.A06 = r6
            r0 = 0
            r2.A03 = r0
            r0 = 166(0xa6, double:8.2E-322)
            r2.A04 = r0
            X.6mE r0 = r4.A0H
            if (r0 == 0) goto L_0x08f8
            r0.A00()
            r4.A0H = r5
        L_0x08f8:
            X.1FL r1 = r4.A0a
            r0 = 2131898081(0x7f122ee1, float:1.943107E38)
            X.C108955ca.A1E(r1, r3, r0)
            return
        L_0x0901:
            java.lang.Object r4 = r5.A01
            X.E8I r4 = (X.E8I) r4
            java.lang.Object r3 = r5.A02
            X.22l r3 = (X.C441822l) r3
            java.lang.Object r0 = r5.A03
            X.4rF r0 = (X.C98494rF) r0
            X.C18070vi.A0j(r3, r0)
            java.lang.Object r2 = r0.element
            java.lang.String r2 = (java.lang.String) r2
            X.0wS r1 = X.C18460wS.A00
            X.BvR r0 = X.C24099BvR.A00
            r4.C99(r0, r3, r2, r1)
            return
        L_0x091c:
            java.lang.Object r3 = r5.A01
            X.E8I r3 = (X.E8I) r3
            java.lang.Object r2 = r5.A02
            X.22l r2 = (X.C441822l) r2
            java.lang.Object r1 = r5.A03
            X.Bvo r1 = (X.C24122Bvo) r1
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r3.C98(r1, r2)
            return
        L_0x0930:
            java.lang.Object r2 = r5.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r2
            java.lang.Object r1 = r5.A02
            java.util.concurrent.Exchanger r1 = (java.util.concurrent.Exchanger) r1
            java.lang.Object r0 = r5.A03
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            r2.m79lambda$syncRunOnCameraThread$0$comwhatsappvoipcallingcameraVoipPhysicalCamera(r1, r0)
            return
        L_0x0940:
            java.lang.Object r6 = r5.A01
            X.BBM r6 = (X.BBM) r6
            java.lang.Object r0 = r5.A02
            X.908 r0 = (X.AnonymousClass908) r0
            java.lang.Object r7 = r5.A03
            java.util.Map r7 = (java.util.Map) r7
            r3 = 0
            X.C18070vi.A0d(r6, r3)
            X.00H r0 = r0.A0A
            r0.get()
            r2 = 0
            java.lang.String r0 = "data"
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x096a
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x096a
            java.lang.String r0 = "error_message"
            java.lang.Object r2 = r1.get(r0)
        L_0x096a:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0996
            if (r2 == 0) goto L_0x0996
            java.lang.String r5 = "error"
            r0 = 2
            X.1D6[] r4 = new X.AnonymousClass1D6[r0]
            java.lang.String r0 = "message"
            X.AnonymousClass1D6.A03(r0, r2, r4, r3)
            java.lang.String r3 = "params"
            java.lang.String r2 = "is_data_channel_error"
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.util.Map r0 = X.C108975cc.A0h(r2, r0)
            X.AnonymousClass1D6.A03(r3, r0, r4, r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A0B(r4)
            java.util.Map r0 = X.C108975cc.A0h(r5, r0)
            java.util.LinkedHashMap r7 = X.AnonymousClass1D7.A09(r7, r0)
        L_0x0996:
            r6.C7V(r7)
            return
        L_0x099a:
            java.lang.Object r0 = r5.A01
            X.A6L r0 = (X.A6L) r0
            java.lang.Object r3 = r5.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r5.A03
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.00H r0 = r0.A0i
            r0.get()
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A1D(r3, r2, r1, r0, r0)
            r3.startActivity(r0)
            return
        L_0x09b5:
            java.lang.Object r2 = r5.A01
            X.6wu r2 = (X.C138336wu) r2
            java.lang.Object r1 = r5.A02
            X.6fN r1 = (X.C128056fN) r1
            java.lang.Object r0 = r5.A03
            X.705 r0 = (X.AnonymousClass705) r0
            X.C138336wu.A00(r0, r1, r2)
            return
        L_0x09c5:
            java.lang.Object r4 = r5.A03
            com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher r4 = (com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher) r4
            java.lang.Object r3 = r5.A01
            X.6O2 r3 = (X.AnonymousClass6O2) r3
            java.lang.Object r2 = r5.A02
            X.705 r2 = (X.AnonymousClass705) r2
            r0 = 0
            com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher$postRequest$2$1$1$1 r1 = new com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher$postRequest$2$1$1$1
            r1.<init>(r2, r4, r3, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r1)
            return
        L_0x09dd:
            java.lang.Object r3 = r5.A01
            java.lang.Object r1 = r5.A02
            X.86X r1 = (X.AnonymousClass86X) r1
            java.lang.Object r2 = r5.A03
            X.6gm r2 = (X.C128846gm) r2
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.E8A r1 = r1.BM3()
            X.77e r0 = r2.A00
            java.lang.Object r0 = X.C20061A5k.A01(r0)
            java.util.List r0 = X.C18070vi.A0M(r0)
            X.C115575vO.A00(r1, r3, r0)
            return
        L_0x09fd:
            java.lang.Object r2 = r5.A01
            X.6wv r2 = (X.C138346wv) r2
            java.lang.Object r1 = r5.A02
            X.89Z r1 = (X.AnonymousClass89Z) r1
            java.lang.Object r0 = r5.A03
            X.705 r0 = (X.AnonymousClass705) r0
            X.C138346wv.A00(r0, r1, r2)
            return
        L_0x0a0d:
            java.lang.Object r0 = r5.A01
            X.1x5 r0 = (X.C41801x5) r0
            java.lang.Object r2 = r5.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.A03
            X.210 r1 = (X.AnonymousClass210) r1
            X.00H r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.6pS r0 = (X.C133766pS) r0
            r0.A00(r2, r1)
            return
        L_0x0a25:
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r5.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r5.A03
            X.1x5 r2 = (X.C41801x5) r2
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0a39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a43
            X.C108995ce.A1Q(r5, r1)
            goto L_0x0a39
        L_0x0a43:
            X.1KB r4 = r2.A00
            X.00H r0 = r2.A03
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.00H r0 = r2.A0B
            java.lang.Object r0 = r0.get()
            X.73E r0 = (X.AnonymousClass73E) r0
            r0.A06(r5, r3)
            r0 = 37
            goto L_0x0a90
        L_0x0a59:
            java.lang.Object r1 = r5.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r5.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r5.A03
            X.6yG r2 = (X.C139126yG) r2
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            java.util.ArrayList r5 = X.C29351c6.A0D(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0a71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a7b
            X.C108995ce.A1Q(r5, r1)
            goto L_0x0a71
        L_0x0a7b:
            X.1KB r4 = r2.A00
            X.00H r0 = r2.A02
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.73E r0 = (X.AnonymousClass73E) r0
            r0.A06(r5, r3)
            r0 = 32
        L_0x0a90:
            X.AnonymousClass7RN.A00(r4, r1, r5, r0)
            return
        L_0x0a94:
            java.lang.String r0 = "userActions"
            goto L_0x0c71
        L_0x0a98:
            java.lang.String r0 = "stickerPackUtils"
            goto L_0x0c71
        L_0x0a9c:
            java.lang.String r0 = "stickerRepository"
            goto L_0x0c71
        L_0x0aa0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0aa2 }
        L_0x0aa2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0aa5:
            java.lang.Object r7 = r5.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r9 = r5.A02
            X.6hW r9 = (X.C129266hW) r9
            java.lang.Object r6 = r5.A03
            X.6fH r6 = (X.C127996fH) r6
            r0 = 2
            java.util.ArrayList r8 = X.C108955ca.A16(r6, r0)
            java.util.Iterator r2 = r7.iterator()
        L_0x0aba:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ace
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass6JB
            if (r0 == 0) goto L_0x0aba
            if (r1 == 0) goto L_0x0aba
            r8.add(r1)
            goto L_0x0aba
        L_0x0ace:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r8.iterator()
        L_0x0ad6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0af3
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6JB r0 = (X.AnonymousClass6JB) r0
            if (r0 == 0) goto L_0x0ad6
            X.206 r1 = r0.A04
            boolean r0 = r1 instanceof X.C438421d
            if (r0 != 0) goto L_0x0aef
            boolean r0 = r1 instanceof X.AnonymousClass21W
            if (r0 == 0) goto L_0x0ad6
        L_0x0aef:
            r5.add(r2)
            goto L_0x0ad6
        L_0x0af3:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r5.iterator()
        L_0x0afb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b11
            java.lang.Object r0 = r2.next()
            X.6JB r0 = (X.AnonymousClass6JB) r0
            X.206 r1 = r0.A04
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0afb
            r3.add(r1)
            goto L_0x0afb
        L_0x0b11:
            boolean r0 = r3 instanceof java.util.Collection
            r4 = 1
            if (r0 == 0) goto L_0x0b8b
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0b8b
            r3 = 0
        L_0x0b1d:
            int r8 = r8.size()
            int r0 = r5.size()
            int r8 = r8 - r0
            boolean r10 = r7 instanceof java.util.Collection
            r9 = 0
            if (r10 == 0) goto L_0x0ba9
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0ba9
        L_0x0b31:
            int r8 = r8 + r9
            if (r10 == 0) goto L_0x0b78
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0b78
        L_0x0b3a:
            r4 = 0
        L_0x0b3b:
            int r0 = r5.size()
            int r0 = r0 - r3
            X.6sv r2 = new X.6sv
            r2.<init>(r8, r3, r0, r4)
            X.2HK r4 = r6.A00
            com.whatsapp.updates.viewmodels.UpdatesViewModel r3 = r6.A01
            int r0 = r2.A00
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0D = r0
            int r0 = r2.A02
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0F = r0
            int r0 = r2.A01
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0E = r0
            X.5jJ r1 = r3.A0X
            java.util.List r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A05(r3)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            r1.A0V(r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Tiles Result: "
            X.C17900vP.A0Y(r2, r0, r1)
            return
        L_0x0b78:
            java.util.Iterator r1 = r7.iterator()
        L_0x0b7c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b3a
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass6JC
            if (r0 == 0) goto L_0x0b7c
            goto L_0x0b3b
        L_0x0b8b:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L_0x0b90:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b1d
            X.21V r1 = X.C17880vN.A0b(r2)
            X.6q4 r0 = r9.A00
            boolean r0 = r0.A01(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b90
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x0b90
            goto L_0x0bcf
        L_0x0ba9:
            java.util.Iterator r2 = r7.iterator()
        L_0x0bad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b31
            java.lang.Object r1 = r2.next()
            X.6JD r1 = (X.AnonymousClass6JD) r1
            boolean r0 = r1 instanceof X.AnonymousClass6JC
            if (r0 == 0) goto L_0x0bad
            X.6J8 r1 = (X.AnonymousClass6J8) r1
            X.2sx r0 = r1.A00()
            if (r0 == 0) goto L_0x0bad
            int r0 = r0.A00()
            if (r0 <= 0) goto L_0x0bad
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x0bad
        L_0x0bcf:
            X.AnonymousClass1ZU.A0A()
            goto L_0x0c74
        L_0x0bd4:
            java.lang.Object r0 = r5.A01
            com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet r0 = (com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet) r0
            java.lang.Object r6 = r5.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r5.A03
            X.725 r5 = (X.AnonymousClass725) r5
            X.C18070vi.A0h(r0, r6)
            X.00H r0 = r0.A00
            if (r0 == 0) goto L_0x0c18
            java.lang.Object r4 = r0.get()
            X.6xF r4 = (X.C138536xF) r4
            java.util.List r3 = r5.A07
            java.lang.String r2 = X.AnonymousClass725.A00(r5)
            java.lang.String r1 = r5.A04
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r5.A0K
            X.C138536xF.A00(r4, r2, r1, r0, r6)
            r3.addAll(r6)
            X.00H r0 = r4.A02
            X.72N r0 = X.C108945cZ.A0z(r0)
            r0.A06(r5)
            X.00H r0 = r4.A00
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r0 = 38
            X.7RQ r1 = new X.7RQ
            r1.<init>(r4, r5, r0)
            goto L_0x0da8
        L_0x0c18:
            java.lang.String r0 = "customStickerPackStore"
            goto L_0x0c71
        L_0x0c1b:
            java.lang.Object r2 = r5.A01
            java.lang.Object r0 = r5.A02
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r0
            java.lang.Object r1 = r5.A03
            X.725 r1 = (X.AnonymousClass725) r1
            X.00H r0 = r0.A0L
            if (r2 == 0) goto L_0x0c35
            if (r0 == 0) goto L_0x0c44
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 20
            X.AnonymousClass7KY.A00(r1, r2, r0)
            return
        L_0x0c35:
            if (r0 == 0) goto L_0x0c44
            X.10T r2 = X.C17880vN.A0V(r0)
            java.lang.String r1 = X.AnonymousClass725.A00(r1)
            r0 = 7
            X.AnonymousClass7KZ.A00(r2, r1, r0)
            return
        L_0x0c44:
            java.lang.String r0 = "stickerObservers"
            goto L_0x0c71
        L_0x0c47:
            java.lang.Object r3 = r5.A01
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r2 = r5.A02
            com.whatsapp.support.faq.SearchFAQActivity r2 = (com.whatsapp.support.faq.SearchFAQActivity) r2
            java.lang.Object r1 = r5.A03
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r3 == 0) goto L_0x0c6a
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0c6a
            X.1LU r0 = r2.A04
            if (r0 == 0) goto L_0x0c6f
            android.content.Intent r0 = r0.A1t(r2, r1, r3)
        L_0x0c63:
            X.C18070vi.A0b(r0)
            r2.startActivity(r0)
            return
        L_0x0c6a:
            android.content.Intent r0 = com.whatsapp.support.faq.SearchFAQActivity.A0y(r1, r2)
            goto L_0x0c63
        L_0x0c6f:
            java.lang.String r0 = "waIntents"
        L_0x0c71:
            X.C18070vi.A11(r0)
        L_0x0c74:
            r0 = 0
            throw r0
        L_0x0c76:
            java.lang.Object r3 = r5.A01
            com.whatsapp.textstatus.AddTextStatusActivity r3 = (com.whatsapp.textstatus.AddTextStatusActivity) r3
            java.lang.Object r8 = r5.A02
            X.4rD r8 = (X.C98474rD) r8
            java.lang.Object r4 = r5.A03
            r9 = 0
            r7 = 1
            X.C18070vi.A0d(r8, r7)
            java.lang.String r10 = "null"
            java.io.File r0 = r3.getFilesDir()
            java.lang.String r1 = "customTSValues"
            java.io.File r0 = X.C17880vN.A0e(r0, r1)
            boolean r0 = r0.exists()
            r12 = 0
            if (r0 == 0) goto L_0x0d2c
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.io.FileInputStream r0 = r3.openFileInput(r1)     // Catch:{ Exception -> 0x0d00 }
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0d00 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0d00 }
            java.lang.Object r1 = r6.readObject()     // Catch:{ all -> 0x0cf9 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0cf9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0cf9 }
            java.lang.String r0 = "\n"
            java.util.List r0 = X.C108965cb.A0v(r1, r0, r9)     // Catch:{ all -> 0x0cf9 }
            r8 = 2
            java.util.ArrayList r0 = X.C29431cG.A0i(r0, r8, r8)     // Catch:{ all -> 0x0cf9 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0cf9 }
        L_0x0cbf:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0cf9 }
            if (r0 == 0) goto L_0x0cf5
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x0cf9 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0cf9 }
            int r0 = r5.size()     // Catch:{ all -> 0x0cf9 }
            if (r0 != r8) goto L_0x0cbf
            java.lang.Object r0 = r5.get(r9)     // Catch:{ all -> 0x0cf9 }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ all -> 0x0cf9 }
            if (r0 != 0) goto L_0x0cf3
            java.lang.String r1 = X.C17880vN.A0w(r5, r9)     // Catch:{ all -> 0x0cf9 }
        L_0x0cdf:
            java.lang.Object r0 = r5.get(r7)     // Catch:{ all -> 0x0cf9 }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ all -> 0x0cf9 }
            if (r0 != 0) goto L_0x0cf1
            java.lang.String r0 = X.C17880vN.A0w(r5, r7)     // Catch:{ all -> 0x0cf9 }
        L_0x0ced:
            X.AnonymousClass1D6.A02(r1, r0, r2)     // Catch:{ all -> 0x0cf9 }
            goto L_0x0cbf
        L_0x0cf1:
            r0 = r12
            goto L_0x0ced
        L_0x0cf3:
            r1 = r12
            goto L_0x0cdf
        L_0x0cf5:
            r6.close()     // Catch:{ Exception -> 0x0d00 }
            goto L_0x0d06
        L_0x0cf9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0cfb }
        L_0x0cfb:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ Exception -> 0x0d00 }
            throw r0     // Catch:{ Exception -> 0x0d00 }
        L_0x0d00:
            r1 = move-exception
            java.lang.String r0 = "GetCustomValues/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0d06:
            java.util.Iterator r2 = r2.iterator()
        L_0x0d0a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0d9f
            java.lang.Object r1 = r2.next()
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.util.List r0 = r3.A0L
            java.lang.Object r8 = r1.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            r6 = 0
            X.6sf r5 = new X.6sf
            r9 = r6
            r5.<init>(r6, r8, r9, r11)
            r0.add(r5)
            goto L_0x0d0a
        L_0x0d2c:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2130903078(0x7f030026, float:1.7412964E38)
            android.content.res.TypedArray r6 = r1.obtainTypedArray(r0)
            X.C18070vi.A0X(r6)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0dac }
            int r2 = r6.length()     // Catch:{ all -> 0x0dac }
            r1 = 0
        L_0x0d43:
            if (r1 >= r2) goto L_0x0d51
            java.lang.String r0 = r6.getString(r1)     // Catch:{ all -> 0x0dac }
            if (r0 == 0) goto L_0x0d4e
            r5.add(r0)     // Catch:{ all -> 0x0dac }
        L_0x0d4e:
            int r1 = r1 + 1
            goto L_0x0d43
        L_0x0d51:
            r6.recycle()
            java.util.Iterator r11 = r5.iterator()
        L_0x0d58:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0d9f
            java.lang.String r15 = X.C17880vN.A0v(r11)
            int[] r5 = new int[r7]
            int[] r2 = X.C124496Yo.A00
            int r1 = r8.element
            int r0 = r1 + 1
            r8.element = r0
            r0 = r2[r1]
            r5[r9] = r0
            X.5z5 r0 = new X.5z5
            r0.<init>(r5)
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            int[] r6 = r0.A01
            int r5 = r6.length
            r2 = 0
        L_0x0d7d:
            if (r2 >= r5) goto L_0x0d8c
            r1 = r6[r2]
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r1 == r0) goto L_0x0d89
            r10.appendCodePoint(r1)
        L_0x0d89:
            int r2 = r2 + 1
            goto L_0x0d7d
        L_0x0d8c:
            java.lang.String r18 = X.C18070vi.A0H(r10)
            java.util.List r0 = r3.A0L
            r13 = 0
            X.6sf r12 = new X.6sf
            r16 = r13
            r12.<init>(r13, r15, r16, r18)
            r0.add(r12)
            goto L_0x0d58
        L_0x0d9f:
            X.1KB r2 = r3.A05
            r0 = 8
            X.7RD r1 = new X.7RD
            r1.<init>(r3, r4, r0)
        L_0x0da8:
            r2.A0J(r1)
            return
        L_0x0dac:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RO.run():void");
    }
}
