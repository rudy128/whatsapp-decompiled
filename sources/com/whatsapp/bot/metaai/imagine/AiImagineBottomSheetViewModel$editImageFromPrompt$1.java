package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C111225jD;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.text.Editable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$editImageFromPrompt$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {1044}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$editImageFromPrompt$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $imageEditId;
    public final /* synthetic */ String $imagineEditPrompt;
    public final /* synthetic */ Editable $inputEditable;
    public final /* synthetic */ boolean $isRegenerated;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$editImageFromPrompt$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {1049}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$editImageFromPrompt$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            return new AnonymousClass1(editable, r5, str, str2, r9, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            X.CDX.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r1 = r16
                X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r15.label
                r3 = 1
                if (r0 == 0) goto L_0x0011
                if (r0 != r3) goto L_0x000c
                goto L_0x004e
            L_0x000c:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0011:
                X.C30691eM.A01(r1)
                X.5jD r0 = r5     // Catch:{ Exception -> 0x00f9 }
                X.00H r0 = r0.A0q     // Catch:{ Exception -> 0x00f9 }
                java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x00f9 }
                X.6dx r6 = (X.C127196dx) r6     // Catch:{ Exception -> 0x00f9 }
                java.lang.String r2 = r6     // Catch:{ Exception -> 0x00f9 }
                java.lang.String r1 = r7     // Catch:{ Exception -> 0x00f9 }
                X.5jD r0 = r5     // Catch:{ Exception -> 0x00f9 }
                boolean r0 = r0.A0D     // Catch:{ Exception -> 0x00f9 }
                X.6rn r5 = new X.6rn     // Catch:{ Exception -> 0x00f9 }
                r5.<init>(r2, r1, r0)     // Catch:{ Exception -> 0x00f9 }
                r15.label = r3     // Catch:{ Exception -> 0x00f9 }
                X.3Dp r4 = X.C108975cc.A0k(r15)     // Catch:{ Exception -> 0x00f9 }
                boolean r0 = r5.A02     // Catch:{ Exception -> 0x00f9 }
                if (r0 == 0) goto L_0x0048
                X.1lW r3 = X.C35021lW.A05     // Catch:{ Exception -> 0x00f9 }
            L_0x0037:
                X.6ki r2 = r6.A01     // Catch:{ Exception -> 0x00f9 }
                r1 = 2
                X.7Hw r0 = new X.7Hw     // Catch:{ Exception -> 0x00f9 }
                r0.<init>(r6, r5, r1)     // Catch:{ Exception -> 0x00f9 }
                X.7IB r0 = X.C131206ki.A00(r3, r2, r0)     // Catch:{ Exception -> 0x00f9 }
                java.lang.Object r1 = X.AnonymousClass7I7.A01(r0, r4, r1)     // Catch:{ Exception -> 0x00f9 }
                goto L_0x004b
            L_0x0048:
                X.61j r3 = X.AnonymousClass6YX.A00     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0037
            L_0x004b:
                if (r1 != r7) goto L_0x0051
                return r7
            L_0x004e:
                X.C30691eM.A01(r1)     // Catch:{ Exception -> 0x00f9 }
            L_0x0051:
                X.5yo r1 = (X.C116905yo) r1     // Catch:{ Exception -> 0x00f9 }
                X.5jD r3 = r5     // Catch:{ Exception -> 0x00f9 }
                android.text.Editable r6 = r4     // Catch:{ Exception -> 0x00f9 }
                boolean r13 = r9     // Catch:{ Exception -> 0x00f9 }
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.A08     // Catch:{ Exception -> 0x00f9 }
                boolean r0 = r0.get()     // Catch:{ Exception -> 0x00f9 }
                if (r0 == 0) goto L_0x0069
                java.util.concurrent.atomic.AtomicBoolean r1 = r3.A08     // Catch:{ Exception -> 0x00f9 }
                r0 = 0
                r1.set(r0)     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0111
            L_0x0069:
                X.6i7 r0 = X.C137156v0.A01(r1)     // Catch:{ Exception -> 0x00f9 }
                X.6i7 r7 = X.C137156v0.A00(r1)     // Catch:{ Exception -> 0x00f9 }
                if (r0 == 0) goto L_0x00e4
                if (r7 == 0) goto L_0x00e4
                java.lang.String r11 = r7.A02     // Catch:{ Exception -> 0x00f9 }
                java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x00f9 }
                X.00H r0 = r3.A04     // Catch:{ Exception -> 0x00f9 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00f9 }
                X.1D9 r0 = (X.AnonymousClass1D9) r0     // Catch:{ Exception -> 0x00f9 }
                java.lang.Integer r5 = X.AnonymousClass3MY.A0f()     // Catch:{ Exception -> 0x00f9 }
                X.AUZ r4 = r0.A08(r5, r1)     // Catch:{ Exception -> 0x00f9 }
                java.net.HttpURLConnection r2 = r4.A01     // Catch:{ Exception -> 0x00f9 }
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x00f9 }
                r0 = 200(0xc8, float:2.8E-43)
                if (r1 == r0) goto L_0x0097
                r2.getResponseCode()     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0111
            L_0x0097:
                X.181 r0 = r3.A00     // Catch:{ Exception -> 0x00f9 }
                X.9Hb r2 = r4.BMP(r0, r5, r5)     // Catch:{ Exception -> 0x00f9 }
                android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x00dd }
                java.lang.Integer r9 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x00dd }
                java.lang.String r10 = r7.A00     // Catch:{ all -> 0x00dd }
                java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00dd }
                r14 = 1
                X.6jC r7 = new X.6jC     // Catch:{ all -> 0x00dd }
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00dd }
                X.1Pp r0 = r3.A0Z     // Catch:{ all -> 0x00dd }
                X.1i1 r6 = r3.A02     // Catch:{ all -> 0x00dd }
                X.1BI r5 = r0.A02     // Catch:{ all -> 0x00dd }
                if (r5 == 0) goto L_0x00c2
                android.content.SharedPreferences r4 = X.C32951i1.A00(r6)     // Catch:{ all -> 0x00dd }
                X.10s r1 = r6.A0T     // Catch:{ all -> 0x00dd }
                r0 = 40
                X.C108965cb.A1K(r1, r6, r5, r4, r0)     // Catch:{ all -> 0x00dd }
            L_0x00c2:
                X.1DT r0 = r3.A0O     // Catch:{ all -> 0x00dd }
                r0.A0E(r7)     // Catch:{ all -> 0x00dd }
                X.6RH r0 = X.AnonymousClass6RH.IMAGINE_EDIT_OPTIONS     // Catch:{ all -> 0x00dd }
                r3.A0V(r0)     // Catch:{ all -> 0x00dd }
                boolean r0 = X.C111225jD.A0D(r3)     // Catch:{ all -> 0x00dd }
                if (r0 == 0) goto L_0x00d9
                X.1KB r1 = r3.A0W     // Catch:{ all -> 0x00dd }
                r0 = 24
                X.C108965cb.A1A(r1, r3, r7, r0)     // Catch:{ all -> 0x00dd }
            L_0x00d9:
                r2.close()     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0111
            L_0x00dd:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00df }
            L_0x00df:
                r0 = move-exception
                X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x00f9 }
                throw r0     // Catch:{ Exception -> 0x00f9 }
            L_0x00e4:
                X.6RH r2 = X.AnonymousClass6RH.IMAGINE_EDIT     // Catch:{ Exception -> 0x00f9 }
                if (r1 == 0) goto L_0x00ee
                boolean r1 = r1.A01     // Catch:{ Exception -> 0x00f9 }
                r0 = 1
                if (r1 != r0) goto L_0x00ee
                goto L_0x0111
            L_0x00ee:
                X.1DT r0 = r3.A0N     // Catch:{ Exception -> 0x00f9 }
                r0.A0E(r2)     // Catch:{ Exception -> 0x00f9 }
                X.6RH r0 = X.AnonymousClass6RH.EDIT_OPTIONS_ERROR_STATE     // Catch:{ Exception -> 0x00f9 }
                r3.A0V(r0)     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0111
            L_0x00f9:
                r2 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                java.lang.String r0 = "AiImagineBottomSheetViewModel/editImageFromPrompt exception "
                X.C108995ce.A1M(r0, r1, r2)
                X.5jD r2 = r5
                X.6RH r1 = X.AnonymousClass6RH.IMAGINE_EDIT
                X.1DT r0 = r2.A0N
                r0.A0E(r1)
                X.6RH r0 = X.AnonymousClass6RH.EDIT_OPTIONS_ERROR_STATE
                r2.A0V(r0)
            L_0x0111:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$editImageFromPrompt$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$editImageFromPrompt$1(Editable editable, C111225jD r3, String str, String str2, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = r3;
        this.$imageEditId = str;
        this.$imagineEditPrompt = str2;
        this.$inputEditable = editable;
        this.$isRegenerated = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new AiImagineBottomSheetViewModel$editImageFromPrompt$1(this.$inputEditable, this.this$0, this.$imageEditId, this.$imagineEditPrompt, r9, this.$isRegenerated);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r5 = this.this$0;
            C18600wl r0 = r5.A0w;
            final String str = this.$imageEditId;
            final String str2 = this.$imagineEditPrompt;
            final Editable editable = this.$inputEditable;
            final boolean z = this.$isRegenerated;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiImagineBottomSheetViewModel$editImageFromPrompt$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
