package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7PA  reason: invalid class name */
public final class AnonymousClass7PA implements C22486B9s {
    public final AnonymousClass11P A00;
    public final Context A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final C25161Nd A04;
    public final C32951i1 A05;
    public final AnonymousClass118 A06;
    public final C19830z4 A07;
    public final C18000vb A08;
    public final AnonymousClass1CJ A09;
    public final AnonymousClass122 A0A;
    public final AnonymousClass12L A0B;
    public final AnonymousClass1Nb A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    public AnonymousClass7PA(Context context, AnonymousClass1M9 r18, C24921Me r19, C25161Nd r20, C32951i1 r21, AnonymousClass11P r22, AnonymousClass118 r23, C19830z4 r24, C18000vb r25, AnonymousClass1CJ r26, AnonymousClass122 r27, AnonymousClass12L r28, AnonymousClass1Nb r29, AnonymousClass10I r30, AnonymousClass00H r31, AnonymousClass00H r32) {
        AnonymousClass11P r11 = r22;
        C18070vi.A0d(r11, 1);
        AnonymousClass10I r3 = r30;
        AnonymousClass1CJ r7 = r26;
        AnonymousClass118 r10 = r23;
        C72473Md.A1M(r10, r3, r7, 3);
        AnonymousClass00H r2 = r31;
        AnonymousClass122 r6 = r27;
        AnonymousClass12L r5 = r28;
        C18000vb r8 = r25;
        AnonymousClass1M9 r15 = r18;
        C18070vi.A0x(r5, r15, r8, r2, r6);
        AnonymousClass00H r1 = r32;
        AnonymousClass1Nb r4 = r29;
        C19830z4 r9 = r24;
        C32951i1 r12 = r21;
        C24921Me r14 = r19;
        C18070vi.A0y(r1, r12, r4, r14, r9);
        C25161Nd r13 = r20;
        C18070vi.A0d(r13, 16);
        this.A00 = r11;
        this.A01 = context;
        this.A06 = r10;
        this.A0D = r3;
        this.A09 = r7;
        this.A0B = r5;
        this.A02 = r15;
        this.A08 = r8;
        this.A0E = r2;
        this.A0A = r6;
        this.A0F = r1;
        this.A05 = r12;
        this.A0C = r4;
        this.A03 = r14;
        this.A07 = r9;
        this.A04 = r13;
    }

    public boolean BCL(C186309dz r21, C22484B9q b9q, AnonymousClass5YR r23) {
        long j;
        C136546tz r2;
        C22484B9q b9q2 = b9q;
        C186309dz r0 = r21;
        C18070vi.A0d(r0, 1);
        Map map = r0.A01;
        String A0s = C17880vN.A0s("first", map);
        long j2 = 0;
        if (A0s != null) {
            j = Long.parseLong(A0s);
        } else {
            j = 0;
        }
        String A0s2 = C17880vN.A0s("second", map);
        if (A0s2 != null) {
            j2 = Long.parseLong(A0s2);
        }
        long min = Math.min(TimeUnit.MILLISECONDS.toMinutes(AnonymousClass11P.A01(this.A00) - C17890vO.A05(C17890vO.A0B(this.A07), "reply_reminder_notification_last_checked_timestamp")), j2);
        AnonymousClass1D6 A002 = A00(j, min, false);
        AnonymousClass1D6 A003 = A00(j, min, true);
        int size = ((List) A002.first).size();
        int size2 = ((List) A003.first).size();
        if ((b9q2 instanceof AnonymousClass7P5) && (r2 = ((AnonymousClass7P5) b9q2).A00) != null) {
            r2.A05 = (List) A002.first;
            r2.A06 = (List) A003.first;
            r2.A07 = AnonymousClass1D7.A09((Map) A002.second, (Map) A003.second);
            r2.A02 = Long.valueOf(j);
            r2.A01 = Long.valueOf(min);
        }
        if (size > 0 || size2 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r1.A04 != 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ed, code lost:
        if (r0.expiration == 0) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass1D6 A00(long r14, long r16, boolean r18) {
        /*
            r13 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            X.1Nd r0 = r13.A04
            java.util.ArrayList r0 = r0.A06()
            java.util.Iterator r12 = r0.iterator()
        L_0x0012:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f8
            X.1BI r2 = X.C17880vN.A0Q(r12)
            X.1M9 r0 = r13.A02
            X.1E7 r1 = r0.A0H(r2)
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            boolean r0 = r1.A0F()
            if (r18 == 0) goto L_0x002d
            if (r0 != 0) goto L_0x0051
            goto L_0x0012
        L_0x002d:
            X.2lf r0 = r1.A0H
            if (r0 == 0) goto L_0x0012
            X.1BI r0 = r1.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 != 0) goto L_0x0012
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x0012
            X.00H r0 = r13.A0E
            X.1pj r5 = X.AnonymousClass3MW.A0V(r0)
            X.C18070vi.A0z(r2, r8)
            r0 = r2
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r5.A0P(r0)
            if (r0 != 0) goto L_0x0012
        L_0x0051:
            boolean r0 = r1.A0F()
            X.1Nb r5 = r13.A0C
            if (r0 == 0) goto L_0x00f2
            X.1yM r0 = r5.A0V()
        L_0x005d:
            boolean r7 = r0.A0B()
            boolean r0 = r1.A0F()
            r6 = 1
            if (r0 == 0) goto L_0x00d7
            int r0 = r1.A04
            if (r0 == 0) goto L_0x00ef
        L_0x006c:
            if (r7 == 0) goto L_0x0012
            if (r6 != 0) goto L_0x0012
            X.1yM r0 = r5.A0a(r2)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0012
            X.1yM r0 = r5.A0a(r2)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0012
            X.1CJ r7 = r13.A09
            boolean r0 = r7.A0Q(r2)
            if (r0 != 0) goto L_0x0012
            X.12L r0 = r13.A0B
            boolean r0 = X.C42761yh.A01(r0, r2)
            if (r0 != 0) goto L_0x0012
            boolean r0 = r7.A0S(r2)
            if (r0 != 0) goto L_0x0012
            int r0 = r7.A03(r2)
            if (r0 == 0) goto L_0x0012
            long r5 = r7.A09(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L_0x0012
            X.11P r0 = r13.A00
            long r10 = X.AnonymousClass11P.A01(r0)
            long r10 = r10 - r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            long r8 = r5.toMillis(r14)
            r0 = 1
            long r8 = r8 + r0
            r0 = r16
            long r5 = r5.toMillis(r0)
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            X.C18070vi.A0b(r2)
            r4.add(r2)
            int r0 = r7.A03(r2)
            X.C17880vN.A1P(r2, r3, r0)
            goto L_0x0012
        L_0x00d7:
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x00ef
            X.1CJ r1 = r13.A09
            X.C18070vi.A0z(r2, r8)
            r0 = r2
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.1cl r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x006c
            int r0 = r0.expiration
            if (r0 != 0) goto L_0x006c
        L_0x00ef:
            r6 = 0
            goto L_0x006c
        L_0x00f2:
            X.1yM r0 = r5.A0W()
            goto L_0x005d
        L_0x00f8:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7PA.A00(long, long, boolean):X.1D6");
    }
}
