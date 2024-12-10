package X;

/* renamed from: X.2u0  reason: invalid class name and case insensitive filesystem */
public abstract class C63972u0 {
    public static C26551So A00(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 9) {
                        return C26551So.A0C;
                    }
                    if (i == 13) {
                        return C26551So.A0D;
                    }
                    if (i != 28) {
                        if (i != 57) {
                            if (i != 105) {
                                if (i != 25) {
                                    if (i == 26) {
                                        return C26551So.A0m;
                                    }
                                    if (i != 62) {
                                        if (i == 63) {
                                            return C26551So.A0G;
                                        }
                                        throw AnonymousClass001.A13("media-file-type: The media type is not supported: type=", AnonymousClass000.A10(), i);
                                    }
                                }
                            } else if (z) {
                                return C26551So.A0b;
                            } else {
                                return C26551So.A0l;
                            }
                        }
                    }
                }
                if (z) {
                    return C26551So.A0c;
                }
                return C26551So.A0r;
            }
            if (z) {
                return C26551So.A0Z;
            }
            return C26551So.A0F;
        } else if (z) {
            return C26551So.A0a;
        } else {
            return C26551So.A0L;
        }
    }

    public static C26551So A01(AnonymousClass1BI r3, int i, int i2) {
        if (i2 == 8) {
            if (i == 0 || i == 1) {
                return C26551So.A0w;
            }
            if (i == 3) {
                return C26551So.A0x;
            }
            if (i == 13) {
                return C26551So.A0v;
            }
            throw AnonymousClass001.A13("media-file-type: The media type is not supported for origin=8: type=", AnonymousClass000.A10(), i);
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 25) {
                        return C26551So.A0o;
                    }
                    if (i == 26) {
                        return C26551So.A0m;
                    }
                    if (i == 28) {
                        return C26551So.A0p;
                    }
                    if (i == 29) {
                        return C26551So.A0n;
                    }
                    if (i == 62) {
                        return C26551So.A0J;
                    }
                    if (i == 63) {
                        return C26551So.A0G;
                    }
                    if (i == 81) {
                        return C26551So.A0i;
                    }
                    if (i == 82) {
                        return C26551So.A0s;
                    }
                    switch (i) {
                        case 9:
                            return C26551So.A0B;
                        case 13:
                            if (C22971Dz.A0V(r3)) {
                                return C26551So.A0U;
                            }
                            return C26551So.A04;
                        case 20:
                            if (C22971Dz.A0V(r3)) {
                                return C26551So.A0X;
                            }
                            return C26551So.A0j;
                        case 23:
                            return C26551So.A0h;
                        case 35:
                            return C26551So.A0O;
                        case 37:
                            return C26551So.A09;
                        case 57:
                            return C26551So.A0H;
                        case 65:
                            return C26551So.A0f;
                        case 97:
                            return C26551So.A0I;
                        case 105:
                            if (C22971Dz.A0V(r3)) {
                                return C26551So.A0Y;
                            }
                            return C26551So.A0k;
                        case 109:
                            return C26551So.A0N;
                        default:
                            switch (i) {
                                case 42:
                                    return C26551So.A0t;
                                case 43:
                                    return C26551So.A0u;
                                case 44:
                                    return C26551So.A0e;
                                default:
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("media-file-type: The media type is not supported: type=");
                                    A10.append(i);
                                    throw AnonymousClass001.A13(", mediaOrigin=", A10, i2);
                            }
                    }
                } else if (C22971Dz.A0V(r3)) {
                    return C26551So.A0d;
                } else {
                    return C26551So.A0q;
                }
            } else if (C22971Dz.A0V(r3)) {
                if (i2 == 1) {
                    return C26551So.A0W;
                }
                return C26551So.A0S;
            } else if (i2 == 1) {
                return C26551So.A0M;
            } else {
                return C26551So.A05;
            }
        } else if (i2 == 6) {
            return C26551So.A0K;
        } else {
            if (C22971Dz.A0V(r3)) {
                return C26551So.A0V;
            }
            return C26551So.A0E;
        }
    }

    public static C26551So A02(AnonymousClass206 r3) {
        return A01(r3.A0v.A00, r3.A0u, r3.A09);
    }

    public static boolean A03(C26551So r2) {
        if (r2 == C26551So.A05 || r2 == C26551So.A0M || r2 == C26551So.A0S || r2 == C26551So.A0W || r2 == C26551So.A0s) {
            return true;
        }
        return false;
    }

    public static boolean A04(C26551So r2) {
        if (r2 == C26551So.A0E || r2 == C26551So.A0t || r2 == C26551So.A0o || r2 == C26551So.A0h || r2 == C26551So.A09 || r2 == C26551So.A0K || r2 == C26551So.A0f || r2 == C26551So.A0Q || r2 == C26551So.A0A || r2 == C26551So.A0V || r2 == C26551So.A0H || r2 == C26551So.A0I) {
            return true;
        }
        return false;
    }

    public static boolean A05(C26551So r2) {
        if (r2 == C26551So.A0E || r2 == C26551So.A0t || r2 == C26551So.A0K || r2 == C26551So.A0h || r2 == C26551So.A09 || r2 == C26551So.A0Q || r2 == C26551So.A0A || r2 == C26551So.A0V || r2 == C26551So.A0H || r2 == C26551So.A0I || r2 == C26551So.A08 || r2 == C26551So.A0P) {
            return true;
        }
        return false;
    }

    public static boolean A06(C26551So r2) {
        if (r2 == C26551So.A0V || r2 == C26551So.A0d || r2 == C26551So.A0W || r2 == C26551So.A0S || r2 == C26551So.A0T || r2 == C26551So.A0U || r2 == C26551So.A0X || r2 == C26551So.A0Y || r2 == C26551So.A0Z || r2 == C26551So.A0c || r2 == C26551So.A0a || r2 == C26551So.A0b) {
            return true;
        }
        return false;
    }

    public static boolean A07(C26551So r2) {
        if (r2 == C26551So.A0j || r2 == C26551So.A0X) {
            return true;
        }
        return false;
    }

    public static boolean A08(C26551So r2) {
        if (r2 == C26551So.A0q || r2 == C26551So.A0u || r2 == C26551So.A0R || r2 == C26551So.A0i || r2 == C26551So.A0d || r2 == C26551So.A0J) {
            return true;
        }
        return false;
    }

    public static boolean A09(C26551So r2) {
        if (A08(r2) || r2 == C26551So.A04 || r2 == C26551So.A0U) {
            return true;
        }
        return false;
    }

    public static boolean A0A(C26551So r2) {
        if (A09(r2) || r2 == C26551So.A0p || r2 == C26551So.A0n) {
            return true;
        }
        return false;
    }
}
