package com.whatsapp.mediacomposer.loaders;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C108945cZ;
import X.C108985cd;
import X.C128536gH;
import X.C139266yY;
import X.C197009w0;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41731wy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.loaders.MediaFilesLoader$loadMediaFilesAsync$1", f = "MediaFilesLoader.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class MediaFilesLoader$loadMediaFilesAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C128536gH $result;
    public final /* synthetic */ C41731wy $resultEvent;
    public final /* synthetic */ List $uris;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C139266yY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaFilesLoader$loadMediaFilesAsync$1(C128536gH r2, C139266yY r3, C41731wy r4, List list, C30391dr r6) {
        super(2, r6);
        this.$uris = list;
        this.$resultEvent = r4;
        this.$result = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        List list = this.$uris;
        MediaFilesLoader$loadMediaFilesAsync$1 mediaFilesLoader$loadMediaFilesAsync$1 = new MediaFilesLoader$loadMediaFilesAsync$1(this.$result, this.this$0, this.$resultEvent, list, r8);
        mediaFilesLoader$loadMediaFilesAsync$1.L$0 = obj;
        return mediaFilesLoader$loadMediaFilesAsync$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r9 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r7 = (AnonymousClass1OX) this.L$0;
            List list = this.$uris;
            C139266yY r6 = this.this$0;
            C128536gH r5 = this.$result;
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108985cd.A1P(A0D, new MediaFilesLoader$loadMediaFilesAsync$1$1$1(C108945cZ.A0M(it), r5, r6, (C30391dr) null), r7);
            }
            this.label = 1;
            if (C197009w0.A00(A0D, this) == r9) {
                return r9;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$resultEvent.A0E(this.$result);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaFilesLoader$loadMediaFilesAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
