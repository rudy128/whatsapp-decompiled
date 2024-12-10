package X;

import com.whatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.49d  reason: invalid class name and case insensitive filesystem */
public class C826349d extends A34 {
    public int A00;
    public C42621yT A01;
    public final AnonymousClass1CL A02;
    public final C144347Gy A03;
    public final AnonymousClass1BI A04;
    public final C34141jz A05;
    public final AnonymousClass1W6 A06;
    public final WeakReference A07;
    public final AnonymousClass11P A08;

    public void A0J() {
        A0B(true);
        synchronized (this) {
            C42621yT r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.1yT] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0069 A[EDGE_INSN: B:94:0x0069->B:23:0x0069 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r19) {
        /*
            r18 = this;
            r4 = r18
            java.lang.ref.WeakReference r0 = r4.A07
            java.lang.Object r7 = r0.get()
            com.whatsapp.gallery.GalleryFragmentBase r7 = (com.whatsapp.gallery.GalleryFragmentBase) r7
            X.8CU r11 = r4.A02
            boolean r0 = r11.isCancelled()
            r2 = 0
            if (r0 != 0) goto L_0x0103
            if (r7 == 0) goto L_0x0103
            X.1yT r1 = new X.1yT
            r1.<init>()
            monitor-enter(r4)
            r4.A01 = r1     // Catch:{ all -> 0x0100 }
            monitor-exit(r4)     // Catch:{ all -> 0x0100 }
            long r16 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            r6 = 1
            X.1jz r0 = r4.A05     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
            X.1BI r9 = r4.A04     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
            r0.A03 = r9     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
            android.database.Cursor r8 = r7.A26(r1, r0)     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
            r5 = 0
            if (r8 == 0) goto L_0x0072
            int r0 = r8.getCount()     // Catch:{ all -> 0x00c9 }
            if (r0 <= 0) goto L_0x0072
            r8.moveToFirst()     // Catch:{ all -> 0x00c9 }
            r3 = r2
            goto L_0x0080
        L_0x003f:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0063
            r14 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 + r16
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c9 }
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0063
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r1 = X.C17880vN.A10(r10)     // Catch:{ all -> 0x00c9 }
            r10.clear()     // Catch:{ all -> 0x00c9 }
            java.util.List[] r0 = new java.util.List[r6]     // Catch:{ all -> 0x00c9 }
            r0[r5] = r1     // Catch:{ all -> 0x00c9 }
            r4.A0C(r0)     // Catch:{ all -> 0x00c9 }
        L_0x0063:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0080
        L_0x0069:
            boolean r0 = r11.isCancelled()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0072
            r10.add(r3)     // Catch:{ all -> 0x00c9 }
        L_0x0072:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00bc
            java.util.List[] r0 = new java.util.List[r6]     // Catch:{ all -> 0x00c9 }
            r0[r5] = r10     // Catch:{ all -> 0x00c9 }
            r4.A0C(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x00bc
        L_0x0080:
            boolean r0 = r11.isCancelled()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0089
            if (r3 == 0) goto L_0x0072
            goto L_0x0069
        L_0x0089:
            boolean r0 = r8 instanceof X.C109335dH     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00ad
            r0 = r8
            X.5dH r0 = (X.C109335dH) r0     // Catch:{ all -> 0x00c9 }
            X.21V r0 = r0.A01()     // Catch:{ all -> 0x00c9 }
        L_0x0094:
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x00c9 }
            X.7Gy r12 = r4.A03     // Catch:{ all -> 0x00c9 }
            long r0 = r0.A0I     // Catch:{ all -> 0x00c9 }
            X.7Sz r1 = r12.A00(r0)     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x00aa
            boolean r0 = r3.equals(r1)     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00b5
            r10.add(r3)     // Catch:{ all -> 0x00c9 }
        L_0x00aa:
            r1.bucketCount = r5     // Catch:{ all -> 0x00c9 }
            goto L_0x00b4
        L_0x00ad:
            X.1W6 r0 = r4.A06     // Catch:{ all -> 0x00c9 }
            X.206 r0 = r0.A02(r8, r9)     // Catch:{ all -> 0x00c9 }
            goto L_0x0094
        L_0x00b4:
            r3 = r1
        L_0x00b5:
            int r0 = r3.bucketCount     // Catch:{ all -> 0x00c9 }
            int r0 = r0 + 1
            r3.bucketCount = r0     // Catch:{ all -> 0x00c9 }
            goto L_0x003f
        L_0x00bc:
            if (r8 == 0) goto L_0x00c1
            r8.close()     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
        L_0x00c1:
            monitor-enter(r4)
            r4.A01 = r2     // Catch:{ all -> 0x00c6 }
            monitor-exit(r4)     // Catch:{ all -> 0x00c6 }
            goto L_0x00e5
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c6 }
            throw r0
        L_0x00c9:
            r1 = move-exception
            if (r8 == 0) goto L_0x00d4
            r8.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
        L_0x00d4:
            throw r1     // Catch:{ OperationCanceledException -> 0x00dc, SQLiteDiskIOException -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            X.1CL r0 = r4.A02     // Catch:{ all -> 0x00f7 }
            r0.A00(r6)     // Catch:{ all -> 0x00f7 }
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00dc:
            java.lang.String r0 = "GalleryFragmentBase/doInBackground/OperationCanceledException"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
            monitor-enter(r4)
            r4.A01 = r2     // Catch:{ all -> 0x00f4 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f4 }
        L_0x00e5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r7.A0K
            r1.append(r0)
            java.lang.String r0 = "/all buckets assigned"
            X.C17890vO.A1A(r1, r0)
            return r2
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f4 }
            throw r0
        L_0x00f7:
            r0 = move-exception
            monitor-enter(r4)
            r4.A01 = r2     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            monitor-exit(r4)     // Catch:{ all -> 0x00fd }
            goto L_0x00ff
        L_0x00fd:
            r0 = move-exception
            goto L_0x00fb
        L_0x00ff:
            throw r0
        L_0x0100:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0100 }
            throw r0
        L_0x0103:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C826349d.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A07.get();
        if (galleryFragmentBase != null) {
            for (List list : listArr) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(galleryFragmentBase.A0K);
                A10.append("/report bucket ");
                A10.append(this.A00);
                A10.append(" ");
                C17900vP.A0o(A10, list.size());
                if (this.A00 == 0) {
                    galleryFragmentBase.A0L.clear();
                    galleryFragmentBase.A0A.notifyDataSetChanged();
                }
                this.A00 += list.size();
                galleryFragmentBase.A0L.addAll(list);
                galleryFragmentBase.A0A.notifyDataSetChanged();
            }
        }
    }

    public C826349d(AnonymousClass11P r3, C18000vb r4, AnonymousClass1CL r5, GalleryFragmentBase galleryFragmentBase, AnonymousClass1BI r7, C34141jz r8, AnonymousClass1W6 r9) {
        this.A08 = r3;
        this.A06 = r9;
        this.A02 = r5;
        this.A07 = AnonymousClass3MW.A0z(galleryFragmentBase);
        this.A04 = r7;
        this.A05 = r8;
        this.A03 = new C144347Gy(galleryFragmentBase.A14(), r4);
    }
}
