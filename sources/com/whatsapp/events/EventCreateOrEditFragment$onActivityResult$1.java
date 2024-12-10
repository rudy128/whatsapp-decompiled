package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C005702m;
import X.C18070vi;
import X.C18600wl;
import X.C218617r;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onActivityResult$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {1120}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$onActivityResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Intent $data;
    public final /* synthetic */ int $resultCode;
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onActivityResult$1$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreateOrEditFragment$onActivityResult$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(intent, eventCreateOrEditFragment, r6, i2);
        }

        public final Object invokeSuspend(Object obj) {
            Uri uri;
            if (this.label == 0) {
                C30691eM.A01(obj);
                EventCreateOrEditFragment eventCreateOrEditFragment = eventCreateOrEditFragment;
                Intent intent = new C005702m(i2, intent).A01;
                Uri uri2 = null;
                if (intent != null) {
                    uri = intent.getData();
                } else {
                    uri = null;
                }
                C218617r r1 = eventCreateOrEditFragment.A04;
                if (r1 != null) {
                    File A0a = r1.A0a("camera_image");
                    if (A0a.exists()) {
                        uri2 = Uri.fromFile(A0a);
                    }
                    if (uri == null) {
                        if (uri2 != null) {
                            uri = uri2;
                        }
                        return C27621Wu.A00;
                    }
                    AnonymousClass1FL A1D = eventCreateOrEditFragment.A1D();
                    C218617r r12 = eventCreateOrEditFragment.A04;
                    if (r12 != null) {
                        Uri fromFile = Uri.fromFile(r12.A0b("temp_cover_image"));
                        C18070vi.A0X(fromFile);
                        String obj2 = Bitmap.CompressFormat.JPEG.toString();
                        C18070vi.A0d(obj2, 4);
                        eventCreateOrEditFragment.A0p.A03(AnonymousClass1LU.A0N(A1D, (Rect) null, uri, fromFile, obj2, (String) null, (String) null, 1, 1, 0, 0, 300, 0, 0, 0, false, true, false, true));
                        return C27621Wu.A00;
                    }
                    C18070vi.A11("fMessageIO");
                    throw null;
                }
                C18070vi.A11("fMessageIO");
                throw null;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditFragment$onActivityResult$1(Intent intent, EventCreateOrEditFragment eventCreateOrEditFragment, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = eventCreateOrEditFragment;
        this.$resultCode = i;
        this.$data = intent;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EventCreateOrEditFragment$onActivityResult$1(this.$data, this.this$0, r6, this.$resultCode);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final EventCreateOrEditFragment eventCreateOrEditFragment = this.this$0;
            C18600wl r4 = eventCreateOrEditFragment.A0i;
            if (r4 != null) {
                final int i2 = this.$resultCode;
                final Intent intent = this.$data;
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r4, r0) == r7) {
                    return r7;
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditFragment$onActivityResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
