package X;

import android.os.Parcelable;
import com.whatsapp.push.RegistrationIntentService;
import java.util.Set;

/* renamed from: X.1pz  reason: invalid class name and case insensitive filesystem */
public final class C37701pz {
    public final C26811To A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass1Nb A03;
    public final C25081Mu A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1MC A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass1MZ A08;
    public final AnonymousClass12L A09;
    public final AnonymousClass18K A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public C37701pz(AnonymousClass1MC r2, C26811To r3, AnonymousClass1M9 r4, AnonymousClass11P r5, AnonymousClass118 r6, AnonymousClass1MZ r7, AnonymousClass12L r8, AnonymousClass18K r9, AnonymousClass1Nb r10, C25081Mu r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r11, 4);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r12, 7);
        C18070vi.A0d(r13, 8);
        C18070vi.A0d(r7, 9);
        C18070vi.A0d(r14, 10);
        C18070vi.A0d(r4, 11);
        C18070vi.A0d(r9, 12);
        C18070vi.A0d(r8, 13);
        this.A00 = r3;
        this.A02 = r6;
        this.A01 = r5;
        this.A04 = r11;
        this.A03 = r10;
        this.A06 = r2;
        this.A05 = r12;
        this.A0B = r13;
        this.A08 = r7;
        this.A0C = r14;
        this.A07 = r4;
        this.A0A = r9;
        this.A09 = r8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.2F1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.2Ee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.2F1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.2F1} */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0197, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass1BI r26, X.C37701pz r27, X.C32961i2 r28, long r29, boolean r31) {
        /*
            r7 = 0
            r6 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r17 = 0
            int r0 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            r16 = 0
            r25 = 3
            if (r0 == 0) goto L_0x0014
            r16 = 1
            r25 = 2
        L_0x0014:
            r8 = r27
            X.00H r0 = r8.A05
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            int r3 = r28.ordinal()
            r24 = 0
            if (r3 == r7) goto L_0x0034
            r24 = 2
            if (r3 == r6) goto L_0x0034
            r0 = 3
            if (r3 == r0) goto L_0x0034
            r24 = 4
            r0 = 2
            if (r3 == r0) goto L_0x0034
            r24 = 3
        L_0x0034:
            r21 = 0
            r5 = 0
            r23 = r21
            r9 = r26
            r27 = r31
            r19 = r1
            r20 = r9
            r22 = r21
            r26 = r7
            r19.A03(r20, r21, r22, r23, r24, r25, r26, r27)
            int r0 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x006f
            r1 = -1
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            long r0 = java.lang.System.currentTimeMillis()
            long r29 = r29 - r0
            java.lang.System.currentTimeMillis()
            int[] r14 = X.AnonymousClass2W4.A00
            r13 = 3
            r12 = 0
        L_0x005f:
            r0 = r14[r12]
            long r1 = (long) r0
            r10 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 * r10
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            int r12 = r12 + 1
            if (r12 >= r13) goto L_0x0071
            goto L_0x005f
        L_0x006f:
            r1 = 0
        L_0x0071:
            X.1MC r10 = r8.A06
            r10.A03 = r1
            X.2GO r12 = new X.2GO
            r12.<init>()
            X.12L r0 = r8.A09
            boolean r0 = X.C42761yh.A01(r0, r9)
            if (r0 == 0) goto L_0x008a
            r0 = 0
            switch(r3) {
                case 0: goto L_0x0196;
                case 1: goto L_0x0194;
                case 2: goto L_0x0192;
                default: goto L_0x0086;
            }
        L_0x0086:
            r12.A03 = r0
            r12.A04 = r4
        L_0x008a:
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            r12.A05 = r11
            r15 = 2
            r0 = 2
            if (r16 == 0) goto L_0x0095
            r0 = 1
        L_0x0095:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A00 = r0
            if (r16 == 0) goto L_0x009f
            r12.A01 = r4
        L_0x009f:
            r12.A02 = r4
            boolean r14 = X.C22971Dz.A0e(r9)
            if (r14 == 0) goto L_0x018f
            X.1MZ r4 = r8.A08
            r3 = r9
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            boolean r0 = r4.A0J(r3)
            if (r0 == 0) goto L_0x018f
            r13 = 1
            X.1MW r0 = r4.A08
            X.2tp r0 = r0.A0C(r3)
            int r0 = r0.A06()
            long r3 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r12.A06 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r12.A02 = r0
        L_0x00ca:
            boolean r0 = X.C22971Dz.A0V(r9)
            if (r0 == 0) goto L_0x00d7
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A02 = r0
        L_0x00d7:
            X.18K r3 = r8.A0A
            r3.CC4(r12)
            if (r13 == 0) goto L_0x018d
            X.1MZ r12 = r8.A08
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r4 = X.C42941yz.A00(r9)
            X.C17960vV.A07(r4)
            X.1MW r0 = r12.A08
            X.2tp r0 = r0.A0C(r4)
            java.util.ArrayList r0 = r0.A0K()
            java.util.Iterator r13 = r0.iterator()
        L_0x00f7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r13.next()
            X.2sr r0 = (X.C63312sr) r0
            X.1M9 r4 = r12.A03
            com.whatsapp.jid.UserJid r0 = r0.A04
            X.1E7 r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00f7
            r4 = 1
        L_0x0114:
            if (r14 != 0) goto L_0x0125
            X.1M9 r0 = r8.A07
            X.1E7 r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x0125
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0125
            r7 = 1
        L_0x0125:
            if (r4 != 0) goto L_0x0129
            if (r7 == 0) goto L_0x013b
        L_0x0129:
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x017f
            X.2Ee r1 = new X.2Ee
            r1.<init>()
            java.lang.String r0 = r9.getRawString()
            r1.A00 = r0
        L_0x0138:
            r3.CC7(r1)
        L_0x013b:
            if (r16 == 0) goto L_0x017d
            if (r14 == 0) goto L_0x0177
            X.00H r0 = r8.A0B
            java.lang.Object r4 = r0.get()
            X.6mk r4 = (X.C132416mk) r4
            r3 = r9
            X.1EC r3 = (X.AnonymousClass1EC) r3
            X.C18070vi.A0d(r3, r5)
            X.0ve r2 = r4.A01
            r1 = 5245(0x147d, float:7.35E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0177
            X.2F9 r1 = new X.2F9
            r1.<init>()
            java.lang.String r0 = r3.getRawString()
            r1.A01 = r0
            X.1NI r0 = r4.A00
            com.whatsapp.jid.UserJid r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r0.getRawString()
        L_0x0170:
            r1.A00 = r0
            X.18K r0 = r4.A02
            r0.CC7(r1)
        L_0x0177:
            r10.A00(r9, r6)
            return
        L_0x017b:
            r0 = 0
            goto L_0x0170
        L_0x017d:
            r6 = 2
            goto L_0x0177
        L_0x017f:
            X.2F1 r1 = new X.2F1
            r1.<init>()
            r1.A00 = r11
            java.lang.String r0 = r9.getRawString()
            r1.A01 = r0
            goto L_0x0138
        L_0x018d:
            r4 = 0
            goto L_0x0114
        L_0x018f:
            r13 = 0
            goto L_0x00ca
        L_0x0192:
            r0 = 3
            goto L_0x0197
        L_0x0194:
            r0 = 2
            goto L_0x0197
        L_0x0196:
            r0 = 1
        L_0x0197:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37701pz.A00(X.1BI, X.1pz, X.1i2, long, boolean):void");
    }

    public final void A01(AnonymousClass1BI r10, C32961i2 r11, boolean z) {
        C18070vi.A0d(r10, 0);
        A00(r10, this, r11, 0, z);
        C26811To r2 = this.A00;
        Set A032 = r2.A03(r10, 0, false);
        C18070vi.A0X(A032);
        if (this.A03.A0w(r10)) {
            r2.A0R(A032);
        } else {
            r2.A0Q(A032);
        }
        if (C22971Dz.A0e(r10)) {
            RegistrationIntentService.A02(this.A02.A00, this.A04);
        }
    }

    public final void A02(AnonymousClass1EC r9, AnonymousClass201 r10, int i) {
        int i2;
        C18070vi.A0d(r9, 0);
        C58012k0 r5 = (C58012k0) this.A0C.get();
        if (C18020vd.A05(C18040vf.A02, r5.A01, 12014)) {
            C47152Hh r4 = new C47152Hh();
            r4.A05 = r5.A03.A05(r9.getRawString());
            if (r10.ordinal() != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            r4.A03 = i2;
            r4.A02 = Integer.valueOf(i);
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A002 = C42941yz.A00(r9);
            if (A002 == null) {
                r4.A00 = false;
            } else {
                r4.A00 = true;
                r4.A01 = Integer.valueOf(r5.A04.A00(A002));
                int A0A2 = r5.A00.A08.A0A(A002);
                Integer valueOf = Integer.valueOf(A0A2);
                Long l = null;
                if (!(A0A2 == -1 || valueOf == null)) {
                    l = Long.valueOf((long) A0A2);
                }
                r4.A04 = l;
            }
            r5.A02.CC7(r4);
        }
        C26811To r2 = this.A00;
        Set A042 = r2.A04(r9, r10);
        C18070vi.A0X(A042);
        if (this.A03.A10(r9, r10)) {
            r2.A0R(A042);
        } else {
            r2.A0Q(A042);
        }
    }
}
