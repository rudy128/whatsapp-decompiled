package X;

/* renamed from: X.7RI  reason: invalid class name */
public class AnonymousClass7RI implements Runnable {
    public final int A00;
    public final Object A01;

    public AnonymousClass7RI(C139646zD r2) {
        this.A00 = 20;
        this.A01 = AnonymousClass3MW.A0z(r2);
    }

    public static AnonymousClass7RI A00(Object obj, int i) {
        return new AnonymousClass7RI(obj, i);
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new AnonymousClass7RI(obj, i));
    }

    /* JADX WARNING: type inference failed for: r2v32, types: [java.lang.Object, X.1yT] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e3, code lost:
        r3.A0G = r0;
        com.whatsapp.storage.StorageUsageActivity.A0q(r3, r3.A0U, (java.util.List) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0484, code lost:
        X.AnonymousClass7KX.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0487, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05e7, code lost:
        r0 = "fMessageDatabase";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05f4, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05f8, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0121, code lost:
        r1.fullScroll(130);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0291, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0295, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x05a0;
                case 1: goto L_0x058e;
                case 2: goto L_0x019b;
                case 3: goto L_0x0582;
                case 4: goto L_0x0573;
                case 5: goto L_0x056a;
                case 6: goto L_0x0127;
                case 7: goto L_0x04e5;
                case 8: goto L_0x04df;
                case 9: goto L_0x04d6;
                case 10: goto L_0x04b0;
                case 11: goto L_0x0488;
                case 12: goto L_0x05ea;
                case 13: goto L_0x0119;
                case 14: goto L_0x047c;
                case 15: goto L_0x0463;
                case 16: goto L_0x045b;
                case 17: goto L_0x0453;
                case 18: goto L_0x044c;
                case 19: goto L_0x0445;
                case 20: goto L_0x0109;
                case 21: goto L_0x043d;
                case 22: goto L_0x0432;
                case 23: goto L_0x00ef;
                case 24: goto L_0x042a;
                case 25: goto L_0x0422;
                case 26: goto L_0x041a;
                case 27: goto L_0x0412;
                case 28: goto L_0x0404;
                case 29: goto L_0x00ad;
                case 30: goto L_0x03fc;
                case 31: goto L_0x03ed;
                case 32: goto L_0x03dd;
                case 33: goto L_0x03d2;
                case 34: goto L_0x0308;
                case 35: goto L_0x0300;
                case 36: goto L_0x0300;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x02f6;
                case 40: goto L_0x02ea;
                case 41: goto L_0x02df;
                case 42: goto L_0x02b5;
                case 43: goto L_0x02a7;
                case 44: goto L_0x001b;
                case 45: goto L_0x029d;
                case 46: goto L_0x0239;
                case 47: goto L_0x0220;
                case 48: goto L_0x000f;
                case 49: goto L_0x020f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r1 = (com.whatsapp.storage.StorageUsageActivity) r1
            X.6R0 r0 = X.AnonymousClass6R0.CHAT_LIST
            com.whatsapp.storage.StorageUsageActivity.A0V(r0, r1)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r15.A01
            X.6xY r1 = (X.C138706xY) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.widget.ScrollView r1 = r1.A06
            goto L_0x0121
        L_0x001b:
            java.lang.Object r4 = r15.A01
            X.6xN r4 = (X.C138606xN) r4
            X.10I r7 = r4.A05
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3 = 0
            X.C18070vi.A0d(r7, r3)
            X.1yT r2 = new X.1yT
            r2.<init>()
            r6 = 10
            X.7RJ r5 = new X.7RJ
            r5.<init>(r2, r6)
            r7.CGv(r5, r0)
            X.71d r10 = r4.A03     // Catch:{ 1QC -> 0x05de }
            X.1Rp r5 = r10.A00     // Catch:{ 1QC -> 0x05de }
            java.lang.String r9 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            java.lang.Long r0 = r5.A0J(r9)     // Catch:{ 1QC -> 0x05de }
            boolean r0 = X.C138606xN.A00(r4, r0)     // Catch:{ 1QC -> 0x05de }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1QC -> 0x05de }
            X.17r r0 = r4.A00     // Catch:{ 1QC -> 0x05de }
            java.io.File r0 = r0.A0J()     // Catch:{ 1QC -> 0x05de }
            long r7 = X.C64062u9.A01(r2, r0)     // Catch:{ 1QC -> 0x05de }
            java.lang.String r1 = "STORAGE_USAGE_MEDIA_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ 1QC -> 0x05de }
            X.C26301Rp.A04(r5, r1, r0)     // Catch:{ 1QC -> 0x05de }
            X.C1403671d.A00(r10, r9)     // Catch:{ 1QC -> 0x05de }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1QC -> 0x05de }
        L_0x0067:
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            java.lang.Long r0 = r5.A0J(r0)     // Catch:{ 1QC -> 0x05de }
            boolean r0 = X.C138606xN.A00(r4, r0)     // Catch:{ 1QC -> 0x05de }
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1QC -> 0x05de }
            X.6o1 r1 = r4.A04     // Catch:{ 1QC -> 0x05de }
            r0 = 2
            r1.A00(r2, r6, r0)     // Catch:{ 1QC -> 0x05de }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1QC -> 0x05de }
        L_0x0083:
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            java.lang.Long r0 = r5.A0J(r0)     // Catch:{ 1QC -> 0x05de }
            boolean r0 = X.C138606xN.A00(r4, r0)     // Catch:{ 1QC -> 0x05de }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1QC -> 0x05de }
            X.6o1 r1 = r4.A04     // Catch:{ 1QC -> 0x05de }
            r0 = 1
            r1.A00(r2, r6, r0)     // Catch:{ 1QC -> 0x05de }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1QC -> 0x05de }
        L_0x009f:
            java.lang.String r0 = "STORAGE_USAGE_CHAT_LIST_CACHE_TIME"
            java.lang.Long r0 = r5.A0J(r0)     // Catch:{ 1QC -> 0x05de }
            boolean r0 = X.C138606xN.A00(r4, r0)     // Catch:{ 1QC -> 0x05de }
            if (r0 == 0) goto L_0x000e
            goto L_0x05c2
        L_0x00ad:
            java.lang.Object r7 = r15.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r7 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r7
            X.00H r0 = r7.A0I
            if (r0 == 0) goto L_0x05e7
            X.1W6 r1 = X.C17880vN.A0c(r0)
            X.205 r0 = r7.A04
            X.206 r6 = X.C108945cZ.A0s(r0, r1)
            if (r6 == 0) goto L_0x000e
            X.00H r0 = r7.A0Q
            if (r0 == 0) goto L_0x05e4
            X.1LU r1 = X.C108945cZ.A0h(r0)
            long r4 = X.AnonymousClass25A.A02(r6)
            long r2 = X.AnonymousClass25A.A03(r6)
            X.205 r6 = r6.A0v
            X.1BI r0 = r6.A00
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r7, r1, r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "sort_id"
            r1.putExtra(r0, r2)
            X.AnonymousClass4aU.A00(r1, r6)
            X.1L9 r0 = r7.A01
            r0.A09(r7, r1)
            return
        L_0x00ef:
            java.lang.Object r3 = r15.A01
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = r3.A06
            X.5ho r0 = r3.A04
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x000e
            androidx.viewpager.widget.ViewPager r1 = r3.A00
            r0 = 1
            r1.A0J(r2, r0)
            return
        L_0x0109:
            java.lang.Object r0 = r15.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.6zD r0 = (X.C139646zD) r0
            if (r0 == 0) goto L_0x000e
            r0.A01()
            return
        L_0x0119:
            java.lang.Object r0 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r0
            android.widget.ScrollView r1 = r0.A07
            if (r1 == 0) goto L_0x000e
        L_0x0121:
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x0127:
            java.lang.Object r7 = r15.A01
            X.6KR r7 = (X.AnonymousClass6KR) r7
            X.AnonymousClass3MX.A1O(r7)
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r7.A02
            long r4 = r4 - r0
            r2 = 2
            r1 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0149
            android.os.Handler r3 = r7.A05
            r3.removeCallbacksAndMessages(r1)
            java.lang.Runnable r2 = r7.A0G
            r0 = 1
            r3.postDelayed(r2, r0)
            return
        L_0x0149:
            android.os.Handler r0 = r7.A05
            r0.removeCallbacksAndMessages(r1)
            com.whatsapp.collections.ObservableRecyclerView r6 = r7.A09
            android.view.ViewTreeObserver r1 = r6.getViewTreeObserver()
            android.view.ViewTreeObserver$OnDrawListener r0 = r7.A06
            r1.removeOnDrawListener(r0)
            int r1 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5 = -1
            if (r1 == r5) goto L_0x016a
            if (r0 == 0) goto L_0x016a
            int r0 = X.C140066zt.A00(r7)
            int r5 = r1 * r0
        L_0x016a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = -1
            if (r5 == r0) goto L_0x000e
            if (r1 == 0) goto L_0x000e
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r7.A01
            long r8 = r3 - r0
            r1 = 50
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x000e
            r7.A01 = r3
            r0 = 4
            r6.setVisibility(r0)
            r6.A0f(r5)
            X.00H r0 = r7.A0E
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r1 = 45
            X.3Cu r0 = new X.3Cu
            r0.<init>(r7, r5, r1, r6)
            r2.A0J(r0)
            return
        L_0x019b:
            java.lang.Object r10 = r15.A01
            X.72j r10 = (X.C1406472j) r10
            r6 = 0
            X.C18070vi.A0d(r10, r6)
            android.widget.TextView r2 = r10.A02
            if (r2 == 0) goto L_0x000e
            int r0 = r10.A01
            r7 = 1
            int r0 = r0 + 1
            r10.A01 = r0
            float r8 = X.C108945cZ.A04(r2)
            android.util.Property r4 = android.view.View.TRANSLATION_Y
            r5 = 2
            float[] r1 = new float[r5]
            r3 = 0
            r1[r6] = r3
            float r0 = -r8
            android.animation.ObjectAnimator r9 = X.C108945cZ.A0C(r4, r2, r1, r0, r7)
            android.util.Property r1 = android.view.View.ALPHA
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r1, r0)
            android.animation.AnimatorSet r4 = X.C108945cZ.A0B()
            android.animation.Animator[] r0 = X.C108945cZ.A1Z(r9, r0, r5, r6)
            r4.playTogether(r0)
            r1 = 4
            X.5cp r0 = new X.5cp
            r0.<init>(r4, r10, r1)
            r4.addListener(r0)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r0 = new float[r5]
            r0[r6] = r8
            android.animation.ObjectAnimator r3 = X.C108945cZ.A0C(r1, r2, r0, r3, r7)
            android.util.Property r1 = android.view.View.ALPHA
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r1, r0)
            android.animation.AnimatorSet r1 = X.C108945cZ.A0B()
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            r0[r6] = r3
            android.animation.AnimatorSet r2 = X.C108985cd.A0A(r1, r2, r0, r7)
            android.animation.Animator[] r0 = X.C108945cZ.A1Z(r4, r1, r5, r6)
            r2.playSequentially(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r2.start()
            return
        L_0x020f:
            java.lang.Object r1 = r15.A01
            java.io.File r1 = (java.io.File) r1
            boolean r0 = X.C22781De.A03()
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)
            X.C64062u9.A0Q(r1)
            return
        L_0x0220:
            java.lang.Object r3 = r15.A01
            com.whatsapp.textstatus.AddTextStatusActivity r3 = (com.whatsapp.textstatus.AddTextStatusActivity) r3
            android.content.res.Resources r2 = X.C108955ca.A0D(r3)
            X.1KW r0 = r3.A0D
            X.C18070vi.A0X(r0)
            java.lang.String r1 = "💬"
            android.graphics.drawable.Drawable r0 = X.AnonymousClass72Y.A00(r2, r0, r1)
            com.whatsapp.textstatus.AddTextStatusActivity.A03(r0, r3)
            r3.A0D = r1
            return
        L_0x0239:
            java.lang.Object r7 = r15.A01
            com.whatsapp.textstatus.AddTextStatusActivity r7 = (com.whatsapp.textstatus.AddTextStatusActivity) r7
            java.util.List r0 = r7.A0L
            java.lang.String r6 = "\n"
            r5 = 0
            r4 = 1
            X.C18070vi.A0d(r0, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0296 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0296 }
        L_0x024e:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0296 }
            if (r0 == 0) goto L_0x026b
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0296 }
            X.6sf r1 = (X.C135726sf) r1     // Catch:{ IOException -> 0x0296 }
            java.lang.String r0 = r1.A02     // Catch:{ IOException -> 0x0296 }
            r3.append(r0)     // Catch:{ IOException -> 0x0296 }
            r3.append(r6)     // Catch:{ IOException -> 0x0296 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x0296 }
            r3.append(r0)     // Catch:{ IOException -> 0x0296 }
            r3.append(r6)     // Catch:{ IOException -> 0x0296 }
            goto L_0x024e
        L_0x026b:
            int r0 = r3.length()     // Catch:{ IOException -> 0x0296 }
            if (r0 <= r4) goto L_0x0279
            int r0 = r3.length()     // Catch:{ IOException -> 0x0296 }
            int r0 = r0 - r4
            r3.deleteCharAt(r0)     // Catch:{ IOException -> 0x0296 }
        L_0x0279:
            java.lang.String r0 = "customTSValues"
            java.io.FileOutputStream r0 = r7.openFileOutput(r0, r5)     // Catch:{ IOException -> 0x0296 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0296 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0296 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x028f }
            r2.writeObject(r0)     // Catch:{ all -> 0x028f }
            r2.close()     // Catch:{ IOException -> 0x0296 }
            return
        L_0x028f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0296 }
            throw r0     // Catch:{ IOException -> 0x0296 }
        L_0x0296:
            r1 = move-exception
            java.lang.String r0 = "SaveCustomStatus"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x029d:
            java.lang.Object r0 = r15.A01
            X.4qG r0 = (X.C97914qG) r0
            X.5bu r0 = r0.A03
            r0.C4F()
            return
        L_0x02a7:
            java.lang.Object r3 = r15.A01
            com.whatsapp.storage.StorageUsageMediaPreviewView r3 = (com.whatsapp.storage.StorageUsageMediaPreviewView) r3
            java.util.List r2 = r3.A06
            int r1 = r3.A00
            java.lang.String r0 = r3.A05
            r3.setPreviewMediaItems(r2, r1, r0)
            return
        L_0x02b5:
            java.lang.Object r3 = r15.A01
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            r1 = 0
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            com.whatsapp.dialogs.ProgressDialogFragment r1 = com.whatsapp.dialogs.ProgressDialogFragment.A00(r1, r0)
            r3.A0J = r1
            r0 = 1
            r1.A2D(r0)
            com.whatsapp.dialogs.ProgressDialogFragment r2 = r3.A0J
            r1 = 2
            X.75B r0 = new X.75B
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.1GP r1 = r3.getSupportFragmentManager()
            java.lang.Class<com.whatsapp.dialogs.ProgressDialogFragment> r0 = com.whatsapp.dialogs.ProgressDialogFragment.class
            java.lang.String r0 = r0.getName()
            r2.A2C(r1, r0)
            return
        L_0x02df:
            java.lang.Object r1 = r15.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131889309(0x7f120c9d, float:1.9413278E38)
            r1.CNA(r0)
            return
        L_0x02ea:
            java.lang.Object r0 = r15.A01
            X.5ni r0 = (X.C113775ni) r0
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x02f6:
            java.lang.Object r2 = r15.A01
            X.5lJ r2 = (X.C112335lJ) r2
            r1 = 2
            r0 = 1
            X.C112335lJ.A04(r2, r1, r0)
            return
        L_0x0300:
            java.lang.Object r3 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            X.6RN r0 = X.AnonymousClass6RN.ALL
            goto L_0x03e3
        L_0x0308:
            java.lang.Object r6 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r6 = (com.whatsapp.storage.StorageUsageActivity) r6
            com.whatsapp.storage.StorageUsageActivity.A0c(r6)
            com.whatsapp.storage.StorageUsageActivity.A0d(r6)
            java.lang.String r0 = "storage-usage-activity/fetch cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.71d r3 = r6.A0I
            java.lang.String r4 = "storageUsageCacheManager"
            r8 = 0
            if (r3 == 0) goto L_0x03ce
            java.lang.String r2 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            boolean r0 = X.C1403671d.A01(r3, r2)
            if (r0 != 0) goto L_0x0330
            X.1Rp r1 = r3.A00
            X.C26301Rp.A04(r1, r2, r8)
            java.lang.String r0 = "STORAGE_USAGE_MEDIA_SIZE"
            X.C26301Rp.A04(r1, r0, r8)
        L_0x0330:
            java.lang.String r2 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            boolean r0 = X.C1403671d.A01(r3, r2)
            if (r0 != 0) goto L_0x034c
            X.1Rp r1 = r3.A00
            X.C26301Rp.A04(r1, r2, r8)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE"
            X.C26301Rp.A04(r1, r0, r8)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_COUNT"
            X.C26301Rp.A04(r1, r0, r8)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_ROW_IDS"
            X.C26301Rp.A04(r1, r0, r8)
        L_0x034c:
            java.lang.String r2 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            boolean r0 = X.C1403671d.A01(r3, r2)
            if (r0 != 0) goto L_0x0368
            X.1Rp r1 = r3.A00
            X.C26301Rp.A04(r1, r2, r8)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE"
            X.C26301Rp.A04(r1, r0, r8)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_COUNT"
            X.C26301Rp.A04(r1, r0, r8)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS"
            X.C26301Rp.A04(r1, r0, r8)
        L_0x0368:
            X.71d r0 = r6.A0I
            if (r0 == 0) goto L_0x03ce
            X.6jP r5 = r0.A02()
            java.lang.Long r0 = r5.A04
            if (r0 == 0) goto L_0x038f
            long r9 = r0.longValue()
            X.00H r0 = r6.A0C
            long r11 = X.C108975cc.A07(r0)
            X.00H r0 = r6.A0C
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r13 = r0.A03()
            X.6gb r8 = new X.6gb
            r8.<init>(r9, r11, r13)
        L_0x038f:
            java.util.List r4 = r5.A06
            java.lang.Integer r3 = r5.A01
            java.lang.Long r2 = r5.A03
            X.1gV r1 = r6.A0K
            if (r1 == 0) goto L_0x03ca
            X.00H r0 = r6.A0N
            if (r0 == 0) goto L_0x05e7
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.6ga r7 = X.C31141f5.A03(r0, r1, r3, r2, r4)
            java.util.List r4 = r5.A05
            java.lang.Integer r3 = r5.A00
            java.lang.Long r2 = r5.A02
            X.1gV r1 = r6.A0K
            if (r1 == 0) goto L_0x03ca
            X.00H r0 = r6.A0N
            if (r0 == 0) goto L_0x05e7
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.6ga r9 = X.C31141f5.A03(r0, r1, r3, r2, r4)
            r10 = 31
            X.AkZ r4 = new X.AkZ
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.1KB r1 = r6.A05
            r0 = 45
            X.AnonymousClass7RQ.A00(r1, r6, r4, r0)
            return
        L_0x03ca:
            java.lang.String r0 = "messageThumbCache"
            goto L_0x05f4
        L_0x03ce:
            X.C18070vi.A11(r4)
            throw r8
        L_0x03d2:
            java.lang.Object r0 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            com.whatsapp.storage.StorageUsageActivity.A0c(r0)
            com.whatsapp.storage.StorageUsageActivity.A0d(r0)
            return
        L_0x03dd:
            java.lang.Object r3 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            X.6RN r0 = r3.A0F
        L_0x03e3:
            r3.A0G = r0
            java.util.ArrayList r2 = r3.A0U
            r1 = 0
            r0 = 0
            com.whatsapp.storage.StorageUsageActivity.A0q(r3, r2, r1, r0)
            return
        L_0x03ed:
            java.lang.Object r1 = r15.A01
            com.whatsapp.storage.StorageUsageActivity r1 = (com.whatsapp.storage.StorageUsageActivity) r1
            X.7RQ r0 = new X.7RQ
            r0.<init>(r1)
            r1.A02 = r0
            r0.run()
            return
        L_0x03fc:
            java.lang.Object r1 = r15.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r1 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r1
            r0 = 0
            r1.A06 = r0
            return
        L_0x0404:
            java.lang.Object r0 = r15.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r2 = 0
            X.1KB r1 = r0.A05
            r0 = 2131896447(0x7f12287f, float:1.9427756E38)
            r1.A08(r0, r2)
            return
        L_0x0412:
            java.lang.Object r0 = r15.A01
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment.A00(r0)
            return
        L_0x041a:
            java.lang.Object r0 = r15.A01
            X.6zC r0 = (X.C139636zC) r0
            r0.A02()
            return
        L_0x0422:
            java.lang.Object r0 = r15.A01
            X.6zC r0 = (X.C139636zC) r0
            r0.A01()
            return
        L_0x042a:
            java.lang.Object r1 = r15.A01
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r1
            r0 = 0
            r1.A05 = r0
            return
        L_0x0432:
            java.lang.Object r0 = r15.A01
            com.whatsapp.stickers.store.StickerStoreActivity r0 = (com.whatsapp.stickers.store.StickerStoreActivity) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A01
            r0 = 3
            r1.A0W(r0)
            return
        L_0x043d:
            java.lang.Object r1 = r15.A01
            com.whatsapp.stickers.store.StickerStoreActivity r1 = (com.whatsapp.stickers.store.StickerStoreActivity) r1
            r0 = 0
            r1.A03 = r0
            return
        L_0x0445:
            java.lang.Object r0 = r15.A01
            X.10T r0 = (X.AnonymousClass10T) r0
            r1 = 31
            goto L_0x0484
        L_0x044c:
            java.lang.Object r0 = r15.A01
            X.10T r0 = (X.AnonymousClass10T) r0
            r1 = 30
            goto L_0x0484
        L_0x0453:
            java.lang.Object r0 = r15.A01
            X.89P r0 = (X.AnonymousClass89P) r0
            r0.C6t()
            return
        L_0x045b:
            java.lang.Object r0 = r15.A01
            X.6ui r0 = (X.C136976ui) r0
            r0.A08()
            return
        L_0x0463:
            java.lang.Object r2 = r15.A01
            X.6ui r2 = (X.C136976ui) r2
            r2.A08()
            monitor-enter(r2)
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0479 }
            r0.clear()     // Catch:{ all -> 0x0479 }
            X.89r r1 = r2.A01     // Catch:{ all -> 0x0479 }
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0479 }
            r1.CBh(r0)     // Catch:{ all -> 0x0479 }
            monitor-exit(r2)     // Catch:{ all -> 0x0479 }
            return
        L_0x0479:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0479 }
            throw r0
        L_0x047c:
            java.lang.Object r0 = r15.A01
            X.67t r0 = (X.C1193467t) r0
            X.2LK r0 = r0.A05
            r1 = 32
        L_0x0484:
            X.AnonymousClass7KX.A00(r0, r1)
            return
        L_0x0488:
            java.lang.Object r4 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r4 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r4
            android.view.View r3 = r4.A03
            if (r3 == 0) goto L_0x04a1
            r0 = 8
            r3.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 320(0x140, double:1.58E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
        L_0x04a1:
            X.1KB r1 = r4.A0K
            if (r1 == 0) goto L_0x04ab
            java.lang.Runnable r0 = r4.A1L
            r1.A0I(r0)
            return
        L_0x04ab:
            X.AnonymousClass3MW.A1C()
            goto L_0x05f7
        L_0x04b0:
            java.lang.Object r3 = r15.A01
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity r3 = (com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity) r3
            r2 = 0
            android.view.View r1 = r3.A00
            if (r1 != 0) goto L_0x04bd
            java.lang.String r0 = "rootView"
            goto L_0x05f4
        L_0x04bd:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x04cf
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r2
            r1.setLayoutParams(r0)
            r0 = 1
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity.A0d(r3, r0)
            return
        L_0x04cf:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04d6:
            java.lang.Object r1 = r15.A01
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity r1 = (com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity) r1
            r0 = 1
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity.A0d(r1, r0)
            return
        L_0x04df:
            java.lang.Object r0 = r15.A01
            X.C108945cZ.A1Q(r0)
            return
        L_0x04e5:
            java.lang.Object r7 = r15.A01
            X.5jJ r7 = (X.C111255jJ) r7
            r8 = 0
            java.lang.String r0 = "Refresh statuses started with serial executor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C111255jJ.A07(r7)
            if (r0 == 0) goto L_0x0500
            X.00H r0 = r7.A0C
            java.lang.Object r0 = r0.get()
            X.1TG r0 = (X.AnonymousClass1TG) r0
            r0.A05()
        L_0x0500:
            X.00H r0 = r7.A0A
            java.lang.Object r0 = r0.get()
            X.6oL r0 = (X.C133206oL) r0
            X.6yN r6 = r0.A00()
            X.00H r0 = r7.A08
            java.lang.Object r1 = r0.get()
            X.6lT r1 = (X.C131666lT) r1
            X.1DT r5 = r7.A04
            java.lang.Object r0 = r5.A06()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0522
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
        L_0x0522:
            X.6f4 r4 = r1.A00(r0)
            java.util.List r0 = r6.A01
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0530:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x053a
            X.C108985cd.A1N(r2, r1)
            goto L_0x0530
        L_0x053a:
            java.util.Set r3 = X.C29431cG.A12(r2)
            r1 = 16
            X.7S0 r0 = new X.7S0
            r0.<init>(r4, r7, r1)
            X.C111255jJ.A06(r7, r0, r8)
            java.util.Map r0 = r4.A00
            java.util.LinkedHashMap r2 = X.C108995ce.A0b(r0)
            java.util.Iterator r1 = X.AnonymousClass000.A15(r0)
        L_0x0552:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x055c
            X.C139106yE.A00(r1, r2, r3)
            goto L_0x0552
        L_0x055c:
            r5.A0E(r2)
            X.1DT r0 = r7.A05
            r0.A0E(r6)
            java.lang.String r0 = "Statuses refreshed serial executor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x056a:
            java.lang.Object r1 = r15.A01
            X.5lS r1 = (X.C112425lS) r1
            r0 = 1
            X.C112425lS.A00(r1, r0)
            return
        L_0x0573:
            java.lang.Object r0 = r15.A01
            com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment r0 = (com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment) r0
            X.1xI r0 = r0.A01
            if (r0 == 0) goto L_0x057f
            r0.A02()
            return
        L_0x057f:
            java.lang.String r0 = "syncdUpdateHelper"
            goto L_0x05f4
        L_0x0582:
            java.lang.Object r1 = r15.A01
            X.73q r1 = (X.C1409373q) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.C1409373q.A02(r1)
            return
        L_0x058e:
            java.lang.Object r2 = r15.A01
            X.6Gp r2 = (X.AnonymousClass6Gp) r2
            r0 = 0
            r2.A0Y(r0)
            X.1KB r1 = r2.A0F
            X.7RI r0 = A00(r2, r0)
            r1.CGP(r0)
            return
        L_0x05a0:
            java.lang.Object r2 = r15.A01
            X.6Gm r2 = (X.C120906Gm) r2
            r2.A0Q()
            X.206 r0 = r2.A07
            boolean r0 = X.AnonymousClass25A.A0p(r0)
            if (r0 == 0) goto L_0x05ba
            X.6Gk r0 = r2.A0B
            android.view.ViewGroup r1 = r0.A02()
            r0 = 8
            r1.setVisibility(r0)
        L_0x05ba:
            X.1Lg r1 = r2.A08
            X.1WR r0 = r2.A07
            r1.registerObserver(r0)
            return
        L_0x05c2:
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x05d7 }
            X.72h r1 = r4.A02     // Catch:{ RuntimeException -> 0x05d7 }
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ RuntimeException -> 0x05d7 }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x05d7 }
            X.C1406372h.A01(r2, r1, r0)     // Catch:{ RuntimeException -> 0x05d7 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x05d7 }
            return
        L_0x05d7:
            r1 = move-exception
            java.lang.String r0 = "StorageUsagePrefetcher/maybePrefetchStorageUsageData/loading-chat-list"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1QC -> 0x05de }
            return
        L_0x05de:
            java.lang.String r0 = "storage-usage-prefetcherprefetch prefetch cancelled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x05e4:
            java.lang.String r0 = "waIntents"
            goto L_0x05f4
        L_0x05e7:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x05f4
        L_0x05ea:
            java.lang.Object r0 = r15.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r0
            X.3TA r0 = r0.A0O
            if (r0 != 0) goto L_0x05f9
            java.lang.String r0 = "webPagePreviewViewModel"
        L_0x05f4:
            X.C18070vi.A11(r0)
        L_0x05f7:
            r0 = 0
            throw r0
        L_0x05f9:
            r0.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RI.run():void");
    }

    public AnonymousClass7RI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
