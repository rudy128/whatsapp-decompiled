package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass1KB;
import X.AnonymousClass1OS;
import X.AnonymousClass1WM;
import X.AnonymousClass206;
import X.AnonymousClass3MY;
import X.AnonymousClass4M0;
import X.C18070vi;
import X.C27621Wu;
import X.C28931bI;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C33251iW;
import X.C34531kd;
import X.C37551pj;
import X.C824948e;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.TextCommentLayout$bind$1", f = "TextCommentLayout.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class TextCommentLayout$bind$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ TextCommentLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextCommentLayout$bind$1(TextCommentLayout textCommentLayout, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = textCommentLayout;
        this.$message = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TextCommentLayout$bind$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            TextCommentLayout textCommentLayout = this.this$0;
            AnonymousClass206 r0 = this.$message;
            this.label = 1;
            obj2 = TextCommentLayout.A00(textCommentLayout, r0, this);
            if (obj2 == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass4M0 r11 = (AnonymousClass4M0) obj2;
        int size = r11.A00.size();
        C28931bI r1 = this.this$0.A09;
        if (size > 0) {
            r1.A04(0);
            CommentSendFailedIconView commentSendFailedIconView = (CommentSendFailedIconView) this.this$0.A09.A02();
            AnonymousClass206 r10 = this.$message;
            C18070vi.A0d(r10, 0);
            Context A04 = AnonymousClass3MY.A04(commentSendFailedIconView);
            AnonymousClass1KB globalUI = commentSendFailedIconView.getGlobalUI();
            C34531kd sendMedia = commentSendFailedIconView.getSendMedia();
            AnonymousClass10I waWorkers = commentSendFailedIconView.getWaWorkers();
            C33251iW userActions = commentSendFailedIconView.getUserActions();
            C37551pj r7 = (C37551pj) C18070vi.A0E(commentSendFailedIconView.getBlockListManager());
            AnonymousClass122 coreMessageStore = commentSendFailedIconView.getCoreMessageStore();
            AnonymousClass1WM messageAddOnManager = commentSendFailedIconView.getMessageAddOnManager();
            C18070vi.A0d(r7, 7);
            commentSendFailedIconView.setOnClickListener(new C824948e(A04, globalUI, sendMedia, userActions, r7, coreMessageStore, messageAddOnManager, r10, r11, waWorkers));
        } else {
            r1.A04(8);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TextCommentLayout$bind$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
