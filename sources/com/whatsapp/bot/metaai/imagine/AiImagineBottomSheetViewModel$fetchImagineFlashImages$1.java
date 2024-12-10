package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1KB;
import X.AnonymousClass1OS;
import X.AnonymousClass1YE;
import X.AnonymousClass1ZU;
import X.AnonymousClass6R5;
import X.AnonymousClass6RH;
import X.AnonymousClass6YX;
import X.AnonymousClass7I7;
import X.C108965cb;
import X.C108975cc;
import X.C111225jD;
import X.C116915yp;
import X.C127036dh;
import X.C127206dy;
import X.C129636i7;
import X.C130296jC;
import X.C131206ki;
import X.C137156v0;
import X.C139706zJ;
import X.C144587Hw;
import X.C18600wl;
import X.C21451AkI;
import X.C25781Pp;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C32951i1;
import X.C72473Md;
import android.graphics.Bitmap;
import android.util.Base64;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$fetchImagineFlashImages$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$fetchImagineFlashImages$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6RH $callSiteState;
    public final /* synthetic */ boolean $isRegenerated;
    public final /* synthetic */ String $queryPrompt;
    public final /* synthetic */ int $requestInFlightVersion;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$fetchImagineFlashImages$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {624}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$fetchImagineFlashImages$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            return new AnonymousClass1(r4, r5, str, r9, i2, z);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            AnonymousClass6RH r0;
            Bitmap bitmap;
            AnonymousClass1KB r6;
            C21451AkI akI;
            Object obj2 = obj;
            C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj2);
                try {
                    C127206dy r7 = (C127206dy) r5.A0r.get();
                    C139706zJ r62 = new C139706zJ(str);
                    this.label = 1;
                    obj2 = AnonymousClass7I7.A01(C131206ki.A00(AnonymousClass6YX.A00, r7.A01, new C144587Hw(r7, r62, 3)), C108975cc.A0k(this), 3);
                    if (obj2 == r8) {
                        return r8;
                    }
                } catch (Exception unused) {
                    C111225jD r2 = r5;
                    if (r4 == AnonymousClass6RH.GENERATING_IMAGINE_FLASH) {
                        r2.A0O.A0E((Object) null);
                        r2.A0V(AnonymousClass6RH.FLASH_ERROR_STATE);
                    }
                }
            } else if (i == 1) {
                C30691eM.A01(obj2);
            } else {
                throw AnonymousClass000.A0l();
            }
            C116915yp r63 = (C116915yp) obj2;
            C111225jD r5 = r5;
            int i2 = i2;
            AnonymousClass6RH r22 = (AnonymousClass6RH) r5.A0U.A06();
            AnonymousClass6RH r02 = r4;
            AnonymousClass6RH r1 = AnonymousClass6RH.GENERATING_IMAGINE_FLASH;
            if (r02 == r1 && r22 != r1) {
                r5.A0b.A02(i2);
            } else if (!(!r5.A0b.A02(i2))) {
                C111225jD r4 = r5;
                String str2 = str;
                AnonymousClass6RH r23 = r4;
                boolean z = z;
                if (r4.A08.get()) {
                    r4.A08.set(false);
                } else {
                    C129636i7 A01 = C137156v0.A01(r63);
                    C129636i7 A00 = C137156v0.A00(r63);
                    if (A00 != null) {
                        str = A00.A02;
                    } else {
                        str = null;
                    }
                    if (A01 != null && A00 != null) {
                        C25781Pp r03 = r4.A0Z;
                        C32951i1 r82 = r4.A02;
                        AnonymousClass1BI r72 = r03.A02;
                        if (r72 != null) {
                            C108965cb.A1K(r82.A0T, r82, r72, C32951i1.A00(r82), 40);
                        }
                        String str3 = A01.A03;
                        if (str3.length() == 0) {
                            bitmap = null;
                        } else {
                            bitmap = C72473Md.A0E(Base64.decode(AnonymousClass1YE.A07(str3, "data:image/jpeg;base64,", "", false), 0));
                        }
                        C130296jC r73 = new C130296jC(bitmap, AnonymousClass00R.A00, A00.A00, str, str2, z, false);
                        r4.A0O.A0E(r73);
                        if (C111225jD.A0D(r4)) {
                            C127036dh r52 = new C127036dh(r73);
                            if (r73.A00 != null) {
                                r52.A01.A0E(AnonymousClass6R5.DISPLAY_IMAGE_SELECTED);
                                boolean z2 = r73.A06;
                                if (z2 || r4.A06 != null) {
                                    r6 = r4.A0W;
                                    C108965cb.A1A(r6, r4, r73, 21);
                                    if (!z2) {
                                        akI = new C21451AkI(r4, r73, 22);
                                    }
                                } else {
                                    ArrayList A05 = AnonymousClass1ZU.A05(r52);
                                    r4.A0G.A0E(A05);
                                    r6 = r4.A0W;
                                    akI = new C21451AkI(r4, A05, 23);
                                }
                                r6.A0J(akI);
                            }
                        }
                        r0 = AnonymousClass6RH.IMAGINE_EDIT_OPTIONS;
                        if (r23 == r0) {
                        }
                    } else if (r23 == r1) {
                        if (r63 == null || !r63.A01) {
                            r4.A0O.A0E((Object) null);
                            r0 = AnonymousClass6RH.FLASH_ERROR_STATE;
                        }
                    }
                    r4.A0V(r0);
                }
                return C27621Wu.A00;
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$fetchImagineFlashImages$1(AnonymousClass6RH r2, C111225jD r3, String str, C30391dr r5, int i, boolean z) {
        super(2, r5);
        this.this$0 = r3;
        this.$queryPrompt = str;
        this.$requestInFlightVersion = i;
        this.$callSiteState = r2;
        this.$isRegenerated = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new AiImagineBottomSheetViewModel$fetchImagineFlashImages$1(this.$callSiteState, this.this$0, this.$queryPrompt, r9, this.$requestInFlightVersion, this.$isRegenerated);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r5 = this.this$0;
            C18600wl r0 = r5.A0w;
            final String str = this.$queryPrompt;
            final int i2 = this.$requestInFlightVersion;
            final AnonymousClass6RH r4 = this.$callSiteState;
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
        return ((AiImagineBottomSheetViewModel$fetchImagineFlashImages$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
