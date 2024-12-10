package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37451pZ;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.CommentContactPictureView$bind$1", f = "CommentContactPictureView.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class CommentContactPictureView$bind$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C37451pZ $contactPhotoLoader;
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ CommentContactPictureView this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.comments.ui.CommentContactPictureView$bind$1$1", f = "CommentContactPictureView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.comments.ui.CommentContactPictureView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(commentContactPictureView3, A0H, A0S, r8);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C37451pZ.this.A07(commentContactPictureView3, A0H);
                CommentContactPictureView commentContactPictureView = commentContactPictureView3;
                commentContactPictureView.setContentDescription(C17880vN.A0q(commentContactPictureView.getContext(), A0S, AnonymousClass3MW.A1a(), 0, 2131894804));
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentContactPictureView$bind$1(C37451pZ r2, CommentContactPictureView commentContactPictureView, AnonymousClass206 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = commentContactPictureView;
        this.$message = r4;
        this.$contactPhotoLoader = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CommentContactPictureView$bind$1(this.$contactPhotoLoader, this.this$0, this.$message, r6);
    }

    public final Object invokeSuspend(Object obj) {
        final AnonymousClass1E7 A0H;
        final String A0S;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CommentContactPictureView commentContactPictureView = this.this$0;
            AnonymousClass206 r1 = this.$message;
            if (r1.A0v.A02) {
                AnonymousClass11S meManager = commentContactPictureView.getMeManager();
                meManager.A0I();
                A0H = meManager.A0D;
            } else {
                UserJid A0I = r1.A0I();
                if (A0I != null) {
                    A0H = commentContactPictureView.getContactManager().A0H(A0I);
                }
            }
            if (A0H != null) {
                boolean z = this.$message.A0v.A02;
                CommentContactPictureView commentContactPictureView2 = this.this$0;
                if (z) {
                    A0S = commentContactPictureView2.getContext().getString(2131898595);
                } else {
                    A0S = this.this$0.getWaContactNames().A0S(A0H, commentContactPictureView2.getWaContactNames().A0B(this.$message.A0v.A00));
                }
                C18070vi.A0b(A0S);
                C18600wl mainDispatcher = this.this$0.getMainDispatcher();
                final C37451pZ r5 = this.$contactPhotoLoader;
                final CommentContactPictureView commentContactPictureView3 = this.this$0;
                AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, mainDispatcher, r4) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentContactPictureView$bind$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
