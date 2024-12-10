package X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1i4  reason: invalid class name and case insensitive filesystem */
public class C32981i4 {
    public final C19880zA A00;
    public final C18030ve A01;
    public final C32011gU A02;
    public final AnonymousClass1QN A03;
    public final C19880zA A04;
    public final C19880zA A05;
    public final C19880zA A06;
    public final AnonymousClass11S A07;
    public final C32971i3 A08;
    public final AnonymousClass1CM A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public static PhoneUserJid A06(Uri uri) {
        String queryParameter = uri.getQueryParameter("phoneNumber");
        if ("wa.me".equals(uri.getHost())) {
            boolean z = false;
            if (uri.getPathSegments().size() == 2) {
                z = true;
            }
            C17960vV.A0C(z);
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter == null) {
            return null;
        }
        return PhoneUserJid.Companion.A03(queryParameter);
    }

    public static String A07(Uri uri) {
        String queryParameter = uri.getQueryParameter("phone");
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            host = host.toLowerCase(Locale.US);
        }
        if ("wa.me".equals(host)) {
            return uri.getLastPathSegment();
        }
        return queryParameter;
    }

    private boolean A09() {
        AnonymousClass11S r0 = this.A07;
        r0.A0I();
        if (r0.A00 == null || !this.A09.A04()) {
            return false;
        }
        return true;
    }

    public static boolean A0A(Uri uri, C18030ve r5) {
        C18040vf r1 = C18040vf.A02;
        if ((C18020vd.A05(r1, r5, 1483) || C18020vd.A05(r1, r5, 1849)) && uri.isHierarchical() && !uri.getQueryParameterNames().isEmpty() && uri.getQueryParameterNames().contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) && "business_profile".equals(uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return true;
        }
        return false;
    }

    public static boolean A0B(C18030ve r4, String str) {
        Uri build;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r4, 1483) || C18020vd.A05(r1, r4, 1849)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("wa.me")) {
                lowerCase = lowerCase.replace("wa.me", "https://wa.me");
            }
            Uri parse = Uri.parse(lowerCase);
            String str2 = null;
            if (parse.getHost() != null) {
                str2 = parse.getHost().toLowerCase(Locale.US);
            }
            if ("wa.me".equals(str2) && (build = new Uri.Builder().scheme("https").encodedAuthority(str2).encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build()) != null) {
                String scheme = build.getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    String host = build.getHost();
                    if (!TextUtils.isEmpty(host) && A0D(scheme, host)) {
                        List<String> pathSegments = build.getPathSegments();
                        if (pathSegments.size() != 1 || !Pattern.matches("^(?![0-9.]+$)[a-zA-Z0-9.]{5,35}$", pathSegments.get(0))) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0D(String str, String str2) {
        if (("http".equals(str) || "https".equals(str)) && "wa.me".equals(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ea, code lost:
        throw new java.lang.NullPointerException("isWamoLink");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f1, code lost:
        if (r12.equals("edit-ad") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fa, code lost:
        if (r12.equals("biztab") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0200, code lost:
        if (r2.size() < 1) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        r1 = r2.get(0).toLowerCase(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0212, code lost:
        switch(r1.hashCode()) {
            case -1535436173: goto L_0x0238;
            case -1110417409: goto L_0x022e;
            case -690411481: goto L_0x0224;
            case 555704345: goto L_0x021a;
            case 1078655016: goto L_0x0242;
            default: goto L_0x0215;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0217, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021a, code lost:
        r0 = r1.equals("catalog");
        r1 = 59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0224, code lost:
        r0 = r1.equals("advertise");
        r1 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022e, code lost:
        r0 = r1.equals("labels");
        r1 = 69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0238, code lost:
        r0 = r1.equals("greeting-message");
        r1 = 70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0242, code lost:
        r0 = r1.equals("away-message");
        r1 = 71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0253, code lost:
        if (r12.equals("support") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x025c, code lost:
        if (r12.equals("manage-ads") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0262, code lost:
        if (r2.size() < 1) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0264, code lost:
        r3 = r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0276, code lost:
        if ("ad-details".equals(r3.toLowerCase(java.util.Locale.US)) == false) goto L_0x0c9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x027c, code lost:
        if (r2.size() < 2) goto L_0x0c9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x027e, code lost:
        return 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0281, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x028a, code lost:
        if (r12.equals("favorites") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028e, code lost:
        r0 = "directory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0299, code lost:
        if (r12.equals("status") != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a4, code lost:
        if (r12.equals("survey") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a6, code lost:
        return org.wawebrtc.MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02af, code lost:
        if (r12.equals("advertise") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02b5, code lost:
        if (r2.isEmpty() == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b7, code lost:
        return 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ba, code lost:
        r1 = r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c4, code lost:
        switch(r1.hashCode()) {
            case -934426579: goto L_0x02f2;
            case -892481550: goto L_0x02e7;
            case -530685006: goto L_0x02dd;
            case -309425751: goto L_0x02d3;
            case 555704345: goto L_0x02c9;
            default: goto L_0x02c7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02c9, code lost:
        r0 = r1.equals("catalog");
        r1 = 44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d3, code lost:
        r0 = r1.equals("profile");
        r1 = 68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02dd, code lost:
        r0 = r1.equals("recently-added-media");
        r1 = 103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e7, code lost:
        r0 = r1.equals("status");
        r1 = 72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f2, code lost:
        r0 = r1.equals("resume");
        r1 = 54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0302, code lost:
        if (r12.equals("premium") != false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x030c, code lost:
        if (r12.equals("biz-agents-onboarding") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0316, code lost:
        if (r12.equals("product") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0318, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0320, code lost:
        if (r12.equals("profile") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0322, code lost:
        return 155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x032b, code lost:
        if (r12.equals("help-bottomsheet") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0331, code lost:
        if (r2.size() != 1) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0333, code lost:
        return 147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0336, code lost:
        r0 = "updates";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0341, code lost:
        if (r12.equals("calluser") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x034b, code lost:
        if (r12.equals("ph") != false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0355, code lost:
        if (r12.equals("qr") != false) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035f, code lost:
        if (r12.equals("fpm") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0367, code lost:
        if (r12.equals("pay") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0372, code lost:
        if (r12.equals("tds") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x037d, code lost:
        if (r12.equals("tos") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0383, code lost:
        return A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x038a, code lost:
        if (r12.equals("call") != false) goto L_0x0ec4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x038e, code lost:
        r0 = "guia";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0394, code lost:
        if (r12.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x039e, code lost:
        if (r12.equals("lists") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a0, code lost:
        return 139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03a9, code lost:
        if (r12.equals("ctwa-messaging-guide") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ab, code lost:
        return 83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03b4, code lost:
        if (r12.equals("ad-details") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03b6, code lost:
        return 74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03bf, code lost:
        if (r12.equals("calling") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03c5, code lost:
        return A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03cc, code lost:
        if (r12.equals("catalog") != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0471, code lost:
        if (r12.equals("message_yourself") != false) goto L_0x0827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x047b, code lost:
        if (r12.equals("account_switcher") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x047d, code lost:
        return 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0480, code lost:
        r0 = "channel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0486, code lost:
        if (r12.equals(r0) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0488, code lost:
        return 56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0491, code lost:
        if (r12.equals("meta_verified") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x049b, code lost:
        if (r12.equals("event-link") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x049d, code lost:
        r4 = X.C220618l.newArrayList((java.lang.Object[]) new java.lang.String[]{"event_id", "event_name"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04bd, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, ((X.C52802bV) r5.A0C.get()).A00, 3989) == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04bf, code lost:
        r1 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04c7, code lost:
        if (r1.hasNext() == false) goto L_0x0cb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04d3, code lost:
        if (r7.getQueryParameter((java.lang.String) r1.next()) != null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04d5, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04dc, code lost:
        if (r12.equals("message") != false) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04e6, code lost:
        if (r12.equals("archive_settings") != false) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04f0, code lost:
        if (r12.equals("biztools") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04f6, code lost:
        return A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04fd, code lost:
        if (r12.equals("new-list") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0508, code lost:
        if (r12.equals("settings") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x050e, code lost:
        return A00(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0516, code lost:
        if (r12.equals("stickerpack") != false) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x053c, code lost:
        if (r12.equals("pending_ad") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x053e, code lost:
        return 84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0547, code lost:
        if (r12.equals("marketingmessages") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x054f, code lost:
        if (r12.equals("privacy") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0555, code lost:
        if (r2.size() < 1) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0569, code lost:
        if (r2.get(0).toLowerCase(java.util.Locale.US).equals("checkup") == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0575, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A01, 3815) == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x057e, code lost:
        if (r2.size() != 1) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0592, code lost:
        if (r2.get(0).toLowerCase(java.util.Locale.US).equals("calls") == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06ac, code lost:
        if (r12.equals("send") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06b4, code lost:
        if (A0A(r7, r5.A01) != false) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06ba, code lost:
        if (A05(r7) == null) goto L_0x0a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b29, code lost:
        if (r12.equals("disappearing_messages") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0b2f, code lost:
        if (r2.size() != 0) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0b40, code lost:
        if (r12.equals("orders") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b46, code lost:
        if (r2.size() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b4c, code lost:
        if (A09() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b4e, code lost:
        r0 = "orders-video".equals(r2.get(0).toLowerCase(java.util.Locale.US));
        r1 = 107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b6c, code lost:
        if (r12.equals("biz-edit-profile") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b72, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b7d, code lost:
        if (r12.equals("biz-edit-catalog") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b83, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b8e, code lost:
        if (r12.equals("biz-add-product") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b94, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b9f, code lost:
        if (r12.equals("biz-hours") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0ba5, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0bb0, code lost:
        if (r12.equals("biz-location") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0bb6, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0bc1, code lost:
        if (r12.equals("biz-edit-description") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0bc7, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0bd2, code lost:
        if (r12.equals("biz-website") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0bd8, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0be3, code lost:
        if (r12.equals("biz-price-tier") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0be9, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0bf4, code lost:
        if (r12.equals("biz-profile-completeness") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0bfa, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0c05, code lost:
        if (r12.equals("privacy-settings") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c0b, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c16, code lost:
        if (r12.equals("proxy") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0c1c, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c27, code lost:
        if (r12.equals("help") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c2d, code lost:
        if (r2.size() != 1) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c38, code lost:
        if (r12.equals("code-linking") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c3e, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c49, code lost:
        if (r12.equals("bizsearch") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0c4f, code lost:
        if (r2.size() != 1) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c63, code lost:
        if (r2.get(0).toLowerCase(java.util.Locale.US).equals("onboarding-sheet") == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0c6f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A01, 5465) == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0c7a, code lost:
        if (r12.equals("call-phone-number") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0c86, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A01, 11685) == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0c91, code lost:
        if (r12.equals("biz-linked-accounts") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0c97, code lost:
        if (r2.isEmpty() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0ca8, code lost:
        if ("edit-ad".equals(r3.toLowerCase(java.util.Locale.US)) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0cae, code lost:
        if (r2.size() < 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0cb6, code lost:
        return 66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (X.C37291pH.A00(r7) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:?, code lost:
        return 58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:?, code lost:
        return 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:?, code lost:
        return 78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:?, code lost:
        return 76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:?, code lost:
        return 93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:?, code lost:
        return 146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:?, code lost:
        return 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:?, code lost:
        return X.AnonymousClass74N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:?, code lost:
        return 137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:?, code lost:
        return 46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:?, code lost:
        return 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:?, code lost:
        return 152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:?, code lost:
        return 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:?, code lost:
        return 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:?, code lost:
        return 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:?, code lost:
        return 57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:?, code lost:
        return 63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:?, code lost:
        return 73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:?, code lost:
        return 52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:?, code lost:
        return 61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:?, code lost:
        return 62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:?, code lost:
        return 77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:?, code lost:
        return 98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:?, code lost:
        return 153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:?, code lost:
        return 51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:?, code lost:
        return 82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:?, code lost:
        return 82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:?, code lost:
        return 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:?, code lost:
        return 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:?, code lost:
        return 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:?, code lost:
        return 148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:?, code lost:
        return 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:?, code lost:
        return 159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        if (r15 == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if ("https".equals(r13) != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a5, code lost:
        if ("www.whatsapp.com".equals(r12) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ab, code lost:
        if (r2.isEmpty() == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ad, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b3, code lost:
        if ("pay".equals(r0) == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b9, code lost:
        return A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ba, code lost:
        r0 = r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c6, code lost:
        if (com.whatsapp.SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(r13) != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cf, code lost:
        if ("whatsapp-consumer".equals(r13) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d5, code lost:
        switch(r12.hashCode()) {
            case -1992233120: goto L_0x0b66;
            case -1888021818: goto L_0x01eb;
            case -1854767153: goto L_0x024c;
            case -1801891768: goto L_0x0256;
            case -1785238953: goto L_0x0284;
            case -1562078008: goto L_0x0bff;
            case -1522518477: goto L_0x0bbb;
            case -1388591710: goto L_0x01f4;
            case -1127103024: goto L_0x0b77;
            case -1045462584: goto L_0x0c32;
            case -1008770331: goto L_0x0b3a;
            case -962584979: goto L_0x028e;
            case -947241760: goto L_0x0bdd;
            case -892481550: goto L_0x0292;
            case -891050150: goto L_0x029d;
            case -690411481: goto L_0x02a9;
            case -474713810: goto L_0x0bee;
            case -436339243: goto L_0x0b99;
            case -318452137: goto L_0x02fc;
            case -314498168: goto L_0x054b;
            case -313324288: goto L_0x0306;
            case -309474065: goto L_0x0310;
            case -309425751: goto L_0x031a;
            case -265966801: goto L_0x0baa;
            case -256283256: goto L_0x0325;
            case -234430262: goto L_0x0336;
            case -171636951: goto L_0x033b;
            case 3576: goto L_0x0345;
            case 3617: goto L_0x034f;
            case 101603: goto L_0x0359;
            case 110760: goto L_0x0363;
            case 114691: goto L_0x036b;
            case 115032: goto L_0x0376;
            case 3045982: goto L_0x0384;
            case 3184262: goto L_0x038e;
            case 3198785: goto L_0x0c21;
            case 3526536: goto L_0x06a5;
            case 14123529: goto L_0x0b88;
            case 102982549: goto L_0x0398;
            case 106941038: goto L_0x0c10;
            case 377921569: goto L_0x03a3;
            case 436014744: goto L_0x03ae;
            case 548640964: goto L_0x03b9;
            case 555704345: goto L_0x03c6;
            case 708933431: goto L_0x046d;
            case 734040243: goto L_0x0475;
            case 738950403: goto L_0x0480;
            case 752496578: goto L_0x048b;
            case 937946957: goto L_0x0495;
            case 954925063: goto L_0x04d6;
            case 1059243776: goto L_0x04e0;
            case 1298628776: goto L_0x04ea;
            case 1330916523: goto L_0x04f7;
            case 1336451991: goto L_0x0c74;
            case 1434631203: goto L_0x0501;
            case 1519332396: goto L_0x0b23;
            case 1564510331: goto L_0x0c43;
            case 1597539542: goto L_0x050f;
            case 1698491339: goto L_0x0536;
            case 1708621281: goto L_0x0bcc;
            case 1737180530: goto L_0x0541;
            case 1850498144: goto L_0x0c8b;
            default: goto L_0x01d8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d8, code lost:
        r1 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01de, code lost:
        if (r1.A07() == false) goto L_0x0ec5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e0, code lost:
        r1.A03();
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0E(android.net.Uri r23) {
        /*
            r22 = this;
            r7 = r23
            java.lang.String r1 = r7.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0ec5
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r13 = r1.toLowerCase(r0)
            java.util.List r2 = r7.getPathSegments()
            java.lang.String r1 = r7.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0ec5
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r12 = r1.toLowerCase(r0)
            X.2tm r4 = X.AnonymousClass4YQ.A03
            boolean r0 = r4.A07(r7)
            r1 = 56
            if (r0 != 0) goto L_0x0039
            boolean r0 = r4.A08(r7)
            if (r0 == 0) goto L_0x003a
            r1 = 113(0x71, float:1.58E-43)
        L_0x0039:
            return r1
        L_0x003a:
            boolean r0 = A0D(r13, r12)
            r21 = 26
            r20 = 13
            r19 = 5
            r18 = 6
            r17 = 80
            r16 = 55
            r15 = 35
            java.lang.String r11 = "message_yourself"
            java.lang.String r10 = "pay"
            java.lang.String r9 = "privacy"
            r14 = 10
            r8 = 3
            r6 = 2
            r4 = 0
            r5 = r22
            if (r0 == 0) goto L_0x00a9
            int r0 = r2.size()
            if (r0 != r3) goto L_0x00ca
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ca
        L_0x0076:
            java.util.Set r2 = r7.getQueryParameterNames()
            if (r2 == 0) goto L_0x00a4
            int r0 = r2.size()
            if (r0 != r3) goto L_0x00a7
            java.lang.String r0 = "text"
            java.lang.String r0 = r7.getQueryParameter(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "photo"
            java.lang.String r0 = r7.getQueryParameter(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "ar"
            java.lang.String r0 = r7.getQueryParameter(r0)
            if (r0 == 0) goto L_0x00a7
        L_0x009b:
            r1 = 1
        L_0x009c:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a4
            if (r1 == 0) goto L_0x0b64
        L_0x00a4:
            r1 = 41
            return r1
        L_0x00a7:
            r1 = 0
            goto L_0x009c
        L_0x00a9:
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0116
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0a2b
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0a2b
            goto L_0x00e2
        L_0x00ca:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00fb
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00fb
        L_0x00e2:
            int r0 = r2.size()
            if (r0 < r6) goto L_0x00f5
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
        L_0x00f0:
            int r1 = r5.A02(r0)
            return r1
        L_0x00f5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00f0
        L_0x00fb:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x03d0
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "ph"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03d0
            return r15
        L_0x0116:
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r0.equals(r12)
            r19 = 33
            if (r0 != 0) goto L_0x0ec4
            java.lang.String r0 = "http"
            boolean r15 = r0.equals(r13)
            if (r15 != 0) goto L_0x0130
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0196
        L_0x0130:
            java.lang.String r0 = "whatsapp.com"
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0145
            X.00H r0 = r5.A0B
            r0.get()
            boolean r0 = X.C37291pH.A00(r7)
            if (r0 == 0) goto L_0x0145
        L_0x0144:
            return r16
        L_0x0145:
            java.lang.String r0 = "chat.whatsapp.com"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0150
            r1 = 8
            return r1
        L_0x0150:
            if (r15 != 0) goto L_0x015a
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0191
        L_0x015a:
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0191
        L_0x0163:
            java.util.List r0 = r7.getPathSegments()
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0194
            java.util.List r0 = r7.getPathSegments()
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r0 = "dl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0194
            java.util.List r0 = r7.getPathSegments()
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r0 = "source=sfw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0194
            r1 = 129(0x81, float:1.81E-43)
            return r1
        L_0x0191:
            if (r1 == 0) goto L_0x0194
            goto L_0x0163
        L_0x0194:
            if (r15 != 0) goto L_0x019e
        L_0x0196:
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01bf
        L_0x019e:
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = ""
        L_0x01af:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0ec5
        L_0x01b5:
            int r1 = r5.A02(r2)
            return r1
        L_0x01ba:
            java.lang.Object r0 = r2.get(r4)
            goto L_0x01af
        L_0x01bf:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01d1
            java.lang.String r0 = "whatsapp-consumer"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01d8
        L_0x01d1:
            int r0 = r12.hashCode()
            switch(r0) {
                case -1992233120: goto L_0x0b66;
                case -1888021818: goto L_0x01eb;
                case -1854767153: goto L_0x024c;
                case -1801891768: goto L_0x0256;
                case -1785238953: goto L_0x0284;
                case -1562078008: goto L_0x0bff;
                case -1522518477: goto L_0x0bbb;
                case -1388591710: goto L_0x01f4;
                case -1127103024: goto L_0x0b77;
                case -1045462584: goto L_0x0c32;
                case -1008770331: goto L_0x0b3a;
                case -962584979: goto L_0x028e;
                case -947241760: goto L_0x0bdd;
                case -892481550: goto L_0x0292;
                case -891050150: goto L_0x029d;
                case -690411481: goto L_0x02a9;
                case -474713810: goto L_0x0bee;
                case -436339243: goto L_0x0b99;
                case -318452137: goto L_0x02fc;
                case -314498168: goto L_0x054b;
                case -313324288: goto L_0x0306;
                case -309474065: goto L_0x0310;
                case -309425751: goto L_0x031a;
                case -265966801: goto L_0x0baa;
                case -256283256: goto L_0x0325;
                case -234430262: goto L_0x0336;
                case -171636951: goto L_0x033b;
                case 3576: goto L_0x0345;
                case 3617: goto L_0x034f;
                case 101603: goto L_0x0359;
                case 110760: goto L_0x0363;
                case 114691: goto L_0x036b;
                case 115032: goto L_0x0376;
                case 3045982: goto L_0x0384;
                case 3184262: goto L_0x038e;
                case 3198785: goto L_0x0c21;
                case 3526536: goto L_0x06a5;
                case 14123529: goto L_0x0b88;
                case 102982549: goto L_0x0398;
                case 106941038: goto L_0x0c10;
                case 377921569: goto L_0x03a3;
                case 436014744: goto L_0x03ae;
                case 548640964: goto L_0x03b9;
                case 555704345: goto L_0x03c6;
                case 708933431: goto L_0x046d;
                case 734040243: goto L_0x0475;
                case 738950403: goto L_0x0480;
                case 752496578: goto L_0x048b;
                case 937946957: goto L_0x0495;
                case 954925063: goto L_0x04d6;
                case 1059243776: goto L_0x04e0;
                case 1298628776: goto L_0x04ea;
                case 1330916523: goto L_0x04f7;
                case 1336451991: goto L_0x0c74;
                case 1434631203: goto L_0x0501;
                case 1519332396: goto L_0x0b23;
                case 1564510331: goto L_0x0c43;
                case 1597539542: goto L_0x050f;
                case 1698491339: goto L_0x0536;
                case 1708621281: goto L_0x0bcc;
                case 1737180530: goto L_0x0541;
                case 1850498144: goto L_0x0c8b;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            X.0zA r1 = r5.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0ec5
            r1.A03()
            java.lang.String r1 = "isWamoLink"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x01eb:
            java.lang.String r0 = "edit-ad"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0cb0
            goto L_0x01d8
        L_0x01f4:
            java.lang.String r0 = "biztab"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0217
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
        L_0x020e:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1535436173: goto L_0x0238;
                case -1110417409: goto L_0x022e;
                case -690411481: goto L_0x0224;
                case 555704345: goto L_0x021a;
                case 1078655016: goto L_0x0242;
                default: goto L_0x0215;
            }
        L_0x0215:
            goto L_0x0b64
        L_0x0217:
            java.lang.String r1 = ""
            goto L_0x020e
        L_0x021a:
            java.lang.String r0 = "catalog"
            boolean r0 = r1.equals(r0)
            r1 = 59
            goto L_0x0b62
        L_0x0224:
            java.lang.String r0 = "advertise"
            boolean r0 = r1.equals(r0)
            r1 = 45
            goto L_0x0b62
        L_0x022e:
            java.lang.String r0 = "labels"
            boolean r0 = r1.equals(r0)
            r1 = 69
            goto L_0x0b62
        L_0x0238:
            java.lang.String r0 = "greeting-message"
            boolean r0 = r1.equals(r0)
            r1 = 70
            goto L_0x0b62
        L_0x0242:
            java.lang.String r0 = "away-message"
            boolean r0 = r1.equals(r0)
            r1 = 71
            goto L_0x0b62
        L_0x024c:
            java.lang.String r0 = "support"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07c1
            goto L_0x01d8
        L_0x0256:
            java.lang.String r0 = "manage-ads"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0281
            java.lang.Object r3 = r2.get(r4)
            java.lang.String r3 = (java.lang.String) r3
        L_0x026a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r0)
            java.lang.String r0 = "ad-details"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0c9c
            int r0 = r2.size()
            if (r0 < r6) goto L_0x0c9c
            r1 = 40
            return r1
        L_0x0281:
            java.lang.String r3 = ""
            goto L_0x026a
        L_0x0284:
            java.lang.String r0 = "favorites"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0cdf
            goto L_0x01d8
        L_0x028e:
            java.lang.String r0 = "directory"
            goto L_0x0390
        L_0x0292:
            java.lang.String r0 = "status"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x01d8
        L_0x029d:
            java.lang.String r0 = "survey"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 144(0x90, float:2.02E-43)
            return r1
        L_0x02a9:
            java.lang.String r0 = "advertise"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x02ba
            r1 = 38
            return r1
        L_0x02ba:
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.hashCode()
            switch(r0) {
                case -934426579: goto L_0x02f2;
                case -892481550: goto L_0x02e7;
                case -530685006: goto L_0x02dd;
                case -309425751: goto L_0x02d3;
                case 555704345: goto L_0x02c9;
                default: goto L_0x02c7;
            }
        L_0x02c7:
            goto L_0x0b64
        L_0x02c9:
            java.lang.String r0 = "catalog"
            boolean r0 = r1.equals(r0)
            r1 = 44
            goto L_0x0b62
        L_0x02d3:
            java.lang.String r0 = "profile"
            boolean r0 = r1.equals(r0)
            r1 = 68
            goto L_0x0b62
        L_0x02dd:
            java.lang.String r0 = "recently-added-media"
            boolean r0 = r1.equals(r0)
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0b62
        L_0x02e7:
            java.lang.String r0 = "status"
            boolean r0 = r1.equals(r0)
            r1 = 72
            goto L_0x0b62
        L_0x02f2:
            java.lang.String r0 = "resume"
            boolean r0 = r1.equals(r0)
            r1 = 54
            goto L_0x0b62
        L_0x02fc:
            java.lang.String r0 = "premium"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0842
            goto L_0x01d8
        L_0x0306:
            java.lang.String r0 = "biz-agents-onboarding"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0d36
            goto L_0x01d8
        L_0x0310:
            java.lang.String r0 = "product"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 5
            return r1
        L_0x031a:
            java.lang.String r0 = "profile"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 155(0x9b, float:2.17E-43)
            return r1
        L_0x0325:
            java.lang.String r0 = "help-bottomsheet"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0ec5
            r1 = 147(0x93, float:2.06E-43)
            return r1
        L_0x0336:
            java.lang.String r0 = "updates"
            goto L_0x0482
        L_0x033b:
            java.lang.String r0 = "calluser"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0af8
            goto L_0x01d8
        L_0x0345:
            java.lang.String r0 = "ph"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0ec5
            goto L_0x01d8
        L_0x034f:
            java.lang.String r0 = "qr"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x046c
            goto L_0x01d8
        L_0x0359:
            java.lang.String r0 = "fpm"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0687
            goto L_0x01d8
        L_0x0363:
            boolean r0 = r12.equals(r10)
            if (r0 != 0) goto L_0x01b5
            goto L_0x01d8
        L_0x036b:
            java.lang.String r0 = "tds"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x077b
            goto L_0x01d8
        L_0x0376:
            java.lang.String r0 = "tos"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r1 = r5.A03(r2)
            return r1
        L_0x0384:
            java.lang.String r0 = "call"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0ec4
            goto L_0x01d8
        L_0x038e:
            java.lang.String r0 = "guia"
        L_0x0390:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0cb9
            goto L_0x01d8
        L_0x0398:
            java.lang.String r0 = "lists"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 139(0x8b, float:1.95E-43)
            return r1
        L_0x03a3:
            java.lang.String r0 = "ctwa-messaging-guide"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 83
            return r1
        L_0x03ae:
            java.lang.String r0 = "ad-details"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 74
            return r1
        L_0x03b9:
            java.lang.String r0 = "calling"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r1 = A04(r2)
            return r1
        L_0x03c6:
            java.lang.String r0 = "catalog"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03ea
            goto L_0x01d8
        L_0x03d0:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x03eb
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "c"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03eb
        L_0x03ea:
            return r18
        L_0x03eb:
            int r0 = r2.size()
            if (r0 != r8) goto L_0x0406
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "p"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0406
            return r19
        L_0x0406:
            int r0 = r2.size()
            if (r0 != r8) goto L_0x042f
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "col"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x042f
            X.0ve r2 = r5.A01
            r1 = 10216(0x27e8, float:1.4316E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0ec5
            r3 = 150(0x96, float:2.1E-43)
            return r3
        L_0x042f:
            int r0 = r2.size()
            if (r0 != r8) goto L_0x0458
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "cat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0458
            X.0ve r2 = r5.A01
            r1 = 10215(0x27e7, float:1.4314E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0ec5
            r3 = 149(0x95, float:2.09E-43)
            return r3
        L_0x0458:
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "https://wa.me/qr/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x051a
            int r1 = r1.length()
            r0 = 17
            if (r1 <= r0) goto L_0x051a
        L_0x046c:
            return r8
        L_0x046d:
            boolean r0 = r12.equals(r11)
            if (r0 != 0) goto L_0x0827
            goto L_0x01d8
        L_0x0475:
            java.lang.String r0 = "account_switcher"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 75
            return r1
        L_0x0480:
            java.lang.String r0 = "channel"
        L_0x0482:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 56
            return r1
        L_0x048b:
            java.lang.String r0 = "meta_verified"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x086a
            goto L_0x01d8
        L_0x0495:
            java.lang.String r0 = "event-link"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            X.00H r0 = r5.A0C
            java.lang.Object r2 = r0.get()
            X.2bV r2 = (X.C52802bV) r2
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = "event_id"
            r1[r4] = r0
            java.lang.String r0 = "event_name"
            r1[r3] = r0
            java.util.ArrayList r4 = X.C220618l.newArrayList((java.lang.Object[]) r1)
            X.0ve r2 = r2.A00
            r1 = 3989(0xf95, float:5.59E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0ec5
            java.util.Iterator r1 = r4.iterator()
        L_0x04c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cb6
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r7.getQueryParameter(r0)
            if (r0 != 0) goto L_0x04c3
            return r3
        L_0x04d6:
            java.lang.String r0 = "message"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06d9
            goto L_0x01d8
        L_0x04e0:
            java.lang.String r0 = "archive_settings"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0743
            goto L_0x01d8
        L_0x04ea:
            java.lang.String r0 = "biztools"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r1 = r5.A01(r2)
            return r1
        L_0x04f7:
            java.lang.String r0 = "new-list"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0d53
            goto L_0x01d8
        L_0x0501:
            java.lang.String r0 = "settings"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r1 = r5.A00(r7, r2)
            return r1
        L_0x050f:
            java.lang.String r0 = "stickerpack"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0535
            goto L_0x01d8
        L_0x051a:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x06bf
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "stickerpack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06bf
        L_0x0535:
            return r20
        L_0x0536:
            java.lang.String r0 = "pending_ad"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r1 = 84
            return r1
        L_0x0541:
            java.lang.String r0 = "marketingmessages"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x066a
            goto L_0x01d8
        L_0x054b:
            boolean r0 = r12.equals(r9)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 < r3) goto L_0x057a
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "checkup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x057a
            X.0ve r5 = r5.A01
            r1 = 3815(0xee7, float:5.346E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x057a
        L_0x0577:
            r1 = 58
            return r1
        L_0x057a:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0ec5
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ec5
            goto L_0x05bf
        L_0x0595:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x05c2
            java.lang.Object r0 = r2.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x05c2
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r0 = "calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05c2
        L_0x05bf:
            r1 = 64
            return r1
        L_0x05c2:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x05fb
            java.lang.Object r0 = r2.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x05fb
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r0 = "groups"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05fb
            X.0ve r8 = r5.A01
            r1 = 3995(0xf9b, float:5.598E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x05fb
            r1 = 91
            return r1
        L_0x05fb:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0634
            java.lang.Object r0 = r2.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0634
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r0 = "profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0634
            X.0ve r8 = r5.A01
            r1 = 3998(0xf9e, float:5.602E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0634
            r1 = 92
            return r1
        L_0x0634:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0650
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "code-linking"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0650
            goto L_0x0c40
        L_0x0650:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x066d
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "marketingmessages"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x066d
        L_0x066a:
            r1 = 78
            return r1
        L_0x066d:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x068a
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "fpm"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x068a
        L_0x0687:
            r1 = 76
            return r1
        L_0x068a:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0a7b
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "ais"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a7b
            goto L_0x06bc
        L_0x06a5:
            java.lang.String r0 = "send"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            X.0ve r0 = r5.A01
            boolean r0 = A0A(r7, r0)
            if (r0 != 0) goto L_0x06d9
            android.net.Uri r0 = A05(r7)
            if (r0 == 0) goto L_0x0a46
        L_0x06bc:
            r1 = 93
            return r1
        L_0x06bf:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x06da
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06da
        L_0x06d9:
            return r14
        L_0x06da:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0701
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biztools"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0701
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = r5.A01(r0)
            return r1
        L_0x0701:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0729
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0729
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = r5.A00(r7, r0)
            return r1
        L_0x0729:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0744
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "archive_settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0744
        L_0x0743:
            return r21
        L_0x0744:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0760
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0760
            goto L_0x0b31
        L_0x0760:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x077e
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "tds"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x077e
        L_0x077b:
            r1 = 146(0x92, float:2.05E-43)
            return r1
        L_0x077e:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x07a6
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "tos"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x07a6
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = r5.A03(r0)
            return r1
        L_0x07a6:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x07c4
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "support"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x07c4
        L_0x07c1:
            r1 = 30
            return r1
        L_0x07c4:
            boolean r0 = X.C60912oo.A00(r7)
            if (r0 != 0) goto L_0x0cb9
            int r0 = r2.size()
            if (r0 != r6) goto L_0x080f
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "community"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x080f
            X.0ve r4 = r5.A01
            r1 = 5543(0x15a7, float:7.767E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x0ec5
            X.11S r0 = r5.A07
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0ec5
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "create"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ec5
            r1 = 37
            return r1
        L_0x080f:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0828
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0828
        L_0x0827:
            return r17
        L_0x0828:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0850
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "premium"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0850
        L_0x0842:
            X.0ve r2 = r5.A01
            r1 = 2562(0xa02, float:3.59E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 42
            goto L_0x0b62
        L_0x0850:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x086d
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "meta_verified"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x086d
        L_0x086a:
            r1 = 108(0x6c, float:1.51E-43)
            return r1
        L_0x086d:
            r2.size()
            r2.size()
            r2.size()
            r2.size()
            r2.size()
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0898
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-edit-profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0898
            goto L_0x0b74
        L_0x0898:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x08b4
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x08b4
            goto L_0x0b85
        L_0x08b4:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x08d0
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-add-product"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x08d0
            goto L_0x0b96
        L_0x08d0:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x08ec
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-hours"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x08ec
            goto L_0x0ba7
        L_0x08ec:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0908
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0908
            goto L_0x0bb8
        L_0x0908:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0924
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-edit-description"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0924
            goto L_0x0bc9
        L_0x0924:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0940
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0940
            goto L_0x0c99
        L_0x0940:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x095c
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-website"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x095c
            goto L_0x0bda
        L_0x095c:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0978
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-price-tier"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0978
            goto L_0x0beb
        L_0x0978:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0994
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-profile-completeness"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0994
            goto L_0x0bfc
        L_0x0994:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x09b0
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "privacy-settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x09b0
            goto L_0x0c0d
        L_0x09b0:
            X.00H r0 = r5.A0B
            r0.get()
            boolean r0 = X.C37291pH.A00(r7)
            if (r0 != 0) goto L_0x0144
            int r0 = r2.size()
            if (r0 != r6) goto L_0x09f3
            java.lang.Object r0 = r2.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x09f3
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r0 = "checkup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x09f3
            X.0ve r8 = r5.A01
            r1 = 3815(0xee7, float:5.346E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x09f3
            goto L_0x0577
        L_0x09f3:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a0f
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "proxy"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a0f
            goto L_0x0c1e
        L_0x0a0f:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0595
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "help"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0595
            goto L_0x0c2f
        L_0x0a2b:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a47
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "send"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0a47
        L_0x0a46:
            return r6
        L_0x0a47:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a60
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0a60
            return r17
        L_0x0a60:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0116
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "calluser"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0116
            goto L_0x0af8
        L_0x0a7b:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0ab7
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "bizsearch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ab7
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "onboarding-sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ab7
            X.0ve r8 = r5.A01
            r1 = 5465(0x1559, float:7.658E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0ab7
            goto L_0x0c71
        L_0x0ab7:
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x0ade
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "calling"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ade
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = A04(r0)
            return r1
        L_0x0ade:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0afb
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "call"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0afb
        L_0x0af8:
            r1 = 137(0x89, float:1.92E-43)
            return r1
        L_0x0afb:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0cbc
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "call-phone-number"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cbc
            X.0ve r8 = r5.A01
            r1 = 11685(0x2da5, float:1.6374E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0cbc
            goto L_0x0c88
        L_0x0b23:
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0ec5
        L_0x0b31:
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x0ec5
            r3 = 25
            return r3
        L_0x0b3a:
            java.lang.String r0 = "orders"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0b64
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x0b64
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "orders-video"
            boolean r0 = r0.equals(r1)
            r1 = 107(0x6b, float:1.5E-43)
        L_0x0b62:
            if (r0 != 0) goto L_0x0039
        L_0x0b64:
            r1 = 1
            return r1
        L_0x0b66:
            java.lang.String r0 = "biz-edit-profile"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0b74:
            r1 = 46
            return r1
        L_0x0b77:
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0b85:
            r1 = 48
            return r1
        L_0x0b88:
            java.lang.String r0 = "biz-add-product"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0b96:
            r1 = 152(0x98, float:2.13E-43)
            return r1
        L_0x0b99:
            java.lang.String r0 = "biz-hours"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0ba7:
            r1 = 49
            return r1
        L_0x0baa:
            java.lang.String r0 = "biz-location"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0bb8:
            r1 = 50
            return r1
        L_0x0bbb:
            java.lang.String r0 = "biz-edit-description"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0bc9:
            r1 = 53
            return r1
        L_0x0bcc:
            java.lang.String r0 = "biz-website"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0bda:
            r1 = 57
            return r1
        L_0x0bdd:
            java.lang.String r0 = "biz-price-tier"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0beb:
            r1 = 63
            return r1
        L_0x0bee:
            java.lang.String r0 = "biz-profile-completeness"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0bfc:
            r1 = 73
            return r1
        L_0x0bff:
            java.lang.String r0 = "privacy-settings"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0c0d:
            r1 = 52
            return r1
        L_0x0c10:
            java.lang.String r0 = "proxy"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0c1e:
            r1 = 61
            return r1
        L_0x0c21:
            java.lang.String r0 = "help"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0ec5
        L_0x0c2f:
            r1 = 62
            return r1
        L_0x0c32:
            java.lang.String r0 = "code-linking"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0c40:
            r1 = 77
            return r1
        L_0x0c43:
            java.lang.String r0 = "bizsearch"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0ec5
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "onboarding-sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ec5
            X.0ve r2 = r5.A01
            r1 = 5465(0x1559, float:7.658E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0ec5
        L_0x0c71:
            r1 = 98
            return r1
        L_0x0c74:
            java.lang.String r0 = "call-phone-number"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            X.0ve r2 = r5.A01
            r1 = 11685(0x2da5, float:1.6374E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0ec5
        L_0x0c88:
            r1 = 153(0x99, float:2.14E-43)
            return r1
        L_0x0c8b:
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0ec5
        L_0x0c99:
            r1 = 51
            return r1
        L_0x0c9c:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r0)
            java.lang.String r0 = "edit-ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0cb3
            int r0 = r2.size()
            if (r0 < r6) goto L_0x0cb3
        L_0x0cb0:
            r1 = 82
            return r1
        L_0x0cb3:
            r1 = 39
            return r1
        L_0x0cb6:
            r1 = 66
            return r1
        L_0x0cb9:
            r1 = 32
            return r1
        L_0x0cbc:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0cc5
            r2.get(r4)
        L_0x0cc5:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0ce2
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "favorites"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ce2
        L_0x0cdf:
            r1 = 148(0x94, float:2.07E-43)
            return r1
        L_0x0ce2:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0cff
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "aimediainput"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cff
            r1 = 157(0x9d, float:2.2E-43)
            return r1
        L_0x0cff:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0d1c
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "aivoice"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0d1c
            r1 = 158(0x9e, float:2.21E-43)
            return r1
        L_0x0d1c:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0d39
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "biz-agents-onboarding"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0d39
        L_0x0d36:
            r1 = 109(0x6d, float:1.53E-43)
            return r1
        L_0x0d39:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0d56
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "new-list"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0d56
        L_0x0d53:
            r1 = 159(0x9f, float:2.23E-43)
            return r1
        L_0x0d56:
            X.0ve r1 = r5.A01
            java.lang.String r0 = r7.toString()
            boolean r0 = A0B(r1, r0)
            if (r0 == 0) goto L_0x0d98
            X.1i3 r1 = r5.A08
            java.lang.String r7 = "DeepLinkHelper"
            java.lang.String r6 = "fetch_biz_info"
            java.util.Map r5 = r1.A02
            java.lang.Object r2 = r5.get(r6)
            X.19a r2 = (X.C222119a) r2
            if (r2 != 0) goto L_0x0d92
            X.1HA r4 = r1.A00
            r0 = 701183835(0x29cb375b, float:9.0246136E-14)
            X.0ve r3 = r1.A01
            X.19b r2 = new X.19b
            r2.<init>(r3, r0)
            r1 = 2560(0xa00, float:3.587E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0d8b
            r0 = 1
            r2.A04 = r0
        L_0x0d8b:
            X.19a r2 = r4.A01(r2, r6)
            r5.put(r6, r2)
        L_0x0d92:
            r0 = -1
            r2.A0D(r7, r0)
            return r14
        L_0x0d98:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0dad
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "biz-"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0dad
            return r3
        L_0x0dad:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0dc2
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "event-link"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0dc2
            return r3
        L_0x0dc2:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0df3
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "invite"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0df3
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "invite-a-friend"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0df3
            r1 = 112(0x70, float:1.57E-43)
            return r1
        L_0x0df3:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0e24
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "contacts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0e24
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "permission"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0e24
            r1 = 114(0x72, float:1.6E-43)
            return r1
        L_0x0e24:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0e55
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "notifications"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0e55
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "permission"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0e55
            r1 = 115(0x73, float:1.61E-43)
            return r1
        L_0x0e55:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0e72
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "edit-profile-picture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0e72
            r1 = 47
            return r1
        L_0x0e72:
            X.0zA r1 = r5.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0e85
            r1.A03()
            java.lang.String r1 = "isInterAppIdentitySwitchUri"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0e85:
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x0eb6
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "avatar"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0eb6
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "edit"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0eb6
            r1 = 130(0x82, float:1.82E-43)
            return r1
        L_0x0eb6:
            int r0 = r2.size()
            if (r0 == r3) goto L_0x0ec2
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0ec5
        L_0x0ec2:
            r3 = 2
            return r3
        L_0x0ec4:
            return r19
        L_0x0ec5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32981i4.A0E(android.net.Uri):int");
    }

    public AnonymousClass1D6 A0G(Uri uri) {
        String queryParameter;
        if (!C18020vd.A05(C18040vf.A02, this.A01, 4748) || uri.getPathSegments().size() > 1) {
            return null;
        }
        String host = uri.getHost();
        if (host == null || !"wa.me".equals(host.toLowerCase(Locale.US))) {
            queryParameter = uri.getQueryParameter("username");
        } else {
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter == null) {
            return null;
        }
        int indexOf = queryParameter.indexOf(35);
        if (indexOf != -1) {
            return new AnonymousClass1D6(queryParameter.substring(0, indexOf), queryParameter.substring(indexOf + 1));
        }
        return new AnonymousClass1D6(queryParameter, (Object) null);
    }

    public boolean A0M(String str, int i) {
        String A012 = C18020vd.A01(C18040vf.A02, this.A01, i);
        if (!TextUtils.isEmpty(A012)) {
            String trim = str.trim();
            for (String trim2 : A012.split(",")) {
                if (trim.equalsIgnoreCase(trim2.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C32981i4(C19880zA r1, C19880zA r2, C19880zA r3, C19880zA r4, AnonymousClass11S r5, C32971i3 r6, C18030ve r7, C32011gU r8, AnonymousClass1QN r9, AnonymousClass1CM r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A01 = r7;
        this.A07 = r5;
        this.A02 = r8;
        this.A08 = r6;
        this.A05 = r1;
        this.A06 = r2;
        this.A0A = r11;
        this.A03 = r9;
        this.A09 = r10;
        this.A0B = r12;
        this.A0C = r13;
        this.A00 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        switch(r5) {
            case 0: goto L_0x0092;
            case 1: goto L_0x01b7;
            case 2: goto L_0x01b4;
            case 3: goto L_0x0081;
            case 4: goto L_0x01b1;
            case 5: goto L_0x01ae;
            case 6: goto L_0x006c;
            case 7: goto L_0x01ab;
            case 8: goto L_0x01a8;
            case 9: goto L_0x004f;
            default: goto L_0x004e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if ("whatsapp-smb".equals(r7.getScheme()) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (X.C18020vd.A05(r3, r2, 7382) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (X.C18020vd.A05(r3, r2, 10728) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return 151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if ("whatsapp-smb".equals(r7.getScheme()) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (X.C18020vd.A05(r3, r2, 9304) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return 87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (((X.C196039uM) r6.A0A.get()).A02() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        return 81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r2 = r6.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (((X.C196039uM) r2.get()).A02() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        r2 = ((X.C196039uM) r2.get()).A01;
        r0 = r2.A0o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r0.length() == 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r2.A2N() != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        if (X.C24605CBj.A00(A08(r7)) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        return 96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0119, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a8, code lost:
        return 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ab, code lost:
        return 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ae, code lost:
        return 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b1, code lost:
        return 145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b4, code lost:
        return 67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b7, code lost:
        return 22;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(android.net.Uri r7, java.util.List r8) {
        /*
            r6 = this;
            int r0 = r8.size()
            r1 = 1
            if (r0 == 0) goto L_0x004e
            X.0ve r2 = r6.A01
            r0 = 504(0x1f8, float:7.06E-43)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x004e
            boolean r0 = r6.A09()
            if (r0 == 0) goto L_0x004e
            r5 = 0
            java.lang.Object r4 = r8.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "account"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x011d
            int r0 = r8.size()
            if (r0 <= r1) goto L_0x011d
            java.lang.Object r4 = r8.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1711740600: goto L_0x0112;
                case -1335458389: goto L_0x010a;
                case 51309: goto L_0x0102;
                case 96619420: goto L_0x00fa;
                case 538292132: goto L_0x00f1;
                case 734040243: goto L_0x00e9;
                case 1147181203: goto L_0x00e1;
                case 1216618885: goto L_0x00d9;
                case 1302948958: goto L_0x00d0;
                case 1895222039: goto L_0x00c7;
                default: goto L_0x0047;
            }
        L_0x0047:
            r5 = -1
        L_0x0048:
            java.lang.String r4 = "whatsapp-smb"
            switch(r5) {
                case 0: goto L_0x0092;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01b4;
                case 3: goto L_0x0081;
                case 4: goto L_0x01b1;
                case 5: goto L_0x01ae;
                case 6: goto L_0x006c;
                case 7: goto L_0x01ab;
                case 8: goto L_0x01a8;
                case 9: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            return r1
        L_0x004f:
            java.lang.String r0 = r7.getScheme()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 7382(0x1cd6, float:1.0344E-41)
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x004e
            r0 = 10728(0x29e8, float:1.5033E-41)
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x004e
            r1 = 151(0x97, float:2.12E-43)
            return r1
        L_0x006c:
            java.lang.String r0 = r7.getScheme()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 9304(0x2458, float:1.3038E-41)
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x004e
            r1 = 87
            return r1
        L_0x0081:
            X.00H r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.9uM r0 = (X.C196039uM) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x004e
            r1 = 81
            return r1
        L_0x0092:
            X.00H r2 = r6.A0A
            java.lang.Object r0 = r2.get()
            X.9uM r0 = (X.C196039uM) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r2.get()
            X.9uM r0 = (X.C196039uM) r0
            X.0z4 r2 = r0.A01
            java.lang.String r0 = r2.A0o()
            if (r0 == 0) goto L_0x004e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r2.A2N()
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = A08(r7)
            boolean r0 = X.C24605CBj.A00(r0)
            if (r0 != 0) goto L_0x004e
            r1 = 96
            return r1
        L_0x00c7:
            java.lang.String r0 = "maiba-web-coex-onboarding"
            boolean r0 = r4.equals(r0)
            r5 = 9
            goto L_0x0119
        L_0x00d0:
            java.lang.String r0 = "request_info"
            boolean r0 = r4.equals(r0)
            r5 = 8
            goto L_0x0119
        L_0x00d9:
            java.lang.String r0 = "passkeys"
            boolean r0 = r4.equals(r0)
            r5 = 7
            goto L_0x0119
        L_0x00e1:
            java.lang.String r0 = "business-platforms"
            boolean r0 = r4.equals(r0)
            r5 = 6
            goto L_0x0119
        L_0x00e9:
            java.lang.String r0 = "account_switcher"
            boolean r0 = r4.equals(r0)
            r5 = 5
            goto L_0x0119
        L_0x00f1:
            java.lang.String r0 = "security_checkup"
            boolean r0 = r4.equals(r0)
            r5 = 4
            goto L_0x0119
        L_0x00fa:
            java.lang.String r0 = "email"
            boolean r0 = r4.equals(r0)
            r5 = 3
            goto L_0x0119
        L_0x0102:
            java.lang.String r0 = "2fa"
            boolean r0 = r4.equals(r0)
            r5 = 2
            goto L_0x0119
        L_0x010a:
            java.lang.String r0 = "delete"
            boolean r0 = r4.equals(r0)
            r5 = 1
            goto L_0x0119
        L_0x0112:
            java.lang.String r0 = "verify-email"
            boolean r0 = r4.equals(r0)
        L_0x0119:
            if (r0 != 0) goto L_0x0048
            goto L_0x0047
        L_0x011d:
            java.lang.String r0 = "chats"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x017e
            int r0 = r8.size()
            if (r0 <= r1) goto L_0x014a
            java.lang.Object r2 = r8.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "backup"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "history"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x014a
            r1 = 24
            return r1
        L_0x014a:
            java.lang.String r0 = "page"
            java.lang.String r2 = r7.getQueryParameter(r0)
            int r0 = r8.size()
            if (r0 != r1) goto L_0x004e
            java.util.Set r0 = r7.getQueryParameterNames()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x017b
            if (r2 == 0) goto L_0x004e
            java.lang.String r0 = "theme"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "font"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "language"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x004e
        L_0x017b:
            r1 = 36
            return r1
        L_0x017e:
            java.lang.String r0 = "storage-management"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x018a
            r1 = 88
            return r1
        L_0x018a:
            java.lang.String r0 = "linked_devices"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0195
            r1 = 43
            return r1
        L_0x0195:
            java.lang.String r0 = "chat-themes"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x004e
            boolean r0 = X.AnonymousClass1J8.A01(r2)
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == 0) goto L_0x004e
            r1 = 156(0x9c, float:2.19E-43)
            return r1
        L_0x01a8:
            r1 = 23
            return r1
        L_0x01ab:
            r1 = 128(0x80, float:1.794E-43)
            return r1
        L_0x01ae:
            r1 = 75
            return r1
        L_0x01b1:
            r1 = 145(0x91, float:2.03E-43)
            return r1
        L_0x01b4:
            r1 = 67
            return r1
        L_0x01b7:
            r1 = 22
            return r1
        L_0x01ba:
            r1 = 110(0x6e, float:1.54E-43)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32981i4.A00(android.net.Uri, java.util.List):int");
    }

    private int A01(List list) {
        String str;
        String str2;
        if (list.size() >= 1) {
            str = ((String) list.get(0)).toLowerCase(Locale.US);
        } else {
            str = "";
        }
        switch (str.hashCode()) {
            case -2137146394:
                if (str.equals("accounts")) {
                    List subList = list.subList(1, list.size());
                    if (subList.size() >= 1) {
                        str2 = ((String) subList.get(0)).toLowerCase(Locale.US);
                    } else {
                        str2 = "";
                    }
                    if (str2.equals("")) {
                        return 20;
                    }
                    if (!str2.equals("link_fb")) {
                        return 1;
                    }
                    return 131;
                }
                break;
            case -1814119737:
                if (str.equals("orders-home")) {
                    return 100;
                }
                break;
            case -962584979:
                if (str.equals("directory")) {
                    return 31;
                }
                break;
            case 1147181203:
                if (str.equals("business-platforms")) {
                    return 60;
                }
                break;
        }
        return 1;
    }

    private int A02(List list) {
        Object obj;
        Object obj2 = "";
        if (list.isEmpty()) {
            obj = obj2;
        } else {
            obj = list.get(0);
        }
        if (list.size() > 1) {
            obj2 = list.get(1);
        }
        if (!"upi".equals(obj)) {
            boolean equals = "br".equals(obj);
            if (equals && "signup".equals(obj2)) {
                return 19;
            }
            if ("virality".equals(obj) || "virality".equals(obj2)) {
                return 21;
            }
            if ("legal".equals(obj)) {
                return 1;
            }
            if ("add-credential".equals(obj2)) {
                return 65;
            }
            if (!equals || !"merchant".equals(obj2)) {
                if (this.A03.A03()) {
                    return 4;
                }
                return 1;
            } else if (list.size() < 4) {
                return 89;
            } else {
                Object obj3 = list.get(2);
                Object obj4 = list.get(3);
                if (!"pix".equals(obj3) || !"add".equals(obj4)) {
                    return 89;
                }
                return 118;
            }
        } else if ("signup".equals(obj2)) {
            return 19;
        } else {
            if ("start_explore_businesses_flow".equals(obj2)) {
                return 119;
            }
            if ("start_payments_camera_flow".equals(obj2)) {
                return 122;
            }
            if ("start_mapper_add_upi_number_flow".equals(obj2)) {
                return 124;
            }
            if ("start_account_recovery_flow".equals(obj2)) {
                return 120;
            }
            if ("start_add_bank_account_flow".equals(obj2)) {
                return 121;
            }
            if ("start_resume_onboarding_flow".equals(obj2)) {
                return 123;
            }
            if ("start_send_payment_flow".equals(obj2)) {
                return 125;
            }
            if ("start_send_first_payment_flow".equals(obj2)) {
                return 136;
            }
            if ("start_set_pin_flow".equals(obj2)) {
                return 126;
            }
            if ("start_set_2fa_flow".equals(obj2)) {
                return StringTreeSet.OFFSET_BASE_ENCODING;
            }
            if ("start_show_payment_history_flow".equals(obj2)) {
                return 132;
            }
            if ("start_help_center_flow".equals(obj2)) {
                return 133;
            }
            if ("start_show_account_details_flow".equals(obj2)) {
                return 134;
            }
            if ("start_invite_others_flow".equals(obj2)) {
                return 135;
            }
            if ("qr_prominence".equals(obj2)) {
                return 143;
            }
            return 1;
        }
    }

    private int A03(List list) {
        if (!list.isEmpty() && A09()) {
            Object obj = list.get(0);
            if (!C18020vd.A05(C18040vf.A02, this.A01, 728) || !"20210210".equals(obj)) {
                return 1;
            }
            return 27;
        }
        return 1;
    }

    public static int A04(List list) {
        if (list.size() != 2 || !((String) list.get(0)).toLowerCase(Locale.US).equals("awareness") || !((String) list.get(1)).toLowerCase(Locale.US).equals("group-call")) {
            return 1;
        }
        return 99;
    }

    public static Uri A05(Uri uri) {
        if (!TextUtils.equals(uri.getHost(), "send") || TextUtils.isEmpty(uri.getQueryParameter("fbid"))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://wa.me/ais/");
        sb.append(uri.getQueryParameter("fbid"));
        Uri parse = Uri.parse(sb.toString());
        if (!TextUtils.isEmpty(uri.getQueryParameter("s"))) {
            return parse.buildUpon().appendQueryParameter("s", uri.getQueryParameter("s")).build();
        }
        return parse;
    }

    public static String A08(Uri uri) {
        boolean equals;
        List<String> pathSegments;
        String str;
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String lowerCase = scheme.toLowerCase(Locale.US);
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                Locale locale = Locale.US;
                if (A0D(lowerCase, host.toLowerCase(locale))) {
                    pathSegments = uri.getPathSegments().subList(1, uri.getPathSegments().size());
                } else {
                    if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(lowerCase)) {
                        equals = true;
                    } else {
                        equals = "whatsapp-consumer".equals(lowerCase);
                    }
                    if (equals) {
                        pathSegments = uri.getPathSegments();
                    }
                }
                if (pathSegments.size() < 3) {
                    str = "deeplinkhelper/parseVerifyEmailOtp/invalid uri";
                } else {
                    String lowerCase2 = pathSegments.get(2).toLowerCase(locale);
                    if (lowerCase2.length() == 6) {
                        try {
                            Integer.parseInt(lowerCase2);
                            return lowerCase2;
                        } catch (NumberFormatException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("deeplinkhelper/parseVerifyEmailOtp/NumberFormatException: ");
                            sb.append(e);
                            Log.e(sb.toString());
                            return null;
                        }
                    } else {
                        str = "deeplinkhelper/parseVerifyEmailOtp/invalid length";
                    }
                }
                Log.e(str);
            }
        }
        return null;
    }

    public static boolean A0C(C18030ve r3, String str) {
        if (!A0B(r3, str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str.toLowerCase(Locale.US));
            if (parse == null || parse.getQueryParameterNames().isEmpty() || !"1".equals(parse.getQueryParameter("qr"))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0F(android.net.Uri r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = r3.getHost()
            boolean r0 = A0D(r0, r1)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            java.util.List r0 = r3.getPathSegments()
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            java.util.List r0 = r3.getPathSegments()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32981i4.A0F(android.net.Uri):java.lang.String");
    }

    public void A0H(Uri uri) {
        int i;
        List<String> pathSegments = uri.getPathSegments();
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String host = uri.getHost();
            if (host == null || !A0D(scheme, host)) {
                if ((!SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(scheme) && !"whatsapp-consumer".equals(scheme)) || pathSegments.size() < 1) {
                    return;
                }
                if (pathSegments.size() == 1) {
                    i = 0;
                } else {
                    pathSegments.get(1);
                    return;
                }
            } else if (pathSegments.size() >= 3) {
                i = 2;
            } else {
                return;
            }
            pathSegments.get(i);
        }
    }

    public boolean A0I(String str) {
        if (TextUtils.isEmpty(str) || 33 != A0E(Uri.parse(str))) {
            return false;
        }
        return true;
    }

    public boolean A0J(String str) {
        if (TextUtils.isEmpty(str) || 6 != A0E(Uri.parse(str))) {
            return false;
        }
        return true;
    }

    public boolean A0K(String str) {
        if (TextUtils.isEmpty(str) || 5 != A0E(Uri.parse(str))) {
            return false;
        }
        return true;
    }

    public boolean A0L(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (33 != A0E(parse)) {
            return false;
        }
        List<String> pathSegments = parse.getPathSegments();
        if (pathSegments.isEmpty() || !pathSegments.get(0).toLowerCase(Locale.US).equals("video")) {
            return false;
        }
        return true;
    }
}
