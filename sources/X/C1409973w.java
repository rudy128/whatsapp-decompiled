package X;

/* renamed from: X.73w  reason: invalid class name and case insensitive filesystem */
public abstract class C1409973w {
    public static final int A00(int i) {
        switch (i) {
            case -1:
                return 27;
            case 0:
            case 14:
            case 23:
                return 1;
            case 1:
                return 29;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 11:
                return 17;
            case 12:
                return 18;
            case 13:
                return 11;
            case 15:
                return 26;
            case 16:
                return 25;
            case 17:
                return 28;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 32;
            case 21:
                return 33;
            case 22:
                return 30;
            case 24:
                return 16;
            case 25:
                return 31;
            case 26:
                return 34;
            case 27:
                return 35;
            case 28:
                return 36;
            case 29:
                return 37;
            case 30:
                return 38;
            case 31:
                return 39;
            case 32:
                return 14;
            case 34:
                return 12;
            default:
                return 2;
        }
    }

    public static final int A01(int i, int i2, boolean z) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return i2 == 1 ? 5 : 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 7;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 25) {
            return 2;
        }
        if (i == 26) {
            return 8;
        }
        if (i == 57) {
            return 2;
        }
        if (i == 58) {
            return 42;
        }
        if (i == 62) {
            return 3;
        }
        if (i == 63) {
            return 8;
        }
        if (i == 81) {
            return 53;
        }
        if (i == 82) {
            return 50;
        }
        switch (i) {
            case 9:
                return 8;
            case 16:
                return 14;
            case 20:
                return 16;
            case 23:
                return 18;
            case 35:
                return 21;
            case 49:
                return 28;
            case 52:
                return 29;
            case 69:
                return 43;
            case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                return 57;
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER /*85*/:
                return 6;
            case 105:
                return 64;
            case 109:
                return 20;
            default:
                switch (i) {
                    case 12:
                        return 12;
                    case 13:
                        return 11;
                    case 14:
                        return 13;
                    default:
                        switch (i) {
                            case 28:
                                return 3;
                            case 29:
                                return 11;
                            case 30:
                                return 6;
                            case 31:
                                break;
                            default:
                                switch (i) {
                                    case 42:
                                        return 2;
                                    case 43:
                                        return 3;
                                    case 44:
                                        return 24;
                                    case 45:
                                        return 25;
                                    case 46:
                                        return 26;
                                    default:
                                        return !z ? 1 : 9;
                                }
                        }
                }
        }
    }

    public static final int A02(int i, boolean z) {
        if (z) {
            return 5;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 8;
        }
        if (i != 3) {
            if (i != 4) {
                return i == 5 ? 3 : 1;
            }
            return 7;
        }
    }

    public static final int A03(C18030ve r2, int i, boolean z) {
        C18070vi.A0d(r2, 0);
        int i2 = 2;
        switch (i) {
            case 0:
                return 1;
            case 1:
                i2 = 12;
                if (C18020vd.A05(C18040vf.A02, r2, 8456)) {
                    if (z) {
                        return 12;
                    }
                    return 30;
                }
                break;
            case 2:
                return 10;
            case 3:
                return 7;
            case 4:
                return 6;
            case 5:
                return 9;
            case 6:
                return 8;
            case 7:
                return 11;
            case 8:
                return 13;
            case 9:
                return 4;
            case 10:
                return 14;
            case 11:
                return 15;
            case 12:
                return 16;
            case 13:
                return 17;
            case 14:
            case 32:
                return 30;
            case 15:
                return 19;
            case 16:
                return 38;
            case 17:
                return 5;
            case 18:
                return 20;
            case 19:
                return 41;
            case 20:
                return 29;
            case 21:
                return 35;
            case 22:
                return 18;
            case 23:
                return 40;
            case 24:
                return 32;
            case 25:
                return 21;
            case 26:
                return 39;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 33:
                return 31;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 36;
            case 37:
                return 37;
        }
        return i2;
    }

    public static final long A04(Long l) {
        if (l == null) {
            return 0;
        }
        long longValue = l.longValue();
        if (longValue >= 0) {
            return C22339B3q.A02(((double) longValue) / 1000.0d) * 1000;
        }
        return 0;
    }

    public static final Long A06(Long l, boolean z) {
        long j;
        double d;
        double d2;
        if (l == null) {
            return null;
        }
        if (!z) {
            return l;
        }
        long longValue = l.longValue();
        if (longValue < 100) {
            d = (double) longValue;
            d2 = 50.0d;
        } else if (longValue < 1000) {
            d = (double) longValue;
            d2 = 100.0d;
        } else if (longValue < 10000) {
            d = (double) longValue;
            d2 = 1000.0d;
        } else if (longValue <= 20000) {
            d = (double) longValue;
            d2 = 5000.0d;
        } else {
            j = C20113A7w.A0L;
            return Long.valueOf(j);
        }
        j = (long) (Math.ceil(d / d2) * d2);
        return Long.valueOf(j);
    }

    public static Long A05(long j, boolean z) {
        return A06(Long.valueOf(j), z);
    }
}
