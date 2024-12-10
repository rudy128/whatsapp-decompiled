package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import java.lang.ref.WeakReference;

/* renamed from: X.1zA  reason: invalid class name and case insensitive filesystem */
public class C43051zA extends C201010v {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C37461pa A03;
    public final C27171Va A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass118 A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C27191Vc A0A;
    public final C18000vb A0B;
    public final boolean A0C;
    public volatile boolean A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43051zA(X.AnonymousClass1KB r3, X.AnonymousClass11S r4, X.AnonymousClass1M9 r5, X.C37461pa r6, X.C27191Vc r7, X.C27171Va r8, X.AnonymousClass11C r9, X.AnonymousClass118 r10, X.C18000vb r11, X.C18030ve r12, X.AnonymousClass00H r13, X.AnonymousClass00H r14, java.lang.String r15, boolean r16) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contact-photos-"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            r2.A07 = r12
            r2.A01 = r4
            r2.A06 = r10
            r2.A0B = r11
            r2.A03 = r6
            r2.A00 = r3
            r2.A04 = r8
            r2.A02 = r5
            r2.A0A = r7
            r2.A05 = r9
            r0 = r16
            r2.A0C = r0
            r2.A09 = r13
            r2.A08 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43051zA.<init>(X.1KB, X.11S, X.1M9, X.1pa, X.1Vc, X.1Va, X.11C, X.118, X.0vb, X.0ve, X.00H, X.00H, java.lang.String, boolean):void");
    }

    private void A00(ImageView imageView, C42971z2 r15, AnonymousClass1E7 r16, Object obj, float f, int i) {
        boolean z;
        Bitmap A032;
        ImageView imageView2 = imageView;
        AnonymousClass1E7 r3 = r16;
        float f2 = f;
        int i2 = i;
        Bitmap A042 = this.A0A.A04(imageView.getContext(), r3, "ContactPhotos.handlePhotoToLoad", f2, i2, true);
        if (A042 == null) {
            if (C18020vd.A05(C18040vf.A02, this.A07, 9156) && !r3.A0g) {
                if (this.A01.A0O(r3.A0J)) {
                    AnonymousClass00H r1 = this.A09;
                    if (((MyAvatarCoinFlipRepository) r1.get()).A06()) {
                        A032 = ((MyAvatarCoinFlipRepository) r1.get()).A01();
                    }
                } else {
                    UserJid userJid = (UserJid) r3.A06(UserJid.class);
                    if (userJid != null) {
                        A032 = ((ContactAvatarCoinFlipRepository) this.A08.get()).A03(userJid);
                    }
                }
                if (A032 != null) {
                    A042 = C27201Vd.A00(A032, f2, i2, false);
                }
            }
            A042 = this.A04.A00(imageView.getContext(), r3, f2, i2);
            if (A042 != null) {
                z = true;
                this.A00.A0J(new AnonymousClass25Q(A042, imageView2, r15, obj, new WeakReference(this), z));
            }
            return;
        }
        z = false;
        this.A00.A0J(new AnonymousClass25Q(A042, imageView2, r15, obj, new WeakReference(this), z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
        r3 = r24.A0O();
        r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r3.A00, android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015e, code lost:
        if (r0 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1 = android.graphics.BitmapFactory.decodeStream(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0164, code lost:
        if (r1 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r15 = X.C26511Sk.A06(r1, -1.0f, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016e, code lost:
        com.whatsapp.util.Log.e("contactPhotosBitmapManager/decode-bitmap/out-of-memory ", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0005 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0138 A[Catch:{ all -> 0x01c0, all -> 0x01c5, InterruptedException -> 0x01d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r30 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r9 = r30
            boolean r0 = r9.A0D     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 != 0) goto L_0x01d6
            X.1pa r0 = r9.A03     // Catch:{ InterruptedException -> 0x01d1 }
            java.util.Stack r2 = r0.A00     // Catch:{ InterruptedException -> 0x01d1 }
            boolean r0 = r2.isEmpty()     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0023
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x01d1 }
            boolean r0 = r9.A0C     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x001d
            r0 = 15000(0x3a98, double:7.411E-320)
            goto L_0x001f
        L_0x001d:
            r0 = 0
        L_0x001f:
            r2.wait(r0)     // Catch:{ all -> 0x01bd }
            monitor-exit(r2)     // Catch:{ all -> 0x01bd }
        L_0x0023:
            boolean r0 = r9.A0D     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r2.isEmpty()     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 != 0) goto L_0x01aa
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x01d1 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01ca }
            if (r0 != 0) goto L_0x01a7
            java.lang.Object r8 = r2.pop()     // Catch:{ all -> 0x01ca }
            X.1z9 r8 = (X.C43041z9) r8     // Catch:{ all -> 0x01ca }
            monitor-exit(r2)     // Catch:{ all -> 0x01ca }
            if (r8 == 0) goto L_0x0005
            X.1z2 r0 = r8.A03     // Catch:{ InterruptedException -> 0x01d1 }
            r29 = r0
            r29.CBg()     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.Object r7 = r8.A04     // Catch:{ InterruptedException -> 0x01d1 }
            boolean r0 = r7 instanceof X.AnonymousClass25N     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0134
            r11 = r7
            X.25N r11 = (X.AnonymousClass25N) r11     // Catch:{ InterruptedException -> 0x01d1 }
            android.widget.ImageView r0 = r8.A02     // Catch:{ InterruptedException -> 0x01d1 }
            r28 = r0
            java.lang.Object r0 = r8.A05     // Catch:{ InterruptedException -> 0x01d1 }
            r27 = r0
            int r0 = r8.A01     // Catch:{ InterruptedException -> 0x01d1 }
            r26 = r0
            float r0 = r8.A00     // Catch:{ InterruptedException -> 0x01d1 }
            r25 = r0
            java.lang.Object r0 = r28.getTag()     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0134
            java.lang.Object r1 = r28.getTag()     // Catch:{ InterruptedException -> 0x01d1 }
            r0 = r27
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0134
            int r10 = r28.getHeight()     // Catch:{ InterruptedException -> 0x01d1 }
            if (r10 > 0) goto L_0x0084
            android.content.Context r0 = r28.getContext()     // Catch:{ InterruptedException -> 0x01d1 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ InterruptedException -> 0x01d1 }
            r0 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r10 = r1.getDimensionPixelSize(r0)     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x0084:
            X.118 r2 = r9.A06     // Catch:{ InterruptedException -> 0x01d1 }
            X.1M9 r12 = r9.A02     // Catch:{ InterruptedException -> 0x01d1 }
            X.11C r0 = r9.A05     // Catch:{ InterruptedException -> 0x01d1 }
            r24 = r0
            long r0 = r11.A04     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r17 = r3.toString()     // Catch:{ InterruptedException -> 0x01d1 }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ InterruptedException -> 0x01d1 }
            r16 = 0
            java.lang.String r5 = "sync1"
            r6[r16] = r5     // Catch:{ InterruptedException -> 0x01d1 }
            r13 = 1
            java.lang.String r4 = "_id"
            r6[r13] = r4     // Catch:{ InterruptedException -> 0x01d1 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ InterruptedException -> 0x01d1 }
            r3.<init>()     // Catch:{ InterruptedException -> 0x01d1 }
            android.net.Uri r14 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ InterruptedException -> 0x01d1 }
            android.net.Uri$Builder r15 = r14.buildUpon()     // Catch:{ InterruptedException -> 0x01d1 }
            android.content.Context r14 = r2.A00     // Catch:{ InterruptedException -> 0x01d1 }
            r2 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r14 = r14.getString(r2)     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r2 = "account_name"
            android.net.Uri$Builder r15 = r15.appendQueryParameter(r2, r14)     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r14 = "account_type"
            java.lang.String r2 = "com.whatsapp"
            android.net.Uri$Builder r2 = r15.appendQueryParameter(r14, r2)     // Catch:{ InterruptedException -> 0x01d1 }
            android.net.Uri r19 = r2.build()     // Catch:{ InterruptedException -> 0x01d1 }
            X.11B r18 = r24.A0O()     // Catch:{ InterruptedException -> 0x01d1 }
            X.C17960vV.A07(r18)     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ InterruptedException -> 0x01d1 }
            r2[r16] = r17     // Catch:{ InterruptedException -> 0x01d1 }
            r15 = 0
            java.lang.String r21 = "contact_id=?"
            r20 = r6
            r22 = r2
            r23 = r15
            android.database.Cursor r6 = r18.A03(r19, r20, r21, r22, r23)     // Catch:{ InterruptedException -> 0x01d1 }
            if (r6 == 0) goto L_0x010a
        L_0x00e5:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x0107
            int r2 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x01c0 }
            java.lang.String r13 = r6.getString(r2)     // Catch:{ all -> 0x01c0 }
            int r2 = r6.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x01c0 }
            java.lang.String r14 = r6.getString(r2)     // Catch:{ all -> 0x01c0 }
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x01c0 }
            com.whatsapp.jid.UserJid r2 = r2.A04(r14)     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x00e5
            r3.put(r13, r2)     // Catch:{ all -> 0x01c0 }
            goto L_0x00e5
        L_0x0107:
            r6.close()     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x010a:
            java.util.Collection r2 = r3.values()     // Catch:{ InterruptedException -> 0x01d1 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x0112:
            boolean r2 = r3.hasNext()     // Catch:{ InterruptedException -> 0x01d1 }
            if (r2 == 0) goto L_0x014e
            java.lang.Object r2 = r3.next()     // Catch:{ InterruptedException -> 0x01d1 }
            X.1BI r2 = (X.AnonymousClass1BI) r2     // Catch:{ InterruptedException -> 0x01d1 }
            X.1E7 r2 = r12.A0E(r2)     // Catch:{ InterruptedException -> 0x01d1 }
            if (r2 == 0) goto L_0x0112
            r11.A01 = r2     // Catch:{ InterruptedException -> 0x01d1 }
            r10 = r28
            r11 = r29
            r12 = r2
            r13 = r27
            r14 = r25
            r15 = r26
            r9.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x0134:
            boolean r0 = r7 instanceof X.AnonymousClass1E7     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0005
            X.1E7 r7 = (X.AnonymousClass1E7) r7     // Catch:{ InterruptedException -> 0x01d1 }
            android.widget.ImageView r3 = r8.A02     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.Object r2 = r8.A05     // Catch:{ InterruptedException -> 0x01d1 }
            int r1 = r8.A01     // Catch:{ InterruptedException -> 0x01d1 }
            float r0 = r8.A00     // Catch:{ InterruptedException -> 0x01d1 }
            r4 = r9
            r5 = r3
            r6 = r29
            r8 = r2
            r9 = r0
            r10 = r1
            r4.A00(r5, r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x01d1 }
            goto L_0x0005
        L_0x014e:
            X.11B r3 = r24.A0O()     // Catch:{ InterruptedException -> 0x01d1 }
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ InterruptedException -> 0x01d1 }
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r2, r0)     // Catch:{ InterruptedException -> 0x01d1 }
            android.content.ContentResolver r0 = r3.A00     // Catch:{ InterruptedException -> 0x01d1 }
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r1)     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0173
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ OutOfMemoryError -> 0x016d }
            if (r1 == 0) goto L_0x0173
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.graphics.Bitmap r15 = X.C26511Sk.A06(r1, r0, r10)     // Catch:{ InterruptedException -> 0x01d1 }
            goto L_0x0173
        L_0x016d:
            r1 = move-exception
            java.lang.String r0 = "contactPhotosBitmapManager/decode-bitmap/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x0173:
            r11.A00 = r15     // Catch:{ InterruptedException -> 0x01d1 }
            if (r15 == 0) goto L_0x017a
            r20 = 0
            goto L_0x018f
        L_0x017a:
            X.1Va r4 = r9.A04     // Catch:{ InterruptedException -> 0x01d1 }
            android.content.Context r3 = r28.getContext()     // Catch:{ InterruptedException -> 0x01d1 }
            X.1E7 r2 = r11.A01     // Catch:{ InterruptedException -> 0x01d1 }
            r1 = r25
            r0 = r26
            android.graphics.Bitmap r0 = r4.A00(r3, r2, r1, r0)     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0134
            r15 = 0
            r20 = 1
        L_0x018f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ InterruptedException -> 0x01d1 }
            r0.<init>(r9)     // Catch:{ InterruptedException -> 0x01d1 }
            X.25Q r14 = new X.25Q     // Catch:{ InterruptedException -> 0x01d1 }
            r16 = r28
            r17 = r29
            r18 = r27
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ InterruptedException -> 0x01d1 }
            X.1KB r0 = r9.A00     // Catch:{ InterruptedException -> 0x01d1 }
            r0.A0J(r14)     // Catch:{ InterruptedException -> 0x01d1 }
            goto L_0x0134
        L_0x01a7:
            monitor-exit(r2)     // Catch:{ all -> 0x01ca }
            goto L_0x0005
        L_0x01aa:
            boolean r0 = r9.A0C     // Catch:{ InterruptedException -> 0x01d1 }
            if (r0 == 0) goto L_0x0005
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x01d1 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01ba
            r0 = 1
            r9.A0D = r0     // Catch:{ all -> 0x01ce }
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            goto L_0x01cd
        L_0x01ba:
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            goto L_0x0005
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01bd }
            goto L_0x01d0
        L_0x01c0:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01c5 }
            goto L_0x01c9
        L_0x01c5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x01c9:
            throw r1     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ca }
            goto L_0x01d0
        L_0x01cd:
            return
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
        L_0x01d0:
            throw r0     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x01d1:
            java.lang.String r0 = "ContactPhotos/interrupted exception/allow thread to exit"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43051zA.run():void");
    }
}
