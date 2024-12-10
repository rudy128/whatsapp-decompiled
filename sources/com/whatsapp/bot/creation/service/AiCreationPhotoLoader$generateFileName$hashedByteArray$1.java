package com.whatsapp.bot.creation.service;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.security.MessageDigest;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.service.AiCreationPhotoLoader$generateFileName$hashedByteArray$1", f = "AiCreationPhotoLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationPhotoLoader$generateFileName$hashedByteArray$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ MessageDigest $md;
    public final /* synthetic */ String $photoUrl;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationPhotoLoader$generateFileName$hashedByteArray$1(String str, MessageDigest messageDigest, C30391dr r4) {
        super(2, r4);
        this.$md = messageDigest;
        this.$photoUrl = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiCreationPhotoLoader$generateFileName$hashedByteArray$1(this.$photoUrl, this.$md, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.$md.digest(C108975cc.A1O(this.$photoUrl));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationPhotoLoader$generateFileName$hashedByteArray$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
