package X;

import android.content.Context;

public final class AR7 implements C72143Ku {
    public final Context A00;
    public final AnonymousClass11E A01;
    public final C30191dX A02;
    public final AnonymousClass11C A03;
    public final C219217x A04;
    public final C19830z4 A05;
    public final C18000vb A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final C19960A0r A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass11P A0B;

    /* JADX WARNING: Can't wrap try/catch for region: R(37:43|44|45|46|47|83|(1:85)|86|(3:88|89|90)|91|(1:100)|96|(6:101|102|103|(1:104)|283|106)|109|(14:111|112|113|114|(4:117|(1:286)(7:119|(1:123)|124|125|126|(3:128|(2:(4:132|(2:134|293)(1:292)|291|130)|290)(1:289)|135)|287)|284|115)|285|138|2b3|146|(4:148|(1:(2:296|191)(2:150|(1:171)(8:295|154|(1:(2:300|170)(2:156|(1:169)(2:299|160)))|161|(3:163|(2:167|304)|168)|303|172|(2:176|(2:177|(3:179|(2:181|309)(3:(1:184)|185|(2:187|310)(3:308|188|189))|182)(2:307|190)))(0))))|(1:193)(1:196)|194)|195|197|198|199)|209|(1:211)(3:262|(1:266)|267)|212|(1:214)|215|(3:217|(2:219|(1:221))|222)|223|(3:225|(1:227)|228)|229|(1:231)|232|(2:234|(1:236))|237|(3:239|(1:241)|242)|243|(3:245|(1:247)(1:261)|248)|249|(4:251|(4:253|(4:256|(2:260|318)|314|254)|315|(1:269))|270|(1:272))|273|(2:275|(1:279))(1:282)|280|281) */
    /* JADX WARNING: Can't wrap try/catch for region: R(43:49|50|51|52|81|83|(0)|86|(0)|91|100|96|98|101|102|103|(1:104)|283|106|109|(0)|209|(0)(0)|212|(0)|215|(0)|223|(0)|229|(0)|232|(0)|237|(0)|243|(0)|249|(0)|273|(0)(0)|280|281) */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        if (r5 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00df */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0102 A[SYNTHETIC, Splitter:B:75:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0107 A[SYNTHETIC, Splitter:B:79:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0w(X.C171888sR r23) {
        /*
            r22 = this;
            r0 = 0
            r2 = r23
            X.C18070vi.A0d(r2, r0)
            java.lang.Boolean r0 = X.C17970vW.A01     // Catch:{ ClassNotFoundException -> 0x000f }
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000f }
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0T = r0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r0 = "mounted"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0025 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r2.A00 = r0
            r1 = r22
            X.11C r0 = r1.A03
            r21 = r0
            boolean r0 = X.C17970vW.A0G(r21)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0R = r0
            java.lang.Boolean r0 = X.C17970vW.A01
            if (r0 != 0) goto L_0x0059
            r3 = 0
            java.lang.String r0 = "/system/lib/libc_malloc_debug_qemu.so"
            boolean r0 = X.C108975cc.A1M(r0)     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x004c
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ Exception -> 0x0053 }
            X.C17970vW.A01 = r0     // Catch:{ Exception -> 0x0053 }
            goto L_0x0059
        L_0x004c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0053 }
            X.C17970vW.A01 = r0     // Catch:{ Exception -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C17970vW.A01 = r0
        L_0x0059:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0U = r0
            android.content.Context r0 = r1.A00
            r20 = r0
            java.lang.Boolean r0 = X.C17970vW.A00
            if (r0 != 0) goto L_0x008a
            r6 = 1
            r5 = 0
            java.lang.String r0 = "/dev/com.genymotion.superuser.daemon"
            boolean r0 = X.C108975cc.A1M(r0)     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0076
            goto L_0x0082
        L_0x0076:
            android.content.pm.PackageManager r4 = r20.getPackageManager()
            java.lang.String r3 = "com.genymotion.superuser"
            r0 = 128(0x80, float:1.794E-43)
            r4.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x0083 }
            goto L_0x0084
        L_0x0082:
            r5 = 1
        L_0x0083:
            r6 = r5
        L_0x0084:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.C17970vW.A00 = r0
        L_0x008a:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0P = r0
            r7 = 0
            r6 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00eb, all -> 0x00fe }
            java.lang.String r0 = "ps"
            java.lang.Process r3 = r3.exec(r0)     // Catch:{ Exception -> 0x00eb, all -> 0x00fe }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x00eb, all -> 0x00fe }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00eb, all -> 0x00fe }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00eb, all -> 0x00fe }
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r3.waitFor()     // Catch:{ Exception -> 0x00e3 }
            int r3 = r4.available()     // Catch:{ Exception -> 0x00e3 }
            byte[] r0 = new byte[r3]     // Catch:{ Exception -> 0x00e3 }
            r4.read(r0, r7, r3)     // Catch:{ Exception -> 0x00e3 }
            int r3 = r5.available()     // Catch:{ Exception -> 0x00e3 }
            byte[] r0 = new byte[r3]     // Catch:{ Exception -> 0x00e3 }
            r5.read(r0, r7, r3)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00e3 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r0 = "com.android.commands.monkey"
            boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x00e3 }
            if (r0 == 0) goto L_0x00dc
            r5.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            r4.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            r0 = 1
            goto L_0x010b
        L_0x00dc:
            r5.close()     // Catch:{ IOException -> 0x00df }
        L_0x00df:
            r4.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x010a
        L_0x00e3:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e5:
            r0 = move-exception
            r4 = r6
            goto L_0x00f5
        L_0x00e8:
            r0 = move-exception
            r4 = r6
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            r5 = r6
            r4 = r6
        L_0x00ee:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x0100
        L_0x00f2:
            r0 = move-exception
            if (r5 == 0) goto L_0x00f8
        L_0x00f5:
            r5.close()     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            if (r4 == 0) goto L_0x00ff
            r4.close()     // Catch:{ IOException -> 0x00ff }
            throw r0
        L_0x00fe:
            r0 = move-exception
        L_0x00ff:
            throw r0
        L_0x0100:
            if (r5 == 0) goto L_0x0105
            r5.close()     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            if (r4 == 0) goto L_0x010a
            r4.close()     // Catch:{ IOException -> 0x010a }
        L_0x010a:
            r0 = 0
        L_0x010b:
            r5 = 1
            if (r0 == 0) goto L_0x0114
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A0Q = r0
        L_0x0114:
            boolean r0 = X.C17970vW.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0S = r0
            android.accounts.AccountManager r4 = android.accounts.AccountManager.get(r20)
            r3 = -1
            if (r4 == 0) goto L_0x012c
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r0 = r4.getAccountsByType(r0)     // Catch:{ Exception -> 0x012c }
            int r3 = r0.length     // Catch:{ Exception -> 0x012c }
        L_0x012c:
            java.lang.Long r0 = X.C17880vN.A0n(r3)
            r2.A19 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A0s = r0
            java.lang.String r0 = android.os.Build.DISPLAY
            r2.A1p = r0
            java.lang.String r0 = X.C62912sC.A02()
            r2.A1i = r0
            boolean r0 = X.AnonymousClass112.A04()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r3 = "android.hardware.ram.low"
            r0 = r21
            boolean r0 = r0.A0P(r3)
            if (r0 == 0) goto L_0x01b1
        L_0x0154:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A04 = r0
            X.0vb r0 = r1.A06
            r19 = r0
            java.lang.String r0 = r19.A05()
            r2.A1m = r0
            java.lang.String r0 = r19.A04()
            r2.A1n = r0
            android.content.pm.PackageManager r3 = r20.getPackageManager()
            java.lang.String r0 = r20.getPackageName()
            java.lang.String r0 = r3.getInstallerPackageName(r0)
            r2.A1k = r0
            java.lang.String r0 = r20.getPackageName()
            r2.A1q = r0
            X.1Cu r8 = new X.1Cu
            r8.<init>()
            java.lang.String r0 = "apkhash"
            r8.A02 = r0
            long r6 = android.os.SystemClock.elapsedRealtime()
            android.content.pm.ApplicationInfo r0 = r20.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            java.lang.String r5 = X.C17970vW.A02(r0)
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C108945cZ.A1B(r3, r6)
            r8.A00 = r0
            X.18K r0 = r1.A08
            r0.CC7(r8)
            r2.A1g = r5
            android.content.pm.Signature[] r6 = X.C24211Jh.A04(r20)
            r3 = 0
            if (r6 == 0) goto L_0x01d5
            int r5 = r6.length
            if (r5 == 0) goto L_0x01d5
            goto L_0x01b3
        L_0x01b1:
            r5 = 0
            goto L_0x0154
        L_0x01b3:
            java.security.MessageDigest r4 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x01d1 }
            r4.reset()
            r3 = 0
        L_0x01bb:
            r0 = r6[r3]
            byte[] r0 = r0.toByteArray()
            r4.update(r0)
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x01bb
            byte[] r0 = r4.digest()
            java.lang.String r3 = X.C108955ca.A14(r0)
            goto L_0x01d5
        L_0x01d1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x01d5:
            r2.A1t = r3
            int r0 = X.C62912sC.A00()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A1W = r0
            X.0z4 r0 = r1.A05
            r18 = r0
            X.00H r0 = r0.A00
            r17 = r0
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r17)
            java.lang.String r0 = "phoneyid_id"
            java.lang.String r0 = X.C17880vN.A0r(r3, r0)
            r2.A1s = r0
            X.0ve r8 = r1.A07
            java.util.Set r0 = X.C20069A5t.A00
            r0 = 3663(0xe4f, float:5.133E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            r4 = 0
            if (r0 == 0) goto L_0x03d4
            java.util.HashSet r10 = X.C17880vN.A12()
            r0 = 4
            java.lang.ClassLoader[] r5 = new java.lang.ClassLoader[r0]
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r3 = r0.getContextClassLoader()
            r0 = 0
            r5[r0] = r3
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            r5[r0] = r3
            java.lang.Class<X.A5t> r0 = X.C20069A5t.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 2
            r5[r0] = r3
            r3 = 3
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r5[r3] = r0
            java.util.HashSet r0 = X.C63772tf.newHashSet(r5)
            java.security.MessageDigest r15 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x03d0 }
            java.util.LinkedList r9 = X.AnonymousClass8BR.A14()
            r9.addAll(r0)
        L_0x023e:
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x02b1
            java.lang.Object r3 = r9.pop()
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            if (r3 == 0) goto L_0x023e
            java.lang.ClassLoader r0 = r3.getParent()
            if (r0 == 0) goto L_0x0266
            boolean r0 = r10.contains(r3)
            if (r0 != 0) goto L_0x0266
            java.lang.ClassLoader r0 = r3.getParent()
            r10.add(r0)
            java.lang.ClassLoader r0 = r3.getParent()
            r9.add(r0)
        L_0x0266:
            java.lang.String r0 = "pathList"
            java.lang.Object r3 = X.C20069A5t.A00(r3, r0)     // Catch:{ Exception -> 0x02ac }
            java.lang.String r0 = "dexElements"
            java.lang.Object r11 = X.C20069A5t.A00(r3, r0)     // Catch:{ Exception -> 0x02ac }
            java.lang.Object[] r11 = (java.lang.Object[]) r11     // Catch:{ Exception -> 0x02ac }
            int r6 = r11.length     // Catch:{ Exception -> 0x02ac }
            r5 = 0
        L_0x0276:
            if (r5 >= r6) goto L_0x023e
            r3 = r11[r5]     // Catch:{ Exception -> 0x02ac }
            java.lang.String r0 = "dexFile"
            java.lang.Object r0 = X.C20069A5t.A00(r3, r0)     // Catch:{ Exception -> 0x02ac }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ Exception -> 0x02ac }
            java.util.Enumeration r12 = r0.entries()     // Catch:{ Exception -> 0x02ac }
            if (r12 == 0) goto L_0x02a9
        L_0x0288:
            boolean r0 = r12.hasMoreElements()     // Catch:{ Exception -> 0x02ac }
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r4 = r12.nextElement()     // Catch:{ Exception -> 0x02ac }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x02ac }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x02ac }
            byte[] r0 = r4.getBytes(r0)     // Catch:{ Exception -> 0x02ac }
            r15.update(r0)     // Catch:{ Exception -> 0x02ac }
            java.util.Set r3 = X.C20069A5t.A00     // Catch:{ Exception -> 0x02ac }
            boolean r0 = r3.contains(r4)     // Catch:{ Exception -> 0x02ac }
            if (r0 == 0) goto L_0x0288
            r3.remove(r4)     // Catch:{ Exception -> 0x02ac }
            goto L_0x0288
        L_0x02a9:
            int r5 = r5 + 1
            goto L_0x0276
        L_0x02ac:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x023e
        L_0x02b1:
            java.util.Set r5 = X.C20069A5t.A00
            monitor-enter(r5)
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x03cd }
        L_0x02b8:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03cd }
            if (r0 == 0) goto L_0x02cc
            java.lang.String r3 = X.C17880vN.A0v(r4)     // Catch:{ all -> 0x03cd }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x03cd }
            byte[] r0 = r3.getBytes(r0)     // Catch:{ all -> 0x03cd }
            r15.update(r0)     // Catch:{ all -> 0x03cd }
            goto L_0x02b8
        L_0x02cc:
            monitor-exit(r5)     // Catch:{ all -> 0x03cd }
            X.CUs r14 = X.C25039CUs.A00
            X.Blt r14 = (X.C23565Blt) r14
            X.CUs r6 = r14.A02
            if (r6 != 0) goto L_0x0399
            X.CmI r13 = r14.A00
            char[] r9 = r13.A07
            int r6 = r9.length
            r4 = 0
        L_0x02db:
            if (r4 >= r6) goto L_0x0393
            char r3 = r9[r4]
            r0 = 65
            if (r3 < r0) goto L_0x0318
            r0 = 90
            if (r3 > r0) goto L_0x0318
            r4 = 0
        L_0x02e8:
            if (r4 >= r6) goto L_0x0316
            char r3 = r9[r4]
            r0 = 97
            if (r3 < r0) goto L_0x0313
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 > r0) goto L_0x0313
            r0 = 1
        L_0x02f5:
            r3 = r0 ^ 1
            java.lang.String r0 = "Cannot call lowerCase() on a mixed-case alphabet"
            X.C199610h.A08(r3, r0)
            char[] r4 = new char[r6]
            r5 = 0
        L_0x02ff:
            if (r5 >= r6) goto L_0x031b
            char r3 = r9[r5]
            r0 = 65
            if (r3 < r0) goto L_0x030e
            r0 = 90
            if (r3 > r0) goto L_0x030e
            r0 = r3 ^ 32
            char r3 = (char) r0
        L_0x030e:
            r4[r5] = r3
            int r5 = r5 + 1
            goto L_0x02ff
        L_0x0313:
            int r4 = r4 + 1
            goto L_0x02e8
        L_0x0316:
            r0 = 0
            goto L_0x02f5
        L_0x0318:
            int r4 = r4 + 1
            goto L_0x02db
        L_0x031b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = r13.A04
            r3.append(r0)
            java.lang.String r0 = ".lowerCase()"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)
            X.CmI r12 = new X.CmI
            r12.<init>(r0, r4)
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0394
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0394
            byte[] r11 = r12.A06
            int r0 = r11.length
            byte[] r10 = java.util.Arrays.copyOf(r11, r0)
            r9 = 65
        L_0x0340:
            r0 = 90
            r6 = 1
            if (r9 > r0) goto L_0x037c
            r5 = r9 | 32
            byte r4 = r11[r9]
            byte r3 = r11[r5]
            r0 = -1
            if (r4 != r0) goto L_0x0353
            r10[r9] = r3
        L_0x0350:
            int r9 = r9 + 1
            goto L_0x0340
        L_0x0353:
            if (r3 == r0) goto L_0x0356
            r6 = 0
        L_0x0356:
            char r0 = (char) r9
            r16 = r0
            char r0 = (char) r5
            java.lang.String r3 = "Can't ignoreCase() since '%s' and '%s' encode different values"
            if (r6 == 0) goto L_0x0361
            r10[r5] = r4
            goto L_0x0350
        L_0x0361:
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1b()
            r2 = 0
            java.lang.Character r1 = java.lang.Character.valueOf(r16)
            r4[r2] = r1
            r1 = 1
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r4[r1] = r0
            java.lang.String r0 = com.google.common.base.Strings.A00(r3, r4)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x037c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = r12.A04
            r3.append(r0)
            java.lang.String r0 = ".ignoreCase()"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)
            char[] r0 = r12.A07
            X.CmI r12 = new X.CmI
            r12.<init>(r3, r0, r10, r6)
            goto L_0x0394
        L_0x0393:
            r12 = r13
        L_0x0394:
            if (r12 != r13) goto L_0x03b8
            r6 = r14
        L_0x0397:
            r14.A02 = r6
        L_0x0399:
            byte[] r9 = r15.digest()
            int r5 = r9.length
            r0 = 0
            X.C199610h.A03(r0, r5, r5)
            r0 = r6
            X.Blt r0 = (X.C23565Blt) r0
            X.CmI r0 = r0.A00
            int r4 = r0.A02
            int r3 = r0.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = X.C24608CBm.A00(r5, r3, r0)
            int r4 = r4 * r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            goto L_0x03bf
        L_0x03b8:
            java.lang.Character r0 = r14.A01
            X.CUs r6 = r14.A01(r12, r0)
            goto L_0x0397
        L_0x03bf:
            r6.A00(r0, r9, r5)     // Catch:{ IOException -> 0x03c7 }
            java.lang.String r4 = r0.toString()
            goto L_0x03d4
        L_0x03c7:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x03cd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03cd }
            throw r0
        L_0x03d0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x03d4:
            r2.A1h = r4
            X.17x r5 = r1.A04
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1Q = r0
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1U = r0
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1P = r0
            boolean r0 = X.AnonymousClass112.A01()
            r9 = 0
            if (r0 == 0) goto L_0x0602
            r3 = 0
        L_0x03fa:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A1R = r0
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1V = r0
            boolean r0 = r5.A0E()
            if (r0 != 0) goto L_0x0410
            r9 = -1
        L_0x0410:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r2.A1T = r0
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1O = r0
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1M = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1N = r0
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            java.lang.Long r0 = A00(r5, r0)
            r2.A1S = r0
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 == 0) goto L_0x0452
            java.lang.Integer r0 = r5.A05()
            int r4 = r0.intValue()
            r3 = 1
            r0 = 0
            if (r4 == r0) goto L_0x044c
            r3 = 2
            if (r4 == r3) goto L_0x044c
            r3 = 3
        L_0x044c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A0l = r0
        L_0x0452:
            r0 = 10504(0x2908, float:1.4719E-41)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x046a
            X.1dX r0 = r1.A02
            boolean r3 = r0.A00()
            r0 = 3
            if (r3 == 0) goto L_0x0464
            r0 = 4
        L_0x0464:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0j = r0
        L_0x046a:
            X.00H r5 = r1.A0A
            long r3 = X.AnonymousClass8BV.A05(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A1X = r0
            java.lang.Object r0 = r5.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r3 = r0.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A1Y = r0
            long r3 = X.C108975cc.A07(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A15 = r0
            java.lang.Object r0 = r5.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r3 = r0.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A16 = r0
            r5.get()
            boolean r0 = X.AnonymousClass11Z.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            int r3 = r18.A04()
            r0 = r3 & 2
            r4 = 0
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A06 = r0
            r0 = r3 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A09 = r0
            r0 = r3 & 1
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C = r0
            r0 = r3 & 4
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0F = r0
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r17)
            java.lang.String r0 = "autodownload_roaming_mask"
            int r3 = r3.getInt(r0, r4)
            r0 = r3 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A07 = r0
            r0 = r3 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0A = r0
            r0 = r3 & 1
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0D = r0
            r0 = r3 & 4
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0G = r0
            android.content.SharedPreferences r5 = X.C17880vN.A0B(r17)
            java.lang.String r3 = "autodownload_wifi_mask"
            r0 = 15
            int r3 = r5.getInt(r3, r0)
            r0 = r3 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A08 = r0
            r0 = r3 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0B = r0
            r0 = r3 & 1
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0E = r0
            r0 = r3 & 4
            if (r0 == 0) goto L_0x0551
            r4 = 1
        L_0x0551:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A0H = r0
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r17)
            java.lang.String r13 = "last_daily_event"
            r3 = 0
            long r11 = r0.getLong(r13, r3)
            r9 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0575
            long r9 = r5 - r11
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0575
            r9 = 1
        L_0x0575:
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r17)
            X.AnonymousClass8BW.A12(r0, r13, r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r2.A1a = r0
            X.11E r5 = r1.A01
            r4 = 1
            int r3 = r5.A03(r4)
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0Y = r0
            boolean r0 = X.AnonymousClass112.A02()
            if (r0 == 0) goto L_0x05a7
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x05a1
            r4 = 3
        L_0x05a1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A0i = r0
        L_0x05a7:
            r0 = 3309(0xced, float:4.637E-42)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x05bb
            android.telephony.TelephonyManager r0 = r21.A0K()
            if (r0 == 0) goto L_0x0600
            java.lang.String r0 = r0.getNetworkOperatorName()
        L_0x05b9:
            r2.A1o = r0
        L_0x05bb:
            boolean r0 = X.AnonymousClass112.A05()
            if (r0 == 0) goto L_0x063b
            android.app.usage.UsageStatsManager r9 = r21.A08()
            if (r9 == 0) goto L_0x062b
            int r0 = r9.getAppStandbyBucket()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A0u = r0
            long r7 = java.lang.System.currentTimeMillis()
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r7 - r5
            android.app.usage.UsageEvents r6 = r9.queryEventsForSelf(r3, r7)
            X.C18070vi.A0X(r6)
            android.app.usage.UsageEvents$Event r5 = new android.app.usage.UsageEvents$Event
            r5.<init>()
            r4 = 0
        L_0x05e7:
            boolean r0 = r6.getNextEvent(r5)
            if (r0 == 0) goto L_0x0623
            int r3 = r5.getEventType()
            r0 = 11
            if (r3 != r0) goto L_0x05e7
            int r0 = r5.getAppStandbyBucket()
            if (r0 <= r4) goto L_0x05e7
            int r4 = r5.getAppStandbyBucket()
            goto L_0x05e7
        L_0x0600:
            r0 = 0
            goto L_0x05b9
        L_0x0602:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 != 0) goto L_0x0617
            boolean r3 = X.AnonymousClass112.A07()
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            if (r3 != 0) goto L_0x0617
            r4.add(r0)
        L_0x0617:
            r0 = 0
            java.lang.String[] r0 = X.C17890vO.A1b(r4, r0)
            int r0 = r5.A04(r0)
            long r3 = (long) r0
            goto L_0x03fa
        L_0x0623:
            if (r4 == 0) goto L_0x062b
            java.lang.Long r0 = X.C17880vN.A0n(r4)
            r2.A1H = r0
        L_0x062b:
            android.app.ActivityManager r0 = r21.A04()
            if (r0 == 0) goto L_0x063b
            boolean r0 = r0.isBackgroundRestricted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0I = r0
        L_0x063b:
            X.1Vp r3 = new X.1Vp
            r0 = r20
            r3.<init>(r0)
            boolean r0 = r3.A01()
            int r0 = X.C72453Mb.A04(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0p = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            r2.A1j = r0
            r0 = r19
            boolean r0 = r0.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            X.A0r r0 = r1.A09
            java.util.Locale r0 = r0.A01()
            if (r0 == 0) goto L_0x068e
            java.lang.String r3 = r0.getLanguage()
            if (r3 == 0) goto L_0x0680
            java.lang.String r0 = "[a-z]{2}"
            boolean r0 = java.util.regex.Pattern.matches(r0, r3)
            if (r0 != 0) goto L_0x068b
        L_0x0680:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "KeyboardLanguageExtractor/getCurrentKeyboardLanguage/invalid-language "
            X.C17900vP.A0g(r0, r3, r1)
            java.lang.String r3 = "zz"
        L_0x068b:
            r2.A1l = r3
            return
        L_0x068e:
            java.lang.String r3 = ""
            goto L_0x068b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AR7.C0w(X.8sR):void");
    }

    public AR7(Context context, AnonymousClass11E r3, C30191dX r4, AnonymousClass11C r5, AnonymousClass11P r6, C219217x r7, C19830z4 r8, C18000vb r9, C18030ve r10, AnonymousClass18K r11, C19960A0r a0r, AnonymousClass00H r13) {
        C18070vi.A0p(r6, r10, r11);
        C18070vi.A0d(r13, 5);
        C18070vi.A0x(r5, r9, r4, r8, r7);
        C72473Md.A1L(a0r, r3);
        this.A00 = context;
        this.A0B = r6;
        this.A07 = r10;
        this.A08 = r11;
        this.A0A = r13;
        this.A03 = r5;
        this.A06 = r9;
        this.A02 = r4;
        this.A05 = r8;
        this.A04 = r7;
        this.A09 = a0r;
        this.A01 = r3;
    }

    public static Long A00(C219217x r0, String str) {
        return Long.valueOf((long) r0.A02(str));
    }
}
