package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Cv7  reason: case insensitive filesystem */
public class C26219Cv7 {
    public C25744ClE A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final C25626Cj6 A05;
    public final C24794CKn A06;
    public final C26381Cyh A07;
    public final C25484Cgf A08;
    public final ServiceEventCallbackImpl A09;
    public final D9R A0A;
    public final C25699CkU A0B;
    public final C27066DRp A0C;
    public final Map A0D;

    public static boolean A04(HashMap hashMap) {
        try {
            for (C26125Csn csn : C26283Cwe.A03("video/av01", false)) {
                if (!csn.A08 && csn.A04) {
                    String str = csn.A02;
                    if (!(str == null || hashMap == null || hashMap.isEmpty())) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        if (hashMap.containsKey(lowerCase)) {
                            int A0D2 = BE9.A0D(lowerCase, hashMap);
                            if (A0D2 == -1) {
                                continue;
                            } else if (Build.VERSION.SDK_INT < A0D2) {
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (C1L e) {
            Object[] objArr = new Object[1];
            BE6.A1M(e, objArr, 0);
            BE7.A1M("Failed to query AV1 decoders on device with exception %s. AV1 Hardware decoder will not be picked.", "HeroExo2InitHelper", objArr);
            return false;
        }
    }

    public static C25702CkX A00(String str, String str2, String str3, String str4, int i) {
        E0X e0x = D48.CREATOR;
        C25702CkX ckX = new C25702CkX();
        ckX.A0P = str;
        ckX.A0O = str2;
        ckX.A0R = str3;
        ckX.A0N = str4;
        ckX.A03 = i;
        return ckX;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.D9I[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0414, code lost:
        if ("main".equals(r2) == false) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ce, code lost:
        if (r0.contains("hvq_mobile_landscape") == false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04d2, code lost:
        if (r0 != null) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d4, code lost:
        r90 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04dc, code lost:
        if (r0.contains("hvq_mobile_portrait") != false) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04de, code lost:
        r90 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04e0, code lost:
        if (r0 == null) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e2, code lost:
        r89 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04ea, code lost:
        if (r0.contains("avoid_on_cellular") != false) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ec, code lost:
        r89 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04ee, code lost:
        if (r0 == null) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f0, code lost:
        r88 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04f8, code lost:
        if (r0.contains("avoid_on_cellular_intentional") != false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04fa, code lost:
        r88 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04fc, code lost:
        if (r0 == null) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04fe, code lost:
        r87 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0506, code lost:
        if (r0.contains("avoid_on_cell_datasaver") != false) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0508, code lost:
        r87 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x050a, code lost:
        if (r0 == null) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x050c, code lost:
        r86 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0514, code lost:
        if (r0.contains("avoid_on_cell_datasaver_intentional") != false) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0516, code lost:
        r86 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0518, code lost:
        if (r0 == null) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x051a, code lost:
        r85 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0522, code lost:
        if (r0.contains("avoid_on_abr") != false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0524, code lost:
        r85 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0526, code lost:
        if (r0 == null) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0528, code lost:
        r84 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0530, code lost:
        if (r0.contains("avoid_on_abr_intentional") != false) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0532, code lost:
        r84 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0534, code lost:
        r105 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMos");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x053c, code lost:
        if (r0 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x053e, code lost:
        r105 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0540, code lost:
        r104 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMosConfidenceLevel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0548, code lost:
        if (r0 == null) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x054a, code lost:
        r104 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x054c, code lost:
        r103 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionCsvqm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0554, code lost:
        if (r0 == null) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0556, code lost:
        r103 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0558, code lost:
        r100 = null;
        r0 = r4.getAttributeValue((java.lang.String) null, "FBEncodingTag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0560, code lost:
        if (r0 == null) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0562, code lost:
        r100 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x056b, code lost:
        r81 = X.AnonymousClass000.A1T(X.E06.A01("FBUltraLowLatencyEncoding", r4, 0), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0571, code lost:
        if (r13 != false) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x057c, code lost:
        if (X.E06.A01("FBDefaultQuality", r4, 0) == 0) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x057e, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x057f, code lost:
        r80 = X.AnonymousClass000.A13();
        r79 = X.AnonymousClass000.A13();
        r13 = X.AnonymousClass000.A13();
        r122 = null;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x058e, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0597, code lost:
        if (X.C25305Cd9.A01("BaseURL", r4) == false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0599, code lost:
        if (r2 != false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x059b, code lost:
        r76 = X.E06.A0A(r76, r4);
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05a7, code lost:
        if (X.C25305Cd9.A01("AudioChannelConfiguration", r4) == false) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05a9, code lost:
        r98 = X.E06.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05b1, code lost:
        if (X.C25305Cd9.A00("Representation", r4) == false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05b6, code lost:
        r78 = X.AnonymousClass000.A1R(r80.size());
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05c2, code lost:
        if (X.BE8.A1Z(r10, "audio") == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05cc, code lost:
        if (X.C25305Cd9.A01("SegmentBase", r4) == false) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ce, code lost:
        r9 = r12.A0K((X.BP6) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05db, code lost:
        if (X.C25305Cd9.A01("SegmentList", r4) == false) goto L_0x05e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05dd, code lost:
        r9 = r12.A0H((X.BP3) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05ea, code lost:
        if (X.C25305Cd9.A01("SegmentTemplate", r4) == false) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05ec, code lost:
        r9 = r12.A0I((X.BP4) r9, r4, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05f9, code lost:
        if (X.C25305Cd9.A01("ContentProtection", r4) == false) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05fb, code lost:
        r1 = X.E06.A06(r4);
        r0 = r1.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0601, code lost:
        if (r0 == null) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0603, code lost:
        r122 = (java.lang.String) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0607, code lost:
        r1 = r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0609, code lost:
        if (r1 == null) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x060b, code lost:
        r80.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0617, code lost:
        if (X.C25305Cd9.A01("InbandEventStream", r4) == false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0619, code lost:
        r79.add(X.E06.A07("InbandEventStream", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0627, code lost:
        if (X.C25305Cd9.A01("SupplementalProperty", r4) == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0629, code lost:
        r13.add(X.E06.A07("SupplementalProperty", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0638, code lost:
        if (X.C25305Cd9.A01("FBInitializationBinary", r4) == false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x063a, code lost:
        r4.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0645, code lost:
        if (X.C25305Cd9.A01("FBSegmentIndexBinary", r4) == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0647, code lost:
        r4.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x064c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x064d, code lost:
        if (r8 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0653, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0655, code lost:
        r3 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0659, code lost:
        r6 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x065c, code lost:
        r3 = r8.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x066e, code lost:
        if (X.BE8.A1Z(r10, "video") == false) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0670, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0671, code lost:
        if (r8 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0677, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0680;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0679, code lost:
        r3 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x067d, code lost:
        r7 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0680, code lost:
        r3 = r8.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x068c, code lost:
        if (r1 >= r7) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x068e, code lost:
        r0 = X.C26233CvQ.A03(r3[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0694, code lost:
        if (r0 == null) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069a, code lost:
        if (X.BE8.A1Z(r0, "video") == false) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x069d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06a0, code lost:
        if (X.BE8.A1Z(r0, "audio") == false) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06a2, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06a4, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06a6, code lost:
        if (r1 >= r6) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06a8, code lost:
        r0 = X.C26233CvQ.A03(r3[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06ae, code lost:
        if (r0 == null) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06b9, code lost:
        if (X.E06.A0D(r10) == false) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06bb, code lost:
        if (r10 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06be, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06c5, code lost:
        if ("application/mp4".equals(r10) == false) goto L_0x06e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06cd, code lost:
        if ("stpp".equals(r8) == false) goto L_0x06da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06cf, code lost:
        r2 = "application/ttml+xml";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06d7, code lost:
        if ("audio/eac3".equals(r2) == false) goto L_0x0730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06e0, code lost:
        if ("wvtt".equals(r8) == false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06e2, code lost:
        r2 = "application/x-mp4-vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06eb, code lost:
        if ("application/x-rawcc".equals(r10) == false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06ed, code lost:
        if (r8 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06f5, code lost:
        if (r8.contains("cea708") == false) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06f7, code lost:
        r2 = "application/cea-708";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0700, code lost:
        if (r8.contains("eia608") != false) goto L_0x070a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0708, code lost:
        if (r8.contains("cea608") == false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x070a, code lost:
        r2 = "application/cea-608";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x070d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0712, code lost:
        if (r1 >= r13.size()) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0714, code lost:
        r0 = (X.CYY) r13.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0722, code lost:
        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(r0.A01) == false) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x072c, code lost:
        if ("ec+3".equals(r0.A02) == false) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x072e, code lost:
        r2 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0737, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x073a, code lost:
        r2 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x073c, code lost:
        if (X.BE8.A1Z(r2, "video") == false) goto L_0x07b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x073e, code lost:
        r2 = A00(r83, r10, r2, r8, r82);
        r2.A0H = r97;
        r2.A08 = r96;
        r2.A00 = r95;
        r2.A0S = null;
        r2.A0F = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0759, code lost:
        r2 = A00(r83, r10, r2, r8, r82);
        r2.A0F = r41;
        r2.A0Q = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0769, code lost:
        r1 = new X.CUN();
        r1.A05 = r114;
        r1.A0F = r91;
        r1.A0G = r90;
        r1.A0C = r89;
        r1.A0B = r88;
        r1.A0A = r87;
        r1.A09 = r86;
        r1.A08 = r85;
        r1.A07 = r84;
        r1.A0H = r78;
        r1.A03 = r105;
        r1.A04 = r104;
        r1.A02 = r103;
        r1.A06 = r126;
        r1.A01 = r100;
        r1.A0E = r15;
        r1.A00 = r92;
        r1.A0D = r93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07b9, code lost:
        if (X.BE8.A1Z(r2, "audio") == false) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07bb, code lost:
        r2 = A00(r83, r10, r2, r8, r82);
        r2.A04 = r98;
        r2.A0E = r94;
        r2.A0S = null;
        r2.A0F = r41;
        r2.A0Q = r42;
        r1 = new X.CUN();
        r1.A01 = r100;
        r1.A0E = r15;
        r1.A00 = r92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07e4, code lost:
        r1.A0I = r81;
        r2.A0J = new X.D3W(r1);
        r0 = new X.D48(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07fa, code lost:
        if (X.E06.A0D(r2) == false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0802, code lost:
        if ("application/cea-608".equals(r2) == false) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0804, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0809, code lost:
        if (r1 >= r54.size()) goto L_0x0890;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x080b, code lost:
        r0 = (X.CYY) r54.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x081b, code lost:
        if ("urn:scte:dash:cc:cea-608:2015".equals(r0.A01) == false) goto L_0x0843;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x081f, code lost:
        if (r0.A02 == null) goto L_0x0843;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0821, code lost:
        r3 = X.E06.A06.matcher(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x082d, code lost:
        if (r3.matches() != false) goto L_0x0892;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x082f, code lost:
        r3 = X.AnonymousClass000.A10();
        r3.append("Unable to parse CEA-608 channel number from: ");
        android.util.Log.w("MpdParser", X.AnonymousClass000.A0y(r0.A02, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0843, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x084c, code lost:
        if ("application/cea-708".equals(r2) == false) goto L_0x0890;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x084e, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0853, code lost:
        if (r1 >= r54.size()) goto L_0x0890;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0855, code lost:
        r0 = (X.CYY) r54.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0865, code lost:
        if ("urn:scte:dash:cc:cea-708:2015".equals(r0.A01) == false) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0869, code lost:
        if (r0.A02 == null) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x086b, code lost:
        r3 = X.E06.A07.matcher(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0877, code lost:
        if (r3.matches() != false) goto L_0x0892;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0879, code lost:
        r3 = X.AnonymousClass000.A10();
        r3.append("Unable to parse CEA-708 service block number from: ");
        android.util.Log.w("MpdParser", X.AnonymousClass000.A0y(r0.A02, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x088d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0890, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0892, code lost:
        r3 = X.BE8.A0D(r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0897, code lost:
        r1 = A00(r83, r10, r2, r8, r82);
        r1.A0F = r41;
        r1.A0Q = r42;
        r1.A02 = r3;
        r0 = new X.D48(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08ae, code lost:
        if (r9 != null) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x08b0, code lost:
        r9 = new X.BP6();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x08b5, code lost:
        r118 = new X.CSl(r0, r9, r76, r122, r80, r79);
        r0 = r118.A00.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x08ce, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x08d6, code lost:
        if (X.BE8.A1Z(r0, "video") == false) goto L_0x08da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x08d8, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x08de, code lost:
        if (X.BE8.A1Z(r0, "audio") == false) goto L_0x08e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x08e1, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08e6, code lost:
        if (X.E06.A0D(r0) != false) goto L_0x08eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08e8, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x08ea, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08eb, code lost:
        r0 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08ee, code lost:
        if (r0 != -1) goto L_0x08f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08f0, code lost:
        r56 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08f3, code lost:
        if (r1 == -1) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        X.C26056CrS.A03(X.AnonymousClass000.A1T(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08fc, code lost:
        r51.add(r118);
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0c75, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:?, code lost:
        android.util.Log.e("DashManifestHelper2", X.AnonymousClass8BS.A0l(r75, "Failed to parse manifest: %s", new java.lang.Object[1], 0), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c8f, code lost:
        throw new X.C1S(r75, r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0c75 A[ExcHandler: BxS | RuntimeException (r4v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:547:0x0be9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.CUI A01(X.C25238CbZ r125, X.C27066DRp r126) {
        /*
            r0 = r125
            X.D47 r4 = r0.A0C
            java.lang.String r3 = r4.A0H
            r0 = r126
            boolean r2 = r0.parseManifestIdentifier
            boolean r1 = r0.enableDashManifestPool
            int r0 = r0.dashManifestPoolSize
            r71 = 0
            X.E06 r12 = new X.E06
            r12.<init>(r3, r0, r2, r1)
            android.net.Uri r0 = r4.A05
            r75 = r0
            java.lang.String r1 = r4.A0A
            r5 = 0
            if (r1 == 0) goto L_0x0ca8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0ca8
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            java.io.ByteArrayInputStream r74 = X.BE6.A0h(r0)     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            java.lang.String r73 = "Failed to close manifest input stream"
            java.lang.String r72 = "DashManifestHelper2"
            long r31 = java.lang.System.currentTimeMillis()     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            X.CMJ r0 = r12.A01     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r16 = r0
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = r12.A03     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 != 0) goto L_0x005c
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0beb }
            if (r0 == 0) goto L_0x004c
            goto L_0x005b
        L_0x004c:
            r0 = r16
            android.util.LruCache r0 = r0.A00     // Catch:{ all -> 0x0beb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0beb }
            X.CUI r0 = (X.CUI) r0     // Catch:{ all -> 0x0beb }
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0bee
        L_0x005b:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x005c:
            org.xmlpull.v1.XmlPullParserFactory r0 = r12.A04     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            org.xmlpull.v1.XmlPullParser r4 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r21 = 0
            r0 = r74
            r4.setInput(r0, r5)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r1 = r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = 2
            if (r1 != r0) goto L_0x0c3f
            java.lang.String r70 = "MPD"
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r70
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0c3f
            if (r75 == 0) goto L_0x0084
            java.lang.String r21 = r75.toString()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0084:
            java.lang.String r0 = "availabilityStartTime"
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.E06.A0C(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "mediaPresentationDuration"
            r0 = r17
            long r29 = X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "minBufferTime"
            X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "type"
            r69 = 0
            r1 = r69
            java.lang.String r1 = r4.getAttributeValue(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x010d
            java.lang.String r0 = "dynamic"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x010d
            r22 = 1
            java.lang.String r2 = "minimumUpdatePeriod"
            r0 = r17
            X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "timeShiftBufferDepth"
            X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "suggestedPresentationDelay"
            X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x00c2:
            java.lang.String r0 = "publishTime"
            X.E06.A0C(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "availabilityEndTime"
            X.E06.A0C(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "firstAvTimeMs"
            r0 = -1
            long r106 = X.E06.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "currentServerTimeMs"
            long r108 = X.E06.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "lastVideoFrameTs"
            long r110 = X.E06.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "publishFrameTime"
            r0 = 0
            long r112 = X.E06.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "FBWasLive"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "FBIsLiveTemplated"
            r115 = 0
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x00fd
            java.lang.String r1 = "true"
            boolean r115 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x00fd:
            java.lang.String r0 = "FBMS"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "usingASRCaptions"
            java.lang.String r1 = "0"
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0111
            goto L_0x0110
        L_0x010d:
            r22 = 0
            goto L_0x00c2
        L_0x0110:
            r1 = r0
        L_0x0111:
            java.lang.String r0 = "1"
            boolean r117 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "loapStreamId"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = "loapStreamType"
            r0 = r71
            X.E06.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "validationErrors"
            java.lang.String r66 = ""
            r102 = r66
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0131
            r102 = r0
        L_0x0131:
            boolean r0 = r12.A05     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "FBManifestIdentifier"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x013a:
            java.lang.String r0 = "FBTagsetUsed"
            r101 = r69
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0146
            r101 = r0
        L_0x0146:
            java.lang.String r0 = "FBDeliveryExperimentName"
            r1 = r69
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0151
            r1 = r0
        L_0x0151:
            java.lang.String r0 = "FBDeliveryExperimentGroup"
            java.lang.String r2 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r2 == 0) goto L_0x0168
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = 58
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.append(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.toString()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0168:
            java.lang.String r0 = "FBManifestTimestamp"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r21 == 0) goto L_0x0181
            java.util.regex.Pattern r1 = X.E06.A08     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r21
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = r1.find()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0181
            r0 = 1
            r1.group(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0181:
            java.util.ArrayList r68 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r22 == 0) goto L_0x018d
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x018f
        L_0x018d:
            r19 = 0
        L_0x018f:
            r67 = r69
            r27 = 0
            r28 = 0
            r116 = 0
            r99 = r69
        L_0x0199:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r63 = "BaseURL"
            r0 = r63
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x01b1
            if (r27 != 0) goto L_0x01cc
            r0 = r21
            java.lang.String r21 = X.E06.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r27 = 1
            goto L_0x01cc
        L_0x01b1:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r2 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "value"
            java.lang.String r1 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CVd r67 = new X.CVd     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r67
            r0.<init>(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x01cc:
            r0 = r70
            boolean r0 = X.C25305Cd9.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0199
            goto L_0x0b5d
        L_0x01d6:
            java.lang.String r0 = "Location"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            android.net.Uri r99 = android.net.Uri.parse(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x01cc
        L_0x01e7:
            java.lang.String r62 = "Period"
            r0 = r62
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x01cc
            if (r28 != 0) goto L_0x01cc
            r61 = r21
            java.lang.String r60 = "id"
            r1 = r69
            r0 = r60
            r4.getAttributeValue(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "start"
            r0 = r19
            long r58 = X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r57 = "duration"
            r2 = r57
            r0 = r17
            long r25 = X.E06.A04(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r64 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r65 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r23 = r69
            r24 = 0
        L_0x021c:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r63
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0233
            if (r24 != 0) goto L_0x0ae5
            r0 = r61
            java.lang.String r61 = X.E06.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r24 = 1
            goto L_0x0ae5
        L_0x0233:
            java.lang.String r50 = "AdaptationSet"
            r0 = r50
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x094e
            r11 = r23
            r49 = r61
            r1 = -1
            r0 = r60
            X.E06.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r56 = X.E06.A03(r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "FBUploadResolutionMos"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "FBUploadResolutionMosConfidenceLevel"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "FBUnifiedUploadResolutionMos"
            r126 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0261
            r126 = r0
        L_0x0261:
            java.lang.String r0 = "subsegmentAlignment"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "bitstreamSwitching"
            r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r47 = "mimeType"
            r0 = r47
            java.lang.String r48 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r45 = "codecs"
            r0 = r45
            java.lang.String r46 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r44 = "width"
            r0 = r44
            int r43 = X.E06.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r40 = "height"
            r0 = r40
            int r35 = X.E06.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r36 = X.E06.A00(r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r37 = "audioSamplingRate"
            r0 = r37
            int r38 = X.E06.A01(r0, r4, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r39 = "lang"
            r0 = r39
            java.lang.String r42 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r53 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r52 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r54 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r55 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r51 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r125 = r5
            r13 = 1
            r34 = -1
            r33 = 0
            r41 = 0
        L_0x02be:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r63
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x02d4
            if (r33 != 0) goto L_0x02f1
            r0 = r49
            java.lang.String r49 = X.E06.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r33 = 1
            goto L_0x02f1
        L_0x02d4:
            java.lang.String r14 = "ContentProtection"
            boolean r0 = X.C25305Cd9.A01(r14, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x03aa
            android.util.Pair r1 = X.E06.A06(r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x02e8
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r125 = r0
        L_0x02e8:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x02f1
            r0 = r53
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x02f1:
            r0 = r50
            boolean r0 = X.C25305Cd9.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x02be
            java.util.ArrayList r13 = X.C108975cc.A0g(r51)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r9 = 0
        L_0x02fe:
            int r0 = r51.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r9 >= r0) goto L_0x0ad5
            r0 = r51
            java.lang.Object r1 = r0.get(r9)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CSl r1 = (X.CSl) r1     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r14 = r125
            X.D48 r8 = r1.A00     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = r1.A03     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0315
            r14 = r0
        L_0x0315:
            java.util.ArrayList r3 = r1.A04     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r53
            r3.addAll(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = r3.isEmpty()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 != 0) goto L_0x0380
            int r2 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0326:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0362
            java.lang.Object r0 = r3.get(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D3w r0 = (X.C26556D3w) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            byte[] r6 = r0.A04     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r6 != 0) goto L_0x0326
            r7 = 0
        L_0x0335:
            int r6 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r7 >= r6) goto L_0x0326
            java.lang.Object r6 = r3.get(r7)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D3w r6 = (X.C26556D3w) r6     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            byte[] r10 = r6.A04     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r10 == 0) goto L_0x035f
            byte[] r10 = r0.A04     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r10 != 0) goto L_0x035f
            java.util.UUID r11 = r0.A03     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.UUID r10 = X.C24736CHy.A03     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.UUID r6 = r6.A03     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r10 = r10.equals(r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r10 != 0) goto L_0x035b
            boolean r6 = r11.equals(r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r6 == 0) goto L_0x035f
        L_0x035b:
            r3.remove(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0326
        L_0x035f:
            int r7 = r7 + 1
            goto L_0x0335
        L_0x0362:
            int r0 = r3.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D3w[] r0 = new X.C26556D3w[r0]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D3w[] r0 = (X.C26556D3w[]) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.DUU r2 = new X.DUU     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2.<init>(r14, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CkX r0 = new X.CkX     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r8)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.A00(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D48 r8 = new X.D48     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r8.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0380:
            java.util.ArrayList r2 = r1.A05     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r52
            r2.addAll(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = r1.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CPF r1 = r1.A01     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = r1 instanceof X.BP6     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x039a
            X.BP6 r1 = (X.BP6) r1     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP2 r0 = new X.BP2     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r8, r1, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0396:
            r13.add(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x03a6
        L_0x039a:
            boolean r0 = r1 instanceof X.BP5     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0c53
            X.BP5 r1 = (X.BP5) r1     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP1 r0 = new X.BP1     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r8, r1, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0396
        L_0x03a6:
            int r9 = r9 + 1
            goto L_0x02fe
        L_0x03aa:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x03e0
            r0 = r39
            java.lang.String r1 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r42 != 0) goto L_0x03bd
            r42 = r1
            goto L_0x03c8
        L_0x03bd:
            if (r1 == 0) goto L_0x03c8
            r0 = r42
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.C26056CrS.A03(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x03c8:
            int r2 = X.E06.A03(r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = -1
            r0 = r56
            if (r0 != r1) goto L_0x03d5
            r56 = r2
            goto L_0x02f1
        L_0x03d5:
            if (r2 == r1) goto L_0x02f1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            X.C26056CrS.A03(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x03e0:
            java.lang.String r1 = "Role"
            boolean r0 = X.C25305Cd9.A01(r1, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x041b
            java.lang.String r0 = "schemeIdUri"
            r2 = 0
            r3 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x03f3
            r3 = r0
        L_0x03f3:
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x03fc
            r2 = r0
        L_0x03fc:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = X.C25305Cd9.A00(r1, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x03fc
            java.lang.String r0 = "urn:mpeg:dash:role:2011"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0416
            java.lang.String r0 = "main"
            boolean r1 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = 1
            if (r1 != 0) goto L_0x0417
        L_0x0416:
            r0 = 0
        L_0x0417:
            r41 = r41 | r0
            goto L_0x02f1
        L_0x041b:
            java.lang.String r7 = "AudioChannelConfiguration"
            boolean r0 = X.C25305Cd9.A01(r7, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0429
            int r34 = X.E06.A02(r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x0429:
            java.lang.String r0 = "Accessibility"
            boolean r1 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x043c
            X.CYY r1 = X.E06.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r54
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x043c:
            java.lang.String r3 = "SupplementalProperty"
            boolean r0 = X.C25305Cd9.A01(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x044f
            X.CYY r1 = X.E06.A07(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r55
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x044f:
            java.lang.String r6 = "Representation"
            boolean r0 = X.C25305Cd9.A01(r6, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0904
            r76 = r49
            r9 = r11
            r98 = r34
            r8 = r46
            r10 = r48
            r0 = r60
            java.lang.String r83 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "bandwidth"
            r2 = -1
            int r82 = X.E06.A01(r0, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r47
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0476
            r10 = r0
        L_0x0476:
            r0 = r45
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x047f
            r8 = r0
        L_0x047f:
            r1 = r44
            r0 = r43
            int r97 = X.E06.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = r40
            r0 = r35
            int r96 = X.E06.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r36
            float r95 = X.E06.A00(r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = r37
            r0 = r38
            int r94 = X.E06.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "FBQualityLabel"
            r114 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x04a9
            r114 = r0
        L_0x04a9:
            java.lang.String r0 = "FBMaxBandwidth"
            int r92 = X.E06.A01(r0, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = "FBAbrPolicyTags"
            r0 = r5
            java.lang.String r1 = r4.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x04b9
            r0 = r1
        L_0x04b9:
            java.lang.String r1 = "FBDynamicQualityDropped"
            int r2 = X.E06.A01(r1, r4, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = 1
            boolean r93 = X.AnonymousClass000.A1T(r2, r1)
            if (r0 == 0) goto L_0x04d0
            java.lang.String r1 = "hvq_mobile_landscape"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r91 = 1
            if (r1 != 0) goto L_0x04d4
        L_0x04d0:
            r91 = 0
            if (r0 == 0) goto L_0x04de
        L_0x04d4:
            java.lang.String r1 = "hvq_mobile_portrait"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r90 = 1
            if (r1 != 0) goto L_0x04e2
        L_0x04de:
            r90 = 0
            if (r0 == 0) goto L_0x04ec
        L_0x04e2:
            java.lang.String r1 = "avoid_on_cellular"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r89 = 1
            if (r1 != 0) goto L_0x04f0
        L_0x04ec:
            r89 = 0
            if (r0 == 0) goto L_0x04fa
        L_0x04f0:
            java.lang.String r1 = "avoid_on_cellular_intentional"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r88 = 1
            if (r1 != 0) goto L_0x04fe
        L_0x04fa:
            r88 = 0
            if (r0 == 0) goto L_0x0508
        L_0x04fe:
            java.lang.String r1 = "avoid_on_cell_datasaver"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r87 = 1
            if (r1 != 0) goto L_0x050c
        L_0x0508:
            r87 = 0
            if (r0 == 0) goto L_0x0516
        L_0x050c:
            java.lang.String r1 = "avoid_on_cell_datasaver_intentional"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r86 = 1
            if (r1 != 0) goto L_0x051a
        L_0x0516:
            r86 = 0
            if (r0 == 0) goto L_0x0524
        L_0x051a:
            java.lang.String r1 = "avoid_on_abr"
            boolean r1 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r85 = 1
            if (r1 != 0) goto L_0x0528
        L_0x0524:
            r85 = 0
            if (r0 == 0) goto L_0x0532
        L_0x0528:
            java.lang.String r1 = "avoid_on_abr_intentional"
            boolean r0 = r0.contains(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r84 = 1
            if (r0 != 0) goto L_0x0534
        L_0x0532:
            r84 = 0
        L_0x0534:
            java.lang.String r0 = "FBPlaybackResolutionMos"
            r105 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0540
            r105 = r0
        L_0x0540:
            java.lang.String r0 = "FBPlaybackResolutionMosConfidenceLevel"
            r104 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x054c
            r104 = r0
        L_0x054c:
            java.lang.String r0 = "FBPlaybackResolutionCsvqm"
            r103 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0558
            r103 = r0
        L_0x0558:
            java.lang.String r0 = "FBEncodingTag"
            r100 = r5
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0564
            r100 = r0
        L_0x0564:
            java.lang.String r1 = "FBUltraLowLatencyEncoding"
            r0 = r71
            int r1 = X.E06.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = 1
            boolean r81 = X.AnonymousClass000.A1T(r1, r0)
            if (r13 != 0) goto L_0x057e
            java.lang.String r1 = "FBDefaultQuality"
            r0 = r71
            int r0 = X.E06.A01(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r15 = 0
            if (r0 == 0) goto L_0x057f
        L_0x057e:
            r15 = 1
        L_0x057f:
            java.util.ArrayList r80 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r79 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r122 = r5
            r2 = 0
        L_0x058e:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r63
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x05a3
            if (r2 != 0) goto L_0x05ad
            r0 = r76
            java.lang.String r76 = X.E06.A0A(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2 = 1
            goto L_0x05ad
        L_0x05a3:
            boolean r0 = X.C25305Cd9.A01(r7, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x05c6
            int r98 = X.E06.A02(r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x05ad:
            boolean r0 = X.C25305Cd9.A00(r6, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x058e
            int r0 = r80.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r78 = X.AnonymousClass000.A1R(r0)
            r2 = r10
            java.lang.String r14 = "audio"
            boolean r0 = X.BE8.A1Z(r10, r14)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0668
            goto L_0x064c
        L_0x05c6:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x05d5
            X.BP6 r9 = (X.BP6) r9     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP6 r9 = r12.A0K(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x05d5:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x05e4
            X.BP3 r9 = (X.BP3) r9     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP3 r9 = r12.A0H(r9, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x05e4:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x05f5
            X.BP4 r9 = (X.BP4) r9     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r22
            X.BP4 r9 = r12.A0I(r9, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x05f5:
            boolean r0 = X.C25305Cd9.A01(r14, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0611
            android.util.Pair r1 = X.E06.A06(r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0607
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r122 = r0
        L_0x0607:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x05ad
            r0 = r80
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x0611:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x0623
            X.CYY r1 = X.E06.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r79
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x0623:
            boolean r0 = X.C25305Cd9.A01(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0632
            X.CYY r0 = X.E06.A07(r3, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r13.add(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x0632:
            java.lang.String r0 = "FBInitializationBinary"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x063f
            r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x063f:
            java.lang.String r0 = "FBSegmentIndexBinary"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x05ad
            r4.nextText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x05ad
        L_0x064c:
            r2 = 0
            if (r8 == 0) goto L_0x0759
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x065c
            r0 = r71
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0659:
            int r6 = r3.length     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = 0
            goto L_0x06a6
        L_0x065c:
            java.lang.String r3 = r8.trim()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = "(\\s*,\\s*)"
            r0 = -1
            java.lang.String[] r3 = r3.split(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0659
        L_0x0668:
            java.lang.String r6 = "video"
            boolean r0 = X.BE8.A1Z(r10, r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x06b5
            r2 = 0
            if (r8 == 0) goto L_0x0759
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0680
            r0 = r71
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x067d:
            int r7 = r3.length     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = 0
            goto L_0x068c
        L_0x0680:
            java.lang.String r3 = r8.trim()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = "(\\s*,\\s*)"
            r0 = -1
            java.lang.String[] r3 = r3.split(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x067d
        L_0x068c:
            if (r1 >= r7) goto L_0x0759
            r0 = r3[r1]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = X.C26233CvQ.A03(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x069d
            boolean r77 = X.BE8.A1Z(r0, r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r77 == 0) goto L_0x069d
            goto L_0x06a2
        L_0x069d:
            int r1 = r1 + 1
            goto L_0x068c
        L_0x06a0:
            if (r7 == 0) goto L_0x06a4
        L_0x06a2:
            r2 = r0
            goto L_0x06d1
        L_0x06a4:
            int r1 = r1 + 1
        L_0x06a6:
            if (r1 >= r6) goto L_0x0759
            r0 = r3[r1]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = X.C26233CvQ.A03(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x06a4
            boolean r7 = X.BE8.A1Z(r0, r14)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x06a0
        L_0x06b5:
            boolean r0 = X.E06.A0D(r10)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x06be
            if (r10 == 0) goto L_0x0759
            goto L_0x06d1
        L_0x06be:
            java.lang.String r0 = "application/mp4"
            boolean r0 = r0.equals(r10)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2 = 0
            if (r0 == 0) goto L_0x06e5
            java.lang.String r0 = "stpp"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x06da
            java.lang.String r2 = "application/ttml+xml"
        L_0x06d1:
            java.lang.String r6 = "audio/eac3"
            boolean r0 = r6.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0730
            goto L_0x070d
        L_0x06da:
            java.lang.String r0 = "wvtt"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0759
            java.lang.String r2 = "application/x-mp4-vtt"
            goto L_0x06d1
        L_0x06e5:
            java.lang.String r0 = "application/x-rawcc"
            boolean r0 = r0.equals(r10)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0759
            if (r8 == 0) goto L_0x0759
            java.lang.String r0 = "cea708"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x06fa
            java.lang.String r2 = "application/cea-708"
            goto L_0x06d1
        L_0x06fa:
            java.lang.String r0 = "eia608"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 != 0) goto L_0x070a
            java.lang.String r0 = "cea608"
            boolean r0 = r8.contains(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0759
        L_0x070a:
            java.lang.String r2 = "application/cea-608"
            goto L_0x06d1
        L_0x070d:
            r1 = 0
        L_0x070e:
            int r0 = r13.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 >= r0) goto L_0x073a
            java.lang.Object r0 = r13.get(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CYY r0 = (X.CYY) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r2 == 0) goto L_0x0737
            java.lang.String r2 = "ec+3"
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0737
            java.lang.String r2 = "audio/eac3-joc"
        L_0x0730:
            java.lang.String r0 = "video"
            boolean r0 = X.BE8.A1Z(r2, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x073c
        L_0x0737:
            int r1 = r1 + 1
            goto L_0x070e
        L_0x073a:
            r2 = r6
            goto L_0x0730
        L_0x073c:
            if (r0 == 0) goto L_0x07b5
            r1 = r83
            r0 = r82
            X.CkX r2 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r97
            r2.A0H = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r96
            r2.A08 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r95
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2.A0S = r5     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r41
            r2.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0769
        L_0x0759:
            r1 = r83
            r0 = r82
            X.CkX r2 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r41
            r2.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r42
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0769:
            X.CUN r1 = new X.CUN     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r114
            r1.A05 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r91
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r90
            r1.A0G = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r89
            r1.A0C = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r88
            r1.A0B = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r87
            r1.A0A = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r86
            r1.A09 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r85
            r1.A08 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r84
            r1.A07 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r78
            r1.A0H = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r105
            r1.A03 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r104
            r1.A04 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r103
            r1.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r126
            r1.A06 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r100
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.A0E = r15     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r92
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r93
            r1.A0D = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x07e4
        L_0x07b5:
            boolean r0 = X.BE8.A1Z(r2, r14)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x07f6
            r1 = r83
            r0 = r82
            X.CkX r2 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r98
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r94
            r2.A0E = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2.A0S = r5     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r41
            r2.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r42
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CUN r1 = new X.CUN     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r100
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.A0E = r15     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r92
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x07e4:
            r0 = r81
            r1.A0I = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D3W r0 = new X.D3W     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2.A0J = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D48 r0 = new X.D48     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x08ae
        L_0x07f6:
            boolean r0 = X.E06.A0D(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0759
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0846
            r1 = 0
        L_0x0805:
            int r0 = r54.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 >= r0) goto L_0x0890
            r0 = r54
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CYY r0 = (X.CYY) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r6 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r3 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r3 = r6.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r3 == 0) goto L_0x0843
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r3 == 0) goto L_0x0843
            java.util.regex.Pattern r6 = X.E06.A06     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.regex.Matcher r3 = r6.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r6 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r6 != 0) goto L_0x0892
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r6 = "Unable to parse CEA-608 channel number from: "
            r3.append(r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0843:
            int r1 = r1 + 1
            goto L_0x0805
        L_0x0846:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0890
            r1 = 0
        L_0x084f:
            int r0 = r54.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 >= r0) goto L_0x0890
            r0 = r54
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CYY r0 = (X.CYY) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r6 = "urn:scte:dash:cc:cea-708:2015"
            java.lang.String r3 = r0.A01     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r3 = r6.equals(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r3 == 0) goto L_0x088d
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r3 == 0) goto L_0x088d
            java.util.regex.Pattern r6 = X.E06.A07     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.regex.Matcher r3 = r6.matcher(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r6 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r6 != 0) goto L_0x0892
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r6 = "Unable to parse CEA-708 service block number from: "
            r3.append(r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x088d:
            int r1 = r1 + 1
            goto L_0x084f
        L_0x0890:
            r3 = -1
            goto L_0x0897
        L_0x0892:
            r0 = 1
            int r3 = X.BE8.A0D(r3, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0897:
            r1 = r83
            r0 = r82
            X.CkX r1 = A00(r1, r10, r2, r8, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r41
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r42
            r1.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1.A02 = r3     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D48 r0 = new X.D48     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x08ae:
            if (r9 != 0) goto L_0x08b5
            X.BP6 r9 = new X.BP6     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x08b5:
            X.CSl r3 = new X.CSl     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r118 = r3
            r119 = r0
            r120 = r9
            r121 = r76
            r123 = r80
            r124 = r79
            r118.<init>(r119, r120, r121, r122, r123, r124)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D48 r0 = r3.A00     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = r0.A0S     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 != 0) goto L_0x08e8
            java.lang.String r1 = "video"
            boolean r1 = X.BE8.A1Z(r0, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x08da
            r1 = 2
            goto L_0x08eb
        L_0x08da:
            boolean r1 = X.BE8.A1Z(r0, r14)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x08e1
            goto L_0x08ea
        L_0x08e1:
            boolean r0 = X.E06.A0D(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = 3
            if (r0 != 0) goto L_0x08eb
        L_0x08e8:
            r1 = -1
            goto L_0x08eb
        L_0x08ea:
            r1 = 1
        L_0x08eb:
            r2 = -1
            r0 = r56
            if (r0 != r2) goto L_0x08f3
            r56 = r1
            goto L_0x08fc
        L_0x08f3:
            if (r1 == r2) goto L_0x08fc
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            X.C26056CrS.A03(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x08fc:
            r0 = r51
            r0.add(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r13 = 0
            goto L_0x02f1
        L_0x0904:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0914
            X.BP6 r11 = (X.BP6) r11     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP6 r11 = r12.A0K(r11, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x0914:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0924
            X.BP3 r11 = (X.BP3) r11     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP3 r11 = r12.A0H(r11, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x0924:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0936
            X.BP4 r11 = (X.BP4) r11     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r22
            X.BP4 r11 = r12.A0I(r11, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x0936:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 == 0) goto L_0x0949
            X.CYY r1 = X.E06.A07(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r52
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x0949:
            r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x02f1
        L_0x094e:
            java.lang.String r10 = "EventStream"
            boolean r0 = X.C25305Cd9.A01(r10, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0aa6
            java.lang.String r0 = "schemeIdUri"
            r36 = r66
            r35 = r66
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0964
            r35 = r0
        L_0x0964:
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x096e
            r36 = r0
        L_0x096e:
            java.lang.String r2 = "timescale"
            r0 = 1
            long r13 = X.E06.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = 512(0x200, float:7.175E-43)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r9.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0981:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r8 = "Event"
            boolean r0 = X.C25305Cd9.A01(r8, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0a6b
            r6 = 0
            r0 = r60
            long r40 = X.E06.A05(r0, r4, r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2 = r57
            r0 = r17
            long r42 = X.E06.A05(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "presentationTime"
            long r0 = X.E06.A05(r0, r4, r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r44 = 1000(0x3e8, double:4.94E-321)
            r46 = r13
            long r38 = com.facebook.android.exoplayer2.util.Util.A06(r42, r44, r46)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            long r33 = X.BE8.A0E(r0, r13)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "messageData"
            r7 = 0
            java.lang.String r0 = r4.getAttributeValue(r5, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x09b8
            r7 = r0
        L_0x09b8:
            r9.reset()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.setOutput(r9, r5)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r4.nextToken()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x09c5:
            boolean r1 = X.C25305Cd9.A00(r8, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 != 0) goto L_0x0a4a
            int r2 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = 0
            switch(r2) {
                case 0: goto L_0x0a42;
                case 1: goto L_0x0a3e;
                case 2: goto L_0x0a1b;
                case 3: goto L_0x0a0f;
                case 4: goto L_0x0a07;
                case 5: goto L_0x09ff;
                case 6: goto L_0x09f7;
                case 7: goto L_0x09ef;
                case 8: goto L_0x09e7;
                case 9: goto L_0x09df;
                case 10: goto L_0x09d7;
                default: goto L_0x09d3;
            }     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x09d3:
            r4.nextToken()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09c5
        L_0x09d7:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.docdecl(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x09df:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.comment(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x09e7:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.processingInstruction(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x09ef:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.ignorableWhitespace(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x09f7:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.entityRef(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x09ff:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.cdsect(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x0a07:
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.text(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x0a0f:
            java.lang.String r2 = r4.getNamespace()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.endTag(r2, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x0a1b:
            java.lang.String r3 = r4.getNamespace()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.startTag(r3, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0a26:
            int r2 = r4.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 >= r2) goto L_0x09d3
            java.lang.String r6 = r4.getAttributeNamespace(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r3 = r4.getAttributeName(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = r4.getAttributeValue(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.attribute(r6, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r1 = r1 + 1
            goto L_0x0a26
        L_0x0a3e:
            r0.endDocument()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x0a42:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r71)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.startDocument(r5, r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x09d3
        L_0x0a4a:
            r0.flush()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            byte[] r37 = r9.toByteArray()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Long r1 = java.lang.Long.valueOf(r33)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r7 == 0) goto L_0x0a5d
            java.nio.charset.Charset r0 = X.CIB.A05     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            byte[] r37 = r7.getBytes(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0a5d:
            X.D9I r0 = new X.D9I     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r34 = r0
            r34.<init>(r35, r36, r37, r38, r40)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r11.add(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0a6b:
            boolean r0 = X.C25305Cd9.A00(r10, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0981
            int r0 = r11.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            long[] r6 = new long[r0]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r0 = r11.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.D9I[] r3 = new X.D9I[r0]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = 0
        L_0x0a7e:
            int r0 = r11.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r1 >= r0) goto L_0x0a9b
            java.lang.Object r0 = r11.get(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Object r2 = r0.first     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            long r7 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r6[r1] = r7     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Object r0 = r0.second     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r3[r1] = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r1 = r1 + 1
            goto L_0x0a7e
        L_0x0a9b:
            X.CMo r0 = new X.CMo     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0.<init>(r6, r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r1 = r65
            r1.add(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0ae5
        L_0x0aa6:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0ab5
            r0 = r69
            X.BP6 r23 = r12.A0K(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0ae5
        L_0x0ab5:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0ac4
            r0 = r69
            X.BP3 r23 = r12.A0H(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0ae5
        L_0x0ac4:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C25305Cd9.A01(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0ae5
            r1 = r69
            r0 = r22
            X.BP4 r23 = r12.A0I(r1, r4, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0ae5
        L_0x0ad5:
            X.CR8 r3 = new X.CR8     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2 = r56
            r1 = r54
            r0 = r55
            r3.<init>(r2, r13, r1, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r64
            r0.add(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0ae5:
            r0 = r62
            boolean r0 = X.C25305Cd9.A00(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x021c
            r3 = 0
            r8 = 0
        L_0x0aef:
            int r0 = r64.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r3 >= r0) goto L_0x0b2f
            r0 = r64
            java.lang.Object r1 = r0.get(r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CR8 r1 = (X.CR8) r1     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.util.List r0 = r1.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0b2c
            r2 = 0
        L_0x0b02:
            java.util.List r0 = r1.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r0 = r0.size()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r2 >= r0) goto L_0x0b2c
            java.util.List r0 = r1.A02     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CPE r0 = (X.CPE) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r6 = r0 instanceof X.BP2     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r6 == 0) goto L_0x0b18
            r7 = 0
            goto L_0x0b28
        L_0x0b18:
            X.BP1 r0 = (X.BP1) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BP5 r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r6 = r0 instanceof X.BP4     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r7 = 0
            if (r6 == 0) goto L_0x0b28
            X.BP4 r0 = (X.BP4) r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.CJ2 r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 == 0) goto L_0x0b28
            r7 = 1
        L_0x0b28:
            r8 = r8 | r7
            int r2 = r2 + 1
            goto L_0x0b02
        L_0x0b2c:
            int r3 = r3 + 1
            goto L_0x0aef
        L_0x0b2f:
            X.CW8 r6 = new X.CW8     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r3 = r64
            r2 = r65
            r0 = r58
            r6.<init>(r3, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            long r0 = r6.A00     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0b41
            goto L_0x0b55
        L_0x0b41:
            int r2 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0b4b
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0b4f
        L_0x0b4b:
            long r0 = r0 + r25
            r19 = r0
        L_0x0b4f:
            r0 = r68
            r0.add(r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0b59
        L_0x0b55:
            if (r22 == 0) goto L_0x0c2b
            r28 = 1
        L_0x0b59:
            r116 = r116 | r8
            goto L_0x01cc
        L_0x0b5d:
            int r0 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0b66
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0b66
            goto L_0x0b68
        L_0x0b66:
            r19 = r29
        L_0x0b68:
            boolean r0 = r68.isEmpty()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r0 != 0) goto L_0x0c24
            boolean r5 = X.E06.A0E(r68)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = "Before filterPeriod() for "
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = r12.A03     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r3.append(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r68
            java.lang.String r0 = X.E06.A09(r12, r3, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r4 = "->"
            if (r5 == 0) goto L_0x0bc2
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r5 = "filterPeriod() for "
            X.C17890vO.A10(r5, r1, r2, r3)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r2 = r68
            java.lang.String r5 = X.E06.A09(r12, r3, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r118 = X.E06.A0E(r68)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            long r2 = X.AnonymousClass8BR.A04(r6)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r12.A00 = r2     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r0, r4, r5)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r12.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0bb2:
            X.CUI r0 = new X.CUI     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r98 = r0
            r100 = r67
            r103 = r68
            r104 = r19
            r114 = r22
            r98.<init>(r99, r100, r101, r102, r103, r104, r106, r108, r110, r112, r114, r115, r116, r117, r118)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0bd3
        L_0x0bc2:
            r2 = 0
            r12.A00 = r2     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.StringBuilder r2 = X.AnonymousClass8BW.A0o(r0, r4)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r12.A02 = r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r118 = 0
            goto L_0x0bb2
        L_0x0bd3:
            if (r16 == 0) goto L_0x0bee
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            if (r2 != 0) goto L_0x0bee
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0beb }
            if (r2 != 0) goto L_0x0be9
            r2 = r16
            android.util.LruCache r2 = r2.A00     // Catch:{ all -> 0x0beb }
            r2.put(r1, r0)     // Catch:{ all -> 0x0beb }
        L_0x0be9:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0bee
        L_0x0beb:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0c59
        L_0x0bee:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            java.lang.Object[] r4 = X.AnonymousClass8BR.A1a()     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            long r1 = r1 - r31
            r3 = r71
            X.AnonymousClass3MX.A1S(r4, r3, r1)     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            long r1 = r12.A00     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            r3 = 1
            X.AnonymousClass3MX.A1S(r4, r3, r1)     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            r2 = 2
            java.lang.String r1 = r12.A02     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            r4[r2] = r1     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            java.lang.String r1 = "parse:%dms;filter:%dms;%s"
            java.lang.String.format(r5, r1, r4)     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            r74.close()     // Catch:{ IOException -> 0x0c13 }
            return r0
        L_0x0c13:
            r3 = move-exception
            r1 = r71
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            r1 = r73
            java.lang.String r2 = java.lang.String.format(r1, r2)     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            r1 = r72
            android.util.Log.e(r1, r2, r3)     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            return r0
        L_0x0c24:
            java.lang.String r0 = "No periods found."
            X.BxS r0 = X.C24215BxS.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0c59
        L_0x0c2b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = "Unable to determine start of period "
            r0 = r68
            X.C17890vO.A14(r1, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r0 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BxS r0 = X.C24215BxS.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0c59
        L_0x0c3f:
            java.lang.String r3 = "inputStream does not contain a valid media presentation description, start tag %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            r0 = r71
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r1, r3, r2, r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            X.BxS r0 = X.C24215BxS.A00(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
            goto L_0x0c59
        L_0x0c53:
            java.lang.String r0 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0c59:
            throw r0     // Catch:{ XmlPullParserException -> 0x0c5a, BxS | RuntimeException -> 0x0c75 }
        L_0x0c5a:
            r1 = move-exception
            X.BxS r0 = new X.BxS     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
            throw r0     // Catch:{ BxS | RuntimeException -> 0x0c75, IOException -> 0x0c61 }
        L_0x0c61:
            r4 = move-exception
            java.lang.String r3 = "I/O Error when parsing manifest: %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0c90 }
            r1 = r75
            r0 = r71
            java.lang.String r1 = X.AnonymousClass8BS.A0l(r1, r3, r2, r0)     // Catch:{ all -> 0x0c90 }
            r0 = r72
            android.util.Log.e(r0, r1, r4)     // Catch:{ all -> 0x0c90 }
            throw r4     // Catch:{ all -> 0x0c90 }
        L_0x0c75:
            r4 = move-exception
            java.lang.String r3 = "Failed to parse manifest: %s"
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0c90 }
            r1 = r75
            r0 = r71
            java.lang.String r1 = X.AnonymousClass8BS.A0l(r1, r3, r2, r0)     // Catch:{ all -> 0x0c90 }
            r0 = r72
            android.util.Log.e(r0, r1, r4)     // Catch:{ all -> 0x0c90 }
            X.C1S r1 = new X.C1S     // Catch:{ all -> 0x0c90 }
            r0 = r75
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0c90 }
            throw r1     // Catch:{ all -> 0x0c90 }
        L_0x0c90:
            r3 = move-exception
            r74.close()     // Catch:{ IOException -> 0x0c95 }
            goto L_0x0ca5
        L_0x0c95:
            r2 = move-exception
            r0 = r71
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            r0 = r73
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
            r0 = r72
            android.util.Log.e(r0, r1, r2)     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
        L_0x0ca5:
            throw r3     // Catch:{ C1S -> 0x0ca6, IOException -> 0x0ca8 }
        L_0x0ca6:
            r0 = move-exception
            throw r0
        L_0x0ca8:
            java.lang.String r0 = "Missing manifest"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26219Cv7.A01(X.CbZ, X.DRp):X.CUI");
    }

    private C22773BOm A02(EBU ebu, C25238CbZ cbZ) {
        Context context = this.A03;
        C25626Cj6 cj6 = this.A05;
        C25484Cgf cgf = this.A08;
        C27066DRp dRp = this.A0C;
        CPn cPn = new CPn(cgf, dRp.threadSleepMsForDecoderInitFailure, dRp.appendReconfigurationDataForDrmContentFix);
        long j = dRp.rendererAllowedJoiningTimeMs;
        C25744ClE clE = this.A00;
        Handler handler = this.A04;
        D9R d9r = this.A0A;
        boolean z = dRp.useDummySurfaceExo2;
        boolean z2 = dRp.isExo2AggresiveMicrostallFixEnabled;
        boolean z3 = dRp.ignoreEmptyProfileLevels;
        int i = dRp.decoderInitializationRetryTimeMs;
        int i2 = dRp.decoderDequeueRetryTimeMs;
        int i3 = dRp.renderRetryTimeMs;
        boolean z4 = dRp.useOutputSurfaceWorkaround;
        boolean z5 = false;
        String str = cbZ.A0C.A0C;
        if (!TextUtils.isEmpty(str) && dRp.originAllowlistForAlternateCodec.contains(str)) {
            z5 = true;
        }
        C25626Cj6 cj62 = cj6;
        return new C22773BOm(context, handler, clE, ebu, cPn, cj62, d9r, (Object) null, i, i2, i3, j, z, z2, z3, z4, false, z5);
    }

    public static void A03(CUX cux, C27066DRp dRp) {
        cux.A0F = dRp.enableVodDrmPrefetch;
        cux.A0E = dRp.enableCustomizedXHEAACConfig;
        cux.A06 = dRp.xHEAACTargetReferenceLvl;
        cux.A05 = dRp.xHEAACCEffectType;
        cux.A09 = dRp.enableAsynchronousBufferQueueing;
        cux.A0N = dRp.enableSynchronizeCodecInteractionsWithQueueing;
        cux.A0M = dRp.enableSeamlessAudioCodecAdaptation;
        cux.A0C = dRp.enableCustomizedDRCEffect;
        cux.A0D = dRp.enableCustomizedDRCForHeadset;
        cux.A01 = dRp.lateNightHourUpperThreshold;
        cux.A00 = dRp.lateNightHourLowerThreshold;
        cux.A0G = dRp.enableLowLatencyDecoding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        r12 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f1, code lost:
        if (r0 == false) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a3, code lost:
        if (r11.A0C == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d0, code lost:
        if (A04(r4.blockListedHardwareDecoderMap) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d2, code lost:
        r16 = A02(r3, r10);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x026d A[ExcHandler: Exception | NoClassDefFoundError (e java.lang.Throwable), Splitter:B:66:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0291 A[SYNTHETIC, Splitter:B:118:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.ECg[] A06(X.CUI r40, X.C25238CbZ r41, X.C26381Cyh r42) {
        /*
            r39 = this;
            r10 = r41
            X.D47 r7 = r10.A0C
            boolean r0 = r7.A01()
            r5 = r39
            X.DRp r4 = r5.A0C
            if (r0 == 0) goto L_0x0028
            boolean r1 = r4.prioritizeAv1HardwareDecoder
            java.lang.String r0 = "video/av01"
            if (r1 == 0) goto L_0x0031
            java.util.HashMap r0 = r4.blockListedHardwareDecoderMap
            X.D9C r3 = new X.D9C
            r3.<init>(r5, r0)
        L_0x001b:
            boolean r0 = r4.isExo2DrmEnabled
            r11 = r40
            if (r0 == 0) goto L_0x016e
            java.lang.String r17 = "; Exception: "
            java.lang.String r16 = "Device: "
            if (r40 == 0) goto L_0x00f8
            goto L_0x003a
        L_0x0028:
            boolean r0 = r4.allowRequestForSoftwareDecoder
            if (r0 == 0) goto L_0x0037
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x0037
            r0 = 0
        L_0x0031:
            X.D9B r3 = new X.D9B
            r3.<init>(r5, r0)
            goto L_0x001b
        L_0x0037:
            X.EBU r3 = X.EBU.A00
            goto L_0x001b
        L_0x003a:
            java.lang.String r1 = r7.A0H     // Catch:{ C2K -> 0x013b }
            X.CKn r0 = r5.A06     // Catch:{ C2K -> 0x013b }
            r19 = r0
            boolean r0 = r4.proxyDrmProvisioningRequests     // Catch:{ C2K -> 0x013b }
            r21 = r0
            boolean r0 = r4.enableDrmProvisioningRetry     // Catch:{ C2K -> 0x013b }
            r22 = r0
            boolean r0 = r4.removeGifPrefixForDRMKeyRequest     // Catch:{ C2K -> 0x013b }
            r23 = r0
            java.util.Set r0 = X.C24679CEt.A00     // Catch:{ C2K -> 0x013b }
            r8 = 0
            r2 = 0
            java.util.List r0 = r11.A09     // Catch:{ C2K -> 0x013b }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ C2K -> 0x013b }
            X.CW8 r0 = (X.CW8) r0     // Catch:{ C2K -> 0x013b }
            java.util.List r0 = r0.A01     // Catch:{ C2K -> 0x013b }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ C2K -> 0x013b }
            X.CR8 r0 = (X.CR8) r0     // Catch:{ C2K -> 0x013b }
            java.util.List r0 = r0.A02     // Catch:{ C2K -> 0x013b }
            r18 = r0
            boolean r0 = r18.isEmpty()     // Catch:{ C2K -> 0x013b }
            if (r0 == 0) goto L_0x008d
            java.util.Set r9 = X.C24679CEt.A00     // Catch:{ C2K -> 0x013b }
        L_0x006c:
            java.util.Iterator r14 = r9.iterator()     // Catch:{ C2K -> 0x013b }
        L_0x0070:
            boolean r0 = r14.hasNext()     // Catch:{ C2K -> 0x013b }
            r12 = 0
            java.lang.String r6 = "DrmSessionManagerHelper"
            r13 = 1
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r14.next()     // Catch:{ C2K -> 0x013b }
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()     // Catch:{ C2K -> 0x013b }
            X.BE6.A1H(r0, r2, r12)     // Catch:{ C2K -> 0x013b }
            r2[r13] = r1     // Catch:{ C2K -> 0x013b }
            java.lang.String r0 = "DRM scheme %s for vid=%s"
            X.C25922Cog.A01(r6, r0, r2)     // Catch:{ C2K -> 0x013b }
            goto L_0x0070
        L_0x008d:
            java.util.HashSet r9 = X.C17880vN.A12()     // Catch:{ C2K -> 0x013b }
            int r13 = r18.size()     // Catch:{ C2K -> 0x013b }
            r12 = 0
        L_0x0096:
            if (r12 >= r13) goto L_0x006c
            r0 = r18
            java.lang.Object r0 = r0.get(r12)     // Catch:{ C2K -> 0x013b }
            X.CPE r0 = (X.CPE) r0     // Catch:{ C2K -> 0x013b }
            X.D48 r0 = r0.A00     // Catch:{ C2K -> 0x013b }
            X.DUU r0 = r0.A0L     // Catch:{ C2K -> 0x013b }
            if (r0 == 0) goto L_0x00ba
            X.D3w[] r14 = r0.A03     // Catch:{ C2K -> 0x013b }
            int r6 = r14.length     // Catch:{ C2K -> 0x013b }
            r2 = 0
        L_0x00aa:
            if (r2 >= r6) goto L_0x00ba
            r15 = r14[r2]     // Catch:{ C2K -> 0x013b }
            byte[] r0 = r15.A04     // Catch:{ C2K -> 0x013b }
            if (r0 == 0) goto L_0x00b7
            java.util.UUID r0 = r15.A03     // Catch:{ C2K -> 0x013b }
            r9.add(r0)     // Catch:{ C2K -> 0x013b }
        L_0x00b7:
            int r2 = r2 + 1
            goto L_0x00aa
        L_0x00ba:
            int r12 = r12 + 1
            goto L_0x0096
        L_0x00bd:
            boolean r0 = r9.isEmpty()     // Catch:{ C2K -> 0x013b }
            if (r0 == 0) goto L_0x00d0
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ C2K -> 0x013b }
            r2[r12] = r1     // Catch:{ C2K -> 0x013b }
            java.lang.String r0 = "Not a protected video for vid=%s"
            X.C25922Cog.A01(r6, r0, r2)     // Catch:{ C2K -> 0x013b }
        L_0x00cc:
            r5.A00 = r8     // Catch:{ C2K -> 0x013b }
            goto L_0x015f
        L_0x00d0:
            java.util.UUID r6 = X.C24736CHy.A04     // Catch:{ C2K -> 0x013b }
            boolean r0 = r9.contains(r6)     // Catch:{ C2K -> 0x013b }
            if (r0 == 0) goto L_0x00f2
            X.CSV r2 = new X.CSV     // Catch:{ C2K -> 0x013b }
            r20 = r1
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ C2K -> 0x013b }
            X.CnE r1 = X.C25852CnE.A00(r6)     // Catch:{ C2K -> 0x013b }
            int[] r0 = new int[r12]     // Catch:{ C2K -> 0x013b }
            X.ClE r8 = new X.ClE     // Catch:{ C2K -> 0x013b }
            r8.<init>(r1, r2, r6, r0)     // Catch:{ C2K -> 0x013b }
            X.CnE r0 = r8.A03     // Catch:{ C2K -> 0x013b }
            r0.A05()     // Catch:{ C2K -> 0x013b }
            goto L_0x00cc
        L_0x00f2:
            X.C2K r0 = new X.C2K     // Catch:{ C2K -> 0x013b }
            r0.<init>()     // Catch:{ C2K -> 0x013b }
            throw r0     // Catch:{ C2K -> 0x013b }
        L_0x00f8:
            boolean r0 = r10.A00()
            if (r0 == 0) goto L_0x015f
            java.lang.String r12 = r7.A0H     // Catch:{ C2K -> 0x0131 }
            X.CKn r9 = r5.A06     // Catch:{ C2K -> 0x0131 }
            boolean r6 = r4.proxyDrmProvisioningRequests     // Catch:{ C2K -> 0x0131 }
            boolean r2 = r4.enableDrmProvisioningRetry     // Catch:{ C2K -> 0x0131 }
            boolean r1 = r4.removeGifPrefixForDRMKeyRequest     // Catch:{ C2K -> 0x0131 }
            java.util.Set r0 = X.C24679CEt.A00     // Catch:{ C2K -> 0x0131 }
            X.CSV r8 = new X.CSV     // Catch:{ C2K -> 0x0131 }
            r18 = r8
            r19 = r9
            r20 = r12
            r21 = r6
            r22 = r2
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ C2K -> 0x0131 }
            java.util.UUID r6 = X.C24736CHy.A04     // Catch:{ C2K -> 0x0131 }
            X.CnE r2 = X.C25852CnE.A00(r6)     // Catch:{ C2K -> 0x0131 }
            r0 = 0
            int[] r0 = new int[r0]     // Catch:{ C2K -> 0x0131 }
            X.ClE r1 = new X.ClE     // Catch:{ C2K -> 0x0131 }
            r1.<init>(r2, r8, r6, r0)     // Catch:{ C2K -> 0x0131 }
            X.CnE r0 = r1.A03     // Catch:{ C2K -> 0x0131 }
            r0.A05()     // Catch:{ C2K -> 0x0131 }
            r5.A00 = r1     // Catch:{ C2K -> 0x0131 }
            goto L_0x015f
        L_0x0131:
            r12 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r9 = r5.A09
            java.lang.String r8 = r7.A0H
            java.lang.String r6 = "DRM"
            X.C0S r0 = X.C0S.A0D
            goto L_0x0144
        L_0x013b:
            r12 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r9 = r5.A09
            java.lang.String r8 = r7.A0H
            java.lang.String r6 = "DRM"
            X.C0S r0 = X.C0S.A0C
        L_0x0144:
            java.lang.String r2 = r0.name()
            java.lang.StringBuilder r1 = X.BE6.A0u(r16)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            r0 = r17
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r12)
            X.BVo r0 = new X.BVo
            r0.<init>(r8, r6, r2, r1)
            r9.A00()
        L_0x015f:
            X.ClE r1 = r5.A00
            if (r1 == 0) goto L_0x016e
            boolean r0 = r4.enableActiveDrmSessionStoreRelease
            if (r0 == 0) goto L_0x016e
            X.CKq r0 = new X.CKq
            r0.<init>(r5)
            r1.A01 = r0
        L_0x016e:
            r9 = 0
            r5.A02 = r9
            boolean r0 = r7.A01()
            r8 = 2
            java.lang.String r13 = "HeroExo2InitHelper"
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x02de
            java.lang.Object[] r1 = X.BE6.A1a()
            java.lang.String r0 = r7.A0H
            r1[r9] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1[r6] = r0
            r1[r8] = r0
            boolean r0 = r7.A0P
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.BE8.A1P(r1, r0)
            java.lang.String r0 = "VideoId: %s, NeedCentering: %b, ShouldCropToFit: %b, isSponsored: %b"
            X.C25922Cog.A01(r13, r0, r1)
            boolean r0 = r4.enableMixedCodecManifestSupport
            if (r0 == 0) goto L_0x01a5
            if (r40 == 0) goto L_0x01a5
            boolean r0 = r11.A0C
            r14 = 1
            if (r0 != 0) goto L_0x01a6
        L_0x01a5:
            r14 = 0
        L_0x01a6:
            boolean r0 = r4.prioritizeAv1HardwareDecoder     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            if (r0 == 0) goto L_0x01d8
            java.lang.String r0 = "video/av01"
            java.util.List r0 = X.C26283Cwe.A03(r0, r9)     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
            if (r0 == 0) goto L_0x01d8
            java.util.Iterator r12 = r0.iterator()     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
        L_0x01b6:
            boolean r0 = r12.hasNext()     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r1 = r12.next()     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
            X.Csn r1 = (X.C26125Csn) r1     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
            boolean r0 = r1.A08     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r1.A04     // Catch:{ C1L -> 0x01d8, Exception | NoClassDefFoundError -> 0x026d }
            if (r0 == 0) goto L_0x01b6
            java.util.HashMap r0 = r4.blockListedHardwareDecoderMap     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            boolean r0 = A04(r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            if (r0 == 0) goto L_0x01d8
            X.BOm r16 = r5.A02(r3, r10)     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            goto L_0x026f
        L_0x01d8:
            boolean r0 = r4.prioritizeAv1Dav1dOverLibgav1     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            if (r0 != 0) goto L_0x01f1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r0 = 30
            if (r1 < r0) goto L_0x01f1
            boolean r0 = r4.enableDav1dAsMediaCodecAdapter     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            if (r0 != 0) goto L_0x01f1
            boolean r0 = r4.enableDav1dOpenGLRendering     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            if (r0 != 0) goto L_0x01f1
            if (r14 != 0) goto L_0x01f1
            X.BOm r16 = r5.A02(r3, r10)     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            goto L_0x026f
        L_0x01f1:
            boolean r0 = r4.enableDav1dAsMediaCodecAdapter     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            if (r0 != 0) goto L_0x0205
            if (r14 != 0) goto L_0x0205
            java.lang.String r1 = "Build AV1 renderer attempt with Dav1d start"
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            X.C25922Cog.A01(r13, r1, r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r1 = 0
            X.BPO r0 = new X.BPO     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r0.<init>()     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            throw r1     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
        L_0x0205:
            long r0 = r4.rendererAllowedJoiningTimeMs     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r30 = r0
            exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting r24 = new exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r24.<init>()     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            android.content.Context r0 = r5.A03     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r38 = r0
            X.Cj6 r0 = r5.A05     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r22 = r0
            X.Cgf r14 = r5.A08     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            boolean r1 = r4.appendReconfigurationDataForDrmContentFix     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            int r0 = r4.threadSleepMsForDecoderInitFailure     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            X.CPn r12 = new X.CPn     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r12.<init>(r14, r0, r1)     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            X.ClE r0 = r5.A00     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r37 = r0
            android.os.Handler r0 = r5.A04     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r36 = r0
            X.D9R r0 = r5.A0A     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r23 = r0
            boolean r0 = r4.useDummySurfaceExo2     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r19 = r0
            boolean r0 = r4.isExo2AggresiveMicrostallFixEnabled     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r18 = r0
            boolean r0 = r4.ignoreEmptyProfileLevels     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r17 = r0
            int r15 = r4.decoderInitializationRetryTimeMs     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            int r14 = r4.decoderDequeueRetryTimeMs     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            int r1 = r4.renderRetryTimeMs     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            boolean r0 = r4.useOutputSurfaceWorkaround     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            X.BOm r16 = new X.BOm     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r20 = r3
            r21 = r12
            r25 = r15
            r26 = r14
            r27 = r1
            r28 = r30
            r30 = r19
            r31 = r18
            r32 = r17
            r33 = r0
            r34 = r6
            r35 = r9
            r17 = r38
            r18 = r36
            r19 = r37
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception | NoClassDefFoundError -> 0x026d }
            r5.A02 = r6     // Catch:{ Exception | NoClassDefFoundError -> 0x0269 }
            r5.A02 = r6     // Catch:{ Exception | NoClassDefFoundError -> 0x0269 }
            goto L_0x026f
        L_0x0269:
            r12 = move-exception
            r2 = r16
            goto L_0x0272
        L_0x026d:
            r12 = move-exception
            goto L_0x0272
        L_0x026f:
            r12 = r2
            r2 = r16
        L_0x0272:
            java.lang.String r1 = "video/av01"
            java.lang.String r0 = "N/A"
            r5.A01 = r0
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0291
            java.lang.String r0 = "LibDav1dDecoder"
            r5.A01 = r0
        L_0x0280:
            boolean r0 = r4.av1ThrowExceptionOnNonDav1dDecoder
            if (r0 == 0) goto L_0x02d4
            boolean r0 = r4.prioritizeAv1HardwareDecoder
            if (r0 != 0) goto L_0x02d4
            boolean r0 = r2 instanceof X.BPO
            if (r0 != 0) goto L_0x02d4
            java.lang.String r3 = "Expected Dav1d decoder but observing %s"
            java.lang.String r2 = ""
            goto L_0x02b1
        L_0x0291:
            java.util.List r14 = r3.BQL(r1, r9)     // Catch:{ C1L -> 0x0280 }
            if (r14 == 0) goto L_0x0280
            boolean r0 = r14.isEmpty()     // Catch:{ C1L -> 0x0280 }
            if (r0 != 0) goto L_0x0280
            java.lang.Object r0 = r14.get(r9)     // Catch:{ C1L -> 0x0280 }
            X.Csn r0 = (X.C26125Csn) r0     // Catch:{ C1L -> 0x0280 }
            if (r0 != 0) goto L_0x02ac
            java.lang.String r0 = "name"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ C1L -> 0x0280 }
            throw r0     // Catch:{ C1L -> 0x0280 }
        L_0x02ac:
            java.lang.String r0 = r0.A02     // Catch:{ C1L -> 0x0280 }
            r5.A01 = r0     // Catch:{ C1L -> 0x0280 }
            goto L_0x0280
        L_0x02b1:
            java.util.List r1 = X.C26283Cwe.A03(r1, r9)     // Catch:{ C1L -> 0x02ca }
            if (r1 == 0) goto L_0x02ca
            boolean r0 = r1.isEmpty()     // Catch:{ C1L -> 0x02ca }
            if (r0 != 0) goto L_0x02ca
            java.lang.Object r0 = r1.get(r9)     // Catch:{ C1L -> 0x02ca }
            if (r0 == 0) goto L_0x02ca
            java.lang.String r0 = r0.toString()     // Catch:{ C1L -> 0x02ca }
            if (r0 == 0) goto L_0x02ca
            r2 = r0
        L_0x02ca:
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r3, (java.lang.Object) r2)
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x02d4:
            if (r2 == 0) goto L_0x02df
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r9] = r2
            java.lang.String r0 = "Build AV1 renderer attempt with success, impl %s"
            goto L_0x039a
        L_0x02de:
            r12 = r2
        L_0x02df:
            java.lang.String r1 = r7.A0G
            if (r1 == 0) goto L_0x02fe
            java.lang.String r0 = "vp9"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x02f3
            java.lang.String r0 = "vp09"
            boolean r0 = r1.startsWith(r0)
        L_0x02f1:
            if (r0 == 0) goto L_0x0365
        L_0x02f3:
            java.lang.String r1 = "libvpx"
            java.lang.String r0 = r4.vp9PlaybackDecoderName
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0365
            goto L_0x0309
        L_0x02fe:
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x0365
            java.lang.String r0 = "codecs=\"vp"
            boolean r0 = r1.contains(r0)
            goto L_0x02f1
        L_0x0309:
            java.lang.String r0 = "com.facebook.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r16 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x035f }
            r0 = 7
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x035f }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x035f }
            r2[r9] = r1     // Catch:{ Exception -> 0x035f }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x035f }
            r2[r6] = r0     // Catch:{ Exception -> 0x035f }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r2[r8] = r0     // Catch:{ Exception -> 0x035f }
            java.lang.Class<X.D9R> r0 = X.D9R.class
            r15 = 3
            r2[r15] = r0     // Catch:{ Exception -> 0x035f }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x035f }
            r18 = 4
            r2[r18] = r0     // Catch:{ Exception -> 0x035f }
            r17 = 5
            r2[r17] = r1     // Catch:{ Exception -> 0x035f }
            r14 = 6
            r0 = r16
            java.lang.reflect.Constructor r16 = X.BE6.A0w(r0, r1, r2, r14)     // Catch:{ Exception -> 0x035f }
            r0 = 7
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x035f }
            X.AnonymousClass8BR.A1L(r2, r9, r6)     // Catch:{ Exception -> 0x035f }
            long r0 = r4.rendererAllowedJoiningTimeMs     // Catch:{ Exception -> 0x035f }
            X.AnonymousClass3MX.A1S(r2, r6, r0)     // Catch:{ Exception -> 0x035f }
            android.os.Handler r0 = r5.A04     // Catch:{ Exception -> 0x035f }
            r2[r8] = r0     // Catch:{ Exception -> 0x035f }
            X.D9R r0 = r5.A0A     // Catch:{ Exception -> 0x035f }
            r1 = r18
            X.BE8.A1A(r0, r2, r15, r9, r1)     // Catch:{ Exception -> 0x035f }
            boolean r1 = r4.exo2Vp9UseSurfaceRenderer     // Catch:{ Exception -> 0x035f }
            r0 = r17
            X.AnonymousClass8BR.A1L(r2, r0, r1)     // Catch:{ Exception -> 0x035f }
            boolean r0 = r4.vp9BlockingReleaseSurface     // Catch:{ Exception -> 0x035f }
            X.AnonymousClass8BR.A1L(r2, r14, r0)     // Catch:{ Exception -> 0x035f }
            r0 = r16
            java.lang.Object r2 = r0.newInstance(r2)     // Catch:{ Exception -> 0x035f }
            X.D8i r2 = (X.C26659D8i) r2     // Catch:{ Exception -> 0x035f }
            goto L_0x0369
        L_0x035f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0365:
            X.BOm r2 = r5.A02(r3, r10)
        L_0x0369:
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r5.A09
            r17 = r0
            java.lang.String r14 = ""
            if (r12 == 0) goto L_0x0472
            java.lang.String r0 = r7.A0H
            if (r0 == 0) goto L_0x0376
            r14 = r0
        L_0x0376:
            java.lang.String r15 = "AV1_INSTANTIATION"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r16 = X.C108955ca.A0x(r12)
            r1[r9] = r16
            X.BE6.A1M(r12, r1, r6)
            java.lang.String r0 = "%s: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.BVo r0 = new X.BVo
            r0.<init>(r14, r15, r15, r1)
            r17.A00()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r16
            X.BE6.A1M(r12, r1, r6)
            java.lang.String r0 = "Build AV1 renderer attempt with Dav1d failed with %s: %s"
        L_0x039a:
            X.C25922Cog.A01(r13, r0, r1)
        L_0x039d:
            r1 = 1
            int r0 = r10.A01
            if (r1 != r0) goto L_0x03c5
            X.BOG r10 = new X.BOG
            r10.<init>()
        L_0x03a7:
            X.D9b r6 = new X.D9b
            r0 = r42
            r6.<init>(r0, r5)
            android.os.Handler r0 = r5.A04
            android.os.Looper r3 = r0.getLooper()
            X.CKr r0 = new X.CKr
            r0.<init>(r4)
            X.BOF r1 = new X.BOF
            r1.<init>(r3, r6, r0)
            r0 = 3
            X.ECg[] r0 = new X.ECg[r0]
            X.AnonymousClass8BX.A1K(r2, r10, r1, r0)
            return r0
        L_0x03c5:
            boolean r0 = r4.enableSpatialOpusRendererExo2
            if (r0 == 0) goto L_0x042a
            boolean r0 = r7.A0O
            if (r0 == 0) goto L_0x042a
            if (r40 == 0) goto L_0x042a
            java.util.List r6 = r11.A09
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x042a
            java.lang.Object r0 = r6.get(r9)
            X.CW8 r0 = (X.CW8) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x042a
            java.lang.Object r0 = r6.get(r9)
            X.CW8 r0 = (X.CW8) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x042a
            java.lang.Object r0 = r6.get(r9)
            X.CW8 r0 = (X.CW8) r0
            java.util.List r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.CR8 r0 = (X.CR8) r0
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x042a
            java.lang.Object r0 = r6.get(r9)
            X.CW8 r0 = (X.CW8) r0
            java.util.List r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.CR8 r0 = (X.CR8) r0
            java.util.List r0 = r0.A02
            java.lang.Object r0 = r0.get(r9)
            X.CPE r0 = (X.CPE) r0
            X.D48 r0 = r0.A00
            java.lang.String r1 = r0.A0P
            java.lang.String r0 = "audio/webm"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x042a
            r10 = 0
            goto L_0x03a7
        L_0x042a:
            android.content.Context r11 = r5.A03
            X.Cj6 r9 = r5.A05
            X.Cgf r6 = r5.A08
            boolean r1 = r4.appendReconfigurationDataForDrmContentFix
            int r0 = r4.threadSleepMsForDecoderInitFailure
            X.CPn r8 = new X.CPn
            r8.<init>(r6, r0, r1)
            X.ClE r13 = r5.A00
            boolean r7 = r7.A0K
            boolean r6 = r4.isAudioDataSummaryEnabled
            android.os.Handler r12 = r5.A04
            X.D9R r1 = r5.A0A
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            boolean r0 = r4.enablePCMBufferListener
            if (r0 == 0) goto L_0x0453
            X.BOT r0 = new X.BOT
            r0.<init>(r1)
            r10.add(r0)
        L_0x0453:
            int r0 = r10.size()
            X.EBa[] r0 = new X.C28627EBa[r0]
            java.lang.Object[] r0 = r10.toArray(r0)
            X.EBa[] r0 = (X.C28627EBa[]) r0
            X.BOn r10 = new X.BOn
            r14 = r3
            r15 = r8
            r16 = r9
            r17 = r1
            r18 = r0
            r19 = r7
            r20 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x03a7
        L_0x0472:
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x039d
            java.lang.String r0 = r7.A0H
            if (r0 == 0) goto L_0x047d
            r14 = r0
        L_0x047d:
            java.lang.String r6 = "AV1_INSTANTIATION"
            java.lang.String r1 = "Dav1d Voltron module is not available for AV1 video"
            X.BVo r0 = new X.BVo
            r0.<init>(r14, r6, r6, r1)
            r17.A00()
            java.lang.String r1 = "Build AV1 renderer attempt with Dav1d failed with voltron module unavailable"
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.C25922Cog.A01(r13, r1, r0)
            goto L_0x039d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26219Cv7.A06(X.CUI, X.CbZ, X.Cyh):X.ECg[]");
    }

    public C26219Cv7(Context context, Handler handler, C25018CTu cTu, C26381Cyh cyh, ServiceEventCallbackImpl serviceEventCallbackImpl, C25699CkU ckU, Map map) {
        CUX cux;
        this.A03 = context;
        this.A0D = map;
        C27066DRp dRp = cTu.A05;
        this.A0C = dRp;
        this.A06 = cTu.A04;
        this.A04 = handler;
        this.A09 = serviceEventCallbackImpl;
        this.A08 = new C25484Cgf(serviceEventCallbackImpl);
        this.A07 = cyh;
        C25926Cop.A01 = dRp.enableSystrace;
        this.A0A = new D9R(cyh, dRp, dRp.disableTextRendererOn404LoadError, dRp.disableTextRendererOn404InitSegmentLoadError, dRp.disableTextRendererOn500LoadError, dRp.disableTextRendererOn500InitSegmentLoadError);
        if (dRp.isExo2MediaCodecReuseEnabled) {
            cux.A0L = dRp.enableMediaCodecPoolingForVodVideo;
            cux.A0K = dRp.enableMediaCodecPoolingForVodAudio;
            cux.A02 = dRp.maxMediaCodecInstancesPerCodecName;
            cux.A03 = dRp.maxMediaCodecInstancesTotal;
            cux.A0P = dRp.skipMediaCodecStopOnRelease;
            cux.A0O = dRp.skipAudioMediaCodecStopOnRelease;
            cux.A0B = dRp.enableCodecDeadlockFix;
            cux.A0I = dRp.enableMediaCodecReuseOptimizeLock;
            cux.A0J = dRp.enableMediaCodecReuseOptimizeRelease;
            cux.A07 = dRp.useMediaCodecPoolingForCodecByName;
            cux.A0R = dRp.useVersion2_18Workarounds;
            cux.A0Q = dRp.useCodecNeedsEosBufferTimestampWorkaround;
            cux.A04 = dRp.releaseThreadInterval;
            A03(cux, dRp);
            cux.A08 = dRp.disablePoolingForDav1dMediaCodec;
        } else {
            cux = new CUX();
            cux.A0P = dRp.skipMediaCodecStopOnRelease;
            cux.A0O = dRp.skipAudioMediaCodecStopOnRelease;
            cux.A0B = dRp.enableCodecDeadlockFix;
            A03(cux, dRp);
            cux.A07 = dRp.useMediaCodecPoolingForCodecByName;
            cux.A0R = dRp.useVersion2_18Workarounds;
            cux.A0Q = dRp.useCodecNeedsEosBufferTimestampWorkaround;
        }
        cux.A0A = dRp.enableAudioTrackRetry;
        this.A05 = new C25626Cj6(cux);
        this.A0B = ckU;
    }

    public void A05(D47 d47) {
        ServiceEventCallbackImpl serviceEventCallbackImpl;
        String str;
        if (d47.A01()) {
            C27066DRp dRp = this.A0C;
            String str2 = "null";
            if (dRp.prioritizeAv1HardwareDecoder && A04(dRp.blockListedHardwareDecoderMap)) {
                serviceEventCallbackImpl = this.A09;
                str = "Hardware Decoder";
            } else if (this.A02) {
                serviceEventCallbackImpl = this.A09;
                str = "Dav1d";
            } else if (Build.VERSION.SDK_INT >= 30) {
                serviceEventCallbackImpl = this.A09;
                str = "LibGav1";
            } else {
                return;
            }
            String str3 = d47.A0H;
            if (str3 != null) {
                str2 = str3;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AV1 decoding using ");
            A10.append(str);
            A10.append(";");
            String str4 = this.A01;
            if (str4 == null) {
                str4 = "N/A";
            }
            new C22926BVo(str2, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AnonymousClass000.A0y(str4, A10));
            serviceEventCallbackImpl.A00();
            StringBuilder A0H = C17900vP.A0H("AV1 decoding using ", str, ";");
            String str5 = this.A01;
            if (str5 == null) {
                str5 = "N/A";
            }
            C25922Cog.A01("HeroExo2InitHelper", AnonymousClass000.A0y(str5, A0H), new Object[0]);
        }
    }
}
