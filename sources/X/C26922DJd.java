package X;

/* renamed from: X.DJd  reason: case insensitive filesystem */
public final class C26922DJd implements EAC {
    public final CB7 A00;
    public final EDY A01;
    public final CB8 A02;

    public C26922DJd(CB7 cb7, EDY edy, CB8 cb8) {
        this.A02 = cb8;
        this.A00 = cb7;
        this.A01 = edy;
    }

    public final void CTS(Object obj, Object obj2) {
        C26297CxA.A0P(obj, obj2);
    }

    public static int A00(CQ8 cq8, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return C26163Ctc.A02(cq8, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return C26163Ctc.A01(cq8, bArr, i2) + cq8.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = C26163Ctc.A01(cq8, bArr, i2);
                    i6 = cq8.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A00(cq8, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw new C24203BxF("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw new C24203BxF("Protocol message contained an invalid tag (zero).");
    }

    public final boolean BKS(Object obj, Object obj2) {
        return BE8.A1S(((C23293Beh) obj).zzjp.equals(((C23293Beh) obj2).zzjp) ? 1 : 0);
    }

    public final int Bcu(Object obj) {
        return ((C23293Beh) obj).zzjp.hashCode();
    }

    public final Object BkH() {
        return ((C23294Bei) ((C23293Beh) this.A01).A04(5)).A00();
    }

    public final void CT9(E5P e5p, Object obj) {
        throw AnonymousClass000.A0s("zzjv");
    }

    public final void CTA(CQ8 cq8, Object obj, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i;
        C25839Cmt A05 = C26919DJa.A05(obj);
        while (true) {
            i3 = i2;
            if (i4 >= i3) {
                break;
            }
            CQ8 cq82 = cq8;
            byte[] bArr2 = bArr;
            i4 = C26163Ctc.A01(cq8, bArr2, i4);
            int i5 = cq8.A00;
            if (i5 == 11) {
                int i6 = 0;
                Object obj2 = null;
                while (i4 < i3) {
                    i4 = C26163Ctc.A01(cq8, bArr2, i4);
                    int i7 = cq8.A00;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            i4 = C26163Ctc.A03(cq8, bArr2, i4);
                            obj2 = cq8.A02;
                        }
                    } else if (i9 == 0) {
                        i4 = C26163Ctc.A01(cq8, bArr2, i4);
                        i6 = cq8.A00;
                    }
                    if (i7 == 12) {
                        break;
                    }
                    i4 = A00(cq8, bArr2, i7, i4, i3);
                }
                if (obj2 != null) {
                    A05.A01((i6 << 3) | 2, obj2);
                }
            } else if ((i5 & 7) == 2) {
                i4 = C26163Ctc.A00(cq82, A05, bArr2, i5, i4, i3);
            } else {
                i4 = A00(cq8, bArr2, i5, i4, i3);
            }
        }
        if (i4 != i3) {
            throw new C24203BxF("Failed to parse the message.");
        }
    }

    public final void CTR(Object obj) {
        ((C23293Beh) obj).zzjp.A02 = false;
        throw AnonymousClass000.A0s("zzjv");
    }

    public final int CTi(Object obj) {
        C25839Cmt cmt = ((C23293Beh) obj).zzjp;
        int i = cmt.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < cmt.A00; i2++) {
                int i3 = cmt.A03[i2] >>> 3;
                boolean z = C23301Bep.A01;
                i += 2 + 1 + BEB.A02(i3) + C26164Ctd.A03(((DSP) cmt.A04[i2]).A02(), BEB.A02(24));
            }
            cmt.A01 = i;
        }
        return i;
    }

    public final boolean CTk(Object obj) {
        throw AnonymousClass000.A0s("zzjv");
    }
}
