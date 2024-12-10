package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass3R3;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37451pZ;
import X.C445823z;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventDetailsView$setUpGroupInfoSection$1", f = "EventDetailsView.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
public final class EventDetailsView$setUpGroupInfoSection$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C37451pZ $contactPhotoLoader;
    public final /* synthetic */ C445823z $message;
    public int label;
    public final /* synthetic */ AnonymousClass3R3 this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventDetailsView$setUpGroupInfoSection$1$1", f = "EventDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventDetailsView$setUpGroupInfoSection$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            AnonymousClass3R3 r4 = r8;
            return new AnonymousClass1(r5, A0H, r7, r4, A0K, r9);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                r8.A0D.A04(0);
                TextView A0E = AnonymousClass3Ma.A0E(r8.A0D.A02(), 2131430594);
                ImageView A0C = AnonymousClass3Ma.A0C(r8.A0D.A02(), 2131430595);
                ImageView A0C2 = AnonymousClass3Ma.A0C(r8.A0D.A02(), 2131430593);
                r5.A07(A0C, A0H);
                AnonymousClass3MY.A0u(r8.getContext(), A0E.getPaint(), A0E, r8.getEmojiLoader(), A0K);
                AnonymousClass3MY.A1E(r8.A0D.A02(), r7, r8, 3);
                AnonymousClass3NL.A01(r8.getContext(), A0C2, r8.getWhatsAppLocale(), 2131231229);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventDetailsView$setUpGroupInfoSection$1(C37451pZ r2, C445823z r3, AnonymousClass3R3 r4, C30391dr r5) {
        super(2, r5);
        this.$message = r3;
        this.this$0 = r4;
        this.$contactPhotoLoader = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EventDetailsView$setUpGroupInfoSection$1(this.$contactPhotoLoader, this.$message, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1BI r1 = this.$message.A0v.A00;
            if (r1 != null) {
                final AnonymousClass1E7 A0H = this.this$0.getContactManager().A0H(r1);
                final String A0K = A0H.A0K();
                C18600wl mainDispatcher = this.this$0.getMainDispatcher();
                final AnonymousClass3R3 r8 = this.this$0;
                final C37451pZ r5 = this.$contactPhotoLoader;
                final C445823z r7 = this.$message;
                AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, mainDispatcher, r4) == r2) {
                    return r2;
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
        return ((EventDetailsView$setUpGroupInfoSection$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
