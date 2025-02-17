package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.CvQ  reason: case insensitive filesystem */
public abstract class C26233CvQ {
    public static final ArrayList A00 = AnonymousClass000.A13();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String A03(String str) {
        String A02;
        int i = 0;
        if (str == null) {
            return null;
        }
        String A002 = C24603CBh.A00(str.trim());
        if (A002.startsWith("avc1") || A002.startsWith("avc3")) {
            return "video/avc";
        }
        if (A002.startsWith("hev1") || A002.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (A002.startsWith("dvav") || A002.startsWith("dva1") || A002.startsWith("dvhe") || A002.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (A002.startsWith("av01")) {
            return "video/av01";
        }
        if (A002.startsWith("vp9") || A002.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (A002.startsWith("vp8") || A002.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (A002.startsWith("mp4a")) {
            if (!A002.startsWith("mp4a.")) {
                return "audio/mp4a-latm";
            }
            Matcher matcher = A01.matcher(A002);
            boolean z = false;
            if (matcher.matches()) {
                String group = matcher.group(1);
                C26056CrS.A01(group);
                String group2 = matcher.group(2);
                try {
                    int parseInt = Integer.parseInt(group, 16);
                    if (group2 != null) {
                        Integer.parseInt(group2);
                    }
                    z = true;
                    i = parseInt;
                } catch (NumberFormatException unused) {
                }
            }
            if (!z || (A02 = A02(i)) == null) {
                return "audio/mp4a-latm";
            }
            return A02;
        } else if (A002.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (A002.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (A002.startsWith("ac-3") || A002.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (A002.startsWith("ec-3") || A002.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (A002.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (A002.startsWith("ac-4") || A002.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (A002.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (A002.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (A002.startsWith("dtsh") || A002.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (A002.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (A002.startsWith("opus")) {
                return "audio/opus";
            }
            if (A002.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (A002.startsWith("flac")) {
                return "audio/flac";
            }
            if (A002.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (A002.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (A002.contains("cea708")) {
                return "application/cea-708";
            }
            if (A002.contains("eia608") || A002.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = A00;
            if (0 >= arrayList.size()) {
                return null;
            }
            arrayList.get(0);
            throw AnonymousClass000.A0s("codecPrefix");
        }
    }

    public static String A04(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return AnonymousClass8BS.A0o(str, indexOf);
    }

    public static String A02(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean A05(String str) {
        if (BE8.A1Z(str, "text") || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    return 18;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    return 7;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return 5;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    return 17;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return 6;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    return 8;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    return 14;
                }
                break;
        }
        return 0;
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (BE8.A1Z(str, "audio")) {
            return 1;
        }
        if (BE8.A1Z(str, "video")) {
            return 2;
        }
        if (A05(str)) {
            return 3;
        }
        if (BE8.A1Z(str, "image")) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = A00;
        if (0 >= arrayList.size()) {
            return -1;
        }
        arrayList.get(0);
        throw AnonymousClass000.A0s("mimeType");
    }
}
