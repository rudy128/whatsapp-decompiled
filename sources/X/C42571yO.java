package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1yO  reason: invalid class name and case insensitive filesystem */
public final class C42571yO {
    public static final C18100vl A0I = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C42581yP.A00);
    public final AnonymousClass11S A00;
    public final AnonymousClass1VE A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass1TD A03;
    public final AnonymousClass121 A04;
    public final AnonymousClass1MZ A05;
    public final AnonymousClass1NG A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final C18100vl A0C = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C42591yQ(this));
    public final C18000vb A0D;
    public final AnonymousClass1CJ A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;

    public C42571yO(AnonymousClass11S r19, AnonymousClass1VE r20, AnonymousClass118 r21, C18000vb r22, AnonymousClass1TD r23, AnonymousClass1CJ r24, AnonymousClass121 r25, AnonymousClass1MZ r26, AnonymousClass1NG r27, C18030ve r28, AnonymousClass10I r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35) {
        C18030ve r8 = r28;
        C18070vi.A0d(r8, 1);
        AnonymousClass1CJ r14 = r24;
        C18070vi.A0d(r14, 2);
        AnonymousClass00H r6 = r30;
        C18070vi.A0d(r6, 3);
        AnonymousClass00H r5 = r31;
        C18070vi.A0d(r5, 4);
        AnonymousClass00H r4 = r32;
        C18070vi.A0d(r4, 5);
        AnonymousClass00H r0 = r33;
        C18070vi.A0d(r0, 6);
        AnonymousClass1TD r15 = r23;
        C18070vi.A0d(r15, 7);
        AnonymousClass121 r11 = r25;
        C18070vi.A0d(r11, 8);
        AnonymousClass1MZ r10 = r26;
        C18070vi.A0d(r10, 9);
        AnonymousClass11S r17 = r19;
        C18070vi.A0d(r17, 10);
        AnonymousClass1NG r9 = r27;
        C18070vi.A0d(r9, 11);
        AnonymousClass1VE r16 = r20;
        C18070vi.A0d(r16, 12);
        AnonymousClass118 r13 = r21;
        C18070vi.A0d(r13, 13);
        AnonymousClass10I r7 = r29;
        C18070vi.A0d(r7, 14);
        C18000vb r12 = r22;
        C18070vi.A0d(r12, 15);
        AnonymousClass00H r3 = r34;
        C18070vi.A0d(r3, 16);
        AnonymousClass00H r2 = r35;
        C18070vi.A0d(r2, 17);
        this.A07 = r8;
        this.A0E = r14;
        this.A0G = r6;
        this.A0B = r5;
        this.A09 = r4;
        this.A0A = r0;
        this.A03 = r15;
        this.A04 = r11;
        this.A05 = r10;
        this.A00 = r17;
        this.A06 = r9;
        this.A01 = r16;
        this.A02 = r13;
        this.A0F = r7;
        this.A0D = r12;
        this.A08 = r3;
        this.A0H = r2;
    }

    public static final int A00(C178119Bw r2) {
        C18070vi.A0d(r2, 0);
        if (r2.A0W()) {
            return 2131231195;
        }
        boolean z = r2.A04.A03;
        boolean z2 = r2.A0J;
        if (z) {
            if (z2) {
                return 2131231190;
            }
            return 2131231194;
        } else if (z2) {
            return 2131231188;
        } else {
            return 2131231192;
        }
    }

    public static final void A03(C42571yO r7, AnonymousClass1BI r8, C178119Bw r9, Boolean bool, Integer num) {
        r7.A0F.CGN(new C21468AkZ(bool, r7, r8, r9, num, 12));
    }

    public final int A0B(AnonymousClass22M r4) {
        C178119Bw r1;
        C18070vi.A0d(r4, 0);
        if (!A08(r4, this) || (r1 = (C178119Bw) r4.A00.A02) == null) {
            return 0;
        }
        this.A08.get();
        if (C62362rH.A00(r4)) {
            return 2131233134;
        }
        if (r1.A0J) {
            return 2131233132;
        }
        return 2131233133;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
        if (A0A(r4, r2) != false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0C(X.AnonymousClass22M r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.25F r1 = r5.A00
            X.229 r2 = r1.A02
            X.9Bw r2 = (X.C178119Bw) r2
            if (r2 != 0) goto L_0x0010
            r1 = 2131887767(0x7f120697, float:1.941015E38)
        L_0x000f:
            return r1
        L_0x0010:
            boolean r0 = r4.A0H(r5)
            if (r0 == 0) goto L_0x0032
            boolean r1 = A08(r5, r4)
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x0029
            r1 = 2131887776(0x7f1206a0, float:1.9410169E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887778(0x7f1206a2, float:1.9410173E38)
            return r1
        L_0x0029:
            r1 = 2131887777(0x7f1206a1, float:1.941017E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887779(0x7f1206a3, float:1.9410175E38)
            return r1
        L_0x0032:
            boolean r0 = A06(r5, r4)
            if (r0 == 0) goto L_0x003c
            r1 = 2131887762(0x7f120692, float:1.941014E38)
            return r1
        L_0x003c:
            boolean r0 = A05(r5, r4)
            if (r0 == 0) goto L_0x005b
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00e0
            boolean r0 = A07(r5, r4)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = A0A(r4, r2)
            r1 = 2131887761(0x7f120691, float:1.9410138E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887770(0x7f12069a, float:1.9410156E38)
            return r1
        L_0x005b:
            X.00H r3 = r4.A08
            r3.get()
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x00a7
            com.whatsapp.jid.GroupJid r0 = r0.A0C
            if (r0 == 0) goto L_0x00a7
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x008f
            boolean r0 = A07(r5, r4)
            if (r0 == 0) goto L_0x008f
            boolean r1 = A0A(r4, r2)
            r3.get()
            boolean r0 = X.C62362rH.A00(r5)
            if (r1 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x00bf
            r1 = 2131887773(0x7f12069d, float:1.9410163E38)
            return r1
        L_0x0089:
            if (r0 == 0) goto L_0x00ca
            r1 = 2131887763(0x7f120693, float:1.9410142E38)
            return r1
        L_0x008f:
            r3.get()
            boolean r0 = X.C62362rH.A00(r5)
            if (r0 == 0) goto L_0x009c
            r1 = 2131887766(0x7f120696, float:1.9410148E38)
            return r1
        L_0x009c:
            boolean r0 = r2.A0J
            r1 = 2131887765(0x7f120695, float:1.9410146E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887764(0x7f120694, float:1.9410144E38)
            return r1
        L_0x00a7:
            boolean r0 = A09(r5, r4)
            if (r0 != 0) goto L_0x00d5
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00d5
            boolean r0 = A07(r5, r4)
            if (r0 == 0) goto L_0x00d5
            boolean r0 = A0A(r4, r2)
            if (r0 == 0) goto L_0x00ca
        L_0x00bf:
            boolean r0 = r2.A0J
            r1 = 2131887772(0x7f12069c, float:1.941016E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887771(0x7f12069b, float:1.9410158E38)
            return r1
        L_0x00ca:
            boolean r0 = r2.A0J
            r1 = 2131887769(0x7f120699, float:1.9410154E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887768(0x7f120698, float:1.9410152E38)
            return r1
        L_0x00d5:
            boolean r0 = r2.A0J
            r1 = 2131887775(0x7f12069f, float:1.9410167E38)
            if (r0 == 0) goto L_0x000f
            r1 = 2131887774(0x7f12069e, float:1.9410165E38)
            return r1
        L_0x00e0:
            r1 = 2131887760(0x7f120690, float:1.9410136E38)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42571yO.A0C(X.22M):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0D(com.whatsapp.jid.UserJid r3, X.C178119Bw r4) {
        /*
            r2 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r0 = r4.A0P()
            if (r0 == 0) goto L_0x002c
            boolean r0 = X.C22971Dz.A0X(r3)
            if (r0 == 0) goto L_0x0025
            X.00H r0 = r2.A0H
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C18070vi.A0z(r3, r0)
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            X.1E1 r3 = r1.A0A(r3)
        L_0x0023:
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
        L_0x0025:
            if (r3 == 0) goto L_0x0046
            int r0 = r4.A07(r3)
            return r0
        L_0x002c:
            boolean r0 = X.C22971Dz.A0T(r3)
            if (r0 == 0) goto L_0x0025
            X.00H r0 = r2.A0H
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r3, r0)
            X.1E1 r3 = (X.AnonymousClass1E1) r3
            com.whatsapp.jid.PhoneUserJid r3 = r1.A0D(r3)
            goto L_0x0023
        L_0x0046:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42571yO.A0D(com.whatsapp.jid.UserJid, X.9Bw):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0108, code lost:
        if (r0 == false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A0E(android.content.Context r6, X.AnonymousClass22M r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r5.A0H(r7)
            if (r0 == 0) goto L_0x001f
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131169356(0x7f07104c, float:1.795304E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            android.graphics.drawable.BitmapDrawable r4 = X.AnonymousClass4G1.A00(r6, r0)
            return r4
        L_0x001f:
            X.25F r4 = r7.A00
            X.229 r2 = r4.A02
            X.9Bw r2 = (X.C178119Bw) r2
            if (r2 == 0) goto L_0x010a
            X.00H r0 = r5.A08
            r0.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x00f3
            r1 = 2131231195(0x7f0801db, float:1.8078464E38)
        L_0x0035:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.229 r0 = r4.A02
            if (r0 != 0) goto L_0x008c
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r2 = X.AnonymousClass1YL.A00(r6, r1, r0)
        L_0x0047:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.1D6 r2 = new X.1D6
            r2.<init>(r3, r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.0vl r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            X.7PS r3 = new X.7PS
            r3.<init>(r2, r1, r0)
            X.0vl r2 = A0I
            java.lang.Object r0 = r2.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L_0x010f
            return r0
        L_0x008c:
            boolean r0 = r5.A0H(r7)
            r2 = 0
            if (r0 != 0) goto L_0x0047
            boolean r0 = A09(r7, r5)
            if (r0 != 0) goto L_0x00dd
            boolean r0 = A08(r7, r5)
            if (r0 != 0) goto L_0x00dd
            if (r8 == 0) goto L_0x00be
            boolean r0 = A04(r7, r5)
            if (r0 != 0) goto L_0x00be
            boolean r0 = A07(r7, r5)
            if (r0 == 0) goto L_0x00b3
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00be
        L_0x00b3:
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
        L_0x00b9:
            int r2 = X.AnonymousClass1YL.A01(r6, r1, r0, r2)
            goto L_0x0047
        L_0x00be:
            boolean r0 = A04(r7, r5)
            if (r0 != 0) goto L_0x00d6
            boolean r0 = A06(r7, r5)
            if (r0 != 0) goto L_0x00d6
            boolean r0 = A07(r7, r5)
            if (r0 == 0) goto L_0x00e4
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00e4
        L_0x00d6:
            r1 = 2130968933(0x7f040165, float:1.7546534E38)
            r0 = 2131099994(0x7f06015a, float:1.7812357E38)
            goto L_0x00b9
        L_0x00dd:
            r1 = 2130968934(0x7f040166, float:1.7546536E38)
            r0 = 2131099995(0x7f06015b, float:1.7812359E38)
            goto L_0x00b9
        L_0x00e4:
            r1 = 2131099993(0x7f060159, float:1.7812355E38)
            r0 = 2130968932(0x7f040164, float:1.7546532E38)
            int r0 = X.AnonymousClass1YL.A01(r6, r0, r1, r2)
            if (r0 == r1) goto L_0x0047
            r2 = r0
            goto L_0x0047
        L_0x00f3:
            X.205 r0 = r7.A0v
            boolean r1 = r0.A02
            boolean r0 = r2.A0J
            if (r1 == 0) goto L_0x0105
            r1 = 2131231194(0x7f0801da, float:1.8078462E38)
            if (r0 == 0) goto L_0x0035
            r1 = 2131231190(0x7f0801d6, float:1.8078454E38)
            goto L_0x0035
        L_0x0105:
            r1 = 2131231188(0x7f0801d4, float:1.807845E38)
            if (r0 != 0) goto L_0x0035
        L_0x010a:
            r1 = 2131231192(0x7f0801d8, float:1.8078458E38)
            goto L_0x0035
        L_0x010f:
            java.lang.Object r0 = r3.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r3.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r4 = X.AnonymousClass4aX.A02(r6, r1, r0)
            X.C18070vi.A0X(r4)
            java.lang.Object r1 = r2.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.put(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42571yO.A0E(android.content.Context, X.22M, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d8, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r13.A07, 6307) != false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x021e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r13.A07, 6307) != false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0220, code lost:
        r0 = 2131887744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        if (X.C62362rH.A00(r15) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dd, code lost:
        r0 = 2131887757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0120, code lost:
        if (X.C62362rH.A00(r15) != false) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0F(android.content.res.Resources r14, X.AnonymousClass22M r15, java.lang.String r16) {
        /*
            r13 = this;
            r7 = 0
            X.C18070vi.A0d(r15, r7)
            r5 = 1
            X.25F r1 = r15.A00
            X.229 r6 = r1.A02
            X.9Bw r6 = (X.C178119Bw) r6
            if (r6 != 0) goto L_0x000f
            r0 = 0
            return r0
        L_0x000f:
            boolean r0 = A06(r15, r13)
            if (r0 == 0) goto L_0x001d
            r0 = 2131887746(0x7f120682, float:1.9410108E38)
        L_0x0018:
            java.lang.String r0 = r14.getString(r0)
            return r0
        L_0x001d:
            boolean r0 = A05(r15, r13)
            r8 = 2
            r3 = 100
            if (r0 == 0) goto L_0x00aa
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.205 r4 = r15.A0v
            X.1BI r9 = r4.A00
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r9)
            if (r1 != 0) goto L_0x0052
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CallingMessageUtil/getAdHocGroupCallLogMessageText: peerjid is null. This is group jid: "
            r2.append(r0)
            boolean r0 = r9 instanceof com.whatsapp.jid.GroupJid
            r2.append(r0)
            java.lang.String r0 = " and callType is "
            r2.append(r0)
            int r0 = r6.A07
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0052:
            int r2 = r13.A0D(r1, r6)
            boolean r0 = A09(r15, r13)
            if (r0 != 0) goto L_0x0239
            boolean r1 = A08(r15, r13)
            boolean r0 = r4.A02
            if (r1 == 0) goto L_0x019b
            if (r0 == 0) goto L_0x0074
            if (r2 != r8) goto L_0x0074
            r1 = 2131887742(0x7f12067e, float:1.94101E38)
        L_0x006b:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r7] = r16
            java.lang.String r0 = r14.getString(r1, r0)
            return r0
        L_0x0074:
            if (r2 != r3) goto L_0x0091
            r2 = 2131887741(0x7f12067d, float:1.9410098E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.util.ArrayList r0 = r6.A0B()
            int r0 = r0.size()
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r7] = r0
            r1[r5] = r16
            java.lang.String r0 = r14.getString(r2, r1)
            return r0
        L_0x0091:
            X.11S r2 = r13.A00
            int r1 = r6.A06(r2)
            if (r1 != r3) goto L_0x009e
            r4 = 2131887743(0x7f12067f, float:1.9410102E38)
            goto L_0x01a6
        L_0x009e:
            if (r0 != 0) goto L_0x0234
            boolean r0 = r6.A0Y(r2)
            if (r0 != 0) goto L_0x0234
            r1 = 2131887740(0x7f12067c, float:1.9410096E38)
            goto L_0x006b
        L_0x00aa:
            X.00H r2 = r13.A08
            r2.get()
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            r1 = 0
            if (r0 == 0) goto L_0x00bb
            com.whatsapp.jid.GroupJid r0 = r0.A0C
            if (r0 == 0) goto L_0x00bb
            r1 = 1
        L_0x00bb:
            r11 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = A09(r15, r13)
            if (r1 == 0) goto L_0x01df
            if (r0 == 0) goto L_0x00e2
            r2.get()
            boolean r0 = X.C62362rH.A00(r15)
            if (r0 == 0) goto L_0x00d4
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00e2
        L_0x00d4:
            r2.get()
            boolean r0 = X.C62362rH.A00(r15)
            if (r0 == 0) goto L_0x0239
        L_0x00dd:
            r0 = 2131887757(0x7f12068d, float:1.941013E38)
            goto L_0x0018
        L_0x00e2:
            boolean r0 = A08(r15, r13)
            if (r0 == 0) goto L_0x0127
            X.11S r1 = r13.A00
            int r0 = r6.A06(r1)
            if (r0 != r3) goto L_0x0112
            r4 = 2131887752(0x7f120688, float:1.941012E38)
        L_0x00f3:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.util.ArrayList r0 = r6.A0B()
            java.util.Iterator r5 = r0.iterator()
            r0 = 0
        L_0x00fe:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r5.next()
            X.9Bv r1 = (X.C178109Bv) r1
            int r2 = r1.A01
            r1 = 5
            if (r2 != r1) goto L_0x00fe
            int r0 = r0 + 1
            goto L_0x00fe
        L_0x0112:
            int r1 = r6.A06(r1)
            r0 = 5
            if (r1 != r0) goto L_0x0123
            r2.get()
            boolean r0 = X.C62362rH.A00(r15)
            if (r0 == 0) goto L_0x0234
            goto L_0x00dd
        L_0x0123:
            r4 = 2131887753(0x7f120689, float:1.9410122E38)
            goto L_0x00f3
        L_0x0127:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x014f
            boolean r0 = A07(r15, r13)
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r2.get()
            X.2rH r0 = (X.C62362rH) r0
            boolean r0 = r0.A03(r15)
            if (r0 == 0) goto L_0x0144
            r0 = 2131887754(0x7f12068a, float:1.9410124E38)
            goto L_0x0018
        L_0x0144:
            boolean r0 = r6.A0T()
            if (r0 == 0) goto L_0x023e
            r0 = 2131887751(0x7f120687, float:1.9410118E38)
            goto L_0x0018
        L_0x014f:
            X.11S r4 = r13.A00
            boolean r0 = r6.A0O()
            r10 = 0
            if (r0 == 0) goto L_0x0159
            r10 = 1
        L_0x0159:
            java.util.ArrayList r0 = r6.A0B()
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r2 = r9.next()
            X.9Bv r2 = (X.C178109Bv) r2
            com.whatsapp.jid.UserJid r0 = r2.A00
            boolean r0 = r4.A0O(r0)
            r1 = 5
            if (r0 == 0) goto L_0x017e
            if (r10 == 0) goto L_0x023e
            int r0 = r2.A01
            if (r0 != r1) goto L_0x023e
        L_0x017c:
            r10 = 1
            goto L_0x0161
        L_0x017e:
            if (r10 == 0) goto L_0x023e
            int r0 = r2.A01
            if (r0 == r1) goto L_0x023e
            int r0 = r2.A01
            if (r0 == r3) goto L_0x023e
            goto L_0x017c
        L_0x0189:
            if (r10 == 0) goto L_0x023e
            r4 = 2131887748(0x7f120684, float:1.9410112E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            X.0vb r2 = r13.A0D
            int r0 = r6.A08
            long r0 = (long) r0
            long r0 = r0 * r11
            java.lang.String r0 = X.C64052u8.A04(r2, r0)
            goto L_0x01b5
        L_0x019b:
            if (r0 == 0) goto L_0x01bc
            int r0 = r6.A05()
            if (r0 != r5) goto L_0x01bc
            r4 = 2131887739(0x7f12067b, float:1.9410094E38)
        L_0x01a6:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.util.ArrayList r0 = r6.A0B()
            int r0 = r0.size()
            int r0 = r0 - r5
        L_0x01b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01b5:
            r3[r7] = r0
            java.lang.String r0 = r14.getString(r4, r3)
            return r0
        L_0x01bc:
            boolean r0 = r6.A0R()
            if (r0 != 0) goto L_0x022f
            boolean r0 = r6.A0S()
            if (r0 != 0) goto L_0x022a
            boolean r0 = r6.A0U()
            if (r0 == 0) goto L_0x01db
            X.0ve r2 = r13.A07
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01db
            goto L_0x0220
        L_0x01db:
            r4 = 2131887738(0x7f12067a, float:1.9410092E38)
            goto L_0x01a6
        L_0x01df:
            if (r0 != 0) goto L_0x0239
            boolean r0 = A08(r15, r13)
            if (r0 != 0) goto L_0x0234
            int r1 = r6.A06
            r0 = 6
            if (r1 != r0) goto L_0x01f1
            r0 = 2131887737(0x7f120679, float:1.941009E38)
            goto L_0x0018
        L_0x01f1:
            boolean r0 = A07(r15, r13)
            if (r0 == 0) goto L_0x025e
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0202
            r0 = 2131887755(0x7f12068b, float:1.9410126E38)
            goto L_0x0018
        L_0x0202:
            boolean r0 = r6.A0R()
            if (r0 != 0) goto L_0x022f
            boolean r0 = r6.A0S()
            if (r0 != 0) goto L_0x022a
            boolean r0 = r6.A0U()
            if (r0 == 0) goto L_0x0225
            X.0ve r2 = r13.A07
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0225
        L_0x0220:
            r0 = 2131887744(0x7f120680, float:1.9410104E38)
            goto L_0x0018
        L_0x0225:
            r0 = 2131887708(0x7f12065c, float:1.941003E38)
            goto L_0x0018
        L_0x022a:
            r0 = 2131887745(0x7f120681, float:1.9410106E38)
            goto L_0x0018
        L_0x022f:
            r0 = 2131887758(0x7f12068e, float:1.9410132E38)
            goto L_0x0018
        L_0x0234:
            r0 = 2131887756(0x7f12068c, float:1.9410128E38)
            goto L_0x0018
        L_0x0239:
            r0 = 2131887759(0x7f12068f, float:1.9410134E38)
            goto L_0x0018
        L_0x023e:
            r4 = 2131887747(0x7f120683, float:1.941011E38)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.0vb r2 = r13.A0D
            int r0 = r6.A08
            long r0 = (long) r0
            long r0 = r0 * r11
            java.lang.String r0 = X.C64052u8.A04(r2, r0)
            r3[r7] = r0
            int r0 = r6.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r5] = r0
            java.lang.String r0 = r14.getString(r4, r3)
            return r0
        L_0x025e:
            X.0vb r2 = r13.A0D
            int r0 = r6.A08
            long r0 = (long) r0
            long r0 = r0 * r11
            java.lang.String r0 = X.C64052u8.A04(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42571yO.A0F(android.content.res.Resources, X.22M, java.lang.String):java.lang.String");
    }

    public final void A0G(C178119Bw r4, Integer num, Set set) {
        AnonymousClass1BI r1;
        if (set.size() <= 1 && (!r4.A0O())) {
            r1 = r4.A04.A01;
        } else if (r4.A0C != null) {
            r1 = r4.A0C;
            if (r1 == null || r4.A0F != null) {
                return;
            }
        } else if (set.size() >= 2 && r4.A0C == null && r4.A0B == null) {
            C89444cT r12 = r4.A04;
            if (!r12.A03) {
                r1 = r12.A01;
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    A03(this, (AnonymousClass1BI) it.next(), r4, (Boolean) null, num);
                }
                return;
            }
        } else {
            return;
        }
        A03(this, r1, r4, (Boolean) null, num);
    }

    public final boolean A0H(AnonymousClass22M r4) {
        C178119Bw r0;
        C18070vi.A0d(r4, 0);
        this.A08.get();
        AnonymousClass25F r1 = r4.A00;
        if (C62362rH.A00(r4) && (r0 = (C178119Bw) r1.A02) != null) {
            C178119Bw.A00(r0);
            if (r0.A09 != 8) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void A02(AnonymousClass22M r3, C42571yO r4) {
        AnonymousClass1CJ r2 = r4.A0E;
        Object obj = r4.A0G.get();
        C18070vi.A0X(obj);
        int A002 = C43391zj.A00((AnonymousClass1M9) obj, r2, r3.A0v.A00);
        if (A002 > 0) {
            r3.A0Z(A002);
            r3.A0h(0L);
        }
    }

    public static final boolean A04(AnonymousClass22M r1, C42571yO r2) {
        r2.A08.get();
        C178119Bw r0 = (C178119Bw) r1.A00.A02;
        if (r0 == null || r0.A06 != 6) {
            return false;
        }
        return true;
    }

    public static final boolean A05(AnonymousClass22M r1, C42571yO r2) {
        r2.A08.get();
        C178119Bw r0 = (C178119Bw) r1.A00.A02;
        if (r0 != null) {
            return r0.A0M();
        }
        return false;
    }

    public static final boolean A06(AnonymousClass22M r1, C42571yO r2) {
        r2.A08.get();
        C178119Bw r0 = (C178119Bw) r1.A00.A02;
        if (r0 != null) {
            return r0.A0N();
        }
        return false;
    }

    public static final boolean A07(AnonymousClass22M r1, C42571yO r2) {
        return ((C62362rH) r2.A08.get()).A01(r1);
    }

    public static final boolean A08(AnonymousClass22M r1, C42571yO r2) {
        return ((C62362rH) r2.A08.get()).A02(r1);
    }

    public static final boolean A09(AnonymousClass22M r3, C42571yO r4) {
        C62362rH r1 = (C62362rH) r4.A08.get();
        C178119Bw r0 = (C178119Bw) r3.A00.A02;
        if (r0 == null) {
            return false;
        }
        if ((r0.A06 == 0 || r1.A03(r3)) && ((C56762hz) r1.A00.get()).A00(r3.A0v.A01)) {
            return true;
        }
        return false;
    }

    public static final SpannableString A01(AnonymousClass118 r6, Integer num, int i, int i2) {
        String A012 = r6.A01(i2);
        C18070vi.A0X(A012);
        String A022 = r6.A02(i, num != null ? new Object[]{A012, num} : new Object[]{A012});
        C18070vi.A0b(A022);
        int A0F2 = AnonymousClass1YF.A0F(A022, A012, 0, false);
        int length = A012.length() + A0F2;
        int A002 = C19740yt.A00(r6.A00, 2131099995);
        SpannableString spannableString = new SpannableString(A022);
        spannableString.setSpan(new ForegroundColorSpan(A002), A0F2, length, 33);
        spannableString.setSpan(new StyleSpan(1), A0F2, length, 33);
        return spannableString;
    }

    public static final boolean A0A(C42571yO r1, C178119Bw r2) {
        if (r2.A0S() || r2.A0R()) {
            return true;
        }
        if (!r2.A0U()) {
            return false;
        }
        C18030ve r22 = r1.A07;
        if (!C18020vd.A05(C18040vf.A02, r22, 6307) || C40811vJ.A0R(r22)) {
            return false;
        }
        return true;
    }
}
