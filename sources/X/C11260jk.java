package X;

/* renamed from: X.0jk  reason: invalid class name and case insensitive filesystem */
public final class C11260jk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass06z $instances;
    public final /* synthetic */ int $token;
    public final /* synthetic */ C05660Vf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11260jk(AnonymousClass06z r2, C05660Vf r3, int i) {
        super(1);
        this.this$0 = r3;
        this.$token = i;
        this.$instances = r2;
    }

    public final void A00(C16640sl r18) {
        C05660Vf r2 = this.this$0;
        if (r2.A00 == this.$token && C18070vi.A18(this.$instances, r2.A02)) {
            C16640sl r9 = r18;
            if (r9 instanceof AnonymousClass0VT) {
                AnonymousClass06z r8 = this.$instances;
                int i = this.$token;
                C05660Vf r5 = this.this$0;
                long[] jArr = r8.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A0F = AnonymousClass000.A0F(i2, length);
                            for (int i3 = 0; i3 < A0F; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i2 << 3) + i3;
                                    Object obj = r8.A04[i4];
                                    if (r8.A02[i4] != i) {
                                        AnonymousClass0VT r13 = (AnonymousClass0VT) r9;
                                        AnonymousClass0JH r14 = r13.A08;
                                        r14.A02(obj, r5);
                                        if ((obj instanceof C17320uT) && obj != null) {
                                            if (!r14.A00.A03(obj)) {
                                                r13.A07.A00(obj);
                                            }
                                            AnonymousClass070 r0 = r5.A03;
                                            if (r0 != null) {
                                                r0.A07(obj);
                                                if (r0.A01 == 0) {
                                                    r5.A03 = null;
                                                }
                                            }
                                        }
                                        r8.A05(i4);
                                    }
                                }
                                j >>= 8;
                            }
                            if (A0F != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                if (this.$instances.A01 == 0) {
                    this.this$0.A02 = null;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C16640sl) obj);
        return C27621Wu.A00;
    }
}
