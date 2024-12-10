package X;

import android.content.BroadcastReceiver;

/* renamed from: X.5dA  reason: invalid class name and case insensitive filesystem */
public class C109305dA extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public C109305dA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        com.whatsapp.util.Log.i(r0);
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r6.A01).A2F(true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b2, code lost:
        com.whatsapp.util.Log.i(r0);
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r6.A01).A2F(false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.gallerypicker.GalleryPickerFragment.A03(r2, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0147;
                case 1: goto L_0x012c;
                case 2: goto L_0x00c9;
                case 3: goto L_0x006b;
                case 4: goto L_0x0052;
                case 5: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.nfc.action.ADAPTER_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r6.A01
            X.01E r0 = (X.AnonymousClass01E) r0
            r0.invalidateOptionsMenu()
        L_0x0018:
            return
        L_0x0019:
            java.lang.String r0 = r8.getAction()
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.location.PROVIDERS_CHANGED"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.Object r4 = r6.A01
            X.7By r4 = (X.C143087By) r4
            X.1RB r0 = r4.A0w
            boolean r3 = r0.A07()
            boolean r0 = r4.A0S
            if (r0 == r3) goto L_0x0018
            r4.A0S = r3
            X.2nL r0 = r4.A0P
            r1 = 0
            if (r0 == 0) goto L_0x0046
            if (r3 == 0) goto L_0x004c
            r0 = 1
            r4.A0R = r0
        L_0x0046:
            r4.A04 = r1
            X.C143087By.A07(r4)
            return
        L_0x004c:
            r0.A05 = r1
            X.C143087By.A06(r4)
            goto L_0x0046
        L_0x0052:
            java.lang.Object r2 = r6.A01
            X.2qG r2 = (X.C61792qG) r2
            X.194 r1 = r2.A02
            r0 = 0
            r1.A00 = r0
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0018
            X.1Vn r2 = r2.A09
            r1 = 8
            java.lang.String r0 = "Roadblocks"
            r2.BEJ(r1, r0)
            return
        L_0x006b:
            r2 = 1
            X.C18070vi.A0d(r8, r2)
            java.lang.String r1 = r8.getAction()
            if (r1 == 0) goto L_0x0018
            int r0 = r1.hashCode()
            switch(r0) {
                case -1514214344: goto L_0x00be;
                case -1142424621: goto L_0x00a8;
                case -963871873: goto L_0x0093;
                case -625887599: goto L_0x0088;
                case 1412829408: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            return
        L_0x007d:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_STARTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED"
            goto L_0x00b2
        L_0x0088:
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT"
            goto L_0x009d
        L_0x0093:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED"
        L_0x009d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r6.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A2F(r2, r2)
            return
        L_0x00a8:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_FINISHED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED"
        L_0x00b2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r1
            r0 = 0
            r1.A2F(r0, r2)
            return
        L_0x00be:
            java.lang.String r0 = "android.intent.action.MEDIA_MOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_MOUNTED"
            goto L_0x00ea
        L_0x00c9:
            r4 = 1
            X.C18070vi.A0d(r8, r4)
            java.lang.Object r2 = r6.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r2 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r2
            java.lang.String r3 = r8.getAction()
            if (r3 == 0) goto L_0x0018
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1514214344: goto L_0x00e0;
                case -1142424621: goto L_0x00ee;
                case -963871873: goto L_0x00ff;
                case -625887599: goto L_0x010a;
                case 1412829408: goto L_0x011b;
                default: goto L_0x00df;
            }
        L_0x00df:
            return
        L_0x00e0:
            java.lang.String r0 = "android.intent.action.MEDIA_MOUNTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_MOUNTED"
        L_0x00ea:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00ee:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_FINISHED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_SCANNER_FINISHED"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.gallerypicker.GalleryPickerFragment.A03(r2, r1, r1)
            return
        L_0x00ff:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_UNMOUNTED"
            goto L_0x0114
        L_0x010a:
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_EJECT"
        L_0x0114:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.gallerypicker.GalleryPickerFragment.A03(r2, r4, r1)
            return
        L_0x011b:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_STARTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_SCANNER_STARTED"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.gallerypicker.GalleryPickerFragment.A03(r2, r1, r4)
            return
        L_0x012c:
            java.lang.Object r1 = r6.A01
            X.5tO r1 = (X.C115095tO) r1
            X.3d2 r0 = r1.A02
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0018
            X.3d2 r0 = r1.A02
            r0.dismiss()
            X.5YX r0 = r1.A0A
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x0147:
            java.lang.Object r1 = r6.A01
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            X.0vb r0 = r1.A0C
            java.util.Locale r5 = r0.A0N()
            X.1MA r0 = r1.A03
            java.util.Map r4 = r0.A02
            monitor-enter(r4)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r4)     // Catch:{ all -> 0x01a2 }
            r2 = 0
        L_0x015b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x0189
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)     // Catch:{ all -> 0x01a2 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x01a2 }
            X.1BI r1 = (X.AnonymousClass1BI) r1     // Catch:{ all -> 0x01a2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01a2 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x015b
            if (r0 == 0) goto L_0x015b
            java.util.Locale r0 = r0.A0d     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x015b
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x015b
            if (r2 != 0) goto L_0x0185
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ all -> 0x01a2 }
        L_0x0185:
            r2.add(r1)     // Catch:{ all -> 0x01a2 }
            goto L_0x015b
        L_0x0189:
            if (r2 == 0) goto L_0x01a0
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x01a2 }
        L_0x018f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x019d
            X.1BI r0 = X.C17880vN.A0Q(r1)     // Catch:{ all -> 0x01a2 }
            r4.remove(r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x018f
        L_0x019d:
            r2.size()     // Catch:{ all -> 0x01a2 }
        L_0x01a0:
            monitor-exit(r4)     // Catch:{ all -> 0x01a2 }
            return
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109305dA.onReceive(android.content.Context, android.content.Intent):void");
    }
}
