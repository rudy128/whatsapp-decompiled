package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E1;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1M4;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4XA;
import X.C18070vi;
import X.C18600wl;
import X.C19740yt;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C42141xh;
import X.C42751yg;
import X.C43421zm;
import X.C63312sr;
import X.C72473Md;
import X.C84024Ho;
import X.C98494rF;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.CommentHeaderView$bind$1", f = "CommentHeaderView.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class CommentHeaderView$bind$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ CommentHeaderView this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.comments.ui.CommentHeaderView$bind$1$1", f = "CommentHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.comments.ui.CommentHeaderView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r11) {
            CommentHeaderView commentHeaderView = commentHeaderView;
            AnonymousClass206 r5 = r9;
            AnonymousClass1BI r4 = A0H;
            return new AnonymousClass1(A0D, commentHeaderView, A0E, r4, r5, r11, A00, A0B);
        }

        public final Object invokeSuspend(Object obj) {
            int A00;
            if (this.label == 0) {
                C30691eM.A01(obj);
                CommentContactNamePrimaryView A002 = commentHeaderView.getContactNamePrimary();
                AnonymousClass206 r0 = r9;
                AnonymousClass1BI r6 = A0H;
                AnonymousClass1E7 r14 = A0E;
                int i = A0B;
                C18070vi.A0i(r0, r14);
                C42141xh r7 = new C42141xh(A002.getContext(), A002, A002.getWaContactNames(), A002.getWhatsAppLocale(), A002.getChatsCache(), A002.getAbProps());
                AnonymousClass1MZ groupParticipantsManager = A002.getGroupParticipantsManager();
                AnonymousClass205 r4 = r0.A0v;
                AnonymousClass1BI r1 = r4.A00;
                C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                C18070vi.A0z(r6, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                C63312sr A05 = groupParticipantsManager.A05((AnonymousClass1E9) r1, (UserJid) r6);
                if (A05 != null) {
                    A00 = C84024Ho.A00(AnonymousClass3MY.A04(A002), A05);
                } else {
                    A00 = C19740yt.A00(A002.getContext(), 2131102080);
                }
                TextEmojiLabel textEmojiLabel = r7.A01;
                textEmojiLabel.setTextColor(A00);
                C43421zm.A04(textEmojiLabel);
                if (r4.A02) {
                    r7.A02();
                } else {
                    r7.A04(r7.A02.A0D(r14, i), r14, (List) null, i, r7.A0C(r14));
                }
                A002.setTextSize(A002.getConversationFont().A00(AnonymousClass3Ma.A06(A002), A002.getResources()));
                CommentContactNameSecondaryView A01 = commentHeaderView.getContactNameSecondary();
                AnonymousClass206 r12 = r9;
                AnonymousClass1E7 r62 = A0E;
                int i2 = A0B;
                C42751yg r42 = A0D;
                String str = (String) A00.element;
                C18070vi.A0d(r12, 0);
                C72473Md.A1I(r62, r42);
                if (!r12.A0v.A02) {
                    ((AnonymousClass4XA) A01.getElevatedProfileNameHelper().get()).A01(A01, r62, r42.A00, i2);
                    if (str != null) {
                        A01.A0S(str, (List) null, 0, false);
                        A01.setVisibility(0);
                    }
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentHeaderView$bind$1(CommentHeaderView commentHeaderView, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.$message = r3;
        this.this$0 = commentHeaderView;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommentHeaderView$bind$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        final AnonymousClass1BI A0H;
        final AnonymousClass1E7 A0E;
        C31751g4 r1 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass206 r3 = this.$message;
            if (r3.A0v.A02) {
                A0H = AnonymousClass11S.A00(this.this$0.getMeManager());
            } else {
                A0H = r3.A0H();
            }
            if (this.$message.A0v.A02) {
                AnonymousClass11S meManager = this.this$0.getMeManager();
                meManager.A0I();
                A0E = meManager.A0D;
            } else if (A0H != null) {
                A0E = this.this$0.getContactManager().A0E(A0H);
            }
            if (A0E != null) {
                final int A0B = this.this$0.getWaContactNames().A0B(this.$message.A0v.A00);
                final C42751yg A0D = this.this$0.getWaContactNames().A0D(A0E, A0B);
                final C98494rF A00 = C98494rF.A00();
                if (this.this$0.getWaContactNames().A0k(A0E, this.$message.A0v.A00)) {
                    AnonymousClass1BI r32 = A0E.A0J;
                    C18070vi.A0z(r32, "null cannot be cast to non-null type com.whatsapp.jid.AccountUserJid");
                    A00.element = ((AnonymousClass1M4) this.this$0.getAliasedDisplayNameRepository().get()).BMm((AnonymousClass1E1) r32);
                }
                C18600wl mainDispatcher = this.this$0.getMainDispatcher();
                final CommentHeaderView commentHeaderView = this.this$0;
                final AnonymousClass206 r9 = this.$message;
                AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, mainDispatcher, r4) == r1) {
                    return r1;
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
        return ((CommentHeaderView$bind$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
