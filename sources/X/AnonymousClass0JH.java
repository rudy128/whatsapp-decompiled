package X;

/* renamed from: X.0JH  reason: invalid class name */
public final class AnonymousClass0JH {
    public final AnonymousClass070 A00;

    public final void A00(Object obj) {
        AnonymousClass070 r7 = this.A00;
        long[] jArr = r7.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                long j2 = -1;
                if ((((j ^ -1) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int A0F = AnonymousClass000.A0F(i, length);
                    int i2 = 0;
                    while (i2 < A0F) {
                        if ((j & 255) < 128) {
                            int i3 = (i << 3) + i2;
                            Object obj2 = r7.A04[i3];
                            if (obj2 instanceof AnonymousClass071) {
                                C18070vi.A0z(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                AnonymousClass071 r10 = (AnonymousClass071) obj2;
                                Object[] objArr = r10.A03;
                                long[] jArr2 = r10.A02;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j3 = jArr2[i4];
                                        if ((j3 & ((j3 ^ j2) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                            int A0F2 = AnonymousClass000.A0F(i4, length2);
                                            for (int i5 = 0; i5 < A0F2; i5++) {
                                                if ((j3 & 255) < 128) {
                                                    int i6 = (i4 << 3) + i5;
                                                    if (objArr[i6] == obj) {
                                                        r10.A07(i6);
                                                    }
                                                }
                                                j3 >>= 8;
                                            }
                                            if (A0F2 != 8) {
                                                break;
                                            }
                                        }
                                        if (i4 == length2) {
                                            break;
                                        }
                                        i4++;
                                        j2 = -1;
                                    }
                                }
                                if (r10.A01 != 0) {
                                }
                            } else {
                                C18070vi.A0z(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (obj2 != obj) {
                                }
                            }
                            r7.A06(i3);
                        }
                        j >>= 8;
                        i2++;
                        j2 = -1;
                    }
                    if (A0F != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0NQ, X.071] */
    public final void A01(Object obj, Object obj2) {
        AnonymousClass070 r4 = this.A00;
        int A04 = r4.A04(obj);
        if (A04 < 0) {
            A04 ^= -1;
            r4.A03[A04] = obj;
        } else {
            Object obj3 = r4.A04[A04];
            if (obj3 != null) {
                if (obj3 instanceof AnonymousClass071) {
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                    ((AnonymousClass071) obj3).A08(obj2);
                } else if (obj3 != obj2) {
                    ? r1 = new AnonymousClass0NQ();
                    AnonymousClass070 r0 = AnonymousClass0GO.A01;
                    AnonymousClass071.A02(r1, 6);
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                    r1.A08(obj3);
                    r1.A08(obj2);
                    obj2 = r1;
                }
                obj2 = obj3;
            }
        }
        r4.A04[A04] = obj2;
    }

    public final boolean A02(Object obj, Object obj2) {
        AnonymousClass070 r3 = this.A00;
        Object A02 = r3.A02(obj);
        boolean z = false;
        if (A02 != null) {
            if (A02 instanceof AnonymousClass071) {
                AnonymousClass071 r2 = (AnonymousClass071) A02;
                z = r2.A09(obj2);
                if (z && r2.A01 == 0) {
                    r3.A07(obj);
                }
            } else if (A02.equals(obj2)) {
                r3.A07(obj);
                return true;
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0Ka, X.070] */
    public AnonymousClass0JH() {
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        ? r1 = new AnonymousClass0Ka();
        AnonymousClass070.A01(r1, 6);
        this.A00 = r1;
    }
}
