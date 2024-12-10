package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.mentions.MentionableEntry;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$setupRecyclerView$4", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$setupRecyclerView$4 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$setupRecyclerView$4(CommentsBottomSheet commentsBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = commentsBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CommentsBottomSheet$setupRecyclerView$4 commentsBottomSheet$setupRecyclerView$4 = new CommentsBottomSheet$setupRecyclerView$4(this.this$0, r4);
        commentsBottomSheet$setupRecyclerView$4.Z$0 = AnonymousClass000.A1Y(obj);
        return commentsBottomSheet$setupRecyclerView$4;
    }

    public final Object invokeSuspend(Object obj) {
        MentionableEntry mentionableEntry;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.Z$0 && (mentionableEntry = (MentionableEntry) this.this$0.A0X.getValue()) != null) {
                mentionableEntry.setText("");
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$setupRecyclerView$4) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
