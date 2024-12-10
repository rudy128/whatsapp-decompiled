package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C23381Fv;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C87694Wo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.CameraActivity$postOnCreate$1$1", f = "CameraActivity.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
public final class CameraActivity$postOnCreate$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C87694Wo $this_apply;
    public int label;
    public final /* synthetic */ CameraActivity this$0;

    @DebugMetadata(c = "com.whatsapp.camera.CameraActivity$postOnCreate$1$1$1", f = "CameraActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.camera.CameraActivity$postOnCreate$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            AnonymousClass1 r0 = new AnonymousClass1(cameraActivity, r5);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
                final C87694Wo r2 = C87694Wo.this;
                final CameraActivity cameraActivity = cameraActivity;
                AnonymousClass1 r0 = new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r5) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CameraActivity$postOnCreate$1$1(C87694Wo r2, CameraActivity cameraActivity, C30391dr r4) {
                            super(2, r4);
                            this.this$0 = cameraActivity;
                            this.$this_apply = r2;
                        }

                        public final C30391dr create(Object obj, C30391dr r5) {
                            return new CameraActivity$postOnCreate$1$1(this.$this_apply, this.this$0, r5);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                C23381Fv lifecycle = this.this$0.getLifecycle();
                                C23401Fx r4 = C23401Fx.STARTED;
                                final C87694Wo r3 = this.$this_apply;
                                final CameraActivity cameraActivity = this.this$0;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A00(r4, lifecycle, this, r0) == r7) {
                                    return r7;
                                }
                            } else if (i == 1) {
                                C30691eM.A01(obj);
                            } else {
                                throw AnonymousClass000.A0l();
                            }
                            return C27621Wu.A00;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return ((CameraActivity$postOnCreate$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
                        }
                    }
