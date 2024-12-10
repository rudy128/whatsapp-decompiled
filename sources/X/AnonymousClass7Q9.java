package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.List;

/* renamed from: X.7Q9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GalleryTabHostFragment A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ C59382mD A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r0 = r31
            com.whatsapp.gallery.GalleryTabHostFragment r7 = r0.A01
            X.2mD r8 = r0.A03
            boolean r6 = r0.A05
            X.1BI r15 = r0.A02
            java.util.List r5 = r0.A04
            int r12 = r0.A00
            r0 = 4
            X.C18070vi.A0d(r5, r0)
            X.73D r0 = r7.A0k     // Catch:{ all -> 0x00fe }
            java.util.ArrayList r0 = r0.A04()     // Catch:{ all -> 0x00fe }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00fe }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x00fe }
        L_0x0020:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0103
            java.lang.Object r3 = r16.next()     // Catch:{ all -> 0x00fe }
            r10 = r3
            X.72S r10 = (X.AnonymousClass72S) r10     // Catch:{ all -> 0x00fe }
            X.C18070vi.A0b(r10)     // Catch:{ all -> 0x00fe }
            X.1ka r0 = r7.A0F     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00f7
            int r1 = r0.A01(r10)     // Catch:{ all -> 0x00fe }
            r0 = 3
            if (r1 != r0) goto L_0x0020
            r27 = 0
            int r9 = r8.A00     // Catch:{ all -> 0x00fe }
            java.io.File r2 = r10.A0C()     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x009d
            X.1Sl r0 = r7.A0K     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0077
            android.net.Uri r1 = r10.A0X     // Catch:{ all -> 0x0085 }
            X.11C r0 = r0.A01     // Catch:{ all -> 0x0085 }
            X.11B r0 = r0.A0O()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x007e
            android.util.Pair r0 = X.C26521Sl.A0V(r1, r0)     // Catch:{ all -> 0x0085 }
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x0085 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0085 }
            java.lang.Object r10 = r0.second     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0068
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0068
            goto L_0x008a
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "MediaFileUtils/findFileByUri/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)     // Catch:{ all -> 0x0085 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0084
        L_0x0077:
            java.lang.String r0 = "mediaFileUtils"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0085 }
            r0 = 0
            goto L_0x0084
        L_0x007e:
            java.lang.String r0 = "MediaFileUtils/findFileByUri/no content resolver"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0085 }
        L_0x0084:
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x00fe }
        L_0x008a:
            java.lang.Throwable r0 = X.C30671eK.A00(r2)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0093
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00fe }
        L_0x0093:
            boolean r0 = r2 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0098
            r2 = 0
        L_0x0098:
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x009d
            goto L_0x0020
        L_0x009d:
            X.00H r0 = r7.A0V     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x00fe }
            X.6yZ r10 = (X.C139276yZ) r10     // Catch:{ all -> 0x00fe }
            X.00H r0 = r10.A05     // Catch:{ all -> 0x00fe }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00fe }
            X.6mw r0 = (X.C132516mw) r0     // Catch:{ all -> 0x00fe }
            X.71x r1 = r0.A00(r2)     // Catch:{ all -> 0x00fe }
            if (r6 == 0) goto L_0x00f1
            X.1So r14 = X.C26551So.A0d     // Catch:{ all -> 0x00fe }
        L_0x00b7:
            X.00H r13 = r10.A04     // Catch:{ all -> 0x00fe }
            java.lang.Object r0 = r13.get()     // Catch:{ all -> 0x00fe }
            X.1Sc r0 = (X.C26431Sc) r0     // Catch:{ all -> 0x00fe }
            long r10 = r1.A03     // Catch:{ all -> 0x00fe }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x00fe }
            X.1Sc r13 = (X.C26431Sc) r13     // Catch:{ all -> 0x00fe }
            boolean r29 = r13.A0F(r14, r2)     // Catch:{ all -> 0x00fe }
            r21 = 0
            r25 = 0
            r30 = r27
            r22 = r21
            r23 = r10
            r28 = r27
            r18 = r8
            r19 = r1
            r20 = r2
            r17 = r0
            long r13 = r17.A09(r18, r19, r20, r21, r22, r23, r25, r27, r28, r29, r30)     // Catch:{ all -> 0x00fe }
            long r0 = (long) r9     // Catch:{ all -> 0x00fe }
            r9 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r9
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0020
            r4.add(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x0020
        L_0x00f1:
            X.1So r14 = X.C26551So.A0q     // Catch:{ all -> 0x00fe }
            goto L_0x00b7
        L_0x00f4:
            java.lang.String r0 = "videoMaxDurationEnforcer"
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r0 = "mediaFileTypeUtils"
        L_0x00f9:
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x00fe }
            r0 = 0
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x0103:
            X.1KB r1 = r7.A06
            if (r1 == 0) goto L_0x011e
            r22 = 13
            X.7Q7 r0 = new X.7Q7
            r16 = r0
            r17 = r4
            r18 = r7
            r19 = r15
            r20 = r5
            r21 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1.A0J(r0)
            return
        L_0x011e:
            X.AnonymousClass3MW.A1C()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Q9.run():void");
    }

    public /* synthetic */ AnonymousClass7Q9(GalleryTabHostFragment galleryTabHostFragment, AnonymousClass1BI r2, C59382mD r3, List list, int i, boolean z) {
        this.A01 = galleryTabHostFragment;
        this.A03 = r3;
        this.A05 = z;
        this.A02 = r2;
        this.A04 = list;
        this.A00 = i;
    }
}
