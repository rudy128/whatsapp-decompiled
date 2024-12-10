package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass9X7;
import X.C186619eU;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C57732jY;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerProfilePhotoLoader$prefetchProfilePhotoSync$2", f = "DialerProfilePhotoLoader.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class DialerProfilePhotoLoader$prefetchProfilePhotoSync$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ int $photoId;
    public final /* synthetic */ int $photoType;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C186619eU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerProfilePhotoLoader$prefetchProfilePhotoSync$2(C186619eU r2, AnonymousClass1BI r3, C30391dr r4, int i, int i2) {
        super(2, r4);
        this.this$0 = r2;
        this.$jid = r3;
        this.$photoId = i;
        this.$photoType = i2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new DialerProfilePhotoLoader$prefetchProfilePhotoSync$2(this.this$0, this.$jid, r8, this.$photoId, this.$photoType);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C186619eU r1 = this.this$0;
            AnonymousClass1BI r5 = this.$jid;
            int i2 = this.$photoId;
            int i3 = this.$photoType;
            this.L$0 = r1;
            this.L$1 = r5;
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            r1.A01.A00(new AnonymousClass9X7(A0m), r5, (C57732jY) null, "DialerProfilePictureLoader.prefetchProfilePhotoSync", i2, i3, false);
            obj = A0m.A0C();
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerProfilePhotoLoader$prefetchProfilePhotoSync$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
