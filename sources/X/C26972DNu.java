package X;

import java.util.List;

/* renamed from: X.DNu  reason: case insensitive filesystem */
public class C26972DNu implements C28669EDl {
    public final int A00;
    public final C56 A01;
    public final COJ A02;

    public /* bridge */ /* synthetic */ E8A BFz(E9O e9o) {
        return A00(e9o, (List) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r3 == r4) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C26972DNu A00(X.E9O r6, java.util.List r7) {
        /*
            r5 = this;
            X.COJ r4 = r5.A02
            if (r4 == 0) goto L_0x001f
            X.E9O r2 = r4.A00
            r1 = r2
            if (r6 == 0) goto L_0x000f
            if (r2 == 0) goto L_0x000f
            X.E9O r2 = r2.Bie(r6)
        L_0x000f:
            java.util.List r0 = r4.A01
            if (r7 != r0) goto L_0x0019
            if (r2 != r1) goto L_0x0019
            r3 = r4
        L_0x0016:
            if (r3 != r4) goto L_0x0027
        L_0x0018:
            return r5
        L_0x0019:
            X.COJ r3 = new X.COJ
            r3.<init>(r2, r7)
            goto L_0x0016
        L_0x001f:
            r0 = 0
            if (r7 == 0) goto L_0x0018
            X.COJ r3 = new X.COJ
            r3.<init>(r0, r7)
        L_0x0027:
            X.C56 r2 = r5.A01
            int r1 = r5.A00
            X.DNu r0 = new X.DNu
            r0.<init>(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26972DNu.A00(X.E9O, java.util.List):X.DNu");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.CQO[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.CQO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.CQO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.CQO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.CQO} */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.CQO, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKO() {
        /*
            r19 = this;
            r0 = r19
            X.C56 r8 = r0.A01
            X.CQN r7 = r8.A00
            java.lang.Object r1 = r7.A00
            boolean r0 = X.AnonymousClass000.A1W(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01ac
            if (r1 != 0) goto L_0x01aa
            java.lang.String r1 = r7.A01
            r6 = 0
            java.lang.String r0 = "lispx"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 15
            java.lang.String r1 = r1.substring(r0)
        L_0x0029:
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0192 }
            r0 = 0
            com.facebook.minscript.compiler.interfaces.MinsCompilerResult r2 = com.facebook.minscript.compiler.MinsCompilerImpl$Helper.doCompileWithLispyOffsets(r1, r0, r0)     // Catch:{ UnsupportedEncodingException -> 0x0192 }
            java.nio.ByteBuffer r1 = r2.byteBuffer
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r1.order(r0)
            java.nio.ByteBuffer r3 = r2.byteBuffer
            java.util.HashMap r15 = r2.lispyOffsetMap
            java.nio.ByteBuffer r14 = r3.slice()
            java.nio.ByteOrder r0 = r3.order()
            r14.order(r0)
            int r4 = r3.capacity()
            int r2 = r14.getInt()
            short r5 = r14.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r1
            short r0 = r14.getShort()
            r1 = r1 & r0
            r0 = -1397639502(0xffffffffacb1b6b2, float:-5.050926E-12)
            if (r2 != r0) goto L_0x018a
            r2 = 1
            if (r5 != r2) goto L_0x018a
            if (r1 != 0) goto L_0x018a
            int r12 = r14.getInt()
            int r10 = r14.getInt()
            int r13 = r3.position()
            if (r12 > r4) goto L_0x0159
            if (r12 < r13) goto L_0x0151
            int r0 = r10 * 16
            int r13 = r13 + r0
            if (r13 > r12) goto L_0x0149
            X.CQO[] r9 = new X.CQO[r10]
            r4 = 0
            r11 = 0
        L_0x0084:
            r5 = 4
            if (r11 >= r10) goto L_0x00e0
            X.CQO r3 = new X.CQO
            r3.<init>()
            int r0 = r14.getInt()
            r3.A00 = r0
            int r0 = r14.getInt()
            r3.A02 = r0
            int r0 = r14.getInt()
            r3.A01 = r0
            r14.getInt()
            int r1 = r3.A02
            int r0 = r1 % r5
            r5 = 2
            if (r0 != 0) goto L_0x00ca
            int r0 = r3.A01
            if (r13 > r1) goto L_0x00b4
            int r1 = r1 + r0
            if (r1 > r12) goto L_0x00b4
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x0084
        L_0x00b4:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.C17880vN.A1T(r1, r11, r4)
            int r0 = r3.A00
            X.C17880vN.A1T(r1, r0, r2)
            java.lang.String r0 = "section index %d kind %d invalid offset/size"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00ca:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.C17880vN.A1T(r1, r11, r4)
            int r0 = r3.A00
            X.C17880vN.A1T(r1, r0, r2)
            java.lang.String r0 = "section index %d kind %d invalid alignment"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00e0:
            if (r10 < r5) goto L_0x0141
            r3 = 0
        L_0x00e3:
            r0 = r9[r3]
            int r0 = r0.A00
            if (r0 != r3) goto L_0x0131
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x00e3
            r0 = r9[r4]
            int r0 = r0.A01
            int r0 = r0 / 16
            java.util.concurrent.atomic.AtomicReferenceArray r4 = new java.util.concurrent.atomic.AtomicReferenceArray
            r4.<init>(r0)
            r0 = r9[r2]
            int r0 = r0.A01
            int r0 = r0 / 16
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r0)
            java.lang.String r13 = ""
            r2 = 4
        L_0x0106:
            if (r2 >= r10) goto L_0x0198
            r12 = r9[r2]
            int r0 = r12.A00
            if (r0 != r5) goto L_0x012e
            java.nio.ByteBuffer r11 = r14.duplicate()
            int r0 = r12.A02
            r11.position(r0)
            int r1 = r12.A02
            int r0 = r12.A01
            int r1 = r1 + r0
            r11.limit(r1)
            int r0 = r11.remaining()
            byte[] r1 = new byte[r0]
            r11.get(r1)
            java.nio.charset.Charset r0 = X.C25736Cl6.A06
            java.lang.String r13 = X.BE6.A0q(r0, r1)
        L_0x012e:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "missing required section "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r3)
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0141:
            java.lang.String r1 = "less than required number of sections"
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0149:
            java.lang.String r1 = "encoded size not enough for section headers"
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0151:
            java.lang.String r1 = "encoded size is too small"
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0159:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "buffer is smaller than encoded size "
            r1.append(r0)
            r1.append(r12)
            X.BE6.A1J(r1)
            r1.append(r4)
            java.lang.String r0 = " byteBuffer.order:"
            r1.append(r0)
            java.nio.ByteOrder r0 = r3.order()
            r1.append(r0)
            java.lang.String r0 = " native order:"
            r1.append(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x018a:
            java.lang.String r1 = "invalid magic or version"
            X.DaA r0 = new X.DaA
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0192:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0198:
            X.Cl6 r12 = new X.Cl6
            r17 = r3
            r18 = r9
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.C56 r0 = r7.A02
            X.CQN r7 = new X.CQN
            r7.<init>(r0, r12, r6)
        L_0x01aa:
            r8.A00 = r7
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26972DNu.BKO():void");
    }

    public E9O BZU() {
        COJ coj = this.A02;
        if (coj == null) {
            return null;
        }
        return coj.A00;
    }

    public C26971DNt CQH() {
        C56 c56 = this.A01;
        COJ coj = this.A02;
        Object obj = c56.A00.A00;
        if (obj instanceof C25736Cl6) {
            return new C26971DNt(((C25736Cl6) obj).A00(0), coj, (Object[]) null, (Object[]) null);
        }
        throw AnonymousClass000.A0n("getMinsClosure() was called while minsClosure is null. This normally happens when getMinsClosure() is called before calling \"ensurePrepared()\" method");
    }

    public C26972DNu(C56 c56, COJ coj, int i) {
        this.A01 = c56;
        this.A00 = i;
        this.A02 = coj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.C56, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26972DNu(X.E9O r4, java.lang.String r5, java.util.List r6, int r7) {
        /*
            r3 = this;
            r2 = 0
            X.C56 r1 = new X.C56
            r1.<init>()
            X.CQN r0 = new X.CQN
            r0.<init>(r1, r2, r5)
            r1.A00 = r0
            if (r6 != 0) goto L_0x0016
            if (r4 != 0) goto L_0x0016
            r0 = 0
        L_0x0012:
            r3.<init>(r1, r0, r7)
            return
        L_0x0016:
            X.COJ r0 = new X.COJ
            r0.<init>(r4, r6)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26972DNu.<init>(X.E9O, java.lang.String, java.util.List, int):void");
    }
}
