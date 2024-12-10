package X;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0vW  reason: invalid class name and case insensitive filesystem */
public class C17970vW {
    public static Boolean A00;
    public static Boolean A01;
    public static String A02;
    public static Boolean A03;
    public static final AnonymousClass00H A04 = new C18150vq((Object) null, new C70933Db(7));
    public static final byte[] A05 = {0, 2};
    public static volatile Boolean A06;
    public static volatile Boolean A07;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[SYNTHETIC, Splitter:B:11:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e A[SYNTHETIC, Splitter:B:27:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00() {
        /*
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 0
            java.lang.String r1 = "/proc/sys/kernel/osrelease"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x001d }
            r0.<init>(r1)     // Catch:{ all -> 0x001d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x001d }
            r2.<init>(r0)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0020 }
            r4.append(r0)     // Catch:{ all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x002c
        L_0x001d:
            r0 = move-exception
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r0 = move-exception
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0026:
            throw r0     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            java.lang.String r0 = "Unknown release"
            r4.append(r0)
        L_0x002c:
            java.lang.String r1 = "/proc/sys/kernel/version"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ all -> 0x0048 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0048 }
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            r0 = 32
            r4.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x004b }
            r4.append(r0)     // Catch:{ all -> 0x004b }
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0057
        L_0x0048:
            r0 = move-exception
            r1 = r2
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0051:
            throw r0     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            java.lang.String r0 = " unknown version"
            r4.append(r0)
        L_0x0057:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vW.A00():java.lang.String");
    }

    public static String A02(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[65536];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return A06(instance.digest());
                }
            }
        } catch (Exception e) {
            Log.e("app/sha/bytes/error ", e);
            return "";
        }
    }

    public static String A03(String str) {
        String str2 = "";
        try {
            Process start = new ProcessBuilder(new String[]{"/system/bin/getprop", str}).redirectErrorStream(true).start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str2 = readLine;
                } else {
                    start.destroy();
                    return str2;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String A04(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return A07(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String A05(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            return A07(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A06(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(r6 * 2)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            cArr2[i] = cArr[b2 >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    public static String A07(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >>> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static SecretKey A08(String str, byte[] bArr, char[] cArr, int i, int i2) {
        try {
            try {
                return SecretKeyFactory.getInstance(str).generateSecret(new PBEKeySpec(cArr, bArr, i, i2));
            } catch (InvalidKeySpecException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void A0A(File file, byte[] bArr) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bArr);
            objectOutputStream.close();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static boolean A0B() {
        String str = A02;
        if (str == null) {
            String str2 = Build.MANUFACTURER;
            str = "";
            if (str2 == null) {
                str2 = str;
            }
            String str3 = Build.VERSION.RELEASE;
            if (str3 == null) {
                str3 = str;
            }
            String str4 = Build.DISPLAY;
            if (str4 == null) {
                str4 = str;
            }
            String str5 = Build.MODEL;
            if (str5 == null) {
                str5 = str;
            }
            String A002 = A00();
            String str6 = "cyanogen";
            if (!A002.toLowerCase(Locale.US).contains(str6)) {
                str6 = "debug";
                if (!str2.toLowerCase(Locale.US).contains(str6) && !str3.toLowerCase(Locale.US).contains(str6) && !str4.toLowerCase(Locale.US).contains(str6) && !str5.toLowerCase(Locale.US).contains(str6) && !A002.toLowerCase(Locale.US).contains(str6)) {
                    if (str4.startsWith("Darky")) {
                        str = "darky";
                    } else if (str2.startsWith("XDAndroid")) {
                        str = "xdandroid";
                    } else if (str3.startsWith("FroydVillain")) {
                        str = "froydvillain";
                    } else if (str3.startsWith("VillainROM") || str4.startsWith("VillainROM")) {
                        str = "villainrom";
                    } else if (str3.startsWith("WildPuzzle")) {
                        str = "wildpuzzle";
                    } else if (str4.startsWith("MIUI")) {
                        str = "miui";
                    } else if (str4.startsWith("ITFUNZ")) {
                        str = "itfunz";
                    } else if (str4.startsWith("DebusROM")) {
                        str = "debus";
                    } else if (str4.startsWith("FreeX10")) {
                        str = "freex10";
                    } else if (str4.startsWith("Perception Build")) {
                        str = "perception";
                    } else if (str4.startsWith("Bionix")) {
                        str = "bionix";
                    } else if (str4.startsWith("Lite'ning Rom")) {
                        str = "litening";
                    } else if (str4.startsWith("GINGERVillain")) {
                        str = "gingervillian";
                    } else if (str4.startsWith("GingerReal")) {
                        str = "gingerreal";
                    } else if (str4.startsWith("R.U.R.1920")) {
                        str = "rur1920";
                    } else if (str5.startsWith("MoDaCo")) {
                        str = "modaco";
                    } else if (str4.startsWith("CriskeloROM")) {
                        str = "criskelorom";
                    } else if (str4.startsWith("LeeDrOiD")) {
                        str = "leedroid";
                    } else if (str4.startsWith("Dexter's FolioMod")) {
                        str = "foliomod";
                    } else if (str4.startsWith("Andro-ID")) {
                        str = "andro-id";
                    } else if (str4.startsWith("FroyoPlus")) {
                        str = "froyoplus";
                    } else if (str4.startsWith("PilotxRom")) {
                        str = "pilotx";
                    } else if (str4.startsWith("Achotjan")) {
                        str = "achotjan";
                    } else if (A002.contains("FuguMod")) {
                        str = "fugu";
                    } else if (A002.contains("fakeShmoo")) {
                        str = "fakeshmoo";
                    } else if (A002.contains("LorDmodNCTeam")) {
                        str = "lordmod";
                    } else if (A002.contains("-RCMIX")) {
                        str = "rcmix";
                    } else if (str4.contains("DamianGTO")) {
                        str = "damiangto";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("app/custom-rom ");
                    sb.append(str);
                    Log.i(sb.toString());
                    A02 = str;
                }
            }
            str = str6;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("app/custom-rom ");
            sb2.append(str);
            Log.i(sb2.toString());
            A02 = str;
        }
        if (str.length() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r1.contains("simulator") != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C() {
        /*
            java.lang.Boolean r0 = A07
            if (r0 != 0) goto L_0x00b1
            java.lang.Class<X.0vW> r3 = X.C17970vW.class
            monitor-enter(r3)
            java.lang.String r0 = android.os.Build.BRAND     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "generic"
            boolean r0 = r0.startsWith(r2)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = android.os.Build.DEVICE     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.startsWith(r2)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
        L_0x0019:
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x00ae }
            boolean r0 = r1.startsWith(r2)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "unknown"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "goldfish"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "ranchu"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "google_sdk"
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Emulator"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "Android SDK built for x86"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Genymotion"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "sdk_google"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r1.contains(r2)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "sdk_gphone64_arm64"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "simulator"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x00ae }
            r0 = 0
            if (r1 == 0) goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00ae }
            A07 = r0     // Catch:{ all -> 0x00ae }
            monitor-exit(r3)     // Catch:{ all -> 0x00ae }
            goto L_0x00b1
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ae }
            throw r0
        L_0x00b1:
            java.lang.Boolean r0 = A07
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vW.A0C():boolean");
    }

    public static boolean A0D() {
        return A03("fb.running_sapienz").equals("true");
    }

    public static boolean A0E(Context context, String str, byte[] bArr) {
        new String(bArr);
        File file = new File(context.getFilesDir(), "rc2");
        StringBuilder sb = new StringBuilder();
        sb.append(C197569wu.A0Z);
        sb.append(str);
        String obj = sb.toString();
        byte[] bArr2 = A05;
        try {
            byte[] A0I = A0I(4);
            byte[] A0I2 = A0I(16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A0L(A0I, obj), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(A0I2));
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr3 = new byte[(2 + A0I.length + A0I2.length + doFinal.length)];
            byte[][] bArr4 = {bArr2, A0I, A0I2, doFinal};
            int i = 0;
            int i2 = 0;
            do {
                byte[] bArr5 = bArr4[i];
                System.arraycopy(bArr5, 0, bArr3, i2, bArr5.length);
                i2 += bArr5.length;
                i++;
            } while (i < 4);
            A0A(file, bArr3);
            return Arrays.equals(bArr3, A0K(file));
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unable to write ");
            sb2.append(file.toString());
            Log.e(sb2.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        new java.io.FileInputStream(r2).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0132 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0G(X.AnonymousClass11C r9) {
        /*
            java.lang.Boolean r0 = A03
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001d
        L_0x0011:
            r0 = 1
        L_0x0012:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A03 = r0
        L_0x0018:
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001d:
            java.lang.String r1 = "/system/app/Superuser.apk"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x002b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002b }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x002b }
            if (r0 == 0) goto L_0x002b
            goto L_0x0011
        L_0x002b:
            java.lang.String r0 = "/system/bin/su"
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.lang.String r0 = "/system/xbin/su"
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r5 = 2
            boolean r4 = r3.canExecute()     // Catch:{ Exception -> 0x0045, NoSuchMethodError -> 0x0047 }
            boolean r5 = r2.canExecute()     // Catch:{ Exception -> 0x005f, NoSuchMethodError -> 0x0043 }
            goto L_0x005f
        L_0x0043:
            r6 = move-exception
            goto L_0x0049
        L_0x0045:
            r4 = 2
            goto L_0x005f
        L_0x0047:
            r6 = move-exception
            r4 = 2
        L_0x0049:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/check/nomethod "
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0, r6)
        L_0x005f:
            java.lang.String r1 = android.os.Build.PRODUCT
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r8 = 1
            if (r0 != 0) goto L_0x00bb
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r6 = "sdk"
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00bb
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00bb
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00bb
            android.net.ConnectivityManager r0 = r9.A0E()
            if (r0 == 0) goto L_0x00bb
            X.11B r0 = r9.A0O()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = A01(r0)     // Catch:{ NullPointerException -> 0x00bb }
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bb
            android.telephony.TelephonyManager r0 = r9.A0K()
            if (r0 == 0) goto L_0x00bb
            r8 = 0
        L_0x00bb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "app/dly "
            r1.append(r7)
            boolean r0 = r3.exists()
            r1.append(r0)
            boolean r0 = r3.canRead()
            r1.append(r0)
            boolean r0 = r3.canWrite()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r6 = ".0"
            java.lang.String r4 = ""
            r0 = r4
            if (r8 == 0) goto L_0x00e5
            r0 = r6
        L_0x00e5:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            boolean r0 = r2.exists()
            r1.append(r0)
            boolean r0 = r2.canRead()
            r1.append(r0)
            boolean r0 = r2.canWrite()
            r1.append(r0)
            r1.append(r5)
            if (r8 != 0) goto L_0x0112
            r6 = r4
        L_0x0112:
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0011
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0011
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0132 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0132 }
            r0.close()     // Catch:{ Exception -> 0x0132 }
            goto L_0x0011
        L_0x0132:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x013c }
            r0.<init>(r2)     // Catch:{ Exception -> 0x013c }
            r0.close()     // Catch:{ Exception -> 0x013c }
            goto L_0x0011
        L_0x013c:
            r0 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17970vW.A0G(X.11C):boolean");
    }

    public static byte[] A0H() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(160, C22691Cv.A00());
            return instance.generateKey().getEncoded();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0I(int i) {
        byte[] bArr = new byte[i];
        C22691Cv.A00().nextBytes(bArr);
        return bArr;
    }

    public static byte[] A0M(byte[] bArr, byte[]... bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(new SecretKeySpec(bArr, "HmacSHA1"));
            for (char c = 0; c < 1; c = 1) {
                instance.update(bArr2[c]);
            }
            return instance.doFinal();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public static String A01(AnonymousClass11B r1) {
        C17960vV.A07(r1);
        return Settings.Secure.getString(r1.A00, "android_id");
    }

    public static void A09(Context context) {
        new File(context.getFilesDir(), "rc2").delete();
    }

    public static boolean A0F(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 0 || action == 1) {
            if (motionEvent.getDeviceId() == 0 || (motionEvent.getDevice() != null && motionEvent.getDevice().isVirtual())) {
                return true;
            }
            if (!(motionEvent.getMetaState() == 0 && motionEvent.getEdgeFlags() == 0 && motionEvent.getSize() == 1.0f && motionEvent.getYPrecision() == 1.0f && motionEvent.getXPrecision() == 1.0f && motionEvent.getToolMajor() == 0.0f && motionEvent.getToolMinor() == 0.0f && motionEvent.getTouchMajor() == 0.0f && motionEvent.getTouchMinor() == 0.0f && motionEvent.getOrientation() == 0.0f)) {
                z2 = false;
            }
            float pressure = motionEvent.getPressure();
            if (action != 0 ? pressure != 0.0f : pressure != 1.0f) {
                z = false;
            } else {
                z = true;
            }
            if (!z2 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static byte[] A0J(Context context, String str) {
        File file;
        Throwable th;
        try {
            file = new File(context.getFilesDir(), "rc2");
            StringBuilder sb = new StringBuilder();
            sb.append(C197569wu.A0Z);
            sb.append(str);
            String obj = sb.toString();
            byte[] bArr = A05;
            byte[] A0K = A0K(file);
            if (A0K == null) {
                return null;
            }
            int length = A0K.length;
            if (length >= 42) {
                byte[] bArr2 = new byte[2];
                System.arraycopy(A0K, 0, bArr2, 0, 2);
                if (Arrays.equals(bArr2, bArr)) {
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(A0K, 2, bArr3, 0, 4);
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(A0K, 6, bArr4, 0, 16);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(A0L(bArr3, obj), "AES/OFB/NoPadding");
                    Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
                    instance.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                    return instance.doFinal(A0K, 22, length - 22);
                }
                th = new C18130vo();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.toString());
                sb2.append(" size mismatch");
                th = new InvalidParameterException(sb2.toString());
            }
            throw th;
        } catch (Exception e) {
            file.delete();
            if (e instanceof C18130vo) {
                throw e;
            }
            throw new RuntimeException(e);
        } catch (C18130vo e2) {
            Log.w("recovery token header mismatch", e2);
            return null;
        }
    }

    public static byte[] A0K(File file) {
        ObjectInputStream objectInputStream;
        if (!file.exists() || file.length() <= 0) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                byte[] bArr = (byte[]) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                return bArr;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (Exception e) {
            Log.w("get byte array", e);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    public static byte[] A0L(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return new SecretKeySpec(A08("PBKDF2WithHmacSHA1And8BIT", bArr, cArr, 16, 128).getEncoded(), "AES").getEncoded();
    }
}
