package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OS;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3R9;
import X.C18070vi;
import X.C18600wl;
import X.C22971Dz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37451pZ;
import X.C42751yg;
import X.C80893yG;
import X.C86804Td;
import X.C98494rF;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventResponseUserView$bind$1", f = "EventResponseUserView.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class EventResponseUserView$bind$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C37451pZ $contactPhotoLoader;
    public final /* synthetic */ C80893yG $userItem;
    public int label;
    public final /* synthetic */ AnonymousClass3R9 this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventResponseUserView$bind$1$1", f = "EventResponseUserView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventResponseUserView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r10) {
            return new AnonymousClass1(A0H, r9, r10, r10, A00, A0N);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C37451pZ.this.A07(r10.A0F, A0H);
                AnonymousClass3R9 r3 = r10;
                C80893yG r0 = r9;
                AnonymousClass3R9.A00((C86804Td) A00.element, r3, r0.A03, r0.A04);
                AnonymousClass3R9.A01(r10, r9.A03, A0N);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventResponseUserView$bind$1(C37451pZ r2, C80893yG r3, AnonymousClass3R9 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r4;
        this.$userItem = r3;
        this.$contactPhotoLoader = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass3R9 r3 = this.this$0;
        return new EventResponseUserView$bind$1(this.$contactPhotoLoader, this.$userItem, r3, r6);
    }

    public final Object invokeSuspend(Object obj) {
        final AnonymousClass1E7 A0H;
        final boolean A0N;
        C86804Td r4;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass3R9 r42 = this.this$0;
            UserJid userJid = this.$userItem.A01;
            if (r42.getMeManager().A0O(userJid)) {
                A0H = AnonymousClass3MZ.A0Q(r42.getMeManager());
                C18070vi.A0X(A0H);
            } else {
                A0H = r42.getContactManager().A0H(userJid);
            }
            if (C22971Dz.A0d(this.$userItem.A00)) {
                A0N = true;
            } else {
                AnonymousClass1MZ groupParticipantsManager = this.this$0.getGroupParticipantsManager();
                AnonymousClass1BI r1 = this.$userItem.A00;
                C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                A0N = groupParticipantsManager.A0N((AnonymousClass1E9) r1, this.$userItem.A01);
            }
            final C98494rF A00 = C98494rF.A00();
            AnonymousClass3R9 r7 = this.this$0;
            AnonymousClass1BI r6 = this.$userItem.A00;
            if (AnonymousClass3Ma.A1V(r7.getMeManager(), A0H)) {
                r4 = new C86804Td(r7.getContext().getString(2131898595), (String) null);
            } else {
                int A0B = r7.getWaContactNames().A0B(r6);
                C42751yg A0F = r7.getWaContactNames().A0F(A0H, A0B, false, true);
                r4 = new C86804Td(A0F.A01, r7.getWaContactNames().A0V(A0H, r6, A0F.A00, A0B));
            }
            A00.element = r4;
            C18600wl mainDispatcher = this.this$0.getMainDispatcher();
            final C37451pZ r72 = this.$contactPhotoLoader;
            final AnonymousClass3R9 r10 = this.this$0;
            final C80893yG r9 = this.$userItem;
            AnonymousClass1 r62 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, mainDispatcher, r62) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventResponseUserView$bind$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
