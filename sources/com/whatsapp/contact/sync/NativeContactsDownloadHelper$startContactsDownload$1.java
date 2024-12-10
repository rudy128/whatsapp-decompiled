package com.whatsapp.contact.sync;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C26981Ug;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.sync.NativeContactsDownloadHelper$startContactsDownload$1", f = "NativeContactsDownloadHelper.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class NativeContactsDownloadHelper$startContactsDownload$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C26981Ug $callback;
    public final /* synthetic */ Integer $downloadTrigger;
    public final /* synthetic */ UserJid $myJid;
    public final /* synthetic */ boolean $persistContactAfterDownload;
    public int label;
    public final /* synthetic */ NativeContactsDownloadHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeContactsDownloadHelper$startContactsDownload$1(NativeContactsDownloadHelper nativeContactsDownloadHelper, UserJid userJid, C26981Ug r4, Integer num, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = nativeContactsDownloadHelper;
        this.$myJid = userJid;
        this.$persistContactAfterDownload = z;
        this.$downloadTrigger = num;
        this.$callback = r4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        NativeContactsDownloadHelper nativeContactsDownloadHelper = this.this$0;
        UserJid userJid = this.$myJid;
        boolean z = this.$persistContactAfterDownload;
        return new NativeContactsDownloadHelper$startContactsDownload$1(nativeContactsDownloadHelper, userJid, this.$callback, this.$downloadTrigger, r9, z);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            NativeContactsDownloadHelper nativeContactsDownloadHelper = this.this$0;
            UserJid userJid = this.$myJid;
            boolean z = this.$persistContactAfterDownload;
            Integer num = this.$downloadTrigger;
            C26981Ug r5 = this.$callback;
            this.label = 1;
            if (NativeContactsDownloadHelper.A00(nativeContactsDownloadHelper, userJid, r5, num, (String) null, this, 4000, z) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NativeContactsDownloadHelper$startContactsDownload$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
