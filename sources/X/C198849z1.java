package X;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.9z1  reason: invalid class name and case insensitive filesystem */
public final class C198849z1 {
    public static String A00(Object obj, String str, String str2, String[] strArr) {
        if (!str.equals(obj)) {
            return str2;
        }
        return strArr[1];
    }

    public final C20276AEj A01(String str, String str2) {
        List list;
        int i;
        String str3;
        char c = 0;
        String str4 = str;
        if (str != null) {
            Integer num = null;
            if (AnonymousClass1YF.A0Y(str4, str2, false)) {
                List A0v = C108965cb.A0v(str4, "[?&](?!\\?)", 0);
                if (!A0v.isEmpty()) {
                    ListIterator A18 = C108955ca.A18(A0v);
                    while (true) {
                        if (A18.hasPrevious()) {
                            if (C108985cd.A08(A18) != 0) {
                                list = C108985cd.A0t(A0v, A18);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                list = C18460wS.A00;
                String[] A1b = C108955ca.A1b(list);
                int length = A1b.length;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    String[] A1b2 = C108955ca.A1b(C108965cb.A0v(A1b[i2], "=", 2));
                    String str15 = A1b2[c];
                    switch (str15.hashCode()) {
                        case -1139784776:
                            str11 = A00("otpCode", str15, str11, A1b2);
                            break;
                        case -992105987:
                            str10 = A00("peerID", str15, str10, A1b2);
                            break;
                        case -893183262:
                            str14 = A00("ssidPw", str15, str14, A1b2);
                            break;
                        case 3367:
                            str12 = A00("ip", str15, str12, A1b2);
                            break;
                        case 3050020:
                            str8 = A00("cert", str15, str8, A1b2);
                            break;
                        case 3446913:
                            if (!str15.equals("port")) {
                                break;
                            } else {
                                num = C108955ca.A0l(A1b2[1]);
                                break;
                            }
                        case 3539835:
                            str13 = A00("ssid", str15, str13, A1b2);
                            break;
                        case 351608024:
                            if (!str15.equals("version")) {
                                break;
                            } else {
                                i3 = Integer.parseInt(A1b2[1]);
                                break;
                            }
                        case 607796785:
                            str7 = A00("sessionID", str15, str7, A1b2);
                            break;
                        case 1450587441:
                            str9 = A00("authToken", str15, str9, A1b2);
                            break;
                        case 1809169577:
                            str6 = A00("authMethod", str15, str6, A1b2);
                            break;
                        case 1874684019:
                            if (!str15.equals("platform")) {
                                break;
                            } else {
                                str5 = A1b2[1];
                                break;
                            }
                    }
                    i2++;
                    c = 0;
                }
                if (str5 == null) {
                    throw new AnonymousClass9L2(2, "Required field not found in QR code: platform");
                } else if (str7 == null) {
                    throw new AnonymousClass9L2(2, "Required field not found in QR code: sessionID");
                } else if (str6 == null) {
                    throw new AnonymousClass9L2(2, "Required field not found in QR code: authMethod");
                } else if (str8 == null) {
                    throw new AnonymousClass9L2(2, "Required field not found in QR code: cert");
                } else if (str9 != null) {
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 8988;
                    }
                    Uri parse = Uri.parse(str4);
                    C18070vi.A0b(parse);
                    try {
                        str3 = new URL(parse.getScheme(), parse.getHost(), "").toString();
                    } catch (MalformedURLException unused) {
                        str3 = "whatsapp-consumer://";
                    }
                    String lastPathSegment = parse.getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "fpm";
                    }
                    return new C20276AEj(str3, lastPathSegment, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, i3, i);
                } else {
                    throw new AnonymousClass9L2(2, "Required field not found in QR code: authToken");
                }
            } else if (C138496xB.A05.A01(str4) != null) {
                throw new AnonymousClass9L2(1, "Scanned qr code that was generated for companion linking");
            } else {
                throw new AnonymousClass9L2(0, "Scanned qr code that was not generated for p2p transfer");
            }
        } else {
            throw new AnonymousClass9L2(0, "Passed empty string");
        }
    }
}
