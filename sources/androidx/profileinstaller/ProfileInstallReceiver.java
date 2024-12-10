package androidx.profileinstaller;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass0DT;
import X.AnonymousClass8BX;
import X.BE6;
import X.BEA;
import X.C108945cZ;
import X.C17880vN;
import X.C17890vO;
import X.C21470Akb;
import X.C24901COu;
import X.C25005CTf;
import X.C25299Cd3;
import X.C25366CeR;
import X.C25445Cfw;
import X.C26174Ctr;
import X.C26241Cve;
import X.C26627D6x;
import X.C27134DVv;
import X.C7V;
import X.CIF;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public static byte[] A01(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream A15 = C108945cZ.A15();
        try {
            deflaterOutputStream = new DeflaterOutputStream(A15, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return A15.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        File cacheDir;
        int i;
        C26627D6x d6x;
        C27134DVv dVv;
        Object obj;
        int i2;
        FileOutputStream A19;
        IllegalStateException th;
        long j;
        int i3;
        if (intent != null) {
            String action = intent.getAction();
            Context context2 = context;
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C27134DVv dVv2 = new C27134DVv(0);
                C26627D6x d6x2 = new C26627D6x(this);
                Context applicationContext = context2.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
                AssetManager assets = applicationContext.getAssets();
                String name = C108945cZ.A17(applicationInfo.sourceDir).getName();
                boolean z = false;
                try {
                    PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName, 0);
                    File filesDir = context2.getFilesDir();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Installing profile for ");
                    Log.d("ProfileInstaller", AnonymousClass000.A0y(context2.getPackageName(), A10));
                    C26241Cve cve = new C26241Cve(assets, d6x2, C17880vN.A0e(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"), name, dVv2);
                    if (cve.A07()) {
                        C26241Cve A06 = cve.A06();
                        C25005CTf[] cTfArr = A06.A02;
                        byte[] bArr = A06.A07;
                        if (!(cTfArr == null || bArr == null)) {
                            if (A06.A00) {
                                try {
                                    ByteArrayOutputStream A15 = C108945cZ.A15();
                                    try {
                                        A15.write(C26174Ctr.A00);
                                        A15.write(bArr);
                                        byte[] bArr2 = CIF.A06;
                                        if (Arrays.equals(bArr, bArr2)) {
                                            ArrayList A0z = C17880vN.A0z(3);
                                            ArrayList A0z2 = C17880vN.A0z(3);
                                            ByteArrayOutputStream A152 = C108945cZ.A15();
                                            int i4 = 2;
                                            try {
                                                C25299Cd3.A01(A152, 2, (long) r7);
                                                for (C25005CTf cTf : cTfArr) {
                                                    C25299Cd3.A01(A152, 4, cTf.A05);
                                                    C25299Cd3.A01(A152, 4, cTf.A01);
                                                    C25299Cd3.A01(A152, 4, (long) cTf.A04);
                                                    String A00 = C26174Ctr.A00(cTf.A06, cTf.A07, bArr2);
                                                    int length = A00.getBytes(StandardCharsets.UTF_8).length;
                                                    C25299Cd3.A00(A152, length);
                                                    i4 = i4 + 4 + 4 + 4 + 2 + length;
                                                    A152.write(A00.getBytes(StandardCharsets.UTF_8));
                                                }
                                                byte[] byteArray = A152.toByteArray();
                                                int length2 = byteArray.length;
                                                if (i4 == length2) {
                                                    C24901COu cOu = new C24901COu(AnonymousClass00R.A00, byteArray, false);
                                                    A152.close();
                                                    A0z.add(cOu);
                                                    A152 = C108945cZ.A15();
                                                    int i5 = 0;
                                                    for (int i6 = 0; i6 < r7; i6++) {
                                                        C25005CTf cTf2 = cTfArr[i6];
                                                        C25299Cd3.A01(A152, 2, (long) i6);
                                                        C25299Cd3.A01(A152, 2, (long) cTf2.A00);
                                                        i5 = i5 + 2 + 2 + (cTf2.A00 * 2);
                                                        int[] iArr = cTf2.A02;
                                                        int length3 = iArr.length;
                                                        int i7 = 0;
                                                        int i8 = 0;
                                                        while (i7 < length3) {
                                                            int i9 = iArr[i7];
                                                            C25299Cd3.A01(A152, 2, (long) (i9 - i8));
                                                            i7++;
                                                            i8 = i9;
                                                        }
                                                    }
                                                    byte[] byteArray2 = A152.toByteArray();
                                                    int length4 = byteArray2.length;
                                                    if (i5 == length4) {
                                                        C24901COu cOu2 = new C24901COu(AnonymousClass00R.A0C, byteArray2, true);
                                                        A152.close();
                                                        A0z.add(cOu2);
                                                        A152 = C108945cZ.A15();
                                                        int i10 = 0;
                                                        int i11 = 0;
                                                        while (i10 < r7) {
                                                            C25005CTf cTf3 = cTfArr[i10];
                                                            Iterator A0i = C17890vO.A0i(cTf3.A08);
                                                            int i12 = 0;
                                                            while (A0i.hasNext()) {
                                                                i12 |= BE6.A0F(C17890vO.A0P(A0i));
                                                            }
                                                            ByteArrayOutputStream A153 = C108945cZ.A15();
                                                            try {
                                                                C26174Ctr.A01(cTf3, A153);
                                                                byte[] byteArray3 = A153.toByteArray();
                                                                A153.close();
                                                                A153 = C108945cZ.A15();
                                                                C26174Ctr.A02(cTf3, A153);
                                                                byte[] byteArray4 = A153.toByteArray();
                                                                A153.close();
                                                                C25299Cd3.A00(A152, i10);
                                                                int length5 = byteArray3.length + 2 + byteArray4.length;
                                                                C25299Cd3.A01(A152, 4, (long) length5);
                                                                C25299Cd3.A00(A152, i12);
                                                                A152.write(byteArray3);
                                                                A152.write(byteArray4);
                                                                i11 = i11 + 2 + 4 + length5;
                                                                i10++;
                                                            } catch (Throwable th2) {
                                                                AnonymousClass0DT.A00(th, th2);
                                                            }
                                                        }
                                                        byte[] byteArray5 = A152.toByteArray();
                                                        int length6 = byteArray5.length;
                                                        if (i11 == length6) {
                                                            C24901COu cOu3 = new C24901COu(AnonymousClass00R.A0N, byteArray5, true);
                                                            A152.close();
                                                            A0z.add(cOu3);
                                                            long size = 12 + ((long) (A0z.size() * 16));
                                                            C25299Cd3.A01(A15, 4, (long) A0z.size());
                                                            for (int i13 = 0; i13 < A0z.size(); i13++) {
                                                                C24901COu cOu4 = (C24901COu) A0z.get(i13);
                                                                switch (cOu4.A00.intValue()) {
                                                                    case 0:
                                                                        j = 0;
                                                                        break;
                                                                    case 1:
                                                                        j = 1;
                                                                        break;
                                                                    case 2:
                                                                        j = 2;
                                                                        break;
                                                                    default:
                                                                        j = 3;
                                                                        break;
                                                                }
                                                                C25299Cd3.A01(A15, 4, j);
                                                                C25299Cd3.A01(A15, 4, size);
                                                                boolean z2 = cOu4.A01;
                                                                byte[] bArr3 = cOu4.A02;
                                                                if (z2) {
                                                                    long length7 = (long) bArr3.length;
                                                                    byte[] A01 = A01(bArr3);
                                                                    A0z2.add(A01);
                                                                    i3 = A01.length;
                                                                    C25299Cd3.A01(A15, 4, (long) i3);
                                                                    C25299Cd3.A01(A15, 4, length7);
                                                                } else {
                                                                    A0z2.add(bArr3);
                                                                    i3 = bArr3.length;
                                                                    C25299Cd3.A01(A15, 4, (long) i3);
                                                                    C25299Cd3.A01(A15, 4, 0);
                                                                }
                                                                size += (long) i3;
                                                            }
                                                            for (int i14 = 0; i14 < A0z2.size(); i14++) {
                                                                A15.write((byte[]) A0z2.get(i14));
                                                            }
                                                        } else {
                                                            th = AnonymousClass8BX.A0W(", does not match actual size ", BEA.A0p(i11), length6);
                                                        }
                                                    } else {
                                                        th = AnonymousClass8BX.A0W(", does not match actual size ", BEA.A0p(i5), length4);
                                                    }
                                                } else {
                                                    th = AnonymousClass8BX.A0W(", does not match actual size ", BEA.A0p(i4), length2);
                                                }
                                                throw th;
                                            } catch (Throwable th3) {
                                                A152.close();
                                                throw th3;
                                            }
                                        } else {
                                            byte[] bArr4 = CIF.A05;
                                            if (!Arrays.equals(bArr, bArr4)) {
                                                byte[] bArr5 = CIF.A03;
                                                if (Arrays.equals(bArr, bArr5)) {
                                                    C25299Cd3.A01(A15, 1, (long) r7);
                                                    for (C25005CTf cTf4 : cTfArr) {
                                                        int size2 = cTf4.A08.size() * 4;
                                                        String A002 = C26174Ctr.A00(cTf4.A06, cTf4.A07, bArr5);
                                                        C25299Cd3.A01(A15, 2, (long) A002.getBytes(StandardCharsets.UTF_8).length);
                                                        C25299Cd3.A01(A15, 2, (long) cTf4.A02.length);
                                                        C25299Cd3.A01(A15, 4, (long) size2);
                                                        C25299Cd3.A01(A15, 4, cTf4.A05);
                                                        A15.write(A002.getBytes(StandardCharsets.UTF_8));
                                                        Iterator A0k = C17890vO.A0k(cTf4.A08);
                                                        while (A0k.hasNext()) {
                                                            C25299Cd3.A01(A15, 2, (long) BE6.A0F(A0k.next()));
                                                            C25299Cd3.A01(A15, 2, 0);
                                                        }
                                                        for (int A003 : cTf4.A02) {
                                                            C25299Cd3.A00(A15, A003);
                                                        }
                                                    }
                                                } else {
                                                    bArr4 = CIF.A04;
                                                    if (!Arrays.equals(bArr, bArr4)) {
                                                        byte[] bArr6 = CIF.A02;
                                                        if (Arrays.equals(bArr, bArr6)) {
                                                            C25299Cd3.A00(A15, r8);
                                                            for (C25005CTf cTf5 : cTfArr) {
                                                                String A004 = C26174Ctr.A00(cTf5.A06, cTf5.A07, bArr6);
                                                                C25299Cd3.A01(A15, 2, (long) A004.getBytes(StandardCharsets.UTF_8).length);
                                                                TreeMap treeMap = cTf5.A08;
                                                                C25299Cd3.A01(A15, 2, (long) treeMap.size());
                                                                C25299Cd3.A01(A15, 2, (long) cTf5.A02.length);
                                                                C25299Cd3.A01(A15, 4, cTf5.A05);
                                                                A15.write(A004.getBytes(StandardCharsets.UTF_8));
                                                                Iterator A0k2 = C17890vO.A0k(treeMap);
                                                                while (A0k2.hasNext()) {
                                                                    C25299Cd3.A00(A15, BE6.A0F(A0k2.next()));
                                                                }
                                                                for (int A005 : cTf5.A02) {
                                                                    C25299Cd3.A00(A15, A005);
                                                                }
                                                            }
                                                        } else {
                                                            A06.A04.C3v(5, (Object) null);
                                                            A06.A02 = null;
                                                            A15.close();
                                                        }
                                                    }
                                                }
                                            }
                                            int i15 = 0;
                                            int i16 = 0;
                                            for (C25005CTf cTf6 : cTfArr) {
                                                i16 += C26174Ctr.A00(cTf6.A06, cTf6.A07, bArr4).getBytes(StandardCharsets.UTF_8).length + 16 + (cTf6.A00 * 2) + cTf6.A03 + (((((cTf6.A04 * 2) + 8) - 1) & -8) / 8);
                                            }
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i16);
                                            if (!Arrays.equals(bArr4, CIF.A04)) {
                                                for (C25005CTf cTf7 : cTfArr) {
                                                    C26174Ctr.A03(cTf7, byteArrayOutputStream, C26174Ctr.A00(cTf7.A06, cTf7.A07, bArr4));
                                                }
                                                while (i15 < r11) {
                                                    C25005CTf cTf8 = cTfArr[i15];
                                                    C26174Ctr.A02(cTf8, byteArrayOutputStream);
                                                    int[] iArr2 = cTf8.A02;
                                                    int length8 = iArr2.length;
                                                    int i17 = 0;
                                                    int i18 = 0;
                                                    while (i17 < length8) {
                                                        int i19 = iArr2[i17];
                                                        C25299Cd3.A00(byteArrayOutputStream, i19 - i18);
                                                        i17++;
                                                        i18 = i19;
                                                    }
                                                    C26174Ctr.A01(cTf8, byteArrayOutputStream);
                                                    i15++;
                                                }
                                            } else {
                                                while (i15 < r11) {
                                                    C25005CTf cTf9 = cTfArr[i15];
                                                    C26174Ctr.A03(cTf9, byteArrayOutputStream, C26174Ctr.A00(cTf9.A06, cTf9.A07, bArr4));
                                                    C26174Ctr.A02(cTf9, byteArrayOutputStream);
                                                    int[] iArr3 = cTf9.A02;
                                                    int length9 = iArr3.length;
                                                    int i20 = 0;
                                                    int i21 = 0;
                                                    while (i20 < length9) {
                                                        int i22 = iArr3[i20];
                                                        C25299Cd3.A00(byteArrayOutputStream, i22 - i21);
                                                        i20++;
                                                        i21 = i22;
                                                    }
                                                    C26174Ctr.A01(cTf9, byteArrayOutputStream);
                                                    i15++;
                                                }
                                            }
                                            if (byteArrayOutputStream.size() == i16) {
                                                byte[] byteArray6 = byteArrayOutputStream.toByteArray();
                                                C25299Cd3.A01(A15, 1, (long) r11);
                                                C25299Cd3.A01(A15, 4, (long) byteArray6.length);
                                                byte[] A012 = A01(byteArray6);
                                                C25299Cd3.A01(A15, 4, (long) A012.length);
                                                A15.write(A012);
                                            } else {
                                                StringBuilder A102 = AnonymousClass000.A10();
                                                A102.append("The bytes saved do not match expectation. actual=");
                                                A102.append(byteArrayOutputStream.size());
                                                throw AnonymousClass8BX.A0W(" expected=", A102, i16);
                                            }
                                        }
                                        A06.A01 = A15.toByteArray();
                                        A15.close();
                                    } catch (Throwable th4) {
                                        A15.close();
                                        throw th4;
                                    }
                                } catch (IOException e) {
                                    A06.A04.C3v(7, e);
                                } catch (IllegalStateException e2) {
                                    A06.A04.C3v(8, e2);
                                } catch (Throwable th5) {
                                    AnonymousClass0DT.A00(th4, th5);
                                }
                                A06.A02 = null;
                            } else {
                                throw AnonymousClass000.A0n("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                        byte[] bArr7 = A06.A01;
                        if (bArr7 != null) {
                            if (A06.A00) {
                                try {
                                    ByteArrayInputStream A0h = BE6.A0h(bArr7);
                                    try {
                                        A19 = C108945cZ.A19(A06.A05);
                                        byte[] bArr8 = new byte[512];
                                        while (true) {
                                            int read = A0h.read(bArr8);
                                            if (read > 0) {
                                                A19.write(bArr8, 0, read);
                                            } else {
                                                C26241Cve.A03(A06, (Object) null, 1);
                                                A19.close();
                                                A0h.close();
                                                A06.A01 = null;
                                                A06.A02 = null;
                                                C25366CeR.A00(packageInfo, filesDir);
                                                z = true;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        A0h.close();
                                        throw th6;
                                    }
                                } catch (FileNotFoundException e3) {
                                    C26241Cve.A03(A06, e3, 6);
                                    A06.A01 = null;
                                    A06.A02 = null;
                                    C25445Cfw.A00(context2, z);
                                    return;
                                } catch (IOException e4) {
                                    try {
                                        C26241Cve.A03(A06, e4, 7);
                                        A06.A01 = null;
                                        A06.A02 = null;
                                        C25445Cfw.A00(context2, z);
                                        return;
                                    } catch (Throwable th7) {
                                        A06.A01 = null;
                                        A06.A02 = null;
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    AnonymousClass0DT.A00(th6, th8);
                                }
                            } else {
                                throw AnonymousClass000.A0n("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                    }
                    C25445Cfw.A00(context2, z);
                    return;
                } catch (PackageManager.NameNotFoundException e5) {
                    d6x2.C3v(7, e5);
                    C25445Cfw.A00(context2, false);
                    return;
                }
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        dVv = new C27134DVv(0);
                        d6x = new C26627D6x(this);
                        try {
                            C25366CeR.A00(context2.getPackageManager().getPackageInfo(context2.getApplicationContext().getPackageName(), 0), context2.getFilesDir());
                            obj = null;
                            i2 = 10;
                        } catch (PackageManager.NameNotFoundException e6) {
                            dVv.execute(new C21470Akb((Object) d6x, 7, 3, (Object) e6));
                            return;
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        dVv = new C27134DVv(0);
                        d6x = new C26627D6x(this);
                        C17880vN.A0e(context2.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        obj = null;
                        i2 = 11;
                    } else {
                        return;
                    }
                    dVv.execute(new C21470Akb((Object) d6x, i2, 3, obj));
                    return;
                }
                return;
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                C26627D6x d6x3 = new C26627D6x(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    i = 12;
                } else {
                    i = 13;
                }
                d6x3.C3v(i, (Object) null);
                return;
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C26627D6x d6x4 = new C26627D6x(this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i23 = Build.VERSION.SDK_INT;
                    if (i23 >= 24) {
                        cacheDir = C7V.A00(context2);
                    } else if (i23 >= 23) {
                        cacheDir = context2.getCodeCacheDir();
                    } else {
                        cacheDir = context2.getCacheDir();
                    }
                    boolean A006 = A00(cacheDir);
                    int i24 = 15;
                    if (A006) {
                        i24 = 14;
                    }
                    d6x4.C3v(i24, (Object) null);
                    return;
                }
                d6x4.C3v(16, (Object) null);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public static boolean A00(File file) {
        boolean z = true;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            z = false;
            if (listFiles != null) {
                boolean z2 = true;
                for (File A00 : listFiles) {
                    if (A00(A00)) {
                        boolean z3 = z2;
                        z2 = true;
                        if (z3) {
                        }
                    }
                    z2 = false;
                }
                return z2;
            }
        } else {
            file.delete();
        }
        return z;
    }
}
