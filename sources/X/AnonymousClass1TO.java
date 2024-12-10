package X;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.1TO  reason: invalid class name */
public class AnonymousClass1TO {
    public final C19880zA A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11S A02;
    public final C25001Mm A03;
    public final AnonymousClass1TK A04;
    public final AnonymousClass1SI A05;
    public final AnonymousClass1TL A06;
    public final AnonymousClass1M9 A07;
    public final C25111Mx A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass1P3 A0A;
    public final AnonymousClass1M4 A0B;
    public final AnonymousClass1TD A0C;
    public final AnonymousClass1CJ A0D;
    public final AnonymousClass122 A0E;
    public final AnonymousClass1MZ A0F;
    public final AnonymousClass1MX A0G;
    public final AnonymousClass1NK A0H;
    public final AnonymousClass1NJ A0I;
    public final AnonymousClass1TG A0J;
    public final C24661Le A0K;
    public final AnonymousClass1MF A0L;
    public final C24751Ln A0M;
    public final AnonymousClass1RL A0N;
    public final AnonymousClass1RK A0O;
    public final AnonymousClass1RE A0P;
    public final AnonymousClass1TH A0Q;
    public final C26391Ry A0R;
    public final C18030ve A0S;
    public final AnonymousClass18K A0T;
    public final C25241Nl A0U;
    public final C219317y A0V;
    public final AnonymousClass1T7 A0W;
    public final AnonymousClass1T6 A0X;
    public final AnonymousClass1PP A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final SecureRandom A0d = new SecureRandom();
    public final C26371Rw A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;

    public static int A00(C88344Zh r1, AnonymousClass1TO r2, int i, int i2, boolean z) {
        C62142qr r0;
        if (z) {
            return C18020vd.A00(C18040vf.A02, r2.A0S, 8778);
        } else if (r1 == null || i != 2 || i2 == 0 || (r0 = r1.A07) == null || !r0.A0D) {
            return 5000;
        } else {
            return Math.max(Math.min(C18020vd.A00(C18040vf.A02, r2.A0S, 7897), 7000), 4000);
        }
    }

