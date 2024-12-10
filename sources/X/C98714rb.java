package X;

/* renamed from: X.4rb  reason: invalid class name and case insensitive filesystem */
public class C98714rb implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C98714rb(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static void A00(AnonymousClass10I r1, Object obj, Object obj2, Object obj3, int i) {
        r1.CGF(new C98714rb(obj, obj2, obj3, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.1px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: X.3uU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v123, resolved type: X.1px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v124, resolved type: X.1px} */
    /* JADX WARNING: type inference failed for: r1v24, types: [X.4MX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v339, types: [X.4FP, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03f8, code lost:
        r3.A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0408, code lost:
        r0 = r2.A00;
        r0.A0I();
        r1 = r0.A0D;
        r0 = r2.A01.A0E(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0415, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0417, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0419, code lost:
        r1 = X.AnonymousClass17K.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x041d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x041f, code lost:
        r2 = new X.C80073wV(r1, r0.A0C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x052c, code lost:
        r0.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x052f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0550, code lost:
        r5 = new X.C98714rb(r4, r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05ad, code lost:
        r6.A0J(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x06f3, code lost:
        r1.A0C(r3, r0.BVA(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x06fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x083a, code lost:
        r0.A0J(new X.C70833Cr((java.lang.Object) r2, (java.lang.Object) r3, r4, r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0842, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
        if (r5.A0v.A02 != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0a9e, code lost:
        r14 = r11.A0N;
        r13 = r11.A00;
        r5 = r11.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013b, code lost:
        if (r4.A0G == null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0192;
                case 1: goto L_0x01f5;
                case 2: goto L_0x0214;
                case 3: goto L_0x05ba;
                case 4: goto L_0x0092;
                case 5: goto L_0x05e5;
                case 6: goto L_0x05f5;
                case 7: goto L_0x00ba;
                case 8: goto L_0x0609;
                case 9: goto L_0x024b;
                case 10: goto L_0x0619;
                case 11: goto L_0x0650;
                case 12: goto L_0x02a0;
                case 13: goto L_0x00de;
                case 14: goto L_0x0660;
                case 15: goto L_0x0678;
                case 16: goto L_0x0697;
                case 17: goto L_0x06b6;
                case 18: goto L_0x06d5;
                case 19: goto L_0x06fb;
                case 20: goto L_0x070b;
                case 21: goto L_0x014b;
                case 22: goto L_0x031d;
                case 23: goto L_0x0362;
                case 24: goto L_0x039e;
                case 25: goto L_0x03fc;
                case 26: goto L_0x03d6;
                case 27: goto L_0x0429;
                case 28: goto L_0x071f;
                case 29: goto L_0x0447;
                case 30: goto L_0x045f;
                case 31: goto L_0x0530;
                case 32: goto L_0x0088;
                case 33: goto L_0x0733;
                case 34: goto L_0x0753;
                case 35: goto L_0x0769;
                case 36: goto L_0x077f;
                case 37: goto L_0x079b;
                case 38: goto L_0x0556;
                case 39: goto L_0x07c9;
                case 40: goto L_0x0808;
                case 41: goto L_0x0826;
                case 42: goto L_0x0843;
                case 43: goto L_0x087a;
                case 44: goto L_0x08b0;
                case 45: goto L_0x0b2c;
                case 46: goto L_0x0b4d;
                case 47: goto L_0x0b8a;
                case 48: goto L_0x0ba5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A01
            X.4Xd r2 = (X.C87814Xd) r2
            java.lang.Object r4 = r1.A02
            X.6oQ r4 = (X.C133256oQ) r4
            java.lang.Object r12 = r1.A03
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            X.4UE r0 = r2.A01
            r11 = 0
            if (r0 == 0) goto L_0x008e
            java.lang.String r10 = r0.A00
            java.lang.String r9 = r0.A02
            java.lang.String r8 = r0.A01
        L_0x001e:
            X.0ve r3 = r4.A01
            r1 = 11287(0x2c17, float:1.5816E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x002c
            X.1E2 r11 = r2.A03
        L_0x002c:
            if (r10 == 0) goto L_0x0088
            X.0vl r1 = r4.A09
            java.lang.Object r0 = r1.getValue()
            X.44b r0 = (X.C822444b) r0
            r0.A06(r12)
            X.C822444b.A00(r0)
            java.lang.Object r7 = r1.getValue()
            X.44b r7 = (X.C822444b) r7
            java.lang.String r13 = r2.A0E
            if (r13 != 0) goto L_0x004c
            com.whatsapp.jid.UserJid r0 = r2.A04
            if (r0 == 0) goto L_0x0089
            java.lang.String r13 = r0.user
        L_0x004c:
            java.lang.String r6 = r2.A0D
            java.lang.String r5 = r2.A0R
            boolean r0 = r2.A0Z
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A0a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A0c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            X.C18070vi.A0j(r12, r13)
            X.4FP r0 = new X.4FP
            r0.<init>()
            r0.A01 = r12
            r0.A06 = r13
            r0.A07 = r10
            r0.A08 = r9
            r0.A09 = r8
            r0.A05 = r6
            r0.A0A = r5
            r0.A02 = r4
            r0.A03 = r3
            r0.A0B = r1
            r0.A0C = r1
            r0.A00 = r11
            r0.A04 = r2
            r7.A09(r0)
        L_0x0088:
            return
        L_0x0089:
            java.lang.String r13 = r12.getRawString()
            goto L_0x004c
        L_0x008e:
            r10 = r11
            r9 = r11
            r8 = r11
            goto L_0x001e
        L_0x0092:
            java.lang.Object r4 = r1.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r2 = r1.A02
            X.20i r2 = (X.C436420i) r2
            java.lang.Object r3 = r1.A03
            X.00H r0 = r4.A1x
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.2MQ r2 = (X.AnonymousClass2MQ) r2
            long r1 = r2.A00
            X.1W2 r0 = r0.A01
            X.206 r1 = r0.A03(r1)
            boolean r0 = r1 instanceof X.C445823z
            if (r0 == 0) goto L_0x05b1
            X.1KB r6 = r4.A0S
            r0 = 4
            X.4rl r5 = new X.4rl
            r5.<init>(r1, r3, r0)
            goto L_0x05ad
        L_0x00ba:
            java.lang.Object r4 = r1.A01
            X.3sT r4 = (X.C78243sT) r4
            java.lang.Object r3 = r1.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r2 = r1.A03
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0zA r0 = r4.A00
            java.lang.Object r0 = r0.A03()
            X.1gl r0 = (X.C32171gl) r0
            java.lang.String r1 = r0.BSa(r3)
            X.1KB r6 = r4.A0S
            r0 = 7
            X.7Qs r5 = new X.7Qs
            r5.<init>(r0, r1, r2)
            goto L_0x05ad
        L_0x00de:
            java.lang.Object r2 = r1.A01
            X.3uK r2 = (X.AnonymousClass3uK) r2
            java.lang.Object r4 = r1.A02
            X.2rc r4 = (X.C62572rc) r4
            java.lang.Object r5 = r1.A03
            X.21V r5 = (X.AnonymousClass21V) r5
            X.0ve r3 = r2.A0F
            r1 = 3936(0xf60, float:5.516E-42)
            X.0vf r0 = X.C18040vf.A02
            int r6 = X.C18020vd.A00(r0, r3, r1)
            X.1SK r0 = r2.A07
            r3 = 1
            java.lang.Float r1 = r0.BNL(r3)
            X.00H r0 = r2.A2W
            java.lang.Object r0 = r0.get()
            X.6yx r0 = (X.C139506yx) r0
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0121
            if (r1 == 0) goto L_0x0121
            if (r6 < 0) goto L_0x0121
            float r1 = r1.floatValue()
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0121
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0121
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x013d
            X.36v r0 = r5.A17()
            X.C17960vV.A07(r0)
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x013d
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x013d
            java.io.File r0 = r4.A0G
            if (r0 == 0) goto L_0x0140
        L_0x013d:
            if (r1 != 0) goto L_0x0140
            r3 = 0
        L_0x0140:
            X.1KB r6 = r2.A0S
            r0 = 37
            X.7RK r5 = new X.7RK
            r5.<init>((int) r0, (java.lang.Object) r2, (boolean) r3)
            goto L_0x05ad
        L_0x014b:
            java.lang.Object r4 = r1.A01
            X.724 r4 = (X.AnonymousClass724) r4
            java.lang.Object r6 = r1.A02
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r7 = r1.A03
            X.00H r3 = r4.A0H
            java.lang.Object r1 = r3.get()
            X.70H r1 = (X.AnonymousClass70H) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageSticker"
            X.C18070vi.A0z(r6, r0)
            r0 = r6
            X.22g r0 = (X.C441322g) r0
            X.77d r5 = r1.A01(r0)
            java.lang.String r2 = r5.A0B
            if (r2 == 0) goto L_0x0187
            java.lang.Object r1 = r3.get()
            X.70H r1 = (X.AnonymousClass70H) r1
            java.lang.Integer r0 = r5.A01()
            X.73B r0 = r1.A03(r0, r2)
            if (r0 == 0) goto L_0x0187
            X.737[] r0 = r0.A0H
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = X.C137426vR.A00(r0)
            r5.A09 = r0
        L_0x0187:
            X.1KB r0 = r4.A00
            r8 = 15
            X.3Cr r3 = new X.3Cr
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            goto L_0x052c
        L_0x0192:
            java.lang.Object r4 = r1.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r3 = r1.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r5 = r1.A03
            X.4Cr r5 = (X.C82924Cr) r5
            X.205 r1 = r3.A0v
            X.1BI r2 = r1.A00
            if (r2 == 0) goto L_0x0088
            X.00H r0 = r4.A1d
            java.lang.Object r0 = r0.get()
            X.A8x r0 = (X.C20136A8x) r0
            boolean r0 = r0.A0R(r1)
            if (r0 == 0) goto L_0x0088
            X.00H r0 = r4.A1d
            java.lang.Object r1 = r0.get()
            X.A8x r1 = (X.C20136A8x) r1
            boolean r0 = r3 instanceof X.AnonymousClass21Z
            if (r0 == 0) goto L_0x01f0
            r0 = r3
            X.21Z r0 = (X.AnonymousClass21Z) r0
            X.21L r0 = r0.BOM()
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r1.A0P(r0)
        L_0x01cb:
            if (r0 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            int r1 = r5.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x01ed
            r0 = 1
            if (r1 == r0) goto L_0x01ea
            r0 = 2
            if (r1 != r0) goto L_0x0088
            r1 = 10
        L_0x01de:
            X.00H r0 = r4.A1c
            java.lang.Object r0 = r0.get()
            X.A5M r0 = (X.A5M) r0
            r0.A02(r2, r3, r1)
            return
        L_0x01ea:
            r1 = 9
            goto L_0x01de
        L_0x01ed:
            r1 = 8
            goto L_0x01de
        L_0x01f0:
            boolean r0 = r1.A0P(r3)
            goto L_0x01cb
        L_0x01f5:
            java.lang.Object r3 = r1.A01
            X.3uP r3 = (X.AnonymousClass3uP) r3
            java.lang.Object r0 = r1.A02
            X.1xh r0 = (X.C42141xh) r0
            java.lang.Object r2 = r1.A03
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setTextColor(r1)
            X.8G7 r0 = r3.A0t
            if (r0 == 0) goto L_0x0088
            X.1DT r0 = r0.A08
            X.C137196v4.A01(r0, r2)
            return
        L_0x0214:
            java.lang.Object r4 = r1.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r3 = r1.A02
            X.5cR r3 = (X.C108875cR) r3
            java.lang.Object r2 = r1.A03
            X.206 r2 = (X.AnonymousClass206) r2
            X.5cR r0 = r4.A0k
            if (r0 == 0) goto L_0x0240
            boolean r0 = r0.Bcq()
            if (r0 == 0) goto L_0x0240
            boolean r0 = r4.A2Y()
            if (r0 == 0) goto L_0x0240
            r4.A1w()
            X.3OA r1 = r4.A0o
            X.C17960vV.A07(r3)
            boolean r0 = r3.Bfa(r2)
        L_0x023c:
            r1.setRowSelected(r0)
            return
        L_0x0240:
            android.view.View r0 = r4.A05
            X.C72453Mb.A1B(r0)
            X.3OA r1 = r4.A0o
            if (r1 == 0) goto L_0x0088
            r0 = 0
            goto L_0x023c
        L_0x024b:
            java.lang.Object r0 = r1.A01
            X.AEY r0 = (X.AEY) r0
            java.lang.Object r4 = r1.A02
            X.8nU r4 = (X.AnonymousClass8nU) r4
            java.lang.Object r9 = r1.A03
            X.206 r9 = (X.AnonymousClass206) r9
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r4.A06
            X.1KJ r1 = r0.A00
            java.util.List r0 = r0.A03
            X.AEY r8 = new X.AEY
            r8.<init>(r1, r3, r2, r0)
            X.4LL r7 = r4.A09
            X.21K r9 = (X.AnonymousClass21K) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.AEt r6 = r9.BPK()
            r5 = 0
            if (r6 == 0) goto L_0x0088
            X.AEY r1 = r6.A03
            if (r1 == 0) goto L_0x028e
            java.lang.String r4 = r1.A02
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x027e
            r4 = r0
        L_0x027e:
            X.1KJ r3 = r8.A00
            java.util.List r2 = r8.A03
            java.lang.String r1 = r1.A01
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x0289
            r1 = r0
        L_0x0289:
            X.AEY r5 = new X.AEY
            r5.<init>(r3, r4, r1, r2)
        L_0x028e:
            X.AEk r1 = r6.A06
            X.AEt r0 = new X.AEt
            r0.<init>(r5, r1)
            r9.CIS(r0)
            X.122 r0 = r7.A00
            X.206 r9 = (X.AnonymousClass206) r9
            r0.CQw(r9)
            return
        L_0x02a0:
            java.lang.Object r2 = r1.A01
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r7 = r1.A02
            X.3tR r7 = (X.AnonymousClass3tR) r7
            java.lang.Object r8 = r1.A03
            java.util.List r8 = (java.util.List) r8
            r0 = 2
            X.C18070vi.A0d(r8, r0)
            X.205 r0 = r2.A0v
            java.lang.String r1 = r0.A01
            X.22i r0 = r7.getFMessage()
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0088
            r1 = 0
            r7.A01 = r1
            r7.A00 = r1
            android.widget.FrameLayout r0 = r7.A09
            r0.removeAllViews()
            int r6 = r8.size()
            r5 = 2
            r0 = 1
            if (r6 == r0) goto L_0x0bca
            if (r6 == r5) goto L_0x030a
            r4 = 3
            java.lang.Object r3 = r8.get(r1)
            X.77d r3 = (X.C1418377d) r3
            java.lang.Object r2 = r8.get(r0)
            X.77d r2 = (X.C1418377d) r2
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r0 = 8388661(0x800035, float:1.1755018E-38)
            X.AnonymousClass3tR.A02(r7, r3, r1)
            X.AnonymousClass3tR.A02(r7, r2, r0)
            if (r6 == r4) goto L_0x0bc1
            java.lang.Object r3 = r8.get(r5)
            X.77d r3 = (X.C1418377d) r3
            java.lang.Object r2 = r8.get(r4)
            X.77d r2 = (X.C1418377d) r2
            r1 = 8388691(0x800053, float:1.175506E-38)
            r0 = 8388693(0x800055, float:1.1755063E-38)
        L_0x0303:
            X.AnonymousClass3tR.A02(r7, r3, r1)
            X.AnonymousClass3tR.A02(r7, r2, r0)
            return
        L_0x030a:
            java.lang.Object r3 = r8.get(r1)
            X.77d r3 = (X.C1418377d) r3
            java.lang.Object r2 = r8.get(r0)
            X.77d r2 = (X.C1418377d) r2
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0 = 8388629(0x800015, float:1.1754973E-38)
            goto L_0x0303
        L_0x031d:
            java.lang.Object r8 = r1.A01
            X.3wA r8 = (X.C79873wA) r8
            java.lang.Object r9 = r1.A02
            X.206 r9 = (X.AnonymousClass206) r9
            java.lang.Object r7 = r1.A03
            X.00H r0 = r8.A05
            java.lang.Object r0 = r0.get()
            X.2iI r0 = (X.C56952iI) r0
            int r4 = r0.A00()
            X.205 r0 = r9.A0v
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x0088
            X.1WF r0 = r8.A01
            X.11m r3 = r0.A03
            X.1LW r0 = r0.A01
            long r1 = r0.A09(r1)
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r5 = 0
            r6[r5] = r0
            X.11P r0 = r3.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            r6[r0] = r1
            X.1Cd r0 = r3.A03
            X.1at r3 = r0.get()
            goto L_0x0bd6
        L_0x0362:
            java.lang.Object r4 = r1.A01
            X.8nj r4 = (X.C169888nj) r4
            java.lang.Object r0 = r1.A02
            X.206 r0 = (X.AnonymousClass206) r0
            java.lang.Object r3 = r1.A03
            X.AEn r3 = (X.C20279AEn) r3
            com.whatsapp.jid.UserJid r5 = r0.A0I()
            if (r5 == 0) goto L_0x0088
            X.0ve r2 = r4.A01
            r1 = 10765(0x2a0d, float:1.5085E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0088
            X.AE0 r6 = r3.A0C
            if (r6 == 0) goto L_0x0088
            X.00H r0 = r4.A0A
            java.lang.Object r1 = r0.get()
            X.8sh r1 = (X.C172048sh) r1
            r7 = 0
            java.lang.String r0 = "prefetch_conversation"
            int r8 = r1.A0E(r5, r0)
            X.1OX r0 = r4.A0B
            com.whatsapp.conversation.conversationrow.nativeflow.CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1 r3 = new com.whatsapp.conversation.conversationrow.nativeflow.CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass3MX.A1Q(r3, r0)
            return
        L_0x039e:
            java.lang.Object r2 = r1.A01
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r6 = r1.A02
            X.3wG r6 = (X.C79923wG) r6
            java.lang.Object r5 = r1.A03
            X.206 r5 = (X.AnonymousClass206) r5
            if (r2 == 0) goto L_0x03c6
            X.1PQ r1 = r6.A02
            X.11P r0 = r6.A00
            long r3 = X.AnonymousClass11P.A01(r0)
            X.1PP r0 = r1.A02
            X.205 r2 = X.C17880vN.A0Z(r2, r0)
            r0 = 163(0xa3, float:2.28E-43)
            X.97n r1 = new X.97n
            r1.<init>(r2, r0, r3)
            X.121 r0 = r6.A01
            r0.BBY(r1)
        L_0x03c6:
            if (r5 == 0) goto L_0x0088
            long r1 = r5.A0x
            X.00H r0 = r6.A07
            java.lang.Object r0 = r0.get()
            X.2kQ r0 = (X.C58272kQ) r0
            r0.A01(r1)
            return
        L_0x03d6:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r2 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r2
            java.lang.Object r4 = r1.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r3 = r1.A03
            X.1DS r3 = (X.AnonymousClass1DS) r3
            X.1RL r1 = r2.A03
            r0 = r4
            X.1E2 r0 = (X.AnonymousClass1E2) r0
            java.lang.Boolean r1 = r1.A06(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0408
            X.3wU r2 = new X.3wU
            r2.<init>(r4)
        L_0x03f8:
            r3.A0E(r2)
            return
        L_0x03fc:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r2 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r2
            java.lang.Object r4 = r1.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r3 = r1.A03
            X.1DS r3 = (X.AnonymousClass1DS) r3
        L_0x0408:
            X.11S r0 = r2.A00
            r0.A0I()
            X.1E8 r1 = r0.A0D
            X.1M9 r0 = r2.A01
            X.1E7 r0 = r0.A0E(r4)
            if (r1 == 0) goto L_0x0088
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = X.AnonymousClass17K.A02(r1)
            if (r1 == 0) goto L_0x0088
            boolean r0 = r0.A0C()
            X.3wV r2 = new X.3wV
            r2.<init>(r1, r0)
            goto L_0x03f8
        L_0x0429:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r4 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r4
            java.lang.Object r3 = r1.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r2 = r1.A03
            X.1DS r2 = (X.AnonymousClass1DS) r2
            X.1M9 r0 = r4.A01
            X.1E7 r1 = r0.A0E(r3)
            if (r1 == 0) goto L_0x0088
            X.1Me r0 = r4.A02
            java.lang.String r0 = X.AnonymousClass3MX.A17(r0, r1)
            r2.A0E(r0)
            return
        L_0x0447:
            java.lang.Object r4 = r1.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            java.lang.Object r2 = r1.A02
            X.205 r2 = (X.AnonymousClass205) r2
            java.lang.Object r3 = r1.A03
            X.00H r0 = r4.A5R
            X.206 r1 = X.AnonymousClass1W2.A01(r2, r0)
            if (r1 == 0) goto L_0x0088
            X.1KB r6 = r4.A1L
            r0 = 33
            goto L_0x0550
        L_0x045f:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            java.lang.Object r9 = r1.A02
            X.205 r9 = (X.AnonymousClass205) r9
            java.lang.Object r5 = r1.A03
            X.3uR r5 = (X.C79093uR) r5
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r2)
            X.00H r0 = r0.A01
            java.lang.Object r4 = r0.get()
            X.4X0 r4 = (X.AnonymousClass4X0) r4
            com.whatsapp.KeyboardPopupLayout r7 = r2.A1M
            android.view.View r6 = r5.A0j
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.C18070vi.A0k(r7, r6)
            X.1BI r0 = r9.A00
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x04ad
            X.4DC r8 = X.AnonymousClass4DC.CHANNELS
        L_0x048c:
            X.0vl r3 = r4.A04
            java.lang.Object r0 = r3.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L_0x0517
            int r1 = r8.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x04ec
            r0 = 2
            if (r1 == r0) goto L_0x04e9
            r0 = 3
            if (r1 == r0) goto L_0x04e6
            r0 = 4
            if (r1 == r0) goto L_0x04e3
            X.C0L r1 = X.C0L.A0q
            goto L_0x04ee
        L_0x04ad:
            int r0 = r6.getWidth()
            float r3 = (float) r0
            float r0 = X.C72473Md.A00(r7)
            float r3 = r3 / r0
            int r0 = r6.getHeight()
            float r2 = (float) r0
            float r0 = X.C72473Md.A00(r7)
            float r2 = r2 / r0
            r1 = 1125515264(0x43160000, float:150.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x04d0
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x04d0
            X.4DC r8 = X.AnonymousClass4DC.COMPACT_TALL
            goto L_0x048c
        L_0x04d0:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x04d7
            X.4DC r8 = X.AnonymousClass4DC.COMPACT
            goto L_0x048c
        L_0x04d7:
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x04e0
            X.4DC r8 = X.AnonymousClass4DC.TALL
            goto L_0x048c
        L_0x04e0:
            X.4DC r8 = X.AnonymousClass4DC.DEFAULT
            goto L_0x048c
        L_0x04e3:
            X.C0L r1 = X.C0L.A0n
            goto L_0x04ee
        L_0x04e6:
            X.C0L r1 = X.C0L.A0p
            goto L_0x04ee
        L_0x04e9:
            X.C0L r1 = X.C0L.A0r
            goto L_0x04ee
        L_0x04ec:
            X.C0L r1 = X.C0L.A0o
        L_0x04ee:
            X.A1I r0 = r4.A03     // Catch:{ Exception -> 0x0509 }
            java.io.FileInputStream r1 = X.C88574a9.A01(r0, r1)     // Catch:{ Exception -> 0x0509 }
            r0 = 0
            X.1yu r0 = X.C39771tc.A04(r1, r0)     // Catch:{ Exception -> 0x0509 }
            java.lang.Object r1 = r0.A00     // Catch:{ Exception -> 0x0509 }
            X.1tf r1 = (X.C39801tf) r1     // Catch:{ Exception -> 0x0509 }
            if (r1 == 0) goto L_0x0517
            java.lang.Object r0 = r3.getValue()     // Catch:{ Exception -> 0x0509 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ Exception -> 0x0509 }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x0509 }
            goto L_0x0517
        L_0x0509:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NyeAnimation/loadAnimationAsset "
            java.lang.String r0 = X.AnonymousClass001.A1E(r8, r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0517:
            java.lang.Object r0 = r3.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x0088
            X.1KB r0 = r4.A00
            r10 = 10
            X.Akd r3 = new X.Akd
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x052c:
            r0.A0J(r3)
            return
        L_0x0530:
            java.lang.Object r4 = r1.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            java.lang.Object r0 = r1.A02
            X.4OZ[] r0 = (X.AnonymousClass4OZ[]) r0
            java.lang.Object r3 = r1.A03
            r2 = 0
            r0 = r0[r2]
            X.0vl r0 = r0.A02
            X.1Fz r1 = X.AnonymousClass3MX.A18(r0)
            X.1Ho r0 = X.C23761Hn.A01
            X.AnonymousClass3Ma.A1N(r1, r2, r0)
            androidx.lifecycle.CoroutineLiveData r1 = X.C87324Vd.A00(r0, r1)
            X.1KB r6 = r4.A1L
            r0 = 28
        L_0x0550:
            X.4rb r5 = new X.4rb
            r5.<init>(r4, r1, r3, r0)
            goto L_0x05ad
        L_0x0556:
            java.lang.Object r5 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            java.lang.Object r7 = r1.A02
            android.text.SpannableStringBuilder r7 = (android.text.SpannableStringBuilder) r7
            java.lang.Object r8 = r1.A03
            X.1RK r0 = r5.A23
            java.util.ArrayList r0 = r0.A06()
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 != 0) goto L_0x0088
            X.00H r0 = r5.A3e
            java.lang.Object r0 = r0.get()
            X.4Rm r0 = (X.C86404Rm) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0088
            android.content.Context r2 = r5.A1n()
            r0 = 2131232290(0x7f080622, float:1.8080685E38)
            android.text.style.ImageSpan r1 = new android.text.style.ImageSpan
            r1.<init>(r2, r0)
            java.lang.String r0 = " X"
            r7.append(r0)
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            r4 = 0
            X.3Nn r3 = new X.3Nn
            r3.<init>(r0, r4)
            int r2 = r7.length()
            r1 = 1
            int r2 = r2 - r1
            int r0 = r7.length()
            r7.setSpan(r3, r2, r0, r4)
            r5.A3n = r1
            X.1KB r6 = r5.A0r
            r0 = 12
            X.3Bw r5 = new X.3Bw
            r5.<init>(r8, r7, r0)
        L_0x05ad:
            r6.A0J(r5)
            return
        L_0x05b1:
            X.1KB r1 = r4.A0S
            r0 = 2131890112(0x7f120fc0, float:1.9414907E38)
            r1.A05(r0)
            return
        L_0x05ba:
            java.lang.Object r5 = r1.A01
            X.3uP r5 = (X.AnonymousClass3uP) r5
            java.lang.Object r4 = r1.A02
            android.content.Intent r4 = (android.content.Intent) r4
            java.lang.Object r3 = r1.A03
            android.content.Context r3 = (android.content.Context) r3
            X.00H r0 = r5.A1o
            java.lang.Object r2 = r0.get()
            X.4RV r2 = (X.AnonymousClass4RV) r2
            X.00H r0 = r5.A2Q
            java.lang.Object r0 = r0.get()
            X.1Oe r0 = (X.C25431Oe) r0
            java.lang.String r1 = r0.A03()
            java.lang.String r0 = "ConversationRow"
            r2.A00(r4, r0, r1)
            X.1L9 r0 = r5.A0Q
            r0.A08(r3, r4)
            return
        L_0x05e5:
            java.lang.Object r3 = r1.A01
            X.3u1 r3 = (X.C78973u1) r3
            java.lang.Object r2 = r1.A02
            X.20i r2 = (X.C436420i) r2
            java.lang.Object r0 = r1.A03
            X.1EC r0 = (X.AnonymousClass1EC) r0
            r3.A2k(r0, r2)
            return
        L_0x05f5:
            java.lang.Object r3 = r1.A01
            X.3u2 r3 = (X.C78983u2) r3
            java.lang.Object r2 = r1.A02
            X.2rc r2 = (X.C62572rc) r2
            java.lang.Object r1 = r1.A03
            X.21t r1 = (X.C440021t) r1
            boolean r0 = X.C78983u2.A0F(r2)
            X.C78983u2.A03(r2, r3, r1, r0)
            return
        L_0x0609:
            java.lang.Object r3 = r1.A01
            X.2Dk r3 = (X.C46162Dk) r3
            java.lang.Object r2 = r1.A02
            X.3sq r2 = (X.C78463sq) r2
            java.lang.Object r0 = r1.A03
            android.content.Context r0 = (android.content.Context) r0
            X.C78463sq.setupShareToMyStatusButton$lambda$14$lambda$13(r3, r2, r0)
            return
        L_0x0619:
            java.lang.Object r3 = r1.A01
            X.8nU r3 = (X.AnonymousClass8nU) r3
            java.lang.Object r2 = r1.A02
            java.lang.Object r5 = r1.A03
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            r11 = 1
            X.C18070vi.A0d(r2, r11)
            X.00H r0 = r3.getWamPsStructuredMessageInteractionReporter()
            java.lang.Object r4 = r0.get()
            X.9lB r4 = (X.C190579lB) r4
            java.lang.String r7 = r2.toString()
            X.1PM r1 = r3.A0k
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r5)
            X.1yf r0 = r1.A01(r0)
            int r0 = X.A78.A00(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9 = 37
            r10 = 4
            r12 = r11
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0650:
            java.lang.Object r3 = r1.A01
            X.8nW r3 = (X.AnonymousClass8nW) r3
            java.lang.Object r2 = r1.A02
            X.23j r2 = (X.C444223j) r2
            java.lang.Object r0 = r1.A03
            X.1EC r0 = (X.AnonymousClass1EC) r0
            r3.A2k(r0, r2)
            return
        L_0x0660:
            java.lang.Object r2 = r1.A01
            X.3uU r2 = (X.AnonymousClass3uU) r2
            java.lang.Object r3 = r1.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r4 = r1.A03
            X.4kt r0 = r2.A00
            X.1M9 r0 = r0.A09
            X.1E7 r5 = r0.A0H(r3)
            X.1KB r0 = r2.A05
            r6 = 14
            goto L_0x083a
        L_0x0678:
            java.lang.Object r2 = r1.A01
            X.4By r2 = (X.AnonymousClass4By) r2
            java.lang.Object r3 = r1.A02
            X.20i r3 = (X.C436420i) r3
            java.lang.Object r4 = r1.A03
            X.1EC r4 = (X.AnonymousClass1EC) r4
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r2.getCommunityWamEventHelper()
            java.lang.Object r1 = r0.get()
            X.1ub r1 = (X.C40371ub) r1
            X.1gd r0 = r2.getCommunityMembersManager()
            goto L_0x06f3
        L_0x0697:
            java.lang.Object r2 = r1.A01
            X.4C1 r2 = (X.AnonymousClass4C1) r2
            java.lang.Object r3 = r1.A02
            X.20i r3 = (X.C436420i) r3
            java.lang.Object r4 = r1.A03
            X.1EC r4 = (X.AnonymousClass1EC) r4
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r2.getCommunityWamEventHelper()
            java.lang.Object r1 = r0.get()
            X.1ub r1 = (X.C40371ub) r1
            X.1gd r0 = r2.getCommunityMembersManager()
            goto L_0x06f3
        L_0x06b6:
            java.lang.Object r2 = r1.A01
            X.4Bz r2 = (X.AnonymousClass4Bz) r2
            java.lang.Object r3 = r1.A02
            X.20i r3 = (X.C436420i) r3
            java.lang.Object r4 = r1.A03
            X.1EC r4 = (X.AnonymousClass1EC) r4
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r2.getCommunityWamEventHelper()
            java.lang.Object r1 = r0.get()
            X.1ub r1 = (X.C40371ub) r1
            X.1gd r0 = r2.getCommunityMembersManager()
            goto L_0x06f3
        L_0x06d5:
            java.lang.Object r2 = r1.A01
            X.4C0 r2 = (X.AnonymousClass4C0) r2
            java.lang.Object r3 = r1.A02
            X.20i r3 = (X.C436420i) r3
            java.lang.Object r4 = r1.A03
            X.1EC r4 = (X.AnonymousClass1EC) r4
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r2.getCommunityWamEventHelper()
            java.lang.Object r1 = r0.get()
            X.1ub r1 = (X.C40371ub) r1
            X.1gd r0 = r2.getCommunityMembersManager()
        L_0x06f3:
            int r0 = r0.BVA(r4)
            r1.A0C(r3, r0)
            return
        L_0x06fb:
            java.lang.Object r3 = r1.A01
            X.5cS r3 = (X.C108885cS) r3
            java.lang.Object r2 = r1.A02
            X.AEF r2 = (X.AEF) r2
            java.lang.Object r0 = r1.A03
            X.206 r0 = (X.AnonymousClass206) r0
            r3.CHc(r0, r2)
            return
        L_0x070b:
            java.lang.Object r0 = r1.A01
            X.8Ce r0 = (X.C161198Ce) r0
            java.lang.Object r2 = r1.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r1.A03
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r0 = r0.A01
            X.4Zw r0 = (X.C88484Zw) r0
            X.C88484Zw.A00(r2, r0, r1)
            return
        L_0x071f:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            java.lang.Object r3 = r1.A02
            X.1DS r3 = (X.AnonymousClass1DS) r3
            java.lang.Object r2 = r1.A03
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r0)
            r0 = 13
            X.C91594fw.A00(r1, r3, r2, r0)
            return
        L_0x0733:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            java.lang.Object r3 = r1.A02
            X.23z r3 = (X.C445823z) r3
            java.lang.Object r2 = r1.A03
            X.1GP r2 = (X.AnonymousClass1GP) r2
            r0.A32(r3)
            r1 = 0
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.4Cx r0 = X.C82984Cx.NONE
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C83664Ge.A00(r3, r1, r0)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            X.C20098A7b.A03(r1, r2, r0)
            return
        L_0x0753:
            java.lang.Object r3 = r1.A01
            X.AVl r3 = (X.C20705AVl) r3
            java.lang.Object r2 = r1.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r0 = r1.A03
            X.2sw r0 = (X.C63362sw) r0
            r2.getRawString()
            X.205 r1 = r0.A0B
            r0 = 0
            X.C20705AVl.A02(r3, r2, r1, r0)
            return
        L_0x0769:
            java.lang.Object r0 = r1.A01
            X.AWv r0 = (X.C20740AWv) r0
            java.lang.Object r3 = r1.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r2 = r1.A03
            X.205 r2 = (X.AnonymousClass205) r2
            r3.getRawString()
            X.AVl r1 = r0.A00
            r0 = 1
            X.C20705AVl.A02(r1, r3, r2, r0)
            return
        L_0x077f:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            java.lang.Object r0 = r1.A02
            X.1BI r0 = (X.AnonymousClass1BI) r0
            java.lang.Object r2 = r1.A03
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            if (r0 == 0) goto L_0x0791
            com.whatsapp.conversationslist.ConversationsFragment.A0i(r3, r0)
            return
        L_0x0791:
            X.11t r1 = r3.A17
            android.view.View r0 = r3.A17()
            r1.CAs(r0, r3, r2)
            return
        L_0x079b:
            java.lang.Object r5 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            java.lang.Object r4 = r1.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r1.A03
            X.1wM r3 = (X.C41421wM) r3
            X.00H r0 = r5.A3c
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r2.setClassName(r1, r0)
            r0 = 13
            r5.startActivityForResult(r2, r0)
            r0 = 1
            r5.A3l = r0
            r1 = 17
            X.4dF r0 = new X.4dF
            r0.<init>(r5, r1)
            r3.setOnLockedClickListener(r0)
            return
        L_0x07c9:
            java.lang.Object r10 = r1.A01
            X.1ju r10 = (X.C34091ju) r10
            java.lang.Object r9 = r1.A02
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r11 = r1.A03
            java.util.Map r11 = (java.util.Map) r11
            java.util.Iterator r8 = r9.iterator()
        L_0x07d9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0803
            X.1BI r7 = X.C17880vN.A0Q(r8)
            java.lang.Object r0 = r11.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x07d9
            com.whatsapp.conversationslist.ConversationsFragment r6 = r10.A0Q
            X.1px r5 = r6.A1Z
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x07ff
            X.11P r0 = r6.A1q
            long r3 = X.AnonymousClass11P.A01(r0)
        L_0x07ff:
            r5.A01(r7, r3)
            goto L_0x07d9
        L_0x0803:
            r0 = 0
            X.C34091ju.A00(r10, r9, r0)
            return
        L_0x0808:
            java.lang.Object r6 = r1.A01
            X.1px r6 = (X.C37681px) r6
            java.lang.Object r5 = r1.A02
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r0 = r1.A03
            long r3 = X.C17880vN.A05(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0822
            X.11P r0 = r6.A05
            long r3 = X.AnonymousClass11P.A01(r0)
        L_0x0822:
            r6.A01(r5, r3)
            return
        L_0x0826:
            java.lang.Object r2 = r1.A01
            X.1px r2 = (X.C37681px) r2
            java.lang.Object r3 = r1.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r4 = r1.A03
            X.1Co r0 = r2.A06
            java.lang.Long r5 = r0.A03(r3)
            X.1KB r0 = r2.A01
            r6 = 21
        L_0x083a:
            X.3Cr r1 = new X.3Cr
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.A0J(r1)
            return
        L_0x0843:
            java.lang.Object r5 = r1.A01
            X.1rQ r5 = (X.C38521rQ) r5
            java.lang.Object r4 = r1.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r1.A03
            X.1x1 r3 = (X.C41761x1) r3
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            X.1rO r2 = r5.A04
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x086a
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x086a
            android.content.Context r1 = X.AnonymousClass3MY.A04(r4)
            r0 = 0
            r2.A02(r1, r3, r0)
            return
        L_0x086a:
            androidx.fragment.app.Fragment r2 = r5.A01
            r1 = 9
            com.whatsapp.favorites.FavoriteBottomSheetFragment r0 = new com.whatsapp.favorites.FavoriteBottomSheetFragment
            r0.<init>()
            X.C72473Md.A1A(r0, r1)
            X.C137086ut.A01(r0, r2)
            return
        L_0x087a:
            java.lang.Object r5 = r1.A01
            com.whatsapp.crop.CropImage r5 = (com.whatsapp.crop.CropImage) r5
            java.lang.Object r7 = r1.A02
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r8 = r1.A03
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            X.10I r3 = r5.A05
            android.net.Uri r9 = r5.A0E
            android.graphics.Bitmap$CompressFormat r6 = r5.A09
            int r11 = r5.A03
            boolean r15 = r5.A0V
            int r12 = r5.A02
            int r13 = r5.A07
            X.00H r0 = r5.A0Q
            java.lang.Object r10 = r0.get()
            X.2ib r10 = (X.C57142ib) r10
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = "composerToolToOpenOnComplete"
            r0 = -1
            int r14 = r2.getIntExtra(r1, r0)
            X.49W r4 = new X.49W
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.C17890vO.A0u(r4, r3)
            return
        L_0x08b0:
            java.lang.Object r11 = r1.A01
            com.whatsapp.crop.CropImage r11 = (com.whatsapp.crop.CropImage) r11
            java.lang.Object r7 = r1.A02
            android.content.Intent r7 = (android.content.Intent) r7
            java.lang.Object r2 = r1.A03
            android.graphics.Point r2 = (android.graphics.Point) r2
            java.lang.String r5 = "x"
            android.net.Uri r4 = r7.getData()
            X.11C r0 = r11.A0I     // Catch:{ IOException -> 0x0b1e }
            X.11B r0 = r0.A0O()     // Catch:{ IOException -> 0x0b1e }
            int r0 = X.C26511Sk.A00(r4, r0)     // Catch:{ IOException -> 0x0b1e }
            r11.A02 = r0     // Catch:{ IOException -> 0x0b1e }
            android.graphics.Matrix r3 = X.C26511Sk.A08(r0)     // Catch:{ IOException -> 0x0b1e }
            r11.A0C = r3     // Catch:{ IOException -> 0x0b1e }
            boolean r0 = r11.A0W     // Catch:{ IOException -> 0x0b1e }
            if (r0 == 0) goto L_0x08e9
            int r1 = r11.A02     // Catch:{ IOException -> 0x0b1e }
            r0 = 6
            if (r1 == r0) goto L_0x08e1
            r0 = 8
            if (r1 != r0) goto L_0x08e9
        L_0x08e1:
            int r1 = r11.A00     // Catch:{ IOException -> 0x0b1e }
            int r0 = r11.A01     // Catch:{ IOException -> 0x0b1e }
            r11.A00 = r0     // Catch:{ IOException -> 0x0b1e }
            r11.A01 = r1     // Catch:{ IOException -> 0x0b1e }
        L_0x08e9:
            if (r3 != 0) goto L_0x08f2
            android.graphics.Matrix r0 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0b1e }
            r0.<init>()     // Catch:{ IOException -> 0x0b1e }
            r11.A0C = r0     // Catch:{ IOException -> 0x0b1e }
        L_0x08f2:
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0b1e }
            r13.<init>()     // Catch:{ IOException -> 0x0b1e }
            r0 = 1
            r8 = 0
            if (r4 == 0) goto L_0x09ea
            X.1Nq r1 = r11.A0O     // Catch:{ IOException -> 0x0b1e }
            java.io.InputStream r3 = r1.A0A(r4, r0)     // Catch:{ IOException -> 0x0b1e }
            r13.inJustDecodeBounds = r0     // Catch:{ all -> 0x09e0 }
            r1 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r1, r13)     // Catch:{ all -> 0x09e0 }
            int r1 = r13.outWidth     // Catch:{ all -> 0x09e0 }
            if (r1 <= 0) goto L_0x09cb
            int r1 = r13.outHeight     // Catch:{ all -> 0x09e0 }
            if (r1 <= 0) goto L_0x09cb
            r3.close()     // Catch:{ IOException -> 0x0b1e }
            X.1Nq r1 = r11.A0O     // Catch:{ OutOfMemoryError -> 0x09b8 }
            java.io.InputStream r3 = r1.A0A(r4, r0)     // Catch:{ OutOfMemoryError -> 0x09b8 }
            r13.inDither = r0     // Catch:{ all -> 0x09ae }
            r13.inScaled = r8     // Catch:{ all -> 0x09ae }
            int r15 = r2.x     // Catch:{ all -> 0x09ae }
            int r4 = r2.y     // Catch:{ all -> 0x09ae }
            X.0ve r2 = r11.A01     // Catch:{ all -> 0x09ae }
            android.view.WindowManager r1 = r11.getWindowManager()     // Catch:{ all -> 0x09ae }
            java.lang.Long r14 = X.C84034Hp.A00(r1, r2)     // Catch:{ all -> 0x09ae }
            X.25O r12 = new X.25O     // Catch:{ all -> 0x09ae }
            r16 = r4
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09ae }
            X.25P r1 = X.AnonymousClass204.A0B(r12, r3)     // Catch:{ all -> 0x09ae }
            android.graphics.Bitmap r1 = r1.A02     // Catch:{ all -> 0x09ae }
            r11.A0A = r1     // Catch:{ all -> 0x09ae }
            int r4 = r13.inSampleSize     // Catch:{ all -> 0x09ae }
            r11.A08 = r4     // Catch:{ all -> 0x09ae }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x09ae }
            java.lang.String r1 = "CropImage/prepareCropInBackground/bitmap orientation:"
            r2.append(r1)     // Catch:{ all -> 0x09ae }
            int r1 = r11.A02     // Catch:{ all -> 0x09ae }
            r2.append(r1)     // Catch:{ all -> 0x09ae }
            java.lang.String r1 = " "
            r2.append(r1)     // Catch:{ all -> 0x09ae }
            int r1 = r13.outWidth     // Catch:{ all -> 0x09ae }
            r2.append(r1)     // Catch:{ all -> 0x09ae }
            r2.append(r5)     // Catch:{ all -> 0x09ae }
            int r1 = r13.outHeight     // Catch:{ all -> 0x09ae }
            r2.append(r1)     // Catch:{ all -> 0x09ae }
            java.lang.String r1 = " sample:"
            X.C17900vP.A0j(r1, r2, r4)     // Catch:{ all -> 0x09ae }
            android.graphics.Rect r4 = r11.A0D     // Catch:{ all -> 0x09ae }
            if (r4 == 0) goto L_0x097e
            int r1 = r4.left     // Catch:{ all -> 0x09ae }
            int r2 = r11.A08     // Catch:{ all -> 0x09ae }
            int r1 = r1 / r2
            r4.left = r1     // Catch:{ all -> 0x09ae }
            int r1 = r4.top     // Catch:{ all -> 0x09ae }
            int r1 = r1 / r2
            r4.top = r1     // Catch:{ all -> 0x09ae }
            int r1 = r4.right     // Catch:{ all -> 0x09ae }
            int r1 = r1 / r2
            r4.right = r1     // Catch:{ all -> 0x09ae }
            int r1 = r4.bottom     // Catch:{ all -> 0x09ae }
            int r1 = r1 / r2
            r4.bottom = r1     // Catch:{ all -> 0x09ae }
        L_0x097e:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x09ae }
            java.lang.String r1 = "CropImage/prepareCropInBackground/bitmap:"
            r4.append(r1)     // Catch:{ all -> 0x09ae }
            android.graphics.Bitmap r1 = r11.A0A     // Catch:{ all -> 0x09ae }
            if (r1 != 0) goto L_0x0991
            java.lang.String r1 = "null"
        L_0x098d:
            X.C17890vO.A1A(r4, r1)     // Catch:{ all -> 0x09ae }
            goto L_0x09aa
        L_0x0991:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x09ae }
            int r1 = r1.getWidth()     // Catch:{ all -> 0x09ae }
            r2.append(r1)     // Catch:{ all -> 0x09ae }
            r2.append(r5)     // Catch:{ all -> 0x09ae }
            android.graphics.Bitmap r1 = r11.A0A     // Catch:{ all -> 0x09ae }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x09ae }
            java.lang.String r1 = X.C17880vN.A0t(r2, r1)     // Catch:{ all -> 0x09ae }
            goto L_0x098d
        L_0x09aa:
            r3.close()     // Catch:{ OutOfMemoryError -> 0x09b8 }
            goto L_0x09ea
        L_0x09ae:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x09b3 }
            goto L_0x09b7
        L_0x09b3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ OutOfMemoryError -> 0x09b8 }
        L_0x09b7:
            throw r1     // Catch:{ OutOfMemoryError -> 0x09b8 }
        L_0x09b8:
            r1 = move-exception
            java.lang.String r0 = "CropImage/oom"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0b1e }
            X.1KB r2 = r11.A0G     // Catch:{ IOException -> 0x0b1e }
            r1 = 14
            X.3Bq r0 = new X.3Bq     // Catch:{ IOException -> 0x0b1e }
            r0.<init>(r11, r1)     // Catch:{ IOException -> 0x0b1e }
            r2.A0J(r0)     // Catch:{ IOException -> 0x0b1e }
            return
        L_0x09cb:
            java.lang.String r0 = "CropImage/prepareCropInBackground/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09e0 }
            X.1KB r2 = r11.A0G     // Catch:{ all -> 0x09e0 }
            r1 = 13
            X.3Bq r0 = new X.3Bq     // Catch:{ all -> 0x09e0 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x09e0 }
            r2.A0J(r0)     // Catch:{ all -> 0x09e0 }
            r3.close()     // Catch:{ IOException -> 0x0b1e }
            return
        L_0x09e0:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x09e5 }
            goto L_0x09e9
        L_0x09e5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0b1e }
        L_0x09e9:
            throw r1     // Catch:{ IOException -> 0x0b1e }
        L_0x09ea:
            android.graphics.Bitmap r1 = r11.A0A
            if (r1 == 0) goto L_0x0b0f
            int r1 = r1.getWidth()
            if (r1 == 0) goto L_0x0b0f
            android.graphics.Bitmap r1 = r11.A0A
            int r1 = r1.getHeight()
            if (r1 == 0) goto L_0x0b0f
            java.lang.String r1 = "rotation"
            int r6 = r7.getIntExtra(r1, r8)
            java.lang.String r1 = "flipH"
            boolean r3 = r7.getBooleanExtra(r1, r8)
            java.lang.String r1 = "flipV"
            boolean r2 = r7.getBooleanExtra(r1, r8)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "CropImage/onCreate/bitmap add-rotation:"
            r4.append(r1)
            r4.append(r6)
            java.lang.String r1 = " flip-h:"
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = " flip-v:"
            X.C17900vP.A0n(r1, r4, r2)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r11.A0B = r1
            r5 = 9
            if (r3 == 0) goto L_0x0a44
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            float[] r1 = new float[r5]
            r1 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            r4.setValues(r1)
            android.graphics.Matrix r1 = r11.A0B
            r1.postConcat(r4)
        L_0x0a44:
            if (r2 == 0) goto L_0x0a58
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            float[] r1 = new float[r5]
            r1 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            r4.setValues(r1)
            android.graphics.Matrix r1 = r11.A0B
            r1.postConcat(r4)
        L_0x0a58:
            if (r6 == 0) goto L_0x0a60
            android.graphics.Matrix r4 = r11.A0B
            float r1 = (float) r6
            r4.postRotate(r1)
        L_0x0a60:
            android.graphics.Matrix r4 = r11.A0B
            int r1 = r11.A07
            float r1 = (float) r1
            r4.postRotate(r1)
            android.graphics.Bitmap r4 = r11.A0A
            X.4MX r1 = new X.4MX
            r1.<init>()
            r1.A00 = r4
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            android.graphics.Matrix r4 = r11.A0C
            r5.set(r4)
            android.graphics.Matrix r4 = r11.A0B
            r5.postConcat(r4)
            r1.A01 = r5
            java.lang.String r4 = "filter"
            int r6 = r7.getIntExtra(r4, r8)
            if (r6 == 0) goto L_0x0a96
            android.graphics.Bitmap r5 = r11.A0A
            X.2E5 r4 = r11.A0M
            android.graphics.Bitmap r4 = com.whatsapp.filter.FilterUtils.A00(r5, r4, r6, r8)
            r11.A0A = r4
            r1.A00 = r4
        L_0x0a96:
            java.lang.String r4 = "doodle"
            java.lang.String r18 = r7.getStringExtra(r4)
            if (r18 == 0) goto L_0x0af9
            X.1KW r14 = r11.A0N
            X.0vb r13 = r11.A00
            X.1Sw r5 = r11.A0P
            X.0ve r15 = r11.A01
            X.1Nq r4 = r11.A0O
            X.1T1 r12 = r11.A0F
            X.6yp r10 = X.C1409573s.A06
            r16 = r4
            r17 = r5
            X.73s r8 = r10.A02(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r8 == 0) goto L_0x0af9
            android.graphics.Bitmap r4 = r11.A0A
            if (r4 == 0) goto L_0x0acc
            boolean r4 = r4.isMutable()
            if (r4 != 0) goto L_0x0acc
            android.graphics.Bitmap r5 = r11.A0A
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = r5.copy(r4, r0)
            r11.A0A = r0
            r1.A00 = r0
        L_0x0acc:
            android.graphics.Bitmap r7 = r11.A0A
            if (r7 == 0) goto L_0x0af9
            int r9 = r8.A00
            android.graphics.Matrix r4 = r1.A01
            r10 = 0
            if (r4 == 0) goto L_0x0af0
            r0 = 2
            float[] r6 = new float[r0]
            r6 = {0, 1065353216} // fill-array
            r4.mapVectors(r6)
            r5 = r6[r10]
            r4 = 0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0b06
            r0 = 1
            r0 = r6[r0]
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0af0
            r10 = 180(0xb4, float:2.52E-43)
        L_0x0af0:
            int r9 = r9 + r10
            int r0 = r11.A07
            int r9 = r9 + r0
            int r0 = r9 % 360
            r8.A08(r7, r0, r3, r2)
        L_0x0af9:
            X.1KB r3 = r11.A0G
            r0 = 29
            X.3Bw r2 = new X.3Bw
            r2.<init>(r11, r1, r0)
        L_0x0b02:
            r3.A0J(r2)
            return
        L_0x0b06:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r10 = 270(0x10e, float:3.78E-43)
            if (r0 <= 0) goto L_0x0af0
            r10 = 90
            goto L_0x0af0
        L_0x0b0f:
            java.lang.String r0 = "CropImage/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r3 = r11.A0G
            r0 = 15
            X.3Bq r2 = new X.3Bq
            r2.<init>(r11, r0)
            goto L_0x0b02
        L_0x0b1e:
            r3 = move-exception
            X.1KB r2 = r11.A0G
            r1 = 28
            X.3Bw r0 = new X.3Bw
            r0.<init>(r11, r3, r1)
            r2.A0J(r0)
            return
        L_0x0b2c:
            java.lang.Object r0 = r1.A01
            X.1P3 r0 = (X.AnonymousClass1P3) r0
            java.lang.Object r3 = r1.A02
            X.2nE r3 = (X.C60002nE) r3
            java.lang.Object r2 = r1.A03
            X.9zg r2 = (X.C199249zg) r2
            X.00H r0 = r0.A0P
            java.lang.Object r1 = r0.get()
            monitor-enter(r1)
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0b4a }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x0b4a }
            r0.A03(r2, r3)     // Catch:{ all -> 0x0b4a }
            monitor-exit(r1)     // Catch:{ all -> 0x0b4a }
            return
        L_0x0b4a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0b4a }
            throw r0
        L_0x0b4d:
            java.lang.Object r0 = r1.A01
            X.1P3 r0 = (X.AnonymousClass1P3) r0
            java.lang.Object r4 = r1.A02
            X.2nE r4 = (X.C60002nE) r4
            java.lang.Object r2 = r1.A03
            byte[] r2 = (byte[]) r2
            X.00H r0 = r0.A0P
            java.lang.Object r3 = r0.get()
            monitor-enter(r3)
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0b6f }
            X.2nN r1 = (X.C60092nN) r1     // Catch:{ IOException -> 0x0b6f }
            X.9zg r0 = new X.9zg     // Catch:{ IOException -> 0x0b6f }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0b6f }
            r1.A03(r0, r4)     // Catch:{ IOException -> 0x0b6f }
            goto L_0x0b85
        L_0x0b6f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0b87 }
            java.lang.String r0 = "SignalCoordinator/storeSession for "
            r1.append(r0)     // Catch:{ all -> 0x0b87 }
            r1.append(r4)     // Catch:{ all -> 0x0b87 }
            java.lang.String r0 = " failed to update"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0b87 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0b87 }
        L_0x0b85:
            monitor-exit(r3)     // Catch:{ all -> 0x0b87 }
            return
        L_0x0b87:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0b87 }
            throw r0
        L_0x0b8a:
            java.lang.Object r0 = r1.A01
            X.3An r0 = (X.C70303An) r0
            java.lang.Object r2 = r1.A02
            X.Abw r2 = (X.C20942Abw) r2
            java.lang.Object r1 = r1.A03
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r2 != 0) goto L_0x0b99
            r2 = 0
        L_0x0b99:
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1KF r0 = (X.AnonymousClass1KF) r0
            r0.A03(r2, r1)
            return
        L_0x0ba5:
            java.lang.Object r0 = r1.A01
            X.6oQ r0 = (X.C133256oQ) r0
            java.lang.Object r2 = r1.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r1 = r1.A03
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.0vl r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            X.1Ln r0 = (X.C24751Ln) r0
            X.1E1 r2 = (X.AnonymousClass1E1) r2
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            r0.A0P(r2, r1)
            return
        L_0x0bc1:
            java.lang.Object r1 = r8.get(r5)
            X.77d r1 = (X.C1418377d) r1
            r0 = 81
            goto L_0x0bd2
        L_0x0bca:
            java.lang.Object r1 = X.C29431cG.A0b(r8)
            X.77d r1 = (X.C1418377d) r1
            r0 = 17
        L_0x0bd2:
            X.AnonymousClass3tR.A02(r7, r1, r0)
            return
        L_0x0bd6:
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0c49 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0c49 }
            java.lang.String r1 = X.C63702tY.A02     // Catch:{ all -> 0x0c49 }
            java.lang.String r0 = "MessageAddOnStore/getPinnedMessageAddOnsCountInChat"
            android.database.Cursor r2 = r2.A0A(r1, r0, r6)     // Catch:{ all -> 0x0c49 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0c3d }
            if (r0 == 0) goto L_0x0bef
            java.lang.String r0 = "count"
            int r5 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0c3d }
        L_0x0bef:
            r2.close()     // Catch:{ all -> 0x0c49 }
            r3.close()
            r2 = 0
            if (r5 < r4) goto L_0x0bf9
            r2 = 1
        L_0x0bf9:
            X.00H r0 = r8.A06
            java.lang.Object r1 = r0.get()
            X.4XQ r1 = (X.AnonymousClass4XQ) r1
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            X.11E r0 = r1.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0c28
            java.lang.Integer r6 = X.AnonymousClass00R.A01
        L_0x0c0d:
            X.1KB r0 = r8.A00
            r10 = 16
            X.3Cr r5 = new X.3Cr
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            r0.CGP(r5)
            X.2r7 r3 = r8.A02
            X.10s r2 = r3.A01
            r1 = 17
            X.Ak0 r0 = new X.Ak0
            r0.<init>(r3, r9, r1)
            r2.execute(r0)
            return
        L_0x0c28:
            boolean r0 = X.AnonymousClass4XQ.A00(r1, r9, r6)
            if (r0 != 0) goto L_0x0c31
            java.lang.Integer r6 = X.AnonymousClass00R.A0N
            goto L_0x0c0d
        L_0x0c31:
            if (r2 == 0) goto L_0x0c0d
            X.00H r0 = r1.A02
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            java.lang.Integer r6 = X.AnonymousClass00R.A0C
            goto L_0x0c0d
        L_0x0c3d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0c48
            r2.close()     // Catch:{ all -> 0x0c44 }
            goto L_0x0c48
        L_0x0c44:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0c49 }
        L_0x0c48:
            throw r1     // Catch:{ all -> 0x0c49 }
        L_0x0c49:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0c4e }
            throw r1
        L_0x0c4e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98714rb.run():void");
    }
}
