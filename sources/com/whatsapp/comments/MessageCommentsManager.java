package com.whatsapp.comments;

import X.A51;
import X.ARP;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass121;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1T8;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass23U;
import X.AnonymousClass23Z;
import X.AnonymousClass7RL;
import X.AnonymousClass8X8;
import X.C163938Wx;
import X.C166048cG;
import X.C166388co;
import X.C166418cr;
import X.C18070vi;
import X.C18600wl;
import X.C195749tq;
import X.C200710s;
import X.C20133A8t;
import X.C24681Lg;
import X.C25931Qe;
import X.C26001Ql;
import X.C27621Wu;
import X.C30391dr;
import X.C30451dy;
import X.C31751g4;
import X.C35191ln;
import X.C48312Lz;
import X.C59392mE;
import X.C59782ms;
import X.C60472o5;
import X.C692336k;
import com.whatsapp.util.Log;

public final class MessageCommentsManager implements C35191ln {
    public final AnonymousClass11S A00;
    public final C24681Lg A01;
    public final C200710s A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass121 A06;
    public final C26001Ql A07;
    public final C25931Qe A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final C18600wl A0C;

    public MessageCommentsManager(AnonymousClass190 r3, AnonymousClass11S r4, AnonymousClass121 r5, C26001Ql r6, C24681Lg r7, C25931Qe r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, C18600wl r14) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r12, 7);
        C18070vi.A0d(r6, 8);
        C18070vi.A0d(r5, 9);
        C18070vi.A0d(r8, 10);
        C18070vi.A0d(r13, 11);
        C18070vi.A0d(r14, 12);
        this.A05 = r3;
        this.A00 = r4;
        this.A09 = r9;
        this.A03 = r10;
        this.A01 = r7;
        this.A0B = r11;
        this.A04 = r12;
        this.A07 = r6;
        this.A06 = r5;
        this.A08 = r8;
        this.A0A = r13;
        this.A0C = r14;
        this.A02 = new C200710s(r9, false);
    }

    public void BKN(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        this.A02.execute(new AnonymousClass7RL(this, r3));
    }

    public boolean BkA(AnonymousClass206 r8) {
        C692336k A002 = C60472o5.A00(r8);
        if (r8.A11(16777216) && A002 != null) {
            Long A022 = A002.A02();
            if (A022 != null) {
                long longValue = A022.longValue();
                if (longValue > 0) {
                    AnonymousClass206 A032 = ((AnonymousClass1W6) this.A03.get()).A01.A03(longValue);
                    if ((A032 instanceof AnonymousClass23Z) || (A032 instanceof AnonymousClass23U)) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void CBr(AnonymousClass206 r5, byte[] bArr) {
        A51 A012;
        if (r5.A11(16777216)) {
            C692336k A002 = C60472o5.A00(r5);
            if (A002 == null || (A012 = A002.A01()) == null) {
                throw new AnonymousClass1T8(0, (String) null);
            }
            AnonymousClass206 A052 = ((AnonymousClass1W6) this.A03.get()).A01.A05(A012.A01);
            if (A052 == null || C20133A8t.A0B(A052)) {
                BcB(r5, bArr);
                return;
            }
            if (!A052.A0z(16)) {
                A052.A0V(16);
                this.A06.CQw(A052);
            }
            C60472o5.A01(new C48312Lz(new A51(A052.A0I(), A052.A0v), A052.A0x), r5);
        }
    }

    public void CBs(C166388co r4, AnonymousClass206 r5) {
        C18070vi.A0d(r4, 1);
        C166418cr r0 = r4.message_;
        if (r0 == null) {
            r0 = C166418cr.DEFAULT_INSTANCE;
        }
        AnonymousClass8X8 r2 = (AnonymousClass8X8) r0.A0O();
        C163938Wx r1 = (C163938Wx) C166048cG.DEFAULT_INSTANCE.A0N();
        r1.A0G(r4.messageSecret_);
        r2.A0V((C166048cG) r1.A0C());
        CBr(r5, r2.A0C().A0M());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.AnonymousClass206 r11, X.C30391dr r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.AnonymousClass3FR
            if (r0 == 0) goto L_0x008c
            r6 = r12
            X.3FR r6 = (X.AnonymousClass3FR) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r7) goto L_0x0092
            java.lang.Object r9 = r6.L$1
            X.36k r9 = (X.C692336k) r9
            java.lang.Object r0 = r6.L$0
            com.whatsapp.comments.MessageCommentsManager r0 = (com.whatsapp.comments.MessageCommentsManager) r0
            X.C30691eM.A01(r1)
        L_0x0029:
            X.00H r0 = r0.A03
            java.lang.Object r1 = r0.get()
            X.1W6 r1 = (X.AnonymousClass1W6) r1
            if (r9 == 0) goto L_0x003b
            X.A51 r0 = r9.A01()
            if (r0 == 0) goto L_0x003b
            X.205 r4 = r0.A01
        L_0x003b:
            X.1W2 r0 = r1.A01
            X.206 r0 = r0.A05(r4)
            return r0
        L_0x0042:
            X.C30691eM.A01(r1)
            X.36k r8 = X.C60472o5.A00(r11)
            X.1Qe r3 = r10.A08
            X.25F[] r2 = new X.AnonymousClass25F[r7]
            r1 = 0
            X.C18070vi.A0d(r11, r1)
            java.lang.Class<X.36k> r0 = X.C692336k.class
            X.25F r0 = r11.A0M(r0)
            X.C18070vi.A0X(r0)
            r2[r1] = r0
            r3.A0A(r2)
            X.36k r9 = X.C60472o5.A00(r11)
            if (r8 != 0) goto L_0x008a
            if (r9 == 0) goto L_0x008a
            r0 = 40
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            int r2 = r3.intValue()
            X.0wl r1 = r10.A0C
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1 r0 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1
            r0.<init>(r10, r11, r4, r2)
            r6.L$0 = r10
            r6.L$1 = r9
            r6.L$2 = r3
            r6.label = r7
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0088
            return r5
        L_0x0088:
            r0 = r10
            goto L_0x0029
        L_0x008a:
            r0 = r10
            goto L_0x0029
        L_0x008c:
            X.3FR r6 = new X.3FR
            r6.<init>(r10, r12)
            goto L_0x0012
        L_0x0092:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.comments.MessageCommentsManager.A00(X.206, X.1dr):java.lang.Object");
    }

    public void BcB(AnonymousClass206 r18, byte[] bArr) {
        AnonymousClass206 r5 = r18;
        C692336k A002 = C60472o5.A00(r5);
        if (!r5.A11(16777216) || A002 == null) {
            Log.e("MessageCommentsManager/handleCommentOrphan/comment message info is null");
            this.A05.A0G("MessageCommentsManager/handleCommentOrphan/comment message info is null", (String) null, true);
            return;
        }
        A51 A012 = A002.A01();
        if (A012 != null) {
            AnonymousClass205 r9 = A012.A01;
            boolean z = false;
            if (((C59392mE) this.A04.get()).A01(r9) == null) {
                z = true;
            }
            AnonymousClass205 r8 = r5.A0v;
            C18070vi.A0W(r8);
            AnonymousClass1BI A0H = r5.A0H();
            AnonymousClass1BI r7 = A012.A00;
            long j = r5.A0I;
            int i = 2;
            if (z) {
                i = 1;
            }
            if (((ARP) this.A0B.get()).A01(new C195749tq(A0H, r7, r8, r9, (Long) null, bArr, (byte[]) null, 3, i, j)) != 4) {
                Log.e("MessageCommentsManager/handleCommentOrphan/Failed to store orphan message");
                this.A05.A0G("MessageCommentsManager/handleCommentOrphan/Failed to store orphan message", (String) null, true);
                return;
            }
            return;
        }
        Log.e("MessageCommentsManager/handleCommentOrphan/comment message info's parent key is null");
        this.A05.A0G("MessageCommentsManager/handleCommentOrphan/comment message info's parent key is null", (String) null, true);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.2Ly, java.lang.Object, X.36k] */
    public Object BKM(AnonymousClass206 r5, C30391dr r6) {
        int A002;
        Object A003;
        C692336k A004 = C60472o5.A00(r5);
        if (A004 == null) {
            ((C59782ms) this.A0A.get()).A01(r5);
        }
        C692336k A005 = C60472o5.A00(r5);
        if (A005 != null) {
            A002 = A005.A00();
        } else {
            A002 = this.A07.A00(r5);
        }
        if (A002 > 0 && C60472o5.A00(r5) == null) {
            ? obj = new Object();
            obj.A00 = A002;
            obj.A01 = null;
            obj.A02 = null;
            C60472o5.A01(obj, r5);
        }
        if (C18070vi.A18(A004, C60472o5.A00(r5)) || (A003 = C30451dy.A00(r6, this.A0C, new MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(this, r5, (C30391dr) null))) != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A003;
    }
}
