package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass1FL;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryTabsViewModel$evaluateGoogleIntent$1", f = "GalleryTabsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryTabsViewModel$evaluateGoogleIntent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FL $fragmentActivity;
    public int label;
    public final /* synthetic */ GalleryTabsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryTabsViewModel$evaluateGoogleIntent$1(AnonymousClass1FL r2, GalleryTabsViewModel galleryTabsViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = galleryTabsViewModel;
        this.$fragmentActivity = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GalleryTabsViewModel$evaluateGoogleIntent$1(this.$fragmentActivity, this.this$0, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r6.resolveActivity(r7.$fragmentActivity.getPackageManager()) == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x004e
            X.C30691eM.A01(r8)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = r7.this$0
            X.02n r0 = r0.A01
            r6 = 0
            if (r0 == 0) goto L_0x002f
            X.02h r5 = r0.A00()
            X.1FL r4 = r7.$fragmentActivity
            X.7HC r3 = X.AnonymousClass7HC.A00
            X.65Q r2 = X.AnonymousClass65Q.A00
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            X.6x4 r0 = new X.6x4
            r0.<init>()
            r0.A01 = r3
            r0.A02 = r6
            r0.A04 = r1
            r0.A00 = r2
            r0.A03 = r6
            android.content.Intent r6 = r5.A03(r4, r0)
        L_0x002f:
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = r7.this$0
            X.1DT r2 = r0.A05
            if (r6 == 0) goto L_0x0042
            X.1FL r0 = r7.$fragmentActivity
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r0 = r6.resolveActivity(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            X.7HJ r0 = new X.7HJ
            r0.<init>(r1)
            r2.A0E(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.GalleryTabsViewModel$evaluateGoogleIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryTabsViewModel$evaluateGoogleIntent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
