package com.whatsapp.mediacomposer.loaders;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C128536gH;
import X.C139266yY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.loaders.MediaFilesLoader$loadMediaFilesAsync$1$1$1", f = "MediaFilesLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaFilesLoader$loadMediaFilesAsync$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C128536gH $result;
    public final /* synthetic */ Uri $uri;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C139266yY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaFilesLoader$loadMediaFilesAsync$1$1$1(Uri uri, C128536gH r3, C139266yY r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r4;
        this.$result = r3;
        this.$uri = uri;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        C139266yY r3 = this.this$0;
        MediaFilesLoader$loadMediaFilesAsync$1$1$1 mediaFilesLoader$loadMediaFilesAsync$1$1$1 = new MediaFilesLoader$loadMediaFilesAsync$1$1$1(this.$uri, this.$result, r3, r6);
        mediaFilesLoader$loadMediaFilesAsync$1$1$1.L$0 = obj;
        return mediaFilesLoader$loadMediaFilesAsync$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C139266yY r2 = this.this$0;
            try {
                C139266yY.A00(this.$uri, this.$result, r2);
                obj2 = C27621Wu.A00;
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
            return new C30671eK(obj2);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaFilesLoader$loadMediaFilesAsync$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
