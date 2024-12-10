package com.whatsapp.music.viewmodels;

import X.AnonymousClass1OS;
import X.C111155iT;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.os.Message;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.music.viewmodels.MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1", f = "MusicBrowseViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $endCursorFromPrevQuery;
    public final /* synthetic */ Message $msg;
    public int label;
    public final /* synthetic */ C111155iT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1(Message message, C111155iT r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$msg = message;
        this.$endCursorFromPrevQuery = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1(this.$msg, this.this$0, this.$endCursorFromPrevQuery, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (X.C18070vi.A19(r12.A00, true) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r2 = 1
            if (r0 == 0) goto L_0x00a7
            if (r0 != r2) goto L_0x00ed
            X.C30691eM.A01(r12)
        L_0x000c:
            X.5iT r3 = r11.this$0
            java.lang.String r1 = r11.$endCursorFromPrevQuery
            X.6sG r12 = (X.C135476sG) r12
            r0 = 0
            r3.A02 = r0
            r3.A01 = r12
            if (r12 != 0) goto L_0x0027
            X.1DT r1 = r3.A04
            X.77c r0 = X.C1418277c.A0G
            X.1IX r0 = X.AnonymousClass1IX.of(r0)
        L_0x0021:
            r1.A0E(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0027:
            if (r1 == 0) goto L_0x00a2
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00a2
            X.1DT r0 = r3.A04
            java.lang.Object r0 = r0.A06()
            X.10e r0 = (X.C199310e) r0
            if (r0 == 0) goto L_0x00a2
            java.util.ArrayList r4 = X.C17880vN.A10(r0)
        L_0x003d:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x006c
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "search_text"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0055
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006c
        L_0x0055:
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x0067
            java.lang.String r0 = "artist_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0067
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006c
        L_0x0067:
            X.77c r0 = X.C1418277c.A0F
            r4.add(r0)
        L_0x006c:
            java.lang.Object r0 = X.C29431cG.A0e(r4)
            X.77c r1 = X.C1418277c.A0E
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x007f
            int r0 = X.AnonymousClass000.A0Q(r4)
            r4.remove(r0)
        L_0x007f:
            java.util.List r0 = r12.A02
            r4.addAll(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0099
            X.77c r1 = X.C1418277c.A0D
        L_0x008c:
            r4.add(r1)
        L_0x008f:
            X.1DT r1 = r3.A04
            X.1IX r0 = X.AnonymousClass1IX.copyOf((java.util.Collection) r4)
            X.C18070vi.A0X(r0)
            goto L_0x0021
        L_0x0099:
            java.lang.Boolean r0 = r12.A00
            boolean r0 = X.C18070vi.A19(r0, r2)
            if (r0 == 0) goto L_0x008f
            goto L_0x008c
        L_0x00a2:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            goto L_0x003d
        L_0x00a7:
            X.C30691eM.A01(r12)
            X.5iT r0 = r11.this$0
            X.00H r0 = r0.A05
            java.lang.Object r5 = r0.get()
            com.whatsapp.productinfra.music.api.MusicRepository r5 = (com.whatsapp.productinfra.music.api.MusicRepository) r5
            X.5iT r0 = r11.this$0
            java.lang.String r6 = r0.A06
            android.os.Message r0 = r11.$msg
            android.os.Bundle r1 = r0.getData()
            java.lang.String r0 = "search_text"
            java.lang.String r7 = r1.getString(r0)
            android.os.Message r0 = r11.$msg
            android.os.Bundle r1 = r0.getData()
            java.lang.String r0 = "artist_id"
            java.lang.String r8 = r1.getString(r0)
            java.lang.String r9 = r11.$endCursorFromPrevQuery
            r11.label = r2
            X.00H r0 = r5.A00
            java.lang.Object r0 = r0.get()
            X.0wl r0 = (X.C18600wl) r0
            X.0wl r0 = r0.A0A(r2)
            r10 = 0
            com.whatsapp.productinfra.music.api.MusicRepository$fetchCatalog$2 r4 = new com.whatsapp.productinfra.music.api.MusicRepository$fetchCatalog$2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = X.C30451dy.A00(r11, r0, r4)
            if (r12 != r3) goto L_0x000c
            return r3
        L_0x00ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.music.viewmodels.MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MusicBrowseViewModel$executeRequestHandler$2$1$handleMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
