package X;

/* renamed from: X.Du8  reason: case insensitive filesystem */
public class C28247Du8 extends C28260DuL {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28247Du8(int i) {
        super((CWO) null);
        this.A00 = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [char[], byte[], short[], boolean[]], vars: [r4v1 ?, r4v0 ?, r4v2 ?, r4v3 ?, r4v4 ?, r4v5 ?, r4v6 ?, r4v7 ?, r4v8 ?, r4v9 ?, r4v10 ?, r4v11 ?, r4v12 ?, r4v13 ?, r4v14 ?, r4v15 ?, r4v16 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object r7) {
        /*
            r6 = this;
            int r1 = r6.A00
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            switch(r1) {
                case 0: goto L_0x0027;
                case 1: goto L_0x004b;
                case 2: goto L_0x0066;
                case 3: goto L_0x008a;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00c9;
                case 6: goto L_0x00e4;
                case 7: goto L_0x0123;
                case 8: goto L_0x013e;
                case 9: goto L_0x0162;
                case 10: goto L_0x017f;
                case 11: goto L_0x01a5;
                case 12: goto L_0x01c2;
                case 13: goto L_0x01e8;
                case 14: goto L_0x0208;
                default: goto L_0x000b;
            }
        L_0x000b:
            long[] r4 = new long[r0]
            java.util.Iterator r5 = r7.iterator()
            r3 = 0
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            int r0 = X.AnonymousClass000.A0M(r0)
            long r0 = (long) r0
            r4[r3] = r0
            r3 = r2
            goto L_0x0012
        L_0x0027:
            java.lang.Long[] r4 = new java.lang.Long[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x002e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0046
            long r0 = X.C17880vN.A05(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0046:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x002e
        L_0x004b:
            float[] r4 = new float[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0052:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            float r0 = X.AnonymousClass000.A04(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x0052
        L_0x0066:
            java.lang.Float[] r4 = new java.lang.Float[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x006d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x006d
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0085
            float r0 = X.AnonymousClass000.A04(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x0085:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x006d
        L_0x008a:
            double[] r4 = new double[r0]
            java.util.Iterator r5 = r7.iterator()
            r3 = 0
        L_0x0091:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            double r0 = X.AnonymousClass8BR.A00(r0)
            r4[r3] = r0
            r3 = r2
            goto L_0x0091
        L_0x00a5:
            java.lang.Double[] r4 = new java.lang.Double[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x00ac:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 != 0) goto L_0x00c4
            double r0 = X.AnonymousClass8BR.A00(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x00c4:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00c9:
            boolean[] r4 = new boolean[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x00d0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x00d0
        L_0x00e4:
            java.lang.Boolean[] r4 = new java.lang.Boolean[r0]
            java.util.Iterator r3 = r7.iterator()
            r1 = 0
        L_0x00eb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L_0x00eb
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x010b
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0110
            int r0 = X.AnonymousClass000.A0M(r2)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x010b:
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x00eb
        L_0x0110:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "can not convert "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " toBoolean"
            java.lang.RuntimeException r0 = X.BE9.A0n(r0, r1)
            throw r0
        L_0x0123:
            int[] r4 = new int[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x012a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            int r0 = X.AnonymousClass000.A0M(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x012a
        L_0x013e:
            java.lang.Integer[] r4 = new java.lang.Integer[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0145:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0145
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x015d
            int r0 = X.AnonymousClass000.A0M(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x015d:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0145
        L_0x0162:
            short[] r4 = new short[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0169:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r4[r2] = r0
            r2 = r1
            goto L_0x0169
        L_0x017f:
            java.lang.Short[] r4 = new java.lang.Short[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0186:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0186
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L_0x01a0
            java.lang.Number r1 = (java.lang.Number) r1
            short r0 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r0)
        L_0x01a0:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0186
        L_0x01a5:
            byte[] r4 = new byte[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x01ac:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            r4[r2] = r0
            r2 = r1
            goto L_0x01ac
        L_0x01c2:
            java.lang.Byte[] r4 = new java.lang.Byte[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x01c9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x01c9
            boolean r0 = r1 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x01e3
            java.lang.Number r1 = (java.lang.Number) r1
            byte r0 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
        L_0x01e3:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x01c9
        L_0x01e8:
            char[] r4 = new char[r0]
            java.util.Iterator r5 = r7.iterator()
            r3 = 0
            r2 = 0
        L_0x01f0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r5.next()
            int r1 = r2 + 1
            java.lang.String r0 = r0.toString()
            char r0 = r0.charAt(r3)
            r4[r2] = r0
            r2 = r1
            goto L_0x01f0
        L_0x0208:
            java.lang.Character[] r4 = new java.lang.Character[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
            r1 = 0
        L_0x0210:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x0210
            java.lang.String r0 = r0.toString()
            char r0 = r0.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x0210
        L_0x022d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28247Du8.A03(java.lang.Object):java.lang.Object");
    }
}
