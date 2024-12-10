package X;

import com.whatsapp.mediacomposer.GifComposerFragment;

/* renamed from: X.805  reason: invalid class name */
public final class AnonymousClass805 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GifComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass805(GifComposerFragment gifComposerFragment) {
        super(1);
        this.this$0 = gifComposerFragment;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [X.70X, X.6Mn] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r0 != true) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r17.this$0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r4 = r18
            X.85P r4 = (X.AnonymousClass85P) r4
            boolean r0 = r4 instanceof X.AnonymousClass7JQ
            if (r0 == 0) goto L_0x00fc
            r0 = r17
            com.whatsapp.mediacomposer.GifComposerFragment r1 = r0.this$0
            android.view.View r2 = r1.A0B
            if (r2 == 0) goto L_0x00fc
            X.7JQ r4 = (X.AnonymousClass7JQ) r4
            android.net.Uri r3 = r4.A00
            java.io.File r13 = r4.A01
            boolean r0 = r4.A02
            r14 = 1
            if (r0 == 0) goto L_0x0049
            X.1FL r4 = r1.A1D()     // Catch:{ IOException -> 0x00e8 }
            X.6Mn r5 = new X.6Mn     // Catch:{ IOException -> 0x00e8 }
            r5.<init>()     // Catch:{ IOException -> 0x00e8 }
            r3 = 0
            X.CmA r0 = X.DRK.A04     // Catch:{ IOException -> 0x00e8 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r13, r0)     // Catch:{ IOException -> 0x00e8 }
            X.DRK r0 = X.DRK.A01(r0, r3)     // Catch:{ IOException -> 0x00e8 }
            r5.A03 = r0     // Catch:{ IOException -> 0x00e8 }
            X.BFF r0 = r0.A05(r4)     // Catch:{ IOException -> 0x00e8 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x00e8 }
            r5.A01 = r0     // Catch:{ IOException -> 0x00e8 }
            com.whatsapp.WaImageView r3 = new com.whatsapp.WaImageView     // Catch:{ IOException -> 0x00e8 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00e8 }
            X.BFF r0 = r5.A01     // Catch:{ IOException -> 0x00e8 }
            r3.setImageDrawable(r0)     // Catch:{ IOException -> 0x00e8 }
            r5.A02 = r3     // Catch:{ IOException -> 0x00e8 }
            goto L_0x008a
        L_0x0049:
            X.190 r5 = r1.A04     // Catch:{ IOException -> 0x00e8 }
            if (r5 == 0) goto L_0x00de
            X.0ve r9 = r1.A28()     // Catch:{ IOException -> 0x00e8 }
            X.1KB r6 = r1.A07     // Catch:{ IOException -> 0x00e8 }
            if (r6 == 0) goto L_0x00da
            X.11C r7 = r1.A09     // Catch:{ IOException -> 0x00e8 }
            if (r7 == 0) goto L_0x00d6
            X.1FL r4 = r1.A1D()     // Catch:{ IOException -> 0x00e8 }
            X.118 r8 = r1.A0B     // Catch:{ IOException -> 0x00e8 }
            if (r8 == 0) goto L_0x00d0
            X.8Ai r0 = r1.A29()     // Catch:{ IOException -> 0x00e8 }
            if (r0 == 0) goto L_0x0072
            X.72S r3 = X.AnonymousClass73D.A00(r3, r0)     // Catch:{ IOException -> 0x00e8 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x00e8 }
            boolean r0 = r3.A0K     // Catch:{ all -> 0x00e5 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x00e8 }
            r15 = 1
            if (r0 == r14) goto L_0x0073
        L_0x0072:
            r15 = 0
        L_0x0073:
            boolean r16 = X.C39761tb.A01()     // Catch:{ IOException -> 0x00e8 }
            X.10I r11 = r1.A0V     // Catch:{ IOException -> 0x00e8 }
            if (r11 == 0) goto L_0x00cc
            X.00H r0 = r1.A0Y     // Catch:{ IOException -> 0x00e8 }
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r10 = r0.get()     // Catch:{ IOException -> 0x00e8 }
            X.6gC r10 = (X.AnonymousClass6gC) r10     // Catch:{ IOException -> 0x00e8 }
            r12 = 0
            X.70X r5 = X.AnonymousClass70X.A04(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00e8 }
        L_0x008a:
            r1.A00 = r5     // Catch:{ IOException -> 0x00e8 }
            r5.A0W(r14)     // Catch:{ IOException -> 0x00e8 }
            r0 = 2131436762(0x7f0b24da, float:1.8495404E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MW.A0D(r2, r0)
            X.70X r2 = r1.A00
            r0 = 0
            if (r2 == 0) goto L_0x009f
            android.view.View r0 = r2.A09()
        L_0x009f:
            X.C108995ce.A0w(r0, r3)
            boolean r0 = r1.A2U()
            if (r0 == 0) goto L_0x00c2
            r4 = 0
            X.7HT r3 = new X.7HT
            r3.<init>(r13, r4)
            X.8Ai r0 = r1.A29()
            if (r0 == 0) goto L_0x00c2
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6tN r2 = r0.A0R
            if (r2 == 0) goto L_0x00c2
            X.7Hc r0 = new X.7Hc
            r0.<init>(r1, r4)
            r2.A02(r3, r0)
        L_0x00c2:
            r1.A2I()
            goto L_0x00fc
        L_0x00c6:
            java.lang.String r0 = "heroSettingProvider"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e3
        L_0x00cc:
            X.AnonymousClass3MW.A1G()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e3
        L_0x00d0:
            java.lang.String r0 = "waContext"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e3
        L_0x00d6:
            X.AnonymousClass3MW.A1N()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e3
        L_0x00da:
            X.AnonymousClass3MW.A1C()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e3
        L_0x00de:
            java.lang.String r0 = "crashLogs"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x00e8 }
        L_0x00e3:
            r0 = 0
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x00e8 }
        L_0x00e7:
            throw r0     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            r2 = move-exception
            java.lang.String r0 = "GifComposerFragment/onViewCreated videoPlayer initialization"
            com.whatsapp.util.Log.e(r0, r2)
            X.1KB r3 = r1.A07
            if (r3 == 0) goto L_0x00ff
            r2 = 2131889980(0x7f120f3c, float:1.9414639E38)
            r0 = 0
            r3.A08(r2, r0)
            X.C108955ca.A1M(r1)
        L_0x00fc:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00ff:
            X.AnonymousClass3MW.A1C()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass805.invoke(java.lang.Object):java.lang.Object");
    }
}
