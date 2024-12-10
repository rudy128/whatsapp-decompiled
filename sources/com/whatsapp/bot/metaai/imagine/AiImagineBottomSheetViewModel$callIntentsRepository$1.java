package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6RH;
import X.C111225jD;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$callIntentsRepository$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {775}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$callIntentsRepository$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6RH $callSiteState;
    public final /* synthetic */ boolean $isRegenerated;
    public final /* synthetic */ int $numberOfImages;
    public final /* synthetic */ String $textInput;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$callIntentsRepository$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {780}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$callIntentsRepository$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            C111225jD r2 = r5;
            int i = i2;
            return new AnonymousClass1(r4, r2, str, r9, i, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
            X.C111225jD.A08(r7, 1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            X.CDX.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r2 = r22
                X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
                r3 = r21
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L_0x0013
                if (r0 != r1) goto L_0x000e
                goto L_0x0049
            L_0x000e:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0013:
                X.C30691eM.A01(r2)
                X.5jD r0 = r5     // Catch:{ Exception -> 0x014b }
                X.00H r0 = r0.A0s     // Catch:{ Exception -> 0x014b }
                java.lang.Object r7 = r0.get()     // Catch:{ Exception -> 0x014b }
                X.6dz r7 = (X.C127216dz) r7     // Catch:{ Exception -> 0x014b }
                int r6 = r8     // Catch:{ Exception -> 0x014b }
                java.lang.String r5 = r6     // Catch:{ Exception -> 0x014b }
                X.5jD r0 = r5     // Catch:{ Exception -> 0x014b }
                boolean r0 = r0.A0D     // Catch:{ Exception -> 0x014b }
                r3.label = r1     // Catch:{ Exception -> 0x014b }
                X.3Dp r4 = X.C108975cc.A0k(r3)     // Catch:{ Exception -> 0x014b }
                if (r0 == 0) goto L_0x0045
                X.1lW r2 = X.C35021lW.A05     // Catch:{ Exception -> 0x014b }
            L_0x0032:
                X.6ki r1 = r7.A01     // Catch:{ Exception -> 0x014b }
                X.7Hx r0 = new X.7Hx     // Catch:{ Exception -> 0x014b }
                r0.<init>(r7, r5, r6)     // Catch:{ Exception -> 0x014b }
                X.7IB r1 = X.C131206ki.A00(r2, r1, r0)     // Catch:{ Exception -> 0x014b }
                r0 = 4
                java.lang.Object r2 = X.AnonymousClass7I7.A01(r1, r4, r0)     // Catch:{ Exception -> 0x014b }
                if (r2 != r8) goto L_0x004c
                goto L_0x0048
            L_0x0045:
                X.61j r2 = X.AnonymousClass6YX.A00     // Catch:{ Exception -> 0x014b }
                goto L_0x0032
            L_0x0048:
                return r8
            L_0x0049:
                X.C30691eM.A01(r2)     // Catch:{ Exception -> 0x014b }
            L_0x004c:
                X.6dv r2 = (X.C127176dv) r2     // Catch:{ Exception -> 0x014b }
                boolean r0 = r2.A01     // Catch:{ Exception -> 0x014b }
                if (r0 == 0) goto L_0x0143
                X.5jD r0 = r5     // Catch:{ Exception -> 0x014b }
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.A08     // Catch:{ Exception -> 0x014b }
                boolean r0 = r0.get()     // Catch:{ Exception -> 0x014b }
                if (r0 == 0) goto L_0x0067
                X.5jD r0 = r5     // Catch:{ Exception -> 0x014b }
                java.util.concurrent.atomic.AtomicBoolean r1 = r0.A08     // Catch:{ Exception -> 0x014b }
                r0 = 0
                r1.set(r0)     // Catch:{ Exception -> 0x014b }
                X.1Wu r0 = X.C27621Wu.A00     // Catch:{ Exception -> 0x014b }
                return r0
            L_0x0067:
                X.5jD r7 = r5     // Catch:{ Exception -> 0x014b }
                java.util.List r0 = r2.A00     // Catch:{ Exception -> 0x014b }
                java.lang.String r6 = r6     // Catch:{ Exception -> 0x014b }
                boolean r5 = r9     // Catch:{ Exception -> 0x014b }
                X.6RH r4 = r4     // Catch:{ Exception -> 0x014b }
                java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x014b }
            L_0x0075:
                boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x014b }
                if (r0 == 0) goto L_0x00d4
                java.lang.Object r1 = r12.next()     // Catch:{ Exception -> 0x014b }
                X.5yq r1 = (X.C116925yq) r1     // Catch:{ Exception -> 0x014b }
                X.6i7 r0 = X.C137156v0.A01(r1)     // Catch:{ Exception -> 0x014b }
                X.6i7 r10 = X.C137156v0.A00(r1)     // Catch:{ Exception -> 0x014b }
                r11 = 1
                if (r0 == 0) goto L_0x0106
                if (r10 == 0) goto L_0x0106
                java.util.List r1 = r1.A00     // Catch:{ Exception -> 0x014b }
                int r0 = r1.size()     // Catch:{ Exception -> 0x014b }
                if (r0 == 0) goto L_0x0106
                java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x014b }
            L_0x009a:
                boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x014b }
                r1 = 0
                if (r0 == 0) goto L_0x00ae
                java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x014b }
                r0 = r1
                X.6i7 r0 = (X.C129636i7) r0     // Catch:{ Exception -> 0x014b }
                boolean r0 = r0.A04     // Catch:{ Exception -> 0x014b }
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x009a
            L_0x00ae:
                X.6i7 r1 = (X.C129636i7) r1     // Catch:{ Exception -> 0x014b }
                if (r1 == 0) goto L_0x0075
                java.lang.String r1 = r1.A03     // Catch:{ Exception -> 0x014b }
                X.00H r0 = r7.A04     // Catch:{ Exception -> 0x014b }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014b }
                X.1D9 r0 = (X.AnonymousClass1D9) r0     // Catch:{ Exception -> 0x014b }
                java.lang.Integer r9 = X.AnonymousClass3MY.A0f()     // Catch:{ Exception -> 0x014b }
                X.AUZ r8 = r0.A08(r9, r1)     // Catch:{ Exception -> 0x014b }
                java.net.HttpURLConnection r2 = r8.A01     // Catch:{ Exception -> 0x014b }
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x014b }
                r0 = 200(0xc8, float:2.8E-43)
                if (r1 == r0) goto L_0x010a
                X.C111225jD.A08(r7, r11)     // Catch:{ Exception -> 0x014b }
                r2.getResponseCode()     // Catch:{ Exception -> 0x014b }
            L_0x00d4:
                X.6RH r1 = r4     // Catch:{ Exception -> 0x014b }
                X.6RH r2 = X.AnonymousClass6RH.SELECTING_OPTION     // Catch:{ Exception -> 0x014b }
                if (r1 != r2) goto L_0x00e9
                X.5jD r1 = r5     // Catch:{ Exception -> 0x014b }
                X.1KB r4 = r1.A0W     // Catch:{ Exception -> 0x014b }
                r0 = 39
                X.AkC r2 = new X.AkC     // Catch:{ Exception -> 0x014b }
                r2.<init>(r1, r0)     // Catch:{ Exception -> 0x014b }
            L_0x00e5:
                r4.A0J(r2)     // Catch:{ Exception -> 0x014b }
                goto L_0x015c
            L_0x00e9:
                X.6RH r0 = X.AnonymousClass6RH.IMAGINE_ME     // Catch:{ Exception -> 0x014b }
                if (r1 != r0) goto L_0x015c
                X.5jD r1 = r5     // Catch:{ Exception -> 0x014b }
                boolean r0 = X.C111225jD.A0D(r1)     // Catch:{ Exception -> 0x014b }
                if (r0 != 0) goto L_0x00f7
                X.6RH r2 = X.AnonymousClass6RH.IMAGINE_EDIT_OPTIONS     // Catch:{ Exception -> 0x014b }
            L_0x00f7:
                r1.A0V(r2)     // Catch:{ Exception -> 0x014b }
                X.5jD r1 = r5     // Catch:{ Exception -> 0x014b }
                X.1KB r4 = r1.A0W     // Catch:{ Exception -> 0x014b }
                r0 = 40
                X.AkC r2 = new X.AkC     // Catch:{ Exception -> 0x014b }
                r2.<init>(r1, r0)     // Catch:{ Exception -> 0x014b }
                goto L_0x00e5
            L_0x0106:
                X.C111225jD.A08(r7, r11)     // Catch:{ Exception -> 0x014b }
                goto L_0x00d4
            L_0x010a:
                X.181 r0 = r7.A00     // Catch:{ Exception -> 0x014b }
                X.9Hb r2 = r8.BMP(r0, r9, r9)     // Catch:{ Exception -> 0x014b }
                android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x013c }
                java.lang.Integer r15 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x013c }
                java.lang.String r1 = r10.A00     // Catch:{ all -> 0x013c }
                java.lang.String r0 = r10.A02     // Catch:{ all -> 0x013c }
                r20 = 0
                X.6jC r13 = new X.6jC     // Catch:{ all -> 0x013c }
                r18 = r6
                r19 = r5
                r16 = r1
                r17 = r0
                r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x013c }
                X.6RH r0 = X.AnonymousClass6RH.IMAGINE_EDIT_OPTIONS     // Catch:{ all -> 0x013c }
                if (r4 != r0) goto L_0x0130
                r7.A0V(r0)     // Catch:{ all -> 0x013c }
            L_0x0130:
                X.1KB r1 = r7.A0W     // Catch:{ all -> 0x013c }
                r0 = 26
                X.C108965cb.A1A(r1, r7, r13, r0)     // Catch:{ all -> 0x013c }
                r2.close()     // Catch:{ Exception -> 0x014b }
                goto L_0x0075
            L_0x013c:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x013e }
            L_0x013e:
                r0 = move-exception
                X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x014b }
                throw r0     // Catch:{ Exception -> 0x014b }
            L_0x0143:
                X.5jD r1 = r5     // Catch:{ Exception -> 0x014b }
                int r0 = r8     // Catch:{ Exception -> 0x014b }
                X.C111225jD.A08(r1, r0)     // Catch:{ Exception -> 0x014b }
                goto L_0x015c
            L_0x014b:
                r2 = move-exception
                X.5jD r1 = r5
                int r0 = r8
                X.C111225jD.A08(r1, r0)
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                java.lang.String r0 = "AiImagineBottomSheetViewModel/callIntentsRepository exception "
                X.C108995ce.A1M(r0, r1, r2)
            L_0x015c:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$callIntentsRepository$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$callIntentsRepository$1(AnonymousClass6RH r2, C111225jD r3, String str, C30391dr r5, int i, boolean z) {
        super(2, r5);
        this.this$0 = r3;
        this.$numberOfImages = i;
        this.$textInput = str;
        this.$isRegenerated = z;
        this.$callSiteState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C111225jD r2 = this.this$0;
        int i = this.$numberOfImages;
        return new AiImagineBottomSheetViewModel$callIntentsRepository$1(this.$callSiteState, r2, this.$textInput, r9, i, this.$isRegenerated);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r5 = this.this$0;
            C18600wl r0 = r5.A0w;
            final int i2 = this.$numberOfImages;
            final String str = this.$textInput;
            final boolean z = this.$isRegenerated;
            final AnonymousClass6RH r4 = this.$callSiteState;
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
        return ((AiImagineBottomSheetViewModel$callIntentsRepository$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
