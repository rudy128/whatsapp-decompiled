package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass1OS;
import X.AnonymousClass6UU;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$updateSelectedStickerPack$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$updateSelectedStickerPack$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isSelectedByUser;
    public final /* synthetic */ AnonymousClass6UU $section;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$updateSelectedStickerPack$1(StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass6UU r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = stickerExpressionsViewModel;
        this.$section = r3;
        this.$isSelectedByUser = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        StickerExpressionsViewModel$updateSelectedStickerPack$1 stickerExpressionsViewModel$updateSelectedStickerPack$1 = new StickerExpressionsViewModel$updateSelectedStickerPack$1(this.this$0, this.$section, r6, this.$isSelectedByUser);
        stickerExpressionsViewModel$updateSelectedStickerPack$1.L$0 = obj;
        return stickerExpressionsViewModel$updateSelectedStickerPack$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (r6 < 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r6 >= r3.size()) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        r5 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.label
            if (r0 != 0) goto L_0x017a
            X.C30691eM.A01(r19)
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r2.this$0
            X.1G4 r0 = r0.A0l
            java.lang.Object r1 = r0.getValue()
            X.6TE r1 = (X.AnonymousClass6TE) r1
            boolean r0 = r1 instanceof X.AnonymousClass60B
            if (r0 == 0) goto L_0x00db
            X.60B r1 = (X.AnonymousClass60B) r1
            java.util.List r5 = r1.A02
        L_0x001b:
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r2.this$0
            X.1G4 r0 = r0.A0l
            java.lang.Object r1 = r0.getValue()
            X.6TE r1 = (X.AnonymousClass6TE) r1
            boolean r0 = r1 instanceof X.AnonymousClass60B
            if (r0 == 0) goto L_0x00cd
            X.60B r1 = (X.AnonymousClass60B) r1
            java.util.List r4 = r1.A01
        L_0x002d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0177
            X.6UU r0 = r2.$section
            java.lang.String r8 = r0.A00()
            boolean r7 = r2.$isSelectedByUser
            java.util.ArrayList r3 = X.C29351c6.A0D(r5)
            java.util.Iterator r11 = r5.iterator()
        L_0x0043:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r9 = r11.next()
            X.6oe r9 = (X.C133376oe) r9
            X.6UU r0 = r9.A00()
            java.lang.String r0 = r0.A00()
            boolean r6 = X.C18070vi.A18(r0, r8)
            boolean r0 = r9 instanceof X.AnonymousClass60W
            if (r0 == 0) goto L_0x0070
            X.60W r9 = (X.AnonymousClass60W) r9
            X.6UU r5 = r9.A01
            java.lang.String r1 = r9.A02
            int r0 = r9.A00
            X.60W r12 = new X.60W
            r12.<init>(r5, r1, r0, r6)
        L_0x006c:
            r3.add(r12)
            goto L_0x0043
        L_0x0070:
            boolean r0 = r9 instanceof X.AnonymousClass60Z
            if (r0 == 0) goto L_0x0088
            X.60Z r9 = (X.AnonymousClass60Z) r9
            X.6UU r13 = r9.A01
            java.lang.String r14 = r9.A02
            int r0 = r9.A00
            java.lang.String r15 = r9.A03
            X.60Z r12 = new X.60Z
            r17 = r6
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x006c
        L_0x0088:
            boolean r0 = r9 instanceof X.C1175660a
            if (r0 == 0) goto L_0x00a9
            X.60a r9 = (X.C1175660a) r9
            if (r6 == 0) goto L_0x00a6
            if (r7 == 0) goto L_0x00a6
            r10 = 0
        L_0x0093:
            X.6UU r5 = r9.A00
            java.lang.String r1 = r9.A01
            java.lang.String r0 = r9.A02
            X.60a r12 = new X.60a
            r13 = r5
            r14 = r1
            r15 = r0
            r16 = r6
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x006c
        L_0x00a6:
            boolean r10 = r9.A03
            goto L_0x0093
        L_0x00a9:
            boolean r0 = r9 instanceof X.AnonymousClass60X
            if (r0 == 0) goto L_0x00bb
            X.60X r9 = (X.AnonymousClass60X) r9
            X.6UU r5 = r9.A00
            java.lang.String r1 = r9.A01
            java.lang.String r0 = r9.A02
            X.60X r12 = new X.60X
            r12.<init>(r5, r1, r0, r6)
            goto L_0x006c
        L_0x00bb:
            boolean r0 = r9 instanceof X.AnonymousClass60Y
            if (r0 == 0) goto L_0x00e9
            X.60Y r9 = (X.AnonymousClass60Y) r9
            X.6UU r5 = r9.A00
            java.lang.String r1 = r9.A01
            java.lang.String r0 = r9.A02
            X.60Y r12 = new X.60Y
            r12.<init>(r5, r1, r0, r6)
            goto L_0x006c
        L_0x00cd:
            boolean r0 = r1 instanceof X.AnonymousClass60C
            if (r0 == 0) goto L_0x00d7
            X.60C r1 = (X.AnonymousClass60C) r1
            java.util.List r4 = r1.A01
            goto L_0x002d
        L_0x00d7:
            X.0wS r4 = X.C18460wS.A00
            goto L_0x002d
        L_0x00db:
            boolean r0 = r1 instanceof X.AnonymousClass60C
            if (r0 == 0) goto L_0x00e5
            X.60C r1 = (X.AnonymousClass60C) r1
            java.util.List r5 = r1.A02
            goto L_0x001b
        L_0x00e5:
            X.0wS r5 = X.C18460wS.A00
            goto L_0x001b
        L_0x00e9:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00ee:
            X.6UU r8 = r2.$section
            java.util.Iterator r7 = r3.iterator()
            r6 = 0
        L_0x00f5:
            boolean r0 = r7.hasNext()
            r5 = -1
            if (r0 == 0) goto L_0x012a
            java.lang.Object r1 = r7.next()
            X.6oe r1 = (X.C133376oe) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0121
            X.6UU r0 = r1.A00()
            java.lang.String r1 = r0.A00()
            if (r8 == 0) goto L_0x011f
            java.lang.String r0 = r8.A00()
        L_0x0116:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0121
            int r6 = r6 + 1
            goto L_0x00f5
        L_0x011f:
            r0 = 0
            goto L_0x0116
        L_0x0121:
            if (r6 < 0) goto L_0x012a
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x012a
            r5 = r6
        L_0x012a:
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r2.this$0
            X.1G4 r1 = r0.A0l
            X.60B r0 = new X.60B
            r0.<init>(r3, r4, r5)
            r1.setValue(r0)
            X.6UU r3 = r2.$section
            boolean r0 = r3 instanceof X.AnonymousClass614
            if (r0 == 0) goto L_0x0177
            boolean r0 = r2.$isSelectedByUser
            if (r0 == 0) goto L_0x0177
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = r2.this$0
            X.00H r0 = r0.A0Y     // Catch:{ all -> 0x0158 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0158 }
            X.6qY r1 = (X.C134416qY) r1     // Catch:{ all -> 0x0158 }
            X.614 r3 = (X.AnonymousClass614) r3     // Catch:{ all -> 0x0158 }
            X.725 r0 = r3.A00     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = X.AnonymousClass725.A00(r0)     // Catch:{ all -> 0x0158 }
            r1.A01(r0)     // Catch:{ all -> 0x0158 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0158 }
            goto L_0x015d
        L_0x0158:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x015d:
            X.6UU r2 = r2.$section
            java.lang.Throwable r0 = X.C30671eK.A00(r0)
            if (r0 == 0) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerExpressionsViewModel/unable to mark pack as seen: "
            r1.append(r0)
            X.614 r2 = (X.AnonymousClass614) r2
            X.725 r0 = r2.A00
            java.lang.String r0 = r0.A0H
            X.C17890vO.A19(r1, r0)
        L_0x0177:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x017a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$updateSelectedStickerPack$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$updateSelectedStickerPack$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
