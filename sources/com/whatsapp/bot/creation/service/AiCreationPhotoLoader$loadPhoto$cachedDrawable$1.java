package com.whatsapp.bot.creation.service;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.graphics.drawable.Drawable;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.service.AiCreationPhotoLoader$loadPhoto$cachedDrawable$1", f = "AiCreationPhotoLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationPhotoLoader$loadPhoto$cachedDrawable$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $resultFile;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationPhotoLoader$loadPhoto$cachedDrawable$1(File file, C30391dr r3) {
        super(2, r3);
        this.$resultFile = file;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AiCreationPhotoLoader$loadPhoto$cachedDrawable$1(this.$resultFile, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AiCreationPhotoLoader$loadPhoto$cachedDrawable$1(this.$resultFile, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (!this.$resultFile.exists()) {
                return null;
            }
            this.$resultFile.getPath();
            return Drawable.createFromPath(this.$resultFile.getPath());
        }
        throw AnonymousClass000.A0l();
    }
}
