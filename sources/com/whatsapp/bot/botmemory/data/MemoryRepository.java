package com.whatsapp.bot.botmemory.data;

import X.C18460wS;
import X.C35911n2;
import X.C35921n3;
import java.util.List;

public final class MemoryRepository {
    public List A00 = C18460wS.A00;
    public final MemoryRemoteDataSource A01;
    public final C35911n2 A02 = new C35921n3();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r6.Bhx(r8) == r3) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.List r10, X.C30391dr r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C27424Ddf
            if (r0 == 0) goto L_0x0031
            r8 = r11
            X.Ddf r8 = (X.C27424Ddf) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r7 = r8.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 == r1) goto L_0x004f
            if (r0 != r2) goto L_0x0037
            java.lang.Object r6 = r8.L$2
            X.1n2 r6 = (X.C35911n2) r6
            java.lang.Object r10 = r8.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r5 = r8.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r5 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r5
            X.C30691eM.A01(r7)
            goto L_0x0075
        L_0x0031:
            X.Ddf r8 = new X.Ddf
            r8.<init>(r9, r11)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x003c:
            X.C30691eM.A01(r7)
            com.whatsapp.bot.botmemory.data.MemoryRemoteDataSource r0 = r9.A01
            r8.L$0 = r9
            r8.L$1 = r10
            r8.label = r1
            java.lang.Object r1 = r0.A00(r10, r8)
            if (r1 == r3) goto L_0x0074
            r5 = r9
            goto L_0x005e
        L_0x004f:
            java.lang.Object r10 = r8.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r5 = r8.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r5 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r5
            X.C30691eM.A01(r7)
            X.1eK r7 = (X.C30671eK) r7
            java.lang.Object r1 = r7.value
        L_0x005e:
            boolean r0 = r1 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a5
            X.1n2 r6 = r5.A02
            r8.L$0 = r5
            r8.L$1 = r10
            r8.L$2 = r6
            r8.label = r2
            java.lang.Object r0 = r6.Bhx(r8)
            if (r0 != r3) goto L_0x0075
        L_0x0074:
            return r3
        L_0x0075:
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x00a0 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x007f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00a0 }
            r0 = r1
            X.6qf r0 = (X.C134486qf) r0     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x00a0 }
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x00a0 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
            r3.add(r1)     // Catch:{ all -> 0x00a0 }
            goto L_0x007f
        L_0x009a:
            r5.A00 = r3     // Catch:{ all -> 0x00a0 }
            r6.CQ9(r4)
            return r3
        L_0x00a0:
            r0 = move-exception
            r6.CQ9(r4)
            throw r0
        L_0x00a5:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r0 = "deleteMemories"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
        L_0x00b2:
            X.1IU r3 = X.C108945cZ.A1J(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.botmemory.data.MemoryRepository.A00(java.util.List, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r1.Bhx(r8) == r7) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C27398DdF
            if (r0 == 0) goto L_0x002d
            r8 = r10
            X.DdF r8 = (X.C27398DdF) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r2 = r8.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 == r4) goto L_0x0038
            if (r0 != r6) goto L_0x0033
            java.lang.Object r1 = r8.L$1
            X.1n2 r1 = (X.C35911n2) r1
            java.lang.Object r3 = r8.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r3 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r3
            X.C30691eM.A01(r2)
            goto L_0x0073
        L_0x002d:
            X.DdF r8 = new X.DdF
            r8.<init>(r9, r10)
            goto L_0x0012
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0038:
            java.lang.Object r3 = r8.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r3 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r3
            X.C30691eM.A01(r2)
            X.1eK r2 = (X.C30671eK) r2
            java.lang.Object r2 = r2.value
            goto L_0x0054
        L_0x0044:
            X.C30691eM.A01(r2)
            com.whatsapp.bot.botmemory.data.MemoryRemoteDataSource r0 = r9.A01
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r2 = r0.A01(r8)
            if (r2 == r7) goto L_0x0072
            r3 = r9
        L_0x0054:
            boolean r1 = r2 instanceof X.AnonymousClass1IU
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x0080
            r0 = r2
            if (r1 == 0) goto L_0x005e
            r0 = r5
        L_0x005e:
            boolean r0 = X.C18070vi.A19(r0, r4)
            if (r0 == 0) goto L_0x0080
            X.1n2 r1 = r3.A02
            r8.L$0 = r3
            r8.L$1 = r1
            r8.label = r6
            java.lang.Object r0 = r1.Bhx(r8)
            if (r0 != r7) goto L_0x0073
        L_0x0072:
            return r7
        L_0x0073:
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x007b }
            r3.A00 = r0     // Catch:{ all -> 0x007b }
            r1.CQ9(r5)
            return r0
        L_0x007b:
            r0 = move-exception
            r1.CQ9(r5)
            throw r0
        L_0x0080:
            java.lang.Throwable r1 = X.C30671eK.A00(r2)
            if (r1 != 0) goto L_0x008d
            java.lang.String r0 = "deleteAllMemories"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
        L_0x008d:
            X.1IU r0 = X.C108945cZ.A1J(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.botmemory.data.MemoryRepository.A01(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r2.Bhx(r6) == r5) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r11, boolean r12) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C27425Ddg
            if (r0 == 0) goto L_0x0031
            r6 = r11
            X.Ddg r6 = (X.C27425Ddg) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r9 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 3
            r8 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004a
            if (r0 == r1) goto L_0x005d
            if (r0 == r8) goto L_0x003c
            if (r0 != r7) goto L_0x0037
            java.lang.Object r1 = r6.L$1
            X.1n2 r1 = (X.C35911n2) r1
            java.lang.Object r3 = r6.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r3 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r3
            X.C30691eM.A01(r9)
            goto L_0x00ba
        L_0x0031:
            X.Ddg r6 = new X.Ddg
            r6.<init>(r10, r11)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x003c:
            java.lang.Object r2 = r6.L$2
            X.1n2 r2 = (X.C35911n2) r2
            java.lang.Object r1 = r6.L$1
            java.lang.Object r3 = r6.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r3 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r3
            X.C30691eM.A01(r9)
            goto L_0x007f
        L_0x004a:
            X.C30691eM.A01(r9)
            if (r12 == 0) goto L_0x00a4
            com.whatsapp.bot.botmemory.data.MemoryRemoteDataSource r0 = r10.A01
            r6.L$0 = r10
            r6.label = r1
            java.lang.Object r1 = r0.A02(r6)
            if (r1 == r5) goto L_0x007e
            r3 = r10
            goto L_0x0068
        L_0x005d:
            java.lang.Object r3 = r6.L$0
            com.whatsapp.bot.botmemory.data.MemoryRepository r3 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r3
            X.C30691eM.A01(r9)
            X.1eK r9 = (X.C30671eK) r9
            java.lang.Object r1 = r9.value
        L_0x0068:
            boolean r0 = r1 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0092
            X.1n2 r2 = r3.A02
            r6.L$0 = r3
            r6.L$1 = r1
            r6.L$2 = r2
            r6.label = r8
            java.lang.Object r0 = r2.Bhx(r6)
            if (r0 != r5) goto L_0x007f
        L_0x007e:
            return r5
        L_0x007f:
            boolean r0 = r1 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0084
            r1 = r4
        L_0x0084:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x008a
            X.0wS r1 = X.C18460wS.A00     // Catch:{ all -> 0x008d }
        L_0x008a:
            r3.A00 = r1     // Catch:{ all -> 0x008d }
            goto L_0x00a6
        L_0x008d:
            r0 = move-exception
            r2.CQ9(r4)
            throw r0
        L_0x0092:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 != 0) goto L_0x009f
            java.lang.String r0 = "getMemories"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
        L_0x009f:
            X.1IU r0 = X.C108945cZ.A1J(r1)
            return r0
        L_0x00a4:
            r3 = r10
            goto L_0x00a9
        L_0x00a6:
            r2.CQ9(r4)
        L_0x00a9:
            X.1n2 r1 = r3.A02
            r6.L$0 = r3
            r6.L$1 = r1
            r6.L$2 = r4
            r6.label = r7
            java.lang.Object r0 = r1.Bhx(r6)
            if (r0 != r5) goto L_0x00ba
            return r5
        L_0x00ba:
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x00c0 }
            r1.CQ9(r4)
            return r0
        L_0x00c0:
            r0 = move-exception
            r1.CQ9(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.botmemory.data.MemoryRepository.A02(X.1dr, boolean):java.lang.Object");
    }

    public MemoryRepository(MemoryRemoteDataSource memoryRemoteDataSource) {
        this.A01 = memoryRemoteDataSource;
    }
}
