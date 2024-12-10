package com.whatsapp.actionfeedback.priorityqueue;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.C18100vl;
import X.C18460wS;
import X.C27611DiH;
import X.C27899Dna;
import X.C35911n2;
import X.C35921n3;
import java.util.List;

public final class ActionFeedbackPriorityQueue {
    public final C18100vl A00;
    public final C18100vl A01;
    public final List A02;
    public final List A03;
    public final C35911n2 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        if (r8 >= 0) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r11, X.E8B r12, X.C30391dr r13, boolean r14) {
        /*
            boolean r0 = r13 instanceof X.C27434Ddq
            if (r0 == 0) goto L_0x0029
            r4 = r13
            X.Ddq r4 = (X.C27434Ddq) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r6 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 3
            r8 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 == r7) goto L_0x00da
            if (r0 == r8) goto L_0x011f
            if (r0 == r3) goto L_0x011f
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.Ddq r4 = new X.Ddq
            r4.<init>(r11, r13)
            goto L_0x0012
        L_0x002f:
            X.C30691eM.A01(r6)
            java.util.List r0 = r11.A02
            X.4rJ r0 = X.C29431cG.A15(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r0.next()
            X.9rE r1 = (X.C194139rE) r1
            int r9 = r1.A00
            java.lang.Object r10 = r1.A01
            X.E8B r10 = (X.E8B) r10
            java.util.List r1 = r11.A03
            java.util.Iterator r1 = r1.iterator()
        L_0x0054:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x003c
            java.lang.Object r6 = r1.next()
            X.E6S r6 = (X.E6S) r6
            r4.L$0 = r11
            r4.L$1 = r12
            r4.L$2 = r0
            r4.L$3 = r10
            r4.L$4 = r1
            r4.Z$0 = r14
            r4.I$0 = r9
            r4.label = r7
            java.lang.Object r6 = r6.Bjj(r10, r12, r4)
            if (r6 != r5) goto L_0x00f5
            return r5
        L_0x0077:
            r8 = 0
            java.util.List r6 = r11.A02
            java.util.Iterator r9 = r6.iterator()
        L_0x007e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r9.next()
            X.E8B r0 = (X.E8B) r0
            int r1 = r12.BXa()
            int r0 = r0.BXa()
            if (r1 >= r0) goto L_0x00d2
            if (r8 != 0) goto L_0x00cc
            java.lang.Object r0 = r6.get(r8)
            X.E8B r0 = (X.E8B) r0
            boolean r0 = r0.isPersistent()
            if (r0 != 0) goto L_0x00ce
            r6.set(r8, r12)
        L_0x00a5:
            if (r14 != 0) goto L_0x00af
            if (r8 == 0) goto L_0x00af
            int r0 = r6.size()
            if (r0 != r7) goto L_0x0122
        L_0x00af:
            X.0vl r0 = r11.A01
            java.lang.Object r1 = r0.getValue()
            X.1G3 r1 = (X.AnonymousClass1G3) r1
            java.lang.Object r0 = X.C29431cG.A0c(r6)
            r4.L$0 = r2
            r4.L$1 = r2
            r4.L$2 = r2
            r4.L$3 = r2
            r4.L$4 = r2
            r4.label = r3
            java.lang.Object r0 = r1.BJt(r0, r4)
            goto L_0x011c
        L_0x00cc:
            if (r8 < 0) goto L_0x00d6
        L_0x00ce:
            r6.add(r8, r12)
            goto L_0x00a5
        L_0x00d2:
            int r8 = r8 + 1
            goto L_0x007e
        L_0x00d5:
            r8 = -1
        L_0x00d6:
            r6.add(r12)
            goto L_0x00a5
        L_0x00da:
            int r9 = r4.I$0
            boolean r14 = r4.Z$0
            java.lang.Object r1 = r4.L$4
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r10 = r4.L$3
            X.E8B r10 = (X.E8B) r10
            java.lang.Object r0 = r4.L$2
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r12 = r4.L$1
            X.E8B r12 = (X.E8B) r12
            java.lang.Object r11 = r4.L$0
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r11 = (com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue) r11
            X.C30691eM.A01(r6)
        L_0x00f5:
            if (r6 == 0) goto L_0x0054
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r9)
            int r1 = r0.intValue()
            X.E8B r6 = (X.E8B) r6
            java.util.List r0 = r11.A02
            r0.remove(r1)
            if (r14 != 0) goto L_0x010c
            if (r1 == 0) goto L_0x010c
            r7 = 0
        L_0x010c:
            r4.L$0 = r2
            r4.L$1 = r2
            r4.L$2 = r2
            r4.L$3 = r2
            r4.L$4 = r2
            r4.label = r8
            java.lang.Object r0 = A00(r11, r6, r4, r7)
        L_0x011c:
            if (r0 != r5) goto L_0x0122
            return r5
        L_0x011f:
            X.C30691eM.A01(r6)
        L_0x0122:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue.A00(com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue, X.E8B, X.1dr, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[Catch:{ all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A[Catch:{ all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.E8B r11, X.C30391dr r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C27420Ddb
            if (r0 == 0) goto L_0x0026
            r7 = r12
            X.Ddb r7 = (X.C27420Ddb) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r8 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L_0x003f
            if (r0 == r9) goto L_0x0031
            if (r0 != r8) goto L_0x002c
            java.lang.Object r4 = r7.L$0
            X.1n2 r4 = (X.C35911n2) r4
            goto L_0x008b
        L_0x0026:
            X.Ddb r7 = new X.Ddb
            r7.<init>(r10, r12)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            java.lang.Object r4 = r7.L$2
            X.1n2 r4 = (X.C35911n2) r4
            java.lang.Object r11 = r7.L$1
            java.lang.Object r3 = r7.L$0
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r3 = (com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue) r3
            X.C30691eM.A01(r1)
            goto L_0x0053
        L_0x003f:
            X.C30691eM.A01(r1)
            X.1n2 r4 = r10.A04
            r7.L$0 = r10
            r7.L$1 = r11
            r7.L$2 = r4
            r7.label = r9
            java.lang.Object r0 = r4.Bhx(r7)
            if (r0 == r6) goto L_0x009b
            r3 = r10
        L_0x0053:
            java.util.List r2 = r3.A02     // Catch:{ all -> 0x0094 }
            java.lang.Object r1 = X.C29431cG.A0c(r2)     // Catch:{ all -> 0x0094 }
            X.E8B r1 = (X.E8B) r1     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0064
            boolean r0 = r1.isPersistent()     // Catch:{ all -> 0x0094 }
            if (r0 != r9) goto L_0x0064
            goto L_0x008e
        L_0x0064:
            if (r11 == 0) goto L_0x006d
            boolean r0 = X.C18070vi.A18(r1, r11)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x006d
            goto L_0x008e
        L_0x006d:
            X.C29401cD.A0I(r2)     // Catch:{ all -> 0x0094 }
            X.0vl r0 = r3.A01     // Catch:{ all -> 0x0094 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0094 }
            X.1G3 r1 = (X.AnonymousClass1G3) r1     // Catch:{ all -> 0x0094 }
            java.lang.Object r0 = X.C29431cG.A0c(r2)     // Catch:{ all -> 0x0094 }
            r7.L$0 = r4     // Catch:{ all -> 0x0094 }
            r7.L$1 = r5     // Catch:{ all -> 0x0094 }
            r7.L$2 = r5     // Catch:{ all -> 0x0094 }
            r7.label = r8     // Catch:{ all -> 0x0094 }
            java.lang.Object r0 = r1.BJt(r0, r7)     // Catch:{ all -> 0x0094 }
            if (r0 != r6) goto L_0x008e
            return r6
        L_0x008b:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x0096 }
        L_0x008e:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0096 }
            r4.CQ9(r5)
            return r0
        L_0x0094:
            r0 = move-exception
            goto L_0x0097
        L_0x0096:
            r0 = move-exception
        L_0x0097:
            r4.CQ9(r5)
            throw r0
        L_0x009b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue.A01(X.E8B, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[Catch:{ all -> 0x006e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.E8B r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C27421Ddc
            if (r0 == 0) goto L_0x0026
            r7 = r10
            X.Ddc r7 = (X.C27421Ddc) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            r4 = 2
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0041
            if (r1 == r0) goto L_0x0031
            if (r1 != r4) goto L_0x002c
            java.lang.Object r2 = r7.L$0
            X.1n2 r2 = (X.C35911n2) r2
            goto L_0x0065
        L_0x0026:
            X.Ddc r7 = new X.Ddc
            r7.<init>(r8, r10)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            java.lang.Object r2 = r7.L$2
            X.1n2 r2 = (X.C35911n2) r2
            java.lang.Object r9 = r7.L$1
            X.E8B r9 = (X.E8B) r9
            java.lang.Object r1 = r7.L$0
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r1 = (com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue) r1
            X.C30691eM.A01(r6)
            goto L_0x0055
        L_0x0041:
            X.C30691eM.A01(r6)
            X.1n2 r2 = r8.A04
            r7.L$0 = r8
            r7.L$1 = r9
            r7.L$2 = r2
            r7.label = r0
            java.lang.Object r0 = r2.Bhx(r7)
            if (r0 == r5) goto L_0x0073
            r1 = r8
        L_0x0055:
            r7.L$0 = r2     // Catch:{ all -> 0x006e }
            r7.L$1 = r3     // Catch:{ all -> 0x006e }
            r7.L$2 = r3     // Catch:{ all -> 0x006e }
            r7.label = r4     // Catch:{ all -> 0x006e }
            r0 = 0
            java.lang.Object r0 = A00(r1, r9, r7, r0)     // Catch:{ all -> 0x006e }
            if (r0 != r5) goto L_0x0068
            return r5
        L_0x0065:
            X.C30691eM.A01(r6)     // Catch:{ all -> 0x006e }
        L_0x0068:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x006e }
            r2.CQ9(r3)
            return r0
        L_0x006e:
            r0 = move-exception
            r2.CQ9(r3)
            throw r0
        L_0x0073:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue.A02(X.E8B, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C30391dr r9, X.C22821Di r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C27422Ddd
            if (r0 == 0) goto L_0x0026
            r6 = r9
            X.Ddd r6 = (X.C27422Ddd) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 2
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0041
            if (r1 == r0) goto L_0x0031
            if (r1 != r7) goto L_0x002c
            java.lang.Object r3 = r6.L$0
            X.1n2 r3 = (X.C35911n2) r3
            goto L_0x008a
        L_0x0026:
            X.Ddd r6 = new X.Ddd
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            java.lang.Object r3 = r6.L$2
            X.1n2 r3 = (X.C35911n2) r3
            java.lang.Object r10 = r6.L$1
            X.1Di r10 = (X.C22821Di) r10
            java.lang.Object r1 = r6.L$0
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r1 = (com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue) r1
            X.C30691eM.A01(r2)
            goto L_0x0055
        L_0x0041:
            X.C30691eM.A01(r2)
            X.1n2 r3 = r8.A04
            r6.L$0 = r8
            r6.L$1 = r10
            r6.L$2 = r3
            r6.label = r0
            java.lang.Object r0 = r3.Bhx(r6)
            if (r0 == r5) goto L_0x009a
            r1 = r8
        L_0x0055:
            java.util.List r2 = r1.A02     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = X.C29431cG.A0c(r2)     // Catch:{ all -> 0x0093 }
            X.E8B r0 = (X.E8B) r0     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r10.invoke(r0)     // Catch:{ all -> 0x0093 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x0093 }
        L_0x0067:
            X.C29401cD.A0N(r2, r10)     // Catch:{ all -> 0x0093 }
            goto L_0x006d
        L_0x006b:
            r0 = 0
            goto L_0x0067
        L_0x006d:
            if (r0 == 0) goto L_0x008d
            X.0vl r0 = r1.A01     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0093 }
            X.1G3 r1 = (X.AnonymousClass1G3) r1     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = X.C29431cG.A0c(r2)     // Catch:{ all -> 0x0093 }
            r6.L$0 = r3     // Catch:{ all -> 0x0093 }
            r6.L$1 = r4     // Catch:{ all -> 0x0093 }
            r6.L$2 = r4     // Catch:{ all -> 0x0093 }
            r6.label = r7     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r1.BJt(r0, r6)     // Catch:{ all -> 0x0093 }
            if (r0 != r5) goto L_0x008d
            return r5
        L_0x008a:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x0095 }
        L_0x008d:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0095 }
            r3.CQ9(r4)
            return r0
        L_0x0093:
            r0 = move-exception
            goto L_0x0096
        L_0x0095:
            r0 = move-exception
        L_0x0096:
            r3.CQ9(r4)
            throw r0
        L_0x009a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue.A03(X.1dr, X.1Di):java.lang.Object");
    }

    public ActionFeedbackPriorityQueue(List list) {
        this.A03 = list;
        this.A01 = AnonymousClass1DF.A01(C27899Dna.A00);
        this.A00 = AnonymousClass1DF.A01(new C27611DiH(this));
        this.A04 = new C35921n3();
        this.A02 = AnonymousClass000.A13();
    }

    public ActionFeedbackPriorityQueue() {
        this(C18460wS.A00);
    }
}
