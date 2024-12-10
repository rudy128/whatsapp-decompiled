package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$setupRecyclerView$3", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$setupRecyclerView$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ LinearLayoutManager $layoutManager;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$setupRecyclerView$3(LinearLayoutManager linearLayoutManager, C30391dr r3) {
        super(2, r3);
        this.$layoutManager = linearLayoutManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CommentsBottomSheet$setupRecyclerView$3 commentsBottomSheet$setupRecyclerView$3 = new CommentsBottomSheet$setupRecyclerView$3(this.$layoutManager, r4);
        commentsBottomSheet$setupRecyclerView$3.Z$0 = AnonymousClass000.A1Y(obj);
        return commentsBottomSheet$setupRecyclerView$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.Z$0) {
                this.$layoutManager.A13(0);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$setupRecyclerView$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
