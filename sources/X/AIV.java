package X;

import android.util.Pair;
import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

public class AIV implements C22408B6m {
    public final /* synthetic */ C21468AkZ A00;
    public final /* synthetic */ List A01;

    public AIV(C21468AkZ akZ, List list) {
        this.A00 = akZ;
        this.A01 = list;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void BpH(X.C199099zQ r10, java.lang.Exception r11) {
        /*
            r9 = this;
            X.AkZ r1 = r9.A00
            java.lang.Object r0 = r1.A03
            X.9mq r0 = (X.C191589mq) r0
            r0.A00(r10, r11)
            if (r10 == 0) goto L_0x00b5
            java.lang.Object r3 = r1.A01
            X.9fJ r3 = (X.C187129fJ) r3
            java.util.List r0 = r9.A01
            java.util.LinkedList r8 = X.AnonymousClass8BR.A14()
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r0 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r0.mCapability
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r0 = X.C199099zQ.A00(r10, r1)
            if (r0 == 0) goto L_0x0037
            int r0 = r0.mVersion
        L_0x002f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C108965cb.A1Q(r1, r0, r8)
            goto L_0x0019
        L_0x0037:
            r0 = 0
            goto L_0x002f
        L_0x0039:
            X.9jy r7 = r3.A01
            X.EEC r5 = r7.A00
            r4 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0087, all -> 0x0057 }
            r0 = 20
            r5.get(r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0087, all -> 0x0057 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r8.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0099
            A00(r7, r5, r1)
            goto L_0x004d
        L_0x0057:
            r6 = move-exception
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r8.iterator()
        L_0x0060:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006a
            A00(r7, r5, r1)
            goto L_0x0060
        L_0x006a:
            X.9mG r1 = new X.9mG
            r1.<init>()
            r0 = 1
            r1.A04 = r0
            X.A4D r2 = r1.A00()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0086
            X.A4c r1 = r3.A00
            X.AIU r0 = new X.AIU
            r0.<init>(r3)
            r1.A02(r4, r0, r2, r5)
        L_0x0086:
            throw r6
        L_0x0087:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r8.iterator()
        L_0x008f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0099
            A00(r7, r5, r1)
            goto L_0x008f
        L_0x0099:
            X.9mG r1 = new X.9mG
            r1.<init>()
            r0 = 1
            r1.A04 = r0
            X.A4D r2 = r1.A00()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00b5
            X.A4c r1 = r3.A00
            X.AIU r0 = new X.AIU
            r0.<init>(r3)
            r1.A02(r4, r0, r2, r5)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIV.BpH(X.9zQ, java.lang.Exception):void");
    }

    public static void A00(C189859jy r5, AbstractCollection abstractCollection, Iterator it) {
        Pair pair = (Pair) it.next();
        VersionedCapability versionedCapability = (VersionedCapability) pair.first;
        Object obj = pair.second;
        int A002 = r5.A00(versionedCapability);
        if (!Integer.valueOf(A002).equals(obj)) {
            abstractCollection.add(new ARModelMetadataRequest(versionedCapability, A002, A002, false));
        }
    }
}
