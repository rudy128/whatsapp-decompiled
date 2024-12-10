package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C218617r;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C64062u9;
import X.C89464cV;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$selectEventCoverImage$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {1040}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$selectEventCoverImage$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$selectEventCoverImage$1$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {1043}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreateOrEditFragment$selectEventCoverImage$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C31751g4 r1 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C89464cV[] r0 = new C89464cV[2];
                EventCreateOrEditFragment eventCreateOrEditFragment = EventCreateOrEditFragment.this;
                AnonymousClass00H r3 = eventCreateOrEditFragment.A0h;
                if (r3 != null) {
                    r3.get();
                    AnonymousClass1FL A1D = eventCreateOrEditFragment.A1D();
                    Jid A0h = AnonymousClass3MW.A0h(eventCreateOrEditFragment.A0r);
                    Intent className = C17880vN.A0A().setClassName(A1D.getPackageName(), "com.whatsapp.gallerypicker.GalleryPickerLauncher");
                    AnonymousClass3MY.A13(className, A0h, "chat_jid");
                    className.putExtra("is_using_global_wallpaper", false);
                    className.putExtra("media_sharing_user_journey_origin", 23);
                    Resources A09 = AnonymousClass3MZ.A09(eventCreateOrEditFragment);
                    C18070vi.A0X(A09);
                    r0[0] = new C89464cV(className, Integer.valueOf(AnonymousClass3Ma.A01(eventCreateOrEditFragment.A1B(), A09, 2130970828, 2131102239)), (Integer) null, 2131890624, 2131232193, 0, 1, false);
                    EventCreateOrEditFragment eventCreateOrEditFragment2 = EventCreateOrEditFragment.this;
                    AnonymousClass00H r32 = eventCreateOrEditFragment2.A0h;
                    if (r32 != null) {
                        r32.get();
                        AnonymousClass1FL A1D2 = eventCreateOrEditFragment2.A1D();
                        AnonymousClass1FL A1B = eventCreateOrEditFragment2.A1B();
                        C218617r r4 = eventCreateOrEditFragment2.A04;
                        if (r4 != null) {
                            Uri A02 = C64062u9.A02(A1B, r4.A0a("camera_image"));
                            Intent A0A = C17880vN.A0A();
                            A0A.setClassName(A1D2.getPackageName(), "com.whatsapp.profile.CapturePhoto");
                            A0A.putExtra("target_file_uri", A02);
                            Resources A092 = AnonymousClass3MZ.A09(eventCreateOrEditFragment2);
                            C18070vi.A0X(A092);
                            r0[1] = new C89464cV(A0A, Integer.valueOf(AnonymousClass3Ma.A01(eventCreateOrEditFragment2.A1B(), A092, 2130970828, 2131102239)), (Integer) null, 2131887939, 2131232194, 0, 1, false);
                            final ArrayList A06 = AnonymousClass1ZU.A06(r0);
                            final EventCreateOrEditFragment eventCreateOrEditFragment3 = EventCreateOrEditFragment.this;
                            C18600wl r33 = eventCreateOrEditFragment3.A0j;
                            if (r33 != null) {
                                AnonymousClass1 r02 = new AnonymousClass1OS((C30391dr) null) {
                                    public int label;

                                    public final C30391dr create(Object obj, C30391dr r5) {
                                        return 

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        public EventCreateOrEditFragment$selectEventCoverImage$1(EventCreateOrEditFragment eventCreateOrEditFragment, C30391dr r3) {
                                            super(2, r3);
                                            this.this$0 = eventCreateOrEditFragment;
                                        }

                                        public final C30391dr create(Object obj, C30391dr r4) {
                                            return new EventCreateOrEditFragment$selectEventCoverImage$1(this.this$0, r4);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            return new EventCreateOrEditFragment$selectEventCoverImage$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
                                        }

                                        public final Object invokeSuspend(Object obj) {
                                            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
                                            int i = this.label;
                                            if (i == 0) {
                                                C30691eM.A01(obj);
                                                final EventCreateOrEditFragment eventCreateOrEditFragment = this.this$0;
                                                C18600wl r2 = eventCreateOrEditFragment.A0i;
                                                if (r2 != null) {
                                                    AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                                    this.label = 1;
                                                    if (C30451dy.A00(this, r2, r0) == r5) {
                                                        return r5;
                                                    }
                                                } else {
                                                    AnonymousClass3MW.A1K();
                                                    throw null;
                                                }
                                            } else if (i == 1) {
                                                C30691eM.A01(obj);
                                            } else {
                                                throw AnonymousClass000.A0l();
                                            }
                                            return C27621Wu.A00;
                                        }
                                    }
