package com.whatsapp.productinfra.music.api;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.api.MusicRepository$fetchCatalog$2", f = "MusicRepository.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class MusicRepository$fetchCatalog$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $artistId;
    public final /* synthetic */ String $endCursorFromPrevQuery;
    public final /* synthetic */ String $searchText;
    public final /* synthetic */ String $sessionId;
    public int label;
    public final /* synthetic */ MusicRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicRepository$fetchCatalog$2(MusicRepository musicRepository, String str, String str2, String str3, String str4, C30391dr r7) {
        super(2, r7);
        this.this$0 = musicRepository;
        this.$sessionId = str;
        this.$searchText = str2;
        this.$artistId = str3;
        this.$endCursorFromPrevQuery = str4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new MusicRepository$fetchCatalog$2(this.this$0, this.$sessionId, this.$searchText, this.$artistId, this.$endCursorFromPrevQuery, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String str = this.$sessionId;
            String str2 = this.$searchText;
            String str3 = this.$artistId;
            String str4 = this.$endCursorFromPrevQuery;
            this.label = 1;
            obj = ((MusicApi) this.this$0.A01.get()).A02(str, str2, str3, str4, this);
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
        return ((MusicRepository$fetchCatalog$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
