package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Cwe  reason: case insensitive filesystem */
public final class C26283Cwe {
    public static final Pattern A00 = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap A01 = C17880vN.A11();

    public static void A05(String str) {
        String str2;
        try {
            A03(str, false);
        } catch (C1L e) {
            e = e;
            str2 = "Codec warming failed";
            Log.e("MediaCodecUtil", str2, e);
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str2 = "Codec warming failed with UnsatisfiedLinkError";
            Log.e("MediaCodecUtil", str2, e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0253, code lost:
        if (r1.equals(r0) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0255, code lost:
        r5 = r9.length;
        r3 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x025b, code lost:
        if (r5 >= 2) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x025d, code lost:
        r1 = X.AnonymousClass8BW.A0o("Ignoring malformed AVC codec string: ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0261, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r2 = r9[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x026f, code lost:
        if (r2.length() != 6) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0271, code lost:
        r5 = java.lang.Integer.parseInt(X.AnonymousClass8BS.A0o(r2, 2), 16);
        r7 = java.lang.Integer.parseInt(r9[1].substring(4), 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0288, code lost:
        if (r5 < 3) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x028a, code lost:
        r5 = java.lang.Integer.parseInt(r2);
        r7 = java.lang.Integer.parseInt(r9[2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0296, code lost:
        if (r5 == 66) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x029a, code lost:
        if (r5 == 77) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x029e, code lost:
        if (r5 == 88) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02a2, code lost:
        if (r5 == 100) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02a6, code lost:
        if (r5 == 110) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02aa, code lost:
        if (r5 == 122) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02ac, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02b0, code lost:
        if (r5 == 244) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02b2, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02b4, code lost:
        if (r1 != -1) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02b6, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "Unknown AVC profile: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02bc, code lost:
        r1.append(r0);
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02c3, code lost:
        r1 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02c6, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02c9, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02cc, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02ce, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02d0, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02d2, code lost:
        switch(r7) {
            case 10: goto L_0x0317;
            case 11: goto L_0x0319;
            case 12: goto L_0x031b;
            case 13: goto L_0x031e;
            default: goto L_0x02d5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02d5, code lost:
        switch(r7) {
            case 20: goto L_0x030e;
            case 21: goto L_0x0311;
            case 22: goto L_0x0314;
            default: goto L_0x02d8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02d8, code lost:
        switch(r7) {
            case 30: goto L_0x0305;
            case 31: goto L_0x0308;
            case 32: goto L_0x030b;
            default: goto L_0x02db;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02db, code lost:
        switch(r7) {
            case 40: goto L_0x02fc;
            case 41: goto L_0x02ff;
            case 42: goto L_0x0302;
            default: goto L_0x02de;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02de, code lost:
        switch(r7) {
            case 50: goto L_0x02f2;
            case 51: goto L_0x02f5;
            case 52: goto L_0x02f9;
            default: goto L_0x02e1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02e1, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02e2, code lost:
        if (r2 != -1) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02e4, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "Unknown AVC level: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02ea, code lost:
        r1.append(r0);
        r1.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02f2, code lost:
        r2 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02f5, code lost:
        r2 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02f9, code lost:
        r2 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02fc, code lost:
        r2 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02ff, code lost:
        r2 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0302, code lost:
        r2 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0305, code lost:
        r2 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0308, code lost:
        r2 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x030b, code lost:
        r2 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x030e, code lost:
        r2 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0311, code lost:
        r2 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0314, code lost:
        r2 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0317, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0319, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x031b, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x031e, code lost:
        r2 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        android.util.Log.w(r3, X.C17900vP.A0A("Ignoring malformed AVC codec string: ", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x032a, code lost:
        r0 = X.AnonymousClass000.A11("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0457, code lost:
        if (r1.equals(r0) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0459, code lost:
        r4 = r11.A0N;
        r5 = "Ignoring malformed HEVC codec string: ";
        r3 = "MediaCodecUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0461, code lost:
        if (r9.length < 4) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0463, code lost:
        r2 = 1;
        r1 = A00.matcher(r9[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0470, code lost:
        if (r1.matches() == false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0472, code lost:
        r8 = r1.group(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x047c, code lost:
        if ("1".equals(r8) != false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0484, code lost:
        if ("2".equals(r8) == false) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0486, code lost:
        if (r4 == null) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0488, code lost:
        r1 = r4.A03;
        r2 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x048d, code lost:
        if (r1 == 6) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x048f, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0490, code lost:
        r8 = r9[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0493, code lost:
        if (r8 == null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x04a0, code lost:
        switch(r8.hashCode()) {
            case 70821: goto L_0x04ab;
            case 70914: goto L_0x04b9;
            case 70917: goto L_0x04c7;
            case 71007: goto L_0x04d3;
            case 71010: goto L_0x04df;
            case 74665: goto L_0x04eb;
            case 74758: goto L_0x04f9;
            case 74761: goto L_0x0507;
            case 74851: goto L_0x0515;
            case 74854: goto L_0x0521;
            case 2193639: goto L_0x052d;
            case 2193642: goto L_0x0539;
            case 2193732: goto L_0x0545;
            case 2193735: goto L_0x0552;
            case 2193738: goto L_0x055e;
            case 2193825: goto L_0x0569;
            case 2193828: goto L_0x0574;
            case 2193831: goto L_0x057f;
            case 2312803: goto L_0x058a;
            case 2312806: goto L_0x0595;
            case 2312896: goto L_0x05a0;
            case 2312899: goto L_0x05ab;
            case 2312902: goto L_0x05b6;
            case 2312989: goto L_0x05c1;
            case 2312992: goto L_0x05cc;
            case 2312995: goto L_0x05d7;
            default: goto L_0x04a3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x04a3, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "Unknown HEVC level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x04b1, code lost:
        if (r8.equals("H30") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x04b3, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x04bf, code lost:
        if (r8.equals("H60") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x04c1, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x04cd, code lost:
        if (r8.equals("H63") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x04cf, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x04d9, code lost:
        if (r8.equals("H90") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x04db, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x04e5, code lost:
        if (r8.equals("H93") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x04e7, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x04f1, code lost:
        if (r8.equals("L30") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x04f3, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x04ff, code lost:
        if (r8.equals("L60") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0501, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x050d, code lost:
        if (r8.equals("L63") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x050f, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x051b, code lost:
        if (r8.equals("L90") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x051d, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0527, code lost:
        if (r8.equals("L93") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0529, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0533, code lost:
        if (r8.equals("H120") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0535, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x053f, code lost:
        if (r8.equals("H123") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0541, code lost:
        r0 = com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x054b, code lost:
        if (r8.equals("H150") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x054d, code lost:
        r0 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0558, code lost:
        if (r8.equals("H153") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x055a, code lost:
        r0 = X.A7Y.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0564, code lost:
        if (r8.equals("H156") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0566, code lost:
        r0 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x056f, code lost:
        if (r8.equals("H180") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0571, code lost:
        r0 = 2097152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x057a, code lost:
        if (r8.equals("H183") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x057c, code lost:
        r0 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0585, code lost:
        if (r8.equals("H186") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0587, code lost:
        r0 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0590, code lost:
        if (r8.equals("L120") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0592, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x059b, code lost:
        if (r8.equals("L123") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x059d, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x05a6, code lost:
        if (r8.equals("L150") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x05a8, code lost:
        r0 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x05b1, code lost:
        if (r8.equals("L153") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x05b3, code lost:
        r0 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x05bc, code lost:
        if (r8.equals("L156") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x05be, code lost:
        r0 = 262144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x05c7, code lost:
        if (r8.equals("L180") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x05c9, code lost:
        r0 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x05d2, code lost:
        if (r8.equals("L183") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x05d4, code lost:
        r0 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x05dd, code lost:
        if (r8.equals("L186") == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x05df, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x05e1, code lost:
        r1 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x05e5, code lost:
        if (r1 == null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x05ef, code lost:
        return X.C108945cZ.A0N(java.lang.Integer.valueOf(r2), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x05f0, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "Unknown HEVC profile string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0607, code lost:
        r4 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x060c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0611, code lost:
        r0 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0619, code lost:
        return X.C108945cZ.A0N(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c6, code lost:
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r8 = r9[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r8 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        switch(r8.hashCode()) {
            case 1537: goto L_0x00df;
            case 1538: goto L_0x00ed;
            case 1539: goto L_0x00fb;
            case 1540: goto L_0x0108;
            case 1541: goto L_0x0115;
            case 1542: goto L_0x0120;
            case 1543: goto L_0x012b;
            case 1544: goto L_0x0136;
            case 1545: goto L_0x0141;
            case 1567: goto L_0x014c;
            case 1568: goto L_0x0157;
            case 1569: goto L_0x0162;
            case 1570: goto L_0x016d;
            default: goto L_0x00d7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "Unknown Dolby Vision level string: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        if (r8.equals("01") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        if (r8.equals("02") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0101, code lost:
        if (r8.equals("03") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0103, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        if (r8.equals("04") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0110, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011b, code lost:
        if (r8.equals("05") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011d, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0126, code lost:
        if (r8.equals("06") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0128, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0131, code lost:
        if (r8.equals("07") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013c, code lost:
        if (r8.equals("08") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013e, code lost:
        r0 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0147, code lost:
        if (r8.equals("09") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0149, code lost:
        r0 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0152, code lost:
        if (r8.equals("10") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0154, code lost:
        r0 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (r8.equals("11") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015f, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0168, code lost:
        if (r8.equals("12") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016a, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0173, code lost:
        if (r8.equals("13") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0175, code lost:
        r0 = com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0177, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        if (r0 != null) goto L_0x0615;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.D48 r11) {
        /*
            java.lang.String r8 = r11.A0O
            r10 = 0
            if (r8 == 0) goto L_0x0050
            java.lang.String r0 = "\\."
            java.lang.String[] r9 = r8.split(r0)
            java.lang.String r1 = "video/dolby-vision"
            java.lang.String r0 = r11.A0S
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x017f
            int r1 = r9.length
            r0 = 3
            java.lang.String r5 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            if (r1 < r0) goto L_0x05f8
            java.util.regex.Pattern r2 = A00
            r1 = 1
            r0 = r9[r1]
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L_0x05f8
            java.lang.String r8 = r2.group(r1)
            if (r8 == 0) goto L_0x003d
            int r0 = r8.hashCode()
            r6 = 8
            r5 = 4
            r2 = 2
            switch(r0) {
                case 1536: goto L_0x0051;
                case 1537: goto L_0x005e;
                case 1538: goto L_0x006b;
                case 1539: goto L_0x0078;
                case 1540: goto L_0x0085;
                case 1541: goto L_0x0090;
                case 1542: goto L_0x009b;
                case 1543: goto L_0x00a6;
                case 1544: goto L_0x00b1;
                case 1545: goto L_0x00bc;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown Dolby Vision profile string: "
        L_0x0043:
            r1.append(r0)
        L_0x0046:
            r1.append(r8)
        L_0x0049:
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
        L_0x0050:
            return r10
        L_0x0051:
            java.lang.String r0 = "00"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            goto L_0x00ca
        L_0x005e:
            java.lang.String r0 = "01"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto L_0x00ca
        L_0x006b:
            java.lang.String r0 = "02"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L_0x00ca
        L_0x0078:
            java.lang.String r0 = "03"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            goto L_0x00ca
        L_0x0085:
            java.lang.String r0 = "04"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 16
            goto L_0x00c6
        L_0x0090:
            java.lang.String r0 = "05"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 32
            goto L_0x00c6
        L_0x009b:
            java.lang.String r0 = "06"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 64
            goto L_0x00c6
        L_0x00a6:
            java.lang.String r0 = "07"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x00c6
        L_0x00b1:
            java.lang.String r0 = "08"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x00c6
        L_0x00bc:
            java.lang.String r0 = "09"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 512(0x200, float:7.175E-43)
        L_0x00c6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x00ca:
            if (r4 == 0) goto L_0x003d
            r8 = r9[r2]
            if (r8 == 0) goto L_0x00d7
            int r0 = r8.hashCode()
            switch(r0) {
                case 1537: goto L_0x00df;
                case 1538: goto L_0x00ed;
                case 1539: goto L_0x00fb;
                case 1540: goto L_0x0108;
                case 1541: goto L_0x0115;
                case 1542: goto L_0x0120;
                case 1543: goto L_0x012b;
                case 1544: goto L_0x0136;
                case 1545: goto L_0x0141;
                case 1567: goto L_0x014c;
                case 1568: goto L_0x0157;
                case 1569: goto L_0x0162;
                case 1570: goto L_0x016d;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown Dolby Vision level string: "
            goto L_0x0043
        L_0x00df:
            java.lang.String r0 = "01"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x017b
        L_0x00ed:
            java.lang.String r0 = "02"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x017b
        L_0x00fb:
            java.lang.String r0 = "03"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x017b
        L_0x0108:
            java.lang.String r0 = "04"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x017b
        L_0x0115:
            java.lang.String r0 = "05"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 16
            goto L_0x0177
        L_0x0120:
            java.lang.String r0 = "06"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 32
            goto L_0x0177
        L_0x012b:
            java.lang.String r0 = "07"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 64
            goto L_0x0177
        L_0x0136:
            java.lang.String r0 = "08"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0177
        L_0x0141:
            java.lang.String r0 = "09"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0177
        L_0x014c:
            java.lang.String r0 = "10"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0177
        L_0x0157:
            java.lang.String r0 = "11"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0177
        L_0x0162:
            java.lang.String r0 = "12"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0177
        L_0x016d:
            java.lang.String r0 = "13"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x0177:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x017b:
            if (r0 != 0) goto L_0x0615
            goto L_0x00d7
        L_0x017f:
            r0 = 0
            r1 = r9[r0]
            int r0 = r1.hashCode()
            switch(r0) {
                case 3004662: goto L_0x018a;
                case 3006243: goto L_0x024a;
                case 3006244: goto L_0x024d;
                case 3199032: goto L_0x044e;
                case 3214780: goto L_0x0451;
                case 3356560: goto L_0x03db;
                case 3624515: goto L_0x0330;
                default: goto L_0x0189;
            }
        L_0x0189:
            return r10
        L_0x018a:
            java.lang.String r0 = "av01"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.D3h r6 = r11.A0N
            int r1 = r9.length
            r0 = 4
            java.lang.String r5 = "Ignoring malformed AV1 codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            if (r1 >= r0) goto L_0x01a2
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r5)
            goto L_0x03ef
        L_0x01a2:
            r4 = 1
            r0 = r9[r4]     // Catch:{ NumberFormatException -> 0x0244 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0244 }
            r1 = 2
            r0 = r9[r1]     // Catch:{ NumberFormatException -> 0x0244 }
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r0, r1)     // Catch:{ NumberFormatException -> 0x0244 }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0244 }
            r0 = 3
            r0 = r9[r0]     // Catch:{ NumberFormatException -> 0x0244 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0244 }
            if (r2 == 0) goto L_0x01cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown AV1 profile: "
            r1.append(r0)
            r1.append(r2)
            goto L_0x0261
        L_0x01cb:
            r1 = 8
            if (r5 == r1) goto L_0x01db
            r0 = 10
            if (r5 == r0) goto L_0x01db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown AV1 bit depth: "
            goto L_0x02bc
        L_0x01db:
            if (r5 == r1) goto L_0x01ed
            if (r6 == 0) goto L_0x0242
            byte[] r0 = r6.A04
            if (r0 != 0) goto L_0x01eb
            int r1 = r6.A03
            r0 = 7
            if (r1 == r0) goto L_0x01eb
            r0 = 6
            if (r1 != r0) goto L_0x0242
        L_0x01eb:
            r4 = 4096(0x1000, float:5.74E-42)
        L_0x01ed:
            switch(r7) {
                case 0: goto L_0x01fc;
                case 1: goto L_0x01fe;
                case 2: goto L_0x0200;
                case 3: goto L_0x0202;
                case 4: goto L_0x0205;
                case 5: goto L_0x0208;
                case 6: goto L_0x020b;
                case 7: goto L_0x020e;
                case 8: goto L_0x0211;
                case 9: goto L_0x0214;
                case 10: goto L_0x0217;
                case 11: goto L_0x021a;
                case 12: goto L_0x021d;
                case 13: goto L_0x0220;
                case 14: goto L_0x0223;
                case 15: goto L_0x0226;
                case 16: goto L_0x022a;
                case 17: goto L_0x022d;
                case 18: goto L_0x0230;
                case 19: goto L_0x0233;
                case 20: goto L_0x0236;
                case 21: goto L_0x0239;
                case 22: goto L_0x023c;
                case 23: goto L_0x023f;
                default: goto L_0x01f0;
            }
        L_0x01f0:
            r1 = -1
        L_0x01f1:
            r0 = -1
            if (r1 != r0) goto L_0x05fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown AV1 level: "
            goto L_0x02ea
        L_0x01fc:
            r1 = 1
            goto L_0x01f1
        L_0x01fe:
            r1 = 2
            goto L_0x01f1
        L_0x0200:
            r1 = 4
            goto L_0x01f1
        L_0x0202:
            r1 = 8
            goto L_0x01f1
        L_0x0205:
            r1 = 16
            goto L_0x01f1
        L_0x0208:
            r1 = 32
            goto L_0x01f1
        L_0x020b:
            r1 = 64
            goto L_0x01f1
        L_0x020e:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x01f1
        L_0x0211:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x01f1
        L_0x0214:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x01f1
        L_0x0217:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x01f1
        L_0x021a:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x01f1
        L_0x021d:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x01f1
        L_0x0220:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01f1
        L_0x0223:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01f1
        L_0x0226:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x01f1
        L_0x022a:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01f1
        L_0x022d:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f1
        L_0x0230:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x01f1
        L_0x0233:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01f1
        L_0x0236:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f1
        L_0x0239:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01f1
        L_0x023c:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x01f1
        L_0x023f:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x01f1
        L_0x0242:
            r4 = 2
            goto L_0x01ed
        L_0x0244:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r5)
            goto L_0x03ef
        L_0x024a:
            java.lang.String r0 = "avc1"
            goto L_0x024f
        L_0x024d:
            java.lang.String r0 = "avc2"
        L_0x024f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r5 = r9.length
            java.lang.String r4 = "Ignoring malformed AVC codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            r7 = 2
            if (r5 >= r7) goto L_0x0267
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r4, r8)
        L_0x0261:
            java.lang.String r0 = r1.toString()
            goto L_0x03f3
        L_0x0267:
            r6 = 1
            r2 = r9[r6]     // Catch:{ NumberFormatException -> 0x032a }
            int r1 = r2.length()     // Catch:{ NumberFormatException -> 0x032a }
            r0 = 6
            if (r1 != r0) goto L_0x0287
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r2, r7)     // Catch:{ NumberFormatException -> 0x032a }
            r2 = 16
            int r5 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x032a }
            r1 = r9[r6]     // Catch:{ NumberFormatException -> 0x032a }
            r0 = 4
            java.lang.String r0 = r1.substring(r0)     // Catch:{ NumberFormatException -> 0x032a }
            int r7 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x032a }
            goto L_0x0294
        L_0x0287:
            r0 = 3
            if (r5 < r0) goto L_0x0321
            int r5 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x032a }
            r0 = r9[r7]     // Catch:{ NumberFormatException -> 0x032a }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x032a }
        L_0x0294:
            r0 = 66
            if (r5 == r0) goto L_0x02d0
            r0 = 77
            if (r5 == r0) goto L_0x02ce
            r0 = 88
            if (r5 == r0) goto L_0x02cc
            r0 = 100
            if (r5 == r0) goto L_0x02c9
            r0 = 110(0x6e, float:1.54E-43)
            if (r5 == r0) goto L_0x02c6
            r0 = 122(0x7a, float:1.71E-43)
            if (r5 == r0) goto L_0x02c3
            r0 = 244(0xf4, float:3.42E-43)
            r1 = 64
            if (r5 == r0) goto L_0x02b3
            r1 = -1
        L_0x02b3:
            r0 = -1
            if (r1 != r0) goto L_0x02d2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown AVC profile: "
        L_0x02bc:
            r1.append(r0)
            r1.append(r5)
            goto L_0x0261
        L_0x02c3:
            r1 = 32
            goto L_0x02b3
        L_0x02c6:
            r1 = 16
            goto L_0x02b3
        L_0x02c9:
            r1 = 8
            goto L_0x02b3
        L_0x02cc:
            r1 = 4
            goto L_0x02b3
        L_0x02ce:
            r1 = 2
            goto L_0x02b3
        L_0x02d0:
            r1 = 1
            goto L_0x02b3
        L_0x02d2:
            switch(r7) {
                case 10: goto L_0x0317;
                case 11: goto L_0x0319;
                case 12: goto L_0x031b;
                case 13: goto L_0x031e;
                default: goto L_0x02d5;
            }
        L_0x02d5:
            switch(r7) {
                case 20: goto L_0x030e;
                case 21: goto L_0x0311;
                case 22: goto L_0x0314;
                default: goto L_0x02d8;
            }
        L_0x02d8:
            switch(r7) {
                case 30: goto L_0x0305;
                case 31: goto L_0x0308;
                case 32: goto L_0x030b;
                default: goto L_0x02db;
            }
        L_0x02db:
            switch(r7) {
                case 40: goto L_0x02fc;
                case 41: goto L_0x02ff;
                case 42: goto L_0x0302;
                default: goto L_0x02de;
            }
        L_0x02de:
            switch(r7) {
                case 50: goto L_0x02f2;
                case 51: goto L_0x02f5;
                case 52: goto L_0x02f9;
                default: goto L_0x02e1;
            }
        L_0x02e1:
            r2 = -1
        L_0x02e2:
            if (r2 != r0) goto L_0x0607
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown AVC level: "
        L_0x02ea:
            r1.append(r0)
            r1.append(r7)
            goto L_0x0261
        L_0x02f2:
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x02e2
        L_0x02f5:
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x02e2
        L_0x02f9:
            r2 = 65536(0x10000, float:9.18355E-41)
            goto L_0x02e2
        L_0x02fc:
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x02e2
        L_0x02ff:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x02e2
        L_0x0302:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02e2
        L_0x0305:
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x02e2
        L_0x0308:
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x02e2
        L_0x030b:
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x02e2
        L_0x030e:
            r2 = 32
            goto L_0x02e2
        L_0x0311:
            r2 = 64
            goto L_0x02e2
        L_0x0314:
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x02e2
        L_0x0317:
            r2 = 1
            goto L_0x02e2
        L_0x0319:
            r2 = 4
            goto L_0x02e2
        L_0x031b:
            r2 = 8
            goto L_0x02e2
        L_0x031e:
            r2 = 16
            goto L_0x02e2
        L_0x0321:
            java.lang.String r0 = X.C17900vP.A0A(r4, r8)     // Catch:{ NumberFormatException -> 0x032a }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x032a }
            goto L_0x060c
        L_0x032a:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r4)
            goto L_0x03ef
        L_0x0330:
            java.lang.String r0 = "vp09"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r2 = r9.length
            r0 = 3
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            if (r2 >= r0) goto L_0x0346
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            goto L_0x0046
        L_0x0346:
            r0 = 1
            r0 = r9[r0]     // Catch:{ NumberFormatException -> 0x03d6 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d6 }
            r0 = 2
            r0 = r9[r0]     // Catch:{ NumberFormatException -> 0x03d6 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d6 }
            r0 = 1
            r5 = 1
            if (r2 == 0) goto L_0x0363
            r5 = 2
            if (r2 == r0) goto L_0x0363
            if (r2 == r5) goto L_0x0374
            r0 = 3
            r5 = 8
            if (r2 == r0) goto L_0x0363
            r5 = -1
        L_0x0363:
            r1 = -1
            if (r5 != r1) goto L_0x0376
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown VP9 profile: "
            r1.append(r0)
            r1.append(r2)
            goto L_0x0049
        L_0x0374:
            r5 = 4
            goto L_0x0363
        L_0x0376:
            r0 = 10
            if (r4 == r0) goto L_0x03d4
            r0 = 11
            if (r4 == r0) goto L_0x03d2
            r0 = 20
            if (r4 == r0) goto L_0x03d0
            r0 = 21
            if (r4 == r0) goto L_0x03cd
            r0 = 30
            if (r4 == r0) goto L_0x03ca
            r0 = 31
            if (r4 == r0) goto L_0x03c7
            r0 = 40
            if (r4 == r0) goto L_0x03c4
            r0 = 41
            if (r4 == r0) goto L_0x03c1
            r0 = 50
            if (r4 == r0) goto L_0x03be
            r0 = 51
            if (r4 == r0) goto L_0x03bb
            switch(r4) {
                case 60: goto L_0x03b2;
                case 61: goto L_0x03b5;
                case 62: goto L_0x03b8;
                default: goto L_0x03a1;
            }
        L_0x03a1:
            r2 = -1
        L_0x03a2:
            if (r2 != r1) goto L_0x060d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown VP9 level: "
            r1.append(r0)
            r1.append(r4)
            goto L_0x0049
        L_0x03b2:
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x03a2
        L_0x03b5:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a2
        L_0x03b8:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a2
        L_0x03bb:
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x03a2
        L_0x03be:
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x03a2
        L_0x03c1:
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x03a2
        L_0x03c4:
            r2 = 64
            goto L_0x03a2
        L_0x03c7:
            r2 = 32
            goto L_0x03a2
        L_0x03ca:
            r2 = 16
            goto L_0x03a2
        L_0x03cd:
            r2 = 8
            goto L_0x03a2
        L_0x03d0:
            r2 = 4
            goto L_0x03a2
        L_0x03d2:
            r2 = 2
            goto L_0x03a2
        L_0x03d4:
            r2 = 1
            goto L_0x03a2
        L_0x03d6:
            java.lang.String r0 = X.C17900vP.A0A(r1, r8)
            goto L_0x03f3
        L_0x03db:
            java.lang.String r0 = "mp4a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r1 = r9.length
            r0 = 3
            java.lang.String r2 = "Ignoring malformed MP4A codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            if (r1 == r0) goto L_0x03f7
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r2)
        L_0x03ef:
            java.lang.String r0 = X.AnonymousClass000.A0y(r8, r0)
        L_0x03f3:
            android.util.Log.w(r3, r0)
            return r10
        L_0x03f7:
            r0 = 1
            r1 = r9[r0]     // Catch:{ NumberFormatException -> 0x0449 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x0449 }
            java.lang.String r1 = X.C26233CvQ.A02(r0)     // Catch:{ NumberFormatException -> 0x0449 }
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x0449 }
            if (r0 == 0) goto L_0x0050
            r0 = 2
            r0 = r9[r0]     // Catch:{ NumberFormatException -> 0x0449 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0449 }
            r1 = 17
            if (r0 == r1) goto L_0x042f
            r1 = 20
            if (r0 == r1) goto L_0x042f
            r1 = 23
            if (r0 == r1) goto L_0x042f
            r1 = 29
            if (r0 == r1) goto L_0x042f
            r1 = 39
            if (r0 == r1) goto L_0x042f
            r1 = 42
            if (r0 == r1) goto L_0x042f
            switch(r0) {
                case 1: goto L_0x0433;
                case 2: goto L_0x0435;
                case 3: goto L_0x0437;
                case 4: goto L_0x0439;
                case 5: goto L_0x043b;
                case 6: goto L_0x043d;
                default: goto L_0x042e;
            }     // Catch:{ NumberFormatException -> 0x0449 }
        L_0x042e:
            r1 = -1
        L_0x042f:
            r0 = -1
            if (r1 == r0) goto L_0x0050
            goto L_0x043f
        L_0x0433:
            r1 = 1
            goto L_0x042f
        L_0x0435:
            r1 = 2
            goto L_0x042f
        L_0x0437:
            r1 = 3
            goto L_0x042f
        L_0x0439:
            r1 = 4
            goto L_0x042f
        L_0x043b:
            r1 = 5
            goto L_0x042f
        L_0x043d:
            r1 = 6
            goto L_0x042f
        L_0x043f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0449 }
            r0 = 0
            android.util.Pair r10 = X.C17890vO.A0E(r1, r0)     // Catch:{ NumberFormatException -> 0x0449 }
            return r10
        L_0x0449:
            java.lang.String r0 = X.C17900vP.A0A(r2, r8)
            goto L_0x03f3
        L_0x044e:
            java.lang.String r0 = "hev1"
            goto L_0x0453
        L_0x0451:
            java.lang.String r0 = "hvc1"
        L_0x0453:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.D3h r4 = r11.A0N
            int r1 = r9.length
            r0 = 4
            java.lang.String r5 = "Ignoring malformed HEVC codec string: "
            java.lang.String r3 = "MediaCodecUtil"
            if (r1 < r0) goto L_0x05f8
            java.util.regex.Pattern r1 = A00
            r2 = 1
            r0 = r9[r2]
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x05f8
            java.lang.String r8 = r1.group(r2)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0490
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x05f0
            if (r4 == 0) goto L_0x048f
            int r1 = r4.A03
            r0 = 6
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 == r0) goto L_0x0490
        L_0x048f:
            r2 = 2
        L_0x0490:
            r0 = 3
            r8 = r9[r0]
            if (r8 == 0) goto L_0x04a3
            int r0 = r8.hashCode()
            r7 = 16
            r6 = 8
            r5 = 4
            r4 = 2
            r1 = 1
            switch(r0) {
                case 70821: goto L_0x04ab;
                case 70914: goto L_0x04b9;
                case 70917: goto L_0x04c7;
                case 71007: goto L_0x04d3;
                case 71010: goto L_0x04df;
                case 74665: goto L_0x04eb;
                case 74758: goto L_0x04f9;
                case 74761: goto L_0x0507;
                case 74851: goto L_0x0515;
                case 74854: goto L_0x0521;
                case 2193639: goto L_0x052d;
                case 2193642: goto L_0x0539;
                case 2193732: goto L_0x0545;
                case 2193735: goto L_0x0552;
                case 2193738: goto L_0x055e;
                case 2193825: goto L_0x0569;
                case 2193828: goto L_0x0574;
                case 2193831: goto L_0x057f;
                case 2312803: goto L_0x058a;
                case 2312806: goto L_0x0595;
                case 2312896: goto L_0x05a0;
                case 2312899: goto L_0x05ab;
                case 2312902: goto L_0x05b6;
                case 2312989: goto L_0x05c1;
                case 2312992: goto L_0x05cc;
                case 2312995: goto L_0x05d7;
                default: goto L_0x04a3;
            }
        L_0x04a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown HEVC level string: "
            goto L_0x0043
        L_0x04ab:
            java.lang.String r0 = "H30"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L_0x05e5
        L_0x04b9:
            java.lang.String r0 = "H60"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x05e5
        L_0x04c7:
            java.lang.String r0 = "H63"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 32
            goto L_0x05e1
        L_0x04d3:
            java.lang.String r0 = "H90"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x05e1
        L_0x04df:
            java.lang.String r0 = "H93"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x05e1
        L_0x04eb:
            java.lang.String r0 = "L30"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x05e5
        L_0x04f9:
            java.lang.String r0 = "L60"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x05e5
        L_0x0507:
            java.lang.String r0 = "L63"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x05e5
        L_0x0515:
            java.lang.String r0 = "L90"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 64
            goto L_0x05e1
        L_0x0521:
            java.lang.String r0 = "L93"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x05e1
        L_0x052d:
            java.lang.String r0 = "H120"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x05e1
        L_0x0539:
            java.lang.String r0 = "H123"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05e1
        L_0x0545:
            java.lang.String r0 = "H150"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x05e1
        L_0x0552:
            java.lang.String r0 = "H153"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x05e1
        L_0x055e:
            java.lang.String r0 = "H156"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x05e1
        L_0x0569:
            java.lang.String r0 = "H180"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x05e1
        L_0x0574:
            java.lang.String r0 = "H183"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x05e1
        L_0x057f:
            java.lang.String r0 = "H186"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x05e1
        L_0x058a:
            java.lang.String r0 = "L120"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x05e1
        L_0x0595:
            java.lang.String r0 = "L123"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x05e1
        L_0x05a0:
            java.lang.String r0 = "L150"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x05e1
        L_0x05ab:
            java.lang.String r0 = "L153"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x05e1
        L_0x05b6:
            java.lang.String r0 = "L156"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x05e1
        L_0x05c1:
            java.lang.String r0 = "L180"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x05e1
        L_0x05cc:
            java.lang.String r0 = "L183"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x05e1
        L_0x05d7:
            java.lang.String r0 = "L186"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04a3
            r0 = 16777216(0x1000000, float:2.3509887E-38)
        L_0x05e1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x05e5:
            if (r1 == 0) goto L_0x04a3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r10 = X.C108945cZ.A0N(r0, r1)
            return r10
        L_0x05f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown HEVC profile string: "
            goto L_0x0043
        L_0x05f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            goto L_0x0046
        L_0x05fe:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0615
        L_0x0607:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            goto L_0x0611
        L_0x060c:
            return r10
        L_0x060d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
        L_0x0611:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0615:
            android.util.Pair r10 = X.C108945cZ.A0N(r4, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26283Cwe.A00(X.D48):android.util.Pair");
    }

    public static String A01(D48 d48) {
        Pair A002;
        String str = d48.A0S;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(str) || (A002 = A00(d48)) == null) {
            return null;
        }
        int A012 = C108965cb.A01(A002);
        if (A012 == 16 || A012 == 256) {
            return "video/hevc";
        }
        if (A012 == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (A06(r13) == false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x014d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A[Catch:{ Exception -> 0x01a8, Exception -> 0x01e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.CYB r21, X.E9P r22) {
        /*
            java.lang.String r9 = "secure-playback"
            java.lang.String r8 = "tunneled-playback"
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x01e3 }
            r15 = r21
            java.lang.String r6 = r15.A00     // Catch:{ Exception -> 0x01e3 }
            r10 = r22
            int r14 = r10.BOs()     // Catch:{ Exception -> 0x01e3 }
            boolean r16 = r10.CH8()     // Catch:{ Exception -> 0x01e3 }
            r5 = 0
        L_0x0017:
            if (r5 >= r14) goto L_0x01e2
            android.media.MediaCodecInfo r13 = r10.BOt(r5)     // Catch:{ Exception -> 0x01e3 }
            int r4 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ Exception -> 0x01e3 }
            r0 = 29
            if (r4 < r0) goto L_0x002a
            boolean r1 = A06(r13)     // Catch:{ Exception -> 0x01e3 }
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x014d
            java.lang.String r3 = r13.getName()     // Catch:{ Exception -> 0x01e3 }
            boolean r0 = r13.isEncoder()     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            if (r16 != 0) goto L_0x0042
            java.lang.String r0 = ".secure"
            boolean r0 = r3.endsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0042
            goto L_0x00b6
        L_0x0042:
            r0 = 24
            java.lang.String r1 = "samsung"
            if (r4 >= r0) goto L_0x00b4
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "OMX.Exynos.AAC.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00a3
        L_0x0058:
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ Exception -> 0x01e3 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = "zeroflte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "zerolte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "zenlte"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "SC-05G"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "marinelteatt"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "404SC"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "SC-04G"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "SCV31"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00b6
        L_0x00a3:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r0 = 1
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x014d
            java.lang.String[] r12 = r13.getSupportedTypes()     // Catch:{ Exception -> 0x01e3 }
            int r11 = r12.length     // Catch:{ Exception -> 0x01e3 }
            r1 = 0
        L_0x00bf:
            if (r1 >= r11) goto L_0x00cc
            r2 = r12[r1]     // Catch:{ Exception -> 0x01e3 }
            boolean r0 = r2.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x012c
            int r1 = r1 + 1
            goto L_0x00bf
        L_0x00cc:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = "OMX.MS.HEVCDV.Decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = "video/hevcdv"
            goto L_0x012c
        L_0x00df:
            java.lang.String r0 = "OMX.RTK.video.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "OMX.realtek.video.decoder.tunneled"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x012b
        L_0x00ef:
            java.lang.String r2 = "video/dv_hevc"
            goto L_0x012c
        L_0x00f2:
            java.lang.String r0 = "audio/alac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = "OMX.lge.alac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0105
            java.lang.String r2 = "audio/x-lg-alac"
            goto L_0x012c
        L_0x0105:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "OMX.lge.flac.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r2 = "audio/x-lg-flac"
            goto L_0x012c
        L_0x0118:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "OMX.lge.ac3.decoder"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x01e3 }
            if (r0 == 0) goto L_0x012b
            java.lang.String r2 = "audio/lg-ac3"
            goto L_0x012c
        L_0x012b:
            r2 = 0
        L_0x012c:
            if (r2 == 0) goto L_0x014d
            android.media.MediaCodecInfo$CodecCapabilities r1 = r13.getCapabilitiesForType(r2)     // Catch:{ Exception -> 0x01a8 }
            r10.Bel(r1, r8, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = r10.Bek(r1, r8)     // Catch:{ Exception -> 0x01a8 }
            if (r0 != 0) goto L_0x014d
            boolean r12 = r10.Bel(r1, r9, r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = r10.Bek(r1, r9)     // Catch:{ Exception -> 0x01a8 }
            boolean r11 = r15.A01     // Catch:{ Exception -> 0x01a8 }
            if (r11 != 0) goto L_0x0149
            if (r0 != 0) goto L_0x014d
        L_0x0149:
            if (r11 == 0) goto L_0x0151
            if (r12 != 0) goto L_0x0151
        L_0x014d:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0151:
            r0 = 29
            if (r4 < r0) goto L_0x015a
            boolean r20 = A07(r13)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0160
        L_0x015a:
            boolean r0 = A09(r13, r6)     // Catch:{ Exception -> 0x01a8 }
            r20 = r0 ^ 1
        L_0x0160:
            boolean r21 = A09(r13, r6)     // Catch:{ Exception -> 0x01a8 }
            r0 = 29
            if (r4 < r0) goto L_0x016c
            A04(r13)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0173
        L_0x016c:
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x01a8 }
            X.C24603CBh.A00(r0)     // Catch:{ Exception -> 0x01a8 }
        L_0x0173:
            if (r16 == 0) goto L_0x0177
            if (r11 == r12) goto L_0x0198
        L_0x0177:
            if (r16 != 0) goto L_0x017c
            if (r11 != 0) goto L_0x017c
            goto L_0x0198
        L_0x017c:
            if (r16 != 0) goto L_0x014d
            if (r12 == 0) goto L_0x014d
            java.lang.StringBuilder r11 = X.AnonymousClass000.A11(r3)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = ".secure"
            java.lang.String r18 = X.AnonymousClass000.A0y(r0, r11)     // Catch:{ Exception -> 0x01a8 }
            r22 = 1
            r17 = r1
            r19 = r6
            X.Csn r0 = X.C26125Csn.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01a8 }
            r7.add(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01cb
        L_0x0198:
            r22 = 0
            r17 = r1
            r18 = r3
            r19 = r6
            X.Csn r0 = X.C26125Csn.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01a8 }
            r7.add(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x014d
        L_0x01a8:
            r12 = move-exception
            r0 = 23
            java.lang.String r11 = "MediaCodecUtil"
            if (r4 > r0) goto L_0x01cc
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x01e3 }
            if (r0 != 0) goto L_0x01cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = "Skipping codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
            r1.append(r3)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = " (failed to query capabilities)"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x01e3 }
            android.util.Log.e(r11, r0)     // Catch:{ Exception -> 0x01e3 }
            goto L_0x014d
        L_0x01cb:
            return r7
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = "Failed to query codec "
            r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
            r1.append(r3)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r0 = " ("
            java.lang.String r0 = X.BEA.A0l(r0, r2, r1)     // Catch:{ Exception -> 0x01e3 }
            android.util.Log.e(r11, r0)     // Catch:{ Exception -> 0x01e3 }
            throw r12     // Catch:{ Exception -> 0x01e3 }
        L_0x01e2:
            return r7
        L_0x01e3:
            r1 = move-exception
            X.C1L r0 = new X.C1L
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26283Cwe.A02(X.CYB, X.E9P):java.util.ArrayList");
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [X.E9P, java.lang.Object] */
    public static synchronized List A03(String str, boolean z) {
        List list;
        synchronized (C26283Cwe.class) {
            CYB cyb = new CYB(str, z);
            HashMap hashMap = A01;
            list = (List) hashMap.get(cyb);
            if (list == null) {
                int i = Util.A00;
                ArrayList A02 = A02(cyb, new D9E(z));
                if (z && A02.isEmpty() && i <= 23) {
                    A02 = A02(cyb, new Object());
                    if (!A02.isEmpty()) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("MediaCodecList API didn't list secure decoder for: ");
                        A10.append(str);
                        A10.append(". Assuming: ");
                        BE9.A1H(((C26125Csn) AnonymousClass8BS.A0Y(A02)).A02, "MediaCodecUtil", A10);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (i < 26 && Util.A01.equals("R9") && A02.size() == 1 && ((C26125Csn) A02.get(0)).A02.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        A02.add(C26125Csn.A00((MediaCodecInfo.CodecCapabilities) null, "OMX.google.raw.decoder", "audio/raw", false, true, false));
                    }
                    DUP.A00(new C25025CUb(), A02, 2);
                }
                if (i < 32 && A02.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C26125Csn) A02.get(0)).A02)) {
                    A02.add(A02.remove(0));
                }
                list = AnonymousClass1IX.copyOf((Collection) A02);
                hashMap.put(cyb, list);
            }
        }
        return list;
    }

    public static boolean A09(MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.A00 >= 29) {
            return A08(mediaCodecInfo);
        }
        if (!BE8.A1Z(str, "audio")) {
            String A002 = C24603CBh.A00(mediaCodecInfo.getName());
            if (A002.startsWith("arc.")) {
                return false;
            }
            if (A002.startsWith("omx.google.") || A002.startsWith("omx.ffmpeg.") || ((A002.startsWith("omx.sec.") && A002.contains(".sw.")) || A002.equals("omx.qcom.video.decoder.hevcswvdec") || A002.startsWith("c2.android.") || A002.startsWith("c2.google.") || (!A002.startsWith("omx.") && !A002.startsWith("c2.")))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean A06(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A07(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A08(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static void A04(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isVendor();
    }
}
