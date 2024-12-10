package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass1E8;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity$onShareProfileClicked$1", f = "CoinFlipPreviewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipPreviewActivity$onShareProfileClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E8 $contact;
    public int label;
    public final /* synthetic */ CoinFlipPreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipPreviewActivity$onShareProfileClicked$1(AnonymousClass1E8 r2, CoinFlipPreviewActivity coinFlipPreviewActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = coinFlipPreviewActivity;
        this.$contact = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoinFlipPreviewActivity$onShareProfileClicked$1(this.$contact, this.this$0, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
        X.CDX.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r5 = "android.intent.extra.STREAM"
            int r0 = r11.label
            if (r0 != 0) goto L_0x00c5
            X.C30691eM.A01(r12)
            com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r0 = r11.this$0
            X.17r r1 = r0.A04
            java.lang.String r0 = "me.jpg"
            java.io.File r9 = r1.A0a(r0)
            r2 = 1
            com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r0 = r11.this$0     // Catch:{ IOException -> 0x00b4 }
            X.1Lr r1 = r0.A06     // Catch:{ IOException -> 0x00b4 }
            if (r1 == 0) goto L_0x00a9
            X.1E8 r0 = r11.$contact     // Catch:{ IOException -> 0x00b4 }
            java.io.File r0 = r1.A00(r0)     // Catch:{ IOException -> 0x00b4 }
            X.C17960vV.A07(r0)     // Catch:{ IOException -> 0x00b4 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b4 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00b4 }
            com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r6 = r11.this$0     // Catch:{ IOException -> 0x00b4 }
            X.1E8 r8 = r11.$contact     // Catch:{ IOException -> 0x00b4 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a5 }
            r4.<init>(r9)     // Catch:{ all -> 0x00a5 }
            X.C64062u9.A00(r3, r4)     // Catch:{ all -> 0x009e }
            android.net.Uri r10 = X.C64062u9.A02(r6, r9)     // Catch:{ all -> 0x009e }
            X.C18070vi.A0X(r10)     // Catch:{ all -> 0x009e }
            X.1Lp r0 = r6.A03     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0091
            X.1ga r1 = r0.A05()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x009e }
            r1.A0E(r0)     // Catch:{ all -> 0x009e }
            r0 = 2
            android.content.Intent[] r7 = new android.content.Intent[r0]     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x009e }
            r1.<init>(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "image/*"
            android.content.Intent r0 = r1.setType(r0)     // Catch:{ all -> 0x009e }
            android.content.Intent r1 = r0.putExtra(r5, r10)     // Catch:{ all -> 0x009e }
            r0 = 0
            r7[r0] = r1     // Catch:{ all -> 0x009e }
            java.lang.Class<X.6Ea> r0 = X.C120526Ea.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x009e }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x009e }
            android.net.Uri r0 = android.net.Uri.fromFile(r9)     // Catch:{ all -> 0x009e }
            android.content.Intent r5 = r1.putExtra(r5, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "name"
            X.1Me r0 = r6.A05     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r0.A0I(r8)     // Catch:{ all -> 0x009e }
            android.content.Intent r0 = r5.putExtra(r1, r0)     // Catch:{ all -> 0x009e }
            java.util.List r1 = X.C18070vi.A0O(r0, r7, r2)     // Catch:{ all -> 0x009e }
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass4aU.A01(r0, r0, r1)     // Catch:{ all -> 0x009e }
            r6.startActivity(r0)     // Catch:{ all -> 0x009e }
            r4.close()     // Catch:{ all -> 0x00a5 }
            r3.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c2
        L_0x0091:
            java.lang.String r0 = "caches"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x009e }
            goto L_0x009c
        L_0x0097:
            java.lang.String r0 = "waContactNames"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x009e }
        L_0x009c:
            r0 = 0
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = "contactPhotoHelper"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x00b4 }
            r0 = 0
            goto L_0x00b3
        L_0x00b0:
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x00b4 }
        L_0x00b3:
            throw r0     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r0 = r11.this$0
            X.1KB r1 = r0.A05
            r0 = 2131894542(0x7f12210e, float:1.9423892E38)
            r1.A08(r0, r2)
        L_0x00c2:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity$onShareProfileClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipPreviewActivity$onShareProfileClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
