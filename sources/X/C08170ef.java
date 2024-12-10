package X;

/* renamed from: X.0ef  reason: invalid class name and case insensitive filesystem */
public final class C08170ef extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C04230Mj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08170ef(C04230Mj r2) {
        super(0);
        this.this$0 = r2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x000a A[EDGE_INSN: B:182:0x000a->B:178:0x000a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r4 = r17
            X.0Mj r3 = r4.this$0
            java.util.Set r0 = r3.A01
            java.util.Iterator r9 = r0.iterator()
        L_0x000a:
            boolean r0 = r9.hasNext()
            java.lang.String r16 = "visitChildren called on an unattached node"
            r8 = 1024(0x400, float:1.435E-42)
            r10 = 1
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r7 = r9.next()
            X.0ut r7 = (X.C17580ut) r7
            X.0XW r7 = (X.AnonymousClass0XW) r7
            X.0XW r6 = r7.A03
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x000a
            r5 = 0
        L_0x0024:
            boolean r0 = r6 instanceof X.C015408x
            if (r0 == 0) goto L_0x009f
            java.util.Set r0 = r3.A02
            r0.add(r6)
        L_0x002d:
            X.0XW r6 = X.AnonymousClass0QV.A00(r5)
        L_0x0031:
            if (r6 != 0) goto L_0x0024
            X.0XW r7 = r7.A03
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00cf
            X.0a9 r6 = X.C06970a9.A01()
            X.0XW r0 = r7.A02
            if (r0 == 0) goto L_0x0051
            r6.A0F(r0)
        L_0x0044:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x000a
            X.0XW r7 = X.C06970a9.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & r8
            if (r0 != 0) goto L_0x0057
        L_0x0051:
            X.AnonymousClass0QV.A06(r6, r7)
            goto L_0x0044
        L_0x0055:
            if (r7 == 0) goto L_0x0044
        L_0x0057:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x009c
            r5 = 0
        L_0x005d:
            boolean r0 = r7 instanceof X.C015408x
            if (r0 == 0) goto L_0x006d
            java.util.Set r0 = r3.A02
            r0.add(r7)
        L_0x0066:
            X.0XW r7 = X.AnonymousClass0QV.A00(r5)
        L_0x006a:
            if (r7 == 0) goto L_0x0044
            goto L_0x005d
        L_0x006d:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0066
            boolean r0 = r7 instanceof X.C014308l
            if (r0 == 0) goto L_0x0066
            r0 = r7
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x007c:
            if (r2 == 0) goto L_0x0099
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0088
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x008b
            r7 = r2
        L_0x0088:
            X.0XW r2 = r2.A02
            goto L_0x007c
        L_0x008b:
            X.0a9 r5 = X.AnonymousClass001.A10(r5)
            if (r7 == 0) goto L_0x0095
            r5.A0F(r7)
            r7 = 0
        L_0x0095:
            r5.A0F(r2)
            goto L_0x0088
        L_0x0099:
            if (r1 != r10) goto L_0x0066
            goto L_0x006a
        L_0x009c:
            X.0XW r7 = r7.A02
            goto L_0x0055
        L_0x009f:
            int r0 = r6.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x002d
            boolean r0 = r6 instanceof X.C014308l
            if (r0 == 0) goto L_0x002d
            r0 = r6
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x00ae:
            if (r2 == 0) goto L_0x00cb
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x00ba
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x00bd
            r6 = r2
        L_0x00ba:
            X.0XW r2 = r2.A02
            goto L_0x00ae
        L_0x00bd:
            X.0a9 r5 = X.AnonymousClass001.A10(r5)
            if (r6 == 0) goto L_0x00c7
            r5.A0F(r6)
            r6 = 0
        L_0x00c7:
            r5.A0F(r2)
            goto L_0x00ba
        L_0x00cb:
            if (r1 != r10) goto L_0x002d
            goto L_0x0031
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r16)
            throw r0
        L_0x00d4:
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A01
            r0.clear()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            X.0Mj r9 = r4.this$0
            java.util.Set r0 = r9.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x00e8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r8 = r15.next()
            X.0us r8 = (X.C17570us) r8
            r7 = r8
            X.0XW r7 = (X.AnonymousClass0XW) r7
            X.0XW r6 = r7.A03
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x01d9
            r14 = 1024(0x400, float:1.435E-42)
            r13 = 0
            r3 = 0
            r12 = 1
            r11 = 0
        L_0x0103:
            boolean r0 = r6 instanceof X.C015408x
            if (r0 == 0) goto L_0x01a1
            X.08x r6 = (X.C015408x) r6
            if (r13 == 0) goto L_0x010c
            r11 = 1
        L_0x010c:
            java.util.Set r0 = r9.A02
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0118
            r5.add(r6)
            r12 = 0
        L_0x0118:
            r13 = r6
        L_0x0119:
            X.0XW r6 = X.AnonymousClass0QV.A00(r3)
        L_0x011d:
            if (r6 != 0) goto L_0x0103
            X.0XW r7 = r7.A03
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x01e0
            X.0a9 r6 = X.C06970a9.A01()
            X.0XW r0 = r7.A02
            if (r0 == 0) goto L_0x013d
            r6.A0F(r0)
        L_0x0130:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0198
            X.0XW r7 = X.C06970a9.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0143
        L_0x013d:
            X.AnonymousClass0QV.A06(r6, r7)
            goto L_0x0130
        L_0x0141:
            if (r7 == 0) goto L_0x0130
        L_0x0143:
            int r0 = r7.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0195
            r3 = 0
        L_0x0149:
            boolean r0 = r7 instanceof X.C015408x
            if (r0 == 0) goto L_0x0166
            X.08x r7 = (X.C015408x) r7
            if (r13 == 0) goto L_0x0152
            r11 = 1
        L_0x0152:
            java.util.Set r0 = r9.A02
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x015e
            r5.add(r7)
            r12 = 0
        L_0x015e:
            r13 = r7
        L_0x015f:
            X.0XW r7 = X.AnonymousClass0QV.A00(r3)
        L_0x0163:
            if (r7 == 0) goto L_0x0130
            goto L_0x0149
        L_0x0166:
            int r0 = r7.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x015f
            boolean r0 = r7 instanceof X.C014308l
            if (r0 == 0) goto L_0x015f
            r0 = r7
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0175:
            if (r2 == 0) goto L_0x0192
            int r0 = r2.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0181
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x0184
            r7 = r2
        L_0x0181:
            X.0XW r2 = r2.A02
            goto L_0x0175
        L_0x0184:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            if (r7 == 0) goto L_0x018e
            r3.A0F(r7)
            r7 = 0
        L_0x018e:
            r3.A0F(r2)
            goto L_0x0181
        L_0x0192:
            if (r1 != r10) goto L_0x015f
            goto L_0x0163
        L_0x0195:
            X.0XW r7 = r7.A02
            goto L_0x0141
        L_0x0198:
            if (r12 == 0) goto L_0x00e8
            if (r11 == 0) goto L_0x01d1
            X.0CW r0 = X.C04500Nq.A00(r8)
            goto L_0x01db
        L_0x01a1:
            int r0 = r6.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0119
            boolean r0 = r6 instanceof X.C014308l
            if (r0 == 0) goto L_0x0119
            r0 = r6
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x01b0:
            if (r2 == 0) goto L_0x01cd
            int r0 = r2.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x01bc
            int r1 = r1 + 1
            if (r1 != r10) goto L_0x01bf
            r6 = r2
        L_0x01bc:
            X.0XW r2 = r2.A02
            goto L_0x01b0
        L_0x01bf:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            if (r6 == 0) goto L_0x01c9
            r3.A0F(r6)
            r6 = 0
        L_0x01c9:
            r3.A0F(r2)
            goto L_0x01bc
        L_0x01cd:
            if (r1 != r10) goto L_0x0119
            goto L_0x011d
        L_0x01d1:
            if (r13 == 0) goto L_0x01d9
            X.0CW r0 = r13.A0O()
            if (r0 != 0) goto L_0x01db
        L_0x01d9:
            X.0CW r0 = X.AnonymousClass0CW.Inactive
        L_0x01db:
            r8.Buq(r0)
            goto L_0x00e8
        L_0x01e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r16)
            throw r0
        L_0x01e5:
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A00
            r0.clear()
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x01f4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r2 = r3.next()
            X.08x r2 = (X.C015408x) r2
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x01f4
            X.0CW r1 = r2.A0O()
            r2.A0P()
            X.0CW r0 = r2.A0O()
            if (r1 != r0) goto L_0x0217
            boolean r0 = r5.contains(r2)
            if (r0 == 0) goto L_0x01f4
        L_0x0217:
            X.C04500Nq.A02(r2)
            goto L_0x01f4
        L_0x021b:
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A02
            r0.clear()
            r5.clear()
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0254
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x024d
            X.0Mj r0 = r4.this$0
            java.util.Set r0 = r0.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0246
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0246:
            java.lang.String r0 = "Unprocessed FocusTarget nodes"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x024d:
            java.lang.String r0 = "Unprocessed FocusEvent nodes"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0254:
            java.lang.String r0 = "Unprocessed FocusProperties nodes"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08170ef.invoke():java.lang.Object");
    }
}
