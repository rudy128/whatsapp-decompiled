package X;

import android.content.Context;

/* renamed from: X.71Q  reason: invalid class name */
public final class AnonymousClass71Q {
    public int A00 = 1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass1G4 A07;
    public final AnonymousClass1G4 A08;
    public final AnonymousClass1G1 A09;
    public final AnonymousClass1G1 A0A;
    public final AnonymousClass1G1 A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass1G4 A0D;

    public AnonymousClass71Q(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A0C = r2;
        AnonymousClass1IX of = AnonymousClass1IX.of();
        C18070vi.A0X(of);
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(of);
        this.A0D = A18;
        this.A09 = A18;
        AnonymousClass1G7 A182 = AnonymousClass3MW.A18(AnonymousClass3MY.A0f());
        this.A08 = A182;
        this.A0B = A182;
        AnonymousClass1G7 A002 = C34071js.A00((Object) null);
        this.A07 = A002;
        this.A0A = A002;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.AnonymousClass71Q r2) {
        /*
            int r0 = r2.A03
            if (r0 == 0) goto L_0x000e
            r1 = 1
            if (r0 != r1) goto L_0x000d
            int r0 = r2.A04
            r1 = 2
            if (r0 != r1) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            return r1
        L_0x000e:
            int r0 = r2.A04
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71Q.A00(X.71Q):int");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.6pM, X.69s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.6pM, X.69t, java.lang.Object] */
    public static final void A01(AnonymousClass71Q r17) {
        AnonymousClass1IX build;
        Context context;
        int i;
        AnonymousClass71Q r2 = r17;
        C126136cF r13 = new C126136cF(r2);
        AnonymousClass1G4 r3 = r2.A0D;
        int i2 = r2.A04;
        if (i2 != 0) {
            if (i2 == 1) {
                C127506eT r11 = (C127506eT) r2.A0C.get();
                int i3 = r2.A01;
                boolean z = r2.A05;
                AnonymousClass2AI r9 = new AnonymousClass2AI();
                if (z) {
                    Integer[] numArr = r11.A01;
                    int i4 = 0;
                    while (true) {
                        int intValue = numArr[i4].intValue();
                        context = r11.A00;
                        if (C19740yt.A00(context, intValue) != i3) {
                            i4++;
                            if (i4 >= 24) {
                                i = i3;
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    String A0m = AnonymousClass3MY.A0m(context.getResources(), 2131890282);
                    ? r0 = new C133706pM(r13, 3, false, false);
                    r0.A00 = i;
                    r0.A01 = A0m;
                    r9.add((Object) r0);
                }
                Integer[] numArr2 = r11.A01;
                int i5 = 0;
                do {
                    int intValue2 = numArr2[i5].intValue();
                    Context context2 = r11.A00;
                    int A002 = C19740yt.A00(context2, intValue2);
                    Integer A003 = C1405972c.A00(A002);
                    C18070vi.A0X(A003);
                    String A0m2 = AnonymousClass3MY.A0m(context2.getResources(), A003.intValue());
                    int A004 = C19740yt.A00(context2, intValue2);
                    ? r02 = new C133706pM(r13, 1, AnonymousClass000.A1T(A002, i3), true);
                    r02.A00 = A004;
                    r02.A01 = A0m2;
                    r9.add((Object) r02);
                    i5++;
                } while (i5 < 24);
                build = r9.build();
            } else if (i2 == 2) {
                r2.A0C.get();
                int i6 = r2.A00;
                boolean z2 = r2.A06;
                AnonymousClass2AI r1 = new AnonymousClass2AI();
                r1.add((Object) new C1197869v(r13, 1, 2131232811, 2131886148, AnonymousClass000.A1T(1, i6)));
                r1.add((Object) new C1197869v(r13, 2, 2131232808, 2131886142, AnonymousClass000.A1T(2, i6)));
                r1.add((Object) new C1197869v(r13, 3, 2131232810, 2131886147, AnonymousClass000.A1T(3, i6)));
                if (z2) {
                    r1.add((Object) new C1197869v(r13, 4, 2131232807, 2131886126, AnonymousClass000.A1T(4, i6)));
                }
                build = r1.build();
            }
            C18070vi.A0X(build);
            r3.setValue(build);
        }
        r2.A0C.get();
        int i7 = r2.A02;
        AnonymousClass2AI r7 = new AnonymousClass2AI();
        int[] iArr = {0, 3, 2, 4, 5, 6, 7, 1};
        int i8 = 0;
        do {
            int i9 = iArr[i8];
            r7.add((Object) new C1197769u(r13, i9, AnonymousClass000.A1T(i9, i7)));
            i8++;
        } while (i8 < 8);
        build = r7.build();
        C18070vi.A0X(build);
        r3.setValue(build);
    }
}
