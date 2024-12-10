package X;

import android.text.SpannableString;
import android.text.TextUtils;
import java.math.BigDecimal;

public class A1M {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final C33251iW A02;
    public final AnonymousClass11P A03;
    public final C219217x A04;
    public final C20004A2u A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final C19880zA A08;
    public final AnonymousClass11S A09;
    public final A8Q A0A;
    public final C18000vb A0B;

    public SpannableString A01(AnonymousClass22Q r8) {
        String str;
        if (r8.A0B == null || TextUtils.isEmpty(r8.A03)) {
            str = r8.A04;
            if (str == null) {
                return null;
            }
        } else {
            A6S a6s = new A6S(r8.A03);
            BigDecimal bigDecimal = r8.A0C;
            BigDecimal bigDecimal2 = r8.A0B;
            C18000vb r2 = this.A0B;
            str = a6s.A03(r2, bigDecimal2, true);
            if (!(bigDecimal == null || BigDecimal.ZERO.compareTo(bigDecimal) == 0 || bigDecimal.compareTo(bigDecimal2) >= 0)) {
                return A78.A02(str, a6s.A03(r2, bigDecimal, true));
            }
        }
        return new SpannableString(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r3v0 int) = (r30v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    public void A02(X.AnonymousClass1FU r24, X.C20005A2v r25, X.AnonymousClass1BI r26, com.whatsapp.jid.UserJid r27, java.util.List r28, int r29, int r30, long r31) {
        /*
            r23 = this;
            r5 = r28
            int r0 = r5.size()
            if (r0 == 0) goto L_0x00fb
            int r0 = r5.size()
            r3 = r30
            if (r3 >= r0) goto L_0x00fb
            r13 = r23
            r4 = r29
            if (r30 != 0) goto L_0x0107
            r0 = 1
            if (r4 == r0) goto L_0x0103
            r0 = 3
            if (r4 != r0) goto L_0x0107
            java.lang.String r7 = "Forward"
        L_0x001e:
            X.A2u r6 = r13.A05
            r1 = 774779800(0x2e2e3398, float:3.9608844E-11)
            java.lang.String r0 = "CatalogUtils"
            java.lang.String r2 = "send_product_message_tag"
            r6.A01(r1, r2, r0)
            int r0 = r5.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ProductsCount"
            r6.A04(r2, r0, r1)
            java.lang.String r0 = "EntryPoint"
            r6.A04(r2, r0, r7)
            r11 = 1
        L_0x003d:
            r0 = 1
            if (r4 == r0) goto L_0x00ff
            r0 = 2
            r7 = 55
            if (r4 == r0) goto L_0x0047
            r7 = 66
        L_0x0047:
            X.17x r0 = r13.A04
            boolean r0 = r0.A0G()
            r12 = r24
            if (r0 != 0) goto L_0x00fc
            r6 = 2131894475(0x7f1220cb, float:1.9423756E38)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r1 = 2131894474(0x7f1220ca, float:1.9423754E38)
            if (r2 < r0) goto L_0x0067
            r0 = 33
            r1 = 2131894477(0x7f1220cd, float:1.942376E38)
            if (r2 >= r0) goto L_0x0067
            r1 = 2131894476(0x7f1220cc, float:1.9423758E38)
        L_0x0067:
            X.AnonymousClass74O.A09(r12, r6, r1, r7)
            r0 = 0
        L_0x006b:
            r2 = 0
            java.lang.String r7 = "send_product_message_tag"
            if (r0 == 0) goto L_0x010a
            java.lang.Object r14 = r5.get(r3)
            X.AEv r14 = (X.C20287AEv) r14
            boolean r0 = r14.A0K
            if (r0 == 0) goto L_0x010a
            X.11S r0 = r13.A09
            r6 = r27
            boolean r0 = r0.A0O(r6)
            if (r0 == 0) goto L_0x00bc
            X.A8Q r9 = r13.A0A
            java.lang.String r10 = r14.A0H
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.1Be r8 = r9.A00
            if (r8 == 0) goto L_0x00bc
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x00bc
            r0 = 34
            X.8ru r1 = new X.8ru
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.String r0 = r9.A03
            r1.A06 = r0
            r1.A0A = r10
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A0D
            int r0 = r0.get()
            if (r0 == 0) goto L_0x00b7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
        L_0x00b7:
            X.18K r0 = r9.A09
            r0.CC8(r1, r8)
        L_0x00bc:
            if (r11 == 0) goto L_0x00cb
            X.A2u r0 = r13.A05
            X.19a r1 = X.C20004A2u.A00(r0, r7)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = "image_upload"
            r1.A07(r0)
        L_0x00cb:
            java.util.List r0 = r14.A0A
            java.lang.Object r2 = r0.get(r2)
            X.AEI r2 = (X.AEI) r2
            X.ANf r11 = new X.ANf
            r15 = r25
            r16 = r26
            r21 = r31
            r20 = r4
            r19 = r3
            r18 = r5
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.ANR r1 = new X.ANR
            r1.<init>(r12, r5, r3)
            X.ANU r0 = new X.ANU
            r0.<init>(r12, r13)
            r4 = 0
            r10 = 3
            r3 = r15
            r5 = r2
            r6 = r1
            r7 = r4
            r8 = r0
            r9 = r11
            r3.A03(r4, r5, r6, r7, r8, r9, r10)
        L_0x00fb:
            return
        L_0x00fc:
            r0 = 1
            goto L_0x006b
        L_0x00ff:
            r7 = 44
            goto L_0x0047
        L_0x0103:
            java.lang.String r7 = "Attachment"
            goto L_0x001e
        L_0x0107:
            r11 = 0
            goto L_0x003d
        L_0x010a:
            X.A2u r0 = r13.A05
            r0.A06(r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1M.A02(X.1FU, X.A2v, X.1BI, com.whatsapp.jid.UserJid, java.util.List, int, int, long):void");
    }

    public A1M(C19880zA r1, C218617r r2, AnonymousClass1KB r3, AnonymousClass11S r4, C33251iW r5, A8Q a8q, AnonymousClass11P r7, C219217x r8, C18000vb r9, C20004A2u a2u, AnonymousClass10I r11, AnonymousClass00H r12) {
        this.A03 = r7;
        this.A01 = r3;
        this.A09 = r4;
        this.A06 = r11;
        this.A00 = r2;
        this.A02 = r5;
        this.A05 = a2u;
        this.A08 = r1;
        this.A0B = r9;
        this.A07 = r12;
        this.A04 = r8;
        this.A0A = a8q;
    }

    public static String A00(String str, int i) {
        return AnonymousClass001.A1I("_", AnonymousClass000.A11(str), i);
    }
}
