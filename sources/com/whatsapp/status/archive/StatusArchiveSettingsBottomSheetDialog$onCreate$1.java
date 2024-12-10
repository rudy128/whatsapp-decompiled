package com.whatsapp.status.archive;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.AnonymousClass2SS;
import X.C23401Fx;
import X.C27183DXs;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog$onCreate$1", f = "StatusArchiveSettingsBottomSheetDialog.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class StatusArchiveSettingsBottomSheetDialog$onCreate$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StatusArchiveSettingsBottomSheetDialog this$0;

    @DebugMetadata(c = "com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog$onCreate$1$1", f = "StatusArchiveSettingsBottomSheetDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog$onCreate$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G0 r3 = ((StatusArchiveSettingsViewModel) StatusArchiveSettingsBottomSheetDialog.this.A03.getValue()).A04;
                final StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = StatusArchiveSettingsBottomSheetDialog.this;
                C88604aC.A03(AnonymousClass2SS.A00(StatusArchiveSettingsBottomSheetDialog.this), new C27183DXs((AnonymousClass1OS) new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ boolean Z$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass1 r1 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public StatusArchiveSettingsBottomSheetDialog$onCreate$1(StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog, C30391dr r3) {
                            super(2, r3);
                            this.this$0 = statusArchiveSettingsBottomSheetDialog;
                        }

                        public final C30391dr create(Object obj, C30391dr r4) {
                            return new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C30691eM.A01(obj);
                                final StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = this.this$0;
                                C23401Fx r2 = C23401Fx.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                                this.label = 1;
                                if (C87334Ve.A01(r2, statusArchiveSettingsBottomSheetDialog, this, r0) == r5) {
                                    return r5;
                                }
                            } else if (i == 1) {
                                C30691eM.A01(obj);
                            } else {
                                throw AnonymousClass000.A0l();
                            }
                            return C27621Wu.A00;
                        }
                    }
