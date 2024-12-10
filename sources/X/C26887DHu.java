package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.DHu  reason: case insensitive filesystem */
public final class C26887DHu implements C28440E1g {
    public static Boolean A01;
    public static Long A02;
    public static final C26240Cvd A03;
    public static final CQ7 A04;
    public static final CQ7 A05 = new CQ7(new CQ7(new CQ7(Uri.parse(BEB.A0e("content://com.google.android.gms.phenotype/", Uri.encode("com.google.android.gms.clearcut.public"))), "", "").A00, "gms:playlog:service:sampling_", "").A00, "gms:playlog:service:sampling_", "LogSampling__");
    public static final HashMap A06 = C17880vN.A11();
    public static final ConcurrentHashMap A07 = AnonymousClass8BR.A17();
    public static final Charset A08 = Charset.forName(DefaultCrypto.UTF_8);
    public final Context A00;

    public C26887DHu(Context context) {
        this.A00 = context;
        if (context != null) {
            C26240Cvd.A02(context);
        }
    }

    public static long A02(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static void A03(byte[] bArr, long[] jArr, int i, long j, long j2) {
        long A022 = A02(bArr, i);
        long A023 = A02(bArr, i + 8);
        long A024 = A02(bArr, i + 16);
        long A025 = A02(bArr, i + 24);
        long j3 = j + A022;
        long j4 = A023 + j3 + A024;
        jArr[0] = j4 + A025;
        jArr[1] = Long.rotateRight(j2 + j3 + A025, 21) + Long.rotateRight(j4, 44) + j3;
    }

    static {
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        CQ7 cq7 = new CQ7(new CQ7(new CQ7(Uri.parse(BE9.A0o("content://com.google.android.gms.phenotype/", valueOf, valueOf.length())), "", "").A00, "gms:playlog:service:samplingrules_", "").A00, "gms:playlog:service:samplingrules_", "LogSamplingRules__");
        A04 = cq7;
        A03 = new C26240Cvd(cq7, false, "enable_log_sampling_rules");
    }

    public static long A00(Context context) {
        Object obj;
        Long l = A02;
        if (l == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            Boolean bool = A01;
            if (bool == null) {
                bool = Boolean.valueOf(AnonymousClass000.A1P(C41401wK.A00(context).A00.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES")));
                A01 = bool;
            }
            if (bool.booleanValue()) {
                ContentResolver contentResolver = context.getContentResolver();
                Class<C26100CsK> cls = C26100CsK.class;
                synchronized (cls) {
                    C26100CsK.A01(contentResolver);
                    obj = C26100CsK.A00;
                }
                HashMap hashMap = C26100CsK.A03;
                long j2 = 0;
                long j3 = 0L;
                synchronized (cls) {
                    if (hashMap.containsKey("android_id")) {
                        Object obj2 = hashMap.get("android_id");
                        if (obj2 != null) {
                            j3 = obj2;
                        }
                    } else {
                        j3 = null;
                    }
                }
                Number number = (Number) j3;
                if (number != null) {
                    j = number.longValue();
                } else {
                    String A002 = C26100CsK.A00(contentResolver, "android_id");
                    if (A002 != null) {
                        try {
                            long parseLong = Long.parseLong(A002);
                            number = Long.valueOf(parseLong);
                            j2 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    synchronized (cls) {
                        if (obj == C26100CsK.A00) {
                            hashMap.put("android_id", number);
                            C26100CsK.A01.remove("android_id");
                        }
                    }
                    j = j2;
                }
            }
            l = Long.valueOf(j);
            A02 = l;
        }
        return l.longValue();
    }

    public static long A01(String str, long j) {
        ByteBuffer allocate;
        long rotateRight;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        String str2 = str;
        if (str == null || str2.isEmpty()) {
            allocate = ByteBuffer.allocate(8);
        } else {
            byte[] bytes = str2.getBytes(A08);
            allocate = ByteBuffer.allocate(bytes.length + 8);
            allocate.put(bytes);
        }
        allocate.putLong(j);
        byte[] array = allocate.array();
        int length = array.length;
        if (length <= length) {
            if (length <= 32) {
                if (length > 16) {
                    j4 = ((long) (length << 1)) - 7286425919675154353L;
                    long A022 = A02(array, 0) * -5435081209227447693L;
                    long A023 = A02(array, 8);
                    long A024 = A02(array, length - 8) * j4;
                    j2 = Long.rotateRight(A022 + A023, 43) + Long.rotateRight(A024, 30) + (A02(array, length - 16) * -7286425919675154353L);
                    j3 = A022 + Long.rotateRight(A023 - 7286425919675154353L, 18) + A024;
                } else if (length >= 8) {
                    j4 = ((long) (length << 1)) - 7286425919675154353L;
                    long A025 = A02(array, 0) - 7286425919675154353L;
                    long A026 = A02(array, length - 8);
                    j2 = (Long.rotateRight(A026, 37) * j4) + A025;
                    j3 = (Long.rotateRight(A025, 25) + A026) * j4;
                } else if (length >= 4) {
                    j4 = ((long) (length << 1)) - 7286425919675154353L;
                    j2 = ((long) length) + (BE7.A0C(((array[3] & 255) << 24) | BE7.A0A(array, 2, BE7.A09(array, 1, array[0] & 255))) << 3);
                    j3 = BE7.A0C(BEB.A08(array, length - 4));
                } else if (length <= 0) {
                    return -7286425919675154353L;
                } else {
                    long j7 = (((long) ((array[0] & 255) + ((array[length >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((array[length - 1] & 255) << 2))) * -4348849565147123417L);
                    return (j7 ^ (j7 >>> 47)) * -7286425919675154353L;
                }
            } else if (length <= 64) {
                j4 = ((long) (length << 1)) - 7286425919675154353L;
                long A027 = A02(array, 0) * -7286425919675154353L;
                long A028 = A02(array, 8);
                long A029 = A02(array, length - 8) * j4;
                long rotateRight2 = Long.rotateRight(A027 + A028, 43) + Long.rotateRight(A029, 30) + (A02(array, length - 16) * -7286425919675154353L);
                long rotateRight3 = A027 + Long.rotateRight(A028 - 7286425919675154353L, 18) + A029;
                long j8 = (rotateRight2 ^ rotateRight3) * j4;
                long j9 = ((j8 ^ (j8 >>> 47)) ^ rotateRight3) * j4;
                long A0210 = A02(array, 16) * j4;
                long A0211 = A02(array, 24);
                long A0212 = (rotateRight2 + A02(array, length - 32)) * j4;
                long rotateRight4 = Long.rotateRight(A0210 + A0211, 43) + Long.rotateRight(A0212, 30);
                long rotateRight5 = A0210 + Long.rotateRight(A0211 + A027, 18) + A0212;
                long A0213 = ((rotateRight4 + ((((j9 ^ (j9 >>> 47)) * j4) + A02(array, length - 24)) * j4)) ^ rotateRight5) * j4;
                j5 = ((A0213 ^ (A0213 >>> 47)) ^ rotateRight5) * j4;
                j6 = j5 >>> 47;
                return (j5 ^ j6) * j4;
            } else {
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long A0214 = A02(array, 0) + 95310865018149119L;
                int i = length - 1;
                int i2 = (i / 64) << 6;
                int i3 = i & 63;
                int i4 = (i3 + i2) - 63;
                long j10 = 2480279821605975764L;
                long j11 = 1390051526045402406L;
                int i5 = 0;
                while (true) {
                    rotateRight = (Long.rotateRight(((A0214 + j10) + jArr[0]) + A02(array, i5 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
                    j10 = (Long.rotateRight(j10 + jArr[1] + A02(array, i5 + 48), 42) * -5435081209227447693L) + jArr[0] + A02(array, i5 + 40);
                    A0214 = Long.rotateRight(j11 + jArr2[0], 33) * -5435081209227447693L;
                    byte[] bArr = array;
                    A03(bArr, jArr, i5, jArr[1] * -5435081209227447693L, rotateRight + jArr2[0]);
                    A03(bArr, jArr2, i5 + 32, A0214 + jArr2[1], j10 + A02(array, i5 + 16));
                    i5 += 64;
                    if (i5 == i2) {
                        break;
                    }
                    j11 = rotateRight;
                }
                long j12 = -5435081209227447693L + ((rotateRight & 255) << 1);
                long j13 = jArr2[0] + ((long) i3);
                jArr2[0] = j13;
                long j14 = jArr[0] + j13;
                jArr[0] = j14;
                jArr2[0] = jArr2[0] + j14;
                long rotateRight6 = (Long.rotateRight(((A0214 + j10) + jArr[0]) + A02(array, i4 + 8), 37) * j12) ^ (jArr2[1] * 9);
                long rotateRight7 = (Long.rotateRight(j10 + jArr[1] + A02(array, i4 + 48), 42) * j12) + (jArr[0] * 9) + A02(array, i4 + 40);
                long rotateRight8 = Long.rotateRight(rotateRight + jArr2[0], 33) * j12;
                A03(array, jArr, i4, jArr[1] * j12, rotateRight6 + jArr2[0]);
                A03(array, jArr2, i4 + 32, rotateRight8 + jArr2[1], A02(array, i4 + 16) + rotateRight7);
                long j15 = jArr[0];
                long j16 = jArr2[0];
                long j17 = (j15 ^ j16) * j12;
                long j18 = ((j17 ^ (j17 >>> 47)) ^ j16) * j12;
                j2 = ((j18 ^ (j18 >>> 47)) * j12) + (((rotateRight7 >>> 47) ^ rotateRight7) * -4348849565147123417L) + rotateRight6;
                long j19 = jArr[1];
                long j20 = jArr2[1];
                long j21 = (j19 ^ j20) * j12;
                long j22 = ((j21 ^ (j21 >>> 47)) ^ j20) * j12;
                j3 = ((j22 ^ (j22 >>> 47)) * j12) + rotateRight8;
                j4 = j12;
            }
            long j23 = (j2 ^ j3) * j4;
            j5 = ((j23 ^ (j23 >>> 47)) ^ j3) * j4;
            j6 = j5 >>> 47;
            return (j5 ^ j6) * j4;
        }
        throw BE6.A0l(AnonymousClass001.A1I("Out of bound index with offput: 0 and length: ", BE6.A0t(67), length));
    }
}
