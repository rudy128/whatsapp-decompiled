package com.whatsapp.avatar.init;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2", f = "AvatarStickerPackWorker.kt", i = {0, 0, 0, 0}, l = {56}, m = "invokeSuspend", n = {"$this$withContext", "origin", "originType", "cancelOngoingDownload"}, s = {"L$0", "L$1", "I$0", "Z$0"})
public final class AvatarStickerPackWorker$doWork$2 extends C30431dv implements AnonymousClass1OS {
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ AvatarStickerPackWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker$doWork$2(AvatarStickerPackWorker avatarStickerPackWorker, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarStickerPackWorker;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarStickerPackWorker$doWork$2 avatarStickerPackWorker$doWork$2 = new AvatarStickerPackWorker$doWork$2(this.this$0, r4);
        avatarStickerPackWorker$doWork$2.L$0 = obj;
        return avatarStickerPackWorker$doWork$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r3 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 != r3) goto L_0x0105
            boolean r9 = r12.Z$0
            int r8 = r12.I$0
            java.lang.Object r6 = r12.L$1
            java.lang.String r6 = (java.lang.String) r6
            X.C30691eM.A01(r13)
        L_0x0014:
            boolean r0 = X.AnonymousClass000.A1Y(r13)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "AvatarStickerPackWorker/triggered but user has no avatar, canceling retry loop."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.6ue r2 = r0.A02
            java.lang.String r1 = "AvatarStickerPackWorker/failure"
            java.lang.String r0 = "abort_user_without_avatar"
            r2.A02(r3, r1, r0)
            X.8Jk r0 = new X.8Jk
            r0.<init>()
        L_0x002f:
            X.1Ug r2 = new X.1Ug
            r2.<init>()
            r0 = 7
            if (r8 == r0) goto L_0x004a
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.73Q r1 = r0.A03
            r0 = 0
            java.util.ArrayList r1 = X.AnonymousClass73Q.A02(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0068
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0068
        L_0x004a:
            r11 = 1
        L_0x004b:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.9hw r5 = r0.A00
            X.7xb r7 = new X.7xb
            r7.<init>(r2)
            r10 = 0
            X.C18070vi.A0d(r6, r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0I
            r0.set(r10)
            X.10I r0 = r5.A08
            X.7QH r4 = new X.7QH
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.CGF(r4)
            goto L_0x00cb
        L_0x0068:
            java.util.Iterator r1 = r1.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            X.725 r0 = X.C108945cZ.A0y(r1)
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x006c
            r11 = 0
            goto L_0x004b
        L_0x007c:
            X.C30691eM.A01(r13)
            java.lang.Object r4 = r12.L$0
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.A6Y r1 = r0.A01
            java.lang.String r0 = "origin"
            java.lang.String r6 = r1.A03(r0)
            if (r6 != 0) goto L_0x0091
            java.lang.String r6 = "retry"
        L_0x0091:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.A6Y r5 = r0.A01
            java.lang.String r1 = "origin_type"
            r0 = 6
            int r8 = r5.A02(r1, r0)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.A6Y r0 = r0.A01
            java.lang.String r1 = "cancel_ongoing"
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00c9
            boolean r9 = X.AnonymousClass000.A1Y(r1)
        L_0x00b4:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.1Uk r0 = r0.A01
            r12.L$0 = r4
            r12.L$1 = r6
            r12.I$0 = r8
            r12.Z$0 = r9
            r12.label = r3
            java.lang.Object r13 = r0.A00(r12, r3)
            if (r13 != r2) goto L_0x0014
            return r2
        L_0x00c9:
            r9 = 0
            goto L_0x00b4
        L_0x00cb:
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00d2 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00d2 }
            goto L_0x00d7
        L_0x00d2:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x00d7:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r1 = r12.this$0
            java.lang.Throwable r0 = X.C30671eK.A00(r2)
            if (r0 != 0) goto L_0x0100
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = X.AnonymousClass3MX.A1a(r2)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r1 = r12.this$0
            if (r0 == 0) goto L_0x00fa
            X.6ue r2 = r1.A02
            r1 = 0
            java.lang.String r0 = "AvatarStickerPackWorker/success"
            r2.A02(r3, r0, r1)
            X.8Jk r0 = new X.8Jk
            r0.<init>()
        L_0x00f6:
            X.C18070vi.A0b(r0)
            return r0
        L_0x00fa:
            r0 = 0
            X.9Lg r0 = com.whatsapp.avatar.init.AvatarStickerPackWorker.A00(r1, r0)
            goto L_0x00f6
        L_0x0100:
            X.9Lg r0 = com.whatsapp.avatar.init.AvatarStickerPackWorker.A00(r1, r0)
            return r0
        L_0x0105:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackWorker$doWork$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
