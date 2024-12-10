package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* renamed from: X.1z3  reason: invalid class name and case insensitive filesystem */
public class C42981z3 implements C42971z2 {
    public final AnonymousClass1E7 A00;
    public final C43011z6 A01;
    public final AnonymousClass1VW A02;
    public final AnonymousClass1VU A03;
    public final AnonymousClass1PU A04;
    public final Integer A05;

    public /* synthetic */ void CBg() {
        if (this instanceof C42991z4) {
            C42991z4 r3 = (C42991z4) this;
            C42961z1 r1 = r3.A00;
            if (r1.A08 == null) {
                C42961z1.A00(r1, false);
            }
            r3.A01.set(C18070vi.A18(r3.A00, r1.A08));
        }
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap == null) {
            CN5(imageView);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || z) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(bitmap)});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
    }

    public C42981z3(C43011z6 r2, AnonymousClass1VW r3, AnonymousClass1E7 r4, AnonymousClass1VU r5, AnonymousClass1PU r6, Integer num) {
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = r4;
        this.A01 = r2;
        this.A05 = num;
        if (r4 != null) {
            AnonymousClass1VW.A01(r4.A0J);
        }
    }

    public void CIg(AnonymousClass1BI r1) {
        AnonymousClass1VW.A01(r1);
    }

    public void CN5(ImageView imageView) {
        Drawable A002;
        AnonymousClass1VX r0;
        int i = 2131231047;
        C43011z6 r4 = this.A01;
        if (r4 == null) {
            new C43021z7
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r4v4 ? I:X.1z7) =  call: X.1z7.<init>():void type: CONSTRUCTOR in method: X.1z3.CN5(android.widget.ImageView):void, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r5 = 2131231047(0x7f080147, float:1.8078164E38)
                X.1z6 r4 = r6.A01
                if (r4 != 0) goto L_0x000c
                X.1z7 r4 = new X.1z7
                r4.<init>()
            L_0x000c:
                X.1E7 r2 = r6.A00
                if (r2 == 0) goto L_0x002e
                java.lang.Integer r0 = r6.A05
                if (r0 == 0) goto L_0x006b
                int r5 = r0.intValue()
            L_0x0018:
                X.1PU r3 = r6.A04
                X.1BI r1 = r2.A0J
                android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
                X.1EC r0 = X.C42941yz.A00(r1)
                boolean r0 = r3.A03(r0)
                if (r0 == 0) goto L_0x002e
                r0 = 0
                X.2wZ r4 = new X.2wZ
                r4.<init>(r0)
            L_0x002e:
                X.1VW r1 = r6.A02
                boolean r0 = r1.A0E(r5)
                if (r0 == 0) goto L_0x0056
                android.content.Context r0 = r7.getContext()
                android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r0, r5)
                X.C17960vV.A07(r0)
                boolean r0 = r2.A10
                if (r0 == 0) goto L_0x0053
                X.1BI r0 = r2.A0J
                X.1VX r0 = X.AnonymousClass1VW.A01(r0)
            L_0x004b:
                android.graphics.drawable.LayerDrawable r0 = r1.A08(r4, r0, r5)
            L_0x004f:
                r7.setImageDrawable(r0)
                return
            L_0x0053:
                X.1VX r0 = X.AnonymousClass1VX.EMPTY
                goto L_0x004b
            L_0x0056:
                X.1VU r3 = r6.A03
                android.content.res.Resources r2 = r7.getResources()
                android.content.Context r0 = r7.getContext()
                android.content.res.Resources$Theme r1 = r0.getTheme()
                X.0ve r0 = r3.A00
                android.graphics.drawable.Drawable r0 = X.AnonymousClass1VU.A00(r1, r2, r4, r0, r5)
                goto L_0x004f
            L_0x006b:
                X.1VW r0 = r6.A02
                int r5 = r0.A02(r2)
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C42981z3.CN5(android.widget.ImageView):void");
        }

        public C42981z3(AnonymousClass1VW r8, AnonymousClass1VU r9, AnonymousClass1PU r10) {
            this((C43011z6) null, r8, (AnonymousClass1E7) null, r9, r10, (Integer) null);
        }
    }
