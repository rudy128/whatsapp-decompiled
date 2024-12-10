package com.facebook.common.dextricks;

import X.AnonymousClass000;
import X.AnonymousClass5WX;
import X.C17880vN;

public class StringTreeSet {
    public static final int BITS_PER_PAYLOAD_UNIT = 6;
    public static final int CHILDREN_SIZE = 4;
    public static final int FLAG_NONTERMINAL = 16;
    public static final int FLAG_NO_PAYLOAD = 8;
    public static final int FLAG_PAYLOAD_UNIT = 64;
    public static final boolean IS_OS_VERSION_CHAOTIC;
    public static final int OFFSET_BASE_ENCODING = 127;
    public static final int PAYLOAD_MASK = 63;
    public static final int PAYLOAD_UNITS_MASK = 7;
    public static final int SINGLE_SYMBOL_MIN_VALUE = 32;
    public static final String TAG = "StringTreeSet";
    public static volatile AnonymousClass5WX sLogger;

    public static boolean search(String str, String str2) {
        return searchMapAtPos(str, str2, 0, 1) != 1;
    }

    public static int searchMap(String str, String str2, int i) {
        return searchMapAtPos(str, str2, 0, i);
    }

    public static int searchMapAtPos(String str, String str2, int i, int i2) {
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (true) {
            int i6 = 3;
            if (i5 < str.length()) {
                char charAt = str.charAt(i5);
                int i7 = i4 + 1;
                char charAt2 = str2.charAt(i4);
                if (charAt2 < ' ') {
                    int i8 = i7 + (charAt2 & 7);
                    int i9 = i8 + 1;
                    int charAt3 = str2.charAt(i8) - 1;
                    if (charAt3 < 1) {
                        break;
                    }
                    int i10 = i9 + 1;
                    int i11 = charAt3 - 1;
                    if (str2.charAt(i9) != charAt) {
                        int binarySearch = binarySearch(charAt, str2, i10, i11);
                        if (binarySearch == -1) {
                            break;
                        }
                        int i12 = i10 + (binarySearch * 4);
                        int i13 = 0;
                        do {
                            i13 = ((i13 * OFFSET_BASE_ENCODING) + str2.charAt(i12 + i6)) - 1;
                            i6--;
                        } while (i6 > 0);
                        i7 = i13 + i;
                    } else {
                        i7 = i10 + (i11 * 4);
                    }
                } else if (charAt2 != charAt) {
                    return i2;
                }
                i4 = i7;
                i5++;
            } else {
                int i14 = i4 + 1;
                char charAt4 = str2.charAt(i4);
                if (charAt4 < ' ' && (charAt4 & 16) != 16) {
                    if ((charAt4 & 8) == 8) {
                        return 0;
                    }
                    char c = charAt4 & 7;
                    i2 = 0;
                    while (i3 < c) {
                        int i15 = i14 + 1;
                        char charAt5 = str2.charAt(i14);
                        if ((charAt5 & '@') == '@') {
                            char c2 = charAt5 & '?';
                            if (i3 == 5) {
                                if (c2 > 3) {
                                    throw new ArithmeticException("overflow");
                                }
                            } else if (i3 == 6 && c2 != 0) {
                                throw new ArithmeticException("overflow");
                            }
                            i2 |= c2 << (i3 * 6);
                            i3++;
                            i14 = i15;
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Bad data at ");
                            throw AnonymousClass000.A0n(C17880vN.A0t(A10, i15 - 1));
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 > 30) goto L_0x000b;
     */
    static {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x000b
            r1 = 30
            r0 = 1
            if (r2 <= r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            IS_OS_VERSION_CHAOTIC = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.StringTreeSet.<clinit>():void");
    }

    public static int binarySearch(char c, String str, int i, int i2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >> 1;
            char charAt = str.charAt((i5 * 4) + i);
            if (charAt == c) {
                return i5;
            }
            if (charAt > c) {
                i3 = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public static AnonymousClass5WX getLogger() {
        return null;
    }

    public static int searchMapStringify(Object obj, String str, int i) {
        String obj2;
        String obj3;
        int searchMapAtPos;
        if (obj == null) {
            return i;
        }
        if (IS_OS_VERSION_CHAOTIC) {
            synchronized (StringTreeSet.class) {
                if (obj instanceof Class) {
                    obj3 = ((Class) obj).getName();
                } else {
                    obj3 = obj.toString();
                }
                searchMapAtPos = searchMapAtPos(obj3, str, 0, i);
            }
            return searchMapAtPos;
        }
        if (obj instanceof Class) {
            obj2 = ((Class) obj).getName();
        } else {
            obj2 = obj.toString();
        }
        return searchMapAtPos(obj2, str, 0, i);
    }

    public static int decodeBase127Int(String str, int i) {
        return (str.charAt(i) - 1) + ((str.charAt(i + 1) - 1) * OFFSET_BASE_ENCODING) + ((str.charAt(i + 2) - 1) * OFFSET_BASE_ENCODING * OFFSET_BASE_ENCODING);
    }

    public static String searchStringToStringMap(String str, String str2, String str3) {
        int length = str2.length();
        if (length >= 6) {
            int decodeBase127Int = decodeBase127Int(str2, 0);
            if (decodeBase127Int >= 6) {
                int decodeBase127Int2 = decodeBase127Int(str2, 3);
                if (decodeBase127Int2 >= 6) {
                    int searchMapAtPos = searchMapAtPos(str, str2, decodeBase127Int, Integer.MAX_VALUE);
                    if (searchMapAtPos == Integer.MAX_VALUE) {
                        return str3;
                    }
                    if (searchMapAtPos >= 0) {
                        int i = searchMapAtPos + decodeBase127Int2;
                        int decodeBase127Int3 = decodeBase127Int(str2, i);
                        int i2 = i + 3;
                        return str2.substring(i2, decodeBase127Int3 + i2);
                    }
                    throw AnonymousClass000.A0n(String.valueOf(searchMapAtPos));
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw AnonymousClass000.A0k(String.valueOf(length));
    }

    public static void setLogger(AnonymousClass5WX r0) {
        sLogger = r0;
    }
}
