package X;

import android.database.Cursor;
import com.whatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.49D  reason: invalid class name */
public class AnonymousClass49D extends A34 {
    public C42621yT A00;
    public final AnonymousClass1BI A01;
    public final C34141jz A02;
    public final WeakReference A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.1yT] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Cursor A26;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A03.get();
        AnonymousClass8CU r6 = this.A02;
        if (r6.isCancelled() || galleryFragmentBase == null) {
            return null;
        }
        ? obj = new Object();
        synchronized (this) {
            this.A00 = obj;
        }
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            String str = galleryFragmentBase.A0K;
            A10.append(str);
            AnonymousClass1Ez r3 = new AnonymousClass1Ez(AnonymousClass000.A0y("/getCursor", A10));
            C34141jz r1 = this.A02;
            r1.A03 = this.A01;
            A26 = galleryFragmentBase.A26(obj, r1);
            r3.A02();
            if (A26 != null) {
                StringBuilder A11 = AnonymousClass000.A11(str);
                A11.append("/loadInBackground ");
                C17900vP.A0o(A11, A26.getCount());
            }
            synchronized (this) {
                this.A00 = null;
            }
            if (!r6.isCancelled() || A26 == null) {
                return A26;
            }
            A26.close();
            return null;
        } catch (RuntimeException e) {
            A26.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[EDGE_INSN: B:30:0x0085->B:24:0x0085 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r13) {
        /*
            r12 = this;
            android.database.Cursor r13 = (android.database.Cursor) r13
            if (r13 == 0) goto L_0x00ad
            java.lang.ref.WeakReference r0 = r12.A03
            java.lang.Object r8 = r0.get()
            com.whatsapp.gallery.GalleryFragmentBase r8 = (com.whatsapp.gallery.GalleryFragmentBase) r8
            if (r8 == 0) goto L_0x00ad
            X.1jz r10 = r12.A02
            int r3 = r13.getCount()
            r2 = 0
            android.view.View r0 = r8.A01
            X.C72453Mb.A1B(r0)
            int r7 = com.whatsapp.gallery.GalleryFragmentBase.A01(r8)
            r0 = -1
            if (r7 == r0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r8.A0K
            r1.append(r0)
            java.lang.String r0 = "/onLoadFinished "
            X.C17900vP.A0j(r0, r1, r3)
            r8.A00 = r3
            com.whatsapp.gallery.GalleryFragmentBase.A03(r8)
            X.49d r0 = r8.A0B
            if (r0 == 0) goto L_0x003b
            r0.A0J()
        L_0x003b:
            java.util.ArrayList r6 = r8.A0L
            r6.clear()
            android.content.Context r1 = r8.A14()
            X.0vb r0 = r8.A05
            X.7Gy r5 = new X.7Gy
            r5.<init>(r1, r0)
            boolean r0 = r13.moveToFirst()
            r4 = 0
            if (r0 == 0) goto L_0x0088
            r3 = 0
        L_0x0053:
            boolean r0 = r13 instanceof X.C109335dH
            if (r0 == 0) goto L_0x00ae
            r0 = r13
            X.5dH r0 = (X.C109335dH) r0
            X.21V r0 = r0.A01()
        L_0x005e:
            X.C17960vV.A07(r0)
            long r0 = r0.A0I
            X.7Sz r1 = r5.A00(r0)
            if (r4 == 0) goto L_0x0072
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x0075
            r6.add(r4)
        L_0x0072:
            r1.bucketCount = r2
            r4 = r1
        L_0x0075:
            int r0 = r4.bucketCount
            int r0 = r0 + 1
            r4.bucketCount = r0
            int r3 = r3 + 1
            boolean r0 = r13.moveToNext()
            if (r0 == 0) goto L_0x0085
            if (r3 < r7) goto L_0x0053
        L_0x0085:
            r6.add(r4)
        L_0x0088:
            X.3XJ r0 = r8.A0A
            android.database.Cursor r0 = r0.A0U(r13)
            if (r0 == 0) goto L_0x0093
            r0.close()
        L_0x0093:
            X.11P r5 = r8.A03
            X.0vb r6 = r8.A05
            X.00H r0 = r8.A0G
            X.1W6 r11 = X.C17880vN.A0c(r0)
            X.1CL r7 = r8.A08
            X.1BI r9 = r8.A0D
            X.49d r4 = new X.49d
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r8.A0B = r4
            X.10I r0 = r8.A0F
            X.AnonymousClass3MW.A1T(r4, r0, r2)
        L_0x00ad:
            return
        L_0x00ae:
            X.00H r0 = r8.A0G
            X.1W6 r1 = X.C17880vN.A0c(r0)
            X.1BI r0 = r8.A0D
            X.206 r0 = r1.A02(r13, r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49D.A0H(java.lang.Object):void");
    }

    public AnonymousClass49D(GalleryFragmentBase galleryFragmentBase, AnonymousClass1BI r3, C34141jz r4) {
        this.A03 = AnonymousClass3MW.A0z(galleryFragmentBase);
        this.A01 = r3;
        this.A02 = r4;
    }
}
