package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.1tc  reason: invalid class name and case insensitive filesystem */
public abstract class C39771tc {
    public static final Map A00 = new HashMap();
    public static final Set A01 = new HashSet();
    public static final byte[] A02 = {80, 75, 3, 4};

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1ti] */
    public static C42891yu A04(InputStream inputStream, String str) {
        C18070vi.A0c(inputStream, 0);
        return A03(new C39951tu(new C39871tm(new C39851tk(inputStream, new Object()))), str, true);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1ti] */
    public static C42891yu A05(String str) {
        return A03(new C39951tu(new C39871tm(new C39851tk(new ByteArrayInputStream(str.getBytes()), new Object()))), (String) null, true);
    }

    public static C39811tg A07(Runnable runnable, String str, Callable callable) {
        C39811tg r0 = null;
        if (str != null) {
            Object A04 = C39791te.A01.A00.A04(str);
            if (A04 != null) {
                Executor executor = C39811tg.A04;
                r0 = new C39811tg(new C21490Akz(A04, 2), false);
            }
            Map map = A00;
            if (map.containsKey(str)) {
                r0 = (C39811tg) map.get(str);
            }
            if (r0 != null) {
                if (runnable != null) {
                    runnable.run();
                }
                return r0;
            }
        }
        C39811tg r3 = new C39811tg(callable, false);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            r3.A02(new C65232w3(str, atomicBoolean, 0));
            r3.A01(new C65232w3(str, atomicBoolean, 1));
            if (!atomicBoolean.get()) {
                Map map2 = A00;
                map2.put(str, r3);
                if (map2.size() == 1) {
                    ArrayList arrayList = new ArrayList(A01);
                    if (0 < arrayList.size()) {
                        arrayList.get(0);
                        throw new NullPointerException("onIdleChanged");
                    }
                }
            }
        }
        return r3;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.1ti] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C42891yu A00(android.content.Context r9, java.lang.String r10, int r11) {
        /*
            if (r10 == 0) goto L_0x0012
            X.1te r0 = X.C39791te.A01
            X.00z r0 = r0.A00
            java.lang.Object r1 = r0.A04(r10)
            if (r1 == 0) goto L_0x0012
            X.1yu r0 = new X.1yu
            r0.<init>((java.lang.Object) r1)
            return r0
        L_0x0012:
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ NotFoundException -> 0x0089 }
            java.io.InputStream r2 = r0.openRawResource(r11)     // Catch:{ NotFoundException -> 0x0089 }
            r0 = 0
            X.C18070vi.A0c(r2, r0)     // Catch:{ NotFoundException -> 0x0089 }
            X.1ti r1 = new X.1ti     // Catch:{ NotFoundException -> 0x0089 }
            r1.<init>()     // Catch:{ NotFoundException -> 0x0089 }
            X.1tk r0 = new X.1tk     // Catch:{ NotFoundException -> 0x0089 }
            r0.<init>(r2, r1)     // Catch:{ NotFoundException -> 0x0089 }
            X.1tm r4 = new X.1tm     // Catch:{ NotFoundException -> 0x0089 }
            r4.<init>(r0)     // Catch:{ NotFoundException -> 0x0089 }
            r8 = 0
            X.1to r0 = new X.1to     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            r0.<init>(r4)     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            X.1tm r7 = new X.1tm     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            r7.<init>(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            byte[] r6 = A02     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            r5 = 4
            r3 = 0
        L_0x003c:
            byte r2 = r6[r3]     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            r0 = 1
            boolean r0 = r7.CFQ(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            if (r0 == 0) goto L_0x0060
            X.1tn r0 = r7.A01     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            byte r0 = r0.A00()     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            if (r0 == r2) goto L_0x0053
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            goto L_0x006a
        L_0x0053:
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x003c
            r7.close()     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            goto L_0x006a
        L_0x0060:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            r0.<init>()     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x0066 }
        L_0x0066:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ NotFoundException -> 0x0089 }
        L_0x006a:
            boolean r0 = r0.booleanValue()     // Catch:{ NotFoundException -> 0x0089 }
            if (r0 == 0) goto L_0x007f
            X.1ts r1 = new X.1ts     // Catch:{ NotFoundException -> 0x0089 }
            r1.<init>(r4)     // Catch:{ NotFoundException -> 0x0089 }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x0089 }
            r0.<init>(r1)     // Catch:{ NotFoundException -> 0x0089 }
            X.1yu r0 = A02(r9, r10, r0)     // Catch:{ NotFoundException -> 0x0089 }
            return r0
        L_0x007f:
            X.1ts r0 = new X.1ts     // Catch:{ NotFoundException -> 0x0089 }
            r0.<init>(r4)     // Catch:{ NotFoundException -> 0x0089 }
            X.1yu r0 = A04(r0, r10)     // Catch:{ NotFoundException -> 0x0089 }
            return r0
        L_0x0089:
            r1 = move-exception
            X.1yu r0 = new X.1yu
            r0.<init>((java.lang.Throwable) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39771tc.A00(android.content.Context, java.lang.String, int):X.1yu");
    }

    public static C42891yu A01(Context context, String str, String str2) {
        Object A04;
        if (str2 != null && (A04 = C39791te.A01.A00.A04(str2)) != null) {
            return new C42891yu(A04);
        }
        try {
            if (str.endsWith(".zip") || str.endsWith(".lottie")) {
                return A02(context, str2, new ZipInputStream(context.getAssets().open(str)));
            }
            return A04(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new C42891yu((Throwable) e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [java.lang.Object, X.1ti] */
    public static C42891yu A02(Context context, String str, ZipInputStream zipInputStream) {
        FileOutputStream fileOutputStream;
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            C42891yu r3 = null;
            if (str != null) {
                try {
                    C39801tf r0 = (C39801tf) C39791te.A01.A00.A04(str);
                    if (r0 != null) {
                        r3 = new C42891yu((Object) r0);
                        C40171uH.A04(zipInputStream);
                        return r3;
                    }
                } catch (IOException e) {
                    r3 = new C42891yu((Throwable) e);
                }
            }
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C39801tf r4 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    r4 = (C39801tf) A03(new C39951tu(new C39871tm(new C39851tk(zipInputStream, new Object()))), (String) null, false).A00;
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            if (name.contains(".ttf") || name.contains(".otf")) {
                                String[] split = name.split("/");
                                String str2 = split[split.length - 1];
                                String str3 = str2.split("\\.")[0];
                                File file = new File(context.getCacheDir(), str2);
                                new FileOutputStream(file);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unable to save font ");
                                    sb.append(str3);
                                    sb.append(" to the temporary file: ");
                                    sb.append(str2);
                                    sb.append(". ");
                                    C196379ux.A01(sb.toString(), th);
                                }
                                Typeface createFromFile = Typeface.createFromFile(file);
                                if (!file.delete()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Failed to delete temp font file ");
                                    sb2.append(file.getAbsolutePath());
                                    sb2.append(".");
                                    C196379ux.A00(sb2.toString());
                                }
                                hashMap2.put(str3, createFromFile);
                            } else {
                                zipInputStream.closeEntry();
                            }
                        }
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (r4 == null) {
                r3 = new C42891yu((Throwable) new IllegalArgumentException("Unable to parse composition"));
                C40171uH.A04(zipInputStream);
                return r3;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = r4.A0A.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C55152fI r9 = (C55152fI) it.next();
                    if (r9.A03.equals(str4)) {
                        Bitmap bitmap = (Bitmap) entry.getValue();
                        int i = r9.A02;
                        int i2 = r9.A01;
                        if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                        r9.A00 = bitmap;
                    }
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (C24945CQv cQv : r4.A09.values()) {
                    if (cQv.A01.equals(entry2.getKey())) {
                        cQv.A00 = (Typeface) entry2.getValue();
                        z = true;
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Parsed font for ");
                    sb3.append((String) entry2.getKey());
                    sb3.append(" however it was not found in the animation.");
                    C196379ux.A00(sb3.toString());
                }
            }
            if (hashMap.isEmpty()) {
                Iterator it2 = r4.A0A.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C55152fI r2 = (C55152fI) ((Map.Entry) it2.next()).getValue();
                    if (r2 == null) {
                        break;
                    }
                    String str5 = r2.A03;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        r2.A00 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    }
                }
                C40171uH.A04(zipInputStream);
                return r3;
            }
            if (str != null) {
                C39791te.A01.A00.A08(str, r4);
            }
            r3 = new C42891yu((Object) r4);
            C40171uH.A04(zipInputStream);
            return r3;
            throw th;
        } catch (IllegalArgumentException e2) {
            C196379ux.A01("data URL did not have correct base64 format.", e2);
        } catch (Throwable th2) {
            C40171uH.A04(zipInputStream);
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x0329  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C42891yu A03(X.C39941tt r23, java.lang.String r24, boolean r25) {
        /*
            r5 = r23
            r4 = r24
            if (r24 == 0) goto L_0x0019
            X.1te r0 = X.C39791te.A01     // Catch:{ Exception -> 0x0321 }
            X.00z r0 = r0.A00     // Catch:{ Exception -> 0x0321 }
            java.lang.Object r0 = r0.A04(r4)     // Catch:{ Exception -> 0x0321 }
            X.1tf r0 = (X.C39801tf) r0     // Catch:{ Exception -> 0x0321 }
            if (r0 == 0) goto L_0x0019
            X.1yu r1 = new X.1yu     // Catch:{ Exception -> 0x0321 }
            r1.<init>((java.lang.Object) r0)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0327
        L_0x0019:
            X.1uB r0 = X.C40101uA.A00     // Catch:{ Exception -> 0x0321 }
            float r24 = X.C40171uH.A00()     // Catch:{ Exception -> 0x0321 }
            X.00p r23 = new X.00p     // Catch:{ Exception -> 0x0321 }
            r23.<init>()     // Catch:{ Exception -> 0x0321 }
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ Exception -> 0x0321 }
            r22.<init>()     // Catch:{ Exception -> 0x0321 }
            java.util.HashMap r21 = new java.util.HashMap     // Catch:{ Exception -> 0x0321 }
            r21.<init>()     // Catch:{ Exception -> 0x0321 }
            java.util.HashMap r20 = new java.util.HashMap     // Catch:{ Exception -> 0x0321 }
            r20.<init>()     // Catch:{ Exception -> 0x0321 }
            java.util.HashMap r19 = new java.util.HashMap     // Catch:{ Exception -> 0x0321 }
            r19.<init>()     // Catch:{ Exception -> 0x0321 }
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ Exception -> 0x0321 }
            r18.<init>()     // Catch:{ Exception -> 0x0321 }
            X.04B r17 = new X.04B     // Catch:{ Exception -> 0x0321 }
            r17.<init>()     // Catch:{ Exception -> 0x0321 }
            X.1tf r3 = new X.1tf     // Catch:{ Exception -> 0x0321 }
            r3.<init>()     // Catch:{ Exception -> 0x0321 }
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
            r16 = 0
            r15 = 0
            r0 = 0
            r7 = 0
            r6 = 0
        L_0x0050:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x02de
            X.1uB r1 = X.C40101uA.A03     // Catch:{ Exception -> 0x0321 }
            int r1 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            switch(r1) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009e;
                case 4: goto L_0x0098;
                case 5: goto L_0x0066;
                case 6: goto L_0x029a;
                case 7: goto L_0x0211;
                case 8: goto L_0x019e;
                case 9: goto L_0x0101;
                case 10: goto L_0x00b8;
                default: goto L_0x005f;
            }     // Catch:{ Exception -> 0x0321 }
        L_0x005f:
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x0066:
            java.lang.String r2 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            java.lang.String r1 = "\\."
            java.lang.String[] r2 = r2.split(r1)     // Catch:{ Exception -> 0x0321 }
            r1 = 0
            r1 = r2[r1]     // Catch:{ Exception -> 0x0321 }
            int r10 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0321 }
            r1 = 1
            r1 = r2[r1]     // Catch:{ Exception -> 0x0321 }
            int r9 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0321 }
            r1 = 2
            r1 = r2[r1]     // Catch:{ Exception -> 0x0321 }
            int r8 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0321 }
            r2 = 4
            r1 = 0
            if (r10 < r2) goto L_0x0092
            if (r10 > r2) goto L_0x0050
            if (r9 < r2) goto L_0x0092
            if (r9 > r2) goto L_0x0050
            if (r8 < r1) goto L_0x0092
            goto L_0x0050
        L_0x0092:
            java.lang.String r1 = "Lottie only supports bodymovin >= 4.4.0"
            r3.A02(r1)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x0098:
            double r1 = r5.A07()     // Catch:{ Exception -> 0x0321 }
            float r7 = (float) r1     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x009e:
            double r1 = r5.A07()     // Catch:{ Exception -> 0x0321 }
            float r0 = (float) r1     // Catch:{ Exception -> 0x0321 }
            r1 = 1008981770(0x3c23d70a, float:0.01)
            float r0 = r0 - r1
            goto L_0x0050
        L_0x00a8:
            double r1 = r5.A07()     // Catch:{ Exception -> 0x0321 }
            float r15 = (float) r1     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x00ae:
            int r6 = r5.A08()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x00b3:
            int r16 = r5.A08()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x00b8:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
        L_0x00bb:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x02d9
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
            r10 = 0
            r9 = 0
            r8 = 0
        L_0x00c7:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x00f3
            X.1uB r1 = X.C40101uA.A02     // Catch:{ Exception -> 0x0321 }
            int r2 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            if (r2 == 0) goto L_0x00ee
            r1 = 1
            if (r2 == r1) goto L_0x00e8
            r1 = 2
            if (r2 == r1) goto L_0x00e2
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x00c7
        L_0x00e2:
            double r1 = r5.A07()     // Catch:{ Exception -> 0x0321 }
            float r8 = (float) r1     // Catch:{ Exception -> 0x0321 }
            goto L_0x00c7
        L_0x00e8:
            double r1 = r5.A07()     // Catch:{ Exception -> 0x0321 }
            float r10 = (float) r1     // Catch:{ Exception -> 0x0321 }
            goto L_0x00c7
        L_0x00ee:
            java.lang.String r9 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x00c7
        L_0x00f3:
            r5.A0I()     // Catch:{ Exception -> 0x0321 }
            X.2dV r2 = new X.2dV     // Catch:{ Exception -> 0x0321 }
            r2.<init>(r9, r10, r8)     // Catch:{ Exception -> 0x0321 }
            r1 = r18
            r1.add(r2)     // Catch:{ Exception -> 0x0321 }
            goto L_0x00bb
        L_0x0101:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
        L_0x0104:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x02d9
            X.1uB r1 = X.AnonymousClass2WJ.A00     // Catch:{ Exception -> 0x0321 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0321 }
            r11.<init>()     // Catch:{ Exception -> 0x0321 }
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
            r8 = 0
            r9 = 0
            r13 = 0
            r10 = r9
            r12 = 0
        L_0x011a:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x018b
            X.1uB r1 = X.AnonymousClass2WJ.A01     // Catch:{ Exception -> 0x0321 }
            int r2 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            if (r2 == 0) goto L_0x0182
            r1 = 1
            if (r2 == r1) goto L_0x017e
            r1 = 2
            if (r2 == r1) goto L_0x0179
            r1 = 3
            if (r2 == r1) goto L_0x0174
            r1 = 4
            if (r2 == r1) goto L_0x016f
            r1 = 5
            if (r2 == r1) goto L_0x013e
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x013e:
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
        L_0x0141:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x016b
            X.1uB r1 = X.AnonymousClass2WJ.A00     // Catch:{ Exception -> 0x0321 }
            int r1 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x0156
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0141
        L_0x0156:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
        L_0x0159:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x0167
            X.1v6 r1 = X.C40711v9.A02(r3, r5)     // Catch:{ Exception -> 0x0321 }
            r11.add(r1)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0159
        L_0x0167:
            r5.A0H()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0141
        L_0x016b:
            r5.A0I()     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x016f:
            java.lang.String r10 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x0174:
            java.lang.String r9 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x0179:
            double r13 = r5.A07()     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x017e:
            r5.A07()     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x0182:
            java.lang.String r1 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            char r12 = r1.charAt(r8)     // Catch:{ Exception -> 0x0321 }
            goto L_0x011a
        L_0x018b:
            r5.A0I()     // Catch:{ Exception -> 0x0321 }
            X.CWm r8 = new X.CWm     // Catch:{ Exception -> 0x0321 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0321 }
            int r2 = r8.hashCode()     // Catch:{ Exception -> 0x0321 }
            r1 = r17
            r1.A02(r2, r8)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0104
        L_0x019e:
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
        L_0x01a1:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x020c
            X.1uB r1 = X.C40101uA.A01     // Catch:{ Exception -> 0x0321 }
            int r1 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x01b6
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01a1
        L_0x01b6:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
        L_0x01b9:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x0208
            X.1uB r1 = X.AnonymousClass2VO.A00     // Catch:{ Exception -> 0x0321 }
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
            r11 = 0
            r10 = r11
            r9 = r11
        L_0x01c7:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x01f8
            X.1uB r1 = X.AnonymousClass2VO.A00     // Catch:{ Exception -> 0x0321 }
            int r2 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            if (r2 == 0) goto L_0x01f3
            r1 = 1
            if (r2 == r1) goto L_0x01ee
            r1 = 2
            if (r2 == r1) goto L_0x01e9
            r1 = 3
            if (r2 == r1) goto L_0x01e5
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01c7
        L_0x01e5:
            r5.A07()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01c7
        L_0x01e9:
            java.lang.String r9 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01c7
        L_0x01ee:
            java.lang.String r10 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01c7
        L_0x01f3:
            java.lang.String r11 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01c7
        L_0x01f8:
            r5.A0I()     // Catch:{ Exception -> 0x0321 }
            X.CQv r8 = new X.CQv     // Catch:{ Exception -> 0x0321 }
            r8.<init>(r11, r10, r9)     // Catch:{ Exception -> 0x0321 }
            java.lang.String r2 = r8.A02     // Catch:{ Exception -> 0x0321 }
            r1 = r19
            r1.put(r2, r8)     // Catch:{ Exception -> 0x0321 }
            goto L_0x01b9
        L_0x0208:
            r5.A0H()     // Catch:{ Exception -> 0x0321 }
            goto L_0x01a1
        L_0x020c:
            r5.A0I()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x0211:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
        L_0x0214:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x02d9
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x0321 }
            r14.<init>()     // Catch:{ Exception -> 0x0321 }
            X.00p r13 = new X.00p     // Catch:{ Exception -> 0x0321 }
            r13.<init>()     // Catch:{ Exception -> 0x0321 }
            r5.A0G()     // Catch:{ Exception -> 0x0321 }
            r12 = 0
            r11 = r12
            r10 = 0
            r9 = 0
        L_0x022b:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x0281
            X.1uB r1 = X.C40101uA.A00     // Catch:{ Exception -> 0x0321 }
            int r2 = r5.A09(r1)     // Catch:{ Exception -> 0x0321 }
            if (r2 == 0) goto L_0x027c
            r1 = 1
            if (r2 == r1) goto L_0x0262
            r1 = 2
            if (r2 == r1) goto L_0x025d
            r1 = 3
            if (r2 == r1) goto L_0x0258
            r1 = 4
            if (r2 == r1) goto L_0x0253
            r1 = 5
            if (r2 == r1) goto L_0x024f
            r5.A0J()     // Catch:{ Exception -> 0x0321 }
            r5.A0K()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x024f:
            r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x0253:
            java.lang.String r11 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x0258:
            int r9 = r5.A08()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x025d:
            int r10 = r5.A08()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x0262:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
        L_0x0265:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x0278
            X.1vX r8 = X.C40231uN.A00(r3, r5)     // Catch:{ Exception -> 0x0321 }
            long r1 = r8.A07     // Catch:{ Exception -> 0x0321 }
            r13.A0A(r1, r8)     // Catch:{ Exception -> 0x0321 }
            r14.add(r8)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0265
        L_0x0278:
            r5.A0H()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x027c:
            java.lang.String r12 = r5.A0D()     // Catch:{ Exception -> 0x0321 }
            goto L_0x022b
        L_0x0281:
            r5.A0I()     // Catch:{ Exception -> 0x0321 }
            if (r11 == 0) goto L_0x0293
            X.2fI r8 = new X.2fI     // Catch:{ Exception -> 0x0321 }
            r8.<init>(r10, r9, r12, r11)     // Catch:{ Exception -> 0x0321 }
            java.lang.String r2 = r8.A04     // Catch:{ Exception -> 0x0321 }
            r1 = r20
            r1.put(r2, r8)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0214
        L_0x0293:
            r1 = r21
            r1.put(r12, r14)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0214
        L_0x029a:
            r5.A0F()     // Catch:{ Exception -> 0x0321 }
            r9 = 0
        L_0x029e:
            boolean r1 = r5.A0M()     // Catch:{ Exception -> 0x0321 }
            if (r1 == 0) goto L_0x02d9
            X.1vX r10 = X.C40231uN.A00(r3, r5)     // Catch:{ Exception -> 0x0321 }
            java.lang.Integer r2 = r10.A0H     // Catch:{ Exception -> 0x0321 }
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ Exception -> 0x0321 }
            if (r2 != r1) goto L_0x02b0
            int r9 = r9 + 1
        L_0x02b0:
            r1 = r22
            r1.add(r10)     // Catch:{ Exception -> 0x0321 }
            long r1 = r10.A07     // Catch:{ Exception -> 0x0321 }
            r8 = r23
            r8.A0A(r1, r10)     // Catch:{ Exception -> 0x0321 }
            r1 = 4
            if (r9 <= r1) goto L_0x029e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0321 }
            r2.<init>()     // Catch:{ Exception -> 0x0321 }
            java.lang.String r1 = "You have "
            r2.append(r1)     // Catch:{ Exception -> 0x0321 }
            r2.append(r9)     // Catch:{ Exception -> 0x0321 }
            java.lang.String r1 = " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers."
            r2.append(r1)     // Catch:{ Exception -> 0x0321 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0321 }
            X.C196379ux.A00(r1)     // Catch:{ Exception -> 0x0321 }
            goto L_0x029e
        L_0x02d9:
            r5.A0H()     // Catch:{ Exception -> 0x0321 }
            goto L_0x0050
        L_0x02de:
            r1 = r16
            float r1 = (float) r1     // Catch:{ Exception -> 0x0321 }
            float r1 = r1 * r24
            int r8 = (int) r1     // Catch:{ Exception -> 0x0321 }
            float r1 = (float) r6     // Catch:{ Exception -> 0x0321 }
            float r1 = r1 * r24
            int r6 = (int) r1     // Catch:{ Exception -> 0x0321 }
            r2 = 0
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x0321 }
            r1.<init>(r2, r2, r8, r6)     // Catch:{ Exception -> 0x0321 }
            r3.A04 = r1     // Catch:{ Exception -> 0x0321 }
            r3.A02 = r15     // Catch:{ Exception -> 0x0321 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0321 }
            r3.A01 = r7     // Catch:{ Exception -> 0x0321 }
            r0 = r22
            r3.A07 = r0     // Catch:{ Exception -> 0x0321 }
            r0 = r23
            r3.A05 = r0     // Catch:{ Exception -> 0x0321 }
            r0 = r21
            r3.A0B = r0     // Catch:{ Exception -> 0x0321 }
            r0 = r20
            r3.A0A = r0     // Catch:{ Exception -> 0x0321 }
            r0 = r17
            r3.A06 = r0     // Catch:{ Exception -> 0x0321 }
            r0 = r19
            r3.A09 = r0     // Catch:{ Exception -> 0x0321 }
            r0 = r18
            r3.A08 = r0     // Catch:{ Exception -> 0x0321 }
            if (r4 == 0) goto L_0x031b
            X.1te r0 = X.C39791te.A01     // Catch:{ Exception -> 0x0321 }
            X.00z r0 = r0.A00     // Catch:{ Exception -> 0x0321 }
            r0.A08(r4, r3)     // Catch:{ Exception -> 0x0321 }
        L_0x031b:
            X.1yu r1 = new X.1yu     // Catch:{ Exception -> 0x0321 }
            r1.<init>((java.lang.Object) r3)     // Catch:{ Exception -> 0x0321 }
            goto L_0x0327
        L_0x0321:
            r0 = move-exception
            X.1yu r1 = new X.1yu     // Catch:{ all -> 0x032d }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x032d }
        L_0x0327:
            if (r25 == 0) goto L_0x032c
            X.C40171uH.A04(r5)
        L_0x032c:
            return r1
        L_0x032d:
            r0 = move-exception
            if (r25 == 0) goto L_0x0333
            X.C40171uH.A04(r5)
        L_0x0333:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39771tc.A03(X.1tt, java.lang.String, boolean):X.1yu");
    }

    public static String A08(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static C39811tg A06(Context context, int i) {
        String A08 = A08(context, i);
        return A07((Runnable) null, A08, new C39781td(context.getApplicationContext(), A08, new WeakReference(context), i));
    }
}