    public static long A01(AnonymousClass2SB r39, DeviceJid deviceJid, AnonymousClass1TO r41, AnonymousClass8X2 r42, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        long j8 = j;
        int i5 = i4;
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        long j9 = j6;
        long j10 = j5;
        long j11 = j4;
        String str5 = str2;
        long j12 = j3;
        AnonymousClass8X2 r12 = r42;
        long j13 = j2;
        DeviceJid deviceJid2 = deviceJid;
        AnonymousClass2SB r8 = r39;
        AnonymousClass1TO r11 = r41;
        String str6 = str;
        String str7 = str3;
        if (z) {
            if (((long) r12.A0C().A0J((EAO) null)) < ((long) C18020vd.A00(C18040vf.A02, r11.A0S, 3680)) * 1000) {
                r11.A0e.A0C(r39, i7, i8, (long) i6, true, false);
                if (i2 == 0) {
                    r11.A0P.A01(true);
                }
                A04(r8, deviceJid2, (C61382pa) null, r11, r12, str6, str5, (String) null, (String) null, (String) null, (String) null, str7, i8, i7, i6, i5, j8, j13, j12, j11, j10, j9, 0, true);
                return 0;
            }
        }
        try {
            File A012 = r11.A0V.A00.A01("");
            A012.getAbsolutePath();
            C64062u9.A0C(r12.A0C(), A012);
            C62022qf r1 = new C62022qf(false, false, true);
            C26551So r0 = C26551So.A0O;
            C63722ta r36 = new C63722ta(C60422o0.A00((C61382pa) null, r0, str4, 0, true), C50312Ty.A00(Uri.fromFile(A012), (AnonymousClass6nF) null, r0, (AnonymousClass73B) null, 0, false, false), r1, (String) null, 0);
            long length = A012.length();
            r11.A0e.A0C(r8, i7, i8, (long) i6, true, true);
            AnonymousClass1T6 r2 = r11.A0X;
            AnonymousClass34B A0C2 = r2.A0C(r36, false);
            A0C2.A0Z = "mms";
            r2.A0J(A0C2, (String) null);
            A0C2.A07(new C70243Ah(r8, deviceJid2, A0C2, r11, r12, A012, str6, str7, str5, i7, i6, i8, i5, j10, length, j13, j12, j11, j7, j8, j9), (Executor) null);
            return length;
        } catch (IOException e) {
            Log.e("history-sync-send-methods/save-to-file: failed", e);
            r11.A0e.A0C(r8, i7, i8, (long) i6, false, true);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1.A0A != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r1.A0B != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r1.A06 != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r1 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        if (r1.A05 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r1 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        if (r1.A0C != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        return new X.C195629te(r3, X.C18020vd.A00(X.C18040vf.A02, r12.A0S, 6050), r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1.A08 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.A07 != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C195629te A02(X.C88344Zh r11, X.AnonymousClass1TO r12) {
        /*
            com.whatsapp.jid.DeviceJid r0 = r11.A08
            X.C62832s4.A00(r0)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            X.2qr r1 = r11.A07
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.A08
            r5 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0010:
            r5 = 0
            if (r1 == 0) goto L_0x0018
        L_0x0013:
            boolean r0 = r1.A07
            r6 = 1
            if (r0 != 0) goto L_0x001b
        L_0x0018:
            r6 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001b:
            boolean r0 = r1.A0A
            r7 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0020:
            r7 = 0
            if (r1 == 0) goto L_0x0028
        L_0x0023:
            boolean r0 = r1.A0B
            r8 = 1
            if (r0 != 0) goto L_0x002b
        L_0x0028:
            r8 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002b:
            boolean r0 = r1.A06
            r9 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0030:
            r9 = 0
            if (r1 == 0) goto L_0x0038
        L_0x0033:
            boolean r0 = r1.A05
            r10 = 1
            if (r0 != 0) goto L_0x003b
        L_0x0038:
            r10 = 0
            if (r1 == 0) goto L_0x0040
        L_0x003b:
            boolean r0 = r1.A0C
            r11 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r11 = 0
        L_0x0041:
            X.0ve r2 = r12.A0S
            r1 = 6050(0x17a2, float:8.478E-42)
            X.0vf r0 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r0, r2, r1)
            X.9te r2 = new X.9te
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TO.A02(X.4Zh, X.1TO):X.9te");
    }

    public static void A05(AnonymousClass2SB r14, AnonymousClass1TO r15, String str, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        int i4 = i;
        int i5 = i3;
        if (i == 0) {
            r15.A0P.A01(false);
        } else {
            int i6 = 6;
            if (i4 == 6) {
                AnonymousClass1TL r2 = r15.A06;
                if (i5 != 5) {
                    i6 = 5;
                }
                r2.A02(Integer.valueOf(i6), str, 3);
            }
        }
        r15.A0e.A0B(r14, i4, i2, i5, j, j2, j3, j4, 0);
    }

    public static void A06(AnonymousClass1BI r7, AnonymousClass1TO r8, C45662Ay r9, long j, long j2) {
        C28781at r5;
        Throwable th;
        AnonymousClass2R7 r0;
        AnonymousClass1NJ r3 = r8.A0I;
        C29691ci A0A2 = r3.A01.A0A(r7);
        if (A0A2 != null) {
            if (A0A2.A0J == Long.MIN_VALUE) {
                String[] strArr = {String.valueOf(r3.A00.A09(r7))};
                r5 = r3.A02.get();
                Cursor A0A3 = ((C28801av) r5).A02.A0A("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1", "GET_FIRST_SORT_REF_SQL", strArr);
                try {
                    if (A0A3.moveToFirst()) {
                        A0A2.A0J = A0A3.getLong(A0A3.getColumnIndexOrThrow("sort_id"));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/getfirstsortref can't get value for ");
                        sb.append(r7);
                        Log.w(sb.toString());
                    }
                    try {
                        A0A3.close();
                        r5.close();
                    } catch (Throwable th2) {
                        try {
                            r5.close();
                            throw th2;
                        } catch (Throwable th3) {
                            AnonymousClass0DT.A00(th2, th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th, th4);
                }
            }
            long j3 = A0A2.A0J;
            if (j3 != Long.MIN_VALUE) {
                if (j3 >= j) {
                    r0 = AnonymousClass2R7.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY;
                } else if (j3 < j2) {
                    AnonymousClass1NK r2 = r8.A0H;
                    int i = 0;
                    String[] strArr2 = {String.valueOf(r2.A00.A09(r7)), Long.toString(j2), Long.toString(j)};
                    r5 = r2.A01.get();
                    Cursor A0A4 = ((C28801av) r5).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id > ? AND _id <= ?", "GET_CHAT_MESSAGE_COUNT_RANGE_SQL", strArr2);
                    try {
                        if (A0A4.moveToNext()) {
                            i = A0A4.getInt(A0A4.getColumnIndexOrThrow("count"));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgstore/getmessagesatid pos:");
                            sb2.append(i);
                            Log.i(sb2.toString());
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("msgstore/getmessagesatid/db no message for ");
                            sb3.append(r7);
                            Log.i(sb3.toString());
                        }
                        A0A4.close();
                        r5.close();
                        if (i == 0) {
                            r0 = AnonymousClass2R7.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
                        } else {
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (A0A4 != null) {
                            A0A4.close();
                        }
                        throw th;
                    }
                } else {
                    return;
                }
                r9.A0G(r0);
            }
        }
    }

    public static void A07(AnonymousClass1TO r10, AnonymousClass8X2 r11) {
        long j;
        AnonymousClass00H r2 = r10.A0g;
        ArrayList A0H2 = ((C1193467t) r2.get()).A0H();
        HashMap A0I2 = ((C1193467t) r2.get()).A0I();
        A0H2.size();
        Iterator it = A0H2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C1418377d r8 = (C1418377d) pair.first;
            Number number = (Number) pair.second;
            C23624Bmt A0N2 = AnonymousClass2BV.DEFAULT_INSTANCE.A0N();
            String str = r8.A0I;
            if (!TextUtils.isEmpty(str)) {
                A0N2.A0E();
                AnonymousClass2BV r1 = (AnonymousClass2BV) A0N2.A00;
                str.getClass();
                r1.bitField0_ |= 1;
                r1.url_ = str;
            }
            String str2 = r8.A0F;
            if (!TextUtils.isEmpty(str2)) {
                byte[] decode = Base64.decode(str2, 0);
                C23581BmB A012 = DSQ.A01(decode, 0, decode.length);
                A0N2.A0E();
                AnonymousClass2BV r12 = (AnonymousClass2BV) A0N2.A00;
                r12.bitField0_ |= 2;
                r12.fileSha256_ = A012;
            }
            String str3 = r8.A0A;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode2 = Base64.decode(str3, 0);
                C23581BmB A013 = DSQ.A01(decode2, 0, decode2.length);
                A0N2.A0E();
                AnonymousClass2BV r13 = (AnonymousClass2BV) A0N2.A00;
                r13.bitField0_ |= 4;
                r13.fileEncSha256_ = A013;
            }
            String str4 = r8.A0D;
            if (!TextUtils.isEmpty(str4)) {
                byte[] decode3 = Base64.decode(str4, 1);
                C23581BmB A014 = DSQ.A01(decode3, 0, decode3.length);
                A0N2.A0E();
                AnonymousClass2BV r14 = (AnonymousClass2BV) A0N2.A00;
                r14.bitField0_ |= 8;
                r14.mediaKey_ = A014;
            }
            String str5 = r8.A08;
            if (!TextUtils.isEmpty(str5)) {
                A0N2.A0E();
                AnonymousClass2BV r15 = (AnonymousClass2BV) A0N2.A00;
                str5.getClass();
                r15.bitField0_ |= 128;
                r15.directPath_ = str5;
            }
            String str6 = r8.A0E;
            A0N2.A0E();
            AnonymousClass2BV r16 = (AnonymousClass2BV) A0N2.A00;
            str6.getClass();
            r16.bitField0_ |= 16;
            r16.mimetype_ = str6;
            int i = r8.A02;
            A0N2.A0E();
            AnonymousClass2BV r17 = (AnonymousClass2BV) A0N2.A00;
            r17.bitField0_ |= 32;
            r17.height_ = i;
            int i2 = r8.A03;
            A0N2.A0E();
            AnonymousClass2BV r18 = (AnonymousClass2BV) A0N2.A00;
            r18.bitField0_ |= 64;
            r18.width_ = i2;
            A0N2.A0E();
            AnonymousClass2BV r7 = (AnonymousClass2BV) A0N2.A00;
            r7.bitField0_ |= 256;
            r7.fileLength_ = (long) r8.A00;
            float floatValue = number.floatValue();
            A0N2.A0E();
            AnonymousClass2BV r19 = (AnonymousClass2BV) A0N2.A00;
            r19.bitField0_ |= 512;
            r19.weight_ = floatValue;
            boolean A022 = r8.A02();
            A0N2.A0E();
            AnonymousClass2BV r110 = (AnonymousClass2BV) A0N2.A00;
            r110.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            r110.isLottie_ = A022;
            if (str2 == null || !A0I2.containsKey(str2)) {
                j = 0;
            } else {
                j = ((Number) A0I2.get(str2)).longValue();
            }
            A0N2.A0E();
            AnonymousClass2BV r111 = (AnonymousClass2BV) A0N2.A00;
            r111.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r111.lastStickerSentTs_ = j;
            r11.A0E();
            C166148cQ r3 = (C166148cQ) r11.A00;
            C23577Bm6 A0C2 = A0N2.A0C();
            C166148cQ r0 = C166148cQ.DEFAULT_INSTANCE;
            A0C2.getClass();
            EE9 ee9 = r3.recentStickers_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r3.recentStickers_ = ee9;
            }
            ee9.add(A0C2);
        }
    }

    public void A08(AnonymousClass2SB r34, DeviceJid deviceJid, String str, int i, boolean z) {
        int A002 = C18020vd.A00(C18040vf.A02, this.A0S, 1181);
        try {
            ArrayList A0L2 = this.A07.A0L();
            AnonymousClass8X2 r9 = (AnonymousClass8X2) C166148cQ.DEFAULT_INSTANCE.A0N();
            r9.A0K(AnonymousClass9KV.PUSH_NAME);
            Iterator it = A0L2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1E7 r6 = (AnonymousClass1E7) it.next();
                UserJid userJid = (UserJid) r6.A06(UserJid.class);
                if (userJid != null && !TextUtils.isEmpty(r6.A0c)) {
                    C45522Ak r3 = (C45522Ak) AnonymousClass2B6.DEFAULT_INSTANCE.A0N();
                    String rawString = userJid.getRawString();
                    r3.A0E();
                    AnonymousClass2B6 r1 = (AnonymousClass2B6) r3.A00;
                    rawString.getClass();
                    r1.bitField0_ |= 1;
                    r1.id_ = rawString;
                    String str2 = r6.A0c;
                    r3.A0E();
                    AnonymousClass2B6 r12 = (AnonymousClass2B6) r3.A00;
                    str2.getClass();
                    r12.bitField0_ |= 2;
                    r12.pushname_ = str2;
                    AnonymousClass2B6 r32 = (AnonymousClass2B6) r3.A0C();
                    r9.A0E();
                    C166148cQ r2 = (C166148cQ) r9.A00;
                    r32.getClass();
                    EE9 ee9 = r2.pushnames_;
                    if (!((C27296DbR) ee9).A00) {
                        ee9 = C23577Bm6.A09(ee9);
                        r2.pushnames_ = ee9;
                    }
                    ee9.add(r32);
                    i2++;
                    if (A002 > 0 && i2 >= A002) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("history-sync-send-methods send-push-names reach limit=");
                        sb.append(A002);
                        Log.i(sb.toString());
                        break;
                    }
                }
            }
            A01(r34, deviceJid, this, r9, (String) null, str, (String) null, (String) null, 1, 4, 100, i, 0, -1, -1, -1, 0, 0, -1, z);
        } catch (Exception e) {
            Log.e("history-sync-send-methods send-push-names: error", e);
        }
    }

    public static AnonymousClass9KV A03(int i) {
        switch (i) {
            case 0:
                return AnonymousClass9KV.INITIAL_BOOTSTRAP;
            case 1:
                return AnonymousClass9KV.INITIAL_STATUS_V3;
            case 2:
                return AnonymousClass9KV.RECENT;
            case 3:
                return AnonymousClass9KV.FULL;
            case 4:
                return AnonymousClass9KV.PUSH_NAME;
            case 5:
                return AnonymousClass9KV.NON_BLOCKING_DATA;
            case 6:
                return AnonymousClass9KV.ON_DEMAND;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected type (");
                sb.append(i);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public AnonymousClass1TO(C19880zA r2, AnonymousClass190 r3, AnonymousClass11S r4, C25001Mm r5, AnonymousClass1TK r6, AnonymousClass1SI r7, AnonymousClass1TL r8, C26371Rw r9, AnonymousClass1M9 r10, C25111Mx r11, AnonymousClass11P r12, AnonymousClass1P3 r13, AnonymousClass1M4 r14, AnonymousClass1TD r15, AnonymousClass1CJ r16, AnonymousClass122 r17, AnonymousClass1MZ r18, AnonymousClass1MX r19, AnonymousClass1NK r20, AnonymousClass1NJ r21, AnonymousClass1TG r22, C24661Le r23, AnonymousClass1MF r24, C24751Ln r25, AnonymousClass1RL r26, AnonymousClass1RK r27, AnonymousClass1RE r28, AnonymousClass1TH r29, C26391Ry r30, C18030ve r31, AnonymousClass18K r32, C25241Nl r33, C219317y r34, AnonymousClass1T7 r35, AnonymousClass1T6 r36, AnonymousClass1PP r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45) {
        this.A09 = r12;
        this.A0S = r31;
        this.A01 = r3;
        this.A02 = r4;
        this.A0D = r16;
        this.A0H = r20;
        this.A0T = r32;
        this.A0I = r21;
        this.A0K = r23;
        this.A03 = r5;
        this.A0L = r24;
        this.A07 = r10;
        this.A0g = r38;
        this.A0Y = r37;
        this.A0X = r36;
        this.A0E = r17;
        this.A0a = r39;
        this.A0W = r35;
        this.A0M = r25;
        this.A0e = r9;
        this.A0C = r15;
        this.A0R = r30;
        this.A0A = r13;
        this.A0c = r40;
        this.A0J = r22;
        this.A0U = r33;
        this.A08 = r11;
        this.A0i = r43;
        this.A0f = r41;
        this.A0h = r42;
        this.A0b = r44;
        this.A0O = r27;
        this.A05 = r7;
        this.A0N = r26;
        this.A0Q = r29;
        this.A0F = r18;
        this.A04 = r6;
        this.A0Z = r45;
        this.A0B = r14;
        this.A0G = r19;
        this.A0P = r28;
        this.A06 = r8;
        this.A0V = r34;
        this.A00 = r2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.231, X.23J, X.206] */
    public static void A04(AnonymousClass2SB r22, DeviceJid deviceJid, C61382pa r24, AnonymousClass1TO r25, AnonymousClass8X2 r26, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        String str8;
        long j8;
        long size;
        int i5;
        byte[] bArr;
        AnonymousClass1TO r4 = r25;
        AnonymousClass11S r0 = r4.A02;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        int i6 = i;
        String str9 = str;
        AnonymousClass8X2 r6 = r26;
        long j9 = j7;
        int i7 = i2;
        AnonymousClass2SB r5 = r22;
        long j10 = j5;
        int i8 = i3;
        if (phoneUserJid == null) {
            Log.e("history-sync-send-methods/no my user id (unregistered?).");
            j8 = (long) i8;
            size = (long) ((C166148cQ) r6.A00).conversations_.size();
            i5 = 3;
        } else {
            DeviceJid deviceJid2 = deviceJid;
            if (C62832s4.A00(deviceJid2)) {
                if (!C18020vd.A05(C18040vf.A02, r4.A0S, 5058)) {
                    return;
                }
            }
            String str10 = null;
            if (r22 != null) {
                str8 = r5.A01;
                str10 = r5.A00;
            } else {
                str8 = null;
            }
            AnonymousClass205 A012 = r4.A0Y.A01(phoneUserJid, true);
            AnonymousClass11P r16 = r4.A09;
            ? r2 = new AnonymousClass206(A012, 35, AnonymousClass11P.A01(r16));
            r2.A00 = deviceJid2;
            r2.A00 = i6;
            r2.A01 = i8;
            r2.A03 = i7;
            r2.A02 = i4;
            r2.A08 = j2;
            r2.A09 = j4;
            r2.A06 = j3;
            r2.A0G = str2;
            r2.A04 = (long) ((C166148cQ) r6.A00).conversations_.size();
            r2.A07 = j10;
            r2.A0J = str8;
            r2.A0I = str10;
            r2.A0A = j6;
            r2.A0H = str9;
            if (z) {
                byte[] A0M2 = r6.A0C().A0M();
                Deflater deflater = new Deflater(1, false);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream.write(A0M2);
                    deflaterOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                    deflater.end();
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HistorySyncUtils/deflateData fails e=");
                    sb.append(e);
                    Log.e(sb.toString());
                    deflater.end();
                    Log.e("HistorySyncUtils/deflateData no result");
                    bArr = new byte[0];
                } catch (Throwable th) {
                    deflater.end();
                    throw th;
                }
                r2.A0K = bArr;
            } else {
                r2.A0B = str3;
                r2.A0C = str4;
                r2.A0F = str5;
                r2.A0E = str6;
                r2.A0L = r24.A01;
                r2.A05 = j9;
            }
            String str11 = str7;
            if (!TextUtils.isEmpty(str11)) {
                r2.A0D = str11;
            }
            if (r4.A0R.A01(r2) < 0) {
                Log.e("history-sync-send-methods/failed to add peer message");
                j8 = (long) i8;
                size = (long) ((C166148cQ) r6.A00).conversations_.size();
                i5 = 5;
            } else {
                r4.A03.A01(new SendPeerMessageJob(deviceJid2, r2));
                if (i7 == 6) {
                    long A013 = AnonymousClass11P.A01(r16) - j;
                    int i9 = 1;
                    boolean z2 = false;
                    if (A013 > ((long) C18020vd.A00(C18040vf.A02, r4.A0S, 3882))) {
                        z2 = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("HistorySyncSendMethods/sendPeerMessage on demand history sync isRequestTimeout = ");
                    sb2.append(z2);
                    sb2.append(", requestAgeMillis = ");
                    sb2.append(A013);
                    Log.i(sb2.toString());
                    AnonymousClass1TL r23 = r4.A06;
                    if (z2) {
                        i9 = 7;
                    }
                    r23.A02(Integer.valueOf(i9), str9, 3);
                    return;
                }
                return;
            }
        }
        A05(r5, r4, str9, i7, i6, i5, j8, size, j10, j9);
    }
}
